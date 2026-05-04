package com.xiaomi.push;

import java.util.Date;

/* loaded from: classes8.dex */
class fu implements fy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ft f45583a;

    public fu(ft ftVar) {
        this.f45583a = ftVar;
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f45583a.f433a.format(new Date()) + " Connection started (" + this.f45583a.f430a.hashCode() + pn.j.f81007d);
    }

    @Override // com.xiaomi.push.fy
    public void b(fv fvVar) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f45583a.f433a.format(new Date()) + " Connection reconnected (" + this.f45583a.f430a.hashCode() + pn.j.f81007d);
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar, int i11, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f45583a.f433a.format(new Date()) + " Connection closed (" + this.f45583a.f430a.hashCode() + pn.j.f81007d);
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar, Exception exc) {
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + this.f45583a.f433a.format(new Date()) + " Reconnection failed due to an exception (" + this.f45583a.f430a.hashCode() + pn.j.f81007d);
        exc.printStackTrace();
    }
}
