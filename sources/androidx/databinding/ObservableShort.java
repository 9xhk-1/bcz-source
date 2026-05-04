package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ObservableShort extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new Parcelable.Creator<ObservableShort>() { // from class: androidx.databinding.ObservableShort.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ObservableShort[] newArray(int i11) {
            return new ObservableShort[i11];
        }
    };
    static final long serialVersionUID = 1;
    private short mValue;

    public ObservableShort(short s11) {
        this.mValue = s11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short get() {
        return this.mValue;
    }

    public void set(short s11) {
        if (s11 != this.mValue) {
            this.mValue = s11;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.mValue);
    }

    public ObservableShort() {
    }

    public ObservableShort(Observable... observableArr) {
        super(observableArr);
    }
}
