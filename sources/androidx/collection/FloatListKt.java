package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,976:1\n1#2:977\n675#3,2:978\n715#3,2:980\n715#3,2:982\n715#3,2:984\n715#3,2:986\n715#3,2:988\n715#3,2:990\n675#3,2:992\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n909#1:978,2\n917#1:980,2\n924#1:982,2\n925#1:984,2\n935#1:986,2\n936#1:988,2\n937#1:990,2\n943#1:992,2\n*E\n"})
/* loaded from: classes.dex */
public final class FloatListKt {

    @k
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    @k
    public static final FloatList buildFloatList(@k l<? super MutableFloatList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(0, 1, null);
        builderAction.invoke(mutableFloatList);
        return mutableFloatList;
    }

    @k
    public static final FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    @k
    public static final FloatList floatListOf() {
        return EmptyFloatList;
    }

    @k
    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    @k
    public static final FloatList buildFloatList(int i11, @k l<? super MutableFloatList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(i11);
        builderAction.invoke(mutableFloatList);
        return mutableFloatList;
    }

    @k
    public static final FloatList floatListOf(float f11) {
        return mutableFloatListOf(f11);
    }

    @k
    public static final MutableFloatList mutableFloatListOf(float f11) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f11);
        return mutableFloatList;
    }

    @k
    public static final FloatList floatListOf(float f11, float f12) {
        return mutableFloatListOf(f11, f12);
    }

    @k
    public static final FloatList floatListOf(float f11, float f12, float f13) {
        return mutableFloatListOf(f11, f12, f13);
    }

    @k
    public static final MutableFloatList mutableFloatListOf(float f11, float f12) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f11);
        mutableFloatList.add(f12);
        return mutableFloatList;
    }

    @k
    public static final FloatList floatListOf(@k float... elements) {
        g0.p(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.addAll(mutableFloatList._size, elements);
        return mutableFloatList;
    }

    @k
    public static final MutableFloatList mutableFloatListOf(float f11, float f12, float f13) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f11);
        mutableFloatList.add(f12);
        mutableFloatList.add(f13);
        return mutableFloatList;
    }

    @k
    public static final MutableFloatList mutableFloatListOf(@k float... elements) {
        g0.p(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.addAll(mutableFloatList._size, elements);
        return mutableFloatList;
    }
}
