package e30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f48597a = g30.i.d(ErrorTypeKind.DONT_CARE, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f48598b = g30.i.d(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c1 f48599c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f48600d = new a("UNIT_EXPECTED_TYPE");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ boolean f48601e = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends z {

        /* renamed from: b, reason: collision with root package name */
        public final String f48602b;

        public a(String str) {
            this.f48602b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void U0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: e30.h2.a.U0(int):void");
        }

        @Override // e30.k2
        @m80.k
        /* renamed from: P0, reason: merged with bridge method [inline-methods] */
        public c1 M0(boolean z11) {
            throw new IllegalStateException(this.f48602b);
        }

        @Override // e30.k2
        @m80.k
        /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
        public c1 O0(@m80.k r1 r1Var) {
            if (r1Var == null) {
                U0(0);
            }
            throw new IllegalStateException(this.f48602b);
        }

        @Override // e30.z
        @m80.k
        public c1 R0() {
            throw new IllegalStateException(this.f48602b);
        }

        @Override // e30.z
        @m80.k
        public z T0(@m80.k c1 c1Var) {
            if (c1Var == null) {
                U0(2);
            }
            throw new IllegalStateException(this.f48602b);
        }

        @Override // e30.z
        @m80.k
        /* renamed from: V0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a S0(@m80.k f30.g gVar) {
            if (gVar == null) {
                U0(3);
            }
            return this;
        }

        @Override // e30.c1
        @m80.k
        public String toString() {
            String str = this.f48602b;
            if (str == null) {
                U0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e30.h2.a(int):void");
    }

    public static boolean b(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(28);
        }
        if (r0Var.J0()) {
            return true;
        }
        return l0.b(r0Var) && b(l0.a(r0Var).R0());
    }

    public static boolean c(@m80.l r0 r0Var, @m80.k x00.l<k2, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(r0Var, lVar, null);
    }

    public static boolean d(@m80.l r0 r0Var, @m80.k x00.l<k2, Boolean> lVar, o30.l<r0> lVar2) {
        if (lVar == null) {
            a(44);
        }
        if (r0Var == null) {
            return false;
        }
        k2 L0 = r0Var.L0();
        if (w(r0Var)) {
            return lVar.invoke(L0).booleanValue();
        }
        if (lVar2 != null && lVar2.contains(r0Var)) {
            return false;
        }
        if (lVar.invoke(L0).booleanValue()) {
            return true;
        }
        if (lVar2 == null) {
            lVar2 = o30.l.a();
        }
        lVar2.add(r0Var);
        i0 i0Var = L0 instanceof i0 ? (i0) L0 : null;
        if (i0Var != null && (d(i0Var.Q0(), lVar, lVar2) || d(i0Var.R0(), lVar, lVar2))) {
            return true;
        }
        if ((L0 instanceof x) && d(((x) L0).U0(), lVar, lVar2)) {
            return true;
        }
        u1 I0 = r0Var.I0();
        if (I0 instanceof q0) {
            Iterator<r0> it = ((q0) I0).c().iterator();
            while (it.hasNext()) {
                if (d(it.next(), lVar, lVar2)) {
                    return true;
                }
            }
            return false;
        }
        for (a2 a2Var : r0Var.G0()) {
            if (!a2Var.a() && d(a2Var.getType(), lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    @m80.l
    public static r0 e(@m80.k r0 r0Var, @m80.k r0 r0Var2, @m80.k f2 f2Var) {
        if (r0Var == null) {
            a(20);
        }
        if (r0Var2 == null) {
            a(21);
        }
        if (f2Var == null) {
            a(22);
        }
        r0 p11 = f2Var.p(r0Var2, Variance.INVARIANT);
        if (p11 != null) {
            return q(p11, r0Var.J0());
        }
        return null;
    }

    @m80.l
    public static p10.b f(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(30);
        }
        p10.d r11 = r0Var.I0().r();
        if (r11 instanceof p10.b) {
            return (p10.b) r11;
        }
        return null;
    }

    @m80.k
    public static List<a2> g(@m80.k List<p10.c1> list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<p10.c1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c2(it.next().s()));
        }
        List<a2> a62 = a00.r0.a6(arrayList);
        if (a62 == null) {
            a(17);
        }
        return a62;
    }

    @m80.k
    public static List<r0> h(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(18);
        }
        f2 f11 = f2.f(r0Var);
        Collection<r0> c11 = r0Var.I0().c();
        ArrayList arrayList = new ArrayList(c11.size());
        Iterator<r0> it = c11.iterator();
        while (it.hasNext()) {
            r0 e11 = e(r0Var, it.next(), f11);
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        return arrayList;
    }

    @m80.l
    public static p10.c1 i(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(63);
        }
        if (r0Var.I0().r() instanceof p10.c1) {
            return (p10.c1) r0Var.I0().r();
        }
        return null;
    }

    public static boolean j(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(29);
        }
        if (r0Var.I0().r() instanceof p10.b) {
            return false;
        }
        Iterator<r0> it = h(r0Var).iterator();
        while (it.hasNext()) {
            if (l(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(@m80.l r0 r0Var) {
        return r0Var != null && r0Var.I0() == f48597a.I0();
    }

    public static boolean l(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(27);
        }
        if (r0Var.J0()) {
            return true;
        }
        if (l0.b(r0Var) && l(l0.a(r0Var).R0())) {
            return true;
        }
        if (g1.c(r0Var)) {
            return false;
        }
        if (m(r0Var)) {
            return j(r0Var);
        }
        if (r0Var instanceof d) {
            p10.c1 a11 = ((d) r0Var).R0().a();
            return a11 == null || j(a11.s());
        }
        u1 I0 = r0Var.I0();
        if (I0 instanceof q0) {
            Iterator<r0> it = I0.c().iterator();
            while (it.hasNext()) {
                if (l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(60);
        }
        return i(r0Var) != null || (r0Var.I0() instanceof f30.r);
    }

    @m80.k
    public static r0 n(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(2);
        }
        return p(r0Var, false);
    }

    @m80.k
    public static r0 o(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(1);
        }
        return p(r0Var, true);
    }

    @m80.k
    public static r0 p(@m80.k r0 r0Var, boolean z11) {
        if (r0Var == null) {
            a(3);
        }
        k2 M0 = r0Var.L0().M0(z11);
        if (M0 == null) {
            a(4);
        }
        return M0;
    }

    @m80.k
    public static r0 q(@m80.k r0 r0Var, boolean z11) {
        if (r0Var == null) {
            a(8);
        }
        if (z11) {
            return o(r0Var);
        }
        if (r0Var == null) {
            a(9);
        }
        return r0Var;
    }

    @m80.k
    public static c1 r(@m80.k c1 c1Var, boolean z11) {
        if (c1Var == null) {
            a(5);
        }
        if (!z11) {
            if (c1Var == null) {
                a(7);
            }
            return c1Var;
        }
        c1 M0 = c1Var.M0(true);
        if (M0 == null) {
            a(6);
        }
        return M0;
    }

    @m80.k
    public static a2 s(@m80.k p10.c1 c1Var) {
        if (c1Var == null) {
            a(45);
        }
        return new j1(c1Var);
    }

    @m80.k
    public static a2 t(@m80.k p10.c1 c1Var, g0 g0Var) {
        if (c1Var == null) {
            a(46);
        }
        return g0Var.b() == TypeUsage.SUPERTYPE ? new c2(k1.b(c1Var)) : new j1(c1Var);
    }

    @m80.k
    public static c1 u(@m80.k u1 u1Var, @m80.k x20.k kVar, @m80.k x00.l<f30.g, c1> lVar) {
        if (u1Var == null) {
            a(12);
        }
        if (kVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        c1 p11 = u0.p(r1.f48652b.j(), u1Var, g(u1Var.getParameters()), false, kVar, lVar);
        if (p11 == null) {
            a(15);
        }
        return p11;
    }

    @m80.k
    public static c1 v(p10.d dVar, x20.k kVar, x00.l<f30.g, c1> lVar) {
        if (!g30.i.m(dVar)) {
            return u(dVar.o(), kVar, lVar);
        }
        g30.g d11 = g30.i.d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, dVar.toString());
        if (d11 == null) {
            a(11);
        }
        return d11;
    }

    public static boolean w(@m80.k r0 r0Var) {
        if (r0Var == null) {
            a(0);
        }
        return r0Var == f48599c || r0Var == f48600d;
    }
}
