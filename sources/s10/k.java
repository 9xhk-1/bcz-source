package s10;

import e30.c1;
import e30.u1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p10.h1;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k extends j {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ boolean f87212p = false;

    /* renamed from: j, reason: collision with root package name */
    public final Modality f87213j;

    /* renamed from: k, reason: collision with root package name */
    public final ClassKind f87214k;

    /* renamed from: l, reason: collision with root package name */
    public final u1 f87215l;

    /* renamed from: m, reason: collision with root package name */
    public x20.k f87216m;

    /* renamed from: n, reason: collision with root package name */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.b> f87217n;

    /* renamed from: o, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.descriptors.b f87218o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k p10.h hVar, @m80.k n20.f fVar, @m80.k Modality modality, @m80.k ClassKind classKind, @m80.k Collection<e30.r0> collection, @m80.k p10.x0 x0Var, boolean z11, @m80.k d30.n nVar) {
        super(nVar, hVar, fVar, x0Var, z11);
        if (hVar == null) {
            p0(0);
        }
        if (fVar == null) {
            p0(1);
        }
        if (modality == null) {
            p0(2);
        }
        if (classKind == null) {
            p0(3);
        }
        if (collection == null) {
            p0(4);
        }
        if (x0Var == null) {
            p0(5);
        }
        if (nVar == null) {
            p0(6);
        }
        this.f87213j = modality;
        this.f87214k = classKind;
        this.f87215l = new e30.t(this, Collections.EMPTY_LIST, collection, nVar);
    }

    private static /* synthetic */ void p0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p10.b
    public kotlin.reflect.jvm.internal.impl.descriptors.b B() {
        return this.f87218o;
    }

    public final void F0(@m80.k x20.k kVar, @m80.k Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (kVar == null) {
            p0(7);
        }
        if (set == null) {
            p0(8);
        }
        this.f87216m = kVar;
        this.f87217n = set;
        this.f87218o = bVar;
    }

    @Override // s10.z
    @m80.k
    public x20.k V(@m80.k f30.g gVar) {
        if (gVar == null) {
            p0(12);
        }
        x20.k kVar = this.f87216m;
        if (kVar == null) {
            p0(13);
        }
        return kVar;
    }

    @Override // p10.b
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set = this.f87217n;
        if (set == null) {
            p0(11);
        }
        return set;
    }

    @Override // q10.a
    @m80.k
    public q10.g getAnnotations() {
        q10.g b11 = q10.g.A0.b();
        if (b11 == null) {
            p0(9);
        }
        return b11;
    }

    @Override // p10.b
    @m80.k
    public ClassKind getKind() {
        ClassKind classKind = this.f87214k;
        if (classKind == null) {
            p0(15);
        }
        return classKind;
    }

    @Override // p10.b, p10.x, p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p pVar = p10.o.f78590e;
        if (pVar == null) {
            p0(17);
        }
        return pVar;
    }

    @Override // p10.e
    public boolean i() {
        return false;
    }

    @Override // p10.b
    @m80.l
    public h1<c1> i0() {
        return null;
    }

    @Override // p10.b
    public boolean isInline() {
        return false;
    }

    @Override // p10.b, p10.x
    @m80.k
    public Modality k() {
        Modality modality = this.f87213j;
        if (modality == null) {
            p0(16);
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
        u1 u1Var = this.f87215l;
        if (u1Var == null) {
            p0(10);
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
            p0(14);
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
    public List<p10.c1> t() {
        List<p10.c1> list = Collections.EMPTY_LIST;
        if (list == null) {
            p0(18);
        }
        return list;
    }

    public String toString() {
        return "class " + getName();
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
