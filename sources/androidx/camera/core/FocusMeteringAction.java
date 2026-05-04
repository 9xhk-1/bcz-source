package androidx.camera.core;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusMeteringAction {
    static final long DEFAULT_AUTOCANCEL_DURATION = 5000;
    static final int DEFAULT_METERING_MODE = 7;
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;
    private final long mAutoCancelDurationInMillis;
    private final List<MeteringPoint> mMeteringPointsAe;
    private final List<MeteringPoint> mMeteringPointsAf;
    private final List<MeteringPoint> mMeteringPointsAwb;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {
        long mAutoCancelDurationInMillis;
        final List<MeteringPoint> mMeteringPointsAe;
        final List<MeteringPoint> mMeteringPointsAf;
        final List<MeteringPoint> mMeteringPointsAwb;

        public Builder(@NonNull MeteringPoint meteringPoint) {
            this(meteringPoint, 7);
        }

        @NonNull
        public Builder addPoint(@NonNull MeteringPoint meteringPoint) {
            return addPoint(meteringPoint, 7);
        }

        @NonNull
        public FocusMeteringAction build() {
            return new FocusMeteringAction(this);
        }

        @NonNull
        public Builder disableAutoCancel() {
            this.mAutoCancelDurationInMillis = 0L;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder removePoints(int i11) {
            if ((i11 & 1) != 0) {
                this.mMeteringPointsAf.clear();
            }
            if ((i11 & 2) != 0) {
                this.mMeteringPointsAe.clear();
            }
            if ((i11 & 4) != 0) {
                this.mMeteringPointsAwb.clear();
            }
            return this;
        }

        @NonNull
        public Builder setAutoCancelDuration(@IntRange(from = 1) long j11, @NonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(j11 >= 1, "autoCancelDuration must be at least 1");
            this.mAutoCancelDurationInMillis = timeUnit.toMillis(j11);
            return this;
        }

        public Builder(@NonNull MeteringPoint meteringPoint, int i11) {
            this.mMeteringPointsAf = new ArrayList();
            this.mMeteringPointsAe = new ArrayList();
            this.mMeteringPointsAwb = new ArrayList();
            this.mAutoCancelDurationInMillis = 5000L;
            addPoint(meteringPoint, i11);
        }

        @NonNull
        public Builder addPoint(@NonNull MeteringPoint meteringPoint, int i11) {
            boolean z11 = false;
            Preconditions.checkArgument(meteringPoint != null, "Point cannot be null.");
            if (i11 >= 1 && i11 <= 7) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "Invalid metering mode " + i11);
            if ((i11 & 1) != 0) {
                this.mMeteringPointsAf.add(meteringPoint);
            }
            if ((i11 & 2) != 0) {
                this.mMeteringPointsAe.add(meteringPoint);
            }
            if ((i11 & 4) != 0) {
                this.mMeteringPointsAwb.add(meteringPoint);
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder(@NonNull FocusMeteringAction focusMeteringAction) {
            ArrayList arrayList = new ArrayList();
            this.mMeteringPointsAf = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.mMeteringPointsAe = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.mMeteringPointsAwb = arrayList3;
            this.mAutoCancelDurationInMillis = 5000L;
            arrayList.addAll(focusMeteringAction.getMeteringPointsAf());
            arrayList2.addAll(focusMeteringAction.getMeteringPointsAe());
            arrayList3.addAll(focusMeteringAction.getMeteringPointsAwb());
            this.mAutoCancelDurationInMillis = focusMeteringAction.getAutoCancelDurationInMillis();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MeteringMode {
    }

    public FocusMeteringAction(Builder builder) {
        this.mMeteringPointsAf = Collections.unmodifiableList(builder.mMeteringPointsAf);
        this.mMeteringPointsAe = Collections.unmodifiableList(builder.mMeteringPointsAe);
        this.mMeteringPointsAwb = Collections.unmodifiableList(builder.mMeteringPointsAwb);
        this.mAutoCancelDurationInMillis = builder.mAutoCancelDurationInMillis;
    }

    public long getAutoCancelDurationInMillis() {
        return this.mAutoCancelDurationInMillis;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAe() {
        return this.mMeteringPointsAe;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAf() {
        return this.mMeteringPointsAf;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAwb() {
        return this.mMeteringPointsAwb;
    }

    public boolean isAutoCancelEnabled() {
        return this.mAutoCancelDurationInMillis > 0;
    }
}
