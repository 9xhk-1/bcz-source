package zr;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.huawei.secure.android.common.util.SecurityCommonException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102852a = "ZipUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final int f102853b = 104857600;

    /* renamed from: c, reason: collision with root package name */
    public static final int f102854c = 100;

    /* renamed from: d, reason: collision with root package name */
    public static final int f102855d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public static final String f102856e = "..";

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f102857f = {"..\\", "../", "./", ".\\.\\", "%00", "..%2F", "..%5C", ".%2F"};

    /* JADX WARN: Code restructure failed: missing block: B:115:0x006c, code lost:
    
        android.util.Log.e(zr.m.f102852a, "zipPath is a invalid path: " + l(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0084, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
    
        android.util.Log.e(zr.m.f102852a, "unzipFileNew: over than top size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.Closeable, java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.io.File> a(java.io.File r16, java.io.File r17, long r18, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.m.a(java.io.File, java.io.File, long, boolean, boolean):java.util.List");
    }

    public static void b(FileInputStream fileInputStream, BufferedOutputStream bufferedOutputStream, ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        e.c(fileInputStream);
        e.d(bufferedOutputStream);
        e.c(zipInputStream);
        e.d(fileOutputStream);
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str) || !o(str)) {
            return;
        }
        Log.e(f102852a, "IllegalArgumentException--path is not a standard path");
        throw new IllegalArgumentException("path is not a standard path");
    }

    public static boolean d(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    @RequiresApi(api = 24)
    public static boolean e(String str, long j11, int i11, boolean z11) {
        ZipFile zipFile;
        ZipEntry nextElement;
        ZipFile zipFile2 = null;
        boolean z12 = false;
        try {
            try {
                try {
                    if (z11) {
                        f.r(f102852a, "not a utf8 zip file, use gbk open zip file : " + str);
                        zipFile = new ZipFile(str, Charset.forName("GBK"));
                    } else {
                        zipFile = new ZipFile(str);
                    }
                    ZipFile zipFile3 = zipFile;
                    Enumeration<? extends ZipEntry> entries = zipFile3.entries();
                    long j12 = 0;
                    int i12 = 0;
                    do {
                        if (!entries.hasMoreElements()) {
                            z12 = true;
                            break;
                        }
                        try {
                            nextElement = entries.nextElement();
                            j12 += nextElement.getSize();
                            i12++;
                            if (o(nextElement.getName()) || i12 >= i11 || j12 > j11) {
                                break;
                            }
                        } catch (IllegalArgumentException e11) {
                            f.r(f102852a, "not a utf8 zip file, IllegalArgumentException : " + e11.getMessage());
                            z12 = e(str, j11, i11, true);
                        }
                    } while (nextElement.getSize() != -1);
                    f.k(f102852a, "File name is invalid or too many files or too big");
                    zipFile3.close();
                } catch (IOException e12) {
                    f.k(f102852a, "not a valid zip file, IOException : " + e12.getMessage());
                    if (0 != 0) {
                        zipFile2.close();
                    }
                }
            } catch (IOException unused) {
                f.k(f102852a, "close zipFile IOException ");
            }
            return z12;
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    zipFile2.close();
                } catch (IOException unused2) {
                    f.k(f102852a, "close zipFile IOException ");
                }
            }
            throw th2;
        }
    }

    public static boolean f(String str, String str2, long j11, int i11) throws SecurityCommonException {
        if (TextUtils.isEmpty(str) || o(str)) {
            f.k(f102852a, "zip file is not valid");
            return false;
        }
        if (TextUtils.isEmpty(str2) || o(str2)) {
            f.k(f102852a, "target directory is not valid");
            return false;
        }
        if (e(str, j11, i11, false)) {
            return true;
        }
        f.k(f102852a, "zip file contains valid chars or too many files");
        throw new SecurityCommonException("unsecure zipfile!");
    }

    public static boolean g(List<File> list) {
        try {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                n(it.next());
            }
            return true;
        } catch (Exception e11) {
            f.k(f102852a, "unzip fail delete file failed" + e11.getMessage());
            return false;
        }
    }

    public static File h(String str) {
        c(str);
        return new File(str);
    }

    public static boolean i(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!d(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            Log.e(f102852a, "createOrExistsFile IOException ");
            return false;
        }
    }

    public static File j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return h(str);
    }

    public static void k(File file) {
        if (file == null || file.delete()) {
            return;
        }
        f.k(f102852a, "delete file error");
    }

    public static String l(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static void m(File file) {
        if (file == null || file.exists() || file.mkdirs()) {
            return;
        }
        f.k(f102852a, "mkdirs error , files exists or IOException.");
    }

    public static void n(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            k(file);
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                k(file);
                return;
            }
            for (File file2 : listFiles) {
                n(file2);
            }
            k(file);
        }
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(f102852a, "isContainInvalidStr: name is null");
            return false;
        }
        if (str.equals(f102856e)) {
            return true;
        }
        for (String str2 : f102857f) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d2, code lost:
    
        android.util.Log.e(zr.m.f102852a, "unzip  over than top size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:
    
        r2 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x006d, code lost:
    
        android.util.Log.e(zr.m.f102852a, "zipPath is a invalid path: " + l(r13));
        r2 = r3;
        r10 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p(java.lang.String r17, java.lang.String r18, long r19, int r21, boolean r22) throws com.huawei.secure.android.common.util.SecurityCommonException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.m.p(java.lang.String, java.lang.String, long, int, boolean):boolean");
    }

    @Deprecated
    public static boolean q(String str, String str2, boolean z11) throws SecurityCommonException {
        return p(str, str2, gi.e.f53744c, 100, z11);
    }

    public static List<File> r(String str, String str2, long j11, int i11, boolean z11) throws SecurityCommonException {
        if (!f(str, str2, j11, i11)) {
            return null;
        }
        String str3 = File.separator;
        if (str2.endsWith(str3) && str2.length() > str3.length()) {
            str2 = str2.substring(0, str2.length() - str3.length());
        }
        return a(j(str), j(str2), j11, z11, false);
    }

    public static List<File> s(String str, String str2, boolean z11) throws SecurityCommonException {
        return r(str, str2, gi.e.f53744c, 100, z11);
    }
}
