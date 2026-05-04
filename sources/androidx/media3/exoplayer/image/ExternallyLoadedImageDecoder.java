package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import com.google.common.util.concurrent.d1;
import com.google.common.util.concurrent.p1;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ExternallyLoadedImageDecoder implements ImageDecoder {
    private final BitmapResolver bitmapResolver;
    private final DecoderInputBuffer inputBuffer;
    private final ImageOutputBuffer outputBuffer;

    @Nullable
    private p1<Bitmap> pendingDecode;
    private long pendingDecodeTimeUs;
    private boolean pendingEndOfStream;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface BitmapResolver {
        p1<Bitmap> resolve(ExternalImageRequest externalImageRequest);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ExternalImageRequest {
        public final Uri uri;

        public ExternalImageRequest(Uri uri) {
            this.uri = uri;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapResolver bitmapResolver;

        public Factory(BitmapResolver bitmapResolver) {
            this.bitmapResolver = bitmapResolver;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            return RendererCapabilities.create(Objects.equals(format.sampleMimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE) ? 4 : MimeTypes.isImage(format.sampleMimeType) ? 1 : 0);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public ExternallyLoadedImageDecoder createImageDecoder() {
            return new ExternallyLoadedImageDecoder(this.bitmapResolver);
        }
    }

    private void resetState() {
        p1<Bitmap> p1Var = this.pendingDecode;
        if (p1Var != null) {
            p1Var.cancel(false);
            this.pendingDecode = null;
        }
        this.pendingEndOfStream = false;
        this.outputBuffer.release();
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        resetState();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "externallyLoadedImageDecoder";
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
        resetState();
    }

    private ExternallyLoadedImageDecoder(BitmapResolver bitmapResolver) {
        this.bitmapResolver = bitmapResolver;
        this.inputBuffer = new DecoderInputBuffer(1);
        this.outputBuffer = new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.ExternallyLoadedImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                clear();
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public DecoderInputBuffer dequeueInputBuffer() {
        if (this.pendingDecode == null) {
            return this.inputBuffer;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException {
        if (this.pendingEndOfStream) {
            this.outputBuffer.addFlag(4);
            this.pendingEndOfStream = false;
            return this.outputBuffer;
        }
        p1<Bitmap> p1Var = this.pendingDecode;
        if (p1Var != null) {
            try {
                if (p1Var.isDone()) {
                    try {
                        this.outputBuffer.bitmap = (Bitmap) d1.j(this.pendingDecode);
                        ImageOutputBuffer imageOutputBuffer = this.outputBuffer;
                        imageOutputBuffer.timeUs = this.pendingDecodeTimeUs;
                        return imageOutputBuffer;
                    } catch (CancellationException e11) {
                        throw new ImageDecoderException(e11);
                    } catch (ExecutionException e12) {
                        throw new ImageDecoderException(e12.getCause());
                    }
                }
            } finally {
                this.pendingDecode = null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.image.ImageDecoder, androidx.media3.decoder.Decoder
    public void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            this.pendingEndOfStream = true;
            decoderInputBuffer.clear();
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
        Assertions.checkState(byteBuffer.hasArray());
        this.pendingDecode = this.bitmapResolver.resolve(new ExternalImageRequest(Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8))));
        this.pendingDecodeTimeUs = decoderInputBuffer.timeUs;
        decoderInputBuffer.clear();
    }

    @Override // androidx.media3.decoder.Decoder
    public void setOutputStartTimeUs(long j11) {
    }
}
