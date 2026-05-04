package com.mob.secverify;

import com.mob.secverify.common.callback.OperationCallback;
import com.mob.secverify.pure.core.e;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SecPure {
    public static final int SDK_VERSION_CODE;
    private static final String SDK_VERSION_NAME = "3.2.5";
    public static final e instance = e.a();
    public static String sdkTag = "SECVERIFY";

    static {
        int i11 = 0;
        for (String str : SDK_VERSION_NAME.split("\\.")) {
            i11 = (i11 * 100) + Integer.parseInt(str);
        }
        SDK_VERSION_CODE = i11;
    }

    public static String getVersion() {
        return SDK_VERSION_NAME;
    }

    public static void preVerify(OperationCallback<PreVerifyResult> operationCallback) {
        instance.a(operationCallback);
    }

    public static void verify(OperationCallback<VerifyResult> operationCallback) {
        instance.b(operationCallback);
    }

    public static void preVerify(OperationCallback<PreVerifyResult> operationCallback, boolean z11) {
        e.a().a(operationCallback, z11);
    }
}
