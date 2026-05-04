package androidx.camera.core.imagecapture;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface CameraCapturePipeline {
    @m80.k
    p1<Void> invokePostCapture();

    @m80.k
    p1<Void> invokePreCapture();
}
