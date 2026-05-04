package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.PerfClientReport;

/* loaded from: classes6.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PerfClientReport f45151a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ a f57a;

    public c(a aVar, PerfClientReport perfClientReport) {
        this.f57a = aVar;
        this.f45151a = perfClientReport;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f57a.b(this.f45151a);
    }
}
