package com.xiaomi.push;

import android.system.Os;
import java.io.File;

/* loaded from: classes8.dex */
public class co {
    public static long a(String str) {
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0L;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return 0L;
        }
    }
}
