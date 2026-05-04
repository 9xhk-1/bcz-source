package com.tencent.mm.opensdk.diffdev;

import com.tencent.mm.opensdk.diffdev.a.a;
import com.tencent.mm.opensdk.utils.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class DiffDevOAuthFactory {
    public static final int MAX_SUPPORTED_VERSION = 1;
    private static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
    public static final int VERSION_1 = 1;
    private static IDiffDevOAuth v1Instance;

    private DiffDevOAuthFactory() {
    }

    public static IDiffDevOAuth getDiffDevOAuth() {
        return getDiffDevOAuth(1);
    }

    public static IDiffDevOAuth getDiffDevOAuth(int i11) {
        Log.v(TAG, "getDiffDevOAuth, version = " + i11);
        if (i11 > 1) {
            Log.e(TAG, "getDiffDevOAuth fail, unsupported version = " + i11);
            return null;
        }
        if (i11 != 1) {
            return null;
        }
        if (v1Instance == null) {
            v1Instance = new a();
        }
        return v1Instance;
    }
}
