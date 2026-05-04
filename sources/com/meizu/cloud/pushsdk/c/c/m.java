package com.meizu.cloud.pushsdk.c.c;

import java.io.Closeable;
import java.net.IDN;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f39622a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f39623b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f39624c = Charset.forName("UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f39625d = TimeZone.getTimeZone("GMT");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f39626e = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static int a(String str, int i11, int i12) {
        while (i11 < i12) {
            char charAt = str.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int b(String str, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            char charAt = str.charAt(i13);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i13 + 1;
            }
        }
        return i11;
    }

    public static int a(String str, int i11, int i12, char c11) {
        while (i11 < i12) {
            if (str.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    private static boolean b(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int a(String str, int i11, int i12, String str2) {
        while (i11 < i12) {
            if (str2.indexOf(str.charAt(i11)) != -1) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static String a(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (b(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void a(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }
}
