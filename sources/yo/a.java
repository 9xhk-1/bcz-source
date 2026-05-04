package yo;

import com.huawei.hms.iap.entity.OrderStatusCode;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100234a = "UTC";

    /* renamed from: b, reason: collision with root package name */
    public static final TimeZone f100235b = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    public static String b(Date date) {
        return d(date, false, f100235b);
    }

    public static String c(Date date, boolean z11) {
        return d(date, z11, f100235b);
    }

    public static String d(Date date, boolean z11, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z11 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        f(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        f(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        f(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        f(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        f(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        f(sb2, gregorianCalendar.get(13), 2);
        if (z11) {
            sb2.append('.');
            f(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / OrderStatusCode.ORDER_STATE_CANCEL;
            int abs = Math.abs(i11 / 60);
            int abs2 = Math.abs(i11 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            f(sb2, abs, 2);
            sb2.append(':');
            f(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public static int e(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (charAt < '0' || charAt > '9') {
                return i11;
            }
            i11++;
        }
        return str.length();
    }

    public static void f(StringBuilder sb2, int i11, int i12) {
        String num = Integer.toString(i11);
        for (int length = i12 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005e, B:20:0x006e, B:21:0x0070, B:23:0x007c, B:24:0x007f, B:26:0x0085, B:30:0x008f, B:35:0x009f, B:37:0x00a7, B:42:0x00dc, B:44:0x00e2, B:46:0x00e8, B:47:0x0195, B:52:0x00f2, B:53:0x010d, B:54:0x010e, B:57:0x012a, B:59:0x0137, B:62:0x0140, B:64:0x015f, B:67:0x016e, B:68:0x0190, B:70:0x0193, B:71:0x0119, B:72:0x01c6, B:73:0x01cd, B:74:0x00bf, B:75:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6 A[Catch: IllegalArgumentException -> 0x004e, NumberFormatException -> 0x0051, IndexOutOfBoundsException -> 0x0054, TryCatch #2 {IndexOutOfBoundsException -> 0x0054, NumberFormatException -> 0x0051, IllegalArgumentException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x005e, B:20:0x006e, B:21:0x0070, B:23:0x007c, B:24:0x007f, B:26:0x0085, B:30:0x008f, B:35:0x009f, B:37:0x00a7, B:42:0x00dc, B:44:0x00e2, B:46:0x00e8, B:47:0x0195, B:52:0x00f2, B:53:0x010d, B:54:0x010e, B:57:0x012a, B:59:0x0137, B:62:0x0140, B:64:0x015f, B:67:0x016e, B:68:0x0190, B:70:0x0193, B:71:0x0119, B:72:0x01c6, B:73:0x01cd, B:74:0x00bf, B:75:0x00c2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date g(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.a.g(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int h(String str, int i11, int i12) throws NumberFormatException {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int digit = Character.digit(str.charAt(i11), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = -digit;
        } else {
            i13 = 0;
            i14 = i11;
        }
        while (i14 < i12) {
            int i15 = i14 + 1;
            int digit2 = Character.digit(str.charAt(i14), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = (i13 * 10) - digit2;
            i14 = i15;
        }
        return -i13;
    }
}
