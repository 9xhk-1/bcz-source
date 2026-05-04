package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PesReader implements TsPayloadReader {
    private static final int HEADER_SIZE = 9;
    private static final int MAX_HEADER_EXTENSION_SIZE = 10;
    private static final int PES_SCRATCH_SIZE = 10;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_BODY = 3;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_HEADER_EXTENSION = 2;
    private static final String TAG = "PesReader";
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private boolean ptsFlag;
    private final ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private long timeUs;
    private TimestampAdjuster timestampAdjuster;
    private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
    private int state = 0;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, @Nullable byte[] bArr, int i11) {
        int min = Math.min(parsableByteArray.bytesLeft(), i11 - this.bytesRead);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(min);
        } else {
            parsableByteArray.readBytes(bArr, this.bytesRead, min);
        }
        int i12 = this.bytesRead + min;
        this.bytesRead = i12;
        return i12 == i11;
    }

    private boolean parseHeader() {
        this.pesScratch.setPosition(0);
        int readBits = this.pesScratch.readBits(24);
        if (readBits != 1) {
            Log.w(TAG, "Unexpected start code prefix: " + readBits);
            this.payloadSize = -1;
            return false;
        }
        this.pesScratch.skipBits(8);
        int readBits2 = this.pesScratch.readBits(16);
        this.pesScratch.skipBits(5);
        this.dataAlignmentIndicator = this.pesScratch.readBit();
        this.pesScratch.skipBits(2);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        int readBits3 = this.pesScratch.readBits(8);
        this.extendedHeaderLength = readBits3;
        if (readBits2 == 0) {
            this.payloadSize = -1;
        } else {
            int i11 = (readBits2 - 3) - readBits3;
            this.payloadSize = i11;
            if (i11 < 0) {
                Log.w(TAG, "Found negative packet payload size: " + this.payloadSize);
                this.payloadSize = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void parseHeaderExtension() {
        this.pesScratch.setPosition(0);
        this.timeUs = C.TIME_UNSET;
        if (this.ptsFlag) {
            this.pesScratch.skipBits(4);
            this.pesScratch.skipBits(1);
            this.pesScratch.skipBits(1);
            long readBits = (this.pesScratch.readBits(3) << 30) | (this.pesScratch.readBits(15) << 15) | this.pesScratch.readBits(15);
            this.pesScratch.skipBits(1);
            if (!this.seenFirstDts && this.dtsFlag) {
                this.pesScratch.skipBits(4);
                this.pesScratch.skipBits(1);
                this.pesScratch.skipBits(1);
                this.pesScratch.skipBits(1);
                this.timestampAdjuster.adjustTsTimestamp((this.pesScratch.readBits(3) << 30) | (this.pesScratch.readBits(15) << 15) | this.pesScratch.readBits(15));
                this.seenFirstDts = true;
            }
            this.timeUs = this.timestampAdjuster.adjustTsTimestamp(readBits);
        }
    }

    private void setState(int i11) {
        this.state = i11;
        this.bytesRead = 0;
    }

    public boolean canConsumeSynthesizedEmptyPusi(boolean z11) {
        return this.state == 3 && this.payloadSize == -1 && !(z11 && (this.reader instanceof H262Reader)) && (!z11 || parseHeader());
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void consume(ParsableByteArray parsableByteArray, int i11) throws ParserException {
        Assertions.checkStateNotNull(this.timestampAdjuster);
        if ((i11 & 1) != 0) {
            int i12 = this.state;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    Log.w(TAG, "Unexpected start indicator reading extended header");
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.payloadSize != -1) {
                        Log.w(TAG, "Unexpected start indicator: expected " + this.payloadSize + " more bytes");
                    }
                    this.reader.packetFinished(parsableByteArray.limit() == 0);
                }
            }
            setState(1);
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i13 = this.state;
            if (i13 == 0) {
                parsableByteArray.skipBytes(parsableByteArray.bytesLeft());
            } else if (i13 != 1) {
                if (i13 == 2) {
                    if (continueRead(parsableByteArray, this.pesScratch.data, Math.min(10, this.extendedHeaderLength)) && continueRead(parsableByteArray, null, this.extendedHeaderLength)) {
                        parseHeaderExtension();
                        i11 |= this.dataAlignmentIndicator ? 4 : 0;
                        this.reader.packetStarted(this.timeUs, i11);
                        setState(3);
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    int bytesLeft = parsableByteArray.bytesLeft();
                    int i14 = this.payloadSize;
                    int i15 = i14 == -1 ? 0 : bytesLeft - i14;
                    if (i15 > 0) {
                        bytesLeft -= i15;
                        parsableByteArray.setLimit(parsableByteArray.getPosition() + bytesLeft);
                    }
                    this.reader.consume(parsableByteArray);
                    int i16 = this.payloadSize;
                    if (i16 != -1) {
                        int i17 = i16 - bytesLeft;
                        this.payloadSize = i17;
                        if (i17 == 0) {
                            this.reader.packetFinished(false);
                            setState(1);
                        }
                    }
                }
            } else if (continueRead(parsableByteArray, this.pesScratch.data, 9)) {
                setState(parseHeader() ? 2 : 0);
            }
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        this.reader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }
}
