package com.xiaomi.push;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import u30.u0;

/* loaded from: classes8.dex */
public class bm {
    public static String a(String str) {
        try {
            return String.valueOf(bl.a(MessageDigest.getInstance("SHA1").digest(str.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a("CloudCoder.hash4SHA1 ", e11);
            throw new IllegalStateException("failed to SHA1");
        }
    }

    public static String a(String str, String str2, Map<String, String> map, String str3) {
        if (TextUtils.isEmpty(str3)) {
            throw new InvalidParameterException("security is not nullable");
        }
        ArrayList<String> arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str.toUpperCase());
        }
        if (str2 != null) {
            arrayList.add(Uri.parse(str2).getEncodedPath());
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : new TreeMap(map).entrySet()) {
                arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(str3);
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (String str4 : arrayList) {
            if (!z11) {
                sb2.append(u0.f91708d);
            }
            sb2.append(str4);
            z11 = false;
        }
        return a(sb2.toString());
    }
}
