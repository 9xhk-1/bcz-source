package com.baicizhan.framework.push.mipush;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.List;
import oc.h;
import oc.i;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MiReceiver extends PushMessageReceiver {

    /* renamed from: k, reason: collision with root package name */
    public static final String f17811k = "xiaomi_push";

    /* renamed from: l, reason: collision with root package name */
    public static int f17812l;

    /* renamed from: a, reason: collision with root package name */
    public String f17813a;

    /* renamed from: b, reason: collision with root package name */
    public long f17814b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f17815c;

    /* renamed from: d, reason: collision with root package name */
    public String f17816d;

    /* renamed from: e, reason: collision with root package name */
    public String f17817e;

    /* renamed from: f, reason: collision with root package name */
    public String f17818f;

    /* renamed from: g, reason: collision with root package name */
    public String f17819g;

    /* renamed from: h, reason: collision with root package name */
    public String f17820h;

    /* renamed from: i, reason: collision with root package name */
    public String f17821i;

    /* renamed from: j, reason: collision with root package name */
    public String f17822j;

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage message) {
        c.i("xiaomi_push", message.toString(), new Object[0]);
        String command = message.getCommand();
        List<String> commandArguments = message.getCommandArguments();
        String str = null;
        String str2 = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if (commandArguments != null && commandArguments.size() > 1) {
            str = commandArguments.get(1);
        }
        if (MiPushClient.COMMAND_REGISTER.equals(command)) {
            if (message.getResultCode() == 0) {
                i.f().a(h.f76767b, str2);
                this.f17813a = str2;
                c.i("xiaomi_push", "RedId %s", str2);
                return;
            }
            return;
        }
        if (MiPushClient.COMMAND_SET_ALIAS.equals(command)) {
            if (message.getResultCode() == 0) {
                this.f17819g = str2;
                return;
            }
            return;
        }
        if (MiPushClient.COMMAND_UNSET_ALIAS.equals(command)) {
            if (message.getResultCode() == 0) {
                this.f17819g = str2;
                return;
            }
            return;
        }
        if (MiPushClient.COMMAND_SUBSCRIBE_TOPIC.equals(command)) {
            if (message.getResultCode() == 0) {
                this.f17818f = str2;
            }
        } else if (MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC.equals(command)) {
            if (message.getResultCode() == 0) {
                this.f17818f = str2;
            }
        } else if (MiPushClient.COMMAND_SET_ACCEPT_TIME.equals(command) && message.getResultCode() == 0) {
            this.f17821i = str2;
            this.f17822j = str;
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage message) {
        c.i("xiaomi_push", message.toString(), new Object[0]);
        this.f17817e = message.getContent();
        if (!TextUtils.isEmpty(message.getTopic())) {
            this.f17818f = message.getTopic();
        } else if (!TextUtils.isEmpty(message.getAlias())) {
            this.f17819g = message.getAlias();
        } else {
            if (TextUtils.isEmpty(message.getUserAccount())) {
                return;
            }
            this.f17820h = message.getUserAccount();
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, MiPushMessage message) {
        c.i("xiaomi_push", message.toString(), new Object[0]);
        this.f17817e = message.getContent();
        if (!TextUtils.isEmpty(message.getTopic())) {
            this.f17818f = message.getTopic();
        } else if (!TextUtils.isEmpty(message.getAlias())) {
            this.f17819g = message.getAlias();
        } else {
            if (TextUtils.isEmpty(message.getUserAccount())) {
                return;
            }
            this.f17820h = message.getUserAccount();
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage message) {
        c.i("xiaomi_push", message.toString(), new Object[0]);
        this.f17817e = message.getContent();
        if (!TextUtils.isEmpty(message.getTopic())) {
            this.f17818f = message.getTopic();
        } else if (!TextUtils.isEmpty(message.getAlias())) {
            this.f17819g = message.getAlias();
        } else if (!TextUtils.isEmpty(message.getUserAccount())) {
            this.f17820h = message.getUserAccount();
        }
        sc.c.c().d(message.getContent(), "xiaomi");
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage message) {
        c.i("xiaomi_push", message.toString(), new Object[0]);
        String command = message.getCommand();
        List<String> commandArguments = message.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if (commandArguments != null && commandArguments.size() > 1) {
            commandArguments.get(1);
        }
        if (MiPushClient.COMMAND_REGISTER.equals(command) && message.getResultCode() == 0) {
            this.f17813a = str;
        }
    }
}
