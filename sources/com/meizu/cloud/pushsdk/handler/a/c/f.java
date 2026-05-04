package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.f.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f39874a;

    /* renamed from: b, reason: collision with root package name */
    private String f39875b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39876c;

    /* renamed from: d, reason: collision with root package name */
    private String f39877d;

    /* renamed from: e, reason: collision with root package name */
    private String f39878e;

    public f() {
        this.f39876c = false;
    }

    public static f a(JSONObject jSONObject) {
        String str;
        f fVar = new f();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("taskId")) {
                    fVar.a(jSONObject.getString("taskId"));
                }
                if (!jSONObject.isNull("time")) {
                    fVar.b(jSONObject.getString("time"));
                }
                if (!jSONObject.isNull("pushExtra")) {
                    fVar.a(jSONObject.getInt("pushExtra") == 0);
                }
                return fVar;
            } catch (JSONException e11) {
                str = " parse statics message error " + e11.getMessage();
            }
        } else {
            str = "no control statics can parse ";
        }
        DebugLogger.e("statics", str);
        return fVar;
    }

    public String b() {
        return this.f39875b;
    }

    public void c(String str) {
        this.f39877d = str;
    }

    public String d() {
        return this.f39877d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f39878e;
    }

    public String toString() {
        return "Statics{taskId='" + this.f39874a + "', time='" + this.f39875b + "', pushExtra=" + this.f39876c + ", deviceId='" + this.f39877d + "', seqId='" + this.f39878e + '\'' + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f39874a);
        parcel.writeString(this.f39875b);
        parcel.writeByte(this.f39876c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f39877d);
        parcel.writeString(this.f39878e);
    }

    public f(Parcel parcel) {
        this.f39876c = false;
        this.f39874a = parcel.readString();
        this.f39875b = parcel.readString();
        this.f39876c = parcel.readByte() != 0;
        this.f39877d = parcel.readString();
        this.f39878e = parcel.readString();
    }

    public String a() {
        return this.f39874a;
    }

    public void b(String str) {
        this.f39875b = str;
    }

    public boolean c() {
        return this.f39876c;
    }

    public void d(String str) {
        this.f39878e = str;
    }

    public void a(String str) {
        this.f39874a = str;
    }

    public void a(boolean z11) {
        this.f39876c = z11;
    }
}
