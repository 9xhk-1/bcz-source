package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.StreamInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_StreamInfo extends StreamInfo {

    /* renamed from: id, reason: collision with root package name */
    private final int f3831id;
    private final SurfaceRequest.TransformationInfo inProgressTransformationInfo;
    private final StreamInfo.StreamState streamState;

    public AutoValue_StreamInfo(int i11, StreamInfo.StreamState streamState, @Nullable SurfaceRequest.TransformationInfo transformationInfo) {
        this.f3831id = i11;
        if (streamState == null) {
            throw new NullPointerException("Null streamState");
        }
        this.streamState = streamState;
        this.inProgressTransformationInfo = transformationInfo;
    }

    public boolean equals(Object obj) {
        SurfaceRequest.TransformationInfo transformationInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StreamInfo) {
            StreamInfo streamInfo = (StreamInfo) obj;
            if (this.f3831id == streamInfo.getId() && this.streamState.equals(streamInfo.getStreamState()) && ((transformationInfo = this.inProgressTransformationInfo) != null ? transformationInfo.equals(streamInfo.getInProgressTransformationInfo()) : streamInfo.getInProgressTransformationInfo() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.StreamInfo
    public int getId() {
        return this.f3831id;
    }

    @Override // androidx.camera.video.StreamInfo
    @Nullable
    public SurfaceRequest.TransformationInfo getInProgressTransformationInfo() {
        return this.inProgressTransformationInfo;
    }

    @Override // androidx.camera.video.StreamInfo
    @NonNull
    public StreamInfo.StreamState getStreamState() {
        return this.streamState;
    }

    public int hashCode() {
        int hashCode = (((this.f3831id ^ 1000003) * 1000003) ^ this.streamState.hashCode()) * 1000003;
        SurfaceRequest.TransformationInfo transformationInfo = this.inProgressTransformationInfo;
        return hashCode ^ (transformationInfo == null ? 0 : transformationInfo.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f3831id + ", streamState=" + this.streamState + ", inProgressTransformationInfo=" + this.inProgressTransformationInfo + com.alipay.sdk.m.u.i.f11099d;
    }
}
