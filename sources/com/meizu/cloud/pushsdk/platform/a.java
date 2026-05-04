package com.meizu.cloud.pushsdk.platform;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, String> f39922a = a();

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f39923b = new ArrayList(f39922a.keySet());

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.length() > 3) {
                String substring = str.substring(0, 3);
                if (f39922a.containsKey(substring)) {
                    String str3 = f39922a.get(substring);
                    str2 = str.substring(3);
                    try {
                        char[] cArr = new char[str2.length() / 2];
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < str2.length() / 2) {
                            if (i12 == str3.length()) {
                                i12 = 0;
                            }
                            int i13 = i11 * 2;
                            cArr[i11] = (char) (((char) Integer.valueOf(str2.substring(i13, i13 + 2), 16).intValue()) ^ str3.charAt(i12));
                            i11++;
                            i12++;
                        }
                        return new String(String.valueOf(cArr).getBytes("iso-8859-1"), "UTF-8");
                    } catch (Exception unused) {
                        DebugLogger.e("PushIdEncryptUtils", "invalid pushId encryption " + str2);
                        return str;
                    }
                }
            }
            return str;
        } catch (Exception unused2) {
            str2 = str;
        }
    }

    private static Map<String, String> a() {
        if (a(f39922a)) {
            synchronized (a.class) {
                try {
                    if (a(f39922a)) {
                        TreeMap treeMap = new TreeMap();
                        f39922a = treeMap;
                        treeMap.put("UCI", "v9tC0Myz1MGwXRFy");
                        f39922a.put("G3G", "XAsFqhhaf4gKpmAi");
                        f39922a.put("V5R", "cOqH18NXwBtZVkvz");
                        f39922a.put("0XC", "IgSEKZ3Ea6Pm4woS");
                        f39922a.put("Z9K", "pH6J9DMPNgqQp8m8");
                        f39922a.put("EIM", "K11Rs9HAKRXeNwq8");
                        f39922a.put("SO7", "T8LquL1DvwVcogiU");
                        f39922a.put("DDI", "d02F6ttOtV05MYCQ");
                        f39922a.put("ULY", "ToZZIhAywnUfHShN");
                        f39922a.put("0EV", "r5D5RRwQhfV0AYLb");
                        f39922a.put("N6A", "QAtSBFcXnQoUgHO2");
                        f39922a.put("S5Q", "sDWLrZINnum227am");
                        f39922a.put("RA5", "4Uq3Ruxo1FTBdHQE");
                        f39922a.put("J04", "N5hViUTdLCpN59H0");
                        f39922a.put("B68", "EY3sH1KKtalg5ZaT");
                        f39922a.put("9IW", "q1u0MiuFyim4pCYY");
                        f39922a.put("UU3", "syLnkkd8AqNykVV7");
                        f39922a.put("Z49", "V00FiWu124yE91sH");
                        f39922a.put("BNA", "rPP7AK1VWpKEry3p");
                        f39922a.put("WXG", "om8w5ahkJJgpAH9v");
                    }
                } finally {
                }
            }
        }
        return f39922a;
    }

    public static <K, V> boolean a(Map<K, V> map) {
        return map == null || map.isEmpty();
    }
}
