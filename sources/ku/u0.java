package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static ju.m f68841a = x1.w("path parameter");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public StringBuilder f68842a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f68843b;

        public a(String str, boolean z11) {
            this.f68843b = z11;
            this.f68842a = new StringBuilder(str);
        }

        public String toString() {
            return "Element(" + this.f68842a.toString() + "," + this.f68843b + pn.j.f81007d;
        }
    }

    public static void a(List<a> list, boolean z11, String str) {
        int indexOf = z11 ? -1 : str.indexOf(46);
        a aVar = list.get(list.size() - 1);
        if (indexOf >= 0) {
            aVar.f68842a.append(str.substring(0, indexOf));
            list.add(new a("", false));
            a(list, false, str.substring(indexOf + 1));
        } else {
            aVar.f68842a.append(str);
            if (z11 && aVar.f68842a.length() == 0) {
                aVar.f68843b = true;
            }
        }
    }

    public static s0 b(s0 s0Var, String str, int i11) {
        int lastIndexOf = str.lastIndexOf(46, i11 - 1);
        s0 s0Var2 = new s0(str.substring(lastIndexOf + 1, i11), s0Var);
        return lastIndexOf < 0 ? s0Var2 : b(s0Var2, str, lastIndexOf);
    }

    public static boolean c(String str) {
        int length = str.length();
        if (str.isEmpty() || str.charAt(0) == '.' || str.charAt(length - 1) == '.') {
            return true;
        }
        boolean z11 = true;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == '_')) {
                z11 = false;
            } else if (charAt == '.') {
                if (z11) {
                    return true;
                }
                z11 = true;
            } else if (charAt != '-' || z11) {
                return true;
            }
        }
        return z11;
    }

    public static s0 d(String str) {
        s0 l11 = l(str);
        if (l11 != null) {
            return l11;
        }
        StringReader stringReader = new StringReader(str);
        try {
            Iterator<b2> d11 = d2.d(f68841a, stringReader, ConfigSyntax.CONF);
            d11.next();
            return f(d11, f68841a, str);
        } finally {
            stringReader.close();
        }
    }

    public static s0 e(Iterator<b2> it, ju.m mVar) {
        return g(it, mVar, null, null, ConfigSyntax.CONF);
    }

    public static s0 f(Iterator<b2> it, ju.m mVar, String str) {
        return g(it, mVar, str, null, ConfigSyntax.CONF);
    }

    public static s0 g(Iterator<b2> it, ju.m mVar, String str, ArrayList<b2> arrayList, ConfigSyntax configSyntax) {
        String h11;
        ArrayList<a> arrayList2 = new ArrayList();
        arrayList2.add(new a("", false));
        if (!it.hasNext()) {
            throw new ConfigException.BadPath(mVar, str, "Expecting a field name or path here, but got nothing");
        }
        while (it.hasNext()) {
            b2 next = it.next();
            if (arrayList != null) {
                arrayList.add(next);
            }
            if (!e2.k(next)) {
                if (e2.q(next, ConfigValueType.STRING)) {
                    a(arrayList2, true, e2.i(next).Q0());
                } else if (next != e2.f68702b) {
                    if (e2.p(next)) {
                        d i11 = e2.i(next);
                        if (arrayList != null) {
                            arrayList.remove(arrayList.size() - 1);
                            arrayList.addAll(m(next, configSyntax));
                        }
                        h11 = i11.Q0();
                    } else {
                        if (!e2.o(next)) {
                            throw new ConfigException.BadPath(mVar, str, "Token not allowed in path expression: " + next + " (you can double-quote this token if you really want it here)");
                        }
                        if (arrayList != null) {
                            arrayList.remove(arrayList.size() - 1);
                            arrayList.addAll(m(next, configSyntax));
                        }
                        h11 = e2.h(next);
                    }
                    a(arrayList2, false, h11);
                } else {
                    continue;
                }
            }
        }
        t0 t0Var = new t0();
        for (a aVar : arrayList2) {
            if (aVar.f68842a.length() == 0 && !aVar.f68843b) {
                throw new ConfigException.BadPath(mVar, str, "path has a leading, trailing, or two adjacent period '.' (use quoted \"\" empty string if you want an empty element)");
            }
            t0Var.a(aVar.f68842a.toString());
        }
        return t0Var.d();
    }

    public static b0 h(String str) {
        return i(str, ConfigSyntax.CONF);
    }

    public static b0 i(String str, ConfigSyntax configSyntax) {
        StringReader stringReader = new StringReader(str);
        try {
            Iterator<b2> d11 = d2.d(f68841a, stringReader, configSyntax);
            d11.next();
            return k(d11, f68841a, str, configSyntax);
        } finally {
            stringReader.close();
        }
    }

    public static b0 j(Iterator<b2> it, ju.m mVar) {
        return k(it, mVar, null, ConfigSyntax.CONF);
    }

    public static b0 k(Iterator<b2> it, ju.m mVar, String str, ConfigSyntax configSyntax) {
        ArrayList arrayList = new ArrayList();
        return new b0(g(it, mVar, str, arrayList, configSyntax), arrayList);
    }

    public static s0 l(String str) {
        String o11 = q.o(str);
        if (c(o11)) {
            return null;
        }
        return b(null, o11, o11.length());
    }

    public static Collection<b2> m(b2 b2Var, ConfigSyntax configSyntax) {
        String e11 = b2Var.e();
        if (e11.equals(".")) {
            return Collections.singletonList(b2Var);
        }
        String[] split = e11.split("\\.");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            if (configSyntax == ConfigSyntax.CONF) {
                arrayList.add(e2.D(b2Var.d(), str));
            } else {
                arrayList.add(e2.B(b2Var.d(), str, "\"" + str + "\""));
            }
            arrayList.add(e2.D(b2Var.d(), "."));
        }
        if (e11.charAt(e11.length() - 1) != '.') {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }
}
