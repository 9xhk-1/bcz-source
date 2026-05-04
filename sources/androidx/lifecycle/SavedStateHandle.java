package androidx.lifecycle;

import a00.l1;
import a00.x1;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import m80.k;
import m80.l;
import w00.o;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n361#2,3:490\n364#2,4:494\n1#3:493\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n227#1:490,3\n227#1:494,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandle {

    @k
    private static final String KEYS = "keys";

    @k
    private static final String VALUES = "values";

    @k
    private final Map<String, y<Object>> flows;

    @k
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    @k
    private final Map<String, Object> regular;

    @k
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    @k
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final SavedStateHandle createHandle(@l Bundle bundle, @l Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    g0.o(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(hashMap);
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            g0.m(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = parcelableArrayList.get(i11);
                g0.n(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i11));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(@l Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                g0.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public SavedStateHandle(@k Map<String, ? extends Object> initialState) {
        g0.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.j
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final SavedStateHandle createHandle(@l Bundle bundle, @l Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z11, T t11) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData3 = savingStateLiveData2 instanceof MutableLiveData ? savingStateLiveData2 : null;
        if (savingStateLiveData3 != null) {
            return savingStateLiveData3;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z11) {
            this.regular.put(str, t11);
            savingStateLiveData = new SavingStateLiveData<>(this, str, t11);
        } else {
            savingStateLiveData = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle this$0) {
        g0.p(this$0, "this$0");
        for (Map.Entry entry : l1.D0(this$0.savedStateProviders).entrySet()) {
            this$0.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return BundleKt.bundleOf(h1.a(KEYS, arrayList), h1.a(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(@k String key) {
        g0.p(key, "key");
        this.savedStateProviders.remove(key);
    }

    @MainThread
    public final boolean contains(@k String key) {
        g0.p(key, "key");
        return this.regular.containsKey(key);
    }

    @l
    @MainThread
    public final <T> T get(@k String key) {
        g0.p(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @MainThread
    @k
    public final <T> MutableLiveData<T> getLiveData(@k String key) {
        g0.p(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        g0.n(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    @k
    public final <T> m0<T> getStateFlow(@k String key, T t11) {
        g0.p(key, "key");
        Map<String, y<Object>> map = this.flows;
        y<Object> yVar = map.get(key);
        if (yVar == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t11);
            }
            yVar = o0.a(this.regular.get(key));
            this.flows.put(key, yVar);
            map.put(key, yVar);
        }
        m0<T> n11 = kotlinx.coroutines.flow.k.n(yVar);
        g0.n(n11, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return n11;
    }

    @MainThread
    @k
    public final Set<String> keys() {
        return x1.C(x1.C(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @l
    @MainThread
    public final <T> T remove(@k String key) {
        g0.p(key, "key");
        T t11 = (T) this.regular.remove(key);
        SavingStateLiveData<?> remove = this.liveDatas.remove(key);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(key);
        return t11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(@k String key, @l T t11) {
        g0.p(key, "key");
        if (!Companion.validateValue(t11)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            g0.m(t11);
            sb2.append(t11.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(key);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t11);
        } else {
            this.regular.put(key, t11);
        }
        y<Object> yVar = this.flows.get(key);
        if (yVar == null) {
            return;
        }
        yVar.setValue(t11);
    }

    @MainThread
    public final void setSavedStateProvider(@k String key, @k SavedStateRegistry.SavedStateProvider provider) {
        g0.p(key, "key");
        g0.p(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    @MainThread
    @k
    public final <T> MutableLiveData<T> getLiveData(@k String key, T t11) {
        g0.p(key, "key");
        return getLiveDataInternal(key, true, t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {

        @l
        private SavedStateHandle handle;

        @k
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(@l SavedStateHandle savedStateHandle, @k String key, T t11) {
            super(t11);
            g0.p(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t11) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t11);
                y yVar = (y) savedStateHandle.flows.get(this.key);
                if (yVar != null) {
                    yVar.setValue(t11);
                }
            }
            super.setValue(t11);
        }

        public SavingStateLiveData(@l SavedStateHandle savedStateHandle, @k String key) {
            g0.p(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.j
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
    }
}
