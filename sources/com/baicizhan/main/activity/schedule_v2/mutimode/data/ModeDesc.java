package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@e50.g
/* loaded from: classes4.dex */
public final class ModeDesc implements Parcelable {

    @k
    public static final Parcelable.Creator<ModeDesc> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f19275c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContentType f19276a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19277b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<ModeDesc> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModeDesc createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new ModeDesc(com.baicizhan.main.activity.schedule_v2.mutimode.data.a.f19299a.a(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ModeDesc[] newArray(int i11) {
            return new ModeDesc[i11];
        }
    }

    public ModeDesc(@k ContentType type, @k String content) {
        g0.p(type, "type");
        g0.p(content, "content");
        this.f19276a = type;
        this.f19277b = content;
    }

    public static /* synthetic */ ModeDesc d(ModeDesc modeDesc, ContentType contentType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contentType = modeDesc.f19276a;
        }
        if ((i11 & 2) != 0) {
            str = modeDesc.f19277b;
        }
        return modeDesc.c(contentType, str);
    }

    @k
    public final ContentType a() {
        return this.f19276a;
    }

    @k
    public final String b() {
        return this.f19277b;
    }

    @k
    public final ModeDesc c(@k ContentType type, @k String content) {
        g0.p(type, "type");
        g0.p(content, "content");
        return new ModeDesc(type, content);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String e() {
        return this.f19277b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeDesc)) {
            return false;
        }
        ModeDesc modeDesc = (ModeDesc) obj;
        return this.f19276a == modeDesc.f19276a && g0.g(this.f19277b, modeDesc.f19277b);
    }

    @k
    public final ContentType g() {
        return this.f19276a;
    }

    public int hashCode() {
        return (this.f19276a.hashCode() * 31) + this.f19277b.hashCode();
    }

    @k
    public String toString() {
        return "ModeDesc(type=" + this.f19276a + ", content=" + this.f19277b + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        com.baicizhan.main.activity.schedule_v2.mutimode.data.a.f19299a.b(this.f19276a, dest, i11);
        dest.writeString(this.f19277b);
    }
}
