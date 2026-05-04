package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@kotlin.jvm.internal.u0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/RadialGradient\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,658:1\n139#2:659\n139#2:684\n33#3:660\n53#4,3:661\n60#4:666\n70#4:669\n60#4:672\n70#4:676\n53#4,3:680\n278#5:664\n30#5:679\n273#5:683\n65#6:665\n69#6:668\n65#6:671\n69#6:675\n22#7:667\n22#7:670\n22#7:673\n22#7:677\n57#8:674\n61#8:678\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/RadialGradient\n*L\n510#1:659\n561#1:684\n511#1:660\n511#1:661,3\n521#1:666\n522#1:669\n524#1:672\n525#1:676\n531#1:680,3\n519#1:664\n531#1:679\n560#1:683\n521#1:665\n522#1:668\n524#1:671\n525#1:675\n521#1:667\n522#1:670\n524#1:673\n525#1:677\n524#1:674\n525#1:678\n*E\n"})
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;

    @m80.k
    private final List<Color> colors;
    private final float radius;

    @m80.l
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j11, float f11, int i11, kotlin.jvm.internal.v vVar) {
        this(list, list2, j11, f11, i11);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @m80.k
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2478createShaderuvyYCjk(long j11) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j12 = this.center;
        if ((9223372034707292159L & j12) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            long m2347getCenteruvyYCjk = SizeKt.m2347getCenteruvyYCjk(j11);
            intBitsToFloat = Float.intBitsToFloat((int) (m2347getCenteruvyYCjk >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (m2347getCenteruvyYCjk & 4294967295L));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j12 >> 32)) == Float.POSITIVE_INFINITY ? j11 >> 32 : this.center >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.center & 4294967295L)) == Float.POSITIVE_INFINITY ? j11 & 4294967295L : this.center & 4294967295L));
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)));
        float f11 = this.radius;
        if (f11 == Float.POSITIVE_INFINITY) {
            f11 = Size.m2336getMinDimensionimpl(j11) / 2;
        }
        return ShaderKt.m2826RadialGradientShader8uybcMk(m2260constructorimpl, f11, list, list2, this.tileMode);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return kotlin.jvm.internal.g0.g(this.colors, radialGradient.colors) && kotlin.jvm.internal.g0.g(this.stops, radialGradient.stops) && Offset.m2265equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m2878equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2457getIntrinsicSizeNHjbRc() {
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.Companion.m2345getUnspecifiedNHjbRc();
        }
        float f11 = this.radius;
        float f12 = 2;
        float f13 = f11 * f12;
        float f14 = f11 * f12;
        return Size.m2328constructorimpl((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L));
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m2270hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m2879hashCodeimpl(this.tileMode);
    }

    @m80.k
    public String toString() {
        String str;
        String str2 = "";
        if ((this.center & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m2276toStringimpl(this.center)) + org.junit.jupiter.api.j2.O;
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.radius + org.junit.jupiter.api.j2.O;
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + org.junit.jupiter.api.j2.O + str + str2 + "tileMode=" + ((Object) TileMode.m2880toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j11, float f11, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(list, (i12 & 2) != 0 ? null : list2, j11, f11, (i12 & 16) != 0 ? TileMode.Companion.m2882getClamp3opZhB0() : i11, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j11, float f11, int i11) {
        this.colors = list;
        this.stops = list2;
        this.center = j11;
        this.radius = f11;
        this.tileMode = i11;
    }
}
