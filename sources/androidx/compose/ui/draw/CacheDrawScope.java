package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;

    @k
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;

    @l
    private ContentDrawScope contentDrawScope;

    @l
    private DrawResult drawResult;

    @l
    private a<? extends GraphicsContext> graphicsContextProvider;

    /* renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m2128recordTdoYBX4$default(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            density = cacheDrawScope;
        }
        if ((i11 & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        if ((i11 & 4) != 0) {
            j11 = IntSizeKt.m5297toIntSizeuvyYCjk(cacheDrawScope.m2129getSizeNHjbRc());
        }
        cacheDrawScope.m2130recordTdoYBX4(graphicsLayer, density, layoutDirection, j11, lVar);
    }

    @k
    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.cacheParams;
    }

    @l
    public final ContentDrawScope getContentDrawScope$ui_release() {
        return this.contentDrawScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @l
    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    @l
    public final a<GraphicsContext> getGraphicsContextProvider$ui_release() {
        return this.graphicsContextProvider;
    }

    @k
    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2129getSizeNHjbRc() {
        return this.cacheParams.mo2127getSizeNHjbRc();
    }

    @k
    public final GraphicsLayer obtainGraphicsLayer() {
        a<? extends GraphicsContext> aVar = this.graphicsContextProvider;
        g0.m(aVar);
        return aVar.invoke().createGraphicsLayer();
    }

    @k
    public final DrawResult onDrawBehind(@k final x00.l<? super DrawScope, g2> lVar) {
        return onDrawWithContent(new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                lVar.invoke(contentDrawScope);
                contentDrawScope.drawContent();
            }
        });
    }

    @k
    public final DrawResult onDrawWithContent(@k x00.l<? super ContentDrawScope, g2> lVar) {
        DrawResult drawResult = new DrawResult(lVar);
        this.drawResult = drawResult;
        return drawResult;
    }

    /* renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m2130recordTdoYBX4(@k GraphicsLayer graphicsLayer, @k final Density density, @k final LayoutDirection layoutDirection, long j11, @k final x00.l<? super ContentDrawScope, g2> lVar) {
        final ContentDrawScope contentDrawScope = this.contentDrawScope;
        g0.m(contentDrawScope);
        final Density density2 = contentDrawScope.getDrawContext().getDensity();
        final LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        contentDrawScope.mo3061recordJVtK1S4(graphicsLayer, j11, new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                DrawContext drawContext = drawScope.getDrawContext();
                Density density3 = density;
                LayoutDirection layoutDirection3 = layoutDirection;
                drawContext.setDensity(density3);
                drawContext.setLayoutDirection(layoutDirection3);
                try {
                    lVar.invoke(contentDrawScope);
                } finally {
                    DrawContext drawContext2 = drawScope.getDrawContext();
                    Density density4 = density2;
                    LayoutDirection layoutDirection4 = layoutDirection2;
                    drawContext2.setDensity(density4);
                    drawContext2.setLayoutDirection(layoutDirection4);
                }
            }
        });
    }

    public final void setCacheParams$ui_release(@k BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setContentDrawScope$ui_release(@l ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    public final void setDrawResult$ui_release(@l DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final void setGraphicsContextProvider$ui_release(@l a<? extends GraphicsContext> aVar) {
        this.graphicsContextProvider = aVar;
    }
}
