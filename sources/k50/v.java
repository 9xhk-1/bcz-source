package k50;

import h50.d;
import kotlin.NoWhenBranchMatchedException;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class v implements f50.i<k> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final v f65976a = new v();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f65977b = h50.l.h("kotlinx.serialization.json.JsonElement", d.b.f58510a, new h50.f[0], new x00.l() { // from class: k50.p
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 m11;
            m11 = v.m((h50.a) obj);
            return m11;
        }
    });

    public static final g2 m(h50.a buildSerialDescriptor) {
        h50.f f11;
        h50.f f12;
        h50.f f13;
        h50.f f14;
        h50.f f15;
        kotlin.jvm.internal.g0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
        f11 = w.f(new x00.a() { // from class: k50.q
            @Override // x00.a
            public final Object invoke() {
                h50.f n11;
                n11 = v.n();
                return n11;
            }
        });
        h50.a.b(buildSerialDescriptor, "JsonPrimitive", f11, null, false, 12, null);
        f12 = w.f(new x00.a() { // from class: k50.r
            @Override // x00.a
            public final Object invoke() {
                h50.f o11;
                o11 = v.o();
                return o11;
            }
        });
        h50.a.b(buildSerialDescriptor, "JsonNull", f12, null, false, 12, null);
        f13 = w.f(new x00.a() { // from class: k50.s
            @Override // x00.a
            public final Object invoke() {
                h50.f p11;
                p11 = v.p();
                return p11;
            }
        });
        h50.a.b(buildSerialDescriptor, "JsonLiteral", f13, null, false, 12, null);
        f14 = w.f(new x00.a() { // from class: k50.t
            @Override // x00.a
            public final Object invoke() {
                h50.f q11;
                q11 = v.q();
                return q11;
            }
        });
        h50.a.b(buildSerialDescriptor, "JsonObject", f14, null, false, 12, null);
        f15 = w.f(new x00.a() { // from class: k50.u
            @Override // x00.a
            public final Object invoke() {
                h50.f r11;
                r11 = v.r();
                return r11;
            }
        });
        h50.a.b(buildSerialDescriptor, "JsonArray", f15, null, false, 12, null);
        return g2.f100423a;
    }

    public static final h50.f n() {
        return m0.f65972a.a();
    }

    public static final h50.f o() {
        return g0.f65961a.a();
    }

    public static final h50.f p() {
        return c0.f65912a.a();
    }

    public static final h50.f q() {
        return k0.f65967a.a();
    }

    public static final h50.f r() {
        return d.f65914a.a();
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f65977b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public k e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return w.d(decoder).i();
    }

    @Override // f50.b0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k k value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        w.h(encoder);
        if (value instanceof l0) {
            encoder.encodeSerializableValue(m0.f65972a, value);
        } else if (value instanceof i0) {
            encoder.encodeSerializableValue(k0.f65967a, value);
        } else {
            if (!(value instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeSerializableValue(d.f65914a, value);
        }
    }
}
