package zr;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102827a = "EncodeUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f102828b = {',', '.', '-', '_'};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f102829c = new String[256];

    static {
        for (char c11 = 0; c11 < 255; c11 = (char) (c11 + 1)) {
            if ((c11 < '0' || c11 > '9') && ((c11 < 'A' || c11 > 'Z') && (c11 < 'a' || c11 > 'z'))) {
                f102829c[c11] = f(c11).intern();
            } else {
                f102829c[c11] = null;
            }
        }
    }

    public static Character a(n nVar) {
        nVar.f();
        Character h11 = nVar.h();
        if (h11 == null) {
            nVar.m();
            return null;
        }
        if (h11.charValue() != '\\') {
            nVar.m();
            return null;
        }
        Character h12 = nVar.h();
        if (h12 == null) {
            nVar.m();
            return null;
        }
        if (h12.charValue() == 'b') {
            return '\b';
        }
        if (h12.charValue() == 't') {
            return '\t';
        }
        if (h12.charValue() == 'n') {
            return '\n';
        }
        if (h12.charValue() == 'v') {
            return (char) 11;
        }
        if (h12.charValue() == 'f') {
            return '\f';
        }
        if (h12.charValue() == 'r') {
            return '\r';
        }
        if (h12.charValue() == '\"') {
            return '\"';
        }
        if (h12.charValue() == '\'') {
            return '\'';
        }
        if (h12.charValue() == '\\') {
            return '\\';
        }
        int i11 = 0;
        if (Character.toLowerCase(h12.charValue()) == 'x') {
            StringBuilder sb2 = new StringBuilder();
            while (i11 < 2) {
                Character i12 = nVar.i();
                if (i12 == null) {
                    nVar.m();
                    return null;
                }
                sb2.append(i12);
                i11++;
            }
            try {
                int parseInt = Integer.parseInt(sb2.toString(), 16);
                if (Character.isValidCodePoint(parseInt)) {
                    return Character.valueOf((char) parseInt);
                }
            } catch (NumberFormatException unused) {
                nVar.m();
                return null;
            }
        } else if (Character.toLowerCase(h12.charValue()) == 'u') {
            StringBuilder sb3 = new StringBuilder();
            while (i11 < 4) {
                Character i13 = nVar.i();
                if (i13 == null) {
                    nVar.m();
                    return null;
                }
                sb3.append(i13);
                i11++;
            }
            try {
                int parseInt2 = Integer.parseInt(sb3.toString(), 16);
                if (Character.isValidCodePoint(parseInt2)) {
                    return Character.valueOf((char) parseInt2);
                }
            } catch (NumberFormatException unused2) {
                nVar.m();
                return null;
            }
        } else if (n.g(h12)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(h12);
            Character h13 = nVar.h();
            if (n.g(h13)) {
                sb4.append(h13);
                Character h14 = nVar.h();
                if (n.g(h14)) {
                    sb4.append(h14);
                } else {
                    nVar.a(h14);
                }
            } else {
                nVar.a(h13);
            }
            try {
                int parseInt3 = Integer.parseInt(sb4.toString(), 8);
                if (Character.isValidCodePoint(parseInt3)) {
                    return Character.valueOf((char) parseInt3);
                }
            } catch (NumberFormatException unused3) {
                nVar.m();
                return null;
            }
        }
        return h12;
    }

    public static String b(char c11) {
        return c11 < 255 ? f102829c[c11] : f(c11);
    }

    public static String c(char[] cArr, Character ch2) {
        if (e(ch2.charValue(), cArr)) {
            return "" + ch2;
        }
        if (b(ch2.charValue()) == null) {
            return "" + ch2;
        }
        String hexString = Integer.toHexString(ch2.charValue());
        if (ch2.charValue() < 256) {
            return "\\x" + ChipTextInputComboView.b.f32535b.substring(hexString.length()) + hexString.toUpperCase(Locale.ENGLISH);
        }
        return "\\u" + "0000".substring(hexString.length()) + hexString.toUpperCase(Locale.ENGLISH);
    }

    public static String d(char[] cArr, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            sb2.append(c(cArr, Character.valueOf(str.charAt(i11))));
        }
        return sb2.toString();
    }

    public static boolean e(char c11, char[] cArr) {
        for (char c12 : cArr) {
            if (c11 == c12) {
                return true;
            }
        }
        return false;
    }

    public static String f(char c11) {
        return Integer.toHexString(c11);
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            n nVar = new n(str);
            while (nVar.b()) {
                Character a11 = a(nVar);
                if (a11 != null) {
                    sb2.append(a11);
                } else {
                    sb2.append(nVar.h());
                }
            }
            return sb2.toString();
        } catch (Exception e11) {
            Log.e(f102827a, "decode js: " + e11.getMessage());
            return "";
        }
    }

    public static String h(String str) {
        return i(str, f102828b);
    }

    public static String i(String str, char[] cArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return d(cArr, str);
        } catch (Exception e11) {
            Log.e(f102827a, "encode js: " + e11.getMessage());
            return "";
        }
    }
}
