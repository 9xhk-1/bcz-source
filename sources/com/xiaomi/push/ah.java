package com.xiaomi.push;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes8.dex */
public class ah {
    public static boolean a(Context context, String str, long j11) {
        RandomAccessFile randomAccessFile;
        if (!g.d(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return true;
        }
        FileLock fileLock = null;
        try {
            try {
                File file = new File(new File(context.getExternalFilesDir(null), "/.vdevdir/"), "lcfp.lock");
                y.m6304a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    boolean b11 = b(context, str, j11);
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    y.a(randomAccessFile);
                    return b11;
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    y.a(randomAccessFile);
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0 && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException unused3) {
                    }
                }
                y.a((Closeable) null);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                fileLock.release();
            }
            y.a((Closeable) null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1 A[Catch: all -> 0x00f1, IOException -> 0x00f3, LOOP:0: B:13:0x00db->B:15:0x00e1, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:12:0x00d7, B:13:0x00db, B:15:0x00e1, B:21:0x00fe), top: B:9:0x00cd }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(android.content.Context r17, java.lang.String r18, long r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ah.b(android.content.Context, java.lang.String, long):boolean");
    }
}
