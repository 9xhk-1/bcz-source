package lo;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.w1;
import ho.b0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
/* loaded from: classes7.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f71553f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f71554a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f71555b;

    /* renamed from: c, reason: collision with root package name */
    public final l f71556c;

    /* renamed from: d, reason: collision with root package name */
    public final m f71557d;

    /* renamed from: e, reason: collision with root package name */
    public final d f71558e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f71559a = new a();

        public static Logger b(k context) {
            return Logger.getLogger(f.class.getName() + "." + context.b().c());
        }

        public static String c(k context) {
            Method d11 = context.d();
            return "Exception thrown by subscriber method " + d11.getName() + '(' + d11.getParameterTypes()[0].getName() + ") on subscriber " + context.c() + " when dispatching event: " + context.a();
        }

        @Override // lo.l
        public void a(Throwable exception, k context) {
            Logger b11 = b(context);
            Level level = Level.SEVERE;
            if (b11.isLoggable(level)) {
                b11.log(level, c(context), exception);
            }
        }
    }

    public f() {
        this("default");
    }

    public final Executor a() {
        return this.f71555b;
    }

    public void b(Throwable e11, k context) {
        Preconditions.checkNotNull(e11);
        Preconditions.checkNotNull(context);
        try {
            this.f71556c.a(e11, context);
        } catch (Throwable th2) {
            f71553f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, e11), th2);
        }
    }

    public final String c() {
        return this.f71554a;
    }

    public void d(Object event) {
        Iterator<j> f11 = this.f71557d.f(event);
        if (f11.hasNext()) {
            this.f71558e.a(event, f11);
        } else {
            if (event instanceof c) {
                return;
            }
            d(new c(this, event));
        }
    }

    public void e(Object object) {
        this.f71557d.h(object);
    }

    public void f(Object object) {
        this.f71557d.i(object);
    }

    public String toString() {
        return b0.c(this).s(this.f71554a).toString();
    }

    public f(String identifier) {
        this(identifier, w1.c(), d.d(), a.f71559a);
    }

    public f(l exceptionHandler) {
        this("default", w1.c(), d.d(), exceptionHandler);
    }

    public f(String identifier, Executor executor, d dispatcher, l exceptionHandler) {
        this.f71557d = new m(this);
        this.f71554a = (String) Preconditions.checkNotNull(identifier);
        this.f71555b = (Executor) Preconditions.checkNotNull(executor);
        this.f71558e = (d) Preconditions.checkNotNull(dispatcher);
        this.f71556c = (l) Preconditions.checkNotNull(exceptionHandler);
    }
}
