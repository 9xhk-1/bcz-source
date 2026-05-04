package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DeviceInfo {
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;

    @IntRange(from = 0)
    public final int maxVolume;

    @IntRange(from = 0)
    public final int minVolume;
    public final int playbackType;

    @Nullable
    public final String routingControllerId;
    public static final DeviceInfo UNKNOWN = new Builder(0).build();
    private static final String FIELD_PLAYBACK_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_MIN_VOLUME = Util.intToStringMaxRadix(1);
    private static final String FIELD_MAX_VOLUME = Util.intToStringMaxRadix(2);
    private static final String FIELD_ROUTING_CONTROLLER_ID = Util.intToStringMaxRadix(3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private int maxVolume;
        private int minVolume;
        private final int playbackType;

        @Nullable
        private String routingControllerId;

        public Builder(int i11) {
            this.playbackType = i11;
        }

        public DeviceInfo build() {
            Assertions.checkArgument(this.minVolume <= this.maxVolume);
            return new DeviceInfo(this);
        }

        @uo.a
        public Builder setMaxVolume(@IntRange(from = 0) int i11) {
            this.maxVolume = i11;
            return this;
        }

        @uo.a
        public Builder setMinVolume(@IntRange(from = 0) int i11) {
            this.minVolume = i11;
            return this;
        }

        @uo.a
        public Builder setRoutingControllerId(@Nullable String str) {
            Assertions.checkArgument(this.playbackType != 0 || str == null);
            this.routingControllerId = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    @UnstableApi
    public static DeviceInfo fromBundle(Bundle bundle) {
        int i11 = bundle.getInt(FIELD_PLAYBACK_TYPE, 0);
        int i12 = bundle.getInt(FIELD_MIN_VOLUME, 0);
        int i13 = bundle.getInt(FIELD_MAX_VOLUME, 0);
        return new Builder(i11).setMinVolume(i12).setMaxVolume(i13).setRoutingControllerId(bundle.getString(FIELD_ROUTING_CONTROLLER_ID)).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.playbackType == deviceInfo.playbackType && this.minVolume == deviceInfo.minVolume && this.maxVolume == deviceInfo.maxVolume && Objects.equals(this.routingControllerId, deviceInfo.routingControllerId);
    }

    public int hashCode() {
        int i11 = (((((527 + this.playbackType) * 31) + this.minVolume) * 31) + this.maxVolume) * 31;
        String str = this.routingControllerId;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i11 = this.playbackType;
        if (i11 != 0) {
            bundle.putInt(FIELD_PLAYBACK_TYPE, i11);
        }
        int i12 = this.minVolume;
        if (i12 != 0) {
            bundle.putInt(FIELD_MIN_VOLUME, i12);
        }
        int i13 = this.maxVolume;
        if (i13 != 0) {
            bundle.putInt(FIELD_MAX_VOLUME, i13);
        }
        String str = this.routingControllerId;
        if (str != null) {
            bundle.putString(FIELD_ROUTING_CONTROLLER_ID, str);
        }
        return bundle;
    }

    @UnstableApi
    @Deprecated
    public DeviceInfo(int i11, @IntRange(from = 0) int i12, @IntRange(from = 0) int i13) {
        this(new Builder(i11).setMinVolume(i12).setMaxVolume(i13));
    }

    private DeviceInfo(Builder builder) {
        this.playbackType = builder.playbackType;
        this.minVolume = builder.minVolume;
        this.maxVolume = builder.maxVolume;
        this.routingControllerId = builder.routingControllerId;
    }
}
