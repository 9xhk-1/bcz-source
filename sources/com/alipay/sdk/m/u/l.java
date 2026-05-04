package com.alipay.sdk.m.u;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11107a = "resultStatus";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11108b = "memo";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11109c = "result";

    public static Map<String, String> a(com.alipay.sdk.m.s.a aVar, String str) {
        Map<String, String> a11 = a();
        try {
            return a(str);
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10663q, th2);
            return a11;
        }
    }

    public static String b(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(i.f11099d));
    }

    public static Map<String, String> a() {
        com.alipay.sdk.m.j.c b11 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.CANCELED.b());
        HashMap hashMap = new HashMap();
        hashMap.put(f11107a, Integer.toString(b11.b()));
        hashMap.put(f11108b, b11.a());
        hashMap.put("result", "");
        return hashMap;
    }

    public static Map<String, String> a(String str) {
        String[] split = str.split(i.f11097b);
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            hashMap.put(substring, b(str2, substring));
        }
        return hashMap;
    }

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : "?";
        } catch (Throwable th2) {
            e.a(th2);
            return "?";
        }
    }
}
