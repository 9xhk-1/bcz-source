package com.igexin.push.core.b;

import com.igexin.push.core.d;
import com.igexin.push.extension.mod.BaseActionBean;

/* loaded from: classes7.dex */
public final class s extends BaseActionBean {

    /* renamed from: a, reason: collision with root package name */
    public String f37904a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37905b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37906c;

    /* renamed from: d, reason: collision with root package name */
    public String f37907d;

    private String b() {
        return this.f37904a;
    }

    private boolean c() {
        return this.f37905b;
    }

    private void d() {
        this.f37905b = true;
    }

    private boolean e() {
        return this.f37906c;
    }

    private void f() {
        this.f37906c = true;
    }

    private String g() {
        return this.f37907d;
    }

    public final String a() {
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        String str2;
        String str3 = this.f37904a;
        if (this.f37905b) {
            if (str3.indexOf("?") > 0) {
                sb3 = new StringBuilder();
                sb3.append(str3);
                str2 = "&cid=";
            } else {
                sb3 = new StringBuilder();
                sb3.append(str3);
                str2 = "?cid=";
            }
            sb3.append(str2);
            sb3.append(com.igexin.push.core.e.A);
            str3 = sb3.toString();
        }
        if (this.f37906c) {
            com.igexin.push.core.d unused = d.a.f37956a;
            String h11 = com.igexin.push.core.d.h();
            if (h11 != null) {
                if (str3.indexOf("?") > 0) {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    str = "&nettype=";
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    str = "?nettype=";
                }
                sb2.append(str);
                sb2.append(h11);
                return sb2.toString();
            }
        }
        return str3;
    }

    private void a(String str) {
        this.f37904a = str;
    }

    private void b(String str) {
        this.f37907d = str;
    }
}
