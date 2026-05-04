package x40;

import j50.l1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDateTimePeriodSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimePeriodSerializers.kt\nkotlinx/datetime/serializers/DatePeriodComponentSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,194:1\n570#2,4:195\n475#3,4:199\n297#4,8:203\n297#4,8:211\n297#4,8:219\n297#4,8:227\n297#4,8:235\n297#4,8:243\n297#4,8:251\n*S KotlinDebug\n*F\n+ 1 DateTimePeriodSerializers.kt\nkotlinx/datetime/serializers/DatePeriodComponentSerializer\n*L\n124#1:195,4\n145#1:199,4\n114#1:203,8\n115#1:211,8\n116#1:219,8\n117#1:227,8\n118#1:235,8\n119#1:243,8\n120#1:251,8\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements f50.i<r40.k> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f97420a = new d();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f97421b = h50.l.e("kotlinx.datetime.DatePeriod/components", new h50.f[0], new x00.l() { // from class: x40.c
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 j11;
            j11 = d.j((h50.a) obj);
            return j11;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 j(h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> J = a00.h0.J();
        j50.z0 z0Var = j50.z0.f63517a;
        buildClassSerialDescriptor.a("years", z0Var.a(), J, true);
        buildClassSerialDescriptor.a("months", z0Var.a(), a00.h0.J(), true);
        buildClassSerialDescriptor.a("days", z0Var.a(), a00.h0.J(), true);
        buildClassSerialDescriptor.a("hours", z0Var.a(), a00.h0.J(), true);
        buildClassSerialDescriptor.a("minutes", z0Var.a(), a00.h0.J(), true);
        buildClassSerialDescriptor.a("seconds", z0Var.a(), a00.h0.J(), true);
        buildClassSerialDescriptor.a("nanoseconds", l1.f63406a.a(), a00.h0.J(), true);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f97421b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public r40.k e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            d dVar = f97420a;
            int decodeElementIndex = beginStructure.decodeElementIndex(dVar.a());
            switch (decodeElementIndex) {
                case -1:
                    r40.k kVar = new r40.k(i11, i12, i13);
                    beginStructure.endStructure(a11);
                    return kVar;
                case 0:
                    i11 = beginStructure.decodeIntElement(dVar.a(), 0);
                    break;
                case 1:
                    i12 = beginStructure.decodeIntElement(dVar.a(), 1);
                    break;
                case 2:
                    i13 = beginStructure.decodeIntElement(dVar.a(), 2);
                    break;
                case 3:
                    dVar.m("hours", beginStructure.decodeIntElement(dVar.a(), 3));
                    break;
                case 4:
                    dVar.m("minutes", beginStructure.decodeIntElement(dVar.a(), 4));
                    break;
                case 5:
                    dVar.m("seconds", beginStructure.decodeIntElement(dVar.a(), 5));
                    break;
                case 6:
                    dVar.n("nanoseconds", beginStructure.decodeLongElement(dVar.a(), 6));
                    break;
                default:
                    throw new SerializationException("Unexpected index: " + decodeElementIndex);
            }
        }
    }

    @Override // f50.b0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k r40.k value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        h50.f a11 = a();
        i50.e beginStructure = encoder.beginStructure(a11);
        if (value.j() != 0) {
            beginStructure.encodeIntElement(h.f97433a.a(), 0, value.j());
        }
        if (value.e() != 0) {
            beginStructure.encodeIntElement(h.f97433a.a(), 1, value.e());
        }
        if (value.b() != 0) {
            beginStructure.encodeIntElement(h.f97433a.a(), 2, value.b());
        }
        beginStructure.endStructure(a11);
    }

    public final void m(String str, int i11) {
        n(str, i11);
    }

    public final void n(String str, long j11) {
        if (j11 == 0) {
            return;
        }
        throw new SerializationException("DatePeriod should have non-date components be zero, but got " + j11 + " in '" + str + '\'');
    }
}
