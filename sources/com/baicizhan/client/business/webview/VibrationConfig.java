package com.baicizhan.client.business.webview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@e50.g
/* loaded from: classes4.dex */
public final class VibrationConfig implements Parcelable {

    @k
    private final long[] pattern;
    private final int strength;

    @k
    public static final Parcelable.Creator<VibrationConfig> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Amplitude {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Amplitude[] $VALUES;
        public static final Amplitude AMP_LIGHT = new Amplitude("AMP_LIGHT", 0, 60);
        public static final Amplitude AMP_MEDIUM = new Amplitude("AMP_MEDIUM", 1, 150);
        public static final Amplitude AMP_STRONG = new Amplitude("AMP_STRONG", 2, 255);
        private final int amp;

        private static final /* synthetic */ Amplitude[] $values() {
            return new Amplitude[]{AMP_LIGHT, AMP_MEDIUM, AMP_STRONG};
        }

        static {
            Amplitude[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Amplitude(String str, int i11, int i12) {
            this.amp = i12;
        }

        @k
        public static m00.a<Amplitude> getEntries() {
            return $ENTRIES;
        }

        public static Amplitude valueOf(String str) {
            return (Amplitude) Enum.valueOf(Amplitude.class, str);
        }

        public static Amplitude[] values() {
            return (Amplitude[]) $VALUES.clone();
        }

        public final int getAmp() {
            return this.amp;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<VibrationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibrationConfig createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new VibrationConfig(parcel.createLongArray(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VibrationConfig[] newArray(int i11) {
            return new VibrationConfig[i11];
        }
    }

    public VibrationConfig(@k long[] pattern, int i11) {
        g0.p(pattern, "pattern");
        this.pattern = pattern;
        this.strength = i11;
    }

    public static /* synthetic */ VibrationConfig copy$default(VibrationConfig vibrationConfig, long[] jArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            jArr = vibrationConfig.pattern;
        }
        if ((i12 & 2) != 0) {
            i11 = vibrationConfig.strength;
        }
        return vibrationConfig.copy(jArr, i11);
    }

    @k
    public final long[] component1() {
        return this.pattern;
    }

    public final int component2() {
        return this.strength;
    }

    @k
    public final VibrationConfig copy(@k long[] pattern, int i11) {
        g0.p(pattern, "pattern");
        return new VibrationConfig(pattern, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(VibrationConfig.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type com.baicizhan.client.business.webview.VibrationConfig");
        VibrationConfig vibrationConfig = (VibrationConfig) obj;
        return Arrays.equals(this.pattern, vibrationConfig.pattern) && this.strength == vibrationConfig.strength;
    }

    @k
    public final long[] getPattern() {
        return this.pattern;
    }

    public final int getStrength() {
        return this.strength;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.pattern) * 31) + this.strength;
    }

    @k
    public String toString() {
        return "VibrationConfig(pattern=" + Arrays.toString(this.pattern) + ", strength=" + this.strength + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeLongArray(this.pattern);
        dest.writeInt(this.strength);
    }
}
