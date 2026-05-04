package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f46190a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f46191b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f46192c;

    public p(o oVar, String str, String str2, String str3) {
        this.f46190a = oVar;
        this.f856a = str;
        this.f46191b = str2;
        this.f46192c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        context = this.f46190a.f853a;
        SharedPreferences.Editor edit = context.getSharedPreferences(this.f856a, 4).edit();
        edit.putString(this.f46191b, this.f46192c);
        edit.commit();
    }
}
