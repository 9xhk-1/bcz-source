package com.xiaomi.push;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.dw;
import com.xiaomi.push.fv;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class fr extends gc {

    /* renamed from: a, reason: collision with root package name */
    private fm f45578a;

    /* renamed from: a, reason: collision with other field name */
    private fn f426a;

    /* renamed from: a, reason: collision with other field name */
    private Thread f427a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f428a;

    public fr(XMPushService xMPushService, fw fwVar) {
        super(xMPushService, fwVar);
    }

    private fk a(boolean z11) {
        fq fqVar = new fq();
        if (z11) {
            fqVar.a("1");
        }
        byte[] m5942a = fi.m5942a();
        if (m5942a != null) {
            dw.j jVar = new dw.j();
            jVar.a(a.a(m5942a));
            fqVar.a(jVar.m5907a(), (String) null);
        }
        return fqVar;
    }

    private void h() {
        try {
            this.f45578a = new fm(((gc) this).f458a.getInputStream(), this, ((fv) this).f441a);
            this.f426a = new fn(((gc) this).f458a.getOutputStream(), this);
            fs fsVar = new fs(this, "Blob Reader (" + ((fv) this).f45585b + pn.j.f81007d);
            this.f427a = fsVar;
            fsVar.start();
        } catch (Exception e11) {
            throw new gg("Error to init reader and writer", e11);
        }
    }

    @Override // com.xiaomi.push.fv
    public void b(fk fkVar) {
        fn fnVar = this.f426a;
        if (fnVar == null) {
            throw new gg("the writer is null.");
        }
        try {
            int a11 = fnVar.a(fkVar);
            ((fv) this).f45587d = SystemClock.elapsedRealtime();
            String f11 = fkVar.f();
            if (!TextUtils.isEmpty(f11)) {
                ha.a(((fv) this).f441a, f11, a11, false, true, System.currentTimeMillis());
            }
            Iterator<fv.a> it = ((fv) this).f448b.values().iterator();
            while (it.hasNext()) {
                it.next().a(fkVar);
            }
        } catch (Exception e11) {
            throw new gg(e11);
        }
    }

    public void b(gm gmVar) {
        if (gmVar == null) {
            return;
        }
        Iterator<fv.a> it = ((fv) this).f445a.values().iterator();
        while (it.hasNext()) {
            it.next().a(gmVar);
        }
    }

    @Override // com.xiaomi.push.gc
    /* renamed from: a */
    public synchronized void mo5985a() {
        h();
        this.f426a.a();
    }

    @Override // com.xiaomi.push.gc
    public synchronized void a(int i11, Exception exc) {
        try {
            fm fmVar = this.f45578a;
            if (fmVar != null) {
                fmVar.b();
                this.f45578a = null;
            }
            fn fnVar = this.f426a;
            if (fnVar != null) {
                try {
                    fnVar.b();
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
                this.f426a = null;
            }
            this.f428a = null;
            super.a(i11, exc);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(fk fkVar) {
        if (fkVar == null) {
            return;
        }
        if (fkVar.m5946a()) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("[Slim] RCV blob chid=" + fkVar.a() + "; id=" + fkVar.e() + "; errCode=" + fkVar.b() + "; err=" + fkVar.m5950c());
        }
        if (fkVar.a() == 0) {
            if ("PING".equals(fkVar.m5943a())) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("[Slim] RCV ping id=" + fkVar.e());
                g();
            } else if ("CLOSE".equals(fkVar.m5943a())) {
                c(13, null);
            }
        }
        Iterator<fv.a> it = ((fv) this).f445a.values().iterator();
        while (it.hasNext()) {
            it.next().a(fkVar);
        }
    }

    @Override // com.xiaomi.push.fv
    @Deprecated
    public void a(gm gmVar) {
        b(fk.a(gmVar, (String) null));
    }

    @Override // com.xiaomi.push.fv
    public synchronized void a(bg.b bVar) {
        fj.a(bVar, c(), this);
    }

    @Override // com.xiaomi.push.fv
    public synchronized void a(String str, String str2) {
        fj.a(str, str2, this);
    }

    @Override // com.xiaomi.push.gc
    /* renamed from: a, reason: collision with other method in class */
    public void mo5956a(boolean z11) {
        if (this.f426a == null) {
            throw new gg("The BlobWriter is null.");
        }
        fk a11 = a(z11);
        com.xiaomi.channel.commonutils.logger.b.m5639a("[Slim] SND ping id=" + a11.e());
        b(a11);
        f();
    }

    @Override // com.xiaomi.push.gc, com.xiaomi.push.fv
    public void a(fk[] fkVarArr) {
        for (fk fkVar : fkVarArr) {
            b(fkVar);
        }
    }

    @Override // com.xiaomi.push.fv
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo5957a() {
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized byte[] m5958a() {
        try {
            if (this.f428a == null && !TextUtils.isEmpty(((fv) this).f442a)) {
                String m6265a = com.xiaomi.push.service.bv.m6265a();
                StringBuilder sb2 = new StringBuilder();
                String str = ((fv) this).f442a;
                sb2.append(str.substring(str.length() / 2));
                sb2.append(m6265a.substring(m6265a.length() / 2));
                this.f428a = com.xiaomi.push.service.bp.a(((fv) this).f442a.getBytes(), sb2.toString().getBytes());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f428a;
    }
}
