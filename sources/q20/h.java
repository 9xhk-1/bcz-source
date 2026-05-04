package q20;

import e30.h2;
import e30.r0;
import e30.u1;
import e30.v0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p10.a0;
import p10.g0;
import p10.l1;
import p10.n0;
import p10.s0;
import p10.t0;
import p10.y0;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final n20.c f81469a = new n20.c("kotlin.jvm.JvmName");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f81470b = false;

    public static boolean A(@m80.l p10.h hVar) {
        return D(hVar, ClassKind.ENUM_CLASS);
    }

    public static boolean B(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(36);
        }
        return D(hVar, ClassKind.ENUM_ENTRY);
    }

    public static boolean C(@m80.l p10.h hVar) {
        return D(hVar, ClassKind.INTERFACE);
    }

    public static boolean D(@m80.l p10.h hVar, @m80.k ClassKind classKind) {
        if (classKind == null) {
            a(37);
        }
        return (hVar instanceof p10.b) && ((p10.b) hVar).getKind() == classKind;
    }

    public static boolean E(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(1);
        }
        while (hVar != null) {
            if (u(hVar) || y(hVar)) {
                return true;
            }
            hVar = hVar.b();
        }
        return false;
    }

    public static boolean F(@m80.k r0 r0Var, @m80.k p10.h hVar) {
        if (r0Var == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        p10.d r11 = r0Var.I0().r();
        if (r11 == null) {
            return false;
        }
        p10.h a11 = r11.a();
        return (a11 instanceof p10.d) && (hVar instanceof p10.d) && ((p10.d) hVar).o().equals(((p10.d) a11).o());
    }

    public static boolean G(@m80.l p10.h hVar) {
        return (D(hVar, ClassKind.CLASS) || D(hVar, ClassKind.INTERFACE)) && ((p10.b) hVar).k() == Modality.SEALED;
    }

    public static boolean H(@m80.k p10.b bVar, @m80.k p10.b bVar2) {
        if (bVar == null) {
            a(28);
        }
        if (bVar2 == null) {
            a(29);
        }
        return I(bVar.s(), bVar2.a());
    }

    public static boolean I(@m80.k r0 r0Var, @m80.k p10.h hVar) {
        if (r0Var == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (F(r0Var, hVar)) {
            return true;
        }
        Iterator<r0> it = r0Var.I0().c().iterator();
        while (it.hasNext()) {
            if (I(it.next(), hVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(@m80.l p10.h hVar) {
        return hVar != null && (hVar.b() instanceof g0);
    }

    public static boolean K(@m80.k l1 l1Var, @m80.k r0 r0Var) {
        if (l1Var == null) {
            a(66);
        }
        if (r0Var == null) {
            a(67);
        }
        if (l1Var.E() || v0.a(r0Var)) {
            return false;
        }
        if (h2.b(r0Var)) {
            return true;
        }
        n10.j m11 = u20.e.m(l1Var);
        if (!n10.j.s0(r0Var)) {
            f30.e eVar = f30.e.f50430a;
            if (!eVar.b(m11.W(), r0Var) && !eVar.b(m11.K().s(), r0Var) && !eVar.b(m11.i(), r0Var)) {
                n10.q qVar = n10.q.f74082a;
                if (!n10.q.d(r0Var)) {
                    return false;
                }
            }
        }
        return true;
    }

    @m80.k
    public static <D extends CallableMemberDescriptor> D L(@m80.k D d11) {
        if (d11 == null) {
            a(59);
        }
        while (d11.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> e11 = d11.e();
            if (e11.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d11);
            }
            d11 = (D) e11.iterator().next();
        }
        return d11;
    }

    @m80.k
    public static <D extends p10.l> D M(@m80.k D d11) {
        if (d11 == null) {
            a(64);
        }
        if (d11 instanceof CallableMemberDescriptor) {
            return L((CallableMemberDescriptor) d11);
        }
        if (d11 == null) {
            a(65);
        }
        return d11;
    }

    public static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = n.r.f98264f;
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = kc.u.S;
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(@m80.k p10.h hVar, @m80.k p10.h hVar2) {
        if (hVar == null) {
            a(16);
        }
        if (hVar2 == null) {
            a(17);
        }
        return g(hVar).equals(g(hVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void c(@m80.k D d11, @m80.k Set<D> set) {
        if (d11 == null) {
            a(73);
        }
        if (set == 0) {
            a(74);
        }
        if (set.contains(d11)) {
            return;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> it = d11.a().e().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.a a11 = it.next().a();
            c(a11, set);
            set.add(a11);
        }
    }

    @m80.k
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> d(@m80.k D d11) {
        if (d11 == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d11.a(), linkedHashSet);
        return linkedHashSet;
    }

    @m80.k
    public static p10.b e(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(45);
        }
        return f(r0Var.I0());
    }

    @m80.k
    public static p10.b f(@m80.k u1 u1Var) {
        if (u1Var == null) {
            a(46);
        }
        p10.b bVar = (p10.b) u1Var.r();
        if (bVar == null) {
            a(47);
        }
        return bVar;
    }

    @m80.k
    public static a0 g(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(21);
        }
        a0 i11 = i(hVar);
        if (i11 == null) {
            a(22);
        }
        return i11;
    }

    @m80.l
    public static a0 h(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(20);
        }
        p10.d r11 = r0Var.I0().r();
        if (r11 == null) {
            return null;
        }
        return i(r11);
    }

    @m80.l
    public static a0 i(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(23);
        }
        while (hVar != null) {
            if (hVar instanceof a0) {
                return (a0) hVar;
            }
            if (hVar instanceof n0) {
                return ((n0) hVar).C0();
            }
            hVar = hVar.b();
        }
        return null;
    }

    @m80.k
    public static y0 j(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(82);
        }
        if (hVar instanceof s0) {
            hVar = ((s0) hVar).j0();
        }
        if (hVar instanceof p10.k) {
            y0 b11 = ((p10.k) hVar).getSource().b();
            if (b11 == null) {
                a(83);
            }
            return b11;
        }
        y0 y0Var = y0.f78623a;
        if (y0Var == null) {
            a(84);
        }
        return y0Var;
    }

    @m80.k
    public static p10.p k(@m80.k p10.b bVar, boolean z11) {
        if (bVar == null) {
            a(48);
        }
        ClassKind kind = bVar.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton()) {
            p10.p pVar = p10.o.f78586a;
            if (pVar == null) {
                a(49);
            }
            return pVar;
        }
        if (G(bVar)) {
            if (z11) {
                p10.p pVar2 = p10.o.f78588c;
                if (pVar2 == null) {
                    a(50);
                }
                return pVar2;
            }
            p10.p pVar3 = p10.o.f78586a;
            if (pVar3 == null) {
                a(51);
            }
            return pVar3;
        }
        if (u(bVar)) {
            p10.p pVar4 = p10.o.f78597l;
            if (pVar4 == null) {
                a(52);
            }
            return pVar4;
        }
        p10.p pVar5 = p10.o.f78590e;
        if (pVar5 == null) {
            a(53);
        }
        return pVar5;
    }

    @m80.l
    public static t0 l(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(0);
        }
        if (hVar instanceof p10.b) {
            return ((p10.b) hVar).W();
        }
        return null;
    }

    @m80.k
    public static n20.d m(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(2);
        }
        n20.c o11 = o(hVar);
        return o11 != null ? o11.j() : p(hVar);
    }

    @m80.k
    public static n20.c n(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(3);
        }
        n20.c o11 = o(hVar);
        if (o11 == null) {
            o11 = p(hVar).l();
        }
        if (o11 == null) {
            a(4);
        }
        return o11;
    }

    @m80.l
    public static n20.c o(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(5);
        }
        if ((hVar instanceof a0) || g30.i.m(hVar)) {
            return n20.c.f74284c;
        }
        if (hVar instanceof n0) {
            return ((n0) hVar).d();
        }
        if (hVar instanceof g0) {
            return ((g0) hVar).d();
        }
        return null;
    }

    @m80.k
    public static n20.d p(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(6);
        }
        n20.d c11 = m(hVar.b()).c(hVar.getName());
        if (c11 == null) {
            a(7);
        }
        return c11;
    }

    @m80.l
    public static <D extends p10.h> D q(@m80.l p10.h hVar, @m80.k Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(hVar, cls, true);
    }

    @m80.l
    public static <D extends p10.h> D r(@m80.l p10.h hVar, @m80.k Class<D> cls, boolean z11) {
        if (cls == null) {
            a(19);
        }
        if (hVar == null) {
            return null;
        }
        if (z11) {
            hVar = (D) hVar.b();
        }
        while (hVar != null) {
            if (cls.isInstance(hVar)) {
                return (D) hVar;
            }
            hVar = (D) hVar.b();
        }
        return null;
    }

    @m80.l
    public static p10.b s(@m80.k p10.b bVar) {
        if (bVar == null) {
            a(44);
        }
        Iterator<r0> it = bVar.o().c().iterator();
        while (it.hasNext()) {
            p10.b e11 = e(it.next());
            if (e11.getKind() != ClassKind.INTERFACE) {
                return e11;
            }
        }
        return null;
    }

    public static boolean t(@m80.l p10.h hVar) {
        return D(hVar, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean u(@m80.k p10.h hVar) {
        if (hVar == null) {
            a(34);
        }
        return v(hVar) && hVar.getName().equals(n20.h.f74301b);
    }

    public static boolean v(@m80.l p10.h hVar) {
        return D(hVar, ClassKind.CLASS);
    }

    public static boolean w(@m80.l p10.h hVar) {
        return v(hVar) || A(hVar);
    }

    public static boolean x(@m80.l p10.h hVar) {
        return D(hVar, ClassKind.OBJECT) && ((p10.b) hVar).m0();
    }

    public static boolean y(p10.h hVar) {
        return (hVar instanceof p10.l) && ((p10.l) hVar).getVisibility() == p10.o.f78591f;
    }

    public static boolean z(@m80.k p10.b bVar, @m80.k p10.b bVar2) {
        if (bVar == null) {
            a(26);
        }
        if (bVar2 == null) {
            a(27);
        }
        Iterator<r0> it = bVar.o().c().iterator();
        while (it.hasNext()) {
            if (F(it.next(), bVar2.a())) {
                return true;
            }
        }
        return false;
    }
}
