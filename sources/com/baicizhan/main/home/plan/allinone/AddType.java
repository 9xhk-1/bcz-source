package com.baicizhan.main.home.plan.allinone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class AddType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ AddType[] $VALUES;
    public static final AddType LEARN = new AddType("LEARN", 0);
    public static final AddType REVIEW = new AddType("REVIEW", 1);

    private static final /* synthetic */ AddType[] $values() {
        return new AddType[]{LEARN, REVIEW};
    }

    static {
        AddType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private AddType(String str, int i11) {
    }

    @m80.k
    public static m00.a<AddType> getEntries() {
        return $ENTRIES;
    }

    public static AddType valueOf(String str) {
        return (AddType) Enum.valueOf(AddType.class, str);
    }

    public static AddType[] values() {
        return (AddType[]) $VALUES.clone();
    }
}
