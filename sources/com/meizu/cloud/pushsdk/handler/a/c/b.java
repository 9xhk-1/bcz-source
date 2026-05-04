package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.b.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f39850a;

    /* renamed from: b, reason: collision with root package name */
    private a f39851b;

    /* renamed from: c, reason: collision with root package name */
    private f f39852c;

    public b() {
    }

    public a a() {
        return this.f39851b;
    }

    public f b() {
        return this.f39852c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ControlMessage{controlMessage='" + this.f39850a + "', control=" + this.f39851b + ", statics=" + this.f39852c + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f39850a);
        parcel.writeParcelable(this.f39851b, i11);
        parcel.writeParcelable(this.f39852c, i11);
    }

    public b(Parcel parcel) {
        this.f39850a = parcel.readString();
        this.f39851b = (a) parcel.readParcelable(a.class.getClassLoader());
        this.f39852c = (f) parcel.readParcelable(f.class.getClassLoader());
    }

    public static b a(String str) {
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.a(a.a(jSONObject.getJSONObject("ctl")));
            bVar.a(f.a(jSONObject.getJSONObject("statics")));
            return bVar;
        } catch (Exception e11) {
            DebugLogger.e("ControlMessage", "parse control message error " + e11.getMessage());
            bVar.a(new f());
            bVar.a(new a());
            return bVar;
        }
    }

    public b(String str, String str2, String str3) {
        this.f39850a = str;
        if (TextUtils.isEmpty(str)) {
            this.f39851b = new a();
            this.f39852c = new f();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39851b = a.a(jSONObject.getJSONObject("ctl"));
            f a11 = f.a(jSONObject.getJSONObject("statics"));
            this.f39852c = a11;
            a11.c(str2);
            this.f39852c.d(str3);
        } catch (JSONException e11) {
            this.f39851b = new a();
            this.f39852c = new f();
            DebugLogger.e("ControlMessage", "parse control message error " + e11.getMessage());
        }
    }

    public void a(a aVar) {
        this.f39851b = aVar;
    }

    public void a(f fVar) {
        this.f39852c = fVar;
    }
}
