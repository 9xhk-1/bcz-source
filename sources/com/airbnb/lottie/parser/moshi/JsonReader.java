package com.airbnb.lottie.parser.moshi;

import i1.b;
import i1.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import l60.k;
import l60.m;
import l60.v0;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f10156g = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public int f10157a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f10158b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public String[] f10159c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    public int[] f10160d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    public boolean f10161e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10162f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f10163a;

        /* renamed from: b, reason: collision with root package name */
        public final v0 f10164b;

        public a(String[] strArr, v0 v0Var) {
            this.f10163a = strArr;
            this.f10164b = v0Var;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                k kVar = new k();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    JsonReader.Z(kVar, strArr[i11]);
                    kVar.readByte();
                    byteStringArr[i11] = kVar.q3();
                }
                return new a((String[]) strArr.clone(), v0.l(byteStringArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f10156g[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f10156g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader H(m mVar) {
        return new com.airbnb.lottie.parser.moshi.a(mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Z(l60.l r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.f10156g
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.M0(r8, r4, r3)
        L2e:
            r7.n5(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.M0(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.Z(l60.l, java.lang.String):void");
    }

    public abstract String C() throws IOException;

    public abstract String E() throws IOException;

    public abstract Token I() throws IOException;

    public final void L(int i11) {
        int i12 = this.f10157a;
        int[] iArr = this.f10158b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new i1.a("Nesting too deep at " + getPath());
            }
            this.f10158b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f10159c;
            this.f10159c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f10160d;
            this.f10160d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f10158b;
        int i13 = this.f10157a;
        this.f10157a = i13 + 1;
        iArr3[i13] = i11;
    }

    public abstract int S(a aVar) throws IOException;

    public abstract void U() throws IOException;

    public abstract void V() throws IOException;

    public final b a0(String str) throws b {
        throw new b(str + " at path " + getPath());
    }

    public abstract void c() throws IOException;

    public abstract void e() throws IOException;

    public abstract void f() throws IOException;

    public final String getPath() {
        return c.a(this.f10157a, this.f10158b, this.f10159c, this.f10160d);
    }

    public abstract void j() throws IOException;

    public abstract boolean k() throws IOException;

    public abstract boolean q() throws IOException;

    public abstract double r() throws IOException;

    public abstract int w() throws IOException;
}
