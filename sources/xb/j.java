package xb;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import com.squareup.picasso.h0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f97967a = "FileHelper";

    /* renamed from: b, reason: collision with root package name */
    public static final File f97968b = pb.a.a().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);

    /* renamed from: c, reason: collision with root package name */
    public static final int f97969c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f97970d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f97971e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f97972f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f97973g = 3;

    public static File A(String file) {
        return B(null, file);
    }

    public static File B(String appath, String filename) {
        if (!f(appath)) {
            return null;
        }
        try {
            return new File(F(appath, filename));
        } catch (SecurityException e11) {
            if (qb.d.b()) {
                qb.c.c(f97967a, "", e11);
            }
            return null;
        }
    }

    public static byte[] C(String file) {
        return D(null, file);
    }

    public static byte[] D(String appath, String filename) {
        if (!f(appath)) {
            return null;
        }
        File B = B(appath, filename);
        try {
            if (!B.exists()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(B);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    fileInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e11) {
            if (qb.d.b()) {
                qb.c.c(f97967a, "", e11);
            }
            return null;
        }
    }

    public static String E(String file) {
        return F(null, file);
    }

    public static String F(String appath, String filename) {
        if (appath != null) {
            return appath + "/" + filename;
        }
        return f97968b + "/" + filename;
    }

    public static long G(File f11) {
        long j11 = 0;
        FileInputStream fileInputStream = null;
        try {
            if (f11.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(f11);
                try {
                    j11 = fileInputStream2.available();
                    fileInputStream = fileInputStream2;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    d.d(fileInputStream);
                    return 0L;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    d.d(fileInputStream);
                    throw th;
                }
            }
            d.d(fileInputStream);
            return j11;
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static InputStream H(File file) {
        if (file != null) {
            try {
                return new FileInputStream(file);
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.c(f97967a, "", e11);
                }
            }
        }
        return null;
    }

    public static InputStream I(String appath, String filename) {
        return H(B(appath, filename));
    }

    public static OutputStream J(File file) {
        if (file != null) {
            try {
                return new FileOutputStream(file);
            } catch (Exception e11) {
                if (qb.d.b()) {
                    qb.c.c(f97967a, "", e11);
                }
            }
        }
        return null;
    }

    public static OutputStream K(String appath, String filename) {
        return J(B(appath, filename));
    }

    public static String L(String appath) {
        if (appath != null) {
            return appath;
        }
        return f97968b + "/";
    }

    public static int M() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted")) {
            return 0;
        }
        if (externalStorageState.equals("unmounted") || externalStorageState.equals("unmountable") || externalStorageState.equals(h0.f41882x)) {
            return 1;
        }
        return externalStorageState.equals("shared") ? 2 : 3;
    }

    public static boolean N(String file) {
        return O(null, file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r0.close();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        r3.printStackTrace();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean O(java.lang.String r3, java.lang.String r4) {
        /*
            java.io.File r3 = B(r3, r4)
            r4 = 0
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29 java.io.FileNotFoundException -> L2b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29 java.io.FileNotFoundException -> L2b
            r3 = 7
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d java.io.FileNotFoundException -> L20
            r0 = 6
            int r2 = r1.read(r3, r4, r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d java.io.FileNotFoundException -> L20
            if (r2 != r0) goto L23
            boolean r4 = P(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d java.io.FileNotFoundException -> L20
            goto L23
        L1a:
            r3 = move-exception
            r0 = r1
            goto L42
        L1d:
            r3 = move-exception
            r0 = r1
            goto L2d
        L20:
            r3 = move-exception
            r0 = r1
            goto L3b
        L23:
            r1.close()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d java.io.FileNotFoundException -> L20
            goto L41
        L27:
            r3 = move-exception
            goto L42
        L29:
            r3 = move-exception
            goto L2d
        L2b:
            r3 = move-exception
            goto L3b
        L2d:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L41
        L32:
            r0.close()     // Catch: java.lang.Exception -> L36
            goto L41
        L36:
            r3 = move-exception
            r3.printStackTrace()
            goto L41
        L3b:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L41
            goto L32
        L41:
            return r4
        L42:
            if (r0 == 0) goto L4c
            r0.close()     // Catch: java.lang.Exception -> L48
            goto L4c
        L48:
            r4 = move-exception
            r4.printStackTrace()
        L4c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.j.O(java.lang.String, java.lang.String):boolean");
    }

    public static boolean P(byte[] data) {
        try {
            if (data[0] == 71 && data[1] == 73) {
                if (data[2] == 70) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void Q(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                return;
            }
            file.mkdir();
        } catch (Exception e11) {
            if (qb.d.b()) {
                qb.c.c(f97967a, "", e11);
            }
        }
    }

    public static boolean R(String srcFile, String dstFile) {
        return S(null, srcFile, null, dstFile);
    }

    public static boolean S(String srcAppath, String srcFilename, String dstAppath, String dstFilename) {
        try {
            if (e(dstAppath, dstFilename)) {
                File B = B(srcAppath, srcFilename);
                File B2 = B(dstAppath, dstFilename);
                if (B.exists()) {
                    if (!B2.exists()) {
                        return B.renameTo(B2);
                    }
                    if (qb.d.b()) {
                        qb.c.d(f97967a, "dst File exist:" + srcAppath + srcFilename + " " + dstAppath + dstFilename, new Object[0]);
                        return false;
                    }
                } else if (qb.d.b()) {
                    qb.c.d(f97967a, "src File not exist:" + srcAppath + srcFilename + " " + dstAppath + dstFilename, new Object[0]);
                    return false;
                }
            } else if (qb.d.b()) {
                qb.c.d(f97967a, "error checkAndMkdirs", new Object[0]);
                return false;
            }
        } catch (Exception e11) {
            if (qb.d.b()) {
                qb.c.c(f97967a, "", e11);
            }
        }
        return false;
    }

    public static boolean T(String appath, String filename, byte[] data) {
        if (!f(appath)) {
            return false;
        }
        if (!e(appath, filename)) {
            if (qb.d.b()) {
                qb.c.d(f97967a, "checkAndMkdirs fail:" + appath + filename, new Object[0]);
            }
            return false;
        }
        File B = B(appath, filename);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if ((B.exists() && !B.delete()) || !B.createNewFile()) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(B);
                try {
                    fileOutputStream2.write(data, 0, data.length);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    return true;
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    if (qb.d.b()) {
                        qb.c.c(f97967a, "", e);
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e12) {
                            if (qb.d.b()) {
                                qb.c.c(f97967a, "", e12);
                            }
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e13) {
                            if (qb.d.b()) {
                                qb.c.c(f97967a, "", e13);
                            }
                        }
                    }
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean U(String file, byte[] data) {
        return T(null, file, data);
    }

    public static boolean V(String appath, String filename, byte[] imageData) {
        if (!f(appath) || imageData == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File n11 = n(appath, filename);
                if (n11 == null) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(n11, true);
                try {
                    fileOutputStream2.write(imageData);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    if (qb.d.b()) {
                        qb.c.c(f97967a, "", e);
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e12) {
                            if (qb.d.b()) {
                                qb.c.c(f97967a, "", e12);
                            }
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e13) {
                            if (qb.d.b()) {
                                qb.c.c(f97967a, "", e13);
                            }
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean W(String file, byte[] imageData) {
        return V(null, file, imageData);
    }

    public static void X(OutputStream out) throws IOException {
        out.write(new byte[]{35, 33, 65, 77, 82, 10}, 0, 6);
    }

    public static void Y(DataOutputStream out, long totalAudioLen, long totalDataLen, long longSampleRate, int channels, long byteRate) throws IOException {
        out.write(new byte[]{82, 73, 70, 70, (byte) (totalDataLen & 255), (byte) ((totalDataLen >> 8) & 255), (byte) ((totalDataLen >> 16) & 255), (byte) ((totalDataLen >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) channels, 0, (byte) (longSampleRate & 255), (byte) ((longSampleRate >> 8) & 255), (byte) ((longSampleRate >> 16) & 255), (byte) ((longSampleRate >> 24) & 255), (byte) (byteRate & 255), (byte) ((byteRate >> 8) & 255), (byte) ((byteRate >> 16) & 255), (byte) ((byteRate >> 24) & 255), 4, 0, 16, 0, 100, 97, 116, 97, (byte) (totalAudioLen & 255), (byte) ((totalAudioLen >> 8) & 255), (byte) ((totalAudioLen >> 16) & 255), (byte) ((totalAudioLen >> 24) & 255)}, 0, 44);
    }

    @TargetApi(18)
    public static long a(StatFs statfs) {
        return statfs.getAvailableBlocksLong();
    }

    @TargetApi(18)
    public static long b(StatFs statfs) {
        return statfs.getBlockSizeLong();
    }

    public static long c(StatFs statfs) {
        return statfs.getAvailableBlocks();
    }

    public static long d(StatFs statfs) {
        return statfs.getBlockSize();
    }

    public static boolean e(String appath, String filename) {
        String x11 = x(F(appath, filename));
        File file = new File(x11);
        if (file.exists()) {
            return true;
        }
        try {
            if (file.mkdirs()) {
                return true;
            }
            if (qb.d.b()) {
                qb.c.d(f97967a, "error fulldirObj.mkdirs:" + x11, new Object[0]);
            }
            return false;
        } catch (Exception e11) {
            if (qb.d.b()) {
                qb.c.d(f97967a, "error fulldirObj.mkdirs error:" + e11.getMessage() + " " + x11, new Object[0]);
            }
            return false;
        }
    }

    public static boolean f(String appath) {
        String L = L(appath);
        if (!i()) {
            qb.c.d(f97967a, "SD ERROR %s", Environment.getExternalStorageState());
            return false;
        }
        File file = new File(L);
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        if (qb.d.b()) {
            qb.c.d("", "error fulldirObj.mkdirs:" + L, new Object[0]);
        }
        return false;
    }

    public static boolean g(String file) {
        return h(null, file);
    }

    public static boolean h(String appath, String filename) {
        if (!i()) {
            return false;
        }
        try {
            File B = B(appath, filename);
            if (B != null) {
                if (B.exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            if (qb.d.b()) {
                qb.c.c(f97967a, "", e11);
            }
            return false;
        }
    }

    public static boolean i() {
        return true;
    }

    public static boolean j() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((v(statFs) * w(statFs)) / 1024) / 1024 > 2;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean k(String srcFile, String dstFile) {
        return l(null, srcFile, null, dstFile);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #7 {all -> 0x003b, blocks: (B:21:0x0037, B:25:0x004a, B:27:0x0050), top: B:20:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "FileHelper"
            r2 = 0
            r3 = 0
            java.io.File r4 = B(r4, r5)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.io.File r5 = B(r6, r7)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            boolean r6 = r4.exists()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            if (r6 != 0) goto L16
            goto L73
        L16:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
        L24:
            int r7 = r6.read(r5)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            if (r7 <= 0) goto L34
            r4.write(r5, r2, r7)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            goto L24
        L2e:
            r5 = move-exception
        L2f:
            r3 = r6
            goto L74
        L31:
            r5 = move-exception
        L32:
            r3 = r6
            goto L4a
        L34:
            r6.close()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r4.close()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            return r2
        L3b:
            r5 = move-exception
            goto L74
        L3d:
            r5 = move-exception
            goto L4a
        L3f:
            r5 = move-exception
            r4 = r3
            goto L2f
        L42:
            r5 = move-exception
            r4 = r3
            goto L32
        L45:
            r5 = move-exception
            r4 = r3
            goto L74
        L48:
            r5 = move-exception
            r4 = r3
        L4a:
            boolean r6 = qb.d.b()     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L53
            qb.c.c(r1, r0, r5)     // Catch: java.lang.Throwable -> L3b
        L53:
            if (r3 == 0) goto L63
            r3.close()     // Catch: java.lang.Exception -> L59
            goto L63
        L59:
            r5 = move-exception
            boolean r6 = qb.d.b()
            if (r6 == 0) goto L63
            qb.c.c(r1, r0, r5)
        L63:
            if (r4 == 0) goto L73
            r4.close()     // Catch: java.lang.Exception -> L69
            goto L73
        L69:
            r4 = move-exception
            boolean r5 = qb.d.b()
            if (r5 == 0) goto L73
            qb.c.c(r1, r0, r4)
        L73:
            return r2
        L74:
            if (r3 == 0) goto L84
            r3.close()     // Catch: java.lang.Exception -> L7a
            goto L84
        L7a:
            r6 = move-exception
            boolean r7 = qb.d.b()
            if (r7 == 0) goto L84
            qb.c.c(r1, r0, r6)
        L84:
            if (r4 == 0) goto L94
            r4.close()     // Catch: java.lang.Exception -> L8a
            goto L94
        L8a:
            r4 = move-exception
            boolean r6 = qb.d.b()
            if (r6 == 0) goto L94
            qb.c.c(r1, r0, r4)
        L94:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.j.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static File m(String file) {
        return n(null, file);
    }

    public static File n(String appath, String filename) {
        if (!f(appath)) {
            if (qb.d.b()) {
                qb.c.d(f97967a, "error checkDir", new Object[0]);
            }
            return null;
        }
        try {
            if (!e(appath, filename)) {
                if (qb.d.b()) {
                    qb.c.d(f97967a, "error checkAndMkdirs", new Object[0]);
                }
                return null;
            }
            File B = B(appath, filename);
            if (B.exists() && !B.delete()) {
                if (qb.d.b()) {
                    qb.c.d(f97967a, "error file.delete", new Object[0]);
                }
                return null;
            }
            if (B.createNewFile()) {
                return B;
            }
            if (qb.d.b()) {
                qb.c.d(f97967a, "error createNewFile" + appath + filename, new Object[0]);
            }
            return null;
        } catch (Exception e11) {
            if (qb.d.b()) {
                qb.c.d(f97967a, "error = " + e11.getMessage() + " input:" + appath + filename, new Object[0]);
            }
            return null;
        }
    }

    public static File o(String file) {
        String str;
        String str2;
        int lastIndexOf = file.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str = file.substring(lastIndexOf + 1);
            str2 = file.substring(0, lastIndexOf);
        } else {
            str = file;
            str2 = null;
        }
        return p(str2, str);
    }

    public static File p(String appath, String filename) {
        if (!f(appath)) {
            return null;
        }
        if (qb.d.b()) {
            qb.c.i(f97967a, "checkDir %b", Boolean.valueOf(f(appath)));
        }
        try {
            File B = B(appath, filename);
            if (B.exists()) {
                return B;
            }
            qb.c.i(f97967a, "create " + B.createNewFile(), new Object[0]);
            return B;
        } catch (Exception e11) {
            if (qb.d.b()) {
                qb.c.c(f97967a, appath + "__" + filename, e11);
            }
            return null;
        }
    }

    public static boolean q(String file) {
        return r(null, file);
    }

    public static boolean r(String appath, String filename) {
        if (!f(appath)) {
            return false;
        }
        File B = B(appath, filename);
        try {
            if (B.exists()) {
                return B.delete();
            }
            return false;
        } catch (Exception e11) {
            if (qb.d.b()) {
                qb.c.c(f97967a, "", e11);
            }
            return false;
        }
    }

    public static boolean s(File dir) {
        if (dir == null) {
            return false;
        }
        if (dir.isDirectory()) {
            for (String str : dir.list()) {
                if (!s(new File(dir, str))) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    public static boolean t(File dir, boolean includeRoot) {
        if (includeRoot) {
            return s(dir);
        }
        if (dir == null || !dir.exists()) {
            return false;
        }
        if (!dir.isDirectory()) {
            return dir.delete();
        }
        String[] list = dir.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!t(new File(dir, str), false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(String appath, String filename) {
        if (qb.d.b()) {
            qb.c.i(f97967a, "*********Note del:" + appath + filename, new Object[0]);
        }
        return s(B(appath, filename));
    }

    public static long v(StatFs statfs) {
        return a(statfs);
    }

    public static long w(StatFs statfs) {
        return b(statfs);
    }

    public static String x(String fullfile) {
        int lastIndexOf = fullfile.lastIndexOf("/");
        if (lastIndexOf <= 0 || lastIndexOf >= fullfile.length()) {
            return null;
        }
        return fullfile.substring(0, lastIndexOf);
    }

    public static long y(File f11, boolean isIgnoreDirectory) {
        File[] listFiles = f11.listFiles();
        long j11 = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (int i11 = 0; i11 < listFiles.length; i11++) {
            j11 += (!listFiles[i11].isDirectory() || isIgnoreDirectory) ? listFiles[i11].length() : y(listFiles[i11], false);
        }
        return j11;
    }

    public static long z(String path, boolean isIgnoreDirectory) {
        return y(new File(path), isIgnoreDirectory);
    }
}
