package x40;

import j50.c3;
import kotlin.KotlinNothingValueException;
import kotlinx.datetime.YearMonth;
import kotlinx.serialization.MissingFieldException;
import r40.j2;
import xo.n;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nYearMonthSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthSerializers.kt\nkotlinx/datetime/serializers/YearMonthComponentSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,110:1\n570#2,4:111\n475#3,4:115\n297#4,8:119\n297#4,8:127\n*S KotlinDebug\n*F\n+ 1 YearMonthSerializers.kt\nkotlinx/datetime/serializers/YearMonthComponentSerializer\n*L\n40#1:111,4\n57#1:115,4\n34#1:119,8\n35#1:127,8\n*E\n"})
/* loaded from: classes8.dex */
public final class x0 implements f50.i<YearMonth> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x0 f97473a = new x0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f97474b = h50.l.e("kotlinx.datetime.YearMonth/components", new h50.f[0], new x00.l() { // from class: x40.w0
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 h11;
            h11 = x0.h((h50.a) obj);
            return h11;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 h(h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a(n.r.f98259a, j50.z0.f63517a.a(), a00.h0.J(), false);
        buildClassSerialDescriptor.a(n.r.f98260b, c3.f63342a.a(), a00.h0.J(), false);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f97474b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public YearMonth e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        Integer num = null;
        Short sh2 = null;
        while (true) {
            x0 x0Var = f97473a;
            int decodeElementIndex = beginStructure.decodeElementIndex(x0Var.a());
            if (decodeElementIndex == -1) {
                if (num == null) {
                    throw new MissingFieldException(n.r.f98259a, x0Var.a().k());
                }
                if (sh2 == null) {
                    throw new MissingFieldException(n.r.f98260b, x0Var.a().k());
                }
                YearMonth yearMonth = new YearMonth(num.intValue(), sh2.shortValue());
                beginStructure.endStructure(a11);
                return yearMonth;
            }
            if (decodeElementIndex == 0) {
                num = Integer.valueOf(beginStructure.decodeIntElement(x0Var.a(), 0));
            } else {
                if (decodeElementIndex != 1) {
                    m.a(decodeElementIndex);
                    throw new KotlinNothingValueException();
                }
                sh2 = Short.valueOf(beginStructure.decodeShortElement(x0Var.a(), 1));
            }
        }
    }

    @Override // f50.b0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k YearMonth value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        h50.f a11 = a();
        i50.e beginStructure = encoder.beginStructure(a11);
        x0 x0Var = f97473a;
        beginStructure.encodeIntElement(x0Var.a(), 0, value.getYear());
        beginStructure.encodeShortElement(x0Var.a(), 1, (short) j2.d(value.getMonth()));
        beginStructure.endStructure(a11);
    }
}
