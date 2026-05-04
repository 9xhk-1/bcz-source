package com.baicizhan.client.business.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Md5Utils {
    public static final String TAG = "Md5Utils";

    public static String getFileMD5(File file) {
        if (!file.isFile()) {
            return "";
        }
        try {
            return getFileMD5(new FileInputStream(file));
        } catch (IOException e11) {
            qb.c.d(TAG, "Exception + " + e11.getMessage(), new Object[0]);
            return "";
        }
    }

    public static String getStringMD5(String data) {
        return (data == null || data.isEmpty()) ? "" : getFileMD5(new ByteArrayInputStream(data.getBytes()));
    }

    public static String getFileMD5(InputStream in2) {
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = in2.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            in2.close();
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            return bigInteger == null ? "" : bigInteger;
        } catch (Exception e11) {
            qb.c.d(TAG, "Exception + " + e11.getMessage(), new Object[0]);
            return "";
        }
    }
}
