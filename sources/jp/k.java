package jp;

import com.google.zxing.client.result.ParsedResultType;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k extends q {

    /* renamed from: q, reason: collision with root package name */
    public static final String f64571q = "KG";

    /* renamed from: r, reason: collision with root package name */
    public static final String f64572r = "LB";

    /* renamed from: b, reason: collision with root package name */
    public final String f64573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f64574c;

    /* renamed from: d, reason: collision with root package name */
    public final String f64575d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64576e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64577f;

    /* renamed from: g, reason: collision with root package name */
    public final String f64578g;

    /* renamed from: h, reason: collision with root package name */
    public final String f64579h;

    /* renamed from: i, reason: collision with root package name */
    public final String f64580i;

    /* renamed from: j, reason: collision with root package name */
    public final String f64581j;

    /* renamed from: k, reason: collision with root package name */
    public final String f64582k;

    /* renamed from: l, reason: collision with root package name */
    public final String f64583l;

    /* renamed from: m, reason: collision with root package name */
    public final String f64584m;

    /* renamed from: n, reason: collision with root package name */
    public final String f64585n;

    /* renamed from: o, reason: collision with root package name */
    public final String f64586o;

    /* renamed from: p, reason: collision with root package name */
    public final Map<String, String> f64587p;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(ParsedResultType.PRODUCT);
        this.f64573b = str;
        this.f64574c = str2;
        this.f64575d = str3;
        this.f64576e = str4;
        this.f64577f = str5;
        this.f64578g = str6;
        this.f64579h = str7;
        this.f64580i = str8;
        this.f64581j = str9;
        this.f64582k = str10;
        this.f64583l = str11;
        this.f64584m = str12;
        this.f64585n = str13;
        this.f64586o = str14;
        this.f64587p = map;
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int u(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // jp.q
    public String a() {
        return String.valueOf(this.f64573b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return e(this.f64574c, kVar.f64574c) && e(this.f64575d, kVar.f64575d) && e(this.f64576e, kVar.f64576e) && e(this.f64577f, kVar.f64577f) && e(this.f64579h, kVar.f64579h) && e(this.f64580i, kVar.f64580i) && e(this.f64581j, kVar.f64581j) && e(this.f64582k, kVar.f64582k) && e(this.f64583l, kVar.f64583l) && e(this.f64584m, kVar.f64584m) && e(this.f64585n, kVar.f64585n) && e(this.f64586o, kVar.f64586o) && e(this.f64587p, kVar.f64587p);
    }

    public String f() {
        return this.f64579h;
    }

    public String g() {
        return this.f64580i;
    }

    public String h() {
        return this.f64576e;
    }

    public int hashCode() {
        return (((((((((((u(this.f64574c) ^ u(this.f64575d)) ^ u(this.f64576e)) ^ u(this.f64577f)) ^ u(this.f64579h)) ^ u(this.f64580i)) ^ u(this.f64581j)) ^ u(this.f64582k)) ^ u(this.f64583l)) ^ u(this.f64584m)) ^ u(this.f64585n)) ^ u(this.f64586o)) ^ u(this.f64587p);
    }

    public String i() {
        return this.f64578g;
    }

    public String j() {
        return this.f64584m;
    }

    public String k() {
        return this.f64586o;
    }

    public String l() {
        return this.f64585n;
    }

    public String m() {
        return this.f64574c;
    }

    public String n() {
        return this.f64577f;
    }

    public String o() {
        return this.f64573b;
    }

    public String p() {
        return this.f64575d;
    }

    public Map<String, String> q() {
        return this.f64587p;
    }

    public String r() {
        return this.f64581j;
    }

    public String s() {
        return this.f64583l;
    }

    public String t() {
        return this.f64582k;
    }
}
