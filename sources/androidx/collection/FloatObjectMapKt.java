package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
/* loaded from: classes.dex */
public final class FloatObjectMapKt {

    @k
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    @k
    public static final <V> FloatObjectMap<V> buildFloatObjectMap(@k l<? super MutableFloatObjectMap<V>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        g0.n(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        g0.n(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    @k
    public static final <V> FloatObjectMap<V> buildFloatObjectMap(int i11, @k l<? super MutableFloatObjectMap<V>, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(i11);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f11, V v11) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f11, V v11) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f11, V v11, float f12, V v12, float f13, V v13) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f11, V v11, float f12, V v12, float f13, V v13) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14, float f15, V v15) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        mutableFloatObjectMap.set(f15, v15);
        return mutableFloatObjectMap;
    }

    @k
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14, float f15, V v15) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        mutableFloatObjectMap.set(f15, v15);
        return mutableFloatObjectMap;
    }
}
