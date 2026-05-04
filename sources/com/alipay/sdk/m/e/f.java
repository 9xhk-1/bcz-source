package com.alipay.sdk.m.e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static List<j> f10523a;

    static {
        ArrayList arrayList = new ArrayList();
        f10523a = arrayList;
        arrayList.add(new l());
        f10523a.add(new d());
        f10523a.add(new c());
        f10523a.add(new h());
        f10523a.add(new b());
        f10523a.add(new a());
        f10523a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b11 = b(obj);
        if (com.alipay.sdk.m.f.a.a(b11.getClass())) {
            return org.json.alipay.b.c(b11.toString());
        }
        if (Collection.class.isAssignableFrom(b11.getClass())) {
            return new org.json.alipay.a((Collection) b11).toString();
        }
        if (Map.class.isAssignableFrom(b11.getClass())) {
            return new org.json.alipay.b((Map) b11).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + b11.getClass());
    }

    public static Object b(Object obj) {
        Object a11;
        if (obj == null) {
            return null;
        }
        for (j jVar : f10523a) {
            if (jVar.a(obj.getClass()) && (a11 = jVar.a(obj)) != null) {
                return a11;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
