package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ec f45469a;

    /* renamed from: a, reason: collision with other field name */
    private int f335a;

    /* renamed from: a, reason: collision with other field name */
    private Context f336a;

    /* renamed from: a, reason: collision with other field name */
    private eg f337a;

    /* renamed from: a, reason: collision with other field name */
    private String f338a;

    /* renamed from: a, reason: collision with other field name */
    private HashMap<ee, ef> f339a;

    /* renamed from: b, reason: collision with root package name */
    private String f45470b;

    private ec(Context context) {
        HashMap<ee, ef> hashMap = new HashMap<>();
        this.f339a = hashMap;
        this.f336a = context;
        hashMap.put(ee.SERVICE_ACTION, new ei());
        this.f339a.put(ee.SERVICE_COMPONENT, new ej());
        this.f339a.put(ee.ACTIVITY, new ea());
        this.f339a.put(ee.PROVIDER, new eh());
    }

    public int a() {
        return this.f335a;
    }

    public String b() {
        return this.f45470b;
    }

    public static ec a(Context context) {
        if (f45469a == null) {
            synchronized (ec.class) {
                try {
                    if (f45469a == null) {
                        f45469a = new ec(context);
                    }
                } finally {
                }
            }
        }
        return f45469a;
    }

    public void b(String str) {
        this.f45470b = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public eg m5910a() {
        return this.f337a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5911a() {
        return this.f338a;
    }

    public void a(int i11) {
        this.f335a = i11;
    }

    public void a(Context context, String str, int i11, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            a(i11);
            aj.a(this.f336a).a(new ed(this, str, context, str2, str3));
        } else {
            dy.a(context, "" + str, 1008, "A receive a incorrect message");
        }
    }

    public void a(ee eeVar, Context context, Intent intent, String str) {
        if (eeVar != null) {
            this.f339a.get(eeVar).a(context, intent, str);
        } else {
            dy.a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ee eeVar, Context context, eb ebVar) {
        this.f339a.get(eeVar).a(context, ebVar);
    }

    public void a(eg egVar) {
        this.f337a = egVar;
    }

    public void a(String str) {
        this.f338a = str;
    }

    public void a(String str, String str2, int i11, eg egVar) {
        a(str);
        b(str2);
        a(i11);
        a(egVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5909a(Context context) {
        return com.xiaomi.push.service.ak.m6224a(context, context.getPackageName());
    }
}
