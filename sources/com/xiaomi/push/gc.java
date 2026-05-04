package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes8.dex */
public abstract class gc extends fv {

    /* renamed from: a, reason: collision with root package name */
    protected Exception f45604a;

    /* renamed from: a, reason: collision with other field name */
    protected Socket f458a;

    /* renamed from: b, reason: collision with root package name */
    protected XMPushService f45605b;

    /* renamed from: c, reason: collision with root package name */
    private int f45606c;

    /* renamed from: c, reason: collision with other field name */
    String f459c;

    /* renamed from: d, reason: collision with root package name */
    private String f45607d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile long f45608e;

    /* renamed from: f, reason: collision with root package name */
    protected volatile long f45609f;

    /* renamed from: g, reason: collision with root package name */
    protected volatile long f45610g;

    /* renamed from: h, reason: collision with root package name */
    private long f45611h;

    public gc(XMPushService xMPushService, fw fwVar) {
        super(xMPushService, fwVar);
        this.f45604a = null;
        this.f459c = null;
        this.f45608e = 0L;
        this.f45609f = 0L;
        this.f45610g = 0L;
        this.f45611h = 0L;
        this.f45605b = xMPushService;
    }

    public cq a(String str) {
        cq a11 = cu.a().a(str, false);
        if (!a11.b()) {
            gy.a(new gf(this, str));
        }
        return a11;
    }

    /* renamed from: a */
    public abstract void mo5956a(boolean z11);

    @Override // com.xiaomi.push.fv
    public void b(int i11, Exception exc) {
        a(i11, exc);
        if ((exc != null || i11 == 18) && this.f45610g != 0) {
            a(exc);
        }
    }

    public String c() {
        return ((fv) this).f442a;
    }

    public synchronized void e() {
        try {
            if (!m5970c() && !m5969b()) {
                a(0, 0, (Exception) null);
                a(((fv) this).f439a);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("WARNING: current xmpp has connected");
        } catch (IOException e11) {
            throw new gg(e11);
        }
    }

    public void f() {
        this.f45608e = SystemClock.elapsedRealtime();
    }

    public void g() {
        this.f45609f = SystemClock.elapsedRealtime();
    }

    @Override // com.xiaomi.push.fv
    /* renamed from: a */
    public String mo5965a() {
        return this.f45607d;
    }

    @Override // com.xiaomi.push.fv
    public void b(boolean z11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        mo5956a(z11);
        com.xiaomi.push.service.o.a(this.f45605b).m6284c();
        if (z11) {
            return;
        }
        this.f45605b.a(new gd(this, 13, elapsedRealtime, currentTimeMillis), 10000L);
    }

    public void c(int i11, Exception exc) {
        this.f45605b.a(new ge(this, 2, i11, exc));
    }

    public Socket a() {
        return new Socket();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void mo5985a() {
    }

    public synchronized void a(int i11, Exception exc) {
        if (b() == 2) {
            return;
        }
        a(2, i11, exc);
        ((fv) this).f442a = "";
        try {
            this.f458a.close();
        } catch (Throwable unused) {
        }
        this.f45608e = 0L;
        this.f45609f = 0L;
    }

    private void a(fw fwVar) {
        a(fwVar.c(), fwVar.m5971a());
    }

    public void a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f45610g >= 300000) {
            this.f45606c = 0;
            return;
        }
        if (bi.b(this.f45605b)) {
            int i11 = this.f45606c + 1;
            this.f45606c = i11;
            if (i11 >= 2) {
                String mo5965a = mo5965a();
                com.xiaomi.channel.commonutils.logger.b.m5639a("max short conn time reached, sink down current host:" + mo5965a);
                a(mo5965a, 0L, exc);
                this.f45606c = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r30, int r31) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gc.a(java.lang.String, int):void");
    }

    public void a(String str, long j11, Exception exc) {
        cq a11 = cu.a().a(fw.a(), false);
        if (a11 != null) {
            a11.b(str, j11, 0L, exc);
            cu.a().m5812c();
        }
    }

    @Override // com.xiaomi.push.fv
    public void a(fk[] fkVarArr) {
        throw new gg("Don't support send Blob");
    }
}
