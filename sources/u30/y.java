package u30;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:146\n126#1,2:159\n119#1,2:168\n121#1,4:183\n126#1,2:190\n1#2:130\n1#2:156\n1#2:187\n1#2:211\n1583#3,11:133\n1878#3,2:144\n1880#3:157\n1594#3:158\n774#3:161\n865#3,2:162\n1563#3:164\n1634#3,3:165\n1583#3,11:170\n1878#3,2:181\n1880#3:188\n1594#3:189\n1583#3,11:198\n1878#3,2:209\n1880#3:212\n1594#3:213\n158#4,6:150\n158#4,6:192\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:146,4\n42#1:159,2\n83#1:168,2\n83#1:183,4\n83#1:190,2\n42#1:156\n83#1:187\n120#1:211\n42#1:133,11\n42#1:144,2\n42#1:157\n42#1:158\n79#1:161\n79#1:162,2\n80#1:164\n80#1:165,3\n83#1:170,11\n83#1:181,2\n83#1:188\n83#1:189\n120#1:198,11\n120#1:209,2\n120#1:212\n120#1:213\n43#1:150,6\n107#1:192,6\n*E\n"})
/* loaded from: classes8.dex */
public class y extends u {
    public static final x00.l<String, String> j(final String str) {
        return str.length() == 0 ? new x00.l() { // from class: u30.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                String k11;
                k11 = y.k((String) obj);
                return k11;
            }
        } : new x00.l() { // from class: u30.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                String l11;
                l11 = y.l(str, (String) obj);
                return l11;
            }
        };
    }

    public static final String k(String line) {
        kotlin.jvm.internal.g0.p(line, "line");
        return line;
    }

    public static final String l(String str, String line) {
        kotlin.jvm.internal.g0.p(line, "line");
        return str + line;
    }

    public static final int m(String str) {
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!kotlin.text.a.r(str.charAt(i11))) {
                break;
            }
            i11++;
        }
        return i11 == -1 ? str.length() : i11;
    }

    @m80.k
    public static String n(@m80.k String str, @m80.k final String indent) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(indent, "indent");
        return q30.k0.H1(q30.k0.N1(k0.d4(str), new x00.l() { // from class: u30.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                String p11;
                p11 = y.p(indent, (String) obj);
                return p11;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String o(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "    ";
        }
        return n(str, str2);
    }

    public static final String p(String str, String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (k0.O3(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    public static final String q(List<String> list, int i11, x00.l<? super String, String> lVar, x00.l<? super String, String> lVar2) {
        String invoke;
        int L = a00.h0.L(list);
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                a00.h0.b0();
            }
            String str = (String) obj;
            if ((i12 == 0 || i12 == L) && k0.O3(str)) {
                str = null;
            } else {
                String invoke2 = lVar2.invoke(str);
                if (invoke2 != null && (invoke = lVar.invoke(invoke2)) != null) {
                    str = invoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i12 = i13;
        }
        return ((StringBuilder) a00.r0.p3(arrayList, new StringBuilder(i11), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    @m80.k
    public static final String r(@m80.k String str, @m80.k String newIndent) {
        String invoke;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(newIndent, "newIndent");
        List<String> e42 = k0.e4(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : e42) {
            if (!k0.O3((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m((String) it.next())));
        }
        Integer num = (Integer) a00.r0.m4(arrayList2);
        int i11 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * e42.size());
        x00.l<String, String> j11 = j(newIndent);
        int L = a00.h0.L(e42);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : e42) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            String str2 = (String) obj2;
            if ((i11 == 0 || i11 == L) && k0.O3(str2)) {
                str2 = null;
            } else {
                String d72 = r0.d7(str2, intValue);
                if (d72 != null && (invoke = j11.invoke(d72)) != null) {
                    str2 = invoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i11 = i12;
        }
        return ((StringBuilder) a00.r0.p3(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static /* synthetic */ String s(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "";
        }
        return r(str, str2);
    }

    @m80.k
    public static final String t(@m80.k String str, @m80.k String newIndent, @m80.k String marginPrefix) {
        String str2;
        String invoke;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(newIndent, "newIndent");
        kotlin.jvm.internal.g0.p(marginPrefix, "marginPrefix");
        if (k0.O3(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> e42 = k0.e4(str);
        int length = str.length() + (newIndent.length() * e42.size());
        x00.l<String, String> j11 = j(newIndent);
        int L = a00.h0.L(e42);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : e42) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            String str3 = (String) obj;
            String str4 = null;
            if ((i11 == 0 || i11 == L) && k0.O3(str3)) {
                str2 = marginPrefix;
                str3 = null;
            } else {
                int length2 = str3.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (!kotlin.text.a.r(str3.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                if (i13 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i14 = i13;
                    str2 = marginPrefix;
                    if (f0.I2(str3, str2, i14, false, 4, null)) {
                        int length3 = str2.length() + i14;
                        kotlin.jvm.internal.g0.n(str3, "null cannot be cast to non-null type java.lang.String");
                        str4 = str3.substring(length3);
                        kotlin.jvm.internal.g0.o(str4, "substring(...)");
                    }
                }
                if (str4 != null && (invoke = j11.invoke(str4)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i11 = i12;
            marginPrefix = str2;
        }
        return ((StringBuilder) a00.r0.p3(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static /* synthetic */ String u(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "";
        }
        if ((i11 & 2) != 0) {
            str3 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return t(str, str2, str3);
    }

    @o00.g
    @m80.k
    public static String v(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return r(str, "");
    }

    @o00.g
    @m80.k
    public static final String w(@m80.k String str, @m80.k String marginPrefix) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(marginPrefix, "marginPrefix");
        return t(str, "", marginPrefix);
    }

    public static /* synthetic */ String x(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return w(str, str2);
    }
}
