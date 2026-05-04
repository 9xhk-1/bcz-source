package com.huawei.hms.jos;

import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.jos.apps.AppHmsClient;
import fr.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class InitTaskApiCall extends JosBaseApiCall<AppHmsClient, Void> {

    /* renamed from: a, reason: collision with root package name */
    private InitCallback f36058a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36059b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface InitCallback {
        void callback();
    }

    public InitTaskApiCall(String str, String str2, String str3, InitCallback initCallback, boolean z11) {
        super(str, str2, str3);
        this.f36058a = initCallback;
        this.f36059b = z11;
    }

    @Override // com.huawei.hms.jos.JosBaseApiCall
    public void doExecuteFailed(ResponseErrorCode responseErrorCode, l<Void> lVar) {
        super.doExecuteFailed(responseErrorCode, lVar);
    }

    @Override // com.huawei.hms.jos.JosBaseApiCall
    public void doExecuteSuccess(ResponseErrorCode responseErrorCode, String str, l<Void> lVar) {
        this.f36058a.callback();
        lVar.d(null);
    }

    @Override // com.huawei.hms.jos.JosBaseApiCall, com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return this.f36059b ? 15 : 14;
    }

    @Override // com.huawei.hms.jos.JosBaseApiCall, com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f36059b ? JosConstant.APP_HMS_VERSION_6_6_0 : JosConstant.APP_HMS_VERSION_6_1_0;
    }
}
