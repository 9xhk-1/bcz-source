package s20;

import a00.h0;
import e30.c1;
import e30.c2;
import e30.e2;
import e30.r0;
import e30.r1;
import e30.u1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1734#2,3:182\n1755#2,3:185\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n*L\n132#1:182,3\n176#1:185,3\n*E\n"})
/* loaded from: classes8.dex */
public final class q implements u1 {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f87451f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f87452a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.a0 f87453b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Set<r0> f87454c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c1 f87455d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final yz.c0 f87456e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n2669#2,7:182\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n*L\n40#1:182,7\n*E\n"})
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: s20.q$a$a, reason: collision with other inner class name */
        public static final class EnumC1126a {

            /* renamed from: a, reason: collision with root package name */
            public static final EnumC1126a f87457a = new EnumC1126a("COMMON_SUPER_TYPE", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC1126a f87458b = new EnumC1126a("INTERSECTION_TYPE", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ EnumC1126a[] f87459c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ m00.a f87460d;

            static {
                EnumC1126a[] a11 = a();
                f87459c = a11;
                f87460d = m00.c.c(a11);
            }

            public EnumC1126a(String str, int i11) {
            }

            public static final /* synthetic */ EnumC1126a[] a() {
                return new EnumC1126a[]{f87457a, f87458b};
            }

            public static EnumC1126a valueOf(String str) {
                return (EnumC1126a) Enum.valueOf(EnumC1126a.class, str);
            }

            public static EnumC1126a[] values() {
                return (EnumC1126a[]) f87459c.clone();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f87461a;

            static {
                int[] iArr = new int[EnumC1126a.values().length];
                try {
                    iArr[EnumC1126a.f87457a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1126a.f87458b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f87461a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final c1 a(Collection<? extends c1> collection, EnumC1126a enumC1126a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                c1 c1Var = (c1) it.next();
                next = q.f87451f.c((c1) next, c1Var, enumC1126a);
            }
            return (c1) next;
        }

        @m80.l
        public final c1 b(@m80.k Collection<? extends c1> types) {
            g0.p(types, "types");
            return a(types, EnumC1126a.f87458b);
        }

        public final c1 c(c1 c1Var, c1 c1Var2, EnumC1126a enumC1126a) {
            if (c1Var != null && c1Var2 != null) {
                u1 I0 = c1Var.I0();
                u1 I02 = c1Var2.I0();
                boolean z11 = I0 instanceof q;
                if (z11 && (I02 instanceof q)) {
                    return e((q) I0, (q) I02, enumC1126a);
                }
                if (z11) {
                    return d((q) I0, c1Var2);
                }
                if (I02 instanceof q) {
                    return d((q) I02, c1Var);
                }
            }
            return null;
        }

        public final c1 d(q qVar, c1 c1Var) {
            if (qVar.i().contains(c1Var)) {
                return c1Var;
            }
            return null;
        }

        public final c1 e(q qVar, q qVar2, EnumC1126a enumC1126a) {
            Set n32;
            int i11 = b.f87461a[enumC1126a.ordinal()];
            if (i11 == 1) {
                n32 = a00.r0.n3(qVar.i(), qVar2.i());
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n32 = a00.r0.h6(qVar.i(), qVar2.i());
            }
            return e30.u0.f(r1.f48652b.j(), new q(qVar.f87452a, qVar.f87453b, n32, null), false);
        }

        public a() {
        }
    }

    public /* synthetic */ q(long j11, p10.a0 a0Var, Set set, kotlin.jvm.internal.v vVar) {
        this(j11, a0Var, set);
    }

    private final List<r0> j() {
        return (List) this.f87456e.getValue();
    }

    public static final List l(q qVar) {
        c1 s11 = qVar.q().x().s();
        g0.o(s11, "getDefaultType(...)");
        List U = h0.U(e2.f(s11, a00.g0.l(new c2(Variance.IN_VARIANCE, qVar.f87455d)), null, 2, null));
        if (!qVar.k()) {
            U.add(qVar.q().L());
        }
        return U;
    }

    public static final CharSequence n(r0 it) {
        g0.p(it, "it");
        return it.toString();
    }

    @Override // e30.u1
    @m80.k
    public Collection<r0> c() {
        return j();
    }

    @Override // e30.u1
    @m80.k
    public u1 d(@m80.k f30.g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // e30.u1
    @m80.k
    public List<p10.c1> getParameters() {
        return h0.J();
    }

    @m80.k
    public final Set<r0> i() {
        return this.f87454c;
    }

    public final boolean k() {
        Collection<r0> a11 = w.a(this.f87453b);
        if ((a11 instanceof Collection) && a11.isEmpty()) {
            return true;
        }
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            if (this.f87454c.contains((r0) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String m() {
        return '[' + a00.r0.r3(this.f87454c, ",", null, null, 0, null, p.f87450a, 30, null) + l50.b.f69930l;
    }

    @Override // e30.u1
    @m80.k
    public n10.j q() {
        return this.f87453b.q();
    }

    @Override // e30.u1
    @m80.l
    public p10.d r() {
        return null;
    }

    @Override // e30.u1
    public boolean s() {
        return false;
    }

    @m80.k
    public String toString() {
        return "IntegerLiteralType" + m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(long j11, p10.a0 a0Var, Set<? extends r0> set) {
        this.f87455d = e30.u0.f(r1.f48652b.j(), this, false);
        this.f87456e = yz.e0.c(new o(this));
        this.f87452a = j11;
        this.f87453b = a0Var;
        this.f87454c = set;
    }
}
