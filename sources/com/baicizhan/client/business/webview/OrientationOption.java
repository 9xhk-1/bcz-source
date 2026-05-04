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
public final class OrientationOption implements Parcelable {
    private final int angle;

    @k
    public static final Parcelable.Creator<OrientationOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<OrientationOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrientationOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new OrientationOption(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrientationOption[] newArray(int i11) {
            return new OrientationOption[i11];
        }
    }

    public OrientationOption(int i11) {
        this.angle = i11;
    }

    public static /* synthetic */ OrientationOption copy$default(OrientationOption orientationOption, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = orientationOption.angle;
        }
        return orientationOption.copy(i11);
    }

    public final int component1() {
        return this.angle;
    }

    @k
    public final OrientationOption copy(int i11) {
        return new OrientationOption(i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrientationOption) && this.angle == ((OrientationOption) obj).angle;
    }

    public final int getAngle() {
        return this.angle;
    }

    public int hashCode() {
        return Integer.hashCode(this.angle);
    }

    @k
    public String toString() {
        return "OrientationOption(angle=" + this.angle + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.angle);
    }
}
