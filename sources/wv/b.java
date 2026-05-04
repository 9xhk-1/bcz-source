package wv;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @Composable
    @a
    @m80.k
    public static final c a(@m80.k LazyListState lazyListState, @m80.l p<? super i, ? super j, Integer> pVar, float f11, @m80.l Composer composer, int i11, int i12) {
        g0.p(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1050833438);
        if ((i12 & 2) != 0) {
            pVar = e.f96881a.a();
        }
        p<? super i, ? super j, Integer> pVar2 = pVar;
        if ((i12 & 4) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        composer.startReplaceableGroup(-3686552);
        boolean changed = composer.changed(lazyListState) | composer.changed(pVar2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            c cVar = new c(lazyListState, pVar2, 0, 4, null);
            composer.updateRememberedValue(cVar);
            rememberedValue = cVar;
        }
        composer.endReplaceableGroup();
        c cVar2 = (c) rememberedValue;
        cVar2.m(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo371roundToPx0680j_4(f11));
        composer.endReplaceableGroup();
        return cVar2;
    }

    @Composable
    @a
    @m80.k
    public static final f b(@m80.k LazyListState lazyListState, @m80.l p<? super i, ? super j, Integer> pVar, float f11, @m80.l DecayAnimationSpec<Float> decayAnimationSpec, @m80.l AnimationSpec<Float> animationSpec, @m80.l x00.l<? super i, Float> lVar, @m80.l Composer composer, int i11, int i12) {
        g0.p(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-632875806);
        if ((i12 & 2) != 0) {
            pVar = e.f96881a.a();
        }
        p<? super i, ? super j, Integer> pVar2 = pVar;
        if ((i12 & 4) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i12 & 16) != 0) {
            animationSpec = g.f96920a.b();
        }
        if ((i12 & 32) != 0) {
            lVar = g.f96920a.a();
        }
        f a11 = h.a(a(lazyListState, pVar2, f12, composer, i11 & 1022, 0), decayAnimationSpec, animationSpec, lVar, composer, ((i11 >> 6) & 7168) | 576, 0);
        composer.endReplaceableGroup();
        return a11;
    }
}
