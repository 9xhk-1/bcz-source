package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bq;

/* loaded from: classes6.dex */
class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f45157a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ bq f59a;

    public i(a aVar, bq bqVar) {
        this.f45157a = aVar;
        this.f59a = bqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f59a.run();
    }
}
