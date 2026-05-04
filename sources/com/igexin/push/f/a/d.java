package com.igexin.push.f.a;

import java.io.InputStream;

/* loaded from: classes7.dex */
public abstract class d extends com.igexin.c.a.d.b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f38528e = "HttpPlugin";

    /* renamed from: f, reason: collision with root package name */
    public String f38529f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f38530g;

    /* renamed from: h, reason: collision with root package name */
    public InputStream f38531h;

    /* renamed from: i, reason: collision with root package name */
    public long f38532i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38533j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f38534k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38535l = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38536m;

    public d(String str) {
        com.igexin.c.a.c.a.a("HttpPluginhttp url:".concat(String.valueOf(str)), new Object[0]);
        this.f38529f = str;
    }

    private String b() {
        return this.f38529f;
    }

    private byte[] d() {
        return this.f38530g;
    }

    private InputStream e() {
        return this.f38531h;
    }

    private long f() {
        return this.f38532i;
    }

    @Override // com.igexin.c.a.d.a.a
    public final void a() {
    }

    private void a(InputStream inputStream, long j11) {
        this.f38531h = inputStream;
        this.f38532i = j11;
    }

    private void b(byte[] bArr) {
        this.f38530g = bArr;
    }

    public void a(Exception exc) {
    }

    public void a(byte[] bArr) throws Exception {
        this.f38536m = false;
        if (bArr == null) {
            return;
        }
        new String(bArr);
        com.igexin.c.a.c.a.a("HttpPluginhttp:responseData: " + new String(bArr), new Object[0]);
        if (bArr.length >= 7 && bArr[5] == 111 && bArr[6] == 107) {
            this.f38536m = true;
        }
    }
}
