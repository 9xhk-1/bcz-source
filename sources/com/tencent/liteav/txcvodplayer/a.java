package com.tencent.liteav.txcvodplayer;

import android.view.View;
import androidx.annotation.NonNull;
import com.tencent.ijk.media.player.IMediaPlayer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.txcvodplayer.a$a, reason: collision with other inner class name */
    public interface InterfaceC0518a {
        void a(@NonNull b bVar);

        void a(@NonNull b bVar, int i11, int i12);

        void a(@NonNull b bVar, int i11, int i12, int i13);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        @NonNull
        a a();

        void a(IMediaPlayer iMediaPlayer);
    }

    void addRenderCallback(@NonNull InterfaceC0518a interfaceC0518a);

    View getView();

    void removeRenderCallback(@NonNull InterfaceC0518a interfaceC0518a);

    void setAspectRatio(int i11);

    void setVideoRotation(int i11);

    void setVideoSampleAspectRatio(int i11, int i12);

    void setVideoSize(int i11, int i12);

    boolean shouldWaitForResize();
}
