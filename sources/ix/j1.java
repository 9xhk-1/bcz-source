package ix;

import com.huawei.hms.framework.common.ContainerUtils;
import ix.p1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpUrlEncoded.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrlEncoded.kt\nio/ktor/http/HttpUrlEncodedKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Parameters.kt\nio/ktor/http/Parameters$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1557#2:73\n1628#2,3:74\n295#2,2:77\n1863#2,2:80\n1368#2:83\n1454#2,2:84\n1557#2:86\n1628#2,3:87\n1456#2,3:90\n1368#2:93\n1454#2,2:94\n1557#2:96\n1628#2,3:97\n1456#2,3:100\n24#3:79\n1#4:82\n*S KotlinDebug\n*F\n+ 1 HttpUrlEncoded.kt\nio/ktor/http/HttpUrlEncodedKt\n*L\n14#1:73\n14#1:74,3\n16#1:77,2\n20#1:80,2\n53#1:83\n53#1:84,2\n53#1:86\n53#1:87,3\n53#1:90,3\n68#1:93\n68#1:94,2\n69#1:96\n69#1:97,3\n68#1:100,3\n19#1:79\n*E\n"})
/* loaded from: classes8.dex */
public final class j1 {
    @m80.k
    public static final String b(@m80.k p1 p1Var) {
        kotlin.jvm.internal.g0.p(p1Var, "<this>");
        Set<Map.Entry<String, List<String>>> entries = p1Var.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(yz.h1.a(entry.getKey(), (String) it2.next()));
            }
            a00.m0.s0(arrayList, arrayList2);
        }
        return c(arrayList);
    }

    @m80.k
    public static final String c(@m80.k List<Pair<String, String>> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        f(list, sb2);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final void d(@m80.k p1 p1Var, @m80.k Appendable out) {
        kotlin.jvm.internal.g0.p(p1Var, "<this>");
        kotlin.jvm.internal.g0.p(out, "out");
        g(p1Var.entries(), out);
    }

    public static final void e(@m80.k q1 q1Var, @m80.k Appendable out) {
        kotlin.jvm.internal.g0.p(q1Var, "<this>");
        kotlin.jvm.internal.g0.p(out, "out");
        g(q1Var.entries(), out);
    }

    public static final void f(@m80.k List<Pair<String, String>> list, @m80.k Appendable out) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(out, "out");
        a00.r0.p3(list, out, "&", null, null, 0, null, new x00.l() { // from class: ix.i1
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence h11;
                h11 = j1.h((Pair) obj);
                return h11;
            }
        }, 60, null);
    }

    public static final void g(@m80.k Set<? extends Map.Entry<String, ? extends List<String>>> set, @m80.k Appendable out) {
        List list;
        kotlin.jvm.internal.g0.p(set, "<this>");
        kotlin.jvm.internal.g0.p(out, "out");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
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
        f(arrayList, out);
    }

    public static final CharSequence h(Pair it) {
        kotlin.jvm.internal.g0.p(it, "it");
        String m11 = f.m((String) it.getFirst(), true);
        if (it.getSecond() == null) {
            return m11;
        }
        return m11 + '=' + f.p(String.valueOf(it.getSecond()));
    }

    @m80.k
    public static final p1 i(@m80.k String str, @m80.k Charset defaultEncoding, int i11) {
        Object obj;
        String l11;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(defaultEncoding, "defaultEncoding");
        List<String> o52 = u30.k0.o5(str, new String[]{"&"}, false, i11, 2, null);
        ArrayList<Pair> arrayList = new ArrayList(a00.i0.d0(o52, 10));
        for (String str2 : o52) {
            arrayList.add(yz.h1.a(u30.k0.U5(str2, ContainerUtils.KEY_VALUE_DELIMITER, null, 2, null), u30.k0.K5(str2, ContainerUtils.KEY_VALUE_DELIMITER, "")));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(((Pair) obj).getFirst(), "_charset_")) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null || (l11 = (String) pair.getSecond()) == null) {
            l11 = iz.a.l(defaultEncoding);
        }
        Charset i12 = iz.a.i(u30.d.f91598a, l11);
        p1.a aVar = p1.f62972b;
        q1 b11 = t1.b(0, 1, null);
        for (Pair pair2 : arrayList) {
            b11.k(f.k((String) pair2.component1(), 0, 0, false, i12, 7, null), f.k((String) pair2.component2(), 0, 0, false, i12, 7, null));
        }
        return b11.build();
    }

    public static /* synthetic */ p1 j(String str, Charset charset, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        if ((i12 & 2) != 0) {
            i11 = 1000;
        }
        return i(str, charset, i11);
    }
}
