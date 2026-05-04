package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AdvanceSetting implements Parcelable {
    public static final String ADVANCE_SETTING = "as";
    public static final String CLEAR_NOTIFICATION = "cn";
    public static final Parcelable.Creator<AdvanceSetting> CREATOR = new Parcelable.Creator<AdvanceSetting>() { // from class: com.meizu.cloud.pushsdk.notification.model.AdvanceSetting.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AdvanceSetting createFromParcel(Parcel parcel) {
            return new AdvanceSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AdvanceSetting[] newArray(int i11) {
            return new AdvanceSetting[i11];
        }
    };
    public static final String HEAD_UP_NOTIFICATION = "hn";
    public static final String NETWORK_TYPE = "it";
    public static final String NOTIFY_TYPE = "nt";
    public static final String TAG = "advance_setting";
    private boolean clearNotification;
    private boolean headUpNotification;
    private int netWorkType;
    private NotifyType notifyType;

    public AdvanceSetting() {
        this.netWorkType = 1;
        this.clearNotification = true;
        this.headUpNotification = true;
    }

    public static AdvanceSetting parse(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e11) {
                DebugLogger.e(TAG, "parse json string error " + e11.getMessage());
            }
            return parse(jSONObject);
        }
        jSONObject = null;
        return parse(jSONObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getNetWorkType() {
        return this.netWorkType;
    }

    public NotifyType getNotifyType() {
        return this.notifyType;
    }

    public boolean isClearNotification() {
        return this.clearNotification;
    }

    public boolean isHeadUpNotification() {
        return this.headUpNotification;
    }

    public void setClearNotification(boolean z11) {
        this.clearNotification = z11;
    }

    public void setHeadUpNotification(boolean z11) {
        this.headUpNotification = z11;
    }

    public void setNetWorkType(int i11) {
        this.netWorkType = i11;
    }

    public void setNotifyType(NotifyType notifyType) {
        this.notifyType = notifyType;
    }

    public String toString() {
        return "AdvanceSetting{netWorkType=" + this.netWorkType + ", notifyType=" + this.notifyType + ", clearNotification=" + this.clearNotification + ", headUpNotification=" + this.headUpNotification + b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.netWorkType);
        parcel.writeParcelable(this.notifyType, i11);
        parcel.writeByte(this.clearNotification ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.headUpNotification ? (byte) 1 : (byte) 0);
    }

    public AdvanceSetting(Parcel parcel) {
        this.netWorkType = 1;
        this.clearNotification = true;
        this.headUpNotification = true;
        this.netWorkType = parcel.readInt();
        this.notifyType = (NotifyType) parcel.readParcelable(NotifyType.class.getClassLoader());
        this.clearNotification = parcel.readByte() != 0;
        this.headUpNotification = parcel.readByte() != 0;
    }

    public static AdvanceSetting parse(JSONObject jSONObject) {
        String str;
        AdvanceSetting advanceSetting = new AdvanceSetting();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("it")) {
                    advanceSetting.setNetWorkType(jSONObject.getInt("it"));
                }
                if (!jSONObject.isNull("nt")) {
                    advanceSetting.setNotifyType(NotifyType.parse(jSONObject.getJSONObject("nt")));
                }
                if (!jSONObject.isNull(CLEAR_NOTIFICATION)) {
                    advanceSetting.setClearNotification(jSONObject.getInt(CLEAR_NOTIFICATION) != 0);
                }
                if (!jSONObject.isNull(HEAD_UP_NOTIFICATION)) {
                    advanceSetting.setHeadUpNotification(jSONObject.getInt(HEAD_UP_NOTIFICATION) != 0);
                }
                return advanceSetting;
            } catch (JSONException e11) {
                str = "parse json obj error " + e11.getMessage();
            }
        } else {
            str = "no such tag advance_setting";
        }
        DebugLogger.e(TAG, str);
        return advanceSetting;
    }
}
