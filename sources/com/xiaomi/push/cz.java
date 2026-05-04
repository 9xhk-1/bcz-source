package com.xiaomi.push;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class cz implements Comparable<cz> {

    /* renamed from: a, reason: collision with root package name */
    protected int f45372a;

    /* renamed from: a, reason: collision with other field name */
    private long f231a;

    /* renamed from: a, reason: collision with other field name */
    String f232a;

    /* renamed from: a, reason: collision with other field name */
    private final LinkedList<cp> f233a;

    public cz() {
        this(null, 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(cz czVar) {
        if (czVar == null) {
            return 1;
        }
        return czVar.f45372a - this.f45372a;
    }

    public String toString() {
        return this.f232a + ":" + this.f45372a;
    }

    public cz(String str) {
        this(str, 0);
    }

    public synchronized cz a(JSONObject jSONObject) {
        this.f231a = jSONObject.getLong("tt");
        this.f45372a = jSONObject.getInt("wt");
        this.f232a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            this.f233a.add(new cp().a(jSONArray.getJSONObject(i11)));
        }
        return this;
    }

    public cz(String str, int i11) {
        this.f233a = new LinkedList<>();
        this.f231a = 0L;
        this.f232a = str;
        this.f45372a = i11;
    }

    public synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("tt", this.f231a);
            jSONObject.put("wt", this.f45372a);
            jSONObject.put("host", this.f232a);
            JSONArray jSONArray = new JSONArray();
            Iterator<cp> it = this.f233a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m5793a());
            }
            jSONObject.put("ah", jSONArray);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public synchronized void a(cp cpVar) {
        if (cpVar != null) {
            try {
                this.f233a.add(cpVar);
                int a11 = cpVar.a();
                if (a11 > 0) {
                    this.f45372a += cpVar.a();
                } else {
                    int i11 = 0;
                    for (int size = this.f233a.size() - 1; size >= 0 && this.f233a.get(size).a() < 0; size--) {
                        i11++;
                    }
                    this.f45372a += a11 * i11;
                }
                if (this.f233a.size() > 30) {
                    this.f45372a -= this.f233a.remove().a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
