package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.audio.AudioFocusRequestCompat;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class AudioFocusManager {
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 3;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 4;
    private static final int AUDIO_FOCUS_STATE_NOT_REQUESTED = 0;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 1;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;

    @Nullable
    private AudioAttributes audioAttributes;
    private AudioFocusRequestCompat audioFocusRequest;
    private final ho.p0<AudioManager> audioManager;
    private final Handler eventHandler;
    private int focusGainToRequest;

    @Nullable
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier = 1.0f;
    private int audioFocusState = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PlayerControl {
        void executePlayerCommand(int i11);

        void setVolumeMultiplier(float f11);
    }

    public AudioFocusManager(final Context context, Looper looper, PlayerControl playerControl) {
        this.audioManager = ho.r0.b(new ho.p0() { // from class: androidx.media3.exoplayer.e
            @Override // ho.p0
            public final Object get() {
                AudioManager audioManager;
                audioManager = AudioManagerCompat.getAudioManager(context);
                return audioManager;
            }
        });
        this.playerControl = playerControl;
        this.eventHandler = new Handler(looper);
    }

    private void abandonAudioFocusIfHeld() {
        int i11 = this.audioFocusState;
        if (i11 == 1 || i11 == 0 || this.audioFocusRequest == null) {
            return;
        }
        AudioManagerCompat.abandonAudioFocusRequest(this.audioManager.get(), this.audioFocusRequest);
    }

    private static int convertAudioAttributesToFocusGain(@Nullable AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.usage) {
            case 0:
                Log.w(TAG, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                Log.w(TAG, "Unidentified audio usage: " + audioAttributes.usage);
                return 0;
            case 16:
                return 4;
        }
    }

    private void executePlayerCommand(int i11) {
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlatformAudioFocusChange(int i11) {
        if (i11 == -3 || i11 == -2) {
            if (i11 != -2 && !willPauseWhenDucked()) {
                setAudioFocusState(4);
                return;
            } else {
                executePlayerCommand(0);
                setAudioFocusState(3);
                return;
            }
        }
        if (i11 == -1) {
            executePlayerCommand(-1);
            abandonAudioFocusIfHeld();
            setAudioFocusState(1);
        } else if (i11 == 1) {
            setAudioFocusState(2);
            executePlayerCommand(1);
        } else {
            Log.w(TAG, "Unknown focus change type: " + i11);
        }
    }

    private int requestAudioFocus() {
        if (this.audioFocusState == 2) {
            return 1;
        }
        if (requestAudioFocusInternal() == 1) {
            setAudioFocusState(2);
            return 1;
        }
        setAudioFocusState(1);
        return -1;
    }

    private int requestAudioFocusInternal() {
        AudioFocusRequestCompat audioFocusRequestCompat = this.audioFocusRequest;
        if (audioFocusRequestCompat == null || this.rebuildAudioFocusRequest) {
            this.audioFocusRequest = (audioFocusRequestCompat == null ? new AudioFocusRequestCompat.Builder(this.focusGainToRequest) : audioFocusRequestCompat.buildUpon()).setAudioAttributes((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).setWillPauseWhenDucked(willPauseWhenDucked()).setOnAudioFocusChangeListener(new d(this), this.eventHandler).build();
            this.rebuildAudioFocusRequest = false;
        }
        return AudioManagerCompat.requestAudioFocus(this.audioManager.get(), this.audioFocusRequest);
    }

    private void setAudioFocusState(int i11) {
        if (this.audioFocusState == i11) {
            return;
        }
        this.audioFocusState = i11;
        float f11 = i11 == 4 ? 0.2f : 1.0f;
        if (this.volumeMultiplier == f11) {
            return;
        }
        this.volumeMultiplier = f11;
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f11);
        }
    }

    private boolean shouldHandleAudioFocus(int i11) {
        return i11 != 1 && this.focusGainToRequest == 1;
    }

    private boolean willPauseWhenDucked() {
        AudioAttributes audioAttributes = this.audioAttributes;
        return audioAttributes != null && audioAttributes.contentType == 1;
    }

    @VisibleForTesting
    public AudioManager.OnAudioFocusChangeListener getFocusListener() {
        return new d(this);
    }

    public float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public void release() {
        this.playerControl = null;
        abandonAudioFocusIfHeld();
        setAudioFocusState(0);
    }

    public void setAudioAttributes(@Nullable AudioAttributes audioAttributes) {
        if (Objects.equals(this.audioAttributes, audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        int convertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(audioAttributes);
        this.focusGainToRequest = convertAudioAttributesToFocusGain;
        boolean z11 = true;
        if (convertAudioAttributesToFocusGain != 1 && convertAudioAttributesToFocusGain != 0) {
            z11 = false;
        }
        Assertions.checkArgument(z11, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int updateAudioFocus(boolean z11, int i11) {
        if (!shouldHandleAudioFocus(i11)) {
            abandonAudioFocusIfHeld();
            setAudioFocusState(0);
            return 1;
        }
        if (z11) {
            return requestAudioFocus();
        }
        int i12 = this.audioFocusState;
        if (i12 != 1) {
            return i12 != 3 ? 1 : 0;
        }
        return -1;
    }
}
