package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a00.d1;
import a00.h0;
import a00.i0;
import d30.n;
import e30.c2;
import e30.r0;
import e30.r1;
import e30.u1;
import g10.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m80.k;
import n10.o;
import p10.a0;
import p10.a1;
import p10.c1;
import p10.g0;
import p10.h1;
import p10.p;
import p10.t;
import p10.x0;
import q10.g;
import s10.t0;
import x20.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1557#2:147\n1628#2,3:148\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n*L\n54#1:147\n54#1:148,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b extends s10.a {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f67188o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final n20.b f67189p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final n20.b f67190q;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final n f67191g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g0 f67192h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final e f67193i;

    /* renamed from: j, reason: collision with root package name */
    public final int f67194j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C0789b f67195k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final c f67196l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final List<c1> f67197m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final FunctionClassKind f67198n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1557#2:147\n1628#2,2:148\n1557#2:150\n1628#2,3:151\n1630#2:154\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n*L\n113#1:147\n113#1:148,2\n117#1:150\n117#1:151,3\n113#1:154\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.b$b, reason: collision with other inner class name */
    public final class C0789b extends e30.b {
        public C0789b() {
            super(b.this.f67191g);
        }

        @Override // e30.b, e30.u, e30.u1
        @k
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public b r() {
            return b.this;
        }

        @Override // e30.u1
        @k
        public List<c1> getParameters() {
            return b.this.f67197m;
        }

        @Override // e30.o
        @k
        public Collection<r0> p() {
            List Q;
            e P0 = b.this.P0();
            e.a aVar = e.a.f67204e;
            if (kotlin.jvm.internal.g0.g(P0, aVar)) {
                Q = a00.g0.l(b.f67189p);
            } else if (kotlin.jvm.internal.g0.g(P0, e.b.f67205e)) {
                Q = h0.Q(b.f67190q, new n20.b(o.A, aVar.c(b.this.L0())));
            } else {
                e.d dVar = e.d.f67207e;
                if (kotlin.jvm.internal.g0.g(P0, dVar)) {
                    Q = a00.g0.l(b.f67189p);
                } else {
                    if (!kotlin.jvm.internal.g0.g(P0, e.c.f67206e)) {
                        p30.a.b(null, 1, null);
                        throw null;
                    }
                    Q = h0.Q(b.f67190q, new n20.b(o.f74021s, dVar.c(b.this.L0())));
                }
            }
            a0 b11 = b.this.f67192h.b();
            List<n20.b> list = Q;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            for (n20.b bVar : list) {
                p10.b b12 = t.b(b11, bVar);
                if (b12 == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List P5 = a00.r0.P5(getParameters(), b12.o().getParameters().size());
                ArrayList arrayList2 = new ArrayList(i0.d0(P5, 10));
                Iterator it = P5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new c2(((c1) it.next()).s()));
                }
                arrayList.add(e30.u0.h(r1.f48652b.j(), b12, arrayList2));
            }
            return a00.r0.a6(arrayList);
        }

        @Override // e30.u1
        public boolean s() {
            return true;
        }

        @k
        public String toString() {
            return r().toString();
        }

        @Override // e30.o
        @k
        public a1 w() {
            return a1.a.f78552a;
        }
    }

    static {
        n20.c cVar = o.A;
        n20.f f11 = n20.f.f("Function");
        kotlin.jvm.internal.g0.o(f11, "identifier(...)");
        f67189p = new n20.b(cVar, f11);
        n20.c cVar2 = o.f74026x;
        n20.f f12 = n20.f.f("KFunction");
        kotlin.jvm.internal.g0.o(f12, "identifier(...)");
        f67190q = new n20.b(cVar2, f12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k n storageManager, @k g0 containingDeclaration, @k e functionTypeKind, int i11) {
        super(storageManager, functionTypeKind.c(i11));
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.g0.p(functionTypeKind, "functionTypeKind");
        this.f67191g = storageManager;
        this.f67192h = containingDeclaration;
        this.f67193i = functionTypeKind;
        this.f67194j = i11;
        this.f67195k = new C0789b();
        this.f67196l = new c(storageManager, this);
        ArrayList arrayList = new ArrayList();
        l lVar = new l(1, i11);
        ArrayList arrayList2 = new ArrayList(i0.d0(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(nextInt);
            F0(arrayList, this, variance, sb2.toString());
            arrayList2.add(g2.f100423a);
        }
        F0(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f67197m = a00.r0.a6(arrayList);
        this.f67198n = FunctionClassKind.Companion.a(this.f67193i);
    }

    public static final void F0(ArrayList<c1> arrayList, b bVar, Variance variance, String str) {
        arrayList.add(t0.M0(bVar, g.A0.b(), false, variance, n20.f.f(str), arrayList.size(), bVar.f67191g));
    }

    @Override // p10.b
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b B() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) T0();
    }

    public final int L0() {
        return this.f67194j;
    }

    @m80.l
    public Void M0() {
        return null;
    }

    @Override // p10.b
    @k
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.b> f() {
        return h0.J();
    }

    @Override // p10.b, p10.i, p10.h
    @k
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public g0 b() {
        return this.f67192h;
    }

    @k
    public final e P0() {
        return this.f67193i;
    }

    @Override // p10.b
    @k
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public List<p10.b> p() {
        return h0.J();
    }

    @Override // p10.b
    @k
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public k.c r0() {
        return k.c.f97119b;
    }

    @Override // s10.z
    @m80.k
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public c V(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f67196l;
    }

    @m80.l
    public Void T0() {
        return null;
    }

    @Override // q10.a
    @m80.k
    public g getAnnotations() {
        return g.A0.b();
    }

    @Override // p10.b
    @m80.k
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // p10.k
    @m80.k
    public x0 getSource() {
        x0 NO_SOURCE = x0.f78622a;
        kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p10.b, p10.x, p10.l
    @m80.k
    public p getVisibility() {
        p PUBLIC = p10.o.f78590e;
        kotlin.jvm.internal.g0.o(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // p10.e
    public boolean i() {
        return false;
    }

    @Override // p10.b
    @m80.l
    public h1<e30.c1> i0() {
        return null;
    }

    @Override // p10.x
    public boolean isExternal() {
        return false;
    }

    @Override // p10.b
    public boolean isInline() {
        return false;
    }

    @Override // p10.b, p10.x
    @m80.k
    public Modality k() {
        return Modality.ABSTRACT;
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
        return this.f67195k;
    }

    @Override // p10.x
    public boolean q0() {
        return false;
    }

    @Override // p10.b
    public /* bridge */ /* synthetic */ p10.b s0() {
        return (p10.b) M0();
    }

    @Override // p10.b, p10.e
    @m80.k
    public List<c1> t() {
        return this.f67197m;
    }

    @m80.k
    public String toString() {
        String b11 = getName().b();
        kotlin.jvm.internal.g0.o(b11, "asString(...)");
        return b11;
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
