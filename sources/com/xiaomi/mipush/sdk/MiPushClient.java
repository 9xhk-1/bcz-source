package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.igexin.sdk.PushConsts;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.az;
import com.xiaomi.push.bo;
import com.xiaomi.push.dc;
import com.xiaomi.push.dm;
import com.xiaomi.push.dn;
import com.xiaomi.push.ek;
import com.xiaomi.push.el;
import com.xiaomi.push.em;
import com.xiaomi.push.ex;
import com.xiaomi.push.hh;
import com.xiaomi.push.hl;
import com.xiaomi.push.hm;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.hv;
import com.xiaomi.push.ib;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.il;
import com.xiaomi.push.in;
import com.xiaomi.push.ip;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bd;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.junit.jupiter.api.j2;

/* loaded from: classes6.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    public static class CodeResult {
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        public void setResultCode(long j11) {
            this.resultCode = j11;
        }
    }

    public interface ICallbackResult<R> {
        void onResult(R r11);
    }

    @Deprecated
    public static abstract class MiPushClientCallback {
        private String category;

        public String getCategory() {
            return this.category;
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void setCategory(String str) {
            this.category = str;
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z11) {
        }

        public void onCommandResult(String str, long j11, String str2, List<String> list) {
        }

        public void onInitializeResult(long j11, String str, String str2) {
        }

        public void onSubscribeResult(long j11, String str, String str2) {
        }

        public void onUnsubscribeResult(long j11, String str, String str2) {
        }
    }

    public static class TokenResult {
        private String token = null;
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        public String getToken() {
            return this.token;
        }

        public void setResultCode(long j11) {
            this.resultCode = j11;
        }

        public void setToken(String str) {
            this.token = str;
        }
    }

    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        return TextUtils.equals(getAcceptTime(context), str + "," + str2);
    }

    public static long accountSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("account_" + str, -1L);
    }

    public static synchronized void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + "," + str2);
            com.xiaomi.push.q.a(edit);
        }
    }

    public static synchronized void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static synchronized void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_pull_notification", System.currentTimeMillis());
        com.xiaomi.push.q.a(edit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_reg_request", System.currentTimeMillis());
        com.xiaomi.push.q.a(edit);
    }

    public static synchronized void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static long aliasSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("alias_" + str, -1L);
    }

    public static void awakeApps(final Context context, final String[] strArr) {
        com.xiaomi.push.aj.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.4
            @Override // java.lang.Runnable
            public void run() {
                PackageInfo packageInfo;
                try {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 4)) != null) {
                            MiPushClient.awakePushServiceByPackageInfo(context, packageInfo);
                        }
                    }
                } catch (Throwable th2) {
                    com.xiaomi.channel.commonutils.logger.b.a(th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("param " + str + " is not nullable");
    }

    public static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it = getAllAlias(context).iterator();
        while (it.hasNext()) {
            edit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = getAllUserAccount(context).iterator();
        while (it2.hasNext()) {
            edit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = getAllTopic(context).iterator();
        while (it3.hasNext()) {
            edit.remove("topic_" + it3.next());
        }
        edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        ao.a(context).f();
    }

    public static void clearNotification(Context context) {
        ao.a(context).a(-1);
    }

    public static void disablePush(Context context) {
        ao.a(context).a(true);
    }

    public static void enablePush(Context context) {
        ao.a(context).a(false);
    }

    public static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (b.m5683a(context).m5692c()) {
            return b.m5683a(context).f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return com.xiaomi.push.j.m6175b();
    }

    public static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, c90.k.f8409a);
        return f.a(context).b(e.ASSEMBLE_PUSH_FCM);
    }

    public static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, c90.k.f8409a);
        return f.a(context).b(e.ASSEMBLE_PUSH_HUAWEI);
    }

    public static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, c90.k.f8409a);
        return f.a(context).b(e.ASSEMBLE_PUSH_COS);
    }

    public static boolean getOpenVIVOPush(Context context) {
        return f.a(context).b(e.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (b.m5683a(context).m5692c()) {
            return b.m5683a(context).m5691c();
        }
        return null;
    }

    private static void initEventPerfLogic(final Context context) {
        em.a(new em.a() { // from class: com.xiaomi.mipush.sdk.MiPushClient.5
            @Override // com.xiaomi.push.em.a
            public void uploader(Context context2, hl hlVar) {
                MiTinyDataClient.upload(context2, hlVar);
            }
        });
        Config a11 = em.a(context);
        com.xiaomi.clientreport.manager.a.a(context).a(BuildConfig.VERSION_NAME);
        ClientReportClient.init(context, a11, new ek(context), new el(context));
        a.a(context);
        t.a(context, a11);
        ba.a(context).a(new ba.a(100, "perf event job update") { // from class: com.xiaomi.mipush.sdk.MiPushClient.6
            @Override // com.xiaomi.push.service.ba.a
            public void onCallback() {
                em.m5914a(context);
            }
        });
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, null, null);
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(af.a(sContext).a(au.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(af.a(sContext).a(au.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        af a11 = af.a(sContext);
        au auVar = au.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(a11.a(auVar))) {
            ao.a(sContext).a((String) null, auVar, e.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(af.a(sContext).a(au.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        af a12 = af.a(sContext);
        au auVar2 = au.UPLOAD_COS_TOKEN;
        if ("syncing".equals(a12.a(auVar2))) {
            ao.a(sContext).a((String) null, auVar2, e.ASSEMBLE_PUSH_COS, "init");
        }
        af a13 = af.a(sContext);
        au auVar3 = au.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(a13.a(auVar3))) {
            ao.a(context).a((String) null, auVar3, e.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    public static void reInitialize(Context context, hv hvVar) {
        com.xiaomi.channel.commonutils.logger.b.e("re-register reason: " + hvVar);
        String a11 = bo.a(6);
        String m5684a = b.m5683a(context).m5684a();
        String b11 = b.m5683a(context).b();
        b.m5683a(context).m5685a();
        clearExtrasForInitialize(context);
        clearNotification(context);
        b.m5683a(context).a(Constants.a());
        b.m5683a(context).a(m5684a, b11, a11);
        ih ihVar = new ih();
        ihVar.a(bd.b());
        ihVar.b(m5684a);
        ihVar.e(b11);
        ihVar.f(a11);
        ihVar.d(context.getPackageName());
        ihVar.c(com.xiaomi.push.g.m5976a(context, context.getPackageName()));
        ihVar.b(com.xiaomi.push.g.a(context, context.getPackageName()));
        ihVar.h(BuildConfig.VERSION_NAME);
        ihVar.a(BuildConfig.VERSION_CODE);
        ihVar.a(hvVar);
        int a12 = com.xiaomi.push.i.a();
        if (a12 >= 0) {
            ihVar.c(a12);
        }
        ao.a(context).a(ihVar, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
            intentFilter.addCategory("android.intent.category.DEFAULT");
            com.xiaomi.push.l.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter);
            com.xiaomi.push.l.a(context, (Class<?>) NetworkStatusReceiver.class);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("dynamic register network status receiver failed:" + th2);
        }
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        registerPush(context, str, str2, new PushConfiguration(), null, uPSRegisterCallBack);
    }

    public static synchronized void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
            com.xiaomi.push.q.a(edit);
        }
    }

    public static synchronized void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().remove("account_" + str).commit();
        }
    }

    public static synchronized void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().remove("alias_" + str).commit();
        }
    }

    public static synchronized void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            Iterator<String> it = getAllUserAccount(context).iterator();
            while (it.hasNext()) {
                removeAccount(context, it.next());
            }
        }
    }

    public static synchronized void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            Iterator<String> it = getAllAlias(context).iterator();
            while (it.hasNext()) {
                removeAlias(context, it.next());
            }
        }
    }

    public static synchronized void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            Iterator<String> it = getAllTopic(context).iterator();
            while (it.hasNext()) {
                removeTopic(context, it.next());
            }
        }
    }

    public static synchronized void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().remove("topic_" + str).commit();
        }
    }

    public static void removeWindow(Context context) {
        ao.a(context).m5682e();
    }

    public static void reportAppRunInBackground(Context context, boolean z11) {
        if (b.m5683a(context).m5690b()) {
            hr hrVar = z11 ? hr.APP_SLEEP : hr.APP_WAKEUP;
            ig igVar = new ig();
            igVar.b(b.m5683a(context).m5684a());
            igVar.c(hrVar.f538a);
            igVar.d(context.getPackageName());
            igVar.a(bd.a());
            igVar.a(false);
            ao.a(context).a((ao) igVar, hh.Notification, false, (hu) null, false);
        }
    }

    public static void reportIgnoreRegMessageClicked(Context context, String str, hu huVar, String str2, String str3) {
        ig igVar = new ig();
        if (TextUtils.isEmpty(str3)) {
            com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
            return;
        }
        igVar.b(str3);
        igVar.c("bar:click");
        igVar.a(str);
        igVar.a(false);
        ao.a(context).a(igVar, hh.Notification, false, true, huVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        hu huVar = new hu();
        huVar.a(miPushMessage.getMessageId());
        huVar.b(miPushMessage.getTopic());
        huVar.d(miPushMessage.getDescription());
        huVar.c(miPushMessage.getTitle());
        huVar.c(miPushMessage.getNotifyId());
        huVar.a(miPushMessage.getNotifyType());
        huVar.b(miPushMessage.getPassThrough());
        huVar.a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), huVar, null);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (ba.a(sContext).a(hm.DataCollectionSwitch.a(), getDefaultSwitch())) {
            dm.a().a(new r(context));
            com.xiaomi.push.aj.a(sContext).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.2
                @Override // java.lang.Runnable
                public void run() {
                    dn.a(MiPushClient.sContext);
                }
            }, 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        com.xiaomi.push.aj.a(sContext).a(new ae(sContext), ba.a(sContext).a(hm.OcVersionCheckFrequency.a(), 86400), 5);
    }

    public static void setAcceptTime(Context context, int i11, int i12, int i13, int i14, String str) {
        if (i11 < 0 || i11 >= 24 || i13 < 0 || i13 >= 24 || i12 < 0 || i12 >= 60 || i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j11 = ((((i11 * 60) + i12) + rawOffset) + 1440) % 1440;
        long j12 = ((((i13 * 60) + i14) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i11), Integer.valueOf(i12)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i13), Integer.valueOf(i14)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, ex.COMMAND_SET_ACCEPT_TIME.f366a, (ArrayList<String>) arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str, ex.COMMAND_SET_ACCEPT_TIME.f366a, 0L, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(ex.COMMAND_SET_ACCEPT_TIME.f366a, arrayList2, 0L, null, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, ex.COMMAND_SET_ALIAS.f366a, str, str2);
    }

    public static void setCommand(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        ex exVar = ex.COMMAND_SET_ALIAS;
        if (exVar.f366a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) < 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(exVar.f366a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (ex.COMMAND_UNSET_ALIAS.f366a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Don't cancel alias for " + bo.a(arrayList.toString(), 3) + " is unseted");
            return;
        }
        ex exVar2 = ex.COMMAND_SET_ACCOUNT;
        if (exVar2.f366a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) < 3600000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(exVar2.f366a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (!ex.COMMAND_UNSET_ACCOUNT.f366a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
            setCommand(context, str, (ArrayList<String>) arrayList, str3);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("Don't cancel account for " + bo.a(arrayList.toString(), 3) + " is unseted");
    }

    public static void setLocalNotificationType(Context context, int i11) {
        ao.a(context).b(i11);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, ex.COMMAND_SET_ACCOUNT.f366a, str, str2);
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1L)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return ao.a(context).m5676a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (TextUtils.isEmpty(b.m5683a(context).m5684a()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(ex.COMMAND_SUBSCRIBE_TOPIC.f366a, arrayList, 0L, null, null, null));
            return;
        }
        il ilVar = new il();
        String a11 = bd.a();
        ilVar.a(a11);
        ilVar.b(b.m5683a(context).m5684a());
        ilVar.c(str);
        ilVar.d(context.getPackageName());
        ilVar.e(str2);
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + ex.COMMAND_SUBSCRIBE_TOPIC + j2.O + a11);
        ao.a(context).a((ao) ilVar, hh.Subscription, (hu) null);
    }

    public static void syncAssembleFCMPushToken(Context context) {
        ao.a(context).a((String) null, au.UPLOAD_FCM_TOKEN, e.ASSEMBLE_PUSH_FCM, "");
    }

    public static long topicSubscribedTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("topic_" + str, -1L);
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        disablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        enablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        unregisterPush(context);
        if (uPSUnRegisterCallBack != null) {
            TokenResult tokenResult = new TokenResult();
            tokenResult.setToken(null);
            tokenResult.getToken();
            tokenResult.setResultCode(0L);
            tokenResult.getResultCode();
            uPSUnRegisterCallBack.onResult(tokenResult);
        }
    }

    public static void unregisterPush(Context context) {
        i.c(context);
        ba.a(context).a();
        if (b.m5683a(context).m5690b()) {
            in inVar = new in();
            inVar.a(bd.a());
            inVar.b(b.m5683a(context).m5684a());
            inVar.c(b.m5683a(context).m5691c());
            inVar.e(b.m5683a(context).b());
            inVar.d(context.getPackageName());
            ao.a(context).a(inVar);
            PushMessageHandler.a();
            PushMessageHandler.b();
            b.m5683a(context).m5689b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, ex.COMMAND_UNSET_ALIAS.f366a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, ex.COMMAND_UNSET_ACCOUNT.f366a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (b.m5683a(context).m5690b()) {
            if (topicSubscribedTime(context, str) < 0) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("Don't cancel subscribe for " + str + " is unsubscribed");
                return;
            }
            ip ipVar = new ip();
            String a11 = bd.a();
            ipVar.a(a11);
            ipVar.b(b.m5683a(context).m5684a());
            ipVar.c(str);
            ipVar.d(context.getPackageName());
            ipVar.e(str2);
            com.xiaomi.channel.commonutils.logger.b.e("cmd:" + ex.COMMAND_UNSUBSCRIBE_TOPIC + j2.O + a11);
            ao.a(context).a((ao) ipVar, hh.UnSubscription, (hu) null);
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.xiaomi.push.j.m6177d()) {
                    return;
                }
                if (com.xiaomi.push.i.c(MiPushClient.sContext) != null || az.a(MiPushClient.sContext).mo5725a()) {
                    ig igVar = new ig();
                    igVar.b(b.m5683a(MiPushClient.sContext).m5684a());
                    igVar.c(hr.ClientInfoUpdate.f538a);
                    igVar.a(bd.a());
                    igVar.a(new HashMap());
                    String c11 = com.xiaomi.push.i.c(MiPushClient.sContext);
                    String str = "";
                    if (!TextUtils.isEmpty(c11)) {
                        str = "" + bo.a(c11);
                    }
                    String e11 = com.xiaomi.push.i.e(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(e11)) {
                        str = str + "," + e11;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        igVar.m6101a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
                    }
                    az.a(MiPushClient.sContext).a(igVar.m6101a());
                    int a11 = com.xiaomi.push.i.a();
                    if (a11 >= 0) {
                        igVar.m6101a().put("space_id", Integer.toString(a11));
                    }
                    ao.a(MiPushClient.sContext).a((ao) igVar, hh.Notification, false, (hu) null);
                }
            }
        }).start();
    }

    public static void clearNotification(Context context, int i11) {
        ao.a(context).a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult) {
        try {
            com.xiaomi.channel.commonutils.logger.b.a(context.getApplicationContext());
            com.xiaomi.channel.commonutils.logger.b.e("sdk_version = 5_0_8-C");
            az.a(context).a();
            dc.a(context);
            if (miPushClientCallback != null) {
                PushMessageHandler.a(miPushClientCallback);
            }
            if (iCallbackResult != null) {
                PushMessageHandler.a(iCallbackResult);
            }
            if (com.xiaomi.push.s.m6186a(sContext)) {
                v.a(sContext);
            }
            boolean z11 = b.m5683a(sContext).a() != Constants.a();
            if (!z11 && !shouldSendRegRequest(sContext)) {
                ao.a(sContext).m5673a();
                com.xiaomi.channel.commonutils.logger.b.m5639a("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z11 || !b.m5683a(sContext).a(str, str2) || b.m5683a(sContext).m5695f()) {
                String a11 = bo.a(6);
                b.m5683a(sContext).m5685a();
                b.m5683a(sContext).a(Constants.a());
                b.m5683a(sContext).a(str, str2, a11);
                MiTinyDataClient.a.a().b(MiTinyDataClient.PENDING_REASON_APPID);
                clearExtras(sContext);
                clearNotification(context);
                ih ihVar = new ih();
                ihVar.a(bd.b());
                ihVar.b(str);
                ihVar.e(str2);
                ihVar.d(sContext.getPackageName());
                ihVar.f(a11);
                Context context2 = sContext;
                ihVar.c(com.xiaomi.push.g.m5976a(context2, context2.getPackageName()));
                Context context3 = sContext;
                ihVar.b(com.xiaomi.push.g.a(context3, context3.getPackageName()));
                ihVar.h(BuildConfig.VERSION_NAME);
                ihVar.a(BuildConfig.VERSION_CODE);
                ihVar.a(hv.Init);
                if (!TextUtils.isEmpty(str3)) {
                    ihVar.g(str3);
                }
                if (!com.xiaomi.push.j.m6177d()) {
                    String d11 = com.xiaomi.push.i.d(sContext);
                    if (!TextUtils.isEmpty(d11)) {
                        ihVar.i(bo.a(d11) + "," + com.xiaomi.push.i.f(sContext));
                    }
                }
                int a12 = com.xiaomi.push.i.a();
                if (a12 >= 0) {
                    ihVar.c(a12);
                }
                ao.a(sContext).a(ihVar, z11);
                sContext.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == PushMessageHelper.getPushMode(sContext)) {
                    checkNotNull(miPushClientCallback, "callback");
                    miPushClientCallback.onInitializeResult(0L, null, b.m5683a(sContext).m5691c());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b.m5683a(sContext).m5691c());
                    PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(ex.COMMAND_REGISTER.f366a, arrayList, 0L, null, null, null));
                }
                ao.a(sContext).m5673a();
                if (b.m5683a(sContext).m5687a()) {
                    ig igVar = new ig();
                    igVar.b(b.m5683a(sContext).m5684a());
                    igVar.c(hr.ClientInfoUpdate.f538a);
                    igVar.a(bd.a());
                    HashMap hashMap = new HashMap();
                    igVar.f680a = hashMap;
                    Context context4 = sContext;
                    hashMap.put("app_version", com.xiaomi.push.g.m5976a(context4, context4.getPackageName()));
                    Map<String, String> map = igVar.f680a;
                    Context context5 = sContext;
                    map.put(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(com.xiaomi.push.g.a(context5, context5.getPackageName())));
                    igVar.f680a.put("push_sdk_vn", BuildConfig.VERSION_NAME);
                    igVar.f680a.put("push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
                    String e11 = b.m5683a(sContext).e();
                    if (!TextUtils.isEmpty(e11)) {
                        igVar.f680a.put("deviceid", e11);
                    }
                    ao.a(sContext).a((ao) igVar, hh.Notification, false, (hu) null);
                    ao.a(sContext).m5674a(sContext);
                }
                if (!com.xiaomi.push.k.m6181a(sContext, "update_devId", false)) {
                    updateImeiOrOaid();
                    com.xiaomi.push.k.a(sContext, "update_devId", true);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    ig igVar2 = new ig();
                    igVar2.b(b.m5683a(sContext).m5684a());
                    igVar2.c(hr.PullOfflineMessage.f538a);
                    igVar2.a(bd.a());
                    igVar2.a(false);
                    ao.a(sContext).a((ao) igVar2, hh.Notification, false, (hu) null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleDataCollectionJobs(sContext);
            initEventPerfLogic(sContext);
            av.a(sContext);
            if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                if (Logger.getUserLogger() != null) {
                    Logger.setLogger(sContext, Logger.getUserLogger());
                }
                com.xiaomi.channel.commonutils.logger.b.a(2);
            }
            operateSyncAction(context);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a(th2);
        }
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, null, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    public static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(b.m5683a(context).m5684a())) {
            return;
        }
        ib ibVar = new ib();
        String a11 = bd.a();
        ibVar.a(a11);
        ibVar.b(b.m5683a(context).m5684a());
        ibVar.c(str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            ibVar.m6076a(it.next());
        }
        ibVar.e(str2);
        ibVar.d(context.getPackageName());
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + str + j2.O + a11);
        ao.a(context).a((ao) ibVar, hh.Command, (hu) null);
    }

    public static void clearNotification(Context context, String str, String str2) {
        ao.a(context).a(str, str2);
    }

    private static void registerPush(Context context, final String str, final String str2, PushConfiguration pushConfiguration, final String str3, final ICallbackResult iCallbackResult) {
        checkNotNull(context, c90.k.f8409a);
        checkNotNull(str, IntentConstant.APP_ID);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        com.xiaomi.push.s.a(context2);
        if (!NetworkStatusReceiver.a()) {
            registerNetworkReceiver(sContext);
        }
        f.a(sContext).a(pushConfiguration);
        com.xiaomi.push.aj.a(context2).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.1
            @Override // java.lang.Runnable
            public void run() {
                MiPushClient.initialize(MiPushClient.sContext, str, str2, null, str3, iCallbackResult);
            }
        });
    }

    public static void reportMessageClicked(Context context, String str, hu huVar, String str2) {
        ig igVar = new ig();
        if (TextUtils.isEmpty(str2)) {
            if (!b.m5683a(context).m5690b()) {
                com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
                return;
            }
            str2 = b.m5683a(context).m5684a();
        }
        igVar.b(str2);
        igVar.c("bar:click");
        igVar.a(str);
        igVar.a(false);
        ao.a(context).a((ao) igVar, hh.Notification, false, huVar);
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3, null);
    }

    @Deprecated
    public static void syncAssembleCOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssembleFTOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssemblePushToken(Context context) {
    }
}
