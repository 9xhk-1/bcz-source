package com.igexin.c.a.b.a.a;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.igexin.push.core.d;
import com.igexin.push.d.c;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    static final Object f37092j = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final String f37093n = "GS-M";

    /* renamed from: a, reason: collision with root package name */
    Socket f37094a;

    /* renamed from: b, reason: collision with root package name */
    e f37095b;

    /* renamed from: c, reason: collision with root package name */
    g f37096c;

    /* renamed from: d, reason: collision with root package name */
    b f37097d;

    /* renamed from: e, reason: collision with root package name */
    final Handler f37098e;

    /* renamed from: f, reason: collision with root package name */
    boolean f37099f;

    /* renamed from: g, reason: collision with root package name */
    protected Lock f37100g;

    /* renamed from: h, reason: collision with root package name */
    protected Condition f37101h;

    /* renamed from: i, reason: collision with root package name */
    final List<f> f37102i;

    /* renamed from: k, reason: collision with root package name */
    protected ConcurrentLinkedQueue<f> f37103k;

    /* renamed from: l, reason: collision with root package name */
    long f37104l;

    /* renamed from: m, reason: collision with root package name */
    final Comparator<f> f37105m;

    /* renamed from: o, reason: collision with root package name */
    private com.igexin.c.a.b.d f37106o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f37107p;

    /* renamed from: com.igexin.c.a.b.a.a.d$1, reason: invalid class name */
    public class AnonymousClass1 implements com.igexin.c.a.b.a.a.a.d {
        public AnonymousClass1() {
        }

        @Override // com.igexin.c.a.b.a.a.a.a
        public final void a() {
            com.igexin.c.a.c.a.a(d.f37093n, "connect hand INTERRUPT_SUCCESS");
            d.this.f37098e.sendEmptyMessage(j.f37130f - 1);
        }

        @Override // com.igexin.c.a.b.a.a.a.d
        public final void b() {
            d.this.f37098e.sendEmptyMessage(j.f37129e - 1);
        }

        @Override // com.igexin.c.a.b.a.a.a.d
        public final void a(Exception exc) {
            com.igexin.c.a.c.a.a(d.f37093n, "connect exception = " + exc.toString());
            com.igexin.c.a.c.a.a("GS-M|c ex = " + exc.toString(), new Object[0]);
            d.this.c();
        }

        @Override // com.igexin.c.a.b.a.a.a.d
        public final void a(Socket socket) {
            Message obtain = Message.obtain();
            obtain.obj = socket;
            obtain.what = j.f37127c - 1;
            d.this.f37098e.sendMessage(obtain);
        }
    }

    /* renamed from: com.igexin.c.a.b.a.a.d$2, reason: invalid class name */
    public class AnonymousClass2 implements com.igexin.c.a.b.a.a.a.b {
        public AnonymousClass2() {
        }

        @Override // com.igexin.c.a.b.a.a.a.a
        public final void a() {
            d.this.f37098e.sendEmptyMessage(j.f37130f - 1);
        }

        @Override // com.igexin.c.a.b.a.a.a.b
        public final void a(Exception exc) {
            com.igexin.c.a.c.a.a(d.f37093n, "readTask exception = " + exc.toString());
            com.igexin.c.a.c.a.a("GS-M|r ex = " + exc.toString(), new Object[0]);
            if (exc.getMessage() == null || !exc.getMessage().equals("end of stream")) {
                d.this.c();
            } else {
                c.b.f38428a.c();
            }
        }

        @Override // com.igexin.c.a.b.a.a.a.b
        public final void b() {
        }
    }

    /* renamed from: com.igexin.c.a.b.a.a.d$3, reason: invalid class name */
    public class AnonymousClass3 implements com.igexin.c.a.b.a.a.a.c {
        public AnonymousClass3() {
        }

        @Override // com.igexin.c.a.b.a.a.a.a
        public final void a() {
            d.this.f37098e.sendEmptyMessage(j.f37130f - 1);
        }

        @Override // com.igexin.c.a.b.a.a.a.c
        public final void a(f fVar) {
            d dVar = d.this;
            if (fVar.B <= 0 || fVar.G == null) {
                fVar.l();
                return;
            }
            fVar.f37236z = System.currentTimeMillis();
            synchronized (d.f37092j) {
                try {
                    dVar.f37102i.add(fVar);
                    Collections.sort(dVar.f37102i, dVar.f37105m);
                    fVar.f37164d.getClass();
                    long millis = TimeUnit.SECONDS.toMillis(dVar.f37102i.get(0).B);
                    dVar.f37104l = millis;
                    if (millis > 0 && dVar.f37102i.size() == 1) {
                        fVar.f37164d.getClass();
                        com.igexin.c.a.c.a.a("GS-M|add : " + fVar.toString() + " --- " + fVar.f37164d.getClass().getName() + " set response timeout delay = " + dVar.f37104l, new Object[0]);
                        Message obtain = Message.obtain();
                        obtain.what = j.f37132h - 1;
                        obtain.obj = fVar.f37164d.getClass().getSimpleName();
                        dVar.f37098e.sendMessageDelayed(obtain, dVar.f37104l);
                    }
                    dVar.f37102i.size();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.igexin.c.a.b.a.a.a.c
        public final void a(Exception exc) {
            com.igexin.c.a.c.a.a(d.f37093n, "writeTask exception = " + exc.toString());
            com.igexin.c.a.c.a.a("GS-M|w ex = " + exc.toString(), new Object[0]);
            d.this.c();
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f37112a = new d(0);

        private a() {
        }
    }

    private d() {
        this.f37107p = new AtomicBoolean(false);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f37100g = reentrantLock;
        this.f37101h = reentrantLock.newCondition();
        this.f37102i = new ArrayList();
        this.f37103k = new ConcurrentLinkedQueue<>();
        this.f37105m = new Comparator<f>() { // from class: com.igexin.c.a.b.a.a.d.4
            private static int a(f fVar, f fVar2) {
                if (fVar == null) {
                    return 1;
                }
                if (fVar2 == null) {
                    return -1;
                }
                return Long.compare(fVar.B + fVar.f37236z, fVar2.B + fVar2.f37236z);
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(f fVar, f fVar2) {
                f fVar3 = fVar;
                f fVar4 = fVar2;
                if (fVar3 == null) {
                    return 1;
                }
                if (fVar4 == null) {
                    return -1;
                }
                return Long.compare(fVar3.B + fVar3.f37236z, fVar4.B + fVar4.f37236z);
            }
        };
        this.f37098e = d.a.f37956a.f37946e;
    }

    private static void k() {
        com.igexin.push.core.d unused = d.a.f37956a;
        com.igexin.push.e.a.a(j.f37125a);
    }

    private void l() {
        j();
        if ((this.f37097d == null && this.f37096c == null && this.f37095b == null) || i()) {
            b();
        } else {
            h();
        }
    }

    private void m() {
        Socket socket = this.f37094a;
        boolean z11 = (socket == null || socket.isClosed()) ? false : true;
        if (!z11 && this.f37097d == null) {
            com.igexin.c.a.c.a.a("GS-M|disconnect = true, reconnect", new Object[0]);
            this.f37097d = new b(new AnonymousClass1());
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) this.f37097d, true);
        } else {
            com.igexin.c.a.c.a.a("GS-Mstart connect, isConnected = " + z11 + ", ctask = " + this.f37097d, new Object[0]);
        }
    }

    private void n() {
        g gVar = this.f37096c;
        if (gVar != null) {
            gVar.f37122l = null;
            this.f37096c = null;
        }
        e eVar = this.f37095b;
        if (eVar != null) {
            eVar.f37114j = null;
            this.f37095b = null;
        }
        this.f37097d = null;
        this.f37094a = null;
    }

    private void o() {
        if (!i() || this.f37099f) {
            return;
        }
        b();
        this.f37099f = true;
    }

    private boolean p() {
        Socket socket = this.f37094a;
        return (socket == null || socket.isClosed()) ? false : true;
    }

    public final void b() {
        this.f37107p.set(false);
        com.igexin.push.core.d unused = d.a.f37956a;
        com.igexin.push.e.a.a(j.f37126b);
    }

    public final void c() {
        if (this.f37107p.getAndSet(true)) {
            return;
        }
        this.f37098e.sendEmptyMessage(j.f37125a - 1);
    }

    public final synchronized void d() {
        com.igexin.c.a.c.a.a(f37093n, "disConnect, hand TCP_DISCONNECT");
        this.f37098e.sendEmptyMessage(j.f37131g - 1);
    }

    public final synchronized void e() {
        this.f37098e.sendEmptyMessage(j.f37128d - 1);
        this.f37099f = false;
    }

    public final synchronized void f() {
        com.igexin.c.a.c.a.a(f37093n, "alarm timeout disconnect");
        com.igexin.c.a.c.a.a("GS-M|alarm timeout disconnect", new Object[0]);
        c();
    }

    public final synchronized void g() {
        com.igexin.c.a.c.a.a(f37093n, "redirect disconnect");
        com.igexin.c.a.c.a.a("GS-M|redirect disconnect", new Object[0]);
        c();
    }

    public final void h() {
        com.igexin.c.a.c.a.a(f37093n, "disconnect");
        com.igexin.c.a.c.a.a("GS-M|disconnect", new Object[0]);
        b bVar = this.f37097d;
        if (bVar != null) {
            bVar.c_();
        }
        g gVar = this.f37096c;
        if (gVar != null) {
            gVar.c_();
        }
        e eVar = this.f37095b;
        if (eVar != null) {
            eVar.c_();
        }
        Socket socket = this.f37094a;
        if (socket != null) {
            try {
                if (socket.isClosed()) {
                    return;
                }
                this.f37094a.close();
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    public final boolean i() {
        b bVar = this.f37097d;
        if (bVar != null && !bVar.f37079f) {
            return false;
        }
        e eVar = this.f37095b;
        if (eVar != null && !eVar.f37079f) {
            return false;
        }
        g gVar = this.f37096c;
        if (gVar != null && !gVar.f37079f) {
            return false;
        }
        n();
        return true;
    }

    public final void j() {
        this.f37098e.removeMessages(j.f37132h - 1);
        com.igexin.c.a.b.e.a().d();
        com.igexin.c.a.c.a.a("GS-M|cancel alarm", new Object[0]);
        synchronized (f37092j) {
            try {
                if (!this.f37102i.isEmpty()) {
                    Iterator<f> it = this.f37102i.iterator();
                    while (it.hasNext()) {
                        it.next().l();
                    }
                    this.f37102i.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f37103k.isEmpty()) {
            return;
        }
        Iterator<f> it2 = this.f37103k.iterator();
        while (it2.hasNext()) {
            it2.next().l();
        }
        this.f37103k.clear();
    }

    public /* synthetic */ d(byte b11) {
        this();
    }

    public static d a() {
        return a.f37112a;
    }

    private void c(Socket socket) throws Exception {
        g gVar = new g(new i(socket.getOutputStream()), this.f37106o);
        this.f37096c = gVar;
        gVar.f37120j = new AnonymousClass3();
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) this.f37096c, true);
    }

    private void b(f fVar) {
        if (fVar.B <= 0 || fVar.G == null) {
            fVar.l();
            return;
        }
        fVar.f37236z = System.currentTimeMillis();
        synchronized (f37092j) {
            try {
                this.f37102i.add(fVar);
                Collections.sort(this.f37102i, this.f37105m);
                fVar.f37164d.getClass();
                long millis = TimeUnit.SECONDS.toMillis(this.f37102i.get(0).B);
                this.f37104l = millis;
                if (millis > 0 && this.f37102i.size() == 1) {
                    fVar.f37164d.getClass();
                    com.igexin.c.a.c.a.a("GS-M|add : " + fVar.toString() + " --- " + fVar.f37164d.getClass().getName() + " set response timeout delay = " + this.f37104l, new Object[0]);
                    Message obtain = Message.obtain();
                    obtain.what = j.f37132h - 1;
                    obtain.obj = fVar.f37164d.getClass().getSimpleName();
                    this.f37098e.sendMessageDelayed(obtain, this.f37104l);
                }
                this.f37102i.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(f fVar) {
        try {
            try {
                this.f37100g.lock();
                this.f37103k.offer(fVar);
                this.f37101h.signalAll();
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                try {
                    this.f37100g.unlock();
                } catch (Exception e12) {
                    com.igexin.c.a.c.a.a(e12);
                }
            }
        } finally {
            try {
                this.f37100g.unlock();
            } catch (Exception e13) {
                com.igexin.c.a.c.a.a(e13);
            }
        }
    }

    private void b(Socket socket) throws Exception {
        e eVar = new e(new h(socket.getInputStream()), this.f37106o);
        this.f37095b = eVar;
        eVar.f37115k = new AnonymousClass2();
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) this.f37095b, true);
    }

    public final void a(com.igexin.c.a.b.d dVar) {
        this.f37106o = dVar;
        e eVar = this.f37095b;
        if (eVar != null) {
            eVar.f37116l = dVar;
        }
        g gVar = this.f37096c;
        if (gVar != null) {
            gVar.f37121k = dVar;
        }
    }

    private void a(Object obj) {
        com.igexin.c.a.c.a.b(f37093n, ((String) obj) + " write task response timeout");
        c();
    }

    public final void a(String str) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f37092j) {
            try {
                com.igexin.c.a.c.a.a("GS-M|" + str + " -- resp,no timeout", new Object[0]);
                this.f37104l = 0L;
                Iterator<f> it = this.f37102i.iterator();
                String str2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    }
                    f next = it.next();
                    if (next.G.a(currentTimeMillis, next)) {
                        next.l();
                        next.G.c();
                        it.remove();
                        z11 = true;
                        break;
                    }
                    long b11 = next.G.b(currentTimeMillis, next);
                    long j11 = this.f37104l;
                    if (j11 < 0 || j11 > b11) {
                        this.f37104l = b11;
                        str2 = next.f37164d.getClass().getSimpleName();
                    }
                }
                Handler handler = this.f37098e;
                int i11 = j.f37132h;
                handler.removeMessages(i11 - 1);
                if (z11) {
                    com.igexin.c.a.c.a.a("GS-M|timeout", new Object[0]);
                    f();
                } else {
                    if (this.f37102i.size() > 0) {
                        f fVar = this.f37102i.get(0);
                        fVar.l();
                        com.igexin.c.a.b.e.a().a((Object) fVar);
                        this.f37102i.remove(fVar);
                        fVar.f37164d.getClass();
                        com.igexin.c.a.c.a.a("GS-M|remove : " + fVar.toString() + " -- " + fVar.f37164d.getClass().getSimpleName(), new Object[0]);
                    }
                    int size = this.f37102i.size();
                    com.igexin.c.a.c.a.a("GS-M|r, size = ".concat(String.valueOf(size)), new Object[0]);
                    if (size > 0 && this.f37104l > 0 && !TextUtils.isEmpty(str2)) {
                        com.igexin.c.a.c.a.a("GS-M|" + str2 + " , set  response timeout = " + this.f37104l, new Object[0]);
                        Message obtain = Message.obtain();
                        obtain.what = i11 - 1;
                        obtain.obj = str2;
                        this.f37098e.sendMessageDelayed(obtain, this.f37104l);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Socket socket) {
        try {
            if (this.f37097d.g()) {
                return;
            }
            this.f37094a = socket;
            e eVar = new e(new h(socket.getInputStream()), this.f37106o);
            this.f37095b = eVar;
            eVar.f37115k = new AnonymousClass2();
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) this.f37095b, true);
            g gVar = new g(new i(socket.getOutputStream()), this.f37106o);
            this.f37096c = gVar;
            gVar.f37120j = new AnonymousClass3();
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) this.f37096c, true);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a("GS-M|" + e11.toString(), new Object[0]);
            com.igexin.c.a.c.a.a(f37093n, "tcpConnect exception =" + e11.toString());
            c();
        }
    }
}
