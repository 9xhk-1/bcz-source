package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,972:1\n1#2:973\n673#3,2:974\n713#3,2:976\n713#3,2:978\n713#3,2:980\n713#3,2:982\n713#3,2:984\n713#3,2:986\n673#3,2:988\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n905#1:974,2\n913#1:976,2\n920#1:978,2\n921#1:980,2\n931#1:982,2\n932#1:984,2\n933#1:986,2\n939#1:988,2\n*E\n"})
/* loaded from: classes.dex */
public final class LongListKt {

    @k
    private static final LongList EmptyLongList = new MutableLongList(0);

    @k
    public static final LongList buildLongList(@k l<? super MutableLongList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(0, 1, null);
        builderAction.invoke(mutableLongList);
        return mutableLongList;
    }

    @k
    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    @k
    public static final LongList longListOf() {
        return EmptyLongList;
    }

    @k
    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    @k
    public static final LongList buildLongList(int i11, @k l<? super MutableLongList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(i11);
        builderAction.invoke(mutableLongList);
        return mutableLongList;
    }

    @k
    public static final LongList longListOf(long j11) {
        return mutableLongListOf(j11);
    }

    @k
    public static final MutableLongList mutableLongListOf(long j11) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j11);
        return mutableLongList;
    }

    @k
    public static final LongList longListOf(long j11, long j12) {
        return mutableLongListOf(j11, j12);
    }

    @k
    public static final LongList longListOf(long j11, long j12, long j13) {
        return mutableLongListOf(j11, j12, j13);
    }

    @k
    public static final MutableLongList mutableLongListOf(long j11, long j12) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j11);
        mutableLongList.add(j12);
        return mutableLongList;
    }

    @k
    public static final LongList longListOf(@k long... elements) {
        g0.p(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.addAll(mutableLongList._size, elements);
        return mutableLongList;
    }

    @k
    public static final MutableLongList mutableLongListOf(long j11, long j12, long j13) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j11);
        mutableLongList.add(j12);
        mutableLongList.add(j13);
        return mutableLongList;
    }

    @k
    public static final MutableLongList mutableLongListOf(@k long... elements) {
        g0.p(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.addAll(mutableLongList._size, elements);
        return mutableLongList;
    }
}
