package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/IntIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class IntIntMapKt {

    @k
    private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);

    @k
    public static final IntIntMap buildIntIntMap(@k l<? super MutableIntIntMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        builderAction.invoke(mutableIntIntMap);
        return mutableIntIntMap;
    }

    @k
    public static final IntIntMap emptyIntIntMap() {
        return EmptyIntIntMap;
    }

    @k
    public static final IntIntMap intIntMapOf() {
        return EmptyIntIntMap;
    }

    @k
    public static final MutableIntIntMap mutableIntIntMapOf() {
        return new MutableIntIntMap(0, 1, null);
    }

    @k
    public static final IntIntMap buildIntIntMap(int i11, @k l<? super MutableIntIntMap, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(i11);
        builderAction.invoke(mutableIntIntMap);
        return mutableIntIntMap;
    }

    @k
    public static final IntIntMap intIntMapOf(int i11, int i12) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        return mutableIntIntMap;
    }

    @k
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        return mutableIntIntMap;
    }

    @k
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        return mutableIntIntMap;
    }

    @k
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        return mutableIntIntMap;
    }

    @k
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        return mutableIntIntMap;
    }

    @k
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        return mutableIntIntMap;
    }

    @k
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        return mutableIntIntMap;
    }

    @k
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        return mutableIntIntMap;
    }

    @k
    public static final IntIntMap intIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        mutableIntIntMap.set(i19, i21);
        return mutableIntIntMap;
    }

    @k
    public static final MutableIntIntMap mutableIntIntMapOf(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i11, i12);
        mutableIntIntMap.set(i13, i14);
        mutableIntIntMap.set(i15, i16);
        mutableIntIntMap.set(i17, i18);
        mutableIntIntMap.set(i19, i21);
        return mutableIntIntMap;
    }
}
