package com.huawei.hms.support.api.hwid;

import android.accounts.Account;
import com.huawei.hms.api.Api;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface HuaweiAccountOptions {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface HasAccountOptions extends Api.ApiOptions.HasOptions, Api.ApiOptions.NotRequiredOptions {
        Account getAccount();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface HasAuthHuaweiIdOptions extends Api.ApiOptions.HasOptions {
        AuthHuaweiId getAuthHuaweiId();
    }
}
