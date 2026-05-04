package k80;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f66007a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor<?> f66008b;

    /* renamed from: c, reason: collision with root package name */
    public final i80.c f66009c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f66010d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k80.a$a, reason: collision with other inner class name */
    public class RunnableC0763a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f66011a;

        public RunnableC0763a(c cVar) {
            this.f66011a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f66011a.run();
            } catch (Exception e11) {
                try {
                    Object newInstance = a.this.f66008b.newInstance(e11);
                    if (newInstance instanceof g) {
                        ((g) newInstance).a(a.this.f66010d);
                    }
                    a.this.f66009c.q(newInstance);
                } catch (Exception e12) {
                    a.this.f66009c.h().b(Level.SEVERE, "Original exception:", e11);
                    throw new RuntimeException("Could not create failure event", e12);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Executor f66013a;

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f66014b;

        /* renamed from: c, reason: collision with root package name */
        public i80.c f66015c;

        public /* synthetic */ b(RunnableC0763a runnableC0763a) {
            this();
        }

        public a a() {
            return b(null);
        }

        public a b(Object obj) {
            if (this.f66015c == null) {
                this.f66015c = i80.c.f();
            }
            if (this.f66013a == null) {
                this.f66013a = Executors.newCachedThreadPool();
            }
            if (this.f66014b == null) {
                this.f66014b = h.class;
            }
            return new a(this.f66013a, this.f66015c, this.f66014b, obj, null);
        }

        public b c(i80.c cVar) {
            this.f66015c = cVar;
            return this;
        }

        public b d(Class<?> cls) {
            this.f66014b = cls;
            return this;
        }

        public b e(Executor executor) {
            this.f66013a = executor;
            return this;
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void run() throws Exception;
    }

    public /* synthetic */ a(Executor executor, i80.c cVar, Class cls, Object obj, RunnableC0763a runnableC0763a) {
        this(executor, cVar, cls, obj);
    }

    public static b d() {
        return new b(null);
    }

    public static a e() {
        return new b(null).a();
    }

    public void f(c cVar) {
        this.f66007a.execute(new RunnableC0763a(cVar));
    }

    public a(Executor executor, i80.c cVar, Class<?> cls, Object obj) {
        this.f66007a = executor;
        this.f66009c = cVar;
        this.f66010d = obj;
        try {
            this.f66008b = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e11);
        }
    }
}
