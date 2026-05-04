package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes8.dex */
final class dz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f45463a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f332a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f333a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f45464b;

    public dz(Context context, String str, int i11, String str2) {
        this.f332a = context;
        this.f333a = str;
        this.f45463a = i11;
        this.f45464b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        dy.c(this.f332a, this.f333a, this.f45463a, this.f45464b);
    }
}
