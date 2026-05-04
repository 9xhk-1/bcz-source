package wv;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    @Composable
    @a
    @m80.k
    public static final f a(@m80.k i layoutInfo, @m80.l DecayAnimationSpec<Float> decayAnimationSpec, @m80.l AnimationSpec<Float> animationSpec, @m80.l x00.l<? super i, Float> lVar, @m80.l Composer composer, int i11, int i12) {
        g0.p(layoutInfo, "layoutInfo");
        composer.startReplaceableGroup(-632875206);
        int i13 = 0;
        if ((i12 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i12 & 4) != 0) {
            animationSpec = g.f96920a.b();
        }
        if ((i12 & 8) != 0) {
            lVar = g.f96920a.a();
        }
        Object[] objArr = {layoutInfo, decayAnimationSpec, animationSpec, lVar};
        composer.startReplaceableGroup(-3685570);
        boolean z11 = false;
        while (i13 < 4) {
            Object obj = objArr[i13];
            i13++;
            z11 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(layoutInfo, lVar, decayAnimationSpec, animationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        f fVar = (f) rememberedValue;
        composer.endReplaceableGroup();
        return fVar;
    }
}
