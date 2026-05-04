package androidx.camera.video.internal.utils;

import androidx.annotation.NonNull;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class OutputUtil {
    private static final String TAG = "OutputUtil";

    private OutputUtil() {
    }

    public static boolean createParentFolder(@NonNull File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getAbsolutePathFromUri(@androidx.annotation.NonNull android.content.ContentResolver r8, @androidx.annotation.NonNull android.net.Uri r9, @androidx.annotation.NonNull java.lang.String r10) {
        /*
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L33
            r6 = 0
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L2f
            if (r8 != 0) goto L16
            if (r8 == 0) goto L15
            r8.close()
        L15:
            return r1
        L16:
            int r9 = r8.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r8.close()
            return r9
        L25:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L53
        L29:
            r0 = move-exception
            r9 = r0
            goto L36
        L2c:
            r0 = move-exception
            r9 = r0
            goto L53
        L2f:
            r0 = move-exception
        L30:
            r9 = r0
            r8 = r1
            goto L36
        L33:
            r0 = move-exception
            r3 = r9
            goto L30
        L36:
            java.lang.String r10 = "OutputUtil"
            java.lang.String r0 = "Failed in getting absolute path for Uri %s with Exception %s"
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}     // Catch: java.lang.Throwable -> L25
            java.lang.String r9 = java.lang.String.format(r0, r9)     // Catch: java.lang.Throwable -> L25
            androidx.camera.core.Logger.e(r10, r9)     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L52
            r8.close()
        L52:
            return r1
        L53:
            if (r1 == 0) goto L58
            r1.close()
        L58:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }
}
