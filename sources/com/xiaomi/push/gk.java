package com.xiaomi.push;

import android.os.Bundle;
import com.heytap.mcssdk.constant.IntentConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class gk extends gm {

    /* renamed from: a, reason: collision with root package name */
    private a f45621a;

    /* renamed from: a, reason: collision with other field name */
    private final Map<String, String> f468a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45622a = new a(ct.d.f46852f);

        /* renamed from: b, reason: collision with root package name */
        public static final a f45623b = new a(ct.d.f46854h);

        /* renamed from: c, reason: collision with root package name */
        public static final a f45624c = new a("result");

        /* renamed from: d, reason: collision with root package name */
        public static final a f45625d = new a("error");

        /* renamed from: e, reason: collision with root package name */
        public static final a f45626e = new a(IntentConstant.COMMAND);

        /* renamed from: a, reason: collision with other field name */
        private String f469a;

        private a(String str) {
            this.f469a = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = f45622a;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = f45623b;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = f45625d;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = f45624c;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = f45626e;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f469a;
        }
    }

    public gk() {
        this.f45621a = a.f45622a;
        this.f468a = new HashMap();
    }

    @Override // com.xiaomi.push.gm
    public Bundle a() {
        Bundle a11 = super.a();
        a aVar = this.f45621a;
        if (aVar != null) {
            a11.putString("ext_iq_type", aVar.toString());
        }
        return a11;
    }

    public String b() {
        return null;
    }

    public gk(Bundle bundle) {
        super(bundle);
        this.f45621a = a.f45622a;
        this.f468a = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f45621a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public a m5989a() {
        return this.f45621a;
    }

    @Override // com.xiaomi.push.gm
    /* renamed from: a, reason: collision with other method in class */
    public String mo5990a() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<iq ");
        if (j() != null) {
            sb2.append("id=\"" + j() + "\" ");
        }
        if (l() != null) {
            sb2.append("to=\"");
            sb2.append(gx.a(l()));
            sb2.append("\" ");
        }
        if (m() != null) {
            sb2.append("from=\"");
            sb2.append(gx.a(m()));
            sb2.append("\" ");
        }
        if (k() != null) {
            sb2.append("chid=\"");
            sb2.append(gx.a(k()));
            sb2.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f468a.entrySet()) {
            sb2.append(gx.a(entry.getKey()));
            sb2.append("=\"");
            sb2.append(gx.a(entry.getValue()));
            sb2.append("\" ");
        }
        if (this.f45621a == null) {
            str = "type=\"get\">";
        } else {
            sb2.append("type=\"");
            sb2.append(m5989a());
            str = "\">";
        }
        sb2.append(str);
        String b11 = b();
        if (b11 != null) {
            sb2.append(b11);
        }
        sb2.append(o());
        gq m5991a = m5991a();
        if (m5991a != null) {
            sb2.append(m5991a.m5994a());
        }
        sb2.append("</iq>");
        return sb2.toString();
    }

    public void a(a aVar) {
        if (aVar == null) {
            this.f45621a = a.f45622a;
        } else {
            this.f45621a = aVar;
        }
    }

    public synchronized void a(Map<String, String> map) {
        this.f468a.putAll(map);
    }
}
