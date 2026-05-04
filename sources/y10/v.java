package y10;

import java.util.HashMap;
import java.util.Map;
import p10.o1;
import t10.a;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p10.p f99115a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final p10.p f99116b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final p10.p f99117c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Map<o1, p10.p> f99118d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends p10.m {
        public a(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "from";
            } else if (i11 == 2) {
                objArr[0] = "fromPackage";
            } else if (i11 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i11 == 2 || i11 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            return v.d(lVar, hVar2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends p10.m {
        public b(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            return v.e(hVar, lVar, hVar2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends p10.m {
        public c(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            return v.e(hVar, lVar, hVar2);
        }
    }

    static {
        a aVar = new a(a.C1171a.f89204c);
        f99115a = aVar;
        b bVar = new b(a.c.f89206c);
        f99116b = bVar;
        c cVar = new c(a.b.f89205c);
        f99117c = cVar;
        f99118d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    public static /* synthetic */ void a(int i11) {
        String str = (i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = n.r.f98264f;
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i11 == 5 || i11 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i11 == 2 || i11 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i11 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i11 != 5 && i11 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static boolean d(@m80.k p10.h hVar, @m80.k p10.h hVar2) {
        if (hVar == null) {
            a(2);
        }
        if (hVar2 == null) {
            a(3);
        }
        p10.g0 g0Var = (p10.g0) q20.h.r(hVar, p10.g0.class, false);
        p10.g0 g0Var2 = (p10.g0) q20.h.r(hVar2, p10.g0.class, false);
        return (g0Var2 == null || g0Var == null || !g0Var.d().equals(g0Var2.d())) ? false : true;
    }

    public static boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2) {
        if (lVar == null) {
            a(0);
        }
        if (hVar2 == null) {
            a(1);
        }
        if (d(q20.h.M(lVar), hVar2)) {
            return true;
        }
        return p10.o.f78588c.e(hVar, lVar, hVar2, false);
    }

    public static void f(p10.p pVar) {
        f99118d.put(pVar.b(), pVar);
    }

    @m80.k
    public static p10.p g(@m80.k o1 o1Var) {
        if (o1Var == null) {
            a(4);
        }
        p10.p pVar = f99118d.get(o1Var);
        if (pVar != null) {
            return pVar;
        }
        p10.p j11 = p10.o.j(o1Var);
        if (j11 == null) {
            a(5);
        }
        return j11;
    }
}
