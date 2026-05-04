package com.baicizhan.main.wordlistv2.repo;

import a00.h0;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<OrderType> f27971a = h0.Q(OrderType.TODAY_ALL, OrderType.TODAY_LEARN, OrderType.TODAY_REVIEW);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final List<OrderType> f27972b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final List<OrderType> f27973c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final List<OrderType> f27974d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final List<OrderType> f27975e;

    static {
        OrderType orderType = OrderType.DEFAULT;
        OrderType orderType2 = OrderType.LETTER_ASC;
        OrderType orderType3 = OrderType.LETTER_DESC;
        f27972b = h0.Q(orderType, orderType2, orderType3);
        OrderType orderType4 = OrderType.TIME_ASC;
        OrderType orderType5 = OrderType.TIME_DESC;
        f27973c = h0.Q(orderType4, orderType5, OrderType.MASTERED_ASC, OrderType.MASTERED_DESC, orderType2, orderType3);
        f27974d = h0.Q(orderType4, orderType5, orderType2, orderType3);
        f27975e = h0.Q(orderType4, orderType5, orderType2, orderType3);
    }

    @m80.k
    public static final List<OrderType> a() {
        return f27975e;
    }

    @m80.k
    public static final List<OrderType> b() {
        return f27973c;
    }

    @m80.k
    public static final List<OrderType> c() {
        return f27974d;
    }

    @m80.k
    public static final List<OrderType> d() {
        return f27972b;
    }

    @m80.k
    public static final List<OrderType> e() {
        return f27971a;
    }

    @m80.k
    public static final String f(@m80.l WordListType wordListType) {
        String pageDesc;
        return (wordListType == null || (pageDesc = wordListType.getPageDesc()) == null) ? "" : pageDesc;
    }
}
