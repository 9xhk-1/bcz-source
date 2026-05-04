package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TimeDisplaySetting implements Parcelable {
    public static final Parcelable.Creator<TimeDisplaySetting> CREATOR = new Parcelable.Creator<TimeDisplaySetting>() { // from class: com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeDisplaySetting createFromParcel(Parcel parcel) {
            return new TimeDisplaySetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeDisplaySetting[] newArray(int i11) {
            return new TimeDisplaySetting[i11];
        }
    };
    public static final String END_SHOW_TIME = "et";
    public static final String START_SHOW_TIME = "st";
    public static final String TAG = "time_display_setting";
    public static final String TIME_DISPLAY = "td";
    public static final String TIME_DISPLAY_SETTING = "ts";
    private String endShowTime;
    private boolean isTimeDisplay;
    private String startShowTime;

    public TimeDisplaySetting() {
    }

    public static TimeDisplaySetting parse(String str) {
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

    public String getEndShowTime() {
        return this.endShowTime;
    }

    public String getStartShowTime() {
        return this.startShowTime;
    }

    public boolean isTimeDisplay() {
        return this.isTimeDisplay;
    }

    public void setEndShowTime(String str) {
        this.endShowTime = str;
    }

    public void setIsTimeDisplay(boolean z11) {
        this.isTimeDisplay = z11;
    }

    public void setStartShowTime(String str) {
        this.startShowTime = str;
    }

    public String toString() {
        return "TimeDisplaySetting{isTimeDisplay=" + this.isTimeDisplay + ", startShowTime='" + this.startShowTime + "', endShowTime='" + this.endShowTime + '\'' + b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.isTimeDisplay ? (byte) 1 : (byte) 0);
        parcel.writeString(this.startShowTime);
        parcel.writeString(this.endShowTime);
    }

    public TimeDisplaySetting(Parcel parcel) {
        this.isTimeDisplay = parcel.readByte() != 0;
        this.startShowTime = parcel.readString();
        this.endShowTime = parcel.readString();
    }

    public static TimeDisplaySetting parse(JSONObject jSONObject) {
        String str;
        TimeDisplaySetting timeDisplaySetting = new TimeDisplaySetting();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(TIME_DISPLAY)) {
                    timeDisplaySetting.setIsTimeDisplay(jSONObject.getInt(TIME_DISPLAY) != 0);
                }
                if (!jSONObject.isNull("st")) {
                    timeDisplaySetting.setStartShowTime(jSONObject.getString("st"));
                }
                if (!jSONObject.isNull("et")) {
                    timeDisplaySetting.setEndShowTime(jSONObject.getString("et"));
                }
                return timeDisplaySetting;
            } catch (JSONException e11) {
                str = "parse json obj error " + e11.getMessage();
            }
        } else {
            str = "no such tag time_display_setting";
        }
        DebugLogger.e(TAG, str);
        return timeDisplaySetting;
    }
}
