package l70;

import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.v;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class e implements n {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final e f70683a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final e f70684b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final String f70685c = " ;,:@()<>\\\"/[]?={}\t";

    /* renamed from: d, reason: collision with root package name */
    public static final String f70686d = "\"\\";

    public static String j(org.apache.http.f[] fVarArr, boolean z11, n nVar) {
        if (nVar == null) {
            nVar = f70684b;
        }
        return nVar.b(null, fVarArr, z11).toString();
    }

    public static String k(org.apache.http.f fVar, boolean z11, n nVar) {
        if (nVar == null) {
            nVar = f70684b;
        }
        return nVar.d(null, fVar, z11).toString();
    }

    public static String l(v vVar, boolean z11, n nVar) {
        if (nVar == null) {
            nVar = f70684b;
        }
        return nVar.c(null, vVar, z11).toString();
    }

    public static String m(v[] vVarArr, boolean z11, n nVar) {
        if (nVar == null) {
            nVar = f70684b;
        }
        return nVar.a(null, vVarArr, z11).toString();
    }

    @Override // l70.n
    public CharArrayBuffer a(CharArrayBuffer charArrayBuffer, v[] vVarArr, boolean z11) {
        e80.a.j(vVarArr, "Header parameter array");
        int i11 = i(vVarArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(i11);
        } else {
            charArrayBuffer.ensureCapacity(i11);
        }
        for (int i12 = 0; i12 < vVarArr.length; i12++) {
            if (i12 > 0) {
                charArrayBuffer.append("; ");
            }
            c(charArrayBuffer, vVarArr[i12], z11);
        }
        return charArrayBuffer;
    }

    @Override // l70.n
    public CharArrayBuffer b(CharArrayBuffer charArrayBuffer, org.apache.http.f[] fVarArr, boolean z11) {
        e80.a.j(fVarArr, "Header element array");
        int f11 = f(fVarArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(f11);
        } else {
            charArrayBuffer.ensureCapacity(f11);
        }
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            if (i11 > 0) {
                charArrayBuffer.append(j2.O);
            }
            d(charArrayBuffer, fVarArr[i11], z11);
        }
        return charArrayBuffer;
    }

    @Override // l70.n
    public CharArrayBuffer c(CharArrayBuffer charArrayBuffer, v vVar, boolean z11) {
        e80.a.j(vVar, "Name / value pair");
        int h11 = h(vVar);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(h11);
        } else {
            charArrayBuffer.ensureCapacity(h11);
        }
        charArrayBuffer.append(vVar.getName());
        String value = vVar.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            e(charArrayBuffer, value, z11);
        }
        return charArrayBuffer;
    }

    @Override // l70.n
    public CharArrayBuffer d(CharArrayBuffer charArrayBuffer, org.apache.http.f fVar, boolean z11) {
        e80.a.j(fVar, "Header element");
        int g11 = g(fVar);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(g11);
        } else {
            charArrayBuffer.ensureCapacity(g11);
        }
        charArrayBuffer.append(fVar.getName());
        String value = fVar.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            e(charArrayBuffer, value, z11);
        }
        int parameterCount = fVar.getParameterCount();
        if (parameterCount > 0) {
            for (int i11 = 0; i11 < parameterCount; i11++) {
                charArrayBuffer.append("; ");
                c(charArrayBuffer, fVar.a(i11), z11);
            }
        }
        return charArrayBuffer;
    }

    public void e(CharArrayBuffer charArrayBuffer, String str, boolean z11) {
        if (!z11) {
            for (int i11 = 0; i11 < str.length() && !z11; i11++) {
                z11 = n(str.charAt(i11));
            }
        }
        if (z11) {
            charArrayBuffer.append('\"');
        }
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (o(charAt)) {
                charArrayBuffer.append('\\');
            }
            charArrayBuffer.append(charAt);
        }
        if (z11) {
            charArrayBuffer.append('\"');
        }
    }

    public int f(org.apache.http.f[] fVarArr) {
        if (fVarArr == null || fVarArr.length < 1) {
            return 0;
        }
        int length = (fVarArr.length - 1) * 2;
        for (org.apache.http.f fVar : fVarArr) {
            length += g(fVar);
        }
        return length;
    }

    public int g(org.apache.http.f fVar) {
        if (fVar == null) {
            return 0;
        }
        int length = fVar.getName().length();
        String value = fVar.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        int parameterCount = fVar.getParameterCount();
        if (parameterCount > 0) {
            for (int i11 = 0; i11 < parameterCount; i11++) {
                length += h(fVar.a(i11)) + 2;
            }
        }
        return length;
    }

    public int h(v vVar) {
        if (vVar == null) {
            return 0;
        }
        int length = vVar.getName().length();
        String value = vVar.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    public int i(v[] vVarArr) {
        if (vVarArr == null || vVarArr.length < 1) {
            return 0;
        }
        int length = (vVarArr.length - 1) * 2;
        for (v vVar : vVarArr) {
            length += h(vVar);
        }
        return length;
    }

    public boolean n(char c11) {
        return f70685c.indexOf(c11) >= 0;
    }

    public boolean o(char c11) {
        return f70686d.indexOf(c11) >= 0;
    }
}
