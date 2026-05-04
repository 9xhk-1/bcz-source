package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final String f32587h = "%02d";

    /* renamed from: i, reason: collision with root package name */
    public static final String f32588i = "%d";

    /* renamed from: a, reason: collision with root package name */
    public final e f32589a;

    /* renamed from: b, reason: collision with root package name */
    public final e f32590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32591c;

    /* renamed from: d, reason: collision with root package name */
    public int f32592d;

    /* renamed from: e, reason: collision with root package name */
    public int f32593e;

    /* renamed from: f, reason: collision with root package name */
    public int f32594f;

    /* renamed from: g, reason: collision with root package name */
    public int f32595g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i11) {
            return new TimeModel[i11];
        }
    }

    public TimeModel() {
        this(0);
    }

    @Nullable
    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, f32587h);
    }

    @Nullable
    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int h(int i11) {
        return i11 >= 12 ? 1 : 0;
    }

    @StringRes
    public int c() {
        return this.f32591c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
    }

    public int d() {
        if (this.f32591c == 1) {
            return this.f32592d % 24;
        }
        int i11 = this.f32592d;
        if (i11 % 12 == 0) {
            return 12;
        }
        return this.f32595g == 1 ? i11 - 12 : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public e e() {
        return this.f32590b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f32592d == timeModel.f32592d && this.f32593e == timeModel.f32593e && this.f32591c == timeModel.f32591c && this.f32594f == timeModel.f32594f;
    }

    public e g() {
        return this.f32589a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32591c), Integer.valueOf(this.f32592d), Integer.valueOf(this.f32593e), Integer.valueOf(this.f32594f)});
    }

    public void i(int i11) {
        if (this.f32591c == 1) {
            this.f32592d = i11;
        } else {
            this.f32592d = (i11 % 12) + (this.f32595g != 1 ? 0 : 12);
        }
    }

    public void j(int i11) {
        this.f32595g = h(i11);
        this.f32592d = i11;
    }

    public void k(@IntRange(from = 0, to = 59) int i11) {
        this.f32593e = i11 % 60;
    }

    public void l(int i11) {
        if (i11 != this.f32595g) {
            this.f32595g = i11;
            int i12 = this.f32592d;
            if (i12 < 12 && i11 == 1) {
                this.f32592d = i12 + 12;
            } else {
                if (i12 < 12 || i11 != 0) {
                    return;
                }
                this.f32592d = i12 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f32592d);
        parcel.writeInt(this.f32593e);
        parcel.writeInt(this.f32594f);
        parcel.writeInt(this.f32591c);
    }

    public TimeModel(int i11) {
        this(0, 0, 10, i11);
    }

    public TimeModel(int i11, int i12, int i13, int i14) {
        this.f32592d = i11;
        this.f32593e = i12;
        this.f32594f = i13;
        this.f32591c = i14;
        this.f32595g = h(i11);
        this.f32589a = new e(59);
        this.f32590b = new e(i14 == 1 ? 23 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
