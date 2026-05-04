package com.huawei.hms.framework.network.grs.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.g.j.d;
import com.huawei.hms.framework.network.grs.h.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35718a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static d f35719b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35720c = new Object();

    public static synchronized d a(Context context) {
        synchronized (a.class) {
            synchronized (f35720c) {
                d dVar = f35719b;
                if (dVar != null) {
                    return dVar;
                }
                String a11 = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
                ArrayList arrayList = null;
                if (TextUtils.isEmpty(a11)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(a11).getJSONObject("grs_server");
                    JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        arrayList = new ArrayList();
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            arrayList.add(jSONArray.get(i11).toString());
                        }
                    }
                    d dVar2 = new d();
                    f35719b = dVar2;
                    dVar2.a(arrayList);
                    f35719b.a(jSONObject.getString("grs_query_endpoint_2.0"));
                    f35719b.a(jSONObject.getInt("grs_query_timeout"));
                } catch (JSONException e11) {
                    Logger.w(f35718a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e11.getMessage()));
                }
                return f35719b;
            }
        }
    }
}
