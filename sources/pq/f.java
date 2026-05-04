package pq;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81133a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81135c;

    /* renamed from: d, reason: collision with root package name */
    public final String f81136d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81137e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81138f;

    /* renamed from: g, reason: collision with root package name */
    public int f81139g;

    public f(String str, String str2, String str3, String str4, String str5, int i11) {
        this.f81139g = 0;
        this.f81133a = str;
        this.f81134b = str2;
        this.f81135c = str3;
        this.f81136d = str4;
        this.f81137e = str5;
        this.f81138f = i11;
        if (str != null) {
            this.f81139g = str.length() / 2;
        }
    }

    public boolean a() {
        return (TextUtils.isEmpty(this.f81133a) || TextUtils.isEmpty(this.f81134b) || TextUtils.isEmpty(this.f81135c) || TextUtils.isEmpty(this.f81136d) || this.f81133a.length() != this.f81134b.length() || this.f81134b.length() != this.f81135c.length() || this.f81135c.length() != this.f81139g * 2 || this.f81138f < 0 || TextUtils.isEmpty(this.f81137e)) ? false : true;
    }

    public String b() {
        return this.f81133a;
    }

    public String c() {
        return this.f81134b;
    }

    public String d() {
        return this.f81135c;
    }

    public String e() {
        return this.f81136d;
    }

    public String f() {
        return this.f81137e;
    }

    public int g() {
        return this.f81138f;
    }

    public int h() {
        return this.f81139g;
    }
}
