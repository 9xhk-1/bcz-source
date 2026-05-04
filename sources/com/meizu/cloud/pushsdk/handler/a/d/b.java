package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import java.util.Map;

/* loaded from: classes7.dex */
public class b extends com.meizu.cloud.pushsdk.handler.a.a<MessageV3> {

    /* renamed from: a, reason: collision with root package name */
    private Context f39887a;

    public b(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
        this.f39887a = context;
    }

    private Intent b(Context context, MessageV3 messageV3) {
        Intent intent;
        String uriPackageName = messageV3.getUriPackageName();
        if (TextUtils.isEmpty(uriPackageName)) {
            uriPackageName = messageV3.getUploadDataPackageName();
        }
        DebugLogger.i("AbstractMessageHandler", "openClassName is " + uriPackageName);
        if (messageV3.getClickType() == 0) {
            intent = context.getPackageManager().getLaunchIntentForPackage(uriPackageName);
            if (intent != null && messageV3.getParamsMap() != null) {
                for (Map.Entry<String, String> entry : messageV3.getParamsMap().entrySet()) {
                    DebugLogger.i("AbstractMessageHandler", " launcher activity key " + entry.getKey() + " value " + entry.getValue());
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        intent.putExtra(entry.getKey(), entry.getValue());
                    }
                }
            }
        } else if (1 == messageV3.getClickType()) {
            intent = new Intent();
            if (messageV3.getParamsMap() != null) {
                for (Map.Entry<String, String> entry2 : messageV3.getParamsMap().entrySet()) {
                    DebugLogger.i("AbstractMessageHandler", " key " + entry2.getKey() + " value " + entry2.getValue());
                    if (!TextUtils.isEmpty(entry2.getKey()) && !TextUtils.isEmpty(entry2.getValue())) {
                        intent.putExtra(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            intent.setClassName(uriPackageName, messageV3.getActivity());
            DebugLogger.i("AbstractMessageHandler", intent.toUri(1));
        } else if (2 == messageV3.getClickType()) {
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(messageV3.getWebUrl()));
            String uriPackageName2 = messageV3.getUriPackageName();
            if (!TextUtils.isEmpty(uriPackageName2)) {
                intent2.setPackage(uriPackageName2);
                DebugLogger.i("AbstractMessageHandler", "set uri package " + uriPackageName2);
            }
            intent = intent2;
        } else {
            if (3 == messageV3.getClickType()) {
                DebugLogger.i("AbstractMessageHandler", "CLICK_TYPE_SELF_DEFINE_ACTION");
            }
            intent = null;
        }
        if (intent != null) {
            intent.putExtra(PushConstants.MZ_PUSH_PLATFORM_EXTRA, com.meizu.cloud.pushsdk.handler.a.c.d.a().a(messageV3.getTaskId()).a().b());
        }
        return intent;
    }

    private MessageV3 c(String str) {
        return com.meizu.cloud.pushsdk.handler.d.a(str);
    }

    private void e(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.b.a(d(), messageV3.getPackageName(), 0);
        Intent b11 = b(d(), messageV3);
        if (b11 != null) {
            b11.addFlags(268435456);
            try {
                d().startActivity(b11);
            } catch (Exception e11) {
                DebugLogger.e("AbstractMessageHandler", "Click message StartActivity error " + e11.getMessage());
            }
        }
    }

    private MessageV3 m(Intent intent) {
        MPushMessage mPushMessage;
        String g11;
        String d11;
        String taskId;
        try {
            try {
                MessageV3 messageV3 = (MessageV3) intent.getParcelableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
                if (messageV3 != null) {
                    return messageV3;
                }
            } catch (Exception unused) {
                DebugLogger.e("AbstractMessageHandler", "cannot get messageV3");
            }
            return MessageV3.parse(g11, d11, taskId, mPushMessage);
        } finally {
            DebugLogger.e("AbstractMessageHandler", "parse MessageV2 to MessageV3");
            mPushMessage = (MPushMessage) intent.getSerializableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
            MessageV3.parse(g(intent), d(intent), mPushMessage.getTaskId(), mPushMessage);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 64;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.d(d(), messageV3.getUploadDataPackageName(), TextUtils.isEmpty(messageV3.getDeviceId()) ? d((Intent) null) : messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessageV3 c(Intent intent) {
        DebugLogger.e("AbstractMessageHandler", "parse message V3");
        String stringExtra = intent.getStringExtra(PushConstants.MZ_MESSAGE_VALUE);
        return !TextUtils.isEmpty(stringExtra) ? c(stringExtra) : m(intent);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (messageV3 == null) {
            return;
        }
        e(messageV3);
        if (!TextUtils.isEmpty(messageV3.getTitle()) && !TextUtils.isEmpty(messageV3.getContent()) && c() != null) {
            c().a(d(), MzPushMessage.fromMessageV3(messageV3));
        }
        b(messageV3);
        a(this.f39887a, messageV3);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(MessageV3 messageV3, String str) {
        return a(messageV3, str);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationClickMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && "private".equals(k(intent));
    }
}
