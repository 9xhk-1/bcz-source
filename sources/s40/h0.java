package s40;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlinx.datetime.internal.format.OptionalFormatStructure;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f87679a = "    ";

    public static final <T extends g0> void a(@m80.k T t11, @m80.k x00.l<? super T, yz.g2>[] alternativeFormats, @m80.k x00.l<? super T, yz.g2> primaryFormat) {
        kotlin.jvm.internal.g0.p(t11, "<this>");
        kotlin.jvm.internal.g0.p(alternativeFormats, "alternativeFormats");
        kotlin.jvm.internal.g0.p(primaryFormat, "primaryFormat");
        if (!(t11 instanceof b)) {
            throw new IllegalStateException("impossible");
        }
        ((b) t11).s0((x00.l[]) Arrays.copyOf(alternativeFormats, alternativeFormats.length), (x00.l) kotlin.jvm.internal.x0.q(primaryFormat, 1));
    }

    @m80.k
    public static final <T> String b(@m80.k u40.o<? super T> oVar, @m80.k List<? extends Pair<String, ? extends u40.f<?>>> constants) {
        kotlin.jvm.internal.g0.p(oVar, "<this>");
        kotlin.jvm.internal.g0.p(constants, "constants");
        if (oVar instanceof u40.e) {
            return ((u40.e) oVar).c().d();
        }
        if (oVar instanceof u40.j) {
            u40.j jVar = (u40.j) oVar;
            if (jVar.c().length() == 1) {
                return "char(" + t40.g.a(jVar.c().charAt(0)) + ')';
            }
            return "chars(" + t40.g.b(jVar.c()) + ')';
        }
        if (oVar instanceof u40.a0) {
            u40.a0 a0Var = (u40.a0) oVar;
            if ((a0Var.f() instanceof u40.e) && (((u40.e) a0Var.f()).c() instanceof h3)) {
                return ((h3) ((u40.e) a0Var.f()).c()).d();
            }
            StringBuilder sb2 = new StringBuilder();
            if (a0Var.g()) {
                sb2.append("withSharedSign(outputPlus = true) {");
                sb2.append('\n');
            } else {
                sb2.append("withSharedSign {");
                sb2.append('\n');
            }
            sb2.append(u30.y.n(b(a0Var.f(), constants), "    "));
            sb2.append('\n');
            sb2.append(com.alipay.sdk.m.u.i.f11099d);
            return sb2.toString();
        }
        if (oVar instanceof OptionalFormatStructure) {
            StringBuilder sb3 = new StringBuilder();
            OptionalFormatStructure optionalFormatStructure = (OptionalFormatStructure) oVar;
            if (kotlin.jvm.internal.g0.g(optionalFormatStructure.e(), "")) {
                sb3.append("optional {");
                sb3.append('\n');
            } else {
                sb3.append("optional(" + t40.g.b(optionalFormatStructure.e()) + ") {");
                sb3.append('\n');
            }
            String b11 = b(optionalFormatStructure.d(), constants);
            if (b11.length() > 0) {
                sb3.append(u30.y.n(b11, "    "));
                sb3.append('\n');
            }
            sb3.append(com.alipay.sdk.m.u.i.f11099d);
            return sb3.toString();
        }
        if (oVar instanceof u40.c) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("alternativeParsing(");
            u40.c cVar = (u40.c) oVar;
            for (u40.o<T> oVar2 : cVar.c()) {
                sb4.append("{");
                sb4.append('\n');
                String b12 = b(oVar2, constants);
                if (b12.length() > 0) {
                    sb4.append(u30.y.n(b12, "    "));
                    sb4.append('\n');
                }
                sb4.append("}, ");
            }
            if (sb4.charAt(sb4.length() - 2) == ',') {
                for (int i11 = 0; i11 < 2; i11++) {
                    kotlin.jvm.internal.g0.o(sb4.deleteCharAt(sb4.length() - 1), "deleteCharAt(...)");
                }
            }
            sb4.append(") {");
            sb4.append('\n');
            sb4.append(u30.y.n(b(cVar.d(), constants), "    "));
            sb4.append('\n');
            sb4.append(com.alipay.sdk.m.u.i.f11099d);
            return sb4.toString();
        }
        if (!(oVar instanceof u40.h)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb5 = new StringBuilder();
        u40.h hVar = (u40.h) oVar;
        if (!hVar.c().isEmpty()) {
            int i12 = 0;
            while (i12 < hVar.c().size()) {
                Iterator<? extends Pair<String, ? extends u40.f<?>>> it = constants.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Pair<String, ? extends u40.f<?>> next = it.next();
                        List<u40.t<?>> c11 = next.getSecond().c();
                        if (hVar.c().size() - i12 >= c11.size()) {
                            int size = c11.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                if (!kotlin.jvm.internal.g0.g(hVar.c().get(i12 + i13), c11.get(i13))) {
                                    break;
                                }
                            }
                            sb5.append(next.getFirst());
                            i12 += c11.size();
                            if (i12 < hVar.c().size()) {
                                sb5.append('\n');
                            }
                        }
                    } else {
                        if (i12 == hVar.c().size() - 1) {
                            sb5.append(b((u40.o) a00.r0.u3(hVar.c()), constants));
                        } else {
                            sb5.append(b(hVar.c().get(i12), constants));
                            sb5.append('\n');
                        }
                        i12++;
                    }
                }
            }
        }
        return sb5.toString();
    }

    public static final void c(@m80.k g0 g0Var, char c11) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        g0Var.i(String.valueOf(c11));
    }

    public static final <T extends g0> void d(@m80.k T t11, @m80.k String ifZero, @m80.k x00.l<? super T, yz.g2> format) {
        kotlin.jvm.internal.g0.p(t11, "<this>");
        kotlin.jvm.internal.g0.p(ifZero, "ifZero");
        kotlin.jvm.internal.g0.p(format, "format");
        if (!(t11 instanceof b)) {
            throw new IllegalStateException("impossible");
        }
        ((b) t11).M(ifZero, (x00.l) kotlin.jvm.internal.x0.q(format, 1));
    }

    public static /* synthetic */ void e(g0 g0Var, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        d(g0Var, str, lVar);
    }

    public static final void f(@m80.k g0.d dVar, int i11, int i12, @m80.k List<Integer> grouping) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        kotlin.jvm.internal.g0.p(grouping, "grouping");
        if (dVar instanceof f) {
            ((f) dVar).l(new u40.e(new p0(i11, i12, grouping)));
        }
    }
}
