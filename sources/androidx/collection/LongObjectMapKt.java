package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/LongObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
/* loaded from: classes.dex */
public final class LongObjectMapKt {

    @k
    private static final MutableLongObjectMap EmptyLongObjectMap = new MutableLongObjectMap(0);

    @k
    public static final <V> LongObjectMap<V> buildLongObjectMap(@k l<? super MutableLongObjectMap<V>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        builderAction.invoke(mutableLongObjectMap);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> LongObjectMap<V> emptyLongObjectMap() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        g0.n(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return mutableLongObjectMap;
    }

    @k
    public static final <V> LongObjectMap<V> longObjectMapOf() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        g0.n(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return mutableLongObjectMap;
    }

    @k
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf() {
        return new MutableLongObjectMap<>(0, 1, null);
    }

    @k
    public static final <V> LongObjectMap<V> buildLongObjectMap(int i11, @k l<? super MutableLongObjectMap<V>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(i11);
        builderAction.invoke(mutableLongObjectMap);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> LongObjectMap<V> longObjectMapOf(long j11, V v11) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j11, V v11) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> LongObjectMap<V> longObjectMapOf(long j11, V v11, long j12, V v12) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j11, V v11, long j12, V v12) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> LongObjectMap<V> longObjectMapOf(long j11, V v11, long j12, V v12, long j13, V v13) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        mutableLongObjectMap.set(j13, v13);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j11, V v11, long j12, V v12, long j13, V v13) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        mutableLongObjectMap.set(j13, v13);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> LongObjectMap<V> longObjectMapOf(long j11, V v11, long j12, V v12, long j13, V v13, long j14, V v14) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        mutableLongObjectMap.set(j13, v13);
        mutableLongObjectMap.set(j14, v14);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j11, V v11, long j12, V v12, long j13, V v13, long j14, V v14) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        mutableLongObjectMap.set(j13, v13);
        mutableLongObjectMap.set(j14, v14);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> LongObjectMap<V> longObjectMapOf(long j11, V v11, long j12, V v12, long j13, V v13, long j14, V v14, long j15, V v15) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        mutableLongObjectMap.set(j13, v13);
        mutableLongObjectMap.set(j14, v14);
        mutableLongObjectMap.set(j15, v15);
        return mutableLongObjectMap;
    }

    @k
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j11, V v11, long j12, V v12, long j13, V v13, long j14, V v14, long j15, V v15) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        mutableLongObjectMap.set(j13, v13);
        mutableLongObjectMap.set(j14, v14);
        mutableLongObjectMap.set(j15, v15);
        return mutableLongObjectMap;
    }
}
