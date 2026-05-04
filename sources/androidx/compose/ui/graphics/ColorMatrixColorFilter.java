package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@kotlin.jvm.internal.u0({"SMAP\nColorFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorFilter.kt\nandroidx/compose/ui/graphics/ColorMatrixColorFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
/* loaded from: classes.dex */
public final class ColorMatrixColorFilter extends ColorFilter {

    @m80.l
    private float[] colorMatrix;

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.v vVar) {
        this(fArr, colorFilter);
    }

    /* renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m2585copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fArr = ColorMatrix.m2566constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m2587copyColorMatrixgBh15pI(fArr);
    }

    /* renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m2586obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return fArr;
        }
        float[] actualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
        this.colorMatrix = actualColorMatrixFromFilter;
        return actualColorMatrixFromFilter;
    }

    @m80.k
    /* renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m2587copyColorMatrixgBh15pI(@m80.k float[] fArr) {
        a00.q.H0(m2586obtainColorMatrixp10uLo(), fArr, 0, 0, 0, 14, null);
        return fArr;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(m2586obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m2586obtainColorMatrixp10uLo());
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m2572hashCodeimpl(fArr);
        }
        return 0;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        sb2.append((Object) (fArr == null ? "null" : ColorMatrix.m2583toStringimpl(fArr)));
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, kotlin.jvm.internal.v vVar) {
        this(fArr);
    }

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m2373actualColorMatrixColorFilterjHGOpc(fArr), null);
    }
}
