package androidx.compose.runtime;

import c40.a0;
import c40.l2;
import c40.p2;
import c40.r0;
import c40.s0;
import j00.c;
import java.util.Arrays;
import kotlin.DeprecationLevel;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,561:1\n1247#2,6:562\n1247#2,6:568\n1247#2,6:574\n1247#2,6:584\n1247#2,6:590\n1247#2,6:596\n1247#2,6:602\n1247#2,6:612\n1247#2,6:618\n82#3,4:580\n82#3,4:608\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n150#1:562,6\n187#1:568,6\n225#1:574,6\n261#1:584,6\n319#1:590,6\n338#1:596,6\n357#1:602,6\n380#1:612,6\n559#1:618,6\n261#1:580,4\n380#1:608,4\n*E\n"})
/* loaded from: classes.dex */
public final class EffectsKt {

    @k
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    @k
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();

    @k
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    @n(level = DeprecationLevel.ERROR, message = DisposableEffectNoParamError)
    public static final void DisposableEffect(@k l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:118)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError);
    }

    @Composable
    @n(level = DeprecationLevel.ERROR, message = LaunchedEffectNoParamError)
    public static final void LaunchedEffect(@k final p<? super r0, ? super c<? super g2>, ? extends Object> pVar, @m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-805415771);
        int i12 = i11 & 1;
        if (startRestartGroup.shouldExecute(i12 != 0, i12)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:300)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError);
        }
        startRestartGroup.skipToGroupEnd();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.EffectsKt$LaunchedEffect$1
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

                public final void invoke(Composer composer2, int i13) {
                    EffectsKt.LaunchedEffect(pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    public static final void SideEffect(@k x00.a<g2> aVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i11, -1, "androidx.compose.runtime.SideEffect (Effects.kt:49)");
        }
        composer.recordSideEffect(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @v0
    @k
    public static final r0 createCompositionCoroutineScope(@k d dVar, @k Composer composer) {
        a0 c11;
        if (dVar.get(l2.f7886e0) == null) {
            return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), dVar);
        }
        c11 = p2.c(null, 1, null);
        c11.r(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return s0.a(c11);
    }

    @Composable
    @k
    public static final r0 rememberCoroutineScope(@m80.l x00.a<? extends d> aVar, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            aVar = new x00.a<EmptyCoroutineContext>() { // from class: androidx.compose.runtime.EffectsKt$rememberCoroutineScope$1
                @Override // x00.a
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.INSTANCE;
                }
            };
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = createCompositionCoroutineScope(aVar.invoke(), composer);
            composer.updateRememberedValue(rememberedValue);
        }
        return (r0) rememberedValue;
    }

    @Composable
    public static final void DisposableEffect(@m80.l Object obj, @k l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:148)");
        }
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(lVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@m80.l Object obj, @k p<? super r0, ? super c<? super g2>, ? extends Object> pVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:316)");
        }
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, pVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@m80.l Object obj, @m80.l Object obj2, @k l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:185)");
        }
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(lVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@m80.l Object obj, @m80.l Object obj2, @k p<? super r0, ? super c<? super g2>, ? extends Object> pVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:335)");
        }
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, pVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @k l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:223)");
        }
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(lVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @k p<? super r0, ? super c<? super g2>, ? extends Object> pVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:354)");
        }
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, pVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@k Object[] objArr, @k l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i11, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:259)");
        }
        boolean z11 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z11 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@k Object[] objArr, @k p<? super r0, ? super c<? super g2>, ? extends Object> pVar, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i11, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:377)");
        }
        d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean z11 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z11 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
