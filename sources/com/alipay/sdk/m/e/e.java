package com.alipay.sdk.m.e;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static List<i> f10522a;

    static {
        ArrayList arrayList = new ArrayList();
        f10522a = arrayList;
        arrayList.add(new l());
        f10522a.add(new d());
        f10522a.add(new c());
        f10522a.add(new h());
        f10522a.add(new k());
        f10522a.add(new b());
        f10522a.add(new a());
        f10522a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t11;
        for (i iVar : f10522a) {
            if (iVar.a(com.alipay.sdk.m.f.a.a(type)) && (t11 = (T) iVar.a(obj, type)) != null) {
                return t11;
            }
        }
        return null;
    }

    public static final Object a(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            bVar = new org.json.alipay.a(trim);
        } else {
            if (!trim.startsWith("{") || !trim.endsWith(com.alipay.sdk.m.u.i.f11099d)) {
                return a((Object) trim, type);
            }
            bVar = new org.json.alipay.b(trim);
        }
        return a(bVar, type);
    }
}
