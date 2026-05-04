package kotlinx.datetime;

import f50.a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlin.DeprecationLevel;
import r40.r3;
import s40.e0;
import s40.e3;
import s40.g0;
import s40.i2;
import x40.v0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = v0.class)
/* loaded from: classes8.dex */
public final class UtcOffset implements Serializable {

    @m80.k
    public static final a Companion = new a(null);

    @m80.k
    private static final UtcOffset ZERO;
    private static final long serialVersionUID = 0;

    @m80.k
    private final ZoneOffset zoneOffset;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UtcOffset e(a aVar, CharSequence charSequence, e0 e0Var, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                e0Var = s.d();
            }
            return aVar.c(charSequence, e0Var);
        }

        @m80.k
        public final e0<UtcOffset> a(@m80.k x00.l<? super g0.e, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            return i2.f87688c.a(block);
        }

        @m80.k
        public final UtcOffset b() {
            return UtcOffset.ZERO;
        }

        @m80.k
        public final UtcOffset c(@m80.k CharSequence input, @m80.k e0<UtcOffset> format) {
            DateTimeFormatter k11;
            UtcOffset p11;
            DateTimeFormatter l11;
            UtcOffset p12;
            DateTimeFormatter m11;
            UtcOffset p13;
            kotlin.jvm.internal.g0.p(input, "input");
            kotlin.jvm.internal.g0.p(format, "format");
            b bVar = b.f68488a;
            if (format == bVar.b()) {
                m11 = r3.m();
                kotlin.jvm.internal.g0.o(m11, "access$getIsoFormat(...)");
                p13 = r3.p(input, m11);
                return p13;
            }
            if (format == bVar.c()) {
                l11 = r3.l();
                kotlin.jvm.internal.g0.o(l11, "access$getIsoBasicFormat(...)");
                p12 = r3.p(input, l11);
                return p12;
            }
            if (format != bVar.a()) {
                return format.d(input);
            }
            k11 = r3.k();
            kotlin.jvm.internal.g0.o(k11, "access$getFourDigitsFormat(...)");
            p11 = r3.p(input, k11);
            return p11;
        }

        @yz.n(level = DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ UtcOffset d(String offsetString) {
            kotlin.jvm.internal.g0.p(offsetString, "offsetString");
            return e(this, offsetString, null, 2, null);
        }

        @m80.k
        public final f50.i<UtcOffset> serializer() {
            return v0.f97469a;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f68488a = new b();

        @m80.k
        public final e0<UtcOffset> a() {
            return e3.L();
        }

        @m80.k
        public final e0<UtcOffset> b() {
            return e3.M();
        }

        @m80.k
        public final e0<UtcOffset> c() {
            return e3.N();
        }
    }

    static {
        ZoneOffset UTC;
        UTC = ZoneOffset.UTC;
        kotlin.jvm.internal.g0.o(UTC, "UTC");
        ZERO = new UtcOffset(UTC);
    }

    public UtcOffset(@m80.k ZoneOffset zoneOffset) {
        kotlin.jvm.internal.g0.p(zoneOffset, "zoneOffset");
        this.zoneOffset = zoneOffset;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(10, this);
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof UtcOffset) && kotlin.jvm.internal.g0.g(this.zoneOffset, ((UtcOffset) obj).zoneOffset);
    }

    public final int getTotalSeconds() {
        int totalSeconds;
        totalSeconds = this.zoneOffset.getTotalSeconds();
        return totalSeconds;
    }

    @m80.k
    public final ZoneOffset getZoneOffset$kotlinx_datetime() {
        return this.zoneOffset;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.zoneOffset.hashCode();
        return hashCode;
    }

    @m80.k
    public String toString() {
        String zoneOffset;
        zoneOffset = this.zoneOffset.toString();
        kotlin.jvm.internal.g0.o(zoneOffset, "toString(...)");
        return zoneOffset;
    }
}
