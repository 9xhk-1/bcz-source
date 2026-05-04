package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.hu;
import com.xiaomi.push.ik;
import java.util.List;

/* loaded from: classes6.dex */
public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    private static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j11, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j11);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(ik ikVar, hu huVar, boolean z11) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(ikVar.m6123a());
        if (!TextUtils.isEmpty(ikVar.d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(ikVar.d());
        } else if (!TextUtils.isEmpty(ikVar.c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(ikVar.c());
        } else if (TextUtils.isEmpty(ikVar.f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(ikVar.f());
        }
        miPushMessage.setCategory(ikVar.e());
        if (ikVar.a() != null) {
            miPushMessage.setContent(ikVar.a().c());
        }
        if (huVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(huVar.m6045a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(huVar.m6050b());
            }
            miPushMessage.setDescription(huVar.d());
            miPushMessage.setTitle(huVar.m6053c());
            miPushMessage.setNotifyType(huVar.a());
            miPushMessage.setNotifyId(huVar.c());
            miPushMessage.setPassThrough(huVar.b());
            miPushMessage.setExtra(huVar.m6046a());
        }
        miPushMessage.setNotified(z11);
        return miPushMessage;
    }

    public static int getPushMode(Context context) {
        if (pushMode == 0) {
            setPushMode(isUseCallbackPushMode(context) ? 1 : 2);
        }
        return pushMode;
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                return !queryBroadcastReceivers.isEmpty();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return isIntentAvailable(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 3);
        intent.putExtra(KEY_COMMAND, miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 4);
        new PushServiceReceiver().onReceive(context, intent);
    }

    private static void setPushMode(int i11) {
        pushMode = i11;
    }

    public static hu generateMessage(MiPushMessage miPushMessage) {
        hu huVar = new hu();
        huVar.a(miPushMessage.getMessageId());
        huVar.b(miPushMessage.getTopic());
        huVar.d(miPushMessage.getDescription());
        huVar.c(miPushMessage.getTitle());
        huVar.c(miPushMessage.getNotifyId());
        huVar.a(miPushMessage.getNotifyType());
        huVar.b(miPushMessage.getPassThrough());
        huVar.a(miPushMessage.getExtra());
        return huVar;
    }
}
