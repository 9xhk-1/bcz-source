package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private String f35469b;

    /* renamed from: a, reason: collision with root package name */
    private int f35468a = 4;

    /* renamed from: c, reason: collision with root package name */
    private d f35470c = new c();

    public void a(Context context, int i11, String str) {
        this.f35468a = i11;
        this.f35469b = str;
        this.f35470c.a(context, "HMSCore");
    }

    public void b(int i11, String str, String str2, Throwable th2) {
        try {
            if (a(i11)) {
                e a11 = a(i11, str, str2, th2);
                String str3 = a11.c() + a11.a();
                this.f35470c.a(str3, i11, str, str2 + '\n' + Log.getStackTraceString(th2));
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public d a() {
        return this.f35470c;
    }

    public void a(d dVar) {
        this.f35470c = dVar;
    }

    private void b() {
        try {
            Log.e("HMSSDK_LogAdaptor", "log happened OOM error.");
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i11) {
        return i11 >= this.f35468a;
    }

    public void a(int i11, String str, String str2) {
        try {
            if (a(i11)) {
                e a11 = a(i11, str, str2, null);
                this.f35470c.a(a11.c() + a11.a(), i11, str, str2);
            }
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    public void a(String str, String str2) {
        try {
            e a11 = a(4, str, str2, null);
            this.f35470c.a(a11.c() + '\n' + a11.a(), 4, str, str2);
        } catch (OutOfMemoryError unused) {
            b();
        }
    }

    private e a(int i11, String str, String str2, Throwable th2) {
        e eVar = new e(8, this.f35469b, i11, str);
        eVar.a((e) str2);
        eVar.a(th2);
        return eVar;
    }
}
