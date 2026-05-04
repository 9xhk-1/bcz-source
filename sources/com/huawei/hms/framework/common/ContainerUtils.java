package com.huawei.hms.framework.common;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ContainerUtils {
    public static final String FIELD_DELIMITER = "&";
    public static final String KEY_VALUE_DELIMITER = "=";

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (map2.get(entry.getKey()) != entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        return toString(map).hashCode();
    }

    public static <K, V> String toString(Map<K, V> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append("&");
            }
            sb2.append(entry.getKey().toString());
            sb2.append(KEY_VALUE_DELIMITER);
            sb2.append(entry.getValue().toString());
            i11 = i12;
        }
        return sb2.toString();
    }

    public static <K> String toString(Set<K> set) {
        if (set == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (K k11 : set) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append("&");
            }
            sb2.append(k11.toString());
            i11 = i12;
        }
        return sb2.toString();
    }

    public static <K> String toString(List<K> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (K k11 : list) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append("&");
            }
            sb2.append(k11.toString());
            i11 = i12;
        }
        return sb2.toString();
    }
}
