package com.baicizhan.app.biz.game.repo.userresource;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class LanguageType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LanguageType[] $VALUES;
    public static final LanguageType En = new LanguageType("En", 0);
    public static final LanguageType Jp = new LanguageType("Jp", 1);

    private static final /* synthetic */ LanguageType[] $values() {
        return new LanguageType[]{En, Jp};
    }

    static {
        LanguageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LanguageType(String str, int i11) {
    }

    @k
    public static a<LanguageType> getEntries() {
        return $ENTRIES;
    }

    public static LanguageType valueOf(String str) {
        return (LanguageType) Enum.valueOf(LanguageType.class, str);
    }

    public static LanguageType[] values() {
        return (LanguageType[]) $VALUES.clone();
    }
}
