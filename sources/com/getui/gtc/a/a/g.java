package com.getui.gtc.a.a;

/* loaded from: classes6.dex */
public final class g {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r2 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(byte[] r3) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L28
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L28
            r2.write(r3)     // Catch: java.lang.Throwable -> L26
            r2.finish()     // Catch: java.lang.Throwable -> L26
            byte[] r1 = r0.toByteArray()     // Catch: java.lang.Throwable -> L26
        L15:
            r2.close()     // Catch: java.lang.Exception -> L19
            goto L1d
        L19:
            r3 = move-exception
            r3.printStackTrace()
        L1d:
            r0.close()     // Catch: java.lang.Exception -> L21
            goto L30
        L21:
            r3 = move-exception
            r3.printStackTrace()
            goto L30
        L26:
            r3 = move-exception
            goto L2a
        L28:
            r3 = move-exception
            r2 = r1
        L2a:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L1d
            goto L15
        L30:
            return r1
        L31:
            r3 = move-exception
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.lang.Exception -> L38
            goto L3c
        L38:
            r1 = move-exception
            r1.printStackTrace()
        L3c:
            r0.close()     // Catch: java.lang.Exception -> L40
            goto L44
        L40:
            r0 = move-exception
            r0.printStackTrace()
        L44:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.a.a.g.a(byte[]):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        if (r1 == null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(byte[] r5) {
        /*
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r5)
            r5 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
        L10:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L1b
            r4 = -1
            if (r3 == r4) goto L1d
            r2.write(r3)     // Catch: java.lang.Throwable -> L1b
            goto L10
        L1b:
            r3 = move-exception
            goto L40
        L1d:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L1b
            r2.close()     // Catch: java.lang.Exception -> L25
            goto L29
        L25:
            r2 = move-exception
            r2.printStackTrace()
        L29:
            r1.close()     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r1 = move-exception
            r1.printStackTrace()
        L31:
            r0.close()     // Catch: java.lang.Exception -> L35
            goto L50
        L35:
            r0 = move-exception
            r0.printStackTrace()
            goto L50
        L3a:
            r3 = move-exception
            r2 = r5
            goto L40
        L3d:
            r3 = move-exception
            r1 = r5
            r2 = r1
        L40:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.lang.Exception -> L49
            goto L4d
        L49:
            r2 = move-exception
            r2.printStackTrace()
        L4d:
            if (r1 == 0) goto L31
            goto L29
        L50:
            return r5
        L51:
            r5 = move-exception
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.lang.Exception -> L58
            goto L5c
        L58:
            r2 = move-exception
            r2.printStackTrace()
        L5c:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.lang.Exception -> L62
            goto L66
        L62:
            r1 = move-exception
            r1.printStackTrace()
        L66:
            r0.close()     // Catch: java.lang.Exception -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r0.printStackTrace()
        L6e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.a.a.g.b(byte[]):byte[]");
    }
}
