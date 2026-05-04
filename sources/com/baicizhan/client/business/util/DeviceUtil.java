package com.baicizhan.client.business.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DeviceUtil {
    public static final boolean IS_HONG_MI_1S;
    public static final boolean IS_M1_NOTE_MEIZU;
    public static final boolean IS_M3_NOTE_MEIZU;
    public static final boolean IS_MI_2S;
    public static final boolean IS_MX4_MEIZU;
    public static final boolean IS_REDMI_NOTE_3;
    public static final String TAG = "DeviceUtil";
    private static long sTotalMemorySize;

    static {
        String str = nb.a.f75039b;
        IS_HONG_MI_1S = str.equals("HM 1SW - Xiaomi");
        IS_MI_2S = str.equals("MI 2S - Xiaomi");
        IS_MX4_MEIZU = str.equals("MX4 - Meizu");
        IS_M1_NOTE_MEIZU = str.equals("m1 note - Meizu");
        IS_M3_NOTE_MEIZU = str.equals("m3 note - Meizu");
        IS_REDMI_NOTE_3 = str.equals("Redmi Note 3 - Xiaomi");
        sTotalMemorySize = -1L;
    }

    private DeviceUtil() {
    }

    public static long getDeviceTotalMemoryBytes(Context context) {
        long j11 = sTotalMemorySize;
        if (j11 != -1) {
            return j11;
        }
        long deviceTotalMemoryBytesJellyBean = getDeviceTotalMemoryBytesJellyBean(context);
        if (deviceTotalMemoryBytesJellyBean > 0) {
            sTotalMemorySize = deviceTotalMemoryBytesJellyBean;
        } else {
            sTotalMemorySize = getDeviceTotalMemoryBytesDefault();
        }
        return sTotalMemorySize;
    }

    private static long getDeviceTotalMemoryBytesDefault() {
        String lowerCase;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/meminfo"));
            do {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        return 0L;
                    }
                    lowerCase = readLine.toLowerCase();
                } catch (IOException unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return 0L;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } while (!lowerCase.contains("memtotal"));
            String[] split = lowerCase.split("\\s+");
            qb.c.b(TAG, "/proc/meminfo: " + TextUtils.join(",", split), new Object[0]);
            long parseLong = Long.parseLong(split[1]) * 1024;
            qb.c.b(TAG, "getDeviceTotalMemoryDefault " + parseLong, new Object[0]);
            try {
                bufferedReader2.close();
            } catch (IOException unused5) {
            }
            return parseLong;
        } catch (IOException unused6) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @TargetApi(16)
    private static long getDeviceTotalMemoryBytesJellyBean(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        qb.c.b(TAG, "getDeviceTotalMemoryJellyBean " + memoryInfo.totalMem, new Object[0]);
        return memoryInfo.totalMem;
    }

    public static int getDeviceTotalMemoryGigaBytes(Context context) {
        return (int) Math.round(getDeviceTotalMemoryBytes(context) / 1.0E9d);
    }

    public static String getUniqueID(Context context) {
        return (nb.a.f75039b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + xb.o.a(context)).replace(" ", "");
    }

    public static boolean isDuoQin() {
        try {
            return nb.a.f75039b.toLowerCase(Locale.US).contains("duoqin");
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isHuawei() {
        int i11;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            i11 = Integer.parseInt((String) cls.getDeclaredMethod(ct.d.f46852f, String.class).invoke(cls, "ro.build.hw_emui_api_level"));
        } catch (Exception unused) {
            i11 = 0;
        }
        return i11 > 0;
    }

    public static boolean isMeizu() {
        return nb.a.f75039b.toLowerCase(Locale.US).contains("meizu");
    }

    public static boolean isOppo() {
        try {
            return nb.a.f75039b.toLowerCase(Locale.US).contains("oppo");
        } catch (Exception unused) {
            return true;
        }
    }
}
