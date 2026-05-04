package com.getui.gtc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray<C0358a> f30045a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f30046b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f30047c;

    /* renamed from: com.getui.gtc.entity.a$a, reason: collision with other inner class name */
    public static class C0358a implements Parcelable {
        public static final Parcelable.Creator<C0358a> CREATOR = new Parcelable.Creator<C0358a>() { // from class: com.getui.gtc.entity.a.a.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ C0358a createFromParcel(Parcel parcel) {
                return new C0358a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ C0358a[] newArray(int i11) {
                return new C0358a[i11];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public int f30048a;

        /* renamed from: b, reason: collision with root package name */
        public String f30049b;

        /* renamed from: c, reason: collision with root package name */
        public String f30050c;

        /* renamed from: d, reason: collision with root package name */
        public String f30051d;

        /* renamed from: e, reason: collision with root package name */
        public String f30052e;

        /* renamed from: f, reason: collision with root package name */
        public String f30053f;

        /* renamed from: g, reason: collision with root package name */
        public long f30054g;

        /* renamed from: h, reason: collision with root package name */
        public String f30055h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f30056i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f30057j;

        public C0358a() {
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f30048a);
                jSONObject.put("version", this.f30049b);
                jSONObject.put("name", this.f30050c);
                jSONObject.put("cls_name", this.f30051d);
                jSONObject.put("url", this.f30055h);
                jSONObject.put("isdestroy", this.f30056i);
                jSONObject.put("effective", String.valueOf(this.f30054g));
                jSONObject.put(a.d.C0245a.f16161a, this.f30053f);
                jSONObject.put("checksum", this.f30052e);
            } catch (Exception e11) {
                com.getui.gtc.i.c.a.b(e11);
            }
            return jSONObject.toString();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f30048a);
            parcel.writeString(this.f30049b);
            parcel.writeString(this.f30050c);
            parcel.writeString(this.f30051d);
            parcel.writeString(this.f30052e);
            parcel.writeString(this.f30053f);
            parcel.writeLong(this.f30054g);
            parcel.writeString(this.f30055h);
            parcel.writeByte(this.f30056i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f30057j ? (byte) 1 : (byte) 0);
        }

        public C0358a(Parcel parcel) {
            this.f30048a = parcel.readInt();
            this.f30049b = parcel.readString();
            this.f30050c = parcel.readString();
            this.f30051d = parcel.readString();
            this.f30052e = parcel.readString();
            this.f30053f = parcel.readString();
            this.f30054g = parcel.readLong();
            this.f30055h = parcel.readString();
            this.f30056i = parcel.readByte() != 0;
            this.f30057j = parcel.readByte() != 0;
        }
    }

    public final C0358a a(int i11) {
        SparseArray<C0358a> sparseArray = this.f30045a;
        return sparseArray.get(sparseArray.keyAt(i11));
    }

    public final C0358a b(int i11) {
        return this.f30045a.get(i11);
    }

    public final void c(int i11) {
        this.f30045a.removeAt(i11);
    }

    public static a a(Map<String, String> map) {
        long j11;
        String str = map.get("ext_infos");
        a aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar2 = new a();
            aVar2.f30047c = jSONObject.getString("version");
            String str2 = map.get("sdk.gtc.gws.load.enable");
            if (!TextUtils.isEmpty(str2) && !"none".equals(str2)) {
                aVar2.f30046b = Boolean.parseBoolean(str2);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("extensions");
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    C0358a c0358a = new C0358a();
                    c0358a.f30048a = jSONObject2.getInt("id");
                    c0358a.f30049b = jSONObject2.getString("version");
                    c0358a.f30050c = jSONObject2.getString("name");
                    c0358a.f30051d = jSONObject2.getString("cls_name");
                    c0358a.f30055h = jSONObject2.getString("url");
                    c0358a.f30052e = jSONObject2.getString("checksum");
                    c0358a.f30053f = jSONObject2.getString(a.d.C0245a.f16161a);
                    if (jSONObject2.has("isdestroy")) {
                        c0358a.f30056i = jSONObject2.getBoolean("isdestroy");
                    }
                    if (jSONObject2.has("effective")) {
                        try {
                            j11 = Long.parseLong(jSONObject2.getString("effective")) * 1000;
                        } catch (Exception e11) {
                            com.getui.gtc.i.c.a.c(e11);
                            j11 = 0;
                        }
                        c0358a.f30054g = j11;
                    }
                    aVar2.f30045a.put(c0358a.f30048a, c0358a);
                }
            }
            aVar = aVar2;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
        String str3 = map.get("sdk.push.plugins");
        if (aVar != null && !TextUtils.isEmpty(str3)) {
            for (String str4 : str3.split(",")) {
                try {
                    C0358a b11 = aVar.b(Integer.parseInt(str4));
                    if (b11 != null) {
                        b11.f30057j = true;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return aVar;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f30047c);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("extensions", jSONArray);
            int size = this.f30045a.size();
            for (int i11 = 0; i11 < size; i11++) {
                SparseArray<C0358a> sparseArray = this.f30045a;
                jSONArray.put(i11, new JSONObject(sparseArray.get(sparseArray.keyAt(i11)).a()));
            }
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.b(e11);
        }
        return jSONObject.toString();
    }
}
