package x40;

import j50.c3;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.datetime.LocalTime;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import xo.n;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalTimeSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalTimeSerializers.kt\nkotlinx/datetime/serializers/LocalTimeComponentSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,123:1\n570#2,4:124\n475#3,4:128\n297#4,8:132\n297#4,8:140\n297#4,8:148\n297#4,8:156\n*S KotlinDebug\n*F\n+ 1 LocalTimeSerializers.kt\nkotlinx/datetime/serializers/LocalTimeComponentSerializer\n*L\n41#1:124,4\n62#1:128,4\n33#1:132,8\n34#1:140,8\n35#1:148,8\n36#1:156,8\n*E\n"})
/* loaded from: classes8.dex */
public final class i0 implements f50.i<LocalTime> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i0 f97437a = new i0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f97438b = h50.l.e("kotlinx.datetime.LocalTime/components", new h50.f[0], new x00.l() { // from class: x40.h0
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 h11;
            h11 = i0.h((h50.a) obj);
            return h11;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 h(h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> J = a00.h0.J();
        c3 c3Var = c3.f63342a;
        buildClassSerialDescriptor.a("hour", c3Var.a(), J, false);
        buildClassSerialDescriptor.a(n.r.f98263e, c3Var.a(), a00.h0.J(), false);
        buildClassSerialDescriptor.a(n.r.f98264f, c3Var.a(), a00.h0.J(), true);
        buildClassSerialDescriptor.a("nanosecond", j50.z0.f63517a.a(), a00.h0.J(), true);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f97438b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LocalTime e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        Short sh2 = null;
        Short sh3 = null;
        short s11 = 0;
        int i11 = 0;
        while (true) {
            i0 i0Var = f97437a;
            int decodeElementIndex = beginStructure.decodeElementIndex(i0Var.a());
            if (decodeElementIndex == -1) {
                if (sh2 == null) {
                    throw new MissingFieldException("hour", i0Var.a().k());
                }
                if (sh3 == null) {
                    throw new MissingFieldException(n.r.f98263e, i0Var.a().k());
                }
                LocalTime localTime = new LocalTime(sh2.shortValue(), sh3.shortValue(), s11, i11);
                beginStructure.endStructure(a11);
                return localTime;
            }
            if (decodeElementIndex == 0) {
                sh2 = Short.valueOf(beginStructure.decodeShortElement(i0Var.a(), 0));
            } else if (decodeElementIndex == 1) {
                sh3 = Short.valueOf(beginStructure.decodeShortElement(i0Var.a(), 1));
            } else if (decodeElementIndex == 2) {
                s11 = beginStructure.decodeShortElement(i0Var.a(), 2);
            } else {
                if (decodeElementIndex != 3) {
                    throw new SerializationException("Unexpected index: " + decodeElementIndex);
                }
                i11 = beginStructure.decodeIntElement(i0Var.a(), 3);
            }
        }
    }

    @Override // f50.b0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k LocalTime value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        h50.f a11 = a();
        i50.e beginStructure = encoder.beginStructure(a11);
        i0 i0Var = f97437a;
        beginStructure.encodeShortElement(i0Var.a(), 0, (short) value.getHour());
        beginStructure.encodeShortElement(i0Var.a(), 1, (short) value.getMinute());
        if (value.getSecond() != 0 || value.getNanosecond() != 0) {
            beginStructure.encodeShortElement(i0Var.a(), 2, (short) value.getSecond());
            if (value.getNanosecond() != 0) {
                beginStructure.encodeIntElement(i0Var.a(), 3, value.getNanosecond());
            }
        }
        beginStructure.endStructure(a11);
    }
}
