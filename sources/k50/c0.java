package k50;

import h50.e;
import kotlin.jvm.internal.u0;
import u30.w0;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 implements f50.i<b0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f65912a = new c0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f65913b = h50.l.c("kotlinx.serialization.json.JsonLiteral", e.i.f58519a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f65913b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b0 e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        k i11 = w.d(decoder).i();
        if (i11 instanceof b0) {
            return (b0) i11;
        }
        throw l50.i0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.o0.d(i11.getClass()), i11.toString());
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k b0 value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        w.h(encoder);
        if (value.d()) {
            encoder.encodeString(value.b());
            return;
        }
        if (value.g() != null) {
            encoder.encodeInline(value.g()).encodeString(value.b());
            return;
        }
        Long r12 = u30.e0.r1(value.b());
        if (r12 != null) {
            encoder.encodeLong(r12.longValue());
            return;
        }
        w1 o11 = w0.o(value.b());
        if (o11 != null) {
            encoder.encodeInline(g50.a.L(w1.f100453b).a()).encodeLong(o11.m0());
            return;
        }
        Double Z0 = u30.d0.Z0(value.b());
        if (Z0 != null) {
            encoder.encodeDouble(Z0.doubleValue());
            return;
        }
        Boolean a62 = u30.k0.a6(value.b());
        if (a62 != null) {
            encoder.encodeBoolean(a62.booleanValue());
        } else {
            encoder.encodeString(value.b());
        }
    }
}
