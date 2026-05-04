package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import fm.f;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Entry extends f implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    public float f30254d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<Entry> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Entry[] newArray(int i11) {
            return new Entry[i11];
        }
    }

    public Entry() {
        this.f30254d = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry h() {
        return new Entry(this.f30254d, c(), a());
    }

    public boolean i(Entry entry) {
        if (entry == null || entry.a() != a()) {
            return false;
        }
        float abs = Math.abs(entry.f30254d - this.f30254d);
        float f11 = k.f84293g;
        return abs <= f11 && Math.abs(entry.c() - c()) <= f11;
    }

    public float j() {
        return this.f30254d;
    }

    public void k(float f11) {
        this.f30254d = f11;
    }

    public String toString() {
        return "Entry, x: " + this.f30254d + " y: " + c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f30254d);
        parcel.writeFloat(c());
        if (a() == null) {
            parcel.writeInt(0);
        } else {
            if (!(a() instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) a(), i11);
        }
    }

    public Entry(float f11, float f12) {
        super(f12);
        this.f30254d = f11;
    }

    public Entry(float f11, float f12, Object obj) {
        super(f12, obj);
        this.f30254d = f11;
    }

    public Entry(float f11, float f12, Drawable drawable) {
        super(f12, drawable);
        this.f30254d = f11;
    }

    public Entry(float f11, float f12, Drawable drawable, Object obj) {
        super(f12, drawable, obj);
        this.f30254d = f11;
    }

    public Entry(Parcel parcel) {
        this.f30254d = 0.0f;
        this.f30254d = parcel.readFloat();
        g(parcel.readFloat());
        if (parcel.readInt() == 1) {
            d(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
