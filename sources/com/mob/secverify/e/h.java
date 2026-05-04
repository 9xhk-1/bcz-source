package com.mob.secverify.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.mob.MobSDK;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h {
    public static String a() {
        if (!e() || !a(MobSDK.getContext())) {
            return "";
        }
        try {
            return (String) ReflectHelper.invokeInstanceMethod((TelephonyManager) MobSDK.getContext().getSystemService("phone"), a("67657453696D4F70657261746F72"), new Object[0]);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Get op code err");
            return "";
        }
    }

    public static int b() {
        try {
            String str = (String) ReflectHelper.invokeInstanceMethod((TelephonyManager) MobSDK.getContext().getSystemService("phone"), a("67657453696D4F70657261746F72"), new Object[0]);
            if (!"46000".equals(str) && !"46002".equals(str) && !"46004".equals(str) && !"46007".equals(str)) {
                if (!"46001".equals(str) && !"46006".equals(str) && !"46009".equals(str)) {
                    if ("46003".equals(str) || "46005".equals(str)) {
                        return 3;
                    }
                    return "46011".equals(str) ? 3 : 0;
                }
                return 2;
            }
            return 1;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure][%s][%s] ==>%s", "Util", "isMobileDataEnabled", "Check mobile data encountered exception");
            return 0;
        }
    }

    public static String c() {
        try {
            return (String) ReflectHelper.invokeInstanceMethod((TelephonyManager) MobSDK.getContext().getSystemService("phone"), a("67657453696D4F70657261746F72"), new Object[0]);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure][%s][%s] ==>%s", "Util", "getMNC", "Check mobile data encountered exception");
            return null;
        }
    }

    public static String d() {
        int b11 = b();
        return b11 != 1 ? b11 != 2 ? b11 != 3 ? "UNKNOWN" : "CTCC" : "CUCC" : "CMCC";
    }

    public static boolean e() {
        return ((TelephonyManager) MobSDK.getContext().getSystemService("phone")).getSimState() == 5;
    }

    public static String f() {
        String str = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        str = nextElement.getHostAddress();
                    }
                }
            }
            return str;
        } catch (SocketException e11) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", pq.b.f81108a, "getPrivateIp", e11.toString());
            return str;
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            return true;
        }
        NetworkInfo d11 = d(context);
        return d11 != null && d11.isAvailable() && d11.getType() == 1;
    }

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((("0123456789ABCDEF".indexOf(charArray[i12]) * 16) + "0123456789ABCDEF".indexOf(charArray[i12 + 1])) & 255);
        }
        return new String(bArr);
    }

    private static NetworkInfo d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        try {
            if (!DeviceHelper.getInstance(context).checkPermission(yk.e.f100168b) || connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return true;
        }
        NetworkInfo d11 = d(context);
        return d11 != null && d11.isAvailable();
    }

    public static boolean a(Context context) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getSystemService("connectivity"), null)).booleanValue();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure][%s][%s] ==>%s", "Util", "isMobileDataEnabled", "Check mobile data encountered exception");
            return false;
        }
    }

    public static String a(int i11, String str) {
        int stringRes = ResHelper.getStringRes(MobSDK.getContext(), "sec_verify_error_msg_" + i11);
        return stringRes > 0 ? MobSDK.getContext().getString(stringRes) : str;
    }

    public static String a(String str, String str2) {
        int stringRes = ResHelper.getStringRes(MobSDK.getContext(), "sec_verify_page_one_key_login_" + str);
        return stringRes > 0 ? com.mob.secverify.pure.b.g.a(stringRes) : str2;
    }

    public static String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        stringWriter.getBuffer().getClass();
        return stringWriter.getBuffer().toString();
    }
}
