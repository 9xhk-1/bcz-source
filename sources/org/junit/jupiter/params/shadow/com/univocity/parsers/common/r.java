package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <C extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> void a(java.lang.String[] r3, o90.z<C> r4, C r5, org.junit.jupiter.params.shadow.com.univocity.parsers.common.b0<C> r6) {
        /*
            r4.q(r3, r5)     // Catch: java.lang.Throwable -> L4 org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException -> Ld
            return
        L4:
            r6 = move-exception
            int r5 = r5.l()
            b(r4, r6, r3, r5)
            goto L58
        Ld:
            r0 = move-exception
            r0.setContext(r5)
            boolean r1 = r0.isFatal()
            if (r1 != 0) goto L45
            boolean r1 = r0.isHandled()
            if (r1 != 0) goto L45
            int r1 = r0.getColumnIndex()
            r2 = -1
            if (r1 <= r2) goto L45
            boolean r1 = r6 instanceof org.junit.jupiter.params.shadow.com.univocity.parsers.common.d0
            if (r1 == 0) goto L45
            r1 = r6
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.d0 r1 = (org.junit.jupiter.params.shadow.com.univocity.parsers.common.d0) r1
            r0.markAsHandled(r6)
            r1.a(r0, r3, r5)
            boolean r1 = r1.c()
            if (r1 != 0) goto L45
            r4.q(r3, r5)     // Catch: java.lang.Throwable -> L3b org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException -> L44
            return
        L3b:
            r1 = move-exception
            int r2 = r5.l()
            b(r4, r1, r3, r2)
            goto L45
        L44:
            r0 = move-exception
        L45:
            int r4 = r5.l()
            r0.setErrorContentLength(r4)
            boolean r4 = r0.isFatal()
            if (r4 != 0) goto L59
            r0.markAsHandled(r6)
            r6.a(r0, r3, r5)
        L58:
            return
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.jupiter.params.shadow.com.univocity.parsers.common.r.a(java.lang.String[], o90.z, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i, org.junit.jupiter.params.shadow.com.univocity.parsers.common.b0):void");
    }

    public static final void b(o90.z zVar, Throwable th2, String[] strArr, int i11) throws DataProcessingException {
        DataProcessingException dataProcessingException = new DataProcessingException("Unexpected error processing input row " + a.restrictContent(i11, Arrays.toString(strArr)) + " using Processor " + zVar.getClass().getName() + '.', a.restrictContent(i11, strArr), th2);
        dataProcessingException.restrictContent(Integer.valueOf(i11));
        throw dataProcessingException;
    }
}
