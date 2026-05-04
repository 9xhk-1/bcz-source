package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static final String TAG = "AudioManagerCompat";
    private static Context applicationContext;

    @Nullable
    private static AudioManager audioManager;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioFocusGain {
    }

    private AudioManagerCompat() {
    }

    public static /* synthetic */ void a(Context context, ConditionVariable conditionVariable) {
        audioManager = (AudioManager) context.getSystemService("audio");
        conditionVariable.open();
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        int abandonAudioFocusRequest;
        if (Util.SDK_INT < 26) {
            return audioManager2.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
        }
        abandonAudioFocusRequest = audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest());
        return abandonAudioFocusRequest;
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        synchronized (AudioManagerCompat.class) {
            try {
                final Context applicationContext2 = context.getApplicationContext();
                if (applicationContext != applicationContext2) {
                    audioManager = null;
                }
                AudioManager audioManager2 = audioManager;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    final ConditionVariable conditionVariable = new ConditionVariable();
                    BackgroundExecutor.get().execute(new Runnable() { // from class: androidx.media3.common.audio.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioManagerCompat.a(applicationContext2, conditionVariable);
                        }
                    });
                    conditionVariable.blockUninterruptible();
                    return (AudioManager) Assertions.checkNotNull(audioManager);
                }
                AudioManager audioManager3 = (AudioManager) applicationContext2.getSystemService("audio");
                audioManager = audioManager3;
                return (AudioManager) Assertions.checkNotNull(audioManager3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @IntRange(from = 0)
    public static int getStreamMaxVolume(AudioManager audioManager2, int i11) {
        return audioManager2.getStreamMaxVolume(i11);
    }

    @IntRange(from = 0)
    public static int getStreamMinVolume(AudioManager audioManager2, int i11) {
        int streamMinVolume;
        if (Util.SDK_INT < 28) {
            return 0;
        }
        streamMinVolume = audioManager2.getStreamMinVolume(i11);
        return streamMinVolume;
    }

    public static int getStreamVolume(AudioManager audioManager2, int i11) {
        try {
            return audioManager2.getStreamVolume(i11);
        } catch (RuntimeException e11) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i11, e11);
            return audioManager2.getStreamMaxVolume(i11);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager2, int i11) {
        return Util.SDK_INT >= 23 ? audioManager2.isStreamMute(i11) : getStreamVolume(audioManager2, i11) == 0;
    }

    public static int requestAudioFocus(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        int requestAudioFocus;
        if (Util.SDK_INT < 26) {
            return audioManager2.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributes().getStreamType(), audioFocusRequestCompat.getFocusGain());
        }
        requestAudioFocus = audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest());
        return requestAudioFocus;
    }
}
