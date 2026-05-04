package com.huawei.hms.utils;

import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class SHA256 {
    public static byte[] digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e11) {
            HMSLog.e("SHA256", "NoSuchAlgorithmException" + e11.getMessage());
            return new byte[0];
        }
    }

    public static byte[] digest(File file) {
        BufferedInputStream bufferedInputStream;
        MessageDigest messageDigest;
        int i11;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (IOException | NoSuchAlgorithmException unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
        }
        try {
            byte[] bArr = new byte[4096];
            i11 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i11 += read;
                messageDigest.update(bArr, 0, read);
            }
        } catch (IOException | NoSuchAlgorithmException unused2) {
            bufferedInputStream2 = bufferedInputStream;
            HMSLog.e("SHA256", "An exception occurred while computing file 'SHA-256'.");
            IOUtils.closeQuietly((InputStream) bufferedInputStream2);
            return new byte[0];
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly((InputStream) bufferedInputStream);
            throw th;
        }
        if (i11 > 0) {
            byte[] digest = messageDigest.digest();
            IOUtils.closeQuietly((InputStream) bufferedInputStream);
            return digest;
        }
        IOUtils.closeQuietly((InputStream) bufferedInputStream);
        return new byte[0];
    }
}
