package androidx.media3.exoplayer.video;

import androidx.annotation.Nullable;
import androidx.media3.container.ObuParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class Av1SampleDependencyParser {
    private static final int MAX_OBU_COUNT_FOR_PARTIAL_SKIP = 8;

    @Nullable
    private ObuParser.SequenceHeader sequenceHeader;

    private boolean canSkipObu(ObuParser.Obu obu, boolean z11) {
        ObuParser.SequenceHeader sequenceHeader;
        ObuParser.FrameHeader parse;
        int i11 = obu.type;
        if (i11 == 2 || i11 == 15) {
            return true;
        }
        if (i11 != 3 || z11) {
            return ((i11 != 6 && i11 != 3) || (sequenceHeader = this.sequenceHeader) == null || (parse = ObuParser.FrameHeader.parse(sequenceHeader, obu)) == null || parse.isDependedOn()) ? false : true;
        }
        return false;
    }

    private void updateSequenceHeaders(List<ObuParser.Obu> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).type == 1) {
                this.sequenceHeader = ObuParser.SequenceHeader.parse(list.get(i11));
            }
        }
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        updateSequenceHeaders(ObuParser.split(byteBuffer));
    }

    public void reset() {
        this.sequenceHeader = null;
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z11) {
        List<ObuParser.Obu> split = ObuParser.split(byteBuffer);
        updateSequenceHeaders(split);
        int size = split.size() - 1;
        int i11 = 0;
        while (size >= 0 && canSkipObu(split.get(size), z11)) {
            if (split.get(size).type == 6 || split.get(size).type == 3) {
                i11++;
            }
            size--;
        }
        return (i11 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? split.get(size).payload.limit() : byteBuffer.position();
    }
}
