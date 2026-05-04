package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ResolutionFlagUtil {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ResolutionFlagUtil f36754a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, Long> f36755b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f36756c = new Object();

    private ResolutionFlagUtil() {
    }

    private void a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10800000;
        for (String str : f36755b.keySet()) {
            Map<String, Long> map = f36755b;
            Long l11 = map.get(str);
            if (l11 == null || l11.longValue() == 0) {
                map.remove(str);
                HMSLog.i("ResolutionFlagUtil", "remove resolution flag because the data in this pair was abnormal: " + str);
            } else if (time >= l11.longValue()) {
                map.remove(str);
                HMSLog.i("ResolutionFlagUtil", "remove resolution flag because aging time: " + str);
            }
        }
    }

    public static ResolutionFlagUtil getInstance() {
        if (f36754a != null) {
            return f36754a;
        }
        synchronized (f36756c) {
            try {
                if (f36754a == null) {
                    f36754a = new ResolutionFlagUtil();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f36754a;
    }

    public long getResolutionFlag(String str) {
        if (str == null) {
            HMSLog.e("ResolutionFlagUtil", "transactionId is null");
            return 0L;
        }
        Map<String, Long> map = f36755b;
        if (map.get(str) != null) {
            return map.get(str).longValue();
        }
        return 0L;
    }

    public void removeResolutionFlag(String str) {
        if (str == null) {
            HMSLog.e("ResolutionFlagUtil", "transactionId is null");
        } else {
            f36755b.remove(str);
            HMSLog.i("ResolutionFlagUtil", "remove resolution flag");
        }
    }

    public void saveResolutionFlag(String str, long j11) {
        if (!TextUtils.isEmpty(str) && j11 != 0) {
            a(str, j11);
            return;
        }
        HMSLog.e("ResolutionFlagUtil", "saveResolutionFlag error, transactionId: " + str + ", timestamp: " + j11);
    }

    private void a(String str, long j11) {
        Map<String, Long> map = f36755b;
        synchronized (map) {
            a();
            map.put(str, Long.valueOf(j11));
            HMSLog.i("ResolutionFlagUtil", "save resolution flag");
        }
    }
}
