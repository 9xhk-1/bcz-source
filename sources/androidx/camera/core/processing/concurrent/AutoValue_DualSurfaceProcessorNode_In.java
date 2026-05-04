package androidx.camera.core.processing.concurrent;

import androidx.annotation.NonNull;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_DualSurfaceProcessorNode_In extends DualSurfaceProcessorNode.In {
    private final List<DualOutConfig> outConfigs;
    private final SurfaceEdge primarySurfaceEdge;
    private final SurfaceEdge secondarySurfaceEdge;

    public AutoValue_DualSurfaceProcessorNode_In(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, List<DualOutConfig> list) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.primarySurfaceEdge = surfaceEdge;
        if (surfaceEdge2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.secondarySurfaceEdge = surfaceEdge2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.outConfigs = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DualSurfaceProcessorNode.In) {
            DualSurfaceProcessorNode.In in2 = (DualSurfaceProcessorNode.In) obj;
            if (this.primarySurfaceEdge.equals(in2.getPrimarySurfaceEdge()) && this.secondarySurfaceEdge.equals(in2.getSecondarySurfaceEdge()) && this.outConfigs.equals(in2.getOutConfigs())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    @NonNull
    public List<DualOutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    @NonNull
    public SurfaceEdge getPrimarySurfaceEdge() {
        return this.primarySurfaceEdge;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    @NonNull
    public SurfaceEdge getSecondarySurfaceEdge() {
        return this.secondarySurfaceEdge;
    }

    public int hashCode() {
        return ((((this.primarySurfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.secondarySurfaceEdge.hashCode()) * 1000003) ^ this.outConfigs.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.primarySurfaceEdge + ", secondarySurfaceEdge=" + this.secondarySurfaceEdge + ", outConfigs=" + this.outConfigs + com.alipay.sdk.m.u.i.f11099d;
    }
}
