package androidx.camera.camera2.internal;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafeCloseImageReaderProxy f3227a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f3227a.safeClose();
    }
}
