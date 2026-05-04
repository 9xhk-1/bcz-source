package com.baicizhan.main.activity.lookup;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SearchType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SearchType[] $VALUES;
    public static final SearchType NORMAL = new SearchType("NORMAL", 0);
    public static final SearchType OCR = new SearchType("OCR", 1);

    private static final /* synthetic */ SearchType[] $values() {
        return new SearchType[]{NORMAL, OCR};
    }

    static {
        SearchType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SearchType(String str, int i11) {
    }

    @k
    public static m00.a<SearchType> getEntries() {
        return $ENTRIES;
    }

    public static SearchType valueOf(String str) {
        return (SearchType) Enum.valueOf(SearchType.class, str);
    }

    public static SearchType[] values() {
        return (SearchType[]) $VALUES.clone();
    }
}
