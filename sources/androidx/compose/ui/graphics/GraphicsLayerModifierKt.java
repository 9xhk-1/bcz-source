package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    @Stable
    @m80.k
    public static final Modifier graphicsLayer(@m80.k Modifier modifier, @m80.k x00.l<? super GraphicsLayerScope, yz.g2> lVar) {
        return modifier.then(new BlockGraphicsLayerElement(lVar));
    }

    @Stable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @yz.w0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-2Xn7asI, reason: not valid java name */
    public static final /* synthetic */ Modifier m2666graphicsLayer2Xn7asI(Modifier modifier, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect) {
        return m2668graphicsLayerAp8cVGQ(modifier, f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m2597getAutoNrFUSI());
    }

    @Stable
    @m80.k
    /* renamed from: graphicsLayer-Ap8cVGQ, reason: not valid java name */
    public static final Modifier m2668graphicsLayerAp8cVGQ(@m80.k Modifier modifier, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, @m80.k Shape shape, boolean z11, @m80.l RenderEffect renderEffect, long j12, long j13, int i11) {
        return modifier.then(new GraphicsLayerElement(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, renderEffect, j12, j13, i11, null));
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2669graphicsLayerAp8cVGQ$default(Modifier modifier, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13, int i11, int i12, Object obj) {
        return m2668graphicsLayerAp8cVGQ(modifier, (i12 & 1) != 0 ? 1.0f : f11, (i12 & 2) != 0 ? 1.0f : f12, (i12 & 4) == 0 ? f13 : 1.0f, (i12 & 8) != 0 ? 0.0f : f14, (i12 & 16) != 0 ? 0.0f : f15, (i12 & 32) != 0 ? 0.0f : f16, (i12 & 64) != 0 ? 0.0f : f17, (i12 & 128) != 0 ? 0.0f : f18, (i12 & 256) == 0 ? f19 : 0.0f, (i12 & 512) != 0 ? 8.0f : f21, (i12 & 1024) != 0 ? TransformOrigin.Companion.m2900getCenterSzJe1aQ() : j11, (i12 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i12 & 4096) != 0 ? false : z11, (i12 & 8192) != 0 ? null : renderEffect, (i12 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j12, (32768 & i12) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j13, (i12 & 65536) != 0 ? CompositingStrategy.Companion.m2597getAutoNrFUSI() : i11);
    }

    @Stable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @yz.w0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final /* synthetic */ Modifier m2670graphicsLayerpANQ8Wg(Modifier modifier, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, RenderEffect renderEffect, long j12, long j13) {
        return m2668graphicsLayerAp8cVGQ(modifier, f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, renderEffect, j12, j13, CompositingStrategy.Companion.m2597getAutoNrFUSI());
    }

    @Stable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @yz.w0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-sKFY_QE, reason: not valid java name */
    public static final /* synthetic */ Modifier m2672graphicsLayersKFY_QE(Modifier modifier, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11) {
        return m2669graphicsLayerAp8cVGQ$default(modifier, f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, null, 0L, 0L, 0, 114688, null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2673graphicsLayersKFY_QE$default(Modifier modifier, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, Shape shape, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return m2672graphicsLayersKFY_QE(modifier, f11, (i11 & 2) != 0 ? 1.0f : f12, (i11 & 4) == 0 ? f13 : 1.0f, (i11 & 8) != 0 ? 0.0f : f14, (i11 & 16) != 0 ? 0.0f : f15, (i11 & 32) != 0 ? 0.0f : f16, (i11 & 64) != 0 ? 0.0f : f17, (i11 & 128) != 0 ? 0.0f : f18, (i11 & 256) == 0 ? f19 : 0.0f, (i11 & 512) != 0 ? 8.0f : f21, (i11 & 1024) != 0 ? TransformOrigin.Companion.m2900getCenterSzJe1aQ() : j11, (i11 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i11 & 4096) != 0 ? false : z11);
    }

    @Stable
    @m80.k
    public static final Modifier toolingGraphicsLayer(@m80.k Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m2669graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }
}
