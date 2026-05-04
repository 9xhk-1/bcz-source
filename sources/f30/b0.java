package f30;

import a00.i0;
import e30.c1;
import e30.g1;
import e30.k2;
import e30.l0;
import e30.l1;
import e30.q0;
import e30.r0;
import e30.r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1557#2:184\n1628#2,2:185\n1630#2:188\n1797#2,3:189\n1628#2,3:192\n1557#2:195\n1628#2,3:196\n2669#2,7:199\n1755#2,3:206\n1#3:187\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n*L\n80#1:184\n80#1:185,2\n80#1:188\n87#1:189,3\n98#1:192,3\n104#1:195\n104#1:196,3\n104#1:199,7\n137#1:206,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b0 f50421a = new b0();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f50422a = new c("START", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f50423b = new C0605a("ACCEPT_NULL", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f50424c = new d("UNKNOWN", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f50425d = new b("NOT_NULL", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f50426e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ m00.a f50427f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: f30.b0$a$a, reason: collision with other inner class name */
        public static final class C0605a extends a {
            public C0605a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // f30.b0.a
            @m80.k
            public a b(@m80.k k2 nextType) {
                g0.p(nextType, "nextType");
                return c(nextType);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends a {
            public b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // f30.b0.a
            @m80.k
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public b b(@m80.k k2 nextType) {
                g0.p(nextType, "nextType");
                return this;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c extends a {
            public c(String str, int i11) {
                super(str, i11, null);
            }

            @Override // f30.b0.a
            @m80.k
            public a b(@m80.k k2 nextType) {
                g0.p(nextType, "nextType");
                return c(nextType);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class d extends a {
            public d(String str, int i11) {
                super(str, i11, null);
            }

            @Override // f30.b0.a
            @m80.k
            public a b(@m80.k k2 nextType) {
                g0.p(nextType, "nextType");
                a c11 = c(nextType);
                return c11 == a.f50423b ? this : c11;
            }
        }

        static {
            a[] a11 = a();
            f50426e = a11;
            f50427f = m00.c.c(a11);
        }

        public /* synthetic */ a(String str, int i11, kotlin.jvm.internal.v vVar) {
            this(str, i11);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f50422a, f50423b, f50424c, f50425d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f50426e.clone();
        }

        @m80.k
        public abstract a b(@m80.k k2 k2Var);

        @m80.k
        public final a c(@m80.k k2 k2Var) {
            g0.p(k2Var, "<this>");
            return k2Var.J0() ? f50423b : ((k2Var instanceof e30.x) && (((e30.x) k2Var).U0() instanceof l1)) ? f50425d : k2Var instanceof l1 ? f50424c : s.f50456a.a(k2Var) ? f50425d : f50424c;
        }

        public a(String str, int i11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReference implements x00.p<r0, r0, Boolean> {
        public b(Object obj) {
            super(2, obj);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r0 p02, r0 p12) {
            g0.p(p02, "p0");
            g0.p(p12, "p1");
            return Boolean.valueOf(((b0) this.receiver).g(p02, p12));
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(b0.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class c extends FunctionReference implements x00.p<r0, r0, Boolean> {
        public c(Object obj) {
            super(2, obj);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r0 p02, r0 p12) {
            g0.p(p02, "p0");
            g0.p(p12, "p1");
            return Boolean.valueOf(((q) this.receiver).b(p02, p12));
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(q.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + a00.r0.r3(set, null, null, null, 0, null, null, 63, null);
    }

    public final Collection<c1> c(Collection<? extends c1> collection, x00.p<? super c1, ? super c1, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        g0.o(it, "iterator(...)");
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    c1 c1Var2 = (c1) it2.next();
                    if (c1Var2 != c1Var) {
                        g0.m(c1Var2);
                        g0.m(c1Var);
                        if (pVar.invoke(c1Var2, c1Var).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @m80.k
    public final c1 d(@m80.k List<? extends c1> types) {
        g0.p(types, "types");
        types.size();
        ArrayList<c1> arrayList = new ArrayList();
        for (c1 c1Var : types) {
            if (c1Var.I0() instanceof q0) {
                Collection<r0> c11 = c1Var.I0().c();
                g0.o(c11, "getSupertypes(...)");
                Collection<r0> collection = c11;
                ArrayList arrayList2 = new ArrayList(i0.d0(collection, 10));
                for (r0 r0Var : collection) {
                    g0.m(r0Var);
                    c1 d11 = l0.d(r0Var);
                    if (c1Var.J0()) {
                        d11 = d11.M0(true);
                    }
                    arrayList2.add(d11);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(c1Var);
            }
        }
        a aVar = a.f50422a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar = aVar.b((k2) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c1 c1Var2 : arrayList) {
            if (aVar == a.f50425d) {
                if (c1Var2 instanceof i) {
                    c1Var2 = g1.k((i) c1Var2);
                }
                c1Var2 = g1.i(c1Var2, false, 1, null);
            }
            linkedHashSet.add(c1Var2);
        }
        List<? extends c1> list = types;
        ArrayList arrayList3 = new ArrayList(i0.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((c1) it2.next()).H0());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((r1) next).k((r1) it3.next());
        }
        return e(linkedHashSet).O0((r1) next);
    }

    public final c1 e(Set<? extends c1> set) {
        if (set.size() == 1) {
            return (c1) a00.r0.k5(set);
        }
        new a0(set);
        Set<? extends c1> set2 = set;
        Collection<c1> c11 = c(set2, new b(this));
        c11.isEmpty();
        c1 b11 = s20.q.f87451f.b(c11);
        if (b11 != null) {
            return b11;
        }
        Collection<c1> c12 = c(c11, new c(p.f50450b.a()));
        c12.isEmpty();
        return c12.size() < 2 ? (c1) a00.r0.k5(c12) : new q0(set2).i();
    }

    public final boolean g(r0 r0Var, r0 r0Var2) {
        q a11 = p.f50450b.a();
        return a11.a(r0Var, r0Var2) && !a11.a(r0Var2, r0Var);
    }
}
