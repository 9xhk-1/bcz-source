package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import d10.e;
import d10.f;
import h10.n;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import x00.p;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "SavedStateHandleSaverKt")
@u0({"SMAP\nSavedStateHandleSaver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandleSaverKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        g0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new p<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            @l
            public final MutableState<Object> invoke(@k SaverScope Saver, @k MutableState<T> state) {
                g0.p(Saver, "$this$Saver");
                g0.p(state, "state");
                if (!(state instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object save = saver.save(Saver, state.getValue());
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) state).getPolicy();
                g0.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(save, policy);
            }
        }, new x00.l<MutableState<Object>, MutableState<T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            @l
            public final MutableState<T> invoke(@k MutableState<Object> it) {
                T t11;
                g0.p(it, "it");
                if (!(it instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (it.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = it.getValue();
                    g0.m(value);
                    t11 = saver2.restore(value);
                } else {
                    t11 = null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) it).getPolicy();
                g0.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5?>");
                MutableState<T> mutableStateOf = SnapshotStateKt.mutableStateOf(t11, policy);
                g0.n(mutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5>");
                return mutableStateOf;
            }
        });
    }

    @SavedStateHandleSaveableApi
    @k
    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m5613saveable(@k SavedStateHandle savedStateHandle, @k String key, @k final Saver<T, ? extends Object> saver, @k x00.a<? extends T> init) {
        final T invoke;
        Object obj;
        g0.p(savedStateHandle, "<this>");
        g0.p(key, "key");
        g0.p(saver, "saver");
        g0.p(init, "init");
        Bundle bundle = (Bundle) savedStateHandle.get(key);
        if (bundle == null || (obj = bundle.get("value")) == null || (invoke = saver.restore(obj)) == null) {
            invoke = init.invoke();
        }
        savedStateHandle.setSavedStateProvider(key, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.b
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle saveable$lambda$1;
                saveable$lambda$1 = SavedStateHandleSaverKt.saveable$lambda$1(Saver.this, invoke);
                return saveable$lambda$1;
            }
        });
        return invoke;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m5613saveable(savedStateHandle, str, saver, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object value) {
        g0.p(saver, "$saver");
        g0.p(value, "$value");
        return BundleKt.bundleOf(h1.a("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), value)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e saveable$lambda$3(SavedStateHandle this_saveable, Saver saver, x00.a init, Object obj, n property) {
        String str;
        g0.p(this_saveable, "$this_saveable");
        g0.p(saver, "$saver");
        g0.p(init, "$init");
        g0.p(property, "property");
        if (obj != null) {
            str = o0.d(obj.getClass()).x() + '.';
        } else {
            str = "";
        }
        final Object m5613saveable = m5613saveable(this_saveable, str + property.getName(), (Saver<Object, ? extends Object>) saver, (x00.a<? extends Object>) init);
        return new e() { // from class: androidx.lifecycle.viewmodel.compose.d
            @Override // d10.e
            public final Object getValue(Object obj2, n nVar) {
                Object saveable$lambda$3$lambda$2;
                saveable$lambda$3$lambda$2 = SavedStateHandleSaverKt.saveable$lambda$3$lambda$2(m5613saveable, obj2, nVar);
                return saveable$lambda$3$lambda$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object saveable$lambda$3$lambda$2(Object value, Object obj, n nVar) {
        g0.p(value, "$value");
        g0.p(nVar, "<anonymous parameter 1>");
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f saveable$lambda$4(SavedStateHandle this_saveable, Saver stateSaver, x00.a init, Object obj, n property) {
        String str;
        g0.p(this_saveable, "$this_saveable");
        g0.p(stateSaver, "$stateSaver");
        g0.p(init, "$init");
        g0.p(property, "property");
        if (obj != null) {
            str = o0.d(obj.getClass()).x() + '.';
        } else {
            str = "";
        }
        final MutableState saveable = saveable(this_saveable, str + property.getName(), stateSaver, init);
        return new f<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            @Override // d10.f, d10.e
            public T getValue(@l Object obj2, @k n<?> property2) {
                g0.p(property2, "property");
                return saveable.getValue();
            }

            @Override // d10.f
            public void setValue(@l Object obj2, @k n<?> property2, T t11) {
                g0.p(property2, "property");
                saveable.setValue(t11);
            }
        };
    }

    @j(name = "saveableMutableState")
    @SavedStateHandleSaveableApi
    @k
    public static final <T, M extends MutableState<T>> d10.d<Object, f<Object, T>> saveableMutableState(@k final SavedStateHandle savedStateHandle, @k final Saver<T, ? extends Object> stateSaver, @k final x00.a<? extends M> init) {
        g0.p(savedStateHandle, "<this>");
        g0.p(stateSaver, "stateSaver");
        g0.p(init, "init");
        return new d10.d() { // from class: androidx.lifecycle.viewmodel.compose.c
            @Override // d10.d
            public final Object a(Object obj, n nVar) {
                f saveable$lambda$4;
                saveable$lambda$4 = SavedStateHandleSaverKt.saveable$lambda$4(SavedStateHandle.this, stateSaver, init, obj, nVar);
                return saveable$lambda$4;
            }
        };
    }

    public static /* synthetic */ d10.d saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, aVar);
    }

    @SavedStateHandleSaveableApi
    @k
    public static final <T> MutableState<T> saveable(@k SavedStateHandle savedStateHandle, @k String key, @k Saver<T, ? extends Object> stateSaver, @k x00.a<? extends MutableState<T>> init) {
        g0.p(savedStateHandle, "<this>");
        g0.p(key, "key");
        g0.p(stateSaver, "stateSaver");
        g0.p(init, "init");
        return (MutableState) m5613saveable(savedStateHandle, key, mutableStateSaver(stateSaver), (x00.a) init);
    }

    public static /* synthetic */ d10.d saveable$default(SavedStateHandle savedStateHandle, Saver saver, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, aVar);
    }

    @SavedStateHandleSaveableApi
    @k
    public static final <T> d10.d<Object, e<Object, T>> saveable(@k final SavedStateHandle savedStateHandle, @k final Saver<T, ? extends Object> saver, @k final x00.a<? extends T> init) {
        g0.p(savedStateHandle, "<this>");
        g0.p(saver, "saver");
        g0.p(init, "init");
        return new d10.d() { // from class: androidx.lifecycle.viewmodel.compose.a
            @Override // d10.d
            public final Object a(Object obj, n nVar) {
                e saveable$lambda$3;
                saveable$lambda$3 = SavedStateHandleSaverKt.saveable$lambda$3(SavedStateHandle.this, saver, init, obj, nVar);
                return saveable$lambda$3;
            }
        };
    }
}
