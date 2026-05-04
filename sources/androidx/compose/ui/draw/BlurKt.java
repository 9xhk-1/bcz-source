package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,148:1\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n107#1:149\n*E\n"})
/* loaded from: classes.dex */
public final class BlurKt {
    @Stable
    @k
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m2114blur1fqSgw(@k Modifier modifier, final float f11, final float f12, @k final Shape shape) {
        int m2883getDecal3opZhB0;
        final boolean z11;
        if (shape != null) {
            m2883getDecal3opZhB0 = TileMode.Companion.m2882getClamp3opZhB0();
            z11 = true;
        } else {
            m2883getDecal3opZhB0 = TileMode.Companion.m2883getDecal3opZhB0();
            z11 = false;
        }
        final int i11 = m2883getDecal3opZhB0;
        float f13 = 0;
        return ((Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl(f13)) <= 0 || Dp.m5114compareTo0680j_4(f12, Dp.m5115constructorimpl(f13)) <= 0) && !z11) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float mo377toPx0680j_4 = graphicsLayerScope.mo377toPx0680j_4(f11);
                float mo377toPx0680j_42 = graphicsLayerScope.mo377toPx0680j_4(f12);
                graphicsLayerScope.setRenderEffect((mo377toPx0680j_4 <= 0.0f || mo377toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m2817BlurEffect3YTHUZs(mo377toPx0680j_4, mo377toPx0680j_42, i11));
                Shape shape2 = shape;
                if (shape2 == null) {
                    shape2 = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(shape2);
                graphicsLayerScope.setClip(z11);
            }
        });
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2115blur1fqSgw$default(Modifier modifier, float f11, float f12, BlurredEdgeTreatment blurredEdgeTreatment, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2118boximpl(BlurredEdgeTreatment.Companion.m2125getRectangleGoahg());
        }
        return m2114blur1fqSgw(modifier, f11, f12, blurredEdgeTreatment.m2124unboximpl());
    }

    @Stable
    @k
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m2116blurF8QBwvs(@k Modifier modifier, float f11, @k Shape shape) {
        return m2114blur1fqSgw(modifier, f11, f11, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2117blurF8QBwvs$default(Modifier modifier, float f11, BlurredEdgeTreatment blurredEdgeTreatment, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2118boximpl(BlurredEdgeTreatment.Companion.m2125getRectangleGoahg());
        }
        return m2116blurF8QBwvs(modifier, f11, blurredEdgeTreatment.m2124unboximpl());
    }
}
