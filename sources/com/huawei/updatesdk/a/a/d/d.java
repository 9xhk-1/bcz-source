package com.huawei.updatesdk.a.a.d;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class d {
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public static String a(String str, String str2) {
        FileInputStream fileInputStream;
        String str3;
        ?? d11 = d(str);
        Closeable closeable = null;
        try {
            if (d11 != 0) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    long j11 = 0;
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                        j11 += read;
                    }
                    String a11 = j11 > 0 ? b.a(messageDigest.digest()) : null;
                    a(fileInputStream);
                    return a11;
                } catch (FileNotFoundException unused) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("FileUtil", "getFileHashData FileNotFoundException");
                    a(fileInputStream);
                    return null;
                } catch (IOException e11) {
                    e = e11;
                    str3 = "getFileHashData IOException";
                    com.huawei.updatesdk.a.a.c.a.a.a.a("FileUtil", str3, e);
                    a(fileInputStream);
                    return null;
                } catch (IllegalArgumentException e12) {
                    e = e12;
                    str3 = "getFileHashData IllegalArgumentException";
                    com.huawei.updatesdk.a.a.c.a.a.a.a("FileUtil", str3, e);
                    a(fileInputStream);
                    return null;
                } catch (IndexOutOfBoundsException e13) {
                    e = e13;
                    str3 = "getFileHashData IndexOutOfBoundsException";
                    com.huawei.updatesdk.a.a.c.a.a.a.a("FileUtil", str3, e);
                    a(fileInputStream);
                    return null;
                } catch (NoSuchAlgorithmException e14) {
                    e = e14;
                    str3 = "getFileHashData NoSuchAlgorithmException";
                    com.huawei.updatesdk.a.a.c.a.a.a.a("FileUtil", str3, e);
                    a(fileInputStream);
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStream = null;
            } catch (IOException e15) {
                e = e15;
                fileInputStream = null;
            } catch (IllegalArgumentException e16) {
                e = e16;
                fileInputStream = null;
            } catch (IndexOutOfBoundsException e17) {
                e = e17;
                fileInputStream = null;
            } catch (NoSuchAlgorithmException e18) {
                e = e18;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                a(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = d11;
        }
    }

    private static boolean b(String str) {
        return a(str) || c(str);
    }

    private static boolean c(String str) {
        return str.contains("%00") || str.contains(".\\.\\") || str.contains("./");
    }

    public static boolean d(String str) {
        return TextUtils.isEmpty(str) || b(str);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                com.huawei.updatesdk.a.a.c.a.a.a.a("FileUtil", "Closeable exception", e11);
            }
        }
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        return file.delete();
    }

    private static boolean a(String str) {
        return str.contains("../") || str.contains(m.f102856e);
    }
}
