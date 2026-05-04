package com.baicizhan.client.business.webview;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class UiColorEnum {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ UiColorEnum[] $VALUES;
    public static final UiColorEnum BLACK = new UiColorEnum("BLACK", 0, "black");
    public static final UiColorEnum WHITE = new UiColorEnum("WHITE", 1, "white");

    @k
    private final String value;

    private static final /* synthetic */ UiColorEnum[] $values() {
        return new UiColorEnum[]{BLACK, WHITE};
    }

    static {
        UiColorEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private UiColorEnum(String str, int i11, String str2) {
        this.value = str2;
    }

    @k
    public static m00.a<UiColorEnum> getEntries() {
        return $ENTRIES;
    }

    public static UiColorEnum valueOf(String str) {
        return (UiColorEnum) Enum.valueOf(UiColorEnum.class, str);
    }

    public static UiColorEnum[] values() {
        return (UiColorEnum[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
