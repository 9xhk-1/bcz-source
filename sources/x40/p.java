package x40;

import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlinx.datetime.b;
import kotlinx.serialization.MissingFieldException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDateTimeUnitSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeUnitSerializers.kt\nkotlinx/datetime/serializers/DayBasedDateTimeUnitSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,229:1\n475#2,4:230\n570#3,4:234\n297#4,8:238\n*S KotlinDebug\n*F\n+ 1 DateTimeUnitSerializers.kt\nkotlinx/datetime/serializers/DayBasedDateTimeUnitSerializer\n*L\n78#1:230,4\n87#1:234,4\n73#1:238,8\n*E\n"})
/* loaded from: classes8.dex */
public final class p implements f50.i<b.c> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p f97452a = new p();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f97453b = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: x40.n
        @Override // x00.a
        public final Object invoke() {
            h50.f i11;
            i11 = p.i();
            return i11;
        }
    });

    public static final h50.f i() {
        return h50.l.e("kotlinx.datetime.DayBased", new h50.f[0], new x00.l() { // from class: x40.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j11;
                j11 = p.j((h50.a) obj);
                return j11;
            }
        });
    }

    public static final g2 j(h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("days", j50.z0.f63517a.a(), a00.h0.J(), false);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return (h50.f) f97453b.getValue();
    }

    @Override // f50.e
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b.c e(@m80.k i50.f decoder) {
        int i11;
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        boolean z11 = true;
        if (!beginStructure.decodeSequentially()) {
            i11 = 0;
            boolean z12 = false;
            while (true) {
                p pVar = f97452a;
                int decodeElementIndex = beginStructure.decodeElementIndex(pVar.a());
                if (decodeElementIndex == -1) {
                    z11 = z12;
                    break;
                }
                if (decodeElementIndex != 0) {
                    m.a(decodeElementIndex);
                    throw new KotlinNothingValueException();
                }
                i11 = beginStructure.decodeIntElement(pVar.a(), 0);
                z12 = true;
            }
        } else {
            i11 = beginStructure.decodeIntElement(f97452a.a(), 0);
        }
        g2 g2Var = g2.f100423a;
        beginStructure.endStructure(a11);
        if (z11) {
            return new b.c(i11);
        }
        throw new MissingFieldException("days", a().k());
    }

    @Override // f50.b0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k b.c value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        h50.f a11 = a();
        i50.e beginStructure = encoder.beginStructure(a11);
        beginStructure.encodeIntElement(f97452a.a(), 0, value.p());
        beginStructure.endStructure(a11);
    }
}
