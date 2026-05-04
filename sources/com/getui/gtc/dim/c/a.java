package com.getui.gtc.dim.c;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.base.annotation.MutableMethod;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.dim.c.d;
import com.huawei.hms.android.SystemUtils;
import com.igexin.assist.util.AssistUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kc.u;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f29923c = new HashMap<String, String>() { // from class: com.getui.gtc.dim.c.a.1
        {
            put("huawei", com.alipay.sdk.m.c.a.f10484a);
            put(AssistUtils.BRAND_HON, "ro.build.version.magic#ro.build.version.emui");
            put("xiaomi", "ro.build.version.incremental");
            put("redmi", "ro.build.version.incremental");
            put("blackshark", "ro.build.version.incremental");
            put("samsang", "ro.build.version.incremental");
            put("vivo", "ro.vivo.os.version");
            put("oppo", "ro.build.version.opporom#ro.build.version.oplusrom");
            put("meizu", "ro.build.display.id");
            put("lenovo", "ro.build.version.incremental");
            put("smartisan", "ro.modversion");
            put("htc", "ro.build.sense.version");
            put("oneplus", "ro.rom.version");
            put("yunos", "ro.cta.yunos.version");
            put("360", "ro.build.uiversion");
            put("nubia", "ro.build.rom.internal.id");
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f29921a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, String> f29924d = new HashMap<String, String>() { // from class: com.getui.gtc.dim.c.a.2
        {
            put("huawei", "com.android.permission.GET_INSTALLED_APP");
            put(AssistUtils.BRAND_HON, "com.android.permission.GET_INSTALLED_APPS");
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f29922b = new HashMap();

    public class b implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        private final IBinder f29927a;

        public b(IBinder iBinder) {
            this.f29927a = iBinder;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f29927a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception e11) {
                    com.getui.gtc.dim.e.b.a(e11);
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f29927a;
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static Location a(Context context, String str) {
        try {
            com.getui.gtc.dim.e.c.a(context, "network".equals(str) ? "android.permission.ACCESS_COARSE_LOCATION" : "android.permission.ACCESS_FINE_LOCATION", true);
            return ((LocationManager) context.getSystemService(u.S)).getLastKnownLocation(str);
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return null;
        }
    }

    @MutableMethod
    public static String b() {
        try {
            return Build.BRAND;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    @com.getui.gtc.base.annotation.MutableMethod
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r9, android.content.Context r10) {
        /*
            java.lang.String r0 = "_id"
            r1 = 0
            r2 = -1
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            r4 = 1
            com.getui.gtc.dim.e.c.a(r10, r3, r4)     // Catch: java.lang.Throwable -> L52
            android.telephony.SubscriptionManager r3 = android.telephony.SubscriptionManager.from(r10)     // Catch: java.lang.Throwable -> L22
            android.telephony.SubscriptionInfo r3 = r3.getActiveSubscriptionInfoForSimSlotIndex(r9)     // Catch: java.lang.Throwable -> L22
            int r3 = r3.getSubscriptionId()     // Catch: java.lang.Throwable -> L22
            if (r3 == r2) goto L19
            goto L56
        L19:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = "invalid subId"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L21
            throw r2     // Catch: java.lang.Throwable -> L21
        L21:
            r2 = r3
        L22:
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L52
            java.lang.String r10 = "content://telephony/siminfo"
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L52
            java.lang.String r10 = "sim_id"
            java.lang.String[] r5 = new java.lang.String[]{r0, r10}     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "sim_id = ?"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L52
            java.lang.String[] r7 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L52
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L55
            boolean r9 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L52
            if (r9 == 0) goto L55
            int r9 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L52
            int r3 = r1.getInt(r9)     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r0 = move-exception
            r9 = r0
            goto L5c
        L55:
            r3 = r2
        L56:
            if (r1 == 0) goto L65
            r1.close()
            goto L65
        L5c:
            com.getui.gtc.dim.e.b.a(r9)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L64
            r1.close()
        L64:
            r3 = r2
        L65:
            return r3
        L66:
            r0 = move-exception
            r9 = r0
            if (r1 == 0) goto L6d
            r1.close()
        L6d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.c.a.c(int, android.content.Context):int");
    }

    @MutableMethod
    public static String d() {
        String str;
        String str2 = "";
        try {
            String b11 = b();
            if (!TextUtils.isEmpty(b11)) {
                String lowerCase = b11.toLowerCase();
                Map<String, String> map = f29921a;
                if (map.containsKey(lowerCase)) {
                    str = map.get(lowerCase);
                } else {
                    Map<String, String> map2 = f29923c;
                    if (map2.containsKey(lowerCase)) {
                        str = map2.get(lowerCase);
                    }
                }
                str2 = com.getui.gtc.dim.e.c.a(str, "");
                return str2;
            }
            String e11 = e();
            if (!TextUtils.isEmpty(e11)) {
                String lowerCase2 = e11.toLowerCase();
                Map<String, String> map3 = f29921a;
                if (map3.containsKey(lowerCase2)) {
                    str = map3.get(lowerCase2);
                } else {
                    Map<String, String> map4 = f29923c;
                    if (map4.containsKey(lowerCase2)) {
                        str = map4.get(lowerCase2);
                    }
                }
                str2 = com.getui.gtc.dim.e.c.a(str, "");
                return str2;
            }
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
        }
        return str2;
    }

    @MutableMethod
    public static String e() {
        try {
            return Build.MANUFACTURER;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    public static String f() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String g(Context context) {
        byte[] hardwareAddress;
        String str = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if ("wlan0".equalsIgnoreCase(nextElement.getName()) && (hardwareAddress = nextElement.getHardwareAddress()) != null && hardwareAddress.length != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b11 : hardwareAddress) {
                        sb2.append(String.format("%02X:", Byte.valueOf(b11)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    str = sb2.toString();
                }
            }
            return str;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return str;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String h(Context context) {
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return "";
            }
            int hashCode = simOperator.hashCode();
            if (hashCode != 49679479) {
                if (hashCode == 49679502) {
                    return simOperator.equals("46011") ? "中国电信" : simOperator;
                }
                switch (hashCode) {
                    case 49679470:
                        return simOperator.equals("46000") ? "中国移动" : simOperator;
                    case 49679471:
                        if (!simOperator.equals("46001")) {
                            return simOperator;
                        }
                        break;
                    case 49679472:
                        return simOperator.equals("46002") ? "中国移动" : simOperator;
                    case 49679473:
                        return simOperator.equals("46003") ? "中国电信" : simOperator;
                    case 49679474:
                        return simOperator.equals("46004") ? "中国移动" : simOperator;
                    case 49679475:
                        return simOperator.equals("46005") ? "中国电信" : simOperator;
                    case 49679476:
                        if (!simOperator.equals("46006")) {
                            return simOperator;
                        }
                        break;
                    case 49679477:
                        return simOperator.equals("46007") ? "中国移动" : simOperator;
                    default:
                        return simOperator;
                }
            } else if (!simOperator.equals("46009")) {
                return simOperator;
            }
            return "中国联通";
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @Deprecated
    public static String i() {
        return "";
    }

    @MutableMethod
    public static String j(Context context) {
        StringBuilder sb2;
        int length;
        try {
            if (!com.getui.gtc.dim.e.c.a(context)) {
                throw new IllegalStateException("network not connected");
            }
            boolean b11 = com.getui.gtc.dim.e.c.b(context);
            boolean c11 = com.getui.gtc.dim.e.c.c(context);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if ((b11 && nextElement.getName().toLowerCase().contains("rmnet")) || (c11 && nextElement.getName().toLowerCase().contains("wlan0"))) {
                    List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<InterfaceAddress> it = interfaceAddresses.iterator();
                    while (it.hasNext()) {
                        InetAddress address = it.next().getAddress();
                        if (!address.isLoopbackAddress()) {
                            arrayList3.add(address.getHostAddress());
                        }
                    }
                    if (b11) {
                        arrayList.addAll(arrayList3);
                    }
                    if (c11) {
                        arrayList2.addAll(arrayList3);
                    }
                }
            }
            if (b11) {
                sb2 = new StringBuilder();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    sb2.append((String) it2.next());
                    sb2.append(",");
                }
                if (sb2.toString().endsWith(",")) {
                    length = sb2.length();
                    sb2.deleteCharAt(length - 1);
                }
                return sb2.toString();
            }
            if (!c11) {
                return "";
            }
            sb2 = new StringBuilder();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                sb2.append((String) it3.next());
                sb2.append(",");
            }
            if (sb2.toString().endsWith(",")) {
                length = sb2.length();
                sb2.deleteCharAt(length - 1);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    public static String k(Context context) {
        StringBuilder sb2;
        int length;
        try {
            if (!com.getui.gtc.dim.e.c.a(context)) {
                throw new IllegalStateException("network not connected");
            }
            boolean b11 = com.getui.gtc.dim.e.c.b(context);
            boolean c11 = com.getui.gtc.dim.e.c.c(context);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                String lowerCase = nextElement.getName().toLowerCase();
                if ((b11 && (lowerCase.contains("rmnet") || lowerCase.contains("ccmni"))) || (c11 && lowerCase.contains("wlan0"))) {
                    List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<InterfaceAddress> it = interfaceAddresses.iterator();
                    boolean z11 = false;
                    while (it.hasNext()) {
                        InetAddress address = it.next().getAddress();
                        if (!address.isLoopbackAddress()) {
                            if (address instanceof Inet6Address) {
                                arrayList3.add(address.getHostAddress());
                            } else if (address instanceof Inet4Address) {
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        if (b11) {
                            arrayList.addAll(arrayList3);
                        }
                        if (c11) {
                            arrayList2.addAll(arrayList3);
                        }
                    }
                }
            }
            if (b11) {
                sb2 = new StringBuilder();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    sb2.append((String) it2.next());
                    sb2.append(",");
                }
                if (sb2.toString().endsWith(",")) {
                    length = sb2.length();
                    sb2.deleteCharAt(length - 1);
                }
                return sb2.toString();
            }
            if (!c11) {
                return "";
            }
            sb2 = new StringBuilder();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                sb2.append((String) it3.next());
                sb2.append(",");
            }
            if (sb2.toString().endsWith(",")) {
                length = sb2.length();
                sb2.deleteCharAt(length - 1);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static WifiInfo l(Context context) {
        try {
            com.getui.gtc.dim.e.c.a(context, "android.permission.ACCESS_WIFI_STATE", true);
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                try {
                    Field declaredField = WifiInfo.class.getDeclaredField("mIpAddress");
                    declaredField.setAccessible(true);
                    declaredField.set(connectionInfo, null);
                    return connectionInfo;
                } catch (Throwable th2) {
                    com.getui.gtc.dim.e.b.a(th2);
                }
            }
            return connectionInfo;
        } catch (Throwable th3) {
            com.getui.gtc.dim.e.b.a(th3);
            return null;
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static List<ScanResult> m(Context context) {
        try {
            if (CommonUtil.isMainThread()) {
                throw new IllegalStateException("cannot get wifi list from the main thread");
            }
            com.getui.gtc.dim.e.c.a(context, "android.permission.ACCESS_FINE_LOCATION", true);
            List<ScanResult> scanResults = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getScanResults();
            if (scanResults == null || scanResults.size() <= 0) {
                return null;
            }
            return scanResults;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:3:0x0002, B:6:0x000b, B:7:0x0026, B:9:0x0037, B:11:0x003d, B:13:0x0044, B:20:0x0094, B:23:0x00af, B:25:0x00ce, B:27:0x00d4, B:29:0x00e8, B:31:0x00ed, B:34:0x00f0, B:38:0x0099, B:47:0x0090, B:52:0x000f, B:54:0x0017, B:57:0x001e, B:58:0x0025), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:3:0x0002, B:6:0x000b, B:7:0x0026, B:9:0x0037, B:11:0x003d, B:13:0x0044, B:20:0x0094, B:23:0x00af, B:25:0x00ce, B:27:0x00d4, B:29:0x00e8, B:31:0x00ed, B:34:0x00f0, B:38:0x0099, B:47:0x0090, B:52:0x000f, B:54:0x0017, B:57:0x001e, B:58:0x0025), top: B:2:0x0002 }] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @com.getui.gtc.base.annotation.MutableMethod
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String n(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.c.a.n(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0171 A[Catch: all -> 0x0163, TryCatch #2 {all -> 0x0163, blocks: (B:23:0x016b, B:25:0x0171, B:26:0x0176, B:56:0x015f, B:68:0x019a, B:70:0x01a2, B:77:0x01a8, B:78:0x01b1), top: B:8:0x0026 }] */
    @com.getui.gtc.base.annotation.MutableMethod
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o(android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.c.a.o(android.content.Context):java.lang.String");
    }

    @MutableMethod
    public static List<PackageInfo> p(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities.size() > 0) {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(com.getui.gtc.dim.e.d.a(it.next().activityInfo.packageName, 0));
                    } catch (Throwable unused) {
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return Collections.EMPTY_LIST;
        }
    }

    @MutableMethod
    public static List<PackageInfo> q(Context context) {
        String str;
        try {
            String lowerCase = b().toLowerCase();
            Map<String, String> map = f29922b;
            if (map.containsKey(lowerCase)) {
                str = map.get(lowerCase);
            } else {
                Map<String, String> map2 = f29924d;
                if (!map2.containsKey(lowerCase)) {
                    throw new RuntimeException("not support brand: ".concat(String.valueOf(lowerCase)));
                }
                str = map2.get(lowerCase);
            }
            com.getui.gtc.dim.e.c.a(context, str, false);
            PackageManager packageManager = context.getPackageManager();
            return (List) packageManager.getClass().getDeclaredMethod(new String(Base64.decode("Z2V0SW5zdGFsbGVkUGFja2FnZXM=", 0)), Integer.TYPE).invoke(packageManager, 5);
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return Collections.EMPTY_LIST;
        }
    }

    @MutableMethod
    public static List<PackageInfo> r(Context context) {
        String[] list;
        File parentFile;
        try {
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            throw new RuntimeException("can not get localDirs above 29");
        }
        File externalCacheDir = context.getExternalCacheDir();
        File parentFile2 = (externalCacheDir == null || (parentFile = externalCacheDir.getParentFile()) == null) ? null : parentFile.getParentFile();
        if (parentFile2 != null && parentFile2.isDirectory() && (list = parentFile2.list(new FilenameFilter() { // from class: com.getui.gtc.dim.c.a.3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                try {
                    if (file.isDirectory()) {
                        if (str.contains(".")) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
                return false;
            }
        })) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                try {
                    arrayList.add(com.getui.gtc.dim.e.d.a(str, 0));
                } catch (Throwable unused) {
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String a() {
        Process process;
        BufferedReader bufferedReader = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            process = com.getui.gtc.dim.e.c.a(new String(Base64.decode("aXAgYWRkcg==", 0)));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (Pattern.matches("^\\d+: ((wlan\\d+)|(eth\\d+)): .*", readLine)) {
                            String substring = readLine.substring(readLine.indexOf(": ") + 2);
                            sb2.append(sb2.length() == 0 ? "" : ",");
                            sb2.append(substring.substring(0, substring.indexOf(": ")));
                            sb2.append("#");
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb2.append(readLine2.substring(readLine2.indexOf("link/ether ") + 11, readLine2.indexOf(" brd")));
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        try {
                            com.getui.gtc.dim.e.b.a(th);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused) {
                                }
                            }
                            if (process != null) {
                                try {
                                    process.destroy();
                                } catch (Throwable unused2) {
                                }
                            }
                            return "";
                        } finally {
                        }
                    }
                }
                String sb3 = sb2.toString();
                try {
                    bufferedReader2.close();
                } catch (Throwable unused3) {
                }
                try {
                    process.destroy();
                } catch (Throwable unused4) {
                }
                return sb3;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            process = null;
        }
    }

    @MutableMethod
    public static String b(int i11, Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new RuntimeException("can not get imsi above 29");
            }
            com.getui.gtc.dim.e.c.a(context, "android.permission.READ_PHONE_STATE", true);
            Object a11 = com.getui.gtc.dim.e.c.a(i11, "getSubscriberId", context);
            return a11 != null ? (String) a11 : "";
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    public static String c() {
        try {
            return Build.MODEL;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    public static String d(int i11, Context context) {
        String str;
        String str2 = "";
        try {
            com.getui.gtc.dim.e.c.a(context, "android.permission.READ_PHONE_STATE", true);
            Object a11 = com.getui.gtc.dim.e.c.a(i11, "getSimSerialNumber", context);
            str = a11 != null ? (String) a11 : "";
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.length() < 20) {
                    return "";
                }
            }
            return str;
        } catch (Throwable th3) {
            str2 = str;
            th = th3;
            com.getui.gtc.dim.e.b.a(th);
            return str2;
        }
    }

    @MutableMethod
    public static String e(Context context) {
        try {
            if (CommonUtil.isMainThread()) {
                throw new RuntimeException("cannot get advertisingId from main thread");
            }
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            ServiceConnectionC0352a serviceConnectionC0352a = new ServiceConnectionC0352a();
            if (!context.bindService(intent, serviceConnectionC0352a, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                if (serviceConnectionC0352a.f29925a) {
                    throw new IllegalStateException();
                }
                serviceConnectionC0352a.f29925a = true;
                return new b(serviceConnectionC0352a.f29926b.poll(3000L, TimeUnit.MILLISECONDS)).a();
            } finally {
                context.unbindService(serviceConnectionC0352a);
            }
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    public static String f(Context context) {
        Object invoke;
        try {
            com.getui.gtc.dim.e.c.a(context, "android.permission.READ_PHONE_STATE", true);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 26) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                invoke = cls.getMethod(ct.d.f46852f, String.class).invoke(cls, "ro.serialno");
            } else {
                if (i11 >= 29) {
                    throw new RuntimeException("can not get serialnumber above 29");
                }
                Class<?> cls2 = Class.forName("android.os.Build");
                invoke = cls2.getMethod("getSerial", null).invoke(cls2, null);
            }
            return (String) invoke;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.getui.gtc.base.annotation.MutableMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<android.content.pm.PackageInfo> g() {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4e
            r2 = 33
            if (r1 >= r2) goto L52
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = "cG0gbGlzdCBwYWNrYWdlcw=="
            r4 = 0
            byte[] r3 = android.util.Base64.decode(r3, r4)     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Process r2 = com.getui.gtc.dim.e.c.a(r2)     // Catch: java.lang.Throwable -> L4e
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4a
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4a
            java.io.InputStream r6 = r2.getInputStream()     // Catch: java.lang.Throwable -> L4a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4a
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4a
        L2a:
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L41
            java.lang.String r5 = ":"
            java.lang.String[] r0 = r0.split(r5)     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L2a
            android.content.pm.PackageInfo r0 = com.getui.gtc.dim.e.d.a(r0, r4)     // Catch: java.lang.Throwable -> L2a
            r1.add(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2a
        L41:
            r3.close()     // Catch: java.lang.Throwable -> L44
        L44:
            r2.destroy()     // Catch: java.lang.Throwable -> L47
        L47:
            return r1
        L48:
            r0 = move-exception
            goto L5a
        L4a:
            r1 = move-exception
            r3 = r0
        L4c:
            r0 = r1
            goto L5a
        L4e:
            r1 = move-exception
            r2 = r0
            r3 = r2
            goto L4c
        L52:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "can not get al by pm above 33"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L5a:
            com.getui.gtc.dim.e.b.a(r0)     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r2 == 0) goto L67
            r2.destroy()     // Catch: java.lang.Throwable -> L67
        L67:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L6a:
            r0 = move-exception
            if (r3 == 0) goto L70
            r3.close()     // Catch: java.lang.Throwable -> L70
        L70:
            if (r2 == 0) goto L75
            r2.destroy()     // Catch: java.lang.Throwable -> L75
        L75:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.c.a.g():java.util.List");
    }

    @MutableMethod
    public static List<PackageInfo> h() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("can not get al by us at main thread");
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 10000; i11 <= 19999; i11++) {
                PackageInfo a11 = com.getui.gtc.dim.e.d.a(i11);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return Collections.EMPTY_LIST;
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String i(Context context) {
        try {
            com.getui.gtc.dim.e.c.a(context, yk.e.f100168b, true);
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                throw new IllegalStateException("getSystemService: CONNECTIVITY_SERVICE failed");
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                throw new IllegalStateException("getActiveNetworkInfo failed");
            }
            if (!activeNetworkInfo.isAvailable()) {
                throw new IllegalStateException("no available activeNetwork");
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                return "WIFI";
            }
            int subtype = activeNetworkInfo.getSubtype();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                subtype = telephonyManager.getNetworkType();
            }
            if (subtype == 20) {
                return "5G";
            }
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return "NULL";
            }
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "NULL";
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String a(int i11, Context context) {
        String deviceId;
        try {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                throw new RuntimeException("can not get imei above 29");
            }
            if ("vivo".equalsIgnoreCase(b()) && i12 < 26) {
                throw new RuntimeException("do not get imei from vivo below 29");
            }
            com.getui.gtc.dim.e.c.a(context, "android.permission.READ_PHONE_STATE", true);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return (telephonyManager == null || i11 < 0 || (deviceId = telephonyManager.getDeviceId(i11)) == null) ? "" : deviceId;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String b(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new RuntimeException("can not get imsi above 29");
            }
            com.getui.gtc.dim.e.c.a(context, "android.permission.READ_PHONE_STATE", true);
            String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            return !TextUtils.isEmpty(subscriberId) ? subscriberId : "";
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String c(Context context) {
        Throwable th2;
        String str;
        try {
            com.getui.gtc.dim.e.c.a(context, "android.permission.READ_PHONE_STATE", true);
            str = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() < 20) {
                        return "";
                    }
                }
                return str;
            } catch (Throwable th3) {
                th2 = th3;
                com.getui.gtc.dim.e.b.a(th2);
                return str;
            }
        } catch (Throwable th4) {
            th2 = th4;
            str = "";
        }
    }

    @MutableMethod
    public static String d(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String a(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new RuntimeException("can not get imei above 29");
            }
            com.getui.gtc.dim.e.c.a(context, "android.permission.READ_PHONE_STATE", true);
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            return !TextUtils.isEmpty(deviceId) ? deviceId : "";
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static String b(Context context, String str) {
        try {
            com.getui.gtc.dim.e.c.a(context, "android.permission.ACCESS_WIFI_STATE", true);
            if (!com.getui.gtc.dim.e.c.c(context)) {
                return "2##";
            }
            int i11 = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getDhcpInfo().gateway;
            String b11 = com.getui.gtc.dim.e.c.b((i11 & 255) + "." + ((i11 >> 8) & 255) + "." + ((i11 >> 16) & 255) + "." + ((i11 >> 24) & 255));
            return "1#" + str.replace("\"", "") + "#" + b11;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    public static String a(Context context, boolean z11) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("can not get oaid at main thread");
            }
            d.a();
            d.a aVar = d.f29929a;
            if (aVar != null && context != null) {
                d.f29930b = context.getApplicationContext();
                if (d.b()) {
                    d.f29931c = aVar.c(d.f29930b);
                }
            }
            String c11 = d.f29931c ? d.c() : null;
            if (!SystemUtils.PRODUCT_HONOR.equals(d.f29932d)) {
                return c11;
            }
            String b11 = b(context, z11);
            if (b11 == null) {
                b11 = "";
            }
            return b11 + '#' + c11;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.a(th2);
            return "";
        }
    }

    @MutableMethod
    private static String b(Context context, boolean z11) {
        if (!z11) {
            try {
                if (d.i.c()) {
                    com.getui.gtc.dim.e.b.a("support honor oaid");
                    return "";
                }
            } catch (Throwable th2) {
                com.getui.gtc.dim.e.b.a(th2);
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new RuntimeException("can not get oaid at main thread");
        }
        d.h hVar = new d.h();
        if (hVar.a(context)) {
            hVar.c(context);
            return hVar.b(context);
        }
        return "";
    }

    /* renamed from: com.getui.gtc.dim.c.a$a, reason: collision with other inner class name */
    public class ServiceConnectionC0352a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f29925a = false;

        /* renamed from: b, reason: collision with root package name */
        final LinkedBlockingQueue<IBinder> f29926b = new LinkedBlockingQueue<>(1);

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f29926b.put(iBinder);
            } catch (Throwable th2) {
                com.getui.gtc.dim.e.b.a(th2);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
