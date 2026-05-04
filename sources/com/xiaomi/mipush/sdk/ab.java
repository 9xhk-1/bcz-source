package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes6.dex */
class ab implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C0531a f45174a;

    public ab(MiTinyDataClient.a.C0531a c0531a) {
        this.f45174a = c0531a;
    }

    @Override // java.lang.Runnable
    public void run() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        if (this.f45174a.f72a.size() != 0) {
            this.f45174a.b();
            return;
        }
        scheduledFuture = this.f45174a.f73a;
        if (scheduledFuture != null) {
            scheduledFuture2 = this.f45174a.f73a;
            scheduledFuture2.cancel(false);
            this.f45174a.f73a = null;
        }
    }
}
