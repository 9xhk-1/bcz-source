package com.huawei.hms.push.utils;

import com.huawei.hms.support.log.HMSLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DateUtil {
    public static String parseMilliSecondToString(Long l11) {
        if (l11 == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(l11);
        } catch (Exception e11) {
            HMSLog.e("DateUtil", "parseMilliSecondToString Exception.", e11);
            return null;
        }
    }

    public static long parseUtcToMillisecond(String str) throws ParseException, StringIndexOutOfBoundsException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str.substring(0, str.indexOf(".")) + (str.substring(str.indexOf(".")).substring(0, 4) + "Z")).getTime();
    }
}
