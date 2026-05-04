package io.ktor.http;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class CookieEncoding {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CookieEncoding[] $VALUES;
    public static final CookieEncoding RAW = new CookieEncoding("RAW", 0);
    public static final CookieEncoding DQUOTES = new CookieEncoding("DQUOTES", 1);
    public static final CookieEncoding URI_ENCODING = new CookieEncoding("URI_ENCODING", 2);
    public static final CookieEncoding BASE64_ENCODING = new CookieEncoding("BASE64_ENCODING", 3);

    private static final /* synthetic */ CookieEncoding[] $values() {
        return new CookieEncoding[]{RAW, DQUOTES, URI_ENCODING, BASE64_ENCODING};
    }

    static {
        CookieEncoding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private CookieEncoding(String str, int i11) {
    }

    @k
    public static a<CookieEncoding> getEntries() {
        return $ENTRIES;
    }

    public static CookieEncoding valueOf(String str) {
        return (CookieEncoding) Enum.valueOf(CookieEncoding.class, str);
    }

    public static CookieEncoding[] values() {
        return (CookieEncoding[]) $VALUES.clone();
    }
}
