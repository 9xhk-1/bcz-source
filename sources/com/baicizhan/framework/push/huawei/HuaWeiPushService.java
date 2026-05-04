package com.baicizhan.framework.push.huawei;

import android.text.TextUtils;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.push.SendException;
import java.util.Arrays;
import oc.i;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class HuaWeiPushService extends HmsMessageService {

    /* renamed from: b, reason: collision with root package name */
    public static final String f17803b = "huawei_push";

    public final void c(String token) {
        c.i("huawei_push", "sending token to server. token:" + token, new Object[0]);
        i.f().a("huawei", token);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage message) {
        c.i("huawei_push", "onMessageReceived is called", new Object[0]);
        if (message == null) {
            c.d("huawei_push", "Received message entity is null!", new Object[0]);
            return;
        }
        c.i("huawei_push", "getCollapseKey: " + message.getCollapseKey() + "\n getData: " + message.getData() + "\n getFrom: " + message.getFrom() + "\n getTo: " + message.getTo() + "\n getMessageId: " + message.getMessageId() + "\n getMessageType: " + message.getMessageType() + "\n getSendTime: " + message.getSentTime() + "\n getTtl: " + message.getTtl() + "\n getSendMode: " + message.getSendMode() + "\n getReceiptMode: " + message.getReceiptMode() + "\n getOriginalUrgency: " + message.getOriginalUrgency() + "\n getUrgency: " + message.getUrgency() + "\n getToken: " + message.getToken(), new Object[0]);
        RemoteMessage.Notification notification = message.getNotification();
        if (notification != null) {
            c.i("huawei_push", "\n getTitle: " + notification.getTitle() + "\n getTitleLocalizationKey: " + notification.getTitleLocalizationKey() + "\n getTitleLocalizationArgs: " + Arrays.toString(notification.getTitleLocalizationArgs()) + "\n getBody: " + notification.getBody() + "\n getBodyLocalizationKey: " + notification.getBodyLocalizationKey() + "\n getBodyLocalizationArgs: " + Arrays.toString(notification.getBodyLocalizationArgs()) + "\n getIcon: " + notification.getIcon() + "\n getImageUrl: " + notification.getImageUrl() + "\n getSound: " + notification.getSound() + "\n getTag: " + notification.getTag() + "\n getColor: " + notification.getColor() + "\n getClickAction: " + notification.getClickAction() + "\n getIntentUri: " + notification.getIntentUri() + "\n getChannelId: " + notification.getChannelId() + "\n getLink: " + notification.getLink() + "\n getNotifyId: " + notification.getNotifyId() + "\n isDefaultLight: " + notification.isDefaultLight() + "\n isDefaultSound: " + notification.isDefaultSound() + "\n isDefaultVibrate: " + notification.isDefaultVibrate() + "\n getWhen: " + notification.getWhen() + "\n getLightSettings: " + Arrays.toString(notification.getLightSettings()) + "\n isLocalOnly: " + notification.isLocalOnly() + "\n getBadgeNumber: " + notification.getBadgeNumber() + "\n isAutoCancel: " + notification.isAutoCancel() + "\n getImportance: " + notification.getImportance() + "\n getTicker: " + notification.getTicker() + "\n getVibrateConfig: " + Arrays.toString(notification.getVibrateConfig()) + "\n getVisibility: " + notification.getVisibility(), new Object[0]);
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageSent(String msgId) {
        c.i("huawei_push", "onMessageSent called, Message id:" + msgId, new Object[0]);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String token) {
        c.i("huawei_push", "received refresh token:" + token, new Object[0]);
        if (TextUtils.isEmpty(token)) {
            return;
        }
        c(token);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onSendError(String msgId, Exception exception) {
        c.i("huawei_push", "onSendError called, message id:" + msgId + ", ErrCode:" + ((SendException) exception).getErrorCode() + ", description:" + exception.getMessage(), new Object[0]);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onTokenError(Exception e11) {
        super.onTokenError(e11);
    }
}
