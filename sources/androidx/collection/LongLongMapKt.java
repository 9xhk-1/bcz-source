package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/LongLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class LongLongMapKt {

    @k
    private static final MutableLongLongMap EmptyLongLongMap = new MutableLongLongMap(0);

    @k
    public static final LongLongMap buildLongLongMap(@k l<? super MutableLongLongMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        builderAction.invoke(mutableLongLongMap);
        return mutableLongLongMap;
    }

    @k
    public static final LongLongMap emptyLongLongMap() {
        return EmptyLongLongMap;
    }

    @k
    public static final LongLongMap longLongMapOf() {
        return EmptyLongLongMap;
    }

    @k
    public static final MutableLongLongMap mutableLongLongMapOf() {
        return new MutableLongLongMap(0, 1, null);
    }

    @k
    public static final LongLongMap buildLongLongMap(int i11, @k l<? super MutableLongLongMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(i11);
        builderAction.invoke(mutableLongLongMap);
        return mutableLongLongMap;
    }

    @k
    public static final LongLongMap longLongMapOf(long j11, long j12) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        return mutableLongLongMap;
    }

    @k
    public static final MutableLongLongMap mutableLongLongMapOf(long j11, long j12) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        return mutableLongLongMap;
    }

    @k
    public static final LongLongMap longLongMapOf(long j11, long j12, long j13, long j14) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        return mutableLongLongMap;
    }

    @k
    public static final MutableLongLongMap mutableLongLongMapOf(long j11, long j12, long j13, long j14) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        return mutableLongLongMap;
    }

    @k
    public static final LongLongMap longLongMapOf(long j11, long j12, long j13, long j14, long j15, long j16) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        return mutableLongLongMap;
    }

    @k
    public static final MutableLongLongMap mutableLongLongMapOf(long j11, long j12, long j13, long j14, long j15, long j16) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        return mutableLongLongMap;
    }

    @k
    public static final LongLongMap longLongMapOf(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        mutableLongLongMap.set(j17, j18);
        return mutableLongLongMap;
    }

    @k
    public static final MutableLongLongMap mutableLongLongMapOf(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        mutableLongLongMap.set(j17, j18);
        return mutableLongLongMap;
    }

    @k
    public static final LongLongMap longLongMapOf(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        mutableLongLongMap.set(j17, j18);
        mutableLongLongMap.set(j19, j21);
        return mutableLongLongMap;
    }

    @k
    public static final MutableLongLongMap mutableLongLongMapOf(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        mutableLongLongMap.set(j17, j18);
        mutableLongLongMap.set(j19, j21);
        return mutableLongLongMap;
    }
}
