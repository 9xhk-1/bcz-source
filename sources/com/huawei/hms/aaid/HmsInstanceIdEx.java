package com.huawei.hms.aaid;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.o;
import com.huawei.hms.opendevice.q;
import com.huawei.hms.support.log.HMSLog;
import fr.k;
import fr.l;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";

    /* renamed from: a, reason: collision with root package name */
    public Context f35226a;

    /* renamed from: b, reason: collision with root package name */
    public PushPreferences f35227b;

    /* renamed from: c, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f35228c;

    public HmsInstanceIdEx(Context context) {
        this.f35227b = null;
        this.f35226a = context;
        this.f35227b = new PushPreferences(context, "aaid");
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.f35228c = huaweiApi;
        huaweiApi.setKitSdkVersion(60300305);
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public final String a(String str) {
        return "creationTime" + str;
    }

    public void deleteAAID(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f35227b.containsKey(str)) {
                this.f35227b.removeKey(str);
                this.f35227b.removeKey(a(str));
            }
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public String getAAId(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f35227b.containsKey(str)) {
                return this.f35227b.getString(str);
            }
            String uuid = UUID.randomUUID().toString();
            this.f35227b.saveString(str, uuid);
            this.f35227b.saveLong(a(str), Long.valueOf(System.currentTimeMillis()));
            return uuid;
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public long getCreationTime(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (!this.f35227b.containsKey(a(str))) {
                getAAId(str);
            }
            return this.f35227b.getLong(a(str));
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public k<TokenResult> getToken() {
        if (ProxyCenter.getProxy() != null) {
            try {
                HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
                ProxyCenter.getProxy().getToken(this.f35226a, null, null);
                l lVar = new l();
                lVar.d(new TokenResult());
                return lVar.b();
            } catch (ApiException e11) {
                return a(e11);
            } catch (Exception unused) {
                return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            }
        }
        String a11 = q.a(this.f35226a, "push.gettoken");
        try {
            TokenReq b11 = o.b(this.f35226a, null, null);
            b11.setAaid(HmsInstanceId.getInstance(this.f35226a).getId());
            return this.f35228c.doWrite(new com.huawei.hms.opendevice.l("push.gettoken", b11, this.f35226a, a11));
        } catch (RuntimeException unused2) {
            Context context = this.f35226a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context, "push.gettoken", a11, errorEnum);
            return a(errorEnum.toApiException());
        } catch (Exception unused3) {
            Context context2 = this.f35226a;
            ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context2, "push.gettoken", a11, errorEnum2);
            return a(errorEnum2.toApiException());
        }
    }

    public final k<TokenResult> a(Exception exc) {
        l lVar = new l();
        lVar.c(exc);
        return lVar.b();
    }
}
