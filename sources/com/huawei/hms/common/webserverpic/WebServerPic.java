package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();

    /* renamed from: a, reason: collision with root package name */
    private final Uri f35600a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35601b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35602c;

    public WebServerPic(Uri uri, int i11, int i12) throws IllegalArgumentException {
        this.f35600a = uri;
        this.f35601b = i11;
        this.f35602c = i12;
        if (uri == null) {
            throw new IllegalArgumentException("url is not able to be null");
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("width and height should be positive or 0");
        }
    }

    public final int getHeight() {
        return this.f35602c;
    }

    public final Uri getUrl() {
        return this.f35600a;
    }

    public final int getWidth() {
        return this.f35601b;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Image %dx%d %s", Integer.valueOf(this.f35601b), Integer.valueOf(this.f35602c), this.f35600a.toString());
    }

    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i11, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public WebServerPic(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }
}
