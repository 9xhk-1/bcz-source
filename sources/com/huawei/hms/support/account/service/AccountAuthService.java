package com.huawei.hms.support.account.service;

import android.content.Intent;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.AssistTokenResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.entity.account.GetAssistTokenRequest;
import com.huawei.hms.support.feature.service.AuthService;
import fr.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface AccountAuthService extends AuthService {
    k<AssistTokenResult> getAssistToken(GetAssistTokenRequest getAssistTokenRequest);

    k<AccountIcon> getChannel();

    Intent getIndependentSignInIntent(String str);

    k<Void> logout();

    k<AuthAccount> silentSignIn();

    k<Void> startAssistLogin(String str);
}
