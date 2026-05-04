package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,181:1\n77#2:182\n77#2:183\n1225#3,6:184\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n58#1:182\n131#1:183\n171#1:184,6\n*E\n"})
/* loaded from: classes2.dex */
public final class FlowExtKt {
    @Composable
    @k
    public static final <T> State<T> collectAsStateWithLifecycle(@k m0<? extends T> m0Var, @l LifecycleOwner lifecycleOwner, @l Lifecycle.State state, @l d dVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i12 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 4) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, i11, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        int i13 = i11 << 3;
        State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(m0Var, m0Var.getValue(), lifecycleOwner.getLifecycle(), state2, dVar2, composer, (i11 & 14) | (i13 & 7168) | (i13 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsStateWithLifecycle;
    }

    @Composable
    @k
    public static final <T> State<T> collectAsStateWithLifecycle(@k m0<? extends T> m0Var, @k Lifecycle lifecycle, @l Lifecycle.State state, @l d dVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 4) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1858162195, i11, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:95)");
        }
        int i13 = i11 << 3;
        State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(m0Var, m0Var.getValue(), lifecycle, state2, dVar2, composer, (i11 & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsStateWithLifecycle;
    }

    @Composable
    @k
    public static final <T> State<T> collectAsStateWithLifecycle(@k i<? extends T> iVar, T t11, @l LifecycleOwner lifecycleOwner, @l Lifecycle.State state, @l d dVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i12 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 8) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485997211, i11, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");
        }
        State<T> collectAsStateWithLifecycle = collectAsStateWithLifecycle(iVar, t11, lifecycleOwner.getLifecycle(), state2, dVar2, composer, (i11 & 14) | (((i11 >> 3) & 8) << 3) | (i11 & 112) | (i11 & 7168) | (57344 & i11), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsStateWithLifecycle;
    }

    @Composable
    @k
    public static final <T> State<T> collectAsStateWithLifecycle(@k i<? extends T> iVar, T t11, @k Lifecycle lifecycle, @l Lifecycle.State state, @l d dVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 8) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977777920, i11, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        Object[] objArr = {iVar, lifecycle, state2, dVar2};
        boolean changedInstance = composer.changedInstance(lifecycle) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(state2)) || (i11 & 3072) == 2048) | composer.changedInstance(dVar2) | composer.changedInstance(iVar);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, dVar2, iVar, null);
            composer.updateRememberedValue(flowExtKt$collectAsStateWithLifecycle$1$1);
            rememberedValue = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        State<T> produceState = SnapshotStateKt.produceState((Object) t11, objArr, (p) rememberedValue, composer, (i11 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return produceState;
    }
}
