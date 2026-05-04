package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageCaptureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Operation<I, O> {
    @NonNull
    @WorkerThread
    O apply(@NonNull I i11) throws ImageCaptureException;
}
