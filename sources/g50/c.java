package g50;

import a00.h0;
import f50.i;
import h50.f;
import h50.l;
import i50.e;
import j50.l1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.Instant;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import m80.k;
import w30.h;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nInstantComponentSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstantComponentSerializer.kt\nkotlinx/serialization/builtins/InstantComponentSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,62:1\n571#2,4:63\n476#3,4:67\n347#4,8:71\n347#4,8:79\n*S KotlinDebug\n*F\n+ 1 InstantComponentSerializer.kt\nkotlinx/serialization/builtins/InstantComponentSerializer\n*L\n29#1:63,4\n53#1:67,4\n23#1:71,8\n24#1:79,8\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements i<Instant> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f52938a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final f f52939b = l.e("kotlinx.serialization.InstantComponentSerializer", new f[0], new x00.l() { // from class: g50.b
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 h11;
            h11 = c.h((h50.a) obj);
            return h11;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 h(h50.a buildClassSerialDescriptor) {
        g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> J = h0.J();
        l1 l1Var = l1.f63406a;
        buildClassSerialDescriptor.a("epochSeconds", l1Var.a(), J, false);
        buildClassSerialDescriptor.a("nanosecondsOfSecond", l1Var.a(), h0.J(), true);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @k
    public f a() {
        return f52939b;
    }

    @Override // f50.e
    @k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Instant e(@k i50.f decoder) {
        g0.p(decoder, "decoder");
        f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        long j11 = 0;
        boolean z11 = true;
        int i11 = 0;
        while (true) {
            c cVar = f52938a;
            int decodeElementIndex = beginStructure.decodeElementIndex(cVar.a());
            if (decodeElementIndex == -1) {
                if (z11) {
                    throw new MissingFieldException("epochSeconds", cVar.a().k());
                }
                Instant b11 = Instant.Companion.b(j11, i11);
                beginStructure.endStructure(a11);
                return b11;
            }
            if (decodeElementIndex == 0) {
                j11 = beginStructure.decodeLongElement(cVar.a(), 0);
                z11 = false;
            } else {
                if (decodeElementIndex != 1) {
                    throw new SerializationException("Unexpected index: " + decodeElementIndex);
                }
                i11 = beginStructure.decodeIntElement(cVar.a(), 1);
            }
        }
    }

    @Override // f50.b0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(@k i50.h encoder, @k Instant value) {
        g0.p(encoder, "encoder");
        g0.p(value, "value");
        f a11 = a();
        e beginStructure = encoder.beginStructure(a11);
        c cVar = f52938a;
        beginStructure.encodeLongElement(cVar.a(), 0, value.getEpochSeconds());
        if (value.getNanosecondsOfSecond() != 0 || beginStructure.shouldEncodeElementDefault(cVar.a(), 1)) {
            beginStructure.encodeIntElement(cVar.a(), 1, value.getNanosecondsOfSecond());
        }
        beginStructure.endStructure(a11);
    }
}
