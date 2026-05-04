package ku;

import com.typesafe.config.ConfigException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f68810a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f68811b;

    public s0(String str, s0 s0Var) {
        this.f68810a = str;
        this.f68811b = s0Var;
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (!Character.isLetterOrDigit(charAt) && charAt != '-' && charAt != '_') {
                return true;
            }
        }
        return false;
    }

    public static s0 f(String str) {
        return new s0(str, null);
    }

    public static s0 g(String str) {
        return u0.d(str);
    }

    public final void a(StringBuilder sb2) {
        if (c(this.f68810a) || this.f68810a.isEmpty()) {
            sb2.append(q.i(this.f68810a));
        } else {
            sb2.append(this.f68810a);
        }
        if (this.f68811b != null) {
            sb2.append(".");
            this.f68811b.a(sb2);
        }
    }

    public String b() {
        return this.f68810a;
    }

    public String d() {
        s0 s0Var = this;
        while (true) {
            s0 s0Var2 = s0Var.f68811b;
            if (s0Var2 == null) {
                return s0Var.f68810a;
            }
            s0Var = s0Var2;
        }
    }

    public int e() {
        int i11 = 1;
        for (s0 s0Var = this.f68811b; s0Var != null; s0Var = s0Var.f68811b) {
            i11++;
        }
        return i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f68810a.equals(s0Var.f68810a) && q.b(this.f68811b, s0Var.f68811b)) {
                return true;
            }
        }
        return false;
    }

    public s0 h() {
        if (this.f68811b == null) {
            return null;
        }
        t0 t0Var = new t0();
        for (s0 s0Var = this; s0Var.f68811b != null; s0Var = s0Var.f68811b) {
            t0Var.a(s0Var.f68810a);
        }
        return t0Var.d();
    }

    public int hashCode() {
        int hashCode = (this.f68810a.hashCode() + 41) * 41;
        s0 s0Var = this.f68811b;
        return hashCode + (s0Var == null ? 0 : s0Var.hashCode());
    }

    public s0 i(s0 s0Var) {
        t0 t0Var = new t0();
        t0Var.b(s0Var);
        t0Var.b(this);
        return t0Var.d();
    }

    public s0 j() {
        return this.f68811b;
    }

    public String k() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2);
        return sb2.toString();
    }

    public boolean l(s0 s0Var) {
        if (s0Var.e() > e()) {
            return false;
        }
        s0 s0Var2 = this;
        while (s0Var != null) {
            if (!s0Var.b().equals(s0Var2.b())) {
                return false;
            }
            s0Var2 = s0Var2.j();
            s0Var = s0Var.j();
        }
        return true;
    }

    public s0 m(int i11) {
        s0 s0Var = this;
        while (s0Var != null && i11 > 0) {
            i11--;
            s0Var = s0Var.f68811b;
        }
        return s0Var;
    }

    public s0 n(int i11, int i12) {
        if (i12 < i11) {
            throw new ConfigException.BugOrBroken("bad call to subPath");
        }
        s0 m11 = m(i11);
        t0 t0Var = new t0();
        int i13 = i12 - i11;
        while (i13 > 0) {
            i13--;
            t0Var.a(m11.b());
            m11 = m11.j();
            if (m11 == null) {
                throw new ConfigException.BugOrBroken("subPath lastIndex out of range " + i12);
            }
        }
        return t0Var.d();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Path(");
        a(sb2);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public s0(String... strArr) {
        if (strArr.length != 0) {
            this.f68810a = strArr[0];
            if (strArr.length > 1) {
                t0 t0Var = new t0();
                for (int i11 = 1; i11 < strArr.length; i11++) {
                    t0Var.a(strArr[i11]);
                }
                this.f68811b = t0Var.d();
                return;
            }
            this.f68811b = null;
            return;
        }
        throw new ConfigException.BugOrBroken("empty path");
    }

    public s0(List<s0> list) {
        this(list.iterator());
    }

    public s0(Iterator<s0> it) {
        if (it.hasNext()) {
            s0 next = it.next();
            this.f68810a = next.f68810a;
            t0 t0Var = new t0();
            s0 s0Var = next.f68811b;
            if (s0Var != null) {
                t0Var.b(s0Var);
            }
            while (it.hasNext()) {
                t0Var.b(it.next());
            }
            this.f68811b = t0Var.d();
            return;
        }
        throw new ConfigException.BugOrBroken("empty path");
    }
}
