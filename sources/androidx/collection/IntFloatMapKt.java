package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntFloatMap.kt\nandroidx/collection/IntFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class IntFloatMapKt {

    @k
    private static final MutableIntFloatMap EmptyIntFloatMap = new MutableIntFloatMap(0);

    @k
    public static final IntFloatMap buildIntFloatMap(@k l<? super MutableIntFloatMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    @k
    public static final IntFloatMap emptyIntFloatMap() {
        return EmptyIntFloatMap;
    }

    @k
    public static final IntFloatMap intFloatMapOf() {
        return EmptyIntFloatMap;
    }

    @k
    public static final MutableIntFloatMap mutableIntFloatMapOf() {
        return new MutableIntFloatMap(0, 1, null);
    }

    @k
    public static final IntFloatMap buildIntFloatMap(int i11, @k l<? super MutableIntFloatMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(i11);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    @k
    public static final IntFloatMap intFloatMapOf(int i11, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        return mutableIntFloatMap;
    }

    @k
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i11, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        return mutableIntFloatMap;
    }

    @k
    public static final IntFloatMap intFloatMapOf(int i11, float f11, int i12, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        return mutableIntFloatMap;
    }

    @k
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i11, float f11, int i12, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        return mutableIntFloatMap;
    }

    @k
    public static final IntFloatMap intFloatMapOf(int i11, float f11, int i12, float f12, int i13, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        return mutableIntFloatMap;
    }

    @k
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i11, float f11, int i12, float f12, int i13, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        return mutableIntFloatMap;
    }

    @k
    public static final IntFloatMap intFloatMapOf(int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        return mutableIntFloatMap;
    }

    @k
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        return mutableIntFloatMap;
    }

    @k
    public static final IntFloatMap intFloatMapOf(int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14, int i15, float f15) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        mutableIntFloatMap.set(i15, f15);
        return mutableIntFloatMap;
    }

    @k
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14, int i15, float f15) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        mutableIntFloatMap.set(i15, f15);
        return mutableIntFloatMap;
    }
}
