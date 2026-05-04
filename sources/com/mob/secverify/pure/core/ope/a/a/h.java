package com.mob.secverify.pure.core.ope.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40854a = "com.mob.secverify.pure.core.ope.a.a.h";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f40855b = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: c, reason: collision with root package name */
    private static String f40856c = "";

    /* renamed from: d, reason: collision with root package name */
    private static String f40857d = "";

    public static String a() {
        String uuid = UUID.randomUUID().toString();
        try {
            uuid = UUID.nameUUIDFromBytes((uuid + System.currentTimeMillis() + Math.random()).getBytes("utf8")).toString();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", th2.toString());
        }
        return !TextUtils.isEmpty(uuid) ? uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "") : uuid;
    }

    public static StringBuffer b() throws SocketException {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            String name = nextElement.getName();
            if (name == null || (!name.contains("wlan") && !name.equals("eth0"))) {
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress()) {
                        String hostAddress = nextElement2.getHostAddress();
                        if (a(hostAddress)) {
                            if (stringBuffer.length() > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(hostAddress);
                        }
                    }
                }
            }
        }
        return stringBuffer;
    }

    public static boolean c() {
        String a11 = b.a(new byte[]{67, 31, ho.c.f59560y, 31, ho.c.B, 9, 1, 67, 14, 5, 2, 67, 31, ho.c.C});
        String a12 = b.a(new byte[]{67, 31, ho.c.f59560y, 31, ho.c.B, 9, 1, 67, 20, 14, 5, 2, 67, 31, ho.c.C});
        if (new File(a11).exists() && b(a11)) {
            return true;
        }
        return new File(a12).exists() && b(a12);
    }

    public static boolean d() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return false;
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (nextElement.isUp() && !nextElement.getInterfaceAddresses().isEmpty()) {
                String a11 = b.a(new byte[]{ho.c.B, ho.c.C, 2, 92});
                String a12 = b.a(new byte[]{28, 28, 28, 92});
                if (a11.equals(nextElement.getName()) || a12.equals(nextElement.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x016e, code lost:
    
        if (r3 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        com.mob.secverify.b.c.a().c("[SecPure] ==>%s", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013e, code lost:
    
        if (r3 == null) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean e(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.a.a.h.e(android.content.Context):boolean");
    }

    private static boolean f(Context context) {
        try {
            throw new Exception("we have exception");
        } catch (Exception e11) {
            String a11 = b.a(new byte[]{15, 3, 1, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 5, 2, ho.c.B, 9, ho.c.H, 2, 13, 0, 66, 3, 31, 66, 54, ho.c.f59560y, 11, 3, ho.c.B, 9, s60.e.f88061c, 2, 5, ho.c.B});
            String a12 = b.a(new byte[]{8, 9, 66, ho.c.H, 3, 14, ho.c.D, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 52, 28, 3, 31, 9, 8, 46, ho.c.H, 5, 8, 11, 9});
            String a13 = b.a(new byte[]{8, 9, 66, ho.c.H, 3, 14, ho.c.D, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 52, 28, 3, 31, 9, 8, 46, ho.c.H, 5, 8, 11, 9});
            String a14 = b.a(new byte[]{5, 2, ho.c.D, 3, 7, 9, 8});
            String a15 = b.a(new byte[]{1, 13, 5, 2});
            String a16 = b.a(new byte[]{4, 13, 2, 8, 0, 9, 36, 3, 3, 7, 9, 8, 33, 9, ho.c.B, 4, 3, 8});
            String a17 = b.a(new byte[]{15, 3, 1, 66, 31, 13, ho.c.C, ho.c.H, 5, 7, 66, 31, ho.c.C, 14, 31, ho.c.B, ho.c.H, 13, ho.c.B, 9, 66, 33, 63, 72, 94});
            int i11 = 0;
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(a11) && (i11 = i11 + 1) == 2) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals(a17) && stackTraceElement.getMethodName().equals(a14)) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals(a12) && stackTraceElement.getMethodName().equals(a15)) {
                    return true;
                }
                if (stackTraceElement.getClassName().equals(a13) && stackTraceElement.getMethodName().equals(a16)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean a(Object obj, String str) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        declaredMethod.setAccessible(true);
        return ((Boolean) declaredMethod.invoke(obj, null)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00eb, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ec, code lost:
    
        com.mob.secverify.b.c.a().c("[SecPure] ==>%s", r15.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r15) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.a.a.h.c(android.content.Context):boolean");
    }

    public static boolean a(String str) {
        return str != null && f40855b.matcher(str).matches();
    }

    private static boolean d(Context context) {
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
        String a11 = b.a(new byte[]{8, 9, 66, ho.c.H, 3, 14, ho.c.D, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 5, 2, 31, ho.c.B, 13, 0, 0, 9, ho.c.H});
        String a12 = b.a(new byte[]{15, 3, 1, 66, 31, 13, ho.c.C, ho.c.H, 5, 7, 66, 31, ho.c.C, 14, 31, ho.c.B, ho.c.H, 13, ho.c.B, 9});
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (applicationInfo.packageName.equals(a11) || applicationInfo.packageName.equals(a12)) {
                return true;
            }
        }
        return false;
    }

    private static String a(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass(b.a(new byte[]{13, 2, 8, ho.c.H, 3, 5, 8, 66, 3, 31, 66, 28, ho.c.H, 3, 28, 9, ho.c.H, ho.c.B, 5, 9, 31}));
            return (String) loadClass.getMethod(ct.d.f46852f, String.class).invoke(loadClass, str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean a(Context context) {
        String a11 = b.a(new byte[]{4, ho.c.B, ho.c.B, 28, 66, 28, ho.c.H, 3, 20, ho.c.f59560y, 36, 3, 31, ho.c.B});
        String a12 = b.a(new byte[]{4, ho.c.B, ho.c.B, 28, 66, 28, ho.c.H, 3, 20, ho.c.f59560y, 60, 3, ho.c.H, ho.c.B});
        String property = System.getProperty(a11);
        String property2 = System.getProperty(a12);
        if (property2 == null) {
            property2 = "-1";
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    public static boolean b(Context context) {
        return d(context) || e(context) || f(context);
    }

    private static boolean b(String str) {
        Process process = null;
        try {
            try {
                process = Runtime.getRuntime().exec("ls -l " + str);
                String readLine = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
                if (readLine != null && readLine.length() >= 4) {
                    readLine.charAt(3);
                }
                process.destroy();
                process.destroy();
                return false;
            } catch (IOException e11) {
                com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e11.toString());
                if (process != null) {
                    process.destroy();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (process != null) {
                process.destroy();
            }
            throw th2;
        }
    }
}
