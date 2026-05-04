package p10;

import a00.w1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import l30.l;
import p10.n1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p f78586a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final p f78587b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final p f78588c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final p f78589d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final p f78590e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final p f78591f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final p f78592g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final p f78593h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final p f78594i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<p> f78595j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<p, Integer> f78596k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f78597l;

    /* renamed from: m, reason: collision with root package name */
    public static final y20.h f78598m;

    /* renamed from: n, reason: collision with root package name */
    public static final y20.h f78599n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final y20.h f78600o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final l30.l f78601p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final Map<o1, p> f78602q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements y20.h {
        @Override // y20.h
        @m80.k
        public e30.r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements y20.h {
        @Override // y20.h
        @m80.k
        public e30.r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements y20.h {
        @Override // y20.h
        @m80.k
        public e30.r0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends m {
        public d(o1 o1Var) {
            super(o1Var);
        }

        public static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "what";
            } else if (i11 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [p10.h, p10.l] */
        /* JADX WARN: Type inference failed for: r4v1, types: [p10.h] */
        /* JADX WARN: Type inference failed for: r4v2, types: [p10.h] */
        /* JADX WARN: Type inference failed for: r4v4, types: [p10.h] */
        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == 0) {
                g(1);
            }
            if (hVar2 == null) {
                g(2);
            }
            if (q20.h.J(lVar) && h(hVar2)) {
                return o.f(lVar, hVar2);
            }
            if (lVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                p10.e b11 = ((kotlin.reflect.jvm.internal.impl.descriptors.c) lVar).b();
                if (z11 && q20.h.G(b11) && q20.h.J(b11) && (hVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) && q20.h.J(hVar2.b()) && o.f(lVar, hVar2)) {
                    return true;
                }
            }
            while (lVar != 0) {
                lVar = lVar.b();
                if (((lVar instanceof p10.b) && !q20.h.x(lVar)) || (lVar instanceof g0)) {
                    break;
                }
            }
            if (lVar == 0) {
                return false;
            }
            while (hVar2 != null) {
                if (lVar == hVar2) {
                    return true;
                }
                if (hVar2 instanceof g0) {
                    return (lVar instanceof g0) && lVar.d().equals(((g0) hVar2).d()) && q20.h.b(hVar2, lVar);
                }
                hVar2 = hVar2.b();
            }
            return false;
        }

        public final boolean h(@m80.k p10.h hVar) {
            if (hVar == null) {
                g(0);
            }
            return q20.h.j(hVar) != y0.f78623a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends m {
        public e(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            p10.h q11;
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            if (o.f78586a.e(hVar, lVar, hVar2, z11)) {
                if (hVar == o.f78599n) {
                    return true;
                }
                if (hVar != o.f78598m && (q11 = q20.h.q(lVar, p10.b.class)) != null && (hVar instanceof y20.j)) {
                    return ((y20.j) hVar).l().a().equals(q11.a());
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends m {
        public f(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "from";
            } else if (i11 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i11 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i11 == 2 || i11 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            p10.b bVar;
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            p10.b bVar2 = (p10.b) q20.h.q(lVar, p10.b.class);
            p10.b bVar3 = (p10.b) q20.h.r(hVar2, p10.b.class, false);
            if (bVar3 == null) {
                return false;
            }
            if (bVar2 != null && q20.h.x(bVar2) && (bVar = (p10.b) q20.h.q(bVar2, p10.b.class)) != null && q20.h.H(bVar3, bVar)) {
                return true;
            }
            p10.l M = q20.h.M(lVar);
            p10.b bVar4 = (p10.b) q20.h.q(M, p10.b.class);
            if (bVar4 == null) {
                return false;
            }
            if (q20.h.H(bVar3, bVar4) && h(hVar, M, bVar3)) {
                return true;
            }
            return e(hVar, lVar, bVar3.b(), z11);
        }

        public final boolean h(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.b bVar) {
            if (lVar == null) {
                g(2);
            }
            if (bVar == null) {
                g(3);
            }
            if (hVar == o.f78600o) {
                return false;
            }
            if (!(lVar instanceof CallableMemberDescriptor) || (lVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) || hVar == o.f78599n) {
                return true;
            }
            if (hVar == o.f78598m || hVar == null) {
                return false;
            }
            e30.r0 b11 = hVar instanceof y20.i ? ((y20.i) hVar).b() : hVar.getType();
            return q20.h.I(b11, bVar) || e30.e0.a(b11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends m {
        public g(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            if (q20.h.g(hVar2).X(q20.h.g(lVar))) {
                return o.f78601p.a(lVar, hVar2);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h extends m {
        public h(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends m {
        public i(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j extends m {
        public j(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends m {
        public k(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l extends m {
        public l(o1 o1Var) {
            super(o1Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p10.p
        public boolean e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
            if (lVar == null) {
                g(0);
            }
            if (hVar2 == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(n1.e.f78581c);
        f78586a = dVar;
        e eVar = new e(n1.f.f78582c);
        f78587b = eVar;
        f fVar = new f(n1.g.f78583c);
        f78588c = fVar;
        g gVar = new g(n1.b.f78578c);
        f78589d = gVar;
        h hVar = new h(n1.h.f78584c);
        f78590e = hVar;
        i iVar = new i(n1.d.f78580c);
        f78591f = iVar;
        j jVar = new j(n1.a.f78577c);
        f78592g = jVar;
        k kVar = new k(n1.c.f78579c);
        f78593h = kVar;
        l lVar = new l(n1.i.f78585c);
        f78594i = lVar;
        f78595j = Collections.unmodifiableSet(w1.u(dVar, eVar, gVar, iVar));
        HashMap e11 = o30.a.e(4);
        e11.put(eVar, 0);
        e11.put(dVar, 0);
        e11.put(gVar, 1);
        e11.put(fVar, 1);
        e11.put(hVar, 2);
        f78596k = Collections.unmodifiableMap(e11);
        f78597l = hVar;
        f78598m = new a();
        f78599n = new b();
        f78600o = new c();
        Iterator it = ServiceLoader.load(l30.l.class, l30.l.class.getClassLoader()).iterator();
        f78601p = it.hasNext() ? (l30.l) it.next() : l.a.f69790a;
        f78602q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p10.o.a(int):void");
    }

    @m80.l
    public static Integer d(@m80.k p pVar, @m80.k p pVar2) {
        if (pVar == null) {
            a(12);
        }
        if (pVar2 == null) {
            a(13);
        }
        Integer a11 = pVar.a(pVar2);
        if (a11 != null) {
            return a11;
        }
        Integer a12 = pVar2.a(pVar);
        if (a12 != null) {
            return Integer.valueOf(-a12.intValue());
        }
        return null;
    }

    @m80.l
    public static p10.l e(@m80.l y20.h hVar, @m80.k p10.l lVar, @m80.k p10.h hVar2, boolean z11) {
        p10.l e11;
        if (lVar == null) {
            a(8);
        }
        if (hVar2 == null) {
            a(9);
        }
        for (p10.l lVar2 = (p10.l) lVar.a(); lVar2 != null && lVar2.getVisibility() != f78591f; lVar2 = (p10.l) q20.h.q(lVar2, p10.l.class)) {
            if (!lVar2.getVisibility().e(hVar, lVar2, hVar2, z11)) {
                return lVar2;
            }
        }
        if (!(lVar instanceof s10.q0) || (e11 = e(hVar, ((s10.q0) lVar).H(), hVar2, z11)) == null) {
            return null;
        }
        return e11;
    }

    public static boolean f(@m80.k p10.h hVar, @m80.k p10.h hVar2) {
        if (hVar == null) {
            a(6);
        }
        if (hVar2 == null) {
            a(7);
        }
        y0 j11 = q20.h.j(hVar2);
        if (j11 != y0.f78623a) {
            return j11.equals(q20.h.j(hVar));
        }
        return false;
    }

    public static boolean g(@m80.k p pVar) {
        if (pVar == null) {
            a(14);
        }
        return pVar == f78586a || pVar == f78587b;
    }

    public static boolean h(@m80.k p10.l lVar, @m80.k p10.h hVar, boolean z11) {
        if (lVar == null) {
            a(2);
        }
        if (hVar == null) {
            a(3);
        }
        return e(f78599n, lVar, hVar, z11) == null;
    }

    public static void i(p pVar) {
        f78602q.put(pVar.b(), pVar);
    }

    @m80.k
    public static p j(@m80.k o1 o1Var) {
        if (o1Var == null) {
            a(15);
        }
        p pVar = f78602q.get(o1Var);
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + o1Var);
    }
}
