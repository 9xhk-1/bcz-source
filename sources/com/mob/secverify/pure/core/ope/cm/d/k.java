package com.mob.secverify.pure.core.ope.cm.d;

import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k {
    public static String a() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!nextElement.getName().toLowerCase().contains("wlan")) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && !nextElement2.isLinkLocalAddress()) {
                            String hostAddress = nextElement2.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress) && a(hostAddress)) {
                                sb2.append(hostAddress);
                                sb2.append(",");
                            }
                        }
                    }
                }
            }
            return sb2.toString();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
            return "";
        }
    }

    private static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("10.");
    }

    public static String a(boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (z11 && nextElement.getName().toLowerCase().contains("wlan")) {
                }
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet6Address) && !nextElement2.isLinkLocalAddress()) {
                        String hostAddress = nextElement2.getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress)) {
                            if (z12) {
                                if (hostAddress.startsWith("2409:89")) {
                                    sb2.append(hostAddress);
                                    sb2.append(",");
                                }
                            } else {
                                sb2.append(hostAddress);
                                sb2.append(",");
                            }
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(sb2)) {
                sb2 = sb2.delete(sb2.length() - 1, sb2.length());
            }
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "onlyMobileDataIp " + z11 + " IPV6 ip: " + sb2.toString());
            return sb2.toString();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
            return "";
        }
    }
}
