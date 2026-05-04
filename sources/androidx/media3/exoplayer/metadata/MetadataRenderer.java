package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 1;
    private static final String TAG = "MetadataRenderer";
    private final MetadataInputBuffer buffer;

    @Nullable
    private MetadataDecoder decoder;
    private final MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final MetadataOutput output;

    @Nullable
    private final Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;

    @Nullable
    private Metadata pendingMetadata;
    private long subsampleOffsetUs;

    public MetadataRenderer(MetadataOutput metadataOutput, @Nullable Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.DEFAULT);
    }

    private void decodeWrappedMetadata(Metadata metadata, List<Metadata.Entry> list) {
        for (int i11 = 0; i11 < metadata.length(); i11++) {
            Format wrappedMetadataFormat = metadata.get(i11).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                list.add(metadata.get(i11));
            } else {
                MetadataDecoder createDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) Assertions.checkNotNull(metadata.get(i11).getWrappedMetadataBytes());
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(bArr.length);
                ((ByteBuffer) Util.castNonNull(this.buffer.data)).put(bArr);
                this.buffer.flip();
                Metadata decode = createDecoder.decode(this.buffer);
                if (decode != null) {
                    decodeWrappedMetadata(decode, list);
                }
            }
        }
    }

    @SideEffectFree
    private long getPresentationTimeUs(long j11) {
        Assertions.checkState(j11 != C.TIME_UNSET);
        Assertions.checkState(this.outputStreamOffsetUs != C.TIME_UNSET);
        return j11 - this.outputStreamOffsetUs;
    }

    private void invokeRenderer(Metadata metadata) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void invokeRendererInternal(Metadata metadata) {
        this.output.onMetadata(metadata);
    }

    private boolean outputMetadata(long j11) {
        boolean z11;
        Metadata metadata = this.pendingMetadata;
        if (metadata == null || (!this.outputMetadataEarly && metadata.presentationTimeUs > getPresentationTimeUs(j11))) {
            z11 = false;
        } else {
            invokeRenderer(this.pendingMetadata);
            this.pendingMetadata = null;
            z11 = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z11;
    }

    private void readMetadata() {
        if (this.inputStreamEnded || this.pendingMetadata != null) {
            return;
        }
        this.buffer.clear();
        FormatHolder formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, this.buffer, 0);
        if (readSource != -4) {
            if (readSource == -5) {
                this.subsampleOffsetUs = ((Format) Assertions.checkNotNull(formatHolder.format)).subsampleOffsetUs;
                return;
            }
            return;
        }
        if (this.buffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return;
        }
        if (this.buffer.timeUs >= getLastResetPositionUs()) {
            MetadataInputBuffer metadataInputBuffer = this.buffer;
            metadataInputBuffer.subsampleOffsetUs = this.subsampleOffsetUs;
            metadataInputBuffer.flip();
            Metadata decode = ((MetadataDecoder) Util.castNonNull(this.decoder)).decode(this.buffer);
            if (decode != null) {
                ArrayList arrayList = new ArrayList(decode.length());
                decodeWrappedMetadata(decode, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.pendingMetadata = new Metadata(getPresentationTimeUs(this.buffer.timeUs), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        invokeRendererInternal((Metadata) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
        Metadata metadata = this.pendingMetadata;
        if (metadata != null) {
            this.pendingMetadata = metadata.copyWithPresentationTimeUs((metadata.presentationTimeUs + this.outputStreamOffsetUs) - j12);
        }
        this.outputStreamOffsetUs = j12;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) {
        boolean z11 = true;
        while (z11) {
            readMetadata();
            z11 = outputMetadata(j11);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return RendererCapabilities.create(format.cryptoType == 0 ? 4 : 2);
        }
        return RendererCapabilities.create(0);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, @Nullable Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        this(metadataOutput, looper, metadataDecoderFactory, false);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, @Nullable Looper looper, MetadataDecoderFactory metadataDecoderFactory, boolean z11) {
        super(5);
        this.output = (MetadataOutput) Assertions.checkNotNull(metadataOutput);
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.decoderFactory = (MetadataDecoderFactory) Assertions.checkNotNull(metadataDecoderFactory);
        this.outputMetadataEarly = z11;
        this.buffer = new MetadataInputBuffer();
        this.outputStreamOffsetUs = C.TIME_UNSET;
    }
}
