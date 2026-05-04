package com.huawei.updatesdk.a.a.d;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {
    private static String a(String str) {
        return str == null ? "" : str;
    }

    public static String a(List<String> list, String str) {
        return a(list, str, (String) null, (String) null);
    }

    public static String a(List<String> list, String str, String str2, String str3) {
        return (list == null || list.isEmpty()) ? "" : a((String[]) list.toArray(new String[0]), str, str2, str3);
    }

    public static String a(String[] strArr, String str) {
        return a(strArr, str, (String) null, (String) null);
    }

    public static String a(String[] strArr, String str, String str2, String str3) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String a11 = a(str);
        String a12 = a(str2);
        String a13 = a(str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a12);
        sb2.append(strArr[0]);
        sb2.append(a13);
        for (int i11 = 1; i11 < strArr.length; i11++) {
            sb2.append(a11);
            sb2.append(a12);
            sb2.append(strArr[i11]);
            sb2.append(a13);
        }
        return sb2.toString();
    }
}
