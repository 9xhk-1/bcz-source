package com.aurelhubert.ahbottomnavigation.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AHNotification implements Parcelable {
    public static final Parcelable.Creator<AHNotification> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public String f11326a;

    /* renamed from: b, reason: collision with root package name */
    @ColorInt
    public int f11327b;

    /* renamed from: c, reason: collision with root package name */
    @ColorInt
    public int f11328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11329d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<AHNotification> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AHNotification createFromParcel(Parcel in2) {
            return new AHNotification(in2, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AHNotification[] newArray(int size) {
            return new AHNotification[size];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public String f11330a;

        /* renamed from: b, reason: collision with root package name */
        @ColorInt
        public int f11331b;

        /* renamed from: c, reason: collision with root package name */
        @ColorInt
        public int f11332c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11333d;

        public AHNotification a() {
            AHNotification aHNotification = new AHNotification();
            aHNotification.f11326a = this.f11330a;
            aHNotification.f11327b = this.f11331b;
            aHNotification.f11328c = this.f11332c;
            aHNotification.f11329d = this.f11333d;
            return aHNotification;
        }

        public b b(@ColorInt int backgroundColor) {
            this.f11332c = backgroundColor;
            return this;
        }

        public b c(boolean ignoreText) {
            this.f11333d = ignoreText;
            return this;
        }

        public b d(String text) {
            this.f11330a = text;
            return this;
        }

        public b e(@ColorInt int textColor) {
            this.f11331b = textColor;
            return this;
        }
    }

    public /* synthetic */ AHNotification(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static List<AHNotification> e(int size) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new AHNotification());
        }
        return arrayList;
    }

    public static AHNotification l(String text) {
        return new b().d(text).a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int g() {
        return this.f11328c;
    }

    public boolean h() {
        return this.f11329d;
    }

    public String i() {
        return this.f11326a;
    }

    public int j() {
        return this.f11327b;
    }

    public boolean k() {
        return TextUtils.isEmpty(this.f11326a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f11326a);
        parcel.writeInt(this.f11327b);
        parcel.writeInt(this.f11328c);
        parcel.writeByte(this.f11329d ? (byte) 1 : (byte) 0);
    }

    public AHNotification() {
    }

    public AHNotification(Parcel in2) {
        this.f11326a = in2.readString();
        this.f11327b = in2.readInt();
        this.f11328c = in2.readInt();
        this.f11329d = in2.readByte() != 0;
    }
}
