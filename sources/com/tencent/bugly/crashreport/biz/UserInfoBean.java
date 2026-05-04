package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.ap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() { // from class: com.tencent.bugly.crashreport.biz.UserInfoBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserInfoBean createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserInfoBean[] newArray(int i11) {
            return new UserInfoBean[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public long f42057a;

    /* renamed from: b, reason: collision with root package name */
    public int f42058b;

    /* renamed from: c, reason: collision with root package name */
    public String f42059c;

    /* renamed from: d, reason: collision with root package name */
    public String f42060d;

    /* renamed from: e, reason: collision with root package name */
    public long f42061e;

    /* renamed from: f, reason: collision with root package name */
    public long f42062f;

    /* renamed from: g, reason: collision with root package name */
    public long f42063g;

    /* renamed from: h, reason: collision with root package name */
    public long f42064h;

    /* renamed from: i, reason: collision with root package name */
    public long f42065i;

    /* renamed from: j, reason: collision with root package name */
    public String f42066j;

    /* renamed from: k, reason: collision with root package name */
    public long f42067k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42068l;

    /* renamed from: m, reason: collision with root package name */
    public String f42069m;

    /* renamed from: n, reason: collision with root package name */
    public String f42070n;

    /* renamed from: o, reason: collision with root package name */
    public int f42071o;

    /* renamed from: p, reason: collision with root package name */
    public int f42072p;

    /* renamed from: q, reason: collision with root package name */
    public int f42073q;

    /* renamed from: r, reason: collision with root package name */
    public Map<String, String> f42074r;

    /* renamed from: s, reason: collision with root package name */
    public Map<String, String> f42075s;

    public UserInfoBean() {
        this.f42067k = 0L;
        this.f42068l = false;
        this.f42069m = "unknown";
        this.f42072p = -1;
        this.f42073q = -1;
        this.f42074r = null;
        this.f42075s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f42058b);
        parcel.writeString(this.f42059c);
        parcel.writeString(this.f42060d);
        parcel.writeLong(this.f42061e);
        parcel.writeLong(this.f42062f);
        parcel.writeLong(this.f42063g);
        parcel.writeLong(this.f42064h);
        parcel.writeLong(this.f42065i);
        parcel.writeString(this.f42066j);
        parcel.writeLong(this.f42067k);
        parcel.writeByte(this.f42068l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f42069m);
        parcel.writeInt(this.f42072p);
        parcel.writeInt(this.f42073q);
        ap.b(parcel, this.f42074r);
        ap.b(parcel, this.f42075s);
        parcel.writeString(this.f42070n);
        parcel.writeInt(this.f42071o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f42067k = 0L;
        this.f42068l = false;
        this.f42069m = "unknown";
        this.f42072p = -1;
        this.f42073q = -1;
        this.f42074r = null;
        this.f42075s = null;
        this.f42058b = parcel.readInt();
        this.f42059c = parcel.readString();
        this.f42060d = parcel.readString();
        this.f42061e = parcel.readLong();
        this.f42062f = parcel.readLong();
        this.f42063g = parcel.readLong();
        this.f42064h = parcel.readLong();
        this.f42065i = parcel.readLong();
        this.f42066j = parcel.readString();
        this.f42067k = parcel.readLong();
        this.f42068l = parcel.readByte() == 1;
        this.f42069m = parcel.readString();
        this.f42072p = parcel.readInt();
        this.f42073q = parcel.readInt();
        this.f42074r = ap.b(parcel);
        this.f42075s = ap.b(parcel);
        this.f42070n = parcel.readString();
        this.f42071o = parcel.readInt();
    }
}
