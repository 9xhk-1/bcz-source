package com.baicizhan.client.fm.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SolidFmList extends ArrayList<FmData> implements Parcelable {
    public static final Parcelable.Creator<SolidFmList> CREATOR = new Parcelable.Creator<SolidFmList>() { // from class: com.baicizhan.client.fm.data.SolidFmList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SolidFmList createFromParcel(Parcel in2) {
            return new SolidFmList(in2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SolidFmList[] newArray(int size) {
            return new SolidFmList[size];
        }
    };

    public SolidFmList() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        int size = size();
        dest.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            get(i11).writeToParcel(dest, flags);
        }
    }

    public SolidFmList(Parcel in2) {
        this();
        clear();
        int readInt = in2.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            add(new FmData(in2));
        }
    }
}
