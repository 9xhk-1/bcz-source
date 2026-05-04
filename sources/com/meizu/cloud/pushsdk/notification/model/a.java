package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import ma.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.meizu.cloud.pushsdk.notification.model.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private int f39915a;

    /* renamed from: b, reason: collision with root package name */
    private String f39916b;

    public a() {
        this.f39915a = 0;
    }

    public static int b(MessageV3 messageV3) {
        a a11 = a(messageV3);
        if (a11 != null) {
            return a11.a();
        }
        return 0;
    }

    private static a c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return b(new JSONObject(str).getString(b.I0));
        } catch (JSONException e11) {
            DebugLogger.e("NotifyOption", "parse notificationMessage error " + e11.getMessage());
            return null;
        }
    }

    public int a() {
        return this.f39915a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotifyOption{notifyId=" + this.f39915a + ", notifyKey='" + this.f39916b + '\'' + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f39915a);
        parcel.writeString(this.f39916b);
    }

    public a(Parcel parcel) {
        this.f39915a = 0;
        this.f39915a = parcel.readInt();
        this.f39916b = parcel.readString();
    }

    public static a a(MessageV3 messageV3) {
        a c11;
        try {
            c11 = !TextUtils.isEmpty(messageV3.getNotificationMessage()) ? a(new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getJSONObject(b.I0)) : null;
        } catch (Exception e11) {
            DebugLogger.e("NotifyOption", "parse flyme NotifyOption setting error " + e11.getMessage() + " so get from notificationMessage");
            c11 = c(messageV3.getNotificationMessage());
        }
        DebugLogger.i("NotifyOption", "current notify option is " + c11);
        return c11;
    }

    public static a b(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e11) {
                DebugLogger.e("NotifyOption", "parse json string error " + e11.getMessage());
            }
            return a(jSONObject);
        }
        jSONObject = null;
        return a(jSONObject);
    }

    public static a a(JSONObject jSONObject) {
        String str;
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("ni")) {
                    aVar.a(jSONObject.getInt("ni"));
                }
                if (!jSONObject.isNull("nk")) {
                    aVar.a(jSONObject.getString("nk"));
                }
                return aVar;
            } catch (JSONException e11) {
                str = "parse json obj error " + e11.getMessage();
            }
        } else {
            str = "no such tag NotifyOption";
        }
        DebugLogger.e("NotifyOption", str);
        return aVar;
    }

    public String b() {
        return this.f39916b;
    }

    public void a(int i11) {
        this.f39915a = i11;
    }

    public void a(String str) {
        this.f39916b = str;
    }
}
