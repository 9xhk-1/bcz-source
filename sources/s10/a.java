package s10;

import e30.c1;
import e30.d2;
import e30.f2;
import e30.h2;
import java.util.Collections;
import java.util.List;
import p10.b1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a extends z {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f87135f = false;

    /* renamed from: b, reason: collision with root package name */
    public final n20.f f87136b;

    /* renamed from: c, reason: collision with root package name */
    public final d30.i<c1> f87137c;

    /* renamed from: d, reason: collision with root package name */
    public final d30.i<x20.k> f87138d;

    /* renamed from: e, reason: collision with root package name */
    public final d30.i<p10.t0> f87139e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: s10.a$a, reason: collision with other inner class name */
    public class C1120a implements x00.a<c1> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: s10.a$a$a, reason: collision with other inner class name */
        public class C1121a implements x00.l<f30.g, c1> {
            public C1121a() {
            }

            @Override // x00.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c1 invoke(f30.g gVar) {
                p10.d f11 = gVar.f(a.this);
                return f11 == null ? a.this.f87137c.invoke() : f11 instanceof b1 ? e30.u0.c((b1) f11, h2.g(f11.o().getParameters())) : f11 instanceof z ? h2.u(f11.o().d(gVar), ((z) f11).V(gVar), this) : f11.s();
            }
        }

        public C1120a() {
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c1 invoke() {
            a aVar = a.this;
            return h2.v(aVar, aVar.J(), new C1121a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements x00.a<x20.k> {
        public b() {
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x20.k invoke() {
            return new x20.g(a.this.J());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements x00.a<p10.t0> {
        public c() {
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p10.t0 invoke() {
            return new t(a.this);
        }
    }

    public a(@m80.k d30.n nVar, @m80.k n20.f fVar) {
        if (nVar == null) {
            p0(0);
        }
        if (fVar == null) {
            p0(1);
        }
        this.f87136b = fVar;
        this.f87137c = nVar.f(new C1120a());
        this.f87138d = nVar.f(new b());
        this.f87139e = nVar.f(new c());
    }

    private static /* synthetic */ void p0(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i11 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i11 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i11 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i11 == 19) {
            objArr[1] = "substitute";
        } else if (i11 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6 && i11 != 9 && i11 != 12 && i11 != 14 && i11 != 16 && i11 != 17 && i11 != 19 && i11 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // s10.z
    @m80.k
    public x20.k C(@m80.k d2 d2Var, @m80.k f30.g gVar) {
        if (d2Var == null) {
            p0(10);
        }
        if (gVar == null) {
            p0(11);
        }
        if (!d2Var.f()) {
            return new x20.t(V(gVar), f2.g(d2Var));
        }
        x20.k V = V(gVar);
        if (V == null) {
            p0(12);
        }
        return V;
    }

    @Override // p10.z0
    @m80.k
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public p10.b c(@m80.k f2 f2Var) {
        if (f2Var == null) {
            p0(18);
        }
        return f2Var.k() ? this : new y(this, f2Var);
    }

    @Override // p10.b
    @m80.k
    public x20.k I() {
        x20.k invoke = this.f87138d.invoke();
        if (invoke == null) {
            p0(4);
        }
        return invoke;
    }

    @Override // p10.b
    @m80.k
    public x20.k J() {
        x20.k V = V(u20.e.r(q20.h.g(this)));
        if (V == null) {
            p0(17);
        }
        return V;
    }

    @Override // p10.b
    @m80.k
    public x20.k K(@m80.k d2 d2Var) {
        if (d2Var == null) {
            p0(15);
        }
        x20.k C = C(d2Var, u20.e.r(q20.h.g(this)));
        if (C == null) {
            p0(16);
        }
        return C;
    }

    @Override // p10.b
    @m80.k
    public p10.t0 W() {
        p10.t0 invoke = this.f87139e.invoke();
        if (invoke == null) {
            p0(5);
        }
        return invoke;
    }

    @Override // p10.c0
    @m80.k
    public n20.f getName() {
        n20.f fVar = this.f87136b;
        if (fVar == null) {
            p0(2);
        }
        return fVar;
    }

    @Override // p10.b
    @m80.k
    public List<p10.t0> l0() {
        List<p10.t0> list = Collections.EMPTY_LIST;
        if (list == null) {
            p0(6);
        }
        return list;
    }

    @Override // p10.b, p10.d
    @m80.k
    public c1 s() {
        c1 invoke = this.f87137c.invoke();
        if (invoke == null) {
            p0(20);
        }
        return invoke;
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.i(this, d11);
    }

    @Override // s10.z, p10.h
    @m80.k
    public p10.b a() {
        return this;
    }
}
