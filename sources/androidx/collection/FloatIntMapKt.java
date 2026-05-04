package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class FloatIntMapKt {

    @k
    private static final MutableFloatIntMap EmptyFloatIntMap = new MutableFloatIntMap(0);

    @k
    public static final FloatIntMap buildFloatIntMap(@k l<? super MutableFloatIntMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        builderAction.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    @k
    public static final FloatIntMap emptyFloatIntMap() {
        return EmptyFloatIntMap;
    }

    @k
    public static final FloatIntMap floatIntMapOf() {
        return EmptyFloatIntMap;
    }

    @k
    public static final MutableFloatIntMap mutableFloatIntMapOf() {
        return new MutableFloatIntMap(0, 1, null);
    }

    @k
    public static final FloatIntMap buildFloatIntMap(int i11, @k l<? super MutableFloatIntMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(i11);
        builderAction.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    @k
    public static final FloatIntMap floatIntMapOf(float f11, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        return mutableFloatIntMap;
    }

    @k
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f11, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        return mutableFloatIntMap;
    }

    @k
    public static final FloatIntMap floatIntMapOf(float f11, int i11, float f12, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        return mutableFloatIntMap;
    }

    @k
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f11, int i11, float f12, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        return mutableFloatIntMap;
    }

    @k
    public static final FloatIntMap floatIntMapOf(float f11, int i11, float f12, int i12, float f13, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        return mutableFloatIntMap;
    }

    @k
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f11, int i11, float f12, int i12, float f13, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        return mutableFloatIntMap;
    }

    @k
    public static final FloatIntMap floatIntMapOf(float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        return mutableFloatIntMap;
    }

    @k
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        return mutableFloatIntMap;
    }

    @k
    public static final FloatIntMap floatIntMapOf(float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14, float f15, int i15) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        mutableFloatIntMap.set(f15, i15);
        return mutableFloatIntMap;
    }

    @k
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14, float f15, int i15) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        mutableFloatIntMap.set(f15, i15);
        return mutableFloatIntMap;
    }
}
