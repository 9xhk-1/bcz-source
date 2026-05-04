package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: classes.dex */
public final class CacheDrawScopeDragShadowCallback {
    public static final int $stable = 8;

    @l
    private GraphicsLayer graphicsLayer;

    @k
    public final DrawResult cachePicture(@k CacheDrawScope cacheDrawScope) {
        GraphicsLayer obtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        CacheDrawScope.m2128recordTdoYBX4$default(cacheDrawScope, obtainGraphicsLayer, null, null, 0L, new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$cachePicture$1$1$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        }, 7, null);
        this.graphicsLayer = obtainGraphicsLayer;
        return cacheDrawScope.onDrawWithContent(new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$cachePicture$1$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                GraphicsLayer graphicsLayer;
                graphicsLayer = CacheDrawScopeDragShadowCallback.this.graphicsLayer;
                g0.m(graphicsLayer);
                GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
            }
        });
    }

    public final void drawDragShadow(@k DrawScope drawScope) {
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (graphicsLayer == null) {
            throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
        }
        GraphicsLayerKt.drawLayer(drawScope, graphicsLayer);
    }
}
