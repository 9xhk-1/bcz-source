package kp;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f68546a;

    /* renamed from: b, reason: collision with root package name */
    public int f68547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68548c;

    /* renamed from: d, reason: collision with root package name */
    public final List<byte[]> f68549d;

    /* renamed from: e, reason: collision with root package name */
    public final String f68550e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f68551f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f68552g;

    /* renamed from: h, reason: collision with root package name */
    public Object f68553h;

    /* renamed from: i, reason: collision with root package name */
    public final int f68554i;

    /* renamed from: j, reason: collision with root package name */
    public final int f68555j;

    public d(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.f68549d;
    }

    public String b() {
        return this.f68550e;
    }

    public Integer c() {
        return this.f68552g;
    }

    public Integer d() {
        return this.f68551f;
    }

    public int e() {
        return this.f68547b;
    }

    public Object f() {
        return this.f68553h;
    }

    public byte[] g() {
        return this.f68546a;
    }

    public int h() {
        return this.f68554i;
    }

    public int i() {
        return this.f68555j;
    }

    public String j() {
        return this.f68548c;
    }

    public boolean k() {
        return this.f68554i >= 0 && this.f68555j >= 0;
    }

    public void l(Integer num) {
        this.f68552g = num;
    }

    public void m(Integer num) {
        this.f68551f = num;
    }

    public void n(int i11) {
        this.f68547b = i11;
    }

    public void o(Object obj) {
        this.f68553h = obj;
    }

    public d(byte[] bArr, String str, List<byte[]> list, String str2, int i11, int i12) {
        this.f68546a = bArr;
        this.f68547b = bArr == null ? 0 : bArr.length * 8;
        this.f68548c = str;
        this.f68549d = list;
        this.f68550e = str2;
        this.f68554i = i12;
        this.f68555j = i11;
    }
}
