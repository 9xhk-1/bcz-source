package com.huawei.hms.utils;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class JsonUtil {
    protected static final int VAL_BYTE = 2;
    protected static final int VAL_ENTITY = 0;
    protected static final int VAL_LIST = 1;
    protected static final int VAL_MAP = 3;
    protected static final int VAL_NULL = -1;
    protected static final String VAL_TYPE = "_val_type_";

    private static String a(IMessageEntity iMessageEntity) throws IllegalAccessException, JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    boolean isAccessible = field.isAccessible();
                    a(field, true);
                    String name = field.getName();
                    Object obj = field.get(iMessageEntity);
                    a(field, isAccessible);
                    a(name, obj, jSONObject);
                }
            }
        }
        return jSONObject.toString();
    }

    private static Object b(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        Object a11 = a(field.getName(), jSONObject);
        if (a11 != null) {
            try {
                if (field.getType().getName().startsWith("com.huawei") && (field.getType().newInstance() instanceof IMessageEntity)) {
                    return jsonToEntity((String) a11, (IMessageEntity) field.getType().newInstance());
                }
                if (!(a11 instanceof JSONObject) || !((JSONObject) a11).has(VAL_TYPE)) {
                    return a11;
                }
                int i11 = ((JSONObject) a11).getInt(VAL_TYPE);
                if (i11 != 1 && i11 != 0) {
                    if (i11 == 2) {
                        return a((JSONObject) a11);
                    }
                    if (i11 == 3) {
                        return b(field.getGenericType(), (JSONObject) a11);
                    }
                    HMSLog.e("JsonUtil", "cannot support type : " + i11);
                }
                return a(field.getGenericType(), (JSONObject) a11);
            } catch (InstantiationException unused) {
                HMSLog.e("JsonUtil", "InstantiationException  ");
            }
        }
        return null;
    }

    @Deprecated
    public static String createJsonString(IMessageEntity iMessageEntity) {
        if (iMessageEntity == null) {
            HMSLog.e("JsonUtil", "createJsonString error, the input IMessageEntity is null");
            return "";
        }
        try {
            return a(iMessageEntity);
        } catch (IllegalAccessException e11) {
            HMSLog.e("JsonUtil", "catch IllegalAccessException " + e11.getMessage());
            return "";
        } catch (JSONException e12) {
            HMSLog.e("JsonUtil", "catch JSONException " + e12.getMessage());
            return "";
        }
    }

    public static Object getInfoFromJsonobject(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has(str2)) {
                    return null;
                }
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    return obj;
                }
            } catch (JSONException unused) {
                HMSLog.e("JsonUtil", "getInfoFromJsonobject:parser json error :" + str2);
            }
        }
        return null;
    }

    public static int getIntValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return -1;
        }
        return jSONObject.getInt(str);
    }

    public static String getStringValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    @Deprecated
    public static IMessageEntity jsonToEntity(String str, IMessageEntity iMessageEntity) {
        Class<? super Object> superclass;
        if (iMessageEntity == null) {
            return null;
        }
        try {
            Class<?> cls = iMessageEntity.getClass();
            JSONObject jSONObject = new JSONObject(str);
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields == null) {
                    superclass = cls.getSuperclass();
                } else {
                    for (Field field : declaredFields) {
                        if (field.isAnnotationPresent(Packed.class)) {
                            try {
                                a(iMessageEntity, field, jSONObject);
                            } catch (IllegalAccessException unused) {
                                HMSLog.e("JsonUtil", "jsonToEntity, set value of the field exception, field name:" + field.getName());
                            }
                        }
                    }
                    superclass = cls.getSuperclass();
                }
                cls = superclass;
            }
        } catch (JSONException e11) {
            HMSLog.e("JsonUtil", "catch JSONException when parse jsonString" + e11.getMessage());
        }
        return iMessageEntity;
    }

    private static void a(final Field field, final boolean z11) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.utils.JsonUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                field.setAccessible(z11);
                return null;
            }
        });
    }

    private static Map b(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        Class cls = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
        JSONArray jSONArray = new JSONArray(jSONObject.getString("_map_"));
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < jSONArray.length(); i11 += 2) {
            if (cls.newInstance() instanceof IMessageEntity) {
                hashMap.put(jSONArray.get(i11), jsonToEntity(jSONArray.getString(i11 + 1), (IMessageEntity) cls.newInstance()));
            } else {
                hashMap.put(jSONArray.get(i11), jSONArray.get(i11 + 1));
            }
        }
        return hashMap;
    }

    private static boolean a(String str, Object obj, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        if (obj instanceof String) {
            jSONObject.put(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            jSONObject.put(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            jSONObject.put(str, (Short) obj);
            return true;
        }
        if (obj instanceof Long) {
            jSONObject.put(str, (Long) obj);
            return true;
        }
        if (obj instanceof Float) {
            jSONObject.put(str, (Float) obj);
            return true;
        }
        if (obj instanceof Double) {
            jSONObject.put(str, (Double) obj);
            return true;
        }
        if (obj instanceof Boolean) {
            jSONObject.put(str, (Boolean) obj);
            return true;
        }
        if (obj instanceof JSONObject) {
            jSONObject.put(str, (JSONObject) obj);
            return true;
        }
        if (obj instanceof byte[]) {
            a(str, (byte[]) obj, jSONObject);
            return true;
        }
        if (obj instanceof List) {
            a(str, (List<?>) obj, jSONObject);
            return true;
        }
        if (obj instanceof Map) {
            a(str, (Map) obj, jSONObject);
            return true;
        }
        if (obj instanceof IMessageEntity) {
            try {
                jSONObject.put(str, a((IMessageEntity) obj));
                return true;
            } catch (IllegalAccessException e11) {
                HMSLog.e("JsonUtil", "IllegalAccessException , " + e11);
            }
        }
        return false;
    }

    private static void a(String str, Map map, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof IMessageEntity) {
                jSONArray.put(a((IMessageEntity) key));
            } else {
                jSONArray.put(key);
            }
            if (value instanceof IMessageEntity) {
                jSONArray.put(a((IMessageEntity) value));
            } else {
                jSONArray.put(value);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 3);
        jSONObject2.put("_map_", jSONArray.toString());
        jSONObject.put(str, jSONObject2);
    }

    private static void a(String str, byte[] bArr, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 2);
        try {
            jSONObject2.put("_byte_", Base64.encode(bArr));
        } catch (IllegalArgumentException e11) {
            HMSLog.e("JsonUtil", "writeByte failed : " + e11.getMessage());
        }
        jSONObject.put(str, jSONObject2);
    }

    private static void a(String str, List<?> list, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 1);
        jSONObject2.put("_list_size_", list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            a("_list_item_" + i11, list.get(i11), jSONObject2);
            if (list.get(i11) instanceof IMessageEntity) {
                jSONObject2.put(VAL_TYPE, 0);
            }
        }
        jSONObject.put(str, jSONObject2);
    }

    private static void a(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        Object b11 = b(iMessageEntity, field, jSONObject);
        if (b11 != null) {
            boolean isAccessible = field.isAccessible();
            a(field, true);
            field.set(iMessageEntity, b11);
            a(field, isAccessible);
        }
    }

    private static Object a(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.get(str);
        }
        if (jSONObject.has("header") && jSONObject.getJSONObject("header").has(str)) {
            return jSONObject.getJSONObject("header").get(str);
        }
        if (jSONObject.has(TtmlNode.TAG_BODY) && jSONObject.getJSONObject(TtmlNode.TAG_BODY).has(str)) {
            return jSONObject.getJSONObject(TtmlNode.TAG_BODY).get(str);
        }
        return null;
    }

    private static List<Object> a(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        int i11 = jSONObject.getInt("_list_size_");
        int i12 = jSONObject.getInt(VAL_TYPE);
        ArrayList arrayList = new ArrayList(i11);
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = jSONObject.get("_list_item_" + i13);
            if (i12 == 0) {
                arrayList.add(jsonToEntity((String) obj, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else if (i12 == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static byte[] a(JSONObject jSONObject) throws JSONException {
        try {
            return Base64.decode(jSONObject.getString("_byte_"));
        } catch (IllegalArgumentException e11) {
            HMSLog.e("JsonUtil", "readByte failed : " + e11.getMessage());
            return null;
        }
    }
}
