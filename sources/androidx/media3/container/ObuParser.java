package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ObuParser {
    public static final int OBU_FRAME = 6;
    public static final int OBU_FRAME_HEADER = 3;
    public static final int OBU_PADDING = 15;
    public static final int OBU_SEQUENCE_HEADER = 1;
    public static final int OBU_TEMPORAL_DELIMITER = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FrameHeader {
        private static final int FRAME_TYPE_INTRA_ONLY_FRAME = 2;
        private static final int FRAME_TYPE_KEY_FRAME = 0;
        private static final int FRAME_TYPE_SWITCH_FRAME = 3;
        private static final int PROBE_BYTES = 4;
        private final boolean isDependedOn;

        private FrameHeader(SequenceHeader sequenceHeader, Obu obu) throws NotYetImplementedException {
            int i11 = obu.type;
            Assertions.checkArgument(i11 == 6 || i11 == 3);
            byte[] bArr = new byte[Math.min(4, obu.payload.remaining())];
            obu.payload.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
            ObuParser.throwWhenFeatureRequired(sequenceHeader.reducedStillPictureHeader);
            if (parsableBitArray.readBit()) {
                this.isDependedOn = false;
                return;
            }
            int readBits = parsableBitArray.readBits(2);
            boolean readBit = parsableBitArray.readBit();
            ObuParser.throwWhenFeatureRequired(sequenceHeader.decoderModelInfoPresentFlag);
            if (!readBit) {
                this.isDependedOn = true;
                return;
            }
            boolean readBit2 = (readBits == 3 || readBits == 0) ? true : parsableBitArray.readBit();
            parsableBitArray.skipBit();
            ObuParser.throwWhenFeatureRequired(!sequenceHeader.seqForceScreenContentTools);
            if (parsableBitArray.readBit()) {
                ObuParser.throwWhenFeatureRequired(!sequenceHeader.seqForceIntegerMv);
                parsableBitArray.skipBit();
            }
            ObuParser.throwWhenFeatureRequired(sequenceHeader.frameIdNumbersPresentFlag);
            if (readBits != 3) {
                parsableBitArray.skipBit();
            }
            parsableBitArray.skipBits(sequenceHeader.orderHintBits);
            if (readBits != 2 && readBits != 0 && !readBit2) {
                parsableBitArray.skipBits(3);
            }
            this.isDependedOn = ((readBits == 3 || readBits == 0) ? 255 : parsableBitArray.readBits(8)) != 0;
        }

        @Nullable
        public static FrameHeader parse(SequenceHeader sequenceHeader, Obu obu) {
            try {
                return new FrameHeader(sequenceHeader, obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        public boolean isDependedOn() {
            return this.isDependedOn;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NotYetImplementedException extends Exception {
        private NotYetImplementedException() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Obu {
        public final ByteBuffer payload;
        public final int type;

        private Obu(int i11, ByteBuffer byteBuffer) {
            this.type = i11;
            this.payload = byteBuffer;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SequenceHeader {
        public final boolean decoderModelInfoPresentFlag;
        public final boolean frameIdNumbersPresentFlag;
        public final int orderHintBits;
        public final boolean reducedStillPictureHeader;
        public final boolean seqForceIntegerMv;
        public final boolean seqForceScreenContentTools;

        private SequenceHeader(Obu obu) throws NotYetImplementedException {
            Assertions.checkArgument(obu.type == 1);
            byte[] bArr = new byte[obu.payload.remaining()];
            obu.payload.asReadOnlyBuffer().get(bArr);
            ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
            parsableBitArray.skipBits(4);
            boolean readBit = parsableBitArray.readBit();
            this.reducedStillPictureHeader = readBit;
            ObuParser.throwWhenFeatureRequired(readBit);
            if (parsableBitArray.readBit()) {
                skipTimingInfo(parsableBitArray);
                boolean readBit2 = parsableBitArray.readBit();
                this.decoderModelInfoPresentFlag = readBit2;
                if (readBit2) {
                    parsableBitArray.skipBits(47);
                }
            } else {
                this.decoderModelInfoPresentFlag = false;
            }
            boolean readBit3 = parsableBitArray.readBit();
            int readBits = parsableBitArray.readBits(5);
            for (int i11 = 0; i11 <= readBits; i11++) {
                parsableBitArray.skipBits(12);
                if (parsableBitArray.readBits(5) > 7) {
                    parsableBitArray.skipBit();
                }
                ObuParser.throwWhenFeatureRequired(this.decoderModelInfoPresentFlag);
                if (readBit3 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(4);
                }
            }
            int readBits2 = parsableBitArray.readBits(4);
            int readBits3 = parsableBitArray.readBits(4);
            parsableBitArray.skipBits(readBits2 + 1);
            parsableBitArray.skipBits(readBits3 + 1);
            boolean readBit4 = parsableBitArray.readBit();
            this.frameIdNumbersPresentFlag = readBit4;
            ObuParser.throwWhenFeatureRequired(readBit4);
            parsableBitArray.skipBits(3);
            parsableBitArray.skipBits(4);
            boolean readBit5 = parsableBitArray.readBit();
            if (readBit5) {
                parsableBitArray.skipBits(2);
            }
            if (parsableBitArray.readBit()) {
                this.seqForceScreenContentTools = true;
            } else {
                this.seqForceScreenContentTools = parsableBitArray.readBit();
            }
            if (!this.seqForceScreenContentTools) {
                this.seqForceIntegerMv = true;
            } else if (parsableBitArray.readBit()) {
                this.seqForceIntegerMv = true;
            } else {
                this.seqForceIntegerMv = parsableBitArray.readBit();
            }
            if (readBit5) {
                this.orderHintBits = parsableBitArray.readBits(3) + 1;
            } else {
                this.orderHintBits = 0;
            }
        }

        @Nullable
        public static SequenceHeader parse(Obu obu) {
            try {
                return new SequenceHeader(obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        private static void skipTimingInfo(ParsableBitArray parsableBitArray) {
            parsableBitArray.skipBits(64);
            if (parsableBitArray.readBit()) {
                ObuParser.skipUvlc(parsableBitArray);
            }
        }
    }

    private ObuParser() {
    }

    private static int leb128(ByteBuffer byteBuffer) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            byte b11 = byteBuffer.get();
            i11 |= (b11 & Byte.MAX_VALUE) << (i12 * 7);
            if ((b11 & 128) == 0) {
                return i11;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipUvlc(ParsableBitArray parsableBitArray) {
        int i11 = 0;
        while (!parsableBitArray.readBit()) {
            i11++;
        }
        if (i11 < 32) {
            parsableBitArray.skipBits(i11);
        }
    }

    public static List<Obu> split(ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            byte b11 = asReadOnlyBuffer.get();
            int i11 = (b11 >> 3) & 15;
            if (((b11 >> 2) & 1) != 0) {
                asReadOnlyBuffer.get();
            }
            int leb128 = ((b11 >> 1) & 1) != 0 ? leb128(asReadOnlyBuffer) : asReadOnlyBuffer.remaining();
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + leb128);
            arrayList.add(new Obu(i11, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + leb128);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwWhenFeatureRequired(boolean z11) throws NotYetImplementedException {
        if (z11) {
            throw new NotYetImplementedException();
        }
    }
}
