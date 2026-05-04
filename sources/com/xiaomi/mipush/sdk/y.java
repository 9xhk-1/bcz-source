package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45236a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Intent f121a;

    public y(Context context, Intent intent) {
        this.f45236a = context;
        this.f121a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f45236a.startService(this.f121a);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(e11.getMessage());
        }
    }
}
