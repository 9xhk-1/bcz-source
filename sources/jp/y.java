package jp;

import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class y extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String f64606b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64607c;

    /* renamed from: d, reason: collision with root package name */
    public final String f64608d;

    public y(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.f64606b = str;
        this.f64607c = str2;
        this.f64608d = str3;
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(20);
        q.c(this.f64606b, sb2);
        q.c(this.f64608d, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f64606b;
    }

    public String f() {
        return this.f64607c;
    }

    public String g() {
        return this.f64608d;
    }
}
