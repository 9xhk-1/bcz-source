package com.alipay.android.phone.mrpc.core;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p extends u {

    /* renamed from: c, reason: collision with root package name */
    public int f10308c;

    /* renamed from: d, reason: collision with root package name */
    public String f10309d;

    /* renamed from: e, reason: collision with root package name */
    public long f10310e;

    /* renamed from: f, reason: collision with root package name */
    public long f10311f;

    /* renamed from: g, reason: collision with root package name */
    public String f10312g;

    /* renamed from: h, reason: collision with root package name */
    public HttpUrlHeader f10313h;

    public p(HttpUrlHeader httpUrlHeader, int i11, String str, byte[] bArr) {
        this.f10313h = httpUrlHeader;
        this.f10308c = i11;
        this.f10309d = str;
        this.f10334a = bArr;
    }

    public final HttpUrlHeader a() {
        return this.f10313h;
    }

    public final void b(long j11) {
        this.f10311f = j11;
    }

    public final void a(long j11) {
        this.f10310e = j11;
    }

    public final void a(String str) {
        this.f10312g = str;
    }
}
