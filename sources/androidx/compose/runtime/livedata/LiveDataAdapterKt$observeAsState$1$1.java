package androidx.compose.runtime.livedata;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,70:1\n64#2,5:71\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt$observeAsState$1$1\n*L\n66#1:71,5\n*E\n"})
/* loaded from: classes.dex */
public final class LiveDataAdapterKt$observeAsState$1$1 extends Lambda implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ MutableState<R> $state;
    final /* synthetic */ LiveData<T> $this_observeAsState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataAdapterKt$observeAsState$1$1(LiveData<T> liveData, LifecycleOwner lifecycleOwner, MutableState<R> mutableState) {
        super(1);
        this.$this_observeAsState = liveData;
        this.$lifecycleOwner = lifecycleOwner;
        this.$state = mutableState;
    }

    @Override // x00.l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final MutableState<R> mutableState = this.$state;
        final Observer observer = new Observer() { // from class: androidx.compose.runtime.livedata.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MutableState.this.setValue(obj);
            }
        };
        this.$this_observeAsState.observe(this.$lifecycleOwner, observer);
        final LiveData<T> liveData = this.$this_observeAsState;
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LiveData.this.removeObserver(observer);
            }
        };
    }
}
