package androidx.compose.runtime.livedata;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,70:1\n75#2:71\n1247#3,6:72\n1247#3,6:78\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n*L\n58#1:71\n59#1:72,6\n63#1:78,6\n*E\n"})
/* loaded from: classes.dex */
public final class LiveDataAdapterKt {
    @Composable
    @k
    public static final <T> State<T> observeAsState(@k LiveData<T> liveData, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2027206144, i11, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:39)");
        }
        State<T> observeAsState = observeAsState(liveData, liveData.getValue(), composer, i11 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return observeAsState;
    }

    @Composable
    @k
    public static final <R, T extends R> State<R> observeAsState(@k LiveData<T> liveData, R r11, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411178300, i11, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:56)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            if (liveData.isInitialized()) {
                r11 = liveData.getValue();
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r11, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(liveData) | composer.changedInstance(lifecycleOwner);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new LiveDataAdapterKt$observeAsState$1$1(liveData, lifecycleOwner, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(liveData, lifecycleOwner, (x00.l) rememberedValue2, composer, i11 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
