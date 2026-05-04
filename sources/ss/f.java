package ss;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f {
    public static byte[] a(File file, int i11) {
        ByteBuffer byteBuffer;
        Map<Integer, ByteBuffer> b11 = b(file);
        if (b11 == null || (byteBuffer = b11.get(Integer.valueOf(i11))) == null) {
            return null;
        }
        return c(byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.Integer, java.nio.ByteBuffer> b(java.io.File r3) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2e
            java.lang.String r2 = "r"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2e
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            ss.e r2 = ss.a.b(r3)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            java.util.Map r0 = ss.a.f(r2)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L3c
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L44
        L1f:
            r1.close()     // Catch: java.lang.Throwable -> L44
            goto L44
        L23:
            r2 = move-exception
            goto L31
        L25:
            r2 = move-exception
            r3 = r0
            goto L31
        L28:
            r3 = r0
            goto L3c
        L2a:
            r2 = move-exception
            r3 = r0
            r1 = r3
            goto L31
        L2e:
            r3 = r0
            r1 = r3
            goto L3c
        L31:
            if (r3 == 0) goto L36
            r3.close()     // Catch: java.io.IOException -> L36 java.lang.Throwable -> L44
        L36:
            if (r1 == 0) goto L3b
            r1.close()     // Catch: java.io.IOException -> L3b java.lang.Throwable -> L44
        L3b:
            throw r2     // Catch: java.lang.Throwable -> L44
        L3c:
            if (r3 == 0) goto L41
            r3.close()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L44
        L41:
            if (r1 == 0) goto L44
            goto L1f
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.f.b(java.io.File):java.util.Map");
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(array, byteBuffer.position() + arrayOffset, arrayOffset + byteBuffer.limit());
    }

    public static String d(File file, int i11) {
        byte[] a11 = a(file, i11);
        if (a11 == null) {
            return null;
        }
        try {
            return new String(a11, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
