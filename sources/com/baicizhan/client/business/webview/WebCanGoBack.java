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
public final class WebCanGoBack implements Parcelable {
    private final boolean canGoBack;

    @k
    public static final Parcelable.Creator<WebCanGoBack> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<WebCanGoBack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebCanGoBack createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new WebCanGoBack(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebCanGoBack[] newArray(int i11) {
            return new WebCanGoBack[i11];
        }
    }

    public WebCanGoBack(boolean z11) {
        this.canGoBack = z11;
    }

    public static /* synthetic */ WebCanGoBack copy$default(WebCanGoBack webCanGoBack, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = webCanGoBack.canGoBack;
        }
        return webCanGoBack.copy(z11);
    }

    public final boolean component1() {
        return this.canGoBack;
    }

    @k
    public final WebCanGoBack copy(boolean z11) {
        return new WebCanGoBack(z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebCanGoBack) && this.canGoBack == ((WebCanGoBack) obj).canGoBack;
    }

    public final boolean getCanGoBack() {
        return this.canGoBack;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canGoBack);
    }

    @k
    public String toString() {
        return "WebCanGoBack(canGoBack=" + this.canGoBack + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.canGoBack ? 1 : 0);
    }
}
