package com.baicizhan.app.api;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class AppType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppType[] $VALUES;
    public static final AppType BCZ = new AppType("BCZ", 0);

    private static final /* synthetic */ AppType[] $values() {
        return new AppType[]{BCZ};
    }

    static {
        AppType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AppType(String str, int i11) {
    }

    @k
    public static a<AppType> getEntries() {
        return $ENTRIES;
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) $VALUES.clone();
    }
}
