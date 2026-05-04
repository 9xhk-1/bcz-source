package kb0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.junit.jupiter.api.j2;
import org.mozilla.classfile.ClassFileWriter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f66321a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f66322b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f66323c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f66324d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f66325e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f66326f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f66327g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f66328h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f66329i = 8;

    public static final int a(int i11) {
        return ((i11 & 65535) << 8) | 7;
    }

    public static final int b(String str, d dVar) {
        return a(dVar.a(str));
    }

    public static final int c(int i11) {
        return ((i11 & 65535) << 8) | 8;
    }

    public static final int d(String str, d dVar) {
        if (str.length() != 1) {
            return b(str, dVar);
        }
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            return 2;
        }
        if (charAt != 'S' && charAt != 'Z' && charAt != 'I') {
            if (charAt == 'J') {
                return 4;
            }
            switch (charAt) {
                case 'B':
                case 'C':
                    break;
                case 'D':
                    return 3;
                default:
                    throw new IllegalArgumentException("bad type");
            }
        }
        return 1;
    }

    public static Class e(String str) {
        try {
            return Class.forName(str.replace('/', '.'));
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static final int f(int i11) {
        return i11 >>> 8;
    }

    public static final String g(int i11, d dVar) {
        if (h(i11) == 7) {
            return (String) dVar.m(f(i11));
        }
        throw new IllegalArgumentException("expecting object type");
    }

    public static final int h(int i11) {
        return i11 & 255;
    }

    public static boolean i(int i11) {
        return i11 == 3 || i11 == 4;
    }

    public static int j(int i11, int i12, d dVar) {
        int h11 = h(i11);
        int h12 = h(i12);
        boolean z11 = h11 == 7;
        boolean z12 = h12 == 7;
        if (i11 != i12 && (!z11 || i12 != 5)) {
            if (h11 == 0 || h12 == 0) {
                return 0;
            }
            if (i11 != 5 || !z12) {
                if (z11 && z12) {
                    String g11 = g(i11, dVar);
                    String g12 = g(i12, dVar);
                    String str = (String) dVar.m(2);
                    String str2 = (String) dVar.m(4);
                    if (g11.equals(str)) {
                        g11 = str2;
                    }
                    if (g12.equals(str)) {
                        g12 = str2;
                    }
                    Class<?> e11 = e(g11);
                    Class<?> e12 = e(g12);
                    if (!e11.isAssignableFrom(e12)) {
                        if (!e12.isAssignableFrom(e11)) {
                            if (e12.isInterface() || e11.isInterface()) {
                                return b("java/lang/Object", dVar);
                            }
                            for (Class<? super Object> superclass = e12.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
                                if (superclass.isAssignableFrom(e11)) {
                                    return b(ClassFileWriter.u0(superclass.getName()), dVar);
                                }
                            }
                        }
                    }
                }
                throw new IllegalArgumentException("bad merge attempt between " + m(i11, dVar) + " and " + m(i12, dVar));
            }
            return i12;
        }
        return i11;
    }

    public static void k(int[] iArr, int i11, int[] iArr2, int i12, d dVar) {
        System.out.print("locals: ");
        System.out.println(n(iArr, i11, dVar));
        System.out.print("stack: ");
        System.out.println(n(iArr2, i12, dVar));
        System.out.println();
    }

    public static void l(int[] iArr, int[] iArr2, d dVar) {
        k(iArr, iArr.length, iArr2, iArr2.length, dVar);
    }

    public static String m(int i11, d dVar) {
        int h11 = h(i11);
        switch (h11) {
            case 0:
                return "top";
            case 1:
                return "int";
            case 2:
                return TypedValues.Custom.S_FLOAT;
            case 3:
                return "double";
            case 4:
                return "long";
            case 5:
                return "null";
            case 6:
                return "uninitialized_this";
            default:
                if (h11 == 7) {
                    return g(i11, dVar);
                }
                if (h11 == 8) {
                    return "uninitialized";
                }
                throw new IllegalArgumentException("bad type");
        }
    }

    public static String n(int[] iArr, int i11, d dVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            sb2.append(m(iArr[i12], dVar));
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static String o(int[] iArr, d dVar) {
        return n(iArr, iArr.length, dVar);
    }
}
