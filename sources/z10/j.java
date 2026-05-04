package z10;

import f20.q;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f100618a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements j {
        public static /* synthetic */ void f(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i11) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // z10.j
        public void a(@m80.k q qVar, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
            if (qVar == null) {
                f(1);
            }
            if (gVar == null) {
                f(2);
            }
        }

        @Override // z10.j
        public void b(@m80.k f20.g gVar, @m80.k p10.b bVar) {
            if (gVar == null) {
                f(7);
            }
            if (bVar == null) {
                f(8);
            }
        }

        @Override // z10.j
        public void c(@m80.k f20.l lVar, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.c cVar) {
            if (lVar == null) {
                f(3);
            }
            if (cVar == null) {
                f(4);
            }
        }

        @Override // z10.j
        @m80.l
        public p10.b d(@m80.k n20.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // z10.j
        public void e(@m80.k f20.n nVar, @m80.k q0 q0Var) {
            if (nVar == null) {
                f(5);
            }
            if (q0Var == null) {
                f(6);
            }
        }
    }

    void a(@m80.k q qVar, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.g gVar);

    void b(@m80.k f20.g gVar, @m80.k p10.b bVar);

    void c(@m80.k f20.l lVar, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.c cVar);

    @m80.l
    p10.b d(@m80.k n20.c cVar);

    void e(@m80.k f20.n nVar, @m80.k q0 q0Var);
}
