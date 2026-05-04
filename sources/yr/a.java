package yr;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100259a = "BksUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final String f100260b = "com.huawei.hwid";

    /* renamed from: c, reason: collision with root package name */
    public static final String f100261c = "com.huawei.hwid";

    /* renamed from: d, reason: collision with root package name */
    public static final String f100262d = "com.huawei.hms";

    /* renamed from: e, reason: collision with root package name */
    public static final String f100263e = "com.huawei.hwid.tv";

    /* renamed from: g, reason: collision with root package name */
    public static final String f100265g = "files/hmsrootcas.bks";

    /* renamed from: h, reason: collision with root package name */
    public static final String f100266h = "4.0.2.300";

    /* renamed from: i, reason: collision with root package name */
    public static final String f100267i = "aegis";

    /* renamed from: j, reason: collision with root package name */
    public static final String f100268j = "hmsrootcas.bks";

    /* renamed from: k, reason: collision with root package name */
    public static final long f100269k = 604800000;

    /* renamed from: l, reason: collision with root package name */
    public static final String f100270l = "last_update_time";

    /* renamed from: m, reason: collision with root package name */
    public static final String f100271m = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";

    /* renamed from: n, reason: collision with root package name */
    public static final String f100272n = "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C";

    /* renamed from: o, reason: collision with root package name */
    public static final String f100273o = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539";

    /* renamed from: q, reason: collision with root package name */
    public static final String f100275q = "";

    /* renamed from: r, reason: collision with root package name */
    public static final String f100276r = "bks_hash";

    /* renamed from: f, reason: collision with root package name */
    public static final Uri f100264f = Uri.parse("content://com.huawei.hwid");

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f100274p = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            h.g(f100259a, "The directory  has already exists");
            return 1;
        }
        if (file.mkdirs()) {
            h.b(f100259a, "create directory  success");
            return 0;
        }
        h.d(f100259a, "create directory  failed");
        return -1;
    }

    public static String b(Context context) {
        return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + "aegis";
    }

    public static String c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            String hexString = Integer.toHexString(b11 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static void d(InputStream inputStream, Context context) {
        FileOutputStream fileOutputStream;
        if (inputStream == null || context == null) {
            return;
        }
        String b11 = b(context);
        if (!new File(b11).exists()) {
            a(b11);
        }
        File file = new File(b11, "hmsrootcas.bks");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                h.e(f100259a, "write output stream ");
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = inputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    g.h(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            h.d(f100259a, " IOException");
            g.h(fileOutputStream2);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            g.h(fileOutputStream2);
            throw th;
        }
    }

    public static boolean e(int i11) {
        return i11 >= 40002300;
    }

    public static byte[] f(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e(f100259a, "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e(f100259a, "PackageManager.NameNotFoundException : " + e11.getMessage());
        } catch (Exception e12) {
            Log.e(f100259a, "get pm exception : " + e12.getMessage());
        }
        return new byte[0];
    }

    public static String g(Context context) {
        return b(context) + File.separator + "hmsrootcas.bks";
    }

    public static String h(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return c(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            h.d(f100259a, "inputstraem exception");
            return "";
        }
    }

    public static boolean i(Context context, String str) {
        return "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(k(f(context, str)));
    }

    public static boolean j(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        h.e(f100259a, "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = f100266h.split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        int i11 = 0;
        while (i11 < max) {
            if (i11 < length) {
                try {
                    parseInt = Integer.parseInt(split[i11]);
                } catch (Exception e11) {
                    h.d(f100259a, " exception : " + e11.getMessage());
                    return i11 >= length2;
                }
            } else {
                parseInt = 0;
            }
            int parseInt2 = i11 < length2 ? Integer.parseInt(split2[i11]) : 0;
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
            i11++;
        }
        return true;
    }

    public static String k(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return c(MessageDigest.getInstance("SHA-256").digest(bArr));
            } catch (NoSuchAlgorithmException e11) {
                Log.e(f100259a, "NoSuchAlgorithmException" + e11.getMessage());
            }
        }
        return "";
    }

    public static boolean l(Context context) {
        return new File(b(context) + File.separator + "hmsrootcas.bks").exists();
    }

    public static boolean m(Context context, String str) {
        byte[] f11 = f(context, str);
        for (String str2 : f100274p) {
            if (str2.equalsIgnoreCase(k(f11))) {
                return true;
            }
        }
        return false;
    }

    public static synchronized InputStream n(Context context) {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        String c11;
        String h11;
        synchronized (a.class) {
            try {
                h.e(f100259a, "get bks from tss begin");
                if (context != null) {
                    c.b(context);
                }
                Context a11 = c.a();
                InputStream inputStream4 = null;
                if (a11 == null) {
                    h.d(f100259a, "context is null");
                    return null;
                }
                if (!j(i.a("com.huawei.hwid")) && !j(i.a("com.huawei.hms"))) {
                    h.d(f100259a, "hms version code is too low : " + i.a("com.huawei.hwid"));
                    return null;
                }
                if (!m(a11, "com.huawei.hwid") && !i(a11, "com.huawei.hms")) {
                    h.d(f100259a, "hms sign error");
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    inputStream2 = a11.getContentResolver().openInputStream(Uri.withAppendedPath(f100264f, f100265g));
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream2.read(bArr);
                                if (read <= -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            byteArrayOutputStream.flush();
                            inputStream3 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        InputStream inputStream5 = inputStream2;
                        inputStream = inputStream4;
                        inputStream4 = inputStream5;
                        inputStream3 = inputStream;
                        inputStream2 = inputStream4;
                        g.g(inputStream2);
                        g.h(byteArrayOutputStream);
                        g.g(inputStream3);
                        throw th;
                    }
                    try {
                        c11 = j.c(f100276r, "", a11);
                        h11 = h(byteArrayOutputStream.toByteArray());
                    } catch (Exception e12) {
                        e = e12;
                        inputStream4 = inputStream3;
                        h.d(f100259a, "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                        g.g(inputStream2);
                        g.h(byteArrayOutputStream);
                        g.g(inputStream4);
                        return o(a11);
                    } catch (Throwable th3) {
                        th = th3;
                        g.g(inputStream2);
                        g.h(byteArrayOutputStream);
                        g.g(inputStream3);
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    inputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    inputStream3 = inputStream;
                    inputStream2 = inputStream4;
                    g.g(inputStream2);
                    g.h(byteArrayOutputStream);
                    g.g(inputStream3);
                    throw th;
                }
                if (l(a11) && c11.equals(h11)) {
                    h.e(f100259a, "bks not update");
                    g.g(inputStream2);
                    g.h(byteArrayOutputStream);
                    g.g(inputStream3);
                    return o(a11);
                }
                h.e(f100259a, "update bks and sp");
                d(inputStream3, a11);
                j.i(f100276r, h11, a11);
                g.g(inputStream2);
                g.h(byteArrayOutputStream);
                g.g(inputStream3);
                return o(a11);
            } finally {
            }
        }
    }

    public static InputStream o(Context context) {
        if (!l(context)) {
            return null;
        }
        h.e(f100259a, "getFilesBksIS ");
        try {
            return new FileInputStream(g(context));
        } catch (FileNotFoundException unused) {
            h.d(f100259a, "FileNotFoundExceptio: ");
            return null;
        }
    }
}
