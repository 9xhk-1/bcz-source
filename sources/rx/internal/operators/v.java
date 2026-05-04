package rx.internal.operators;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f86149a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f86150b = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Serializable {
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Serializable {
        private static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f86151a;

        public c(Throwable th2) {
            this.f86151a = th2;
        }

        public String toString() {
            return "Notification=>Error:" + this.f86151a;
        }
    }

    public static <T> boolean a(qb0.c<? super T> cVar, Object obj) {
        if (obj == f86149a) {
            cVar.onCompleted();
            return true;
        }
        if (obj == f86150b) {
            cVar.onNext(null);
            return false;
        }
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == c.class) {
            cVar.onError(((c) obj).f86151a);
            return true;
        }
        cVar.onNext(obj);
        return false;
    }

    public static Object b() {
        return f86149a;
    }

    public static Object c(Throwable th2) {
        return new c(th2);
    }

    public static Throwable d(Object obj) {
        return ((c) obj).f86151a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T e(Object obj) {
        if (obj == f86150b) {
            return null;
        }
        return obj;
    }

    public static boolean f(Object obj) {
        return obj == f86149a;
    }

    public static boolean g(Object obj) {
        return obj instanceof c;
    }

    public static boolean h(Object obj) {
        return (obj == null || g(obj) || f(obj)) ? false : true;
    }

    public static boolean i(Object obj) {
        return obj == f86150b;
    }

    public static <T> Object j(T t11) {
        return t11 == null ? f86150b : t11;
    }
}
