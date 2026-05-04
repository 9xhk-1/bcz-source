package com.baicizhan.client.business.webview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@e50.g
/* loaded from: classes4.dex */
public final class OpenWebViewOption implements Parcelable {
    public static final int $stable = 0;

    @k
    public static final Parcelable.Creator<OpenWebViewOption> CREATOR = new Creator();

    @l
    private final LoadingBarOption loadingBar;

    @l
    private final NavigationBarOption navigationBar;

    @l
    private final OrientationOption orientation;

    @l
    private final StatusBarOption statusBar;

    @l
    private final TouchCalloutOption touchCallout;

    @l
    private final String url;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Builder {
        public static final int $stable = 8;

        @l
        private LoadingBarOption loadingBar;

        @l
        private NavigationBarOption navigationBar;

        @l
        private OrientationOption orientation;

        @l
        private StatusBarOption statusOption;

        @l
        private TouchCalloutOption touchCallout;

        @l
        private String url;

        @k
        public final OpenWebViewOption build() {
            return new OpenWebViewOption(this.url, this.statusOption, this.navigationBar, this.loadingBar, this.orientation, this.touchCallout);
        }

        @k
        public final Builder setLoadingBar(@k LoadingBarOption option) {
            g0.p(option, "option");
            this.loadingBar = option;
            return this;
        }

        @k
        public final Builder setNavigationBar(@k NavigationBarOption option) {
            g0.p(option, "option");
            this.navigationBar = option;
            return this;
        }

        @k
        public final Builder setOrientation(@k OrientationOption option) {
            g0.p(option, "option");
            this.orientation = option;
            return this;
        }

        @k
        public final Builder setStatusBar(@k StatusBarOption option) {
            g0.p(option, "option");
            this.statusOption = option;
            return this;
        }

        @k
        public final Builder setTouchCallout(@k TouchCalloutOption option) {
            g0.p(option, "option");
            this.touchCallout = option;
            return this;
        }

        @k
        public final Builder setUrl(@k String urlStr) {
            g0.p(urlStr, "urlStr");
            this.url = urlStr;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<OpenWebViewOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenWebViewOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new OpenWebViewOption(parcel.readString(), parcel.readInt() == 0 ? null : StatusBarOption.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NavigationBarOption.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LoadingBarOption.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OrientationOption.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TouchCalloutOption.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenWebViewOption[] newArray(int i11) {
            return new OpenWebViewOption[i11];
        }
    }

    public OpenWebViewOption(@l String str, @l StatusBarOption statusBarOption, @l NavigationBarOption navigationBarOption, @l LoadingBarOption loadingBarOption, @l OrientationOption orientationOption, @l TouchCalloutOption touchCalloutOption) {
        this.url = str;
        this.statusBar = statusBarOption;
        this.navigationBar = navigationBarOption;
        this.loadingBar = loadingBarOption;
        this.orientation = orientationOption;
        this.touchCallout = touchCalloutOption;
    }

    public static /* synthetic */ OpenWebViewOption copy$default(OpenWebViewOption openWebViewOption, String str, StatusBarOption statusBarOption, NavigationBarOption navigationBarOption, LoadingBarOption loadingBarOption, OrientationOption orientationOption, TouchCalloutOption touchCalloutOption, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = openWebViewOption.url;
        }
        if ((i11 & 2) != 0) {
            statusBarOption = openWebViewOption.statusBar;
        }
        if ((i11 & 4) != 0) {
            navigationBarOption = openWebViewOption.navigationBar;
        }
        if ((i11 & 8) != 0) {
            loadingBarOption = openWebViewOption.loadingBar;
        }
        if ((i11 & 16) != 0) {
            orientationOption = openWebViewOption.orientation;
        }
        if ((i11 & 32) != 0) {
            touchCalloutOption = openWebViewOption.touchCallout;
        }
        OrientationOption orientationOption2 = orientationOption;
        TouchCalloutOption touchCalloutOption2 = touchCalloutOption;
        return openWebViewOption.copy(str, statusBarOption, navigationBarOption, loadingBarOption, orientationOption2, touchCalloutOption2);
    }

    @l
    public final String component1() {
        return this.url;
    }

    @l
    public final StatusBarOption component2() {
        return this.statusBar;
    }

    @l
    public final NavigationBarOption component3() {
        return this.navigationBar;
    }

    @l
    public final LoadingBarOption component4() {
        return this.loadingBar;
    }

    @l
    public final OrientationOption component5() {
        return this.orientation;
    }

    @l
    public final TouchCalloutOption component6() {
        return this.touchCallout;
    }

    @k
    public final OpenWebViewOption copy(@l String str, @l StatusBarOption statusBarOption, @l NavigationBarOption navigationBarOption, @l LoadingBarOption loadingBarOption, @l OrientationOption orientationOption, @l TouchCalloutOption touchCalloutOption) {
        return new OpenWebViewOption(str, statusBarOption, navigationBarOption, loadingBarOption, orientationOption, touchCalloutOption);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenWebViewOption)) {
            return false;
        }
        OpenWebViewOption openWebViewOption = (OpenWebViewOption) obj;
        return g0.g(this.url, openWebViewOption.url) && g0.g(this.statusBar, openWebViewOption.statusBar) && g0.g(this.navigationBar, openWebViewOption.navigationBar) && g0.g(this.loadingBar, openWebViewOption.loadingBar) && g0.g(this.orientation, openWebViewOption.orientation) && g0.g(this.touchCallout, openWebViewOption.touchCallout);
    }

    @l
    public final LoadingBarOption getLoadingBar() {
        return this.loadingBar;
    }

    @l
    public final NavigationBarOption getNavigationBar() {
        return this.navigationBar;
    }

    @l
    public final OrientationOption getOrientation() {
        return this.orientation;
    }

    @l
    public final StatusBarOption getStatusBar() {
        return this.statusBar;
    }

    @l
    public final TouchCalloutOption getTouchCallout() {
        return this.touchCallout;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        StatusBarOption statusBarOption = this.statusBar;
        int hashCode2 = (hashCode + (statusBarOption == null ? 0 : statusBarOption.hashCode())) * 31;
        NavigationBarOption navigationBarOption = this.navigationBar;
        int hashCode3 = (hashCode2 + (navigationBarOption == null ? 0 : navigationBarOption.hashCode())) * 31;
        LoadingBarOption loadingBarOption = this.loadingBar;
        int hashCode4 = (hashCode3 + (loadingBarOption == null ? 0 : loadingBarOption.hashCode())) * 31;
        OrientationOption orientationOption = this.orientation;
        int hashCode5 = (hashCode4 + (orientationOption == null ? 0 : orientationOption.hashCode())) * 31;
        TouchCalloutOption touchCalloutOption = this.touchCallout;
        return hashCode5 + (touchCalloutOption != null ? touchCalloutOption.hashCode() : 0);
    }

    @k
    public String toString() {
        return "OpenWebViewOption(url=" + this.url + ", statusBar=" + this.statusBar + ", navigationBar=" + this.navigationBar + ", loadingBar=" + this.loadingBar + ", orientation=" + this.orientation + ", touchCallout=" + this.touchCallout + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeString(this.url);
        StatusBarOption statusBarOption = this.statusBar;
        if (statusBarOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            statusBarOption.writeToParcel(dest, i11);
        }
        NavigationBarOption navigationBarOption = this.navigationBar;
        if (navigationBarOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            navigationBarOption.writeToParcel(dest, i11);
        }
        LoadingBarOption loadingBarOption = this.loadingBar;
        if (loadingBarOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loadingBarOption.writeToParcel(dest, i11);
        }
        OrientationOption orientationOption = this.orientation;
        if (orientationOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            orientationOption.writeToParcel(dest, i11);
        }
        TouchCalloutOption touchCalloutOption = this.touchCallout;
        if (touchCalloutOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            touchCalloutOption.writeToParcel(dest, i11);
        }
    }
}
