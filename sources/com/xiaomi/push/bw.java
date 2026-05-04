package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.aj;
import com.xiaomi.push.ci;

/* loaded from: classes8.dex */
public class bw {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bw f45319a;

    /* renamed from: a, reason: collision with other field name */
    private Context f182a;

    /* renamed from: a, reason: collision with other field name */
    private cl f184a;

    /* renamed from: a, reason: collision with other field name */
    private cm f185a;

    /* renamed from: e, reason: collision with root package name */
    private String f45323e;

    /* renamed from: f, reason: collision with root package name */
    private String f45324f;

    /* renamed from: a, reason: collision with other field name */
    private final String f186a = "push_stat_sp";

    /* renamed from: b, reason: collision with other field name */
    private final String f187b = "upload_time";

    /* renamed from: c, reason: collision with other field name */
    private final String f188c = "delete_time";

    /* renamed from: d, reason: collision with root package name */
    private final String f45322d = "check_time";

    /* renamed from: a, reason: collision with other field name */
    private aj.a f183a = new bx(this);

    /* renamed from: b, reason: collision with root package name */
    private aj.a f45320b = new by(this);

    /* renamed from: c, reason: collision with root package name */
    private aj.a f45321c = new bz(this);

    private bw(Context context) {
        this.f182a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return this.f182a.getDatabasePath(ca.f192a).getAbsolutePath();
    }

    public String b() {
        return this.f45324f;
    }

    public static bw a(Context context) {
        if (f45319a == null) {
            synchronized (bw.class) {
                try {
                    if (f45319a == null) {
                        f45319a = new bw(context);
                    }
                } finally {
                }
            }
        }
        return f45319a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        SharedPreferences.Editor edit = this.f182a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        q.a(edit);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5767a() {
        return this.f45323e;
    }

    public void a(ci.a aVar) {
        ci.a(this.f182a).a(aVar);
    }

    public void a(hl hlVar) {
        if (a() && com.xiaomi.push.service.bz.a(hlVar.e())) {
            a(cf.a(this.f182a, c(), hlVar));
        }
    }

    public void a(String str) {
        if (a() && !TextUtils.isEmpty(str)) {
            a(cn.a(this.f182a, str));
        }
    }

    public void a(String str, String str2, Boolean bool) {
        if (this.f184a != null) {
            if (bool.booleanValue()) {
                this.f184a.a(this.f182a, str2, str);
            } else {
                this.f184a.b(this.f182a, str2, str);
            }
        }
    }

    private boolean a() {
        return com.xiaomi.push.service.ba.a(this.f182a).a(hm.StatDataSwitch.a(), true);
    }
}
