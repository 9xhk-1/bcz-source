package com.alipay.sdk.m.c0;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f10500a;

    /* renamed from: b, reason: collision with root package name */
    public String f10501b;

    /* renamed from: c, reason: collision with root package name */
    public String f10502c;

    /* renamed from: d, reason: collision with root package name */
    public String f10503d;

    /* renamed from: e, reason: collision with root package name */
    public String f10504e;

    /* renamed from: f, reason: collision with root package name */
    public String f10505f;

    /* renamed from: g, reason: collision with root package name */
    public String f10506g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10500a = str;
        this.f10501b = str2;
        this.f10502c = str3;
        this.f10503d = str4;
        this.f10504e = str5;
        this.f10505f = str6;
        this.f10506g = str7;
    }

    public final String toString() {
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        String str2;
        StringBuilder sb4;
        String str3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f10500a);
        stringBuffer.append("," + this.f10501b);
        stringBuffer.append("," + this.f10502c);
        stringBuffer.append("," + this.f10503d);
        if (com.alipay.sdk.m.z.a.a(this.f10504e) || this.f10504e.length() < 20) {
            sb2 = new StringBuilder(",");
            str = this.f10504e;
        } else {
            sb2 = new StringBuilder(",");
            str = this.f10504e.substring(0, 20);
        }
        sb2.append(str);
        stringBuffer.append(sb2.toString());
        if (com.alipay.sdk.m.z.a.a(this.f10505f) || this.f10505f.length() < 20) {
            sb3 = new StringBuilder(",");
            str2 = this.f10505f;
        } else {
            sb3 = new StringBuilder(",");
            str2 = this.f10505f.substring(0, 20);
        }
        sb3.append(str2);
        stringBuffer.append(sb3.toString());
        if (com.alipay.sdk.m.z.a.a(this.f10506g) || this.f10506g.length() < 20) {
            sb4 = new StringBuilder(",");
            str3 = this.f10506g;
        } else {
            sb4 = new StringBuilder(",");
            str3 = this.f10506g.substring(0, 20);
        }
        sb4.append(str3);
        stringBuffer.append(sb4.toString());
        return stringBuffer.toString();
    }
}
