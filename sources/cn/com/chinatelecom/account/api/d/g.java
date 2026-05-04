package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static String f8993a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f8994b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f8995c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f8996d = "0";

    private static int a(int i11) {
        int i12 = -101;
        if (i11 != -101) {
            i12 = -1;
            if (i11 != -1) {
                switch (i11) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 2;
                    case 13:
                    case 18:
                    case 19:
                        return 3;
                    default:
                        return i11;
                }
            }
        }
        return i12;
    }

    public static String b() {
        return f8994b != null ? "https://open.e.189.cn/openapi/special/getTimeStamp.do".replace(cn.com.chinatelecom.account.api.a.d.a(b.f8959g), f8994b) : "https://open.e.189.cn/openapi/special/getTimeStamp.do";
    }

    public static String c() {
        String str = f8995c;
        return str != null ? "https://e189.21cn.com/gw/client/accountMsg.do".replace("e189.21cn.com", str) : "https://e189.21cn.com/gw/client/accountMsg.do";
    }

    public static boolean d(Context context) {
        if (context == null) {
            return true;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, null)).booleanValue();
        } catch (Throwable th2) {
            cn.com.chinatelecom.account.api.a.a("NetUtil", "isMobileEnable error ", th2);
            return true;
        }
    }

    public static String e(Context context) {
        int h11 = h(context);
        return h11 != -101 ? (h11 == -1 || h11 == 0) ? "null" : h11 != 1 ? h11 != 2 ? h11 != 3 ? Integer.toString(h11) : "4G" : "3G" : "2G" : "WIFI";
    }

    public static String f(Context context) {
        String e11 = e(context);
        return (e11 != null && e11.equals("WIFI") && d(context)) ? "BOTH" : e11;
    }

    public static String g(Context context) {
        String f11 = f(context);
        if (!TextUtils.isEmpty(f11) && !f11.equals("null")) {
            if (f11.equals("2G")) {
                return Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
            }
            if (f11.equals("3G")) {
                return Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE;
            }
            if (f11.equals("4G")) {
                return Constants.VIA_REPORT_TYPE_SET_AVATAR;
            }
            if (f11.equals("WIFI")) {
                return "13";
            }
            if (f11.equals("BOTH")) {
                return Constants.VIA_REPORT_TYPE_MAKE_FRIEND;
            }
        }
        return Constants.VIA_REPORT_TYPE_WPA_STATE;
    }

    private static int h(Context context) {
        int i11 = 0;
        try {
            NetworkInfo a11 = a(context);
            if (a11 != null && a11.isAvailable() && a11.isConnected()) {
                int type = a11.getType();
                if (type == 1) {
                    i11 = -101;
                } else if (type == 0) {
                    try {
                        i11 = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (i11 == 0) {
                        i11 = a11.getSubtype();
                    }
                }
            } else {
                i11 = -1;
            }
        } catch (NullPointerException | Exception e12) {
            e12.printStackTrace();
        }
        return a(i11);
    }

    public static NetworkInfo a(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static boolean b(Context context) {
        NetworkInfo a11 = a(context);
        return a11 != null && a11.isAvailable();
    }

    public static boolean c(Context context) {
        NetworkInfo a11 = a(context);
        return a11 != null && a11.getType() == 0;
    }

    public static String a() {
        return f8993a;
    }
}
