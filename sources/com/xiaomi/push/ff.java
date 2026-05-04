package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
public class ff implements fy {

    /* renamed from: a, reason: collision with root package name */
    private int f45556a;

    /* renamed from: a, reason: collision with other field name */
    fv f392a;

    /* renamed from: a, reason: collision with other field name */
    XMPushService f393a;

    /* renamed from: a, reason: collision with other field name */
    private Exception f394a;

    /* renamed from: e, reason: collision with root package name */
    private long f45560e;

    /* renamed from: f, reason: collision with root package name */
    private long f45561f;

    /* renamed from: a, reason: collision with other field name */
    private long f391a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f45557b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f45558c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f45559d = 0;

    /* renamed from: a, reason: collision with other field name */
    private String f395a = "";

    public ff(XMPushService xMPushService) {
        this.f45560e = 0L;
        this.f45561f = 0L;
        this.f393a = xMPushService;
        b();
        int myUid = Process.myUid();
        try {
            this.f45561f = TrafficStats.getUidRxBytes(myUid);
            this.f45560e = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Failed to obtain traffic data during initialization: " + e11);
            this.f45561f = -1L;
            this.f45560e = -1L;
        }
    }

    private void b() {
        this.f45557b = 0L;
        this.f45559d = 0L;
        this.f391a = 0L;
        this.f45558c = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bi.b(this.f393a)) {
            this.f391a = elapsedRealtime;
        }
        if (this.f393a.m6214c()) {
            this.f45558c = elapsedRealtime;
        }
    }

    private synchronized void c() {
        com.xiaomi.channel.commonutils.logger.b.c("stat connpt = " + this.f395a + " netDuration = " + this.f45557b + " ChannelDuration = " + this.f45559d + " channelConnectedTime = " + this.f45558c);
        ez ezVar = new ez();
        ezVar.f370a = (byte) 0;
        ezVar.a(ey.CHANNEL_ONLINE_RATE.a());
        ezVar.a(this.f395a);
        ezVar.d((int) (System.currentTimeMillis() / 1000));
        ezVar.b((int) (this.f45557b / 1000));
        ezVar.c((int) (this.f45559d / 1000));
        fg.m5936a().a(ezVar);
        b();
    }

    public Exception a() {
        return this.f394a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m5935a() {
        try {
            XMPushService xMPushService = this.f393a;
            if (xMPushService == null) {
                return;
            }
            String m5747a = bi.m5747a((Context) xMPushService);
            boolean c11 = bi.c(this.f393a);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.f391a;
            if (j11 > 0) {
                this.f45557b += elapsedRealtime - j11;
                this.f391a = 0L;
            }
            long j12 = this.f45558c;
            if (j12 != 0) {
                this.f45559d += elapsedRealtime - j12;
                this.f45558c = 0L;
            }
            if (c11) {
                if ((!TextUtils.equals(this.f395a, m5747a) && this.f45557b > 30000) || this.f45557b > 5400000) {
                    c();
                }
                this.f395a = m5747a;
                if (this.f391a == 0) {
                    this.f391a = elapsedRealtime;
                }
                if (this.f393a.m6214c()) {
                    this.f45558c = elapsedRealtime;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.xiaomi.push.fy
    public void b(fv fvVar) {
        m5935a();
        this.f45558c = SystemClock.elapsedRealtime();
        fi.a(0, ey.CONN_SUCCESS.a(), fvVar.mo5965a(), fvVar.a());
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar) {
        this.f45556a = 0;
        this.f394a = null;
        this.f392a = fvVar;
        this.f395a = bi.m5747a((Context) this.f393a);
        fi.a(0, ey.CONN_SUCCESS.a());
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar, int i11, Exception exc) {
        long j11;
        long j12;
        if (this.f45556a == 0 && this.f394a == null) {
            this.f45556a = i11;
            this.f394a = exc;
            fi.b(fvVar.mo5965a(), exc);
        }
        if (i11 == 22 && this.f45558c != 0) {
            long m5963a = fvVar.m5963a() - this.f45558c;
            if (m5963a < 0) {
                m5963a = 0;
            }
            this.f45559d += m5963a + (gb.b() / 2);
            this.f45558c = 0L;
        }
        m5935a();
        int myUid = Process.myUid();
        try {
            j11 = TrafficStats.getUidRxBytes(myUid);
            j12 = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Failed to obtain traffic data: " + e11);
            j11 = -1;
            j12 = -1L;
        }
        com.xiaomi.channel.commonutils.logger.b.c("Stats rx=" + (j11 - this.f45561f) + ", tx=" + (j12 - this.f45560e));
        this.f45561f = j11;
        this.f45560e = j12;
    }

    @Override // com.xiaomi.push.fy
    public void a(fv fvVar, Exception exc) {
        fi.a(0, ey.CHANNEL_CON_FAIL.a(), 1, fvVar.mo5965a(), bi.c(this.f393a) ? 1 : 0);
        m5935a();
    }
}
