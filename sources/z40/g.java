package z40;

import g10.l;
import g10.u;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import u30.f0;
import yz.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    public static /* synthetic */ boolean A(c cVar, int i11, byte[] bArr, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = bArr.length - i12;
        }
        return y(cVar, i11, bArr, i12, i13);
    }

    public static final boolean B(@k c cVar, @k c byteString) {
        g0.p(cVar, "<this>");
        g0.p(byteString, "byteString");
        if (byteString.g() > cVar.g()) {
            return false;
        }
        return byteString.g() == cVar.g() ? cVar.equals(byteString) : z(cVar, 0, byteString, 0, 0, 12, null);
    }

    public static final boolean C(@k c cVar, @k byte[] byteArray) {
        g0.p(cVar, "<this>");
        g0.p(byteArray, "byteArray");
        if (byteArray.length > cVar.g()) {
            return false;
        }
        return A(cVar, 0, byteArray, 0, 0, 12, null);
    }

    @k
    public static final c a() {
        return c.f100824c.a();
    }

    @k
    public static final c b(@k byte... bytes) {
        g0.p(bytes, "bytes");
        return bytes.length == 0 ? c.f100824c.a() : c.f100824c.b(bytes);
    }

    @k
    public static final c c(@k byte... bytes) {
        g0.p(bytes, "bytes");
        return p1.s(bytes) ? c.f100824c.a() : c.f100824c.b(bytes);
    }

    public static final boolean d(@k c cVar, @k byte[] array) {
        g0.p(cVar, "<this>");
        g0.p(array, "array");
        return Arrays.equals(cVar.f(), array);
    }

    @k
    public static final String e(@k c cVar) {
        g0.p(cVar, "<this>");
        return f0.U1(cVar.f());
    }

    @k
    public static final c f(@k String str) {
        g0.p(str, "<this>");
        return c.f100824c.b(f0.X1(str));
    }

    public static final boolean g(@k c cVar, @k c byteString) {
        g0.p(cVar, "<this>");
        g0.p(byteString, "byteString");
        if (byteString.g() > cVar.g()) {
            return false;
        }
        return byteString.g() == cVar.g() ? cVar.equals(byteString) : z(cVar, cVar.g() - byteString.g(), byteString, 0, 0, 12, null);
    }

    public static final boolean h(@k c cVar, @k byte[] byteArray) {
        g0.p(cVar, "<this>");
        g0.p(byteArray, "byteArray");
        if (byteArray.length > cVar.g()) {
            return false;
        }
        return A(cVar, cVar.g() - byteArray.length, byteArray, 0, 0, 12, null);
    }

    @k
    public static final l i(@k c cVar) {
        g0.p(cVar, "<this>");
        return u.W1(0, cVar.g());
    }

    public static final int j(@k c cVar, byte b11, int i11) {
        g0.p(cVar, "<this>");
        byte[] f11 = cVar.f();
        int g11 = cVar.g();
        for (int max = Math.max(i11, 0); max < g11; max++) {
            if (f11[max] == b11) {
                return max;
            }
        }
        return -1;
    }

    public static final int k(@k c cVar, @k c byteString, int i11) {
        c cVar2;
        c cVar3;
        g0.p(cVar, "<this>");
        g0.p(byteString, "byteString");
        if (p(byteString)) {
            return Math.max(Math.min(i11, cVar.g()), 0);
        }
        byte[] f11 = cVar.f();
        byte e11 = byteString.e(0);
        int max = Math.max(i11, 0);
        int g11 = cVar.g() - byteString.g();
        if (max > g11) {
            return -1;
        }
        int i12 = max;
        while (true) {
            if (f11[i12] == e11) {
                cVar2 = cVar;
                cVar3 = byteString;
                if (z(cVar2, i12, cVar3, 0, 0, 12, null)) {
                    return i12;
                }
            } else {
                cVar2 = cVar;
                cVar3 = byteString;
            }
            if (i12 == g11) {
                return -1;
            }
            i12++;
            cVar = cVar2;
            byteString = cVar3;
        }
    }

    public static final int l(@k c cVar, @k byte[] byteArray, int i11) {
        c cVar2;
        byte[] bArr;
        g0.p(cVar, "<this>");
        g0.p(byteArray, "byteArray");
        if (byteArray.length == 0) {
            return Math.max(Math.min(i11, cVar.g()), 0);
        }
        byte[] f11 = cVar.f();
        byte b11 = byteArray[0];
        int max = Math.max(0, i11);
        int g11 = cVar.g() - byteArray.length;
        if (max > g11) {
            return -1;
        }
        int i12 = max;
        while (true) {
            if (f11[i12] == b11) {
                cVar2 = cVar;
                bArr = byteArray;
                if (A(cVar2, i12, bArr, 0, 0, 12, null)) {
                    return i12;
                }
            } else {
                cVar2 = cVar;
                bArr = byteArray;
            }
            if (i12 == g11) {
                return -1;
            }
            i12++;
            cVar = cVar2;
            byteArray = bArr;
        }
    }

    public static /* synthetic */ int m(c cVar, byte b11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return j(cVar, b11, i11);
    }

    public static /* synthetic */ int n(c cVar, c cVar2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return k(cVar, cVar2, i11);
    }

    public static /* synthetic */ int o(c cVar, byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return l(cVar, bArr, i11);
    }

    public static final boolean p(@k c cVar) {
        g0.p(cVar, "<this>");
        return cVar.g() == 0;
    }

    public static final boolean q(@k c cVar) {
        g0.p(cVar, "<this>");
        return !p(cVar);
    }

    public static final int r(@k c cVar, byte b11, int i11) {
        g0.p(cVar, "<this>");
        byte[] f11 = cVar.f();
        int g11 = cVar.g() - 1;
        int max = Math.max(0, i11);
        if (max > g11) {
            return -1;
        }
        while (f11[g11] != b11) {
            if (g11 == max) {
                return -1;
            }
            g11--;
        }
        return g11;
    }

    public static final int s(@k c cVar, @k c byteString, int i11) {
        g0.p(cVar, "<this>");
        g0.p(byteString, "byteString");
        if (p(byteString)) {
            return cVar.g();
        }
        int g11 = cVar.g() - byteString.g();
        int max = Math.max(0, i11);
        if (max > g11) {
            return -1;
        }
        int i12 = g11;
        while (true) {
            c cVar2 = cVar;
            c cVar3 = byteString;
            if (z(cVar2, i12, cVar3, 0, 0, 8, null)) {
                return i12;
            }
            if (i12 == max) {
                return -1;
            }
            i12--;
            cVar = cVar2;
            byteString = cVar3;
        }
    }

    public static final int t(@k c cVar, @k byte[] byteArray, int i11) {
        g0.p(cVar, "<this>");
        g0.p(byteArray, "byteArray");
        if (byteArray.length == 0) {
            return cVar.g();
        }
        int g11 = cVar.g() - byteArray.length;
        int max = Math.max(0, i11);
        if (max > g11) {
            return -1;
        }
        int i12 = g11;
        while (true) {
            c cVar2 = cVar;
            byte[] bArr = byteArray;
            if (A(cVar2, i12, bArr, 0, 0, 8, null)) {
                return i12;
            }
            if (i12 == max) {
                return -1;
            }
            i12--;
            cVar = cVar2;
            byteArray = bArr;
        }
    }

    public static /* synthetic */ int u(c cVar, byte b11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return r(cVar, b11, i11);
    }

    public static /* synthetic */ int v(c cVar, c cVar2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return s(cVar, cVar2, i11);
    }

    public static /* synthetic */ int w(c cVar, byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return t(cVar, bArr, i11);
    }

    public static final boolean x(c cVar, int i11, c cVar2, int i12, int i13) {
        byte[] f11 = cVar.f();
        byte[] f12 = cVar2.f();
        for (int i14 = 0; i14 < i13; i14++) {
            if (f11[i11 + i14] != f12[i12 + i14]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean y(c cVar, int i11, byte[] bArr, int i12, int i13) {
        byte[] f11 = cVar.f();
        for (int i14 = 0; i14 < i13; i14++) {
            if (f11[i11 + i14] != bArr[i12 + i14]) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean z(c cVar, int i11, c cVar2, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = cVar2.g() - i12;
        }
        return x(cVar, i11, cVar2, i12, i13);
    }
}
