package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ImageRenderer extends BaseRenderer {
    private static final long IMAGE_PRESENTATION_WINDOW_THRESHOLD_US = 30000;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM_THEN_WAIT = 2;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 3;
    private static final String TAG = "ImageRenderer";
    private boolean codecNeedsInitialization;
    private int currentTileIndex;

    @Nullable
    private ImageDecoder decoder;
    private final ImageDecoder.Factory decoderFactory;
    private int decoderReinitializationState;
    private int firstFrameState;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private ImageOutput imageOutput;

    @Nullable
    private DecoderInputBuffer inputBuffer;

    @Nullable
    private Format inputFormat;
    private boolean inputStreamEnded;
    private long largestQueuedPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;

    @Nullable
    private TileInfo nextTileInfo;

    @Nullable
    private Bitmap outputBitmap;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;
    private boolean readyToOutputTiles;

    @Nullable
    private TileInfo tileInfo;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(C.TIME_UNSET, C.TIME_UNSET);
        public final long previousStreamLastBufferTimeUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j11, long j12) {
            this.previousStreamLastBufferTimeUs = j11;
            this.streamOffsetUs = j12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TileInfo {
        private final long presentationTimeUs;
        private Bitmap tileBitmap;
        private final int tileIndex;

        public TileInfo(int i11, long j11) {
            this.tileIndex = i11;
            this.presentationTimeUs = j11;
        }

        public long getPresentationTimeUs() {
            return this.presentationTimeUs;
        }

        @Nullable
        public Bitmap getTileBitmap() {
            return this.tileBitmap;
        }

        public int getTileIndex() {
            return this.tileIndex;
        }

        public boolean hasTileBitmap() {
            return this.tileBitmap != null;
        }

        public void setTileBitmap(Bitmap bitmap) {
            this.tileBitmap = bitmap;
        }
    }

    public ImageRenderer(ImageDecoder.Factory factory, @Nullable ImageOutput imageOutput) {
        super(4);
        this.decoderFactory = factory;
        this.imageOutput = getImageOutput(imageOutput);
        this.flagsOnlyBuffer = DecoderInputBuffer.newNoDataInstance();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C.TIME_UNSET;
        this.decoderReinitializationState = 0;
        this.firstFrameState = 1;
    }

    private boolean canCreateDecoderForFormat(Format format) {
        int supportsFormat = this.decoderFactory.supportsFormat(format);
        return supportsFormat == RendererCapabilities.create(4) || supportsFormat == RendererCapabilities.create(3);
    }

    private Bitmap cropTileFromImageGrid(int i11) {
        Assertions.checkStateNotNull(this.outputBitmap);
        int width = this.outputBitmap.getWidth() / ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal;
        int height = this.outputBitmap.getHeight() / ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical;
        int i12 = this.inputFormat.tileCountHorizontal;
        return Bitmap.createBitmap(this.outputBitmap, (i11 % i12) * width, (i11 / i12) * height, width, height);
    }

    private boolean drainOutput(long j11, long j12) throws ImageDecoderException, ExoPlaybackException {
        if (this.outputBitmap != null && this.tileInfo == null) {
            return false;
        }
        if (this.firstFrameState == 0 && getState() != 2) {
            return false;
        }
        if (this.outputBitmap == null) {
            Assertions.checkStateNotNull(this.decoder);
            ImageOutputBuffer dequeueOutputBuffer = this.decoder.dequeueOutputBuffer();
            if (dequeueOutputBuffer == null) {
                return false;
            }
            if (((ImageOutputBuffer) Assertions.checkStateNotNull(dequeueOutputBuffer)).isEndOfStream()) {
                if (this.decoderReinitializationState == 3) {
                    releaseDecoderResources();
                    Assertions.checkStateNotNull(this.inputFormat);
                    maybeInitCodec();
                } else {
                    ((ImageOutputBuffer) Assertions.checkStateNotNull(dequeueOutputBuffer)).release();
                    if (this.pendingOutputStreamChanges.isEmpty()) {
                        this.outputStreamEnded = true;
                    }
                }
                return false;
            }
            Assertions.checkStateNotNull(dequeueOutputBuffer.bitmap, "Non-EOS buffer came back from the decoder without bitmap.");
            this.outputBitmap = dequeueOutputBuffer.bitmap;
            ((ImageOutputBuffer) Assertions.checkStateNotNull(dequeueOutputBuffer)).release();
        }
        if (!this.readyToOutputTiles || this.outputBitmap == null || this.tileInfo == null) {
            return false;
        }
        Assertions.checkStateNotNull(this.inputFormat);
        Format format = this.inputFormat;
        int i11 = format.tileCountHorizontal;
        boolean z11 = ((i11 == 1 && format.tileCountVertical == 1) || i11 == -1 || format.tileCountVertical == -1) ? false : true;
        if (!this.tileInfo.hasTileBitmap()) {
            TileInfo tileInfo = this.tileInfo;
            tileInfo.setTileBitmap(z11 ? cropTileFromImageGrid(tileInfo.getTileIndex()) : (Bitmap) Assertions.checkStateNotNull(this.outputBitmap));
        }
        if (!processOutputBuffer(j11, j12, (Bitmap) Assertions.checkStateNotNull(this.tileInfo.getTileBitmap()), this.tileInfo.getPresentationTimeUs())) {
            return false;
        }
        onProcessedOutputBuffer(((TileInfo) Assertions.checkStateNotNull(this.tileInfo)).getPresentationTimeUs());
        this.firstFrameState = 3;
        if (!z11 || ((TileInfo) Assertions.checkStateNotNull(this.tileInfo)).getTileIndex() == (((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical * ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal) - 1) {
            this.outputBitmap = null;
        }
        this.tileInfo = this.nextTileInfo;
        this.nextTileInfo = null;
        return true;
    }

    private boolean feedInputBuffer(long j11) throws ImageDecoderException {
        if (this.readyToOutputTiles && this.tileInfo != null) {
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder == null || this.decoderReinitializationState == 3 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            DecoderInputBuffer dequeueInputBuffer = imageDecoder.dequeueInputBuffer();
            this.inputBuffer = dequeueInputBuffer;
            if (dequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 2) {
            Assertions.checkStateNotNull(this.inputBuffer);
            this.inputBuffer.setFlags(4);
            ((ImageDecoder) Assertions.checkStateNotNull(this.decoder)).queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 3;
            return false;
        }
        int readSource = readSource(formatHolder, this.inputBuffer, 0);
        if (readSource == -5) {
            this.inputFormat = (Format) Assertions.checkStateNotNull(formatHolder.format);
            this.codecNeedsInitialization = true;
            this.decoderReinitializationState = 2;
            return true;
        }
        if (readSource != -4) {
            if (readSource == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.inputBuffer.flip();
        ByteBuffer byteBuffer = this.inputBuffer.data;
        boolean z11 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).isEndOfStream();
        if (z11) {
            ((ImageDecoder) Assertions.checkStateNotNull(this.decoder)).queueInputBuffer((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer));
            this.currentTileIndex = 0;
        }
        maybeAdvanceTileInfo(j11, (DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer));
        if (((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).isEndOfStream()) {
            this.inputStreamEnded = true;
            this.inputBuffer = null;
            return false;
        }
        this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, ((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).timeUs);
        if (z11) {
            this.inputBuffer = null;
        } else {
            ((DecoderInputBuffer) Assertions.checkStateNotNull(this.inputBuffer)).clear();
        }
        return !this.readyToOutputTiles;
    }

    private static ImageOutput getImageOutput(@Nullable ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.NO_OP : imageOutput;
    }

    private boolean isTileLastInGrid(TileInfo tileInfo) {
        return ((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal == -1 || this.inputFormat.tileCountVertical == -1 || tileInfo.getTileIndex() == (((Format) Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical * this.inputFormat.tileCountHorizontal) - 1;
    }

    private void lowerFirstFrameState(int i11) {
        this.firstFrameState = Math.min(this.firstFrameState, i11);
    }

    private void maybeAdvanceTileInfo(long j11, DecoderInputBuffer decoderInputBuffer) {
        boolean z11 = true;
        if (decoderInputBuffer.isEndOfStream()) {
            this.readyToOutputTiles = true;
            return;
        }
        TileInfo tileInfo = new TileInfo(this.currentTileIndex, decoderInputBuffer.timeUs);
        this.nextTileInfo = tileInfo;
        this.currentTileIndex++;
        if (!this.readyToOutputTiles) {
            long presentationTimeUs = tileInfo.getPresentationTimeUs();
            boolean z12 = presentationTimeUs - 30000 <= j11 && j11 <= 30000 + presentationTimeUs;
            TileInfo tileInfo2 = this.tileInfo;
            boolean z13 = tileInfo2 != null && tileInfo2.getPresentationTimeUs() <= j11 && j11 < presentationTimeUs;
            boolean isTileLastInGrid = isTileLastInGrid((TileInfo) Assertions.checkStateNotNull(this.nextTileInfo));
            if (!z12 && !z13 && !isTileLastInGrid) {
                z11 = false;
            }
            this.readyToOutputTiles = z11;
            if (z13 && !z12) {
                return;
            }
        }
        this.tileInfo = this.nextTileInfo;
        this.nextTileInfo = null;
    }

    private boolean maybeInitCodec() throws ExoPlaybackException {
        if (!maybeInitializeProcessingPipeline()) {
            return false;
        }
        if (!this.codecNeedsInitialization) {
            return true;
        }
        if (!canCreateDecoderForFormat((Format) Assertions.checkNotNull(this.inputFormat))) {
            throw createRendererException(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.inputFormat, PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED);
        }
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.release();
        }
        this.decoder = this.decoderFactory.createImageDecoder();
        this.codecNeedsInitialization = false;
        return true;
    }

    private void onProcessedOutputBuffer(long j11) {
        this.lastProcessedOutputBufferTimeUs = j11;
        while (!this.pendingOutputStreamChanges.isEmpty() && j11 >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.removeFirst();
        }
    }

    private void releaseDecoderResources() {
        this.inputBuffer = null;
        this.decoderReinitializationState = 0;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.release();
            this.decoder = null;
        }
    }

    private void setImageOutput(@Nullable ImageOutput imageOutput) {
        this.imageOutput = getImageOutput(imageOutput);
    }

    private boolean shouldForceRender() {
        boolean z11 = getState() == 2;
        int i11 = this.firstFrameState;
        if (i11 == 0) {
            return z11;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 != 15) {
            super.handleMessage(i11, obj);
        } else {
            setImageOutput(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        int i11 = this.firstFrameState;
        if (i11 != 3) {
            return i11 == 0 && this.readyToOutputTiles;
        }
        return true;
    }

    public boolean maybeInitializeProcessingPipeline() throws ExoPlaybackException {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges.clear();
        releaseDecoderResources();
        this.imageOutput.onDisabled();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        this.firstFrameState = z12 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        lowerFirstFrameState(1);
        this.outputStreamEnded = false;
        this.inputStreamEnded = false;
        this.outputBitmap = null;
        this.tileInfo = null;
        this.nextTileInfo = null;
        this.readyToOutputTiles = false;
        this.inputBuffer = null;
        ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.flush();
        }
        this.pendingOutputStreamChanges.clear();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        releaseDecoderResources();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        releaseDecoderResources();
        lowerFirstFrameState(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStreamChanged(androidx.media3.common.Format[] r5, long r6, long r8, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r10) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r4 = this;
            super.onStreamChanged(r5, r6, r8, r10)
            r5 = r4
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r6 = r5.outputStreamInfo
            long r6 = r6.streamOffsetUs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque<androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo> r6 = r5.pendingOutputStreamChanges
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.largestQueuedPresentationTimeUs
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.lastProcessedOutputBufferTimeUs
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque<androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo> r6 = r5.pendingOutputStreamChanges
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r7 = new androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo
            long r0 = r5.largestQueuedPresentationTimeUs
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r6 = new androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo
            r6.<init>(r0, r8)
            r5.outputStreamInfo = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.ImageRenderer.onStreamChanged(androidx.media3.common.Format[], long, long, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId):void");
    }

    public boolean processOutputBuffer(long j11, long j12, Bitmap bitmap, long j13) throws ExoPlaybackException {
        long j14 = j13 - j11;
        if (!shouldForceRender() && j14 >= 30000) {
            return false;
        }
        this.imageOutput.onImageAvailable(j13 - this.outputStreamInfo.streamOffsetUs, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            this.inputFormat = (Format) Assertions.checkStateNotNull(formatHolder.format);
            this.codecNeedsInitialization = true;
        }
        if (this.decoder != null || maybeInitCodec()) {
            try {
                TraceUtil.beginSection("drainAndFeedDecoder");
                while (drainOutput(j11, j12)) {
                }
                while (feedInputBuffer(j11)) {
                }
                TraceUtil.endSection();
            } catch (ImageDecoderException e11) {
                throw createRendererException(e11, null, PlaybackException.ERROR_CODE_DECODING_FAILED);
            }
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        return this.decoderFactory.supportsFormat(format);
    }
}
