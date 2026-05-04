package nl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File a(java.net.URL r6, java.io.File r7) throws java.lang.RuntimeException {
        /*
            r0 = 0
            java.net.URLConnection r1 = r6.openConnection()     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L90 java.io.IOException -> L94
            r1.connect()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L75
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r6 = r6.getPath()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            r3 = 47
            int r3 = r6.lastIndexOf(r3)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            int r3 = r3 + 1
            java.lang.String r6 = r6.substring(r3)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            r3.<init>(r7, r6)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            r7 = 26
            r4 = 0
            if (r6 < r7) goto L4a
            java.nio.file.Path r6 = kl.d.a(r3)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            java.nio.file.OpenOption[] r7 = new java.nio.file.OpenOption[r4]     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            java.io.OutputStream r6 = nl.a.a(r6, r7)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
        L41:
            r0 = r6
            goto L50
        L43:
            r6 = move-exception
            goto La0
        L46:
            r6 = move-exception
            r7 = r0
        L48:
            r0 = r1
            goto L97
        L4a:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            goto L41
        L50:
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
        L54:
            int r7 = r2.read(r6)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            r5 = -1
            if (r7 == r5) goto L5f
            r0.write(r6, r4, r7)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L46
            goto L54
        L5f:
            if (r0 == 0) goto L67
            r0.flush()     // Catch: java.io.IOException -> L67
            r0.close()     // Catch: java.io.IOException -> L67
        L67:
            r2.close()     // Catch: java.io.IOException -> L6a
        L6a:
            r1.disconnect()
            return r3
        L6e:
            r6 = move-exception
            r2 = r0
            goto La0
        L71:
            r6 = move-exception
            r7 = r0
            r2 = r7
            goto L48
        L75:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r7.<init>()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r2 = "Failed to connect: HTTP response code "
            r7.append(r2)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r7.append(r2)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
            throw r6     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L71
        L90:
            r6 = move-exception
            r1 = r0
            r2 = r1
            goto La0
        L94:
            r6 = move-exception
            r7 = r0
            r2 = r7
        L97:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L9d
            throw r1     // Catch: java.lang.Throwable -> L9d
        L9d:
            r6 = move-exception
            r1 = r0
            r0 = r7
        La0:
            if (r0 == 0) goto La8
            r0.flush()     // Catch: java.io.IOException -> La8
            r0.close()     // Catch: java.io.IOException -> La8
        La8:
            if (r2 == 0) goto Lad
            r2.close()     // Catch: java.io.IOException -> Lad
        Lad:
            if (r1 == 0) goto Lb2
            r1.disconnect()
        Lb2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.b.a(java.net.URL, java.io.File):java.io.File");
    }
}
