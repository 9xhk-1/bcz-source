package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes8.dex */
public class fw implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static String f45590a = "wcc-ml-test10.bj";

    /* renamed from: b, reason: collision with root package name */
    public static final String f45591b = af.f45247a;

    /* renamed from: c, reason: collision with root package name */
    public static String f45592c;

    /* renamed from: a, reason: collision with other field name */
    private int f451a;

    /* renamed from: a, reason: collision with other field name */
    private fz f452a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f453a = fv.f436a;

    /* renamed from: b, reason: collision with other field name */
    private boolean f454b = true;

    /* renamed from: d, reason: collision with root package name */
    private String f45593d;

    /* renamed from: e, reason: collision with root package name */
    private String f45594e;

    /* renamed from: f, reason: collision with root package name */
    private String f45595f;

    public fw(Map<String, Integer> map, int i11, String str, fz fzVar) {
        a(map, i11, str, fzVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m5971a() {
        return this.f451a;
    }

    public String b() {
        return this.f45595f;
    }

    public String c() {
        if (this.f45594e == null) {
            this.f45594e = a();
        }
        return this.f45594e;
    }

    public static final String a() {
        String str = f45592c;
        return str != null ? str : ab.m5714a() ? "sandbox.xmpush.xiaomi.com" : ab.b() ? f45591b : "app.chat.xiaomi.net";
    }

    public void b(String str) {
        this.f45595f = str;
    }

    public void c(String str) {
        this.f45594e = str;
    }

    public static final void a(String str) {
        if (j.m6172a(s.m6183a()) && ab.b()) {
            return;
        }
        f45592c = str;
    }

    private void a(Map<String, Integer> map, int i11, String str, fz fzVar) {
        this.f451a = i11;
        this.f45593d = str;
        this.f452a = fzVar;
    }

    public void a(boolean z11) {
        this.f453a = z11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5972a() {
        return this.f453a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] mo5973a() {
        return null;
    }
}
