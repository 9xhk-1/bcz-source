package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class cr {

    /* renamed from: a, reason: collision with root package name */
    private String f45362a;

    /* renamed from: a, reason: collision with other field name */
    private final ArrayList<cq> f217a = new ArrayList<>();

    public cr() {
    }

    public synchronized cq a() {
        for (int size = this.f217a.size() - 1; size >= 0; size--) {
            cq cqVar = this.f217a.get(size);
            if (cqVar.m5797a()) {
                cu.a().m5808a(cqVar.a());
                return cqVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45362a);
        sb2.append("\n");
        Iterator<cq> it = this.f217a.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public cr(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f45362a = str;
    }

    public synchronized cr a(JSONObject jSONObject) {
        this.f45362a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            this.f217a.add(new cq(this.f45362a).a(jSONArray.getJSONObject(i11)));
        }
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5798a() {
        return this.f45362a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ArrayList<cq> m5799a() {
        return this.f217a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m5800a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("host", this.f45362a);
            JSONArray jSONArray = new JSONArray();
            Iterator<cq> it = this.f217a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m5795a());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public synchronized void a(cq cqVar) {
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= this.f217a.size()) {
                    break;
                }
                if (this.f217a.get(i11).a(cqVar)) {
                    this.f217a.set(i11, cqVar);
                    break;
                }
                i11++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 >= this.f217a.size()) {
            this.f217a.add(cqVar);
        }
    }

    public synchronized void a(boolean z11) {
        try {
            for (int size = this.f217a.size() - 1; size >= 0; size--) {
                cq cqVar = this.f217a.get(size);
                if (z11) {
                    if (!cqVar.c()) {
                    }
                    this.f217a.remove(size);
                } else {
                    if (cqVar.b()) {
                    }
                    this.f217a.remove(size);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
