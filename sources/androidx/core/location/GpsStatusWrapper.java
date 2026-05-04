package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import com.baicizhan.client.business.util.ErrCodes;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
class GpsStatusWrapper extends GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;

    @GuardedBy("mWrapped")
    private Iterator<GpsSatellite> mCachedIterator;

    @GuardedBy("mWrapped")
    private int mCachedIteratorPosition;

    @GuardedBy("mWrapped")
    private GpsSatellite mCachedSatellite;

    @GuardedBy("mWrapped")
    private int mCachedSatelliteCount;
    private final GpsStatus mWrapped;

    public GpsStatusWrapper(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.mWrapped = gpsStatus2;
        this.mCachedSatelliteCount = -1;
        this.mCachedIterator = gpsStatus2.getSatellites().iterator();
        this.mCachedIteratorPosition = -1;
        this.mCachedSatellite = null;
    }

    private static int getConstellationFromPrn(int i11) {
        if (i11 > 0 && i11 <= 32) {
            return 1;
        }
        if (i11 >= 33 && i11 <= 64) {
            return 2;
        }
        if (i11 > 64 && i11 <= 88) {
            return 3;
        }
        if (i11 <= 200 || i11 > 235) {
            return (i11 < 193 || i11 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite getSatellite(int i11) {
        GpsSatellite gpsSatellite;
        synchronized (this.mWrapped) {
            try {
                if (i11 < this.mCachedIteratorPosition) {
                    this.mCachedIterator = this.mWrapped.getSatellites().iterator();
                    this.mCachedIteratorPosition = -1;
                }
                while (true) {
                    int i12 = this.mCachedIteratorPosition;
                    if (i12 >= i11) {
                        break;
                    }
                    this.mCachedIteratorPosition = i12 + 1;
                    if (!this.mCachedIterator.hasNext()) {
                        this.mCachedSatellite = null;
                        break;
                    }
                    this.mCachedSatellite = this.mCachedIterator.next();
                }
                gpsSatellite = this.mCachedSatellite;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (GpsSatellite) Preconditions.checkNotNull(gpsSatellite);
    }

    private static int getSvidFromPrn(int i11) {
        int constellationFromPrn = getConstellationFromPrn(i11);
        return constellationFromPrn != 2 ? constellationFromPrn != 3 ? constellationFromPrn != 5 ? i11 : i11 + ErrCodes.ERR_TOKEN_LOST : i11 - 64 : i11 + 87;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GpsStatusWrapper) {
            return this.mWrapped.equals(((GpsStatusWrapper) obj).mWrapped);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i11) {
        return getSatellite(i11).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i11) {
        return getSatellite(i11).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i11) {
        return getConstellationFromPrn(getSatellite(i11).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i11) {
        return getSatellite(i11).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int i11;
        synchronized (this.mWrapped) {
            try {
                if (this.mCachedSatelliteCount == -1) {
                    for (GpsSatellite gpsSatellite : this.mWrapped.getSatellites()) {
                        this.mCachedSatelliteCount++;
                    }
                    this.mCachedSatelliteCount++;
                }
                i11 = this.mCachedSatelliteCount;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i11) {
        return getSvidFromPrn(getSatellite(i11).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i11) {
        return getSatellite(i11).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i11) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i11) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i11) {
        return getSatellite(i11).hasEphemeris();
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i11) {
        return getSatellite(i11).usedInFix();
    }
}
