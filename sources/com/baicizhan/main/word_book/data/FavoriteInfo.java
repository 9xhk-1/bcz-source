package com.baicizhan.main.word_book.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import e50.g;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@g
/* loaded from: classes5.dex */
public final class FavoriteInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoriteInfo> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final int f26163f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final long f26164a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f26165b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f26166c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26167d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26168e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<FavoriteInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FavoriteInfo createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new FavoriteInfo(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FavoriteInfo[] newArray(int i11) {
            return new FavoriteInfo[i11];
        }
    }

    public FavoriteInfo(long j11, @k String name, @k String cover, int i11, boolean z11) {
        g0.p(name, "name");
        g0.p(cover, "cover");
        this.f26164a = j11;
        this.f26165b = name;
        this.f26166c = cover;
        this.f26167d = i11;
        this.f26168e = z11;
    }

    public static /* synthetic */ FavoriteInfo h(FavoriteInfo favoriteInfo, long j11, String str, String str2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = favoriteInfo.f26164a;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = favoriteInfo.f26165b;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = favoriteInfo.f26166c;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            i11 = favoriteInfo.f26167d;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            z11 = favoriteInfo.f26168e;
        }
        return favoriteInfo.g(j12, str3, str4, i13, z11);
    }

    public final long a() {
        return this.f26164a;
    }

    @k
    public final String b() {
        return this.f26165b;
    }

    @k
    public final String c() {
        return this.f26166c;
    }

    public final int d() {
        return this.f26167d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f26168e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteInfo)) {
            return false;
        }
        FavoriteInfo favoriteInfo = (FavoriteInfo) obj;
        return this.f26164a == favoriteInfo.f26164a && g0.g(this.f26165b, favoriteInfo.f26165b) && g0.g(this.f26166c, favoriteInfo.f26166c) && this.f26167d == favoriteInfo.f26167d && this.f26168e == favoriteInfo.f26168e;
    }

    @k
    public final FavoriteInfo g(long j11, @k String name, @k String cover, int i11, boolean z11) {
        g0.p(name, "name");
        g0.p(cover, "cover");
        return new FavoriteInfo(j11, name, cover, i11, z11);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f26164a) * 31) + this.f26165b.hashCode()) * 31) + this.f26166c.hashCode()) * 31) + Integer.hashCode(this.f26167d)) * 31) + Boolean.hashCode(this.f26168e);
    }

    public final long i() {
        return this.f26164a;
    }

    @k
    public final String j() {
        return this.f26166c;
    }

    public final boolean k() {
        return this.f26168e;
    }

    @k
    public final String l() {
        return this.f26165b;
    }

    public final int m() {
        return this.f26167d;
    }

    public final void n(boolean z11) {
        this.f26168e = z11;
    }

    @k
    public String toString() {
        return "FavoriteInfo(bookId=" + this.f26164a + ", name=" + this.f26165b + ", cover=" + this.f26166c + ", wordsCount=" + this.f26167d + ", favorite=" + this.f26168e + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeLong(this.f26164a);
        dest.writeString(this.f26165b);
        dest.writeString(this.f26166c);
        dest.writeInt(this.f26167d);
        dest.writeInt(this.f26168e ? 1 : 0);
    }

    public /* synthetic */ FavoriteInfo(long j11, String str, String str2, int i11, boolean z11, int i12, v vVar) {
        this(j11, str, str2, i11, (i12 & 16) != 0 ? false : z11);
    }
}
