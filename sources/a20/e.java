package a20;

import e30.r0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import l30.s;
import m80.k;
import m80.l;
import p10.c1;
import p10.j1;
import p10.p;
import p10.t0;
import p10.x0;
import s10.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e extends o0 implements a20.a {
    public static final a.InterfaceC0792a<j1> G = new a();
    public static final a.InterfaceC0792a<Boolean> H = new b();
    public static final /* synthetic */ boolean I = false;
    public c E;
    public final boolean F;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements a.InterfaceC0792a<j1> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements a.InterfaceC0792a<Boolean> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* renamed from: a, reason: collision with root package name */
        public final boolean f1426a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1427b;

        c(boolean z11, boolean z12) {
            this.f1426a = z11;
            this.f1427b = z12;
        }

        public static /* synthetic */ void a(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", ct.d.f46852f));
        }

        @k
        public static c b(boolean z11, boolean z12) {
            c cVar = z11 ? z12 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z12 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                a(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@k p10.h hVar, @l kotlin.reflect.jvm.internal.impl.descriptors.g gVar, @k q10.g gVar2, @k n20.f fVar, @k CallableMemberDescriptor.Kind kind, @k x0 x0Var, boolean z11) {
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
        this.E = null;
        this.F = z11;
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 13 || i11 == 18 || i11 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 13 || i11 == 18 || i11 == 21) ? 2 : 3];
        switch (i11) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i11 == 13) {
            objArr[1] = "initialize";
        } else if (i11 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i11 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 13 && i11 != 18 && i11 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @k
    public static e k1(@k p10.h hVar, @k q10.g gVar, @k n20.f fVar, @k x0 x0Var, boolean z11) {
        if (hVar == null) {
            C(5);
        }
        if (gVar == null) {
            C(6);
        }
        if (fVar == null) {
            C(7);
        }
        if (x0Var == null) {
            C(8);
        }
        return new e(hVar, null, gVar, fVar, CallableMemberDescriptor.Kind.DECLARATION, x0Var, z11);
    }

    @Override // s10.s
    public boolean L0() {
        return this.E.f1426a;
    }

    @Override // s10.o0
    @k
    public o0 j1(@l t0 t0Var, @l t0 t0Var2, @k List<t0> list, @k List<? extends c1> list2, @k List<j1> list3, @l r0 r0Var, @l Modality modality, @k p pVar, @l Map<? extends a.InterfaceC0792a<?>, ?> map) {
        if (list == null) {
            C(9);
        }
        if (list2 == null) {
            C(10);
        }
        if (list3 == null) {
            C(11);
        }
        if (pVar == null) {
            C(12);
        }
        o0 j12 = super.j1(t0Var, t0Var2, list, list2, list3, r0Var, modality, pVar, map);
        a1(s.f69800a.a(j12).a());
        if (j12 == null) {
            C(13);
        }
        return j12;
    }

    @Override // s10.o0, s10.s
    @k
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public e j1(@k p10.h hVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @k CallableMemberDescriptor.Kind kind, @l n20.f fVar, @k q10.g gVar, @k x0 x0Var) {
        if (hVar == null) {
            C(14);
        }
        if (kind == null) {
            C(15);
        }
        if (gVar == null) {
            C(16);
        }
        if (x0Var == null) {
            C(17);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) eVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar2 = new e(hVar, gVar2, gVar, fVar, kind, x0Var, this.F);
        eVar2.n1(L0(), o0());
        return eVar2;
    }

    @Override // a20.a
    @k
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public e z(@l r0 r0Var, @k List<r0> list, @k r0 r0Var2, @l Pair<a.InterfaceC0792a<?>, ?> pair) {
        if (list == null) {
            C(19);
        }
        if (r0Var2 == null) {
            C(20);
        }
        e eVar = (e) n().k(h.a(list, g(), this)).j(r0Var2).n(r0Var == null ? null : q20.g.i(this, r0Var, q10.g.A0.b())).i().d().build();
        if (pair != null) {
            eVar.P0(pair.getFirst(), pair.getSecond());
        }
        if (eVar == null) {
            C(21);
        }
        return eVar;
    }

    public void n1(boolean z11, boolean z12) {
        this.E = c.b(z11, z12);
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean o0() {
        return this.E.f1427b;
    }
}
