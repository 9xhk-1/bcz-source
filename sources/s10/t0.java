package s10;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.a1;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t0 extends h {

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final x00.l<e30.r0, Void> f87335k;

    /* renamed from: l, reason: collision with root package name */
    public final List<e30.r0> f87336l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f87337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(@m80.k p10.h hVar, @m80.k q10.g gVar, boolean z11, @m80.k Variance variance, @m80.k n20.f fVar, int i11, @m80.k p10.x0 x0Var, @m80.l x00.l<e30.r0, Void> lVar, @m80.k a1 a1Var, @m80.k d30.n nVar) {
        super(nVar, hVar, gVar, fVar, variance, z11, i11, x0Var, a1Var);
        if (hVar == null) {
            C(19);
        }
        if (gVar == null) {
            C(20);
        }
        if (variance == null) {
            C(21);
        }
        if (fVar == null) {
            C(22);
        }
        if (x0Var == null) {
            C(23);
        }
        if (a1Var == null) {
            C(24);
        }
        if (nVar == null) {
            C(25);
        }
        this.f87336l = new ArrayList(1);
        this.f87337m = false;
        this.f87335k = lVar;
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 5 || i11 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 28) ? 2 : 3];
        switch (i11) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i11 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i11 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i11) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 5 && i11 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static t0 K0(@m80.k p10.h hVar, @m80.k q10.g gVar, boolean z11, @m80.k Variance variance, @m80.k n20.f fVar, int i11, @m80.k p10.x0 x0Var, @m80.k d30.n nVar) {
        if (hVar == null) {
            C(6);
        }
        if (gVar == null) {
            C(7);
        }
        if (variance == null) {
            C(8);
        }
        if (fVar == null) {
            C(9);
        }
        if (x0Var == null) {
            C(10);
        }
        if (nVar == null) {
            C(11);
        }
        return L0(hVar, gVar, z11, variance, fVar, i11, x0Var, null, a1.a.f78552a, nVar);
    }

    public static t0 L0(@m80.k p10.h hVar, @m80.k q10.g gVar, boolean z11, @m80.k Variance variance, @m80.k n20.f fVar, int i11, @m80.k p10.x0 x0Var, @m80.l x00.l<e30.r0, Void> lVar, @m80.k a1 a1Var, @m80.k d30.n nVar) {
        if (hVar == null) {
            C(12);
        }
        if (gVar == null) {
            C(13);
        }
        if (variance == null) {
            C(14);
        }
        if (fVar == null) {
            C(15);
        }
        if (x0Var == null) {
            C(16);
        }
        if (a1Var == null) {
            C(17);
        }
        if (nVar == null) {
            C(18);
        }
        return new t0(hVar, gVar, z11, variance, fVar, i11, x0Var, lVar, a1Var, nVar);
    }

    @m80.k
    public static c1 M0(@m80.k p10.h hVar, @m80.k q10.g gVar, boolean z11, @m80.k Variance variance, @m80.k n20.f fVar, int i11, @m80.k d30.n nVar) {
        if (hVar == null) {
            C(0);
        }
        if (gVar == null) {
            C(1);
        }
        if (variance == null) {
            C(2);
        }
        if (fVar == null) {
            C(3);
        }
        if (nVar == null) {
            C(4);
        }
        t0 K0 = K0(hVar, gVar, z11, variance, fVar, i11, p10.x0.f78622a, nVar);
        K0.H0(u20.e.m(hVar).y());
        K0.Q0();
        return K0;
    }

    @Override // s10.h
    public void F0(@m80.k e30.r0 r0Var) {
        if (r0Var == null) {
            C(27);
        }
        x00.l<e30.r0, Void> lVar = this.f87335k;
        if (lVar == null) {
            return;
        }
        lVar.invoke(r0Var);
    }

    @Override // s10.h
    @m80.k
    public List<e30.r0> G0() {
        I0();
        List<e30.r0> list = this.f87336l;
        if (list == null) {
            C(28);
        }
        return list;
    }

    public void H0(@m80.k e30.r0 r0Var) {
        if (r0Var == null) {
            C(26);
        }
        J0();
        N0(r0Var);
    }

    public final void I0() {
        if (this.f87337m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + P0());
    }

    public final void J0() {
        if (this.f87337m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + P0());
        }
    }

    public final void N0(e30.r0 r0Var) {
        if (e30.v0.a(r0Var)) {
            return;
        }
        this.f87336l.add(r0Var);
    }

    public boolean O0() {
        return this.f87337m;
    }

    public final String P0() {
        return getName() + " declared in " + q20.h.m(b());
    }

    public void Q0() {
        J0();
        this.f87337m = true;
    }
}
