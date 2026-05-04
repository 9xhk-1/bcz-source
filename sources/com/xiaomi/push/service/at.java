package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import com.xiaomi.push.hu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class at {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f46252a = Log.isLoggable("NCHelper", 3);

    private static int a(NotificationChannel notificationChannel) {
        int i11 = 0;
        try {
            i11 = ((Integer) com.xiaomi.push.bj.b((Object) notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (!f46252a) {
                return i11;
            }
            a("isUserLockedChannel:" + i11 + " " + notificationChannel);
            return i11;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5640a("NCHelper", "is user locked error" + e11);
            return i11;
        }
    }

    private static void b(Context context, String str) {
        if (f46252a) {
            a("recordCopiedChannel:" + str);
        }
        a(context).edit().putBoolean(str, true).apply();
    }

    private static void c(Context context, String str) {
        try {
            ax a11 = ax.a(context, str);
            Set<String> keySet = a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : keySet) {
                if (a11.m6247a(str2)) {
                    arrayList.add(str2);
                    if (f46252a) {
                        a("delete channel copy record:" + str2);
                    }
                }
            }
            a(context, arrayList);
        } catch (Exception unused) {
        }
    }

    @TargetApi(26)
    private static NotificationChannel a(String str, NotificationChannel notificationChannel) {
        CharSequence name;
        int importance;
        String description;
        boolean shouldVibrate;
        boolean shouldShowLights;
        Uri sound;
        AudioAttributes audioAttributes;
        int lockscreenVisibility;
        androidx.media3.common.util.o.a();
        name = notificationChannel.getName();
        importance = notificationChannel.getImportance();
        NotificationChannel a11 = androidx.media3.common.util.n.a(str, name, importance);
        description = notificationChannel.getDescription();
        a11.setDescription(description);
        shouldVibrate = notificationChannel.shouldVibrate();
        a11.enableVibration(shouldVibrate);
        shouldShowLights = notificationChannel.shouldShowLights();
        a11.enableLights(shouldShowLights);
        sound = notificationChannel.getSound();
        audioAttributes = notificationChannel.getAudioAttributes();
        a11.setSound(sound, audioAttributes);
        lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        a11.setLockscreenVisibility(lockscreenVisibility);
        return a11;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @TargetApi(26)
    public static String a(ax axVar, String str, CharSequence charSequence, String str2, int i11, int i12, String str3, String str4) {
        String m6245a = axVar.m6245a(str);
        boolean z11 = f46252a;
        if (z11) {
            a("createChannel: appChannelId:" + m6245a + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i11 + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i12 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel a11 = androidx.media3.common.util.n.a(m6245a, charSequence, i12);
        a11.setDescription(str2);
        a11.enableVibration((i11 & 2) != 0);
        a11.enableLights((i11 & 4) != 0);
        if ((i11 & 1) == 0) {
            a11.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + axVar.m6244a())) {
                a11.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z11) {
            a("create channel:" + a11);
        }
        a(axVar, a11, str4);
        return m6245a;
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    public static void a(Context context, ax axVar, NotificationChannel notificationChannel, int i11, String str) {
        String id2;
        String id3;
        int lockscreenVisibility;
        int importance;
        boolean shouldShowLights;
        boolean shouldVibrate;
        Uri sound;
        if (i11 <= 0) {
            axVar.a(notificationChannel);
            return;
        }
        int a11 = com.xiaomi.push.g.a(context) >= 2 ? e.a(context.getPackageName(), str) : 0;
        id2 = notificationChannel.getId();
        NotificationChannel a12 = a(id2, notificationChannel);
        if ((i11 & 32) != 0) {
            sound = notificationChannel.getSound();
            if (sound != null) {
                a12.setSound(null, null);
            } else {
                a12.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if ((i11 & 16) != 0) {
            shouldVibrate = notificationChannel.shouldVibrate();
            if (shouldVibrate) {
                a12.enableVibration(false);
            } else {
                a12.enableVibration(true);
            }
        }
        if ((i11 & 8) != 0) {
            shouldShowLights = notificationChannel.shouldShowLights();
            if (shouldShowLights) {
                a12.enableLights(false);
            } else {
                a12.enableLights(true);
            }
        }
        if ((i11 & 4) != 0) {
            importance = notificationChannel.getImportance();
            int i12 = importance - 1;
            if (i12 <= 0) {
                i12 = 2;
            }
            a12.setImportance(i12);
        }
        if ((i11 & 2) != 0) {
            lockscreenVisibility = notificationChannel.getLockscreenVisibility();
            a12.setLockscreenVisibility(lockscreenVisibility - 1);
        }
        axVar.a(a12);
        axVar.a(notificationChannel, true);
        String m6244a = axVar.m6244a();
        id3 = notificationChannel.getId();
        e.a(m6244a, id3, a11, 0);
    }

    public static void a(Context context, String str) {
        if (!com.xiaomi.push.j.m6172a(context) || TextUtils.isEmpty(str)) {
            return;
        }
        c(context, str);
        e.a(context, str);
    }

    private static void a(Context context, List<String> list) {
        if (f46252a) {
            a("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
    }

    public static void a(hu huVar) {
        Map<String, String> map;
        if (huVar == null || (map = huVar.f573a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        huVar.f569a = 0;
        huVar.f573a.remove("channel_id");
        huVar.f573a.remove("channel_importance");
        huVar.f573a.remove("channel_name");
        huVar.f573a.remove("channel_description");
        huVar.f573a.remove("channel_perm");
        com.xiaomi.channel.commonutils.logger.b.m5639a("delete channel info by:" + huVar.f573a.get("REMOVE_CHANNEL_MARK"));
        huVar.f573a.remove("REMOVE_CHANNEL_MARK");
    }

    @TargetApi(26)
    private static void a(ax axVar, NotificationChannel notificationChannel, String str) {
        String id2;
        int i11;
        char c11;
        int importance;
        NotificationChannel notificationChannel2;
        String id3;
        Context m6243a = axVar.m6243a();
        id2 = notificationChannel.getId();
        String a11 = ax.a(id2, axVar.m6244a());
        boolean z11 = f46252a;
        if (z11) {
            a("appChannelId:" + id2 + " oldChannelId:" + a11);
        }
        if (com.xiaomi.push.j.m6172a(m6243a) && !TextUtils.equals(id2, a11)) {
            NotificationManager notificationManager = (NotificationManager) m6243a.getSystemService("notification");
            notificationChannel2 = notificationManager.getNotificationChannel(a11);
            NotificationChannel m6242a = axVar.m6242a(id2);
            if (z11) {
                a("xmsfChannel:" + notificationChannel2);
                a("appChannel:" + m6242a);
            }
            if (notificationChannel2 != null) {
                NotificationChannel a12 = a(id2, notificationChannel2);
                if (z11) {
                    a("copyXmsf copyXmsfChannel:" + a12);
                }
                if (m6242a != null) {
                    i11 = a(m6242a);
                    axVar.a(a12, i11 == 0);
                    c11 = 3;
                } else {
                    i11 = a(notificationChannel2);
                    id3 = notificationChannel2.getId();
                    a(m6243a, axVar, a12, i11, id3);
                    c11 = 4;
                }
                b(m6243a, id2);
                notificationManager.deleteNotificationChannel(a11);
            } else if (m6242a == null) {
                if (z11) {
                    a("appHack createNotificationChannel:" + notificationChannel);
                }
                axVar.a(notificationChannel);
                c11 = 1;
                i11 = 0;
            } else if (!m6234a(m6243a, id2) && a(notificationChannel, m6242a)) {
                if (z11) {
                    a("appHack updateNotificationChannel:" + notificationChannel);
                }
                i11 = a(m6242a);
                axVar.a(notificationChannel, i11 == 0);
                c11 = 2;
            }
            boolean z12 = c11 != 1 || c11 == 4 || c11 == 3;
            Context m6243a2 = axVar.m6243a();
            String m6244a = axVar.m6244a();
            importance = notificationChannel.getImportance();
            e.a(m6243a2, m6244a, id2, importance, str, z12, i11);
        }
        NotificationChannel m6242a2 = axVar.m6242a(id2);
        if (z11) {
            a("elseLogic getNotificationChannel:" + m6242a2);
        }
        if (m6242a2 == null) {
            axVar.a(notificationChannel);
        }
        i11 = 0;
        c11 = 0;
        if (c11 != 1) {
        }
        Context m6243a22 = axVar.m6243a();
        String m6244a2 = axVar.m6244a();
        importance = notificationChannel.getImportance();
        e.a(m6243a22, m6244a2, id2, importance, str, z12, i11);
    }

    private static void a(String str) {
        com.xiaomi.channel.commonutils.logger.b.m5640a("NCHelper", str);
    }

    @TargetApi(26)
    private static boolean a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        CharSequence name;
        CharSequence name2;
        boolean z11;
        String description;
        String description2;
        int importance;
        int importance2;
        boolean shouldVibrate;
        boolean shouldVibrate2;
        boolean shouldShowLights;
        boolean shouldShowLights2;
        Uri sound;
        Uri sound2;
        int importance3;
        int importance4;
        int importance5;
        int importance6;
        if (notificationChannel != null && notificationChannel2 != null) {
            name = notificationChannel.getName();
            name2 = notificationChannel2.getName();
            boolean equals = TextUtils.equals(name, name2);
            boolean z12 = true;
            if (equals) {
                z11 = false;
            } else {
                if (f46252a) {
                    a("appHack channelConfigLowerCompare:getName");
                }
                z11 = true;
            }
            description = notificationChannel.getDescription();
            description2 = notificationChannel2.getDescription();
            if (!TextUtils.equals(description, description2)) {
                if (f46252a) {
                    a("appHack channelConfigLowerCompare:getDescription");
                }
                z11 = true;
            }
            importance = notificationChannel.getImportance();
            importance2 = notificationChannel2.getImportance();
            if (importance != importance2) {
                importance3 = notificationChannel.getImportance();
                importance4 = notificationChannel2.getImportance();
                notificationChannel.setImportance(Math.min(importance3, importance4));
                if (f46252a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("appHack channelConfigLowerCompare:getImportance  ");
                    importance5 = notificationChannel.getImportance();
                    sb2.append(importance5);
                    sb2.append(" ");
                    importance6 = notificationChannel2.getImportance();
                    sb2.append(importance6);
                    a(sb2.toString());
                }
                z11 = true;
            }
            shouldVibrate = notificationChannel.shouldVibrate();
            shouldVibrate2 = notificationChannel2.shouldVibrate();
            if (shouldVibrate != shouldVibrate2) {
                notificationChannel.enableVibration(false);
                if (f46252a) {
                    a("appHack channelConfigLowerCompare:enableVibration");
                }
                z11 = true;
            }
            shouldShowLights = notificationChannel.shouldShowLights();
            shouldShowLights2 = notificationChannel2.shouldShowLights();
            if (shouldShowLights != shouldShowLights2) {
                notificationChannel.enableLights(false);
                if (f46252a) {
                    a("appHack channelConfigLowerCompare:enableLights");
                }
                z11 = true;
            }
            sound = notificationChannel.getSound();
            boolean z13 = sound != null;
            sound2 = notificationChannel2.getSound();
            if (z13 != (sound2 != null)) {
                notificationChannel.setSound(null, null);
                if (f46252a) {
                    a("appHack channelConfigLowerCompare:setSound");
                }
            } else {
                z12 = z11;
            }
            if (f46252a) {
                a("appHack channelConfigLowerCompare:isDifferent:" + z12);
            }
            return z12;
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m6234a(Context context, String str) {
        if (f46252a) {
            a("checkCopeidChannel:newFullChannelId:" + str + GlideException.a.f28776d + a(context).getBoolean(str, false));
        }
        return a(context).getBoolean(str, false);
    }
}
