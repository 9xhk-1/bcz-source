package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1210:1\n1#2:1211\n*E\n"})
/* loaded from: classes.dex */
public final class ScatterSetKt {

    @k
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    @k
    public static final <E> ScatterSet<E> emptyScatterSet() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        g0.n(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    @k
    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }

    @k
    public static final <E> ScatterSet<E> scatterSetOf() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        g0.n(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    @k
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e11) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e11);
        return mutableScatterSet;
    }

    @k
    public static final <E> ScatterSet<E> scatterSetOf(E e11) {
        return mutableScatterSetOf(e11);
    }

    @k
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e11, E e12) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e11);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e12);
        return mutableScatterSet;
    }

    @k
    public static final <E> ScatterSet<E> scatterSetOf(E e11, E e12) {
        return mutableScatterSetOf(e11, e12);
    }

    @k
    public static final <E> ScatterSet<E> scatterSetOf(E e11, E e12, E e13) {
        return mutableScatterSetOf(e11, e12, e13);
    }

    @k
    public static final <E> ScatterSet<E> scatterSetOf(@k E... elements) {
        g0.p(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }

    @k
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e11, E e12, E e13) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e11);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e12);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e13);
        return mutableScatterSet;
    }

    @k
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(@k E... elements) {
        g0.p(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }
}
