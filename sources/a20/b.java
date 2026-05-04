package a20;

import a00.h0;
import e30.r0;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import m80.k;
import m80.l;
import p10.x0;
import s10.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b extends i implements a {
    public static final /* synthetic */ boolean I = false;
    public Boolean G;
    public Boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k p10.b bVar, @l b bVar2, @k q10.g gVar, boolean z11, @k CallableMemberDescriptor.Kind kind, @k x0 x0Var) {
        super(bVar, bVar2, gVar, z11, kind, x0Var);
        if (bVar == null) {
            C(0);
        }
        if (gVar == null) {
            C(1);
        }
        if (kind == null) {
            C(2);
        }
        if (x0Var == null) {
            C(3);
        }
        this.G = null;
        this.H = null;
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 11 || i11 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 11 || i11 == 18) ? 2 : 3];
        switch (i11) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i11 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 11 && i11 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @k
    public static b o1(@k p10.b bVar, @k q10.g gVar, boolean z11, @k x0 x0Var) {
        if (bVar == null) {
            C(4);
        }
        if (gVar == null) {
            C(5);
        }
        if (x0Var == null) {
            C(6);
        }
        return new b(bVar, null, gVar, z11, CallableMemberDescriptor.Kind.DECLARATION, x0Var);
    }

    @Override // s10.s
    public boolean L0() {
        return this.G.booleanValue();
    }

    @Override // s10.s
    public void T0(boolean z11) {
        this.G = Boolean.valueOf(z11);
    }

    @Override // s10.s
    public void U0(boolean z11) {
        this.H = Boolean.valueOf(z11);
    }

    @k
    public b n1(@k p10.b bVar, @l b bVar2, @k CallableMemberDescriptor.Kind kind, @k x0 x0Var, @k q10.g gVar) {
        if (bVar == null) {
            C(12);
        }
        if (kind == null) {
            C(13);
        }
        if (x0Var == null) {
            C(14);
        }
        if (gVar == null) {
            C(15);
        }
        return new b(bVar, bVar2, gVar, this.E, kind, x0Var);
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean o0() {
        return this.H.booleanValue();
    }

    @Override // s10.i
    @k
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public b j1(@k p10.h hVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @k CallableMemberDescriptor.Kind kind, @l n20.f fVar, @k q10.g gVar, @k x0 x0Var) {
        if (hVar == null) {
            C(7);
        }
        if (kind == null) {
            C(8);
        }
        if (gVar == null) {
            C(9);
        }
        if (x0Var == null) {
            C(10);
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            b n12 = n1((p10.b) hVar, (b) eVar, kind, x0Var, gVar);
            n12.T0(L0());
            n12.U0(o0());
            return n12;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + hVar + "\nkind: " + kind);
    }

    @Override // a20.a
    @k
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public b z(@l r0 r0Var, @k List<r0> list, @k r0 r0Var2, @l Pair<a.InterfaceC0792a<?>, ?> pair) {
        if (list == null) {
            C(16);
        }
        if (r0Var2 == null) {
            C(17);
        }
        b j12 = j1(b(), null, getKind(), null, getAnnotations(), getSource());
        j12.M0(r0Var == null ? null : q20.g.i(j12, r0Var, q10.g.A0.b()), d0(), h0.J(), getTypeParameters(), h.a(list, g(), j12), r0Var2, k(), getVisibility());
        if (pair != null) {
            j12.P0(pair.getFirst(), pair.getSecond());
        }
        return j12;
    }
}
