package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45186a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Intent f81a;

    public al(Context context, Intent intent) {
        this.f45186a = context;
        this.f81a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMessageHandler.b(this.f45186a, this.f81a);
    }
}
