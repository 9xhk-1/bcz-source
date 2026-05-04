package com.xiaomi.clientreport.manager;

import com.xiaomi.push.aj;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
class f extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f45154a;

    public f(a aVar) {
        this.f45154a = aVar;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "100889";
    }

    @Override // java.lang.Runnable
    public void run() {
        int b11;
        ExecutorService executorService;
        b11 = this.f45154a.b();
        if (b11 > 0) {
            executorService = this.f45154a.f55a;
            executorService.execute(new g(this));
        }
    }
}
