package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AudioAttributes {
    public final int allowedCapturePolicy;

    @Nullable
    private AudioAttributesV21 audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int spatializationBehavior;
    public final int usage;
    public static final AudioAttributes DEFAULT = new Builder().build();
    private static final String FIELD_CONTENT_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_FLAGS = Util.intToStringMaxRadix(1);
    private static final String FIELD_USAGE = Util.intToStringMaxRadix(2);
    private static final String FIELD_ALLOWED_CAPTURE_POLICY = Util.intToStringMaxRadix(3);
    private static final String FIELD_SPATIALIZATION_BEHAVIOR = Util.intToStringMaxRadix(4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class Api29 {
        private Api29() {
        }

        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i11) {
            builder.setAllowedCapturePolicy(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(32)
    public static final class Api32 {
        private Api32() {
        }

        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i11) {
            builder.setSpatializationBehavior(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(AudioAttributes audioAttributes) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(audioAttributes.contentType).setFlags(audioAttributes.flags).setUsage(audioAttributes.usage);
            int i11 = Util.SDK_INT;
            if (i11 >= 29) {
                Api29.setAllowedCapturePolicy(usage, audioAttributes.allowedCapturePolicy);
            }
            if (i11 >= 32) {
                Api32.setSpatializationBehavior(usage, audioAttributes.spatializationBehavior);
            }
            this.audioAttributes = usage.build();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;
        private int allowedCapturePolicy = 1;
        private int spatializationBehavior = 0;

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy, this.spatializationBehavior);
        }

        @uo.a
        public Builder setAllowedCapturePolicy(int i11) {
            this.allowedCapturePolicy = i11;
            return this;
        }

        @uo.a
        public Builder setContentType(int i11) {
            this.contentType = i11;
            return this;
        }

        @uo.a
        public Builder setFlags(int i11) {
            this.flags = i11;
            return this;
        }

        @uo.a
        public Builder setSpatializationBehavior(int i11) {
            this.spatializationBehavior = i11;
            return this;
        }

        @uo.a
        public Builder setUsage(int i11) {
            this.usage = i11;
            return this;
        }
    }

    @UnstableApi
    public static AudioAttributes fromBundle(Bundle bundle) {
        Builder builder = new Builder();
        String str = FIELD_CONTENT_TYPE;
        if (bundle.containsKey(str)) {
            builder.setContentType(bundle.getInt(str));
        }
        String str2 = FIELD_FLAGS;
        if (bundle.containsKey(str2)) {
            builder.setFlags(bundle.getInt(str2));
        }
        String str3 = FIELD_USAGE;
        if (bundle.containsKey(str3)) {
            builder.setUsage(bundle.getInt(str3));
        }
        String str4 = FIELD_ALLOWED_CAPTURE_POLICY;
        if (bundle.containsKey(str4)) {
            builder.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = FIELD_SPATIALIZATION_BEHAVIOR;
        if (bundle.containsKey(str5)) {
            builder.setSpatializationBehavior(bundle.getInt(str5));
        }
        return builder.build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AudioAttributes.class == obj.getClass()) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            if (this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy && this.spatializationBehavior == audioAttributes.spatializationBehavior) {
                return true;
            }
        }
        return false;
    }

    public AudioAttributesV21 getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            this.audioAttributesV21 = new AudioAttributesV21();
        }
        return this.audioAttributesV21;
    }

    @UnstableApi
    public int getStreamType() {
        if ((this.flags & 1) == 1) {
            return 1;
        }
        switch (this.usage) {
        }
        return 1;
    }

    public int hashCode() {
        return ((((((((527 + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy) * 31) + this.spatializationBehavior;
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_CONTENT_TYPE, this.contentType);
        bundle.putInt(FIELD_FLAGS, this.flags);
        bundle.putInt(FIELD_USAGE, this.usage);
        bundle.putInt(FIELD_ALLOWED_CAPTURE_POLICY, this.allowedCapturePolicy);
        bundle.putInt(FIELD_SPATIALIZATION_BEHAVIOR, this.spatializationBehavior);
        return bundle;
    }

    private AudioAttributes(int i11, int i12, int i13, int i14, int i15) {
        this.contentType = i11;
        this.flags = i12;
        this.usage = i13;
        this.allowedCapturePolicy = i14;
        this.spatializationBehavior = i15;
    }
}
