package com.xiaomi.push;

/* loaded from: classes8.dex */
class gf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gc f45616a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f462a;

    public gf(gc gcVar, String str) {
        this.f45616a = gcVar;
        this.f462a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        cu.a().a(this.f462a, true);
    }
}
