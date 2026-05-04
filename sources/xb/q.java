package xb;

import android.annotation.SuppressLint;
import android.graphics.Color;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes4.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static SimpleDateFormat f97984a = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    /* renamed from: b, reason: collision with root package name */
    public static SimpleDateFormat f97985b = new SimpleDateFormat("yyyy年");

    /* renamed from: c, reason: collision with root package name */
    public static SimpleDateFormat f97986c = new SimpleDateFormat("HH:mm");

    /* renamed from: d, reason: collision with root package name */
    public static SimpleDateFormat f97987d = new SimpleDateFormat("M月d日");

    /* renamed from: e, reason: collision with root package name */
    public static SimpleDateFormat f97988e = new SimpleDateFormat("M月d日 HH:mm");

    /* renamed from: f, reason: collision with root package name */
    public static SimpleDateFormat f97989f = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: g, reason: collision with root package name */
    public static SimpleDateFormat f97990g = new SimpleDateFormat("MM-dd");

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f97991h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f97992i = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: j, reason: collision with root package name */
    public static byte[] f97993j = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, -1, -1, -1, -1, -1, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32, 33, 34, 35, 36, s60.e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static String A(long time) {
        String format;
        Date date = new Date(time);
        synchronized (f97984a) {
            format = f97984a.format(date);
        }
        return format;
    }

    public static String B(Calendar tObj) {
        if (tObj == null) {
            return "";
        }
        String D = D(tObj);
        return D != null ? D : n(tObj.getTime());
    }

    public static String C(Calendar tObj) {
        String format;
        if (tObj == null) {
            return "";
        }
        String D = D(tObj);
        if (D != null) {
            return D;
        }
        synchronized (f97990g) {
            format = f97990g.format(tObj);
        }
        return format;
    }

    public static String D(Calendar tObj) {
        Calendar calendar = Calendar.getInstance();
        int s11 = s(calendar) - s(tObj);
        long time = calendar.getTime().getTime() - tObj.getTime().getTime();
        if (time < 30000) {
            return "刚刚";
        }
        if (time < 60000) {
            return "半分钟前";
        }
        if (time < 3600000) {
            return String.valueOf((time * 60) / 3600000) + "分钟前";
        }
        if (time < 86400000) {
            return s11 == 0 ? o(tObj.getTime()) : "1天前";
        }
        if (time >= 2678400000L) {
            if (time < 2764800000L) {
                return "1个月前";
            }
            return null;
        }
        return String.valueOf((time * 31) / 2678400000L) + "天前";
    }

    public static String E(String s11) {
        try {
            return URLDecoder.decode(s11, "utf-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static String F(String s11) {
        if (s11 == null) {
            return null;
        }
        try {
            return URLEncoder.encode(s11, "utf-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static String G(int week) {
        switch (week) {
            case 1:
                return "周日";
            case 2:
                return "周一";
            case 3:
                return "周二";
            case 4:
                return "周三";
            case 5:
                return "周四";
            case 6:
                return "周五";
            case 7:
                return "周六";
            default:
                return "";
        }
    }

    public static final int H(Calendar calendar) {
        return calendar.get(1) - 1900;
    }

    public static boolean I(String account) {
        if (!Pattern.compile("^[\\u4E00-\\u9FA5\\uF900-\\uFA2D\\w]+$").matcher(account).matches()) {
            return false;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < account.length(); i12++) {
            i11 = String.valueOf(account.charAt(i12)).getBytes().length == 1 ? i11 + 1 : i11 + 2;
        }
        return i11 > 0 && i11 <= 14;
    }

    public static boolean J(char c11) {
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(c11);
        return of2 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of2 == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of2 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of2 == Character.UnicodeBlock.GENERAL_PUNCTUATION || of2 == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of2 == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }

    public static boolean K(String s11) {
        return s11 == null || s11.length() == 0 || s11.equals("null");
    }

    public static boolean L(String name) {
        return name != null && name.length() > 0;
    }

    public static boolean M(String phone) {
        return Pattern.compile("1\\d{10}").matcher(phone).matches();
    }

    public static boolean N(String password) {
        int length = password.length();
        return length >= 6 && length <= 14 && password.getBytes().length <= length;
    }

    public static String O(List<Object> obj, String seperator) {
        if (obj == null || obj.size() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < obj.size(); i11++) {
            if (i11 > 0) {
                stringBuffer.append(seperator);
            }
            if (obj.get(i11) != null) {
                stringBuffer.append(obj.get(i11).toString());
            }
        }
        return stringBuffer.toString();
    }

    public static long[] P(String ver) {
        long[] jArr = new long[3];
        if (ver != null) {
            String[] split = ver.replace(".", "#").split("#");
            jArr[0] = Long.parseLong(split[0]);
            jArr[1] = Long.parseLong(split[1]);
            jArr[2] = Long.parseLong(split[2]);
        }
        return jArr;
    }

    public static String Q(byte[] b11) {
        if (b11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(b11.length * 2);
        for (int i11 = 0; i11 < b11.length; i11++) {
            char[] cArr = f97991h;
            sb2.append(cArr[(b11[i11] & 240) >>> 4]);
            sb2.append(cArr[b11[i11] & 15]);
        }
        return sb2.toString();
    }

    public static boolean a(String str) {
        if (str != null && str.length() >= 1) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                if (J(str.charAt(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String b(Calendar tObj) {
        if (tObj == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        return H(calendar) == H(tObj) ? (x(calendar) == x(tObj) && m(calendar) == m(tObj)) ? o(tObj.getTime()) : q(tObj.getTime()) : r(tObj.getTime());
    }

    public static String c(Calendar tObj) {
        if (tObj == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        return (x(calendar) == x(tObj) && m(calendar) == m(tObj)) ? o(tObj.getTime()) : n(tObj.getTime());
    }

    public static String d(String str) throws PatternSyntaxException {
        return Pattern.compile("[/\\:*?<>|\"\n\t]").matcher(str).replaceAll("").trim();
    }

    public static String e(InputStream in2) {
        if (in2 == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = in2.read(bArr);
                if (read <= 0) {
                    in2.close();
                    return Q(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f(String str) {
        try {
            return e(new ByteArrayInputStream(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r2 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r1.write(r2 | ((r5 & 3) << 6));
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] g(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L87
        Ld:
            byte[] r3 = xb.q.f97993j
            int r4 = r2 + 1
            r2 = r8[r2]
            r2 = r3[r2]
            r3 = -1
            if (r4 >= r0) goto L1d
            if (r2 == r3) goto L1b
            goto L1d
        L1b:
            r2 = r4
            goto Ld
        L1d:
            if (r2 != r3) goto L21
            goto L87
        L21:
            byte[] r5 = xb.q.f97993j
            int r6 = r4 + 1
            r4 = r8[r4]
            r4 = r5[r4]
            if (r6 >= r0) goto L30
            if (r4 == r3) goto L2e
            goto L30
        L2e:
            r4 = r6
            goto L21
        L30:
            if (r4 != r3) goto L33
            goto L87
        L33:
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)
        L3d:
            int r2 = r6 + 1
            r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L4a
            byte[] r8 = r1.toByteArray()
            return r8
        L4a:
            byte[] r7 = xb.q.f97993j
            r5 = r7[r5]
            if (r2 >= r0) goto L55
            if (r5 == r3) goto L53
            goto L55
        L53:
            r6 = r2
            goto L3d
        L55:
            if (r5 != r3) goto L58
            goto L87
        L58:
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)
        L64:
            int r4 = r2 + 1
            r2 = r8[r2]
            if (r2 != r6) goto L6f
            byte[] r8 = r1.toByteArray()
            return r8
        L6f:
            byte[] r7 = xb.q.f97993j
            r2 = r7[r2]
            if (r4 >= r0) goto L7a
            if (r2 == r3) goto L78
            goto L7a
        L78:
            r2 = r4
            goto L64
        L7a:
            if (r2 != r3) goto L7d
            goto L87
        L7d:
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto Lb
        L87:
            byte[] r8 = r1.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.q.g(java.lang.String):byte[]");
    }

    public static String h(byte[] data) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = data.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            int i12 = i11 + 1;
            byte b11 = data[i11];
            int i13 = b11 & 255;
            if (i12 == length) {
                char[] cArr = f97992i;
                stringBuffer.append(cArr[i13 >>> 2]);
                stringBuffer.append(cArr[(b11 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i14 = i11 + 2;
            byte b12 = data[i12];
            if (i14 == length) {
                char[] cArr2 = f97992i;
                stringBuffer.append(cArr2[i13 >>> 2]);
                stringBuffer.append(cArr2[((b11 & 3) << 4) | ((b12 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(b12 & 15) << 2]);
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                break;
            }
            i11 += 3;
            byte b13 = data[i14];
            char[] cArr3 = f97992i;
            stringBuffer.append(cArr3[i13 >>> 2]);
            stringBuffer.append(cArr3[((b11 & 3) << 4) | ((b12 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((b12 & 15) << 2) | ((b13 & com.baicizhan.main.vld.bonding.j.f25378c) >>> 6)]);
            stringBuffer.append(cArr3[b13 & 63]);
        }
        return stringBuffer.toString();
    }

    public static int i(String string) {
        int i11 = 0;
        for (int i12 = 0; i12 < string.length(); i12++) {
            i11 = Integer.toHexString(string.charAt(i12)).length() == 4 ? i11 + 2 : i11 + 1;
        }
        return i11;
    }

    public static int j(String ver1, String ver2) {
        if (ver1 == null) {
            return -1;
        }
        if (ver2 == null) {
            return 1;
        }
        long[] P = P(ver1);
        long[] P2 = P(ver2);
        long j11 = 0;
        long j12 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            j12 += P[i11] << (24 - (i11 * 8));
        }
        for (int i12 = 0; i12 < 3; i12++) {
            j11 += P2[i12] << (24 - (i12 * 8));
        }
        if (j12 > j11) {
            return 1;
        }
        return j12 == j11 ? 0 : -1;
    }

    public static String k(String string, int length) {
        if (string == null || length <= 0) {
            return "";
        }
        int length2 = string.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length2) {
            i12 = J(string.charAt(i11)) ? i12 + 2 : i12 + 1;
            if (i12 >= length) {
                break;
            }
            i11++;
        }
        if (i11 >= length2) {
            return string;
        }
        return string.substring(0, i11 + 1) + "...";
    }

    public static String l() {
        String format;
        Date date = new Date();
        synchronized (f97984a) {
            format = f97984a.format(date);
        }
        return format;
    }

    public static final int m(Calendar calendar) {
        return calendar.get(5);
    }

    public static String n(Date date) {
        String format;
        synchronized (f97989f) {
            format = f97989f.format(date);
        }
        return format;
    }

    public static String o(Date date) {
        String format;
        synchronized (f97986c) {
            format = f97986c.format(date);
        }
        return format;
    }

    public static String p(Date date) {
        String format;
        synchronized (f97988e) {
            format = f97988e.format(date);
        }
        return format;
    }

    public static String q(Date date) {
        String format;
        synchronized (f97987d) {
            format = f97987d.format(date);
        }
        return format;
    }

    public static String r(Date date) {
        String format;
        synchronized (f97985b) {
            format = f97985b.format(date);
        }
        return format;
    }

    public static final int s(Calendar calendar) {
        return calendar.get(7);
    }

    public static String t(String src, Color color) {
        if (src == null) {
            return "";
        }
        String str = null;
        try {
            str = src.replaceAll("<em>", "<font color='#007bd1'>");
            return str.replaceAll("</em>", "</font>");
        } catch (Exception unused) {
            return str;
        }
    }

    public static String u(int hour) {
        String valueOf;
        if (hour < 10) {
            valueOf = "0" + hour;
        } else {
            valueOf = String.valueOf(hour);
        }
        return ((hour < 0 || hour >= 6) ? (hour < 6 || hour >= 9) ? (hour < 9 || hour >= 12) ? (hour < 12 || hour >= 14) ? (hour < 14 || hour >= 18) ? (hour < 18 || hour >= 24) ? "" : "晚上" : "下午" : "中午" : "上午" : "早晨" : "凌晨") + valueOf;
    }

    public static String v(long tarTime, long nowTime) {
        long currentTimeMillis = nowTime == 0 ? System.currentTimeMillis() / 1000 : nowTime;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(tarTime * 1000);
        int i11 = calendar.get(1);
        int i12 = calendar.get(2) + 1;
        int i13 = calendar.get(5);
        int i14 = calendar.get(11);
        int i15 = calendar.get(12);
        int i16 = calendar.get(3);
        int i17 = calendar.get(7);
        calendar.setTimeInMillis(1000 * currentTimeMillis);
        int i18 = calendar.get(1);
        int i19 = calendar.get(2) + 1;
        int i21 = calendar.get(5);
        int i22 = calendar.get(3);
        String u11 = u(i14);
        String w11 = w(i15);
        if (tarTime > currentTimeMillis) {
            if (i13 == i21) {
                return u11 + ":" + w11;
            }
            return i12 + "月" + i13 + "日 " + u11 + ":" + w11;
        }
        if (i11 < i18) {
            return i11 + "年" + i12 + "月" + i13 + "日 " + u11 + ":" + w11;
        }
        if (i12 < i19) {
            return i12 + "月" + i13 + "日 " + u11 + ":" + w11;
        }
        if (i13 >= i21) {
            return u11 + ":" + w11;
        }
        if (i16 >= i22) {
            return G(i17) + " " + u11 + ":" + w11;
        }
        return i12 + "月" + i13 + "日 " + u11 + ":" + w11;
    }

    public static String w(int minute) {
        if (minute >= 10) {
            return String.valueOf(minute);
        }
        return "0" + minute;
    }

    public static final int x(Calendar calendar) {
        return calendar.get(2);
    }

    public static String y(String url) {
        try {
            int lastIndexOf = url.lastIndexOf("/");
            int lastIndexOf2 = url.lastIndexOf(".");
            return lastIndexOf == -1 ? url : lastIndexOf < lastIndexOf2 ? url.substring(lastIndexOf, lastIndexOf2) : url.substring(lastIndexOf);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String z(String url) {
        return f(url);
    }
}
