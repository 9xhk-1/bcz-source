package io.openinstall.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import io.openinstall.sdk.az;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tz.c0;
import tz.j0;
import tz.m0;
import tz.o0;
import tz.p0;
import tz.q0;

/* loaded from: classes8.dex */
public class g extends c0 {

    /* renamed from: j, reason: collision with root package name */
    public final Context f62608j;

    /* renamed from: k, reason: collision with root package name */
    public final tz.k f62609k;

    /* renamed from: l, reason: collision with root package name */
    public final tz.g f62610l;

    /* renamed from: m, reason: collision with root package name */
    public final tz.j f62611m;

    /* renamed from: n, reason: collision with root package name */
    public final tz.o f62612n;

    public g(q0 q0Var, tz.o oVar) {
        super(q0Var);
        this.f62612n = oVar;
        Context h11 = m0.a().h();
        this.f62608j = h11;
        this.f62610l = new tz.g();
        this.f62609k = new tz.k();
        this.f62611m = new tz.j(h11);
    }

    private void f() {
        String a11 = TextUtils.isEmpty(this.f91242a.e().p()) ? this.f91242a.g().a(this.f91243b) : this.f91242a.e().p();
        if (j0.f91313a) {
            j0.a("opid = %s", a11);
        }
    }

    public final long b(int i11) {
        if (i11 < 3) {
            return 1L;
        }
        if (i11 < 6) {
            return 10L;
        }
        return i11 < 9 ? 60L : 300L;
    }

    public final tz.o e(tz.o oVar) {
        if (oVar == null || oVar.i() == 0) {
            tz.o i11 = this.f91245d.i();
            return i11 != null ? i11 : oVar;
        }
        this.f91245d.f(oVar);
        return oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        az c11;
        o0 o0Var;
        p0 p0Var;
        System.currentTimeMillis();
        ThreadPoolExecutor i11 = this.f91242a.i();
        rl.b l11 = m0.a().l();
        p0 f11 = this.f91244c.f();
        if (f11 == null) {
            f11 = this.f91245d.j(this.f91243b);
        }
        p0 p0Var2 = p0.f91349c;
        if (f11 == p0Var2) {
            this.f91245d.k();
        }
        int i12 = 0;
        if (f11 != p0Var2 && f11 != p0.f91351e && f11 != p0.f91353g) {
            if (f11 == p0.f91352f) {
                this.f91247f.e(this.f91245d.b());
                this.f91247f.q();
                this.f91244c.c(f11);
                this.f91244c.g();
                this.f91250i.f(false);
            }
            System.currentTimeMillis();
        }
        this.f91244c.c(p0.f91350d);
        HashMap hashMap = new HashMap();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        tz.o oVar = this.f62612n;
        int i13 = 1;
        if (oVar == null) {
            i11.execute(new h(this, linkedBlockingQueue));
        } else {
            tz.o e11 = e(oVar);
            if (e11.k(2)) {
                hashMap.put("pbH", e11.f());
                if (j0.f91313a) {
                    j0.a("获取到 %s", "pbH");
                }
            } else if (e11.k(1)) {
                hashMap.put("pbT", e11.a());
                if (j0.f91313a) {
                    j0.a("获取到 %s", "pbT");
                }
            }
            this.f91250i.f(false);
            i13 = 0;
        }
        i11.execute(new i(this, linkedBlockingQueue));
        i11.execute(new j(this, linkedBlockingQueue));
        int i14 = i13 + 3;
        i11.execute(new k(this, linkedBlockingQueue));
        if (l11.d()) {
            if (!l11.f()) {
                hashMap.put("mA", this.f62611m.a());
            }
            if (!l11.e()) {
                Pair c12 = this.f62611m.c();
                hashMap.put("im", c12.first);
                hashMap.put("im2", c12.second);
            }
            if (l11.b() == null) {
                i14 = i13 + 4;
                i11.execute(new l(this, linkedBlockingQueue));
            } else {
                if (j0.f91313a) {
                    j0.a("传入的 gaid 为 " + l11.b(), new Object[0]);
                }
                hashMap.put("ga", l11.b());
            }
            if (l11.c() == null) {
                i14++;
                i11.execute(new m(this, linkedBlockingQueue));
            } else {
                if (j0.f91313a) {
                    j0.a("传入的 oaid 为 " + l11.c(), new Object[0]);
                }
                hashMap.put("oa", l11.c());
            }
        }
        hashMap.put("md", this.f91246e.j());
        hashMap.put("bI", this.f91246e.k());
        hashMap.put("buiD", this.f91246e.l());
        hashMap.put("bd", this.f91246e.m());
        hashMap.put("loI", this.f91246e.o());
        while (true) {
            Pair pair = null;
            if (i14 <= 0) {
                break;
            }
            try {
                pair = (Pair) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            if (pair != null) {
                i14--;
                if (!TextUtils.isEmpty((CharSequence) pair.first) && !TextUtils.isEmpty((CharSequence) pair.second) && !"false".equalsIgnoreCase((String) pair.second)) {
                    hashMap.put(pair.first, pair.second);
                    if (j0.f91313a) {
                        j0.a("获取到 %s", pair.first);
                    }
                }
            }
        }
        while (true) {
            c11 = this.f91249h.c(hashMap);
            if (c11.a() != az.a.FAIL) {
                break;
            }
            try {
                this.f91244c.a(b(i12));
            } catch (InterruptedException unused2) {
            }
            if (i12 < 100) {
                i12++;
            }
        }
        a(c11.k());
        if (c11.a() == az.a.SUCCESS) {
            this.f91245d.d("FM_init_data", c11.i());
            this.f91245d.d("FM_init_msg", c11.g());
            this.f91245d.f(null);
            o0Var = this.f91244c;
            p0Var = p0.f91352f;
        } else {
            if (c11.a() == az.a.ERROR) {
                this.f91245d.d("FM_init_msg", c11.g());
                this.f91245d.f(null);
                o0Var = this.f91244c;
                p0Var = p0.f91353g;
            }
            this.f91244c.g();
            this.f91245d.e(this.f91243b, this.f91244c.f());
        }
        o0Var.c(p0Var);
        this.f91244c.g();
        this.f91245d.e(this.f91243b, this.f91244c.f());
        f();
        System.currentTimeMillis();
    }
}
