package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SecurityRandomHelper {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        ur.c.i(true);
                        instance = new SecurityRandomHelper();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i11) {
        return ur.c.d(i11);
    }

    public String generateSecureRandomStr(int i11) {
        return ur.c.e(i11);
    }
}
