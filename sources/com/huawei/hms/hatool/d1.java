package com.huawei.hms.hatool;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d1 implements g {

    /* renamed from: a, reason: collision with root package name */
    private String f35779a;

    /* renamed from: b, reason: collision with root package name */
    private String f35780b;

    /* renamed from: c, reason: collision with root package name */
    private String f35781c;

    /* renamed from: d, reason: collision with root package name */
    private List<b1> f35782d;

    public d1(List<b1> list, String str, String str2, String str3) {
        this.f35779a = str;
        this.f35780b = str2;
        this.f35781c = str3;
        this.f35782d = list;
    }

    private void a() {
        d.a(q0.i(), "backup_event", n1.a(this.f35779a, this.f35781c, this.f35780b));
    }

    @Override // java.lang.Runnable
    public void run() {
        List<b1> list = this.f35782d;
        if (list == null || list.size() == 0) {
            v.d("hmsSdk", "failed events is empty");
            return;
        }
        if (c0.a(q0.i(), "cached_v2_1", q0.k() * 1048576)) {
            v.e("hmsSdk", "The cacheFile is full,Can not writing data! reqID:" + this.f35780b);
            return;
        }
        String a11 = n1.a(this.f35779a, this.f35781c);
        List<b1> list2 = c1.b(q0.i(), "cached_v2_1", a11).get(a11);
        if (list2 != null && list2.size() != 0) {
            this.f35782d.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<b1> it = this.f35782d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().d());
            } catch (JSONException unused) {
                v.e("hmsSdk", "event to json error");
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2.length() > q0.h() * 1048576) {
            v.e("hmsSdk", "this failed data is too long,can not writing it");
            this.f35782d = null;
            return;
        }
        v.d("hmsSdk", "data send failed, write to cache file...reqID:" + this.f35780b);
        d.b(q0.i(), "cached_v2_1", a11, jSONArray2);
        a();
    }
}
