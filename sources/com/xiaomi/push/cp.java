package com.xiaomi.push;

import ix.g;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class cp {

    /* renamed from: a, reason: collision with root package name */
    private int f45349a;

    /* renamed from: a, reason: collision with other field name */
    private long f211a;

    /* renamed from: a, reason: collision with other field name */
    private String f212a;

    /* renamed from: b, reason: collision with root package name */
    private long f45350b;

    /* renamed from: c, reason: collision with root package name */
    private long f45351c;

    public cp() {
        this(0, 0L, 0L, null);
    }

    public int a() {
        return this.f45349a;
    }

    public cp(int i11, long j11, long j12, Exception exc) {
        this.f45349a = i11;
        this.f211a = j11;
        this.f45351c = j12;
        this.f45350b = System.currentTimeMillis();
        if (exc != null) {
            this.f212a = exc.getClass().getSimpleName();
        }
    }

    public cp a(JSONObject jSONObject) {
        this.f211a = jSONObject.getLong("cost");
        this.f45351c = jSONObject.getLong(g.b.f62794h);
        this.f45350b = jSONObject.getLong("ts");
        this.f45349a = jSONObject.getInt("wt");
        this.f212a = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public JSONObject m5793a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f211a);
        jSONObject.put(g.b.f62794h, this.f45351c);
        jSONObject.put("ts", this.f45350b);
        jSONObject.put("wt", this.f45349a);
        jSONObject.put("expt", this.f212a);
        return jSONObject;
    }
}
