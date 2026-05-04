package androidx.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {
    int mContentType;
    int mFlags;
    int mLegacyStream;
    int mUsage;

    public AudioAttributesImplBase() {
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
        this.mLegacyStream = -1;
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt("androidx.media.audio_attrs.CONTENT_TYPE", 0), bundle.getInt("androidx.media.audio_attrs.FLAGS", 0), bundle.getInt("androidx.media.audio_attrs.USAGE", 0), bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.mContentType == audioAttributesImplBase.getContentType() && this.mFlags == audioAttributesImplBase.getFlags() && this.mUsage == audioAttributesImplBase.getUsage() && this.mLegacyStream == audioAttributesImplBase.mLegacyStream;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object getAudioAttributes() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.mContentType;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i11 = this.mFlags;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i11 |= 4;
        } else if (legacyStreamType == 7) {
            i11 |= 1;
        }
        return i11 & e3.a.A;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i11 = this.mLegacyStream;
        return i11 != -1 ? i11 : AudioAttributesCompat.toVolumeStreamType(false, this.mFlags, this.mUsage);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.mLegacyStream;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.mUsage;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return AudioAttributesCompat.toVolumeStreamType(true, this.mFlags, this.mUsage);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mContentType), Integer.valueOf(this.mFlags), Integer.valueOf(this.mUsage), Integer.valueOf(this.mLegacyStream)});
    }

    @Override // androidx.media.AudioAttributesImpl
    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.media.audio_attrs.USAGE", this.mUsage);
        bundle.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.mContentType);
        bundle.putInt("androidx.media.audio_attrs.FLAGS", this.mFlags);
        int i11 = this.mLegacyStream;
        if (i11 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i11);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.mLegacyStream != -1) {
            sb2.append(" stream=");
            sb2.append(this.mLegacyStream);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.usageToString(this.mUsage));
        sb2.append(" content=");
        sb2.append(this.mContentType);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.mFlags).toUpperCase());
        return sb2.toString();
    }

    public AudioAttributesImplBase(int i11, int i12, int i13, int i14) {
        this.mContentType = i11;
        this.mFlags = i12;
        this.mUsage = i13;
        this.mLegacyStream = i14;
    }
}
