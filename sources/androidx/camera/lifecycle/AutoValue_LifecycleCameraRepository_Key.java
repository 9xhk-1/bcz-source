package androidx.camera.lifecycle;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.LifecycleOwner;
import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.Key {
    private final CameraUseCaseAdapter.CameraId cameraId;
    private final LifecycleOwner lifecycleOwner;

    public AutoValue_LifecycleCameraRepository_Key(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
        if (lifecycleOwner == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.lifecycleOwner = lifecycleOwner;
        if (cameraId == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.cameraId = cameraId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCameraRepository.Key) {
            LifecycleCameraRepository.Key key = (LifecycleCameraRepository.Key) obj;
            if (this.lifecycleOwner.equals(key.getLifecycleOwner()) && this.cameraId.equals(key.getCameraId())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    @NonNull
    public CameraUseCaseAdapter.CameraId getCameraId() {
        return this.cameraId;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    @NonNull
    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public int hashCode() {
        return ((this.lifecycleOwner.hashCode() ^ 1000003) * 1000003) ^ this.cameraId.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.lifecycleOwner + ", cameraId=" + this.cameraId + i.f11099d;
    }
}
