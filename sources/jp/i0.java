package jp;

import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i0 extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String f64562b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64563c;

    /* renamed from: d, reason: collision with root package name */
    public final String f64564d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f64565e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64566f;

    /* renamed from: g, reason: collision with root package name */
    public final String f64567g;

    /* renamed from: h, reason: collision with root package name */
    public final String f64568h;

    /* renamed from: i, reason: collision with root package name */
    public final String f64569i;

    public i0(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(80);
        q.c(this.f64562b, sb2);
        q.c(this.f64563c, sb2);
        q.c(this.f64564d, sb2);
        q.c(Boolean.toString(this.f64565e), sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f64567g;
    }

    public String f() {
        return this.f64568h;
    }

    public String g() {
        return this.f64566f;
    }

    public String h() {
        return this.f64563c;
    }

    public String i() {
        return this.f64564d;
    }

    public String j() {
        return this.f64569i;
    }

    public String k() {
        return this.f64562b;
    }

    public boolean l() {
        return this.f64565e;
    }

    public i0(String str, String str2, String str3, boolean z11) {
        this(str, str2, str3, z11, null, null, null, null);
    }

    public i0(String str, String str2, String str3, boolean z11, String str4, String str5, String str6, String str7) {
        super(ParsedResultType.WIFI);
        this.f64562b = str2;
        this.f64563c = str;
        this.f64564d = str3;
        this.f64565e = z11;
        this.f64566f = str4;
        this.f64567g = str5;
        this.f64568h = str6;
        this.f64569i = str7;
    }
}
