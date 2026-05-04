package com.huawei.hms.support.api.client;

import com.huawei.hms.core.aidl.IAIDLInvoke;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface AidlApiClient extends ApiClient {
    List<String> getApiNameList();

    IAIDLInvoke getService();
}
