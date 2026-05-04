package com.rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f41576a;

    /* renamed from: b, reason: collision with root package name */
    public int f41577b;

    /* renamed from: c, reason: collision with root package name */
    public int f41578c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<PositionSavedState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PositionSavedState createFromParcel(Parcel parcel) {
            return new PositionSavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PositionSavedState[] newArray(int i11) {
            return new PositionSavedState[i11];
        }
    }

    public /* synthetic */ PositionSavedState(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int a() {
        return this.f41578c;
    }

    public int b() {
        return this.f41576a;
    }

    public int c() {
        return this.f41577b;
    }

    public void d(int i11) {
        this.f41578c = i11;
    }

    public void e(int i11) {
        this.f41576a = i11;
    }

    public void g(int i11) {
        this.f41577b = i11;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f41576a);
        parcel.writeInt(this.f41577b);
        parcel.writeInt(this.f41578c);
    }

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public PositionSavedState(Parcel parcel) {
        super(parcel);
        this.f41576a = parcel.readInt();
        this.f41577b = parcel.readInt();
        this.f41578c = parcel.readInt();
    }
}
