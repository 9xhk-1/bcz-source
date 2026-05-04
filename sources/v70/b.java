package v70;

import androidx.camera.view.q;
import b80.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.concurrent.Cancellable;
import x70.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b<T, C, E extends b80.e<T, C>> implements Cancellable {

    /* renamed from: a, reason: collision with root package name */
    public final T f93216a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f93217b;

    /* renamed from: c, reason: collision with root package name */
    public final long f93218c;

    /* renamed from: d, reason: collision with root package name */
    public final long f93219d;

    /* renamed from: e, reason: collision with root package name */
    public final u60.a<E> f93220e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<l> f93221f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f93222g;

    /* renamed from: h, reason: collision with root package name */
    public volatile E f93223h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Exception f93224i;

    public b(T t11, Object obj, long j11, long j12, u60.a<E> aVar) {
        this.f93216a = t11;
        this.f93217b = obj;
        this.f93218c = j11;
        this.f93219d = j12 > 0 ? System.currentTimeMillis() + j12 : Long.MAX_VALUE;
        this.f93220e = aVar;
        this.f93221f = new AtomicReference<>(null);
        this.f93222g = new AtomicBoolean(false);
    }

    public void a(l lVar) {
        e80.b.a(q.a(this.f93221f, null, lVar), "Session request has already been set");
    }

    public void b(Exception exc) {
        if (this.f93222g.compareAndSet(false, true)) {
            this.f93224i = exc;
        }
    }

    public void c(E e11) {
        if (this.f93222g.compareAndSet(false, true)) {
            this.f93223h = e11;
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        boolean compareAndSet = this.f93222g.compareAndSet(false, true);
        l andSet = this.f93221f.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
        }
        return compareAndSet;
    }

    public long e() {
        return this.f93218c;
    }

    public long f() {
        return this.f93219d;
    }

    public u60.a<E> g() {
        return this.f93220e;
    }

    public E i() {
        return this.f93223h;
    }

    public boolean isDone() {
        return this.f93222g.get();
    }

    public T j() {
        return this.f93216a;
    }

    public Object k() {
        return this.f93217b;
    }

    public Exception m() {
        return this.f93224i;
    }

    public String toString() {
        return "[" + this.f93216a + "][" + this.f93217b + "]";
    }
}
