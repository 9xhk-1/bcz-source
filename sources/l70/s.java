package l70;

import java.util.BitSet;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final char f70722a = '\r';

    /* renamed from: b, reason: collision with root package name */
    public static final char f70723b = '\n';

    /* renamed from: c, reason: collision with root package name */
    public static final char f70724c = ' ';

    /* renamed from: d, reason: collision with root package name */
    public static final char f70725d = '\t';

    /* renamed from: e, reason: collision with root package name */
    public static final char f70726e = '\"';

    /* renamed from: f, reason: collision with root package name */
    public static final char f70727f = '\\';

    /* renamed from: g, reason: collision with root package name */
    public static final s f70728g = new s();

    public static BitSet a(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i11 : iArr) {
            bitSet.set(i11);
        }
        return bitSet;
    }

    public static boolean e(char c11) {
        return c11 == ' ' || c11 == '\t' || c11 == '\r' || c11 == '\n';
    }

    public void b(CharArrayBuffer charArrayBuffer, r rVar, BitSet bitSet, StringBuilder sb2) {
        int c11 = rVar.c();
        int d11 = rVar.d();
        for (int c12 = rVar.c(); c12 < d11; c12++) {
            char charAt = charArrayBuffer.charAt(c12);
            if ((bitSet != null && bitSet.get(charAt)) || e(charAt)) {
                break;
            }
            c11++;
            sb2.append(charAt);
        }
        rVar.e(c11);
    }

    public void c(CharArrayBuffer charArrayBuffer, r rVar, StringBuilder sb2) {
        if (rVar.a()) {
            return;
        }
        int c11 = rVar.c();
        int c12 = rVar.c();
        int d11 = rVar.d();
        if (charArrayBuffer.charAt(c11) != '\"') {
            return;
        }
        int i11 = c11 + 1;
        int i12 = c12 + 1;
        boolean z11 = false;
        while (true) {
            if (i12 >= d11) {
                break;
            }
            char charAt = charArrayBuffer.charAt(i12);
            if (z11) {
                if (charAt != '\"' && charAt != '\\') {
                    sb2.append('\\');
                }
                sb2.append(charAt);
                z11 = false;
            } else if (charAt == '\"') {
                i11++;
                break;
            } else if (charAt == '\\') {
                z11 = true;
            } else if (charAt != '\r' && charAt != '\n') {
                sb2.append(charAt);
            }
            i12++;
            i11++;
        }
        rVar.e(i11);
    }

    public void d(CharArrayBuffer charArrayBuffer, r rVar, BitSet bitSet, StringBuilder sb2) {
        int c11 = rVar.c();
        int d11 = rVar.d();
        for (int c12 = rVar.c(); c12 < d11; c12++) {
            char charAt = charArrayBuffer.charAt(c12);
            if ((bitSet != null && bitSet.get(charAt)) || e(charAt) || charAt == '\"') {
                break;
            }
            c11++;
            sb2.append(charAt);
        }
        rVar.e(c11);
    }

    public String f(CharArrayBuffer charArrayBuffer, r rVar, BitSet bitSet) {
        StringBuilder sb2 = new StringBuilder();
        loop0: while (true) {
            boolean z11 = false;
            while (!rVar.a()) {
                char charAt = charArrayBuffer.charAt(rVar.c());
                if (bitSet != null && bitSet.get(charAt)) {
                    break loop0;
                }
                if (e(charAt)) {
                    h(charArrayBuffer, rVar);
                    z11 = true;
                } else {
                    if (z11 && sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    b(charArrayBuffer, rVar, bitSet, sb2);
                }
            }
            break loop0;
        }
        return sb2.toString();
    }

    public String g(CharArrayBuffer charArrayBuffer, r rVar, BitSet bitSet) {
        StringBuilder sb2 = new StringBuilder();
        loop0: while (true) {
            boolean z11 = false;
            while (!rVar.a()) {
                char charAt = charArrayBuffer.charAt(rVar.c());
                if (bitSet != null && bitSet.get(charAt)) {
                    break loop0;
                }
                if (e(charAt)) {
                    h(charArrayBuffer, rVar);
                    z11 = true;
                } else if (charAt == '\"') {
                    if (z11 && sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    c(charArrayBuffer, rVar, sb2);
                } else {
                    if (z11 && sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    d(charArrayBuffer, rVar, bitSet, sb2);
                }
            }
            break loop0;
        }
        return sb2.toString();
    }

    public void h(CharArrayBuffer charArrayBuffer, r rVar) {
        int c11 = rVar.c();
        int d11 = rVar.d();
        for (int c12 = rVar.c(); c12 < d11 && e(charArrayBuffer.charAt(c12)); c12++) {
            c11++;
        }
        rVar.e(c11);
    }
}
