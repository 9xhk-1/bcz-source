package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,415:1\n107#2:416\n1#3:417\n76#4,7:418\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n*L\n230#1:416\n281#1:418,7\n*E\n"})
/* loaded from: classes.dex */
final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {

    @k
    private l<? super CacheDrawScope, DrawResult> block;

    @k
    private final CacheDrawScope cacheDrawScope;

    @m80.l
    private ScopedGraphicsContext cachedGraphicsContext;
    private boolean isCacheValid;

    public CacheDrawModifierNodeImpl(@k CacheDrawScope cacheDrawScope, @k l<? super CacheDrawScope, DrawResult> lVar) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = lVar;
        cacheDrawScope.setCacheParams$ui_release(this);
        cacheDrawScope.setGraphicsContextProvider$ui_release(new a<GraphicsContext>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final GraphicsContext invoke() {
                return CacheDrawModifierNodeImpl.this.getGraphicsContext();
            }
        });
    }

    private final DrawResult getOrBuildCachedDrawBlock(ContentDrawScope contentDrawScope) {
        if (!this.isCacheValid) {
            final CacheDrawScope cacheDrawScope = this.cacheDrawScope;
            cacheDrawScope.setDrawResult$ui_release(null);
            cacheDrawScope.setContentDrawScope$ui_release(contentDrawScope);
            ObserverModifierNodeKt.observeReads(this, new a<g2>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
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
                    CacheDrawModifierNodeImpl.this.getBlock().invoke(cacheDrawScope);
                }
            });
            if (cacheDrawScope.getDrawResult$ui_release() == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
            this.isCacheValid = true;
        }
        DrawResult drawResult$ui_release = this.cacheDrawScope.getDrawResult$ui_release();
        g0.m(drawResult$ui_release);
        return drawResult$ui_release;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        getOrBuildCachedDrawBlock(contentDrawScope).getBlock$ui_release().invoke(contentDrawScope);
    }

    @k
    public final l<CacheDrawScope, DrawResult> getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @k
    public Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    @k
    public final GraphicsContext getGraphicsContext() {
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext == null) {
            scopedGraphicsContext = new ScopedGraphicsContext();
            this.cachedGraphicsContext = scopedGraphicsContext;
        }
        if (scopedGraphicsContext.getGraphicsContext() == null) {
            scopedGraphicsContext.setGraphicsContext(DelegatableNodeKt.requireGraphicsContext(this));
        }
        return scopedGraphicsContext;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @k
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo2127getSizeNHjbRc() {
        return IntSizeKt.m5298toSizeozmzZPI(DelegatableNodeKt.m3979requireCoordinator64DMado(this, NodeKind.m4118constructorimpl(128)).mo3865getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public void invalidateDrawCache() {
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.releaseGraphicsLayers();
        }
        this.isCacheValid = false;
        this.cacheDrawScope.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.releaseGraphicsLayers();
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    public final void setBlock(@k l<? super CacheDrawScope, DrawResult> lVar) {
        this.block = lVar;
        invalidateDrawCache();
    }
}
