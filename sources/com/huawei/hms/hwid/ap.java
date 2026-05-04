package com.huawei.hms.hwid;

import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ap {
    public static Boolean a(Collection collection) {
        return (collection == null || collection.size() == 0) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Boolean b(Collection collection) {
        return Boolean.valueOf(!a(collection).booleanValue());
    }
}
