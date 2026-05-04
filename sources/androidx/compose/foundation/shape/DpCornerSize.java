package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCornerSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerSize.kt\nandroidx/compose/foundation/shape/DpCornerSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* loaded from: classes.dex */
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f11, v vVar) {
        this(f11);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m1015component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m1016copy0680j_4$default(DpCornerSize dpCornerSize, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = dpCornerSize.size;
        }
        return dpCornerSize.m1017copy0680j_4(f11);
    }

    @k
    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m1017copy0680j_4(float f11) {
        return new DpCornerSize(f11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m5120equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return Dp.m5113boximpl(m1018getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m1018getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return Dp.m5121hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1010toPxTmRCtEA(long j11, @k Density density) {
        return density.mo377toPx0680j_4(this.size);
    }

    @k
    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    private DpCornerSize(float f11) {
        this.size = f11;
    }
}
