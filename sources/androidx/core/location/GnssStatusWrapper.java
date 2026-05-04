package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
class GnssStatusWrapper extends GnssStatusCompat {
    private final GnssStatus mWrapped;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static float getCarrierFrequencyHz(GnssStatus gnssStatus, int i11) {
            return gnssStatus.getCarrierFrequencyHz(i11);
        }

        @DoNotInline
        public static boolean hasCarrierFrequencyHz(GnssStatus gnssStatus, int i11) {
            return gnssStatus.hasCarrierFrequencyHz(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        public static float getBasebandCn0DbHz(GnssStatus gnssStatus, int i11) {
            return gnssStatus.getBasebandCn0DbHz(i11);
        }

        @DoNotInline
        public static boolean hasBasebandCn0DbHz(GnssStatus gnssStatus, int i11) {
            return gnssStatus.hasBasebandCn0DbHz(i11);
        }
    }

    public GnssStatusWrapper(Object obj) {
        this.mWrapped = (GnssStatus) Preconditions.checkNotNull((GnssStatus) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.mWrapped.equals(((GnssStatusWrapper) obj).mWrapped);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i11) {
        return this.mWrapped.getAzimuthDegrees(i11);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getBasebandCn0DbHz(this.mWrapped, i11);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getCarrierFrequencyHz(this.mWrapped, i11);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i11) {
        return this.mWrapped.getCn0DbHz(i11);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i11) {
        return this.mWrapped.getConstellationType(i11);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i11) {
        return this.mWrapped.getElevationDegrees(i11);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        return this.mWrapped.getSatelliteCount();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i11) {
        return this.mWrapped.getSvid(i11);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i11) {
        return this.mWrapped.hasAlmanacData(i11);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.hasBasebandCn0DbHz(this.mWrapped, i11);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasCarrierFrequencyHz(this.mWrapped, i11);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i11) {
        return this.mWrapped.hasEphemerisData(i11);
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i11) {
        return this.mWrapped.usedInFix(i11);
    }
}
