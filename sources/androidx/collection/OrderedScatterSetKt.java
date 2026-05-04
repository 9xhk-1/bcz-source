package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1511:1\n1#2:1512\n*E\n"})
/* loaded from: classes.dex */
public final class OrderedScatterSetKt {

    @k
    private static final MutableOrderedScatterSet<Object> EmptyOrderedScatterSet = new MutableOrderedScatterSet<>(0);

    @k
    public static final <E> OrderedScatterSet<E> emptyOrderedScatterSet() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        g0.n(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
        return mutableOrderedScatterSet;
    }

    @k
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf() {
        return new MutableOrderedScatterSet<>(0, 1, null);
    }

    @k
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        g0.n(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.orderedScatterSetOf>");
        return mutableOrderedScatterSet;
    }

    @k
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e11) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(1);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e11);
        return mutableOrderedScatterSet;
    }

    @k
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e11) {
        return mutableOrderedScatterSetOf(e11);
    }

    @k
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e11, E e12) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(2);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e11);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e12);
        return mutableOrderedScatterSet;
    }

    @k
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e11, E e12) {
        return mutableOrderedScatterSetOf(e11, e12);
    }

    @k
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e11, E e12, E e13) {
        return mutableOrderedScatterSetOf(e11, e12, e13);
    }

    @k
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(@k E... elements) {
        g0.p(elements, "elements");
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }

    @k
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e11, E e12, E e13) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(3);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e11);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e12);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e13);
        return mutableOrderedScatterSet;
    }

    @k
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(@k E... elements) {
        g0.p(elements, "elements");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }
}
