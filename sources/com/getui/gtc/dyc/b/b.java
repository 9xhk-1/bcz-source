package com.getui.gtc.dyc.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.mcssdk.constant.Constants;

/* loaded from: classes6.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.getui.gtc.dyc.b.b.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f29980a = "sdkconfig";

    /* renamed from: b, reason: collision with root package name */
    private String f29981b;

    /* renamed from: c, reason: collision with root package name */
    private String f29982c;

    /* renamed from: d, reason: collision with root package name */
    private String f29983d;

    /* renamed from: e, reason: collision with root package name */
    private String f29984e;

    /* renamed from: f, reason: collision with root package name */
    private String f29985f;

    /* renamed from: g, reason: collision with root package name */
    private String f29986g;

    /* renamed from: h, reason: collision with root package name */
    private String f29987h;

    /* renamed from: i, reason: collision with root package name */
    private long f29988i;

    /* renamed from: j, reason: collision with root package name */
    private c f29989j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f29990a;

        /* renamed from: b, reason: collision with root package name */
        private String f29991b;

        /* renamed from: c, reason: collision with root package name */
        private String f29992c;

        /* renamed from: e, reason: collision with root package name */
        private String f29994e;

        /* renamed from: f, reason: collision with root package name */
        private String f29995f;

        /* renamed from: h, reason: collision with root package name */
        private c f29997h;

        /* renamed from: d, reason: collision with root package name */
        private String f29993d = b.f29980a;

        /* renamed from: g, reason: collision with root package name */
        private long f29996g = Constants.MILLS_OF_LAUNCH_INTERVAL;

        public a a(String str) {
            this.f29990a = str;
            return this;
        }

        public a b(String str) {
            this.f29991b = str;
            return this;
        }

        public a c(String str) {
            this.f29992c = str;
            return this;
        }

        public a d(String str) {
            this.f29994e = str;
            return this;
        }

        public a e(String str) {
            this.f29993d = str;
            return this;
        }

        public a f(String str) {
            this.f29995f = str;
            return this;
        }

        public a g(long j11) {
            this.f29996g = j11;
            return this;
        }

        public a h(c cVar) {
            this.f29997h = cVar;
            return this;
        }

        public b i() {
            return new b(this);
        }
    }

    public b(Parcel parcel) {
        this.f29981b = parcel.readString();
        this.f29982c = parcel.readString();
        this.f29983d = parcel.readString();
        this.f29987h = parcel.readString();
        this.f29985f = parcel.readString();
        this.f29986g = parcel.readString();
        this.f29984e = parcel.readString();
        this.f29988i = parcel.readLong();
    }

    public String a() {
        return this.f29981b;
    }

    public String b() {
        return this.f29982c;
    }

    public String c() {
        return this.f29983d;
    }

    public String d() {
        return this.f29984e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f29985f;
    }

    public String f() {
        return this.f29986g;
    }

    public String g() {
        return this.f29987h;
    }

    public long h() {
        return this.f29988i;
    }

    public c i() {
        return this.f29989j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f29981b);
        parcel.writeString(this.f29982c);
        parcel.writeString(this.f29983d);
        parcel.writeString(this.f29987h);
        parcel.writeString(this.f29985f);
        parcel.writeString(this.f29986g);
        parcel.writeString(this.f29984e);
        parcel.writeLong(this.f29988i);
    }

    private b(a aVar) {
        this.f29981b = aVar.f29990a;
        this.f29982c = aVar.f29991b;
        this.f29983d = aVar.f29992c;
        this.f29984e = aVar.f29993d;
        this.f29985f = aVar.f29994e;
        this.f29987h = aVar.f29995f;
        this.f29988i = aVar.f29996g;
        this.f29989j = aVar.f29997h;
    }

    public void a(String str) {
        this.f29981b = str;
    }

    public void b(String str) {
        this.f29982c = str;
    }

    public void c(String str) {
        this.f29983d = str;
    }

    public void d(String str) {
        this.f29984e = str;
    }

    public void e(String str) {
        this.f29985f = str;
    }

    public void f(String str) {
        this.f29986g = str;
    }

    public void g(String str) {
        this.f29987h = str;
    }

    public void h(long j11) {
        this.f29988i = j11;
    }

    public void i(c cVar) {
        this.f29989j = cVar;
    }
}
