package h80;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b {
    public static final int A = 5;
    public static final int B = 6;
    public static final int C = 7;

    /* renamed from: b, reason: collision with root package name */
    public static final int f59013b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f59014c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f59015d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f59016e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f59017f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f59018g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f59019h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f59020i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f59021j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f59022k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f59023l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f59024m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f59025n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static final int f59026o = 8;

    /* renamed from: p, reason: collision with root package name */
    public static final int f59027p = 21;

    /* renamed from: q, reason: collision with root package name */
    public static final int f59028q = 22;

    /* renamed from: r, reason: collision with root package name */
    public static final int f59029r = 24;

    /* renamed from: s, reason: collision with root package name */
    public static final int f59030s = 25;

    /* renamed from: t, reason: collision with root package name */
    public static final int f59031t = 27;

    /* renamed from: u, reason: collision with root package name */
    public static final int f59032u = 28;

    /* renamed from: v, reason: collision with root package name */
    public static final int f59033v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f59034w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f59035x = 2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f59036y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f59037z = 4;

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f59038a;

    public b(OutputStream outputStream) {
        this.f59038a = outputStream;
    }

    public void E(int i11) throws IOException {
        F(i11, false);
    }

    public void I(int i11) throws IOException {
        J(i11, false);
    }

    public int a(Iterator<Object> it) throws IOException {
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                return ((Integer) next).intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public final int b(ArrayList<Object> arrayList, int i11) {
        if (arrayList.size() <= i11) {
            throw new IllegalArgumentException();
        }
        Object obj = arrayList.get(i11);
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        if (obj.getClass().equals(Integer.class)) {
            return ((Integer) obj).intValue();
        }
        throw new IllegalArgumentException();
    }

    public final int c(ArrayList<Object> arrayList, int i11, int i12) {
        Object obj;
        return (arrayList.size() <= i11 || (obj = arrayList.get(i11)) == null) ? i12 : ((Integer) obj).intValue();
    }

    public void f(String str) {
        e(str);
        g(str);
    }

    public boolean i(ArrayList<Object> arrayList) {
        h(b(arrayList, 0), ((Character) arrayList.get(1)).charValue());
        return true;
    }

    public void k(int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            this.f59038a.write(10);
        }
    }

    public void m(int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            this.f59038a.write(32);
        }
    }

    public boolean w(ArrayList<Object> arrayList, int i11) throws IOException {
        try {
            if (i11 == 83) {
                C(c(arrayList, 0, 1));
                return true;
            }
            if (i11 == 84) {
                B(c(arrayList, 0, 1));
                return true;
            }
            if (i11 != 102) {
                if (i11 == 109) {
                    Iterator<Object> it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null && next.getClass() != Integer.class) {
                            throw new IllegalArgumentException();
                        }
                    }
                    Iterator<Object> it2 = arrayList.iterator();
                    int i12 = 0;
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next2 != null) {
                            i12++;
                            int intValue = ((Integer) next2).intValue();
                            if (30 <= intValue && intValue <= 37) {
                                I(intValue - 30);
                            } else if (40 <= intValue && intValue <= 47) {
                                E(intValue - 40);
                            } else if (90 <= intValue && intValue <= 97) {
                                J(intValue - 90, true);
                            } else if (100 > intValue || intValue > 107) {
                                if (intValue != 38 && intValue != 48) {
                                    if (intValue == 0) {
                                        d();
                                    } else if (intValue == 39) {
                                        s();
                                    } else if (intValue != 49) {
                                        D(intValue);
                                    } else {
                                        r();
                                    }
                                }
                                if (it2.hasNext()) {
                                    int a11 = a(it2);
                                    if (a11 == 2) {
                                        int a12 = a(it2);
                                        int a13 = a(it2);
                                        int a14 = a(it2);
                                        if (a12 < 0 || a12 > 255 || a13 < 0 || a13 > 255 || a14 < 0 || a14 > 255) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (intValue == 38) {
                                            L(a12, a13, a14);
                                        } else {
                                            H(a12, a13, a14);
                                        }
                                    } else {
                                        if (a11 != 5) {
                                            throw new IllegalArgumentException();
                                        }
                                        int a15 = a(it2);
                                        if (a15 < 0 || a15 > 255) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (intValue == 38) {
                                            K(a15);
                                        } else {
                                            G(a15);
                                        }
                                    }
                                }
                            } else {
                                F(intValue - 100, true);
                            }
                        }
                    }
                    if (i12 == 0) {
                        d();
                    }
                    return true;
                }
                if (i11 == 115) {
                    A();
                    return true;
                }
                if (i11 == 117) {
                    z();
                    return true;
                }
                switch (i11) {
                    case 65:
                        p(c(arrayList, 0, 1));
                        return true;
                    case 66:
                        j(c(arrayList, 0, 1));
                        return true;
                    case 67:
                        m(c(arrayList, 0, 1));
                        return true;
                    case 68:
                        l(c(arrayList, 0, 1));
                        return true;
                    case 69:
                        k(c(arrayList, 0, 1));
                        return true;
                    case 70:
                        q(c(arrayList, 0, 1));
                        return true;
                    case 71:
                        o(b(arrayList, 0));
                        return true;
                    case 72:
                        break;
                    default:
                        switch (i11) {
                            case 74:
                                v(c(arrayList, 0, 0));
                                return true;
                            case 75:
                                u(c(arrayList, 0, 0));
                                return true;
                            case 76:
                                x(c(arrayList, 0, 1));
                                return true;
                            case 77:
                                t(c(arrayList, 0, 1));
                                return true;
                            default:
                                if (97 <= i11 && i11 <= 122) {
                                    M(arrayList, i11);
                                    return true;
                                }
                                if (65 > i11 || i11 > 90) {
                                    return false;
                                }
                                M(arrayList, i11);
                                return true;
                        }
                }
            }
            n(c(arrayList, 0, 1), c(arrayList, 1, 1));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean y(ArrayList<Object> arrayList) {
        int b11 = b(arrayList, 0);
        String str = (String) arrayList.get(1);
        try {
            if (b11 == 0) {
                f(str);
                return true;
            }
            if (b11 == 1) {
                e(str);
                return true;
            }
            if (b11 != 2) {
                N(b11, str);
                return true;
            }
            g(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void A() throws IOException {
    }

    public void d() throws IOException {
    }

    public void r() throws IOException {
    }

    public void s() throws IOException {
    }

    public void z() throws IOException {
    }

    public void B(int i11) throws IOException {
    }

    public void C(int i11) throws IOException {
    }

    public void D(int i11) throws IOException {
    }

    public void G(int i11) throws IOException {
    }

    public void K(int i11) throws IOException {
    }

    public void e(String str) {
    }

    public void g(String str) {
    }

    public void j(int i11) throws IOException {
    }

    public void l(int i11) throws IOException {
    }

    public void o(int i11) throws IOException {
    }

    public void p(int i11) throws IOException {
    }

    public void q(int i11) throws IOException {
    }

    public void t(int i11) throws IOException {
    }

    public void u(int i11) throws IOException {
    }

    public void v(int i11) throws IOException {
    }

    public void x(int i11) throws IOException {
    }

    public void F(int i11, boolean z11) throws IOException {
    }

    public void J(int i11, boolean z11) throws IOException {
    }

    public void M(ArrayList<Object> arrayList, int i11) {
    }

    public void N(int i11, String str) {
    }

    public void h(int i11, char c11) {
    }

    public void n(int i11, int i12) throws IOException {
    }

    public void H(int i11, int i12, int i13) throws IOException {
    }

    public void L(int i11, int i12, int i13) throws IOException {
    }
}
