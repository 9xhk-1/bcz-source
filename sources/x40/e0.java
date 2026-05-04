package x40;

import j50.c3;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.datetime.LocalDateTime;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import r40.j2;
import xo.n;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalDateTimeSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateTimeSerializers.kt\nkotlinx/datetime/serializers/LocalDateTimeComponentSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,141:1\n570#2,4:142\n475#3,4:146\n297#4,8:150\n297#4,8:158\n297#4,8:166\n297#4,8:174\n297#4,8:182\n297#4,8:190\n297#4,8:198\n*S KotlinDebug\n*F\n+ 1 LocalDateTimeSerializers.kt\nkotlinx/datetime/serializers/LocalDateTimeComponentSerializer\n*L\n44#1:142,4\n74#1:146,4\n33#1:150,8\n34#1:158,8\n35#1:166,8\n36#1:174,8\n37#1:182,8\n38#1:190,8\n39#1:198,8\n*E\n"})
/* loaded from: classes8.dex */
public final class e0 implements f50.i<LocalDateTime> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e0 f97424a = new e0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f97425b = h50.l.e("kotlinx.datetime.LocalDateTime/components", new h50.f[0], new x00.l() { // from class: x40.d0
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 h11;
            h11 = e0.h((h50.a) obj);
            return h11;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 h(h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> J = a00.h0.J();
        j50.z0 z0Var = j50.z0.f63517a;
        buildClassSerialDescriptor.a(n.r.f98259a, z0Var.a(), J, false);
        List<? extends Annotation> J2 = a00.h0.J();
        c3 c3Var = c3.f63342a;
        buildClassSerialDescriptor.a(n.r.f98260b, c3Var.a(), J2, false);
        buildClassSerialDescriptor.a("day", c3Var.a(), a00.h0.J(), false);
        buildClassSerialDescriptor.a("hour", c3Var.a(), a00.h0.J(), false);
        buildClassSerialDescriptor.a(n.r.f98263e, c3Var.a(), a00.h0.J(), false);
        buildClassSerialDescriptor.a(n.r.f98264f, c3Var.a(), a00.h0.J(), true);
        buildClassSerialDescriptor.a("nanosecond", z0Var.a(), a00.h0.J(), true);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f97425b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LocalDateTime e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        Integer num = null;
        Short sh2 = null;
        Short sh3 = null;
        Short sh4 = null;
        Short sh5 = null;
        short s11 = 0;
        int i11 = 0;
        while (true) {
            e0 e0Var = f97424a;
            int decodeElementIndex = beginStructure.decodeElementIndex(e0Var.a());
            switch (decodeElementIndex) {
                case -1:
                    if (num == null) {
                        throw new MissingFieldException(n.r.f98259a, e0Var.a().k());
                    }
                    if (sh2 == null) {
                        throw new MissingFieldException(n.r.f98260b, e0Var.a().k());
                    }
                    if (sh3 == null) {
                        throw new MissingFieldException("day", e0Var.a().k());
                    }
                    if (sh4 == null) {
                        throw new MissingFieldException("hour", e0Var.a().k());
                    }
                    if (sh5 == null) {
                        throw new MissingFieldException(n.r.f98263e, e0Var.a().k());
                    }
                    LocalDateTime localDateTime = new LocalDateTime(num.intValue(), sh2.shortValue(), sh3.shortValue(), sh4.shortValue(), sh5.shortValue(), s11, i11);
                    beginStructure.endStructure(a11);
                    return localDateTime;
                case 0:
                    num = Integer.valueOf(beginStructure.decodeIntElement(e0Var.a(), 0));
                    break;
                case 1:
                    sh2 = Short.valueOf(beginStructure.decodeShortElement(e0Var.a(), 1));
                    break;
                case 2:
                    sh3 = Short.valueOf(beginStructure.decodeShortElement(e0Var.a(), 2));
                    break;
                case 3:
                    sh4 = Short.valueOf(beginStructure.decodeShortElement(e0Var.a(), 3));
                    break;
                case 4:
                    sh5 = Short.valueOf(beginStructure.decodeShortElement(e0Var.a(), 4));
                    break;
                case 5:
                    s11 = beginStructure.decodeShortElement(e0Var.a(), 5);
                    break;
                case 6:
                    i11 = beginStructure.decodeIntElement(e0Var.a(), 6);
                    break;
                default:
                    throw new SerializationException("Unexpected index: " + decodeElementIndex);
            }
        }
    }

    @Override // f50.b0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k LocalDateTime value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        h50.f a11 = a();
        i50.e beginStructure = encoder.beginStructure(a11);
        e0 e0Var = f97424a;
        beginStructure.encodeIntElement(e0Var.a(), 0, value.getYear());
        beginStructure.encodeShortElement(e0Var.a(), 1, (short) j2.d(value.m6327getMonth()));
        beginStructure.encodeShortElement(e0Var.a(), 2, (short) value.getDay());
        beginStructure.encodeShortElement(e0Var.a(), 3, (short) value.getHour());
        beginStructure.encodeShortElement(e0Var.a(), 4, (short) value.getMinute());
        if (value.getSecond() != 0 || value.getNanosecond() != 0) {
            beginStructure.encodeShortElement(e0Var.a(), 5, (short) value.getSecond());
            if (value.getNanosecond() != 0) {
                beginStructure.encodeIntElement(e0Var.a(), 6, value.getNanosecond());
            }
        }
        beginStructure.endStructure(a11);
    }
}
