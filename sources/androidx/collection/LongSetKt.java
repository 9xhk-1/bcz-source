package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,885:1\n1#2:886\n*E\n"})
/* loaded from: classes.dex */
public final class LongSetKt {

    @k
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);

    @k
    private static final long[] EmptyLongArray = new long[0];

    @k
    public static final LongSet buildLongSet(@k l<? super MutableLongSet, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(0, 1, null);
        builderAction.invoke(mutableLongSet);
        return mutableLongSet;
    }

    @k
    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    @k
    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final int hash(long j11) {
        int hashCode = Long.hashCode(j11) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    @k
    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    @k
    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    @k
    public static final LongSet buildLongSet(int i11, @k l<? super MutableLongSet, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(i11);
        builderAction.invoke(mutableLongSet);
        return mutableLongSet;
    }

    @k
    public static final LongSet longSetOf(long j11) {
        return mutableLongSetOf(j11);
    }

    @k
    public static final MutableLongSet mutableLongSetOf(long j11) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j11);
        return mutableLongSet;
    }

    @k
    public static final LongSet longSetOf(long j11, long j12) {
        return mutableLongSetOf(j11, j12);
    }

    @k
    public static final MutableLongSet mutableLongSetOf(long j11, long j12) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j11);
        mutableLongSet.plusAssign(j12);
        return mutableLongSet;
    }

    @k
    public static final LongSet longSetOf(long j11, long j12, long j13) {
        return mutableLongSetOf(j11, j12, j13);
    }

    @k
    public static final LongSet longSetOf(@k long... elements) {
        g0.p(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }

    @k
    public static final MutableLongSet mutableLongSetOf(long j11, long j12, long j13) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j11);
        mutableLongSet.plusAssign(j12);
        mutableLongSet.plusAssign(j13);
        return mutableLongSet;
    }

    @k
    public static final MutableLongSet mutableLongSetOf(@k long... elements) {
        g0.p(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }
}
