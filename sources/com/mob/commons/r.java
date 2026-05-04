package com.mob.commons;

import android.content.Context;
import android.net.Uri;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class r {

    /* renamed from: com.mob.commons.r$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40404a;

        static {
            int[] iArr = new int[InternationalDomain.values().length];
            f40404a = iArr;
            try {
                iArr[InternationalDomain.JP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40404a[InternationalDomain.US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Context a() {
        try {
            return DeviceHelper.getInstance(null).getApplication();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static ArrayList<HashMap<String, Object>> b() {
        ArrayList<String> h11;
        try {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            ArrayList<HashMap<String, Object>> availableWifiList = deviceHelper.getAvailableWifiList();
            if (availableWifiList != null && !availableWifiList.isEmpty() && (h11 = b.h()) != null && !h11.isEmpty()) {
                String bssid = deviceHelper.getBssid();
                ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
                Iterator<HashMap<String, Object>> it = availableWifiList.iterator();
                while (it.hasNext()) {
                    HashMap<String, Object> next = it.next();
                    Object obj = next.get(o.a("005Gfjehehegfi"));
                    if (obj != null && String.valueOf(obj).equals(bssid)) {
                        next.put(o.a("010=dddddddgdcdhgfecdkdk"), Boolean.TRUE);
                        bssid = null;
                    }
                    HashMap<String, Object> hashMap = new HashMap<>();
                    Iterator<String> it2 = h11.iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        Object obj2 = next.get(next2);
                        if (obj2 != null) {
                            hashMap.put(next2, obj2);
                        }
                    }
                    arrayList.add(hashMap);
                }
                return arrayList;
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return null;
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        if (str.startsWith(o.a("007cddefgg"))) {
            str = str.replace(o.a("007cddefgg"), "");
        }
        if (str.startsWith("https://")) {
            str = str.replace("https://", "");
        }
        if (MobSDK.checkV6()) {
            str2 = o.a("002jOie");
        } else {
            int i11 = AnonymousClass1.f40404a[MobSDK.getDomain().ordinal()];
            if (i11 == 1) {
                str2 = "jp";
            } else if (i11 == 2) {
                str2 = o.a("002Cdcfg");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return b(o.a("007cddefgg") + str);
        }
        if (str.startsWith(str2 + ".")) {
            return b(o.a("007cddefgg") + str);
        }
        return b(o.a("007cddefgg") + str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str);
    }

    public static String b(String str) {
        Uri parse;
        String scheme;
        String str2;
        try {
            if (!TextUtils.isEmpty(str)) {
                boolean checkForceHttps = MobSDK.checkForceHttps();
                if (!checkForceHttps) {
                    if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    }
                }
                String trim = str.trim();
                if (!trim.startsWith(o.a("007cddefgg")) || (parse = Uri.parse(trim.trim())) == null || (scheme = parse.getScheme()) == null || !scheme.equals(o.a("004cdde"))) {
                    return trim;
                }
                String host = parse.getHost();
                String path = parse.getPath();
                String query = parse.getQuery();
                String str3 = "";
                if (host != null) {
                    int port = parse.getPort();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(host);
                    if (port > 0 && port != 80) {
                        str2 = ":" + port;
                        sb2.append(str2);
                        host = sb2.toString();
                        if (!checkForceHttps && ((Boolean) ReflectHelper.invokeInstanceMethod(NetworkSecurityPolicy.getInstance(), o.a("0277defggfedKi8dfdhDdi[dl dKeidhdffhfhdedgggSiVdh*lDde4ddih"), host)).booleanValue()) {
                            return trim;
                        }
                    }
                    str2 = "";
                    sb2.append(str2);
                    host = sb2.toString();
                    if (!checkForceHttps) {
                        return trim;
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https://");
                sb3.append(host);
                if (path == null) {
                    path = "";
                }
                sb3.append(path);
                if (query != null) {
                    str3 = "?" + query;
                }
                sb3.append(str3);
                return sb3.toString();
            }
            return str;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return str;
        }
    }

    public static String a(String str, int i11) {
        int parseInt;
        int i12 = 0;
        int i13 = 3;
        if (str.startsWith(ChipTextInputComboView.b.f32535b)) {
            parseInt = Integer.parseInt(str.substring(2, 3));
        } else if (str.startsWith("0")) {
            parseInt = Integer.parseInt(str.substring(1, 3));
        } else {
            parseInt = Integer.parseInt(str.substring(0, 3));
        }
        char[] charArray = str.toCharArray();
        int[] iArr = new int[parseInt];
        boolean z11 = true;
        while (i13 < charArray.length) {
            char c11 = charArray[i13];
            if (c11 < 'a') {
                z11 = !z11;
            } else {
                if (z11) {
                    iArr[i12] = c11 - i11;
                } else {
                    int i14 = (c11 - i11) * 10;
                    iArr[i12] = i14;
                    i13++;
                    iArr[i12] = i14 + (charArray[i13] - i11);
                }
                int i15 = iArr[i12];
                i12++;
            }
            i13++;
        }
        return d.a(iArr);
    }
}
