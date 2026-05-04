package com.xiaomi.push;

import com.xiaomi.push.am;

/* loaded from: classes8.dex */
class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am.b f45257a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ am f138a;

    public ao(am amVar, am.b bVar) {
        this.f138a = amVar;
        this.f45257a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f138a.a(this.f45257a);
    }
}
