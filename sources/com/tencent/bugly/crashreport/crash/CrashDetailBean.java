package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.ap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new Parcelable.Creator<CrashDetailBean>() { // from class: com.tencent.bugly.crashreport.crash.CrashDetailBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CrashDetailBean createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CrashDetailBean[] newArray(int i11) {
            return new CrashDetailBean[i11];
        }
    };
    public String A;
    public String B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public long Q;
    public boolean R;
    public Map<String, String> S;
    public Map<String, String> T;
    public int U;
    public int V;
    public Map<String, String> W;
    public Map<String, String> X;
    public byte[] Y;
    public String Z;

    /* renamed from: a, reason: collision with root package name */
    public long f42102a;

    /* renamed from: aa, reason: collision with root package name */
    public String f42103aa;

    /* renamed from: b, reason: collision with root package name */
    public int f42104b;

    /* renamed from: c, reason: collision with root package name */
    public String f42105c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42106d;

    /* renamed from: e, reason: collision with root package name */
    public String f42107e;

    /* renamed from: f, reason: collision with root package name */
    public String f42108f;

    /* renamed from: g, reason: collision with root package name */
    public String f42109g;

    /* renamed from: h, reason: collision with root package name */
    public Map<String, PlugInBean> f42110h;

    /* renamed from: i, reason: collision with root package name */
    public Map<String, PlugInBean> f42111i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f42112j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f42113k;

    /* renamed from: l, reason: collision with root package name */
    public int f42114l;

    /* renamed from: m, reason: collision with root package name */
    public String f42115m;

    /* renamed from: n, reason: collision with root package name */
    public String f42116n;

    /* renamed from: o, reason: collision with root package name */
    public String f42117o;

    /* renamed from: p, reason: collision with root package name */
    public String f42118p;

    /* renamed from: q, reason: collision with root package name */
    public String f42119q;

    /* renamed from: r, reason: collision with root package name */
    public long f42120r;

    /* renamed from: s, reason: collision with root package name */
    public String f42121s;

    /* renamed from: t, reason: collision with root package name */
    public int f42122t;

    /* renamed from: u, reason: collision with root package name */
    public String f42123u;

    /* renamed from: v, reason: collision with root package name */
    public String f42124v;

    /* renamed from: w, reason: collision with root package name */
    public String f42125w;

    /* renamed from: x, reason: collision with root package name */
    public String f42126x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f42127y;

    /* renamed from: z, reason: collision with root package name */
    public Map<String, String> f42128z;

    public CrashDetailBean() {
        this.f42102a = -1L;
        this.f42104b = 0;
        this.f42105c = UUID.randomUUID().toString();
        this.f42106d = false;
        this.f42107e = "";
        this.f42108f = "";
        this.f42109g = "";
        this.f42110h = null;
        this.f42111i = null;
        this.f42112j = false;
        this.f42113k = false;
        this.f42114l = 0;
        this.f42115m = "";
        this.f42116n = "";
        this.f42117o = "";
        this.f42118p = "";
        this.f42119q = "";
        this.f42120r = -1L;
        this.f42121s = null;
        this.f42122t = 0;
        this.f42123u = "";
        this.f42124v = "";
        this.f42125w = null;
        this.f42126x = null;
        this.f42127y = null;
        this.f42128z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        this.P = "";
        this.Q = -1L;
        this.R = false;
        this.S = null;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f42103aa = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j11 = this.f42120r - crashDetailBean2.f42120r;
        if (j11 <= 0) {
            return j11 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f42104b);
        parcel.writeString(this.f42105c);
        parcel.writeByte(this.f42106d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f42107e);
        parcel.writeString(this.f42108f);
        parcel.writeString(this.f42109g);
        parcel.writeByte(this.f42112j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f42113k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f42114l);
        parcel.writeString(this.f42115m);
        parcel.writeString(this.f42116n);
        parcel.writeString(this.f42117o);
        parcel.writeString(this.f42118p);
        parcel.writeString(this.f42119q);
        parcel.writeLong(this.f42120r);
        parcel.writeString(this.f42121s);
        parcel.writeInt(this.f42122t);
        parcel.writeString(this.f42123u);
        parcel.writeString(this.f42124v);
        parcel.writeString(this.f42125w);
        ap.b(parcel, this.f42128z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeLong(this.Q);
        parcel.writeByte(this.R ? (byte) 1 : (byte) 0);
        ap.b(parcel, this.S);
        ap.a(parcel, this.f42110h);
        ap.a(parcel, this.f42111i);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        ap.b(parcel, this.W);
        ap.b(parcel, this.X);
        parcel.writeByteArray(this.Y);
        parcel.writeByteArray(this.f42127y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f42103aa);
        parcel.writeString(this.f42126x);
        parcel.writeLong(this.I);
        parcel.writeLong(this.J);
        parcel.writeLong(this.K);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f42102a = -1L;
        this.f42104b = 0;
        this.f42105c = UUID.randomUUID().toString();
        this.f42106d = false;
        this.f42107e = "";
        this.f42108f = "";
        this.f42109g = "";
        this.f42110h = null;
        this.f42111i = null;
        this.f42112j = false;
        this.f42113k = false;
        this.f42114l = 0;
        this.f42115m = "";
        this.f42116n = "";
        this.f42117o = "";
        this.f42118p = "";
        this.f42119q = "";
        this.f42120r = -1L;
        this.f42121s = null;
        this.f42122t = 0;
        this.f42123u = "";
        this.f42124v = "";
        this.f42125w = null;
        this.f42126x = null;
        this.f42127y = null;
        this.f42128z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        this.P = "";
        this.Q = -1L;
        this.R = false;
        this.S = null;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f42103aa = null;
        this.f42104b = parcel.readInt();
        this.f42105c = parcel.readString();
        this.f42106d = parcel.readByte() == 1;
        this.f42107e = parcel.readString();
        this.f42108f = parcel.readString();
        this.f42109g = parcel.readString();
        this.f42112j = parcel.readByte() == 1;
        this.f42113k = parcel.readByte() == 1;
        this.f42114l = parcel.readInt();
        this.f42115m = parcel.readString();
        this.f42116n = parcel.readString();
        this.f42117o = parcel.readString();
        this.f42118p = parcel.readString();
        this.f42119q = parcel.readString();
        this.f42120r = parcel.readLong();
        this.f42121s = parcel.readString();
        this.f42122t = parcel.readInt();
        this.f42123u = parcel.readString();
        this.f42124v = parcel.readString();
        this.f42125w = parcel.readString();
        this.f42128z = ap.b(parcel);
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readLong();
        this.R = parcel.readByte() == 1;
        this.S = ap.b(parcel);
        this.f42110h = ap.a(parcel);
        this.f42111i = ap.a(parcel);
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = ap.b(parcel);
        this.X = ap.b(parcel);
        this.Y = parcel.createByteArray();
        this.f42127y = parcel.createByteArray();
        this.Z = parcel.readString();
        this.f42103aa = parcel.readString();
        this.f42126x = parcel.readString();
        this.I = parcel.readLong();
        this.J = parcel.readLong();
        this.K = parcel.readLong();
    }
}
