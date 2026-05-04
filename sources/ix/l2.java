package ix;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import io.ktor.http.URLParserException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nURLUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLUtils.kt\nio/ktor/http/URLUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1#2:194\n1368#3:195\n1454#3,2:196\n1557#3:198\n1628#3,3:199\n1456#3,3:202\n*S KotlinDebug\n*F\n+ 1 URLUtils.kt\nio/ktor/http/URLUtilsKt\n*L\n146#1:195\n146#1:196,2\n147#1:198\n147#1:199,3\n146#1:202,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l2 {
    @m80.k
    public static final b2 b(@m80.k b2 builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        return t(new b2(null, null, 0, null, null, null, null, null, false, 511, null), builder);
    }

    @m80.k
    public static final b2 c(@m80.k t2 url) {
        kotlin.jvm.internal.g0.p(url, "url");
        return u(new b2(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    @m80.k
    public static final b2 d(@m80.k String urlString) {
        kotlin.jvm.internal.g0.p(urlString, "urlString");
        return g2.m(new b2(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    @m80.k
    public static final t2 e(@m80.k b2 builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        return t(new b2(null, null, 0, null, null, null, null, null, false, 511, null), builder).b();
    }

    @m80.k
    public static final t2 f(@m80.k String urlString) {
        kotlin.jvm.internal.g0.p(urlString, "urlString");
        return d(urlString).b();
    }

    public static final void g(@m80.k Appendable appendable, @m80.k String encodedPath, @m80.k q1 encodedQueryParameters, boolean z11) {
        List list;
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        kotlin.jvm.internal.g0.p(encodedPath, "encodedPath");
        kotlin.jvm.internal.g0.p(encodedQueryParameters, "encodedQueryParameters");
        if (!u30.k0.O3(encodedPath) && !u30.f0.J2(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z11) {
            appendable.append("?");
        }
        Set<Map.Entry<String, List<String>>> entries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = a00.g0.l(yz.h1.a(str, null));
            } else {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(a00.i0.d0(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(yz.h1.a(str, (String) it2.next()));
                }
                list = arrayList2;
            }
            a00.m0.s0(arrayList, list);
        }
        a00.r0.p3(arrayList, appendable, "&", null, null, 0, null, new x00.l() { // from class: ix.k2
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence i11;
                i11 = l2.i((Pair) obj);
                return i11;
            }
        }, 60, null);
    }

    public static final void h(@m80.k Appendable appendable, @m80.k String encodedPath, @m80.k String encodedQuery, boolean z11) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        kotlin.jvm.internal.g0.p(encodedPath, "encodedPath");
        kotlin.jvm.internal.g0.p(encodedQuery, "encodedQuery");
        if (!u30.k0.O3(encodedPath) && !u30.f0.J2(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (encodedQuery.length() > 0 || z11) {
            appendable.append("?");
        }
        appendable.append(encodedQuery);
    }

    public static final CharSequence i(Pair it) {
        kotlin.jvm.internal.g0.p(it, "it");
        String str = (String) it.getFirst();
        if (it.getSecond() == null) {
            return str;
        }
        return str + '=' + String.valueOf(it.getSecond());
    }

    public static final void j(@m80.k StringBuilder sb2, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        if (str == null) {
            return;
        }
        sb2.append(str);
        if (str2 != null) {
            sb2.append(':');
            sb2.append(str2);
        }
        sb2.append(EmailAutoCompleteEditText.f17091d);
    }

    @m80.k
    public static final t2 k(@m80.k x00.l<? super b2, yz.g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        b2 b2Var = new b2(null, null, 0, null, null, null, null, null, false, 511, null);
        block.invoke(b2Var);
        return b2Var.b();
    }

    @m80.k
    public static final String l(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        h(sb2, t2Var.p(), t2Var.r(), t2Var.F());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.k
    public static final String m(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        return t2Var.u() + ':' + t2Var.z();
    }

    @m80.k
    public static final String n(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        int E = t2Var.E();
        return (E == 0 || E == t2Var.A().k()) ? t2Var.u() : m(t2Var);
    }

    public static final boolean o(@m80.k b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        return kotlin.jvm.internal.g0.g(a00.r0.L2(b2Var.m()), "");
    }

    public static final boolean p(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        return kotlin.jvm.internal.g0.g(a00.r0.L2(t2Var.x()), "");
    }

    public static final boolean q(@m80.k b2 b2Var) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        return !o(b2Var);
    }

    public static final boolean r(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        return !p(t2Var);
    }

    @m80.l
    public static final t2 s(@m80.k String urlString) {
        kotlin.jvm.internal.g0.p(urlString, "urlString");
        try {
            b2 d11 = d(urlString);
            if (d11.j().length() <= 0) {
                d11 = null;
            }
            if (d11 != null) {
                return d11.b();
            }
        } catch (URLParserException unused) {
        }
        return null;
    }

    @m80.k
    public static final b2 t(@m80.k b2 b2Var, @m80.k b2 url) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(url, "url");
        b2Var.D(url.p());
        b2Var.y(url.j());
        b2Var.B(url.n());
        b2Var.v(url.g());
        b2Var.w(url.h());
        b2Var.u(url.f());
        q1 b11 = t1.b(0, 1, null);
        xy.c2.e(b11, url.e());
        b2Var.t(b11);
        b2Var.s(url.d());
        b2Var.E(url.q());
        return b2Var;
    }

    @m80.k
    public static final b2 u(@m80.k b2 b2Var, @m80.k t2 url) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(url, "url");
        b2Var.D(url.B());
        b2Var.y(url.u());
        b2Var.B(url.z());
        e2.x(b2Var, url.p());
        b2Var.w(url.s());
        b2Var.u(url.o());
        q1 b11 = t1.b(0, 1, null);
        b11.j(v1.d(url.r(), 0, 0, false, 6, null));
        b2Var.t(b11);
        b2Var.s(url.n());
        b2Var.E(url.F());
        return b2Var;
    }
}
