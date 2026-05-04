package com.mob.commons;

import android.os.Looper;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap<String, List<String>> f40219a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public static final String f40220b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f40221c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f40222d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f40223e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f40224f;

    static {
        String a11 = n.a("006Acfdbcjegcdee");
        f40220b = a11;
        String a12 = n.a("005?cf]gMce7c)ce");
        f40221c = a12;
        String a13 = n.a("005h-cgcgdbcg");
        f40222d = a13;
        String a14 = n.a("006ghi:cdcfMh");
        f40223e = a14;
        String a15 = n.a("003gHdcdc");
        f40224f = a15;
        try {
            f40219a.put(a13, Arrays.asList(n.a("0184ceSdYcdgh=h$ckcfdk;gUcbHc3cddcefdkcfdb<k"), n.a("0201ceMd]cdgh'hRcgcgdbcgdk]g,cbPcNcddcefdkcfdb?k")));
            f40219a.put(a14, Arrays.asList(n.a("020ghi^efghVg4ce.cCcedkCg?cb!c:cddcefdkcfdbJk"), n.a("019OceDdEcdgh[ghi[efdk!g*cb,cBcddcefdkcfdbEk")));
            f40219a.put(a15, Arrays.asList(n.a("015g4eg7hJdk=k@cdcfdkDkZdbebdkcfdbCk"), n.a("015g4eg7hJdk=k@cdcfdkDkZdbebdkcfdbCk")));
            f40219a.put(a11, Arrays.asList(n.a("017NceWdPcdghegcfdkPg<cbVcMcddcefdkcfdb,k"), n.a("016-ceYdXcdghcfdkRgQcbHc$cddcefdkcfdb:k")));
            f40219a.put(a12, Arrays.asList(n.a("017Dce4d;cdgheg$g[dkIg*cbHcHcddcefdkcfdb6k"), n.a("016+ce=d;cdghCgYdk:g'cb4c2cddcefdkcfdb+k")));
            f40219a.put("sdrl", Arrays.asList(n.a("014QceKdNcddk(g9egdkJk!dbebdkcfdb1k"), n.a("014QceKdNcddk(g9egdkJk!dbebdkcfdb1k")));
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        if (DeviceHelper.getInstance(MobSDK.getContext()).checkNetworkAvailable()) {
            HashMap hashMap = (HashMap) b.a(n.a("002Odb.b"), (Object) null);
            if (hashMap == null || hashMap.isEmpty()) {
                hashMap = new HashMap();
                hashMap.putAll(f40219a);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                a((String) entry.getKey(), (List<String>) entry.getValue());
            }
        }
    }

    private static String b(String str, String str2) {
        List<String> list;
        String c11 = v.a().c(str, str2);
        return (!TextUtils.isEmpty(c11) || (list = f40219a.get(str)) == null || list.size() <= 0) ? c11 : list.get(0);
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str) || str.equals("127.0.0.1") || str.startsWith("10.") || str.startsWith("192.168")) {
            return false;
        }
        if (str.startsWith("172.")) {
            String[] split = str.split("\\.");
            if (split.length > 1) {
                try {
                    int parseInt = Integer.parseInt(split[1]);
                    return parseInt < 16 || parseInt > 31;
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
        return true;
    }

    private static boolean b(String str) {
        if (str != null) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                if (allByName != null) {
                    for (InetAddress inetAddress : allByName) {
                        if (!c(inetAddress.getHostAddress())) {
                            return false;
                        }
                    }
                }
                MobLog.getInstance().d("ck ht suc: " + str, new Object[0]);
                return true;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return false;
    }

    public static String a(String str) {
        return r.a(b(str, null));
    }

    public static boolean a(HashMap<String, List<String>> hashMap) {
        if (!DeviceHelper.getInstance(MobSDK.getContext()).checkNetworkAvailable() || hashMap == null || hashMap.isEmpty() || Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            return false;
        }
        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
        return true;
    }

    public static String a(String str, String str2) {
        return r.a(b(str, str2));
    }

    private static void a(String str, List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        String b11 = b(str, null);
        if (b(b11) || b(b11)) {
            return;
        }
        for (String str2 : list) {
            if (b(str2) || b(str2)) {
                if (str2.equals(b11)) {
                    return;
                }
                MobLog.getInstance().d("sy dm: " + str + ":" + str2, new Object[0]);
                v.a().d(str, str2);
                return;
            }
        }
    }
}
