package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/IntLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class IntLongMapKt {

    @k
    private static final MutableIntLongMap EmptyIntLongMap = new MutableIntLongMap(0);

    @k
    public static final IntLongMap buildIntLongMap(@k l<? super MutableIntLongMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        builderAction.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    @k
    public static final IntLongMap emptyIntLongMap() {
        return EmptyIntLongMap;
    }

    @k
    public static final IntLongMap intLongMapOf() {
        return EmptyIntLongMap;
    }

    @k
    public static final MutableIntLongMap mutableIntLongMapOf() {
        return new MutableIntLongMap(0, 1, null);
    }

    @k
    public static final IntLongMap buildIntLongMap(int i11, @k l<? super MutableIntLongMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(i11);
        builderAction.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    @k
    public static final IntLongMap intLongMapOf(int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    @k
    public static final MutableIntLongMap mutableIntLongMapOf(int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    @k
    public static final IntLongMap intLongMapOf(int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    @k
    public static final MutableIntLongMap mutableIntLongMapOf(int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    @k
    public static final IntLongMap intLongMapOf(int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    @k
    public static final MutableIntLongMap mutableIntLongMapOf(int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    @k
    public static final IntLongMap intLongMapOf(int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }

    @k
    public static final MutableIntLongMap mutableIntLongMapOf(int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }

    @k
    public static final IntLongMap intLongMapOf(int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14, int i15, long j15) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        mutableIntLongMap.set(i15, j15);
        return mutableIntLongMap;
    }

    @k
    public static final MutableIntLongMap mutableIntLongMapOf(int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14, int i15, long j15) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        mutableIntLongMap.set(i15, j15);
        return mutableIntLongMap;
    }
}
