package com.meizu.cloud.pushsdk.c.b;

import com.meizu.cloud.pushsdk.c.c.k;

/* loaded from: classes7.dex */
public class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private String f39528a;

    /* renamed from: b, reason: collision with root package name */
    private int f39529b;

    /* renamed from: c, reason: collision with root package name */
    private String f39530c;

    /* renamed from: d, reason: collision with root package name */
    private k f39531d;

    public a() {
        this.f39529b = 0;
    }

    public k a() {
        return this.f39531d;
    }

    public int b() {
        return this.f39529b;
    }

    public String c() {
        return this.f39528a;
    }

    public a(k kVar) {
        this.f39529b = 0;
        this.f39531d = kVar;
    }

    public void a(int i11) {
        this.f39529b = i11;
    }

    public void b(String str) {
        this.f39528a = str;
    }

    public a(Throwable th2) {
        super(th2);
        this.f39529b = 0;
    }

    public void a(String str) {
        this.f39530c = str;
    }
}
