package com.huawei.hms.support.hwid.service;

import android.app.Activity;
import android.content.Intent;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.SignInResult;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface HuaweiIdAuthAPIService {
    public static final String EXTRA_AUTH_HUAWEI_ID = "HUAWEIID_SIGNIN_RESULT";

    PendingResult<Status> cancelAuthorization(HuaweiApiClient huaweiApiClient);

    SignInResult getHwIdSignInResultFromIntent(Intent intent);

    @Deprecated
    Intent getSignInIntent(HuaweiApiClient huaweiApiClient);

    HuaweiIdAuthResult parseHuaweiIdFromIntent(Intent intent);

    PendingResult<SignInResult> signIn(Activity activity, HuaweiApiClient huaweiApiClient);

    PendingResult<SignInResult> signInBackend(HuaweiApiClient huaweiApiClient);

    PendingResult<Status> signOut(HuaweiApiClient huaweiApiClient);

    OptionalPendingResult<HuaweiIdAuthResult> silentSignIn(HuaweiApiClient huaweiApiClient);
}
