package com.igexin.push.d;

import android.content.Intent;
import android.os.Bundle;
import com.igexin.push.f.b.d;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38394a = "ConnectModelCoordinator";

    /* renamed from: i, reason: collision with root package name */
    private static final long f38395i = 20000;

    /* renamed from: j, reason: collision with root package name */
    private static final long f38396j = 200000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38397b;

    /* renamed from: c, reason: collision with root package name */
    public long f38398c;

    /* renamed from: d, reason: collision with root package name */
    public int f38399d;

    /* renamed from: e, reason: collision with root package name */
    public com.igexin.push.d.b f38400e;

    /* renamed from: f, reason: collision with root package name */
    private int f38401f;

    /* renamed from: g, reason: collision with root package name */
    private int f38402g;

    /* renamed from: h, reason: collision with root package name */
    private int f38403h;

    /* renamed from: k, reason: collision with root package name */
    private long f38404k;

    /* renamed from: l, reason: collision with root package name */
    private a f38405l;

    public enum a {
        WIFI,
        MOBILE
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f38428a = new c(0);

        private b() {
        }
    }

    private c() {
        this.f38401f = com.igexin.push.config.d.f37604x;
        this.f38402g = com.igexin.push.config.d.f37606z;
        this.f38400e = new d();
        this.f38405l = com.igexin.push.g.c.b() ? a.WIFI : a.MOBILE;
    }

    private com.igexin.push.d.b e() {
        return this.f38400e;
    }

    private static c f() {
        return b.f38428a;
    }

    private void g() {
        this.f38398c = System.currentTimeMillis();
        if (!this.f38397b) {
            b();
            return;
        }
        com.igexin.c.a.c.a.a(f38394a, "loginRsp| enter polling");
        this.f38400e = new e();
        d.a.f38568a.g();
        this.f38399d = 0;
    }

    private void h() {
        com.igexin.push.d.b bVar;
        if (!this.f38397b || (bVar = this.f38400e) == null || (bVar instanceof d)) {
            return;
        }
        this.f38400e = new d();
    }

    private static void i() {
        a(0);
    }

    private static void j() {
        a(1);
    }

    public final synchronized void a() {
        try {
            a aVar = com.igexin.push.g.c.b() ? a.WIFI : a.MOBILE;
            if (aVar != this.f38405l) {
                com.igexin.c.a.c.a.a(f38394a, "net type changed " + this.f38405l + "->" + aVar);
                com.igexin.c.a.c.a.a("ConnectModelCoordinator|net type changed " + this.f38405l + "->" + aVar, new Object[0]);
                b();
                this.f38405l = aVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b() {
        com.igexin.c.a.c.a.a("ConnectModelCoordinator|reset current mdl = normal", new Object[0]);
        com.igexin.push.d.b bVar = this.f38400e;
        if (bVar != null && !(bVar instanceof d)) {
            this.f38400e = new d();
        }
        d.a.f38568a.i();
        this.f38399d = 0;
        this.f38403h = 0;
        this.f38397b = false;
        com.igexin.push.core.e.f.a().b(this.f38397b);
    }

    public final synchronized void c() {
        if (this.f38397b) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f38398c;
        if (currentTimeMillis > 20000 && currentTimeMillis < f38396j) {
            this.f38403h++;
            com.igexin.c.a.c.a.a(f38394a, "read len = -1, interval = " + currentTimeMillis + ", tcpDisconnectSuccess =" + this.f38403h);
            com.igexin.c.a.c.a.a("ConnectModelCoordinator|read len = -1, interval = " + currentTimeMillis + ", tcpDisconnectSuccess =" + this.f38403h, new Object[0]);
            if (this.f38403h >= this.f38401f) {
                com.igexin.c.a.c.a.a(f38394a, "enter polling mode #####");
                com.igexin.c.a.c.a.a("ConnectModelCoordinator|enter polling mode ####", new Object[0]);
                a(0);
                this.f38397b = true;
                this.f38400e = new e();
                d.a.f38568a.g();
                com.igexin.push.core.e.f.a().b(this.f38397b);
            }
        }
    }

    public final synchronized void d() {
        if (this.f38397b) {
            this.f38399d++;
            com.igexin.c.a.c.a.a(f38394a, "polling mode, cur heartbeat = " + this.f38399d);
            com.igexin.c.a.c.a.a("ConnectModelCoordinator|polling mode, cur heartbeat =" + this.f38399d, new Object[0]);
            if (this.f38399d >= this.f38402g) {
                com.igexin.c.a.c.a.a(f38394a, "enter normal mode #####");
                com.igexin.c.a.c.a.a("ConnectModelCoordinator|enter normal mode ####", new Object[0]);
                a(1);
                com.igexin.push.core.e.b(0L);
                b();
            }
        }
    }

    public /* synthetic */ c(byte b11) {
        this();
    }

    private static void a(int i11) {
        if (com.igexin.push.core.e.f38035l == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.igexin.sdk.action.polling");
            Bundle bundle = new Bundle();
            bundle.putInt("code", i11);
            intent.putExtras(bundle);
            intent.setPackage(com.igexin.push.core.e.f38035l.getPackageName());
            com.igexin.push.core.e.f38035l.sendBroadcast(intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(f38394a, th2.toString());
        }
    }

    private void a(boolean z11) {
        this.f38397b = z11;
        com.igexin.c.a.c.a.a("ConnectModelCoordinator|init, current is polling mdl = ".concat(String.valueOf(z11)), new Object[0]);
        if (z11) {
            d.a.f38568a.g();
        }
    }
}
