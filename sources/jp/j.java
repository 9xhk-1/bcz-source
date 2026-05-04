package jp;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j extends a {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f64570f = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    public static boolean s(String str) {
        return str != null && f64570f.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    @Override // jp.t
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public h k(com.google.zxing.k kVar) {
        String[] q11;
        String c11 = t.c(kVar);
        if (!c11.startsWith("MATMSG:") || (q11 = a.q("TO:", c11, true)) == null) {
            return null;
        }
        for (String str : q11) {
            if (!s(str)) {
                return null;
            }
        }
        return new h(q11, null, null, a.r("SUB:", c11, false), a.r("BODY:", c11, false));
    }
}
