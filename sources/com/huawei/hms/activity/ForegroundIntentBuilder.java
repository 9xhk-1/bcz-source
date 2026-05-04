package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ForegroundIntentBuilder {

    /* renamed from: a, reason: collision with root package name */
    private Activity f35251a;

    /* renamed from: b, reason: collision with root package name */
    private RequestHeader f35252b;

    /* renamed from: c, reason: collision with root package name */
    private String f35253c;

    /* renamed from: d, reason: collision with root package name */
    private ForegroundInnerHeader f35254d;

    /* renamed from: e, reason: collision with root package name */
    private String f35255e;

    /* renamed from: f, reason: collision with root package name */
    private Context f35256f;

    public ForegroundIntentBuilder(Activity activity) throws IllegalArgumentException {
        if (activity == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.f35251a = activity;
        RequestHeader requestHeader = new RequestHeader();
        this.f35252b = requestHeader;
        requestHeader.setSdkVersion(61200300);
        this.f35253c = "";
        ForegroundInnerHeader foregroundInnerHeader = new ForegroundInnerHeader();
        this.f35254d = foregroundInnerHeader;
        foregroundInnerHeader.setApkVersion(30000000);
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
    }

    public static void unregisterResponseCallback(String str) {
        ForegroundBusResponseMgr.getInstance().unRegisterObserver(str);
    }

    public Intent build() {
        String packageName;
        String appId;
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(this.f35251a, ForegroundBusDelegate.class.getName());
        Context context = this.f35256f;
        if (context != null) {
            packageName = context.getPackageName();
            appId = Util.getAppId(this.f35256f);
        } else {
            packageName = this.f35251a.getPackageName();
            appId = Util.getAppId(this.f35251a);
        }
        if (this.f35252b.getAppID() == null) {
            this.f35252b.setAppID(appId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        } else {
            this.f35252b.setAppID(appId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f35252b.getAppID());
        }
        if (TextUtils.isEmpty(this.f35252b.getTransactionId())) {
            RequestHeader requestHeader = this.f35252b;
            requestHeader.setTransactionId(TransactionIdCreater.getId(requestHeader.getAppID(), CoreNaming.HUBREQUEST));
        }
        this.f35252b.setPkgName(packageName);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_HEADER, this.f35252b.toJson());
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_BODY, this.f35253c);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_INNER, this.f35254d.toJson());
        if (!TextUtils.isEmpty(this.f35255e)) {
            intentStartBridgeActivity.putExtra(ForegroundBusDelegate.INNER_PKG_NAME, this.f35255e);
        }
        return intentStartBridgeActivity;
    }

    public ForegroundIntentBuilder setAction(String str) {
        this.f35252b.setApiName(str);
        return this;
    }

    public ForegroundIntentBuilder setApiLevel(int i11) {
        this.f35252b.setApiLevel(i11);
        return this;
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
        this.f35256f = context;
        return this;
    }

    public ForegroundIntentBuilder setInnerHms() {
        this.f35255e = this.f35251a.getPackageName();
        return this;
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i11) {
        this.f35252b.setKitSdkVersion(i11);
        return this;
    }

    public ForegroundIntentBuilder setMinApkVersion(int i11) {
        this.f35254d.setApkVersion(i11);
        return this;
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
        this.f35253c = str;
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
        this.f35254d.setResponseCallbackKey(str);
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
        return this;
    }

    public ForegroundIntentBuilder setServiceName(String str) {
        this.f35252b.setSrvName(str);
        return this;
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
        this.f35252b.setAppID(str);
        return this;
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
        this.f35252b.setTransactionId(str);
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
        this.f35254d.setResponseCallbackKey(str);
        return this;
    }
}
