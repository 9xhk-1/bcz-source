package s10;

import e30.r1;
import e30.u1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p10.a1;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class h extends n implements c1 {

    /* renamed from: e, reason: collision with root package name */
    public final Variance f87180e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87181f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87182g;

    /* renamed from: h, reason: collision with root package name */
    public final d30.i<u1> f87183h;

    /* renamed from: i, reason: collision with root package name */
    public final d30.i<e30.c1> f87184i;

    /* renamed from: j, reason: collision with root package name */
    public final d30.n f87185j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements x00.a<u1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d30.n f87186a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f87187b;

        public a(d30.n nVar, a1 a1Var) {
            this.f87186a = nVar;
            this.f87187b = a1Var;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u1 invoke() {
            return new c(h.this, this.f87186a, this.f87187b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements x00.a<e30.c1> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n20.f f87189a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements x00.a<x20.k> {
            public a() {
            }

            @Override // x00.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public x20.k invoke() {
                return x20.x.n("Scope for type parameter " + b.this.f87189a.b(), h.this.getUpperBounds());
            }
        }

        public b(n20.f fVar) {
            this.f87189a = fVar;
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e30.c1 invoke() {
            return e30.u0.o(r1.f48652b.j(), h.this.o(), Collections.EMPTY_LIST, false, new x20.i(new a()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends e30.o {

        /* renamed from: d, reason: collision with root package name */
        public final a1 f87192d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f87193e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k h hVar, d30.n nVar, a1 a1Var) {
            super(nVar);
            if (nVar == null) {
                I(0);
            }
            this.f87193e = hVar;
            this.f87192d = a1Var;
        }

        public static /* synthetic */ void I(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i11 == 2) {
                objArr[1] = "getParameters";
            } else if (i11 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i11 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i11 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i11 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // e30.o
        public void A(@m80.k e30.r0 r0Var) {
            if (r0Var == null) {
                I(6);
            }
            this.f87193e.F0(r0Var);
        }

        @Override // e30.u
        public boolean g(@m80.k p10.d dVar) {
            if (dVar == null) {
                I(9);
            }
            return (dVar instanceof c1) && kotlin.reflect.jvm.internal.impl.resolve.a.f67651a.m(this.f87193e, (c1) dVar, true);
        }

        @Override // e30.u1
        @m80.k
        public List<c1> getParameters() {
            List<c1> list = Collections.EMPTY_LIST;
            if (list == null) {
                I(2);
            }
            return list;
        }

        @Override // e30.o
        @m80.k
        public Collection<e30.r0> p() {
            List<e30.r0> G0 = this.f87193e.G0();
            if (G0 == null) {
                I(1);
            }
            return G0;
        }

        @Override // e30.u1
        @m80.k
        public n10.j q() {
            n10.j m11 = u20.e.m(this.f87193e);
            if (m11 == null) {
                I(4);
            }
            return m11;
        }

        @Override // e30.u, e30.u1
        @m80.k
        public p10.d r() {
            h hVar = this.f87193e;
            if (hVar == null) {
                I(3);
            }
            return hVar;
        }

        @Override // e30.u1
        public boolean s() {
            return true;
        }

        @Override // e30.o
        @m80.l
        public e30.r0 t() {
            return g30.i.d(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        public String toString() {
            return this.f87193e.getName().toString();
        }

        @Override // e30.o
        @m80.k
        public a1 w() {
            a1 a1Var = this.f87192d;
            if (a1Var == null) {
                I(5);
            }
            return a1Var;
        }

        @Override // e30.o
        @m80.k
        public List<e30.r0> y(@m80.k List<e30.r0> list) {
            if (list == null) {
                I(7);
            }
            List<e30.r0> E0 = this.f87193e.E0(list);
            if (E0 == null) {
                I(8);
            }
            return E0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@m80.k d30.n nVar, @m80.k p10.h hVar, @m80.k q10.g gVar, @m80.k n20.f fVar, @m80.k Variance variance, boolean z11, int i11, @m80.k p10.x0 x0Var, @m80.k a1 a1Var) {
        super(hVar, gVar, fVar, x0Var);
        if (nVar == null) {
            C(0);
        }
        if (hVar == null) {
            C(1);
        }
        if (gVar == null) {
            C(2);
        }
        if (fVar == null) {
            C(3);
        }
        if (variance == null) {
            C(4);
        }
        if (x0Var == null) {
            C(5);
        }
        if (a1Var == null) {
            C(6);
        }
        this.f87180e = variance;
        this.f87181f = z11;
        this.f87182g = i11;
        this.f87183h = nVar.f(new a(nVar, a1Var));
        this.f87184i = nVar.f(new b(fVar));
        this.f87185j = nVar;
    }

    private static /* synthetic */ void C(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i12 = 2;
                break;
            case 12:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i11) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @m80.k
    public List<e30.r0> E0(@m80.k List<e30.r0> list) {
        if (list == null) {
            C(12);
        }
        if (list == null) {
            C(13);
        }
        return list;
    }

    public abstract void F0(@m80.k e30.r0 r0Var);

    @Override // p10.c1
    public boolean G() {
        return false;
    }

    @m80.k
    public abstract List<e30.r0> G0();

    @Override // p10.c1
    @m80.k
    public d30.n e0() {
        d30.n nVar = this.f87185j;
        if (nVar == null) {
            C(14);
        }
        return nVar;
    }

    @Override // p10.c1
    public int getIndex() {
        return this.f87182g;
    }

    @Override // p10.c1
    @m80.k
    public List<e30.r0> getUpperBounds() {
        List<e30.r0> c11 = ((c) o()).c();
        if (c11 == null) {
            C(8);
        }
        return c11;
    }

    @Override // p10.c1
    public boolean h() {
        return this.f87181f;
    }

    @Override // p10.c1
    @m80.k
    public Variance j() {
        Variance variance = this.f87180e;
        if (variance == null) {
            C(7);
        }
        return variance;
    }

    @Override // p10.c1, p10.d
    @m80.k
    public final u1 o() {
        u1 invoke = this.f87183h.invoke();
        if (invoke == null) {
            C(9);
        }
        return invoke;
    }

    @Override // p10.d
    @m80.k
    public e30.c1 s() {
        e30.c1 invoke = this.f87184i.invoke();
        if (invoke == null) {
            C(10);
        }
        return invoke;
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.d(this, d11);
    }

    @Override // s10.n
    @m80.k
    public c1 a() {
        c1 c1Var = (c1) super.a();
        if (c1Var == null) {
            C(11);
        }
        return c1Var;
    }
}
