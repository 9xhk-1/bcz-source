package com.xiaomi.mipush.sdk;

import android.content.Context;

/* loaded from: classes6.dex */
final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45237a;

    public z(Context context) {
        this.f45237a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessageHandleService.c(this.f45237a);
    }
}
