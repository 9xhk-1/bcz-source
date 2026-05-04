package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_AudioStream_PacketInfo extends AudioStream.PacketInfo {
    private final int sizeInBytes;
    private final long timestampNs;

    public AutoValue_AudioStream_PacketInfo(int i11, long j11) {
        this.sizeInBytes = i11;
        this.timestampNs = j11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStream.PacketInfo) {
            AudioStream.PacketInfo packetInfo = (AudioStream.PacketInfo) obj;
            if (this.sizeInBytes == packetInfo.getSizeInBytes() && this.timestampNs == packetInfo.getTimestampNs()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public long getTimestampNs() {
        return this.timestampNs;
    }

    public int hashCode() {
        int i11 = (this.sizeInBytes ^ 1000003) * 1000003;
        long j11 = this.timestampNs;
        return i11 ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.sizeInBytes + ", timestampNs=" + this.timestampNs + com.alipay.sdk.m.u.i.f11099d;
    }
}
