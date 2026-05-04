package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import l50.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class NotifyType implements Parcelable {
    public static final Parcelable.Creator<NotifyType> CREATOR = new Parcelable.Creator<NotifyType>() { // from class: com.meizu.cloud.pushsdk.notification.model.NotifyType.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotifyType createFromParcel(Parcel parcel) {
            return new NotifyType(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotifyType[] newArray(int i11) {
            return new NotifyType[i11];
        }
    };
    public static final String LIGHTS = "l";
    public static final String NOTIFY_TYPE = "nt";
    public static final String SOUND = "s";
    public static final String TAG = "notify_type";
    public static final String VIBRATE = "v";
    boolean lights;
    boolean sound;
    boolean vibrate;

    public NotifyType() {
    }

    public static NotifyType parse(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e11) {
                DebugLogger.e("notify_type", "parse json string error " + e11.getMessage());
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

    public boolean isLights() {
        return this.lights;
    }

    public boolean isSound() {
        return this.sound;
    }

    public boolean isVibrate() {
        return this.vibrate;
    }

    public void setLights(boolean z11) {
        this.lights = z11;
    }

    public void setSound(boolean z11) {
        this.sound = z11;
    }

    public void setVibrate(boolean z11) {
        this.vibrate = z11;
    }

    public String toString() {
        return "NotifyType{vibrate=" + this.vibrate + ", lights=" + this.lights + ", sound=" + this.sound + b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.vibrate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.lights ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.sound ? (byte) 1 : (byte) 0);
    }

    public NotifyType(Parcel parcel) {
        this.vibrate = parcel.readByte() != 0;
        this.lights = parcel.readByte() != 0;
        this.sound = parcel.readByte() != 0;
    }

    public static NotifyType parse(JSONObject jSONObject) {
        String str;
        NotifyType notifyType = new NotifyType();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("v")) {
                    notifyType.setVibrate(jSONObject.getInt("v") != 0);
                }
                if (!jSONObject.isNull("l")) {
                    notifyType.setLights(jSONObject.getInt("l") != 0);
                }
                if (!jSONObject.isNull("s")) {
                    notifyType.setSound(jSONObject.getInt("s") != 0);
                }
                return notifyType;
            } catch (JSONException e11) {
                str = "parse json obj error " + e11.getMessage();
            }
        } else {
            str = "no such tag notify_type";
        }
        DebugLogger.e("notify_type", str);
        return notifyType;
    }
}
