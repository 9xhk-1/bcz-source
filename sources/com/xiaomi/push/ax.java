package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
class ax implements at {

    /* renamed from: a, reason: collision with root package name */
    private Context f45274a;

    /* renamed from: a, reason: collision with other field name */
    private Class<?> f156a;

    /* renamed from: a, reason: collision with other field name */
    private Object f157a;

    /* renamed from: a, reason: collision with other field name */
    private Method f158a = null;

    /* renamed from: b, reason: collision with root package name */
    private Method f45275b = null;

    /* renamed from: c, reason: collision with root package name */
    private Method f45276c = null;

    /* renamed from: d, reason: collision with root package name */
    private Method f45277d = null;

    public ax(Context context) {
        this.f45274a = context;
        a(context);
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public String mo5724a() {
        return a(this.f45274a, this.f45275b);
    }

    private String a(Context context, Method method) {
        Object obj = this.f157a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a("miui invoke error", e11);
            return null;
        }
    }

    private void a(Context context) {
        try {
            Class<?> a11 = s.a(context, "com.android.id.impl.IdProviderImpl");
            this.f156a = a11;
            this.f157a = a11.newInstance();
            this.f45275b = this.f156a.getMethod("getOAID", Context.class);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a("miui load class error", e11);
        }
    }

    @Override // com.xiaomi.push.at
    /* renamed from: a */
    public boolean mo5725a() {
        return (this.f156a == null || this.f157a == null) ? false : true;
    }
}
