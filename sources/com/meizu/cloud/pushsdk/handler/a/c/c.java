package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.MessageV3;

/* loaded from: classes7.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.c.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private MessageV3 f39853a;

    /* renamed from: b, reason: collision with root package name */
    private String f39854b;

    /* renamed from: c, reason: collision with root package name */
    private int f39855c;

    /* renamed from: d, reason: collision with root package name */
    private int f39856d;

    public c(Parcel parcel) {
        this.f39853a = (MessageV3) parcel.readParcelable(MessageV3.class.getClassLoader());
        this.f39854b = parcel.readString();
        this.f39855c = parcel.readInt();
        this.f39856d = parcel.readInt();
    }

    public MessageV3 a() {
        return this.f39853a;
    }

    public int b() {
        return this.f39855c;
    }

    public int c() {
        return this.f39856d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotificationState{messageV3=" + this.f39853a + ", notificationPkg='" + this.f39854b + "', notificationId='" + this.f39855c + "', state='" + this.f39856d + '\'' + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f39853a, i11);
        parcel.writeString(this.f39854b);
        parcel.writeInt(this.f39855c);
        parcel.writeInt(this.f39856d);
    }

    public c(MessageV3 messageV3) {
        this.f39853a = messageV3;
    }

    public void a(int i11) {
        this.f39855c = i11;
    }

    public void b(int i11) {
        this.f39856d = i11;
    }

    public void a(String str) {
        this.f39854b = str;
    }
}
