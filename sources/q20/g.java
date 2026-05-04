package q20;

import e30.c1;
import e30.c2;
import e30.r0;
import e30.r1;
import e30.u0;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.a0;
import p10.q0;
import p10.t0;
import p10.x0;
import q10.g;
import s10.k0;
import s10.l0;
import s10.m0;
import s10.n0;
import s10.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends s10.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k p10.b bVar, @m80.k x0 x0Var, boolean z11) {
            super(bVar, null, q10.g.A0.b(), true, CallableMemberDescriptor.Kind.DECLARATION, x0Var);
            if (bVar == null) {
                C(0);
            }
            if (x0Var == null) {
                C(1);
            }
            l1(Collections.EMPTY_LIST, h.k(bVar, z11));
        }

        private static /* synthetic */ void C(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static /* synthetic */ void a(int i11) {
        String str = (i11 == 12 || i11 == 23 || i11 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 12 || i11 == 23 || i11 == 25) ? 2 : 3];
        switch (i11) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i11 == 12) {
            objArr[1] = "createSetter";
        } else if (i11 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i11 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 12 && i11 != 23 && i11 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @m80.l
    public static t0 b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @m80.l r0 r0Var, @m80.l n20.f fVar, @m80.k q10.g gVar, int i11) {
        if (aVar == null) {
            a(32);
        }
        if (gVar == null) {
            a(33);
        }
        if (r0Var == null) {
            return null;
        }
        return new n0(aVar, new y20.c(aVar, r0Var, fVar, null), gVar, n20.g.a(i11));
    }

    @m80.l
    public static t0 c(@m80.k p10.b bVar, @m80.l r0 r0Var, @m80.l n20.f fVar, @m80.k q10.g gVar, int i11) {
        if (bVar == null) {
            a(34);
        }
        if (gVar == null) {
            a(35);
        }
        if (r0Var == null) {
            return null;
        }
        return new n0(bVar, new y20.b(bVar, r0Var, fVar, null), gVar, n20.g.a(i11));
    }

    @m80.k
    public static l0 d(@m80.k q0 q0Var, @m80.k q10.g gVar) {
        if (q0Var == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return j(q0Var, gVar, true, false, false);
    }

    @m80.k
    public static m0 e(@m80.k q0 q0Var, @m80.k q10.g gVar, @m80.k q10.g gVar2) {
        if (q0Var == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return n(q0Var, gVar, gVar2, true, false, false, q0Var.getSource());
    }

    @m80.l
    public static q0 f(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(26);
        }
        a0 g11 = h.g(bVar);
        p10.b a11 = t.a(g11).a(g11);
        if (a11 == null) {
            return null;
        }
        g.a aVar = q10.g.A0;
        q10.g b11 = aVar.b();
        Modality modality = Modality.FINAL;
        p10.p pVar = p10.o.f78590e;
        n20.f fVar = n10.o.f74007e;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        k0 K0 = k0.K0(bVar, b11, modality, pVar, false, fVar, kind, bVar.getSource(), false, false, false, false, false, false);
        l0 l0Var = new l0(K0, aVar.b(), modality, pVar, false, false, false, kind, null, bVar.getSource());
        K0.Q0(l0Var, null);
        c1 j11 = u0.j(r1.f48652b.j(), a11.o(), Collections.singletonList(new c2(bVar.s())), false);
        List<? extends p10.c1> list = Collections.EMPTY_LIST;
        K0.X0(j11, list, null, null, list);
        l0Var.L0(K0.getReturnType());
        return K0;
    }

    @m80.k
    public static kotlin.reflect.jvm.internal.impl.descriptors.g g(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(24);
        }
        g.a aVar = q10.g.A0;
        o0 g12 = o0.g1(bVar, aVar.b(), n10.o.f74008f, CallableMemberDescriptor.Kind.SYNTHESIZED, bVar.getSource());
        s10.u0 u0Var = new s10.u0(g12, null, 0, aVar.b(), n20.f.f("value"), u20.e.m(bVar).W(), false, false, false, null, bVar.getSource());
        List<t0> list = Collections.EMPTY_LIST;
        o0 M0 = g12.M0(null, null, list, list, Collections.singletonList(u0Var), bVar.s(), Modality.FINAL, p10.o.f78590e);
        if (M0 == null) {
            a(25);
        }
        return M0;
    }

    @m80.k
    public static kotlin.reflect.jvm.internal.impl.descriptors.g h(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(22);
        }
        o0 g12 = o0.g1(bVar, q10.g.A0.b(), n10.o.f74006d, CallableMemberDescriptor.Kind.SYNTHESIZED, bVar.getSource());
        List<t0> list = Collections.EMPTY_LIST;
        o0 M0 = g12.M0(null, null, list, list, list, u20.e.m(bVar).l(Variance.INVARIANT, bVar.s()), Modality.FINAL, p10.o.f78590e);
        if (M0 == null) {
            a(23);
        }
        return M0;
    }

    @m80.l
    public static t0 i(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @m80.l r0 r0Var, @m80.k q10.g gVar) {
        if (aVar == null) {
            a(30);
        }
        if (gVar == null) {
            a(31);
        }
        if (r0Var == null) {
            return null;
        }
        return new n0(aVar, new y20.d(aVar, r0Var, null), gVar);
    }

    @m80.k
    public static l0 j(@m80.k q0 q0Var, @m80.k q10.g gVar, boolean z11, boolean z12, boolean z13) {
        if (q0Var == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return k(q0Var, gVar, z11, z12, z13, q0Var.getSource());
    }

    @m80.k
    public static l0 k(@m80.k q0 q0Var, @m80.k q10.g gVar, boolean z11, boolean z12, boolean z13, @m80.k x0 x0Var) {
        if (q0Var == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (x0Var == null) {
            a(19);
        }
        return new l0(q0Var, gVar, q0Var.k(), q0Var.getVisibility(), z11, z12, z13, CallableMemberDescriptor.Kind.DECLARATION, null, x0Var);
    }

    @m80.k
    public static s10.i l(@m80.k p10.b bVar, @m80.k x0 x0Var) {
        if (bVar == null) {
            a(20);
        }
        if (x0Var == null) {
            a(21);
        }
        return new a(bVar, x0Var, false);
    }

    @m80.k
    public static m0 m(@m80.k q0 q0Var, @m80.k q10.g gVar, @m80.k q10.g gVar2, boolean z11, boolean z12, boolean z13, @m80.k p10.p pVar, @m80.k x0 x0Var) {
        if (q0Var == null) {
            a(7);
        }
        if (gVar == null) {
            a(8);
        }
        if (gVar2 == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (x0Var == null) {
            a(11);
        }
        m0 m0Var = new m0(q0Var, gVar, q0Var.k(), pVar, z11, z12, z13, CallableMemberDescriptor.Kind.DECLARATION, null, x0Var);
        m0Var.M0(m0.K0(m0Var, q0Var.getType(), gVar2));
        return m0Var;
    }

    @m80.k
    public static m0 n(@m80.k q0 q0Var, @m80.k q10.g gVar, @m80.k q10.g gVar2, boolean z11, boolean z12, boolean z13, @m80.k x0 x0Var) {
        if (q0Var == null) {
            a(3);
        }
        if (gVar == null) {
            a(4);
        }
        if (gVar2 == null) {
            a(5);
        }
        if (x0Var == null) {
            a(6);
        }
        return m(q0Var, gVar, gVar2, z11, z12, z13, q0Var.getVisibility(), x0Var);
    }

    public static boolean o(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(29);
        }
        return eVar.getKind() == CallableMemberDescriptor.Kind.SYNTHESIZED && h.A(eVar.b());
    }

    public static boolean p(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(28);
        }
        return eVar.getName().equals(n10.o.f74008f) && o(eVar);
    }

    public static boolean q(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(27);
        }
        return eVar.getName().equals(n10.o.f74006d) && o(eVar);
    }
}
