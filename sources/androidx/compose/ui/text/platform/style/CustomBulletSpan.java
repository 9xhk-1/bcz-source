package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c10.d;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBulletSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,206:1\n33#2:207\n53#3,3:208\n*S KotlinDebug\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/CustomBulletSpan\n*L\n90#1:207\n90#1:208,3\n*E\n"})
/* loaded from: classes2.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = 8;
    private final float alpha;

    @l
    private final Brush brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;

    @k
    private final Density density;
    private final int diff;

    @k
    private final DrawStyle drawStyle;
    private final int minimumRequiredIndent;

    @k
    private final Shape shape;

    public CustomBulletSpan(@k Shape shape, float f11, float f12, float f13, @l Brush brush, float f14, @k DrawStyle drawStyle, @k Density density, float f15) {
        this.shape = shape;
        this.bulletWidthPx = f11;
        this.bulletHeightPx = f12;
        this.brush = brush;
        this.alpha = f14;
        this.drawStyle = drawStyle;
        this.density = density;
        int L0 = d.L0(f11 + f13);
        this.minimumRequiredIndent = L0;
        this.diff = d.L0(f15) - L0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@l final Canvas canvas, @l final Paint paint, int i11, final int i12, int i13, int i14, int i15, @l CharSequence charSequence, int i16, int i17, boolean z11, @l Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f11 = (i13 + i15) / 2.0f;
        final int u11 = u.u(i11 - this.minimumRequiredIndent, 0);
        g0.n(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i16 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        BulletSpan_androidKt.setDrawStyle(paint, this.drawStyle);
        float f12 = this.bulletWidthPx;
        float f13 = this.bulletHeightPx;
        final long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
        BulletSpan_androidKt.m4844setBrushAndDrawyzxVdVo(paint, this.brush, this.alpha, m2328constructorimpl, new a<g2>() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$drawLeadingMargin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Shape shape;
                Density density;
                shape = CustomBulletSpan.this.shape;
                long j11 = m2328constructorimpl;
                LayoutDirection layoutDirection = i12 > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl;
                density = CustomBulletSpan.this.density;
                BulletSpan_androidKt.draw(shape.mo291createOutlinePq9zytI(j11, layoutDirection, density), canvas, paint, u11, f11, i12);
            }
        });
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        int i11 = this.diff;
        if (i11 >= 0) {
            return 0;
        }
        return Math.abs(i11);
    }
}
