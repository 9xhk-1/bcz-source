package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ActVideoSetting implements Parcelable {
    public static final String ACT_URL = "au";
    public static final String ACT_VIDEO_SETTING = "acts";
    public static final Parcelable.Creator<ActVideoSetting> CREATOR = new Parcelable.Creator<ActVideoSetting>() { // from class: com.meizu.cloud.pushsdk.notification.model.ActVideoSetting.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActVideoSetting createFromParcel(Parcel parcel) {
            return new ActVideoSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActVideoSetting[] newArray(int i11) {
            return new ActVideoSetting[i11];
        }
    };
    public static final String TAG = "ActVideoSetting";
    public static final String WIFI_DISPLAY = "wd";
    private String actUrl;
    private boolean wifiDisplay;

    public ActVideoSetting() {
    }

    public static ActVideoSetting parse(String str) {
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

    public String getActUrl() {
        return this.actUrl;
    }

    public boolean isWifiDisplay() {
        return this.wifiDisplay;
    }

    public void setActUrl(String str) {
        this.actUrl = str;
    }

    public void setWifiDisplay(boolean z11) {
        this.wifiDisplay = z11;
    }

    public String toString() {
        return "ActVideoSetting{wifiDisplay=" + this.wifiDisplay + ", actUrl='" + this.actUrl + '\'' + b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.wifiDisplay ? (byte) 1 : (byte) 0);
        parcel.writeString(this.actUrl);
    }

    public ActVideoSetting(Parcel parcel) {
        this.wifiDisplay = parcel.readByte() != 0;
        this.actUrl = parcel.readString();
    }

    public static ActVideoSetting parse(JSONObject jSONObject) {
        String str;
        ActVideoSetting actVideoSetting = new ActVideoSetting();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(WIFI_DISPLAY)) {
                    actVideoSetting.setWifiDisplay(jSONObject.getInt(WIFI_DISPLAY) != 0);
                }
                if (!jSONObject.isNull(ACT_URL)) {
                    actVideoSetting.setActUrl(jSONObject.getString(ACT_URL));
                }
                return actVideoSetting;
            } catch (JSONException e11) {
                str = "parse json obj error " + e11.getMessage();
            }
        } else {
            str = "no such tag ActVideoSetting";
        }
        DebugLogger.e(TAG, str);
        return actVideoSetting;
    }
}
