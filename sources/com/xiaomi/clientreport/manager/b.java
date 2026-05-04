package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.EventClientReport;

/* loaded from: classes6.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventClientReport f45150a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ a f56a;

    public b(a aVar, EventClientReport eventClientReport) {
        this.f56a = aVar;
        this.f45150a = eventClientReport;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f56a.b(this.f45150a);
    }
}
