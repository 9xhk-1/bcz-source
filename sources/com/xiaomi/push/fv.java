package com.xiaomi.push;

import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public abstract class fv {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f45584a = new AtomicInteger(0);

    /* renamed from: a, reason: collision with other field name */
    public static boolean f436a;

    /* renamed from: a, reason: collision with other field name */
    protected fw f439a;

    /* renamed from: a, reason: collision with other field name */
    protected XMPushService f441a;

    /* renamed from: a, reason: collision with other field name */
    protected int f437a = 0;

    /* renamed from: a, reason: collision with other field name */
    protected long f438a = -1;

    /* renamed from: b, reason: collision with other field name */
    protected volatile long f446b = 0;

    /* renamed from: c, reason: collision with other field name */
    protected volatile long f449c = 0;

    /* renamed from: a, reason: collision with other field name */
    private LinkedList<Pair<Integer, Long>> f444a = new LinkedList<>();

    /* renamed from: a, reason: collision with other field name */
    private final Collection<fy> f443a = new CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with other field name */
    protected final Map<ga, a> f445a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with other field name */
    protected final Map<ga, a> f448b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with other field name */
    protected gh f440a = null;

    /* renamed from: a, reason: collision with other field name */
    protected String f442a = "";

    /* renamed from: b, reason: collision with other field name */
    protected String f447b = "";

    /* renamed from: c, reason: collision with root package name */
    private int f45586c = 2;

    /* renamed from: b, reason: collision with root package name */
    protected final int f45585b = f45584a.getAndIncrement();

    /* renamed from: e, reason: collision with root package name */
    private long f45588e = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f45587d = 0;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private ga f45589a;

        /* renamed from: a, reason: collision with other field name */
        private gi f450a;

        public a(ga gaVar, gi giVar) {
            this.f45589a = gaVar;
            this.f450a = giVar;
        }

        public void a(fk fkVar) {
            this.f45589a.a(fkVar);
        }

        public void a(gm gmVar) {
            gi giVar = this.f450a;
            if (giVar == null || giVar.mo5961a(gmVar)) {
                this.f45589a.a(gmVar);
            }
        }
    }

    static {
        f436a = false;
        try {
            f436a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        gb.m5983a();
    }

    public fv(XMPushService xMPushService, fw fwVar) {
        this.f439a = fwVar;
        this.f441a = xMPushService;
        m5968b();
    }

    public int a() {
        return this.f437a;
    }

    public abstract void a(gm gmVar);

    public abstract void a(bg.b bVar);

    public abstract void a(String str, String str2);

    public abstract void a(fk[] fkVarArr);

    public int b() {
        return this.f45586c;
    }

    public abstract void b(int i11, Exception exc);

    public abstract void b(fk fkVar);

    public abstract void b(boolean z11);

    public synchronized void c() {
        this.f45588e = SystemClock.elapsedRealtime();
    }

    public void d() {
        synchronized (this.f444a) {
            this.f444a.clear();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m5963a() {
        return this.f449c;
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m5967b() {
        return this.f439a.b();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m5970c() {
        return this.f45586c == 1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public fw m5964a() {
        return this.f439a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m5968b() {
        String str;
        if (this.f439a.m5972a() && this.f440a == null) {
            Class<?> cls = null;
            try {
                str = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    cls = Class.forName(str);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (cls == null) {
                this.f440a = new ft(this);
                return;
            }
            try {
                this.f440a = (gh) cls.getConstructor(fv.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e12) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e12);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String mo5965a() {
        return this.f439a.c();
    }

    public void b(fy fyVar) {
        this.f443a.remove(fyVar);
    }

    private String a(int i11) {
        return i11 == 1 ? "connected" : i11 == 0 ? "connecting" : i11 == 2 ? "disconnected" : "unknown";
    }

    public void b(ga gaVar, gi giVar) {
        if (gaVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f448b.put(gaVar, new a(gaVar, giVar));
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<ga, a> m5966a() {
        return this.f445a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m5969b() {
        return this.f45586c == 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m5962a(int i11) {
        synchronized (this.f444a) {
            try {
                if (i11 == 1) {
                    this.f444a.clear();
                } else {
                    this.f444a.add(new Pair<>(Integer.valueOf(i11), Long.valueOf(System.currentTimeMillis())));
                    if (this.f444a.size() > 6) {
                        this.f444a.remove(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i11, int i12, Exception exc) {
        int i13 = this.f45586c;
        if (i11 != i13) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("update the connection status. %1$s -> %2$s : %3$s ", a(i13), a(i11), com.xiaomi.push.service.bk.a(i12)));
        }
        if (bi.b(this.f441a)) {
            m5962a(i11);
        }
        if (i11 == 1) {
            this.f441a.a(10);
            if (this.f45586c != 0) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("try set connected while not connecting.");
            }
            this.f45586c = i11;
            Iterator<fy> it = this.f443a.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
            return;
        }
        if (i11 == 0) {
            if (this.f45586c != 2) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("try set connecting while not disconnected.");
            }
            this.f45586c = i11;
            Iterator<fy> it2 = this.f443a.iterator();
            while (it2.hasNext()) {
                it2.next().a(this);
            }
            return;
        }
        if (i11 == 2) {
            this.f441a.a(10);
            int i14 = this.f45586c;
            if (i14 == 0) {
                Iterator<fy> it3 = this.f443a.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i14 == 1) {
                Iterator<fy> it4 = this.f443a.iterator();
                while (it4.hasNext()) {
                    it4.next().a(this, i12, exc);
                }
            }
            this.f45586c = i11;
        }
    }

    public void a(fy fyVar) {
        if (fyVar == null || this.f443a.contains(fyVar)) {
            return;
        }
        this.f443a.add(fyVar);
    }

    public void a(ga gaVar, gi giVar) {
        if (gaVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f445a.put(gaVar, new a(gaVar, giVar));
    }

    public synchronized void a(String str) {
        try {
            if (this.f45586c == 0) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("setChallenge hash = " + bn.a(str).substring(0, 8));
                this.f442a = str;
                a(1, 0, null);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m5639a("ignore setChallenge because connection was disconnected");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public boolean mo5957a() {
        return false;
    }

    public synchronized boolean a(long j11) {
        return this.f45588e >= j11;
    }
}
