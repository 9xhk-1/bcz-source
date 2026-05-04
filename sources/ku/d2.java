package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Exception {
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public final b2 f68678a;

        public a(b2 b2Var) {
            this.f68678a = b2Var;
        }

        public b2 a() {
            return this.f68678a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Iterator<b2> {

        /* renamed from: i, reason: collision with root package name */
        public static final String f68679i = "0123456789-";

        /* renamed from: j, reason: collision with root package name */
        public static final String f68680j = "0123456789eE+-.";

        /* renamed from: k, reason: collision with root package name */
        public static final String f68681k = "$\"{}[]:=,+#`^?!@*&\\";

        /* renamed from: a, reason: collision with root package name */
        public final x1 f68682a;

        /* renamed from: b, reason: collision with root package name */
        public final Reader f68683b;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedList<Integer> f68684c = new LinkedList<>();

        /* renamed from: d, reason: collision with root package name */
        public int f68685d = 1;

        /* renamed from: e, reason: collision with root package name */
        public ju.m f68686e;

        /* renamed from: f, reason: collision with root package name */
        public final Queue<b2> f68687f;

        /* renamed from: g, reason: collision with root package name */
        public final a f68688g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f68689h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public StringBuilder f68690a = new StringBuilder();

            /* renamed from: b, reason: collision with root package name */
            public boolean f68691b = false;

            public void a(int i11) {
                this.f68690a.appendCodePoint(i11);
            }

            public b2 b(b2 b2Var, ju.m mVar, int i11) {
                return b.d(b2Var) ? d(mVar, i11) : e(mVar, i11);
            }

            public final b2 c(ju.m mVar, int i11) {
                if (this.f68690a.length() <= 0) {
                    return null;
                }
                b2 D = this.f68691b ? e2.D(b.g(mVar, i11), this.f68690a.toString()) : e2.v(b.g(mVar, i11), this.f68690a.toString());
                this.f68690a.setLength(0);
                return D;
            }

            public final b2 d(ju.m mVar, int i11) {
                b2 c11 = c(mVar, i11);
                if (!this.f68691b) {
                    this.f68691b = true;
                }
                return c11;
            }

            public final b2 e(ju.m mVar, int i11) {
                this.f68691b = false;
                return c(mVar, i11);
            }
        }

        public b(ju.m mVar, Reader reader, boolean z11) {
            x1 x1Var = (x1) mVar;
            this.f68682a = x1Var;
            this.f68683b = reader;
            this.f68689h = z11;
            this.f68686e = x1Var.f(1);
            LinkedList linkedList = new LinkedList();
            this.f68687f = linkedList;
            linkedList.add(e2.f68701a);
            this.f68688g = new a();
        }

        public static boolean d(b2 b2Var) {
            return e2.n(b2Var) || e2.o(b2Var) || e2.p(b2Var);
        }

        public static boolean e(int i11) {
            return q.e(i11);
        }

        public static boolean f(int i11) {
            return i11 != 10 && q.e(i11);
        }

        public static ju.m g(ju.m mVar, int i11) {
            return ((x1) mVar).f(i11);
        }

        public static a p(ju.m mVar, String str) {
            return q(mVar, "", str, null);
        }

        public static a q(ju.m mVar, String str, String str2, Throwable th2) {
            return s(mVar, str, str2, false, th2);
        }

        public static a s(ju.m mVar, String str, String str2, boolean z11, Throwable th2) {
            if (str == null || str2 == null) {
                throw new ConfigException.BugOrBroken("internal error, creating bad ProblemException");
            }
            return new a(e2.A(mVar, str, str2, z11, th2));
        }

        public final b2 A() {
            ju.m mVar = this.f68686e;
            StringBuilder sb2 = new StringBuilder();
            int j11 = j();
            while (j11 != -1 && f68681k.indexOf(j11) < 0 && !e(j11) && !D(j11)) {
                sb2.appendCodePoint(j11);
                if (sb2.length() == 4) {
                    String sb3 = sb2.toString();
                    if (sb3.equals(n6.m.f74525c)) {
                        return e2.r(mVar, true);
                    }
                    if (sb3.equals("null")) {
                        return e2.z(mVar);
                    }
                } else if (sb2.length() == 5 && sb2.toString().equals("false")) {
                    return e2.r(mVar, false);
                }
                j11 = j();
            }
            B(j11);
            return e2.D(mVar, sb2.toString());
        }

        public final void B(int i11) {
            if (this.f68684c.size() > 2) {
                throw new ConfigException.BugOrBroken("bug: putBack() three times, undesirable look-ahead");
            }
            this.f68684c.push(Integer.valueOf(i11));
        }

        public final void C() throws a {
            b2 v11 = v(this.f68688g);
            b2 b11 = this.f68688g.b(v11, this.f68682a, this.f68685d);
            if (b11 != null) {
                this.f68687f.add(b11);
            }
            this.f68687f.add(v11);
        }

        public final boolean D(int i11) {
            if (i11 != -1 && this.f68689h) {
                if (i11 == 35) {
                    return true;
                }
                if (i11 == 47) {
                    int j11 = j();
                    B(j11);
                    if (j11 == 47) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void c(StringBuilder sb2, StringBuilder sb3) throws a {
            int i11 = 0;
            while (true) {
                int j11 = j();
                if (j11 == 34) {
                    i11++;
                } else if (i11 >= 3) {
                    sb2.setLength(sb2.length() - 3);
                    B(j11);
                    return;
                } else {
                    if (j11 == -1) {
                        throw k("End of input but triple-quoted string was still open");
                    }
                    if (j11 == 10) {
                        int i12 = this.f68685d + 1;
                        this.f68685d = i12;
                        this.f68686e = this.f68682a.f(i12);
                    }
                    i11 = 0;
                }
                sb2.appendCodePoint(j11);
                sb3.appendCodePoint(j11);
            }
        }

        @Override // java.util.Iterator
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b2 next() {
            b2 remove = this.f68687f.remove();
            if (this.f68687f.isEmpty() && remove != e2.f68702b) {
                try {
                    C();
                } catch (a e11) {
                    this.f68687f.add(e11.a());
                }
                if (this.f68687f.isEmpty()) {
                    throw new ConfigException.BugOrBroken("bug: tokens queue should not be empty here");
                }
            }
            return remove;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f68687f.isEmpty();
        }

        public final int i(a aVar) {
            while (true) {
                int j11 = j();
                if (j11 == -1) {
                    return -1;
                }
                if (!f(j11)) {
                    return j11;
                }
                aVar.a(j11);
            }
        }

        public final int j() {
            if (!this.f68684c.isEmpty()) {
                return this.f68684c.pop().intValue();
            }
            try {
                return this.f68683b.read();
            } catch (IOException e11) {
                throw new ConfigException.IO(this.f68682a, "read error: " + e11.getMessage(), e11);
            }
        }

        public final a k(String str) {
            return m("", str, null);
        }

        public final a l(String str, String str2) {
            return m(str, str2, null);
        }

        public final a m(String str, String str2, Throwable th2) {
            return q(this.f68686e, str, str2, th2);
        }

        public final a n(String str, String str2, boolean z11) {
            return o(str, str2, z11, null);
        }

        public final a o(String str, String str2, boolean z11, Throwable th2) {
            return s(this.f68686e, str, str2, z11, th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Does not make sense to remove items from token stream");
        }

        public final b2 t(int i11) {
            boolean z11;
            int j11;
            if (i11 != 47) {
                z11 = false;
            } else {
                if (j() != 47) {
                    throw new ConfigException.BugOrBroken("called pullComment but // not seen");
                }
                z11 = true;
            }
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                j11 = j();
                if (j11 == -1 || j11 == 10) {
                    break;
                }
                sb2.appendCodePoint(j11);
            }
            B(j11);
            return z11 ? e2.s(this.f68686e, sb2.toString()) : e2.t(this.f68686e, sb2.toString());
        }

        public final void u(StringBuilder sb2, StringBuilder sb3) throws a {
            int j11 = j();
            if (j11 == -1) {
                throw k("End of input but backslash in string had nothing after it");
            }
            sb3.appendCodePoint(92);
            sb3.appendCodePoint(j11);
            if (j11 == 34) {
                sb2.append('\"');
                return;
            }
            if (j11 == 47) {
                sb2.append('/');
                return;
            }
            if (j11 == 92) {
                sb2.append('\\');
                return;
            }
            if (j11 == 98) {
                sb2.append('\b');
                return;
            }
            if (j11 == 102) {
                sb2.append('\f');
                return;
            }
            if (j11 == 110) {
                sb2.append('\n');
                return;
            }
            if (j11 == 114) {
                sb2.append('\r');
                return;
            }
            if (j11 == 116) {
                sb2.append('\t');
                return;
            }
            if (j11 != 117) {
                throw l(d2.b(j11), String.format("backslash followed by '%s', this is not a valid escape sequence (quoted strings use JSON escaping, so use double-backslash \\\\ for literal backslash)", d2.b(j11)));
            }
            char[] cArr = new char[4];
            for (int i11 = 0; i11 < 4; i11++) {
                int j12 = j();
                if (j12 == -1) {
                    throw k("End of input but expecting 4 hex digits for \\uXXXX escape");
                }
                cArr[i11] = (char) j12;
            }
            String str = new String(cArr);
            sb3.append(cArr);
            try {
                sb2.appendCodePoint(Integer.parseInt(str, 16));
            } catch (NumberFormatException e11) {
                throw m(str, String.format("Malformed hex digits after \\u escape in string: '%s'", str), e11);
            }
        }

        public final b2 v(a aVar) throws a {
            b2 b2Var;
            int i11 = i(aVar);
            if (i11 == -1) {
                return e2.f68702b;
            }
            if (i11 == 10) {
                b2 x11 = e2.x(this.f68686e);
                int i12 = this.f68685d + 1;
                this.f68685d = i12;
                this.f68686e = this.f68682a.f(i12);
                return x11;
            }
            if (D(i11)) {
                b2Var = t(i11);
            } else {
                b2 x12 = i11 != 34 ? i11 != 36 ? i11 != 58 ? i11 != 61 ? i11 != 91 ? i11 != 93 ? i11 != 123 ? i11 != 125 ? i11 != 43 ? i11 != 44 ? null : e2.f68703c : x() : e2.f68707g : e2.f68706f : e2.f68709i : e2.f68708h : e2.f68704d : e2.f68705e : z() : y();
                if (x12 != null) {
                    b2Var = x12;
                } else if (f68679i.indexOf(i11) >= 0) {
                    b2Var = w(i11);
                } else {
                    if (f68681k.indexOf(i11) >= 0) {
                        throw n(d2.b(i11), "Reserved character '" + d2.b(i11) + "' is not allowed outside quotes", true);
                    }
                    B(i11);
                    b2Var = A();
                }
            }
            if (b2Var != null) {
                return b2Var;
            }
            throw new ConfigException.BugOrBroken("bug: failed to generate next token");
        }

        public final b2 w(int i11) throws a {
            StringBuilder sb2 = new StringBuilder();
            sb2.appendCodePoint(i11);
            int j11 = j();
            boolean z11 = false;
            while (j11 != -1 && f68680j.indexOf(j11) >= 0) {
                if (j11 == 46 || j11 == 101 || j11 == 69) {
                    z11 = true;
                }
                sb2.appendCodePoint(j11);
                j11 = j();
            }
            B(j11);
            String sb3 = sb2.toString();
            try {
                return z11 ? e2.u(this.f68686e, Double.parseDouble(sb3), sb3) : e2.y(this.f68686e, Long.parseLong(sb3), sb3);
            } catch (NumberFormatException unused) {
                for (char c11 : sb3.toCharArray()) {
                    if (f68681k.indexOf(c11) >= 0) {
                        throw n(d2.b(c11), "Reserved character '" + d2.b(c11) + "' is not allowed outside quotes", true);
                    }
                }
                return e2.D(this.f68686e, sb3);
            }
        }

        public final b2 x() throws a {
            int j11 = j();
            if (j11 == 61) {
                return e2.f68710j;
            }
            throw n(d2.b(j11), "'+' not followed by =, '" + d2.b(j11) + "' not allowed after '+'", true);
        }

        public final b2 y() throws a {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.appendCodePoint(34);
            while (true) {
                int j11 = j();
                if (j11 == -1) {
                    throw k("End of input but string quote was still open");
                }
                if (j11 == 92) {
                    u(sb2, sb3);
                } else {
                    if (j11 == 34) {
                        sb3.appendCodePoint(j11);
                        if (sb2.length() == 0) {
                            int j12 = j();
                            if (j12 == 34) {
                                sb3.appendCodePoint(j12);
                                c(sb2, sb3);
                            } else {
                                B(j12);
                            }
                        }
                        return e2.B(this.f68686e, sb2.toString(), sb3.toString());
                    }
                    if (q.d(j11)) {
                        throw l(d2.b(j11), "JSON does not allow unescaped " + d2.b(j11) + " in quoted strings, use a backslash escape");
                    }
                    sb2.appendCodePoint(j11);
                    sb3.appendCodePoint(j11);
                }
            }
        }

        public final b2 z() throws a {
            ju.m mVar = this.f68686e;
            int j11 = j();
            boolean z11 = true;
            if (j11 != 123) {
                throw n(d2.b(j11), "'$' not followed by {, '" + d2.b(j11) + "' not allowed after '$'", true);
            }
            int j12 = j();
            if (j12 != 63) {
                B(j12);
                z11 = false;
            }
            a aVar = new a();
            ArrayList arrayList = new ArrayList();
            while (true) {
                b2 v11 = v(aVar);
                if (v11 == e2.f68707g) {
                    return e2.C(mVar, z11, arrayList);
                }
                if (v11 == e2.f68702b) {
                    throw p(mVar, "Substitution ${ was not closed with a }");
                }
                b2 b11 = aVar.b(v11, mVar, this.f68685d);
                if (b11 != null) {
                    arrayList.add(b11);
                }
                arrayList.add(v11);
            }
        }
    }

    public static String b(int i11) {
        return i11 == 10 ? "newline" : i11 == 9 ? "tab" : i11 == -1 ? "end of file" : q.d(i11) ? String.format("control character 0x%x", Integer.valueOf(i11)) : String.format("%c", Integer.valueOf(i11));
    }

    public static String c(Iterator<b2> it) {
        StringBuilder sb2 = new StringBuilder();
        while (it.hasNext()) {
            sb2.append(it.next().e());
        }
        return sb2.toString();
    }

    public static Iterator<b2> d(ju.m mVar, Reader reader, ConfigSyntax configSyntax) {
        return new b(mVar, reader, configSyntax != ConfigSyntax.JSON);
    }
}
