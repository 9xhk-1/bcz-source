package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bp;

/* loaded from: classes6.dex */
class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f45156a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ bp f58a;

    public h(a aVar, bp bpVar) {
        this.f45156a = aVar;
        this.f58a = bpVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f58a.run();
    }
}
