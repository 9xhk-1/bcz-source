package jp;

import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g0 extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String f64545b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64546c;

    /* renamed from: d, reason: collision with root package name */
    public final String f64547d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64548e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64549f;

    /* renamed from: g, reason: collision with root package name */
    public final String f64550g;

    /* renamed from: h, reason: collision with root package name */
    public final int f64551h;

    /* renamed from: i, reason: collision with root package name */
    public final char f64552i;

    /* renamed from: j, reason: collision with root package name */
    public final String f64553j;

    public g0(String str, String str2, String str3, String str4, String str5, String str6, int i11, char c11, String str7) {
        super(ParsedResultType.VIN);
        this.f64545b = str;
        this.f64546c = str2;
        this.f64547d = str3;
        this.f64548e = str4;
        this.f64549f = str5;
        this.f64550g = str6;
        this.f64551h = i11;
        this.f64552i = c11;
        this.f64553j = str7;
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(this.f64546c);
        sb2.append(' ');
        sb2.append(this.f64547d);
        sb2.append(' ');
        sb2.append(this.f64548e);
        sb2.append('\n');
        String str = this.f64549f;
        if (str != null) {
            sb2.append(str);
            sb2.append(' ');
        }
        sb2.append(this.f64551h);
        sb2.append(' ');
        sb2.append(this.f64552i);
        sb2.append(' ');
        sb2.append(this.f64553j);
        sb2.append('\n');
        return sb2.toString();
    }

    public String e() {
        return this.f64549f;
    }

    public int f() {
        return this.f64551h;
    }

    public char g() {
        return this.f64552i;
    }

    public String h() {
        return this.f64553j;
    }

    public String i() {
        return this.f64545b;
    }

    public String j() {
        return this.f64550g;
    }

    public String k() {
        return this.f64547d;
    }

    public String l() {
        return this.f64548e;
    }

    public String m() {
        return this.f64546c;
    }
}
