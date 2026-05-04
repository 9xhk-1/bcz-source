package com.igexin.push.g;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.base.util.io.IOUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.core.ServiceManager;
import com.igexin.sdk.main.SdkInitSwitch;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static String f38707a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f38708b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f38709c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f38710d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f38711e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f38712f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f38713g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final String f38714h = "FileUtils";

    /* renamed from: i, reason: collision with root package name */
    private static final Object f38715i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static String f38716j;

    public static String a(String str) {
        Exception e11;
        String str2;
        try {
            str2 = f38712f + com.igexin.assist.util.a.a(str) + ".bin";
            try {
                File file = new File(str2);
                if (file.exists()) {
                    if (file.canRead()) {
                        return str2;
                    }
                }
                if (com.igexin.push.core.e.f38035l.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", com.igexin.push.core.e.f38035l.getPackageName()) == 0) {
                    return "";
                }
                f38712f = com.igexin.push.core.e.f38035l.getCacheDir() + "/ImgCache/";
                return "";
            } catch (Exception e12) {
                e11 = e12;
                com.igexin.c.a.c.a.a(e11);
                return str2;
            }
        } catch (Exception e13) {
            e11 = e13;
            str2 = "";
        }
    }

    public static String b(Context context) {
        return context.getExternalFilesDir("gtpush") + "/log/";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r0.equals("null") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            boolean r0 = p()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "FileUtils | read file cid no permission , v-"
            r0.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.igexin.c.a.c.a.a(r0, r1)
            return r2
        L1e:
            java.lang.String r0 = com.igexin.push.g.j.f38708b     // Catch: java.lang.Exception -> L2e
            byte[] r0 = b(r0)     // Catch: java.lang.Exception -> L2e
            if (r0 != 0) goto L30
            java.lang.String r0 = "FileUtils | read file cid id = null"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2e
            com.igexin.c.a.c.a.a(r0, r3)     // Catch: java.lang.Exception -> L2e
            return r2
        L2e:
            r0 = move-exception
            goto L58
        L30:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L2e
            java.lang.String r4 = com.igexin.push.core.e.M     // Catch: java.lang.Exception -> L2e
            byte[] r0 = com.igexin.c.a.a.a.a(r0, r4)     // Catch: java.lang.Exception -> L2e
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = "\\|"
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Exception -> L2e
            int r3 = r0.length     // Catch: java.lang.Exception -> L2e
            r4 = 2
            if (r3 <= r4) goto L5b
            r0 = r0[r4]     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L52
            java.lang.String r3 = "null"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L54
            if (r3 == 0) goto L52
            goto L5b
        L52:
            r2 = r0
            goto L5b
        L54:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L58:
            com.igexin.c.a.c.a.a(r0)
        L5b:
            java.lang.String r0 = "FileUtils|get cid from file cid = "
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.igexin.c.a.c.a.a(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.j.c():java.lang.String");
    }

    public static String d() {
        String str = null;
        if (!k()) {
            com.igexin.c.a.c.a.a("FileUtils | get device id from file no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return null;
        }
        try {
            com.igexin.c.a.c.a.a("FileUtils|get device id from file : " + f38709c, new Object[0]);
            byte[] b11 = b(f38709c);
            if (b11 == null) {
                com.igexin.c.a.c.a.a("FileUtils", "read file device id = null");
                com.igexin.c.a.c.a.a("FileUtils|read file device id = null", new Object[0]);
                return null;
            }
            String str2 = new String(b11, "utf-8");
            try {
                com.igexin.c.a.c.a.a("FileUtils|read file device id = ".concat(str2), new Object[0]);
                return str2;
            } catch (Exception e11) {
                e = e11;
                str = str2;
                com.igexin.c.a.c.a.a(e);
                com.igexin.c.a.c.a.a("FileUtils|get device id from file : " + e.toString(), new Object[0]);
                return str;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static long e() {
        byte[] b11;
        long j11 = 0;
        if (!p()) {
            com.igexin.c.a.c.a.a("FileUtils | get session from file no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return 0L;
        }
        try {
            b11 = b(f38708b);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a("FileUtils", e11.toString());
            com.igexin.c.a.c.a.a("FileUtils|" + e11.toString(), new Object[0]);
        }
        if (b11 == null) {
            com.igexin.c.a.c.a.a("FileUtils", "read session from file, not exist");
            com.igexin.c.a.c.a.a("FileUtils|read session from file, not exist", new Object[0]);
            return 0L;
        }
        String str = new String(com.igexin.c.a.a.a.a(b11, com.igexin.push.core.e.M));
        String substring = str.contains("null") ? str.substring(7) : str.substring(20);
        int indexOf = substring.indexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (indexOf >= 0) {
            substring = substring.substring(0, indexOf);
        }
        long parseLong = Long.parseLong(substring);
        if (parseLong != 0) {
            j11 = parseLong;
        }
        com.igexin.c.a.c.a.a("FileUtils|session : ".concat(String.valueOf(j11)), new Object[0]);
        return j11;
    }

    public static void f() {
        if (com.igexin.push.core.e.H == null) {
            return;
        }
        if (!k()) {
            com.igexin.c.a.c.a.a("FileUtils | save device id to file no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return;
        }
        com.igexin.c.a.c.a.a("FileUtils|save device id to file : " + f38709c, new Object[0]);
        ReentrantReadWriteLock.WriteLock writeLock = new ReentrantReadWriteLock().writeLock();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (writeLock.tryLock()) {
                    File file = new File(f38709c);
                    if (!file.exists() && !file.createNewFile()) {
                        com.igexin.c.a.c.a.a("FileUtils|create file : " + file.toString() + " failed !!!", new Object[0]);
                        writeLock.unlock();
                        return;
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(f38709c);
                    try {
                        byte[] bytes = com.igexin.push.core.e.H.getBytes("utf-8");
                        new String(bytes, "utf-8");
                        fileOutputStream2.write(bytes);
                        fileOutputStream = fileOutputStream2;
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.c.a.c.a.a(e);
                        com.igexin.c.a.c.a.a("FileUtils|" + e.toString(), new Object[0]);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e12) {
                                com.igexin.c.a.c.a.a(e12);
                            }
                        }
                        writeLock.unlock();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                com.igexin.c.a.c.a.a(e13);
                            }
                        }
                        writeLock.unlock();
                        throw th;
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e14) {
                        com.igexin.c.a.c.a.a(e14);
                    }
                }
                writeLock.unlock();
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void g() {
        byte[] bytes = com.igexin.push.core.e.A.getBytes();
        byte[] bArr = new byte[bytes.length];
        for (int i11 = 0; i11 < bytes.length; i11++) {
            bArr[i11] = (byte) (bytes[i11] ^ com.igexin.push.core.e.f38002ad[i11]);
        }
        com.igexin.push.core.d.d.a().a("c", Base64.encodeToString(bArr, 0));
    }

    public static void h() {
        File[] listFiles;
        File file = new File(f38712f);
        if (file.exists() && (listFiles = file.listFiles(new FileFilter() { // from class: com.igexin.push.g.j.1

            /* renamed from: a, reason: collision with root package name */
            final long f38717a = System.currentTimeMillis();

            /* renamed from: b, reason: collision with root package name */
            final long f38718b = 604800000;

            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return this.f38717a - file2.lastModified() >= 604800000;
            }
        })) != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    public static void i() {
        File[] listFiles;
        if (k()) {
            File file = new File(GtcProvider.getSdcardPath() + "/Sdk/WebCache/");
            if (file.exists() && (listFiles = file.listFiles(new FileFilter() { // from class: com.igexin.push.g.j.2

                /* renamed from: a, reason: collision with root package name */
                final long f38719a = System.currentTimeMillis();

                /* renamed from: b, reason: collision with root package name */
                final long f38720b = 604800000;

                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return this.f38719a - file2.lastModified() >= 604800000;
                }
            })) != null) {
                for (File file2 : listFiles) {
                    if (file2.exists()) {
                        a(file2);
                    }
                }
            }
        }
    }

    public static void j() {
        if (!k()) {
            com.igexin.c.a.c.a.a("FileUtilsupdateDeviceId no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return;
        }
        String n11 = n();
        String str = com.igexin.push.core.e.H;
        com.igexin.c.a.c.a.a("FileUtils|read deviceId.db = " + n11 + "; CoreRuntimeInfo.deviceId = " + com.igexin.push.core.e.H, new Object[0]);
        if (n11 != null) {
            if (n11.equals(com.igexin.push.core.e.H)) {
                return;
            }
            com.igexin.push.core.e.H = n11;
            try {
                com.igexin.push.core.e.f.a().a(n11);
                return;
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
                return;
            }
        }
        String str2 = com.igexin.push.core.e.H;
        if (str2 == null) {
            return;
        }
        if (!k()) {
            com.igexin.c.a.c.a.a("FileUtils | saveDeviceIdToNewFile no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return;
        }
        com.igexin.c.a.c.a.a("FileUtils|save deviceId = " + str2 + " to " + f38716j, new Object[0]);
        ReentrantReadWriteLock.WriteLock writeLock = new ReentrantReadWriteLock().writeLock();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (writeLock.tryLock()) {
                    File file = new File(f38716j);
                    if (!file.exists() && !file.createNewFile()) {
                        com.igexin.c.a.c.a.a("FileUtils|create file " + file.toString() + " failed", new Object[0]);
                        com.igexin.c.a.b.g.a((Closeable) null);
                        writeLock.unlock();
                        return;
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(f38716j);
                    try {
                        fileOutputStream2.write(com.igexin.c.b.a.b("V1|".concat(String.valueOf(str2)).getBytes("utf-8")));
                        fileOutputStream = fileOutputStream2;
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.c.a.c.a.a(e);
                        com.igexin.c.a.c.a.a("FileUtils|" + e.toString(), new Object[0]);
                        com.igexin.c.a.b.g.a(fileOutputStream);
                        writeLock.unlock();
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.c.a.b.g.a(fileOutputStream);
                        writeLock.unlock();
                        throw th;
                    }
                }
                com.igexin.c.a.b.g.a(fileOutputStream);
                writeLock.unlock();
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean k() {
        boolean z11;
        boolean z12;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return false;
            }
            String[] split = com.igexin.push.config.d.f37578aj.split("\\|");
            boolean z13 = true;
            if (split.length == 2) {
                String binaryString = Integer.toBinaryString(Integer.parseInt(split[0]));
                z12 = binaryString.length() >= 2 && binaryString.charAt(binaryString.length() - 2) == '1';
                if (!"2".equals(split[1]) && (!"1".equals(split[1]) || !CommonUtil.isAppForeground())) {
                    z11 = false;
                }
                z11 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            boolean hasPermission = CommonUtil.hasPermission(com.igexin.push.core.e.f38035l, "android.permission.WRITE_EXTERNAL_STORAGE", false);
            if (!z12 || !z11 || !hasPermission) {
                z13 = false;
            }
            if (z13) {
                File file = new File("/sdcard/libs");
                if (file.exists() && file.isFile()) {
                    com.igexin.c.a.c.a.a("FileUtils", "libs is file not directory, delete libs file +++++");
                    com.igexin.c.a.c.a.a("FileUtils|libs is file not directory, delete libs file ++++", new Object[0]);
                    file.delete();
                }
                if (!file.exists() && !file.mkdir()) {
                    com.igexin.c.a.c.a.a("FileUtils", "create libs directory failed ++++++++");
                    com.igexin.c.a.c.a.a("FileUtils|create libs directory failed ++++++", new Object[0]);
                }
            }
            return z13;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public static boolean l() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012c A[Catch: all -> 0x00eb, TryCatch #5 {all -> 0x00eb, blocks: (B:8:0x0038, B:11:0x0044, B:14:0x004b, B:17:0x0052, B:19:0x0055, B:21:0x0059, B:23:0x005f, B:25:0x006b, B:27:0x0077, B:29:0x0083, B:31:0x008f, B:33:0x009b, B:35:0x00b6, B:37:0x00c2, B:49:0x00e4, B:51:0x012c, B:54:0x0145, B:58:0x015a, B:75:0x0174, B:77:0x0179, B:78:0x017c, B:68:0x0121, B:70:0x0126), top: B:7:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #5 {all -> 0x00eb, blocks: (B:8:0x0038, B:11:0x0044, B:14:0x004b, B:17:0x0052, B:19:0x0055, B:21:0x0059, B:23:0x005f, B:25:0x006b, B:27:0x0077, B:29:0x0083, B:31:0x008f, B:33:0x009b, B:35:0x00b6, B:37:0x00c2, B:49:0x00e4, B:51:0x012c, B:54:0x0145, B:58:0x015a, B:75:0x0174, B:77:0x0179, B:78:0x017c, B:68:0x0121, B:70:0x0126), top: B:7:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<org.json.JSONObject> m() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.j.m():java.util.List");
    }

    private static String n() {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        r2 = null;
        String str = null;
        if (!p()) {
            com.igexin.c.a.c.a.a("FileUtils | getDeviceIdFromNewFile no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return null;
        }
        File file = new File(f38716j);
        if (c(file) && file.exists()) {
            byte[] bArr = new byte[1024];
            try {
                fileInputStream = new FileInputStream(f38716j);
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                com.igexin.c.a.b.g.a(fileInputStream2);
                com.igexin.c.a.b.g.a(byteArrayOutputStream);
                throw th;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (Exception e12) {
                            e = e12;
                            com.igexin.c.a.c.a.a(e);
                            com.igexin.c.a.b.g.a(fileInputStream);
                            com.igexin.c.a.b.g.a(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        com.igexin.c.a.b.g.a(fileInputStream2);
                        com.igexin.c.a.b.g.a(byteArrayOutputStream);
                        throw th;
                    }
                }
                String[] split = new String(com.igexin.c.b.a.c(byteArrayOutputStream.toByteArray()), "utf-8").split("\\|");
                if (split.length > 1 && com.igexin.push.core.g.f38158e.equals(split[0])) {
                    str = split[1];
                }
                com.igexin.c.a.b.g.a(fileInputStream);
                com.igexin.c.a.b.g.a(byteArrayOutputStream);
                return str;
            } catch (Exception e13) {
                e = e13;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                fileInputStream2 = fileInputStream;
                com.igexin.c.a.b.g.a(fileInputStream2);
                com.igexin.c.a.b.g.a(byteArrayOutputStream);
                throw th;
            }
        }
        return null;
    }

    private static void o() {
        File file = new File("/sdcard/libs");
        if (file.exists() && file.isFile()) {
            com.igexin.c.a.c.a.a("FileUtils", "libs is file not directory, delete libs file +++++");
            com.igexin.c.a.c.a.a("FileUtils|libs is file not directory, delete libs file ++++", new Object[0]);
            file.delete();
        }
        if (file.exists() || file.mkdir()) {
            return;
        }
        com.igexin.c.a.c.a.a("FileUtils", "create libs directory failed ++++++++");
        com.igexin.c.a.c.a.a("FileUtils|create libs directory failed ++++++", new Object[0]);
    }

    private static boolean p() {
        boolean z11;
        boolean z12;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return false;
            }
            String[] split = com.igexin.push.config.d.f37578aj.split(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            if (split.length == 2) {
                String binaryString = Integer.toBinaryString(Integer.parseInt(split[0]));
                z12 = binaryString.length() >= 2 && binaryString.charAt(binaryString.length() - 2) == '1';
                if (!"2".equals(split[1]) && (!"1".equals(split[1]) || !CommonUtil.isAppForeground())) {
                    z11 = false;
                }
                z11 = true;
            } else {
                z11 = false;
                z12 = false;
            }
            return z12 && z11 && CommonUtil.hasPermission(com.igexin.push.core.e.f38035l, "android.permission.READ_EXTERNAL_STORAGE", false);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public static void a() {
        try {
            String packageName = com.igexin.push.core.e.f38035l.getPackageName();
            f38708b = "/sdcard/libs/" + packageName + v3.a.f92897b;
            f38709c = "/sdcard/libs/com.igexin.sdk.deviceId.db";
            f38707a = "/sdcard/libs/" + packageName + ".properties";
            f38710d = "/sdcard/libs/" + packageName + ".bin";
            f38711e = com.igexin.push.core.e.f38035l.getFilesDir().getPath() + "/" + packageName + ".properties";
            f38713g = com.igexin.push.core.e.f38035l.getFilesDir().getPath() + "/" + packageName + "-guard.properties";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.igexin.push.core.e.f38035l.getCacheDir());
            sb2.append("/ImgCache/");
            f38712f = sb2.toString();
            f38716j = "/sdcard/libs/com.getui.sdk.deviceId.db";
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public static void b() {
        if (!k()) {
            com.igexin.c.a.c.a.a("FileUtils | save session to file no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(f38708b);
                if (!file.exists() && !file.createNewFile()) {
                    com.igexin.c.a.c.a.a("FileUtils | create file : " + file.toString() + " failed !!!", new Object[0]);
                    return;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(f38708b);
                try {
                    String str = com.igexin.push.config.c.f37564w + n.c();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(com.igexin.push.core.e.f38049z);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(com.igexin.push.core.e.f37998a);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    sb2.append(com.igexin.push.core.e.A);
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    ServiceManager.getInstance();
                    sb2.append(ServiceManager.d(com.igexin.push.core.e.f38035l));
                    fileOutputStream2.write(com.igexin.c.a.a.a.b(sb2.toString().getBytes(), com.igexin.push.core.e.M));
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e11) {
                        com.igexin.c.a.c.a.a(e11);
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream = fileOutputStream2;
                    com.igexin.c.a.c.a.a(e);
                    com.igexin.c.a.c.a.a("FileUtils | " + e.toString(), new Object[0]);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            com.igexin.c.a.c.a.a(e13);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e14) {
                            com.igexin.c.a.c.a.a(e14);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    private static void c(String str) {
        if (!k()) {
            com.igexin.c.a.c.a.a("FileUtils | saveDeviceIdToNewFile no permission , v-" + Build.VERSION.SDK_INT, new Object[0]);
            return;
        }
        com.igexin.c.a.c.a.a("FileUtils|save deviceId = " + str + " to " + f38716j, new Object[0]);
        ReentrantReadWriteLock.WriteLock writeLock = new ReentrantReadWriteLock().writeLock();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (writeLock.tryLock()) {
                    File file = new File(f38716j);
                    if (!file.exists() && !file.createNewFile()) {
                        com.igexin.c.a.c.a.a("FileUtils|create file " + file.toString() + " failed", new Object[0]);
                        com.igexin.c.a.b.g.a((Closeable) null);
                        writeLock.unlock();
                        return;
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(f38716j);
                    try {
                        fileOutputStream2.write(com.igexin.c.b.a.b("V1|".concat(String.valueOf(str)).getBytes("utf-8")));
                        fileOutputStream = fileOutputStream2;
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.c.a.c.a.a(e);
                        com.igexin.c.a.c.a.a("FileUtils|" + e.toString(), new Object[0]);
                        com.igexin.c.a.b.g.a(fileOutputStream);
                        writeLock.unlock();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        com.igexin.c.a.b.g.a(fileOutputStream);
                        writeLock.unlock();
                        throw th;
                    }
                }
                com.igexin.c.a.b.g.a(fileOutputStream);
                writeLock.unlock();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private static void d(String str) {
        try {
            com.igexin.push.core.e.f.a().a(str);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    private static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                while (file2.exists()) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else if (!file2.delete()) {
                        a(file2);
                    }
                }
            }
        }
        file.delete();
    }

    private static boolean b(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            return file.canWrite();
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    private static boolean c(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            return file.canRead();
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public static void a(byte[] bArr, String str) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    if (!str.startsWith("/sdcard/libs") || k()) {
                        File file = new File(str);
                        if (b(file)) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                            try {
                                fileOutputStream2.write(bArr);
                                fileOutputStream2.close();
                            } catch (Exception e11) {
                                e = e11;
                                fileOutputStream = fileOutputStream2;
                                com.igexin.c.a.c.a.a(e);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e12) {
                                        com.igexin.c.a.c.a.a(e12);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            com.igexin.c.a.c.a.a(e14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    private static byte[] b(String str) {
        ?? r62;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (!new File(str).exists()) {
            com.igexin.c.a.c.a.a("FileUtils", "get data from file = " + str + " file not exist ######");
            com.igexin.c.a.c.a.a("FileUtils|get data from file = " + str + " file not exist ######", new Object[0]);
            return null;
        }
        if (!c(new File(str))) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            IOUtils.safeClose(fileInputStream);
                            IOUtils.safeClose(byteArrayOutputStream);
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Exception e11) {
                        e = e11;
                        com.igexin.c.a.c.a.a(e);
                        com.igexin.c.a.c.a.a("FileUtils|" + e.toString(), new Object[0]);
                        IOUtils.safeClose(fileInputStream);
                        IOUtils.safeClose(byteArrayOutputStream);
                        return null;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                str = null;
                fileInputStream2 = fileInputStream;
                r62 = str;
                IOUtils.safeClose(fileInputStream2);
                IOUtils.safeClose(r62);
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            r62 = 0;
            IOUtils.safeClose(fileInputStream2);
            IOUtils.safeClose(r62);
            throw th;
        }
    }

    public static boolean a(Context context) {
        return (new File(context.getFilesDir().getAbsolutePath(), com.igexin.push.core.d.d.f37972a).exists() || new SdkInitSwitch(context).isSwitchOn()) ? false : true;
    }
}
