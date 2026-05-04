package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* loaded from: classes6.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45234a;

    public w(Context context) {
        this.f45234a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.f45234a.getPackageManager().getPackageInfo(this.f45234a.getPackageName(), 4612);
            v.c(this.f45234a);
            v.d(this.f45234a, packageInfo);
            v.c(this.f45234a, packageInfo);
        } catch (Throwable th2) {
            Log.e("ManifestChecker", "", th2);
        }
    }
}
