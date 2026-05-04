package com.baicizhan.platform.base.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class ButtonType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    public static final ButtonType PRIMARY = new ButtonType("PRIMARY", 0);
    public static final ButtonType PRIMARY_VARIANT = new ButtonType("PRIMARY_VARIANT", 1);
    public static final ButtonType SECONDARY = new ButtonType("SECONDARY", 2);
    public static final ButtonType SECONDARY_VARIANT = new ButtonType("SECONDARY_VARIANT", 3);
    public static final ButtonType GRAY = new ButtonType("GRAY", 4);
    public static final ButtonType GRAY_VARIANT = new ButtonType("GRAY_VARIANT", 5);

    private static final /* synthetic */ ButtonType[] $values() {
        return new ButtonType[]{PRIMARY, PRIMARY_VARIANT, SECONDARY, SECONDARY_VARIANT, GRAY, GRAY_VARIANT};
    }

    static {
        ButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private ButtonType(String str, int i11) {
    }

    @m80.k
    public static m00.a<ButtonType> getEntries() {
        return $ENTRIES;
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
