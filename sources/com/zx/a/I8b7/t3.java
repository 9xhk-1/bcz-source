package com.zx.a.I8b7;

import android.text.TextUtils;
import com.zx.module.base.Listener;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t3 implements o3 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f46702a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f46703b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public Listener f46704c;

    public static void a(t3 t3Var) throws Throwable {
        t3Var.getClass();
        String str = m3.f46593i;
        if (!m3.f46600p) {
            l.c();
        }
        p1.f();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("data", m3.a());
        String jSONObject2 = jSONObject.toString();
        t3Var.f46704c.onMessage("MESSAGE_ON_ZXID_RECEIVED", jSONObject2);
        if (TextUtils.equals(str, m3.f46593i)) {
            return;
        }
        t3Var.f46704c.onMessage("MESSAGE_ON_ZXID_CHANGED", jSONObject2);
    }
}
