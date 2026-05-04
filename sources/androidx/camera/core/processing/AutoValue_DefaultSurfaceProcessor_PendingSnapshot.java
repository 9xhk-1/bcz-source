package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends DefaultSurfaceProcessor.PendingSnapshot {
    private final CallbackToFutureAdapter.Completer<Void> completer;
    private final int jpegQuality;
    private final int rotationDegrees;

    public AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i11, int i12, CallbackToFutureAdapter.Completer<Void> completer) {
        this.jpegQuality = i11;
        this.rotationDegrees = i12;
        if (completer == null) {
            throw new NullPointerException("Null completer");
        }
        this.completer = completer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DefaultSurfaceProcessor.PendingSnapshot) {
            DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot = (DefaultSurfaceProcessor.PendingSnapshot) obj;
            if (this.jpegQuality == pendingSnapshot.getJpegQuality() && this.rotationDegrees == pendingSnapshot.getRotationDegrees() && this.completer.equals(pendingSnapshot.getCompleter())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @NonNull
    public CallbackToFutureAdapter.Completer<Void> getCompleter() {
        return this.completer;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @IntRange(from = 0, to = 100)
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    @IntRange(from = 0, to = 359)
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return ((((this.jpegQuality ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.completer.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.jpegQuality + ", rotationDegrees=" + this.rotationDegrees + ", completer=" + this.completer + com.alipay.sdk.m.u.i.f11099d;
    }
}
