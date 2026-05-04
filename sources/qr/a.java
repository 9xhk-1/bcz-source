package qr;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ur.g;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f82651a = 8192;

    /* renamed from: b, reason: collision with root package name */
    public static final String f82652b = "SHA-256";

    /* renamed from: c, reason: collision with root package name */
    public static final String f82653c = "FileSHA256";

    /* renamed from: d, reason: collision with root package name */
    public static final String f82654d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f82655e = {"SHA-256", "SHA-384", "SHA-512"};

    public static boolean a(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public static boolean b(String str) {
        for (String str2 : f82655e) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String c(File file) {
        return d(file, "SHA-256");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(File file, String str) {
        FileInputStream fileInputStream;
        MessageDigest messageDigest;
        if (TextUtils.isEmpty(str) || !b(str)) {
            h.d(f82653c, "algorithm is empty or not safe");
            return "";
        }
        if (!a(file)) {
            h.d(f82653c, "file is not valid");
            return "";
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = 0;
        try {
            try {
                messageDigest = MessageDigest.getInstance(str);
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
                autoCloseInputStream = "";
                g.g(autoCloseInputStream);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            fileInputStream = null;
        } catch (NoSuchAlgorithmException e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            g.g(autoCloseInputStream);
            throw th;
        }
        try {
            byte[] bArr = new byte[8192];
            boolean z11 = false;
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
                z11 = true;
            }
            String b11 = z11 ? ur.d.b(messageDigest.digest()) : null;
            g.g(fileInputStream);
            return b11;
        } catch (IOException e13) {
            e = e13;
            h.d(f82653c, "IOException" + e.getMessage());
            g.g(fileInputStream);
            return null;
        } catch (NoSuchAlgorithmException e14) {
            e = e14;
            h.d(f82653c, "NoSuchAlgorithmException" + e.getMessage());
            g.g(fileInputStream);
            return null;
        }
    }

    public static String e(InputStream inputStream) {
        return inputStream == null ? "" : f(inputStream, "SHA-256");
    }

    public static String f(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        byte[] bArr = new byte[8192];
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        String b11 = ur.d.b(messageDigest.digest());
                        g.g(inputStream);
                        return b11;
                    }
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                }
            } catch (IOException | NoSuchAlgorithmException unused) {
                h.d(f82653c, "inputstraem exception");
                g.g(inputStream);
                return "";
            }
        } catch (Throwable th2) {
            g.g(inputStream);
            throw th2;
        }
    }

    public static boolean g(File file, String str, String str2) {
        if (!TextUtils.isEmpty(str) && b(str2)) {
            return str.equals(d(file, str2));
        }
        h.d(f82653c, "hash value is null || algorithm is illegal");
        return false;
    }

    public static boolean h(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(c(file));
    }

    public static boolean i(InputStream inputStream, String str, String str2) {
        if (!TextUtils.isEmpty(str) && b(str2)) {
            return str.equals(f(inputStream, str2));
        }
        h.d(f82653c, "hash value is null || algorithm is illegal");
        return false;
    }

    public static boolean j(InputStream inputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(e(inputStream));
    }
}
