package fp;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.j;
import com.google.zxing.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b implements j {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[LOOP:0: B:16:0x0063->B:17:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // com.google.zxing.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.zxing.k a(com.google.zxing.b r14, java.util.Map<com.google.zxing.DecodeHintType, ?> r15) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        /*
            r13 = this;
            hp.a r1 = new hp.a
            kp.b r14 = r14.b()
            r1.<init>(r14)
            r14 = 0
            r2 = 0
            fp.a r0 = r1.b(r14)     // Catch: com.google.zxing.FormatException -> L25 com.google.zxing.NotFoundException -> L28
            com.google.zxing.l[] r3 = r0.b()     // Catch: com.google.zxing.FormatException -> L25 com.google.zxing.NotFoundException -> L28
            gp.a r4 = new gp.a     // Catch: com.google.zxing.FormatException -> L21 com.google.zxing.NotFoundException -> L23
            r4.<init>()     // Catch: com.google.zxing.FormatException -> L21 com.google.zxing.NotFoundException -> L23
            kp.d r0 = r4.c(r0)     // Catch: com.google.zxing.FormatException -> L21 com.google.zxing.NotFoundException -> L23
            r4 = r2
            r2 = r0
            r0 = r3
            r3 = r4
            goto L33
        L21:
            r0 = move-exception
            goto L2b
        L23:
            r0 = move-exception
            goto L2f
        L25:
            r0 = move-exception
            r3 = r2
            goto L2b
        L28:
            r0 = move-exception
            r3 = r2
            goto L2f
        L2b:
            r4 = r0
            r0 = r3
            r3 = r2
            goto L33
        L2f:
            r4 = r3
            r3 = r0
            r0 = r4
            r4 = r2
        L33:
            if (r2 != 0) goto L55
            r0 = 1
            fp.a r0 = r1.b(r0)     // Catch: com.google.zxing.FormatException -> L49 com.google.zxing.NotFoundException -> L4c
            com.google.zxing.l[] r1 = r0.b()     // Catch: com.google.zxing.FormatException -> L49 com.google.zxing.NotFoundException -> L4c
            gp.a r2 = new gp.a     // Catch: com.google.zxing.FormatException -> L49 com.google.zxing.NotFoundException -> L4c
            r2.<init>()     // Catch: com.google.zxing.FormatException -> L49 com.google.zxing.NotFoundException -> L4c
            kp.d r2 = r2.c(r0)     // Catch: com.google.zxing.FormatException -> L49 com.google.zxing.NotFoundException -> L4c
            r9 = r1
            goto L56
        L49:
            r0 = move-exception
        L4a:
            r14 = r0
            goto L4e
        L4c:
            r0 = move-exception
            goto L4a
        L4e:
            if (r3 != 0) goto L54
            if (r4 == 0) goto L53
            throw r4
        L53:
            throw r14
        L54:
            throw r3
        L55:
            r9 = r0
        L56:
            if (r15 == 0) goto L6d
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r15 = r15.get(r0)
            com.google.zxing.m r15 = (com.google.zxing.m) r15
            if (r15 == 0) goto L6d
            int r0 = r9.length
        L63:
            if (r14 >= r0) goto L6d
            r1 = r9[r14]
            r15.a(r1)
            int r14 = r14 + 1
            goto L63
        L6d:
            com.google.zxing.k r5 = new com.google.zxing.k
            java.lang.String r6 = r2.j()
            byte[] r7 = r2.g()
            int r8 = r2.e()
            com.google.zxing.BarcodeFormat r10 = com.google.zxing.BarcodeFormat.AZTEC
            long r11 = java.lang.System.currentTimeMillis()
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.util.List r14 = r2.a()
            if (r14 == 0) goto L8f
            com.google.zxing.ResultMetadataType r15 = com.google.zxing.ResultMetadataType.BYTE_SEGMENTS
            r5.j(r15, r14)
        L8f:
            java.lang.String r14 = r2.b()
            if (r14 == 0) goto L9a
            com.google.zxing.ResultMetadataType r15 = com.google.zxing.ResultMetadataType.ERROR_CORRECTION_LEVEL
            r5.j(r15, r14)
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.b.a(com.google.zxing.b, java.util.Map):com.google.zxing.k");
    }

    @Override // com.google.zxing.j
    public k c(com.google.zxing.b bVar) throws NotFoundException, FormatException {
        return a(bVar, null);
    }

    @Override // com.google.zxing.j
    public void reset() {
    }
}
