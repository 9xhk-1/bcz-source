package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SieveCacheKt;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Api19Impl {
        private static Method sCreateFromDeprecatedProviderMethod;
        private static Class<?> sLocationRequestClass;
        private static Method sSetExpireInMethod;
        private static Method sSetFastestIntervalMethod;
        private static Method sSetNumUpdatesMethod;
        private static Method sSetQualityMethod;

        private Api19Impl() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static Object toLocationRequest(LocationRequestCompat locationRequestCompat, String str) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                Method method = sCreateFromDeprecatedProviderMethod;
                Class cls = Long.TYPE;
                if (method == null) {
                    Method declaredMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                    sCreateFromDeprecatedProviderMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = sCreateFromDeprecatedProviderMethod.invoke(null, str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                Method method2 = sSetQualityMethod;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = sLocationRequestClass.getDeclaredMethod("setQuality", cls2);
                    sSetQualityMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                sSetQualityMethod.invoke(invoke, Integer.valueOf(locationRequestCompat.getQuality()));
                if (sSetFastestIntervalMethod == null) {
                    Method declaredMethod3 = sLocationRequestClass.getDeclaredMethod("setFastestInterval", cls);
                    sSetFastestIntervalMethod = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                sSetFastestIntervalMethod.invoke(invoke, Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (sSetNumUpdatesMethod == null) {
                        Method declaredMethod4 = sLocationRequestClass.getDeclaredMethod("setNumUpdates", cls2);
                        sSetNumUpdatesMethod = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    sSetNumUpdatesMethod.invoke(invoke, Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (sSetExpireInMethod == null) {
                        Method declaredMethod5 = sLocationRequestClass.getDeclaredMethod("setExpireIn", cls);
                        sSetExpireInMethod = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    sSetExpireInMethod.invoke(invoke, Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static LocationRequest toLocationRequest(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Quality {
    }

    public LocationRequestCompat(long j11, int i11, long j12, int i12, long j13, float f11, long j14) {
        this.mIntervalMillis = j11;
        this.mQuality = i11;
        this.mMinUpdateIntervalMillis = j13;
        this.mDurationMillis = j12;
        this.mMaxUpdates = i12;
        this.mMinUpdateDistanceMeters = f11;
        this.mMaxUpdateDelayMillis = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        return this.mQuality == locationRequestCompat.mQuality && this.mIntervalMillis == locationRequestCompat.mIntervalMillis && this.mMinUpdateIntervalMillis == locationRequestCompat.mMinUpdateIntervalMillis && this.mDurationMillis == locationRequestCompat.mDurationMillis && this.mMaxUpdates == locationRequestCompat.mMaxUpdates && Float.compare(locationRequestCompat.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) == 0 && this.mMaxUpdateDelayMillis == locationRequestCompat.mMaxUpdateDelayMillis;
    }

    @IntRange(from = 1)
    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    @IntRange(from = 0)
    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    @IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    @IntRange(from = 1, to = SieveCacheKt.NodeLinkMask)
    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    @FloatRange(from = 0.0d, to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    @IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j11 = this.mMinUpdateIntervalMillis;
        return j11 == -1 ? this.mIntervalMillis : j11;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        int i11 = this.mQuality * 31;
        long j11 = this.mIntervalMillis;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.mMinUpdateIntervalMillis;
        return i12 + ((int) (j12 ^ (j12 >>> 32)));
    }

    @NonNull
    @RequiresApi(31)
    public LocationRequest toLocationRequest() {
        return Api31Impl.toLocationRequest(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (this.mIntervalMillis != Long.MAX_VALUE) {
            sb2.append(EmailAutoCompleteEditText.f17091d);
            TimeUtils.formatDuration(this.mIntervalMillis, sb2);
            int i11 = this.mQuality;
            if (i11 == 100) {
                sb2.append(" HIGH_ACCURACY");
            } else if (i11 == 102) {
                sb2.append(" BALANCED");
            } else if (i11 == 104) {
                sb2.append(" LOW_POWER");
            }
        } else {
            sb2.append("PASSIVE");
        }
        if (this.mDurationMillis != Long.MAX_VALUE) {
            sb2.append(", duration=");
            TimeUtils.formatDuration(this.mDurationMillis, sb2);
        }
        if (this.mMaxUpdates != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.mMaxUpdates);
        }
        long j11 = this.mMinUpdateIntervalMillis;
        if (j11 != -1 && j11 < this.mIntervalMillis) {
            sb2.append(", minUpdateInterval=");
            TimeUtils.formatDuration(this.mMinUpdateIntervalMillis, sb2);
        }
        if (this.mMinUpdateDistanceMeters > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.mMinUpdateDistanceMeters);
        }
        if (this.mMaxUpdateDelayMillis / 2 > this.mIntervalMillis) {
            sb2.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(this.mMaxUpdateDelayMillis, sb2);
        }
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    @Nullable
    @SuppressLint({"NewApi"})
    public LocationRequest toLocationRequest(@NonNull String str) {
        return Build.VERSION.SDK_INT >= 31 ? toLocationRequest() : w.a(Api19Impl.toLocationRequest(this, str));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long j11) {
            setIntervalMillis(j11);
            this.mQuality = 102;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1L;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0L;
        }

        @NonNull
        public LocationRequestCompat build() {
            Preconditions.checkState((this.mIntervalMillis == Long.MAX_VALUE && this.mMinUpdateIntervalMillis == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j11 = this.mIntervalMillis;
            return new LocationRequestCompat(j11, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, j11), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1L;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j11) {
            this.mDurationMillis = Preconditions.checkArgumentInRange(j11, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j11) {
            this.mIntervalMillis = Preconditions.checkArgumentInRange(j11, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j11) {
            this.mMaxUpdateDelayMillis = j11;
            this.mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(j11, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, to = 2147483647L) int i11) {
            this.mMaxUpdates = Preconditions.checkArgumentInRange(i11, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, to = 3.4028234663852886E38d) float f11) {
            this.mMinUpdateDistanceMeters = f11;
            this.mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(f11, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j11) {
            this.mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(j11, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public Builder setQuality(int i11) {
            Preconditions.checkArgument(i11 == 104 || i11 == 102 || i11 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i11));
            this.mQuality = i11;
            return this;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.mIntervalMillis;
            this.mQuality = locationRequestCompat.mQuality;
            this.mDurationMillis = locationRequestCompat.mDurationMillis;
            this.mMaxUpdates = locationRequestCompat.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequestCompat.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequestCompat.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequestCompat.mMaxUpdateDelayMillis;
        }
    }
}
