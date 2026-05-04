package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1051:1\n1#2:1052\n*E\n"})
/* loaded from: classes.dex */
public final class ObjectLongMapKt {

    @k
    private static final MutableObjectLongMap<Object> EmptyObjectLongMap = new MutableObjectLongMap<>(0);

    @k
    public static final <K> ObjectLongMap<K> buildObjectLongMap(@k l<? super MutableObjectLongMap<K>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        builderAction.invoke(mutableObjectLongMap);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> ObjectLongMap<K> emptyObjectLongMap() {
        MutableObjectLongMap<Object> mutableObjectLongMap = EmptyObjectLongMap;
        g0.n(mutableObjectLongMap, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return mutableObjectLongMap;
    }

    @k
    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf() {
        return new MutableObjectLongMap<>(0, 1, null);
    }

    @k
    public static final <K> ObjectLongMap<K> objectLongMap() {
        MutableObjectLongMap<Object> mutableObjectLongMap = EmptyObjectLongMap;
        g0.n(mutableObjectLongMap, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return mutableObjectLongMap;
    }

    @k
    public static final <K> ObjectLongMap<K> objectLongMapOf(K k11, long j11) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> ObjectLongMap<K> buildObjectLongMap(int i11, @k l<? super MutableObjectLongMap<K>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(i11);
        builderAction.invoke(mutableObjectLongMap);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k11, long j11) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> ObjectLongMap<K> objectLongMapOf(K k11, long j11, K k12, long j12) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k11, long j11, K k12, long j12) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> ObjectLongMap<K> objectLongMapOf(K k11, long j11, K k12, long j12, K k13, long j13) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        mutableObjectLongMap.set(k13, j13);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k11, long j11, K k12, long j12, K k13, long j13) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        mutableObjectLongMap.set(k13, j13);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> ObjectLongMap<K> objectLongMapOf(K k11, long j11, K k12, long j12, K k13, long j13, K k14, long j14) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        mutableObjectLongMap.set(k13, j13);
        mutableObjectLongMap.set(k14, j14);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k11, long j11, K k12, long j12, K k13, long j13, K k14, long j14) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        mutableObjectLongMap.set(k13, j13);
        mutableObjectLongMap.set(k14, j14);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> ObjectLongMap<K> objectLongMapOf(K k11, long j11, K k12, long j12, K k13, long j13, K k14, long j14, K k15, long j15) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        mutableObjectLongMap.set(k13, j13);
        mutableObjectLongMap.set(k14, j14);
        mutableObjectLongMap.set(k15, j15);
        return mutableObjectLongMap;
    }

    @k
    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k11, long j11, K k12, long j12, K k13, long j13, K k14, long j14, K k15, long j15) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        mutableObjectLongMap.set(k13, j13);
        mutableObjectLongMap.set(k14, j14);
        mutableObjectLongMap.set(k15, j15);
        return mutableObjectLongMap;
    }
}
