package com.xiaomi.push;

import java.io.File;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, String> f46419a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f46419a = hashMap;
        hashMap.put("FFD8FF", "jpg");
        hashMap.put("89504E47", "png");
        hashMap.put("47494638", "gif");
        hashMap.put("474946", "gif");
        hashMap.put("424D", "bmp");
    }

    public static long a(File file) {
        long j11 = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i11 = 0; i11 < listFiles.length; i11++) {
                j11 += listFiles[i11].isDirectory() ? a(listFiles[i11]) : listFiles[i11].length();
            }
            return j11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return j11;
        }
    }
}
