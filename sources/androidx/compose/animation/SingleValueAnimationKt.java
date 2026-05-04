package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,109:1\n1247#2,6:110\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:110,6\n*E\n"})
/* loaded from: classes.dex */
public final class SingleValueAnimationKt {

    @k
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    @k
    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m111Animatable8_81llA(long j11) {
        return new Animatable<>(Color.m2499boximpl(j11), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2513getColorSpaceimpl(j11)), null, null, 12, null);
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m112animateColorAsStateKTwxG1Y(long j11, AnimationSpec animationSpec, l lVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i11, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:81)");
        }
        State<Color> m113animateColorAsStateeuL9pac = m113animateColorAsStateeuL9pac(j11, animationSpec2, null, lVar2, composer, (i11 & 126) | ((i11 << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m113animateColorAsStateeuL9pac;
    }

    @Composable
    @k
    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m113animateColorAsStateeuL9pac(long j11, @m80.l AnimationSpec<Color> animationSpec, @m80.l String str, @m80.l l<? super Color, g2> lVar, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec<Color> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        l<? super Color, g2> lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i11, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:60)");
        }
        boolean changed = composer.changed(Color.m2513getColorSpaceimpl(j11));
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2513getColorSpaceimpl(j11));
            composer.updateRememberedValue(rememberedValue);
        }
        int i13 = i11 << 6;
        State<Color> animateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m2499boximpl(j11), (TwoWayConverter) rememberedValue, animationSpec2, null, str2, lVar2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }
}
