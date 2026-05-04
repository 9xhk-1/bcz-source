package com.meizu.cloud.pushsdk.notification.c;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final File f39912a;

    /* renamed from: b, reason: collision with root package name */
    private final File f39913b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39914c;

    public e(String str, String str2) {
        File file = new File(str);
        this.f39912a = file;
        File file2 = new File(str2);
        this.f39913b = file2;
        this.f39914c = file2.getAbsolutePath();
        DebugLogger.i("ZipExtractTask", "Extract mInput file = " + file.toString());
        DebugLogger.i("ZipExtractTask", "Extract mOutput file = " + file2.toString());
    }

    private int a(InputStream inputStream, OutputStream outputStream) {
        StringBuilder sb2;
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        int i11 = 0;
        while (true) {
            try {
                try {
                    int read = bufferedInputStream.read(bArr, 0, 8192);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                    i11 += read;
                } finally {
                }
            } catch (IOException e11) {
                DebugLogger.e("ZipExtractTask", "Extracted IOException:" + e11.toString());
                try {
                    bufferedOutputStream.close();
                } catch (IOException e12) {
                    DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e12.toString());
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e13) {
                    e = e13;
                    sb2 = new StringBuilder();
                    sb2.append("in.close() IOException e=");
                    sb2.append(e.toString());
                    DebugLogger.e("ZipExtractTask", sb2.toString());
                    return i11;
                }
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e14) {
            DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e14.toString());
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e15) {
            e = e15;
            sb2 = new StringBuilder();
            sb2.append("in.close() IOException e=");
            sb2.append(e.toString());
            DebugLogger.e("ZipExtractTask", sb2.toString());
            return i11;
        }
        return i11;
    }

    private void b() {
        StringBuilder sb2;
        String str;
        File file = this.f39912a;
        if (file == null || !file.exists()) {
            return;
        }
        if (this.f39912a.delete()) {
            sb2 = new StringBuilder();
            str = "Delete file:";
        } else {
            sb2 = new StringBuilder();
            str = "Can't delete file:";
        }
        sb2.append(str);
        sb2.append(this.f39912a.toString());
        sb2.append(" after extracted.");
        DebugLogger.i("ZipExtractTask", sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r13 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        r10 = r13.split("/")[0];
        com.meizu.cloud.pushinternal.DebugLogger.i("ZipExtractTask", "Extract temp directory=" + r17.f39913b + "/" + r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long c() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.c.e.c():long");
    }

    public boolean a() {
        return c() > 0;
    }
}
