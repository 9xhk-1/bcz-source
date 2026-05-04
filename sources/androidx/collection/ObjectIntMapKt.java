package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1051:1\n1#2:1052\n*E\n"})
/* loaded from: classes.dex */
public final class ObjectIntMapKt {

    @k
    private static final MutableObjectIntMap<Object> EmptyObjectIntMap = new MutableObjectIntMap<>(0);

    @k
    public static final <K> ObjectIntMap<K> buildObjectIntMap(@k l<? super MutableObjectIntMap<K>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        builderAction.invoke(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> ObjectIntMap<K> emptyObjectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        g0.n(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return mutableObjectIntMap;
    }

    @k
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf() {
        return new MutableObjectIntMap<>(0, 1, null);
    }

    @k
    public static final <K> ObjectIntMap<K> objectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        g0.n(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return mutableObjectIntMap;
    }

    @k
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k11, int i11) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> ObjectIntMap<K> buildObjectIntMap(int i11, @k l<? super MutableObjectIntMap<K>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i11);
        builderAction.invoke(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k11, int i11) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k11, int i11, K k12, int i12) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k11, int i11, K k12, int i12) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k11, int i11, K k12, int i12, K k13, int i13) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k11, int i11, K k12, int i12, K k13, int i13) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14, K k15, int i15) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        mutableObjectIntMap.set(k15, i15);
        return mutableObjectIntMap;
    }

    @k
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14, K k15, int i15) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        mutableObjectIntMap.set(k15, i15);
        return mutableObjectIntMap;
    }
}
