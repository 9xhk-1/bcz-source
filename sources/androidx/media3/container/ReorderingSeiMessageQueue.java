package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
/* loaded from: classes2.dex */
public final class ReorderingSeiMessageQueue {

    @Nullable
    private SampleSeiMessages lastQueuedMessage;
    private final SeiConsumer seiConsumer;
    private final ArrayDeque<ParsableByteArray> unusedParsableByteArrays = new ArrayDeque<>();
    private final ArrayDeque<SampleSeiMessages> unusedSampleSeiMessages = new ArrayDeque<>();
    private final PriorityQueue<SampleSeiMessages> pendingSeiMessages = new PriorityQueue<>();
    private int reorderingQueueSize = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SampleSeiMessages implements Comparable<SampleSeiMessages> {
        public long presentationTimeUs = C.TIME_UNSET;
        public final List<ParsableByteArray> nalBuffers = new ArrayList();

        public void init(long j11, ParsableByteArray parsableByteArray) {
            Assertions.checkArgument(j11 != C.TIME_UNSET);
            Assertions.checkState(this.nalBuffers.isEmpty());
            this.presentationTimeUs = j11;
            this.nalBuffers.add(parsableByteArray);
        }

        @Override // java.lang.Comparable
        public int compareTo(SampleSeiMessages sampleSeiMessages) {
            return Long.compare(this.presentationTimeUs, sampleSeiMessages.presentationTimeUs);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SeiConsumer {
        void consume(long j11, ParsableByteArray parsableByteArray);
    }

    public ReorderingSeiMessageQueue(SeiConsumer seiConsumer) {
        this.seiConsumer = seiConsumer;
    }

    private ParsableByteArray copy(ParsableByteArray parsableByteArray) {
        ParsableByteArray parsableByteArray2 = this.unusedParsableByteArrays.isEmpty() ? new ParsableByteArray() : this.unusedParsableByteArrays.pop();
        parsableByteArray2.reset(parsableByteArray.bytesLeft());
        System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray2.getData(), 0, parsableByteArray2.bytesLeft());
        return parsableByteArray2;
    }

    private void flushQueueDownToSize(int i11) {
        while (this.pendingSeiMessages.size() > i11) {
            SampleSeiMessages sampleSeiMessages = (SampleSeiMessages) Util.castNonNull(this.pendingSeiMessages.poll());
            for (int i12 = 0; i12 < sampleSeiMessages.nalBuffers.size(); i12++) {
                this.seiConsumer.consume(sampleSeiMessages.presentationTimeUs, sampleSeiMessages.nalBuffers.get(i12));
                this.unusedParsableByteArrays.push(sampleSeiMessages.nalBuffers.get(i12));
            }
            sampleSeiMessages.nalBuffers.clear();
            SampleSeiMessages sampleSeiMessages2 = this.lastQueuedMessage;
            if (sampleSeiMessages2 != null && sampleSeiMessages2.presentationTimeUs == sampleSeiMessages.presentationTimeUs) {
                this.lastQueuedMessage = null;
            }
            this.unusedSampleSeiMessages.push(sampleSeiMessages);
        }
    }

    public void add(long j11, ParsableByteArray parsableByteArray) {
        int i11 = this.reorderingQueueSize;
        if (i11 == 0 || (i11 != -1 && this.pendingSeiMessages.size() >= this.reorderingQueueSize && j11 < ((SampleSeiMessages) Util.castNonNull(this.pendingSeiMessages.peek())).presentationTimeUs)) {
            this.seiConsumer.consume(j11, parsableByteArray);
            return;
        }
        ParsableByteArray copy = copy(parsableByteArray);
        SampleSeiMessages sampleSeiMessages = this.lastQueuedMessage;
        if (sampleSeiMessages != null && j11 == sampleSeiMessages.presentationTimeUs) {
            sampleSeiMessages.nalBuffers.add(copy);
            return;
        }
        SampleSeiMessages sampleSeiMessages2 = this.unusedSampleSeiMessages.isEmpty() ? new SampleSeiMessages() : this.unusedSampleSeiMessages.pop();
        sampleSeiMessages2.init(j11, copy);
        this.pendingSeiMessages.add(sampleSeiMessages2);
        this.lastQueuedMessage = sampleSeiMessages2;
        int i12 = this.reorderingQueueSize;
        if (i12 != -1) {
            flushQueueDownToSize(i12);
        }
    }

    public void clear() {
        this.pendingSeiMessages.clear();
    }

    public void flush() {
        flushQueueDownToSize(0);
    }

    public int getMaxSize() {
        return this.reorderingQueueSize;
    }

    public void setMaxSize(int i11) {
        Assertions.checkState(i11 >= 0);
        this.reorderingQueueSize = i11;
        flushQueueDownToSize(i11);
    }
}
