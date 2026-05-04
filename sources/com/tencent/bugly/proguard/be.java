package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.GlideException;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private static List<File> f42455a = new ArrayList();

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        String[] split = str.split("\n");
        if (split == null || split.length == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : split) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb2.append(str2);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    private static String b(String str, String str2) {
        BufferedReader b11 = ap.b(str, "reg_record.txt");
        if (b11 == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String readLine = b11.readLine();
            if (readLine != null && readLine.startsWith(str2)) {
                int i11 = 18;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    String readLine2 = b11.readLine();
                    if (readLine2 == null) {
                        sb2.append("\n");
                        String sb3 = sb2.toString();
                        try {
                            return sb3;
                        } catch (Exception e11) {
                            return sb3;
                        }
                    }
                    if (i12 % 4 == 0) {
                        if (i12 > 0) {
                            sb2.append("\n");
                        }
                        sb2.append(GlideException.a.f28776d);
                    } else {
                        if (readLine2.length() > 16) {
                            i11 = 28;
                        }
                        sb2.append("                ".substring(0, i11 - i13));
                    }
                    i13 = readLine2.length();
                    sb2.append(readLine2);
                    i12++;
                }
            }
            try {
                b11.close();
            } catch (Exception e12) {
                al.a(e12);
            }
            return null;
        } catch (Throwable th2) {
            try {
                al.a(th2);
                try {
                    b11.close();
                } catch (Exception e13) {
                    al.a(e13);
                }
                return null;
            } finally {
                try {
                    b11.close();
                } catch (Exception e112) {
                    al.a(e112);
                }
            }
        }
    }

    private static String c(String str, String str2) {
        BufferedReader b11 = ap.b(str, "map_record.txt");
        if (b11 == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String readLine = b11.readLine();
            if (readLine != null && readLine.startsWith(str2)) {
                while (true) {
                    String readLine2 = b11.readLine();
                    if (readLine2 == null) {
                        String sb3 = sb2.toString();
                        try {
                            return sb3;
                        } catch (Exception e11) {
                            return sb3;
                        }
                    }
                    sb2.append(GlideException.a.f28776d);
                    sb2.append(readLine2);
                    sb2.append("\n");
                }
            }
            try {
                b11.close();
            } catch (Exception e12) {
                al.a(e12);
            }
            return null;
        } catch (Throwable th2) {
            try {
                al.a(th2);
                try {
                    b11.close();
                } catch (Exception e13) {
                    al.a(e13);
                }
                return null;
            } finally {
                try {
                    b11.close();
                } catch (Exception e112) {
                    al.a(e112);
                }
            }
        }
    }

    private static Map<String, Integer> d(String str) {
        if (str == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length != 2) {
                    al.e("error format at %s", str2);
                    return null;
                }
                hashMap.put(split[0], Integer.valueOf(Integer.parseInt(split[1])));
            }
            return hashMap;
        } catch (Exception e11) {
            al.e("error format intStateStr %s", str);
            e11.printStackTrace();
            return null;
        }
    }

    private static <KeyT, ValueT> ValueT a(Map<KeyT, ValueT> map, KeyT keyt, ValueT valuet) {
        try {
            ValueT valuet2 = map.get(keyt);
            return valuet2 != null ? valuet2 : valuet;
        } catch (Exception e11) {
            al.a(e11);
            return valuet;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.io.BufferedInputStream r4) throws java.io.IOException {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2a
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
        L8:
            int r2 = r4.read()     // Catch: java.lang.Throwable -> L20
            r3 = -1
            if (r2 == r3) goto L26
            if (r2 != 0) goto L22
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L20
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "UTf-8"
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L20
            r1.close()
            return r4
        L20:
            r4 = move-exception
            goto L2c
        L22:
            r1.write(r2)     // Catch: java.lang.Throwable -> L20
            goto L8
        L26:
            r1.close()
            goto L32
        L2a:
            r4 = move-exception
            r1 = r0
        L2c:
            com.tencent.bugly.proguard.al.a(r4)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L32
            goto L26
        L32:
            return r0
        L33:
            r4 = move-exception
            if (r1 == 0) goto L39
            r1.close()
        L39:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.be.a(java.io.BufferedInputStream):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    public static CrashDetailBean a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String a11;
        BufferedInputStream bufferedInputStream2 = null;
        if (context != null && str != null && nativeExceptionHandler != null) {
            File file = new File(str, "rqd_record.eup");
            if (file.exists()) {
                ?? canRead = file.canRead();
                try {
                    if (canRead != 0) {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                            try {
                                String a12 = a(bufferedInputStream);
                                if (a12 != null && a12.equals("NATIVE_RQD_REPORT")) {
                                    HashMap hashMap = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            a11 = a(bufferedInputStream);
                                            if (a11 == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = a11;
                                            }
                                        }
                                        hashMap.put(str2, a11);
                                    }
                                    if (str2 != null) {
                                        al.e("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException e11) {
                                            e11.printStackTrace();
                                        }
                                        return null;
                                    }
                                    CrashDetailBean a13 = a(context, hashMap, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return a13;
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                        return a13;
                                    }
                                }
                                al.e("record read fail! %s", a12);
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                                return null;
                            } catch (IOException e14) {
                                e = e14;
                                e.printStackTrace();
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e15) {
                                        e15.printStackTrace();
                                    }
                                }
                                return null;
                            }
                        } catch (IOException e16) {
                            e = e16;
                            bufferedInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e17) {
                                    e17.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream2 = canRead;
                }
            }
            return null;
        }
        al.e("get eup record file args error", new Object[0]);
        return null;
    }

    public static void c(String str) {
        File[] listFiles;
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.canRead() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.canRead() && file2.canWrite() && file2.length() == 0) {
                        file2.delete();
                        al.c("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th2) {
            al.a(th2);
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str, "backup_record.txt");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    private static long b(Map<String, String> map) {
        String str = map.get("launchTime");
        if (str == null) {
            return -1L;
        }
        al.c("[Native record info] launchTime: %s", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e11) {
            if (al.a(e11)) {
                return -1L;
            }
            e11.printStackTrace();
            return -1L;
        }
    }

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String b11 = b(str, str2);
        if (b11 != null && !b11.isEmpty()) {
            sb2.append("Register infos:\n");
            sb2.append(b11);
        }
        String c11 = c(str, str2);
        if (c11 != null && !c11.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append("\n");
            }
            sb2.append("System SO infos:\n");
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public static void a(boolean z11, String str) {
        if (str != null) {
            f42455a.add(new File(str, "rqd_record.eup"));
            f42455a.add(new File(str, "reg_record.txt"));
            f42455a.add(new File(str, "map_record.txt"));
            f42455a.add(new File(str, "backup_record.txt"));
            if (z11) {
                c(str);
            }
        }
        List<File> list = f42455a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f42455a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                al.c("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static String a(String str, int i11, String str2, boolean z11) {
        BufferedReader bufferedReader = null;
        if (str != null && i11 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                al.a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f42455a.add(file);
                al.c("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return ap.a(new File(str), i11, z11);
                }
                String sb2 = new StringBuilder();
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (Pattern.compile(str2 + "[ ]*:").matcher(readLine).find()) {
                                    sb2.append(readLine);
                                    sb2.append("\n");
                                }
                                if (i11 > 0 && sb2.length() > i11) {
                                    if (z11) {
                                        sb2.delete(i11, sb2.length());
                                        break;
                                    }
                                    sb2.delete(0, sb2.length() - i11);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                try {
                                    al.a(th);
                                    sb2.append("\n[error:" + th.toString() + "]");
                                    sb2 = sb2.toString();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        sb2 = sb2;
                                    }
                                    return sb2;
                                } catch (Throwable th3) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e11) {
                                            al.a(e11);
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        }
                        String sb3 = sb2.toString();
                        bufferedReader2.close();
                        sb2 = sb3;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e12) {
                    al.a(e12);
                }
                return sb2;
            }
        }
        return null;
    }

    private static Map<String, String> a(Map<String, String> map) {
        String str = map.get("key-value");
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("\n")) {
            String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    private static CrashDetailBean a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) {
        boolean z11;
        if (aa.a(context) == null) {
            al.e("abnormal com info not created", new Object[0]);
        } else {
            String str = map.get("intStateStr");
            if (str != null && str.trim().length() > 0) {
                Map<String, Integer> d11 = d(map.get("intStateStr"));
                if (d11 == null) {
                    al.e("parse intSateMap fail", Integer.valueOf(map.size()));
                    return null;
                }
                try {
                    d11.get("sino").getClass();
                    d11.get("sud").getClass();
                    String str2 = map.get("soVersion");
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = (String) a(map, "codeMsg", "unknown");
                        String str4 = (String) a(map, "signalName", "unknown");
                        map.get("errnoMsg");
                        String str5 = (String) a(map, "stack", "unknown");
                        String str6 = map.get("jstack");
                        if (str6 != null) {
                            str5 = str5 + "java:\n" + str6;
                        }
                        Integer num = d11.get("sico");
                        if (num != null && num.intValue() > 0) {
                            str4 = str4 + pn.j.f81006c + str3 + pn.j.f81007d;
                            str3 = "KERNEL";
                        }
                        String str7 = str3;
                        String str8 = str4;
                        String str9 = map.get("nativeLog");
                        byte[] a11 = (str9 == null || str9.isEmpty()) ? null : ap.a(str9, "BuglyNativeLog.txt");
                        String str10 = (String) a(map, "sendingProcess", "unknown");
                        Integer num2 = d11.get("spd");
                        if (num2 != null) {
                            str10 = str10 + pn.j.f81006c + num2 + pn.j.f81007d;
                        }
                        String str11 = str10;
                        String str12 = (String) a(map, "threadName", "unknown");
                        Integer num3 = d11.get("et");
                        if (num3 != null) {
                            str12 = str12 + pn.j.f81006c + num3 + pn.j.f81007d;
                        }
                        String str13 = str12;
                        String str14 = (String) a(map, "processName", "unknown");
                        Integer num4 = d11.get("ep");
                        if (num4 != null) {
                            str14 = str14 + pn.j.f81006c + num4 + pn.j.f81007d;
                        }
                        CrashDetailBean packageCrashDatas = nativeExceptionHandler.packageCrashDatas(str14, str13, (d11.get("ets").intValue() * 1000) + (d11.get("etms").intValue() / 1000), str8, (String) a(map, "errorAddr", "unknown"), a(str5), str7, str11, (String) a(map, "tombPath", "unknown"), map.get("sysLogPath"), map.get("jniLogPath"), str2, a11, a(map), false, false);
                        if (packageCrashDatas != null) {
                            String str15 = (String) a(map, "userId", packageCrashDatas.f42115m);
                            packageCrashDatas.f42115m = str15;
                            al.c("[Native record info] userId: %s", str15);
                            String str16 = (String) a(map, "sysLog", packageCrashDatas.f42125w);
                            packageCrashDatas.f42125w = str16;
                            String str17 = (String) a(map, "appVersion", str16);
                            packageCrashDatas.f42108f = str17;
                            al.c("[Native record info] appVersion: %s", str17);
                            String str18 = map.get("isAppForeground");
                            if (str18 != null) {
                                al.c("[Native record info] isAppForeground: %s", str18);
                                z11 = str18.equalsIgnoreCase(n6.m.f74525c);
                            } else {
                                z11 = false;
                            }
                            packageCrashDatas.R = z11;
                            packageCrashDatas.Q = b(map);
                            packageCrashDatas.f42128z = null;
                            packageCrashDatas.f42113k = true;
                        }
                        return packageCrashDatas;
                    }
                    al.e("error format at version", new Object[0]);
                    return null;
                } catch (Throwable th2) {
                    al.e("error format", new Object[0]);
                    th2.printStackTrace();
                    return null;
                }
            }
            al.e("no intStateStr", new Object[0]);
        }
        return null;
    }
}
