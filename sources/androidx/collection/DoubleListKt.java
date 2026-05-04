package androidx.collection;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n1#1,983:1\n1#2:984\n678#3,2:985\n718#3,2:987\n718#3,2:989\n718#3,2:991\n718#3,2:993\n718#3,2:995\n718#3,2:997\n678#3,2:999\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n*L\n912#1:985,2\n920#1:987,2\n927#1:989,2\n928#1:991,2\n942#1:993,2\n943#1:995,2\n944#1:997,2\n950#1:999,2\n*E\n"})
/* loaded from: classes.dex */
public final class DoubleListKt {

    @k
    private static final DoubleList EmptyDoubleList = new MutableDoubleList(0);

    @k
    public static final DoubleList buildDoubleList(@k l<? super MutableDoubleList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(0, 1, null);
        builderAction.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    @k
    public static final DoubleList doubleListOf() {
        return EmptyDoubleList;
    }

    @k
    public static final DoubleList emptyDoubleList() {
        return EmptyDoubleList;
    }

    @k
    public static final MutableDoubleList mutableDoubleListOf() {
        return new MutableDoubleList(0, 1, null);
    }

    @k
    public static final DoubleList buildDoubleList(int i11, @k l<? super MutableDoubleList, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(i11);
        builderAction.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    @k
    public static final DoubleList doubleListOf(double d11) {
        return mutableDoubleListOf(d11);
    }

    @k
    public static final MutableDoubleList mutableDoubleListOf(double d11) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(1);
        mutableDoubleList.add(d11);
        return mutableDoubleList;
    }

    @k
    public static final DoubleList doubleListOf(double d11, double d12) {
        return mutableDoubleListOf(d11, d12);
    }

    @k
    public static final DoubleList doubleListOf(double d11, double d12, double d13) {
        return mutableDoubleListOf(d11, d12, d13);
    }

    @k
    public static final MutableDoubleList mutableDoubleListOf(double d11, double d12) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(2);
        mutableDoubleList.add(d11);
        mutableDoubleList.add(d12);
        return mutableDoubleList;
    }

    @k
    public static final DoubleList doubleListOf(@k double... elements) {
        g0.p(elements, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(elements.length);
        mutableDoubleList.addAll(mutableDoubleList._size, elements);
        return mutableDoubleList;
    }

    @k
    public static final MutableDoubleList mutableDoubleListOf(double d11, double d12, double d13) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(3);
        mutableDoubleList.add(d11);
        mutableDoubleList.add(d12);
        mutableDoubleList.add(d13);
        return mutableDoubleList;
    }

    @k
    public static final MutableDoubleList mutableDoubleListOf(@k double... elements) {
        g0.p(elements, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(elements.length);
        mutableDoubleList.addAll(mutableDoubleList._size, elements);
        return mutableDoubleList;
    }
}
