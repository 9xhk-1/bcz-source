package bb0;

import a00.m;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import oa0.f;
import oa0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g
@u0({"SMAP\nCoreResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreResolver.kt\norg/koin/core/resolution/CoreResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n140#1:176\n141#1,2:178\n91#1,4:180\n99#1,6:184\n109#1,3:190\n116#1,3:193\n1#2:177\n1#2:196\n*S KotlinDebug\n*F\n+ 1 CoreResolver.kt\norg/koin/core/resolution/CoreResolver\n*L\n69#1:176\n69#1:178,2\n73#1:180,4\n75#1:184,6\n76#1:190,3\n77#1:193,3\n69#1:177\n*E\n"})
/* loaded from: classes9.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final na0.a f6694a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList<d> f6695b;

    public a(@k na0.a _koin) {
        g0.p(_koin, "_koin");
        this.f6694a = _koin;
        this.f6695b = new ArrayList<>();
    }

    public static /* synthetic */ Object f(a aVar, cb0.b bVar, ta0.d dVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return aVar.e(bVar, dVar, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r8 == null) goto L8;
     */
    @Override // bb0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T a(@m80.k cb0.b r8, @m80.k ta0.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "instanceContext"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r8 = f(r1, r2, r3, r4, r5, r6)
            if (r8 != 0) goto L60
            za0.a r8 = r3.e()
            r9 = 39
            if (r8 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " and qualifier '"
            r0.append(r1)
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            if (r8 != 0) goto L36
        L34:
            java.lang.String r8 = ""
        L36:
            org.koin.core.error.NoDefinitionFoundException r0 = new org.koin.core.error.NoDefinitionFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No definition found for type '"
            r1.append(r2)
            h10.d r2 = r3.a()
            java.lang.String r2 = fb0.b.a(r2)
            r1.append(r2)
            r1.append(r9)
            r1.append(r8)
            java.lang.String r8 = ". Check your Modules configuration and add missing type and/or qualifier!"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bb0.a.a(cb0.b, ta0.d):java.lang.Object");
    }

    public final void b(@k d resolutionExtension) {
        g0.p(resolutionExtension, "resolutionExtension");
        this.f6695b.add(resolutionExtension);
    }

    public final <T> T c(cb0.b bVar, ta0.d dVar) {
        for (cb0.b bVar2 : b.a(bVar.r())) {
            dVar.c().a("|- ? " + dVar.b() + " look in scope '" + bVar2.p() + '\'');
            T t11 = (T) e(bVar2, !bVar2.T() ? dVar.h(bVar2) : dVar, false);
            if (t11 != null) {
                return t11;
            }
        }
        return null;
    }

    @k
    public final ArrayList<d> d() {
        return this.f6695b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T e(cb0.b r7, ta0.d r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bb0.a.e(cb0.b, ta0.d, boolean):java.lang.Object");
    }

    public final <T> T g(ta0.d dVar) {
        if (dVar.d() == null || dVar.d().u()) {
            return null;
        }
        dVar.c().a("|- ? " + dVar.b() + " look in injected parameters");
        return (T) dVar.d().n(dVar.a());
    }

    public final <T> T h(cb0.b bVar, ta0.d dVar) {
        if (bVar.T()) {
            return null;
        }
        dVar.c().a("|- ? " + dVar.b() + " look in other scopes");
        return (T) c(bVar, dVar);
    }

    public final <T> T i(cb0.b bVar, ta0.d dVar) {
        return (T) this.f6694a.u().n(dVar.e(), dVar.a(), bVar.G(), dVar);
    }

    @f
    public final <T> T j(cb0.b bVar, ta0.d dVar) {
        if (bVar.T() || !(bVar.G() instanceof za0.d)) {
            return null;
        }
        dVar.c().a("|- ? " + dVar.b() + " look at scope archetype");
        return (T) this.f6694a.u().o(dVar.e(), dVar.a(), dVar);
    }

    public final <T> T k(cb0.b bVar, ta0.d dVar) {
        T t11;
        if (!bVar.T() && bVar.I() != null && dVar.a().B(bVar.I()) && dVar.e() == null) {
            dVar.c().a("|- ? " + dVar.b() + " look at scope source");
            if (!dVar.a().B(bVar.I()) || (t11 = (T) bVar.I()) == null) {
                return null;
            }
            return t11;
        }
        return null;
    }

    public final <T> T l(cb0.b bVar, ta0.d dVar) {
        ThreadLocal<m<ya0.a>> z11 = bVar.z();
        m<ya0.a> mVar = z11 != null ? z11.get() : null;
        if (mVar != null && !mVar.isEmpty()) {
            dVar.c().a("|- ? " + dVar.b() + " look in stack parameters");
            ya0.a h11 = mVar.h();
            if (h11 != null) {
                return (T) h11.n(dVar.a());
            }
        }
        return null;
    }

    public final <T> T m(cb0.b bVar, ta0.d dVar) {
        for (d dVar2 : this.f6695b) {
            dVar.c().a("|- ['" + dVar2.getName() + "'] ?");
            T t11 = (T) dVar2.a(bVar, dVar);
            if (t11 != null) {
                return t11;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T n(ta0.d r6) {
        /*
            r5 = this;
            za0.a r0 = r6.e()
            r1 = 39
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " and qualifier '"
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            if (r0 != 0) goto L20
        L1e:
            java.lang.String r0 = ""
        L20:
            org.koin.core.error.NoDefinitionFoundException r2 = new org.koin.core.error.NoDefinitionFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No definition found for type '"
            r3.append(r4)
            h10.d r6 = r6.a()
            java.lang.String r6 = fb0.b.a(r6)
            r3.append(r6)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r6 = ". Check your Modules configuration and add missing type and/or qualifier!"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bb0.a.n(ta0.d):java.lang.Object");
    }
}
