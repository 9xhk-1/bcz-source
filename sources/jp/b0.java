package jp;

import com.google.zxing.client.result.ParsedResultType;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b0 extends q {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f64500d = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: b, reason: collision with root package name */
    public final String f64501b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64502c;

    public b0(String str, String str2) {
        super(ParsedResultType.URI);
        this.f64501b = i(str);
        this.f64502c = str2;
    }

    public static boolean g(String str, int i11) {
        int i12 = i11 + 1;
        int indexOf = str.indexOf(47, i12);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return t.e(str, i12, indexOf - i12);
    }

    public static String i(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        return (indexOf < 0 || g(trim, indexOf)) ? "http://".concat(trim) : trim;
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(30);
        q.c(this.f64502c, sb2);
        q.c(this.f64501b, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f64502c;
    }

    public String f() {
        return this.f64501b;
    }

    public boolean h() {
        return f64500d.matcher(this.f64501b).find();
    }
}
