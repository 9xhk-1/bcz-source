package androidx.media3.extractor.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import ho.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class SefReader {
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final List<DataReference> dataReferences = new ArrayList();
    private int readerState = 0;
    private int tailLength;
    private static final m0 COLON_SPLITTER = m0.h(':');
    private static final m0 ASTERISK_SPLITTER = m0.h('*');

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i11, long j11, int i12) {
            this.dataType = i11;
            this.startOffset = j11;
            this.size = i12;
        }
    }

    private void checkForSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.tailLength = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != SAMSUNG_TAIL_SIGNATURE) {
            positionHolder.position = 0L;
        } else {
            positionHolder.position = extractorInput.getPosition() - (this.tailLength - 12);
            this.readerState = 2;
        }
    }

    private static int nameToDataType(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return TYPE_SLOW_MOTION_DATA;
            case "Super_SlowMotion_Edit_Data":
                return TYPE_SUPER_SLOW_MOTION_EDIT_DATA;
            case "Super_SlowMotion_Data":
                return TYPE_SUPER_SLOW_MOTION_DATA;
            case "Super_SlowMotion_Deflickering_On":
                return TYPE_SUPER_SLOW_DEFLICKERING_ON;
            case "Super_SlowMotion_BGM":
                return TYPE_SUPER_SLOW_MOTION_BGM;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    private void readSdrs(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int i11 = this.tailLength - 20;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i11);
        extractorInput.readFully(parsableByteArray.getData(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            parsableByteArray.skipBytes(2);
            short readLittleEndianShort = parsableByteArray.readLittleEndianShort();
            if (readLittleEndianShort == TYPE_SLOW_MOTION_DATA || readLittleEndianShort == TYPE_SUPER_SLOW_MOTION_DATA || readLittleEndianShort == TYPE_SUPER_SLOW_MOTION_BGM || readLittleEndianShort == TYPE_SUPER_SLOW_MOTION_EDIT_DATA || readLittleEndianShort == TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                this.dataReferences.add(new DataReference(readLittleEndianShort, (length - this.tailLength) - parsableByteArray.readLittleEndianInt(), parsableByteArray.readLittleEndianInt()));
            } else {
                parsableByteArray.skipBytes(8);
            }
        }
        if (this.dataReferences.isEmpty()) {
            positionHolder.position = 0L;
        } else {
            this.readerState = 3;
            positionHolder.position = this.dataReferences.get(0).startOffset;
        }
    }

    private void readSefData(ExtractorInput extractorInput, List<Metadata.Entry> list) throws IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - this.tailLength);
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i11 = 0; i11 < this.dataReferences.size(); i11++) {
            DataReference dataReference = this.dataReferences.get(i11);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int nameToDataType = nameToDataType(parsableByteArray.readString(readLittleEndianInt));
            int i12 = dataReference.size - (readLittleEndianInt + 8);
            if (nameToDataType == TYPE_SLOW_MOTION_DATA) {
                list.add(readSlowMotionData(parsableByteArray, i12));
            } else if (nameToDataType != TYPE_SUPER_SLOW_MOTION_DATA && nameToDataType != TYPE_SUPER_SLOW_MOTION_BGM && nameToDataType != TYPE_SUPER_SLOW_MOTION_EDIT_DATA && nameToDataType != TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData readSlowMotionData(ParsableByteArray parsableByteArray, int i11) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> o11 = ASTERISK_SPLITTER.o(parsableByteArray.readString(i11));
        for (int i12 = 0; i12 < o11.size(); i12++) {
            List<String> o12 = COLON_SPLITTER.o(o11.get(i12));
            if (o12.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(o12.get(0)), Long.parseLong(o12.get(1)), 1 << (Integer.parseInt(o12.get(2)) - 1)));
            } catch (NumberFormatException e11) {
                throw ParserException.createForMalformedContainer(null, e11);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder, List<Metadata.Entry> list) throws IOException {
        int i11 = this.readerState;
        long j11 = 0;
        if (i11 == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j11 = length - 8;
            }
            positionHolder.position = j11;
            this.readerState = 1;
        } else if (i11 == 1) {
            checkForSefData(extractorInput, positionHolder);
        } else if (i11 == 2) {
            readSdrs(extractorInput, positionHolder);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            readSefData(extractorInput, list);
            positionHolder.position = 0L;
        }
        return 1;
    }

    public void reset() {
        this.dataReferences.clear();
        this.readerState = 0;
    }
}
