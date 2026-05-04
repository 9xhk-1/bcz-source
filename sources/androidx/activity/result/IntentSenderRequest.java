package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    @l
    private final Intent fillInIntent;
    private final int flagsMask;
    private final int flagsValues;

    @k
    private final IntentSender intentSender;

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            g0.p(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i11) {
            return new IntentSenderRequest[i11];
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {

        @l
        private Intent fillInIntent;
        private int flagsMask;
        private int flagsValues;

        @k
        private final IntentSender intentSender;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @zz.c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Flag {
        }

        public Builder(@k IntentSender intentSender) {
            g0.p(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        @k
        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }

        @k
        public final Builder setFillInIntent(@l Intent intent) {
            this.fillInIntent = intent;
            return this;
        }

        @k
        public final Builder setFlags(int i11, int i12) {
            this.flagsValues = i11;
            this.flagsMask = i12;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder(@m80.k android.app.PendingIntent r2) {
            /*
                r1 = this;
                java.lang.String r0 = "pendingIntent"
                kotlin.jvm.internal.g0.p(r2, r0)
                android.content.IntentSender r2 = r2.getIntentSender()
                java.lang.String r0 = "pendingIntent.intentSender"
                kotlin.jvm.internal.g0.o(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.Builder.<init>(android.app.PendingIntent):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public IntentSenderRequest(@k IntentSender intentSender, @l Intent intent, int i11, int i12) {
        g0.p(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i11;
        this.flagsValues = i12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    @k
    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeParcelable(this.intentSender, i11);
        dest.writeParcelable(this.fillInIntent, i11);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i11, int i12, int i13, v vVar) {
        this(intentSender, (i13 & 2) != 0 ? null : intent, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IntentSenderRequest(@m80.k android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.g0.m(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.IntentSenderRequest.<init>(android.os.Parcel):void");
    }
}
