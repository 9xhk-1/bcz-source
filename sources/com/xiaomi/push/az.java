package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes8.dex */
public class az implements at {

    /* renamed from: a, reason: collision with root package name */
    private static volatile az f45279a;

    /* renamed from: a, reason: collision with other field name */
    private int f159a = ay.f45278a;

    /* renamed from: a, reason: collision with other field name */
    private at f160a;

    private az(Context context) {
        this.f160a = ay.a(context);
        com.xiaomi.channel.commonutils.logger.b.m5639a("create id manager is: " + this.f159a);
    }

    public static az a(Context context) {
        if (f45279a == null) {
            synchronized (az.class) {
                try {
                    if (f45279a == null) {
                        f45279a = new az(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f45279a;
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public String mo5724a() {
        return a(this.f160a.mo5724a());
    }

    private String a(String str) {
        return str == null ? "" : str;
    }

    public void a() {
    }

    public void a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String b11 = b();
        if (!TextUtils.isEmpty(b11)) {
            map.put("udid", b11);
        }
        String mo5724a = mo5724a();
        if (!TextUtils.isEmpty(mo5724a)) {
            map.put("oaid", mo5724a);
        }
        String c11 = c();
        if (!TextUtils.isEmpty(c11)) {
            map.put("vaid", c11);
        }
        String d11 = d();
        if (!TextUtils.isEmpty(d11)) {
            map.put("aaid", d11);
        }
        map.put("oaid_type", String.valueOf(this.f159a));
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public boolean mo5725a() {
        return this.f160a.mo5725a();
    }
}
