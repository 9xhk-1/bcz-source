package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public final List<Event> events;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i11, long j11) {
            this.componentTag = i11;
            this.utcSpliceTime = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j11, boolean z11, boolean z12, boolean z13, List<ComponentSplice> list, long j12, boolean z14, long j13, int i11, int i12, int i13) {
            this.spliceEventId = j11;
            this.spliceEventCancelIndicator = z11;
            this.outOfNetworkIndicator = z12;
            this.programSpliceFlag = z13;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j12;
            this.autoReturn = z14;
            this.breakDurationUs = j13;
            this.uniqueProgramId = i11;
            this.availNum = i12;
            this.availsExpected = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            boolean z11;
            ArrayList arrayList;
            boolean z12;
            boolean z13;
            long j11;
            boolean z14;
            long j12;
            int i11;
            int i12;
            int i13;
            boolean z15;
            long j13;
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            boolean z16 = true;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                z11 = true;
            } else {
                z11 = true;
                z16 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z16) {
                arrayList = arrayList2;
                z12 = false;
                z13 = false;
                j11 = C.TIME_UNSET;
                z14 = false;
                j12 = C.TIME_UNSET;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            } else {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                boolean z17 = (readUnsignedByte & 128) != 0 ? z11 : false;
                boolean z18 = (readUnsignedByte & 64) != 0 ? z11 : false;
                boolean z19 = (readUnsignedByte & 32) != 0 ? z11 : false;
                long readUnsignedInt2 = z18 ? parsableByteArray.readUnsignedInt() : C.TIME_UNSET;
                if (!z18) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(readUnsignedByte2);
                    int i14 = 0;
                    while (i14 < readUnsignedByte2) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                        i14++;
                        readUnsignedByte2 = readUnsignedByte2;
                    }
                    arrayList2 = arrayList3;
                }
                if (z19) {
                    long readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z21 = (128 & readUnsignedByte3) != 0;
                    j13 = ((((readUnsignedByte3 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z15 = z21;
                } else {
                    z15 = false;
                    j13 = C.TIME_UNSET;
                }
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                boolean z22 = z17;
                z14 = z15;
                z12 = z22;
                i13 = parsableByteArray.readUnsignedByte();
                long j14 = readUnsignedInt2;
                i11 = readUnsignedShort;
                i12 = readUnsignedByte4;
                long j15 = j13;
                arrayList = arrayList2;
                z13 = z18;
                j11 = j14;
                j12 = j15;
            }
            return new Event(readUnsignedInt, z16, z12, z13, arrayList, j11, z14, j12, i11, i12, i13);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(readUnsignedByte);
        for (int i11 = 0; i11 < readUnsignedByte; i11++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }
}
