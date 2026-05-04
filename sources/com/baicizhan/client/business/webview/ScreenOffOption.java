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
public final class ScreenOffOption implements Parcelable {
    private final int delay;

    @k
    public static final Parcelable.Creator<ScreenOffOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<ScreenOffOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenOffOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new ScreenOffOption(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenOffOption[] newArray(int i11) {
            return new ScreenOffOption[i11];
        }
    }

    public ScreenOffOption(int i11) {
        this.delay = i11;
    }

    public static /* synthetic */ ScreenOffOption copy$default(ScreenOffOption screenOffOption, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = screenOffOption.delay;
        }
        return screenOffOption.copy(i11);
    }

    public final int component1() {
        return this.delay;
    }

    @k
    public final ScreenOffOption copy(int i11) {
        return new ScreenOffOption(i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreenOffOption) && this.delay == ((ScreenOffOption) obj).delay;
    }

    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return Integer.hashCode(this.delay);
    }

    @k
    public String toString() {
        return "ScreenOffOption(delay=" + this.delay + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.delay);
    }
}
