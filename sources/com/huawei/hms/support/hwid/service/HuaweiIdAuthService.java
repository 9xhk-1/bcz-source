package com.huawei.hms.support.hwid.service;

import android.content.Intent;
import com.huawei.hms.support.feature.service.AuthService;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import fr.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface HuaweiIdAuthService extends AuthService {
    Intent getSignInIntent(String str);

    k<AuthHuaweiId> silentSignIn();

    k<AuthHuaweiId> silentSignIn(String str);
}
