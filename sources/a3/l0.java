package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.badlogic.gdx.utils.l<Class, j0> f1575a = new com.badlogic.gdx.utils.l<>();

    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        j0 k11 = f1575a.k(obj.getClass());
        if (k11 == null) {
            return;
        }
        k11.d(obj);
    }

    public static void b(com.badlogic.gdx.utils.a aVar) {
        c(aVar, false);
    }

    public static void c(com.badlogic.gdx.utils.a aVar, boolean z11) {
        if (aVar == null) {
            throw new IllegalArgumentException("objects cannot be null.");
        }
        int i11 = aVar.f13179b;
        j0 j0Var = null;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = aVar.get(i12);
            if (obj != null && (j0Var != null || (j0Var = f1575a.k(obj.getClass())) != null)) {
                j0Var.d(obj);
                if (!z11) {
                    j0Var = null;
                }
            }
        }
    }

    public static <T> j0<T> d(Class<T> cls) {
        return e(cls, 100);
    }

    public static <T> j0<T> e(Class<T> cls, int i11) {
        com.badlogic.gdx.utils.l<Class, j0> lVar = f1575a;
        j0<T> k11 = lVar.k(cls);
        if (k11 != null) {
            return k11;
        }
        p0 p0Var = new p0(cls, 4, i11);
        lVar.r(cls, p0Var);
        return p0Var;
    }

    public static <T> T f(Class<T> cls) {
        return (T) d(cls).h();
    }

    public static <T> void g(Class<T> cls, j0<T> j0Var) {
        f1575a.r(cls, j0Var);
    }
}
