package com.huawei.hms.support.feature.result;

import android.text.TextUtils;
import com.huawei.hms.common.api.CommonStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class AbstractAuthResultCode extends CommonStatusCodes {
    public static final int RESULT_CODE_CANCELLED = 2012;
    public static final int RESULT_CODE_EXECUTING = 2013;
    public static final int RESULT_CODE_FAILED = 2014;
    public static final int SIGN_IN_JSONEXCEPTION = 2015;

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Integer, String> f36368a;

    static {
        HashMap hashMap = new HashMap();
        f36368a = hashMap;
        hashMap.put(2012, "Auth canceled by subscriber");
        hashMap.put(2013, "Auth executing");
        hashMap.put(2014, "An unrecoverable auth failure occurred");
    }

    public static String getResultDescription(int i11) {
        String str = f36368a.get(Integer.valueOf(i11));
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "unknown status code: " + i11;
    }
}
