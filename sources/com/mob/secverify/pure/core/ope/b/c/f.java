package com.mob.secverify.pure.core.ope.b.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.mob.MobSDK;
import com.mob.tools.utils.DeviceHelper;
import java.io.File;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f40879b;

    /* renamed from: a, reason: collision with root package name */
    protected DeviceHelper f40880a = DeviceHelper.getInstance(MobSDK.getContext());

    private f() {
    }

    public static f a() {
        if (f40879b == null) {
            synchronized (f.class) {
                try {
                    if (f40879b == null) {
                        f40879b = new f();
                    }
                } finally {
                }
            }
        }
        return f40879b;
    }

    public static String b() {
        String str = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            str = nextElement.getHostAddress();
                        }
                    }
                }
            }
            return str;
        } catch (SocketException e11) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "ParamsBuilder", "getPrivateIp", e11.toString());
            return str;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Exception e11) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "ParamsBuilder", "shaEncrypted", e11.toString());
            return null;
        }
    }

    public static String a(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e11) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "ParamsBuilder", "getMd5", e11.toString());
            packageInfo = null;
        }
        if (packageInfo != null) {
            int i11 = packageInfo.applicationInfo.flags;
            try {
                byte[] byteArray = packageInfo.signatures[0].toByteArray();
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                byte[] digest = messageDigest.digest();
                String str = "";
                for (int i12 = 0; i12 < digest.length; i12++) {
                    if (i12 != 0) {
                        str = str + ":";
                    }
                    String hexString = Integer.toHexString(digest[i12] & 255);
                    if (hexString.length() == 1) {
                        str = str + "0";
                    }
                    str = str + hexString;
                }
                return str;
            } catch (Exception e12) {
                com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "ParamsBuilder", "getMd5", e12.toString());
            }
        }
        return null;
    }

    public g a(String str, String str2) {
        String p11 = com.mob.secverify.pure.b.b.p();
        String substring = p11.substring(0, 18);
        String substring2 = p11.substring(18);
        String u11 = com.mob.secverify.pure.b.b.u();
        String[] split = com.mob.secverify.pure.b.b.b(str, u11.substring(0, 16), u11.substring(16, 32), str2).split(":::");
        TreeMap<String, Object> treeMap = new TreeMap<>();
        try {
            treeMap.put("apiKey", str);
            treeMap.put("params", split[0]);
            treeMap.put("paramsKey", split[1]);
            String str3 = split[2];
            HashMap<String, Object> hashMap = new HashMap<>(16);
            if (!TextUtils.isEmpty(str3)) {
                treeMap.put(HwPayConstant.KEY_SIGN, str3);
                treeMap.put("sign_Type", "B");
                hashMap.put(HwPayConstant.KEY_SIGN, str3);
                hashMap.put("api-protocol", "1.1");
            }
            g gVar = new g();
            gVar.a("POST");
            gVar.b(substring + substring2);
            gVar.a(0);
            gVar.b(treeMap);
            gVar.a((ArrayList<File>) null);
            gVar.a(hashMap);
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
