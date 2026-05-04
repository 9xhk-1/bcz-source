package jp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n extends t {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f64592f = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // jp.t
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public m k(com.google.zxing.k kVar) {
        Matcher matcher = f64592f.matcher(t.c(kVar));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d && parseDouble >= -90.0d) {
                double parseDouble2 = Double.parseDouble(matcher.group(2));
                if (parseDouble2 <= 180.0d && parseDouble2 >= -180.0d) {
                    double d11 = 0.0d;
                    if (matcher.group(3) != null) {
                        double parseDouble3 = Double.parseDouble(matcher.group(3));
                        if (parseDouble3 < 0.0d) {
                            return null;
                        }
                        d11 = parseDouble3;
                    }
                    return new m(parseDouble, parseDouble2, d11, group);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
