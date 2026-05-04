package l50;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h50.m;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.WriteMode;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 5 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 6 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,392:1\n78#2,6:393\n84#2,9:407\n270#3,8:399\n517#4,3:416\n517#4,3:419\n133#5,18:422\n385#6,5:440\n385#6,5:445\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n75#1:393,6\n75#1:407,9\n75#1:399,8\n202#1:416,3\n203#1:419,3\n215#1:422,18\n309#1:440,5\n316#1:445,5\n*E\n"})
/* loaded from: classes8.dex */
public class j1 extends i50.a implements k50.i, i50.c {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final k50.a f70002d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final WriteMode f70003e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final l50.a f70004f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o50.f f70005g;

    /* renamed from: h, reason: collision with root package name */
    public int f70006h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public a f70007i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final k50.g f70008j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final h0 f70009k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        @w00.g
        public String f70010a;

        public a(@m80.l String str) {
            this.f70010a = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70011a;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f70011a = iArr;
        }
    }

    public j1(@m80.k k50.a json, @m80.k WriteMode mode, @m80.k l50.a lexer, @m80.k h50.f descriptor, @m80.l a aVar) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(mode, "mode");
        kotlin.jvm.internal.g0.p(lexer, "lexer");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        this.f70002d = json;
        this.f70003e = mode;
        this.f70004f = lexer;
        this.f70005g = json.getSerializersModule();
        this.f70006h = -1;
        this.f70007i = aVar;
        k50.g i11 = json.i();
        this.f70008j = i11;
        this.f70009k = i11.n() ? null : new h0(descriptor);
    }

    @Override // k50.i
    @m80.k
    public final k50.a a() {
        return this.f70002d;
    }

    @Override // i50.a, i50.f
    @m80.k
    public i50.d beginStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        WriteMode c11 = v1.c(this.f70002d, descriptor);
        this.f70004f.f69913b.d(descriptor);
        this.f70004f.n(c11.begin);
        n();
        int i11 = b.f70011a[c11.ordinal()];
        return (i11 == 1 || i11 == 2 || i11 == 3) ? new j1(this.f70002d, c11, this.f70004f, descriptor, this.f70007i) : (this.f70003e == c11 && this.f70002d.i().n()) ? this : new j1(this.f70002d, c11, this.f70004f, descriptor, this.f70007i);
    }

    @Override // i50.a, i50.f
    public boolean decodeBoolean() {
        return this.f70004f.i();
    }

    @Override // i50.a, i50.f
    public byte decodeByte() {
        long o11 = this.f70004f.o();
        byte b11 = (byte) o11;
        if (o11 == b11) {
            return b11;
        }
        l50.a.B(this.f70004f, "Failed to parse byte for input '" + o11 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // i50.a, i50.f
    public char decodeChar() {
        String u11 = this.f70004f.u();
        if (u11.length() == 1) {
            return u11.charAt(0);
        }
        l50.a.B(this.f70004f, "Expected single char, but got '" + u11 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // i50.a, i50.f
    public double decodeDouble() {
        l50.a aVar = this.f70004f;
        String u11 = aVar.u();
        try {
            double parseDouble = Double.parseDouble(u11);
            if (this.f70002d.i().c()) {
                return parseDouble;
            }
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            i0.k(this.f70004f, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            l50.a.B(aVar, "Failed to parse type 'double' for input '" + u11 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // i50.d
    public int decodeElementIndex(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        int i11 = b.f70011a[this.f70003e.ordinal()];
        int p11 = i11 != 2 ? i11 != 4 ? p() : r(descriptor) : q();
        if (this.f70003e != WriteMode.MAP) {
            this.f70004f.f69913b.h(p11);
        }
        return p11;
    }

    @Override // i50.a, i50.f
    public int decodeEnum(@m80.k h50.f enumDescriptor) {
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        return p0.k(enumDescriptor, this.f70002d, decodeString(), " at path " + this.f70004f.f69913b.a());
    }

    @Override // i50.a, i50.f
    public float decodeFloat() {
        l50.a aVar = this.f70004f;
        String u11 = aVar.u();
        try {
            float parseFloat = Float.parseFloat(u11);
            if (this.f70002d.i().c()) {
                return parseFloat;
            }
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            i0.k(this.f70004f, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            l50.a.B(aVar, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + u11 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // i50.a, i50.f
    @m80.k
    public i50.f decodeInline(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return m1.b(descriptor) ? new g0(this.f70004f, this.f70002d) : super.decodeInline(descriptor);
    }

    @Override // i50.a, i50.f
    public int decodeInt() {
        long o11 = this.f70004f.o();
        int i11 = (int) o11;
        if (o11 == i11) {
            return i11;
        }
        l50.a.B(this.f70004f, "Failed to parse int for input '" + o11 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // i50.a, i50.f
    public long decodeLong() {
        return this.f70004f.o();
    }

    @Override // i50.a, i50.f
    public boolean decodeNotNullMark() {
        h0 h0Var = this.f70009k;
        return ((h0Var != null ? h0Var.b() : false) || l50.a.a0(this.f70004f, false, 1, null)) ? false : true;
    }

    @Override // i50.a, i50.f
    @m80.l
    public Void decodeNull() {
        return null;
    }

    @Override // i50.a, i50.d
    public <T> T decodeSerializableElement(@m80.k h50.f descriptor, int i11, @m80.k f50.e<? extends T> deserializer, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        boolean z11 = this.f70003e == WriteMode.MAP && (i11 & 1) == 0;
        if (z11) {
            this.f70004f.f69913b.e();
        }
        T t12 = (T) super.decodeSerializableElement(descriptor, i11, deserializer, t11);
        if (z11) {
            this.f70004f.f69913b.g(t12);
        }
        return t12;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    @Override // i50.a, i50.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T decodeSerializableValue(@m80.k f50.e<? extends T> r12) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.j1.decodeSerializableValue(f50.e):java.lang.Object");
    }

    @Override // i50.a, i50.f
    public short decodeShort() {
        long o11 = this.f70004f.o();
        short s11 = (short) o11;
        if (o11 == s11) {
            return s11;
        }
        l50.a.B(this.f70004f, "Failed to parse short for input '" + o11 + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // i50.a, i50.f
    @m80.k
    public String decodeString() {
        return this.f70008j.w() ? this.f70004f.v() : this.f70004f.r();
    }

    @Override // i50.a, i50.d
    public void endStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (descriptor.h() == 0 && p0.o(descriptor, this.f70002d)) {
            u(descriptor);
        }
        if (this.f70004f.Y() && !this.f70002d.i().e()) {
            i0.g(this.f70004f, "");
            throw new KotlinNothingValueException();
        }
        this.f70004f.n(this.f70003e.end);
        this.f70004f.f69913b.b();
    }

    @Override // i50.f, i50.d
    @m80.k
    public o50.f getSerializersModule() {
        return this.f70005g;
    }

    @Override // k50.i
    @m80.k
    public k50.k i() {
        return new d1(this.f70002d.i(), this.f70004f).e();
    }

    @Override // i50.c
    public void k(@m80.k x00.l<? super String, g2> consumeChunk) {
        kotlin.jvm.internal.g0.p(consumeChunk, "consumeChunk");
        this.f70004f.t(this.f70008j.w(), consumeChunk);
    }

    public final void n() {
        if (this.f70004f.O() != 4) {
            return;
        }
        l50.a.B(this.f70004f, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean o(h50.f fVar, int i11) {
        String P;
        k50.a aVar = this.f70002d;
        boolean l11 = fVar.l(i11);
        h50.f e11 = fVar.e(i11);
        if (l11 && !e11.b() && this.f70004f.Z(true)) {
            return true;
        }
        if (!kotlin.jvm.internal.g0.g(e11.getKind(), m.b.f58540a) || ((e11.b() && this.f70004f.Z(false)) || (P = this.f70004f.P(this.f70008j.w())) == null)) {
            return false;
        }
        int j11 = p0.j(e11, aVar, P);
        boolean z11 = !aVar.i().n() && e11.b();
        if (j11 == -3 && (l11 || z11)) {
            this.f70004f.r();
            return true;
        }
        return false;
    }

    public final int p() {
        boolean Y = this.f70004f.Y();
        if (!this.f70004f.f()) {
            if (!Y || this.f70002d.i().e()) {
                return -1;
            }
            i0.g(this.f70004f, "array");
            throw new KotlinNothingValueException();
        }
        int i11 = this.f70006h;
        if (i11 != -1 && !Y) {
            l50.a.B(this.f70004f, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i12 = i11 + 1;
        this.f70006h = i12;
        return i12;
    }

    public final int q() {
        int i11 = this.f70006h;
        boolean z11 = false;
        boolean z12 = i11 % 2 != 0;
        if (!z12) {
            this.f70004f.n(':');
        } else if (i11 != -1) {
            z11 = this.f70004f.Y();
        }
        if (!this.f70004f.f()) {
            if (!z11 || this.f70002d.i().e()) {
                return -1;
            }
            i0.h(this.f70004f, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z12) {
            if (this.f70006h == -1) {
                l50.a aVar = this.f70004f;
                int i12 = aVar.f69912a;
                if (z11) {
                    l50.a.B(aVar, "Unexpected leading comma", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                l50.a aVar2 = this.f70004f;
                boolean z13 = z11;
                int i13 = aVar2.f69912a;
                if (!z13) {
                    l50.a.B(aVar2, "Expected comma after the key-value pair", i13, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i14 = this.f70006h + 1;
        this.f70006h = i14;
        return i14;
    }

    public final int r(h50.f fVar) {
        int j11;
        boolean z11;
        boolean Y = this.f70004f.Y();
        while (true) {
            boolean z12 = true;
            if (!this.f70004f.f()) {
                if (Y && !this.f70002d.i().e()) {
                    i0.h(this.f70004f, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                h0 h0Var = this.f70009k;
                if (h0Var != null) {
                    return h0Var.d();
                }
                return -1;
            }
            String s11 = s();
            this.f70004f.n(':');
            j11 = p0.j(fVar, this.f70002d, s11);
            if (j11 == -3) {
                z11 = false;
            } else {
                if (!this.f70008j.j() || !o(fVar, j11)) {
                    break;
                }
                z11 = this.f70004f.Y();
                z12 = false;
            }
            Y = z12 ? t(fVar, s11) : z11;
        }
        h0 h0Var2 = this.f70009k;
        if (h0Var2 != null) {
            h0Var2.c(j11);
        }
        return j11;
    }

    public final String s() {
        return this.f70008j.w() ? this.f70004f.v() : this.f70004f.k();
    }

    public final boolean t(h50.f fVar, String str) {
        if (p0.o(fVar, this.f70002d) || v(this.f70007i, str)) {
            this.f70004f.U(this.f70008j.w());
        } else {
            this.f70004f.f69913b.b();
            this.f70004f.E(str);
        }
        return this.f70004f.Y();
    }

    public final void u(h50.f fVar) {
        while (decodeElementIndex(fVar) != -1) {
        }
    }

    public final boolean v(a aVar, String str) {
        if (aVar == null || !kotlin.jvm.internal.g0.g(aVar.f70010a, str)) {
            return false;
        }
        aVar.f70010a = null;
        return true;
    }
}
