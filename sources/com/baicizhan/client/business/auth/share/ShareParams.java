package com.baicizhan.client.business.auth.share;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ShareParams implements Parcelable {
    public static final Parcelable.Creator<ShareParams> CREATOR = new a();

    /* renamed from: n, reason: collision with root package name */
    public static final int f16054n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f16055o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f16056p = 2;

    /* renamed from: a, reason: collision with root package name */
    public String f16057a;

    /* renamed from: b, reason: collision with root package name */
    public String f16058b;

    /* renamed from: c, reason: collision with root package name */
    public String f16059c;

    /* renamed from: d, reason: collision with root package name */
    public String f16060d;

    /* renamed from: e, reason: collision with root package name */
    public ShareType f16061e;

    /* renamed from: f, reason: collision with root package name */
    @DrawableRes
    public int f16062f;

    /* renamed from: g, reason: collision with root package name */
    public String f16063g;

    /* renamed from: h, reason: collision with root package name */
    public String f16064h;

    /* renamed from: i, reason: collision with root package name */
    public String f16065i;

    /* renamed from: j, reason: collision with root package name */
    public int f16066j;

    /* renamed from: k, reason: collision with root package name */
    public String f16067k;

    /* renamed from: l, reason: collision with root package name */
    public String f16068l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16069m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ShareType {
        IMAGE,
        WEB,
        TEXT,
        MINI_PROGRAM;

        public static ShareType fromOrdinal(int ordinal) {
            ShareType shareType = IMAGE;
            if (ordinal == shareType.ordinal()) {
                return shareType;
            }
            ShareType shareType2 = TEXT;
            return ordinal == shareType2.ordinal() ? shareType2 : WEB;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<ShareParams> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareParams createFromParcel(Parcel in2) {
            return new ShareParams(in2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareParams[] newArray(int size) {
            return new ShareParams[size];
        }
    }

    public ShareParams() {
        this.f16061e = ShareType.WEB;
        this.f16062f = R.drawable.business_baicizhan;
        this.f16069m = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f16057a);
        dest.writeString(this.f16058b);
        dest.writeString(this.f16059c);
        dest.writeString(this.f16060d);
        dest.writeInt(this.f16061e.ordinal());
        dest.writeInt(this.f16062f);
        dest.writeString(this.f16063g);
    }

    public ShareParams(Parcel in2) {
        this.f16061e = ShareType.WEB;
        this.f16062f = R.drawable.business_baicizhan;
        this.f16069m = false;
        this.f16057a = in2.readString();
        this.f16058b = in2.readString();
        this.f16059c = in2.readString();
        this.f16060d = in2.readString();
        this.f16061e = ShareType.fromOrdinal(in2.readInt());
        this.f16062f = in2.readInt();
        this.f16063g = in2.readString();
    }
}
