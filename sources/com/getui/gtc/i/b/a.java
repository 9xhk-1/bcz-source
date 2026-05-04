package com.getui.gtc.i.b;

import com.badlogic.gdx.graphics.f;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
public final class a {
    public static String a(String str) {
        int i11;
        File file = new File(str);
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[f.D2];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        if (read < 10240) {
                            byte[] bArr2 = new byte[read];
                            System.arraycopy(bArr, 0, bArr2, 0, read);
                            messageDigest.update(bArr2);
                        } else {
                            messageDigest.update(bArr);
                        }
                    }
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b11 : digest) {
                        sb2.append(String.format("%02X", Byte.valueOf(b11)));
                    }
                    String sb3 = sb2.toString();
                    fileInputStream.close();
                    return sb3;
                }
            } catch (NoSuchAlgorithmException e11) {
                com.getui.gtc.i.c.a.d(e11);
            }
            return "0";
        } catch (Exception e12) {
            com.getui.gtc.i.c.a.d(e12);
            return "0";
        }
    }

    public static void a(File file) {
        try {
            if (!file.isFile()) {
                if (!file.isDirectory()) {
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        a(file2);
                    }
                }
            }
            file.delete();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    public static void a(String str, final String str2) {
        File[] listFiles;
        File file = new File(str);
        if (file.isDirectory() && (listFiles = file.listFiles(new FileFilter() { // from class: com.getui.gtc.i.b.a.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory() || file2.getName().startsWith(str2);
            }
        })) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2.getAbsolutePath(), str2);
                } else {
                    file2.delete();
                }
            }
        }
    }
}
