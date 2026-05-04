package com.heytap.mcssdk;

import android.content.Context;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
interface IPushService {
    void cancelNotification(JSONObject jSONObject);

    @Deprecated
    void clearNotificationType();

    @Deprecated
    void clearNotificationType(JSONObject jSONObject);

    void clearNotifications();

    void clearNotifications(JSONObject jSONObject);

    void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService);

    void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService);

    void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService);

    void getNotificationStatus();

    void getNotificationStatus(JSONObject jSONObject);

    void getRegister();

    void getRegister(JSONObject jSONObject);

    String getRegisterID();

    void openNotificationSettings();

    void openNotificationSettings(JSONObject jSONObject);

    void pausePush();

    void pausePush(JSONObject jSONObject);

    void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService);

    void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService);

    void requestNotificationPermission();

    void resumePush();

    void resumePush(JSONObject jSONObject);

    @Deprecated
    void setNotificationType(int i11);

    @Deprecated
    void setNotificationType(int i11, JSONObject jSONObject);

    void setPushTime(List<Integer> list, int i11, int i12, int i13, int i14);

    void setPushTime(List<Integer> list, int i11, int i12, int i13, int i14, JSONObject jSONObject);

    void setRegisterID(String str);

    void unRegister();

    void unRegister(JSONObject jSONObject);
}
