package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,886:1\n1#2:887\n*E\n"})
/* loaded from: classes.dex */
public final class FloatSetKt {

    @k
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);

    @k
    private static final float[] EmptyFloatArray = new float[0];

    @k
    public static final FloatSet buildFloatSet(@k l<? super MutableFloatSet, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(0, 1, null);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    @k
    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    @k
    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    @k
    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final int hash(float f11) {
        int hashCode = Float.hashCode(f11) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    @k
    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    @k
    public static final FloatSet buildFloatSet(int i11, @k l<? super MutableFloatSet, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(i11);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    @k
    public static final FloatSet floatSetOf(float f11) {
        return mutableFloatSetOf(f11);
    }

    @k
    public static final MutableFloatSet mutableFloatSetOf(float f11) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f11);
        return mutableFloatSet;
    }

    @k
    public static final FloatSet floatSetOf(float f11, float f12) {
        return mutableFloatSetOf(f11, f12);
    }

    @k
    public static final MutableFloatSet mutableFloatSetOf(float f11, float f12) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f11);
        mutableFloatSet.plusAssign(f12);
        return mutableFloatSet;
    }

    @k
    public static final FloatSet floatSetOf(float f11, float f12, float f13) {
        return mutableFloatSetOf(f11, f12, f13);
    }

    @k
    public static final FloatSet floatSetOf(@k float... elements) {
        g0.p(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    @k
    public static final MutableFloatSet mutableFloatSetOf(float f11, float f12, float f13) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f11);
        mutableFloatSet.plusAssign(f12);
        mutableFloatSet.plusAssign(f13);
        return mutableFloatSet;
    }

    @k
    public static final MutableFloatSet mutableFloatSetOf(@k float... elements) {
        g0.p(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }
}
