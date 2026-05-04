package s10;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import p10.c1;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o0 extends s implements kotlin.reflect.jvm.internal.impl.descriptors.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@m80.k p10.h hVar, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.g gVar, @m80.k q10.g gVar2, @m80.k n20.f fVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.k p10.x0 x0Var) {
        super(hVar, gVar, gVar2, fVar, kind, x0Var);
        if (hVar == null) {
            C(0);
        }
        if (gVar2 == null) {
            C(1);
        }
        if (fVar == null) {
            C(2);
        }
        if (kind == null) {
            C(3);
        }
        if (x0Var == null) {
            C(4);
        }
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 13 || i11 == 18 || i11 == 23 || i11 == 24 || i11 == 29 || i11 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 13 || i11 == 18 || i11 == 23 || i11 == 24 || i11 == 29 || i11 == 30) ? 2 : 3];
        switch (i11) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i11 == 13 || i11 == 18 || i11 == 23) {
            objArr[1] = "initialize";
        } else if (i11 == 24) {
            objArr[1] = "getOriginal";
        } else if (i11 == 29) {
            objArr[1] = "copy";
        } else if (i11 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 13 && i11 != 18 && i11 != 23 && i11 != 24 && i11 != 29 && i11 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @m80.k
    public static o0 g1(@m80.k p10.h hVar, @m80.k q10.g gVar, @m80.k n20.f fVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.k p10.x0 x0Var) {
        if (hVar == null) {
            C(5);
        }
        if (gVar == null) {
            C(6);
        }
        if (fVar == null) {
            C(7);
        }
        if (kind == null) {
            C(8);
        }
        if (x0Var == null) {
            C(9);
        }
        return new o0(hVar, null, gVar, fVar, kind, x0Var);
    }

    @Override // s10.s
    @m80.k
    /* renamed from: G0 */
    public s j1(@m80.k p10.h hVar, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.l n20.f fVar, @m80.k q10.g gVar, @m80.k p10.x0 x0Var) {
        if (hVar == null) {
            C(25);
        }
        if (kind == null) {
            C(26);
        }
        if (gVar == null) {
            C(27);
        }
        if (x0Var == null) {
            C(28);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) eVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new o0(hVar, gVar2, gVar, fVar, kind, x0Var);
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @m80.k
    /* renamed from: f1 */
    public kotlin.reflect.jvm.internal.impl.descriptors.g g0(p10.h hVar, Modality modality, p10.p pVar, CallableMemberDescriptor.Kind kind, boolean z11) {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) super.g0(hVar, modality, pVar, kind, z11);
        if (gVar == null) {
            C(29);
        }
        return gVar;
    }

    @Override // s10.s, s10.n
    @m80.k
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.g a() {
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) super.a();
        if (gVar == null) {
            C(24);
        }
        return gVar;
    }

    @Override // s10.s
    @m80.k
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public o0 M0(@m80.l p10.t0 t0Var, @m80.l p10.t0 t0Var2, @m80.k List<p10.t0> list, @m80.k List<? extends c1> list2, @m80.k List<j1> list3, @m80.l e30.r0 r0Var, @m80.l Modality modality, @m80.k p10.p pVar) {
        if (list == null) {
            C(14);
        }
        if (list2 == null) {
            C(15);
        }
        if (list3 == null) {
            C(16);
        }
        if (pVar == null) {
            C(17);
        }
        o0 j12 = j1(t0Var, t0Var2, list, list2, list3, r0Var, modality, pVar, null);
        if (j12 == null) {
            C(18);
        }
        return j12;
    }

    @m80.k
    public o0 j1(@m80.l p10.t0 t0Var, @m80.l p10.t0 t0Var2, @m80.k List<p10.t0> list, @m80.k List<? extends c1> list2, @m80.k List<j1> list3, @m80.l e30.r0 r0Var, @m80.l Modality modality, @m80.k p10.p pVar, @m80.l Map<? extends a.InterfaceC0792a<?>, ?> map) {
        if (list == null) {
            C(19);
        }
        if (list2 == null) {
            C(20);
        }
        if (list3 == null) {
            C(21);
        }
        if (pVar == null) {
            C(22);
        }
        super.M0(t0Var, t0Var2, list, list2, list3, r0Var, modality, pVar);
        if (map != null && !map.isEmpty()) {
            this.D = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.g
    @m80.k
    public e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> n() {
        e.a n11 = super.n();
        if (n11 == null) {
            C(30);
        }
        return n11;
    }
}
