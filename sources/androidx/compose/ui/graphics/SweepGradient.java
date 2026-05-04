package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@kotlin.jvm.internal.u0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/SweepGradient\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,658:1\n278#2:659\n30#2:668\n273#2:672\n65#3:660\n69#3:664\n60#4:661\n70#4:665\n53#4,3:669\n22#5:662\n22#5:666\n57#6:663\n61#6:667\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/SweepGradient\n*L\n582#1:659\n585#1:668\n613#1:672\n586#1:660\n587#1:664\n586#1:661\n587#1:665\n585#1:669,3\n586#1:662\n587#1:666\n586#1:663\n587#1:667\n*E\n"})
/* loaded from: classes.dex */
public final class SweepGradient extends ShaderBrush {
    private final long center;

    @m80.k
    private final List<Color> colors;

    @m80.l
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j11, List list, List list2, kotlin.jvm.internal.v vVar) {
        this(j11, list, list2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @m80.k
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2478createShaderuvyYCjk(long j11) {
        long m2260constructorimpl;
        long j12 = this.center;
        if ((9223372034707292159L & j12) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            m2260constructorimpl = SizeKt.m2347getCenteruvyYCjk(j11);
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j12 >> 32)) == Float.POSITIVE_INFINITY ? j11 >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                j11 = this.center;
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
            m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        }
        return ShaderKt.m2828SweepGradientShader9KIMszo(m2260constructorimpl, this.colors, this.stops);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return Offset.m2265equalsimpl0(this.center, sweepGradient.center) && kotlin.jvm.internal.g0.g(this.colors, sweepGradient.colors) && kotlin.jvm.internal.g0.g(this.stops, sweepGradient.stops);
    }

    public int hashCode() {
        int m2270hashCodeimpl = ((Offset.m2270hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return m2270hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        String str;
        if ((this.center & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m2276toStringimpl(this.center)) + org.junit.jupiter.api.j2.O;
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    public /* synthetic */ SweepGradient(long j11, List list, List list2, int i11, kotlin.jvm.internal.v vVar) {
        this(j11, list, (i11 & 4) != 0 ? null : list2, null);
    }

    private SweepGradient(long j11, List<Color> list, List<Float> list2) {
        this.center = j11;
        this.colors = list;
        this.stops = list2;
    }
}
