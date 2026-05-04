package org.apache.thrift;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TEnumHelper {
    public static TEnum getByValue(Class<? extends TEnum> cls, int i11) {
        try {
            return (TEnum) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i11));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
