package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends a {
    public c(Context context, boolean z11) {
        this.f35655d = z11;
        if (a("grs_sdk_global_route_config.json", context) == 0) {
            this.f35654c = true;
        }
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : a(jSONObject);
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int b(String str) {
        this.f35652a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            long j11 = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f35652a.b(string);
            this.f35652a.a(j11);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e11) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int c(String str) {
        JSONObject jSONObject;
        this.f35653b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() == 0) {
                return 0;
            }
            this.f35653b.addAll(a(jSONObject));
            return 0;
        } catch (JSONException e11) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: JSONException -> 0x0072, TryCatch #0 {JSONException -> 0x0072, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0024, B:9:0x003a, B:12:0x0043, B:13:0x0056, B:15:0x005c, B:17:0x006d, B:18:0x0087, B:19:0x009d, B:21:0x00a3, B:23:0x00b7, B:30:0x00bd, B:34:0x00ce, B:35:0x0075, B:37:0x007b, B:38:0x0080, B:41:0x00e2, B:43:0x00ed, B:44:0x00fc, B:45:0x0106, B:47:0x010d, B:48:0x0114, B:52:0x00f2, B:54:0x00f8, B:55:0x0101), top: B:2:0x000c }] */
    @Override // com.huawei.hms.framework.network.grs.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.c.f(java.lang.String):int");
    }

    private List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.c(jSONObject2.getString("name"));
                bVar.a(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        hashSet.add((String) jSONArray.get(i11));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e11) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return new ArrayList();
        }
    }
}
