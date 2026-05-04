package kb;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public static final String f66157c = "AudioFocusHelper";

    /* renamed from: a, reason: collision with root package name */
    public AudioManager f66158a;

    /* renamed from: b, reason: collision with root package name */
    public f f66159b;

    public e(Context context, f focusable) {
        this.f66158a = (AudioManager) context.getSystemService("audio");
        this.f66159b = focusable;
    }

    public boolean a() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder focusGain;
        AudioFocusRequest build;
        int abandonAudioFocusRequest;
        if (Build.VERSION.SDK_INT < 26) {
            abandonAudioFocusRequest = this.f66158a.abandonAudioFocus(this);
        } else {
            audioAttributes = androidx.media3.common.audio.f.a(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(true);
            acceptsDelayedFocusGain = willPauseWhenDucked.setAcceptsDelayedFocusGain(true);
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(this);
            focusGain = onAudioFocusChangeListener.setFocusGain(1);
            AudioManager audioManager = this.f66158a;
            build = focusGain.build();
            abandonAudioFocusRequest = audioManager.abandonAudioFocusRequest(build);
        }
        qb.c.i(f66157c, "abandonFocus %d", Integer.valueOf(abandonAudioFocusRequest));
        return 1 == abandonAudioFocusRequest;
    }

    public boolean b() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder focusGain;
        AudioFocusRequest build;
        int requestAudioFocus;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            requestAudioFocus = this.f66158a.requestAudioFocus(this, 3, 1);
        } else {
            audioAttributes = androidx.media3.common.audio.f.a(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(true);
            acceptsDelayedFocusGain = willPauseWhenDucked.setAcceptsDelayedFocusGain(true);
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(this);
            focusGain = onAudioFocusChangeListener.setFocusGain(1);
            if (i11 >= 28) {
                focusGain.setForceDucking(true);
            }
            AudioManager audioManager = this.f66158a;
            build = focusGain.build();
            requestAudioFocus = audioManager.requestAudioFocus(build);
        }
        qb.c.i(f66157c, "requestFocus %d", Integer.valueOf(requestAudioFocus));
        return 1 == requestAudioFocus;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        qb.c.i(f66157c, "onAudioFocusChange %d", Integer.valueOf(focusChange));
        f fVar = this.f66159b;
        if (fVar == null) {
            return;
        }
        if (focusChange == -3) {
            fVar.p0(true);
            return;
        }
        if (focusChange == -2 || focusChange == -1) {
            fVar.p0(false);
        } else {
            if (focusChange != 1) {
                return;
            }
            fVar.t();
        }
    }
}
