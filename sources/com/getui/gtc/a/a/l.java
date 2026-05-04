package com.getui.gtc.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.base.util.ScheduleQueue;
import com.huawei.hms.aggrpay.pay.PayTaskActivity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static int f29726a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static String f29727b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f29728c = "";

    public static class a implements InvocationHandler {
        private a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            final o oVar;
            if (!"onResult".equalsIgnoreCase(method.getName()) || objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0) {
                    return null;
                }
                String str = (String) objArr[0];
                JSONObject jSONObject = new JSONObject(str);
                com.getui.gtc.i.c.a.d("ct prelg result: ".concat(String.valueOf(str)));
                jSONObject.optInt("result", -1);
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    oVar = l.b(optJSONObject.optString("number"));
                } else {
                    com.getui.gtc.i.c.a.d("ct prelg error.");
                    oVar = new o(-9);
                }
                ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.a.a.l.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.getui.gtc.a.g.a(3, oVar);
                    }
                });
                return null;
            } catch (Throwable th2) {
                com.getui.gtc.i.c.a.c(th2);
                return null;
            }
        }

        public /* synthetic */ a(byte b11) {
            this();
        }
    }

    public static class b implements InvocationHandler {
        private b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            final o oVar;
            if (!"onResult".equalsIgnoreCase(method.getName()) || objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0) {
                    return null;
                }
                String str = (String) objArr[0];
                JSONObject jSONObject = new JSONObject(str);
                com.getui.gtc.i.c.a.d("cu prelg result: ".concat(String.valueOf(str)));
                int optInt = jSONObject.optInt("resultCode", -1);
                JSONObject optJSONObject = jSONObject.optJSONObject("resultData");
                if (optInt != 0 || optJSONObject == null) {
                    oVar = new o(-9, l.f29728c, "");
                } else {
                    String optString = optJSONObject.optString("mobile", "");
                    oVar = new o(TextUtils.isEmpty(optString) ? -9 : 0, l.f29728c, optString);
                }
                ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.a.a.l.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.getui.gtc.a.g.a(2, oVar);
                    }
                });
                return null;
            } catch (Throwable th2) {
                com.getui.gtc.i.c.a.c(th2);
                return null;
            }
        }

        public /* synthetic */ b(byte b11) {
            this();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(Context context) {
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            com.getui.gtc.i.c.a.d("PM operator ".concat(String.valueOf(simOperator)));
            int hashCode = simOperator.hashCode();
            if (hashCode != 49679479) {
                if (hashCode != 49679502) {
                    switch (hashCode) {
                        case 49679470:
                            if (simOperator.equals("46000")) {
                                return 1;
                            }
                            break;
                        case 49679471:
                            if (simOperator.equals("46001")) {
                                return 2;
                            }
                            break;
                        case 49679472:
                            if (simOperator.equals("46002")) {
                                return 1;
                            }
                            break;
                        case 49679473:
                            if (simOperator.equals("46003")) {
                                return 3;
                            }
                            break;
                        case 49679474:
                            if (simOperator.equals("46004")) {
                                return 1;
                            }
                            break;
                        case 49679475:
                            if (simOperator.equals("46005")) {
                                return 3;
                            }
                            break;
                        case 49679476:
                            if (simOperator.equals("46006")) {
                                return 2;
                            }
                            break;
                        case 49679477:
                            if (simOperator.equals("46007")) {
                                return 1;
                            }
                            break;
                    }
                } else if (simOperator.equals("46011")) {
                    return 3;
                }
            } else if (simOperator.equals("46009")) {
                return 2;
            }
            return 4;
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.c(e11);
            return 4;
        }
    }

    public static int b() {
        try {
            try {
                Class.forName(new String(c.a("Y24uY29tLmNoaW5hdGVsZWNvbS5hY2NvdW50LnNkay4=")) + "CtAuth");
                f29726a = 1;
                return 1;
            } catch (Throwable unused) {
                Class.forName(new String(c.a("Y24uY29tLmNoaW5hdGVsZWNvbS5hY2NvdW50LmFwaS4=")) + "CtAuth");
                f29726a = 2;
                return 2;
            }
        } catch (Throwable unused2) {
            f29726a = -1;
            return -1;
        }
    }

    public static boolean c() {
        String str;
        int b11;
        try {
            str = new String(c.a("Y24uY29tLmNoaW5hdGVsZWNvbS5hY2NvdW50LmFwaS4="));
            b11 = b();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
        if (b11 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("a");
            return !TextUtils.isEmpty((String) Class.forName(sb2.toString()).getField("a").get(null));
        }
        if (b11 != 2) {
            return false;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("CtAuth");
        return !TextUtils.isEmpty((String) Class.forName(sb3.toString()).getField("mAppId").get(null));
    }

    public static boolean d() {
        try {
            if (f29727b == null) {
                return false;
            }
            Class<?> cls = Class.forName(f29727b + ".UniAccountHelper");
            Object invoke = cls.getMethod("getInstance", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mContext");
            declaredField.setAccessible(true);
            return ((Context) declaredField.get(invoke)) != null;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return false;
        }
    }

    public static o e() {
        String str;
        Throwable th2;
        int i11;
        try {
            Class<?> cls = Class.forName(f29727b + ".UniAccountHelper");
            f29728c = (String) cls.getMethod("getSdkVersion", null).invoke(cls.getMethod("getInstance", null).invoke(null, null), null);
            str = (String) Class.forName(f29727b + ".f.h").getMethod("c", null).invoke(null, null);
        } catch (Throwable th3) {
            str = "";
            th2 = th3;
        }
        try {
            i11 = TextUtils.isEmpty(str) ? -4 : 0;
        } catch (Throwable th4) {
            th2 = th4;
            com.getui.gtc.i.c.a.c(th2);
            i11 = -5;
            return new o(i11, f29728c, str);
        }
        return new o(i11, f29728c, str);
    }

    public static void f() {
        Method method;
        Class cls = Integer.TYPE;
        try {
            String str = f29727b + ".UniAccountHelper";
            String str2 = f29727b + ".ResultListener";
            com.getui.gtc.i.c.a.d("strUniAccountHelper: " + str + ", strResultListener: " + str2);
            Class<?> cls2 = Class.forName(str);
            Method method2 = cls2.getMethod("getInstance", null);
            Class<?> cls3 = Class.forName(str2);
            try {
                method = cls2.getMethod("preGetToken", cls, cls3);
            } catch (Throwable unused) {
                method = cls2.getMethod("login", cls, cls3);
            }
            method.invoke(method2.invoke(null, null), 5000, Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new b((byte) 0)));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            com.getui.gtc.a.g.a(2, new o(-9));
        }
    }

    public static void g() {
        try {
            String str = new String(c.a("Y24uY29tLmNoaW5hdGVsZWNvbS5hY2NvdW50LnNkay4="));
            String str2 = new String(c.a("Y24uY29tLmNoaW5hdGVsZWNvbS5hY2NvdW50LmFwaS4="));
            String str3 = str2 + "CtSetting";
            com.getui.gtc.i.c.a.d("prefixOfficial: " + str + ", prefixCustom: " + str2);
            if (f29726a != 1) {
                str = str2;
            }
            Class<?> cls = Class.forName(str + "CtAuth");
            Class<?> cls2 = Class.forName(str3);
            Class<?> cls3 = Class.forName(str + PayTaskActivity.KEY_RESULT_LISTENER);
            cls.getMethod("requestPreLogin", cls2, cls3).invoke(cls.getMethod("getInstance", null).invoke(null, null), null, Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new a((byte) 0)));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            com.getui.gtc.a.g.a(3, new o(-9));
        }
    }

    private static boolean i() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            Iterator it = Collections.list(networkInterfaces).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return false;
        }
    }

    public static boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) GtcProvider.context().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.getui.gtc.a.a.o b(java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            int r1 = com.getui.gtc.a.a.l.f29726a
            r2 = -1
            if (r1 != r2) goto Le
            com.getui.gtc.a.a.o r7 = new com.getui.gtc.a.a.o
            r0 = -3
            r7.<init>(r0)
            return r7
        Le:
            r1 = 0
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "Y24uY29tLmNoaW5hdGVsZWNvbS5hY2NvdW50LmFwaS4="
            byte[] r3 = com.getui.gtc.a.a.c.a(r3)     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r3.<init>()     // Catch: java.lang.Throwable -> L4a
            r3.append(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "ClientUtils"
            r3.append(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "getSdkVersion"
            java.lang.reflect.Method r3 = r2.getMethod(r3, r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r3 = r3.invoke(r1, r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "getApiVersion"
            java.lang.reflect.Method r2 = r2.getMethod(r4, r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L48
            goto L50
        L48:
            r2 = move-exception
            goto L4c
        L4a:
            r2 = move-exception
            r3 = r0
        L4c:
            com.getui.gtc.i.c.a.c(r2)
            r2 = r0
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ","
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = new java.lang.String
            java.lang.String r4 = "Y24uY29tLmNoaW5hdGVsZWNvbS5hY2NvdW50LnNkay5hLmE="
            byte[] r4 = com.getui.gtc.a.a.c.a(r4)
            r3.<init>(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            r5 = -7
            if (r4 == 0) goto L97
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "a"
            java.lang.reflect.Method r4 = r3.getMethod(r4, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "c"
            java.lang.reflect.Method r3 = r3.getMethod(r6, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r4 = r4.invoke(r1, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r3.invoke(r4, r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L93
            r5 = -6
            r7 = r1
            goto L97
        L93:
            r1 = move-exception
            com.getui.gtc.i.c.a.c(r1)
        L97:
            java.lang.String r1 = "以本机号码登录"
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto La0
            goto La1
        La0:
            r0 = r7
        La1:
            com.getui.gtc.a.a.o r7 = new com.getui.gtc.a.a.o
            r7.<init>(r5, r2, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.a.a.l.b(java.lang.String):com.getui.gtc.a.a.o");
    }

    private static boolean c(Context context) {
        try {
            if (!CommonUtil.isAppForeground()) {
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                return registerReceiver == null || registerReceiver.getExtras() == null || registerReceiver.getExtras().getInt("plugged") == 2;
            }
            boolean z11 = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
            Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver2 != null && registerReceiver2.getExtras() != null) {
                return z11 && registerReceiver2.getExtras().getInt("plugged") == 2;
            }
            return true;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
        return true;
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str) && !"none".equalsIgnoreCase(str)) {
            for (String str2 : str.split(",")) {
                try {
                    Class.forName(str2 + ".UniAccountHelper");
                    f29727b = str2;
                    return true;
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.c(th2);
                }
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        try {
            if (i()) {
                return false;
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                String country = Locale.getDefault().getCountry();
                if (TextUtils.isEmpty(country) || !country.equals("CN") || CommonUtil.isAppDebugEnable()) {
                    return false;
                }
                return !c(context);
            }
            return false;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return false;
        }
    }
}
