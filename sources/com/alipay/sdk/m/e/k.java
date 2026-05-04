package com.alipay.sdk.m.e;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k implements i {
    @Override // com.alipay.sdk.m.e.i
    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        HashSet hashSet = new HashSet();
        Class cls = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i11 = 0; i11 < aVar.a(); i11++) {
            hashSet.add(e.a(aVar.a(i11), cls));
        }
        return hashSet;
    }

    @Override // com.alipay.sdk.m.e.i, com.alipay.sdk.m.e.j
    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
