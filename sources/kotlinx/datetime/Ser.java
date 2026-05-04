package kotlinx.datetime;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.g0;
import r40.r3;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class Ser implements Externalizable {

    @m80.k
    public static final a Companion = new a(null);
    public static final int DATE_TAG = 2;
    public static final int DATE_TIME_TAG = 4;
    public static final int TIME_TAG = 3;
    public static final int UTC_OFFSET_TAG = 10;
    public static final int YEAR_MONTH_TAG = 11;
    private static final long serialVersionUID = 0;
    private int typeTag;

    @m80.l
    private Object value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public Ser(int i11, @m80.l Object obj) {
        this.typeTag = i11;
        this.value = obj;
    }

    private final Object readResolve() {
        Object obj = this.value;
        g0.m(obj);
        return obj;
    }

    @Override // java.io.Externalizable
    public void readExternal(@m80.k ObjectInput in2) {
        Object localDate;
        java.time.LocalDate ofEpochDay;
        Object obj;
        java.time.LocalDate ofEpochDay2;
        g0.p(in2, "in");
        byte readByte = in2.readByte();
        this.typeTag = readByte;
        if (readByte != 2) {
            if (readByte == 3) {
                obj = LocalTime.Companion.c(in2.readLong());
            } else if (readByte == 4) {
                ofEpochDay2 = java.time.LocalDate.ofEpochDay(in2.readLong());
                g0.o(ofEpochDay2, "ofEpochDay(...)");
                localDate = new LocalDateTime(new LocalDate(ofEpochDay2), LocalTime.Companion.c(in2.readLong()));
            } else if (readByte == 10) {
                obj = r3.e(null, null, Integer.valueOf(in2.readInt()), 3, null);
            } else {
                if (readByte != 11) {
                    throw new IOException("Unknown type tag: " + this.typeTag);
                }
                obj = t.c(YearMonth.Companion, in2.readLong());
            }
            this.value = obj;
        }
        ofEpochDay = java.time.LocalDate.ofEpochDay(in2.readLong());
        g0.o(ofEpochDay, "ofEpochDay(...)");
        localDate = new LocalDate(ofEpochDay);
        obj = localDate;
        this.value = obj;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@m80.k ObjectOutput out) {
        long epochDay;
        long epochDay2;
        g0.p(out, "out");
        out.writeByte(this.typeTag);
        Object obj = this.value;
        int i11 = this.typeTag;
        if (i11 == 2) {
            g0.n(obj, "null cannot be cast to non-null type kotlinx.datetime.LocalDate");
            epochDay = ((LocalDate) obj).getValue$kotlinx_datetime().toEpochDay();
            out.writeLong(epochDay);
            return;
        }
        if (i11 == 3) {
            g0.n(obj, "null cannot be cast to non-null type kotlinx.datetime.LocalTime");
            out.writeLong(((LocalTime) obj).toNanosecondOfDay());
            return;
        }
        if (i11 == 4) {
            g0.n(obj, "null cannot be cast to non-null type kotlinx.datetime.LocalDateTime");
            LocalDateTime localDateTime = (LocalDateTime) obj;
            epochDay2 = localDateTime.getDate().getValue$kotlinx_datetime().toEpochDay();
            out.writeLong(epochDay2);
            out.writeLong(localDateTime.getTime().toNanosecondOfDay());
            return;
        }
        if (i11 == 10) {
            g0.n(obj, "null cannot be cast to non-null type kotlinx.datetime.UtcOffset");
            out.writeInt(((UtcOffset) obj).getTotalSeconds());
        } else {
            if (i11 == 11) {
                g0.n(obj, "null cannot be cast to non-null type kotlinx.datetime.YearMonth");
                out.writeLong(t.f((YearMonth) obj));
                return;
            }
            throw new IllegalStateException("Unknown type tag: " + this.typeTag + " for value: " + obj);
        }
    }

    public Ser() {
        this(0, null);
    }
}
