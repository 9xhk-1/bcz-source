package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n1#2:885\n*E\n"})
/* loaded from: classes.dex */
public final class IntSetKt {

    @k
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);

    @k
    private static final int[] EmptyIntArray = new int[0];

    @k
    public static final IntSet buildIntSet(@k l<? super MutableIntSet, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @k
    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    @k
    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i11) {
        int hashCode = Integer.hashCode(i11) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    @k
    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    @k
    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    @k
    public static final IntSet buildIntSet(int i11, @k l<? super MutableIntSet, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(i11);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @k
    public static final IntSet intSetOf(int i11) {
        return mutableIntSetOf(i11);
    }

    @k
    public static final MutableIntSet mutableIntSetOf(int i11) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i11);
        return mutableIntSet;
    }

    @k
    public static final IntSet intSetOf(int i11, int i12) {
        return mutableIntSetOf(i11, i12);
    }

    @k
    public static final MutableIntSet mutableIntSetOf(int i11, int i12) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i11);
        mutableIntSet.plusAssign(i12);
        return mutableIntSet;
    }

    @k
    public static final IntSet intSetOf(int i11, int i12, int i13) {
        return mutableIntSetOf(i11, i12, i13);
    }

    @k
    public static final IntSet intSetOf(@k int... elements) {
        g0.p(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    @k
    public static final MutableIntSet mutableIntSetOf(int i11, int i12, int i13) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i11);
        mutableIntSet.plusAssign(i12);
        mutableIntSet.plusAssign(i13);
        return mutableIntSet;
    }

    @k
    public static final MutableIntSet mutableIntSetOf(@k int... elements) {
        g0.p(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }
}
