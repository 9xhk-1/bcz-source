package r20;

import a00.a0;
import a00.i0;
import d30.f;
import d30.n;
import e30.a2;
import e30.c2;
import e30.d2;
import e30.m0;
import e30.r0;
import e30.x0;
import e30.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m80.k;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCapturedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n1557#2:154\n1628#2,3:155\n37#3,2:158\n*S KotlinDebug\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n*L\n125#1:154\n125#1:155,3\n127#1:158,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends y {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f82879d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d2 d2Var, boolean z11) {
            super(d2Var);
            this.f82879d = z11;
        }

        @Override // e30.y, e30.d2
        public boolean b() {
            return this.f82879d;
        }

        @Override // e30.y, e30.d2
        public a2 e(r0 key) {
            g0.p(key, "key");
            a2 e11 = super.e(key);
            if (e11 == null) {
                return null;
            }
            p10.d r11 = key.I0().r();
            return e.c(e11, r11 instanceof c1 ? (c1) r11 : null);
        }
    }

    public static final a2 c(a2 a2Var, c1 c1Var) {
        if (c1Var == null || a2Var.b() == Variance.INVARIANT) {
            return a2Var;
        }
        if (c1Var.j() != a2Var.b()) {
            return new c2(e(a2Var));
        }
        if (!a2Var.a()) {
            return new c2(a2Var.getType());
        }
        n NO_LOCKS = f.f47125e;
        g0.o(NO_LOCKS, "NO_LOCKS");
        return new c2(new x0(NO_LOCKS, new d(a2Var)));
    }

    public static final r0 d(a2 a2Var) {
        r0 type = a2Var.getType();
        g0.o(type, "getType(...)");
        return type;
    }

    @k
    public static final r0 e(@k a2 typeProjection) {
        g0.p(typeProjection, "typeProjection");
        return new r20.a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean f(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return r0Var.I0() instanceof b;
    }

    @k
    public static final d2 g(@k d2 d2Var, boolean z11) {
        g0.p(d2Var, "<this>");
        if (!(d2Var instanceof m0)) {
            return new a(d2Var, z11);
        }
        m0 m0Var = (m0) d2Var;
        c1[] j11 = m0Var.j();
        List<Pair> WA = a0.WA(m0Var.i(), m0Var.j());
        ArrayList arrayList = new ArrayList(i0.d0(WA, 10));
        for (Pair pair : WA) {
            arrayList.add(c((a2) pair.getFirst(), (c1) pair.getSecond()));
        }
        return new m0(j11, (a2[]) arrayList.toArray(new a2[0]), z11);
    }

    public static /* synthetic */ d2 h(d2 d2Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return g(d2Var, z11);
    }
}
