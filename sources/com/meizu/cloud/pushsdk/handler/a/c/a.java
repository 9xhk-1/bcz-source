package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.a.1
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
    private int f39847a;

    /* renamed from: b, reason: collision with root package name */
    private int f39848b;

    /* renamed from: c, reason: collision with root package name */
    private int f39849c;

    public a() {
    }

    public int a() {
        return this.f39847a;
    }

    public void b(int i11) {
        this.f39848b = i11;
    }

    public void c(int i11) {
        this.f39849c = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Control{pushType=" + this.f39847a + ", cached=" + this.f39848b + ", cacheNum=" + this.f39849c + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f39847a);
        parcel.writeInt(this.f39848b);
        parcel.writeInt(this.f39849c);
    }

    public a(Parcel parcel) {
        this.f39847a = parcel.readInt();
        this.f39848b = parcel.readInt();
        this.f39849c = parcel.readInt();
    }

    public static a a(JSONObject jSONObject) {
        String str;
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("pushType")) {
                    aVar.a(jSONObject.getInt("pushType"));
                }
                if (!jSONObject.isNull("cached")) {
                    aVar.b(jSONObject.getInt("cached"));
                }
                if (!jSONObject.isNull("cacheNum")) {
                    aVar.c(jSONObject.getInt("cacheNum"));
                }
                return aVar;
            } catch (JSONException e11) {
                str = " parse control message error " + e11.getMessage();
            }
        } else {
            str = "no control message can parse ";
        }
        DebugLogger.e("ctl", str);
        return aVar;
    }

    public void a(int i11) {
        this.f39847a = i11;
    }
}
