package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@e50.g
/* loaded from: classes4.dex */
public final class ModeDetail implements Parcelable {

    @k
    public static final Parcelable.Creator<ModeDetail> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final int f19278f = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f19279a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19280b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19281c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f19282d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<ModeDesc> f19283e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<ModeDetail> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModeDetail createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            e a11 = f.f19316a.a(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(ModeDesc.CREATOR.createFromParcel(parcel));
            }
            return new ModeDetail(a11, readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ModeDetail[] newArray(int i11) {
            return new ModeDetail[i11];
        }
    }

    public ModeDetail(@k e modeType, @k String name, @k String iconUrl, @k String shorDesc, @k List<ModeDesc> desc) {
        g0.p(modeType, "modeType");
        g0.p(name, "name");
        g0.p(iconUrl, "iconUrl");
        g0.p(shorDesc, "shorDesc");
        g0.p(desc, "desc");
        this.f19279a = modeType;
        this.f19280b = name;
        this.f19281c = iconUrl;
        this.f19282d = shorDesc;
        this.f19283e = desc;
    }

    public static /* synthetic */ ModeDetail h(ModeDetail modeDetail, e eVar, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = modeDetail.f19279a;
        }
        if ((i11 & 2) != 0) {
            str = modeDetail.f19280b;
        }
        if ((i11 & 4) != 0) {
            str2 = modeDetail.f19281c;
        }
        if ((i11 & 8) != 0) {
            str3 = modeDetail.f19282d;
        }
        if ((i11 & 16) != 0) {
            list = modeDetail.f19283e;
        }
        List list2 = list;
        String str4 = str2;
        return modeDetail.g(eVar, str, str4, str3, list2);
    }

    @k
    public final e a() {
        return this.f19279a;
    }

    @k
    public final String b() {
        return this.f19280b;
    }

    @k
    public final String c() {
        return this.f19281c;
    }

    @k
    public final String d() {
        return this.f19282d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<ModeDesc> e() {
        return this.f19283e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeDetail)) {
            return false;
        }
        ModeDetail modeDetail = (ModeDetail) obj;
        return g0.g(this.f19279a, modeDetail.f19279a) && g0.g(this.f19280b, modeDetail.f19280b) && g0.g(this.f19281c, modeDetail.f19281c) && g0.g(this.f19282d, modeDetail.f19282d) && g0.g(this.f19283e, modeDetail.f19283e);
    }

    @k
    public final ModeDetail g(@k e modeType, @k String name, @k String iconUrl, @k String shorDesc, @k List<ModeDesc> desc) {
        g0.p(modeType, "modeType");
        g0.p(name, "name");
        g0.p(iconUrl, "iconUrl");
        g0.p(shorDesc, "shorDesc");
        g0.p(desc, "desc");
        return new ModeDetail(modeType, name, iconUrl, shorDesc, desc);
    }

    public int hashCode() {
        return (((((((this.f19279a.hashCode() * 31) + this.f19280b.hashCode()) * 31) + this.f19281c.hashCode()) * 31) + this.f19282d.hashCode()) * 31) + this.f19283e.hashCode();
    }

    @k
    public final List<ModeDesc> i() {
        return this.f19283e;
    }

    @k
    public final String j() {
        return this.f19281c;
    }

    @k
    public final e k() {
        return this.f19279a;
    }

    @k
    public final String l() {
        return this.f19280b;
    }

    @k
    public final String m() {
        return this.f19282d;
    }

    @k
    public String toString() {
        return "ModeDetail(modeType=" + this.f19279a + ", name=" + this.f19280b + ", iconUrl=" + this.f19281c + ", shorDesc=" + this.f19282d + ", desc=" + this.f19283e + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        f.f19316a.b(this.f19279a, dest, i11);
        dest.writeString(this.f19280b);
        dest.writeString(this.f19281c);
        dest.writeString(this.f19282d);
        List<ModeDesc> list = this.f19283e;
        dest.writeInt(list.size());
        Iterator<ModeDesc> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i11);
        }
    }
}
