package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongFloatMap.kt\nandroidx/collection/LongFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1036:1\n1#2:1037\n*E\n"})
/* loaded from: classes.dex */
public final class LongFloatMapKt {

    @k
    private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);

    @k
    public static final LongFloatMap buildLongFloatMap(@k l<? super MutableLongFloatMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        builderAction.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }

    @k
    public static final LongFloatMap emptyLongFloatMap() {
        return EmptyLongFloatMap;
    }

    @k
    public static final LongFloatMap longFloatMapOf() {
        return EmptyLongFloatMap;
    }

    @k
    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, null);
    }

    @k
    public static final LongFloatMap buildLongFloatMap(int i11, @k l<? super MutableLongFloatMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(i11);
        builderAction.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }

    @k
    public static final LongFloatMap longFloatMapOf(long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    @k
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    @k
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    @k
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    @k
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    @k
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    @k
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }

    @k
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }

    @k
    public static final LongFloatMap longFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14, long j15, float f15) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        mutableLongFloatMap.set(j15, f15);
        return mutableLongFloatMap;
    }

    @k
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14, long j15, float f15) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        mutableLongFloatMap.set(j15, f15);
        return mutableLongFloatMap;
    }
}
