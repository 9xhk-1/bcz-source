package com.igexin.push.f.a;

import android.os.Process;
import java.net.HttpURLConnection;

/* loaded from: classes7.dex */
public class b extends com.igexin.c.a.d.f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38521a = "com.igexin.push.f.a.b";

    /* renamed from: b, reason: collision with root package name */
    public static final int f38522b = -2147483639;

    /* renamed from: d, reason: collision with root package name */
    private static final int f38523d = 20000;

    /* renamed from: c, reason: collision with root package name */
    public d f38524c;

    /* renamed from: e, reason: collision with root package name */
    private HttpURLConnection f38525e;

    public b(d dVar) {
        super(0);
        this.f38524c = dVar;
    }

    private void g() {
        HttpURLConnection httpURLConnection = this.f38525e;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                this.f38525e = null;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.a
    public final void a() {
        super.a();
        g();
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        String str;
        byte[] bArr;
        super.b_();
        Process.setThreadPriority(10);
        d dVar = this.f38524c;
        if (dVar == null || (str = dVar.f38529f) == null || ((bArr = dVar.f38530g) != null && bArr.length > com.igexin.push.config.d.A * 1024)) {
            l();
            String str2 = f38521a;
            com.igexin.c.a.c.a.a(str2, "run return ###");
            com.igexin.c.a.c.a.a(str2 + "|run return ###", new Object[0]);
            return;
        }
        try {
            byte[] a11 = bArr == null ? a(str) : a(str, bArr);
            if (a11 == null) {
                Exception exc = new Exception("Http response ＝＝ null");
                this.f38524c.a(exc);
                throw exc;
            }
            try {
                this.f38524c.a(a11);
                com.igexin.c.a.b.e.a().a(this.f38524c);
                com.igexin.c.a.b.e.a().b();
            } catch (Exception e11) {
                this.f38524c.a(e11);
                throw e11;
            }
        } catch (Exception e12) {
            this.f38524c.a(e12);
            throw e12;
        }
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return -2147483639;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d() {
        this.f37226o = true;
    }

    @Override // com.igexin.c.a.d.f
    public final void e() {
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.net.URLConnection r7 = r1.openConnection()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            r6.f38525e = r7     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            r1 = 20000(0x4e20, float:2.8026E-41)
            r7.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.net.HttpURLConnection r7 = r6.f38525e     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            r7.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.net.HttpURLConnection r7 = r6.f38525e     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.lang.String r1 = "GET"
            r7.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.net.HttpURLConnection r7 = r6.f38525e     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            r1 = 1
            r7.setDoInput(r1)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.net.HttpURLConnection r7 = r6.f38525e     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L89
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L81
            r1.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L81
            java.net.HttpURLConnection r2 = r6.f38525e     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            int r2 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L66
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
        L3e:
            int r3 = r7.read(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r4 = -1
            if (r3 == r4) goto L4e
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            goto L3e
        L4a:
            r0 = move-exception
            goto L9d
        L4c:
            r2 = move-exception
            goto L8c
        L4e:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r7.close()     // Catch: java.lang.Exception -> L56
            goto L5a
        L56:
            r7 = move-exception
            com.igexin.c.a.c.a.a(r7)
        L5a:
            r1.close()     // Catch: java.lang.Exception -> L5e
            goto L62
        L5e:
            r7 = move-exception
            com.igexin.c.a.c.a.a(r7)
        L62:
            r6.g()
            return r0
        L66:
            if (r7 == 0) goto L70
            r7.close()     // Catch: java.lang.Exception -> L6c
            goto L70
        L6c:
            r7 = move-exception
            com.igexin.c.a.c.a.a(r7)
        L70:
            r1.close()     // Catch: java.lang.Exception -> L74
            goto L78
        L74:
            r7 = move-exception
            com.igexin.c.a.c.a.a(r7)
        L78:
            r6.g()
            goto L9c
        L7c:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L9d
        L81:
            r2 = move-exception
            r1 = r0
            goto L8c
        L84:
            r7 = move-exception
            r1 = r0
            r0 = r7
            r7 = r1
            goto L9d
        L89:
            r2 = move-exception
            r7 = r0
            r1 = r7
        L8c:
            com.igexin.c.a.c.a.a(r2)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L99
            r7.close()     // Catch: java.lang.Exception -> L95
            goto L99
        L95:
            r7 = move-exception
            com.igexin.c.a.c.a.a(r7)
        L99:
            if (r1 == 0) goto L78
            goto L70
        L9c:
            return r0
        L9d:
            if (r7 == 0) goto La7
            r7.close()     // Catch: java.lang.Exception -> La3
            goto La7
        La3:
            r7 = move-exception
            com.igexin.c.a.c.a.a(r7)
        La7:
            if (r1 == 0) goto Lb1
            r1.close()     // Catch: java.lang.Exception -> Lad
            goto Lb1
        Lad:
            r7 = move-exception
            com.igexin.c.a.c.a.a(r7)
        Lb1:
            r6.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.f.a.b.a(java.lang.String):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de A[Catch: Exception -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x00b3, blocks: (B:44:0x00de, B:87:0x00af), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] a(java.lang.String r8, byte[] r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.f.a.b.a(java.lang.String, byte[]):byte[]");
    }

    @Override // com.igexin.c.a.d.f
    public final void f() {
    }
}
