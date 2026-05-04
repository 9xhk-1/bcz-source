package com.igexin.sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.dim.Caller;
import com.getui.gtc.dim.DimManager;
import com.huawei.hms.aggrpay.entity.ResultStatus;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.c.a.c.a.c;
import com.igexin.push.core.ServiceManager;
import com.igexin.push.core.b;
import com.igexin.push.core.h;
import com.igexin.push.g.d;
import com.igexin.push.g.e;
import com.igexin.push.g.f;
import com.igexin.push.g.n;
import com.igexin.push.g.o;
import com.igexin.sdk.message.BindAliasCmdMessage;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.SetTagCmdMessage;
import com.igexin.sdk.message.UnBindAliasCmdMessage;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.regex.Pattern;
import javax.crypto.KeyGenerator;
import k3.u0;

/* loaded from: classes7.dex */
public class PushManager {
    private static final String TAG = "PushManager";
    private volatile h callback;
    private byte[] keyBytes;
    private long lastOpAliasTime;
    private long lastQueryTagTime;
    private long lastSendMessageTime;
    private long lastSetTagTime;
    private String safeCode;
    private String uActivity;
    private String uIntentService;
    private Class uPushService;
    private String uRegisterService;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final PushManager f38762a = new PushManager();

        private a() {
        }
    }

    private PushManager() {
        this.lastQueryTagTime = 0L;
    }

    private static void checkContext(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("NULL context");
        }
    }

    private boolean checkGTCVersion() {
        if (!d.b("3.2.5.0")) {
            return true;
        }
        c.a().a("[PushManager] GTC Version Need >= 3.2.5.0");
        return false;
    }

    private int getAssistAction(int i11, String str) {
        return (TextUtils.isEmpty(str) || !str.contains("_")) ? i11 : (i11 == 60001 || i11 == 60002) ? str.startsWith(AssistPushConsts.HW_PREFIX) ? i11 + 18 : str.startsWith(AssistPushConsts.XM_PREFIX) ? i11 + 48 : str.startsWith(AssistPushConsts.OPPO_PREFIX) ? i11 + 28 : str.startsWith(AssistPushConsts.VIVO_PREFIX) ? i11 + 38 : str.startsWith(AssistPushConsts.MZ_PREFIX) ? i11 + 58 : str.startsWith(AssistPushConsts.ST_PREFIX) ? i11 + 78 : str.startsWith(AssistPushConsts.FCM_PREFIX) ? i11 + 98 : str.startsWith(AssistPushConsts.HONOR_PREFIX) ? i11 + 118 : i11 : i11;
    }

    public static PushManager getInstance() {
        return a.f38762a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Application getMainApplication(Context context) {
        if (context == null || !isMainProcess(context)) {
            return null;
        }
        return context instanceof Application ? (Application) context : (Application) context.getApplicationContext();
    }

    private Class getUserPushService(Context context) {
        checkContext(context);
        Class cls = this.uPushService;
        return cls != null ? cls : ServiceManager.getInstance().b(context);
    }

    private boolean isMainProcess(Context context) {
        try {
            GtcProvider.setContext(context);
            return CommonUtil.isMainProcess();
        } catch (Throwable unused) {
            return false;
        }
    }

    private void registerCallback(final Context context) {
        ServiceManager.f37612b = context.getApplicationContext();
        com.igexin.b.a.a().a("GTALCallback").execute(new Runnable() { // from class: com.igexin.sdk.PushManager.1
            @Override // java.lang.Runnable
            public final void run() {
                Application mainApplication;
                try {
                    if (PushManager.this.callback == null && (mainApplication = PushManager.this.getMainApplication(context)) != null && PushManager.this.callback == null) {
                        PushManager.this.callback = new h();
                        mainApplication.registerActivityLifecycleCallbacks(PushManager.this.callback);
                        com.igexin.c.a.c.a.a("PushManager｜ registerCallback ", new Object[0]);
                    }
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            }
        });
    }

    private <T extends Activity> void registerPushActivity(Context context, Class<T> cls) {
        String name;
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (cls != null) {
                try {
                    Class.forName(cls.getName());
                    name = cls.getName();
                } catch (Exception e11) {
                    c.a().a("[PushManager] can't load activity = " + e11.toString());
                    com.igexin.c.a.c.a.a("PushManager|registerPushActivity|" + e11.toString(), new Object[0]);
                    return;
                }
            } else {
                c.a().a("[PushManager] call -> registerPushActivity, parameter [activity] is null");
                name = "";
            }
            this.uActivity = name;
            if (this.uPushService != null) {
                Bundle bundle = new Bundle();
                bundle.putString("action", "registerPushActivity");
                bundle.putString(o.f38735d, this.uActivity);
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) this.uPushService);
                intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                intent.putExtra("bundle", bundle);
                intent.putExtra(o.f38735d, this.uActivity);
                startService(context, intent);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] registerPushActivity sdk error = " + th2.toString());
        }
    }

    private <T extends Service> void registerUserService(Context context, Class<T> cls) {
        String name;
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (cls != null) {
                try {
                    Class.forName(cls.getName());
                    name = cls.getName();
                } catch (Exception e11) {
                    c.a().a("[PushManager] can't load service = " + e11.toString());
                    com.igexin.c.a.c.a.a("PushManager|registerUserService|" + e11.toString(), new Object[0]);
                    return;
                }
            } else {
                c.a().a("[PushManager] call -> registerUserService, parameter [service] is null");
                name = "";
            }
            this.uRegisterService = name;
            if (this.uPushService != null) {
                Bundle bundle = new Bundle();
                bundle.putString("action", "registerUserService");
                bundle.putString("us", this.uRegisterService);
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) this.uPushService);
                intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                intent.putExtra("bundle", bundle);
                intent.putExtra("us", this.uRegisterService);
                startService(context, intent);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] registerUserService  error = " + th2.toString());
        }
    }

    private void sendBindAliasResult(Context context, String str, String str2) {
        sendResult(context, new BindAliasCmdMessage(str, str2, 10010));
    }

    private void sendResult(Context context, GTCmdMessage gTCmdMessage) {
        try {
            Class c11 = ServiceManager.getInstance().c(context);
            if (c11 == null || context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) c11);
            Bundle bundle = new Bundle();
            bundle.putInt("action", 10010);
            bundle.putSerializable(PushConsts.KEY_CMD_MSG, gTCmdMessage);
            intent.putExtras(bundle);
            context.startService(intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a("PushManager|" + th2.toString(), new Object[0]);
        }
    }

    private void sendSetTagResult(Context context, String str, String str2) {
        sendResult(context, new SetTagCmdMessage(str, str2, PushConsts.SET_TAG_RESULT));
    }

    private void sendUnBindAliasResult(Context context, String str, String str2) {
        sendResult(context, new UnBindAliasCmdMessage(str, str2, 10011));
    }

    private boolean startService(Context context, Intent intent) {
        try {
            if (TextUtils.isEmpty(this.safeCode)) {
                String obj = o.b(context, o.f38736e, "").toString();
                this.safeCode = obj;
                if (TextUtils.isEmpty(obj)) {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                    keyGenerator.init(128);
                    String a11 = e.a(keyGenerator.generateKey().getEncoded());
                    this.safeCode = a11;
                    o.a(context, o.f38736e, a11);
                }
            }
            intent.putExtra(o.f38736e, this.safeCode);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        if (checkGTCVersion()) {
            return ServiceManager.getInstance().b(context, intent);
        }
        return false;
    }

    private void unRegisterCallback(final Context context) {
        com.igexin.b.a.a().a("GTALCallback").execute(new Runnable() { // from class: com.igexin.sdk.PushManager.2
            @Override // java.lang.Runnable
            public final void run() {
                Application mainApplication;
                try {
                    if (PushManager.this.callback != null && (mainApplication = PushManager.this.getMainApplication(context)) != null) {
                        mainApplication.unregisterActivityLifecycleCallbacks(PushManager.this.callback);
                        PushManager.this.callback = null;
                        System.currentTimeMillis();
                        com.igexin.c.a.c.a.a("PushManager | unRegisterCallback time= " + System.currentTimeMillis(), new Object[0]);
                    }
                } catch (Throwable th2) {
                    com.igexin.c.a.c.a.a(th2);
                }
            }
        });
    }

    public boolean areNotificationsEnabled(Context context) {
        return com.igexin.push.g.c.b(context);
    }

    public boolean bindAlias(Context context, String str) {
        return bindAlias(context, str, "bindAlias_" + System.currentTimeMillis());
    }

    public void checkManifest(Context context) throws GetuiPushException {
        if (isMainProcess(context)) {
            com.igexin.push.g.c.c(context);
        }
    }

    public synchronized String getClientid(Context context) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (this.keyBytes == null) {
                try {
                    ApplicationInfo b11 = n.b(context);
                    if (b11 != null && b11.metaData != null) {
                        String a11 = d.a(b11);
                        if (TextUtils.isEmpty(a11)) {
                            a11 = b11.metaData.getString(b.f37730b);
                        }
                        if (TextUtils.isEmpty(a11)) {
                            a11 = b11.metaData.getString("GETUI_APPID");
                        }
                        if (a11 != null) {
                            a11 = a11.trim();
                        }
                        if (!TextUtils.isEmpty(a11)) {
                            String a12 = com.igexin.c.b.a.a(a11 + context.getPackageName());
                            if (a12 != null) {
                                this.keyBytes = a12.getBytes();
                            }
                        }
                    }
                } catch (Exception e11) {
                    com.igexin.c.a.c.a.a("PushManager|" + e11.toString(), new Object[0]);
                }
            }
            if (this.keyBytes != null) {
                ServiceManager.f37612b = context.getApplicationContext();
                if (TextUtils.isEmpty(com.igexin.push.core.d.d.a().a("c"))) {
                    return "";
                }
                byte[] decode = Base64.decode(com.igexin.push.core.d.d.a().a("c"), 0);
                if (decode != null && this.keyBytes.length == decode.length) {
                    int length = decode.length;
                    byte[] bArr = new byte[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        bArr[i11] = (byte) (this.keyBytes[i11] ^ decode[i11]);
                    }
                    if (Pattern.matches("[a-zA-Z0-9]+", new String(bArr))) {
                        return new String(bArr);
                    }
                }
            }
        } finally {
            return null;
        }
        return null;
    }

    public String getVersion(Context context) {
        return "3.3.7.0";
    }

    public void initialize(Context context) {
        Class cls;
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            ServiceManager.getInstance().f(context);
            if (TextUtils.isEmpty(this.uIntentService) && (cls = (Class) d.a(context, GTIntentService.class).second) != null) {
                this.uIntentService = cls.getName();
            }
            if (this.uPushService == null) {
                this.uPushService = (Class) d.a(context, PushService.class).second;
            }
            initialize(context, this.uPushService);
        } catch (Throwable th2) {
            c.a().a("[PushManager] initialize sdk error = " + th2.toString());
        }
    }

    public boolean isPushTurnedOn(Context context) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            ServiceManager.f37612b = context.getApplicationContext();
            return com.igexin.push.core.d.d.a().b("p");
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] turnOffPush  error = " + th2.toString());
            return false;
        }
    }

    public void openNotification(Context context) {
        String str;
        int i11;
        try {
            Intent intent = new Intent();
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                str = "android.provider.extra.CHANNEL_ID";
                i11 = context.getApplicationInfo().uid;
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("app_package", context.getPackageName());
                str = "app_uid";
                i11 = context.getApplicationInfo().uid;
            }
            intent.putExtra(str, i11);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public boolean preInit(Context context) {
        Class cls;
        try {
            Context applicationContext = context.getApplicationContext();
            if (TextUtils.isEmpty(this.uIntentService) && (cls = (Class) d.a(applicationContext, GTIntentService.class).second) != null) {
                this.uIntentService = cls.getName();
            }
            if (this.uPushService != null) {
                return true;
            }
            this.uPushService = (Class) d.a(applicationContext, PushService.class).second;
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return false;
        }
    }

    public boolean queryPushOnLine(Context context) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            Bundle bundle = new Bundle();
            bundle.putString("action", "queryPushOnLine");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] queryPushOnLine  error = " + th2.toString());
            return false;
        }
    }

    public int queryTag(Context context, String str) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (str == null) {
                c.a().a("[PushManager]call -> queryTag failed, parameter [sn] is null");
                return 20007;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastQueryTagTime < 1000) {
                c.a().a("[PushManager]call -> queryTag failed, it be called too frequently");
                return 20002;
            }
            Bundle bundle = new Bundle();
            bundle.putString("action", PushConsts.QUERY_TAG);
            bundle.putString("sn", str);
            this.lastQueryTagTime = currentTimeMillis;
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            startService(context, intent);
            return 0;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] queryTag  error = " + th2.toString());
            return 0;
        }
    }

    @Deprecated
    public <T extends GTIntentService> void registerPushIntentService(Context context, Class<T> cls) {
        String name;
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            com.igexin.c.a.c.a.a("PushManager|call registerPushIntentService", new Object[0]);
            if (cls != null) {
                try {
                    Class.forName(cls.getName());
                    if (!com.igexin.push.g.c.a(new Intent(context, (Class<?>) cls), context)) {
                        com.igexin.c.a.c.a.e.a("PushManager", "call - > registerPushIntentService, parameter [userIntentService] is set, but didn't find class \"" + cls.getName() + "\", please check your AndroidManifest");
                        return;
                    }
                    name = cls.getName();
                } catch (Exception e11) {
                    com.igexin.c.a.c.a.a("PushManager|registerPushIntentService|" + e11.toString(), new Object[0]);
                    return;
                }
            } else {
                name = "";
            }
            this.uIntentService = name;
            if (this.uPushService != null) {
                com.igexin.c.a.c.a.b("PushManager", "start service to save intent service");
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) this.uPushService);
                intent.putExtra(o.f38734c, this.uIntentService);
                startService(context, intent);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] registerPushIntentService  error = " + th2.toString());
        }
    }

    public boolean sendApplinkFeedback(Context context, String str) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (TextUtils.isEmpty(str)) {
                c.a().a("[PushManager] call - > sendApplinkFeedback failed, parameter is illegal");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("action", "sendApplinkFeedback");
            bundle.putString("url", str);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] sendApplinkFeedback  error = " + th2.toString());
            return false;
        }
    }

    public boolean sendFeedbackMessage(Context context, String str, String str2, int i11) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            boolean z11 = (i11 >= 60001 && i11 <= 60999) || (i11 >= 90001 && i11 <= 90999);
            if (str != null && str2 != null && z11) {
                int assistAction = getAssistAction(i11, str2);
                Bundle bundle = new Bundle();
                bundle.putString("action", "sendFeedbackMessage");
                bundle.putString("taskid", str);
                bundle.putString("messageid", str2);
                bundle.putString("actionid", String.valueOf(assistAction));
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
                intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                intent.putExtra("bundle", bundle);
                return startService(context, intent);
            }
            c.a().a("[PushManager] call - > sendFeedbackMessage failed, parameter is illegal");
            return false;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] sendFeedbackMessage  error = " + th2.toString());
            return false;
        }
    }

    public boolean sendMessage(Context context, String str, byte[] bArr) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (str != null && bArr != null && bArr.length <= 4096 && currentTimeMillis - this.lastSendMessageTime >= 1000) {
                this.lastSendMessageTime = currentTimeMillis;
                Bundle bundle = new Bundle();
                bundle.putString("action", "sendMessage");
                bundle.putString("taskid", str);
                bundle.putByteArray("extraData", bArr);
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
                intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                intent.putExtra("bundle", bundle);
                return startService(context, intent);
            }
            c.a().a("[PushManager] call - > sendMessage failed, parameter is illegal or it be called too frequently");
            return false;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] sendMessage  error = " + th2.toString());
            return false;
        }
    }

    public boolean setAdvertisingIdEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38683u, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setAdvertisingIdEnable success");
                return true;
            }
            c.a().a("[PushManager] setAdvertisingIdEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setAdvertisingIdEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setAdvertisingIdInterval(Context context, long j11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38684v, Caller.PUSH.name(), String.valueOf(j11 * 3600000))) {
                c.a().a("[PushManager] setAdvertisingIdInterval success");
                return true;
            }
            c.a().a("[PushManager] setAdvertisingIdInterval  error =必须在 24-24*7 小时之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setAdvertisingIdInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setAppListInterval(Context context, long j11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38668f, Caller.PUSH.name(), String.valueOf(j11 * 3600000))) {
                c.a().a("[PushManager] setAppListInterval success");
                return true;
            }
            c.a().a("[PushManager] setAppListInterval  error = 必须在6-24小时之间");
            return false;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setAppListInterval  error = " + th2.toString());
            return false;
        }
    }

    public boolean setBadgeNum(Context context, int i11) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("[PushManager] call - > setBadgeNum");
            Bundle bundle = new Bundle();
            bundle.putString("action", "setBadgeNum");
            bundle.putInt("badgeNum", i11);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setBadgeNum  error = " + th2.toString());
            return false;
        }
    }

    public boolean setCellInfoEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38685w, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setCellInfoEnable success");
                return true;
            }
            c.a().a("[PushManager] setCellInfoEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setCellInfoEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setCellInfoInterval(Context context, int i11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38686x, Caller.PUSH.name(), String.valueOf(i11 * 1000))) {
                c.a().a("[PushManager] setCellInfoInterval success");
                return true;
            }
            c.a().a("[PushManager] setCellInfoInterval  error = 必须在 5-1800 秒之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setCellInfoInterval fail " + th2.getMessage());
            return false;
        }
    }

    public void setDebugLogger(Context context, IUserLoggerInterface iUserLoggerInterface) {
        String str;
        if (context == null || iUserLoggerInterface == null) {
            throw new IllegalArgumentException("context or loggerInterface can not be null");
        }
        try {
            GtcProvider.setContext(context);
            if (!com.igexin.push.g.c.a(context)) {
                str = "only run in debug mode";
            } else {
                if (isMainProcess(context)) {
                    try {
                        checkManifest(context);
                    } catch (GetuiPushException e11) {
                        iUserLoggerInterface.log(e11.toString());
                    }
                    c a11 = c.a();
                    Context applicationContext = context.getApplicationContext();
                    a11.a(applicationContext);
                    a11.f37186b.a(iUserLoggerInterface);
                    a11.f37186b.a();
                    a11.a("[LogController] Sdk version = " + getInstance().getVersion(applicationContext));
                    return;
                }
                str = "Must be called in main process!";
            }
            iUserLoggerInterface.log(str);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public boolean setDeviceToken(Context context, String str) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (TextUtils.isEmpty(str)) {
                c.a().a("[PushManager] setDeviceToken error = token is empty");
                return false;
            }
            if (str.equalsIgnoreCase("InvalidAppKey")) {
                c.a().a("[PushManager] setDeviceToken error = token is InvalidAppKey");
                return false;
            }
            checkContext(applicationContext);
            GtcProvider.setContext(applicationContext);
            Bundle bundle = new Bundle();
            bundle.putString("action", "setDeviceToken");
            bundle.putString("token", str);
            Intent intent = new Intent(applicationContext.getApplicationContext(), (Class<?>) getUserPushService(applicationContext));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(applicationContext, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setDeviceToken  error = " + th2.toString());
            return false;
        }
    }

    public boolean setEmergencyPush(Context context, boolean z11) {
        boolean z12;
        boolean z13;
        try {
            Context applicationContext = context.getApplicationContext();
            checkContext(applicationContext);
            GtcProvider.setContext(applicationContext);
            o.a(applicationContext, o.f38744m, Boolean.valueOf(z11));
            Boolean bool = Boolean.TRUE;
            if (!((Boolean) o.b(applicationContext, o.f38745n, bool)).booleanValue() && !z11) {
                z12 = false;
                DimManager dimManager = DimManager.getInstance();
                String str = f.b.A;
                Caller caller = Caller.PUSH;
                dimManager.setSetting(applicationContext, str, caller.name(), String.valueOf(z12));
                DimManager.getInstance().setSetting(applicationContext, f.b.f38671i, caller.name(), String.valueOf(z12));
                DimManager.getInstance().setSetting(applicationContext, f.b.f38669g, caller.name(), String.valueOf(z12));
                boolean booleanValue = ((Boolean) o.b(applicationContext, o.f38742k, bool)).booleanValue();
                if (!((Boolean) o.b(applicationContext, o.f38743l, bool)).booleanValue() && !z11 && !booleanValue) {
                    z13 = false;
                    DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, caller.name(), String.valueOf(z13));
                    c.a().a("[PushManager] setEmergencyPush  success");
                    return true;
                }
                z13 = true;
                DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, caller.name(), String.valueOf(z13));
                c.a().a("[PushManager] setEmergencyPush  success");
                return true;
            }
            z12 = true;
            DimManager dimManager2 = DimManager.getInstance();
            String str2 = f.b.A;
            Caller caller2 = Caller.PUSH;
            dimManager2.setSetting(applicationContext, str2, caller2.name(), String.valueOf(z12));
            DimManager.getInstance().setSetting(applicationContext, f.b.f38671i, caller2.name(), String.valueOf(z12));
            DimManager.getInstance().setSetting(applicationContext, f.b.f38669g, caller2.name(), String.valueOf(z12));
            boolean booleanValue2 = ((Boolean) o.b(applicationContext, o.f38742k, bool)).booleanValue();
            if (!((Boolean) o.b(applicationContext, o.f38743l, bool)).booleanValue()) {
                z13 = false;
                DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, caller2.name(), String.valueOf(z13));
                c.a().a("[PushManager] setEmergencyPush  success");
                return true;
            }
            z13 = true;
            DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, caller2.name(), String.valueOf(z13));
            c.a().a("[PushManager] setEmergencyPush  success");
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setEmergencyPush  error = " + th2.toString());
            return false;
        }
    }

    @Deprecated
    public boolean setGuardOptions(Context context, boolean z11, boolean z12) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            Bundle bundle = new Bundle();
            bundle.putString("action", "setGuardOptions");
            bundle.putBoolean("guardMe", z11);
            bundle.putBoolean("guardOthers", z12);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setGuardOptions  error = " + th2.toString());
            return false;
        }
    }

    public boolean setHeartbeatInterval(Context context, int i11) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (i11 < 0) {
                c.a().a("[PushManager] call -> setHeartbeatInterval failed, parameter [interval] < 0, illegal");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("action", "setHeartbeatInterval");
            bundle.putInt("interval", i11);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setHeartbeatInterval  error = " + th2.toString());
            return false;
        }
    }

    @Deprecated
    public boolean setHwBadgeNum(Context context, int i11) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("[PushManager] call - > setHwBadgeNum");
            Bundle bundle = new Bundle();
            bundle.putString("action", "setHwBadgeNum");
            bundle.putInt("badgeNum", i11);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setHwBadgeNum  error = " + th2.toString());
            return false;
        }
    }

    public boolean setIccIdEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38679q, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setIccIdEnable success");
                return true;
            }
            c.a().a("[PushManager] setIccIdEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setIccIdEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setIccIdInterval(Context context, int i11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38680r, Caller.PUSH.name(), String.valueOf(i11 * 3600000))) {
                c.a().a("[PushManager] setIccIdInterval success");
                return true;
            }
            c.a().a("[PushManager] setIccIdInterval  error = 必须在 24-24*7 小时之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setIccIdInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setImeiEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38673k, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setImeiEnable success");
                return true;
            }
            c.a().a("[PushManager] setImeiEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setImeiEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setImeiInterval(Context context, int i11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38674l, Caller.PUSH.name(), String.valueOf(i11 * 3600000))) {
                c.a().a("[PushManager] setImeiInterval success");
                return true;
            }
            c.a().a("[PushManager] setImeiInterval  error = 必须在 24-24*7 小时之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setImeiInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setImsiEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38675m, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setImsiEnable success");
                return true;
            }
            c.a().a("[PushManager] setImsiEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setImsiEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setImsiInterval(Context context, int i11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38676n, Caller.PUSH.name(), String.valueOf(i11 * 3600000))) {
                c.a().a("[PushManager] setImsiInterval success");
                return true;
            }
            c.a().a("[PushManager] setImsiInterval  error = 必须在 24-24*7 小时之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setImsiInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setIndividuationPush(Context context, boolean z11) {
        boolean z12;
        try {
            Context applicationContext = context.getApplicationContext();
            checkContext(applicationContext);
            GtcProvider.setContext(applicationContext);
            o.a(applicationContext, o.f38742k, Boolean.valueOf(z11));
            Boolean bool = Boolean.TRUE;
            boolean booleanValue = ((Boolean) o.b(applicationContext, o.f38743l, bool)).booleanValue();
            boolean booleanValue2 = ((Boolean) o.b(applicationContext, o.f38744m, bool)).booleanValue();
            if (!z11 && !booleanValue && !booleanValue2) {
                z12 = false;
                DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, Caller.PUSH.name(), String.valueOf(z12));
                c.a().a("[PushManager] setIndividuationPush success");
                return true;
            }
            z12 = true;
            DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, Caller.PUSH.name(), String.valueOf(z12));
            c.a().a("[PushManager] setIndividuationPush success");
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setIndividuationPush  error = " + th2.toString());
            return false;
        }
    }

    public boolean setIpEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38687y, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setIpEnable success");
                return true;
            }
            c.a().a("[PushManager] setIpEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setIpEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setIpInterval(Context context, long j11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38688z, Caller.PUSH.name(), String.valueOf(j11 * 1000))) {
                c.a().a("[PushManager] setIpInterval success");
                return true;
            }
            c.a().a("[PushManager] setIpInterval  error = 必须在 5-1800  秒之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setIpInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setLinkMerge(Context context, boolean z11) {
        boolean z12;
        try {
            Context applicationContext = context.getApplicationContext();
            checkContext(applicationContext);
            GtcProvider.setContext(applicationContext);
            o.a(applicationContext, o.f38743l, Boolean.valueOf(z11));
            String str = o.f38742k;
            Boolean bool = Boolean.TRUE;
            boolean booleanValue = ((Boolean) o.b(applicationContext, str, bool)).booleanValue();
            boolean booleanValue2 = ((Boolean) o.b(applicationContext, o.f38744m, bool)).booleanValue();
            if (!booleanValue && !z11 && !booleanValue2) {
                z12 = false;
                DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, Caller.PUSH.name(), String.valueOf(z12));
                Bundle bundle = new Bundle();
                bundle.putString("action", "setLinkMerge");
                bundle.putBoolean(u0.f65628b, z11);
                Intent intent = new Intent(applicationContext.getApplicationContext(), (Class<?>) getInstance().getUserPushService(applicationContext));
                intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                intent.putExtra("bundle", bundle);
                return getInstance().startService(applicationContext, intent);
            }
            z12 = true;
            DimManager.getInstance().setSetting(applicationContext, f.b.f38667e, Caller.PUSH.name(), String.valueOf(z12));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action", "setLinkMerge");
            bundle2.putBoolean(u0.f65628b, z11);
            Intent intent2 = new Intent(applicationContext.getApplicationContext(), (Class<?>) getInstance().getUserPushService(applicationContext));
            intent2.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent2.putExtra("bundle", bundle2);
            return getInstance().startService(applicationContext, intent2);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setLinkMerge  error = " + th2.toString());
            return false;
        }
    }

    public boolean setLocationInterval(Context context, long j11) {
        try {
            DimManager dimManager = DimManager.getInstance();
            String str = f.b.f38670h;
            Caller caller = Caller.PUSH;
            long j12 = j11 * 1000;
            boolean setting = dimManager.setSetting(context, str, caller.name(), String.valueOf(j12));
            boolean setting2 = DimManager.getInstance().setSetting(context, f.b.f38672j, caller.name(), String.valueOf(j12));
            if (setting && setting2) {
                c.a().a("[PushManager] setLocationInterval success");
                return true;
            }
            c.a().a("[PushManager] setLocationInterval  error = 必须在 5-1800 秒之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setLocationInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setMacEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38677o, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setMacEnable success");
                return true;
            }
            c.a().a("[PushManager] setMacEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setMacEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setMacInterval(Context context, int i11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38678p, Caller.PUSH.name(), String.valueOf(i11 * 3600000))) {
                c.a().a("[PushManager] setMacInterval success");
                return true;
            }
            c.a().a("[PushManager] setMacInterval  error = 必须在 24-24*7 小时之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setMacInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setNotificationIcon(Context context, String str, String str2) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            Bundle bundle = new Bundle();
            bundle.putString("action", "setNotificationIcon");
            bundle.putString("smallIcon", str);
            bundle.putString("largeIcon", str2);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setNotificationIcon  error = " + th2.toString());
            return false;
        }
    }

    @Deprecated
    public boolean setOPPOBadgeNum(Context context, int i11) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("[PushManager] call - > setHwBadgeNum");
            Bundle bundle = new Bundle();
            bundle.putString("action", "setOppoBadgeNum");
            bundle.putInt("badgeNum", i11);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setOPPOBadgeNum  error = " + th2.toString());
            return false;
        }
    }

    public boolean setScenePush(Context context, boolean z11) {
        boolean z12;
        try {
            Context applicationContext = context.getApplicationContext();
            checkContext(applicationContext);
            GtcProvider.setContext(applicationContext);
            o.a(applicationContext, o.f38745n, Boolean.valueOf(z11));
            boolean booleanValue = ((Boolean) o.b(applicationContext, o.f38744m, Boolean.TRUE)).booleanValue();
            if (!z11 && !booleanValue) {
                z12 = false;
                DimManager dimManager = DimManager.getInstance();
                String str = f.b.f38671i;
                Caller caller = Caller.PUSH;
                dimManager.setSetting(applicationContext, str, caller.name(), String.valueOf(z12));
                DimManager.getInstance().setSetting(applicationContext, f.b.f38669g, caller.name(), String.valueOf(z12));
                DimManager.getInstance().setSetting(applicationContext, f.b.A, caller.name(), String.valueOf(z12));
                c.a().a("[PushManager] setScenePush success");
                return true;
            }
            z12 = true;
            DimManager dimManager2 = DimManager.getInstance();
            String str2 = f.b.f38671i;
            Caller caller2 = Caller.PUSH;
            dimManager2.setSetting(applicationContext, str2, caller2.name(), String.valueOf(z12));
            DimManager.getInstance().setSetting(applicationContext, f.b.f38669g, caller2.name(), String.valueOf(z12));
            DimManager.getInstance().setSetting(applicationContext, f.b.A, caller2.name(), String.valueOf(z12));
            c.a().a("[PushManager] setScenePush success");
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setScenePush  error = " + th2.toString());
            return false;
        }
    }

    public boolean setSerialNumberEnable(Context context, boolean z11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38681s, Caller.PUSH.name(), String.valueOf(z11))) {
                c.a().a("[PushManager] setSerialNumberEnable success");
                return true;
            }
            c.a().a("[PushManager] setSerialNumberEnable  error");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setSerialNumberEnable fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setSerialNumberInterval(Context context, int i11) {
        try {
            if (DimManager.getInstance().setSetting(context, f.b.f38682t, Caller.PUSH.name(), String.valueOf(i11 * 3600000))) {
                c.a().a("[PushManager] setSerialNumberInterval success");
                return true;
            }
            c.a().a("[PushManager] setSerialNumberInterval  error = 必须在 24-24*7 小时之间");
            return false;
        } catch (Throwable th2) {
            c.a().a("[PushManager] setSerialNumberInterval fail " + th2.getMessage());
            return false;
        }
    }

    public boolean setSilentTime(Context context, int i11, int i12) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (i11 >= 0 && i11 < 24 && i12 >= 0 && i12 <= 23) {
                Bundle bundle = new Bundle();
                bundle.putString("action", "setSilentTime");
                bundle.putInt("beginHour", i11);
                bundle.putInt("duration", i12);
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
                intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                intent.putExtra("bundle", bundle);
                return startService(context, intent);
            }
            c.a().a("[PushManager] call - > setSilentTime failed, parameter [beginHour] or [duration] value exceeding");
            return false;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] queryTag  error = " + th2.toString());
            return false;
        }
    }

    public boolean setSocketTimeout(Context context, int i11) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            if (i11 < 0) {
                c.a().a("[PushManager] call - > setSocketTimeout failed, parameter [timeout] < 0, illegal");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("action", "setSocketTimeout");
            bundle.putInt(com.alipay.sdk.m.m.a.f10784h0, i11);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setSocketTimeout  error = " + th2.toString());
            return false;
        }
    }

    public int setTag(Context context, Tag[] tagArr, String str) {
        int i11;
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            int i12 = 20006;
            if (tagArr == null) {
                c.a().a("[PushManager] call -> setTag failed, parameter [tags] is null");
                com.igexin.c.a.c.a.a("PushManager|tags is null", new Object[0]);
                sendSetTagResult(context, str, "20006");
                return 20006;
            }
            if (str == null) {
                c.a().a("[PushManager] call -> setTag failed, parameter [sn] is null");
                sendSetTagResult(context, str, "20007");
                return 20007;
            }
            if (tagArr.length > 200) {
                c.a().a("[PushManager] call -> setTag failed, parameter [tags] len > 200 is exceeds");
                sendSetTagResult(context, str, PushConsts.SEND_MESSAGE_ERROR_GENERAL);
                return 20001;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastSetTagTime < 1000) {
                c.a().a("[PushManager] call - > setTag failed, it be called too frequently");
                sendSetTagResult(context, str, PushConsts.SEND_MESSAGE_ERROR_TIME_OUT);
                return 20002;
            }
            StringBuilder sb2 = new StringBuilder();
            int length = tagArr.length;
            int i13 = 0;
            while (i13 < length) {
                Tag tag = tagArr[i13];
                if (tag != null && tag.getName() != null) {
                    i11 = i12;
                    if (!tag.getName().contains(" ") && !tag.getName().contains(",")) {
                        sb2.append(tag.getName());
                        sb2.append(",");
                    }
                    c.a().a("[PushManager] call -> setTag failed, the tag [" + tag.getName() + "] is not illegal");
                    sendSetTagResult(context, str, "20011");
                    return 20011;
                }
                i11 = i12;
                i13++;
                i12 = i11;
            }
            int i14 = i12;
            if (sb2.length() <= 0) {
                sendSetTagResult(context, str, "20006");
                return i14;
            }
            sb2.deleteCharAt(sb2.length() - 1);
            c.a().a("[PushManager] call setTag");
            Bundle bundle = new Bundle();
            bundle.putString("action", "setTag");
            bundle.putString("tags", sb2.toString());
            bundle.putString("sn", str);
            this.lastSetTagTime = currentTimeMillis;
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            startService(context, intent);
            return 0;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setTag  error = " + th2.toString());
            return 20005;
        }
    }

    @Deprecated
    public boolean setVivoAppBadgeNum(Context context, int i11) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("[PushManager] call - > setHwBadgeNum");
            Bundle bundle = new Bundle();
            bundle.putString("action", "setVivoBadgeNum");
            bundle.putInt("badgeNum", i11);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] setOPPOBadgeNum  error = " + th2.toString());
            return false;
        }
    }

    public void turnOffPush(Context context) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("PushManager|call turnOffPush");
            Bundle bundle = new Bundle();
            bundle.putString("action", "turnOffPush");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            startService(context, intent);
            unRegisterCallback(context);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] turnOffPush  error = " + th2.toString());
        }
    }

    public void turnOnPush(Context context) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("PushManager|call turnOnPush");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE);
            intent.putExtra("op_app", context.getApplicationContext().getPackageName());
            intent.putExtra("isSlave", true);
            startService(context, intent);
            registerCallback(context);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] turnOnPush  error = " + th2.toString());
        }
    }

    public boolean unBindAlias(Context context, String str, boolean z11) {
        return unBindAlias(context, str, z11, "unBindAlias_" + System.currentTimeMillis());
    }

    public boolean bindAlias(Context context, String str, String str2) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("PushManager|call bindAlias");
            com.igexin.c.a.c.a.a("PushManager|call bindAlias", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastOpAliasTime < 1000) {
                c.a().a("[PushManager] call - > bindAlias failed, it be called too frequently");
                sendBindAliasResult(context, str2, ResultStatus.STATUS_PARAM_ERROR);
                return false;
            }
            this.lastOpAliasTime = currentTimeMillis;
            Bundle bundle = new Bundle();
            bundle.putString("action", "bindAlias");
            bundle.putString(PushConstants.SUB_ALIAS_STATUS_NAME, str);
            bundle.putString("sn", str2);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] bindAlias  error = " + th2.toString());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0017, B:12:0x0029, B:14:0x0053, B:15:0x0058, B:17:0x0060, B:18:0x0067, B:20:0x006f, B:21:0x0076, B:23:0x007c, B:24:0x007e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0017, B:12:0x0029, B:14:0x0053, B:15:0x0058, B:17:0x0060, B:18:0x0067, B:20:0x006f, B:21:0x0076, B:23:0x007c, B:24:0x007e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0017, B:12:0x0029, B:14:0x0053, B:15:0x0058, B:17:0x0060, B:18:0x0067, B:20:0x006f, B:21:0x0076, B:23:0x007c, B:24:0x007e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:2:0x0000, B:7:0x000e, B:9:0x0017, B:12:0x0029, B:14:0x0053, B:15:0x0058, B:17:0x0060, B:18:0x0067, B:20:0x006f, B:21:0x0076, B:23:0x007c, B:24:0x007e), top: B:1:0x0000 }] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends android.app.Service> void initialize(android.content.Context r4, java.lang.Class<T> r5) {
        /*
            r3 = this;
            checkContext(r4)     // Catch: java.lang.Throwable -> L24
            com.getui.gtc.base.GtcProvider.setContext(r4)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r3.checkGTCVersion()     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto Le
            goto L9f
        Le:
            com.igexin.push.core.ServiceManager r0 = com.igexin.push.core.ServiceManager.getInstance()     // Catch: java.lang.Throwable -> L24
            r0.f(r4)     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L27
            java.lang.String r0 = com.igexin.push.core.b.f37719ap     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r5.getName()     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L29
            goto L27
        L24:
            r4 = move-exception
            goto La0
        L27:
            java.lang.Class<com.igexin.sdk.PushService> r5 = com.igexin.sdk.PushService.class
        L29:
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L24
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L24
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L24
            r2 = 1
            r1.setComponentEnabledSetting(r0, r2, r2)     // Catch: java.lang.Throwable -> L24
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L24
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L24
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "action"
            java.lang.String r2 = com.igexin.sdk.PushConsts.ACTION_SERVICE_INITIALIZE     // Catch: java.lang.Throwable -> L24
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "ups"
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Throwable -> L24
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r3.uIntentService     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L58
            java.lang.String r2 = "uis"
            r0.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L24
        L58:
            java.lang.String r1 = r3.uActivity     // Catch: java.lang.Throwable -> L24
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L67
            java.lang.String r1 = "ua"
            java.lang.String r2 = r3.uActivity     // Catch: java.lang.Throwable -> L24
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L24
        L67:
            java.lang.String r1 = r3.uRegisterService     // Catch: java.lang.Throwable -> L24
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L76
            java.lang.String r1 = "us"
            java.lang.String r2 = r3.uRegisterService     // Catch: java.lang.Throwable -> L24
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L24
        L76:
            boolean r0 = r3.startService(r4, r0)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L7e
            r3.uPushService = r5     // Catch: java.lang.Throwable -> L24
        L7e:
            r3.registerCallback(r4)     // Catch: java.lang.Throwable -> L24
            com.igexin.d.a r5 = com.igexin.d.a.a()     // Catch: java.lang.Throwable -> L9f
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L9f
            r5.f37283a = r4     // Catch: java.lang.Throwable -> L9f
            com.igexin.b.a r4 = com.igexin.b.a.a()     // Catch: java.lang.Throwable -> L9f
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r4.b()     // Catch: java.lang.Throwable -> L9f
            com.igexin.d.a$1 r0 = new com.igexin.d.a$1     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L9f
            r1 = 2000(0x7d0, double:9.88E-321)
            r4.schedule(r0, r1, r5)     // Catch: java.lang.Throwable -> L9f
        L9f:
            return
        La0:
            com.igexin.c.a.c.a.a(r4)
            com.igexin.c.a.c.a.c r5 = com.igexin.c.a.c.a.c.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[PushManager] initialize sdk error = "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.sdk.PushManager.initialize(android.content.Context, java.lang.Class):void");
    }

    public boolean unBindAlias(Context context, String str, boolean z11, String str2) {
        try {
            checkContext(context);
            GtcProvider.setContext(context);
            c.a().a("PushManager|call unBindAlias");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastOpAliasTime < 1000) {
                c.a().a("[PushManager] call - > unBindAlias failed, it be called too frequently");
                sendUnBindAliasResult(context, str2, ResultStatus.STATUS_PARAM_ERROR);
                return false;
            }
            this.lastOpAliasTime = currentTimeMillis;
            Bundle bundle = new Bundle();
            bundle.putString("action", "unbindAlias");
            bundle.putString(PushConstants.SUB_ALIAS_STATUS_NAME, str);
            bundle.putBoolean("isSeft", z11);
            bundle.putString("sn", str2);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) getUserPushService(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return startService(context, intent);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            c.a().a("[PushManager] unBindAlias  error = " + th2.toString());
            return false;
        }
    }
}
