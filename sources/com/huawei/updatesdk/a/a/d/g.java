package com.huawei.updatesdk.a.a.d;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36817a = "g";

    public static Class a(Field field) {
        int i11;
        if (Map.class.isAssignableFrom(field.getType())) {
            i11 = 1;
        } else {
            if (!List.class.isAssignableFrom(field.getType())) {
                return null;
            }
            i11 = 0;
        }
        return a(field, i11);
    }

    private static Class a(Field field, int i11) {
        Type[] actualTypeArguments;
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType) || (actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments()) == null || actualTypeArguments.length <= i11) {
            return null;
        }
        return a(actualTypeArguments, i11);
    }

    private static Class a(Type[] typeArr, int i11) {
        try {
            Type type = typeArr[i11];
            if (type instanceof Class) {
                return (Class) type;
            }
            String obj = type.toString();
            int indexOf = obj.indexOf("class ");
            if (indexOf < 0) {
                indexOf = 0;
            }
            int indexOf2 = obj.indexOf("<");
            if (indexOf2 < 0) {
                indexOf2 = obj.length();
            }
            return Class.forName(obj.substring(indexOf, indexOf2));
        } catch (ClassNotFoundException e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.b(f36817a, "getType exception!" + e11.getMessage());
            return null;
        }
    }

    public static Field[] a(Class cls) {
        Field[] a11 = cls.getSuperclass() != null ? a(cls.getSuperclass()) : null;
        Field[] declaredFields = cls.getDeclaredFields();
        if (a11 != null && a11.length > 0) {
            Field[] fieldArr = new Field[declaredFields.length + a11.length];
            System.arraycopy(a11, 0, fieldArr, 0, a11.length);
            System.arraycopy(declaredFields, 0, fieldArr, a11.length, declaredFields.length);
            declaredFields = fieldArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!field.getName().contains("$")) {
                arrayList.add(field);
            }
        }
        if (arrayList.size() == declaredFields.length) {
            return declaredFields;
        }
        Field[] fieldArr2 = new Field[arrayList.size()];
        arrayList.toArray(fieldArr2);
        return fieldArr2;
    }
}
