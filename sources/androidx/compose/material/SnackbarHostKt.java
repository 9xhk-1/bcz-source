package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import c40.r0;
import j00.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,362:1\n75#2:363\n1247#3,6:364\n1247#3,6:370\n1247#3,6:443\n1247#3,6:449\n1247#3,6:455\n1247#3,6:461\n151#4,3:376\n33#4,4:379\n154#4,2:383\n38#4:385\n156#4:386\n200#4,2:387\n33#4,4:389\n202#4,2:393\n38#4:395\n204#4:396\n33#4,6:433\n71#5:397\n68#5,6:398\n74#5:432\n78#5:442\n79#6,6:404\n86#6,4:419\n90#6,2:429\n94#6:441\n368#7,9:410\n377#7:431\n378#7,2:439\n4034#8,6:423\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n158#1:363\n159#1:364,6\n247#1:370,6\n342#1:443,6\n343#1:449,6\n352#1:455,6\n353#1:461,6\n251#1:376,3\n251#1:379,4\n251#1:383,2\n251#1:385\n251#1:386\n256#1:387,2\n256#1:389,4\n256#1:393,2\n256#1:395\n256#1:396\n318#1:433,6\n316#1:397\n316#1:398,6\n316#1:432\n316#1:442\n316#1:404,6\n316#1:419,4\n316#1:429,2\n316#1:441\n316#1:410,9\n316#1:431\n316#1:439,2\n316#1:423,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0051  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FadeInFadeOutWithScale(final androidx.compose.material.SnackbarData r19, androidx.compose.ui.Modifier r20, final x00.q<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(@k final SnackbarHostState snackbarHostState, @l Modifier modifier, @l q<? super SnackbarData, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        final Modifier modifier2;
        final q<? super SnackbarData, ? super Composer, ? super Integer, g2> qVar2;
        Composer startRestartGroup = composer.startRestartGroup(431012348);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(snackbarHostState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(qVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (i15 != 0) {
                qVar = ComposableSingletons$SnackbarHostKt.INSTANCE.m1637getLambda1$material_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431012348, i13, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            AccessibilityManager accessibilityManager = (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager());
            boolean changedInstance = startRestartGroup.changedInstance(currentSnackbarData) | startRestartGroup.changedInstance(accessibilityManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(currentSnackbarData, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            q<? super SnackbarData, ? super Composer, ? super Integer, g2> qVar3 = qVar;
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier3, qVar3, startRestartGroup, i13 & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            qVar2 = qVar3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            qVar2 = qVar;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i16) {
                    SnackbarHostKt.SnackbarHost(SnackbarHostState.this, modifier2, qVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z11, a<g2> aVar, Composer composer, int i11, int i12) {
        if ((i12 & 4) != 0) {
            aVar = new a<g2>() { // from class: androidx.compose.material.SnackbarHostKt$animatedOpacity$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        a<g2> aVar2 = aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i11, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z11 ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        Boolean valueOf = Boolean.valueOf(z11);
        boolean changedInstance = composer.changedInstance(animatable) | ((((i11 & 112) ^ 48) > 32 && composer.changed(z11)) || (i11 & 48) == 32) | composer.changedInstance(animationSpec) | ((((i11 & 896) ^ 384) > 256 && composer.changed(aVar2)) || (i11 & 384) == 256);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            Object snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, z11, animationSpec, aVar2, null);
            composer.updateRememberedValue(snackbarHostKt$animatedOpacity$2$1);
            rememberedValue2 = snackbarHostKt$animatedOpacity$2$1;
        }
        EffectsKt.LaunchedEffect(valueOf, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, (i11 >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z11, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i11, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z11 ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        Boolean valueOf = Boolean.valueOf(z11);
        boolean changedInstance = composer.changedInstance(animatable) | ((((i11 & 112) ^ 48) > 32 && composer.changed(z11)) || (i11 & 48) == 32) | composer.changedInstance(animationSpec);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnackbarHostKt$animatedScale$1$1(animatable, z11, animationSpec, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(valueOf, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, (i11 >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    public static final long toMillis(@k SnackbarDuration snackbarDuration, boolean z11, @l AccessibilityManager accessibilityManager) {
        long j11;
        int i11 = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i11 == 1) {
            j11 = Long.MAX_VALUE;
        } else if (i11 == 2) {
            j11 = 10000;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j11 = 4000;
        }
        long j12 = j11;
        return accessibilityManager == null ? j12 : accessibilityManager.calculateRecommendedTimeoutMillis(j12, true, true, z11);
    }
}
