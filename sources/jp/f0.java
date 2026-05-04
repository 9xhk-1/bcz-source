package jp;

import androidx.core.net.MailTo;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f0 extends t {
    public static String q(CharSequence charSequence, String str, boolean z11) {
        List<String> t11 = e0.t(charSequence, str, z11, false);
        if (t11 == null || t11.isEmpty()) {
            return null;
        }
        return t11.get(0);
    }

    public static String[] r(CharSequence charSequence, String str, boolean z11) {
        List<List<String>> u11 = e0.u(charSequence, str, z11, false);
        if (u11 == null || u11.isEmpty()) {
            return null;
        }
        int size = u11.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = u11.get(i11).get(0);
        }
        return strArr;
    }

    public static String t(String str) {
        return str != null ? (str.startsWith(MailTo.MAILTO_SCHEME) || str.startsWith("MAILTO:")) ? str.substring(7) : str : str;
    }

    @Override // jp.t
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public g k(com.google.zxing.k kVar) {
        double parseDouble;
        double parseDouble2;
        String c11 = t.c(kVar);
        if (c11.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String q11 = q("SUMMARY", c11, true);
        String q12 = q("DTSTART", c11, true);
        if (q12 == null) {
            return null;
        }
        String q13 = q("DTEND", c11, true);
        String q14 = q("DURATION", c11, true);
        String q15 = q("LOCATION", c11, true);
        String t11 = t(q("ORGANIZER", c11, true));
        String[] r11 = r("ATTENDEE", c11, true);
        if (r11 != null) {
            for (int i11 = 0; i11 < r11.length; i11++) {
                r11[i11] = t(r11[i11]);
            }
        }
        String q16 = q("DESCRIPTION", c11, true);
        String q17 = q("GEO", c11, true);
        if (q17 == null) {
            parseDouble = Double.NaN;
            parseDouble2 = Double.NaN;
        } else {
            int indexOf = q17.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                parseDouble = Double.parseDouble(q17.substring(0, indexOf));
                parseDouble2 = Double.parseDouble(q17.substring(indexOf + 1));
            } catch (NumberFormatException | IllegalArgumentException unused) {
                return null;
            }
        }
        return new g(q11, q12, q13, q14, q15, t11, r11, q16, parseDouble, parseDouble2);
    }
}
