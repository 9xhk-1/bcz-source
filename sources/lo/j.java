package lo;

import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    @Weak
    public f f71562a;

    /* renamed from: b, reason: collision with root package name */
    @go.e
    public final Object f71563b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f71564c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f71565d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static final class b extends j {
        @Override // lo.j
        public void e(Object event) throws InvocationTargetException {
            synchronized (this) {
                super.e(event);
            }
        }

        public b(f bus, Object target, Method method) {
            super(bus, target, method);
        }
    }

    public static /* synthetic */ void a(j jVar, Object obj) {
        jVar.getClass();
        try {
            jVar.e(obj);
        } catch (InvocationTargetException e11) {
            jVar.f71562a.b(e11.getCause(), jVar.b(obj));
        }
    }

    public static j c(f bus, Object listener, Method method) {
        return f(method) ? new j(bus, listener, method) : new b(bus, listener, method);
    }

    public static boolean f(Method method) {
        return method.getAnnotation(lo.a.class) != null;
    }

    public final k b(Object event) {
        return new k(this.f71562a, event, this.f71563b, this.f71564c);
    }

    public final void d(final Object event) {
        this.f71565d.execute(new Runnable() { // from class: lo.i
            @Override // java.lang.Runnable
            public final void run() {
                j.a(j.this, event);
            }
        });
    }

    @go.e
    public void e(Object event) throws InvocationTargetException {
        try {
            this.f71564c.invoke(this.f71563b, Preconditions.checkNotNull(event));
        } catch (IllegalAccessException e11) {
            throw new Error("Method became inaccessible: " + event, e11);
        } catch (IllegalArgumentException e12) {
            throw new Error("Method rejected target/argument: " + event, e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof Error)) {
                throw e13;
            }
            throw ((Error) e13.getCause());
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f71563b == jVar.f71563b && this.f71564c.equals(jVar.f71564c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f71564c.hashCode() + 31) * 31) + System.identityHashCode(this.f71563b);
    }

    public j(f bus, Object target, Method method) {
        this.f71562a = bus;
        this.f71563b = Preconditions.checkNotNull(target);
        this.f71564c = method;
        method.setAccessible(true);
        this.f71565d = bus.a();
    }
}
