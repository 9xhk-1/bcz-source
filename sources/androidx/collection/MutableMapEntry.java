package androidx.collection;

import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, g.a {
    private final int index;

    @k
    private final Object[] keys;

    @k
    private final Object[] values;

    public MutableMapEntry(@k Object[] keys, @k Object[] values, int i11) {
        g0.p(keys, "keys");
        g0.p(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i11;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    @k
    public final Object[] getKeys() {
        return this.keys;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }

    @k
    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v11) {
        Object[] objArr = this.values;
        int i11 = this.index;
        V v12 = (V) objArr[i11];
        objArr[i11] = v11;
        return v12;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
