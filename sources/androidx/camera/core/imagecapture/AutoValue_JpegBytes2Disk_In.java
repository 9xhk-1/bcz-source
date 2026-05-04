package androidx.camera.core.imagecapture;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.processing.Packet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_JpegBytes2Disk_In extends JpegBytes2Disk.In {
    private final ImageCapture.OutputFileOptions outputFileOptions;
    private final Packet<byte[]> packet;

    public AutoValue_JpegBytes2Disk_In(Packet<byte[]> packet, ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.packet = packet;
        if (outputFileOptions == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.outputFileOptions = outputFileOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JpegBytes2Disk.In) {
            JpegBytes2Disk.In in2 = (JpegBytes2Disk.In) obj;
            if (this.packet.equals(in2.getPacket()) && this.outputFileOptions.equals(in2.getOutputFileOptions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    @NonNull
    public ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.In
    @NonNull
    public Packet<byte[]> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.outputFileOptions.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.packet + ", outputFileOptions=" + this.outputFileOptions + com.alipay.sdk.m.u.i.f11099d;
    }
}
