package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j11, long j12) {
        this.mNumerator = j11;
        this.mDenominator = j12;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    @NonNull
    public String toString() {
        return this.mNumerator + "/" + this.mDenominator;
    }

    public LongRational(double d11) {
        this((long) (d11 * 10000.0d), 10000L);
    }
}
