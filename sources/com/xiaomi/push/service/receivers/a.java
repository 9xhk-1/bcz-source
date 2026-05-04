package com.xiaomi.push.service.receivers;

import android.content.Context;

/* loaded from: classes8.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f46396a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ NetworkStatusReceiver f1032a;

    public a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f1032a = networkStatusReceiver;
        this.f46396a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1032a.a(this.f46396a);
    }
}
