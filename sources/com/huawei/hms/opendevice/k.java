package com.huawei.hms.opendevice;

import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.DeleteTokenResp;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k extends TaskApiCall<PushClient, Void> {

    /* renamed from: a, reason: collision with root package name */
    public DeleteTokenReq f36095a;

    public k(String str, DeleteTokenReq deleteTokenReq, String str2) {
        super(str, JsonUtil.createJsonString(deleteTokenReq), str2);
        this.f36095a = deleteTokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fr.l<Void> lVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            ErrorEnum fromCode = ErrorEnum.fromCode(((DeleteTokenResp) JsonUtil.jsonToEntity(str, new DeleteTokenResp())).getRetCode());
            if (fromCode != ErrorEnum.SUCCESS) {
                lVar.c(fromCode.toApiException());
                return;
            } else {
                lVar.d(null);
                q.a(pushClient.getContext(), getUri(), responseErrorCode);
                return;
            }
        }
        HMSLog.e(HmsInstanceId.TAG, "DeleteTokenTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
        ErrorEnum fromCode2 = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode2 != ErrorEnum.ERROR_UNKNOWN) {
            lVar.c(fromCode2.toApiException());
        } else {
            lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f36095a.isMultiSender() ? 50004300 : 30000000;
    }
}
