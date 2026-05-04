package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import android.net.Network;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.c.g;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8951a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<String, String> f8952b = new HashMap<>();

    public static long a(Context context) {
        return c.b(context, "key_difference_time", 0L);
    }

    public static String b(Context context) {
        return c.b(context, "key_p_rset_v3.8.2", "0");
    }

    private static void c(Context context) {
        String a11 = d.a();
        g.a aVar = new g.a();
        aVar.a("reqTimestamp");
        aVar.b(a11);
        JSONObject jSONObject = new cn.com.chinatelecom.account.api.c.b(context).a(g.b(), "", 1, aVar.a()).f8948b;
        if (jSONObject != null) {
            a(context, jSONObject.optLong("msg", -1L));
        }
    }

    public static cn.com.chinatelecom.account.api.c.d a(Context context, HttpURLConnection httpURLConnection, boolean z11) {
        if (!z11) {
            return null;
        }
        cn.com.chinatelecom.account.api.c.d dVar = new cn.com.chinatelecom.account.api.c.d();
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            List<String> list = headerFields.get("p");
            if (list != null && list.size() > 0) {
                String str = list.get(0);
                cn.com.chinatelecom.account.api.a.a(f8951a, "request protocol : " + str);
                dVar.f8918b = false;
            }
            List<String> list2 = headerFields.get("Set-Cookie");
            if (list2 != null && list2.size() > 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= list2.size()) {
                        break;
                    }
                    String str2 = list2.get(0);
                    if (!TextUtils.isEmpty(str2) && str2.contains("gw_auth")) {
                        dVar.f8917a = a(str2, "gw_auth");
                        break;
                    }
                    i11++;
                }
            }
            List<String> list3 = headerFields.get("Log-Level");
            if (list3 != null && !list3.isEmpty()) {
                for (int i12 = 0; i12 < list3.size(); i12++) {
                    String str3 = list3.get(0);
                    if (!TextUtils.isEmpty(str3)) {
                        f.a(context, str3);
                    }
                }
            }
            List<String> list4 = headerFields.get("p-reset");
            if (list4 != null && !list4.isEmpty()) {
                String str4 = list4.get(0);
                if (!TextUtils.isEmpty(str4)) {
                    a(context, str4);
                }
            }
            List<String> list5 = headerFields.get("p-ikgx");
            if (list5 != null && !list5.isEmpty()) {
                String str5 = list5.get(0);
                if (!TextUtils.isEmpty(str5)) {
                    dVar.f8919c = str5;
                    g.f8996d = str5;
                }
            }
            return dVar;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return dVar;
        }
    }

    public static cn.com.chinatelecom.account.api.c.d a(HttpURLConnection httpURLConnection) {
        cn.com.chinatelecom.account.api.c.d dVar = new cn.com.chinatelecom.account.api.c.d();
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            List<String> list = headerFields.get("rdt_allow");
            if (list != null && list.size() > 0) {
                dVar.f8920d = list.get(0);
                cn.com.chinatelecom.account.api.a.a(f8951a, "request method : " + dVar.f8920d);
            }
            List<String> list2 = headerFields.get("p-ikgx");
            if (list2 != null && !list2.isEmpty()) {
                String str = list2.get(0);
                if (!TextUtils.isEmpty(str)) {
                    dVar.f8919c = str;
                }
            }
            return dVar;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return dVar;
        }
    }

    public static synchronized String a(int i11) {
        synchronized (a.class) {
            return i11 == cn.com.chinatelecom.account.api.b.f8853d ? "presdk" : "preauthIfaa";
        }
    }

    private static String a(String str, String str2) {
        try {
            String[] split = str.split(com.alipay.sdk.m.u.i.f11097b);
            for (int i11 = 0; i11 < split.length; i11++) {
                if (split[i11].contains(str2)) {
                    return split[i11].split(ContainerUtils.KEY_VALUE_DELIMITER)[1];
                }
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static JSONObject a(Context context, cn.com.chinatelecom.account.api.c.h hVar, String str, Network network, boolean z11, String str2) {
        JSONObject jSONObject;
        if (hVar == null || (jSONObject = hVar.f8948b) == null) {
            return j.b();
        }
        try {
            if (hVar.f8947a != -1) {
                int optInt = jSONObject.optInt("result");
                String optString = jSONObject.optString("data");
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(h.a(optString, str));
                        if (optInt == 0) {
                            jSONObject2.put("gwAuth", hVar.f8949c);
                        }
                        if (optInt == -10020) {
                            jSONObject.put("taskId", str);
                        }
                        jSONObject.put("data", jSONObject2);
                    } catch (Throwable th2) {
                        cn.com.chinatelecom.account.api.a.a(f8951a, "dct", th2);
                        jSONObject.put("data", (Object) null);
                    }
                }
                if (optInt == 30002 && z11) {
                    JSONObject jSONObject3 = (JSONObject) jSONObject.opt("data");
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject3.optJSONArray("urls");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            arrayList.add(optJSONArray.getString(i11));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return a(context, arrayList, str, network, str2);
                }
                if (optInt == -10009 || optInt == -30001) {
                    long optLong = jSONObject.optLong("timeStamp", -1L);
                    if (optLong == -1) {
                        c(context);
                    } else {
                        a(context, optLong);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject a(Context context, List<String> list, String str, Network network, String str2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                String str3 = list.get(i11);
                if (!TextUtils.isEmpty(str3)) {
                    g.c(context);
                    g.a aVar = new g.a();
                    aVar.b(str2);
                    aVar.a(network);
                    JSONObject a11 = a(context, new cn.com.chinatelecom.account.api.c.b(context).a(str3, "", 0, aVar.a()), str, network, false, str2);
                    if (a11 != null && a11.optInt("result") == 0) {
                        return a11;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return j.b(80001, cn.com.chinatelecom.account.api.a.d.a(j.f8999b) + "- redirect 30002 ");
    }

    private static void a(Context context, long j11) {
        if (j11 > 0) {
            c.a(context, "key_difference_time", j11 - System.currentTimeMillis());
        }
    }

    private static void a(Context context, String str) {
        c.a(context, "key_p_rset_v3.8.2", str);
    }
}
