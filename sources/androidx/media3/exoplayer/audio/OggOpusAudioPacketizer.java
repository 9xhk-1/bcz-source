package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.OpusUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class OggOpusAudioPacketizer {
    private static final int CHECKSUM_INDEX = 22;
    private static final int FIRST_AUDIO_SAMPLE_PAGE_SEQUENCE_NUMBER = 2;
    private static final int OGG_PACKET_HEADER_LENGTH = 28;
    private static final int SERIAL_NUMBER = 0;
    private static final byte[] OGG_DEFAULT_ID_HEADER_PAGE = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] OGG_DEFAULT_COMMENT_HEADER_PAGE = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer outputBuffer = AudioProcessor.EMPTY_BUFFER;
    private int granulePosition = 0;
    private int pageSequenceNumber = 2;

    private ByteBuffer packetizeInternal(ByteBuffer byteBuffer, @Nullable byte[] bArr) {
        int i11;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i12 = limit - position;
        int i13 = (i12 + 255) / 255;
        int i14 = i13 + 27 + i12;
        if (this.pageSequenceNumber == 2) {
            int length = bArr != null ? bArr.length + 28 : OGG_DEFAULT_ID_HEADER_PAGE.length;
            i14 += OGG_DEFAULT_COMMENT_HEADER_PAGE.length + length;
            i11 = length;
        } else {
            i11 = 0;
        }
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer(i14);
        if (this.pageSequenceNumber == 2) {
            if (bArr != null) {
                writeOggIdHeaderPage(replaceOutputBuffer, bArr);
            } else {
                replaceOutputBuffer.put(OGG_DEFAULT_ID_HEADER_PAGE);
            }
            replaceOutputBuffer.put(OGG_DEFAULT_COMMENT_HEADER_PAGE);
        }
        int parsePacketAudioSampleCount = this.granulePosition + OpusUtil.parsePacketAudioSampleCount(byteBuffer);
        this.granulePosition = parsePacketAudioSampleCount;
        writeOggPacketHeader(replaceOutputBuffer, parsePacketAudioSampleCount, this.pageSequenceNumber, i13, false);
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 >= 255) {
                replaceOutputBuffer.put((byte) -1);
                i12 -= 255;
            } else {
                replaceOutputBuffer.put((byte) i12);
                i12 = 0;
            }
        }
        while (position < limit) {
            replaceOutputBuffer.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
        if (this.pageSequenceNumber == 2) {
            byte[] array = replaceOutputBuffer.array();
            int arrayOffset = replaceOutputBuffer.arrayOffset() + i11;
            byte[] bArr2 = OGG_DEFAULT_COMMENT_HEADER_PAGE;
            replaceOutputBuffer.putInt(i11 + bArr2.length + 22, Util.crc32(array, arrayOffset + bArr2.length, replaceOutputBuffer.limit() - replaceOutputBuffer.position(), 0));
        } else {
            replaceOutputBuffer.putInt(22, Util.crc32(replaceOutputBuffer.array(), replaceOutputBuffer.arrayOffset(), replaceOutputBuffer.limit() - replaceOutputBuffer.position(), 0));
        }
        this.pageSequenceNumber++;
        return replaceOutputBuffer;
    }

    private ByteBuffer replaceOutputBuffer(int i11) {
        if (this.outputBuffer.capacity() < i11) {
            this.outputBuffer = ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.outputBuffer.clear();
        }
        return this.outputBuffer;
    }

    private void writeOggIdHeaderPage(ByteBuffer byteBuffer, byte[] bArr) {
        writeOggPacketHeader(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(ro.r.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, Util.crc32(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void writeOggPacketHeader(ByteBuffer byteBuffer, long j11, int i11, int i12, boolean z11) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z11 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j11);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i11);
        byteBuffer.putInt(0);
        byteBuffer.put(ro.r.a(i12));
    }

    public void packetize(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        Assertions.checkNotNull(decoderInputBuffer.data);
        if (decoderInputBuffer.data.limit() - decoderInputBuffer.data.position() == 0) {
            return;
        }
        this.outputBuffer = packetizeInternal(decoderInputBuffer.data, (this.pageSequenceNumber == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.clear();
        decoderInputBuffer.ensureSpaceForWrite(this.outputBuffer.remaining());
        decoderInputBuffer.data.put(this.outputBuffer);
        decoderInputBuffer.flip();
    }

    public void reset() {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.granulePosition = 0;
        this.pageSequenceNumber = 2;
    }
}
