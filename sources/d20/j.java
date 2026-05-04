package d20;

import e30.a2;
import e30.b1;
import e30.c1;
import e30.i0;
import e30.r0;
import e30.r1;
import e30.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import p20.m;
import p20.u;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRawType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1734#2,3:99\n1557#2:102\n1628#2,3:103\n*S KotlinDebug\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n*L\n80#1:99,3\n61#1:102\n61#1:103,3\n*E\n"})
/* loaded from: classes8.dex */
public final class j extends i0 implements b1 {
    public j(c1 c1Var, c1 c1Var2, boolean z11) {
        super(c1Var, c1Var2);
        if (z11) {
            return;
        }
        f30.e.f50430a.a(c1Var, c1Var2);
    }

    public static final CharSequence W0(String it) {
        g0.p(it, "it");
        return "(raw) " + it;
    }

    public static final boolean X0(String str, String str2) {
        return g0.g(str, k0.x4(str2, "out ")) || g0.g(str2, "*");
    }

    public static final List<String> Y0(m mVar, r0 r0Var) {
        List<a2> G0 = r0Var.G0();
        ArrayList arrayList = new ArrayList(a00.i0.d0(G0, 10));
        Iterator<T> it = G0.iterator();
        while (it.hasNext()) {
            arrayList.add(mVar.X((a2) it.next()));
        }
        return arrayList;
    }

    public static final String Z0(String str, String str2) {
        if (!k0.m3(str, u30.u0.f91709e, false, 2, null)) {
            return str;
        }
        return k0.T5(str, u30.u0.f91709e, null, 2, null) + u30.u0.f91709e + str2 + u30.u0.f91710f + k0.P5(str, u30.u0.f91710f, null, 2, null);
    }

    @Override // e30.i0
    @k
    public c1 P0() {
        return Q0();
    }

    @Override // e30.i0
    @k
    public String S0(@k m renderer, @k u options) {
        g0.p(renderer, "renderer");
        g0.p(options, "options");
        String W = renderer.W(Q0());
        String W2 = renderer.W(R0());
        if (options.d()) {
            return "raw (" + W + zr.m.f102856e + W2 + ')';
        }
        if (R0().G0().isEmpty()) {
            return renderer.T(W, W2, j30.e.o(this));
        }
        List<String> Y0 = Y0(renderer, Q0());
        List<String> Y02 = Y0(renderer, R0());
        List<String> list = Y0;
        String r32 = a00.r0.r3(list, j2.O, null, null, 0, null, i.f47088a, 30, null);
        List<Pair> o62 = a00.r0.o6(list, Y02);
        if (!(o62 instanceof Collection) || !o62.isEmpty()) {
            for (Pair pair : o62) {
                if (!X0((String) pair.getFirst(), (String) pair.getSecond())) {
                    break;
                }
            }
        }
        W2 = Z0(W2, r32);
        String Z0 = Z0(W, r32);
        return g0.g(Z0, W2) ? Z0 : renderer.T(Z0, W2, j30.e.o(this));
    }

    @Override // e30.k2
    @k
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public j M0(boolean z11) {
        return new j(Q0().M0(z11), R0().M0(z11));
    }

    @Override // e30.k2
    @k
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public i0 S0(@k f30.g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        r0 a11 = kotlinTypeRefiner.a(Q0());
        g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r0 a12 = kotlinTypeRefiner.a(R0());
        g0.n(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new j((c1) a11, (c1) a12, true);
    }

    @Override // e30.k2
    @k
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public j O0(@k r1 newAttributes) {
        g0.p(newAttributes, "newAttributes");
        return new j(Q0().O0(newAttributes), R0().O0(newAttributes));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e30.i0, e30.r0
    @k
    public x20.k r() {
        p10.d r11 = I0().r();
        z1 z1Var = null;
        Object[] objArr = 0;
        p10.b bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
        if (bVar != null) {
            x20.k K = bVar.K(new h(z1Var, 1, objArr == true ? 1 : 0));
            g0.o(K, "getMemberScope(...)");
            return K;
        }
        throw new IllegalStateException(("Incorrect classifier: " + I0().r()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@k c1 lowerBound, @k c1 upperBound) {
        this(lowerBound, upperBound, false);
        g0.p(lowerBound, "lowerBound");
        g0.p(upperBound, "upperBound");
    }
}
