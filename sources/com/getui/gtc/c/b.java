package com.getui.gtc.c;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.getui.gtc.api.GtcIdCallback;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.e.c;
import com.getui.gtc.e.d;
import com.getui.gtc.h.c;
import com.getui.gtc.server.ServerManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static String f29825b;

    /* renamed from: c, reason: collision with root package name */
    public static String f29826c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile String f29827d;

    /* renamed from: e, reason: collision with root package name */
    public static String f29828e;

    /* renamed from: f, reason: collision with root package name */
    public static String f29829f;

    /* renamed from: g, reason: collision with root package name */
    public static String f29830g;

    /* renamed from: a, reason: collision with root package name */
    public static String f29824a = GtcProvider.context().getPackageName();

    /* renamed from: j, reason: collision with root package name */
    private static final List<GtcIdCallback> f29833j = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static String f29831h = com.igexin.push.a.f37299k;

    /* renamed from: i, reason: collision with root package name */
    public static String f29832i = com.igexin.push.a.f37298j;

    public static void a() {
        List asList;
        List asList2;
        List asList3;
        String str;
        c cVar;
        c cVar2;
        c cVar3;
        try {
            Bundle bundle = CommonUtil.getAppInfoForSelf(GtcProvider.context()).metaData;
            if (bundle != null) {
                String string = bundle.getString("GTC_C");
                if (!TextUtils.isEmpty(string)) {
                    f29828e = string;
                }
                String string2 = bundle.getString("GTC_B");
                if (!TextUtils.isEmpty(string2)) {
                    f29829f = string2;
                }
                String string3 = bundle.getString("GTC_A");
                if (!TextUtils.isEmpty(string3)) {
                    f29830g = string3;
                }
                String string4 = bundle.getString("GTC_P");
                if (!TextUtils.isEmpty(string4)) {
                    f29831h = string4;
                }
                String string5 = bundle.getString("GTC_K");
                if (!TextUtils.isEmpty(string5)) {
                    f29832i = string5;
                }
                String string6 = bundle.getString("GETUI_APPID");
                if (TextUtils.isEmpty(string6)) {
                    string6 = bundle.getString("GETUI_APP_ID");
                    if (TextUtils.isEmpty(string6)) {
                        string6 = bundle.getString(com.igexin.push.core.b.f37730b);
                        if (TextUtils.isEmpty(string6)) {
                            string6 = bundle.getString("GI_APPID");
                            if (TextUtils.isEmpty(string6)) {
                                string6 = bundle.getString("GI_APP_ID");
                                if (TextUtils.isEmpty(string6)) {
                                    string6 = bundle.getString("GS_APPID");
                                    if (TextUtils.isEmpty(string6)) {
                                        string6 = bundle.getString("GS_APP_ID");
                                        if (TextUtils.isEmpty(string6)) {
                                            string6 = bundle.getString("GY_APPID");
                                            if (TextUtils.isEmpty(string6)) {
                                                string6 = bundle.getString("GY_APP_ID");
                                                if (TextUtils.isEmpty(string6)) {
                                                    String string7 = bundle.getString("com.sdk.plus.appid");
                                                    if (!TextUtils.isEmpty(string7)) {
                                                        f29824a = string7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                f29824a = string6;
            } else {
                com.getui.gtc.i.c.a.b("metaData==null");
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
        HashMap hashMap = new HashMap();
        String[] strArr = new String[0];
        try {
            try {
                asList = Arrays.asList(f29828e.split(","));
            } catch (Throwable th3) {
                hashMap.put("gtc.cs", Arrays.asList(strArr));
                throw th3;
            }
        } catch (Throwable unused) {
            asList = Arrays.asList("https://c-gtc.getui.net,https://c-gtc.gepush.com".split(","));
        }
        hashMap.put("gtc.cs", asList);
        String[] strArr2 = new String[0];
        try {
            try {
                asList2 = Arrays.asList(f29830g.split(","));
            } catch (Throwable th4) {
                hashMap.put("gtc.as", Arrays.asList(strArr2));
                throw th4;
            }
        } catch (Throwable unused2) {
            asList2 = Arrays.asList("https://gtc.getui.net,https://gtc.gepush.com".split(","));
        }
        hashMap.put("gtc.as", asList2);
        String[] strArr3 = new String[0];
        try {
            try {
                asList3 = Arrays.asList(f29829f.split(","));
            } catch (Throwable unused3) {
                asList3 = Arrays.asList("https://b-gtc.getui.net,https://b-gtc.gepush.com".split(","));
            }
            hashMap.put("gtc.bs", asList3);
            ServerManager.addBuildInServerMap(hashMap);
            if (TextUtils.isEmpty(f29827d)) {
                cVar3 = c.a.f30027a;
                f29827d = cVar3.f30024a.f30031d;
            }
            if (TextUtils.isEmpty(f29827d)) {
                if (TextUtils.isEmpty(f29826c)) {
                    cVar2 = c.a.f30027a;
                    f29826c = cVar2.f30024a.f30032e;
                }
                if (TextUtils.isEmpty(f29826c)) {
                    if (TextUtils.isEmpty(f29825b)) {
                        Context context = GtcProvider.context();
                        String a11 = com.getui.gtc.b.a.a(context);
                        if (TextUtils.isEmpty(a11)) {
                            a11 = context.getSharedPreferences("GINSIGHT-SDK-PREFERENCE", 0).getString("gicid", null);
                        }
                        f29825b = a11;
                    }
                    if (TextUtils.isEmpty(f29825b)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("gtc_");
                        String a12 = com.getui.gtc.i.a.a.a(UUID.randomUUID().toString() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + GtcProvider.context().getPackageName());
                        sb2.append(a12);
                        char charAt = a12.charAt(a12.length() + (-1));
                        if (charAt < 16) {
                            sb2.append("0");
                        }
                        sb2.append(Integer.toHexString(charAt));
                        f29826c = sb2.toString();
                        cVar = c.a.f30027a;
                        d dVar = cVar.f30024a;
                        String str2 = f29826c;
                        if (dVar.a(9, str2)) {
                            dVar.f30032e = str2;
                        }
                    } else {
                        str = f29825b;
                        f29827d = str;
                        a(str);
                    }
                }
                str = f29826c;
                f29827d = str;
                a(str);
            }
            ServerManager.updateConfigServerMap();
            Log.d("GTC", "gtcid is " + f29827d);
        } catch (Throwable th5) {
            hashMap.put("gtc.bs", Arrays.asList(strArr3));
            throw th5;
        }
    }

    public static void a(GtcIdCallback gtcIdCallback) throws RemoteException {
        if (gtcIdCallback != null) {
            gtcIdCallback.onSuccess(f29827d);
            f29833j.add(gtcIdCallback);
        }
    }

    private static void a(final String str) {
        com.getui.gtc.h.c.a(str, new c.a() { // from class: com.getui.gtc.c.b.1
            @Override // com.getui.gtc.h.c.a
            public final void a(String str2) {
                com.getui.gtc.e.c cVar;
                b.f29827d = str2;
                if (!TextUtils.equals(str, str2)) {
                    try {
                        Log.d("GTC", "gtcid changed to " + b.f29827d);
                        Iterator it = b.f29833j.iterator();
                        while (it.hasNext()) {
                            ((GtcIdCallback) it.next()).onSuccess(b.f29827d);
                        }
                    } catch (Throwable th2) {
                        com.getui.gtc.i.c.a.b(th2);
                    }
                }
                b.f29833j.clear();
                cVar = c.a.f30027a;
                d dVar = cVar.f30024a;
                String str3 = b.f29827d;
                if (dVar.a(4, str3)) {
                    dVar.f30031d = str3;
                }
            }
        });
    }
}
