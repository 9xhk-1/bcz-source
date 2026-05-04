package com.baicizhan.app.api.service.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class BookLanguageType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BookLanguageType[] $VALUES;
    public static final BookLanguageType English = new BookLanguageType("English", 0);
    public static final BookLanguageType Japanese = new BookLanguageType("Japanese", 1);
    public static final BookLanguageType French = new BookLanguageType("French", 2);
    public static final BookLanguageType Spanish = new BookLanguageType("Spanish", 3);
    public static final BookLanguageType Korean = new BookLanguageType("Korean", 4);
    public static final BookLanguageType German = new BookLanguageType("German", 5);
    public static final BookLanguageType Russian = new BookLanguageType("Russian", 6);
    public static final BookLanguageType Cantonese = new BookLanguageType("Cantonese", 7);

    private static final /* synthetic */ BookLanguageType[] $values() {
        return new BookLanguageType[]{English, Japanese, French, Spanish, Korean, German, Russian, Cantonese};
    }

    static {
        BookLanguageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private BookLanguageType(String str, int i11) {
    }

    @k
    public static a<BookLanguageType> getEntries() {
        return $ENTRIES;
    }

    public static BookLanguageType valueOf(String str) {
        return (BookLanguageType) Enum.valueOf(BookLanguageType.class, str);
    }

    public static BookLanguageType[] values() {
        return (BookLanguageType[]) $VALUES.clone();
    }
}
