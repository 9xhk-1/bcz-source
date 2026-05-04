package kotlin.reflect.jvm.internal.impl.types;

import a00.h0;
import a00.m0;
import a00.r0;
import e30.c;
import i30.f;
import i30.h;
import i30.j;
import i30.l;
import i30.m;
import i30.o;
import i30.s;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import m80.k;
import w00.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContextKt\n*L\n1#1,860:1\n1#2:861\n1#2:878\n1#2:933\n1#2:971\n132#3,16:862\n148#3,13:879\n46#3,8:903\n132#3,16:917\n148#3,13:934\n132#3,16:955\n148#3,13:972\n1628#4,3:892\n1557#4:895\n1628#4,3:896\n1557#4:899\n1628#4,3:900\n1734#4,3:911\n1734#4,3:914\n774#4:947\n865#4:948\n866#4:954\n1368#4:985\n1454#4,5:986\n1755#4,3:991\n1755#4,3:994\n587#5,5:949\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n*L\n355#1:878\n647#1:933\n717#1:971\n355#1:862,16\n355#1:879,13\n500#1:903,8\n647#1:917,16\n647#1:934,13\n717#1:955,16\n717#1:972,13\n398#1:892,3\n401#1:895\n401#1:896,3\n414#1:899\n414#1:900,3\n586#1:911,3\n597#1:914,3\n692#1:947\n692#1:948\n692#1:954\n726#1:985\n726#1:986,5\n308#1:991,3\n316#1:994,3\n693#1:949,5\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f67667a = new b();

    /* renamed from: b, reason: collision with root package name */
    @g
    public static boolean f67668b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67669a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f67670b;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67669a = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f67670b = iArr2;
        }
    }

    public static final boolean d(o oVar, h hVar) {
        if (!(hVar instanceof i30.b)) {
            return false;
        }
        i30.k u02 = oVar.u0(oVar.H0((i30.b) hVar));
        return !oVar.y(u02) && oVar.u(oVar.z(oVar.H(u02)));
    }

    public static final boolean e(o oVar, h hVar) {
        l d11 = oVar.d(hVar);
        if (!(d11 instanceof f)) {
            return false;
        }
        Collection<i30.g> r02 = oVar.r0(d11);
        if ((r02 instanceof Collection) && r02.isEmpty()) {
            return false;
        }
        Iterator<T> it = r02.iterator();
        while (it.hasNext()) {
            h f11 = oVar.f((i30.g) it.next());
            if (f11 != null && oVar.u(f11)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(o oVar, h hVar) {
        return oVar.u(hVar) || d(oVar, hVar);
    }

    public static final boolean g(o oVar, TypeCheckerState typeCheckerState, h hVar, h hVar2, boolean z11) {
        TypeCheckerState typeCheckerState2;
        h hVar3;
        Collection<i30.g> V = oVar.V(hVar);
        if ((V instanceof Collection) && V.isEmpty()) {
            return false;
        }
        for (i30.g gVar : V) {
            if (g0.g(oVar.A0(gVar), oVar.d(hVar2))) {
                return true;
            }
            if (z11) {
                typeCheckerState2 = typeCheckerState;
                hVar3 = hVar2;
                if (v(f67667a, typeCheckerState2, hVar3, gVar, false, 8, null)) {
                    return true;
                }
            } else {
                typeCheckerState2 = typeCheckerState;
                hVar3 = hVar2;
            }
            typeCheckerState = typeCheckerState2;
            hVar2 = hVar3;
        }
        return false;
    }

    public static /* synthetic */ boolean v(b bVar, TypeCheckerState typeCheckerState, i30.g gVar, i30.g gVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return bVar.u(typeCheckerState, gVar, gVar2, z11);
    }

    public static final g2 x(Collection collection, TypeCheckerState typeCheckerState, o oVar, h hVar, TypeCheckerState.a runForkingPoint) {
        g0.p(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new e30.f(typeCheckerState, oVar, (h) it.next(), hVar));
        }
        return g2.f100423a;
    }

    public static final boolean y(TypeCheckerState typeCheckerState, o oVar, h hVar, h hVar2) {
        return f67667a.s(typeCheckerState, oVar.a0(hVar), hVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<h> A(TypeCheckerState typeCheckerState, List<? extends h> list) {
        int i11;
        o j11 = typeCheckerState.j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                j a02 = j11.a0((h) obj);
                int N = j11.N(a02);
                while (true) {
                    if (i11 >= N) {
                        arrayList.add(obj);
                        break;
                    }
                    i11 = j11.D0(j11.H(j11.p0(a02, i11))) == null ? i11 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    public final Boolean c(TypeCheckerState typeCheckerState, h hVar, h hVar2) {
        o j11 = typeCheckerState.j();
        if (!j11.u(hVar) && !j11.u(hVar2)) {
            return null;
        }
        if (f(j11, hVar) && f(j11, hVar2)) {
            return Boolean.TRUE;
        }
        if (j11.u(hVar)) {
            if (g(j11, typeCheckerState, hVar, hVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j11.u(hVar2) && (e(j11, hVar) || g(j11, typeCheckerState, hVar2, hVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean h(TypeCheckerState typeCheckerState, h hVar, h hVar2) {
        h hVar3;
        o j11 = typeCheckerState.j();
        if (j11.q(hVar) || j11.q(hVar2)) {
            return typeCheckerState.m() ? Boolean.TRUE : (!j11.B0(hVar) || j11.B0(hVar2)) ? Boolean.valueOf(c.f48553a.b(j11, j11.b(hVar, false), j11.b(hVar2, false))) : Boolean.FALSE;
        }
        if (j11.x(hVar) && j11.x(hVar2)) {
            return Boolean.valueOf(f67667a.r(j11, hVar, hVar2) || typeCheckerState.n());
        }
        if (j11.A(hVar) || j11.A(hVar2)) {
            return Boolean.valueOf(typeCheckerState.n());
        }
        i30.c d02 = j11.d0(hVar2);
        if (d02 == null || (hVar3 = j11.m(d02)) == null) {
            hVar3 = hVar2;
        }
        i30.b g11 = j11.g(hVar3);
        i30.g Q = g11 != null ? j11.Q(g11) : null;
        if (g11 != null && Q != null) {
            if (j11.B0(hVar2)) {
                Q = j11.g0(Q, true);
            } else if (j11.z0(hVar2)) {
                Q = j11.P(Q);
            }
            i30.g gVar = Q;
            int i11 = a.f67670b[typeCheckerState.g(hVar, g11).ordinal()];
            if (i11 == 1) {
                return Boolean.valueOf(v(f67667a, typeCheckerState, hVar, gVar, false, 8, null));
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (v(f67667a, typeCheckerState, hVar, gVar, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        l d11 = j11.d(hVar2);
        if (j11.o(d11)) {
            j11.B0(hVar2);
            Collection<i30.g> r02 = j11.r0(d11);
            if (!(r02 instanceof Collection) || !r02.isEmpty()) {
                Iterator<T> it = r02.iterator();
                while (it.hasNext()) {
                    if (!v(f67667a, typeCheckerState, hVar, (i30.g) it.next(), false, 8, null)) {
                        break;
                    }
                }
            }
            r9 = true;
            return Boolean.valueOf(r9);
        }
        l d12 = j11.d(hVar);
        if (!(hVar instanceof i30.b)) {
            if (j11.o(d12)) {
                Collection<i30.g> r03 = j11.r0(d12);
                if (!(r03 instanceof Collection) || !r03.isEmpty()) {
                    Iterator<T> it2 = r03.iterator();
                    while (it2.hasNext()) {
                        if (!(((i30.g) it2.next()) instanceof i30.b)) {
                            break;
                        }
                    }
                }
            }
            return null;
        }
        m o11 = f67667a.o(typeCheckerState.j(), hVar2, hVar);
        if (o11 != null && j11.X(o11, j11.d(hVar2))) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final List<h> i(TypeCheckerState typeCheckerState, h hVar, l lVar) {
        TypeCheckerState.b k02;
        h hVar2 = hVar;
        o j11 = typeCheckerState.j();
        List<h> F0 = j11.F0(hVar2, lVar);
        if (F0 != null) {
            return F0;
        }
        if (!j11.w(lVar) && j11.h(hVar2)) {
            return h0.J();
        }
        if (j11.w0(lVar)) {
            if (!j11.Z(j11.d(hVar2), lVar)) {
                return h0.J();
            }
            h T = j11.T(hVar2, CaptureStatus.FOR_SUBTYPING);
            if (T != null) {
                hVar2 = T;
            }
            return a00.g0.l(hVar2);
        }
        o30.k kVar = new o30.k();
        typeCheckerState.k();
        ArrayDeque<h> h11 = typeCheckerState.h();
        g0.m(h11);
        Set<h> i11 = typeCheckerState.i();
        g0.m(i11);
        h11.push(hVar2);
        while (!h11.isEmpty()) {
            if (i11.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + hVar2 + ". Supertypes = " + r0.r3(i11, null, null, null, 0, null, null, 63, null)).toString());
            }
            h pop = h11.pop();
            g0.m(pop);
            if (i11.add(pop)) {
                h T2 = j11.T(pop, CaptureStatus.FOR_SUBTYPING);
                if (T2 == null) {
                    T2 = pop;
                }
                if (j11.Z(j11.d(T2), lVar)) {
                    kVar.add(T2);
                    k02 = TypeCheckerState.b.c.f67664a;
                } else {
                    k02 = j11.i(T2) == 0 ? TypeCheckerState.b.C0802b.f67663a : typeCheckerState.j().k0(T2);
                }
                if (g0.g(k02, TypeCheckerState.b.c.f67664a)) {
                    k02 = null;
                }
                if (k02 != null) {
                    o j12 = typeCheckerState.j();
                    Iterator<i30.g> it = j12.r0(j12.d(pop)).iterator();
                    while (it.hasNext()) {
                        h11.add(k02.a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.e();
        return kVar;
    }

    public final List<h> j(TypeCheckerState typeCheckerState, h hVar, l lVar) {
        return A(typeCheckerState, i(typeCheckerState, hVar, lVar));
    }

    public final boolean k(TypeCheckerState typeCheckerState, i30.g gVar, i30.g gVar2, boolean z11) {
        o j11 = typeCheckerState.j();
        i30.g o11 = typeCheckerState.o(typeCheckerState.p(gVar));
        i30.g o12 = typeCheckerState.o(typeCheckerState.p(gVar2));
        b bVar = f67667a;
        Boolean h11 = bVar.h(typeCheckerState, j11.G0(o11), j11.z(o12));
        if (h11 == null) {
            Boolean c11 = typeCheckerState.c(o11, o12, z11);
            return c11 != null ? c11.booleanValue() : bVar.w(typeCheckerState, j11.G0(o11), j11.z(o12));
        }
        boolean booleanValue = h11.booleanValue();
        typeCheckerState.c(o11, o12, z11);
        return booleanValue;
    }

    @m80.l
    public final TypeVariance l(@k TypeVariance declared, @k TypeVariance useSite) {
        g0.p(declared, "declared");
        g0.p(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean m(@k TypeCheckerState state, @k i30.g a11, @k i30.g b11) {
        g0.p(state, "state");
        g0.p(a11, "a");
        g0.p(b11, "b");
        o j11 = state.j();
        if (a11 == b11) {
            return true;
        }
        b bVar = f67667a;
        if (bVar.q(j11, a11) && bVar.q(j11, b11)) {
            i30.g o11 = state.o(state.p(a11));
            i30.g o12 = state.o(state.p(b11));
            h G0 = j11.G0(o11);
            if (!j11.Z(j11.A0(o11), j11.A0(o12))) {
                return false;
            }
            if (j11.i(G0) == 0) {
                return j11.J(o11) || j11.J(o12) || j11.B0(G0) == j11.B0(j11.G0(o12));
            }
        }
        return v(bVar, state, a11, b11, false, 8, null) && v(bVar, state, b11, a11, false, 8, null);
    }

    @k
    public final List<h> n(@k TypeCheckerState state, @k h subType, @k l superConstructor) {
        TypeCheckerState.b bVar;
        g0.p(state, "state");
        g0.p(subType, "subType");
        g0.p(superConstructor, "superConstructor");
        o j11 = state.j();
        if (j11.h(subType)) {
            return f67667a.j(state, subType, superConstructor);
        }
        if (!j11.w(superConstructor) && !j11.Y(superConstructor)) {
            return f67667a.i(state, subType, superConstructor);
        }
        o30.k<h> kVar = new o30.k();
        state.k();
        ArrayDeque<h> h11 = state.h();
        g0.m(h11);
        Set<h> i11 = state.i();
        g0.m(i11);
        h11.push(subType);
        while (!h11.isEmpty()) {
            if (i11.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + r0.r3(i11, null, null, null, 0, null, null, 63, null)).toString());
            }
            h pop = h11.pop();
            g0.m(pop);
            if (i11.add(pop)) {
                if (j11.h(pop)) {
                    kVar.add(pop);
                    bVar = TypeCheckerState.b.c.f67664a;
                } else {
                    bVar = TypeCheckerState.b.C0802b.f67663a;
                }
                if (g0.g(bVar, TypeCheckerState.b.c.f67664a)) {
                    bVar = null;
                }
                if (bVar != null) {
                    o j12 = state.j();
                    Iterator<i30.g> it = j12.r0(j12.d(pop)).iterator();
                    while (it.hasNext()) {
                        h11.add(bVar.a(state, it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (h hVar : kVar) {
            b bVar2 = f67667a;
            g0.m(hVar);
            m0.s0(arrayList, bVar2.j(state, hVar, superConstructor));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r7.m0(r7.A0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i30.m o(i30.o r7, i30.g r8, i30.g r9) {
        /*
            r6 = this;
            int r0 = r7.i(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            i30.k r4 = r7.C(r8, r2)
            boolean r5 = r7.y(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            i30.g r3 = r7.H(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            i30.h r4 = r7.G0(r3)
            i30.h r4 = r7.F(r4)
            boolean r4 = r7.l0(r4)
            if (r4 == 0) goto L3b
            i30.h r4 = r7.G0(r9)
            i30.h r4 = r7.F(r4)
            boolean r4 = r7.l0(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = kotlin.jvm.internal.g0.g(r3, r9)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            i30.l r4 = r7.A0(r3)
            i30.l r5 = r7.A0(r9)
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            i30.m r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L63
            return r3
        L5a:
            i30.l r8 = r7.A0(r8)
            i30.m r7 = r7.m0(r8, r2)
            return r7
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.b.o(i30.o, i30.g, i30.g):i30.m");
    }

    public final boolean p(TypeCheckerState typeCheckerState, h hVar) {
        o j11 = typeCheckerState.j();
        l d11 = j11.d(hVar);
        if (j11.w(d11)) {
            return j11.B(d11);
        }
        if (j11.B(j11.d(hVar))) {
            return true;
        }
        typeCheckerState.k();
        ArrayDeque<h> h11 = typeCheckerState.h();
        g0.m(h11);
        Set<h> i11 = typeCheckerState.i();
        g0.m(i11);
        h11.push(hVar);
        while (!h11.isEmpty()) {
            if (i11.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + hVar + ". Supertypes = " + r0.r3(i11, null, null, null, 0, null, null, 63, null)).toString());
            }
            h pop = h11.pop();
            g0.m(pop);
            if (i11.add(pop)) {
                TypeCheckerState.b bVar = j11.h(pop) ? TypeCheckerState.b.c.f67664a : TypeCheckerState.b.C0802b.f67663a;
                if (g0.g(bVar, TypeCheckerState.b.c.f67664a)) {
                    bVar = null;
                }
                if (bVar == null) {
                    continue;
                } else {
                    o j12 = typeCheckerState.j();
                    Iterator<i30.g> it = j12.r0(j12.d(pop)).iterator();
                    while (it.hasNext()) {
                        h a11 = bVar.a(typeCheckerState, it.next());
                        if (j11.B(j11.d(a11))) {
                            typeCheckerState.e();
                            return true;
                        }
                        h11.add(a11);
                    }
                }
            }
        }
        typeCheckerState.e();
        return false;
    }

    public final boolean q(o oVar, i30.g gVar) {
        return (!oVar.I(oVar.A0(gVar)) || oVar.s0(gVar) || oVar.z0(gVar) || oVar.f0(gVar) || oVar.j(gVar)) ? false : true;
    }

    public final boolean r(o oVar, h hVar, h hVar2) {
        h hVar3;
        h hVar4;
        i30.c d02 = oVar.d0(hVar);
        if (d02 == null || (hVar3 = oVar.m(d02)) == null) {
            hVar3 = hVar;
        }
        i30.c d03 = oVar.d0(hVar2);
        if (d03 == null || (hVar4 = oVar.m(d03)) == null) {
            hVar4 = hVar2;
        }
        if (oVar.d(hVar3) != oVar.d(hVar4)) {
            return false;
        }
        if (oVar.z0(hVar) || !oVar.z0(hVar2)) {
            return !oVar.B0(hVar) || oVar.B0(hVar2);
        }
        return false;
    }

    public final boolean s(@k TypeCheckerState typeCheckerState, @k j capturedSubArguments, @k h superType) {
        int i11;
        int i12;
        boolean m11;
        int i13;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        g0.p(typeCheckerState2, "<this>");
        g0.p(capturedSubArguments, "capturedSubArguments");
        g0.p(superType, "superType");
        o j11 = typeCheckerState2.j();
        l d11 = j11.d(superType);
        int N = j11.N(capturedSubArguments);
        int C0 = j11.C0(d11);
        if (N != C0 || N != j11.i(superType)) {
            return false;
        }
        for (int i14 = 0; i14 < C0; i14++) {
            i30.k C = j11.C(superType, i14);
            if (!j11.y(C)) {
                i30.g H = j11.H(C);
                i30.k p02 = j11.p0(capturedSubArguments, i14);
                j11.l(p02);
                TypeVariance typeVariance = TypeVariance.INV;
                i30.g H2 = j11.H(p02);
                b bVar = f67667a;
                TypeVariance l11 = bVar.l(j11.p(j11.m0(d11, i14)), j11.l(C));
                if (l11 == null) {
                    return typeCheckerState2.m();
                }
                if (l11 != typeVariance || (!bVar.z(j11, H2, H, d11) && !bVar.z(j11, H, H2, d11))) {
                    i11 = typeCheckerState2.f67658g;
                    if (i11 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + H2).toString());
                    }
                    i12 = typeCheckerState2.f67658g;
                    typeCheckerState2.f67658g = i12 + 1;
                    int i15 = a.f67669a[l11.ordinal()];
                    if (i15 == 1) {
                        m11 = bVar.m(typeCheckerState2, H2, H);
                    } else if (i15 == 2) {
                        typeCheckerState2 = typeCheckerState;
                        m11 = v(bVar, typeCheckerState2, H2, H, false, 8, null);
                    } else {
                        if (i15 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m11 = v(bVar, typeCheckerState2, H, H2, false, 8, null);
                        typeCheckerState2 = typeCheckerState;
                    }
                    i13 = typeCheckerState2.f67658g;
                    typeCheckerState2.f67658g = i13 - 1;
                    if (!m11) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @w00.k
    public final boolean t(@k TypeCheckerState state, @k i30.g subType, @k i30.g superType) {
        g0.p(state, "state");
        g0.p(subType, "subType");
        g0.p(superType, "superType");
        return v(this, state, subType, superType, false, 8, null);
    }

    @w00.k
    public final boolean u(@k TypeCheckerState state, @k i30.g subType, @k i30.g superType, boolean z11) {
        g0.p(state, "state");
        g0.p(subType, "subType");
        g0.p(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return k(state, subType, superType, z11);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r18, i30.h r19, i30.h r20) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.b.w(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, i30.h, i30.h):boolean");
    }

    public final boolean z(o oVar, i30.g gVar, i30.g gVar2, l lVar) {
        m v11;
        h f11 = oVar.f(gVar);
        if (f11 instanceof i30.b) {
            i30.b bVar = (i30.b) f11;
            if (oVar.G(bVar) || !oVar.y(oVar.u0(oVar.H0(bVar))) || oVar.M(bVar) != CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            l A0 = oVar.A0(gVar2);
            s sVar = A0 instanceof s ? (s) A0 : null;
            if (sVar != null && (v11 = oVar.v(sVar)) != null && oVar.X(v11, lVar)) {
                return true;
            }
        }
        return false;
    }
}
