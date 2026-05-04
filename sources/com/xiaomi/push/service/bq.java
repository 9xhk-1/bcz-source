package com.xiaomi.push.service;

import com.xiaomi.push.fg;
import com.xiaomi.push.service.XMPushService.e;

/* loaded from: classes8.dex */
class bq {

    /* renamed from: d, reason: collision with root package name */
    private static int f46334d = 300000;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f979a;

    /* renamed from: b, reason: collision with root package name */
    private int f46336b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f46337c = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f46335a = 500;

    /* renamed from: a, reason: collision with other field name */
    private long f978a = 0;

    public bq(XMPushService xMPushService) {
        this.f979a = xMPushService;
    }

    private int a() {
        if (this.f46336b > 8) {
            return 300000;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        int i11 = this.f46336b;
        if (i11 > 4) {
            return (int) (random * 60000.0d);
        }
        if (i11 > 1) {
            return (int) (random * 10000.0d);
        }
        if (this.f978a == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.f978a >= 310000) {
            this.f46335a = 1000;
            this.f46337c = 0;
            return 0;
        }
        int i12 = this.f46335a;
        int i13 = f46334d;
        if (i12 >= i13) {
            return i12;
        }
        int i14 = this.f46337c + 1;
        this.f46337c = i14;
        if (i14 >= 4) {
            return i13;
        }
        this.f46335a = (int) (i12 * 1.5d);
        return i12;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6264a() {
        this.f978a = System.currentTimeMillis();
        this.f979a.a(1);
        this.f46336b = 0;
    }

    public void a(boolean z11) {
        if (!this.f979a.m6209a()) {
            com.xiaomi.channel.commonutils.logger.b.c("should not reconnect as no client or network.");
            return;
        }
        if (z11) {
            if (!this.f979a.m6210a(1)) {
                this.f46336b++;
            }
            this.f979a.a(1);
            XMPushService xMPushService = this.f979a;
            xMPushService.getClass();
            xMPushService.a(xMPushService.new e());
            return;
        }
        if (this.f979a.m6210a(1)) {
            return;
        }
        int a11 = a();
        this.f46336b++;
        com.xiaomi.channel.commonutils.logger.b.m5639a("schedule reconnect in " + a11 + "ms");
        XMPushService xMPushService2 = this.f979a;
        xMPushService2.getClass();
        xMPushService2.a(xMPushService2.new e(), (long) a11);
        if (this.f46336b == 2 && fg.m5936a().m5941a()) {
            ap.b();
        }
        if (this.f46336b == 3) {
            ap.a();
        }
    }
}
