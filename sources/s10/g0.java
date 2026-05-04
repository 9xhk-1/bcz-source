package s10;

import e30.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p10.c1;
import p10.h1;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g0 extends j {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ boolean f87171r = false;

    /* renamed from: j, reason: collision with root package name */
    public final ClassKind f87172j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f87173k;

    /* renamed from: l, reason: collision with root package name */
    public Modality f87174l;

    /* renamed from: m, reason: collision with root package name */
    public p10.p f87175m;

    /* renamed from: n, reason: collision with root package name */
    public u1 f87176n;

    /* renamed from: o, reason: collision with root package name */
    public List<c1> f87177o;

    /* renamed from: p, reason: collision with root package name */
    public final Collection<e30.r0> f87178p;

    /* renamed from: q, reason: collision with root package name */
    public final d30.n f87179q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@m80.k p10.h hVar, @m80.k ClassKind classKind, boolean z11, boolean z12, @m80.k n20.f fVar, @m80.k p10.x0 x0Var, @m80.k d30.n nVar) {
        super(nVar, hVar, fVar, x0Var, z12);
        if (hVar == null) {
            p0(0);
        }
        if (classKind == null) {
            p0(1);
        }
        if (fVar == null) {
            p0(2);
        }
        if (x0Var == null) {
            p0(3);
        }
        if (nVar == null) {
            p0(4);
        }
        this.f87178p = new ArrayList();
        this.f87179q = nVar;
        this.f87172j = classKind;
        this.f87173k = z11;
    }

    private static /* synthetic */ void p0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i12 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p10.b
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.b B() {
        return null;
    }

    public void F0() {
        this.f87176n = new e30.t(this, this.f87177o, this.f87178p, this.f87179q);
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.b> it = f().iterator();
        while (it.hasNext()) {
            ((i) it.next()).b1(s());
        }
    }

    @Override // p10.b
    @m80.k
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.b> f() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set = Collections.EMPTY_SET;
        if (set == null) {
            p0(13);
        }
        return set;
    }

    public void H0(@m80.k Modality modality) {
        if (modality == null) {
            p0(6);
        }
        this.f87174l = modality;
    }

    public void I0(@m80.k List<c1> list) {
        if (list == null) {
            p0(14);
        }
        if (this.f87177o == null) {
            this.f87177o = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void J0(@m80.k p10.p pVar) {
        if (pVar == null) {
            p0(9);
        }
        this.f87175m = pVar;
    }

    @Override // s10.z
    @m80.k
    public x20.k V(@m80.k f30.g gVar) {
        if (gVar == null) {
            p0(16);
        }
        k.c cVar = k.c.f97119b;
        if (cVar == null) {
            p0(17);
        }
        return cVar;
    }

    @Override // q10.a
    @m80.k
    public q10.g getAnnotations() {
        q10.g b11 = q10.g.A0.b();
        if (b11 == null) {
            p0(5);
        }
        return b11;
    }

    @Override // p10.b
    @m80.k
    public ClassKind getKind() {
        ClassKind classKind = this.f87172j;
        if (classKind == null) {
            p0(8);
        }
        return classKind;
    }

    @Override // p10.b, p10.x, p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p pVar = this.f87175m;
        if (pVar == null) {
            p0(10);
        }
        return pVar;
    }

    @Override // p10.e
    public boolean i() {
        return this.f87173k;
    }

    @Override // p10.b
    @m80.l
    public h1<e30.c1> i0() {
        return null;
    }

    @Override // p10.b
    public boolean isInline() {
        return false;
    }

    @Override // p10.b, p10.x
    @m80.k
    public Modality k() {
        Modality modality = this.f87174l;
        if (modality == null) {
            p0(7);
        }
        return modality;
    }

    @Override // p10.x
    public boolean k0() {
        return false;
    }

    @Override // p10.b
    public boolean m0() {
        return false;
    }

    @Override // p10.d
    @m80.k
    public u1 o() {
        u1 u1Var = this.f87176n;
        if (u1Var == null) {
            p0(11);
        }
        return u1Var;
    }

    @Override // p10.b
    @m80.k
    public Collection<p10.b> p() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            p0(19);
        }
        return list;
    }

    @Override // p10.x
    public boolean q0() {
        return false;
    }

    @Override // p10.b
    @m80.k
    public x20.k r0() {
        k.c cVar = k.c.f97119b;
        if (cVar == null) {
            p0(18);
        }
        return cVar;
    }

    @Override // p10.b
    @m80.l
    public p10.b s0() {
        return null;
    }

    @Override // p10.b, p10.e
    @m80.k
    public List<c1> t() {
        List<c1> list = this.f87177o;
        if (list == null) {
            p0(15);
        }
        return list;
    }

    public String toString() {
        return m.V(this);
    }

    @Override // p10.b
    public boolean u() {
        return false;
    }

    @Override // p10.b
    public boolean v() {
        return false;
    }

    @Override // p10.b
    public boolean w() {
        return false;
    }
}
