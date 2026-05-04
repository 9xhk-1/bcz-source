package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.aj;

/* loaded from: classes8.dex */
final class cd extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f46350a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Notification f997a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f998a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f999a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f46351b;

    public cd(int i11, String str, Context context, String str2, Notification notification) {
        this.f46350a = i11;
        this.f999a = str;
        this.f998a = context;
        this.f46351b = str2;
        this.f997a = notification;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        String b11;
        b11 = cc.b(this.f46350a, this.f999a);
        return b11;
    }

    @Override // java.lang.Runnable
    @TargetApi(19)
    public void run() {
        cc.c(this.f998a, this.f46351b, this.f46350a, this.f999a, this.f997a);
    }
}
