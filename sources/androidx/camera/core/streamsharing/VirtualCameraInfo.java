package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ForwardingCameraInfo;
import androidx.camera.core.impl.utils.TransformUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class VirtualCameraInfo extends ForwardingCameraInfo {
    private final String mVirtualCameraId;
    private int mVirtualCameraRotationDegrees;

    public VirtualCameraInfo(@NonNull CameraInfoInternal cameraInfoInternal) {
        super(cameraInfoInternal);
        this.mVirtualCameraId = "virtual-" + cameraInfoInternal.getCameraId() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public String getCameraId() {
        return this.mVirtualCameraId;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    public void setVirtualCameraRotationDegrees(int i11) {
        this.mVirtualCameraRotationDegrees = i11;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i11) {
        return TransformUtils.within360(super.getSensorRotationDegrees(i11) - this.mVirtualCameraRotationDegrees);
    }
}
