package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected com.huawei.hms.framework.network.grs.local.model.a f35652a;

    /* renamed from: b, reason: collision with root package name */
    protected List<com.huawei.hms.framework.network.grs.local.model.b> f35653b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f35654c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f35655d = false;

    /* renamed from: e, reason: collision with root package name */
    protected Set<String> f35656e = new HashSet(16);

    private int b(String str, Context context) {
        if (g(com.huawei.hms.framework.network.grs.h.c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    private int g(String str) {
        int c11;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.f35655d && (c11 = c(str)) != 0) {
            return c11;
        }
        int b11 = b(str);
        return b11 != 0 ? b11 : f(str);
    }

    private int h(String str) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        int d11;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.f35655d || !((list = this.f35653b) == null || list.isEmpty()) || (d11 = d(str)) == 0) ? e(str) : d11;
    }

    public int a(String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(GrsApp.getInstance().getBrand("/"));
        sb2.append(str);
        return b(sb2.toString(), context) != 0 ? -1 : 0;
    }

    public abstract int b(String str);

    public abstract int c(String str);

    public boolean c() {
        return this.f35654c;
    }

    public int d(String str) {
        JSONArray jSONArray;
        this.f35653b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.f35653b.addAll(a(jSONArray));
            return 0;
        } catch (JSONException e11) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return -1;
        }
    }

    public int e(String str) {
        try {
            b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e11) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return -1;
        }
    }

    public abstract int f(String str);

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f35652a;
    }

    public Set<String> b() {
        return this.f35656e;
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z11) {
        Map<String, String> a11 = a(context, aVar, grsBaseInfo, str, z11);
        if (a11 != null) {
            return a11.get(str2);
        }
        Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(org.json.JSONArray r15) {
        /*
            r14 = this;
            if (r15 == 0) goto Lf5
            int r0 = r15.length()
            if (r0 != 0) goto La
            goto Lf5
        La:
            r0 = 0
            r1 = r0
        Lc:
            int r2 = r15.length()
            if (r1 >= r2) goto Lf5
            org.json.JSONObject r2 = r15.getJSONObject(r1)
            com.huawei.hms.framework.network.grs.local.model.c r3 = new com.huawei.hms.framework.network.grs.local.model.c
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.getString(r4)
            r3.b(r4)
            java.util.Set<java.lang.String> r5 = r14.f35656e
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Lf1
            java.util.Set<java.lang.String> r5 = r14.f35656e
            r5.add(r4)
            boolean r5 = r14.f35655d
            if (r5 == 0) goto Lf1
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r2.getString(r5)
            r3.c(r5)
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r2.getJSONArray(r5)
            r6 = r0
        L45:
            int r7 = r5.length()
            java.lang.String r8 = "AbstractLocalManager"
            if (r6 >= r7) goto Lbe
            java.lang.Object r7 = r5.get(r6)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            com.huawei.hms.framework.network.grs.local.model.d r9 = new com.huawei.hms.framework.network.grs.local.model.d
            r9.<init>()
            java.lang.String r10 = "countryOrAreaGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L65
        L60:
            java.lang.String r8 = r7.getString(r10)
            goto L79
        L65:
            java.lang.String r10 = "countryGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L6e
            goto L60
        L6e:
            java.lang.Object[] r10 = new java.lang.Object[]{r4}
            java.lang.String r11 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r8, r11, r10)
            java.lang.String r8 = "no-country"
        L79:
            r9.a(r8)
            java.lang.String r8 = "addresses"
            org.json.JSONObject r7 = r7.getJSONObject(r8)
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap
            r10 = 16
            r8.<init>(r10)
            java.util.Iterator r10 = r7.keys()
        L8d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb1
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r7.getString(r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L8d
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L8d
            java.lang.String r12 = r7.getString(r11)
            r8.put(r11, r12)
            goto L8d
        Lb1:
            r9.a(r8)
            java.lang.String r7 = r9.b()
            r3.a(r7, r9)
            int r6 = r6 + 1
            goto L45
        Lbe:
            java.lang.String r5 = "countryOrAreaGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Lcf
        Lc6:
            org.json.JSONArray r2 = r2.getJSONArray(r5)
            java.util.List r2 = r14.a(r2)
            goto Lde
        Lcf:
            java.lang.String r5 = "countryGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Ld8
            goto Lc6
        Ld8:
            java.lang.String r2 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.i(r8, r2)
            r2 = 0
        Lde:
            r3.a(r2)
            com.huawei.hms.framework.network.grs.local.model.a r2 = r14.f35652a
            if (r2 != 0) goto Lec
            com.huawei.hms.framework.network.grs.local.model.a r2 = new com.huawei.hms.framework.network.grs.local.model.a
            r2.<init>()
            r14.f35652a = r2
        Lec:
            com.huawei.hms.framework.network.grs.local.model.a r2 = r14.f35652a
            r2.a(r4, r3)
        Lf1:
            int r1 = r1 + 1
            goto Lc
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.a.b(org.json.JSONArray):void");
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> list = this.f35653b;
        if (list != null && !list.isEmpty()) {
            for (com.huawei.hms.framework.network.grs.local.model.b bVar : this.f35653b) {
                if (bVar.a().contains(str)) {
                    return bVar.b();
                }
            }
        }
        return null;
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray) {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(jSONObject.getString("id"));
                bVar.c(jSONObject.getString("name"));
                bVar.a(jSONObject.getString("description"));
                if (jSONObject.has("countriesOrAreas")) {
                    jSONArray2 = jSONObject.getJSONArray("countriesOrAreas");
                } else if (jSONObject.has("countries")) {
                    jSONArray2 = jSONObject.getJSONArray("countries");
                } else {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray2 != null && jSONArray2.length() != 0) {
                    for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                        hashSet.add((String) jSONArray2.get(i12));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e11) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e11.getMessage()));
            return new ArrayList();
        }
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z11) {
        com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.f35652a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c a11 = aVar2.a(str);
        if (a11 == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String b11 = e.b(context, aVar, a11.b(), grsBaseInfo, z11);
        if (b11 == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", a11.b());
            return null;
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> a12 = a11.a();
        com.huawei.hms.framework.network.grs.local.model.d a13 = a11.a((a12 == null || a12.size() == 0) ? a(b11) : a(a12, grsBaseInfo, b11).get(b11));
        if (a13 == null) {
            return null;
        }
        return a13.a();
    }

    private Map<String, String> a(List<com.huawei.hms.framework.network.grs.local.model.b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }

    public void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            Logger.d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                Object[] objArr = {str};
                if (h(com.huawei.hms.framework.network.grs.h.c.a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", objArr);
                } else {
                    Logger.i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", objArr);
                }
            }
        }
    }
}
