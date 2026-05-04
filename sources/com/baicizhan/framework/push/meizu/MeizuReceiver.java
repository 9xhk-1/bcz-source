package com.baicizhan.framework.push.meizu;

import android.content.Context;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import com.meizu.cloud.pushsdk.PushManager;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import oc.i;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MeizuReceiver extends MzPushMessageReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final String f17804b = "meizu_push";

    /* renamed from: c, reason: collision with root package name */
    public static String f17805c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f17806d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f17807e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f17808f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static String f17809g = "";

    /* renamed from: a, reason: collision with root package name */
    public boolean f17810a = false;

    public static String a() {
        return f17805c;
    }

    public static String b() {
        return f17806d;
    }

    public static void d(String appId) {
        f17805c = appId;
    }

    public static void e(String appKey) {
        f17806d = appKey;
    }

    public static void f(int id2) {
        f17808f = id2;
    }

    public static void g(int uid) {
        f17807e = uid;
    }

    public static void h(Context context) {
        c.i("meizu_push", "unSubScribeAlias [%s, %s]", f17809g, String.valueOf(f17807e));
        PushManager.unSubScribeAlias(context, f17805c, f17806d, f17809g, String.valueOf(f17807e));
    }

    public final void c(String tag, MzPushMessage mzPushMessage) {
        if (mzPushMessage == null) {
            c.i("meizu_push", tag + "msg null", new Object[0]);
            return;
        }
        c.i("meizu_push", tag + "msg %s", mzPushMessage.toString());
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onMessage(Context context, String s11) {
        sc.c.c().d(s11, "meizu");
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onNotificationArrived(Context context, MzPushMessage mzPushMessage) {
        c("onNotificationArrived", mzPushMessage);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onNotificationClicked(Context context, MzPushMessage mzPushMessage) {
        c("onNotificationClicked", mzPushMessage);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onNotificationDeleted(Context context, MzPushMessage mzPushMessage) {
        c("onNotificationDeleted", mzPushMessage);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onPushStatus(Context context, PushSwitchStatus pushSwitchStatus) {
        if (!pushSwitchStatus.isSwitchNotificationMessage() && this.f17810a) {
            c.i("meizu_push", "switchPush ON", new Object[0]);
            this.f17810a = false;
            PushManager.switchPush(context, f17805c, f17806d, f17809g, true);
        }
        c.i("meizu_push", "%s", pushSwitchStatus.toString());
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    @Deprecated
    public void onRegister(Context context, String pushid) {
        c.i("meizu_push", "onRegister %s uid %s", pushid, String.valueOf(f17807e));
        f17809g = pushid;
        PushManager.subScribeAlias(context, f17805c, f17806d, pushid, String.valueOf(f17807e));
        i.f().a("meizu", pushid);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onRegisterStatus(Context context, RegisterStatus registerStatus) {
        c.i("meizu_push", "onRegisterStatus " + registerStatus, new Object[0]);
        if (BasicPushStatus.SUCCESS_CODE.equals(registerStatus.code)) {
            this.f17810a = true;
            String pushId = registerStatus.getPushId();
            f17809g = pushId;
            PushManager.checkPush(context, f17805c, f17806d, pushId);
            PushManager.subScribeAlias(context, f17805c, f17806d, f17809g, String.valueOf(f17807e));
            i.f().a("meizu", f17809g);
        }
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubAliasStatus(Context context, SubAliasStatus subAliasStatus) {
        c.i("meizu_push", "onSubAliasStatus " + subAliasStatus, new Object[0]);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onSubTagsStatus(Context context, SubTagsStatus subTagsStatus) {
        c.i("meizu_push", "onSubTagsStatus " + subTagsStatus, new Object[0]);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    @Deprecated
    public void onUnRegister(Context context, boolean b11) {
        c.i("meizu_push", "onUnRegister %b", Boolean.valueOf(b11));
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUnRegisterStatus(Context context, UnRegisterStatus unRegisterStatus) {
        c.i("meizu_push", "onUnRegisterStatus " + unRegisterStatus, new Object[0]);
    }

    @Override // com.meizu.cloud.pushsdk.MzPushMessageReceiver
    public void onUpdateNotificationBuilder(PushNotificationBuilder pushNotificationBuilder) {
        c.i("meizu_push", "onUpdateNotificationBuilder res %d", Integer.valueOf(f17808f));
        int i11 = f17808f;
        if (i11 != 0) {
            pushNotificationBuilder.setStatusBarIcon(i11);
        }
    }
}
