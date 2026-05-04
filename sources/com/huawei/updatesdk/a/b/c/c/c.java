package com.huawei.updatesdk.a.b.c.c;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.updatesdk.a.a.d.g;
import com.huawei.updatesdk.a.a.d.h;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {
    public static final String CLIENT_API = "clientApi";
    private static final String END_FLAG = "_";
    private static String url;

    @SDKNetTransmission
    private String method;

    @SDKNetTransmission
    private String ver = "1.1";

    public String a() {
        e();
        Map<String, Field> c11 = c();
        int size = c11.size();
        String[] strArr = new String[size];
        c11.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        do {
            String a11 = a(c11.get(strArr[i11]));
            if (a11 != null) {
                String a12 = h.a(a11);
                sb2.append(strArr[i11]);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(a12);
                sb2.append("&");
            }
            i11++;
        } while (i11 < size);
        int length = sb2.length();
        if (length > 0) {
            int i12 = length - 1;
            if (sb2.charAt(i12) == '&') {
                sb2.deleteCharAt(i12);
            }
        }
        return sb2.toString();
    }

    public String b() {
        return this.method;
    }

    public Map<String, Field> c() {
        HashMap hashMap = new HashMap();
        for (Field field : g.a(getClass())) {
            field.setAccessible(true);
            String name = field.getName();
            if (name.endsWith(END_FLAG) || field.isAnnotationPresent(SDKNetTransmission.class)) {
                if (name.endsWith(END_FLAG)) {
                    name = name.substring(0, name.length() - 1);
                }
                hashMap.put(name, field);
            }
        }
        return hashMap;
    }

    public String d() {
        return url + CLIENT_API;
    }

    private String a(Field field) {
        Object obj = field.get(this);
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static void c(String str) {
        url = str;
    }

    public void b(String str) {
        this.ver = str;
    }

    public void a(String str) {
        this.method = str;
    }

    public void e() {
    }
}
