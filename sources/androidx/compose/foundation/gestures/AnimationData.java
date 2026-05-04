package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AnimationData {
    private final float degrees;
    private final long offset;
    private final float zoom;

    public /* synthetic */ AnimationData(float f11, long j11, float f12, v vVar) {
        this(f11, j11, f12);
    }

    /* renamed from: copy-d-4ec7I$default, reason: not valid java name */
    public static /* synthetic */ AnimationData m400copyd4ec7I$default(AnimationData animationData, float f11, long j11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = animationData.zoom;
        }
        if ((i11 & 2) != 0) {
            j11 = animationData.offset;
        }
        if ((i11 & 4) != 0) {
            f12 = animationData.degrees;
        }
        return animationData.m402copyd4ec7I(f11, j11, f12);
    }

    public final float component1() {
        return this.zoom;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m401component2F1C5BW0() {
        return this.offset;
    }

    public final float component3() {
        return this.degrees;
    }

    @k
    /* renamed from: copy-d-4ec7I, reason: not valid java name */
    public final AnimationData m402copyd4ec7I(float f11, long j11, float f12) {
        return new AnimationData(f11, j11, f12, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) obj;
        return Float.compare(this.zoom, animationData.zoom) == 0 && Offset.m2265equalsimpl0(this.offset, animationData.offset) && Float.compare(this.degrees, animationData.degrees) == 0;
    }

    public final float getDegrees() {
        return this.degrees;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m403getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return (((Float.hashCode(this.zoom) * 31) + Offset.m2270hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.degrees);
    }

    @k
    public String toString() {
        return "AnimationData(zoom=" + this.zoom + ", offset=" + ((Object) Offset.m2276toStringimpl(this.offset)) + ", degrees=" + this.degrees + ')';
    }

    private AnimationData(float f11, long j11, float f12) {
        this.zoom = f11;
        this.offset = j11;
        this.degrees = f12;
    }
}
