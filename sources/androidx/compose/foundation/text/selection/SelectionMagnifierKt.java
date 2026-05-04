package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import c40.r0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,106:1\n1247#2,6:107\n1247#2,6:113\n1247#2,6:119\n85#3:125\n30#4:126\n53#5,3:127\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n77#1:107,6\n78#1:113,6\n82#1:119,6\n77#1:125\n53#1:126\n53#1:127,3\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionMagnifierKt {

    @k
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;

    @k
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);

    @k
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new l<Offset, AnimationVector2D>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m1453invokek4lQ0M(offset.m2278unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m1453invokek4lQ0M(long j11) {
            AnimationVector2D animationVector2D;
            if ((9223372034707292159L & j11) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                return new AnimationVector2D(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            }
            animationVector2D = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
            return animationVector2D;
        }
    }, new l<AnimationVector2D, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m2257boximpl(m1454invoketuRUvjQ(animationVector2D));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m1454invoketuRUvjQ(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Offset.m2260constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });

    static {
        long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L));
        OffsetDisplacementThreshold = m2260constructorimpl;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m2257boximpl(m2260constructorimpl), 3, null);
    }

    @k
    public static final Modifier animatedSelectionMagnifier(@k Modifier modifier, @k x00.a<Offset> aVar, @k l<? super x00.a<Offset>, ? extends Modifier> lVar) {
        return ComposedModifierKt.composed$default(modifier, null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(aVar, lVar), 1, null);
    }

    @k
    public static final SpringSpec<Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    public static final long getOffsetDisplacementThreshold() {
        return OffsetDisplacementThreshold;
    }

    @k
    public static final TwoWayConverter<Offset, AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return UnspecifiedSafeOffsetVectorConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Offset> rememberAnimatedMagnifierPosition(x00.a<Offset> aVar, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i11, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(aVar);
            composer.updateRememberedValue(rememberedValue);
        }
        State state = (State) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            Object animatable = new Animatable(Offset.m2257boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), UnspecifiedSafeOffsetVectorConverter, Offset.m2257boximpl(OffsetDisplacementThreshold), null, 8, null);
            composer.updateRememberedValue(animatable);
            rememberedValue2 = animatable;
        }
        Animatable animatable2 = (Animatable) rememberedValue2;
        g2 g2Var = g2.f100423a;
        boolean changedInstance = composer.changedInstance(animatable2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(state, animatable2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.LaunchedEffect(g2Var, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue3, composer, 6);
        State<Offset> asState = animatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().m2278unboximpl();
    }
}
