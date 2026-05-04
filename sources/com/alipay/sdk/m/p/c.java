package com.alipay.sdk.m.p;

import com.alipay.sdk.m.u.n;
import java.io.ByteArrayInputStream;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10895a;

    /* renamed from: b, reason: collision with root package name */
    public String f10896b = n.a(24);

    public c(boolean z11) {
        this.f10895a = z11;
    }

    public static byte[] b(String str, byte[] bArr, String str2) {
        return com.alipay.sdk.m.n.e.b(str, bArr, str2);
    }

    public d a(b bVar, boolean z11, String str) {
        if (bVar == null) {
            return null;
        }
        byte[] bytes = bVar.b().getBytes();
        byte[] bytes2 = bVar.a().getBytes();
        if (z11) {
            try {
                bytes2 = com.alipay.sdk.m.n.b.a(bytes2);
            } catch (Exception unused) {
                z11 = false;
            }
        }
        return new d(z11, this.f10895a ? a(bytes, a(this.f10896b, com.alipay.sdk.m.l.a.f10703f), b(this.f10896b, bytes2, str)) : a(bytes, bytes2));
    }

    public b a(d dVar, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        String str3;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(dVar.a());
            try {
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[a(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                } catch (Exception e11) {
                    e = e11;
                    str2 = null;
                }
                try {
                    byte[] bArr3 = new byte[5];
                    byteArrayInputStream.read(bArr3);
                    int a11 = a(new String(bArr3));
                    if (a11 > 0) {
                        byte[] bArr4 = new byte[a11];
                        byteArrayInputStream.read(bArr4);
                        if (this.f10895a) {
                            bArr4 = a(this.f10896b, bArr4, str);
                        }
                        if (dVar.b()) {
                            bArr4 = com.alipay.sdk.m.n.b.b(bArr4);
                        }
                        str3 = new String(bArr4);
                    } else {
                        str3 = null;
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused) {
                    }
                } catch (Exception e12) {
                    e = e12;
                    com.alipay.sdk.m.u.e.a(e);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    str3 = null;
                    if (str2 == null) {
                    }
                    return new b(str2, str3);
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream2 = byteArrayInputStream;
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (str2 == null || str3 != null) {
            return new b(str2, str3);
        }
        return null;
    }

    public static byte[] a(String str, String str2) {
        return com.alipay.sdk.m.n.d.a(str, str2);
    }

    public static byte[] a(String str, byte[] bArr, String str2) {
        return com.alipay.sdk.m.n.e.a(str, bArr, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(byte[]... r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L63
            int r1 = r7.length
            if (r1 != 0) goto L8
            goto L63
        L8:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r4 = 0
        L14:
            if (r4 >= r3) goto L2e
            r5 = r7[r4]     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.String r6 = a(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r2.write(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r2.write(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            int r4 = r4 + 1
            goto L14
        L2a:
            r7 = move-exception
            goto L3e
        L2c:
            r7 = move-exception
            goto L4a
        L2e:
            r2.flush()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r1.close()     // Catch: java.lang.Exception -> L54
            goto L54
        L39:
            r7 = move-exception
            goto L3d
        L3b:
            r7 = move-exception
            goto L40
        L3d:
            r2 = r0
        L3e:
            r0 = r1
            goto L58
        L40:
            r2 = r0
            goto L4a
        L42:
            r7 = move-exception
            goto L46
        L44:
            r7 = move-exception
            goto L48
        L46:
            r2 = r0
            goto L58
        L48:
            r1 = r0
            r2 = r1
        L4a:
            com.alipay.sdk.m.u.e.a(r7)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.lang.Exception -> L52
        L52:
            if (r2 == 0) goto L57
        L54:
            r2.close()     // Catch: java.lang.Exception -> L57
        L57:
            return r0
        L58:
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Exception -> L5d
        L5d:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.lang.Exception -> L62
        L62:
            throw r7
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.p.c.a(byte[][]):byte[]");
    }

    public static String a(int i11) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i11));
    }

    public static int a(String str) {
        return Integer.parseInt(str);
    }
}
