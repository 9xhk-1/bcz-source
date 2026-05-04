package jp;

import com.google.zxing.client.result.ParsedResultType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String[] f64505b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f64506c;

    /* renamed from: d, reason: collision with root package name */
    public final String f64507d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f64508e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f64509f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f64510g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f64511h;

    /* renamed from: i, reason: collision with root package name */
    public final String f64512i;

    /* renamed from: j, reason: collision with root package name */
    public final String f64513j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f64514k;

    /* renamed from: l, reason: collision with root package name */
    public final String[] f64515l;

    /* renamed from: m, reason: collision with root package name */
    public final String f64516m;

    /* renamed from: n, reason: collision with root package name */
    public final String f64517n;

    /* renamed from: o, reason: collision with root package name */
    public final String f64518o;

    /* renamed from: p, reason: collision with root package name */
    public final String[] f64519p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f64520q;

    public d(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    @Override // jp.q
    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.d(this.f64505b, sb2);
        q.d(this.f64506c, sb2);
        q.c(this.f64507d, sb2);
        q.c(this.f64518o, sb2);
        q.c(this.f64516m, sb2);
        q.d(this.f64514k, sb2);
        q.d(this.f64508e, sb2);
        q.d(this.f64510g, sb2);
        q.c(this.f64512i, sb2);
        q.d(this.f64519p, sb2);
        q.c(this.f64517n, sb2);
        q.d(this.f64520q, sb2);
        q.c(this.f64513j, sb2);
        return sb2.toString();
    }

    public String[] e() {
        return this.f64515l;
    }

    public String[] f() {
        return this.f64514k;
    }

    public String g() {
        return this.f64517n;
    }

    public String[] h() {
        return this.f64511h;
    }

    public String[] i() {
        return this.f64510g;
    }

    public String[] j() {
        return this.f64520q;
    }

    public String k() {
        return this.f64512i;
    }

    public String[] l() {
        return this.f64505b;
    }

    public String[] m() {
        return this.f64506c;
    }

    public String n() {
        return this.f64513j;
    }

    public String o() {
        return this.f64516m;
    }

    public String[] p() {
        return this.f64508e;
    }

    public String[] q() {
        return this.f64509f;
    }

    public String r() {
        return this.f64507d;
    }

    public String s() {
        return this.f64518o;
    }

    public String[] t() {
        return this.f64519p;
    }

    public d(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(ParsedResultType.ADDRESSBOOK);
        if (strArr3 != null && strArr4 != null && strArr3.length != strArr4.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        }
        if (strArr5 != null && strArr6 != null && strArr5.length != strArr6.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        }
        if (strArr7 != null && strArr8 != null && strArr7.length != strArr8.length) {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
        this.f64505b = strArr;
        this.f64506c = strArr2;
        this.f64507d = str;
        this.f64508e = strArr3;
        this.f64509f = strArr4;
        this.f64510g = strArr5;
        this.f64511h = strArr6;
        this.f64512i = str2;
        this.f64513j = str3;
        this.f64514k = strArr7;
        this.f64515l = strArr8;
        this.f64516m = str4;
        this.f64517n = str5;
        this.f64518o = str6;
        this.f64519p = strArr9;
        this.f64520q = strArr10;
    }
}
