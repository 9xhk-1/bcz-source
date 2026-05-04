package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,968:1\n1#2:969\n672#3,2:970\n712#3,2:972\n712#3,2:974\n712#3,2:976\n712#3,2:978\n712#3,2:980\n712#3,2:982\n672#3,2:984\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n902#1:970,2\n910#1:972,2\n917#1:974,2\n918#1:976,2\n927#1:978,2\n928#1:980,2\n929#1:982,2\n935#1:984,2\n*E\n"})
/* loaded from: classes.dex */
public final class IntListKt {

    @k
    private static final IntList EmptyIntList = new MutableIntList(0);

    @k
    public static final IntList buildIntList(@k l<? super MutableIntList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        builderAction.invoke(mutableIntList);
        return mutableIntList;
    }

    @k
    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    @k
    public static final IntList intListOf() {
        return EmptyIntList;
    }

    @k
    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    @k
    public static final IntList buildIntList(int i11, @k l<? super MutableIntList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(i11);
        builderAction.invoke(mutableIntList);
        return mutableIntList;
    }

    @k
    public static final IntList intListOf(int i11) {
        return mutableIntListOf(i11);
    }

    @k
    public static final MutableIntList mutableIntListOf(int i11) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i11);
        return mutableIntList;
    }

    @k
    public static final IntList intListOf(int i11, int i12) {
        return mutableIntListOf(i11, i12);
    }

    @k
    public static final IntList intListOf(int i11, int i12, int i13) {
        return mutableIntListOf(i11, i12, i13);
    }

    @k
    public static final MutableIntList mutableIntListOf(int i11, int i12) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i11);
        mutableIntList.add(i12);
        return mutableIntList;
    }

    @k
    public static final IntList intListOf(@k int... elements) {
        g0.p(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.addAll(mutableIntList._size, elements);
        return mutableIntList;
    }

    @k
    public static final MutableIntList mutableIntListOf(int i11, int i12, int i13) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i11);
        mutableIntList.add(i12);
        mutableIntList.add(i13);
        return mutableIntList;
    }

    @k
    public static final MutableIntList mutableIntListOf(@k int... elements) {
        g0.p(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.addAll(mutableIntList._size, elements);
        return mutableIntList;
    }
}
