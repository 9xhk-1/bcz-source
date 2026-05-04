package androidx.compose.ui.graphics;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGraphicsLayerScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,453:1\n75#2:454\n1247#3,6:455\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n*L\n232#1:454\n233#1:455,6\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;
    private static final long DefaultShadowColor = Color.Companion.m2535getBlack0d7_KjU();

    @m80.k
    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }

    public static final long getDefaultShadowColor() {
        return DefaultShadowColor;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @m80.k
    public static final GraphicsLayer rememberGraphicsLayer(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(158092365, i11, -1, "androidx.compose.ui.graphics.rememberGraphicsLayer (GraphicsLayerScope.kt:230)");
        }
        GraphicsContext graphicsContext = (GraphicsContext) composer.consume(CompositionLocalsKt.getLocalGraphicsContext());
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GraphicsContextObserver(graphicsContext);
            composer.updateRememberedValue(rememberedValue);
        }
        GraphicsLayer graphicsLayer = ((GraphicsContextObserver) rememberedValue).getGraphicsLayer();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return graphicsLayer;
    }
}
