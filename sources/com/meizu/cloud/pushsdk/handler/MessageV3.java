package com.meizu.cloud.pushsdk.handler;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n6.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MessageV3 implements Parcelable {
    public static final Parcelable.Creator<MessageV3> CREATOR = new Parcelable.Creator<MessageV3>() { // from class: com.meizu.cloud.pushsdk.handler.MessageV3.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageV3 createFromParcel(Parcel parcel) {
            return new MessageV3(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageV3[] newArray(int i11) {
            return new MessageV3[i11];
        }
    };
    private static final String TAG = "Message_V3";
    private String activity;
    private int clickType;
    private String content;
    private String deviceId;
    private boolean isDiscard;
    private AdvanceSetting mAdvanceSetting;
    private AppIconSetting mAppIconSetting;
    private NotificationStyle mNotificationStyle;
    private TimeDisplaySetting mTimeDisplaySetting;
    private String notificationMessage;
    private String packageName;
    private Map<String, String> paramsMap;
    private String pushTimestamp;
    private String seqId;
    private String taskId;
    private String throughMessage;
    private String title;
    private String uploadDataPackageName;
    private String uriPackageName;
    private String webUrl;

    public MessageV3() {
        this.paramsMap = new HashMap();
    }

    public static MessageV3 parse(String str, String str2, String str3, MPushMessage mPushMessage) {
        DebugLogger.e(TAG, "V2 message " + mPushMessage);
        MessageV3 messageV3 = new MessageV3();
        messageV3.setPackageName(str);
        messageV3.setUploadDataPackageName(str);
        messageV3.setDeviceId(str2);
        messageV3.setTaskId(str3);
        messageV3.setTitle(mPushMessage.getTitle());
        messageV3.setContent(mPushMessage.getContent());
        messageV3.setIsDiscard(m.f74525c.equals(mPushMessage.getIsDiscard()));
        messageV3.setClickType(Integer.valueOf(mPushMessage.getClickType()).intValue());
        messageV3.setWhiteList(false);
        messageV3.setDelayedReportMillis(0L);
        for (Map.Entry<String, String> entry : mPushMessage.getExtra().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("activity".equals(key)) {
                messageV3.setActivity(value);
            }
            if ("url".equals(key)) {
                messageV3.setWebUrl(value);
            }
            if ("pk".equals(key)) {
                messageV3.setUriPackageName(value);
            }
            if (NotificationStyle.NOTIFICATION_STYLE.equals(key)) {
                messageV3.setNotificationStyle(NotificationStyle.parse(value));
            }
            if ("as".equals(key)) {
                messageV3.setAdvanceSetting(AdvanceSetting.parse(value));
            }
            if ("is".equals(key)) {
                messageV3.setAppIconSetting(AppIconSetting.parse(value));
            }
            if ("ts".equals(key)) {
                messageV3.setTimeDisplaySetting(TimeDisplaySetting.parse(value));
            }
            if ("bs".equals(key)) {
                messageV3.setBrightRemindSetting(BrightRemindSetting.parse(value));
            }
            if ("as".equals(key)) {
                messageV3.setAdvanceSettingEx(AdvanceSettingEx.parse(value));
            }
            if (AdvertisementOption.ADVERTISEMENT_OPTION.equals(key)) {
                messageV3.setAdvertisementOption(AdvertisementOption.parse(value));
            }
        }
        messageV3.setParamsMap(mPushMessage.getParams());
        String jSONObject = e.a((Map) mPushMessage.getExtra()).toString();
        DebugLogger.e(TAG, "MessageV2 extra json is " + jSONObject);
        if (!TextUtils.isEmpty(jSONObject)) {
            messageV3.setNotificationMessage(jSONObject);
        }
        DebugLogger.i(TAG, "parse V2 message to V3 message " + messageV3);
        return messageV3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActivity() {
        return this.activity;
    }

    public AdvanceSetting getAdvanceSetting() {
        return this.mAdvanceSetting;
    }

    public AdvanceSettingEx getAdvanceSettingEx() {
        return null;
    }

    public AdvertisementOption getAdvertisementOption() {
        return null;
    }

    public AppIconSetting getAppIconSetting() {
        return this.mAppIconSetting;
    }

    public BrightRemindSetting getBrightRemindSetting() {
        return null;
    }

    public int getClickType() {
        return this.clickType;
    }

    public String getContent() {
        return this.content;
    }

    public long getDelayedReportMillis() {
        return 0L;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getNotificationMessage() {
        return this.notificationMessage;
    }

    public NotificationStyle getNotificationStyle() {
        return this.mNotificationStyle;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Map<String, String> getParamsMap() {
        return this.paramsMap;
    }

    public String getPushTimestamp() {
        return this.pushTimestamp;
    }

    public String getSeqId() {
        return this.seqId;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getThroughMessage() {
        return this.throughMessage;
    }

    public TimeDisplaySetting getTimeDisplaySetting() {
        return this.mTimeDisplaySetting;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUploadDataPackageName() {
        return this.uploadDataPackageName;
    }

    public String getUriPackageName() {
        return this.uriPackageName;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean getWhiteList() {
        return false;
    }

    public boolean isDiscard() {
        return this.isDiscard;
    }

    public void setActivity(String str) {
        this.activity = str;
    }

    public void setAdvanceSetting(AdvanceSetting advanceSetting) {
        this.mAdvanceSetting = advanceSetting;
    }

    public void setAppIconSetting(AppIconSetting appIconSetting) {
        this.mAppIconSetting = appIconSetting;
    }

    public void setClickType(int i11) {
        this.clickType = i11;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setIsDiscard(boolean z11) {
        this.isDiscard = z11;
    }

    public void setNotificationMessage(String str) {
        this.notificationMessage = str;
    }

    public void setNotificationStyle(NotificationStyle notificationStyle) {
        this.mNotificationStyle = notificationStyle;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setParamsMap(Map<String, String> map) {
        this.paramsMap = map;
    }

    public void setPushTimestamp(String str) {
        this.pushTimestamp = str;
    }

    public void setSeqId(String str) {
        this.seqId = str;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setThroughMessage(String str) {
        this.throughMessage = str;
    }

    public void setTimeDisplaySetting(TimeDisplaySetting timeDisplaySetting) {
        this.mTimeDisplaySetting = timeDisplaySetting;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUploadDataPackageName(String str) {
        this.uploadDataPackageName = str;
    }

    public void setUriPackageName(String str) {
        this.uriPackageName = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public String toString() {
        return "MessageV3{taskId='" + this.taskId + "', seqId='" + this.seqId + "', deviceId='" + this.deviceId + "', title='" + this.title + "', content='" + this.content + "', packageName='" + this.packageName + "', clickType=" + this.clickType + "', isDiscard=" + this.isDiscard + "', activity='" + this.activity + "', webUrl='" + this.webUrl + "', uriPackageName='" + this.uriPackageName + "', pushTimestamp='" + this.pushTimestamp + "', uploadDataPackageName='" + this.uploadDataPackageName + "', paramsMap=" + this.paramsMap + "', throughMessage='" + this.throughMessage + "', notificationMessage='" + this.notificationMessage + "', mAdvanceSetting=" + this.mAdvanceSetting + "', mAppIconSetting=" + this.mAppIconSetting + "', mNotificationStyle=" + this.mNotificationStyle + "', mTimeDisplaySetting=" + this.mTimeDisplaySetting + '\'' + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.taskId);
        parcel.writeString(this.seqId);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.clickType);
        parcel.writeByte(this.isDiscard ? (byte) 1 : (byte) 0);
        parcel.writeString(this.activity);
        parcel.writeString(this.webUrl);
        parcel.writeString(this.uriPackageName);
        parcel.writeString(this.uploadDataPackageName);
        parcel.writeString(this.pushTimestamp);
        parcel.writeMap(this.paramsMap);
        parcel.writeString(this.throughMessage);
        parcel.writeString(this.notificationMessage);
        parcel.writeParcelable(this.mAdvanceSetting, i11);
        parcel.writeParcelable(this.mAppIconSetting, i11);
        parcel.writeParcelable(this.mNotificationStyle, i11);
        parcel.writeParcelable(this.mTimeDisplaySetting, i11);
    }

    public MessageV3(Parcel parcel) {
        this.paramsMap = new HashMap();
        this.taskId = parcel.readString();
        this.seqId = parcel.readString();
        this.deviceId = parcel.readString();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.packageName = parcel.readString();
        this.clickType = parcel.readInt();
        this.isDiscard = parcel.readByte() != 0;
        this.activity = parcel.readString();
        this.webUrl = parcel.readString();
        this.uriPackageName = parcel.readString();
        this.uploadDataPackageName = parcel.readString();
        this.pushTimestamp = parcel.readString();
        this.paramsMap = parcel.readHashMap(getClass().getClassLoader());
        this.throughMessage = parcel.readString();
        this.notificationMessage = parcel.readString();
        this.mAdvanceSetting = (AdvanceSetting) parcel.readParcelable(AdvanceSetting.class.getClassLoader());
        this.mAppIconSetting = (AppIconSetting) parcel.readParcelable(AppIconSetting.class.getClassLoader());
        this.mNotificationStyle = (NotificationStyle) parcel.readParcelable(NotificationStyle.class.getClassLoader());
        this.mTimeDisplaySetting = (TimeDisplaySetting) parcel.readParcelable(TimeDisplaySetting.class.getClassLoader());
    }

    private static Map<String, String> getParamsMap(JSONObject jSONObject) {
        try {
            HashMap hashMap = new HashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static MessageV3 parse(String str, String str2, String str3, String str4) {
        return parse(str, null, null, str2, str3, null, str4, false, 0L);
    }

    public static MessageV3 parse(String str, String str2, String str3, String str4, String str5) {
        return parse(str, null, null, str2, str3, str4, str5, false, 0L);
    }

    public static MessageV3 parse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return parse(str, str2, str3, str4, str5, str6, str7, false, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0163 A[Catch: JSONException -> 0x0158, TryCatch #1 {JSONException -> 0x0158, blocks: (B:63:0x014b, B:65:0x015d, B:67:0x0163, B:68:0x016a, B:70:0x0172, B:71:0x017d, B:73:0x0185, B:74:0x0190, B:76:0x0196, B:77:0x01a1, B:79:0x01a9), top: B:62:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[Catch: JSONException -> 0x0158, TryCatch #1 {JSONException -> 0x0158, blocks: (B:63:0x014b, B:65:0x015d, B:67:0x0163, B:68:0x016a, B:70:0x0172, B:71:0x017d, B:73:0x0185, B:74:0x0190, B:76:0x0196, B:77:0x01a1, B:79:0x01a9), top: B:62:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185 A[Catch: JSONException -> 0x0158, TryCatch #1 {JSONException -> 0x0158, blocks: (B:63:0x014b, B:65:0x015d, B:67:0x0163, B:68:0x016a, B:70:0x0172, B:71:0x017d, B:73:0x0185, B:74:0x0190, B:76:0x0196, B:77:0x01a1, B:79:0x01a9), top: B:62:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196 A[Catch: JSONException -> 0x0158, TryCatch #1 {JSONException -> 0x0158, blocks: (B:63:0x014b, B:65:0x015d, B:67:0x0163, B:68:0x016a, B:70:0x0172, B:71:0x017d, B:73:0x0185, B:74:0x0190, B:76:0x0196, B:77:0x01a1, B:79:0x01a9), top: B:62:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9 A[Catch: JSONException -> 0x0158, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0158, blocks: (B:63:0x014b, B:65:0x015d, B:67:0x0163, B:68:0x016a, B:70:0x0172, B:71:0x017d, B:73:0x0185, B:74:0x0190, B:76:0x0196, B:77:0x01a1, B:79:0x01a9), top: B:62:0x014b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meizu.cloud.pushsdk.handler.MessageV3 parse(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, long r29) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.handler.MessageV3.parse(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, long):com.meizu.cloud.pushsdk.handler.MessageV3");
    }

    public void setAdvanceSettingEx(AdvanceSettingEx advanceSettingEx) {
    }

    public void setAdvertisementOption(AdvertisementOption advertisementOption) {
    }

    public void setBrightRemindSetting(BrightRemindSetting brightRemindSetting) {
    }

    public void setDelayedReportMillis(long j11) {
    }

    public void setWhiteList(boolean z11) {
    }
}
