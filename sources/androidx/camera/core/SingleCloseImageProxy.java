package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SingleCloseImageProxy extends ForwardingImageProxy {
    private final AtomicBoolean mClosed;

    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
        this.mClosed = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        if (this.mClosed.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
