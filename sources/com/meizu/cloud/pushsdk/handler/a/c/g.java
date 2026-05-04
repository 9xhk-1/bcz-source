package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.g.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private int f39879a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39880b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f39881c;

    /* renamed from: d, reason: collision with root package name */
    private b f39882d;

    /* renamed from: e, reason: collision with root package name */
    private String f39883e;

    public g(Parcel parcel) {
        this.f39879a = parcel.readInt();
        this.f39880b = parcel.readByte() != 0;
        this.f39881c = parcel.createStringArrayList();
        this.f39882d = (b) parcel.readParcelable(b.class.getClassLoader());
        this.f39883e = parcel.readString();
    }

    public int a() {
        return this.f39879a;
    }

    public boolean b() {
        return this.f39880b;
    }

    public List<String> c() {
        return this.f39881c;
    }

    public b d() {
        return this.f39882d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UploadLogMessage{maxSize=" + this.f39879a + ", wifiUpload=" + this.f39880b + ", fileList=" + this.f39881c + ", controlMessage=" + this.f39882d + ", uploadMessage='" + this.f39883e + '\'' + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f39879a);
        parcel.writeByte(this.f39880b ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f39881c);
        parcel.writeParcelable(this.f39882d, i11);
        parcel.writeString(this.f39883e);
    }

    public g(String str, String str2, String str3, String str4) {
        this.f39883e = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("max_size")) {
                this.f39879a = jSONObject.getInt("max_size");
            }
            if (!jSONObject.isNull("wifi_upload")) {
                this.f39880b = jSONObject.getBoolean("wifi_upload");
            }
            if (!jSONObject.isNull("upload_files")) {
                JSONArray jSONArray = jSONObject.getJSONArray("upload_files");
                this.f39881c = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f39881c.add(jSONArray.getString(i11));
                }
            }
        } catch (JSONException e11) {
            DebugLogger.e("UploadLogMessage", "parse upload message error " + e11.getMessage());
        }
        this.f39882d = new b(str2, str3, str4);
    }
}
