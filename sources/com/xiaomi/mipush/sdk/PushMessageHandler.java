package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.en;
import com.xiaomi.push.ex;
import com.xiaomi.push.hl;
import com.xiaomi.push.ir;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class PushMessageHandler extends BaseService {

    /* renamed from: a, reason: collision with root package name */
    private static List<MiPushClient.ICallbackResult> f45170a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static List<MiPushClient.MiPushClientCallback> f45171b = new ArrayList();

    /* renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f76a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public interface a extends Serializable {
    }

    public static void a() {
        synchronized (f45171b) {
            f45171b.clear();
        }
    }

    public static void b() {
        synchronized (f45170a) {
            f45170a.clear();
        }
    }

    private static void c(Context context, Intent intent) {
        if (intent == null || f76a.isShutdown()) {
            return;
        }
        f76a.execute(new al(context, intent));
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i11) {
        super.onStart(intent, i11);
        c(getApplicationContext(), intent);
    }

    public static void a(long j11, String str, String str2) {
        synchronized (f45171b) {
            try {
                Iterator<MiPushClient.MiPushClientCallback> it = f45171b.iterator();
                while (it.hasNext()) {
                    it.next().onInitializeResult(j11, str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, d.a(context));
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("callback sync error" + e11);
        }
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a(e11.getMessage());
        }
    }

    public static void b(Context context, Intent intent) {
        ResolveInfo resolveInfo;
        boolean z11 = false;
        try {
            z11 = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("intent unparcel error:" + th2);
        }
        try {
            resolveInfo = null;
        } catch (Throwable th3) {
            try {
                com.xiaomi.channel.commonutils.logger.b.a(th3);
                en.a(context).a(context.getPackageName(), intent, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
                if (!z11) {
                    return;
                }
            } finally {
                if (z11) {
                    b(context);
                }
            }
        }
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            o.a(context, intent, null);
        } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
            hl hlVar = new hl();
            ir.a(hlVar, intent.getByteArrayExtra("mipush_payload"));
            com.xiaomi.channel.commonutils.logger.b.c("PushMessageHandler.onHandleIntent " + hlVar.d());
            MiTinyDataClient.upload(context, hlVar);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            if (m5658b()) {
                com.xiaomi.channel.commonutils.logger.b.d("receive a message before application calling initialize");
                if (!z11) {
                    return;
                }
            } else {
                a a11 = am.a(context).a(intent);
                if (a11 != null) {
                    a(context, a11);
                }
            }
        } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
            Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent2.setPackage(context.getPackageName());
            intent2.putExtras(intent);
            try {
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                if (queryBroadcastReceivers != null) {
                    Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it.next();
                        ActivityInfo activityInfo = next.activityInfo;
                        if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(com.xiaomi.push.s.a(context, next.activityInfo.name))) {
                            resolveInfo = next;
                            break;
                        }
                    }
                }
                if (resolveInfo != null) {
                    a(context, intent2, resolveInfo, z11);
                } else {
                    com.xiaomi.channel.commonutils.logger.b.d("cannot find the receiver to handler this message, check your manifest");
                    en.a(context).a(context.getPackageName(), intent, com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
                }
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
                en.a(context).a(context.getPackageName(), intent, com.tencent.connect.common.Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
            }
        }
        if (!z11) {
        }
    }

    public static void a(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.b.c("addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            a(context);
        }
    }

    public static void b(Context context, String str, long j11, String str2, String str3) {
        synchronized (f45171b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : f45171b) {
                    if (a(str, miPushClientCallback.getCategory())) {
                        miPushClientCallback.onUnsubscribeResult(j11, str2, str3);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z11) {
        try {
            MessageHandleService.a aVar = new MessageHandleService.a(intent, (PushMessageReceiver) com.xiaomi.push.s.a(context, resolveInfo.activityInfo.name).newInstance());
            if (z11) {
                MessageHandleService.a(context.getApplicationContext(), aVar);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), aVar);
            }
            MessageHandleService.a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a(th2);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m5658b() {
        return f45171b.isEmpty();
    }

    public static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f45170a) {
            try {
                for (MiPushClient.ICallbackResult iCallbackResult : f45170a) {
                    if (iCallbackResult instanceof MiPushClient.UPSRegisterCallBack) {
                        MiPushClient.TokenResult tokenResult = new MiPushClient.TokenResult();
                        if (miPushCommandMessage != null && miPushCommandMessage.getCommandArguments() != null && miPushCommandMessage.getCommandArguments().size() > 0) {
                            tokenResult.setResultCode(miPushCommandMessage.getResultCode());
                            tokenResult.setToken(miPushCommandMessage.getCommandArguments().get(0));
                        }
                        iCallbackResult.onResult(tokenResult);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
        synchronized (f45171b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : f45171b) {
                    if (a(miPushMessage.getCategory(), miPushClientCallback.getCategory())) {
                        miPushClientCallback.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                        miPushClientCallback.onReceiveMessage(miPushMessage);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(Context context, a aVar) {
        if (aVar instanceof MiPushMessage) {
            a(context, (MiPushMessage) aVar);
            return;
        }
        if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (ex.COMMAND_REGISTER.f366a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (ex.COMMAND_SET_ALIAS.f366a.equals(command) || ex.COMMAND_UNSET_ALIAS.f366a.equals(command) || ex.COMMAND_SET_ACCEPT_TIME.f366a.equals(command)) {
                a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
                return;
            }
            if (ex.COMMAND_SUBSCRIBE_TOPIC.f366a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (ex.COMMAND_UNSUBSCRIBE_TOPIC.f366a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    public static void a(Context context, String str, long j11, String str2, String str3) {
        synchronized (f45171b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : f45171b) {
                    if (a(str, miPushClientCallback.getCategory())) {
                        miPushClientCallback.onSubscribeResult(j11, str2, str3);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(Context context, String str, String str2, long j11, String str3, List<String> list) {
        String str4;
        long j12;
        String str5;
        List<String> list2;
        synchronized (f45171b) {
            try {
                for (MiPushClient.MiPushClientCallback miPushClientCallback : f45171b) {
                    if (a(str, miPushClientCallback.getCategory())) {
                        str4 = str2;
                        j12 = j11;
                        str5 = str3;
                        list2 = list;
                        miPushClientCallback.onCommandResult(str4, j12, str5, list2);
                    } else {
                        str4 = str2;
                        j12 = j11;
                        str5 = str3;
                        list2 = list;
                    }
                    str2 = str4;
                    j11 = j12;
                    str3 = str5;
                    list = list2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(MiPushClient.ICallbackResult iCallbackResult) {
        synchronized (f45170a) {
            try {
                if (!f45170a.contains(iCallbackResult)) {
                    f45170a.add(iCallbackResult);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (f45171b) {
            try {
                if (!f45171b.contains(miPushClientCallback)) {
                    f45171b.add(miPushClientCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo5659a() {
        ThreadPoolExecutor threadPoolExecutor = f76a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f76a.getQueue().size() <= 0) ? false : true;
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }
}
