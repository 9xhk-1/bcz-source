package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    @l
    private final Intent data;
    private final int resultCode;

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: androidx.activity.result.ActivityResult$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new ActivityResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i11) {
            return new ActivityResult[i11];
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final String resultCodeToString(int i11) {
            return i11 != -1 ? i11 != 0 ? String.valueOf(i11) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private Companion() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public ActivityResult(int i11, @l Intent intent) {
        this.resultCode = i11;
        this.data = intent;
    }

    @o
    @k
    public static final String resultCodeToString(int i11) {
        return Companion.resultCodeToString(i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Intent getData() {
        return this.data;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @k
    public String toString() {
        return "ActivityResult{resultCode=" + Companion.resultCodeToString(this.resultCode) + ", data=" + this.data + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.resultCode);
        dest.writeInt(this.data == null ? 0 : 1);
        Intent intent = this.data;
        if (intent != null) {
            intent.writeToParcel(dest, i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(@k Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        g0.p(parcel, "parcel");
    }
}
