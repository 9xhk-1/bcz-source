package jp;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e0 extends t {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f64521f = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f64522g = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f64523h = Pattern.compile("\r\n[ \t]");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f64524i = Pattern.compile("\\\\[nN]");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f64525j = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f64526k = Pattern.compile(ContainerUtils.KEY_VALUE_DELIMITER);

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f64527l = Pattern.compile(com.alipay.sdk.m.u.i.f11097b);

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f64528m = Pattern.compile("(?<!\\\\);+");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f64529n = Pattern.compile(",");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f64530o = Pattern.compile("[;,]");

    public static String[] A(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str2 = list.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i11 = 1;
                while (true) {
                    if (i11 >= list.size()) {
                        str = null;
                        break;
                    }
                    str = list.get(i11);
                    int indexOf = str.indexOf(61);
                    if (indexOf < 0) {
                        break;
                    }
                    if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    }
                    i11++;
                }
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String q(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (i11 < length) {
            char charAt2 = charSequence.charAt(i11);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    w(byteArrayOutputStream, str, sb2);
                    sb2.append(charAt2);
                } else if (i11 < length - 2 && (charAt = charSequence.charAt(i11 + 1)) != '\r' && charAt != '\n') {
                    i11 += 2;
                    char charAt3 = charSequence.charAt(i11);
                    int l11 = t.l(charAt);
                    int l12 = t.l(charAt3);
                    if (l11 >= 0 && l12 >= 0) {
                        byteArrayOutputStream.write((l11 << 4) + l12);
                    }
                }
            }
            i11++;
        }
        w(byteArrayOutputStream, str, sb2);
        return sb2.toString();
    }

    public static void r(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i11 = 0;
                int i12 = 0;
                while (i11 < 4 && (indexOf = str.indexOf(59, i12)) >= 0) {
                    strArr[i11] = str.substring(i12, indexOf);
                    i11++;
                    i12 = indexOf + 1;
                }
                strArr[i11] = str.substring(i12);
                StringBuilder sb2 = new StringBuilder(100);
                v(strArr, 3, sb2);
                v(strArr, 1, sb2);
                v(strArr, 2, sb2);
                v(strArr, 0, sb2);
                v(strArr, 4, sb2);
                list.set(0, sb2.toString().trim());
            }
        }
    }

    public static boolean s(CharSequence charSequence) {
        return charSequence == null || f64522g.matcher(charSequence).matches();
    }

    public static List<String> t(CharSequence charSequence, String str, boolean z11, boolean z12) {
        List<List<String>> u11 = u(charSequence, str, z11, z12);
        if (u11 == null || u11.isEmpty()) {
            return null;
        }
        return u11.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e9, code lost:
    
        r4 = r1;
        r3 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.util.List<java.lang.String>> u(java.lang.CharSequence r18, java.lang.String r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.e0.u(java.lang.CharSequence, java.lang.String, boolean, boolean):java.util.List");
    }

    public static void v(String[] strArr, int i11, StringBuilder sb2) {
        String str = strArr[i11];
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append(' ');
        }
        sb2.append(strArr[i11]);
    }

    public static void w(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }

    public static String y(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String[] z(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<List<String>> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // jp.t
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.k kVar) {
        String c11 = t.c(kVar);
        Matcher matcher = f64521f.matcher(c11);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> u11 = u("FN", c11, true, false);
        if (u11 == null) {
            u11 = u("N", c11, true, false);
            r(u11);
        }
        List<String> t11 = t("NICKNAME", c11, true, false);
        String[] split = t11 == null ? null : f64529n.split(t11.get(0));
        List<List<String>> u12 = u("TEL", c11, true, false);
        List<List<String>> u13 = u(CommonConstant.RETKEY.EMAIL, c11, true, false);
        List<String> t12 = t("NOTE", c11, false, false);
        List<List<String>> u14 = u("ADR", c11, true, true);
        List<String> t13 = t("ORG", c11, true, true);
        List<String> t14 = t("BDAY", c11, true, false);
        if (t14 != null && !s(t14.get(0))) {
            t14 = null;
        }
        List<String> t15 = t("TITLE", c11, true, false);
        List<List<String>> u15 = u("URL", c11, true, false);
        List<String> t16 = t("IMPP", c11, true, false);
        List<String> t17 = t("GEO", c11, true, false);
        String[] split2 = t17 == null ? null : f64530o.split(t17.get(0));
        return new d(z(u11), split, null, z(u12), A(u12), z(u13), A(u13), y(t16), y(t12), z(u14), A(u14), y(t13), y(t14), y(t15), z(u15), (split2 == null || split2.length == 2) ? split2 : null);
    }
}
