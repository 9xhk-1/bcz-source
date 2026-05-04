package com.mob.secverify.pure.core.ope.wo.c;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    private static TreeMap<?, ?> a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            TreeMap<?, ?> treeMap = new TreeMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                treeMap.put(next, jSONObject.getString(next));
            }
            return treeMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            boolean z11 = true;
            for (Map.Entry<?, ?> entry : a(new JSONObject(str).toString()).entrySet()) {
                stringBuffer.append(z11 ? "" : str2);
                stringBuffer.append(entry.getKey());
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                stringBuffer.append(entry.getValue() != null ? entry.getValue() : "");
                z11 = false;
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }
}
