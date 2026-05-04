package com.xiaomi.push;

import android.os.IBinder;
import com.xiaomi.push.aq;

/* loaded from: classes8.dex */
class as implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f45261a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ aq.a f145a;

    public as(aq.a aVar, IBinder iBinder) {
        this.f145a = aVar;
        this.f45261a = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        try {
            aq.this.f143a = aq.b.a(this.f45261a);
            aq.this.f144b = aq.b.m5726a(this.f45261a);
            aq.this.b();
            aq.this.f139a = 2;
            obj5 = aq.this.f142a;
            synchronized (obj5) {
                try {
                    obj6 = aq.this.f142a;
                    obj6.notifyAll();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            aq.this.b();
            aq.this.f139a = 2;
            obj3 = aq.this.f142a;
            synchronized (obj3) {
                try {
                    obj4 = aq.this.f142a;
                    obj4.notifyAll();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th2) {
            aq.this.b();
            aq.this.f139a = 2;
            obj = aq.this.f142a;
            synchronized (obj) {
                try {
                    obj2 = aq.this.f142a;
                    obj2.notifyAll();
                } catch (Exception unused4) {
                }
                throw th2;
            }
        }
    }
}
