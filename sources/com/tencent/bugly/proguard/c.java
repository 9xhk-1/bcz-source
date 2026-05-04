package com.tencent.bugly.proguard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    protected HashMap<String, HashMap<String, byte[]>> f42581a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    protected HashMap<String, Object> f42582b = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f42585e = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected String f42583c = "GBK";

    /* renamed from: d, reason: collision with root package name */
    k f42584d = new k();

    public void a(String str) {
        this.f42583c = str;
    }

    public <T> void a(String str, T t11) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t11 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t11 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        l lVar = new l();
        lVar.a(this.f42583c);
        lVar.a(t11, 0);
        byte[] a11 = n.a(lVar.f42614a);
        HashMap<String, byte[]> hashMap = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        a((ArrayList<String>) arrayList, t11);
        hashMap.put(a.a(arrayList), a11);
        this.f42585e.remove(str);
        this.f42581a.put(str, hashMap);
    }

    private static void a(ArrayList<String> arrayList, Object obj) {
        while (true) {
            if (obj.getClass().isArray()) {
                if (obj.getClass().getComponentType().toString().equals("byte")) {
                    if (Array.getLength(obj) > 0) {
                        arrayList.add("java.util.List");
                        obj = Array.get(obj, 0);
                    } else {
                        arrayList.add("Array");
                        arrayList.add("?");
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("only byte[] is supported");
                }
            } else if (!(obj instanceof Array)) {
                if (obj instanceof List) {
                    arrayList.add("java.util.List");
                    List list = (List) obj;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        arrayList.add("?");
                        return;
                    }
                } else if (obj instanceof Map) {
                    arrayList.add("java.util.Map");
                    Map map = (Map) obj;
                    if (map.size() > 0) {
                        Object next = map.keySet().iterator().next();
                        obj = map.get(next);
                        arrayList.add(next.getClass().getName());
                    } else {
                        arrayList.add("?");
                        arrayList.add("?");
                        return;
                    }
                } else {
                    arrayList.add(obj.getClass().getName());
                    return;
                }
            } else {
                throw new IllegalArgumentException("can not support Array, please use List");
            }
        }
    }

    public byte[] a() {
        l lVar = new l(0);
        lVar.a(this.f42583c);
        lVar.a((Map) this.f42581a, 0);
        return n.a(lVar.f42614a);
    }

    public void a(byte[] bArr) {
        this.f42584d.a(bArr);
        this.f42584d.a(this.f42583c);
        HashMap hashMap = new HashMap(1);
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.f42581a = this.f42584d.a((Map) hashMap, 0, false);
    }
}
