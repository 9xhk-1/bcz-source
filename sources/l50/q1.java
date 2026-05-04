package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String[] f70055a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final byte[] f70056b;

    static {
        String[] strArr = new String[93];
        for (int i11 = 0; i11 < 32; i11++) {
            strArr[i11] = "\\u" + f(i11 >> 12) + f(i11 >> 8) + f(i11 >> 4) + f(i11);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f70055a = strArr;
        byte[] bArr = new byte[93];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i12] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f70056b = bArr;
    }

    @m80.k
    public static final byte[] a() {
        return f70056b;
    }

    @m80.k
    public static final String[] b() {
        return f70055a;
    }

    public static final void d(@m80.k StringBuilder sb2, @m80.k String value) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = value.charAt(i12);
            String[] strArr = f70055a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) value, i11, i12);
                sb2.append(strArr[charAt]);
                i11 = i12 + 1;
            }
        }
        if (i11 != 0) {
            sb2.append((CharSequence) value, i11, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    @m80.l
    public static final Boolean e(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (u30.f0.c2(str, n6.m.f74525c, true)) {
            return Boolean.TRUE;
        }
        if (u30.f0.c2(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char f(int i11) {
        int i12 = i11 & 15;
        return (char) (i12 < 10 ? i12 + 48 : i12 + 87);
    }

    @j0
    public static /* synthetic */ void c() {
    }
}
