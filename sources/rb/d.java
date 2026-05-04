package rb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83926a = "NetworkUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final int f83927b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f83928c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f83929d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f83930e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f83931f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f83932g = 4;

    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int b(Context context) {
        NetworkInfo a11 = a(context);
        if (a11 == null || !a11.isConnected()) {
            return -1;
        }
        int type = a11.getType();
        int subtype = a11.getSubtype();
        if (1 == type) {
            return 0;
        }
        if (subtype == 1 || subtype == 2 || subtype == 4) {
            return 3;
        }
        if (subtype == 20) {
            return 4;
        }
        if (subtype != 8 && subtype != 9) {
            switch (subtype) {
                case 11:
                    return 3;
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    return 2;
            }
        }
        return 1;
    }

    public static String c(Context context) {
        return Arrays.toString(d(context));
    }

    @SuppressLint({"MissingPermission"})
    public static String[] d(Context context) {
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        LinkedList linkedList = new LinkedList();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager != null) {
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
                qb.c.i(f83926a, "getActiveNetworkInfo failed, exception:" + e11.getClass().getSimpleName(), new Object[0]);
            } catch (RuntimeException e12) {
                qb.c.i(f83926a, "getActiveNetworkInfo failed, exception:" + e12.getClass().getSimpleName(), new Object[0]);
            }
        }
        return linkedList.isEmpty() ? new String[0] : (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public static String e(Context context) {
        if (context == null || !g(context)) {
            return "unknown";
        }
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(context, TelephonyManager.class);
        if (telephonyManager == null) {
            qb.c.d(f83926a, "getSubscriptionOperatorType: other error!", new Object[0]);
            return "unknown";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return ("46001".equals(networkOperator) || "46006".equals(networkOperator) || "46009".equals(networkOperator)) ? "China_Unicom" : ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46004".equals(networkOperator) || "46007".equals(networkOperator)) ? "China_Mobile" : ("46003".equals(networkOperator) || "46005".equals(networkOperator) || "46011".equals(networkOperator)) ? "China_Telecom" : "other";
    }

    public static boolean f(Context context) {
        NetworkInfo a11 = a(context);
        return a11 != null && a11.isConnected();
    }

    public static boolean g(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(context, TelephonyManager.class);
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    public static boolean h(Context context) {
        int b11 = b(context);
        return b11 == 0 || 1 == b11 || 2 == b11;
    }

    public static boolean i(Context context) {
        UserManager userManager = (UserManager) ContextCompat.getSystemService(context, UserManager.class);
        if (userManager == null) {
            return true;
        }
        try {
            return userManager.isUserUnlocked();
        } catch (RuntimeException e11) {
            qb.c.c(f83926a, "dealType rethrowFromSystemServer:", e11);
            return true;
        }
    }

    public static boolean j(Context context) {
        return b(context) == 0;
    }
}
