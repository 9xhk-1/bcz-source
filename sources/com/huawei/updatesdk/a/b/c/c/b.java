package com.huawei.updatesdk.a.b.c.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.updatesdk.a.a.d.g;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b {
    private static final char COMMA = ',';
    private static final String END_FLAG = "_";
    private static final String TAG = "b";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        private Field f36850a;

        public a(Field field) {
            this.f36850a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.f36850a.setAccessible(true);
            return null;
        }
    }

    private String arrayToJson(Object obj) {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return i.f77289p;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (int i11 = 0; i11 < length; i11++) {
            String valueToJson = valueToJson(Array.get(obj, i11));
            if (valueToJson != null) {
                sb2.append(valueToJson);
                sb2.append(',');
            }
        }
        formatJsonStr(sb2);
        sb2.append("]");
        return sb2.toString();
    }

    private void formatJsonStr(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            int i11 = length - 1;
            if (sb2.charAt(i11) == ',') {
                sb2.delete(i11, length);
            }
        }
    }

    private boolean isBooleanOrFloat(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Float);
    }

    private boolean isByteOrCharacter(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Character);
    }

    private boolean isByteOrCharacterOrDoubleOrShort(Object obj) {
        return isByteOrCharacter(obj) || isDoubleOrShort(obj);
    }

    private boolean isDoubleOrShort(Object obj) {
        return (obj instanceof Double) || (obj instanceof Short);
    }

    private boolean isIntegerOrLong(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long);
    }

    private boolean isIntegerOrLongOrBooleanOrFloat(Object obj) {
        return isIntegerOrLong(obj) || isBooleanOrFloat(obj);
    }

    private boolean isPrimitiveObj(Object obj) {
        return isIntegerOrLongOrBooleanOrFloat(obj) || isByteOrCharacterOrDoubleOrShort(obj);
    }

    private Object jsonBeanFromJson(Class cls, Object obj) {
        b bVar = (b) cls.newInstance();
        bVar.fromJson((JSONObject) obj);
        return bVar;
    }

    private Object listFromJson(Class cls, Object obj) {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        }
        if (!(obj instanceof JSONArray)) {
            throw new IllegalArgumentException("jsonobject is not JSONArray, jsonValue:" + obj);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = (JSONArray) obj;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            Object valueFromJson = valueFromJson(cls, null, jSONArray.get(i11));
            if (valueFromJson != null) {
                if (cls.equals(valueFromJson.getClass())) {
                    arrayList.add(valueFromJson);
                } else {
                    com.huawei.updatesdk.a.a.c.a.a.a.b(TAG, "listFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                }
            }
        }
        return arrayList;
    }

    private Object mapFromJson(Class cls, Object obj) {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        }
        if (!(obj instanceof JSONObject)) {
            throw new IllegalArgumentException("jsonobject is not JSONObject, jsonValue:" + obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object valueFromJson = valueFromJson(cls, null, jSONObject.get(next));
            if (valueFromJson != null) {
                if (cls.equals(valueFromJson.getClass())) {
                    linkedHashMap.put(next, valueFromJson);
                } else {
                    com.huawei.updatesdk.a.a.c.a.a.a.b(TAG, "mapFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                }
            }
        }
        return linkedHashMap;
    }

    private String mapToJson(Map map) {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        Iterator it = map.entrySet().iterator();
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String valueToJson = valueToJson(entry.getValue());
            if (valueToJson != null) {
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                sb2.append(valueToJson);
            }
            if (!it.hasNext()) {
                sb2.append(com.alipay.sdk.m.u.i.f11099d);
                return sb2.toString();
            }
            if (valueToJson != null) {
                sb2.append(',');
            }
        }
    }

    private void processValueError(Field field, Object obj) {
        Object valueOf;
        if (obj instanceof String) {
            try {
                Class<?> type = field.getType();
                if (type.isPrimitive()) {
                    String name = type.getName();
                    if ("int".equals(name)) {
                        valueOf = Integer.valueOf(Integer.parseInt((String) obj));
                    } else if (TypedValues.Custom.S_FLOAT.equals(name)) {
                        valueOf = Float.valueOf(Float.parseFloat((String) obj));
                    } else if ("long".equals(name)) {
                        valueOf = Long.valueOf(Long.parseLong((String) obj));
                    } else if (TypedValues.Custom.S_BOOLEAN.equals(name)) {
                        valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                    } else if ("double".equals(name)) {
                        valueOf = Double.valueOf(Double.parseDouble((String) obj));
                    } else if ("short".equals(name)) {
                        valueOf = Short.valueOf(Short.parseShort((String) obj));
                    } else if ("byte".equals(name)) {
                        valueOf = Byte.valueOf(Byte.parseByte((String) obj));
                    } else if (!"char".equals(name)) {
                        return;
                    } else {
                        valueOf = Character.valueOf(((String) obj).charAt(0));
                    }
                    field.set(this, valueOf);
                }
            } catch (IllegalAccessException e11) {
                com.huawei.updatesdk.a.a.c.a.a.a.b(TAG, "processValueError Throwable:" + e11.getMessage());
            }
        }
    }

    private Object valueFromJson(Class cls, Class cls2, Object obj) {
        if (cls.isPrimitive() || cls.equals(String.class)) {
            return (TypedValues.Custom.S_FLOAT.equals(cls.getName()) && (obj instanceof Double)) ? Float.valueOf(((Double) obj).floatValue()) : obj;
        }
        if (List.class.isAssignableFrom(cls)) {
            return listFromJson(cls2, obj);
        }
        if (b.class.isAssignableFrom(cls)) {
            if (!cls.equals(b.class)) {
                return jsonBeanFromJson(cls, obj);
            }
            throw new IllegalArgumentException("error type, type:" + cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return mapFromJson(cls2, obj);
        }
        throw new IllegalArgumentException("unsupport type, Type:" + cls);
    }

    private String valueToJson(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return JSONObject.quote(obj.toString());
        }
        if (isPrimitiveObj(obj)) {
            return String.valueOf(obj);
        }
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj instanceof List) {
            return listToJson((List) obj);
        }
        if (obj instanceof Map) {
            return mapToJson((Map) obj);
        }
        if (obj.getClass().isArray()) {
            return arrayToJson(obj);
        }
        return null;
    }

    public void fromJson(JSONObject jSONObject) {
        Field[] a11 = g.a(getClass());
        Object obj = null;
        for (int i11 = 0; i11 < a11.length; i11++) {
            AccessController.doPrivileged(new a(a11[i11]));
            String name = a11[i11].getName();
            if (a11[i11].isAnnotationPresent(SDKNetTransmission.class) || name.endsWith(END_FLAG)) {
                if (name.endsWith(END_FLAG)) {
                    name = name.substring(0, name.length() - 1);
                }
                if (jSONObject.has(name)) {
                    Object obj2 = jSONObject.get(name);
                    if (!JSONObject.NULL.equals(obj2)) {
                        try {
                            obj = valueFromJson(a11[i11].getType(), g.a(a11[i11]), obj2);
                            a11[i11].set(this, obj);
                        } catch (Exception e11) {
                            com.huawei.updatesdk.a.a.a.a(TAG, getClass().getName() + ".fromJson error, fieldName:" + name + e11.getMessage());
                            processValueError(a11[i11], obj);
                        }
                    }
                }
            }
        }
    }

    public String listToJson(List list) {
        if (list.size() <= 0) {
            return i.f77289p;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (int i11 = 0; i11 < list.size(); i11++) {
            String valueToJson = valueToJson(list.get(i11));
            if (valueToJson != null) {
                sb2.append(valueToJson);
                sb2.append(',');
            }
        }
        formatJsonStr(sb2);
        sb2.append("]");
        return sb2.toString();
    }

    public String toJson() {
        Field[] a11 = g.a(getClass());
        if (a11.length <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        for (int i11 = 0; i11 < a11.length; i11++) {
            AccessController.doPrivileged(new a(a11[i11]));
            String name = a11[i11].getName();
            if (a11[i11].isAnnotationPresent(SDKNetTransmission.class) || (name != null && name.endsWith(END_FLAG))) {
                if (name.endsWith(END_FLAG)) {
                    name = name.substring(0, name.length() - 1);
                }
                String valueToJson = valueToJson(a11[i11].get(this));
                if (valueToJson != null) {
                    sb2.append("\"");
                    sb2.append(name);
                    sb2.append("\":");
                    sb2.append(valueToJson);
                    sb2.append(',');
                }
            }
        }
        formatJsonStr(sb2);
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }
}
