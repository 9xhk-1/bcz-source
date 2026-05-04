package com.xiaomi.push;

import android.os.Bundle;

/* loaded from: classes8.dex */
public class go extends gm {

    /* renamed from: a, reason: collision with root package name */
    private int f45648a;

    /* renamed from: a, reason: collision with other field name */
    private a f476a;

    /* renamed from: a, reason: collision with other field name */
    private b f477a;

    /* renamed from: b, reason: collision with root package name */
    private String f45649b;

    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public go(Bundle bundle) {
        super(bundle);
        this.f477a = b.available;
        this.f45649b = null;
        this.f45648a = Integer.MIN_VALUE;
        this.f476a = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f477a = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f45649b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f45648a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f476a = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    @Override // com.xiaomi.push.gm
    public Bundle a() {
        Bundle a11 = super.a();
        b bVar = this.f477a;
        if (bVar != null) {
            a11.putString("ext_pres_type", bVar.toString());
        }
        String str = this.f45649b;
        if (str != null) {
            a11.putString("ext_pres_status", str);
        }
        int i11 = this.f45648a;
        if (i11 != Integer.MIN_VALUE) {
            a11.putInt("ext_pres_prio", i11);
        }
        a aVar = this.f476a;
        if (aVar != null && aVar != a.available) {
            a11.putString("ext_pres_mode", aVar.toString());
        }
        return a11;
    }

    public go(b bVar) {
        this.f477a = b.available;
        this.f45649b = null;
        this.f45648a = Integer.MIN_VALUE;
        this.f476a = null;
        a(bVar);
    }

    @Override // com.xiaomi.push.gm
    /* renamed from: a */
    public String mo5990a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<presence");
        if (p() != null) {
            sb2.append(" xmlns=\"");
            sb2.append(p());
            sb2.append("\"");
        }
        if (j() != null) {
            sb2.append(" id=\"");
            sb2.append(j());
            sb2.append("\"");
        }
        if (l() != null) {
            sb2.append(" to=\"");
            sb2.append(gx.a(l()));
            sb2.append("\"");
        }
        if (m() != null) {
            sb2.append(" from=\"");
            sb2.append(gx.a(m()));
            sb2.append("\"");
        }
        if (k() != null) {
            sb2.append(" chid=\"");
            sb2.append(gx.a(k()));
            sb2.append("\"");
        }
        if (this.f477a != null) {
            sb2.append(" type=\"");
            sb2.append(this.f477a);
            sb2.append("\"");
        }
        sb2.append(">");
        if (this.f45649b != null) {
            sb2.append("<status>");
            sb2.append(gx.a(this.f45649b));
            sb2.append("</status>");
        }
        if (this.f45648a != Integer.MIN_VALUE) {
            sb2.append("<priority>");
            sb2.append(this.f45648a);
            sb2.append("</priority>");
        }
        a aVar = this.f476a;
        if (aVar != null && aVar != a.available) {
            sb2.append("<show>");
            sb2.append(this.f476a);
            sb2.append("</show>");
        }
        sb2.append(o());
        gq m5991a = m5991a();
        if (m5991a != null) {
            sb2.append(m5991a.m5994a());
        }
        sb2.append("</presence>");
        return sb2.toString();
    }

    public void a(int i11) {
        if (i11 >= -128 && i11 <= 128) {
            this.f45648a = i11;
            return;
        }
        throw new IllegalArgumentException("Priority value " + i11 + " is not valid. Valid range is -128 through 128.");
    }

    public void a(a aVar) {
        this.f476a = aVar;
    }

    public void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Type cannot be null");
        }
        this.f477a = bVar;
    }

    public void a(String str) {
        this.f45649b = str;
    }
}
