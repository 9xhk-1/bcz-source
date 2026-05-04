package s10;

import e30.c1;
import e30.u1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p10.h1;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q extends j {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ boolean f87263n = false;

    /* renamed from: j, reason: collision with root package name */
    public final u1 f87264j;

    /* renamed from: k, reason: collision with root package name */
    public final x20.k f87265k;

    /* renamed from: l, reason: collision with root package name */
    public final d30.i<Set<n20.f>> f87266l;

    /* renamed from: m, reason: collision with root package name */
    public final q10.g f87267m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends x20.l {

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ boolean f87268f = false;

        /* renamed from: b, reason: collision with root package name */
        public final d30.g<n20.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> f87269b;

        /* renamed from: c, reason: collision with root package name */
        public final d30.g<n20.f, Collection<? extends p10.q0>> f87270c;

        /* renamed from: d, reason: collision with root package name */
        public final d30.i<Collection<p10.h>> f87271d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q f87272e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: s10.q$a$a, reason: collision with other inner class name */
        public class C1122a implements x00.l<n20.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f87273a;

            public C1122a(q qVar) {
                this.f87273a = qVar;
            }

            @Override // x00.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> invoke(n20.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements x00.l<n20.f, Collection<? extends p10.q0>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f87275a;

            public b(q qVar) {
                this.f87275a = qVar;
            }

            @Override // x00.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends p10.q0> invoke(n20.f fVar) {
                return a.this.o(fVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements x00.a<Collection<p10.h>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f87277a;

            public c(q qVar) {
                this.f87277a = qVar;
            }

            @Override // x00.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<p10.h> invoke() {
                return a.this.m();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends q20.k {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Set f87279a;

            public d(Set set) {
                this.f87279a = set;
            }

            public static /* synthetic */ void f(int i11) {
                Object[] objArr = new Object[3];
                if (i11 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i11 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i11 == 1 || i11 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // q20.l
            public void a(@m80.k CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    f(0);
                }
                OverridingUtil.K(callableMemberDescriptor, null);
                this.f87279a.add(callableMemberDescriptor);
            }

            @Override // q20.k
            public void e(@m80.k CallableMemberDescriptor callableMemberDescriptor, @m80.k CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    f(1);
                }
                if (callableMemberDescriptor2 == null) {
                    f(2);
                }
            }
        }

        public a(@m80.k q qVar, d30.n nVar) {
            if (nVar == null) {
                i(0);
            }
            this.f87272e = qVar;
            this.f87269b = nVar.b(new C1122a(qVar));
            this.f87270c = nVar.b(new b(qVar));
            this.f87271d = nVar.f(new c(qVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void i(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s10.q.a.i(int):void");
        }

        @Override // x20.l, x20.k, x20.n
        @m80.k
        public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f fVar, @m80.k x10.b bVar) {
            if (fVar == null) {
                i(5);
            }
            if (bVar == null) {
                i(6);
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> invoke = this.f87269b.invoke(fVar);
            if (invoke == null) {
                i(7);
            }
            return invoke;
        }

        @Override // x20.l, x20.k
        @m80.k
        public Set<n20.f> b() {
            Set<n20.f> set = (Set) this.f87272e.f87266l.invoke();
            if (set == null) {
                i(17);
            }
            return set;
        }

        @Override // x20.l, x20.k
        @m80.k
        public Collection<? extends p10.q0> c(@m80.k n20.f fVar, @m80.k x10.b bVar) {
            if (fVar == null) {
                i(1);
            }
            if (bVar == null) {
                i(2);
            }
            Collection<? extends p10.q0> invoke = this.f87270c.invoke(fVar);
            if (invoke == null) {
                i(3);
            }
            return invoke;
        }

        @Override // x20.l, x20.k
        @m80.k
        public Set<n20.f> d() {
            Set<n20.f> set = (Set) this.f87272e.f87266l.invoke();
            if (set == null) {
                i(19);
            }
            return set;
        }

        @Override // x20.l, x20.n
        @m80.k
        public Collection<p10.h> f(@m80.k x20.d dVar, @m80.k x00.l<? super n20.f, Boolean> lVar) {
            if (dVar == null) {
                i(13);
            }
            if (lVar == null) {
                i(14);
            }
            Collection<p10.h> invoke = this.f87271d.invoke();
            if (invoke == null) {
                i(15);
            }
            return invoke;
        }

        @Override // x20.l, x20.k
        @m80.k
        public Set<n20.f> g() {
            Set<n20.f> set = Collections.EMPTY_SET;
            if (set == null) {
                i(18);
            }
            return set;
        }

        @m80.k
        public final Collection<p10.h> m() {
            HashSet hashSet = new HashSet();
            for (n20.f fVar : (Set) this.f87272e.f87266l.invoke()) {
                NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(a(fVar, noLookupLocation));
                hashSet.addAll(c(fVar, noLookupLocation));
            }
            return hashSet;
        }

        @m80.k
        public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> n(@m80.k n20.f fVar) {
            if (fVar == null) {
                i(8);
            }
            return q(fVar, p().a(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        @m80.k
        public final Collection<? extends p10.q0> o(@m80.k n20.f fVar) {
            if (fVar == null) {
                i(4);
            }
            return q(fVar, p().c(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        @m80.k
        public final x20.k p() {
            x20.k r11 = this.f87272e.o().c().iterator().next().r();
            if (r11 == null) {
                i(9);
            }
            return r11;
        }

        @m80.k
        public final <D extends CallableMemberDescriptor> Collection<? extends D> q(@m80.k n20.f fVar, @m80.k Collection<? extends D> collection) {
            if (fVar == null) {
                i(10);
            }
            if (collection == null) {
                i(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f67634f.v(fVar, collection, Collections.EMPTY_SET, this.f87272e, new d(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@m80.k d30.n nVar, @m80.k p10.b bVar, @m80.k e30.r0 r0Var, @m80.k n20.f fVar, @m80.k d30.i<Set<n20.f>> iVar, @m80.k q10.g gVar, @m80.k p10.x0 x0Var) {
        super(nVar, bVar, fVar, x0Var, false);
        if (nVar == null) {
            p0(6);
        }
        if (bVar == null) {
            p0(7);
        }
        if (r0Var == null) {
            p0(8);
        }
        if (fVar == null) {
            p0(9);
        }
        if (iVar == null) {
            p0(10);
        }
        if (gVar == null) {
            p0(11);
        }
        if (x0Var == null) {
            p0(12);
        }
        this.f87267m = gVar;
        this.f87264j = new e30.t(this, Collections.EMPTY_LIST, Collections.singleton(r0Var), nVar);
        this.f87265k = new a(this, nVar);
        this.f87266l = iVar;
    }

    @m80.k
    public static q G0(@m80.k d30.n nVar, @m80.k p10.b bVar, @m80.k n20.f fVar, @m80.k d30.i<Set<n20.f>> iVar, @m80.k q10.g gVar, @m80.k p10.x0 x0Var) {
        if (nVar == null) {
            p0(0);
        }
        if (bVar == null) {
            p0(1);
        }
        if (fVar == null) {
            p0(2);
        }
        if (iVar == null) {
            p0(3);
        }
        if (gVar == null) {
            p0(4);
        }
        if (x0Var == null) {
            p0(5);
        }
        return new q(nVar, bVar, bVar.s(), fVar, iVar, gVar, x0Var);
    }

    private static /* synthetic */ void p0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // p10.b
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.b B() {
        return null;
    }

    @Override // s10.z
    @m80.k
    public x20.k V(@m80.k f30.g gVar) {
        if (gVar == null) {
            p0(13);
        }
        x20.k kVar = this.f87265k;
        if (kVar == null) {
            p0(14);
        }
        return kVar;
    }

    @Override // p10.b
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            p0(16);
        }
        return list;
    }

    @Override // q10.a
    @m80.k
    public q10.g getAnnotations() {
        q10.g gVar = this.f87267m;
        if (gVar == null) {
            p0(21);
        }
        return gVar;
    }

    @Override // p10.b
    @m80.k
    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            p0(18);
        }
        return classKind;
    }

    @Override // p10.b, p10.x, p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p pVar = p10.o.f78590e;
        if (pVar == null) {
            p0(20);
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
        Modality modality = Modality.FINAL;
        if (modality == null) {
            p0(19);
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
        u1 u1Var = this.f87264j;
        if (u1Var == null) {
            p0(17);
        }
        return u1Var;
    }

    @Override // p10.b
    @m80.k
    public Collection<p10.b> p() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            p0(23);
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
            p0(15);
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
            p0(22);
        }
        return list;
    }

    public String toString() {
        return "enum entry " + getName();
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
