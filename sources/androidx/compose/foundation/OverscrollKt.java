package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,397:1\n75#2:398\n1247#3,6:399\n*S KotlinDebug\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollKt\n*L\n346#1:398\n347#1:399,6\n*E\n"})
/* loaded from: classes.dex */
public final class OverscrollKt {

    @m80.k
    private static final ProvidableCompositionLocal<OverscrollFactory> LocalOverscrollFactory = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new l<CompositionLocalAccessorScope, OverscrollFactory>() { // from class: androidx.compose.foundation.OverscrollKt$LocalOverscrollFactory$1
        @Override // x00.l
        public final OverscrollFactory invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            return AndroidOverscroll_androidKt.defaultOverscrollFactory(compositionLocalAccessorScope);
        }
    });

    @m80.k
    public static final ProvidableCompositionLocal<OverscrollFactory> getLocalOverscrollFactory() {
        return LocalOverscrollFactory;
    }

    @m80.k
    public static final Modifier overscroll(@m80.k Modifier modifier, @m80.l OverscrollEffect overscrollEffect) {
        Modifier modifier2;
        if (overscrollEffect == null || (modifier2 = overscrollEffect.getEffectModifier()) == null) {
            modifier2 = Modifier.Companion;
        }
        if (modifier2 == Modifier.Companion) {
            modifier2 = new OverscrollModifierElement(overscrollEffect);
        }
        return modifier.then(modifier2);
    }

    @m80.l
    @Composable
    public static final OverscrollEffect rememberOverscrollEffect(@m80.l Composer composer, int i11) {
        composer.startReplaceGroup(282942128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(282942128, i11, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:344)");
        }
        OverscrollFactory overscrollFactory = (OverscrollFactory) composer.consume(LocalOverscrollFactory);
        if (overscrollFactory == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        boolean changed = composer.changed(overscrollFactory);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = overscrollFactory.createOverscrollEffect();
            composer.updateRememberedValue(rememberedValue);
        }
        OverscrollEffect overscrollEffect = (OverscrollEffect) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overscrollEffect;
    }

    @Stable
    @m80.k
    public static final OverscrollEffect withoutEventHandling(@m80.k OverscrollEffect overscrollEffect) {
        return new WrappedOverscrollEffect(true, false, overscrollEffect);
    }

    @Stable
    @m80.k
    public static final OverscrollEffect withoutVisualEffect(@m80.k OverscrollEffect overscrollEffect) {
        return new WrappedOverscrollEffect(false, true, overscrollEffect);
    }
}
