package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/LongIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class LongIntMapKt {

    @k
    private static final MutableLongIntMap EmptyLongIntMap = new MutableLongIntMap(0);

    @k
    public static final LongIntMap buildLongIntMap(@k l<? super MutableLongIntMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    @k
    public static final LongIntMap emptyLongIntMap() {
        return EmptyLongIntMap;
    }

    @k
    public static final LongIntMap longIntMapOf() {
        return EmptyLongIntMap;
    }

    @k
    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, null);
    }

    @k
    public static final LongIntMap buildLongIntMap(int i11, @k l<? super MutableLongIntMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(i11);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    @k
    public static final LongIntMap longIntMapOf(long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    @k
    public static final MutableLongIntMap mutableLongIntMapOf(long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    @k
    public static final LongIntMap longIntMapOf(long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    @k
    public static final MutableLongIntMap mutableLongIntMapOf(long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    @k
    public static final LongIntMap longIntMapOf(long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    @k
    public static final MutableLongIntMap mutableLongIntMapOf(long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    @k
    public static final LongIntMap longIntMapOf(long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }

    @k
    public static final MutableLongIntMap mutableLongIntMapOf(long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }

    @k
    public static final LongIntMap longIntMapOf(long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14, long j15, int i15) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        mutableLongIntMap.set(j15, i15);
        return mutableLongIntMap;
    }

    @k
    public static final MutableLongIntMap mutableLongIntMapOf(long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14, long j15, int i15) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        mutableLongIntMap.set(j15, i15);
        return mutableLongIntMap;
    }
}
