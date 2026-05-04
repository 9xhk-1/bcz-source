package com.baicizhan.main.wordlistv2.repo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class OrderType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;

    @m80.k
    private final String orderName;
    public static final OrderType TODAY_ALL = new OrderType("TODAY_ALL", 0, "全部");
    public static final OrderType TODAY_LEARN = new OrderType("TODAY_LEARN", 1, com.baicizhan.main.home.experiment.repo.q.f21581c);
    public static final OrderType TODAY_REVIEW = new OrderType("TODAY_REVIEW", 2, com.baicizhan.main.home.experiment.repo.q.f21582d);
    public static final OrderType DEFAULT = new OrderType("DEFAULT", 3, "按词书默认顺序");
    public static final OrderType TIME_ASC = new OrderType("TIME_ASC", 4, "按时间顺序");
    public static final OrderType TIME_DESC = new OrderType("TIME_DESC", 5, "按时间倒序");
    public static final OrderType MASTERED_ASC = new OrderType("MASTERED_ASC", 6, "按掌握度由低到高");
    public static final OrderType MASTERED_DESC = new OrderType("MASTERED_DESC", 7, "按掌握度由高到底");
    public static final OrderType LETTER_ASC = new OrderType("LETTER_ASC", 8, "按字母顺序");
    public static final OrderType LETTER_DESC = new OrderType("LETTER_DESC", 9, "按字母倒序");

    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{TODAY_ALL, TODAY_LEARN, TODAY_REVIEW, DEFAULT, TIME_ASC, TIME_DESC, MASTERED_ASC, MASTERED_DESC, LETTER_ASC, LETTER_DESC};
    }

    static {
        OrderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private OrderType(String str, int i11, String str2) {
        this.orderName = str2;
    }

    @m80.k
    public static m00.a<OrderType> getEntries() {
        return $ENTRIES;
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }

    @m80.k
    public final String getOrderName() {
        return this.orderName;
    }
}
