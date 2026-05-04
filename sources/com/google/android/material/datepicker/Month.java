package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f31108a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31109b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31110c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31111d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31112e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31113f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public String f31114g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i11) {
            return new Month[i11];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar f11 = v.f(calendar);
        this.f31108a = f11;
        this.f31109b = f11.get(2);
        this.f31110c = f11.get(1);
        this.f31111d = f11.getMaximum(7);
        this.f31112e = f11.getActualMaximum(5);
        this.f31113f = f11.getTimeInMillis();
    }

    @NonNull
    public static Month b(int i11, int i12) {
        Calendar x11 = v.x();
        x11.set(1, i11);
        x11.set(2, i12);
        return new Month(x11);
    }

    @NonNull
    public static Month c(long j11) {
        Calendar x11 = v.x();
        x11.setTimeInMillis(j11);
        return new Month(x11);
    }

    @NonNull
    public static Month d() {
        return new Month(v.v());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.f31108a.compareTo(month.f31108a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e(int i11) {
        int i12 = this.f31108a.get(7);
        if (i11 <= 0) {
            i11 = this.f31108a.getFirstDayOfWeek();
        }
        int i13 = i12 - i11;
        return i13 < 0 ? i13 + this.f31111d : i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f31109b == month.f31109b && this.f31110c == month.f31110c;
    }

    public long g(int i11) {
        Calendar f11 = v.f(this.f31108a);
        f11.set(5, i11);
        return f11.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31109b), Integer.valueOf(this.f31110c)});
    }

    public int i(long j11) {
        Calendar f11 = v.f(this.f31108a);
        f11.setTimeInMillis(j11);
        return f11.get(5);
    }

    @NonNull
    public String k() {
        if (this.f31114g == null) {
            this.f31114g = h.l(this.f31108a.getTimeInMillis());
        }
        return this.f31114g;
    }

    public long l() {
        return this.f31108a.getTimeInMillis();
    }

    @NonNull
    public Month m(int i11) {
        Calendar f11 = v.f(this.f31108a);
        f11.add(2, i11);
        return new Month(f11);
    }

    public int o(@NonNull Month month) {
        if (this.f31108a instanceof GregorianCalendar) {
            return ((month.f31110c - this.f31110c) * 12) + (month.f31109b - this.f31109b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeInt(this.f31110c);
        parcel.writeInt(this.f31109b);
    }
}
