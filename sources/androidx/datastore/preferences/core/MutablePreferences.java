package androidx.datastore.preferences.core;

import a00.a0;
import a00.i0;
import a00.k1;
import a00.r0;
import androidx.datastore.preferences.core.Preferences;
import com.bumptech.glide.load.engine.GlideException;
import g10.u;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,361:1\n1#2:362\n1179#3,2:363\n1253#3,4:365\n13579#4,2:369\n167#5,3:371\n*S KotlinDebug\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n*L\n158#1:363,2\n158#1:365,4\n250#1:369,2\n283#1:371,3\n*E\n"})
/* loaded from: classes2.dex */
public final class MutablePreferences extends Preferences {

    @k
    private final AtomicBoolean frozen;

    @k
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    @k
    public Map<Preferences.Key<?>, Object> asMap() {
        Pair pair;
        Set<Map.Entry<Preferences.Key<?>, Object>> entrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                g0.o(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return Actual_jvmAndroidKt.immutableMap(linkedHashMap);
    }

    public final void checkNotFrozen$datastore_preferences_core_release() {
        if (this.frozen.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core_release();
        this.preferencesMap.clear();
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(@k Preferences.Key<T> key) {
        g0.p(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:15:0x002e->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@m80.l java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.preferences.core.MutablePreferences
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.datastore.preferences.core.MutablePreferences r6 = (androidx.datastore.preferences.core.MutablePreferences) r6
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r6.preferencesMap
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r6 = r6.preferencesMap
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L26
            return r3
        L26:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L63
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5e
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L63
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L63
            r0 = r3
            goto L64
        L5e:
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L2e
            return r1
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.core.MutablePreferences.equals(java.lang.Object):boolean");
    }

    public final void freeze$datastore_preferences_core_release() {
        this.frozen.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.core.Preferences
    @l
    public <T> T get(@k Preferences.Key<T> key) {
        g0.p(key, "key");
        T t11 = (T) this.preferencesMap.get(key);
        if (!(t11 instanceof byte[])) {
            return t11;
        }
        byte[] bArr = (byte[]) t11;
        T t12 = (T) Arrays.copyOf(bArr, bArr.length);
        g0.o(t12, "copyOf(this, size)");
        return t12;
    }

    @k
    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core_release() {
        return this.preferencesMap;
    }

    public int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i11 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i11;
    }

    public final void minusAssign(@k Preferences.Key<?> key) {
        g0.p(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        remove(key);
    }

    public final void plusAssign(@k Preferences prefs) {
        g0.p(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core_release();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void putAll(@k Preferences.Pair<?>... pairs) {
        g0.p(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core_release();
        for (Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core_release(pair.getKey$datastore_preferences_core_release(), pair.getValue$datastore_preferences_core_release());
        }
    }

    public final <T> T remove(@k Preferences.Key<T> key) {
        g0.p(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void set(@k Preferences.Key<T> key, T t11) {
        g0.p(key, "key");
        setUnchecked$datastore_preferences_core_release(key, t11);
    }

    public final void setUnchecked$datastore_preferences_core_release(@k Preferences.Key<?> key, @l Object obj) {
        g0.p(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        if (obj == null) {
            remove(key);
            return;
        }
        if (obj instanceof Set) {
            this.preferencesMap.put(key, Actual_jvmAndroidKt.immutableCopyOfSet((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.preferencesMap.put(key, obj);
            return;
        }
        Map<Preferences.Key<?>, Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(this, size)");
        map.put(key, copyOf);
    }

    @k
    public String toString() {
        return r0.r3(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new x00.l<Map.Entry<Preferences.Key<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences$toString$1
            @Override // x00.l
            @k
            public final CharSequence invoke(@k Map.Entry<Preferences.Key<?>, Object> entry) {
                g0.p(entry, "entry");
                Object value = entry.getValue();
                return GlideException.a.f28776d + entry.getKey().getName() + " = " + (value instanceof byte[] ? a0.yh((byte[]) value, j2.O, "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
            }
        }, 24, null);
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map, (i11 & 2) != 0 ? true : z11);
    }

    public final void plusAssign(@k Preferences.Pair<?> pair) {
        g0.p(pair, "pair");
        checkNotFrozen$datastore_preferences_core_release();
        putAll(pair);
    }

    public MutablePreferences(@k Map<Preferences.Key<?>, Object> preferencesMap, boolean z11) {
        g0.p(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z11);
    }
}
