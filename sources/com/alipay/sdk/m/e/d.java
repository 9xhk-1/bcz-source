package com.alipay.sdk.m.e;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d implements i, j {
    @Override // com.alipay.sdk.m.e.j
    public final Object a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // com.alipay.sdk.m.e.i
    public final Object a(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // com.alipay.sdk.m.e.i, com.alipay.sdk.m.e.j
    public final boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
