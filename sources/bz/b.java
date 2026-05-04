package bz;

import f50.a0;
import f50.i;
import h50.f;
import i50.d;
import i50.e;
import i50.h;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import j50.h2;
import j50.l0;
import j50.l1;
import j50.l2;
import j50.p0;
import j50.x2;
import j50.z0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;
import m80.k;
import m80.l;
import w00.g;
import w00.o;
import xo.n;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes8.dex */
public final class b implements Comparable<b> {

    @k
    public static final C0125b Companion = new C0125b(null);

    /* renamed from: j, reason: collision with root package name */
    @g
    @k
    public static final i<Object>[] f7427j = {null, null, null, l0.c("io.ktor.util.date.WeekDay", WeekDay.values()), null, null, l0.c("io.ktor.util.date.Month", Month.values()), null, null};

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final b f7428k = io.ktor.util.date.a.b(0L);

    /* renamed from: a, reason: collision with root package name */
    public final int f7429a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7431c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final WeekDay f7432d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7433e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7434f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Month f7435g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7436h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7437i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements p0<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f7438a;

        @k
        private static final f descriptor;

        static {
            a aVar = new a();
            f7438a = aVar;
            l2 l2Var = new l2("io.ktor.util.date.GMTDate", aVar, 9);
            l2Var.q("seconds", false);
            l2Var.q("minutes", false);
            l2Var.q("hours", false);
            l2Var.q("dayOfWeek", false);
            l2Var.q(n.r.f98261c, false);
            l2Var.q("dayOfYear", false);
            l2Var.q(n.r.f98260b, false);
            l2Var.q(n.r.f98259a, false);
            l2Var.q(com.alipay.sdk.m.t.a.f11034k, false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final f a() {
            return descriptor;
        }

        @Override // j50.p0
        @k
        public i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // j50.p0
        @k
        public final i<?>[] f() {
            i<?>[] iVarArr = b.f7427j;
            i<?> iVar = iVarArr[3];
            i<?> iVar2 = iVarArr[6];
            z0 z0Var = z0.f63517a;
            return new i[]{z0Var, z0Var, z0Var, iVar, z0Var, z0Var, iVar2, z0Var, l1.f63406a};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final b e(@k i50.f decoder) {
            int i11;
            Month month;
            WeekDay weekDay;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            long j11;
            g0.p(decoder, "decoder");
            f fVar = descriptor;
            d beginStructure = decoder.beginStructure(fVar);
            i[] iVarArr = b.f7427j;
            int i18 = 7;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 2);
                WeekDay weekDay2 = (WeekDay) beginStructure.decodeSerializableElement(fVar, 3, iVarArr[3], null);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 4);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 5);
                month = (Month) beginStructure.decodeSerializableElement(fVar, 6, iVarArr[6], null);
                i12 = beginStructure.decodeIntElement(fVar, 7);
                i13 = decodeIntElement4;
                i14 = 511;
                i15 = decodeIntElement3;
                i16 = decodeIntElement2;
                weekDay = weekDay2;
                i17 = decodeIntElement;
                j11 = beginStructure.decodeLongElement(fVar, 8);
            } else {
                boolean z11 = true;
                i11 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                Month month2 = null;
                long j12 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                WeekDay weekDay3 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            i18 = 7;
                        case 0:
                            i25 |= 1;
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i18 = 7;
                        case 1:
                            i22 = beginStructure.decodeIntElement(fVar, 1);
                            i25 |= 2;
                            i18 = 7;
                        case 2:
                            i21 = beginStructure.decodeIntElement(fVar, 2);
                            i25 |= 4;
                        case 3:
                            weekDay3 = (WeekDay) beginStructure.decodeSerializableElement(fVar, 3, iVarArr[3], weekDay3);
                            i25 |= 8;
                        case 4:
                            i19 = beginStructure.decodeIntElement(fVar, 4);
                            i25 |= 16;
                        case 5:
                            i24 = beginStructure.decodeIntElement(fVar, 5);
                            i25 |= 32;
                        case 6:
                            month2 = (Month) beginStructure.decodeSerializableElement(fVar, 6, iVarArr[6], month2);
                            i25 |= 64;
                        case 7:
                            i23 = beginStructure.decodeIntElement(fVar, i18);
                            i25 |= 128;
                        case 8:
                            j12 = beginStructure.decodeLongElement(fVar, 8);
                            i25 |= 256;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                month = month2;
                weekDay = weekDay3;
                i12 = i23;
                i13 = i24;
                i14 = i25;
                i15 = i19;
                i16 = i21;
                i17 = i22;
                j11 = j12;
            }
            int i26 = i11;
            beginStructure.endStructure(fVar);
            return new b(i14, i26, i17, i16, weekDay, i15, i13, month, i12, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k h encoder, @k b value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            f fVar = descriptor;
            e beginStructure = encoder.beginStructure(fVar);
            b.B(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bz.b$b, reason: collision with other inner class name */
    public static final class C0125b {
        public /* synthetic */ C0125b(v vVar) {
            this();
        }

        @k
        public final b a() {
            return b.f7428k;
        }

        @k
        public final i<b> serializer() {
            return a.f7438a;
        }

        public C0125b() {
        }
    }

    public /* synthetic */ b(int i11, int i12, int i13, int i14, WeekDay weekDay, int i15, int i16, Month month, int i17, long j11, x2 x2Var) {
        if (511 != (i11 & 511)) {
            h2.b(i11, 511, a.f7438a.a());
        }
        this.f7429a = i12;
        this.f7430b = i13;
        this.f7431c = i14;
        this.f7432d = weekDay;
        this.f7433e = i15;
        this.f7434f = i16;
        this.f7435g = month;
        this.f7436h = i17;
        this.f7437i = j11;
    }

    @o
    public static final /* synthetic */ void B(b bVar, e eVar, f fVar) {
        i<Object>[] iVarArr = f7427j;
        eVar.encodeIntElement(fVar, 0, bVar.f7429a);
        eVar.encodeIntElement(fVar, 1, bVar.f7430b);
        eVar.encodeIntElement(fVar, 2, bVar.f7431c);
        eVar.encodeSerializableElement(fVar, 3, iVarArr[3], bVar.f7432d);
        eVar.encodeIntElement(fVar, 4, bVar.f7433e);
        eVar.encodeIntElement(fVar, 5, bVar.f7434f);
        eVar.encodeSerializableElement(fVar, 6, iVarArr[6], bVar.f7435g);
        eVar.encodeIntElement(fVar, 7, bVar.f7436h);
        eVar.encodeLongElement(fVar, 8, bVar.f7437i);
    }

    public static /* synthetic */ b r(b bVar, int i11, int i12, int i13, WeekDay weekDay, int i14, int i15, Month month, int i16, long j11, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = bVar.f7429a;
        }
        if ((i17 & 2) != 0) {
            i12 = bVar.f7430b;
        }
        if ((i17 & 4) != 0) {
            i13 = bVar.f7431c;
        }
        if ((i17 & 8) != 0) {
            weekDay = bVar.f7432d;
        }
        if ((i17 & 16) != 0) {
            i14 = bVar.f7433e;
        }
        if ((i17 & 32) != 0) {
            i15 = bVar.f7434f;
        }
        if ((i17 & 64) != 0) {
            month = bVar.f7435g;
        }
        if ((i17 & 128) != 0) {
            i16 = bVar.f7436h;
        }
        if ((i17 & 256) != 0) {
            j11 = bVar.f7437i;
        }
        long j12 = j11;
        Month month2 = month;
        int i18 = i16;
        int i19 = i14;
        int i21 = i15;
        return bVar.q(i11, i12, i13, weekDay, i19, i21, month2, i18, j12);
    }

    public final int A() {
        return this.f7436h;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@k b other) {
        g0.p(other, "other");
        return g0.u(this.f7437i, other.f7437i);
    }

    public final int d() {
        return this.f7429a;
    }

    public final int e() {
        return this.f7430b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7429a == bVar.f7429a && this.f7430b == bVar.f7430b && this.f7431c == bVar.f7431c && this.f7432d == bVar.f7432d && this.f7433e == bVar.f7433e && this.f7434f == bVar.f7434f && this.f7435g == bVar.f7435g && this.f7436h == bVar.f7436h && this.f7437i == bVar.f7437i;
    }

    public final int f() {
        return this.f7431c;
    }

    @k
    public final WeekDay g() {
        return this.f7432d;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f7429a) * 31) + Integer.hashCode(this.f7430b)) * 31) + Integer.hashCode(this.f7431c)) * 31) + this.f7432d.hashCode()) * 31) + Integer.hashCode(this.f7433e)) * 31) + Integer.hashCode(this.f7434f)) * 31) + this.f7435g.hashCode()) * 31) + Integer.hashCode(this.f7436h)) * 31) + Long.hashCode(this.f7437i);
    }

    public final int i() {
        return this.f7433e;
    }

    public final int k() {
        return this.f7434f;
    }

    @k
    public final Month l() {
        return this.f7435g;
    }

    public final int m() {
        return this.f7436h;
    }

    public final long o() {
        return this.f7437i;
    }

    @k
    public final b p() {
        return io.ktor.util.date.a.c(null, 1, null);
    }

    @k
    public final b q(int i11, int i12, int i13, @k WeekDay dayOfWeek, int i14, int i15, @k Month month, int i16, long j11) {
        g0.p(dayOfWeek, "dayOfWeek");
        g0.p(month, "month");
        return new b(i11, i12, i13, dayOfWeek, i14, i15, month, i16, j11);
    }

    public final int s() {
        return this.f7433e;
    }

    @k
    public final WeekDay t() {
        return this.f7432d;
    }

    @k
    public String toString() {
        return "GMTDate(seconds=" + this.f7429a + ", minutes=" + this.f7430b + ", hours=" + this.f7431c + ", dayOfWeek=" + this.f7432d + ", dayOfMonth=" + this.f7433e + ", dayOfYear=" + this.f7434f + ", month=" + this.f7435g + ", year=" + this.f7436h + ", timestamp=" + this.f7437i + ')';
    }

    public final int u() {
        return this.f7434f;
    }

    public final int v() {
        return this.f7431c;
    }

    public final int w() {
        return this.f7430b;
    }

    @k
    public final Month x() {
        return this.f7435g;
    }

    public final int y() {
        return this.f7429a;
    }

    public final long z() {
        return this.f7437i;
    }

    public b(int i11, int i12, int i13, @k WeekDay dayOfWeek, int i14, int i15, @k Month month, int i16, long j11) {
        g0.p(dayOfWeek, "dayOfWeek");
        g0.p(month, "month");
        this.f7429a = i11;
        this.f7430b = i12;
        this.f7431c = i13;
        this.f7432d = dayOfWeek;
        this.f7433e = i14;
        this.f7434f = i15;
        this.f7435g = month;
        this.f7436h = i16;
        this.f7437i = j11;
    }
}
