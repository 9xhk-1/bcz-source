package com.getui.gtc.i.a;

import com.getui.gtc.base.util.io.IOUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f30102a = true;

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i11 = 0;
            for (int i12 = 0; i12 < 16; i12++) {
                byte b11 = digest[i12];
                int i13 = i11 + 1;
                cArr2[i11] = cArr[(b11 >>> 4) & 15];
                i11 += 2;
                cArr2[i13] = cArr[b11 & 15];
            }
            return new String(cArr2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(File file, File file2, String str) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                } catch (Exception e11) {
                    e = e11;
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = null;
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                bufferedOutputStream = null;
            }
        } catch (Exception e13) {
            e = e13;
            fileOutputStream = null;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byte[] bArr2 = new byte[read];
                System.arraycopy(bArr, 0, bArr2, 0, read);
                bufferedOutputStream.write(b.a(bArr2, str));
            }
            bufferedOutputStream.flush();
            IOUtils.safeClose(fileInputStream);
        } catch (Exception e14) {
            e = e14;
            fileInputStream2 = fileInputStream;
            try {
                com.getui.gtc.i.c.a.c(e);
                com.getui.gtc.i.b.a.a(file2);
                IOUtils.safeClose(fileInputStream2);
                IOUtils.safeClose(bufferedOutputStream);
                IOUtils.safeClose(fileOutputStream);
            } catch (Throwable th5) {
                th = th5;
                IOUtils.safeClose(fileInputStream2);
                IOUtils.safeClose(bufferedOutputStream);
                IOUtils.safeClose(fileOutputStream);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            fileInputStream2 = fileInputStream;
            IOUtils.safeClose(fileInputStream2);
            IOUtils.safeClose(bufferedOutputStream);
            IOUtils.safeClose(fileOutputStream);
            throw th;
        }
        IOUtils.safeClose(bufferedOutputStream);
        IOUtils.safeClose(fileOutputStream);
    }
}
