package a3;

import com.badlogic.gdx.utils.SerializationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1708b = a();

    /* renamed from: c, reason: collision with root package name */
    public static final short[] f1709c = e();

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f1710d = i();

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1711e = g();

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1712f = f();

    /* renamed from: g, reason: collision with root package name */
    public static final short[] f1713g = c();

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1714h = d();

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1715i = j();

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1716j = h();

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f1717k = b();

    /* renamed from: l, reason: collision with root package name */
    public static final int f1718l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f1719m = 35;

    /* renamed from: n, reason: collision with root package name */
    public static final int f1720n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f1721o = 5;

    /* renamed from: p, reason: collision with root package name */
    public static final int f1722p = 23;

    /* renamed from: q, reason: collision with root package name */
    public static final int f1723q = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1724a;

    public static byte[] a() {
        return new byte[]{0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 2, 0, 7, 2, 0, 8, 2, 1, 3, 2, 1, 5};
    }

    public static byte[] b() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
    }

    public static short[] c() {
        return new short[]{0, 0, 11, 14, 16, 19, 28, 34, 40, 43, 54, 62, 70, 79, 81, 90, 93, 96, 105, 108, 111, 113, 116, 119, 130, 138, 146, 157, 159, 170, 173, 176, 187, 190, 193, 196, 201, 206, 207};
    }

    public static byte[] d() {
        return new byte[]{1, 1, 2, 3, 4, 3, 5, 3, 6, 1, 0, 7, 7, 3, 8, 3, 9, 9, 3, 11, 11, 12, 13, 14, 3, 15, 11, 10, 16, 16, 17, ho.c.f59556u, 16, 3, 19, 19, 20, ho.c.f59560y, 19, 3, ho.c.f59561z, ho.c.f59561z, 3, ho.c.f59560y, ho.c.f59560y, ho.c.B, 3, ho.c.C, 3, ho.c.D, 3, ho.c.E, ho.c.f59560y, ho.c.A, 28, ho.c.G, ho.c.G, 28, ho.c.H, 31, 32, 3, 33, 34, 34, 33, 13, 35, 15, 3, 34, 34, 12, 36, s60.e.f88061c, 3, 15, 34, 10, 16, 3, 36, 36, 12, 3, 38, 3, 3, 36, 10, 39, 39, 3, 40, 40, 3, 13, 13, 12, 3, 41, 3, 15, 13, 10, 42, 42, 3, 43, 43, 3, 28, 3, 44, 44, 3, kx.a0.f68904b, kx.a0.f68904b, 3, 47, 47, 48, 49, 50, 3, 51, 52, 53, 47, 46, 54, 55, 55, 54, 56, 57, 58, 3, 59, 60, 60, 59, 49, 61, 52, 3, 60, 60, 48, 62, 63, 3, 51, 52, 53, 60, 46, 54, 3, 62, 62, 48, 3, 64, 3, 51, 3, 53, 62, 46, 65, 65, 3, 66, 66, 3, 49, 49, 48, 3, 67, 3, 51, 52, 53, 49, 46, 68, 68, 3, 69, 69, 3, 70, 70, 3, 8, 8, 71, 8, 3, 72, 72, 73, 72, 3, 3, 3, 0};
    }

    public static short[] e() {
        return new short[]{0, 0, 11, 13, 14, 16, 25, 31, 37, 39, 50, 57, 64, 73, 74, 83, 85, 87, 96, 98, 100, 101, 103, 105, 116, 123, 130, 141, 142, 153, 155, 157, 168, 170, 172, 174, 179, 184, 184};
    }

    public static byte[] f() {
        return new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
    }

    public static byte[] g() {
        return new byte[]{0, 9, 2, 1, 2, 7, 4, 4, 2, 9, 7, 7, 7, 1, 7, 2, 2, 7, 2, 2, 1, 2, 2, 9, 7, 7, 9, 1, 9, 2, 2, 9, 2, 2, 2, 3, 3, 0, 0};
    }

    public static byte[] h() {
        return new byte[]{13, 0, 15, 0, 0, 7, 3, 11, 1, 11, 17, 0, 20, 0, 0, 5, 1, 1, 1, 0, 0, 0, 11, 13, 15, 0, 7, 3, 1, 1, 1, 1, ho.c.A, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 11, 13, 0, 15, 0, 0, 7, 9, 3, 1, 1, 1, 1, ho.c.D, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 1, 0, 0};
    }

    public static char[] i() {
        return new char[]{'\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '*', '/', '\"', '*', '/', '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', l50.b.f69928j, '\t', '\n', '\r', ' ', ',', '/', l50.b.f69928j, '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '*', '/', '*', '/', '\"', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', l50.b.f69930l, '\t', '\n', '\r', ' ', ',', '/', l50.b.f69930l, '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '*', '/', '*', '/', '*', '/', '\r', ' ', '/', '\t', '\n', '\r', ' ', '/', '\t', '\n', 0};
    }

    public static byte[] j() {
        return new byte[]{35, 1, 3, 0, 4, 36, 36, 36, 36, 1, 6, 5, 13, 17, ho.c.f59561z, s60.e.f88061c, 7, 8, 9, 7, 8, 9, 7, 10, 20, ho.c.f59560y, 11, 11, 11, 12, 17, 19, s60.e.f88061c, 11, 12, 19, 14, 16, 15, 14, 12, ho.c.f59556u, 17, 11, 9, 5, ho.c.B, ho.c.A, ho.c.E, 31, 34, ho.c.C, 38, ho.c.C, ho.c.C, ho.c.D, 31, 33, 38, ho.c.C, ho.c.D, 33, 28, ho.c.H, ho.c.G, 28, ho.c.D, 32, 31, ho.c.C, ho.c.A, 2, 36, 2};
    }

    public boolean k() {
        return this.f1724a;
    }

    public void l(InputStream inputStream) {
        try {
            m(new InputStreamReader(inputStream, "UTF-8"));
        } catch (Exception e11) {
            throw new SerializationException("Error reading stream.", e11);
        }
    }

    public void m(Reader reader) {
        char[] cArr = new char[1024];
        int i11 = 0;
        while (true) {
            try {
                try {
                    int read = reader.read(cArr, i11, cArr.length - i11);
                    if (read == -1) {
                        x0.a(reader);
                        p(cArr, 0, i11);
                        return;
                    } else if (read == 0) {
                        char[] cArr2 = new char[cArr.length * 2];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        cArr = cArr2;
                    } else {
                        i11 += read;
                    }
                } catch (IOException e11) {
                    throw new SerializationException("Error reading input.", e11);
                }
            } catch (Throwable th2) {
                x0.a(reader);
                throw th2;
            }
        }
    }

    public void n(String str) {
        char[] charArray = str.toCharArray();
        p(charArray, 0, charArray.length);
    }

    public void o(v1.a aVar) {
        try {
            try {
                m(aVar.N("UTF-8"));
            } catch (Exception e11) {
                throw new SerializationException("Error parsing file: " + aVar, e11);
            }
        } catch (Exception e12) {
            throw new SerializationException("Error reading file: " + aVar, e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x01ca, code lost:
    
        r9 = r20;
        r7 = r22;
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0266, code lost:
    
        if (r5 != r28) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0268, code lost:
    
        r0 = a3.y.f1717k[r10];
        r6 = r0 + 1;
        r0 = a3.y.f1708b[r0];
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0273, code lost:
    
        r4 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0275, code lost:
    
        if (r0 <= 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0277, code lost:
    
        r8 = r6 + 1;
        r0 = a3.y.f1708b[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x027d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x027e, code lost:
    
        if (r0 == 1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0281, code lost:
    
        r0 = new java.lang.String(r26, r11, r5 - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0288, code lost:
    
        if (r12 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x028a, code lost:
    
        r0 = t(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0291, code lost:
    
        if (r7 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0293, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x029b, code lost:
    
        if (r25.f1724a == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x029e, code lost:
    
        r14 = r0;
        r11 = r5;
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02a1, code lost:
    
        r0 = r4;
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0295, code lost:
    
        u(r14, r0, r15);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x028f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02a5, code lost:
    
        r0 = null;
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016e A[LOOP:7: B:108:0x0135->B:124:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[Catch: RuntimeException -> 0x021b, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x021b, blocks: (B:239:0x0268, B:240:0x0273, B:242:0x0277, B:233:0x025c, B:22:0x00c5, B:23:0x00cb, B:25:0x00cf, B:219:0x0206, B:221:0x020f, B:223:0x0212, B:224:0x021f, B:172:0x022c, B:174:0x0235, B:177:0x0242, B:184:0x023e), top: B:232:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02fa  */
    /* JADX WARN: Type inference failed for: r0v47, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v56, types: [int[]] */
    /* JADX WARN: Type inference failed for: r17v3, types: [int] */
    /* JADX WARN: Type inference failed for: r17v5, types: [int] */
    /* JADX WARN: Type inference failed for: r17v6, types: [int] */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(char[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.y.p(char[], int, int):void");
    }

    public void s() {
        this.f1724a = true;
    }

    public String t(String str) {
        int length = str.length();
        y0 y0Var = new y0(length + 16);
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt != '\\') {
                y0Var.append(charAt);
                i11 = i12;
            } else {
                if (i12 == length) {
                    break;
                }
                int i13 = i11 + 2;
                char charAt2 = str.charAt(i12);
                if (charAt2 == 'u') {
                    i11 += 6;
                    y0Var.R(Character.toChars(Integer.parseInt(str.substring(i13, i11), 16)));
                } else {
                    if (charAt2 != '\"' && charAt2 != '/' && charAt2 != '\\') {
                        if (charAt2 == 'b') {
                            charAt2 = '\b';
                        } else if (charAt2 == 'f') {
                            charAt2 = '\f';
                        } else if (charAt2 == 'n') {
                            charAt2 = '\n';
                        } else if (charAt2 == 'r') {
                            charAt2 = '\r';
                        } else {
                            if (charAt2 != 't') {
                                throw new SerializationException("Illegal escaped character: \\" + charAt2);
                            }
                            charAt2 = '\t';
                        }
                    }
                    y0Var.append(charAt2);
                    i11 = i13;
                }
            }
        }
        return y0Var.toString();
    }

    public void q() {
    }

    public void r(@d0 String str, boolean z11) {
    }

    public void u(@d0 String str, String str2, boolean z11) {
    }
}
