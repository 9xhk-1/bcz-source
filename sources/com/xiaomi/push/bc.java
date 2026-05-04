package com.xiaomi.push;

import android.content.Context;
import android.os.IBinder;
import com.xiaomi.push.ba;

/* loaded from: classes8.dex */
class bc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f45295a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ ba.b f169a;

    public bc(ba.b bVar, IBinder iBinder) {
        this.f169a = bVar;
        this.f45295a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Context context;
        String b11;
        Object obj5;
        Object obj6;
        try {
            context = ba.this.f164a;
            String packageName = context.getPackageName();
            b11 = ba.this.b();
            ba.a aVar = new ba.a();
            aVar.f45291b = ba.c.a(this.f45295a, packageName, b11, "OUID");
            ba.this.f166a = aVar;
            ba.this.m5745b();
            ba.this.f163a = 2;
            obj5 = ba.this.f167a;
            synchronized (obj5) {
                try {
                    obj6 = ba.this.f167a;
                    obj6.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            ba.this.m5745b();
            ba.this.f163a = 2;
            obj3 = ba.this.f167a;
            synchronized (obj3) {
                try {
                    obj4 = ba.this.f167a;
                    obj4.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th2) {
            ba.this.m5745b();
            ba.this.f163a = 2;
            obj = ba.this.f167a;
            synchronized (obj) {
                try {
                    obj2 = ba.this.f167a;
                    obj2.notifyAll();
                } catch (Exception unused4) {
                }
                throw th2;
            }
        }
    }
}
