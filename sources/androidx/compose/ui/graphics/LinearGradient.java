package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@kotlin.jvm.internal.u0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/LinearGradient\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,658:1\n65#2:659\n69#2:662\n65#2:669\n69#2:673\n65#2:677\n69#2:681\n60#3:660\n70#3:663\n53#3,3:666\n60#3:670\n70#3:674\n60#3:678\n70#3:682\n53#3,3:686\n53#3,3:690\n22#4:661\n22#4:664\n22#4:671\n22#4:675\n22#4:679\n22#4:683\n33#5:665\n57#6:672\n61#6:676\n57#6:680\n61#6:684\n30#7:685\n30#7:689\n266#7,2:693\n266#7,2:695\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/LinearGradient\n*L\n446#1:659\n447#1:662\n451#1:669\n452#1:673\n453#1:677\n454#1:681\n446#1:660\n447#1:663\n445#1:666,3\n451#1:670\n452#1:674\n453#1:678\n454#1:682\n458#1:686,3\n459#1:690,3\n446#1:661\n447#1:664\n451#1:671\n452#1:675\n453#1:679\n454#1:683\n445#1:665\n451#1:672\n452#1:676\n453#1:680\n454#1:684\n458#1:685\n459#1:689\n487#1:693,2\n488#1:695,2\n*E\n"})
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush {

    @m80.k
    private final List<Color> colors;
    private final long end;
    private final long start;

    @m80.l
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j11, long j12, int i11, kotlin.jvm.internal.v vVar) {
        this(list, list2, j11, j12, i11);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @m80.k
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2478createShaderuvyYCjk(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? j11 >> 32 : this.start >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? j11 & 4294967295L : this.start & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? j11 >> 32 : this.end >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? j11 & 4294967295L : this.end & 4294967295L));
        return ShaderKt.m2824LinearGradientShaderVjE6UOU(Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return kotlin.jvm.internal.g0.g(this.colors, linearGradient.colors) && kotlin.jvm.internal.g0.g(this.stops, linearGradient.stops) && Offset.m2265equalsimpl0(this.start, linearGradient.start) && Offset.m2265equalsimpl0(this.end, linearGradient.end) && TileMode.m2878equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2457getIntrinsicSizeNHjbRc() {
        float f11;
        float intBitsToFloat;
        float intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.start >> 32));
        float f12 = Float.NaN;
        if (!Float.isInfinite(intBitsToFloat3) && !Float.isNaN(intBitsToFloat3)) {
            float intBitsToFloat4 = Float.intBitsToFloat((int) (this.end >> 32));
            if (!Float.isInfinite(intBitsToFloat4) && !Float.isNaN(intBitsToFloat4)) {
                f11 = Math.abs(Float.intBitsToFloat((int) (this.start >> 32)) - Float.intBitsToFloat((int) (this.end >> 32)));
                intBitsToFloat = Float.intBitsToFloat((int) (this.start & 4294967295L));
                if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                    intBitsToFloat2 = Float.intBitsToFloat((int) (this.end & 4294967295L));
                    if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                        f12 = Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L)) - Float.intBitsToFloat((int) (this.end & 4294967295L)));
                    }
                }
                return Size.m2328constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
            }
        }
        f11 = Float.NaN;
        intBitsToFloat = Float.intBitsToFloat((int) (this.start & 4294967295L));
        if (!Float.isInfinite(intBitsToFloat)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (this.end & 4294967295L));
            if (!Float.isInfinite(intBitsToFloat2)) {
                f12 = Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L)) - Float.intBitsToFloat((int) (this.end & 4294967295L)));
            }
        }
        return Size.m2328constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m2270hashCodeimpl(this.start)) * 31) + Offset.m2270hashCodeimpl(this.end)) * 31) + TileMode.m2879hashCodeimpl(this.tileMode);
    }

    @m80.k
    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m2276toStringimpl(this.start)) + org.junit.jupiter.api.j2.O;
        } else {
            str = "";
        }
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m2276toStringimpl(this.end)) + org.junit.jupiter.api.j2.O;
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + org.junit.jupiter.api.j2.O + str + str2 + "tileMode=" + ((Object) TileMode.m2880toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j11, long j12, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(list, (i12 & 2) != 0 ? null : list2, j11, j12, (i12 & 16) != 0 ? TileMode.Companion.m2882getClamp3opZhB0() : i11, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j11, long j12, int i11) {
        this.colors = list;
        this.stops = list2;
        this.start = j11;
        this.end = j12;
        this.tileMode = i11;
    }
}
