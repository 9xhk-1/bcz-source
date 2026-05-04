package jp;

import androidx.core.net.MailTo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i extends t {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f64561f = Pattern.compile(",");

    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public h k(com.google.zxing.k kVar) {
        String[] strArr;
        String[] strArr2;
        String str;
        String str2;
        String str3;
        String c11 = t.c(kVar);
        if (!c11.startsWith(MailTo.MAILTO_SCHEME) && !c11.startsWith("MAILTO:")) {
            if (j.s(c11)) {
                return new h(c11);
            }
            return null;
        }
        String substring = c11.substring(7);
        int indexOf = substring.indexOf(63);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        try {
            String p11 = t.p(substring);
            String[] split = !p11.isEmpty() ? f64561f.split(p11) : null;
            Map<String, String> m11 = t.m(c11);
            if (m11 != null) {
                if (split == null && (str3 = m11.get("to")) != null) {
                    split = f64561f.split(str3);
                }
                String str4 = m11.get("cc");
                String[] split2 = str4 != null ? f64561f.split(str4) : null;
                String str5 = m11.get("bcc");
                String[] split3 = str5 != null ? f64561f.split(str5) : null;
                String str6 = m11.get("subject");
                str2 = m11.get(TtmlNode.TAG_BODY);
                strArr2 = split3;
                strArr = split2;
                str = str6;
            } else {
                strArr = null;
                strArr2 = null;
                str = null;
                str2 = null;
            }
            return new h(split, strArr, strArr2, str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
