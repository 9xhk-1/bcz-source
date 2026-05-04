package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
/* loaded from: classes.dex */
public final class IntObjectMapKt {

    @k
    private static final MutableIntObjectMap EmptyIntObjectMap = new MutableIntObjectMap(0);

    @k
    public static final <V> IntObjectMap<V> buildIntObjectMap(@k l<? super MutableIntObjectMap<V>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        builderAction.invoke(mutableIntObjectMap);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        g0.n(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    @k
    public static final <V> IntObjectMap<V> intObjectMapOf() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        g0.n(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    @k
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        return new MutableIntObjectMap<>(0, 1, null);
    }

    @k
    public static final <V> IntObjectMap<V> buildIntObjectMap(int i11, @k l<? super MutableIntObjectMap<V>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(i11);
        builderAction.invoke(mutableIntObjectMap);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> IntObjectMap<V> intObjectMapOf(int i11, V v11) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i11, V v11) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> IntObjectMap<V> intObjectMapOf(int i11, V v11, int i12, V v12) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i11, V v11, int i12, V v12) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> IntObjectMap<V> intObjectMapOf(int i11, V v11, int i12, V v12, int i13, V v13) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i11, V v11, int i12, V v12, int i13, V v13) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> IntObjectMap<V> intObjectMapOf(int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> IntObjectMap<V> intObjectMapOf(int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14, int i15, V v15) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        mutableIntObjectMap.set(i15, v15);
        return mutableIntObjectMap;
    }

    @k
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14, int i15, V v15) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        mutableIntObjectMap.set(i15, v15);
        return mutableIntObjectMap;
    }
}
