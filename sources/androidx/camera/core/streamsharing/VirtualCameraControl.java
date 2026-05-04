package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class VirtualCameraControl extends ForwardingCameraControl {
    private static final int DEFAULT_JPEG_QUALITY = 100;
    private static final int DEFAULT_ROTATION_DEGREES = 0;
    private final StreamSharing.Control mStreamSharingControl;

    public VirtualCameraControl(@NonNull CameraControlInternal cameraControlInternal, @NonNull StreamSharing.Control control) {
        super(cameraControlInternal);
        this.mStreamSharingControl = control;
    }

    private int getJpegQuality(@NonNull CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int getRotationDegrees(@NonNull CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public p1<List<Void>> submitStillCaptureRequests(@NonNull final List<CaptureConfig> list, int i11, int i12) {
        Preconditions.checkArgument(list.size() == 1, "Only support one capture config.");
        final p1<CameraCapturePipeline> cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i11, i12);
        return Futures.allAsList(Collections.singletonList(FutureChain.from(cameraCapturePipelineAsync).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.d
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final p1 apply(Object obj) {
                p1 invokePreCapture;
                invokePreCapture = ((CameraCapturePipeline) p1.this.get()).invokePreCapture();
                return invokePreCapture;
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.e
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final p1 apply(Object obj) {
                p1 jpegSnapshot;
                jpegSnapshot = r0.mStreamSharingControl.jpegSnapshot(r0.getJpegQuality((CaptureConfig) r1.get(0)), VirtualCameraControl.this.getRotationDegrees((CaptureConfig) list.get(0)));
                return jpegSnapshot;
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.f
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final p1 apply(Object obj) {
                p1 invokePostCapture;
                invokePostCapture = ((CameraCapturePipeline) p1.this.get()).invokePostCapture();
                return invokePostCapture;
            }
        }, CameraXExecutors.directExecutor())));
    }
}
