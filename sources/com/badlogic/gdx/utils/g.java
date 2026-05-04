package com.badlogic.gdx.utils;

import a3.d0;
import a3.x0;
import a3.y0;
import com.badlogic.gdx.utils.JsonValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements a3.d {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f13282f = e();

    /* renamed from: g, reason: collision with root package name */
    public static final short[] f13283g = i();

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f13284h = m();

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f13285i = k();

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13286j = j();

    /* renamed from: k, reason: collision with root package name */
    public static final short[] f13287k = g();

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f13288l = h();

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f13289m = n();

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f13290n = l();

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f13291o = f();

    /* renamed from: p, reason: collision with root package name */
    public static final int f13292p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f13293q = 35;

    /* renamed from: r, reason: collision with root package name */
    public static final int f13294r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f13295s = 5;

    /* renamed from: t, reason: collision with root package name */
    public static final int f13296t = 23;

    /* renamed from: u, reason: collision with root package name */
    public static final int f13297u = 1;

    /* renamed from: a, reason: collision with root package name */
    public final a<JsonValue> f13298a = new a<>(8);

    /* renamed from: b, reason: collision with root package name */
    public final a<JsonValue> f13299b = new a<>(8);

    /* renamed from: c, reason: collision with root package name */
    public JsonValue f13300c;

    /* renamed from: d, reason: collision with root package name */
    public JsonValue f13301d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13302e;

    public static byte[] e() {
        return new byte[]{0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 2, 0, 7, 2, 0, 8, 2, 1, 3, 2, 1, 5};
    }

    public static byte[] f() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
    }

    public static short[] g() {
        return new short[]{0, 0, 11, 14, 16, 19, 28, 34, 40, 43, 54, 62, 70, 79, 81, 90, 93, 96, 105, 108, 111, 113, 116, 119, 130, 138, 146, 157, 159, 170, 173, 176, 187, 190, 193, 196, 201, 206, 207};
    }

    public static byte[] h() {
        return new byte[]{1, 1, 2, 3, 4, 3, 5, 3, 6, 1, 0, 7, 7, 3, 8, 3, 9, 9, 3, 11, 11, 12, 13, 14, 3, 15, 11, 10, 16, 16, 17, ho.c.f59556u, 16, 3, 19, 19, 20, ho.c.f59560y, 19, 3, ho.c.f59561z, ho.c.f59561z, 3, ho.c.f59560y, ho.c.f59560y, ho.c.B, 3, ho.c.C, 3, ho.c.D, 3, ho.c.E, ho.c.f59560y, ho.c.A, 28, ho.c.G, ho.c.G, 28, ho.c.H, 31, 32, 3, 33, 34, 34, 33, 13, 35, 15, 3, 34, 34, 12, 36, s60.e.f88061c, 3, 15, 34, 10, 16, 3, 36, 36, 12, 3, 38, 3, 3, 36, 10, 39, 39, 3, 40, 40, 3, 13, 13, 12, 3, 41, 3, 15, 13, 10, 42, 42, 3, 43, 43, 3, 28, 3, 44, 44, 3, a0.f68904b, a0.f68904b, 3, 47, 47, 48, 49, 50, 3, 51, 52, 53, 47, 46, 54, 55, 55, 54, 56, 57, 58, 3, 59, 60, 60, 59, 49, 61, 52, 3, 60, 60, 48, 62, 63, 3, 51, 52, 53, 60, 46, 54, 3, 62, 62, 48, 3, 64, 3, 51, 3, 53, 62, 46, 65, 65, 3, 66, 66, 3, 49, 49, 48, 3, 67, 3, 51, 52, 53, 49, 46, 68, 68, 3, 69, 69, 3, 70, 70, 3, 8, 8, 71, 8, 3, 72, 72, 73, 72, 3, 3, 3, 0};
    }

    public static short[] i() {
        return new short[]{0, 0, 11, 13, 14, 16, 25, 31, 37, 39, 50, 57, 64, 73, 74, 83, 85, 87, 96, 98, 100, 101, 103, 105, 116, 123, 130, 141, 142, 153, 155, 157, 168, 170, 172, 174, 179, 184, 184};
    }

    public static byte[] j() {
        return new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
    }

    public static byte[] k() {
        return new byte[]{0, 9, 2, 1, 2, 7, 4, 4, 2, 9, 7, 7, 7, 1, 7, 2, 2, 7, 2, 2, 1, 2, 2, 9, 7, 7, 9, 1, 9, 2, 2, 9, 2, 2, 2, 3, 3, 0, 0};
    }

    public static byte[] l() {
        return new byte[]{13, 0, 15, 0, 0, 7, 3, 11, 1, 11, 17, 0, 20, 0, 0, 5, 1, 1, 1, 0, 0, 0, 11, 13, 15, 0, 7, 3, 1, 1, 1, 1, ho.c.A, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 11, 13, 0, 15, 0, 0, 7, 9, 3, 1, 1, 1, 1, ho.c.D, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 1, 0, 0};
    }

    public static char[] m() {
        return new char[]{'\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '*', '/', '\"', '*', '/', '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', l50.b.f69928j, '\t', '\n', '\r', ' ', ',', '/', l50.b.f69928j, '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', l50.b.f69928j, '\t', '\n', '*', '/', '*', '/', '\"', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', l50.b.f69930l, '\t', '\n', '\r', ' ', ',', '/', l50.b.f69930l, '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', l50.b.f69930l, l50.b.f69927i, '\t', '\n', '*', '/', '*', '/', '*', '/', '\r', ' ', '/', '\t', '\n', '\r', ' ', '/', '\t', '\n', 0};
    }

    public static byte[] n() {
        return new byte[]{35, 1, 3, 0, 4, 36, 36, 36, 36, 1, 6, 5, 13, 17, ho.c.f59561z, s60.e.f88061c, 7, 8, 9, 7, 8, 9, 7, 10, 20, ho.c.f59560y, 11, 11, 11, 12, 17, 19, s60.e.f88061c, 11, 12, 19, 14, 16, 15, 14, 12, ho.c.f59556u, 17, 11, 9, 5, ho.c.B, ho.c.A, ho.c.E, 31, 34, ho.c.C, 38, ho.c.C, ho.c.C, ho.c.D, 31, 33, 38, ho.c.C, ho.c.D, 33, 28, ho.c.H, ho.c.G, 28, ho.c.D, 32, 31, ho.c.C, ho.c.A, 2, 36, 2};
    }

    @Override // a3.d
    public JsonValue a(v1.a aVar) {
        try {
            try {
                return r(aVar.N("UTF-8"));
            } catch (Exception e11) {
                throw new SerializationException("Error parsing file: " + aVar, e11);
            }
        } catch (Exception e12) {
            throw new SerializationException("Error reading file: " + aVar, e12);
        }
    }

    @Override // a3.d
    public JsonValue b(InputStream inputStream) {
        try {
            return r(new InputStreamReader(inputStream, "UTF-8"));
        } catch (Exception e11) {
            throw new SerializationException("Error reading stream.", e11);
        }
    }

    public final void c(@d0 String str, JsonValue jsonValue) {
        jsonValue.K0(str);
        JsonValue jsonValue2 = this.f13301d;
        if (jsonValue2 == null) {
            this.f13301d = jsonValue;
            this.f13300c = jsonValue;
            return;
        }
        if (!jsonValue2.c0() && !this.f13301d.k0()) {
            this.f13300c = this.f13301d;
            return;
        }
        JsonValue jsonValue3 = this.f13301d;
        jsonValue.f13157g = jsonValue3;
        if (jsonValue3.f13160j == 0) {
            jsonValue3.f13156f = jsonValue;
        } else {
            JsonValue pop = this.f13299b.pop();
            pop.f13158h = jsonValue;
            jsonValue.f13159i = pop;
        }
        this.f13299b.a(jsonValue);
        this.f13301d.f13160j++;
    }

    public void d(@d0 String str, boolean z11) {
        c(str, new JsonValue(z11));
    }

    public boolean o() {
        return this.f13302e;
    }

    public void p(@d0 String str, double d11, String str2) {
        c(str, new JsonValue(d11, str2));
    }

    public void q(@d0 String str, long j11, String str2) {
        c(str, new JsonValue(j11, str2));
    }

    public JsonValue r(Reader reader) {
        char[] cArr = new char[1024];
        int i11 = 0;
        while (true) {
            try {
                try {
                    int read = reader.read(cArr, i11, cArr.length - i11);
                    if (read == -1) {
                        x0.a(reader);
                        return t(cArr, 0, i11);
                    }
                    if (read == 0) {
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

    public JsonValue s(String str) {
        char[] charArray = str.toCharArray();
        return t(charArray, 0, charArray.length);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:2|(1:(3:419|420|(2:423|(3:426|427|(1:429))(2:425|(5:381|382|273|274|255)(3:290|291|(3:293|294|255)(1:295))))(1:422))(5:4|(2:417|418)(1:(2:413|414))|415|416|255))|7|8|(4:10|(4:12|13|(2:15|16)(1:(2:19|20)(6:21|22|23|(3:25|26|(2:27|(6:29|30|31|54|(1:(5:57|(3:59|(2:61|62)(1:64)|63)|65|66|67)(2:69|(2:71|(2:77|78)(2:75|76))(1:(2:80|81))))|82)(2:286|287)))(2:383|384)|288|(0)(0)))|17)|385|386)(1:409)|387|388|389|(3:391|(1:(1:405)(3:393|(2:395|396)(2:398|(2:400|401)(2:402|403))|397))|404)|23|(0)(0)|288|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0214, code lost:
    
        r5 = r10;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r16;
        r9 = r24;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x043e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0109. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b4 A[LOOP:7: B:125:0x017c->B:142:0x01b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef A[Catch: RuntimeException -> 0x0099, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x0099, blocks: (B:389:0x00a3, B:391:0x00a9, B:404:0x00b1, B:393:0x00b4, B:395:0x00ca, B:398:0x00d1, B:400:0x00d7, B:403:0x00da, B:23:0x00e1, B:25:0x00ef, B:13:0x007e, B:15:0x0088, B:19:0x0091, B:22:0x0094), top: B:388:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x034a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x033d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171 A[LOOP:5: B:86:0x0143->B:99:0x0171, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v60, types: [int[]] */
    /* JADX WARN: Type inference failed for: r16v17, types: [int] */
    /* JADX WARN: Type inference failed for: r16v18, types: [int] */
    /* JADX WARN: Type inference failed for: r16v9, types: [int] */
    /* JADX WARN: Type inference failed for: r19v6, types: [int] */
    /* JADX WARN: Type inference failed for: r22v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.badlogic.gdx.utils.JsonValue t(char[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.g.t(char[], int, int):com.badlogic.gdx.utils.JsonValue");
    }

    public void u() {
        this.f13300c = this.f13298a.pop();
        if (this.f13301d.f13160j > 0) {
            this.f13299b.pop();
        }
        a<JsonValue> aVar = this.f13298a;
        this.f13301d = aVar.f13179b > 0 ? aVar.peek() : null;
    }

    public void v(@d0 String str) {
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.array);
        if (this.f13301d != null) {
            c(str, jsonValue);
        }
        this.f13298a.a(jsonValue);
        this.f13301d = jsonValue;
    }

    public void w(@d0 String str) {
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.object);
        if (this.f13301d != null) {
            c(str, jsonValue);
        }
        this.f13298a.a(jsonValue);
        this.f13301d = jsonValue;
    }

    public void x() {
        this.f13302e = true;
    }

    public void y(@d0 String str, String str2) {
        c(str, new JsonValue(str2));
    }

    public String z(String str) {
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
}
