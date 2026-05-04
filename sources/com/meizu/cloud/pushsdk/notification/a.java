package com.meizu.cloud.pushsdk.notification;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.media3.common.util.n;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f39897a;

    /* renamed from: b, reason: collision with root package name */
    protected final PushNotificationBuilder f39898b;

    /* renamed from: c, reason: collision with root package name */
    private final NotificationManager f39899c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f39900d;

    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        this.f39898b = pushNotificationBuilder;
        this.f39897a = context;
        this.f39900d = new Handler(context.getMainLooper());
        this.f39899c = (NotificationManager) context.getSystemService("notification");
    }

    private Notification a(MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        Notification.Builder builder = new Notification.Builder(this.f39897a);
        a(builder, messageV3, pendingIntent, pendingIntent2);
        c(builder, messageV3);
        b(builder, messageV3);
        a(builder, messageV3);
        d(builder, messageV3);
        Notification build = MinSdkChecker.isSupportNotificationBuild() ? builder.build() : builder.getNotification();
        b(build, messageV3);
        a(build, messageV3);
        a(build, messageV3, pendingIntent3);
        return build;
    }

    @TargetApi(23)
    private Icon b(String str) {
        try {
            int identifier = this.f39897a.getPackageManager().getResourcesForApplication(str).getIdentifier(PushConstants.MZ_PUSH_NOTIFICATION_SMALL_ICON, "drawable", str);
            if (identifier == 0) {
                return null;
            }
            DebugLogger.i("AbstractPushNotification", "get " + str + " smallIcon success resId " + identifier);
            return Icon.createWithResource(str, identifier);
        } catch (Exception e11) {
            DebugLogger.e("AbstractPushNotification", "cannot load smallIcon form package " + str + " Error message " + e11.getMessage());
            return null;
        }
    }

    private PendingIntent c(MessageV3 messageV3) {
        String uploadDataPackageName;
        boolean z11;
        if (d(messageV3)) {
            uploadDataPackageName = messageV3.getPackageName();
            z11 = false;
        } else {
            uploadDataPackageName = messageV3.getUploadDataPackageName();
            z11 = true;
        }
        return a(messageV3, uploadDataPackageName, z11);
    }

    private void d(Notification.Builder builder, MessageV3 messageV3) {
        String str;
        String str2;
        int i11;
        if (MinSdkChecker.isSupportNotificationChannel()) {
            AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
            AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
            int priorityDisplay = advanceSettingEx != null ? advanceSettingEx.getPriorityDisplay() : 0;
            if (Build.VERSION.SDK_INT >= 29 && advanceSetting.isHeadUpNotification() && advanceSettingEx.getPriorityDisplay() < 1) {
                priorityDisplay = 1;
            }
            if (priorityDisplay != -2) {
                i11 = 2;
                if (priorityDisplay == -1) {
                    str = "mz_push_notification_channel_low";
                    str2 = "MEIZUPUSHLOW";
                } else if (priorityDisplay == 1) {
                    str = "mz_push_notification_channel_high";
                    str2 = "MEIZUPUSHHIGH";
                    i11 = 4;
                } else if (priorityDisplay != 2) {
                    str = "mz_push_notification_channel";
                    str2 = "MEIZUPUSH";
                    i11 = 3;
                } else {
                    str = "mz_push_notification_channel_max";
                    str2 = "MEIZUPUSHMAX";
                    i11 = 5;
                }
            } else {
                str = "mz_push_notification_channel_min";
                str2 = "MEIZUPUSHMIN";
                i11 = 1;
            }
            Uri b11 = advanceSettingEx.getSoundTitle() != null ? com.meizu.cloud.pushsdk.notification.c.b.b(this.f39897a, advanceSettingEx.getSoundTitle()) : null;
            if (!advanceSetting.getNotifyType().isSound() && advanceSettingEx.getSoundTitle() == null) {
                str = str + "_mute";
                str2 = str2 + "_MUTE";
            } else if (b11 != null) {
                String str3 = str + "_" + advanceSettingEx.getSoundTitle().toLowerCase();
                str2 = str2 + "_" + advanceSettingEx.getSoundTitle().toUpperCase();
                str = str3;
            }
            DebugLogger.e("AbstractPushNotification", "notification channel builder, channelId: " + str + ", channelName: " + str2 + ", importance:" + i11 + ", sound: " + b11);
            NotificationChannel a11 = n.a(str, str2, i11);
            a11.enableLights(true);
            a11.setLightColor(-16711936);
            a11.setShowBadge(true);
            a11.enableVibration(true);
            if (!advanceSetting.getNotifyType().isSound() && advanceSettingEx.getSoundTitle() == null) {
                a11.setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            } else if (b11 != null) {
                a11.setSound(b11, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
            this.f39899c.createNotificationChannel(a11);
            builder.setChannelId(str);
        }
    }

    private PendingIntent e(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f39897a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return PendingIntent.getBroadcast(this.f39897a, 0, intent, 1073741824);
    }

    private PendingIntent f(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_CLOSE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f39897a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return PendingIntent.getBroadcast(this.f39897a, 0, intent, 1073741824);
    }

    private PendingIntent g(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_NOTIFICATION_STATE_MESSAGE, messageV3.getNotificationMessage());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SHOW_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        intent.putExtra(PushConstants.MZ_PUSH_WHITE_LIST, messageV3.getWhiteList());
        intent.putExtra(PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, messageV3.getDelayedReportMillis());
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_STATE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f39897a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return PendingIntent.getBroadcast(this.f39897a, 0, intent, 1073741824);
    }

    private String h(MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return null;
        }
        String uploadDataPackageName = messageV3.getUploadDataPackageName();
        String adPackage = messageV3.getAdvertisementOption().getAdPackage();
        DebugLogger.e("AbstractPushNotification", "again show old ad and replace package, uploadDataPackageName:" + uploadDataPackageName + ", adPackageName:" + adPackage);
        com.meizu.cloud.pushsdk.handler.a.a.a b11 = com.meizu.cloud.pushsdk.b.a(this.f39897a).b();
        if (b11 != null) {
            b11.a();
        }
        messageV3.setUploadDataPackageName(adPackage);
        return uploadDataPackageName;
    }

    private PendingIntent a(MessageV3 messageV3, String str, boolean z11) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        if (z11 && MinSdkChecker.isSupportTransmitMessageValue(this.f39897a, str)) {
            intent.putExtra(PushConstants.MZ_MESSAGE_VALUE, com.meizu.cloud.pushsdk.handler.d.a(messageV3));
        } else {
            intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        }
        intent.putExtra("method", "private");
        intent.setClassName(str, MzSystemUtils.findReceiver(this.f39897a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, str));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.setFlags(32);
        return PendingIntent.getBroadcast(this.f39897a, 0, intent, 1073741824);
    }

    private String b(Context context, String str) {
        CharSequence applicationLabel;
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null) {
                return null;
            }
            return (String) applicationLabel;
        } catch (PackageManager.NameNotFoundException unused) {
            DebugLogger.e("AbstractPushNotification", "can not find " + str + " application info");
            return null;
        }
    }

    private void c(Notification.Builder builder, MessageV3 messageV3) {
        boolean isSound;
        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
        if (advanceSetting == null) {
            return;
        }
        if (advanceSettingEx == null || TextUtils.isEmpty(advanceSettingEx.getSoundTitle())) {
            isSound = advanceSetting.getNotifyType().isSound();
        } else {
            Uri b11 = com.meizu.cloud.pushsdk.notification.c.b.b(this.f39897a, advanceSettingEx.getSoundTitle());
            if (b11 != null) {
                DebugLogger.e("AbstractPushNotification", "advance setting builder, sound:" + b11);
                builder.setSound(b11);
                isSound = false;
            } else {
                isSound = true;
            }
        }
        if (advanceSetting.getNotifyType() != null) {
            boolean isVibrate = advanceSetting.getNotifyType().isVibrate();
            boolean isLights = advanceSetting.getNotifyType().isLights();
            if (isVibrate || isLights || isSound) {
                int i11 = isVibrate ? 2 : 0;
                if (isLights) {
                    i11 |= 4;
                }
                if (isSound) {
                    i11 |= 1;
                }
                DebugLogger.e("AbstractPushNotification", "advance setting builder, defaults:" + i11);
                builder.setDefaults(i11);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("advance setting builder, ongoing:");
        sb2.append(!advanceSetting.isClearNotification());
        DebugLogger.e("AbstractPushNotification", sb2.toString());
        builder.setOngoing(!advanceSetting.isClearNotification());
        if (advanceSettingEx == null || !MinSdkChecker.isSupportNotificationBuild()) {
            return;
        }
        DebugLogger.e("AbstractPushNotification", "advance setting builder, priority:" + advanceSettingEx.getPriorityDisplay());
        builder.setPriority(advanceSettingEx.getPriorityDisplay());
    }

    private boolean d(MessageV3 messageV3) {
        if (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return messageV3.getWhiteList() && !MzSystemUtils.isExistReceiver(this.f39897a, messageV3.getUploadDataPackageName(), PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        }
        return true;
    }

    public Bitmap a(Context context, String str) {
        BitmapDrawable bitmapDrawable;
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(str);
            Bitmap bitmap = null;
            if (Build.VERSION.SDK_INT < 26) {
                bitmapDrawable = (BitmapDrawable) applicationIcon;
            } else if (applicationIcon instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) applicationIcon;
            } else if (e.a(applicationIcon)) {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                bitmapDrawable = null;
                bitmap = createBitmap;
            } else {
                bitmapDrawable = null;
            }
            return bitmap == null ? bitmapDrawable.getBitmap() : bitmap;
        } catch (Exception e11) {
            DebugLogger.i("AbstractPushNotification", "get app icon error " + e11.getMessage());
            return ((BitmapDrawable) context.getApplicationInfo().loadIcon(context.getPackageManager())).getBitmap();
        }
    }

    public void b(Notification.Builder builder, MessageV3 messageV3) {
    }

    @SuppressLint({"NewApi"})
    private void b(Notification notification, MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.notification.c.b.a(notification, true);
        com.meizu.cloud.pushsdk.notification.c.b.a(notification, g(messageV3));
        notification.extras.putString(PushConstants.EXTRA_ORIGINAL_NOTIFICATION_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        notification.extras.putString(PushConstants.EXTRA_FLYME_GREEN_NOTIFICATION_SETTING, a(messageV3));
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
        if (!TextUtils.isEmpty(this.f39898b.getAppLabel())) {
            DebugLogger.e("AbstractPushNotification", "set app label " + this.f39898b.getAppLabel());
            notification.extras.putString(PushConstants.EXTRA_SUBSTITUTE_APP_NAME, this.f39898b.getAppLabel());
            return;
        }
        String b11 = b(this.f39897a, messageV3.getUploadDataPackageName());
        DebugLogger.e("AbstractPushNotification", "current package " + messageV3.getUploadDataPackageName() + " label is " + b11);
        if (TextUtils.isEmpty(b11)) {
            return;
        }
        notification.extras.putString(PushConstants.EXTRA_SUBSTITUTE_APP_NAME, b11);
    }

    public Bitmap a(String str) {
        com.meizu.cloud.pushsdk.c.a.c b11 = com.meizu.cloud.pushsdk.c.a.a(str).a().b();
        if (!b11.b() || b11.a() == null) {
            DebugLogger.i("AbstractPushNotification", "ANRequest On other Thread down load largeIcon " + str + "image fail");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ANRequest On other Thread down load largeIcon ");
        sb2.append(str);
        sb2.append("image ");
        sb2.append(b11.a() != null ? "success" : "fail");
        DebugLogger.i("AbstractPushNotification", sb2.toString());
        return (Bitmap) b11.a();
    }

    public String a(MessageV3 messageV3) {
        String str = null;
        try {
            if (!TextUtils.isEmpty(messageV3.getNotificationMessage())) {
                str = new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getString("fns");
            }
        } catch (Exception e11) {
            DebugLogger.e("AbstractPushNotification", "parse flyme notification setting error " + e11.getMessage());
        }
        DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is " + str);
        return str;
    }

    @Override // com.meizu.cloud.pushsdk.notification.c
    @SuppressLint({"NewApi"})
    public void b(MessageV3 messageV3) {
        String h11 = (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) ? null : h(messageV3);
        Notification a11 = a(messageV3, c(messageV3), e(messageV3), f(messageV3));
        int abs = Math.abs((int) System.currentTimeMillis());
        com.meizu.cloud.pushsdk.notification.model.a a12 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a12 != null && a12.a() != 0) {
            abs = a12.a();
            DebugLogger.e("AbstractPushNotification", "server notify id " + abs);
            if (!TextUtils.isEmpty(a12.b())) {
                int i11 = com.meizu.cloud.pushsdk.util.b.i(this.f39897a, messageV3.getUploadDataPackageName(), a12.b());
                DebugLogger.e("AbstractPushNotification", "notifyKey " + a12.b() + " preference notifyId is " + i11);
                if (i11 != 0) {
                    DebugLogger.e("AbstractPushNotification", "use preference notifyId " + i11 + " and cancel it");
                    this.f39899c.cancel(i11);
                }
                DebugLogger.e("AbstractPushNotification", "store new notifyId " + abs + " by notifyKey " + a12.b());
                com.meizu.cloud.pushsdk.util.b.b(this.f39897a, messageV3.getUploadDataPackageName(), a12.b(), abs);
            }
        }
        DebugLogger.e("AbstractPushNotification", "current notify id " + abs);
        if (messageV3.isDiscard()) {
            if (com.meizu.cloud.pushsdk.util.b.c(this.f39897a, messageV3.getPackageName()) == 0) {
                com.meizu.cloud.pushsdk.util.b.a(this.f39897a, messageV3.getPackageName(), abs);
                DebugLogger.i("AbstractPushNotification", "no notification show so put notification id " + abs);
            }
            if (!TextUtils.isEmpty(messageV3.getTaskId())) {
                if (com.meizu.cloud.pushsdk.util.b.d(this.f39897a, messageV3.getPackageName()) == 0) {
                    com.meizu.cloud.pushsdk.util.b.b(this.f39897a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                } else {
                    if (Integer.valueOf(messageV3.getTaskId()).intValue() < com.meizu.cloud.pushsdk.util.b.d(this.f39897a, messageV3.getPackageName())) {
                        DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " task id " + messageV3.getTaskId() + " don't show notification");
                        return;
                    }
                    com.meizu.cloud.pushsdk.util.b.b(this.f39897a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                    abs = com.meizu.cloud.pushsdk.util.b.c(this.f39897a, messageV3.getPackageName());
                }
            }
            DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " notificationId=" + abs + " taskId=" + messageV3.getTaskId());
        }
        if (messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            a(abs, h11, messageV3);
        }
        this.f39899c.notify(abs, a11);
    }

    private void a(int i11, String str, MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return;
        }
        DebugLogger.e("AbstractPushNotification", "save ad and recovery package, uploadDataPackageName:" + str);
        com.meizu.cloud.pushsdk.handler.a.a.a b11 = com.meizu.cloud.pushsdk.b.a(this.f39897a).b();
        if (b11 != null) {
            int priorityValidTime = messageV3.getAdvertisementOption().getPriorityValidTime();
            b11.a(messageV3);
            b11.a(i11, a(messageV3, c(messageV3), e(messageV3), f(messageV3)), priorityValidTime);
        }
        messageV3.setUploadDataPackageName(str);
    }

    public void a(Notification.Builder builder, MessageV3 messageV3) {
    }

    private void a(Notification.Builder builder, MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        int statusBarIcon;
        builder.setContentTitle(messageV3.getTitle());
        builder.setContentText(messageV3.getContent());
        builder.setTicker(messageV3.getTitle());
        builder.setAutoCancel(true);
        if (MinSdkChecker.isSupportSendNotification()) {
            builder.setVisibility(1);
        }
        if (MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            Icon b11 = b(messageV3.getUploadDataPackageName());
            if (b11 != null) {
                builder.setSmallIcon(b11);
                builder.setContentIntent(pendingIntent);
                builder.setDeleteIntent(pendingIntent2);
            } else {
                DebugLogger.e("AbstractPushNotification", "cannot get " + messageV3.getUploadDataPackageName() + " smallIcon");
            }
        } else {
            PushNotificationBuilder pushNotificationBuilder = this.f39898b;
            if (pushNotificationBuilder != null && pushNotificationBuilder.getStatusBarIcon() != 0) {
                statusBarIcon = this.f39898b.getStatusBarIcon();
                builder.setSmallIcon(statusBarIcon);
                builder.setContentIntent(pendingIntent);
                builder.setDeleteIntent(pendingIntent2);
            }
        }
        statusBarIcon = com.meizu.cloud.pushsdk.notification.c.c.l(this.f39897a);
        builder.setSmallIcon(statusBarIcon);
        builder.setContentIntent(pendingIntent);
        builder.setDeleteIntent(pendingIntent2);
    }

    public void a(Notification notification, MessageV3 messageV3) {
    }

    public void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
    }

    public boolean a() {
        return Thread.currentThread() == this.f39897a.getMainLooper().getThread();
    }
}
