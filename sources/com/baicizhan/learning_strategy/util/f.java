package com.baicizhan.learning_strategy.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public long f17830a;

    /* renamed from: b, reason: collision with root package name */
    public long f17831b;

    public void a() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f17830a = currentTimeMillis;
        this.f17831b = currentTimeMillis;
    }

    public long b() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f17831b = currentTimeMillis;
        return currentTimeMillis - this.f17830a;
    }

    public long c() {
        return this.f17831b - this.f17830a;
    }
}
