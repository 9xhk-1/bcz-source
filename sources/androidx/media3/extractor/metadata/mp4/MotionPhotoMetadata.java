package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import ro.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    public MotionPhotoMetadata(long j11, long j12, long j13, long j14, long j15) {
        this.photoStartPosition = j11;
        this.photoSize = j12;
        this.photoPresentationTimestampUs = j13;
        this.videoStartPosition = j14;
        this.videoSize = j15;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + k.l(this.photoStartPosition)) * 31) + k.l(this.photoSize)) * 31) + k.l(this.photoPresentationTimestampUs)) * 31) + k.l(this.videoStartPosition)) * 31) + k.l(this.videoSize);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.photoStartPosition + ", photoSize=" + this.photoSize + ", photoPresentationTimestampUs=" + this.photoPresentationTimestampUs + ", videoStartPosition=" + this.videoStartPosition + ", videoSize=" + this.videoSize;
    }
}
