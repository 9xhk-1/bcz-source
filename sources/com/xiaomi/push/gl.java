package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes8.dex */
public class gl extends gm {

    /* renamed from: a, reason: collision with root package name */
    private boolean f45627a;

    /* renamed from: b, reason: collision with root package name */
    private String f45628b;

    /* renamed from: b, reason: collision with other field name */
    private boolean f470b;

    /* renamed from: c, reason: collision with root package name */
    private String f45629c;

    /* renamed from: d, reason: collision with root package name */
    private String f45630d;

    /* renamed from: e, reason: collision with root package name */
    private String f45631e;

    /* renamed from: f, reason: collision with root package name */
    private String f45632f;

    /* renamed from: g, reason: collision with root package name */
    private String f45633g;

    /* renamed from: h, reason: collision with root package name */
    private String f45634h;

    /* renamed from: i, reason: collision with root package name */
    private String f45635i;

    /* renamed from: j, reason: collision with root package name */
    private String f45636j;

    /* renamed from: k, reason: collision with root package name */
    private String f45637k;

    /* renamed from: l, reason: collision with root package name */
    private String f45638l;

    public gl() {
        this.f45628b = null;
        this.f45629c = null;
        this.f45627a = false;
        this.f45635i = "";
        this.f45636j = "";
        this.f45637k = "";
        this.f45638l = "";
        this.f470b = false;
    }

