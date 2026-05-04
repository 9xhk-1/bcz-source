package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/FloatLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1036:1\n1#2:1037\n*E\n"})
/* loaded from: classes.dex */
public final class FloatLongMapKt {

    @k
    private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);

    @k
    public static final FloatLongMap buildFloatLongMap(@k l<? super MutableFloatLongMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    @k
    public static final FloatLongMap emptyFloatLongMap() {
        return EmptyFloatLongMap;
    }

    @k
    public static final FloatLongMap floatLongMapOf() {
        return EmptyFloatLongMap;
    }

    @k
    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, null);
    }

    @k
    public static final FloatLongMap buildFloatLongMap(int i11, @k l<? super MutableFloatLongMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(i11);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    @k
    public static final FloatLongMap floatLongMapOf(float f11, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        return mutableFloatLongMap;
    }

    @k
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f11, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        return mutableFloatLongMap;
    }

    @k
    public static final FloatLongMap floatLongMapOf(float f11, long j11, float f12, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        return mutableFloatLongMap;
    }

    @k
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f11, long j11, float f12, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        return mutableFloatLongMap;
    }

    @k
    public static final FloatLongMap floatLongMapOf(float f11, long j11, float f12, long j12, float f13, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        return mutableFloatLongMap;
    }

    @k
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f11, long j11, float f12, long j12, float f13, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        return mutableFloatLongMap;
    }

    @k
    public static final FloatLongMap floatLongMapOf(float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        return mutableFloatLongMap;
    }

    @k
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        return mutableFloatLongMap;
    }

    @k
    public static final FloatLongMap floatLongMapOf(float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14, float f15, long j15) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        mutableFloatLongMap.set(f15, j15);
        return mutableFloatLongMap;
    }

    @k
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14, float f15, long j15) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        mutableFloatLongMap.set(f15, j15);
        return mutableFloatLongMap;
    }
}
