package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import ba0.j1;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8961a = "cn.com.chinatelecom.account.api.d.d";

    /* renamed from: b, reason: collision with root package name */
    private static String f8962b = "";

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f8963c = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: d, reason: collision with root package name */
    private static String f8964d = "";

    public static String a() {
        String uuid = UUID.randomUUID().toString();
        try {
            uuid = UUID.nameUUIDFromBytes((uuid + System.currentTimeMillis() + Math.random()).getBytes("utf8")).toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return !TextUtils.isEmpty(uuid) ? uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "") : uuid;
    }

    private static String b(Context context, String str) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass(l.a(new byte[]{13, 2, 8, ho.c.H, 3, 5, 8, 66, 3, 31, 66, 28, ho.c.H, 3, 28, 9, ho.c.H, ho.c.B, 5, 9, 31}));
            return (String) loadClass.getMethod(ct.d.f46852f, String.class).invoke(loadClass, str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c() {
        String a11 = l.a(new byte[]{67, 31, ho.c.f59560y, 31, ho.c.B, 9, 1, 67, 14, 5, 2, 67, 31, ho.c.C});
        String a12 = l.a(new byte[]{67, 31, ho.c.f59560y, 31, ho.c.B, 9, 1, 67, 20, 14, 5, 2, 67, 31, ho.c.C});
        if (new File(a11).exists() && c(a11)) {
            return true;
        }
        return new File(a12).exists() && c(a12);
    }

    public static boolean d() {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return false;
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (nextElement.isUp() && !nextElement.getInterfaceAddresses().isEmpty()) {
                String a11 = l.a(new byte[]{ho.c.B, ho.c.C, 2, 92});
                String a12 = l.a(new byte[]{28, 28, 28, 92});
                if (a11.equals(nextElement.getName()) || a12.equals(nextElement.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String e(Context context) {
        return c.b(context, "key_d_i_u", "");
    }

    private static String f(Context context) {
        String str = "";
        try {
            try {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            String lowerCase = !TextUtils.isEmpty(str) ? str.toLowerCase() : UUID.randomUUID().toString();
            return TextUtils.isEmpty(lowerCase) ? "default" : b(lowerCase + "default");
        } catch (Throwable th3) {
            th3.printStackTrace();
            return "default";
        }
    }

    private static boolean g(Context context) {
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
        String a11 = l.a(new byte[]{8, 9, 66, ho.c.H, 3, 14, ho.c.D, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 5, 2, 31, ho.c.B, 13, 0, 0, 9, ho.c.H});
        String a12 = l.a(new byte[]{15, 3, 1, 66, 31, 13, ho.c.C, ho.c.H, 5, 7, 66, 31, ho.c.C, 14, 31, ho.c.B, ho.c.H, 13, ho.c.B, 9});
        for (ApplicationInfo applicationInfo : installedApplications) {
            if (applicationInfo.packageName.equals(a11) || applicationInfo.packageName.equals(a12)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(Context context) {
        FileReader fileReader;
        Throwable th2;
        BufferedReader bufferedReader;
        try {
            String a11 = l.a(new byte[]{67, 28, ho.c.H, 3, 15, 67});
            String a12 = l.a(new byte[]{67, 1, 13, 28, 31});
            String a13 = l.a(new byte[]{15, 3, 1, 66, 31, 13, ho.c.C, ho.c.H, 5, 7, 66, 31, ho.c.C, 14, 31, ho.c.B, ho.c.H, 13, ho.c.B, 9});
            String a14 = l.a(new byte[]{52, 28, 3, 31, 9, 8, 46, ho.c.H, 5, 8, 11, 9, 66, 6, 13, ho.c.H});
            HashSet<String> hashSet = new HashSet();
            fileReader = new FileReader(a11 + Process.myPid() + a12);
            try {
                bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!readLine.endsWith(".so") && !readLine.endsWith(j1.f6559f)) {
                        }
                        hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        if (fileReader == null) {
                            throw th2;
                        }
                        try {
                            fileReader.close();
                            throw th2;
                        } catch (Exception e12) {
                            e12.printStackTrace();
                            throw th2;
                        }
                    }
                }
                for (String str : hashSet) {
                    if (str.contains(a13)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        try {
                            fileReader.close();
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                        return true;
                    }
                    if (str.contains(a14)) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e15) {
                            e15.printStackTrace();
                        }
                        try {
                            fileReader.close();
                        } catch (Exception e16) {
                            e16.printStackTrace();
                        }
                        return true;
                    }
                }
                try {
                    bufferedReader.close();
                } catch (Exception e17) {
                    e17.printStackTrace();
                }
                try {
                    fileReader.close();
                    return false;
                } catch (Exception e18) {
                    e18.printStackTrace();
                    return false;
                }
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            fileReader = null;
            th2 = th5;
            bufferedReader = null;
        }
    }

    private static boolean i(Context context) {
        try {
            throw new Exception("we have exception");
        } catch (Exception e11) {
            String a11 = l.a(new byte[]{15, 3, 1, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 5, 2, ho.c.B, 9, ho.c.H, 2, 13, 0, 66, 3, 31, 66, 54, ho.c.f59560y, 11, 3, ho.c.B, 9, s60.e.f88061c, 2, 5, ho.c.B});
            String a12 = l.a(new byte[]{8, 9, 66, ho.c.H, 3, 14, ho.c.D, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 52, 28, 3, 31, 9, 8, 46, ho.c.H, 5, 8, 11, 9});
            String a13 = l.a(new byte[]{8, 9, 66, ho.c.H, 3, 14, ho.c.D, 66, 13, 2, 8, ho.c.H, 3, 5, 8, 66, 20, 28, 3, 31, 9, 8, 66, 52, 28, 3, 31, 9, 8, 46, ho.c.H, 5, 8, 11, 9});
            String a14 = l.a(new byte[]{5, 2, ho.c.D, 3, 7, 9, 8});
            String a15 = l.a(new byte[]{1, 13, 5, 2});
            String a16 = l.a(new byte[]{4, 13, 2, 8, 0, 9, 36, 3, 3, 7, 9, 8, 33, 9, ho.c.B, 4, 3, 8});
            String a17 = l.a(new byte[]{15, 3, 1, 66, 31, 13, ho.c.C, ho.c.H, 5, 7, 66, 31, ho.c.C, 14, 31, ho.c.B, ho.c.H, 13, ho.c.B, 9, 66, 33, 63, 72, 94});
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

    public static String a(Context context) {
        if (TextUtils.isEmpty(f8964d)) {
            String e11 = e(context);
            f8964d = e11;
            if (TextUtils.isEmpty(e11)) {
                String f11 = f(context);
                f8964d = f11;
                a(context, f11);
            }
        }
        return f8964d;
    }

    private static String b(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i11 = 0;
            for (byte b11 : digest) {
                int i12 = i11 + 1;
                cArr2[i11] = cArr[(b11 >>> 4) & 15];
                i11 += 2;
                cArr2[i12] = cArr[b11 & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c(Context context) {
        return g(context) || h(context) || i(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        r13.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.d.d.d(android.content.Context):boolean");
    }

    private static void a(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        c.a(context, "key_d_i_u", str);
    }

    public static StringBuffer b() {
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

    private static boolean c(String str) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("ls -l " + str);
            String readLine = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
            if (readLine != null && readLine.length() >= 4) {
                char charAt = readLine.charAt(3);
                if (charAt == 's' || charAt == 'x') {
                    process.destroy();
                    return true;
                }
            }
            process.destroy();
            return false;
        } catch (Throwable th2) {
            if (process != null) {
                process.destroy();
            }
            throw th2;
        }
    }

    public static boolean a(Object obj, String str) {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        declaredMethod.setAccessible(true);
        return ((Boolean) declaredMethod.invoke(obj, null)).booleanValue();
    }

    public static boolean b(Context context) {
        String a11 = l.a(new byte[]{4, ho.c.B, ho.c.B, 28, 66, 28, ho.c.H, 3, 20, ho.c.f59560y, 36, 3, 31, ho.c.B});
        String a12 = l.a(new byte[]{4, ho.c.B, ho.c.B, 28, 66, 28, ho.c.H, 3, 20, ho.c.f59560y, 60, 3, ho.c.H, ho.c.B});
        String property = System.getProperty(a11);
        String property2 = System.getProperty(a12);
        if (property2 == null) {
            property2 = "-1";
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    public static boolean a(String str) {
        return str != null && f8963c.matcher(str).matches();
    }
}
