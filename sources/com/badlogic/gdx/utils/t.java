package com.badlogic.gdx.utils;

import a3.d0;
import a3.x0;
import a3.y0;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kx.a0;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f13451f = d();

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f13452g = g();

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f13453h = k();

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f13454i = i();

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13455j = h();

    /* renamed from: k, reason: collision with root package name */
    public static final short[] f13456k = e();

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f13457l = f();

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f13458m = l();

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f13459n = j();

    /* renamed from: o, reason: collision with root package name */
    public static final int f13460o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f13461p = 34;

    /* renamed from: q, reason: collision with root package name */
    public static final int f13462q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f13463r = 15;

    /* renamed from: s, reason: collision with root package name */
    public static final int f13464s = 1;

    /* renamed from: b, reason: collision with root package name */
    public a f13466b;

    /* renamed from: c, reason: collision with root package name */
    public a f13467c;

    /* renamed from: e, reason: collision with root package name */
    public String f13469e;

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f13465a = new com.badlogic.gdx.utils.a<>(8);

    /* renamed from: d, reason: collision with root package name */
    public final y0 f13468d = new y0(64);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13470a;

        /* renamed from: b, reason: collision with root package name */
        public l<String, String> f13471b;

        /* renamed from: c, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<a> f13472c;

        /* renamed from: d, reason: collision with root package name */
        public String f13473d;

        /* renamed from: e, reason: collision with root package name */
        public a f13474e;

        public a(String str, a aVar) {
            this.f13470a = str;
            this.f13474e = aVar;
        }

        public String A() {
            return this.f13470a;
        }

        public a B() {
            return this.f13474e;
        }

        public String C() {
            return this.f13473d;
        }

        public boolean D(String str) {
            l<String, String> lVar = this.f13471b;
            if (lVar == null) {
                return false;
            }
            return lVar.b(str);
        }

        public boolean E(String str) {
            return (this.f13472c == null || l(str) == null) ? false : true;
        }

        public boolean F(String str) {
            return (this.f13472c == null || m(str) == null) ? false : true;
        }

        public void G() {
            this.f13474e.I(this);
        }

        public void H(int i11) {
            com.badlogic.gdx.utils.a<a> aVar = this.f13472c;
            if (aVar != null) {
                aVar.A(i11);
            }
        }

        public void I(a aVar) {
            com.badlogic.gdx.utils.a<a> aVar2 = this.f13472c;
            if (aVar2 != null) {
                aVar2.C(aVar, true);
            }
        }

        public void J(a aVar, a aVar2) {
            com.badlogic.gdx.utils.a<a> aVar3 = this.f13472c;
            if (aVar3 == null) {
                throw new GdxRuntimeException("Element has no children: " + this.f13470a);
            }
            if (aVar3.E(aVar, true, aVar2)) {
                return;
            }
            throw new GdxRuntimeException("Element '" + this.f13470a + "' does not contain child: " + aVar);
        }

        public void K(String str, String str2) {
            if (this.f13471b == null) {
                this.f13471b = new l<>(8);
            }
            this.f13471b.r(str, str2);
        }

        public void L(String str) {
            this.f13473d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public String M(String str) {
            String str2;
            y0 y0Var = new y0(128);
            y0Var.O(str);
            y0Var.append(u0.f91709e);
            y0Var.O(this.f13470a);
            l<String, String> lVar = this.f13471b;
            if (lVar != null) {
                l.a<String, String> it = lVar.g().iterator();
                while (it.hasNext()) {
                    l.b next = it.next();
                    y0Var.append(' ');
                    y0Var.O((String) next.f13394a);
                    y0Var.O("=\"");
                    y0Var.O((String) next.f13395b);
                    y0Var.append('\"');
                }
            }
            if (this.f13472c == null && ((str2 = this.f13473d) == null || str2.length() == 0)) {
                y0Var.O("/>");
            } else {
                y0Var.O(">\n");
                String str3 = str + '\t';
                String str4 = this.f13473d;
                if (str4 != null && str4.length() > 0) {
                    y0Var.O(str3);
                    y0Var.O(this.f13473d);
                    y0Var.append('\n');
                }
                com.badlogic.gdx.utils.a<a> aVar = this.f13472c;
                if (aVar != null) {
                    a.b<a> it2 = aVar.iterator();
                    while (it2.hasNext()) {
                        y0Var.O(it2.next().M(str3));
                        y0Var.append('\n');
                    }
                }
                y0Var.O(str);
                y0Var.O("</");
                y0Var.O(this.f13470a);
                y0Var.append(u0.f91710f);
            }
            return y0Var.toString();
        }

        public void a(a aVar) {
            if (this.f13472c == null) {
                this.f13472c = new com.badlogic.gdx.utils.a<>(8);
            }
            this.f13472c.a(aVar);
        }

        public String b(String str) {
            String c11 = c(str, null);
            if (c11 != null) {
                return c11;
            }
            throw new GdxRuntimeException("Element " + this.f13470a + " doesn't have attribute or child: " + str);
        }

        public String c(String str, String str2) {
            String C;
            String k11;
            l<String, String> lVar = this.f13471b;
            if (lVar != null && (k11 = lVar.k(str)) != null) {
                return k11;
            }
            a l11 = l(str);
            return (l11 == null || (C = l11.C()) == null) ? str2 : C;
        }

        public String d(String str) {
            l<String, String> lVar = this.f13471b;
            if (lVar == null) {
                throw new GdxRuntimeException("Element " + this.f13470a + " doesn't have attribute: " + str);
            }
            String k11 = lVar.k(str);
            if (k11 != null) {
                return k11;
            }
            throw new GdxRuntimeException("Element " + this.f13470a + " doesn't have attribute: " + str);
        }

        public String e(String str, String str2) {
            String k11;
            l<String, String> lVar = this.f13471b;
            return (lVar == null || (k11 = lVar.k(str)) == null) ? str2 : k11;
        }

        public l<String, String> f() {
            return this.f13471b;
        }

        public boolean g(String str) {
            String c11 = c(str, null);
            if (c11 != null) {
                return Boolean.parseBoolean(c11);
            }
            throw new GdxRuntimeException("Element " + this.f13470a + " doesn't have attribute or child: " + str);
        }

        public boolean h(String str, boolean z11) {
            String c11 = c(str, null);
            return c11 == null ? z11 : Boolean.parseBoolean(c11);
        }

        public boolean i(String str) {
            return Boolean.parseBoolean(d(str));
        }

        public boolean j(String str, boolean z11) {
            String e11 = e(str, null);
            return e11 == null ? z11 : Boolean.parseBoolean(e11);
        }

        public a k(int i11) {
            com.badlogic.gdx.utils.a<a> aVar = this.f13472c;
            if (aVar != null) {
                return aVar.get(i11);
            }
            throw new GdxRuntimeException("Element has no children: " + this.f13470a);
        }

        @d0
        public a l(String str) {
            if (this.f13472c == null) {
                return null;
            }
            int i11 = 0;
            while (true) {
                com.badlogic.gdx.utils.a<a> aVar = this.f13472c;
                if (i11 >= aVar.f13179b) {
                    return null;
                }
                a aVar2 = aVar.get(i11);
                if (aVar2.f13470a.equals(str)) {
                    return aVar2;
                }
                i11++;
            }
        }

        @d0
        public a m(String str) {
            if (this.f13472c == null) {
                return null;
            }
            int i11 = 0;
            while (true) {
                com.badlogic.gdx.utils.a<a> aVar = this.f13472c;
                if (i11 >= aVar.f13179b) {
                    return null;
                }
                a aVar2 = aVar.get(i11);
                if (aVar2.f13470a.equals(str)) {
                    return aVar2;
                }
                a m11 = aVar2.m(str);
                if (m11 != null) {
                    return m11;
                }
                i11++;
            }
        }

        public int n() {
            com.badlogic.gdx.utils.a<a> aVar = this.f13472c;
            if (aVar == null) {
                return 0;
            }
            return aVar.f13179b;
        }

        public com.badlogic.gdx.utils.a<a> o() {
            return this.f13472c;
        }

        public com.badlogic.gdx.utils.a<a> p(String str) {
            com.badlogic.gdx.utils.a<a> aVar = new com.badlogic.gdx.utils.a<>();
            if (this.f13472c != null) {
                int i11 = 0;
                while (true) {
                    com.badlogic.gdx.utils.a<a> aVar2 = this.f13472c;
                    if (i11 >= aVar2.f13179b) {
                        break;
                    }
                    a aVar3 = aVar2.get(i11);
                    if (aVar3.f13470a.equals(str)) {
                        aVar.a(aVar3);
                    }
                    i11++;
                }
            }
            return aVar;
        }

        public com.badlogic.gdx.utils.a<a> q(String str) {
            com.badlogic.gdx.utils.a<a> aVar = new com.badlogic.gdx.utils.a<>();
            r(str, aVar);
            return aVar;
        }

        public final void r(String str, com.badlogic.gdx.utils.a<a> aVar) {
            if (this.f13472c == null) {
                return;
            }
            int i11 = 0;
            while (true) {
                com.badlogic.gdx.utils.a<a> aVar2 = this.f13472c;
                if (i11 >= aVar2.f13179b) {
                    return;
                }
                a aVar3 = aVar2.get(i11);
                if (aVar3.f13470a.equals(str)) {
                    aVar.a(aVar3);
                }
                aVar3.r(str, aVar);
                i11++;
            }
        }

        public float s(String str) {
            String c11 = c(str, null);
            if (c11 != null) {
                return Float.parseFloat(c11);
            }
            throw new GdxRuntimeException("Element " + this.f13470a + " doesn't have attribute or child: " + str);
        }

        public float t(String str, float f11) {
            String c11 = c(str, null);
            return c11 == null ? f11 : Float.parseFloat(c11);
        }

        public String toString() {
            return M("");
        }

        public float u(String str) {
            return Float.parseFloat(d(str));
        }

        public float v(String str, float f11) {
            String e11 = e(str, null);
            return e11 == null ? f11 : Float.parseFloat(e11);
        }

        public int w(String str) {
            String c11 = c(str, null);
            if (c11 != null) {
                return Integer.parseInt(c11);
            }
            throw new GdxRuntimeException("Element " + this.f13470a + " doesn't have attribute or child: " + str);
        }

        public int x(String str, int i11) {
            String c11 = c(str, null);
            return c11 == null ? i11 : Integer.parseInt(c11);
        }

        public int y(String str) {
            return Integer.parseInt(d(str));
        }

        public int z(String str, int i11) {
            String e11 = e(str, null);
            return e11 == null ? i11 : Integer.parseInt(e11);
        }
    }

    public static byte[] d() {
        return new byte[]{0, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 2, 1, 4, 2, 2, 4, 2, 6, 7, 2, 6, 8, 3, 0, 6, 7};
    }

    public static short[] e() {
        return new short[]{0, 0, 4, 9, 14, 20, 26, 30, 35, 37, 39, 44, 48, 52, 54, 56, 60, 62, 67, 72, 78, 84, 88, 93, 95, 97, 102, 106, 110, 112, 116, 118, 120, 122, 124, 127};
    }

    public static byte[] f() {
        return new byte[]{0, 2, 0, 1, 2, 1, 1, 2, 3, 5, 6, 7, 5, 4, 9, 10, 1, 11, 9, 8, 13, 1, 14, 1, 13, 12, 15, 16, 15, 1, 16, 17, ho.c.f59556u, 16, 1, 20, 19, ho.c.f59561z, ho.c.f59560y, 9, 10, 11, 9, 1, ho.c.A, ho.c.B, ho.c.A, 1, ho.c.C, 11, ho.c.C, 1, 20, ho.c.D, ho.c.f59561z, ho.c.E, ho.c.G, ho.c.H, ho.c.G, 28, 32, 31, ho.c.H, 34, 1, ho.c.H, 33, 36, s60.e.f88061c, 38, 36, 35, 40, 41, 1, 42, 40, 39, 44, 1, a0.f68904b, 1, 44, 43, 46, 47, 46, 1, 47, 48, 49, 47, 1, 51, 50, 53, 52, 40, 41, 42, 40, 1, 54, 55, 54, 1, 56, 42, 56, 1, 57, 1, 57, 34, 57, 1, 1, 58, 59, 58, 51, 60, 53, 61, 62, 62, 1, 1, 0};
    }

    public static byte[] g() {
        return new byte[]{0, 0, 4, 9, 14, 20, ho.c.D, ho.c.H, 35, 36, s60.e.f88061c, 42, 46, 50, 51, 52, 56, 57, 62, 67, 73, 79, 83, 88, 89, 90, s60.b.f88049h, 99, 103, 104, 108, 109, 110, 111, 112, 115};
    }

    public static byte[] h() {
        return new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0};
    }

    public static byte[] i() {
        return new byte[]{0, 2, 3, 3, 4, 4, 2, 3, 1, 1, 3, 2, 2, 1, 1, 2, 1, 3, 3, 4, 4, 2, 3, 1, 1, 3, 2, 2, 1, 2, 1, 1, 1, 1, 1, 0};
    }

    public static byte[] j() {
        return new byte[]{0, 0, 0, 1, 0, 3, 3, 13, 1, 0, 0, 9, 0, 11, 11, 0, 0, 0, 0, 1, ho.c.C, 0, 19, 5, 16, 0, 1, 0, 1, 0, 0, 0, ho.c.f59561z, 1, 0, 0, 3, 3, 13, 1, 0, 0, 9, 0, 11, 11, 0, 0, 0, 0, 1, ho.c.C, 0, 19, 5, 16, 0, 0, 0, 7, 1, 0, 0};
    }

    public static char[] k() {
        return new char[]{' ', u0.f91709e, '\t', '\r', ' ', '/', u0.f91710f, '\t', '\r', ' ', '/', u0.f91710f, '\t', '\r', ' ', '/', '=', u0.f91710f, '\t', '\r', ' ', '/', '=', u0.f91710f, '\t', '\r', ' ', '=', '\t', '\r', ' ', '\"', '\'', '\t', '\r', '\"', '\"', ' ', '/', u0.f91710f, '\t', '\r', ' ', u0.f91710f, '\t', '\r', ' ', u0.f91710f, '\t', '\r', '\'', '\'', ' ', u0.f91709e, '\t', '\r', u0.f91709e, ' ', '/', u0.f91710f, '\t', '\r', ' ', '/', u0.f91710f, '\t', '\r', ' ', '/', '=', u0.f91710f, '\t', '\r', ' ', '/', '=', u0.f91710f, '\t', '\r', ' ', '=', '\t', '\r', ' ', '\"', '\'', '\t', '\r', '\"', '\"', ' ', '/', u0.f91710f, '\t', '\r', ' ', u0.f91710f, '\t', '\r', ' ', u0.f91710f, '\t', '\r', u0.f91709e, ' ', '/', '\t', '\r', u0.f91710f, u0.f91710f, '\'', '\'', ' ', '\t', '\r', 0};
    }

    public static byte[] l() {
        return new byte[]{1, 0, 2, 3, 3, 4, 11, 34, 5, 4, 11, 34, 5, 6, 7, 6, 7, 8, 13, 9, 10, 9, 10, 12, 34, 12, 14, 14, 16, 15, 17, 16, 17, ho.c.f59556u, ho.c.H, ho.c.f59556u, 19, ho.c.D, 28, 20, 19, ho.c.D, 28, 20, ho.c.f59560y, ho.c.f59561z, ho.c.f59560y, ho.c.f59561z, ho.c.A, 32, ho.c.B, ho.c.C, ho.c.B, ho.c.C, ho.c.E, 28, ho.c.E, ho.c.G, 31, 35, 33, 33, 34};
    }

    public void a(String str, String str2) {
        this.f13467c.K(str, str2);
    }

    public void b() {
        this.f13466b = this.f13465a.pop();
        com.badlogic.gdx.utils.a<a> aVar = this.f13465a;
        this.f13467c = aVar.f13179b > 0 ? aVar.peek() : null;
    }

    @d0
    public String c(String str) {
        if (str.equals("lt")) {
            return "<";
        }
        if (str.equals("gt")) {
            return ">";
        }
        if (str.equals("amp")) {
            return "&";
        }
        if (str.equals("apos")) {
            return "'";
        }
        if (str.equals("quot")) {
            return "\"";
        }
        if (str.startsWith("#x")) {
            return Character.toString((char) Integer.parseInt(str.substring(2), 16));
        }
        return null;
    }

    public void m(String str) {
        a aVar = new a(str, this.f13467c);
        a aVar2 = this.f13467c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        this.f13465a.a(aVar);
        this.f13467c = aVar;
    }

    public a n(InputStream inputStream) {
        try {
            try {
                return o(new InputStreamReader(inputStream, "UTF-8"));
            } catch (IOException e11) {
                throw new SerializationException(e11);
            }
        } finally {
            x0.a(inputStream);
        }
    }

    public a o(Reader reader) {
        try {
            try {
                char[] cArr = new char[1024];
                int i11 = 0;
                while (true) {
                    int read = reader.read(cArr, i11, cArr.length - i11);
                    if (read == -1) {
                        return r(cArr, 0, i11);
                    }
                    if (read == 0) {
                        char[] cArr2 = new char[cArr.length * 2];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        cArr = cArr2;
                    } else {
                        i11 += read;
                    }
                }
            } catch (IOException e11) {
                throw new SerializationException(e11);
            }
        } finally {
            x0.a(reader);
        }
    }

    public a p(String str) {
        char[] charArray = str.toCharArray();
        return r(charArray, 0, charArray.length);
    }

    public a q(v1.a aVar) {
        try {
            return o(aVar.N("UTF-8"));
        } catch (Exception e11) {
            throw new SerializationException("Error parsing file: " + aVar, e11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x021c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Type inference failed for: r16v3, types: [int] */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    /* JADX WARN: Type inference failed for: r16v6, types: [int] */
    /* JADX WARN: Type inference failed for: r16v7, types: [int] */
    /* JADX WARN: Type inference failed for: r18v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.badlogic.gdx.utils.t.a r(char[] r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.t.r(char[], int, int):com.badlogic.gdx.utils.t$a");
    }

    public void s(String str) {
        String C = this.f13467c.C();
        a aVar = this.f13467c;
        if (C != null) {
            str = C + str;
        }
        aVar.L(str);
    }
}
