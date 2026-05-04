package jp;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t[] f64597a = {new f(), new c(), new j(), new b(), new e0(), new e(), new f0(), new i(), new x(), new z(), new u(), new w(), new n(), new j0(), new d0(), new c0(), new p(), new s(), new l(), new h0()};

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f64598b = Pattern.compile("\\d+");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f64599c = Pattern.compile("&");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f64600d = Pattern.compile(ContainerUtils.KEY_VALUE_DELIMITER);

    /* renamed from: e, reason: collision with root package name */
    public static final String f64601e = "\ufeff";

    public static void a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f64600d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], p(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static int b(CharSequence charSequence, int i11) {
        int i12 = 0;
        for (int i13 = i11 - 1; i13 >= 0 && charSequence.charAt(i13) == '\\'; i13--) {
            i12++;
        }
        return i12;
    }

    public static String c(com.google.zxing.k kVar) {
        String g11 = kVar.g();
        return g11.startsWith(f64601e) ? g11.substring(1) : g11;
    }

    public static boolean d(CharSequence charSequence, int i11) {
        return charSequence != null && i11 > 0 && i11 == charSequence.length() && f64598b.matcher(charSequence).matches();
    }

    public static boolean e(CharSequence charSequence, int i11, int i12) {
        int i13;
        return charSequence != null && i12 > 0 && charSequence.length() >= (i13 = i12 + i11) && f64598b.matcher(charSequence.subSequence(i11, i13)).matches();
    }

    public static String[] f(String str, String str2, char c11, boolean z11) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i11 = 0;
        while (i11 < length) {
            int indexOf = str2.indexOf(str, i11);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            boolean z12 = true;
            ArrayList arrayList2 = arrayList;
            int i12 = length2;
            while (z12) {
                int indexOf2 = str2.indexOf(c11, i12);
                if (indexOf2 < 0) {
                    i12 = str2.length();
                } else if (b(str2, indexOf2) % 2 != 0) {
                    i12 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String o11 = o(str2.substring(length2, indexOf2));
                    if (z11) {
                        o11 = o11.trim();
                    }
                    if (!o11.isEmpty()) {
                        arrayList2.add(o11);
                    }
                    i12 = indexOf2 + 1;
                }
                z12 = false;
            }
            i11 = i12;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String g(String str, String str2, char c11, boolean z11) {
        String[] f11 = f(str, str2, c11, z11);
        if (f11 == null) {
            return null;
        }
        return f11[0];
    }

    public static void h(String str, StringBuilder sb2) {
        if (str != null) {
            sb2.append('\n');
            sb2.append(str);
        }
    }

    public static void i(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append('\n');
                sb2.append(str);
            }
        }
    }

    public static String[] j(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    public static int l(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'a' && c11 <= 'f') {
            return c11 - 'W';
        }
        if (c11 < 'A' || c11 > 'F') {
            return -1;
        }
        return c11 - '7';
    }

    public static Map<String, String> m(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : f64599c.split(str.substring(indexOf + 1))) {
            a(str2, hashMap);
        }
        return hashMap;
    }

    public static q n(com.google.zxing.k kVar) {
        for (t tVar : f64597a) {
            q k11 = tVar.k(kVar);
            if (k11 != null) {
                return k11;
            }
        }
        return new a0(kVar.g(), null);
    }

    public static String o(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, indexOf);
        boolean z11 = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z11 || charAt != '\\') {
                sb2.append(charAt);
                z11 = false;
            } else {
                z11 = true;
            }
            indexOf++;
        }
        return sb2.toString();
    }

    public static String p(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public abstract q k(com.google.zxing.k kVar);
}
