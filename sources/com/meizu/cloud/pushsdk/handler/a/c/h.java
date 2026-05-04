package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.h.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private b f39884a;

    /* renamed from: b, reason: collision with root package name */
    private String f39885b;

    /* renamed from: c, reason: collision with root package name */
    private int f39886c;

    public h(Parcel parcel) {
        this.f39884a = (b) parcel.readParcelable(b.class.getClassLoader());
        this.f39885b = parcel.readString();
        this.f39886c = parcel.readInt();
    }

    public b a() {
        return this.f39884a;
    }

    public int b() {
        return this.f39886c;
    }

    public String c() {
        return this.f39885b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WithDrawMessage{controlMessage=" + this.f39884a + ", revokePackageName='" + this.f39885b + "', notifyId=" + this.f39886c + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f39884a, i11);
        parcel.writeString(this.f39885b);
        parcel.writeInt(this.f39886c);
    }

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f39885b = str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull(RemoteMessageConst.Notification.NOTIFY_ID)) {
                this.f39886c = jSONObject.getInt(RemoteMessageConst.Notification.NOTIFY_ID);
            }
        } catch (JSONException e11) {
            DebugLogger.e("WithDrawMessage", "parse WithDrawMessage error " + e11.getMessage());
        }
        this.f39884a = new b(str3, str4, str5);
    }
}
