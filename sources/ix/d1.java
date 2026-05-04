package ix;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpMessageProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpMessageProperties.kt\nio/ktor/http/HttpMessagePropertiesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1#2:160\n1368#3:161\n1454#3,2:162\n1557#3:164\n1628#3,3:165\n1456#3,3:168\n1368#3:171\n1454#3,2:172\n1557#3:174\n1628#3,3:175\n1456#3,3:178\n1368#3:181\n1454#3,5:182\n1557#3:187\n1628#3,3:188\n1557#3:191\n1628#3,3:192\n*S KotlinDebug\n*F\n+ 1 HttpMessageProperties.kt\nio/ktor/http/HttpMessagePropertiesKt\n*L\n51#1:161\n51#1:162,2\n52#1:164\n52#1:165,3\n51#1:168,3\n78#1:171\n78#1:172,2\n79#1:174\n79#1:175,3\n78#1:178,3\n91#1:181\n91#1:182,5\n92#1:187\n92#1:188,3\n99#1:191\n99#1:192,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d1 {
    @m80.k
    public static final List<m0> a(@m80.k a1 a1Var) {
        List<m0> f11;
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        String str = a1Var.a().get(y0.f63006a.u());
        return (str == null || (f11 = x0.f(str)) == null) ? a00.h0.J() : f11;
    }

    @m80.l
    public static final Charset b(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        k f11 = f(a1Var);
        if (f11 != null) {
            return m.a(f11);
        }
        return null;
    }

    @m80.l
    public static final Charset c(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        k g11 = g(b1Var);
        if (g11 != null) {
            return m.a(g11);
        }
        return null;
    }

    @m80.l
    public static final Long d(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        String str = a1Var.a().get(y0.f63006a.z());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    @m80.l
    public static final Long e(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        String str = b1Var.a().get(y0.f63006a.z());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    @m80.l
    public static final k f(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        String str = a1Var.a().get(y0.f63006a.C());
        if (str != null) {
            return k.f62843f.b(str);
        }
        return null;
    }

    @m80.l
    public static final k g(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        String str = b1Var.a().get(y0.f63006a.C());
        if (str != null) {
            return k.f62843f.b(str);
        }
        return null;
    }

    public static final void h(@m80.k b1 b1Var, @m80.k k type) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        b1Var.a().d(y0.f63006a.C(), type.toString());
    }

    @m80.k
    public static final List<n> i(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        List<String> a11 = b1Var.a().a(y0.f63006a.B0());
        if (a11 == null) {
            return a00.h0.J();
        }
        List<String> list = a11;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c0.p((String) it.next()));
        }
        return arrayList;
    }

    @m80.l
    public static final String j(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        return a1Var.a().get(y0.f63006a.J());
    }

    @m80.l
    public static final String k(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        return b1Var.a().get(y0.f63006a.J());
    }

    public static final void l(@m80.k b1 b1Var, @m80.k String value) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        b1Var.a().d(y0.f63006a.T(), value);
    }

    public static final void m(@m80.k b1 b1Var, int i11) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        b1Var.a().k(y0.f63006a.u(), "max-age=" + i11);
    }

    @m80.k
    public static final List<n> n(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        List<String> a11 = a1Var.a().a(y0.f63006a.B0());
        if (a11 == null) {
            return a00.h0.J();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            a00.m0.s0(arrayList, o((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c0.p((String) it2.next()));
        }
        return arrayList2;
    }

    @m80.k
    public static final List<String> o(@m80.k String str) {
        int i11;
        String str2;
        int i12;
        int i13;
        kotlin.jvm.internal.g0.p(str, "<this>");
        int I3 = u30.k0.I3(str, ',', 0, false, 6, null);
        if (I3 == -1) {
            return a00.g0.l(str);
        }
        ArrayList arrayList = new ArrayList();
        String str3 = str;
        int I32 = u30.k0.I3(str3, '=', I3, false, 4, null);
        int I33 = u30.k0.I3(str3, l70.f.f70689d, I3, false, 4, null);
        int i14 = 0;
        int i15 = I3;
        int i16 = I33;
        while (i14 < str3.length() && i15 > 0) {
            if (I32 < i15) {
                String str4 = str3;
                int I34 = u30.k0.I3(str4, '=', i15, false, 4, null);
                i11 = i15;
                str2 = str4;
                i12 = I34;
            } else {
                String str5 = str3;
                i11 = i15;
                str2 = str5;
                i12 = I32;
            }
            String str6 = str2;
            int I35 = u30.k0.I3(str6, ',', i11 + 1, false, 4, null);
            while (true) {
                i13 = i11;
                i11 = I35;
                if (i11 < 0 || i11 >= i12) {
                    break;
                }
                I35 = u30.k0.I3(str6, ',', i11 + 1, false, 4, null);
            }
            if (i16 < i13) {
                i16 = u30.k0.I3(str6, l70.f.f70689d, i13, false, 4, null);
            }
            if (i12 < 0) {
                String substring = str6.substring(i14);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                arrayList.add(substring);
                return arrayList;
            }
            if (i16 == -1 || i16 > i12) {
                String substring2 = str6.substring(i14, i13);
                kotlin.jvm.internal.g0.o(substring2, "substring(...)");
                arrayList.add(substring2);
                i14 = i13 + 1;
            }
            i15 = i11;
            str3 = str6;
            I32 = i12;
        }
        String str7 = str3;
        if (i14 < str7.length()) {
            String substring3 = str7.substring(i14);
            kotlin.jvm.internal.g0.o(substring3, "substring(...)");
            arrayList.add(substring3);
        }
        return arrayList;
    }

    public static final void p(@m80.k b1 b1Var, @m80.k String content) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(content, "content");
        b1Var.a().d(y0.f63006a.L0(), content);
    }

    @m80.l
    public static final List<String> q(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        List<String> a11 = a1Var.a().a(y0.f63006a.M0());
        if (a11 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            List o52 = u30.k0.o5((String) it.next(), new String[]{","}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(o52, 10));
            Iterator it2 = o52.iterator();
            while (it2.hasNext()) {
                arrayList2.add(u30.k0.b6((String) it2.next()).toString());
            }
            a00.m0.s0(arrayList, arrayList2);
        }
        return arrayList;
    }

    @m80.l
    public static final List<String> r(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        List<String> a11 = b1Var.a().a(y0.f63006a.M0());
        if (a11 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            List o52 = u30.k0.o5((String) it.next(), new String[]{","}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(o52, 10));
            Iterator it2 = o52.iterator();
            while (it2.hasNext()) {
                arrayList2.add(u30.k0.b6((String) it2.next()).toString());
            }
            a00.m0.s0(arrayList, arrayList2);
        }
        return arrayList;
    }
}
