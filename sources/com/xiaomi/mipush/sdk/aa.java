package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.hl;

/* loaded from: classes6.dex */
class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C0531a f45173a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ hl f77a;

    public aa(MiTinyDataClient.a.C0531a c0531a, hl hlVar) {
        this.f45173a = c0531a;
        this.f77a = hlVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f45173a.f72a.add(this.f77a);
        this.f45173a.a();
    }
}
