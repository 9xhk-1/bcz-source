package t50;

import a00.i0;
import a00.r0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;
import z50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f89619a;

    /* renamed from: b, reason: collision with root package name */
    public int f89620b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Runnable f89621c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public ExecutorService f89622d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ArrayDeque<e.a> f89623e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final ArrayDeque<e.a> f89624f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ArrayDeque<z50.e> f89625g;

    public k() {
        this.f89619a = 64;
        this.f89620b = 5;
        this.f89623e = new ArrayDeque<>();
        this.f89624f = new ArrayDeque<>();
        this.f89625g = new ArrayDeque<>();
    }

    @w00.j(name = "-deprecated_executorService")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "executorService", imports = {}))
    @m80.k
    public final ExecutorService a() {
        return e();
    }

    public final synchronized void b() {
        try {
            Iterator<e.a> it = this.f89623e.iterator();
            while (it.hasNext()) {
                it.next().b().cancel();
            }
            Iterator<e.a> it2 = this.f89624f.iterator();
            while (it2.hasNext()) {
                it2.next().b().cancel();
            }
            Iterator<z50.e> it3 = this.f89625g.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(@m80.k e.a call) {
        e.a f11;
        g0.p(call, "call");
        synchronized (this) {
            try {
                this.f89623e.add(call);
                if (!call.b().o() && (f11 = f(call.d())) != null) {
                    call.f(f11);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m();
    }

    public final synchronized void d(@m80.k z50.e call) {
        g0.p(call, "call");
        this.f89625g.add(call);
    }

    @w00.j(name = "executorService")
    @m80.k
    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        try {
            if (this.f89622d == null) {
                this.f89622d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), u50.f.Y(u50.f.f91854i + " Dispatcher", false));
            }
            executorService = this.f89622d;
            g0.m(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final e.a f(String str) {
        Iterator<e.a> it = this.f89624f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (g0.g(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f89623e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (g0.g(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    public final <T> void g(Deque<T> deque, T t11) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t11)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f89621c;
            g2 g2Var = g2.f100423a;
        }
        if (m() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void h(@m80.k e.a call) {
        g0.p(call, "call");
        call.c().decrementAndGet();
        g(this.f89624f, call);
    }

    public final void i(@m80.k z50.e call) {
        g0.p(call, "call");
        g(this.f89625g, call);
    }

    @m80.l
    public final synchronized Runnable j() {
        return this.f89621c;
    }

    public final synchronized int k() {
        return this.f89619a;
    }

    public final synchronized int l() {
        return this.f89620b;
    }

    public final boolean m() {
        int i11;
        boolean z11;
        if (u50.f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<e.a> it = this.f89623e.iterator();
                g0.o(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a asyncCall = it.next();
                    if (this.f89624f.size() >= this.f89619a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.f89620b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        g0.o(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f89624f.add(asyncCall);
                    }
                }
                z11 = q() > 0;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i11 = 0; i11 < size; i11++) {
            ((e.a) arrayList.get(i11)).a(e());
        }
        return z11;
    }

    @m80.k
    public final synchronized List<b> n() {
        List<b> unmodifiableList;
        try {
            ArrayDeque<e.a> arrayDeque = this.f89623e;
            ArrayList arrayList = new ArrayList(i0.d0(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            g0.o(unmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return unmodifiableList;
    }

    public final synchronized int o() {
        return this.f89623e.size();
    }

    @m80.k
    public final synchronized List<b> p() {
        List<b> unmodifiableList;
        try {
            ArrayDeque<z50.e> arrayDeque = this.f89625g;
            ArrayDeque<e.a> arrayDeque2 = this.f89624f;
            ArrayList arrayList = new ArrayList(i0.d0(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            unmodifiableList = Collections.unmodifiableList(r0.I4(arrayDeque, arrayList));
            g0.o(unmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return unmodifiableList;
    }

    public final synchronized int q() {
        return this.f89624f.size() + this.f89625g.size();
    }

    public final synchronized void r(@m80.l Runnable runnable) {
        this.f89621c = runnable;
    }

    public final void s(int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i11).toString());
        }
        synchronized (this) {
            this.f89619a = i11;
            g2 g2Var = g2.f100423a;
        }
        m();
    }

    public final void t(int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i11).toString());
        }
        synchronized (this) {
            this.f89620b = i11;
            g2 g2Var = g2.f100423a;
        }
        m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@m80.k ExecutorService executorService) {
        this();
        g0.p(executorService, "executorService");
        this.f89622d = executorService;
    }
}
