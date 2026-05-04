package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CameraInfoInternal extends CameraInfo {
    static /* synthetic */ List a(CameraInfoInternal cameraInfoInternal, List list) {
        String cameraId = cameraInfoInternal.getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalStateException("Unable to find camera with id " + cameraId + " from list of available cameras.");
    }

    void addSessionCaptureCallback(@NonNull Executor executor, @NonNull CameraCaptureCallback cameraCaptureCallback);

    @NonNull
    Object getCameraCharacteristics();

    @NonNull
    String getCameraId();

    @NonNull
    Quirks getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    default CameraSelector getCameraSelector() {
        return new CameraSelector.Builder().addCameraFilter(new CameraFilter() { // from class: androidx.camera.core.impl.d
            @Override // androidx.camera.core.CameraFilter
            public final List filter(List list) {
                return CameraInfoInternal.a(CameraInfoInternal.this, list);
            }
        }).addCameraFilter(new LensFacingCameraFilter(getLensFacing())).build();
    }

    @NonNull
    EncoderProfilesProvider getEncoderProfilesProvider();

    @Nullable
    Object getPhysicalCameraCharacteristics(@NonNull String str);

    @NonNull
    Set<DynamicRange> getSupportedDynamicRanges();

    @NonNull
    List<Size> getSupportedHighResolutions(int i11);

    @NonNull
    Set<Integer> getSupportedOutputFormats();

    @NonNull
    List<Size> getSupportedResolutions(int i11);

    @NonNull
    Timebase getTimebase();

    default boolean isCaptureProcessProgressSupported() {
        return false;
    }

    default boolean isPostviewSupported() {
        return false;
    }

    boolean isPreviewStabilizationSupported();

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback);

    @NonNull
    default CameraInfoInternal getImplementation() {
        return this;
    }
}
