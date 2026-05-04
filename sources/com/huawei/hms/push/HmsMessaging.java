package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import com.vivo.push.PushClientConstants;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f36132a = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");

    /* renamed from: b, reason: collision with root package name */
    public Context f36133b;

    /* renamed from: c, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f36134c;

    public HmsMessaging(Context context) {
        Preconditions.checkNotNull(context);
        this.f36133b = context;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.f36134c = huaweiApi;
        huaweiApi.setKitSdkVersion(60500300);
    }

    public static synchronized HmsMessaging getInstance(Context context) {
        HmsMessaging hmsMessaging;
        synchronized (HmsMessaging.class) {
            hmsMessaging = new HmsMessaging(context);
        }
        return hmsMessaging;
    }

    public final fr.k<Void> a(String str, String str2) {
        String reportEntry = PushBiUtil.reportEntry(this.f36133b, PushNaming.SUBSCRIBE);
        if (str == null || !f36132a.matcher(str).matches()) {
            PushBiUtil.reportExit(this.f36133b, PushNaming.SUBSCRIBE, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
            throw new IllegalArgumentException("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        }
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "use proxy subscribe.");
            return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.f36133b, str, reportEntry) : ProxyCenter.getProxy().unsubscribe(this.f36133b, str, reportEntry);
        }
        try {
            ErrorEnum a11 = d.a(this.f36133b);
            if (a11 != ErrorEnum.SUCCESS) {
                throw a11.toApiException();
            }
            if (NetWorkUtil.getNetworkType(this.f36133b) == 0) {
                HMSLog.e("HmsMessaging", "no network");
                throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
            }
            SubscribeReq subscribeReq = new SubscribeReq(this.f36133b, str2, str);
            subscribeReq.setToken(BaseUtils.getLocalToken(this.f36133b, null));
            return s.b() ? this.f36134c.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry)) : this.f36134c.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry));
        } catch (ApiException e11) {
            fr.l lVar = new fr.l();
            lVar.c(e11);
            PushBiUtil.reportExit(this.f36133b, PushNaming.SUBSCRIBE, reportEntry, e11.getStatusCode());
            return lVar.b();
        } catch (Exception unused) {
            fr.l lVar2 = new fr.l();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            lVar2.c(errorEnum.toApiException());
            PushBiUtil.reportExit(this.f36133b, PushNaming.SUBSCRIBE, reportEntry, errorEnum);
            return lVar2.b();
        }
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.f36133b);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.e("HmsMessaging", "Operation(send) unsupported");
            throw new UnsupportedOperationException("Operation(send) unsupported");
        }
        HMSLog.i("HmsMessaging", "send upstream message");
        a(remoteMessage);
    }

    public void setAutoInitEnabled(boolean z11) {
        AutoInitHelper.setAutoInitEnabled(this.f36133b, z11);
    }

    public fr.k<Void> subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public fr.k<Void> turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.f36133b, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public fr.k<Void> turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.f36133b, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    public fr.k<Void> unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }

    public final void a(RemoteMessage remoteMessage) {
        String reportEntry = PushBiUtil.reportEntry(this.f36133b, PushNaming.UPSEND_MSG);
        ErrorEnum a11 = d.a(this.f36133b);
        if (a11 == ErrorEnum.SUCCESS) {
            if (!TextUtils.isEmpty(remoteMessage.getTo())) {
                if (!TextUtils.isEmpty(remoteMessage.getMessageId())) {
                    if (!TextUtils.isEmpty(remoteMessage.getData())) {
                        UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
                        upSendMsgReq.setPackageName(this.f36133b.getPackageName());
                        upSendMsgReq.setMessageId(remoteMessage.getMessageId());
                        upSendMsgReq.setTo(remoteMessage.getTo());
                        upSendMsgReq.setData(remoteMessage.getData());
                        upSendMsgReq.setMessageType(remoteMessage.getMessageType());
                        upSendMsgReq.setTtl(remoteMessage.getTtl());
                        upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
                        upSendMsgReq.setSendMode(remoteMessage.getSendMode());
                        upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
                        if (s.b()) {
                            this.f36134c.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), reportEntry));
                            return;
                        } else {
                            a(upSendMsgReq, reportEntry);
                            return;
                        }
                    }
                    HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
                    PushBiUtil.reportExit(this.f36133b, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                    throw new IllegalArgumentException("Mandatory parameter 'data' missing");
                }
                HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
                PushBiUtil.reportExit(this.f36133b, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                throw new IllegalArgumentException("Mandatory parameter 'message_id' missing");
            }
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.f36133b, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'to' missing");
        }
        HMSLog.e("HmsMessaging", "Message sent failed:" + a11.getExternalCode() + ':' + a11.getMessage());
        PushBiUtil.reportExit(this.f36133b, PushNaming.UPSEND_MSG, reportEntry, a11);
        throw new UnsupportedOperationException(a11.getMessage());
    }

    public final fr.k<Void> a(boolean z11) {
        String reportEntry = PushBiUtil.reportEntry(this.f36133b, PushNaming.SET_NOTIFY_FLAG);
        if (s.d(this.f36133b) && !s.b()) {
            if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
                HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
                fr.l lVar = new fr.l();
                ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
                lVar.c(errorEnum.toApiException());
                PushBiUtil.reportExit(this.f36133b, PushNaming.SET_NOTIFY_FLAG, reportEntry, errorEnum);
                return lVar.b();
            }
            if (s.b(this.f36133b) < 90101310) {
                HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
                Intent putExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(this.f36133b, this.f36133b.getPackageName() + "#" + z11));
                putExtra.setPackage("android");
                return fr.n.f(new IntentCallable(this.f36133b, putExtra, reportEntry));
            }
            HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
            new PushPreferences(this.f36133b, "push_notify_flag").saveBoolean("notify_msg_enable", !z11);
            Uri parse = Uri.parse("content://" + this.f36133b.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
            Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
            intent.putExtra("type", "enalbeFlag");
            intent.putExtra(PushClientConstants.TAG_PKG_NAME, this.f36133b.getPackageName());
            intent.putExtra("url", parse);
            intent.setPackage("android");
            return fr.n.f(new IntentCallable(this.f36133b, intent, reportEntry));
        }
        HMSLog.i("HmsMessaging", "turn on/off with AIDL");
        EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
        enableNotifyReq.setPackageName(this.f36133b.getPackageName());
        enableNotifyReq.setEnable(z11);
        return this.f36134c.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), reportEntry));
    }

    public final void a(UpSendMsgReq upSendMsgReq, String str) {
        String str2;
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.f36133b, null));
        try {
            str2 = str;
        } catch (Exception e11) {
            e = e11;
            str2 = str;
        }
        try {
            this.f36134c.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str2, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e12) {
            e = e12;
            Exception exc = e;
            if (exc.getCause() instanceof ApiException) {
                PushBiUtil.reportExit(this.f36133b, PushNaming.UPSEND_MSG, str2, ((ApiException) exc.getCause()).getStatusCode());
            } else {
                PushBiUtil.reportExit(this.f36133b, PushNaming.UPSEND_MSG, str2, ErrorEnum.ERROR_INTERNAL_ERROR);
            }
        }
    }
}
