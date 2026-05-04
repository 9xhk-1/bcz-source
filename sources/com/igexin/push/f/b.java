package com.igexin.push.f;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f38555c = "ExtensionTask";

    /* renamed from: a, reason: collision with root package name */
    protected long f38556a = 0;

    /* renamed from: b, reason: collision with root package name */
    protected long f38557b = 0;

    private void a(long j11) {
        this.f38556a = j11;
    }

    private boolean b() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.f38556a > this.f38557b;
    }

    public abstract void a();
}
