package com.heytap.mcssdk.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.McsEventConstant;
import com.heytap.mcssdk.constant.PushConstant;
import com.heytap.mcssdk.statis.McsStatisticUtils;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.constant.ConfigConstant;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.NotificationSortMessage;
import com.heytap.msp.push.notification.ISortListener;
import com.heytap.msp.push.notification.PushNotification;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PushNotificationSortManager {
    private int canDelete;
    private int highSize;
    private int normalSize;
    private int notDelete;
    private int keepNumber = 3;
    private List<NotificationSortMessage> canDeleteList = new ArrayList();
    private List<String> deleteList = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SingletonHolder {
        private static final PushNotificationSortManager INSTANCE = new PushNotificationSortManager();

        private SingletonHolder() {
        }
    }

    private void callbackListener(ISortListener iSortListener, boolean z11, PushNotification.Builder builder) {
        if (iSortListener != null) {
            iSortListener.buildCompleted(z11, builder, this.deleteList);
        }
    }

    private DataMessage createDataMessage(Context context, NotificationSortMessage notificationSortMessage) {
        DataMessage dataMessage = new DataMessage(context.getPackageName(), notificationSortMessage.getMessageId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PushConstant.NotificationSort.IS_MCS, "false");
            String statisticData = notificationSortMessage.getStatisticData();
            if (!TextUtils.isEmpty(statisticData)) {
                jSONObject.put(PushConstant.NotificationSort.CLIENT_STATISTIC_DATA, statisticData);
            }
            dataMessage.setStatisticsExtra(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return dataMessage;
    }

    private boolean dealCurrentMessage(NotificationManager notificationManager, Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        boolean z11 = true;
        if (this.canDelete + this.notDelete < this.keepNumber) {
            if (notificationSortMessage.getAutoDelete() == -1) {
                notificationSortMessage.setGroup(PushConstant.Notification.DEFAULT_NOTIFICATION_NOT_DELETE_GROUP_KEY + context.getPackageName());
            } else {
                notificationSortMessage.setGroup(PushConstant.Notification.DEFAULT_NOTIFICATION_CAN_DELETE_GROUP_KEY + context.getPackageName());
            }
        } else if (notificationSortMessage.getAutoDelete() == -1) {
            notificationSortMessage.setGroup(PushConstant.Notification.DEFAULT_NOTIFICATION_NOT_DELETE_GROUP_KEY + context.getPackageName());
            int i11 = this.keepNumber - this.notDelete;
            if (i11 > 0) {
                deleteLowestMessage(context, notificationManager, i11 - 1);
            } else {
                Notification createDefaultGroupNotification = NotificationHelper.createDefaultGroupNotification(context, notificationSortMessage.getGroup(), builder);
                if (createDefaultGroupNotification != null) {
                    notificationManager.notify(4096, createDefaultGroupNotification);
                }
            }
        } else {
            z11 = judgeShowCurrentMessage(context, notificationManager, notificationSortMessage);
        }
        if (z11) {
            doMessageConfig(builder, notificationSortMessage);
            return z11;
        }
        McsStatisticUtils.statisticEvent(context, McsEventConstant.EventId.EVENT_ID_PUSH_NO_SHOW_BY_FOLD, createDataMessage(context, notificationSortMessage));
        return z11;
    }

    private void dealShowedNotificationList(NotificationManager notificationManager, Context context) {
        initParams(NotificationHelper.getActiveNotifications(notificationManager, context.getPackageName()));
    }

    private void deleteLowestMessage(Context context, NotificationManager notificationManager, int i11) {
        keepMessage(this.canDeleteList, i11);
        sendCommandOrStatic(context, notificationManager, this.canDeleteList);
    }

    private void deleteNotification(Context context, NotificationManager notificationManager, JSONArray jSONArray, List<NotificationSortMessage> list, List<DataMessage> list2) {
        for (NotificationSortMessage notificationSortMessage : list) {
            if (notificationSortMessage.isMcs()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_NOTIFY_ID, notificationSortMessage.getNotifyId());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                list2.add(createDataMessage(context, notificationSortMessage));
                this.deleteList.add(notificationSortMessage.getMessageId());
            }
            notificationManager.cancel(notificationSortMessage.getNotifyId());
        }
    }

    private void doMessageConfig(PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, notificationSortMessage.getAutoDelete());
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, notificationSortMessage.getImportantLevel());
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, notificationSortMessage.getMessageId());
        bundle.putLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, System.currentTimeMillis());
        bundle.putBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, false);
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA, notificationSortMessage.getStatisticData());
        builder.addExtras(bundle);
        builder.setGroup(notificationSortMessage.getGroup());
    }

    private boolean doTask(PushNotification.Builder builder, int i11, int i12, String str, String str2) {
        Context context = PushService.getInstance().getContext();
        if (builder == null || context == null) {
            return false;
        }
        NotificationManager notificationManager = NotificationHelper.getNotificationManager(context);
        NotificationSortMessage notificationSortMessage = new NotificationSortMessage(str, i12, i11, false, System.currentTimeMillis(), str2);
        if (!judgeMessageNeedDoAntiDeleteAndAntiFolderLogic(context, notificationManager, notificationSortMessage, builder)) {
            return true;
        }
        dealShowedNotificationList(notificationManager, context);
        return dealCurrentMessage(notificationManager, context, builder, notificationSortMessage);
    }

    public static PushNotificationSortManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private void initCanDeleteAndNotDelete(int i11) {
        if (i11 == -1) {
            this.notDelete++;
        } else if (i11 == 1) {
            this.canDelete++;
        }
    }

    private void initHighAndNormalSize(int i11) {
        if (i11 == 7) {
            this.highSize++;
        } else if (i11 == 5) {
            this.normalSize++;
        }
    }

    private void initList(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getAutoDelete() != 1) {
            return;
        }
        if (this.canDeleteList.size() != 0) {
            for (int size = this.canDeleteList.size() - 1; size >= 0; size--) {
                NotificationSortMessage notificationSortMessage2 = this.canDeleteList.get(size);
                if (notificationSortMessage.getImportantLevel() >= notificationSortMessage2.getImportantLevel() && notificationSortMessage.getPostTime() >= notificationSortMessage2.getPostTime()) {
                    this.canDeleteList.add(size + 1, notificationSortMessage2);
                    return;
                }
            }
        }
        this.canDeleteList.add(0, notificationSortMessage);
    }

    private void initParams(StatusBarNotification[] statusBarNotificationArr) {
        resetParams();
        if (statusBarNotificationArr == null || statusBarNotificationArr.length == 0) {
            return;
        }
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            Bundle bundle = statusBarNotification.getNotification().extras;
            boolean z11 = bundle.getBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, true);
            long j11 = bundle.getLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, statusBarNotification.getPostTime());
            String string = bundle.getString(ConfigConstant.NotificationSort.EXTRA_MESSAGE_ID, "");
            int i11 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, 1);
            int i12 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, 7);
            NotificationSortMessage notificationSortMessage = new NotificationSortMessage(string, i12, i11, z11, j11, statusBarNotification.getId(), bundle.getString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA));
            initCanDeleteAndNotDelete(i11);
            initHighAndNormalSize(i12);
            initList(notificationSortMessage);
        }
    }

    private boolean judgeShowCurrentMessage(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage) {
        int i11 = this.notDelete;
        int i12 = this.keepNumber;
        boolean z11 = false;
        if (i11 >= i12) {
            return false;
        }
        int i13 = i12 - i11;
        if (notificationSortMessage.getImportantLevel() == 7 || (notificationSortMessage.getImportantLevel() != 5 ? this.highSize + this.normalSize < i13 : this.highSize < i13)) {
            z11 = true;
        }
        if (z11) {
            deleteLowestMessage(context, notificationManager, i13 - 1);
        }
        return z11;
    }

    private int keepMessage(List<NotificationSortMessage> list, int i11) {
        int size = list == null ? 0 : list.size();
        if (i11 <= 0 || size == 0) {
            return i11;
        }
        if (size < i11) {
            int i12 = i11 - size;
            list.clear();
            return i12;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            list.remove((size - 1) - i13);
        }
        return 0;
    }

    private void resetParams() {
        this.canDelete = 0;
        this.notDelete = 0;
        this.highSize = 0;
        this.normalSize = 0;
        this.canDeleteList.clear();
        this.deleteList.clear();
    }

    private void sendCommandOrStatic(Context context, NotificationManager notificationManager, List<NotificationSortMessage> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        deleteNotification(context, notificationManager, jSONArray, list, arrayList);
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put(PushConstant.NotificationSort.SORT_ARRAY, jSONArray);
                HeytapPushManager.cancelNotification(jSONObject);
            } catch (JSONException unused) {
            }
        }
        if (arrayList.size() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(McsEventConstant.EventId.EVENT_ID_PUSH_DELETE_BY_FOLD, arrayList);
            StatisticUtils.statisticEvent(context, hashMap);
        }
    }

    public boolean judgeMessageNeedDoAntiDeleteAndAntiFolderLogic(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage, PushNotification.Builder builder) {
        if (notificationSortMessage.getAutoDelete() == 0 || Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        if (!NotificationHelper.isExistNotificationsByPkgAndId(notificationManager, context.getPackageName(), 4096)) {
            return true;
        }
        notificationSortMessage.setGroup(PushConstant.Notification.DEFAULT_NOTIFICATION_NOT_DELETE_GROUP_KEY + context.getPackageName());
        doMessageConfig(builder, notificationSortMessage);
        return false;
    }

    public void startBuild(PushNotification.Builder builder, ISortListener iSortListener) {
        if (builder == null) {
            return;
        }
        callbackListener(iSortListener, doTask(builder, builder.getAutoDelete(), builder.getImportantLevel(), builder.getMessageId(), builder.getStatisticData()), builder);
    }
}
