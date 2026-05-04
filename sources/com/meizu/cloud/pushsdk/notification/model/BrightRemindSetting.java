package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BrightRemindSetting implements Parcelable {
    public static final String BRIGHT_REMIND = "br";
    public static final String BRIGHT_REMIND_SETTING = "bs";
    public static final Parcelable.Creator<BrightRemindSetting> CREATOR = new Parcelable.Creator<BrightRemindSetting>() { // from class: com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BrightRemindSetting createFromParcel(Parcel parcel) {
            return new BrightRemindSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BrightRemindSetting[] newArray(int i11) {
            return new BrightRemindSetting[i11];
        }
    };
    public static final String TAG = "BrightRemindSetting";
    private boolean isBrightRemind;

    public BrightRemindSetting() {
    }

    public static BrightRemindSetting parse(String str) {
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

    public boolean getIsBrightRemind() {
        return this.isBrightRemind;
    }

    public void setIsBrightRemind(boolean z11) {
        this.isBrightRemind = z11;
    }

    public String toString() {
        return "BrightRemindSetting{isBrightRemind=" + this.isBrightRemind + b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.isBrightRemind ? (byte) 1 : (byte) 0);
    }

    public BrightRemindSetting(Parcel parcel) {
        this.isBrightRemind = parcel.readByte() == 1;
    }

    public static BrightRemindSetting parse(JSONObject jSONObject) {
        String str;
        BrightRemindSetting brightRemindSetting = new BrightRemindSetting();
        if (jSONObject != null) {
            try {
                if (jSONObject.isNull("br")) {
                    return brightRemindSetting;
                }
                brightRemindSetting.setIsBrightRemind(jSONObject.getInt("br") != 0);
                return brightRemindSetting;
            } catch (JSONException e11) {
                str = "parse json obj error " + e11.getMessage();
            }
        } else {
            str = "no such tag BrightRemindSetting";
        }
        DebugLogger.e(TAG, str);
        return brightRemindSetting;
    }
}