    @Override // com.xiaomi.push.gm
    public Bundle a() {
        Bundle a11 = super.a();
        if (!TextUtils.isEmpty(this.f45628b)) {
            a11.putString("ext_msg_type", this.f45628b);
        }
        String str = this.f45630d;
        if (str != null) {
            a11.putString("ext_msg_lang", str);
        }
        String str2 = this.f45631e;
        if (str2 != null) {
            a11.putString("ext_msg_sub", str2);
        }
        String str3 = this.f45632f;
        if (str3 != null) {
            a11.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f45633g)) {
            a11.putString("ext_body_encode", this.f45633g);
        }
        String str4 = this.f45629c;
        if (str4 != null) {
            a11.putString("ext_msg_thread", str4);
        }
        String str5 = this.f45634h;
        if (str5 != null) {
            a11.putString("ext_msg_appid", str5);
        }
        if (this.f45627a) {
            a11.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f45635i)) {
            a11.putString("ext_msg_seq", this.f45635i);
        }
        if (!TextUtils.isEmpty(this.f45636j)) {
            a11.putString("ext_msg_mseq", this.f45636j);
        }
        if (!TextUtils.isEmpty(this.f45637k)) {
            a11.putString("ext_msg_fseq", this.f45637k);
        }
        if (this.f470b) {
            a11.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f45638l)) {
            a11.putString("ext_msg_status", this.f45638l);
        }
        return a11;
    }

    public String b() {
        return this.f45628b;
    }

    public String c() {
        return this.f45634h;
    }

    public String d() {
        return this.f45635i;
    }

    public String e() {
        return this.f45636j;
    }

    @Override // com.xiaomi.push.gm
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gl glVar = (gl) obj;
            if (!super.equals(glVar)) {
                return false;
            }
            String str = this.f45632f;
            if (str == null ? glVar.f45632f != null : !str.equals(glVar.f45632f)) {
                return false;
            }
            String str2 = this.f45630d;
            if (str2 == null ? glVar.f45630d != null : !str2.equals(glVar.f45630d)) {
                return false;
            }
            String str3 = this.f45631e;
            if (str3 == null ? glVar.f45631e != null : !str3.equals(glVar.f45631e)) {
                return false;
            }
            String str4 = this.f45629c;
            if (str4 == null ? glVar.f45629c != null : !str4.equals(glVar.f45629c)) {
                return false;
            }
            if (this.f45628b == glVar.f45628b) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f45637k;
    }

    public String g() {
        return this.f45638l;
    }

    public String h() {
        return this.f45630d;
    }

    @Override // com.xiaomi.push.gm
    public int hashCode() {
        String str = this.f45628b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45632f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45629c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45630d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f45631e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public void i(String str) {
        this.f45629c = str;
    }

    public void j(String str) {
        this.f45630d = str;
    }

    public gl(Bundle bundle) {
        super(bundle);
        this.f45628b = null;
        this.f45629c = null;
        this.f45627a = false;
        this.f45635i = "";
        this.f45636j = "";
        this.f45637k = "";
        this.f45638l = "";
        this.f470b = false;
        this.f45628b = bundle.getString("ext_msg_type");
        this.f45630d = bundle.getString("ext_msg_lang");
        this.f45629c = bundle.getString("ext_msg_thread");
        this.f45631e = bundle.getString("ext_msg_sub");
        this.f45632f = bundle.getString("ext_msg_body");
        this.f45633g = bundle.getString("ext_body_encode");
        this.f45634h = bundle.getString("ext_msg_appid");
        this.f45627a = bundle.getBoolean("ext_msg_trans", false);
        this.f470b = bundle.getBoolean("ext_msg_encrypt", false);
        this.f45635i = bundle.getString("ext_msg_seq");
        this.f45636j = bundle.getString("ext_msg_mseq");
        this.f45637k = bundle.getString("ext_msg_fseq");
        this.f45638l = bundle.getString("ext_msg_status");
    }

    @Override // com.xiaomi.push.gm
    /* renamed from: a */
    public String mo5990a() {
        gq m5991a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<message");
        if (p() != null) {
            sb2.append(" xmlns=\"");
            sb2.append(p());
            sb2.append("\"");
        }
        if (this.f45630d != null) {
            sb2.append(" xml:lang=\"");
            sb2.append(h());
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
        if (!TextUtils.isEmpty(d())) {
            sb2.append(" seq=\"");
            sb2.append(d());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(e())) {
            sb2.append(" mseq=\"");
            sb2.append(e());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(f())) {
            sb2.append(" fseq=\"");
            sb2.append(f());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(g())) {
            sb2.append(" status=\"");
            sb2.append(g());
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
        if (this.f45627a) {
            sb2.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f45634h)) {
            sb2.append(" appid=\"");
            sb2.append(c());
            sb2.append("\"");
        }
        if (!TextUtils.isEmpty(this.f45628b)) {
            sb2.append(" type=\"");
            sb2.append(this.f45628b);
            sb2.append("\"");
        }
        if (this.f470b) {
            sb2.append(" s=\"1\"");
        }
        sb2.append(">");
        if (this.f45631e != null) {
            sb2.append("<subject>");
            sb2.append(gx.a(this.f45631e));
            sb2.append("</subject>");
        }
        if (this.f45632f != null) {
            sb2.append("<body");
            if (!TextUtils.isEmpty(this.f45633g)) {
                sb2.append(" encode=\"");
                sb2.append(this.f45633g);
                sb2.append("\"");
            }
            sb2.append(">");
            sb2.append(gx.a(this.f45632f));
            sb2.append("</body>");
        }
        if (this.f45629c != null) {
            sb2.append("<thread>");
            sb2.append(this.f45629c);
            sb2.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f45628b) && (m5991a = m5991a()) != null) {
            sb2.append(m5991a.m5994a());
        }
        sb2.append(o());
        sb2.append("</message>");
        return sb2.toString();
    }

    public void b(String str) {
        this.f45635i = str;
    }

    public void c(String str) {
        this.f45636j = str;
    }

    public void d(String str) {
        this.f45637k = str;
    }

    public void e(String str) {
        this.f45638l = str;
    }

    public void f(String str) {
        this.f45628b = str;
    }

    public void g(String str) {
        this.f45631e = str;
    }

    public void h(String str) {
        this.f45632f = str;
    }

    public void a(String str) {
        this.f45634h = str;
    }

    public void b(boolean z11) {
        this.f470b = z11;
    }

    public void a(String str, String str2) {
        this.f45632f = str;
        this.f45633g = str2;
    }

    public void a(boolean z11) {
        this.f45627a = z11;
    }
}
