package rx.internal.util;

import java.util.Queue;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.v;
import rx.internal.util.unsafe.n0;
import rx.internal.util.unsafe.r;
import rx.internal.util.unsafe.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j implements qb0.h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f86718d;

    /* renamed from: a, reason: collision with root package name */
    public Queue<Object> f86719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86720b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f86721c;

    static {
        int i11 = i.b() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i11 = Integer.parseInt(property);
            } catch (NumberFormatException e11) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e11.getMessage());
            }
        }
        f86718d = i11;
    }

    public j(Queue<Object> queue, int i11) {
        this.f86719a = queue;
        this.f86720b = i11;
    }

    public static j f() {
        return n0.f() ? new j(true, f86718d) : new j();
    }

    public static j g() {
        return n0.f() ? new j(false, f86718d) : new j();
    }

    public Object C() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f86719a;
                if (queue == null) {
                    return null;
                }
                Object peek = queue.peek();
                Object obj = this.f86721c;
                if (peek == null && obj != null && queue.peek() == null) {
                    peek = obj;
                }
                return peek;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object D() {
        synchronized (this) {
            try {
                Queue<Object> queue = this.f86719a;
                if (queue == null) {
                    return null;
                }
                Object poll = queue.poll();
                Object obj = this.f86721c;
                if (poll == null && obj != null && queue.peek() == null) {
                    this.f86721c = null;
                    poll = obj;
                }
                return poll;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void E() {
    }

    public boolean a(Object obj, qb0.c cVar) {
        return v.a(cVar, obj);
    }

    public Throwable b(Object obj) {
        return v.d(obj);
    }

    public int c() {
        return this.f86720b - e();
    }

    public int d() {
        return this.f86720b;
    }

    public int e() {
        Queue<Object> queue = this.f86719a;
        if (queue == null) {
            return 0;
        }
        return queue.size();
    }

    public Object h(Object obj) {
        return v.e(obj);
    }

    public boolean i(Object obj) {
        return v.f(obj);
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f86719a == null;
    }

    public boolean j() {
        Queue<Object> queue = this.f86719a;
        return queue == null || queue.isEmpty();
    }

    public boolean k(Object obj) {
        return v.g(obj);
    }

    public void n() {
        if (this.f86721c == null) {
            this.f86721c = v.b();
        }
    }

    public void q(Throwable th2) {
        if (this.f86721c == null) {
            this.f86721c = v.c(th2);
        }
    }

    public void r(Object obj) throws MissingBackpressureException {
        boolean z11;
        boolean z12;
        synchronized (this) {
            try {
                Queue<Object> queue = this.f86719a;
                z11 = true;
                z12 = false;
                if (queue != null) {
                    z11 = false;
                    z12 = !queue.offer(v.j(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z12) {
            throw new MissingBackpressureException();
        }
    }

    @Override // qb0.h
    public void unsubscribe() {
        E();
    }

    public j(boolean z11, int i11) {
        this.f86719a = z11 ? new r<>(i11) : new z<>(i11);
        this.f86720b = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j() {
        /*
            r2 = this;
            rx.internal.util.atomic.d r0 = new rx.internal.util.atomic.d
            int r1 = rx.internal.util.j.f86718d
            r0.<init>(r1)
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.j.<init>():void");
    }
}
