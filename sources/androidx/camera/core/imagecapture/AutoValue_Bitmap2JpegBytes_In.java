package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.processing.Packet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_Bitmap2JpegBytes_In extends Bitmap2JpegBytes.In {
    private final int jpegQuality;
    private final Packet<Bitmap> packet;

    public AutoValue_Bitmap2JpegBytes_In(Packet<Bitmap> packet, int i11) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.packet = packet;
        this.jpegQuality = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bitmap2JpegBytes.In) {
            Bitmap2JpegBytes.In in2 = (Bitmap2JpegBytes.In) obj;
            if (this.packet.equals(in2.getPacket()) && this.jpegQuality == in2.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    public Packet<Bitmap> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }

    public String toString() {
        return "In{packet=" + this.packet + ", jpegQuality=" + this.jpegQuality + com.alipay.sdk.m.u.i.f11099d;
    }
}
