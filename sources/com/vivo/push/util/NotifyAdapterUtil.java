package com.vivo.push.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.vivo.push.d.r;
import com.vivo.push.model.InsideNotificationItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class NotifyAdapterUtil {
    private static final int HIDE_TITLE = 1;
    public static final int NOTIFY_MULTITERM_STYLE = 1;
    public static final int NOTIFY_SINGLE_STYLE = 0;
    public static final String PRIMARY_CHANNEL = "vivo_push_channel";
    private static final String PUSH_EN = "PUSH";
    private static final String PUSH_ID = "pushId";
    private static final String PUSH_ZH = "推送通知";
    private static final String TAG = "NotifyManager";
    private static NotificationManager sNotificationManager = null;
    private static int sNotifyId = 20000000;

    private static boolean cancelNotify(Context context, int i11) {
        initAdapter(context);
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager == null) {
            return false;
        }
        notificationManager.cancel(i11);
        return true;
    }

    private static synchronized void initAdapter(Context context) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        CharSequence name;
        synchronized (NotifyAdapterUtil.class) {
            try {
                if (sNotificationManager == null) {
                    sNotificationManager = (NotificationManager) context.getSystemService("notification");
                }
                if (Build.VERSION.SDK_INT >= 26 && (notificationManager = sNotificationManager) != null) {
                    notificationChannel = notificationManager.getNotificationChannel("default");
                    if (notificationChannel != null) {
                        name = notificationChannel.getName();
                        if (PUSH_ZH.equals(name) || PUSH_EN.equals(name)) {
                            sNotificationManager.deleteNotificationChannel("default");
                        }
                    }
                    String str = isZh(context) ? PUSH_ZH : PUSH_EN;
                    androidx.media3.common.util.o.a();
                    NotificationChannel a11 = androidx.media3.common.util.n.a(PRIMARY_CHANNEL, str, 4);
                    a11.setLightColor(-16711936);
                    a11.enableVibration(true);
                    a11.setLockscreenVisibility(1);
                    sNotificationManager.createNotificationChannel(a11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean isZh(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    public static void pushNotification(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j11, int i11, r.a aVar) {
        p.d(TAG, "pushNotification");
        initAdapter(context);
        int notifyMode = NotifyUtil.getNotifyDataAdapter(context).getNotifyMode(insideNotificationItem);
        if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl()) && list != null && list.size() > 1 && list.get(1) != null) {
            notifyMode = 1;
        }
        if (notifyMode == 2) {
            pushNotificationBySystem(context, list, insideNotificationItem, j11, i11, aVar);
        } else if (notifyMode == 1) {
            pushNotificationByCustom(context, list, insideNotificationItem, j11, aVar);
        }
    }

    private static void pushNotificationByCustom(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j11, r.a aVar) {
        Notification build;
        int i11;
        Bitmap bitmap;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        int i12 = context.getApplicationInfo().icon;
        Bundle bundle = new Bundle();
        bundle.putLong("pushId", j11);
        if (Build.VERSION.SDK_INT >= 26) {
            Notification.Builder a11 = rh.c.a(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            a11.setExtras(bundle);
            build = a11.build();
        } else {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setExtras(bundle);
            build = builder.build();
        }
        build.priority = 2;
        build.flags = 16;
        build.tickerText = title;
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i12;
        }
        build.icon = defaultSmallIconId;
        RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(context).getNotificationLayout());
        remoteViews.setTextViewText(resources.getIdentifier(ma.b.f72900e, "id", packageName), title);
        remoteViews.setTextColor(resources.getIdentifier(ma.b.f72900e, "id", packageName), NotifyUtil.getNotifyLayoutAdapter(context).getTitleColor());
        remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), insideNotificationItem.getContent());
        if (insideNotificationItem.isShowTime()) {
            remoteViews.setTextViewText(resources.getIdentifier("notify_when", "id", packageName), new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date()));
            i11 = 0;
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 0);
        } else {
            i11 = 0;
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 8);
        }
        int suitIconId = NotifyUtil.getNotifyLayoutAdapter(context).getSuitIconId();
        remoteViews.setViewVisibility(suitIconId, i11);
        if (list == null || list.isEmpty() || (bitmap = list.get(i11)) == null) {
            if (defaultNotifyIcon <= 0) {
                defaultNotifyIcon = i12;
            }
            remoteViews.setImageViewResource(suitIconId, defaultNotifyIcon);
        } else {
            remoteViews.setImageViewBitmap(suitIconId, bitmap);
        }
        Bitmap bitmap2 = (list == null || list.size() <= 1) ? null : list.get(1);
        if (bitmap2 == null) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
        } else if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_cover", "id", packageName), bitmap2);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), bitmap2);
        }
        build.contentView = remoteViews;
        if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            build.bigContentView = remoteViews;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        int vibrateSetting = audioManager.getVibrateSetting(0);
        p.d(TAG, "ringMode=" + ringerMode + " callVibrateSetting=" + vibrateSetting);
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        build.defaults = 1;
                    }
                    if (vibrateSetting == 1) {
                        build.defaults |= 2;
                        build.vibrate = new long[]{0, 100, 200, 300};
                    }
                }
            } else if (vibrateSetting == 1) {
                build.defaults = 2;
                build.vibrate = new long[]{0, 100, 200, 300};
            }
        } else if (ringerMode == 2) {
            build.defaults = 1;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", a.a(context).a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_pull_rsa", com.vivo.push.c.d.a(context).a().a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", u.a(com.vivo.push.c.d.a(context).a().a()));
        } catch (Exception e11) {
            p.a(TAG, "pushNotificationByCustom encrypt ：" + e11.getMessage());
        }
        new com.vivo.push.b.p(packageName, j11, insideNotificationItem).b(intent);
        build.contentIntent = PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, 268435456);
        if (sNotificationManager != null) {
            int k11 = com.vivo.push.e.a().k();
            try {
                if (k11 == 0) {
                    sNotificationManager.notify(sNotifyId, build);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (k11 == 1) {
                    sNotificationManager.notify((int) j11, build);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else {
                    p.a(TAG, "unknow notify style ".concat(String.valueOf(k11)));
                }
            } catch (Exception e12) {
                p.a(TAG, e12);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    private static void pushNotificationBySystem(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j11, int i11, r.a aVar) {
        int i12;
        Bitmap bitmap;
        Notification.Builder builder;
        Bitmap decodeResource;
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        String content = insideNotificationItem.getContent();
        int i13 = context.getApplicationInfo().icon;
        boolean isShowTime = insideNotificationItem.isShowTime();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        if (list == null || list.isEmpty()) {
            i12 = i13;
            bitmap = null;
        } else {
            bitmap = list.get(0);
            if (bitmap == null || defaultNotifyIcon <= 0 || (decodeResource = BitmapFactory.decodeResource(context.getResources(), defaultNotifyIcon)) == null) {
                i12 = i13;
            } else {
                int width = decodeResource.getWidth();
                i12 = i13;
                int height = decodeResource.getHeight();
                decodeResource.recycle();
                bitmap = c.a(bitmap, width, height);
            }
        }
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            builder = rh.c.a(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
        } else {
            builder = new Notification.Builder(context);
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
        }
        bundle.putLong("pushId", j11);
        builder.setExtras(bundle);
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i12;
        }
        builder.setSmallIcon(defaultSmallIconId);
        if (insideNotificationItem.getCompatibleType() != 1) {
            builder.setContentTitle(title);
        }
        builder.setPriority(2);
        builder.setContentText(content);
        builder.setWhen(isShowTime ? System.currentTimeMillis() : 0L);
        builder.setShowWhen(isShowTime);
        builder.setTicker(title);
        int ringerMode = audioManager.getRingerMode();
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        builder.setDefaults(3);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    } else if (ringerMode == 1) {
                        builder.setDefaults(2);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    }
                }
            } else if (ringerMode == 2) {
                builder.setDefaults(2);
                builder.setVibrate(new long[]{0, 100, 200, 300});
            }
        } else if (ringerMode == 2) {
            builder.setDefaults(1);
        }
        Bitmap bitmap2 = (list == null || list.size() <= 1) ? null : list.get(1);
        if (i11 != 1) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(title);
            bigTextStyle.bigText(content);
            builder.setStyle(bigTextStyle);
        }
        if (bitmap2 != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(title);
            bigPictureStyle.setSummaryText(content);
            bigPictureStyle.bigPicture(bitmap2);
            builder.setStyle(bigPictureStyle);
        }
        builder.setAutoCancel(true);
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", a.a(context).a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_pull_rsa", com.vivo.push.c.d.a(context).a().a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", u.a(com.vivo.push.c.d.a(context).a().a()));
        } catch (Exception e11) {
            p.a(TAG, "pushNotificationBySystem encrypt ：" + e11.getMessage());
        }
        new com.vivo.push.b.p(packageName, j11, insideNotificationItem).b(intent);
        builder.setContentIntent(PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, 268435456));
        Notification build = builder.build();
        int k11 = com.vivo.push.e.a().k();
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager != null) {
            try {
                if (k11 == 0) {
                    notificationManager.notify(sNotifyId, build);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (k11 == 1) {
                    notificationManager.notify((int) j11, build);
                    if (aVar != null) {
                        aVar.a();
                    }
                } else {
                    p.a(TAG, "unknow notify style ".concat(String.valueOf(k11)));
                }
            } catch (Exception e12) {
                p.a(TAG, e12);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    public static boolean repealNotifyById(Context context, long j11) {
        int k11 = com.vivo.push.e.a().k();
        if (k11 != 0) {
            if (k11 == 1) {
                return cancelNotify(context, (int) j11);
            }
            p.a(TAG, "unknow cancle notify style ".concat(String.valueOf(k11)));
            return false;
        }
        long b11 = w.b().b("com.vivo.push.notify_key", -1L);
        if (b11 == j11) {
            p.d(TAG, "undo showed message ".concat(String.valueOf(j11)));
            p.a(context, "回收已展示的通知： ".concat(String.valueOf(j11)));
            return cancelNotify(context, sNotifyId);
        }
        p.d(TAG, "current showing message id " + b11 + " not match " + j11);
        p.a(context, "与已展示的通知" + b11 + "与待回收的通知" + j11 + "不匹配");
        return false;
    }

    public static void setNotifyId(int i11) {
        sNotifyId = i11;
    }

    public static void cancelNotify(Context context) {
        cancelNotify(context, sNotifyId);
    }
}
