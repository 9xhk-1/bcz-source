package tz;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f91392a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f91393b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f91394c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f91395d;

    /* renamed from: e, reason: collision with root package name */
    public Long f91396e;

    /* renamed from: f, reason: collision with root package name */
    public String f91397f;

    /* renamed from: g, reason: collision with root package name */
    public final List f91398g = new ArrayList();

    public static w0 f(String str) {
        w0 w0Var = new w0();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("wakeupStatsEnabled")) {
                    w0Var.b(Boolean.valueOf(jSONObject.optBoolean("wakeupStatsEnabled", true)));
                }
                if (jSONObject.has("aliveStatsEnabled")) {
                    w0Var.j(Boolean.valueOf(jSONObject.optBoolean("aliveStatsEnabled", true)));
                }
                if (jSONObject.has("registerStatsEnabled")) {
                    w0Var.g(Boolean.valueOf(jSONObject.optBoolean("registerStatsEnabled", true)));
                }
                if (jSONObject.has("eventStatsEnabled")) {
                    w0Var.j(Boolean.valueOf(jSONObject.optBoolean("eventStatsEnabled", true)));
                }
                if (jSONObject.has("reportPeriod")) {
                    w0Var.c(Long.valueOf(jSONObject.optLong("reportPeriod")));
                }
                if (jSONObject.has("installId")) {
                    w0Var.d(jSONObject.optString("installId"));
                }
            } catch (JSONException unused) {
            }
        }
        return w0Var;
    }

    public Boolean a() {
        return this.f91392a;
    }

    public void b(Boolean bool) {
        this.f91392a = bool;
    }

    public void c(Long l11) {
        this.f91396e = l11;
    }

    public void d(String str) {
        this.f91397f = str;
    }

    public void e(w0 w0Var) {
        this.f91392a = w0Var.a();
        this.f91393b = w0Var.k();
        this.f91394c = w0Var.i();
        this.f91395d = w0Var.k();
        this.f91396e = w0Var.o();
        this.f91397f = w0Var.p();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w0 w0Var = (w0) obj;
            Boolean bool = this.f91392a;
            if (bool == null ? w0Var.f91392a != null : !bool.equals(w0Var.f91392a)) {
                return false;
            }
            Boolean bool2 = this.f91393b;
            if (bool2 == null ? w0Var.f91393b != null : !bool2.equals(w0Var.f91393b)) {
                return false;
            }
            Boolean bool3 = this.f91394c;
            if (bool3 == null ? w0Var.f91394c != null : !bool3.equals(w0Var.f91394c)) {
                return false;
            }
            Boolean bool4 = this.f91395d;
            if (bool4 == null ? w0Var.f91395d != null : !bool4.equals(w0Var.f91395d)) {
                return false;
            }
            Long l11 = this.f91396e;
            if (l11 == null ? w0Var.f91396e != null : !l11.equals(w0Var.f91396e)) {
                return false;
            }
            String str = this.f91397f;
            String str2 = w0Var.f91397f;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public void g(Boolean bool) {
        this.f91394c = bool;
    }

    public boolean h() {
        return l(this.f91392a);
    }

    public int hashCode() {
        Boolean bool = this.f91392a;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.f91393b;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f91394c;
        int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f91395d;
        int hashCode4 = (hashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Long l11 = this.f91396e;
        int hashCode5 = (hashCode4 + (l11 != null ? l11.hashCode() : 0)) * 31;
        String str = this.f91397f;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public Boolean i() {
        return this.f91394c;
    }

    public void j(Boolean bool) {
        this.f91395d = bool;
    }

    public Boolean k() {
        return this.f91395d;
    }

    public final boolean l(Boolean bool) {
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean m() {
        return l(this.f91395d);
    }

    public boolean n() {
        return l(this.f91394c);
    }

    public Long o() {
        return this.f91396e;
    }

    public String p() {
        return this.f91397f;
    }

    public void q() {
        Iterator it = this.f91398g.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).a(this);
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wakeupStatsEnabled", this.f91392a);
            jSONObject.put("registerStatsEnabled", this.f91394c);
            jSONObject.put("eventStatsEnabled", this.f91395d);
            jSONObject.put("reportPeriod", this.f91396e);
            jSONObject.put("installId", this.f91397f);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
