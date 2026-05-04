package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    @NonNull
    default p1<Void> snapshot(@IntRange(from = 0, to = 100) int i11, @IntRange(from = 0, to = 359) int i12) {
        return Futures.immediateFuture(null);
    }
}
