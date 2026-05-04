package com.xiaomi.push;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.squareup.picasso.h0;
import java.io.File;

/* loaded from: classes8.dex */
public class aa {
    public static long a() {
        File externalStorageDirectory;
        if (!b() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                return statFs.getBlockSize() * (statFs.getAvailableBlocks() - 4);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static boolean b() {
        try {
            return true ^ Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e11) {
            Log.e("XMPush-", "check SDCard is busy: " + e11);
            return true;
        }
    }

    public static boolean c() {
        return a() <= 102400;
    }

    public static boolean d() {
        return (b() || c() || m5713a()) ? false : true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5713a() {
        try {
            return Environment.getExternalStorageState().equals(h0.f41882x);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return true;
        }
    }
}
