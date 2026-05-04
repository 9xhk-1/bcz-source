package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/FixedScale\n+ 2 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,159:1\n31#2:160\n53#3,3:161\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/FixedScale\n*L\n139#1:160\n139#1:161,3\n*E\n"})
/* loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f11) {
        this.value = f11;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = fixedScale.value;
        }
        return fixedScale.copy(f11);
    }

    public final float component1() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo3850computeScaleFactorH7hwNQA(long j11, long j12) {
        float f11 = this.value;
        return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(f11) << 32) | (4294967295L & Float.floatToRawIntBits(f11)));
    }

    @k
    public final FixedScale copy(float f11) {
        return new FixedScale(f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @k
    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}
