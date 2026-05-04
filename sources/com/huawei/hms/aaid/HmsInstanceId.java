package com.huawei.hms.aaid;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.j;
import com.huawei.hms.opendevice.o;
import com.huawei.hms.opendevice.p;
import com.huawei.hms.opendevice.q;
import com.huawei.hms.support.log.HMSLog;
import fr.k;
import fr.l;
import fr.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";

    /* renamed from: a, reason: collision with root package name */
    public Context f35223a;

    /* renamed from: b, reason: collision with root package name */
    public PushPreferences f35224b;

    /* renamed from: c, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f35225c;

    public HmsInstanceId(Context context) {
        this.f35223a = context.getApplicationContext();
        this.f35224b = new PushPreferences(context, "aaid");
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.f35225c = huaweiApi;
        huaweiApi.setKitSdkVersion(60300305);
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        c.c(context);
        return new HmsInstanceId(context);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!p.e(this.f35223a)) {
            i.a(this.f35223a).removeKey("subjectId");
            return;
        }
        String string = i.a(this.f35223a).getString("subjectId");
        if (TextUtils.isEmpty(string)) {
            i.a(this.f35223a).saveString("subjectId", str);
            return;
        }
        if (string.contains(str)) {
            return;
        }
        i.a(this.f35223a).saveString("subjectId", string + "," + str);
    }

    public final void b() throws ApiException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
        }
    }

    public void deleteAAID() throws ApiException {
        b();
        try {
            if (this.f35224b.containsKey("aaid")) {
                this.f35224b.removeKey("aaid");
                this.f35224b.removeKey("creationTime");
                if (o.e(this.f35223a)) {
                    if (ProxyCenter.getProxy() != null) {
                        HMSLog.i(TAG, "use proxy delete all token after delete AaId.");
                        ProxyCenter.getProxy().deleteAllToken(this.f35223a);
                        return;
                    }
                    DeleteTokenReq b11 = o.b(this.f35223a);
                    b11.setDeleteType(1);
                    b11.setMultiSender(false);
                    a(b11, 1);
                    BaseUtils.deleteAllTokenCache(this.f35223a);
                }
            }
        } catch (ApiException e11) {
            throw e11;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public void deleteToken(String str, String str2) throws ApiException {
        b();
        a();
        DeleteTokenReq a11 = o.a(this.f35223a, str, str2);
        a11.setMultiSender(false);
        a(a11, 1);
    }

    public k<AAIDResult> getAAID() {
        try {
            return n.f(new j(this.f35223a.getApplicationContext()));
        } catch (Exception unused) {
            l lVar = new l();
            lVar.c(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            return lVar.b();
        }
    }

    public long getCreationTime() {
        try {
            if (!this.f35224b.containsKey("creationTime")) {
                getAAID();
            }
            return this.f35224b.getLong("creationTime");
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return o.c(this.f35223a);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken(String str, String str2) throws ApiException {
        b();
        a();
        TokenReq b11 = o.b(this.f35223a, null, str2);
        b11.setAaid(getId());
        b11.setMultiSender(false);
        i.a(this.f35223a).saveString(this.f35223a.getPackageName(), "1");
        return a(b11, 1);
    }

    public void deleteToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String d11 = o.d(this.f35223a);
            if (!TextUtils.isEmpty(d11)) {
                if (str.equals(d11)) {
                    deleteToken(null, null);
                    return;
                }
                DeleteTokenReq a11 = o.a(this.f35223a, str);
                a11.setMultiSender(true);
                a(a11, 2);
                return;
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String d11 = o.d(this.f35223a);
            if (!TextUtils.isEmpty(d11)) {
                if (str.equals(d11)) {
                    return getToken(null, null);
                }
                TokenReq b11 = o.b(this.f35223a, str);
                b11.setAaid(getId());
                b11.setMultiSender(true);
                return a(b11, 2);
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public final String a(TokenReq tokenReq, int i11) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f35223a, tokenReq.getSubjectId(), null);
            return null;
        }
        a(tokenReq.getSubjectId());
        String a11 = q.a(this.f35223a, "push.gettoken");
        try {
            String str = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getToken req :");
            sb2.append(tokenReq.toString());
            HMSLog.d(str, sb2.toString());
            com.huawei.hms.opendevice.l lVar = new com.huawei.hms.opendevice.l("push.gettoken", tokenReq, this.f35223a, a11);
            lVar.setApiLevel(i11);
            return ((TokenResult) n.c(this.f35225c.doWrite(lVar))).getToken();
        } catch (Exception e11) {
            if (e11.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e11.getCause();
                q.a(this.f35223a, "push.gettoken", a11, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f35223a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context, "push.gettoken", a11, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    public final void a(DeleteTokenReq deleteTokenReq, int i11) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.f35223a, subjectId, null);
            return;
        }
        String a11 = q.a(this.f35223a, "push.deletetoken");
        try {
            String b11 = i.a(this.f35223a).b(subjectId);
            if (!deleteTokenReq.isMultiSender() || (!TextUtils.isEmpty(b11) && !b11.equals(i.a(this.f35223a).b(null)))) {
                deleteTokenReq.setToken(b11);
                com.huawei.hms.opendevice.k kVar = new com.huawei.hms.opendevice.k("push.deletetoken", deleteTokenReq, a11);
                kVar.setApiLevel(i11);
                n.c(this.f35225c.doWrite(kVar));
                i.a(this.f35223a).c(subjectId);
                return;
            }
            i.a(this.f35223a).removeKey(subjectId);
            HMSLog.i(TAG, "The local subject token is null");
        } catch (Exception e11) {
            if (e11.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e11.getCause();
                q.a(this.f35223a, "push.deletetoken", a11, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f35223a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context, "push.deletetoken", a11, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    public final void a() throws ApiException {
        if (BaseUtils.getProxyInit(this.f35223a) && ProxyCenter.getProxy() == null && !BaseUtils.isMainProc(this.f35223a)) {
            HMSLog.e(TAG, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
        }
    }
}
