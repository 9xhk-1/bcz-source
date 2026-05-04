package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import c40.r0;
import j00.c;
import java.util.Arrays;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,204:1\n1247#2,6:205\n1247#2,6:211\n1247#2,6:217\n1247#2,6:223\n1247#2,6:229\n1247#2,6:235\n1247#2,6:241\n1247#2,6:247\n1247#2,6:253\n1247#2,6:259\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n76#1:205,6\n77#1:211,6\n106#1:217,6\n107#1:223,6\n137#1:229,6\n138#1:235,6\n169#1:241,6\n170#1:247,6\n199#1:253,6\n201#1:259,6\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:74)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        g2 g2Var = g2.f100423a;
        boolean changedInstance = composer.changedInstance(pVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(pVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(g2Var, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @l Object obj, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:104)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(pVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$2$1(pVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, (i11 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @l Object obj, @l Object obj2, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:135)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(pVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(pVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj, obj2, (p) rememberedValue2, composer, (i11 >> 3) & 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @l Object obj, @l Object obj2, @l Object obj3, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:167)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(pVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$4$1(pVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj, obj2, obj3, (p) rememberedValue2, composer, (i11 >> 3) & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @k Object[] objArr, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i11, -1, "androidx.compose.runtime.produceState (ProduceState.kt:197)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean changedInstance = composer.changedInstance(pVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(pVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(copyOf, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
