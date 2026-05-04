package com.baicizhan.client.business.webview;

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
public final class DakaConfig implements Parcelable {
    private final boolean skipCalendar;

    @k
    public static final Parcelable.Creator<DakaConfig> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<DakaConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DakaConfig createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new DakaConfig(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DakaConfig[] newArray(int i11) {
            return new DakaConfig[i11];
        }
    }

    public DakaConfig(boolean z11) {
        this.skipCalendar = z11;
    }

    public static /* synthetic */ DakaConfig copy$default(DakaConfig dakaConfig, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = dakaConfig.skipCalendar;
        }
        return dakaConfig.copy(z11);
    }

    public final boolean component1() {
        return this.skipCalendar;
    }

    @k
    public final DakaConfig copy(boolean z11) {
        return new DakaConfig(z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DakaConfig) && this.skipCalendar == ((DakaConfig) obj).skipCalendar;
    }

    public final boolean getSkipCalendar() {
        return this.skipCalendar;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skipCalendar);
    }

    @k
    public String toString() {
        return "DakaConfig(skipCalendar=" + this.skipCalendar + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.skipCalendar ? 1 : 0);
    }
}
