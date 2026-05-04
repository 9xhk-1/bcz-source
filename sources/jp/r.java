package jp;

import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class r extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String f64595b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64596c;

    public r(String str) {
        this(str, str);
    }

    @Override // jp.q
    public String a() {
        return this.f64595b;
    }

    public String e() {
        return this.f64596c;
    }

    public String f() {
        return this.f64595b;
    }

    public r(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.f64595b = str;
        this.f64596c = str2;
    }
}
