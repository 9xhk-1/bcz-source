package jp;

import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a0 extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String f64498b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64499c;

    public a0(String str, String str2) {
        super(ParsedResultType.TEXT);
        this.f64498b = str;
        this.f64499c = str2;
    }

    @Override // jp.q
    public String a() {
        return this.f64498b;
    }

    public String e() {
        return this.f64499c;
    }

    public String f() {
        return this.f64498b;
    }
}
