package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class q {
    public static String a(String str, String str2) throws ConfigException {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (char c11 : str.substring(str2.length(), str.length()).toCharArray()) {
            if (c11 == '_') {
                i11++;
            } else {
                if (i11 > 0 && i11 < 4) {
                    sb2.append(n(i11));
                } else if (i11 > 3) {
                    throw new ConfigException.BadPath(str, "Environment variable contains an un-mapped number of underscores.");
                }
                sb2.append(c11);
                i11 = 0;
            }
        }
        if (i11 > 0 && i11 < 4) {
            sb2.append(n(i11));
        } else if (i11 > 3) {
            throw new ConfigException.BadPath(str, "Environment variable contains an un-mapped number of underscores.");
        }
        return sb2.toString();
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null && obj2 != null) {
            return false;
        }
        if (obj != null && obj2 == null) {
            return false;
        }
        if (obj == obj2) {
            return true;
        }
        return obj.equals(obj2);
    }

    public static ConfigException c(ExceptionInInitializerError exceptionInInitializerError) {
        Throwable cause = exceptionInInitializerError.getCause();
        if (cause == null) {
            throw exceptionInInitializerError;
        }
        if (cause instanceof ConfigException) {
            return (ConfigException) cause;
        }
        throw exceptionInInitializerError;
    }

    public static boolean d(int i11) {
        return i11 >= 0 && i11 <= 31;
    }

    public static boolean e(int i11) {
        if (i11 == 10 || i11 == 32 || i11 == 160 || i11 == 8199 || i11 == 8239 || i11 == 65279) {
            return true;
        }
        return Character.isWhitespace(i11);
    }

    public static String f(List<String> list) {
        return g((String[]) list.toArray(new String[0]));
    }

    public static String g(String... strArr) {
        return new s0(strArr).k();
    }

    public static ju.m h(ObjectInputStream objectInputStream) throws IOException {
        return c1.X0(objectInputStream, null);
    }

    public static String i(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\f') {
                sb2.append("\\f");
            } else if (charAt == '\r') {
                sb2.append("\\r");
            } else if (charAt == '\"') {
                sb2.append("\\\"");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        if (d(charAt)) {
                            sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            sb2.append(charAt);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append('\"');
        return sb2.toString();
    }

    public static String j(String str) {
        if (str.length() == 0) {
            return i(str);
        }
        int codePointAt = str.codePointAt(0);
        if (Character.isDigit(codePointAt) || codePointAt == 45) {
            return i(str);
        }
        if (str.startsWith("include") || str.startsWith(n6.m.f74525c) || str.startsWith("false") || str.startsWith("null") || str.contains(r60.e.f83301a)) {
            return i(str);
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (!Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '-') {
                return i(str);
            }
        }
        return str;
    }

    public static List<String> k(String str) {
        ArrayList arrayList = new ArrayList();
        for (s0 g11 = s0.g(str); g11 != null; g11 = g11.j()) {
            arrayList.add(g11.b());
        }
        return arrayList;
    }

    public static ConfigSyntax l(String str) {
        if (str == null) {
            return null;
        }
        if (str.endsWith(".json")) {
            return ConfigSyntax.JSON;
        }
        if (str.endsWith(".conf")) {
            return ConfigSyntax.CONF;
        }
        if (str.endsWith(".properties")) {
            return ConfigSyntax.PROPERTIES;
        }
        return null;
    }

    public static String m(String str) {
        String[] split = str.split("-+");
        StringBuilder sb2 = new StringBuilder(str.length());
        for (String str2 : split) {
            if (sb2.length() == 0) {
                sb2.append(str2);
            } else {
                sb2.append(str2.substring(0, 1).toUpperCase());
                sb2.append(str2.substring(1));
            }
        }
        return sb2.toString();
    }

    public static char n(int i11) {
        if (i11 == 1) {
            return '.';
        }
        if (i11 != 2) {
            return i11 != 3 ? (char) 0 : '_';
        }
        return '-';
    }

    public static String o(String str) {
        int codePointAt;
        int i11;
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int i12 = 0;
        while (i12 < length) {
            char charAt = str.charAt(i12);
            if (charAt != ' ' && charAt != '\n') {
                int codePointAt2 = str.codePointAt(i12);
                if (!e(codePointAt2)) {
                    break;
                }
                i12 += Character.charCount(codePointAt2);
            } else {
                i12++;
            }
        }
        while (length > i12) {
            int i13 = length - 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 != ' ' && charAt2 != '\n') {
                if (Character.isLowSurrogate(charAt2)) {
                    codePointAt = str.codePointAt(length - 2);
                    i11 = 2;
                } else {
                    codePointAt = str.codePointAt(i13);
                    i11 = 1;
                }
                if (!e(codePointAt)) {
                    break;
                }
                length -= i11;
            } else {
                length--;
            }
        }
        return str.substring(i12, length);
    }

    public static File p(URL url) {
        try {
            return new File(url.toURI());
        } catch (IllegalArgumentException unused) {
            return new File(url.getPath());
        } catch (URISyntaxException unused2) {
            return new File(url.getPath());
        }
    }

    public static void q(ObjectOutputStream objectOutputStream, ju.m mVar) throws IOException {
        c1.e1(new DataOutputStream(objectOutputStream), (x1) mVar, null);
    }
}
