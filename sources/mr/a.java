package mr;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f73668a = "Anonymizer";

    public static String a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.length() <= 1 ? "*" : str.length() < 8 ? d(str, 0, 1) : d(str, 0, 4);
    }

    public static String b(String str) {
        return (str == null || str.length() <= 0) ? "" : str.length() <= 2 ? b.b(str, '*') : (str.length() < 11 || str.length() >= 20) ? d(str, 6, 4) : d(str, 4, 4);
    }

    public static String c(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (str.length() <= 4) {
            return b.b(str, '*');
        }
        String[] f11 = b.f(str, 4);
        return b.d("", b.e(f11, 0), b.c(b.e(f11, 1), "0123456789", "*"));
    }

    public static String d(String str, int i11, int i12) {
        int length;
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (str.length() <= i11 + i12) {
            length = str.length() - 1;
            i11 = 1;
        } else {
            length = str.length() - i12;
        }
        String[] g11 = b.g(str, i11, length);
        return b.d("", b.e(g11, 0), b.b(b.e(g11, 1), '*'), b.e(g11, 2));
    }

    public static String e(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (str.length() <= 1) {
            return "*";
        }
        int indexOf = str.indexOf(64);
        if (indexOf < 0) {
            String[] f11 = b.f(str, 1);
            return b.d("", b.e(f11, 0), b.b(b.e(f11, 1), '*'));
        }
        String[] h11 = b.h(str, indexOf, indexOf + 1, str.lastIndexOf(46));
        return b.d("", b.b(b.e(h11, 0), '*'), b.e(h11, 1), b.b(b.e(h11, 2), '*'), b.e(h11, 3));
    }

    public static String f(String str) {
        return (str == null || str.length() <= 0) ? "" : d(str, str.length() - 12, 0);
    }

    public static String g(String str) {
        return (str == null || str.length() <= 0) ? "" : d(str, str.length() - 4, 0);
    }

    public static String h(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return b.b(str, '*');
        }
        String[] f11 = b.f(str, lastIndexOf + 1);
        return b.d("", b.e(f11, 0), b.b(b.e(f11, 1), '*'));
    }

    public static String i(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        String[] l11 = b.l(str, ':');
        if (l11.length <= 1) {
            return b.b(str, '*');
        }
        if (l11.length != 8) {
            String[] f11 = b.f(str, str.indexOf(58) + 1);
            return b.d("", b.e(f11, 0), b.c(b.e(f11, 1), "0123456789ABCDEFabcdef", "*"));
        }
        l11[2] = j(l11[2]);
        for (int i11 = 3; i11 < l11.length; i11++) {
            l11[i11] = b.b(l11[i11], '*');
        }
        return b.d(":", l11);
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(f73668a, "maskLower8Bit: s is null");
            return "";
        }
        if (str.length() <= 2) {
            return b.b(str, '*');
        }
        String[] f11 = b.f(str, str.length() - 2);
        return b.d("", b.e(f11, 0), b.b(b.e(f11, 1), '*'));
    }

    public static String k(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int a11 = b.a(str, '-', 2);
        if (a11 < 0) {
            return b.c(str, "0123456789ABCDEFabcdef", "*");
        }
        String[] f11 = b.f(str, a11);
        return b.d("", b.e(f11, 0), b.c(b.e(f11, 1), "0123456789ABCDEFabcdef", "*"));
    }

    public static String l(String str) {
        return (str == null || str.length() <= 0) ? "" : str.length() <= 1 ? "*" : d(str, 1, 0);
    }

    public static String m(String str) {
        return (str == null || str.length() <= 0) ? "" : str.length() <= 2 ? b.b(str, '*') : (str.length() < 8 || str.length() >= 11) ? d(str, 3, 4) : d(str, 2, 2);
    }
}
