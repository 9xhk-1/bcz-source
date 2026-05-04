package x40;

import j50.c3;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.datetime.LocalDate;
import kotlinx.serialization.MissingFieldException;
import r40.j2;
import xo.n;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalDateSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateSerializers.kt\nkotlinx/datetime/serializers/LocalDateComponentSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,128:1\n570#2,4:129\n475#3,4:133\n297#4,8:137\n297#4,8:145\n297#4,8:153\n*S KotlinDebug\n*F\n+ 1 LocalDateSerializers.kt\nkotlinx/datetime/serializers/LocalDateComponentSerializer\n*L\n40#1:129,4\n60#1:133,4\n33#1:137,8\n34#1:145,8\n35#1:153,8\n*E\n"})
/* loaded from: classes8.dex */
public final class z implements f50.i<LocalDate> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final z f97477a = new z();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f97478b = h50.l.e("kotlinx.datetime.LocalDate/components", new h50.f[0], new x00.l() { // from class: x40.y
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 h11;
            h11 = z.h((h50.a) obj);
            return h11;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 h(h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a(n.r.f98259a, j50.z0.f63517a.a(), a00.h0.J(), false);
        List<? extends Annotation> J = a00.h0.J();
        c3 c3Var = c3.f63342a;
        buildClassSerialDescriptor.a(n.r.f98260b, c3Var.a(), J, false);
        buildClassSerialDescriptor.a("day", c3Var.a(), a00.h0.J(), false);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f97478b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LocalDate e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        Integer num = null;
        Short sh2 = null;
        Short sh3 = null;
        while (true) {
            z zVar = f97477a;
            int decodeElementIndex = beginStructure.decodeElementIndex(zVar.a());
            if (decodeElementIndex == -1) {
                if (num == null) {
                    throw new MissingFieldException(n.r.f98259a, zVar.a().k());
                }
                if (sh2 == null) {
                    throw new MissingFieldException(n.r.f98260b, zVar.a().k());
                }
                if (sh3 == null) {
                    throw new MissingFieldException("day", zVar.a().k());
                }
                LocalDate localDate = new LocalDate(num.intValue(), sh2.shortValue(), sh3.shortValue());
                beginStructure.endStructure(a11);
                return localDate;
            }
            if (decodeElementIndex == 0) {
                num = Integer.valueOf(beginStructure.decodeIntElement(zVar.a(), 0));
            } else if (decodeElementIndex == 1) {
                sh2 = Short.valueOf(beginStructure.decodeShortElement(zVar.a(), 1));
            } else {
                if (decodeElementIndex != 2) {
                    m.a(decodeElementIndex);
                    throw new KotlinNothingValueException();
                }
                sh3 = Short.valueOf(beginStructure.decodeShortElement(zVar.a(), 2));
            }
        }
    }

    @Override // f50.b0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k LocalDate value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        h50.f a11 = a();
        i50.e beginStructure = encoder.beginStructure(a11);
        z zVar = f97477a;
        beginStructure.encodeIntElement(zVar.a(), 0, value.getYear());
        beginStructure.encodeShortElement(zVar.a(), 1, (short) j2.d(value.m6324getMonth()));
        beginStructure.encodeShortElement(zVar.a(), 2, (short) value.getDay());
        beginStructure.endStructure(a11);
    }
}
