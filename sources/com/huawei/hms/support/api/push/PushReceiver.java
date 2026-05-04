package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.h;
import com.huawei.hms.push.s;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.push.v;
import com.huawei.hms.push.w;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class PushReceiver extends BroadcastReceiver {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Context f36362a;

        /* renamed from: b, reason: collision with root package name */
        public Intent f36363b;

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
            intent.setPackage(this.f36363b.getPackage());
            try {
                JSONObject b11 = PushReceiver.b(this.f36363b);
                String string = JsonUtil.getString(b11, "moduleName", "");
                int i11 = JsonUtil.getInt(b11, "msgType", 0);
                int i12 = JsonUtil.getInt(b11, "status", 0);
                if (ErrorEnum.SUCCESS.getInternalCode() != i12) {
                    i12 = ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode();
                }
                Bundle bundle = new Bundle();
                if ("Push".equals(string) && i11 == 1) {
                    bundle.putString("message_type", "delivery");
                    bundle.putString("message_id", JsonUtil.getString(b11, "msgId", ""));
                    bundle.putInt("error", i12);
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, JsonUtil.getString(b11, "transactionId", ""));
                } else {
                    if (this.f36363b.getExtras() != null) {
                        bundle.putAll(this.f36363b.getExtras());
                    }
                    bundle.putString("message_type", "received_message");
                    bundle.putString("message_id", this.f36363b.getStringExtra("msgIdStr"));
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, this.f36363b.getByteArrayExtra("msg_data"));
                    bundle.putString(RemoteMessageConst.DEVICE_TOKEN, w.a(this.f36363b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN)));
                    bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
                    bundle.putString("message_proxy_type", this.f36363b.getStringExtra("message_proxy_type"));
                }
                if (new h().a(this.f36362a, bundle, intent)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("receive ");
                    sb2.append(this.f36363b.getAction());
                    sb2.append(" and start service success");
                    HMSLog.i("PushReceiver", sb2.toString());
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("receive ");
                sb3.append(this.f36363b.getAction());
                sb3.append(" and start service failed");
                HMSLog.e("PushReceiver", sb3.toString());
            } catch (RuntimeException unused) {
                HMSLog.e("PushReceiver", "handle push message occur exception.");
            }
        }

        public a(Context context, Intent intent) {
            this.f36362a = context;
            this.f36363b = intent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Context f36364a;

        /* renamed from: b, reason: collision with root package name */
        public Intent f36365b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] byteArrayExtra = this.f36365b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN);
                if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("receive a push token: ");
                    sb2.append(this.f36364a.getPackageName());
                    HMSLog.i("PushReceiver", sb2.toString());
                    Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                    intent.setPackage(this.f36365b.getPackage());
                    Bundle bundle = new Bundle();
                    bundle.putString("message_type", "new_token");
                    bundle.putString(RemoteMessageConst.DEVICE_TOKEN, w.a(byteArrayExtra));
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, this.f36365b.getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
                    bundle.putString("subjectId", this.f36365b.getStringExtra("subjectId"));
                    bundle.putInt("error", this.f36365b.getIntExtra("error", ErrorEnum.SUCCESS.getInternalCode()));
                    bundle.putString("belongId", this.f36365b.getStringExtra("belongId"));
                    if (new h().a(this.f36364a, bundle, intent)) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("receive ");
                    sb3.append(this.f36365b.getAction());
                    sb3.append(" and start service failed");
                    HMSLog.e("PushReceiver", sb3.toString());
                    return;
                }
                HMSLog.i("PushReceiver", "get a deviceToken, but it is null or empty");
            } catch (RejectedExecutionException unused) {
                HMSLog.e("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                HMSLog.e("PushReceiver", "handle push token error");
            }
        }

        public b(Context context, Intent intent) {
            this.f36364a = context;
            this.f36365b = intent;
        }
    }

    public final void b(Context context, Intent intent) {
        try {
            if (intent.hasExtra(RemoteMessageConst.DEVICE_TOKEN)) {
                v.a().execute(new b(context, intent));
            } else {
                HMSLog.i("PushReceiver", "This message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.e("PushReceiver", "handlePushTokenEvent execute task error");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        HMSLog.i("PushReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.android.push.intent.REGISTRATION".equals(action)) {
                b(context, intent);
            } else if ("com.huawei.android.push.intent.RECEIVE".equals(action)) {
                a(context, intent);
            } else {
                HMSLog.i("PushReceiver", "message can't be recognised.");
            }
        } catch (Exception unused) {
            HMSLog.e("PushReceiver", "intent has some error");
        }
    }

    public final void a(Context context, Intent intent) {
        try {
            if (intent.hasExtra("msg_data")) {
                v.a().execute(new a(context, intent));
            } else {
                HMSLog.i("PushReceiver", "This push message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.e("PushReceiver", "handlePushMessageEvent execute task error");
        }
    }

    public static JSONObject b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    public static JSONObject a(byte[] bArr) {
        try {
            return new JSONObject(w.a(bArr));
        } catch (JSONException unused) {
            HMSLog.w("PushReceiver", "JSONException:parse message body failed.");
            return null;
        }
    }

    public static JSONObject b(Intent intent) throws RuntimeException {
        JSONObject a11 = a(intent.getByteArrayExtra("msg_data"));
        JSONObject a12 = a(a11);
        String string = JsonUtil.getString(a12, "data", null);
        if (s.a(a12, b(a12), string)) {
            return a11;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }
}
