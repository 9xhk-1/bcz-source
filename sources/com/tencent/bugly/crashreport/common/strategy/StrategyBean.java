package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.ap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new Parcelable.Creator<StrategyBean>() { // from class: com.tencent.bugly.crashreport.common.strategy.StrategyBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StrategyBean createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StrategyBean[] newArray(int i11) {
            return new StrategyBean[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static String f42079a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b, reason: collision with root package name */
    public static String f42080b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c, reason: collision with root package name */
    public static String f42081c;

    /* renamed from: d, reason: collision with root package name */
    public long f42082d;

    /* renamed from: e, reason: collision with root package name */
    public long f42083e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42084f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f42085g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f42086h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f42087i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f42088j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f42089k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42090l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42091m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f42092n;

    /* renamed from: o, reason: collision with root package name */
    public long f42093o;

    /* renamed from: p, reason: collision with root package name */
    public long f42094p;

    /* renamed from: q, reason: collision with root package name */
    public String f42095q;

    /* renamed from: r, reason: collision with root package name */
    public String f42096r;

    /* renamed from: s, reason: collision with root package name */
    public String f42097s;

    /* renamed from: t, reason: collision with root package name */
    public Map<String, String> f42098t;

    /* renamed from: u, reason: collision with root package name */
    public int f42099u;

    /* renamed from: v, reason: collision with root package name */
    public long f42100v;

    /* renamed from: w, reason: collision with root package name */
    public long f42101w;

    public StrategyBean() {
        this.f42082d = -1L;
        this.f42083e = -1L;
        this.f42084f = true;
        this.f42085g = true;
        this.f42086h = true;
        this.f42087i = true;
        this.f42088j = false;
        this.f42089k = true;
        this.f42090l = true;
        this.f42091m = true;
        this.f42092n = true;
        this.f42094p = 30000L;
        this.f42095q = f42079a;
        this.f42096r = f42080b;
        this.f42099u = 10;
        this.f42100v = 300000L;
        this.f42101w = -1L;
        this.f42083e = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S(@L@L@)");
        f42081c = sb2.toString();
        sb2.setLength(0);
        sb2.append("*^@K#K@!");
        this.f42097s = sb2.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f42083e);
        parcel.writeByte(this.f42084f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42085g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42086h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f42095q);
        parcel.writeString(this.f42096r);
        parcel.writeString(this.f42097s);
        ap.b(parcel, this.f42098t);
        parcel.writeByte(this.f42087i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42088j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42091m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42092n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f42094p);
        parcel.writeByte(this.f42089k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42090l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f42093o);
        parcel.writeInt(this.f42099u);
        parcel.writeLong(this.f42100v);
        parcel.writeLong(this.f42101w);
    }

    public StrategyBean(Parcel parcel) {
        this.f42082d = -1L;
        this.f42083e = -1L;
        boolean z11 = true;
        this.f42084f = true;
        this.f42085g = true;
        this.f42086h = true;
        this.f42087i = true;
        this.f42088j = false;
        this.f42089k = true;
        this.f42090l = true;
        this.f42091m = true;
        this.f42092n = true;
        this.f42094p = 30000L;
        this.f42095q = f42079a;
        this.f42096r = f42080b;
        this.f42099u = 10;
        this.f42100v = 300000L;
        this.f42101w = -1L;
        try {
            f42081c = "S(@L@L@)";
            this.f42083e = parcel.readLong();
            this.f42084f = parcel.readByte() == 1;
            this.f42085g = parcel.readByte() == 1;
            this.f42086h = parcel.readByte() == 1;
            this.f42095q = parcel.readString();
            this.f42096r = parcel.readString();
            this.f42097s = parcel.readString();
            this.f42098t = ap.b(parcel);
            this.f42087i = parcel.readByte() == 1;
            this.f42088j = parcel.readByte() == 1;
            this.f42091m = parcel.readByte() == 1;
            this.f42092n = parcel.readByte() == 1;
            this.f42094p = parcel.readLong();
            this.f42089k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z11 = false;
            }
            this.f42090l = z11;
            this.f42093o = parcel.readLong();
            this.f42099u = parcel.readInt();
            this.f42100v = parcel.readLong();
            this.f42101w = parcel.readLong();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
