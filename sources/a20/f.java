package a20;

import a00.h0;
import e30.r0;
import g20.g1;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import m80.k;
import m80.l;
import n10.j;
import p10.p;
import p10.q0;
import p10.s0;
import p10.x0;
import s10.k0;
import s10.l0;
import s10.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f extends k0 implements a {
    public final boolean E;

    @l
    public final Pair<a.InterfaceC0792a<?>, ?> F;
    public r0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@k p10.h hVar, @k q10.g gVar, @k Modality modality, @k p pVar, boolean z11, @k n20.f fVar, @k x0 x0Var, @l q0 q0Var, @k CallableMemberDescriptor.Kind kind, boolean z12, @l Pair<a.InterfaceC0792a<?>, ?> pair) {
        super(hVar, q0Var, gVar, modality, pVar, z11, fVar, kind, x0Var, false, false, false, false, false, false);
        if (hVar == null) {
            C(0);
        }
        if (gVar == null) {
            C(1);
        }
        if (modality == null) {
            C(2);
        }
        if (pVar == null) {
            C(3);
        }
        if (fVar == null) {
            C(4);
        }
        if (x0Var == null) {
            C(5);
        }
        if (kind == null) {
            C(6);
        }
        this.G = null;
        this.E = z12;
        this.F = pair;
    }

    private static /* synthetic */ void C(int i11) {
        String str = i11 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 21 ? 3 : 2];
        switch (i11) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i11 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @k
    public static f b1(@k p10.h hVar, @k q10.g gVar, @k Modality modality, @k p pVar, boolean z11, @k n20.f fVar, @k x0 x0Var, boolean z12) {
        if (hVar == null) {
            C(7);
        }
        if (gVar == null) {
            C(8);
        }
        if (modality == null) {
            C(9);
        }
        if (pVar == null) {
            C(10);
        }
        if (fVar == null) {
            C(11);
        }
        if (x0Var == null) {
            C(12);
        }
        return new f(hVar, gVar, modality, pVar, z11, fVar, x0Var, null, CallableMemberDescriptor.Kind.DECLARATION, z12, null);
    }

    @Override // s10.k0
    @k
    public k0 L0(@k p10.h hVar, @k Modality modality, @k p pVar, @l q0 q0Var, @k CallableMemberDescriptor.Kind kind, @k n20.f fVar, @k x0 x0Var) {
        if (hVar == null) {
            C(13);
        }
        if (modality == null) {
            C(14);
        }
        if (pVar == null) {
            C(15);
        }
        if (kind == null) {
            C(16);
        }
        if (fVar == null) {
            C(17);
        }
        if (x0Var == null) {
            C(18);
        }
        return new f(hVar, getAnnotations(), modality, pVar, E(), fVar, x0Var, q0Var, kind, this.E, this.F);
    }

    @Override // s10.k0, s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @l
    public <V> V P(a.InterfaceC0792a<V> interfaceC0792a) {
        Pair<a.InterfaceC0792a<?>, ?> pair = this.F;
        if (pair == null || !pair.getFirst().equals(interfaceC0792a)) {
            return null;
        }
        return (V) this.F.getSecond();
    }

    @Override // s10.k0
    public void V0(@k r0 r0Var) {
        if (r0Var == null) {
            C(22);
        }
        this.G = r0Var;
    }

    @Override // s10.k0, s10.w0, p10.l1
    public boolean isConst() {
        r0 type = getType();
        if (this.E && p10.f.a(type)) {
            return !g1.i(type) || j.v0(type);
        }
        return false;
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean o0() {
        return false;
    }

    @Override // a20.a
    @k
    public a z(@l r0 r0Var, @k List<r0> list, @k r0 r0Var2, @l Pair<a.InterfaceC0792a<?>, ?> pair) {
        l0 l0Var;
        m0 m0Var;
        if (list == null) {
            C(19);
        }
        if (r0Var2 == null) {
            C(20);
        }
        q0 a11 = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), k(), getVisibility(), E(), getName(), getSource(), a11, getKind(), this.E, pair);
        l0 getter = getGetter();
        if (getter != null) {
            l0 l0Var2 = new l0(fVar, getter.getAnnotations(), getter.k(), getter.getVisibility(), getter.Z(), getter.isExternal(), getter.isInline(), getKind(), a11 == null ? null : a11.getGetter(), getter.getSource());
            l0Var2.I0(getter.w0());
            l0Var2.L0(r0Var2);
            l0Var = l0Var2;
        } else {
            l0Var = null;
        }
        s0 setter = getSetter();
        if (setter != null) {
            m0Var = new m0(fVar, setter.getAnnotations(), setter.k(), setter.getVisibility(), setter.Z(), setter.isExternal(), setter.isInline(), getKind(), a11 == null ? null : a11.getSetter(), setter.getSource());
            m0Var.I0(m0Var.w0());
            m0Var.M0(setter.g().get(0));
        } else {
            m0Var = null;
        }
        fVar.R0(l0Var, m0Var, Q(), F());
        fVar.W0(S0());
        x00.a<d30.j<s20.g<?>>> aVar = this.f87361i;
        if (aVar != null) {
            fVar.G0(this.f87360h, aVar);
        }
        fVar.T(e());
        fVar.X0(r0Var2, getTypeParameters(), d0(), r0Var != null ? q20.g.i(this, r0Var, q10.g.A0.b()) : null, h0.J());
        return fVar;
    }
}
