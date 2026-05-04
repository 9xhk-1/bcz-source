package org.apache.thrift.meta_data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TFieldIdEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FieldMetaData implements Serializable {
    private static Map<Class<? extends TBase>, Map<? extends TFieldIdEnum, FieldMetaData>> structMap = new HashMap();
    public final String fieldName;
    public final byte requirementType;
    public final FieldValueMetaData valueMetaData;

    public FieldMetaData(String str, byte b11, FieldValueMetaData fieldValueMetaData) {
        this.fieldName = str;
        this.requirementType = b11;
        this.valueMetaData = fieldValueMetaData;
    }

    public static synchronized void addStructMetaDataMap(Class<? extends TBase> cls, Map<? extends TFieldIdEnum, FieldMetaData> map) {
        synchronized (FieldMetaData.class) {
            structMap.put(cls, map);
        }
    }

    public static synchronized Map<? extends TFieldIdEnum, FieldMetaData> getStructMetaDataMap(Class<? extends TBase> cls) {
        Map<? extends TFieldIdEnum, FieldMetaData> map;
        synchronized (FieldMetaData.class) {
            if (!structMap.containsKey(cls)) {
                try {
                    cls.newInstance();
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e11.getMessage());
                } catch (InstantiationException e12) {
                    throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e12.getMessage());
                }
            }
            map = structMap.get(cls);
        }
        return map;
    }
}
