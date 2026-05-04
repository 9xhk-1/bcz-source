package com.baicizhan.main.home.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class StatusType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ StatusType[] $VALUES;
    public static final StatusType ME = new StatusType("ME", 0);
    public static final StatusType VITALITY = new StatusType("VITALITY", 1);
    public static final StatusType COINS = new StatusType("COINS", 2);
    public static final StatusType FORWARDING = new StatusType("FORWARDING", 3);
    public static final StatusType SETTING = new StatusType("SETTING", 4);

    private static final /* synthetic */ StatusType[] $values() {
        return new StatusType[]{ME, VITALITY, COINS, FORWARDING, SETTING};
    }

    static {
        StatusType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private StatusType(String str, int i11) {
    }

    @m80.k
    public static m00.a<StatusType> getEntries() {
        return $ENTRIES;
    }

    public static StatusType valueOf(String str) {
        return (StatusType) Enum.valueOf(StatusType.class, str);
    }

    public static StatusType[] values() {
        return (StatusType[]) $VALUES.clone();
    }
}
