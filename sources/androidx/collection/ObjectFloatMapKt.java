package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1051:1\n1#2:1052\n*E\n"})
/* loaded from: classes.dex */
public final class ObjectFloatMapKt {

    @k
    private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = new MutableObjectFloatMap<>(0);

    @k
    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(@k l<? super MutableObjectFloatMap<K>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        builderAction.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        g0.n(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap<>(0, 1, null);
    }

    @k
    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        g0.n(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k11, float f11) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(int i11, @k l<? super MutableObjectFloatMap<K>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(i11);
        builderAction.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k11, float f11) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k11, float f11, K k12, float f12) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k11, float f11, K k12, float f12) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k11, float f11, K k12, float f12, K k13, float f13) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k11, float f11, K k12, float f12, K k13, float f13) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14, K k15, float f15) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        mutableObjectFloatMap.set(k15, f15);
        return mutableObjectFloatMap;
    }

    @k
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14, K k15, float f15) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        mutableObjectFloatMap.set(k15, f15);
        return mutableObjectFloatMap;
    }
}
