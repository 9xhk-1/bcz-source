package u60;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.concurrent.Cancellable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a<T> implements Future<T>, Cancellable {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f91872a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f91873b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f91874c;

    /* renamed from: d, reason: collision with root package name */
    public volatile T f91875d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Exception f91876e;

    public a(b<T> bVar) {
        this.f91872a = bVar;
    }

    private T getResult() throws ExecutionException {
        if (this.f91876e != null) {
            throw new ExecutionException(this.f91876e);
        }
        if (this.f91874c) {
            throw new CancellationException();
        }
        return this.f91875d;
    }

    public boolean a(T t11) {
        synchronized (this) {
            try {
                if (this.f91873b) {
                    return false;
                }
                this.f91873b = true;
                this.f91875d = t11;
                notifyAll();
                b<T> bVar = this.f91872a;
                if (bVar != null) {
                    bVar.c(t11);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean c(Exception exc) {
        synchronized (this) {
            try {
                if (this.f91873b) {
                    return false;
                }
                this.f91873b = true;
                this.f91876e = exc;
                notifyAll();
                b<T> bVar = this.f91872a;
                if (bVar != null) {
                    bVar.b(exc);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        synchronized (this) {
            try {
                if (this.f91873b) {
                    return false;
                }
                this.f91873b = true;
                this.f91874c = true;
                notifyAll();
                b<T> bVar = this.f91872a;
                if (bVar != null) {
                    bVar.a();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public synchronized T get() throws InterruptedException, ExecutionException {
        while (!this.f91873b) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return getResult();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f91874c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f91873b;
    }

    @Override // java.util.concurrent.Future
    public synchronized T get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        e80.a.j(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j11);
        long currentTimeMillis = millis <= 0 ? 0L : System.currentTimeMillis();
        if (this.f91873b) {
            return getResult();
        }
        if (millis > 0) {
            long j12 = millis;
            do {
                wait(j12);
                if (this.f91873b) {
                    return getResult();
                }
                j12 = millis - (System.currentTimeMillis() - currentTimeMillis);
            } while (j12 > 0);
            throw new TimeoutException();
        }
        throw new TimeoutException();
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        return cancel(true);
    }
}
