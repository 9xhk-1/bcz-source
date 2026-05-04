package com.igexin.c.a.d;

import androidx.media3.common.C;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.c.a.d.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class e<E extends f> {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f37213h = true;

    /* renamed from: i, reason: collision with root package name */
    private static final String f37214i = "ScheduleQueue";

    /* renamed from: a, reason: collision with root package name */
    final transient ReentrantLock f37215a;

    /* renamed from: b, reason: collision with root package name */
    final transient Condition f37216b;

    /* renamed from: c, reason: collision with root package name */
    final TreeSet<E> f37217c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicInteger f37218d;

    /* renamed from: e, reason: collision with root package name */
    int f37219e;

    /* renamed from: f, reason: collision with root package name */
    g f37220f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f37221g;

    /* renamed from: j, reason: collision with root package name */
    private long f37222j;

    public e(Comparator<? super E> comparator, g gVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f37215a = reentrantLock;
        this.f37216b = reentrantLock.newCondition();
        this.f37218d = new AtomicInteger(0);
        this.f37221g = new AtomicLong(-1L);
        this.f37217c = new TreeSet<>(comparator);
        this.f37220f = gVar;
    }

    private E b() {
        try {
            return this.f37217c.first();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    private E c() {
        E b11 = b();
        if (b11 == null) {
            return null;
        }
        if (this.f37217c.remove(b11)) {
            return b11;
        }
        com.igexin.c.a.c.a.a(f37214i, "Queue Poll Error@");
        return null;
    }

    /* JADX WARN: Finally extract failed */
    private E d() {
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lock();
        try {
            E b11 = b();
            if (b11 != null) {
                if (b11.a(TimeUnit.MILLISECONDS) > 0) {
                    b11.N |= C.BUFFER_FLAG_FIRST_SAMPLE;
                } else {
                    b11.N &= 1090519038;
                }
                if (b11.N >= 0) {
                    E c11 = c();
                    if (!f37213h && c11 == null) {
                        throw new AssertionError();
                    }
                    if (!e()) {
                        this.f37216b.signalAll();
                    }
                    reentrantLock.unlock();
                    return c11;
                }
            }
            reentrantLock.unlock();
            return null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private boolean e() {
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lock();
        try {
            return this.f37217c.isEmpty();
        } finally {
            reentrantLock.unlock();
        }
    }

    private void f() {
        this.f37217c.clear();
    }

    public final int a(E e11, long j11, TimeUnit timeUnit) {
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lock();
        try {
            if (!this.f37217c.contains(e11)) {
                reentrantLock.unlock();
                return -1;
            }
            this.f37217c.remove(e11);
            e11.f37234w = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(j11, timeUnit);
            e11.hashCode();
            e11.a(TimeUnit.SECONDS);
            return a((e<E>) e11) ? 1 : -2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final E a() throws InterruptedException {
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E b11 = b();
                boolean z11 = true;
                if (b11 != null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a11 = b11.a(timeUnit);
                    if (!b11.f37224m && !b11.f37225n) {
                        z11 = false;
                    }
                    if (a11 <= 0 || z11) {
                        break;
                    }
                    b11.hashCode();
                    TimeUnit.SECONDS.convert(a11, timeUnit);
                    this.f37221g.set(b11.f37234w);
                    com.igexin.c.a.c.a.a("schedule take|needAlarm = " + this.f37220f.D + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + b11.getClass().getName() + EmailAutoCompleteEditText.f17091d + b11.hashCode(), new Object[0]);
                    if (this.f37220f.D) {
                        this.f37220f.a(b11.f37234w);
                    }
                    this.f37216b.awaitNanos(a11);
                } else {
                    this.f37218d.set(1);
                    this.f37219e = 0;
                    this.f37216b.await();
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        E c11 = c();
        if (!f37213h && c11 == null) {
            throw new AssertionError();
        }
        if (!e()) {
            this.f37216b.signalAll();
        }
        if (this.f37222j > 0) {
            System.currentTimeMillis();
        }
        this.f37221g.set(-1L);
        reentrantLock.unlock();
        return c11;
    }

    public final boolean b(E e11) {
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lock();
        try {
            if (this.f37217c.contains(e11) && this.f37217c.remove(e11)) {
                return a((e<E>) e11);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c(E e11) {
        if (e11 == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lock();
        try {
            if (!this.f37217c.contains(e11) || !this.f37217c.remove(e11)) {
                return false;
            }
            e11.hashCode();
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean a(E e11) {
        if (e11 == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lock();
        try {
            E b11 = b();
            int i11 = this.f37219e + 1;
            this.f37219e = i11;
            e11.f37235x = i11;
            if (!this.f37217c.add(e11)) {
                e11.f37235x--;
                return false;
            }
            e11.N = (e11.N + 1) & 1090519038;
            if (b11 == null || this.f37217c.comparator().compare(e11, b11) < 0) {
                this.f37216b.signalAll();
            }
            return true;
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
            com.igexin.c.a.c.a.a("ScheduleQueue|offer|error", new Object[0]);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean a(Class cls) {
        if (cls == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f37215a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = this.f37217c.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (next.getClass() == cls) {
                    arrayList.add(next);
                }
            }
            arrayList.size();
            this.f37217c.removeAll(arrayList);
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
