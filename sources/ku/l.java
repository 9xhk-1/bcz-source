package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public final Iterator<b2> f68740c;

        /* renamed from: d, reason: collision with root package name */
        public final ConfigSyntax f68741d;

        /* renamed from: e, reason: collision with root package name */
        public final ju.m f68742e;

        /* renamed from: g, reason: collision with root package name */
        public final String f68744g = "expecting a close parentheses ')' here, not: ";

        /* renamed from: a, reason: collision with root package name */
        public int f68738a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Stack<b2> f68739b = new Stack<>();

        /* renamed from: f, reason: collision with root package name */
        public int f68743f = 0;

        public a(ConfigSyntax configSyntax, ju.m mVar, Iterator<b2> it) {
            this.f68740c = it;
            this.f68741d = configSyntax;
            this.f68742e = mVar;
        }

        public static boolean e(b2 b2Var) {
            return e2.o(b2Var) && e2.h(b2Var).equals("include");
        }

        public static boolean g(b2 b2Var) {
            if (!e2.o(b2Var)) {
                return false;
            }
            String h11 = e2.h(b2Var);
            for (int i11 = 0; i11 < h11.length(); i11++) {
                if (!q.e(h11.charAt(i11))) {
                    return false;
                }
            }
            return true;
        }

        public final String a(String str, String str2) {
            return b(null, this.f68743f > 0, str, str2);
        }

        public final String b(s0 s0Var, boolean z11, String str, String str2) {
            String str3;
            String k11 = s0Var != null ? s0Var.k() : null;
            if (str.equals(e2.f68702b.toString())) {
                if (k11 == null) {
                    return str2;
                }
                str3 = str2 + " (if you intended '" + k11 + "' to be part of a value, instead of a key, try adding double quotes around the whole value";
            } else if (k11 != null) {
                str3 = str2 + " (if you intended " + str + " to be part of the value for '" + k11 + "', try enclosing the value in double quotes";
            } else {
                str3 = str2 + " (if you intended " + str + " to be part of a key or string value, try enclosing the key or value in double quotes";
            }
            if (z11) {
                return str3 + ", or you may be able to rename the file .properties rather than .conf)";
            }
            return str3 + pn.j.f81007d;
        }

        public final boolean c(Collection<ku.a> collection) {
            boolean z11 = false;
            if (this.f68741d == ConfigSyntax.JSON) {
                b2 i11 = i(collection);
                if (i11 == e2.f68703c) {
                    collection.add(new e0(i11));
                    return true;
                }
                u(i11);
                return false;
            }
            b2 h11 = h();
            while (true) {
                if (!e2.k(h11) && !g(h11)) {
                    if (!e2.j(h11)) {
                        if (!e2.l(h11)) {
                            break;
                        }
                        this.f68738a++;
                        collection.add(new e0(h11));
                        z11 = true;
                    } else {
                        collection.add(new v(h11));
                    }
                } else {
                    collection.add(new e0(h11));
                }
                h11 = h();
            }
            if (h11 == e2.f68703c) {
                collection.add(new e0(h11));
                return true;
            }
            u(h11);
            return z11;
        }

        public final b d(Collection<ku.a> collection) {
            b bVar = null;
            if (this.f68741d == ConfigSyntax.JSON) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            b2 i11 = i(collection);
            int i12 = 0;
            while (true) {
                if (e2.k(i11)) {
                    arrayList.add(new e0(i11));
                    i11 = h();
                } else {
                    if (!e2.p(i11) && !e2.o(i11) && !e2.n(i11) && i11 != e2.f68706f && i11 != e2.f68708h) {
                        u(i11);
                        if (i12 >= 2) {
                            for (int size = arrayList.size() - 1; size >= 0 && (arrayList.get(size) instanceof e0); size--) {
                                u(((e0) arrayList.get(size)).c());
                                arrayList.remove(size);
                            }
                            return new x(arrayList);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ku.a aVar = (ku.a) it.next();
                            if (aVar instanceof b) {
                                bVar = (b) aVar;
                            } else if (bVar == null) {
                                collection.add(aVar);
                            } else {
                                u((b2) new ArrayList(aVar.a()).get(0));
                            }
                        }
                        return bVar;
                    }
                    b s11 = s(i11);
                    i12++;
                    if (s11 == null) {
                        throw new ConfigException.BugOrBroken("no value");
                    }
                    arrayList.add(s11);
                    i11 = h();
                }
            }
        }

        public final boolean f(b2 b2Var) {
            return this.f68741d == ConfigSyntax.JSON ? b2Var == e2.f68705e : b2Var == e2.f68705e || b2Var == e2.f68704d || b2Var == e2.f68710j;
        }

        public final b2 h() {
            b2 t11 = t();
            if (this.f68741d == ConfigSyntax.JSON) {
                if (e2.o(t11) && !g(t11)) {
                    throw l("Token not allowed in valid JSON: '" + e2.h(t11) + "'");
                }
                if (e2.n(t11)) {
                    throw l("Substitutions (${} syntax) not allowed in JSON");
                }
            }
            return t11;
        }

        public final b2 i(Collection<ku.a> collection) {
            b2 h11;
            while (true) {
                h11 = h();
                if (!e2.k(h11) && !e2.l(h11) && !g(h11)) {
                    if (!e2.j(h11)) {
                        break;
                    }
                    collection.add(new v(h11));
                } else {
                    collection.add(new e0(h11));
                    if (e2.l(h11)) {
                        this.f68738a = h11.b() + 1;
                    }
                }
            }
            int b11 = h11.b();
            if (b11 >= 0) {
                this.f68738a = b11;
            }
            return h11;
        }

        public c0 j() {
            b s11;
            ArrayList arrayList = new ArrayList();
            b2 h11 = h();
            if (h11 != e2.f68701a) {
                throw new ConfigException.BugOrBroken("token stream did not begin with START, had " + h11);
            }
            b2 i11 = i(arrayList);
            boolean z11 = false;
            if (i11 == e2.f68706f || i11 == e2.f68708h) {
                s11 = s(i11);
            } else {
                if (this.f68741d == ConfigSyntax.JSON) {
                    if (i11 == e2.f68702b) {
                        throw l("Empty document");
                    }
                    throw l("Document must have an object or array at root, unexpected token: " + i11);
                }
                u(i11);
                s11 = q(false);
                z11 = true;
            }
            if ((s11 instanceof a0) && z11) {
                arrayList.addAll(((w) s11).c());
            } else {
                arrayList.add(s11);
            }
            b2 i12 = i(arrayList);
            if (i12 == e2.f68702b) {
                return z11 ? new c0(Collections.singletonList(new a0(arrayList)), this.f68742e) : new c0(arrayList, this.f68742e);
            }
            throw l("Document has trailing tokens after first object or array: " + i12);
        }

        public final w k() {
            ArrayList arrayList = new ArrayList();
            b2 b2Var = e2.f68708h;
            arrayList.add(new e0(b2Var));
            b d11 = d(arrayList);
            if (d11 != null) {
                arrayList.add(d11);
            } else {
                b2 i11 = i(arrayList);
                if (i11 == e2.f68709i) {
                    arrayList.add(new e0(i11));
                    return new u(arrayList);
                }
                if (!e2.p(i11) && i11 != e2.f68706f && i11 != b2Var && !e2.o(i11) && !e2.n(i11)) {
                    throw l("List should have ] or a first element after the open [, instead had token: " + i11 + " (if you want " + i11 + " to be part of a string value, then double-quote it)");
                }
                arrayList.add(s(i11));
            }
            while (c(arrayList)) {
                b d12 = d(arrayList);
                if (d12 != null) {
                    arrayList.add(d12);
                } else {
                    b2 i12 = i(arrayList);
                    if (e2.p(i12) || i12 == e2.f68706f || i12 == e2.f68708h || e2.o(i12) || e2.n(i12)) {
                        arrayList.add(s(i12));
                    } else {
                        if (this.f68741d == ConfigSyntax.JSON || i12 != e2.f68709i) {
                            throw l("List should have had new element after a comma, instead had token: " + i12 + " (if you want the comma or " + i12 + " to be part of a string value, then double-quote it)");
                        }
                        u(i12);
                    }
                }
            }
            b2 i13 = i(arrayList);
            if (i13 == e2.f68709i) {
                arrayList.add(new e0(i13));
                return new u(arrayList);
            }
            throw l("List should have ended with ] or had a comma, instead had token: " + i13 + " (if you want " + i13 + " to be part of a string value, then double-quote it)");
        }

        public final ConfigException l(String str) {
            return m(str, null);
        }

        public final ConfigException m(String str, Throwable th2) {
            return new ConfigException.Parse(this.f68742e.f(this.f68738a), str, th2);
        }

        public final z n(ArrayList<ku.a> arrayList) {
            b2 i11 = i(arrayList);
            if (!e2.o(i11)) {
                u(i11);
                return o(arrayList, false);
            }
            String h11 = e2.h(i11);
            if (!h11.startsWith("required(")) {
                u(i11);
                return o(arrayList, false);
            }
            String replaceFirst = h11.replaceFirst("required\\(", "");
            if (replaceFirst.length() > 0) {
                u(e2.D(i11.d(), replaceFirst));
            }
            arrayList.add(new e0(i11));
            z o11 = o(arrayList, true);
            b2 i12 = i(arrayList);
            if (e2.o(i12) && e2.h(i12).equals(pn.j.f81007d)) {
                return o11;
            }
            throw l("expecting a close parentheses ')' here, not: " + i12);
        }

        public final z o(ArrayList<ku.a> arrayList, boolean z11) {
            r rVar;
            b2 i11 = i(arrayList);
            if (!e2.o(i11)) {
                if (e2.q(i11, ConfigValueType.STRING)) {
                    arrayList.add(new d0(i11));
                    return new z(arrayList, r.HEURISTIC, z11);
                }
                throw l("include keyword is not followed by a quoted string, but by: " + i11);
            }
            String h11 = e2.h(i11);
            String str = "url(";
            if (h11.startsWith("url(")) {
                rVar = r.URL;
            } else {
                str = "file(";
                if (h11.startsWith("file(")) {
                    rVar = r.FILE;
                } else {
                    str = "classpath(";
                    if (!h11.startsWith("classpath(")) {
                        throw l("expecting include parameter to be quoted filename, file(), classpath(), or url(). No spaces are allowed before the open paren. Not expecting: " + i11);
                    }
                    rVar = r.CLASSPATH;
                }
            }
            String replaceFirst = h11.replaceFirst("[^(]*\\(", "");
            if (replaceFirst.length() > 0) {
                u(e2.D(i11.d(), replaceFirst));
            }
            arrayList.add(new e0(i11));
            b2 i12 = i(arrayList);
            if (!e2.q(i12, ConfigValueType.STRING)) {
                throw l("expecting include " + str + ") parameter to be a quoted string, rather than: " + i12);
            }
            arrayList.add(new d0(i12));
            b2 i13 = i(arrayList);
            if (e2.o(i13) && e2.h(i13).startsWith(pn.j.f81007d)) {
                String substring = e2.h(i13).substring(1);
                if (substring.length() > 0) {
                    u(e2.D(i13.d(), substring));
                }
                return new z(arrayList, rVar, z11);
            }
            throw l("expecting a close parentheses ')' here, not: " + i13);
        }

        public final b0 p(b2 b2Var) {
            if (this.f68741d == ConfigSyntax.JSON) {
                if (e2.q(b2Var, ConfigValueType.STRING)) {
                    return u0.j(Collections.singletonList(b2Var).iterator(), this.f68742e.f(this.f68738a));
                }
                throw l("Expecting close brace } or a field name here, got " + b2Var);
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (!e2.p(b2Var) && !e2.o(b2Var)) {
                    break;
                }
                arrayList.add(b2Var);
                b2Var = h();
            }
            if (!arrayList.isEmpty()) {
                u(b2Var);
                return u0.j(arrayList.iterator(), this.f68742e.f(this.f68738a));
            }
            throw l("expecting a close parentheses ')' here, not: " + b2Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x015b, code lost:
        
            return new ku.a0(r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final ku.w q(boolean r14) {
            /*
                Method dump skipped, instructions count: 458
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ku.l.a.q(boolean):ku.w");
        }

        public b r() {
            b2 h11 = h();
            if (h11 != e2.f68701a) {
                throw new ConfigException.BugOrBroken("token stream did not begin with START, had " + h11);
            }
            b2 h12 = h();
            if (e2.k(h12) || e2.l(h12) || g(h12) || e2.j(h12)) {
                throw l("The value from withValueText cannot have leading or trailing newlines, whitespace, or comments");
            }
            b2 b2Var = e2.f68702b;
            if (h12 == b2Var) {
                throw l("Empty value");
            }
            if (this.f68741d == ConfigSyntax.JSON) {
                b s11 = s(h12);
                if (h() == b2Var) {
                    return s11;
                }
                throw l("Parsing JSON and the value set in withValueText was either a concatenation or had trailing whitespace, newlines, or comments");
            }
            u(h12);
            b d11 = d(new ArrayList());
            if (h() == b2Var) {
                return d11;
            }
            throw l("The value from withValueText cannot have leading or trailing newlines, whitespace, or comments");
        }

        public final b s(b2 b2Var) {
            b d0Var;
            int i11 = this.f68743f;
            if (e2.p(b2Var) || e2.o(b2Var) || e2.n(b2Var)) {
                d0Var = new d0(b2Var);
            } else if (b2Var == e2.f68706f) {
                d0Var = q(true);
            } else {
                if (b2Var != e2.f68708h) {
                    throw l(a(b2Var.toString(), "Expecting a value but got wrong token: " + b2Var));
                }
                d0Var = k();
            }
            if (this.f68743f == i11) {
                return d0Var;
            }
            throw new ConfigException.BugOrBroken("Bug in config parser: unbalanced equals count");
        }

        public final b2 t() {
            return this.f68739b.isEmpty() ? this.f68740c.next() : this.f68739b.pop();
        }

        public final void u(b2 b2Var) {
            this.f68739b.push(b2Var);
        }
    }

    public static c0 a(Iterator<b2> it, ju.m mVar, ju.o oVar) {
        return new a(oVar.g() == null ? ConfigSyntax.CONF : oVar.g(), mVar, it).j();
    }

    public static b b(Iterator<b2> it, ju.m mVar, ju.o oVar) {
        return new a(oVar.g() == null ? ConfigSyntax.CONF : oVar.g(), mVar, it).r();
    }
}
