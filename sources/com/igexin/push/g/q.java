package com.igexin.push.g;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.getui.gtc.base.util.CommonUtil;
import com.igexin.push.core.b.y;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38749a = "Task145PhoneDataUtils";

    private static int a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if ("wlan0".equalsIgnoreCase(nextElement.getName())) {
                    for (InterfaceAddress interfaceAddress : nextElement.getInterfaceAddresses()) {
                        InetAddress address = interfaceAddress.getAddress();
                        short networkPrefixLength = interfaceAddress.getNetworkPrefixLength();
                        if (!address.isLoopbackAddress() && (address instanceof Inet4Address)) {
                            com.igexin.c.a.c.a.b(f38749a, "IPv4 maskLength: ".concat(String.valueOf((int) networkPrefixLength)));
                            if (networkPrefixLength > 0) {
                                return networkPrefixLength;
                            }
                            return 24;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        return 24;
    }

    public static com.igexin.push.core.b.d b(Context context) {
        try {
            if (CommonUtil.hasPermission(context, (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) ? "android.permission.ACCESS_COARSE_LOCATION" : "android.permission.ACCESS_FINE_LOCATION", false) && d(context)) {
                return e(context);
            }
        } catch (Throwable unused) {
        }
        return new com.igexin.push.core.b.d();
    }

    private static y c(Context context) {
        com.igexin.c.a.c.a.b(f38749a, "SLMA getDhcpWifiInfo.");
        y yVar = new y();
        try {
            CommonUtil.hasPermission(context, "android.permission.ACCESS_WIFI_STATE", false);
            DhcpInfo dhcpInfo = ((WifiManager) context.getSystemService("wifi")).getDhcpInfo();
            yVar.f37929a = a(dhcpInfo.gateway);
            yVar.f37930b = a(dhcpInfo.ipAddress);
            yVar.f37931c = a();
            return yVar;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return yVar;
        }
    }

    private static boolean d(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimState() == 5;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    private static com.igexin.push.core.b.d e(Context context) {
        int mcc;
        int mnc;
        int lac;
        int i11;
        int i12;
        List<CellInfo> allCellInfo = ((TelephonyManager) context.getSystemService("phone")).getAllCellInfo();
        if (allCellInfo == null || allCellInfo.isEmpty()) {
            return new com.igexin.push.core.b.d();
        }
        int i13 = 0;
        int i14 = 0;
        long j11 = 0;
        int i15 = 0;
        int i16 = 0;
        for (CellInfo cellInfo : allCellInfo) {
            if (cellInfo.isRegistered()) {
                if (cellInfo instanceof CellInfoGsm) {
                    CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                    mcc = cellIdentity.getMcc();
                    mnc = cellIdentity.getMnc();
                    lac = cellIdentity.getLac();
                    j11 = cellIdentity.getCid();
                    i11 = 1;
                } else if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                    mnc = cellIdentity2.getSystemId();
                    int networkId = cellIdentity2.getNetworkId();
                    j11 = cellIdentity2.getBasestationId();
                    i12 = networkId;
                    i14 = 2;
                    i15 = mnc;
                    i16 = i12;
                } else if (cellInfo instanceof CellInfoWcdma) {
                    CellIdentityWcdma cellIdentity3 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                    mcc = cellIdentity3.getMcc();
                    mnc = cellIdentity3.getMnc();
                    lac = cellIdentity3.getLac();
                    j11 = cellIdentity3.getCid();
                    i11 = 4;
                } else if (cellInfo instanceof CellInfoLte) {
                    CellIdentityLte cellIdentity4 = ((CellInfoLte) cellInfo).getCellIdentity();
                    mcc = cellIdentity4.getMcc();
                    mnc = cellIdentity4.getMnc();
                    lac = cellIdentity4.getTac();
                    j11 = cellIdentity4.getCi();
                    i11 = 3;
                } else if ("android.telephony.CellInfoNr".equals(cellInfo.getClass().getName())) {
                    try {
                        Method method = Class.forName("android.telephony.CellInfoNr").getMethod("getCellIdentity", null);
                        Class<?> cls = Class.forName("android.telephony.CellIdentityNr");
                        Method method2 = cls.getMethod("getMccString", null);
                        Method method3 = cls.getMethod("getMncString", null);
                        Method method4 = cls.getMethod("getTac", null);
                        Method method5 = cls.getMethod("getNci", null);
                        Object invoke = method.invoke(cellInfo, null);
                        String str = (String) method2.invoke(invoke, null);
                        String str2 = (String) method3.invoke(invoke, null);
                        i13 = Integer.parseInt(str);
                        i15 = Integer.parseInt(str2);
                        i16 = ((Integer) method4.invoke(invoke, null)).intValue();
                        j11 = ((Long) method5.invoke(invoke, null)).longValue();
                        i14 = 6;
                    } catch (Throwable th2) {
                        com.igexin.c.a.c.a.a(th2);
                    }
                }
                i12 = lac;
                i14 = i11;
                i13 = mcc;
                i15 = mnc;
                i16 = i12;
            }
        }
        com.igexin.push.core.b.d dVar = new com.igexin.push.core.b.d();
        dVar.f37778a = i13;
        dVar.f37779b = i15;
        dVar.f37780c = i16;
        dVar.f37781d = j11;
        dVar.f37782e = i14;
        return dVar;
    }

    private static boolean f(Context context) {
        return CommonUtil.hasPermission(context, (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) ? "android.permission.ACCESS_COARSE_LOCATION" : "android.permission.ACCESS_FINE_LOCATION", false);
    }

    private static String a(int i11) {
        return (i11 & 255) + "." + ((i11 >> 8) & 255) + "." + ((i11 >> 16) & 255) + "." + ((i11 >> 24) & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (r6 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.g.q.b():java.lang.String");
    }

    public static String a(Context context) {
        String str;
        String str2 = "";
        try {
            str = c(context).f37930b;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            com.igexin.c.a.c.a.b(f38749a, "new get self iv4 by dhcp, ip = ".concat(String.valueOf(str)));
            if (!TextUtils.isEmpty(str)) {
                if ("0.0.0.0".equalsIgnoreCase(str)) {
                }
                return str;
            }
            for (String str3 : b().split("#")) {
                if (str3.contains("wlan0/ipv4")) {
                    String replace = str3.replace("wlan0/ipv4=", "");
                    if (replace.contains("/")) {
                        str = replace.split("/")[0];
                    }
                    str2 = str;
                    com.igexin.c.a.c.a.b(f38749a, "new get self iv4 by sl, ip = ".concat(String.valueOf(str2)));
                    return str2;
                }
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            str2 = str;
            com.igexin.c.a.c.a.a(th);
            return str2;
        }
    }
}
