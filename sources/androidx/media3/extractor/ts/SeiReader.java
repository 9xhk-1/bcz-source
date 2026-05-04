package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SeiReader {
    private final List<Format> closedCaptionFormats;
    private final String containerMimeType;
    private final TrackOutput[] outputs;
    private final ReorderingSeiMessageQueue reorderingSeiMessageQueue = new ReorderingSeiMessageQueue(new ReorderingSeiMessageQueue.SeiConsumer() { // from class: androidx.media3.extractor.ts.e
        @Override // androidx.media3.container.ReorderingSeiMessageQueue.SeiConsumer
        public final void consume(long j11, ParsableByteArray parsableByteArray) {
            CeaUtil.consume(j11, parsableByteArray, SeiReader.this.outputs);
        }
    });

    public SeiReader(List<Format> list, String str) {
        this.closedCaptionFormats = list;
        this.containerMimeType = str;
        this.outputs = new TrackOutput[list.size()];
    }

    public void clear() {
        this.reorderingSeiMessageQueue.flush();
    }

    public void consume(long j11, ParsableByteArray parsableByteArray) {
        this.reorderingSeiMessageQueue.add(j11, parsableByteArray);
    }

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i11 = 0; i11 < this.outputs.length; i11++) {
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i11);
            String str = format.sampleMimeType;
            Assertions.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = format.f4446id;
            if (str2 == null) {
                str2 = trackIdGenerator.getFormatId();
            }
            track.format(new Format.Builder().setId(str2).setContainerMimeType(this.containerMimeType).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.outputs[i11] = track;
        }
    }

    public void flush() {
        this.reorderingSeiMessageQueue.flush();
    }

    public void setReorderingQueueSize(int i11) {
        this.reorderingSeiMessageQueue.setMaxSize(i11);
    }
}
