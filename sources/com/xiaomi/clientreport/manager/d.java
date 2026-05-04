package com.xiaomi.clientreport.manager;

import com.xiaomi.push.aj;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
class d extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f45152a;

    public d(a aVar) {
        this.f45152a = aVar;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "100888";
    }

    @Override // java.lang.Runnable
    public void run() {
        int a11;
        ExecutorService executorService;
        a11 = this.f45152a.a();
        if (a11 > 0) {
            executorService = this.f45152a.f55a;
            executorService.execute(new e(this));
        }
    }
}
