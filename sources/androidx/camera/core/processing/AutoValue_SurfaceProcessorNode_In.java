package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_SurfaceProcessorNode_In extends SurfaceProcessorNode.In {
    private final List<OutConfig> outConfigs;
    private final SurfaceEdge surfaceEdge;

    public AutoValue_SurfaceProcessorNode_In(SurfaceEdge surfaceEdge, List<OutConfig> list) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.surfaceEdge = surfaceEdge;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.outConfigs = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceProcessorNode.In) {
            SurfaceProcessorNode.In in2 = (SurfaceProcessorNode.In) obj;
            if (this.surfaceEdge.equals(in2.getSurfaceEdge()) && this.outConfigs.equals(in2.getOutConfigs())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    @NonNull
    public List<OutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    @NonNull
    public SurfaceEdge getSurfaceEdge() {
        return this.surfaceEdge;
    }

    public int hashCode() {
        return ((this.surfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.outConfigs.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.surfaceEdge + ", outConfigs=" + this.outConfigs + com.alipay.sdk.m.u.i.f11099d;
    }
}
