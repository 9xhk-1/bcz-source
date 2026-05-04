package jp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c0 extends t {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f64503f = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f64504g = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    public static boolean q(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f64503f.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f64504g.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    @Override // jp.t
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public b0 k(com.google.zxing.k kVar) {
        String c11 = t.c(kVar);
        if (c11.startsWith("URL:") || c11.startsWith("URI:")) {
            return new b0(c11.substring(4).trim(), null);
        }
        String trim = c11.trim();
        if (q(trim)) {
            return new b0(trim, null);
        }
        return null;
    }
}
