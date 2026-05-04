package com.baicizhan.client.fm.data;

import android.content.Context;
import androidx.annotation.DrawableRes;
import bp.a;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import com.baicizhan.client.fm.activity.ExamAudioPlayActivity;
import com.baicizhan.client.fm.activity.ReadingPlanPlayActivity;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class NotifyInfo {
    private static String FM_NOTIFY_INFO_JSON;
    private static String PAST_EXAM_LISTEN_NOTIFY_INFO_JSON;
    private static String READ_PLAN_NOTIFY_INFO_JSON;
    public String contentText;
    public String contentTitle;

    @DrawableRes
    public int largeIcon;

    @DrawableRes
    public int smallIcon;
    public String targetActivityName;
    public String ticker;

    public static NotifyInfo fromJson(String json) {
        return (NotifyInfo) new JsonSerializer(new a<NotifyInfo>() { // from class: com.baicizhan.client.fm.data.NotifyInfo.2
        }.getType()).readFromJson(json);
    }

    public static String getFmNotifyInfoJson(Context context) {
        if (FM_NOTIFY_INFO_JSON == null) {
            NotifyInfo notifyInfo = new NotifyInfo();
            notifyInfo.targetActivityName = AudioCenterActivity.class.getName();
            notifyInfo.smallIcon = R.drawable.ic_baicizhan_notification_small;
            notifyInfo.largeIcon = R.drawable.baofm_notification;
            notifyInfo.contentTitle = context.getString(R.string.fm_notification_title);
            notifyInfo.contentText = context.getString(R.string.fm_notification_subtitle);
            notifyInfo.ticker = context.getString(R.string.fm_notificaiton_ticker);
            FM_NOTIFY_INFO_JSON = notifyInfo.toString();
        }
        return FM_NOTIFY_INFO_JSON;
    }

    public static String getPastExamListenNotifyInfoJson(Context context) {
        if (PAST_EXAM_LISTEN_NOTIFY_INFO_JSON == null) {
            NotifyInfo notifyInfo = new NotifyInfo();
            notifyInfo.targetActivityName = ExamAudioPlayActivity.class.getName();
            notifyInfo.smallIcon = R.drawable.ic_baicizhan_notification_small;
            notifyInfo.largeIcon = R.drawable.baofm_notification;
            notifyInfo.contentTitle = context.getString(R.string.past_exam_listen_notification_title);
            notifyInfo.contentText = context.getString(R.string.past_exam_listen_notification_subtitle);
            notifyInfo.ticker = context.getString(R.string.past_exam_listen_notification_ticker);
            PAST_EXAM_LISTEN_NOTIFY_INFO_JSON = notifyInfo.toString();
        }
        return PAST_EXAM_LISTEN_NOTIFY_INFO_JSON;
    }

    public static String getReadPlanNotifyInfoJson(Context context) {
        if (READ_PLAN_NOTIFY_INFO_JSON == null) {
            NotifyInfo notifyInfo = new NotifyInfo();
            notifyInfo.targetActivityName = ReadingPlanPlayActivity.class.getName();
            notifyInfo.smallIcon = R.drawable.ic_baicizhan_notification_small;
            notifyInfo.largeIcon = R.drawable.baofm_notification;
            notifyInfo.contentTitle = context.getString(R.string.read_plan_notification_title);
            notifyInfo.contentText = context.getString(R.string.read_plan_notification_subtitle);
            notifyInfo.ticker = context.getString(R.string.read_plan_notification_ticker);
            READ_PLAN_NOTIFY_INFO_JSON = notifyInfo.toString();
        }
        return READ_PLAN_NOTIFY_INFO_JSON;
    }

    public String toString() {
        return new JsonSerializer(new a<NotifyInfo>() { // from class: com.baicizhan.client.fm.data.NotifyInfo.1
        }.getType()).writeToJson(this);
    }
}
