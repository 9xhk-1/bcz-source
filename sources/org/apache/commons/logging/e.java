package org.apache.commons.logging;

import java.net.URL;
import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f77654a;

    public e(URL url) {
        this.f77654a = url;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object run() {
        /*
            r6 = this;
            java.lang.String r0 = "Unable to close stream for URL "
            r1 = 0
            java.net.URL r2 = r6.f77654a     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            r3 = 0
            r2.setUseCaches(r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L47
            if (r2 == 0) goto L21
            java.util.Properties r3 = new java.util.Properties     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            r3.load(r2)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            r2.close()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L48
            return r3
        L1f:
            r1 = move-exception
            goto L77
        L21:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L27
            goto L76
        L27:
            boolean r2 = org.apache.commons.logging.g.z()
            if (r2 == 0) goto L76
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L32:
            r2.append(r0)
            java.net.URL r0 = r6.f77654a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            org.apache.commons.logging.g.a(r0)
            goto L76
        L42:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L77
        L47:
            r2 = r1
        L48:
            boolean r3 = org.apache.commons.logging.g.z()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L64
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "Unable to read URL "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.net.URL r4 = r6.f77654a     // Catch: java.lang.Throwable -> L1f
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1f
            org.apache.commons.logging.g.a(r3)     // Catch: java.lang.Throwable -> L1f
        L64:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L6a
            goto L76
        L6a:
            boolean r2 = org.apache.commons.logging.g.z()
            if (r2 == 0) goto L76
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            goto L32
        L76:
            return r1
        L77:
            if (r2 == 0) goto L97
            r2.close()     // Catch: java.io.IOException -> L7d
            goto L97
        L7d:
            boolean r2 = org.apache.commons.logging.g.z()
            if (r2 == 0) goto L97
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            java.net.URL r0 = r6.f77654a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            org.apache.commons.logging.g.a(r0)
        L97:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.e.run():java.lang.Object");
    }
}
