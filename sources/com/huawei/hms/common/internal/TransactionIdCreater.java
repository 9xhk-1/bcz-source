package com.huawei.hms.common.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.StringUtil;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import xy.l1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class TransactionIdCreater {
    private static SecureRandom a() {
        try {
            return SecureRandom.getInstance(l1.f98585a);
        } catch (Exception unused) {
            HMSLog.e("TransactionIdCreater", "SecureRandom getInstance happpened NoSuchAlgorithmException!");
            return new SecureRandom();
        }
    }

    public static String getId(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtil.addByteForNum(str, 9, '0'));
        sb2.append(StringUtil.addByteForNum(str2, 6, '0'));
        Locale locale = Locale.ENGLISH;
        sb2.append(new SimpleDateFormat("yyyyMMddHHmmssSSS", locale).format(new Date()));
        sb2.append(String.format(locale, "%06d", Integer.valueOf(a().nextInt(1000000))));
        return sb2.toString();
    }
}
