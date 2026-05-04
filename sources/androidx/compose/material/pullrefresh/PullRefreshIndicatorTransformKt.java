package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PullRefreshIndicatorTransformKt {
    @ExperimentalMaterialApi
    @k
    public static final Modifier pullRefreshIndicatorTransform(@k Modifier modifier, @k final PullRefreshState pullRefreshState, final boolean z11) {
        return GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(modifier, new l<ContentDrawScope, g2>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo2984clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m2498getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                }
            }
        }), new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2
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
                graphicsLayerScope.setTranslationY(PullRefreshState.this.getPosition$material_release() - Size.m2334getHeightimpl(graphicsLayerScope.mo2695getSizeNHjbRc()));
                if (!z11 || PullRefreshState.this.getRefreshing$material_release()) {
                    return;
                }
                float transform = EasingKt.getLinearOutSlowInEasing().transform(PullRefreshState.this.getPosition$material_release() / PullRefreshState.this.getThreshold$material_release());
                if (transform < 0.0f) {
                    transform = 0.0f;
                }
                if (transform > 1.0f) {
                    transform = 1.0f;
                }
                graphicsLayerScope.setScaleX(transform);
                graphicsLayerScope.setScaleY(transform);
            }
        });
    }

    public static /* synthetic */ Modifier pullRefreshIndicatorTransform$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z11);
    }
}
