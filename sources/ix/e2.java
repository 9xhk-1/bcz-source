package ix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nURLBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,325:1\n1368#2:326\n1454#2,5:327\n1557#2:332\n1628#2,3:333\n11165#3:336\n11500#3,3:337\n*S KotlinDebug\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilderKt\n*L\n211#1:326\n211#1:327,5\n212#1:332\n212#1:333,3\n234#1:336\n234#1:337,3\n*E\n"})
/* loaded from: classes8.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f62763a = 0;

    public static final void c(Appendable appendable, String str) {
        appendable.append(":");
        appendable.append(str);
    }

    @m80.k
    public static final b2 d(@m80.k b2 b2Var, @m80.k List<String> segments) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(segments, "segments");
        boolean z11 = false;
        boolean z12 = b2Var.g().size() > 1 && ((CharSequence) a00.r0.u3(b2Var.g())).length() == 0 && !segments.isEmpty();
        if (segments.size() > 1 && ((CharSequence) a00.r0.G2(segments)).length() == 0 && !b2Var.g().isEmpty()) {
            z11 = true;
        }
        b2Var.v((z12 && z11) ? a00.r0.I4(a00.r0.h2(b2Var.g(), 1), a00.r0.g2(segments, 1)) : z12 ? a00.r0.I4(a00.r0.h2(b2Var.g(), 1), segments) : z11 ? a00.r0.I4(b2Var.g(), a00.r0.g2(segments, 1)) : a00.r0.I4(b2Var.g(), segments));
        return b2Var;
    }

    @m80.k
    public static final b2 e(@m80.k b2 b2Var, @m80.k String... components) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(components, "components");
        return d(b2Var, a00.a0.dz(components));
    }

    public static final void f(Appendable appendable, String str, String str2) {
        appendable.append("://");
        appendable.append(str);
        if (!u30.k0.A5(str2, '/', false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    public static final void g(Appendable appendable, String str, String str2) {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    @m80.k
    public static final b2 h(@m80.k b2 b2Var, @m80.k List<String> segments, boolean z11) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(segments, "segments");
        if (!z11) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = segments.iterator();
            while (it.hasNext()) {
                a00.m0.s0(arrayList, u30.k0.n5((String) it.next(), new char[]{'/'}, false, 0, 6, null));
            }
            segments = arrayList;
        }
        List<String> list = segments;
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f.t((String) it2.next()));
        }
        d(b2Var, arrayList2);
        return b2Var;
    }

    @m80.k
    public static final b2 i(@m80.k b2 b2Var, @m80.k String[] components, boolean z11) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(components, "components");
        return h(b2Var, a00.a0.dz(components), z11);
    }

    public static /* synthetic */ b2 j(b2 b2Var, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return h(b2Var, list, z11);
    }

    public static /* synthetic */ b2 k(b2 b2Var, String[] strArr, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return i(b2Var, strArr, z11);
    }

    public static final <A extends Appendable> A l(b2 b2Var, A a11) {
        a11.append(b2Var.o().l());
        String l11 = b2Var.o().l();
        int hashCode = l11.hashCode();
        if (hashCode != -1081572750) {
            if (hashCode != 3143036) {
                if (hashCode == 92611469 && l11.equals("about")) {
                    c(a11, b2Var.j());
                    return a11;
                }
            } else if (l11.equals("file")) {
                f(a11, b2Var.j(), o(b2Var));
                return a11;
            }
        } else if (l11.equals("mailto")) {
            g(a11, p(b2Var), b2Var.j());
            return a11;
        }
        a11.append("://");
        a11.append(n(b2Var));
        l2.g(a11, o(b2Var), b2Var.e(), b2Var.q());
        if (b2Var.d().length() > 0) {
            a11.append('#');
            a11.append(b2Var.d());
        }
        return a11;
    }

    @m80.k
    public static final b2 m(@m80.k b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        return l2.t(new b2(null, null, 0, null, null, null, null, null, false, 511, null), b2Var);
    }

    @m80.k
    public static final String n(@m80.k b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p(b2Var));
        sb2.append(b2Var.j());
        if (b2Var.n() != 0 && b2Var.n() != b2Var.o().k()) {
            sb2.append(":");
            sb2.append(String.valueOf(b2Var.n()));
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public static final String o(@m80.k b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        return q(b2Var.g());
    }

    @m80.k
    public static final String p(@m80.k b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        l2.j(sb2, b2Var.h(), b2Var.f());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final String q(List<String> list) {
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) a00.r0.G2(list)).length() == 0 ? "/" : (String) a00.r0.G2(list) : a00.r0.r3(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void r(@m80.k b2 b2Var, @m80.k String... path) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        ArrayList arrayList = new ArrayList(path.length);
        for (String str : path) {
            arrayList.add(f.r(str, false, false, 3, null));
        }
        b2Var.v(arrayList);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Please use appendPathSegments method", replaceWith = @yz.w0(expression = "this.appendPathSegments(components", imports = {}))
    @m80.k
    public static final b2 s(@m80.k b2 b2Var, @m80.k List<String> components) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(components, "components");
        return j(b2Var, components, false, 2, null);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Please use appendPathSegments method", replaceWith = @yz.w0(expression = "this.appendPathSegments(components", imports = {}))
    @m80.k
    public static final b2 t(@m80.k b2 b2Var, @m80.k String... components) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(components, "components");
        return j(b2Var, a00.a0.dz(components), false, 2, null);
    }

    public static final void u(@m80.k b2 b2Var, @m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3, @m80.k x00.l<? super b2, yz.g2> block) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        if (str != null) {
            b2Var.C(h2.f62830c.a(str));
        }
        if (str2 != null) {
            b2Var.y(str2);
        }
        if (num != null) {
            b2Var.B(num.intValue());
        }
        if (str3 != null) {
            x(b2Var, str3);
        }
        block.invoke(b2Var);
    }

    public static /* synthetic */ void v(b2 b2Var, String str, String str2, Integer num, String str3, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: ix.d2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 w11;
                    w11 = e2.w((b2) obj2);
                    return w11;
                }
            };
        }
        u(b2Var, str, str2, num, str3, lVar);
    }

    public static final yz.g2 w(b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        return yz.g2.f100423a;
    }

    public static final void x(@m80.k b2 b2Var, @m80.k String value) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        b2Var.v(u30.k0.O3(value) ? a00.h0.J() : kotlin.jvm.internal.g0.g(value, "/") ? g2.e() : a00.r0.d6(u30.k0.n5(value, new char[]{'/'}, false, 0, 6, null)));
    }
}
