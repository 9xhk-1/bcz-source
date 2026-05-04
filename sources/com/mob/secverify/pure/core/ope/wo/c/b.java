package com.mob.secverify.pure.core.ope.wo.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Enumeration;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f41060a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i11 = 0; i11 < digest.length; i11++) {
                int i12 = digest[i11];
                if (i12 < 0) {
                    i12 += 256;
                }
                if (i12 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i12));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static String b(Context context, String str) {
        try {
            return c.a(a(a(context, str)), com.mob.secverify.pure.core.ope.wo.a.b.b().substring(0, 16));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static int c(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return ((address[1] & 255) << 8) | (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16);
        } catch (UnknownHostException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public static PublicKey d(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(f.a(str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String e(String str) {
        try {
            return URLEncoder.encode(a(str, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCbRkBR4leALApkWRp2ng8zJ2WgI7YEqtMwW9Q1tmRzDLPNhH0ugACfbiStBG4ybdYNHzRlxvOwQ7R0MeN56qEPsv6qieg/HiRXBnQ2hQ2hypo9JHqHx8BX54ESZ+BIf0imjGTcxtHvbzYA04ckmH5Enl2Pkd+R/RZuMK589C7KwQIDAQAB"), "UTF-8");
        } catch (Exception e11) {
            Log.d("SecPure", "encode error " + e11.getMessage());
            e11.printStackTrace();
            return "";
        }
    }

    public static boolean c(Context context, String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("androidx.core.content.ContextCompat");
            } catch (Exception unused) {
                cls = null;
            }
        } catch (Exception unused2) {
            cls = Class.forName("androidx.core.content.ContextCompat");
        }
        if (cls == null) {
            return false;
        }
        try {
            Method method = cls.getMethod("checkSelfPermission", Context.class, String.class);
            method.setAccessible(true);
            return ((Integer) method.invoke(null, context, str)).intValue() == 0;
        } catch (Exception unused3) {
            return false;
        }
    }

    public static String b(String str) {
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 >= 0) {
            str = str.substring(0, indexOf3);
        }
        int indexOf4 = str.indexOf(63);
        return indexOf4 >= 0 ? str.substring(0, indexOf4) : str;
    }

    public static int a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.getType() == 1) {
                    return a(connectivityManager) ? 1 : 2;
                }
                if (activeNetworkInfo.getType() == 0) {
                    return 0;
                }
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    public static String b(Context context) {
        try {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!nextElement.getName().toLowerCase().contains("wlan") && !nextElement.getName().toLowerCase().contains("tun")) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress()) {
                            if (nextElement2 instanceof Inet4Address) {
                                sb2.append(nextElement2.getHostAddress());
                                sb2.append(",");
                            }
                            if (nextElement2 instanceof Inet6Address) {
                                sb3.append(nextElement2.getHostAddress());
                                sb3.append(",");
                            }
                        }
                    }
                }
            }
            if (sb2.length() > 0) {
                sb2 = sb2.delete(sb2.length() - 1, sb2.length());
            }
            if (sb3.length() > 0) {
                sb3 = sb3.delete(sb3.length() - 1, sb3.length());
            }
            return sb2.toString() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + sb3.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static byte[] a(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            if (packageInfo.packageName.equals(str)) {
                return packageInfo.signatures[0].toByteArray();
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            int length = digest.length;
            char[] cArr = new char[length * 2];
            for (int i11 = 0; i11 < length; i11++) {
                byte b11 = digest[i11];
                int i12 = i11 * 2;
                char[] cArr2 = f41060a;
                cArr[i12] = cArr2[(b11 & 240) >> 4];
                cArr[i12 + 1] = cArr2[(byte) (b11 & 15)];
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, null)).booleanValue();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public static String a(String str, String str2) {
        try {
            PublicKey d11 = d(str2);
            Cipher cipher = Cipher.getInstance(new String(f.a("UlNBL0VDQi9QS0NTMVBhZGRpbmc=")));
            cipher.init(1, d11);
            return e.a(cipher.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean a() {
        try {
            Method method = Environment.class.getMethod("isExternalStorageLegacy", null);
            if (method == null) {
                return false;
            }
            method.setAccessible(true);
            return ((Boolean) method.invoke(null, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
