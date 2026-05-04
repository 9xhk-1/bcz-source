package com.huawei.hms.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.t;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HmsMessageService extends Service {
    public static final String PROXY_TYPE = "proxy_type";
    public static final String SUBJECT_ID = "subject_id";

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f36130a = new Messenger(new t(new a()));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t.a {
        public a() {
        }

        @Override // com.huawei.hms.push.t.a
        public void handleMessage(Message message) {
            if (message == null) {
                HMSLog.e("HmsMessageService", "receive message is null");
                return;
            }
            HMSLog.i("HmsMessageService", "handle message start...");
            Bundle data = Message.obtain(message).getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                intent.putExtra(RemoteMessageConst.INPUT_TYPE, data.getInt(RemoteMessageConst.INPUT_TYPE, -1));
                HmsMessageService.this.handleIntentMessage(intent);
            }
        }
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = getApplicationContext();
        if (str.equals(BaseUtils.getLocalToken(applicationContext, str2))) {
            BaseUtils.reportAaidToken(applicationContext, str);
        } else {
            HMSLog.i("HmsMessageService", "receive a token, refresh the local token");
            BaseUtils.saveToken(applicationContext, str2, str);
        }
    }

    public final void b(Intent intent) {
        HMSLog.i("HmsMessageService", "parse batch response.");
        String stringExtra = intent.getStringExtra("batchMsgbody");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                String optString = jSONObject.optString("transactionId");
                String optString2 = jSONObject.optString("msgId");
                int optInt = jSONObject.optInt("ret", ErrorEnum.ERROR_UNKNOWN.getInternalCode());
                if (ErrorEnum.SUCCESS.getInternalCode() == optInt) {
                    b(optString, optString2);
                } else {
                    b(optString, optString2, optInt);
                }
            }
        } catch (JSONException unused) {
            HMSLog.w("HmsMessageService", "parse batch response failed.");
        }
    }

    public void doMsgReceived(Intent intent) {
        onMessageReceived(new RemoteMessage(a(intent)));
    }

    public void handleIntentMessage(Intent intent) {
        if (intent == null) {
            HMSLog.e("HmsMessageService", "receive message is null");
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("message_id");
            String stringExtra2 = intent.getStringExtra("message_type");
            String stringExtra3 = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
            if ("new_token".equals(stringExtra2)) {
                HMSLog.i("HmsMessageService", "onNewToken");
                a(intent, stringExtra3);
                return;
            }
            if ("received_message".equals(stringExtra2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onMessageReceived, message id:");
                sb2.append(stringExtra);
                HMSLog.i("HmsMessageService", sb2.toString());
                a(PushNaming.RECEIVE_MSG_RSP, stringExtra, ErrorEnum.SUCCESS.getInternalCode());
                doMsgReceived(intent);
                return;
            }
            if ("sent_message".equals(stringExtra2)) {
                b(stringExtra3, stringExtra);
                return;
            }
            if ("send_error".equals(stringExtra2)) {
                b(stringExtra3, stringExtra, intent.getIntExtra("error", ErrorEnum.ERROR_UNKNOWN.getInternalCode()));
                return;
            }
            if ("delivery".equals(stringExtra2)) {
                int intExtra = intent.getIntExtra("error", ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onMessageDelivery, message id:");
                sb3.append(stringExtra);
                sb3.append(", status:");
                sb3.append(intExtra);
                sb3.append(", transactionId: ");
                sb3.append(stringExtra3);
                HMSLog.i("HmsMessageService", sb3.toString());
                a(PushNaming.UPSEND_RECEIPT, stringExtra3, intExtra);
                onMessageDelivered(stringExtra, new SendException(intExtra));
                return;
            }
            if ("server_deleted_message".equals(stringExtra2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("delete message, message id:");
                sb4.append(stringExtra);
                HMSLog.i("HmsMessageService", sb4.toString());
                onDeletedMessages();
                return;
            }
            if ("batchSent".equals(stringExtra2)) {
                b(intent);
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Receive unknown message: ");
            sb5.append(stringExtra2);
            HMSLog.e("HmsMessageService", sb5.toString());
        } catch (RuntimeException e11) {
            HMSLog.e("HmsMessageService", "handle intent RuntimeException: " + e11.getMessage());
        } catch (Exception e12) {
            HMSLog.e("HmsMessageService", "handle intent exception: " + e12.getMessage());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.i("HmsMessageService", "start to bind");
        return this.f36130a.getBinder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        HMSLog.i("HmsMessageService", "start to destroy");
        super.onDestroy();
    }

    public void onNewToken(String str) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        HMSLog.i("HmsMessageService", "start to command , startId = " + i12);
        handleIntentMessage(intent);
        return 2;
    }

    public void onTokenError(Exception exc) {
    }

    public void onNewToken(String str, Bundle bundle) {
    }

    public void onTokenError(Exception exc, Bundle bundle) {
    }

    public final Bundle a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("message_id", intent.getStringExtra("message_id"));
        bundle.putByteArray(RemoteMessageConst.MSGBODY, intent.getByteArrayExtra(RemoteMessageConst.MSGBODY));
        bundle.putString(RemoteMessageConst.DEVICE_TOKEN, intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN));
        if (intent.getIntExtra(RemoteMessageConst.INPUT_TYPE, -1) == 1) {
            bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
        }
        return bundle;
    }

    public final void b(String str, String str2) {
        HMSLog.i("HmsMessageService", "onMessageSent, message id:" + str2 + ", transactionId: " + str);
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, ErrorEnum.SUCCESS.getInternalCode());
        onMessageSent(str2);
    }

    public final void a(Intent intent, String str) {
        ErrorEnum errorEnum = ErrorEnum.SUCCESS;
        int intExtra = intent.getIntExtra("error", errorEnum.getInternalCode());
        a(PushNaming.GETTOKEN_ASYNC_RSP, str, intExtra);
        String stringExtra = intent.getStringExtra("subjectId");
        String stringExtra2 = intent.getStringExtra("message_proxy_type");
        HMSLog.i("HmsMessageService", "doOnNewToken:transactionId = " + str + " , internalCode = " + intExtra + ",subjectId:" + stringExtra + ",proxyType:" + stringExtra2);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(stringExtra)) {
            bundle.putString(SUBJECT_ID, stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString(PROXY_TYPE, stringExtra2);
        }
        if (intExtra == errorEnum.getInternalCode()) {
            HMSLog.i("HmsMessageService", "Apply token OnNewToken, subId: " + stringExtra);
            a(intent, bundle, stringExtra);
            return;
        }
        HMSLog.i("HmsMessageService", "Apply token failed, subId: " + stringExtra);
        a(intent, bundle, stringExtra, intExtra);
    }

    public final void b(String str, String str2, int i11) {
        HMSLog.i("HmsMessageService", "onSendError, message id:" + str2 + " error:" + i11 + ", transactionId: " + str);
        a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, i11);
        onSendError(str2, new SendException(i11));
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public final synchronized void a(Intent intent, Bundle bundle, String str, int i11) {
        try {
            Context applicationContext = getApplicationContext();
            boolean isEmpty = TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !isEmpty) {
                HMSLog.i("HmsMessageService", "onTokenError to host app.");
                onTokenError(new BaseException(i11));
                BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
                if (subjectIds != null && subjectIds.length != 0) {
                    for (int i12 = 0; i12 < subjectIds.length; i12++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, subjectIds[i12]);
                        HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + subjectIds[i12]);
                        onTokenError(new BaseException(i11), bundle2);
                    }
                    BaseUtils.clearSubjectIds(applicationContext);
                }
                HMSLog.i("HmsMessageService", "onTokenError to host app with bundle.");
                onTokenError(new BaseException(i11), bundle);
                return;
            }
            HMSLog.i("HmsMessageService", "onTokenError to sub app, subjectId:" + str);
            onTokenError(new BaseException(i11), bundle);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void onMessageDelivered(String str, Exception exc) {
    }

    public void onSendError(String str, Exception exc) {
    }

    public final synchronized void a(Intent intent, Bundle bundle, String str) {
        try {
            String stringExtra = intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN);
            a(stringExtra, str);
            Context applicationContext = getApplicationContext();
            boolean isEmpty = TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !isEmpty) {
                HMSLog.i("HmsMessageService", "onNewToken to host app.");
                onNewToken(stringExtra);
                BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
                if (subjectIds != null && subjectIds.length != 0) {
                    for (int i11 = 0; i11 < subjectIds.length; i11++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, subjectIds[i11]);
                        HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + subjectIds[i11]);
                        onNewToken(stringExtra, bundle2);
                        a(stringExtra, subjectIds[i11]);
                    }
                    BaseUtils.clearSubjectIds(applicationContext);
                }
                HMSLog.i("HmsMessageService", "onNewToken to host app with bundle.");
                bundle.putString("belongId", intent.getStringExtra("belongId"));
                onNewToken(stringExtra, bundle);
                return;
            }
            HMSLog.i("HmsMessageService", "onNewToken to sub app, subjectId:" + str);
            onNewToken(stringExtra, bundle);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(String str, String str2, int i11) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        PushBiUtil.reportExit(getApplicationContext(), str, str2, i11);
    }
}
