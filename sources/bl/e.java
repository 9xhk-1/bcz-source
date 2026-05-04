package bl;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import cl.p;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import fl.o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e<R> implements c<R>, f<R> {

    /* renamed from: k, reason: collision with root package name */
    public static final a f6924k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6926b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6927c;

    /* renamed from: d, reason: collision with root package name */
    public final a f6928d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public R f6929e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public d f6930f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f6931g;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f6932h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f6933i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public GlideException f6934j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j11) throws InterruptedException {
            obj.wait(j11);
        }
    }

    public e(int i11, int i12) {
        this(i11, i12, true, f6924k);
    }

    @Override // bl.f
    public synchronized boolean a(@Nullable GlideException glideException, Object obj, p<R> pVar, boolean z11) {
        this.f6933i = true;
        this.f6934j = glideException;
        this.f6928d.a(this);
        return false;
    }

    @Override // bl.f
    public synchronized boolean b(R r11, Object obj, p<R> pVar, DataSource dataSource, boolean z11) {
        this.f6932h = true;
        this.f6929e = r11;
        this.f6928d.a(this);
        return false;
    }

    public final synchronized R c(Long l11) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f6927c && !isDone()) {
                o.a();
            }
            if (this.f6931g) {
                throw new CancellationException();
            }
            if (this.f6933i) {
                throw new ExecutionException(this.f6934j);
            }
            if (this.f6932h) {
                return this.f6929e;
            }
            if (l11 == null) {
                this.f6928d.b(this, 0L);
            } else if (l11.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l11.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f6928d.b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f6933i) {
                throw new ExecutionException(this.f6934j);
            }
            if (this.f6931g) {
                throw new CancellationException();
            }
            if (!this.f6932h) {
                throw new TimeoutException();
            }
            return this.f6929e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f6931g = true;
                this.f6928d.a(this);
                d dVar = null;
                if (z11) {
                    d dVar2 = this.f6930f;
                    this.f6930f = null;
                    dVar = dVar2;
                }
                if (dVar != null) {
                    dVar.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cl.p
    @Nullable
    public synchronized d f() {
        return this.f6930f;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return c(null);
        } catch (TimeoutException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // cl.p
    public synchronized void h(@NonNull R r11, @Nullable dl.f<? super R> fVar) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f6931g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z11;
        if (!this.f6931g && !this.f6932h) {
            z11 = this.f6933i;
        }
        return z11;
    }

    @Override // cl.p
    public void j(@NonNull cl.o oVar) {
        oVar.e(this.f6925a, this.f6926b);
    }

    @Override // cl.p
    public synchronized void k(@Nullable d dVar) {
        this.f6930f = dVar;
    }

    @Override // cl.p
    public synchronized void m(@Nullable Drawable drawable) {
    }

    public String toString() {
        d dVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                dVar = null;
                if (this.f6931g) {
                    str = "CANCELLED";
                } else if (this.f6933i) {
                    str = "FAILURE";
                } else if (this.f6932h) {
                    str = com.alipay.sdk.m.f0.c.f10532p;
                } else {
                    str = "PENDING";
                    dVar = this.f6930f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + dVar + "]]";
    }

    public e(int i11, int i12, boolean z11, a aVar) {
        this.f6925a = i11;
        this.f6926b = i12;
        this.f6927c = z11;
        this.f6928d = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return c(Long.valueOf(timeUnit.toMillis(j11)));
    }

    @Override // yk.l
    public void onDestroy() {
    }

    @Override // yk.l
    public void onStart() {
    }

    @Override // yk.l
    public void onStop() {
    }

    @Override // cl.p
    public void g(@NonNull cl.o oVar) {
    }

    @Override // cl.p
    public void i(@Nullable Drawable drawable) {
    }

    @Override // cl.p
    public void l(@Nullable Drawable drawable) {
    }
}
