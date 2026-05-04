package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.bk;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public class fg {

    /* renamed from: a, reason: collision with root package name */
    private int f45562a;

    /* renamed from: a, reason: collision with other field name */
    private long f396a;

    /* renamed from: a, reason: collision with other field name */
    private ff f398a;

    /* renamed from: a, reason: collision with other field name */
    private String f399a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f400a = false;

    /* renamed from: a, reason: collision with other field name */
    private bk f397a = bk.a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static final fg f45563a = new fg();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized ez m5938a() {
        ez ezVar;
        ezVar = new ez();
        ezVar.a(bi.m5747a((Context) this.f398a.f393a));
        ezVar.f370a = (byte) 0;
        ezVar.f374b = 1;
        ezVar.d((int) (System.currentTimeMillis() / 1000));
        return ezVar;
    }

    public boolean b() {
        m5937a();
        return this.f400a && this.f397a.m5753a() > 0;
    }

    private ez a(bk.a aVar) {
        if (aVar.f175a == 0) {
            Object obj = aVar.f176a;
            if (obj instanceof ez) {
                return (ez) obj;
            }
            return null;
        }
        ez m5938a = m5938a();
        m5938a.a(ey.CHANNEL_STATS_COUNTER.a());
        m5938a.c(aVar.f175a);
        m5938a.c(aVar.f177a);
        return m5938a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized fa m5939a() {
        fa faVar;
        if (b()) {
            faVar = a(!bi.e(this.f398a.f393a) ? 375 : 750);
        } else {
            faVar = null;
        }
        return faVar;
    }

    private fa a(int i11) {
        ArrayList arrayList = new ArrayList();
        fa faVar = new fa(this.f399a, arrayList);
        if (!bi.e(this.f398a.f393a)) {
            faVar.a(i.i(this.f398a.f393a));
        }
        jl jlVar = new jl(i11);
        jd a11 = new jj.a().a(jlVar);
        try {
            faVar.b(a11);
        } catch (ix unused) {
        }
        LinkedList<bk.a> m5754a = this.f397a.m5754a();
        while (m5754a.size() > 0) {
            try {
                ez a12 = a(m5754a.getLast());
                if (a12 != null) {
                    a12.b(a11);
                }
                if (jlVar.a_() > i11) {
                    break;
                }
                if (a12 != null) {
                    arrayList.add(a12);
                }
                m5754a.removeLast();
            } catch (ix | NoSuchElementException unused2) {
            }
        }
        return faVar;
    }

    public static ff a() {
        ff ffVar;
        fg fgVar = a.f45563a;
        synchronized (fgVar) {
            ffVar = fgVar.f398a;
        }
        return ffVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static fg m5936a() {
        return a.f45563a;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m5937a() {
        if (!this.f400a || System.currentTimeMillis() - this.f396a <= this.f45562a) {
            return;
        }
        this.f400a = false;
        this.f396a = 0L;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5940a(int i11) {
        if (i11 > 0) {
            int i12 = i11 * 1000;
            if (i12 > 604800000) {
                i12 = 604800000;
            }
            if (this.f45562a == i12 && this.f400a) {
                return;
            }
            this.f400a = true;
            this.f396a = System.currentTimeMillis();
            this.f45562a = i12;
            com.xiaomi.channel.commonutils.logger.b.c("enable dot duration = " + i12 + " start = " + this.f396a);
        }
    }

    public synchronized void a(ez ezVar) {
        this.f397a.a(ezVar);
    }

    public synchronized void a(XMPushService xMPushService) {
        this.f398a = new ff(xMPushService);
        this.f399a = "";
        com.xiaomi.push.service.bv.a().a(new fh(this));
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5941a() {
        return this.f400a;
    }
}
