package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class NetworkUtil {
    private static final int INVALID_RSSI = -127;
    private static final String STR_NSA = "5G_NSA";
    private static final String STR_SA = "5G_SA";
    private static final String TAG = "NetworkUtil";
    private static final int TYPE_WIFI_P2P = 13;
    public static final int UNAVAILABLE = Integer.MAX_VALUE;
    public static volatile int networkTypeByReceiver;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    public static int getCurrentNetworkType() {
        return networkTypeByReceiver;
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(getDnsServerIpsFromConnectionManager(context));
    }

    @SuppressLint({"MissingPermission"})
    private static String[] getDnsServerIpsFromConnectionManager(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        LinkedList linkedList = new LinkedList();
        if (context != null && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                            Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                            while (it.hasNext()) {
                                linkedList.add(it.next().getHostAddress());
                            }
                        }
                    }
                }
            } catch (SecurityException e11) {
                Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e11.getClass().getSimpleName());
            } catch (RuntimeException e12) {
                Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e12.getClass().getSimpleName());
            }
        }
        return linkedList.isEmpty() ? new String[0] : (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public static String getHost(String str) {
        return TextUtils.isEmpty(str) ? "" : as.e.b(str);
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return Integer.MAX_VALUE;
            }
            final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, null);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    declaredMethod.setAccessible(true);
                    return null;
                }
            });
            return ((Integer) declaredMethod.invoke(signalStrength, null)).intValue();
        } catch (IllegalAccessException unused) {
            Logger.i(TAG, str + " : cannot access");
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            Logger.i(TAG, str + " : function not found");
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            Logger.i(TAG, str + " : InvocationTargetException");
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, str + " : throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        List cellSignalStrengths;
        int cqi;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrength, "getLteCqi");
                }
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                    return cqi;
                }
            } catch (Throwable th2) {
                Logger.i(TAG, "getLteCqi: throwable:" + th2.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrp(Context context) {
        List cellSignalStrengths;
        int rsrp;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrength, "getLteRsrp");
                }
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                    return rsrp;
                }
            } catch (Throwable th2) {
                Logger.i(TAG, "getLteRsrp: throwable:" + th2.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrq(Context context) {
        List cellSignalStrengths;
        int rsrq;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrength, "getLteRsrq");
                }
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                    return rsrq;
                }
            } catch (Throwable th2) {
                Logger.i(TAG, "getLteRsrq: throwable:" + th2.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssi(Context context) {
        List cellSignalStrengths;
        int rssi;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                    if (cellSignalStrengths.size() > 0) {
                        rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                        return rssi;
                    }
                }
            } catch (Throwable th2) {
                Logger.i(TAG, "getLteRssi: throwable:" + th2.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssnr(Context context) {
        List cellSignalStrengths;
        int rssnr;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrength, "getLteRssnr");
                }
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                    return rssnr;
                }
            } catch (Throwable th2) {
                Logger.i(TAG, "getLteRssnr: throwable:" + th2.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        List cellSignalStrengths;
        int rsrp;
        int rsrq;
        int rssnr;
        int cqi;
        int rssi;
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(signalStrength, "getDbm")));
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrp")));
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrq")));
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRssnr")));
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteCqi")));
                    return hashMap;
                }
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(rsrp));
                    rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(rsrq));
                    rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(rssnr));
                    cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(cqi));
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    hashMap.put(SignalType.LTE_RSSI, Integer.valueOf(rssi));
                    return hashMap;
                }
            } catch (Throwable th2) {
                Logger.i(TAG, "getLteRssi: throwable:" + th2.getClass());
                return hashMap;
            }
        }
        return hashMap;
    }

    public static String getMNC(Context context) {
        if (context == null || !isSimReady(context)) {
            return "unknown";
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            Logger.e(TAG, "getSubscriptionOperatorType: other error!");
            return "unknown";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return ("46001".equals(networkOperator) || "46006".equals(networkOperator) || "46009".equals(networkOperator)) ? "China_Unicom" : ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46004".equals(networkOperator) || "46007".equals(networkOperator)) ? "China_Mobile" : ("46003".equals(networkOperator) || "46005".equals(networkOperator) || "46011".equals(networkOperator)) ? "China_Telecom" : "other";
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return Build.VERSION.SDK_INT > 28 ? getMobileSingalStrengthUpPPlatfrom(context) : getInfoWithReflect(signalStrength, "getDbm");
        } catch (Throwable th2) {
            Logger.i(TAG, "getDbm: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    private static int getMobileSingalStrengthUpPPlatfrom(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        List cellSignalStrengths2;
        List cellSignalStrengths3;
        int dbm;
        List cellSignalStrengths4;
        List cellSignalStrengths5;
        int dbm2;
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        int networkType = getNetworkType(context);
        try {
            if (networkType == 3) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthCdma.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthCdma) cellSignalStrengths.get(0)).getDbm();
                }
                cellSignalStrengths2 = signalStrength.getCellSignalStrengths(g.a());
                if (cellSignalStrengths2.size() > 0) {
                    dbm = h.a(cellSignalStrengths2.get(0)).getDbm();
                    return dbm;
                }
                cellSignalStrengths3 = signalStrength.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                if (cellSignalStrengths3.size() > 0) {
                    return ((CellSignalStrengthWcdma) cellSignalStrengths3.get(0)).getDbm();
                }
            } else if (networkType == 4) {
                cellSignalStrengths4 = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths4.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths4.get(0)).getDbm();
                }
            } else if (networkType == 5) {
                cellSignalStrengths5 = signalStrength.getCellSignalStrengths(a.a());
                if (cellSignalStrengths5.size() > 0) {
                    dbm2 = l.a(cellSignalStrengths5.get(0)).getDbm();
                    return dbm2;
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, "getMobileSingalStrength: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            String str = TAG;
            Logger.v(str, "phoneId " + default4GSlotId);
            boolean isNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            Logger.v(str, "isNsa " + isNsaState);
            return isNsaState ? STR_NSA : STR_SA;
        } catch (Throwable unused) {
            Logger.v(TAG, "isNsaState error");
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (ContextCompat.checkSelfPermission(context, yk.e.f100168b) && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (RuntimeException e11) {
                Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e11.getClass().getSimpleName() + e11.getMessage());
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (ContextCompat.checkSelfPermission(context, yk.e.f100168b)) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            return activeNetworkInfo.getDetailedState();
                        }
                        Logger.i(TAG, "getNetworkStatus networkIsConnected netInfo is null!");
                        return detailedState;
                    }
                } catch (RuntimeException e11) {
                    Logger.i(TAG, "getNetworkStatus exception" + e11.getClass().getSimpleName() + e11.getMessage());
                }
            } else {
                Logger.i(TAG, "getNetworkStatus ConnectivityManager is null!");
            }
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiRsrp;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrength = getSignalStrength(context)) != null) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() > 0) {
                    csiRsrp = l.a(cellSignalStrengths.get(0)).getCsiRsrp();
                    return csiRsrp;
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, "getNrCsiRsrp: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiRsrq;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrength = getSignalStrength(context)) != null) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() > 0) {
                    csiRsrq = l.a(cellSignalStrengths.get(0)).getCsiRsrq();
                    return csiRsrq;
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, "getNrCsiRsrq: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiSinr;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrength = getSignalStrength(context)) != null) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() > 0) {
                    csiSinr = l.a(cellSignalStrengths.get(0)).getCsiSinr();
                    return csiSinr;
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, "getNrCsiSinr: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        List cellSignalStrengths;
        int dbm;
        int csiRsrp;
        int csiRsrq;
        int csiSinr;
        int ssRsrp;
        int ssRsrq;
        int ssSinr;
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    cellSignalStrengths = signalStrength.getCellSignalStrengths(a.a());
                    if (cellSignalStrengths.size() > 0) {
                        dbm = l.a(cellSignalStrengths.get(0)).getDbm();
                        hashMap.put(SignalType.NR_DBM, Integer.valueOf(dbm));
                        csiRsrp = l.a(cellSignalStrengths.get(0)).getCsiRsrp();
                        hashMap.put(SignalType.NR_CSIRSRP, Integer.valueOf(csiRsrp));
                        csiRsrq = l.a(cellSignalStrengths.get(0)).getCsiRsrq();
                        hashMap.put(SignalType.NR_CSIRSRQ, Integer.valueOf(csiRsrq));
                        csiSinr = l.a(cellSignalStrengths.get(0)).getCsiSinr();
                        hashMap.put(SignalType.NR_CSISINR, Integer.valueOf(csiSinr));
                        ssRsrp = l.a(cellSignalStrengths.get(0)).getSsRsrp();
                        hashMap.put(SignalType.NR_SSRSRP, Integer.valueOf(ssRsrp));
                        ssRsrq = l.a(cellSignalStrengths.get(0)).getSsRsrq();
                        hashMap.put(SignalType.NR_SSRSRQ, Integer.valueOf(ssRsrq));
                        ssSinr = l.a(cellSignalStrengths.get(0)).getSsSinr();
                        hashMap.put(SignalType.NR_SSSINR, Integer.valueOf(ssSinr));
                        return hashMap;
                    }
                }
            } catch (Throwable th2) {
                Logger.i(TAG, "getLteRssi: throwable:" + th2.getClass());
                return hashMap;
            }
        }
        return hashMap;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssRsrp;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrength = getSignalStrength(context)) != null) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() > 0) {
                    ssRsrp = l.a(cellSignalStrengths.get(0)).getSsRsrp();
                    return ssRsrp;
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, "getNrSsRsrp: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssRsrq;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrength = getSignalStrength(context)) != null) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() > 0) {
                    ssRsrq = l.a(cellSignalStrengths.get(0)).getSsRsrq();
                    return ssRsrq;
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, "getNrSsRsrq: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssSinr;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrength = getSignalStrength(context)) != null) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(a.a());
                if (cellSignalStrengths.size() > 0) {
                    ssSinr = l.a(cellSignalStrengths.get(0)).getSsSinr();
                    return ssSinr;
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th2) {
            Logger.i(TAG, "getNrSsSinr: throwable:" + th2.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getPrimaryNetworkType(Context context) {
        return groupNetworkType(getNetworkType(getNetworkInfo(context), context));
    }

    private static SignalStrength getSignalStrength(Context context) {
        SignalStrength signalStrength;
        if (context == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        signalStrength = getTrafficCardTelephonyManager(context).getSignalStrength();
        return signalStrength;
    }

    public static TelephonyManager getTrafficCardTelephonyManager(Context context) {
        if (context == null) {
            return null;
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            return ((TelephonyManager) systemService).createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId());
        }
        return null;
    }

    public static String getWifiGatewayIp(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
            if (systemService instanceof WifiManager) {
                try {
                    int i11 = ((WifiManager) systemService).getDhcpInfo().gateway;
                    return InetAddress.getByAddress(new byte[]{(byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)}).getHostAddress();
                } catch (RuntimeException | UnknownHostException e11) {
                    Logger.i(TAG, "getWifiGatewayIp error!" + e11.getClass().getSimpleName() + e11.getMessage());
                }
            }
        }
        return " ";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
    
        r5 = r5.getTransportInfo();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getWifiRssi(android.content.Context r7) {
        /*
            r0 = -127(0xffffffffffffff81, float:NaN)
            if (r7 == 0) goto Lab
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            java.lang.String r3 = "getWifiRssiLevel did not has permission!"
            if (r1 < r2) goto L6a
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.RuntimeException -> L40
            java.lang.String r1 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r1)     // Catch: java.lang.RuntimeException -> L40
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7     // Catch: java.lang.RuntimeException -> L40
            android.net.Network[] r1 = r7.getAllNetworks()     // Catch: java.lang.RuntimeException -> L40
            int r2 = r1.length     // Catch: java.lang.RuntimeException -> L40
            r4 = 0
        L1e:
            if (r4 >= r2) goto L45
            r5 = r1[r4]     // Catch: java.lang.RuntimeException -> L40
            android.net.NetworkCapabilities r5 = r7.getNetworkCapabilities(r5)     // Catch: java.lang.RuntimeException -> L40
            if (r5 == 0) goto L42
            r6 = 1
            boolean r6 = r5.hasTransport(r6)     // Catch: java.lang.RuntimeException -> L40
            if (r6 == 0) goto L42
            android.net.TransportInfo r5 = com.huawei.hms.framework.common.c.a(r5)     // Catch: java.lang.RuntimeException -> L40
            if (r5 == 0) goto L42
            boolean r6 = r5 instanceof android.net.wifi.WifiInfo     // Catch: java.lang.RuntimeException -> L40
            if (r6 == 0) goto L42
            android.net.wifi.WifiInfo r5 = (android.net.wifi.WifiInfo) r5     // Catch: java.lang.RuntimeException -> L40
            int r0 = r5.getRssi()     // Catch: java.lang.RuntimeException -> L40
            goto L42
        L40:
            r7 = move-exception
            goto L46
        L42:
            int r4 = r4 + 1
            goto L1e
        L45:
            return r0
        L46:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.Class r3 = r7.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r7)
            goto Lab
        L6a:
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r1 = "wifi"
            java.lang.Object r7 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r7, r1)
            boolean r1 = r7 instanceof android.net.wifi.WifiManager
            if (r1 == 0) goto Lab
            android.net.wifi.WifiManager r7 = (android.net.wifi.WifiManager) r7
            android.net.wifi.WifiInfo r7 = r7.getConnectionInfo()     // Catch: java.lang.RuntimeException -> L85
            if (r7 == 0) goto L87
            int r7 = r7.getRssi()     // Catch: java.lang.RuntimeException -> L85
            return r7
        L85:
            r7 = move-exception
            goto L88
        L87:
            return r0
        L88:
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.Class r3 = r7.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r7)
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.NetworkUtil.getWifiRssi(android.content.Context):int");
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    private static int groupNetworkType(int i11) {
        int i12 = -1;
        if (i11 != -1) {
            i12 = 1;
            if (i11 != 1) {
                return (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 6 : 0;
            }
        }
        return i12;
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo != null && networkInfo.isConnected()) || !networkInfo2.isConnected()) {
            return false;
        }
        Logger.v(TAG, "Find network state changed to connected");
        return true;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo2.isConnected() || getPrimaryNetworkType(networkInfo) == getPrimaryNetworkType(networkInfo2)) {
            return false;
        }
        Logger.v(TAG, "Find activity network changed");
        return true;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (!ContextCompat.checkSelfPermission(context, yk.e.f100168b)) {
            return true;
        }
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean isSimReady(Context context) {
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager = (UserManager) ContextCompat.getSystemService(context, "user");
        if (userManager == null) {
            return true;
        }
        try {
            return userManager.isUserUnlocked();
        } catch (RuntimeException e11) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e11);
            return true;
        }
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        Logger.v(TAG, "networkType " + networkType);
        if (networkType == 4) {
            if (TextUtils.equals(STR_NSA, getNetWorkNSAorSA())) {
                return 7;
            }
            return networkType;
        }
        if (networkType == 5 && TextUtils.equals(STR_SA, getNetWorkNSAorSA())) {
            return 8;
        }
        return networkType;
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        if (context != null && ContextCompat.checkSelfPermission(context, yk.e.f100168b)) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        return connectivityManager.getRestrictBackgroundStatus();
                    }
                    Logger.v(TAG, "ConnectType is not Mobile Network!");
                    return 0;
                } catch (RuntimeException e11) {
                    Logger.e(TAG, "SystemServer error:", e11);
                }
            }
        }
        return 0;
    }

    public static void updateCurrentNetworkType() {
        networkTypeByReceiver = netWork(ContextHolder.getResourceContext());
    }

    public static boolean isForeground() {
        return ActivityUtil.getInstance().isForeground();
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i11;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        int i12 = 1;
        if (1 != type && 13 != type) {
            i12 = 0;
            if (type == 0) {
                int subtype = networkInfo.getSubtype();
                Logger.v(TAG, "getHwNetworkType return is: " + subtype);
                if (subtype == 0) {
                    subtype = networkInfo.getSubtype();
                }
                if (subtype != 20) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            i11 = 2;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            i11 = 3;
                            break;
                        case 13:
                            i11 = 4;
                            break;
                        default:
                            i11 = 0;
                            break;
                    }
                } else {
                    i11 = 5;
                }
                if (i11 != 0 || Build.VERSION.SDK_INT < 25) {
                    return i11;
                }
                if (subtype != 16) {
                    return subtype != 17 ? 0 : 3;
                }
                return 2;
            }
        }
        return i12;
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        return groupNetworkType(getNetworkType(networkInfo));
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }
}
