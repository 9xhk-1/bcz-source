package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l extends TaskApiCall<PushClient, TokenResult> {

    /* renamed from: a, reason: collision with root package name */
    public Context f36096a;

    /* renamed from: b, reason: collision with root package name */
    public TokenReq f36097b;

    public l(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.f36096a = context;
        this.f36097b = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, fr.l<TokenResult> lVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            a(responseErrorCode, lVar);
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum fromCode = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (fromCode != ErrorEnum.SUCCESS) {
                lVar.c(fromCode.toApiException());
                HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, StatusCode:" + fromCode.getExternalCode());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                lVar.d(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i(HmsInstanceId.TAG, "GetTokenTask receive a empty token, please check HmsMessageService.onNewToken receive result.");
                    q.a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                } else {
                    a(token, this.f36097b.getSubjectId());
                    n.a(this.f36096a, token);
                }
            }
        }
        q.a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f36097b.isMultiSender() ? 50004300 : 30000000;
    }

    public final void a(ResponseErrorCode responseErrorCode, fr.l<TokenResult> lVar) {
        ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
            lVar.c(fromCode.toApiException());
        } else {
            lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    public final void a(String str, String str2) {
        if (i.a(this.f36096a).b(str2).equals(str)) {
            return;
        }
        HMSLog.i(HmsInstanceId.TAG, "receive a token, refresh the local token");
        i.a(this.f36096a).b(str2, str);
    }
}
