package qq;

import java.lang.reflect.Modifier;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f82639a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f82640b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f82641c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f82642d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82643e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82644f;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Class<?> f82645a;

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f82646b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82647c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f82648d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f82649e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f82650f;

        public c a() {
            Class<?> cls = this.f82645a;
            if (cls == null) {
                throw new IllegalArgumentException("the interface parameter cannot be NULL");
            }
            Class<?> cls2 = this.f82646b;
            if (cls2 == null) {
                Object obj = this.f82647c;
                if (obj == null) {
                    throw new IllegalArgumentException("the clazz or object parameter must set one");
                }
                c cVar = new c(cls, obj);
                cVar.f82642d = this.f82648d;
                return cVar;
            }
            if (cls2.isInterface() || !Modifier.isPublic(this.f82646b.getModifiers())) {
                throw new IllegalArgumentException("the clazz parameter cant be interface type or not public");
            }
            c cVar2 = new c((Class) this.f82645a, (Class) this.f82646b);
            cVar2.f82642d = this.f82648d;
            cVar2.f82643e = this.f82649e;
            cVar2.f82644f = this.f82650f;
            return cVar2;
        }

        public b b(boolean z11) {
            this.f82650f = z11;
            return this;
        }

        public b c(boolean z11) {
            this.f82649e = z11;
            return this;
        }

        public b d(boolean z11) {
            this.f82648d = z11;
            return this;
        }

        public b e(Class<?> cls) {
            this.f82646b = cls;
            return this;
        }

        public b f(Class<?> cls) {
            this.f82645a = cls;
            return this;
        }

        public b g(Object obj) {
            this.f82647c = obj;
            return this;
        }
    }

    public c(Class<?> cls, Class<?> cls2) {
        this.f82639a = cls;
        this.f82640b = cls2;
        this.f82641c = null;
    }

    public static b c(Class<?> cls) {
        return new b().f(cls).e(cls).d(cls.isAnnotationPresent(nq.c.class)).c(cls.isAnnotationPresent(nq.b.class)).b(cls.isAnnotationPresent(nq.a.class));
    }

    public static b d(Class<?> cls, Class<?> cls2) {
        return new b().f(cls).e(cls2).d(cls2.isAnnotationPresent(nq.c.class)).c(cls2.isAnnotationPresent(nq.b.class)).b(cls2.isAnnotationPresent(nq.a.class));
    }

    public static b e(Class<?> cls, Object obj) {
        return new b().f(cls).g(obj).d(true).c(cls.isAnnotationPresent(nq.b.class)).b(cls.isAnnotationPresent(nq.a.class));
    }

    public Object g() {
        return this.f82641c;
    }

    public Class<?> h() {
        return this.f82639a;
    }

    public Class<?> i() {
        return this.f82640b;
    }

    public boolean j() {
        return this.f82644f;
    }

    public boolean k() {
        return this.f82643e;
    }

    public boolean l() {
        return this.f82642d;
    }

    public c(Class<?> cls, Object obj) {
        this.f82639a = cls;
        this.f82640b = null;
        this.f82641c = obj;
    }
}
