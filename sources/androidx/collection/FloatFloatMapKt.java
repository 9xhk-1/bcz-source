package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1036:1\n1#2:1037\n*E\n"})
/* loaded from: classes.dex */
public final class FloatFloatMapKt {

    @k
    private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);

    @k
    public static final FloatFloatMap buildFloatFloatMap(@k l<? super MutableFloatFloatMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        builderAction.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    @k
    public static final FloatFloatMap emptyFloatFloatMap() {
        return EmptyFloatFloatMap;
    }

    @k
    public static final FloatFloatMap floatFloatMapOf() {
        return EmptyFloatFloatMap;
    }

    @k
    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, null);
    }

    @k
    public static final FloatFloatMap buildFloatFloatMap(int i11, @k l<? super MutableFloatFloatMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(i11);
        builderAction.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    @k
    public static final FloatFloatMap floatFloatMapOf(float f11, float f12) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        return mutableFloatFloatMap;
    }

    @k
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f11, float f12) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        return mutableFloatFloatMap;
    }

    @k
    public static final FloatFloatMap floatFloatMapOf(float f11, float f12, float f13, float f14) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        return mutableFloatFloatMap;
    }

    @k
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f11, float f12, float f13, float f14) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        return mutableFloatFloatMap;
    }

    @k
    public static final FloatFloatMap floatFloatMapOf(float f11, float f12, float f13, float f14, float f15, float f16) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        return mutableFloatFloatMap;
    }

    @k
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f11, float f12, float f13, float f14, float f15, float f16) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        return mutableFloatFloatMap;
    }

    @k
    public static final FloatFloatMap floatFloatMapOf(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        mutableFloatFloatMap.set(f17, f18);
        return mutableFloatFloatMap;
    }

    @k
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        mutableFloatFloatMap.set(f17, f18);
        return mutableFloatFloatMap;
    }

    @k
    public static final FloatFloatMap floatFloatMapOf(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        mutableFloatFloatMap.set(f17, f18);
        mutableFloatFloatMap.set(f19, f21);
        return mutableFloatFloatMap;
    }

    @k
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        mutableFloatFloatMap.set(f17, f18);
        mutableFloatFloatMap.set(f19, f21);
        return mutableFloatFloatMap;
    }
}
