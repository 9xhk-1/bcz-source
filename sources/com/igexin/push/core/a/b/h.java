package com.igexin.push.core.a.b;

import com.heytap.mcssdk.constant.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.c.a;
import com.igexin.push.config.SDKUrlConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37667a = com.igexin.push.config.c.f37542a + "_RedirectServerAction";

    private static void a(String str, JSONArray jSONArray) {
        try {
            com.igexin.c.a.c.a.a(f37667a + "|start fetch idc config, url : " + str, new Object[0]);
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new com.igexin.push.f.a.f(new com.igexin.push.core.h.c(str, jSONArray)), false, true);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(f37667a + e11.toString(), new Object[0]);
        }
    }

    private static void b(JSONObject jSONObject) {
        String str;
        if (jSONObject.has("loc") && jSONObject.has("conf")) {
            try {
                SDKUrlConfig.setLocation(jSONObject.getString("loc"));
                String str2 = com.igexin.push.core.e.f38029f;
                StringBuilder sb2 = new StringBuilder();
                String str3 = f37667a;
                sb2.append(str3);
                sb2.append(" set group id : ");
                sb2.append(com.igexin.push.core.e.f38029f);
                com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
                JSONArray jSONArray = jSONObject.getJSONArray("conf");
                String[] a11 = a(jSONArray);
                if (a11 == null || a11.length <= 1) {
                    return;
                }
                String[] idcConfigUrl = SDKUrlConfig.getIdcConfigUrl();
                if (idcConfigUrl != null && (idcConfigUrl.length <= 1 || a11[1].equals(idcConfigUrl[1]))) {
                    com.igexin.c.a.c.a.a(str3 + "|current idc config url == new idc config url, return", new Object[0]);
                    return;
                }
                if (com.igexin.push.core.e.f38013ao == 0) {
                    str = a11[1];
                } else {
                    if (System.currentTimeMillis() - com.igexin.push.core.e.f38013ao <= Constants.MILLS_OF_WATCH_DOG) {
                        com.igexin.c.a.c.a.a(str3 + "|get idc cfg last time less than 2 hours return", new Object[0]);
                        return;
                    }
                    str = a11[1];
                }
                a(str, jSONArray);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(f37667a + e11.toString(), new Object[0]);
            }
        }
    }

    private static void a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("delay");
        if (optLong >= 0) {
            com.igexin.push.core.e.b(optLong);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("address_list");
        com.igexin.c.a.c.a.a("redirect|" + optLong + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + optJSONArray.toString(), new Object[0]);
        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
            String optString = optJSONArray.optString(i11);
            int indexOf = optString.indexOf(44);
            if (indexOf > 0) {
                String substring = optString.substring(0, indexOf);
                String substring2 = optString.substring(indexOf + 1);
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    long parseLong = Long.parseLong(substring2);
                    a.b bVar = new a.b();
                    bVar.f37442a = "socket://".concat(String.valueOf(substring));
                    bVar.f37443b = currentTimeMillis + (parseLong * 1000);
                    arrayList.add(bVar);
                } catch (NumberFormatException e11) {
                    com.igexin.c.a.c.a.a(e11);
                }
            }
        }
        com.igexin.push.c.c.a().d().a(arrayList);
    }

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = f37667a;
        sb2.append(str2);
        sb2.append("|redirect server resp data : ");
        sb2.append(jSONObject);
        com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
        try {
            a(jSONObject);
            com.igexin.c.a.b.a.a.d.a().g();
            if (jSONObject.has("loc") && jSONObject.has("conf")) {
                try {
                    SDKUrlConfig.setLocation(jSONObject.getString("loc"));
                    String str3 = com.igexin.push.core.e.f38029f;
                    com.igexin.c.a.c.a.a(str2 + " set group id : " + com.igexin.push.core.e.f38029f, new Object[0]);
                    JSONArray jSONArray = jSONObject.getJSONArray("conf");
                    String[] a11 = a(jSONArray);
                    if (a11 != null && a11.length > 1) {
                        String[] idcConfigUrl = SDKUrlConfig.getIdcConfigUrl();
                        if (idcConfigUrl != null && (idcConfigUrl.length <= 1 || a11[1].equals(idcConfigUrl[1]))) {
                            com.igexin.c.a.c.a.a(str2 + "|current idc config url == new idc config url, return", new Object[0]);
                        }
                        if (com.igexin.push.core.e.f38013ao == 0) {
                            str = a11[1];
                        } else if (System.currentTimeMillis() - com.igexin.push.core.e.f38013ao > Constants.MILLS_OF_WATCH_DOG) {
                            str = a11[1];
                        } else {
                            com.igexin.c.a.c.a.a(str2 + "|get idc cfg last time less than 2 hours return", new Object[0]);
                        }
                        a(str, jSONArray);
                    }
                } catch (Exception e11) {
                    com.igexin.c.a.c.a.a(f37667a + e11.toString(), new Object[0]);
                }
            }
            if (com.igexin.push.g.g.a()) {
                com.igexin.c.a.c.a.a(f37667a + "|redirect reInit so ~~~~~", new Object[0]);
                com.igexin.push.g.g.d();
            }
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(f37667a + e12.toString(), new Object[0]);
        }
        return true;
    }

    public static String[] a(JSONArray jSONArray) {
        String[] strArr = null;
        try {
            strArr = new String[jSONArray.length()];
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                strArr[i11] = "https://" + jSONArray.getString(i11);
            }
            return strArr;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(f37667a + "|parseIDCConfigURL exception" + e11.toString(), new Object[0]);
            return strArr;
        }
    }
}
