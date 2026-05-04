package com.huawei.hms.opendevice;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public Context f36087a;

    public f(Context context) {
        this.f36087a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        Bundle bundle;
        try {
            int internalCode = ErrorEnum.SUCCESS.getInternalCode();
            ApiException apiException = null;
            try {
                str = HmsInstanceId.getInstance(this.f36087a).getToken(Util.getAppId(this.f36087a), null);
            } catch (ApiException e11) {
                e = e11;
                str = null;
            }
            try {
                HMSLog.i("AutoInit", "Push init succeed");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            } catch (ApiException e12) {
                e = e12;
                apiException = e;
                internalCode = apiException.getStatusCode();
                HMSLog.e("AutoInit", "new Push init failed");
                bundle = this.f36087a.getPackageManager().getApplicationInfo(this.f36087a.getPackageName(), 128).metaData;
                if (bundle != null) {
                }
                HMSLog.i("AutoInit", "push kit sdk not exists");
                return;
            }
            try {
                bundle = this.f36087a.getPackageManager().getApplicationInfo(this.f36087a.getPackageName(), 128).metaData;
                if (bundle != null || bundle.getString("com.huawei.hms.client.service.name:push") == null) {
                    HMSLog.i("AutoInit", "push kit sdk not exists");
                    return;
                }
                Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                intent.setPackage(this.f36087a.getPackageName());
                Bundle bundle2 = new Bundle();
                bundle2.putString("message_type", "new_token");
                bundle2.putString(RemoteMessageConst.DEVICE_TOKEN, str);
                bundle2.putInt("error", internalCode);
                if (apiException != null) {
                    bundle2.putSerializable("exception_key", apiException);
                }
                if (new h().a(this.f36087a, bundle2, intent)) {
                    return;
                }
                HMSLog.e("AutoInit", "start service failed");
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.i("AutoInit", "push kit sdk not exists");
            }
        } catch (Exception e13) {
            HMSLog.e("AutoInit", "Push init failed", e13);
        }
    }
}
