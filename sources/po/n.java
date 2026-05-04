package po;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class n implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f81069d = new a() { // from class: po.m
        @Override // po.n.a
        public final void a(Closeable closeable, Throwable th2, Throwable th3) {
            n.a(closeable, th2, th3);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public final a f81070a;

    /* renamed from: b, reason: collision with root package name */
    public final Deque<Closeable> f81071b = new ArrayDeque(4);

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    public Throwable f81072c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public interface a {
        void a(Closeable closeable, Throwable thrown, Throwable suppressed);
    }

    @go.e
    public n(a suppressor) {
        this.f81070a = (a) Preconditions.checkNotNull(suppressor);
    }

    public static /* synthetic */ void a(Closeable closeable, Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return;
        }
        try {
            th2.addSuppressed(th3);
        } catch (Throwable unused) {
            l.f81068a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }

    public static n c() {
        return new n(f81069d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th2 = this.f81072c;
        while (!this.f81071b.isEmpty()) {
            Closeable removeFirst = this.f81071b.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f81070a.a(removeFirst, th2, th3);
                }
            }
        }
        if (this.f81072c != null || th2 == null) {
            return;
        }
        ho.t0.v(th2, IOException.class);
        ho.t0.w(th2);
        throw new AssertionError(th2);
    }

    @d0
    @uo.a
    public <C extends Closeable> C e(@d0 C closeable) {
        if (closeable != null) {
            this.f81071b.addFirst(closeable);
        }
        return closeable;
    }

    public RuntimeException f(Throwable e11) throws IOException {
        Preconditions.checkNotNull(e11);
        this.f81072c = e11;
        ho.t0.v(e11, IOException.class);
        ho.t0.w(e11);
        throw new RuntimeException(e11);
    }

    public <X extends Exception> RuntimeException i(Throwable e11, Class<X> declaredType) throws IOException, Exception {
        Preconditions.checkNotNull(e11);
        this.f81072c = e11;
        ho.t0.v(e11, IOException.class);
        ho.t0.v(e11, declaredType);
        ho.t0.w(e11);
        throw new RuntimeException(e11);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException j(Throwable e11, Class<X1> declaredType1, Class<X2> declaredType2) throws IOException, Exception, Exception {
        Preconditions.checkNotNull(e11);
        this.f81072c = e11;
        ho.t0.v(e11, IOException.class);
        ho.t0.v(e11, declaredType1);
        ho.t0.v(e11, declaredType2);
        ho.t0.w(e11);
        throw new RuntimeException(e11);
    }
}
