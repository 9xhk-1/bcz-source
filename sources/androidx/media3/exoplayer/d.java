package androidx.media3.exoplayer;

import android.media.AudioManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioFocusManager f4831a;

    public /* synthetic */ d(AudioFocusManager audioFocusManager) {
        this.f4831a = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i11) {
        this.f4831a.handlePlatformAudioFocusChange(i11);
    }
}
