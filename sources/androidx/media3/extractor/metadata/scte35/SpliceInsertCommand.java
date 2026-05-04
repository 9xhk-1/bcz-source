package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int i11, long j11, long j12) {
            this.componentTag = i11;
            this.componentSplicePts = j11;
            this.componentSplicePlaybackPositionUs = j12;
        }
    }

    private SpliceInsertCommand(long j11, boolean z11, boolean z12, boolean z13, boolean z14, long j12, long j13, List<ComponentSplice> list, boolean z15, long j14, int i11, int i12, int i13) {
        this.spliceEventId = j11;
        this.spliceEventCancelIndicator = z11;
        this.outOfNetworkIndicator = z12;
        this.programSpliceFlag = z13;
        this.spliceImmediateFlag = z14;
        this.programSplicePts = j12;
        this.programSplicePlaybackPositionUs = j13;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z15;
        this.breakDurationUs = j14;
        this.uniqueProgramId = i11;
        this.availNum = i12;
        this.availsExpected = i13;
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j11, TimestampAdjuster timestampAdjuster) {
        List list;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        int i13;
        boolean z15;
        int i14;
        long j13;
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        boolean z16 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long j14 = C.TIME_UNSET;
        if (z16) {
            list = list2;
            j12 = -9223372036854775807L;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        } else {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            boolean z17 = (readUnsignedByte & 128) != 0;
            boolean z18 = (readUnsignedByte & 64) != 0;
            boolean z19 = (readUnsignedByte & 32) != 0;
            boolean z21 = (readUnsignedByte & 16) != 0;
            long parseSpliceTime = (!z18 || z21) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(parsableByteArray, j11);
            if (!z18) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(readUnsignedByte2);
                int i15 = 0;
                while (i15 < readUnsignedByte2) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if (z21) {
                        i14 = readUnsignedByte2;
                        j13 = -9223372036854775807L;
                    } else {
                        i14 = readUnsignedByte2;
                        j13 = TimeSignalCommand.parseSpliceTime(parsableByteArray, j11);
                    }
                    arrayList.add(new ComponentSplice(readUnsignedByte3, j13, timestampAdjuster.adjustTsTimestamp(j13)));
                    i15++;
                    readUnsignedByte2 = i14;
                }
                list2 = arrayList;
            }
            if (z19) {
                long readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                boolean z22 = (128 & readUnsignedByte4) != 0;
                j14 = ((((readUnsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z15 = z22;
            } else {
                z15 = false;
            }
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            long j15 = parseSpliceTime;
            j12 = j14;
            j14 = j15;
            i12 = parsableByteArray.readUnsignedByte();
            i13 = parsableByteArray.readUnsignedByte();
            i11 = readUnsignedShort;
            z14 = z15;
            z11 = z17;
            z12 = z18;
            list = list2;
            z13 = z21;
        }
        return new SpliceInsertCommand(readUnsignedInt, z16, z11, z12, z13, j14, timestampAdjuster.adjustTsTimestamp(j14), list, z14, j12, i11, i12, i13);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.programSplicePts + ", programSplicePlaybackPositionUs= " + this.programSplicePlaybackPositionUs + " }";
    }
}
