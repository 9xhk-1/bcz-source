package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    private final BitmapDecoder bitmapDecoder;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting(otherwise = 2)
    public interface BitmapDecoder {
        Bitmap decode(byte[] bArr, int i11) throws ImageDecoderException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapDecoder bitmapDecoder;

        public Factory() {
            this.bitmapDecoder = new BitmapDecoder() { // from class: androidx.media3.exoplayer.image.a
                @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
                public final Bitmap decode(byte[] bArr, int i11) {
                    Bitmap decode;
                    decode = BitmapFactoryImageDecoder.decode(bArr, i11);
                    return decode;
                }
            };
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return (str == null || !MimeTypes.isImage(str)) ? RendererCapabilities.create(0) : Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? RendererCapabilities.create(4) : RendererCapabilities.create(1);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.bitmapDecoder);
        }

        public Factory(BitmapDecoder bitmapDecoder) {
            this.bitmapDecoder = bitmapDecoder;
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException {
        return (ImageOutputBuffer) super.dequeueOutputBuffer();
    }

    @Override // androidx.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(BitmapDecoder bitmapDecoder) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.bitmapDecoder = bitmapDecoder;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    @Nullable
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z11) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
            Assertions.checkState(byteBuffer.hasArray());
            Assertions.checkArgument(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.bitmap = this.bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ImageDecoderException e11) {
            return e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr, int i11) throws ImageDecoderException {
        try {
            return BitmapUtil.decode(bArr, i11, null, -1);
        } catch (ParserException e11) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i11 + j.f81007d, e11);
        } catch (IOException e12) {
            throw new ImageDecoderException(e12);
        }
    }
}
