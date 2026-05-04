package d5;

import b5.c1;
import com.heytap.mcssdk.constant.IntentConstant;
import com.igexin.assist.sdk.AssistPushConsts;
import f50.a0;
import f50.z;
import j50.d3;
import j50.h2;
import j50.l1;
import j50.l2;
import j50.p0;
import j50.x2;
import j50.z0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class m {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f47261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47262b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f47263c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final c1 f47264d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47265e;

    /* renamed from: f, reason: collision with root package name */
    public final long f47266f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f47267a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f47267a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.unity.proto.RspMsg", aVar, 6);
            l2Var.q("mid", false);
            l2Var.q("type", false);
            l2Var.q(IntentConstant.COMMAND, false);
            l2Var.q(AssistPushConsts.MSG_TYPE_PAYLOAD, false);
            l2Var.q("code", false);
            l2Var.q(com.alipay.sdk.m.t.a.f11034k, false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            f50.i<?> v11 = g50.a.v(c5.b.f8021a);
            d3 d3Var = d3.f63348a;
            z0 z0Var = z0.f63517a;
            return new f50.i[]{d3Var, z0Var, d3Var, v11, z0Var, l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final m e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            long j11;
            String str;
            String str2;
            c1 c1Var;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                str = decodeStringElement;
                i11 = 63;
                c1Var = (c1) beginStructure.decodeNullableSerializableElement(fVar, 3, c5.b.f8021a, null);
                i12 = beginStructure.decodeIntElement(fVar, 4);
                str2 = decodeStringElement2;
                i13 = decodeIntElement;
                j11 = beginStructure.decodeLongElement(fVar, 5);
            } else {
                boolean z11 = true;
                int i14 = 0;
                String str3 = null;
                String str4 = null;
                c1 c1Var2 = null;
                long j12 = 0;
                int i15 = 0;
                int i16 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            str3 = beginStructure.decodeStringElement(fVar, 0);
                            i14 |= 1;
                            continue;
                        case 1:
                            i16 = beginStructure.decodeIntElement(fVar, 1);
                            i14 |= 2;
                            break;
                        case 2:
                            str4 = beginStructure.decodeStringElement(fVar, 2);
                            i14 |= 4;
                            break;
                        case 3:
                            c1Var2 = (c1) beginStructure.decodeNullableSerializableElement(fVar, 3, c5.b.f8021a, c1Var2);
                            i14 |= 8;
                            break;
                        case 4:
                            i15 = beginStructure.decodeIntElement(fVar, 4);
                            i14 |= 16;
                            break;
                        case 5:
                            j12 = beginStructure.decodeLongElement(fVar, 5);
                            i14 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i11 = i14;
                i12 = i15;
                i13 = i16;
                j11 = j12;
                str = str3;
                str2 = str4;
                c1Var = c1Var2;
            }
            beginStructure.endStructure(fVar);
            return new m(i11, str, i13, str2, c1Var, i12, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k m value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            m.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final f50.i<m> serializer() {
            return a.f47267a;
        }

        public b() {
        }
    }

    public /* synthetic */ m(int i11, String str, int i12, String str2, c1 c1Var, int i13, long j11, x2 x2Var) {
        if (63 != (i11 & 63)) {
            h2.b(i11, 63, a.f47267a.a());
        }
        this.f47261a = str;
        this.f47262b = i12;
        this.f47263c = str2;
        this.f47264d = c1Var;
        this.f47265e = i13;
        this.f47266f = j11;
    }

    public static /* synthetic */ m h(m mVar, String str, int i11, String str2, c1 c1Var, int i12, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mVar.f47261a;
        }
        if ((i13 & 2) != 0) {
            i11 = mVar.f47262b;
        }
        if ((i13 & 4) != 0) {
            str2 = mVar.f47263c;
        }
        if ((i13 & 8) != 0) {
            c1Var = mVar.f47264d;
        }
        if ((i13 & 16) != 0) {
            i12 = mVar.f47265e;
        }
        if ((i13 & 32) != 0) {
            j11 = mVar.f47266f;
        }
        long j12 = j11;
        int i14 = i12;
        String str3 = str2;
        return mVar.g(str, i11, str3, c1Var, i14, j12);
    }

    @o
    public static final /* synthetic */ void u(m mVar, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, mVar.f47261a);
        eVar.encodeIntElement(fVar, 1, mVar.f47262b);
        eVar.encodeStringElement(fVar, 2, mVar.f47263c);
        eVar.encodeNullableSerializableElement(fVar, 3, c5.b.f8021a, mVar.f47264d);
        eVar.encodeIntElement(fVar, 4, mVar.f47265e);
        eVar.encodeLongElement(fVar, 5, mVar.f47266f);
    }

    @m80.k
    public final String a() {
        return this.f47261a;
    }

    public final int b() {
        return this.f47262b;
    }

    @m80.k
    public final String c() {
        return this.f47263c;
    }

    @m80.l
    public final c1 d() {
        return this.f47264d;
    }

    public final int e() {
        return this.f47265e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g0.g(this.f47261a, mVar.f47261a) && this.f47262b == mVar.f47262b && g0.g(this.f47263c, mVar.f47263c) && g0.g(this.f47264d, mVar.f47264d) && this.f47265e == mVar.f47265e && this.f47266f == mVar.f47266f;
    }

    public final long f() {
        return this.f47266f;
    }

    @m80.k
    public final m g(@m80.k String mid, int i11, @m80.k String command, @m80.l c1 c1Var, int i12, long j11) {
        g0.p(mid, "mid");
        g0.p(command, "command");
        return new m(mid, i11, command, c1Var, i12, j11);
    }

    public int hashCode() {
        int hashCode = ((((this.f47261a.hashCode() * 31) + Integer.hashCode(this.f47262b)) * 31) + this.f47263c.hashCode()) * 31;
        c1 c1Var = this.f47264d;
        return ((((hashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31) + Integer.hashCode(this.f47265e)) * 31) + Long.hashCode(this.f47266f);
    }

    public final int i() {
        return this.f47265e;
    }

    @m80.k
    public final String k() {
        return this.f47263c;
    }

    @m80.k
    public final String m() {
        return this.f47261a;
    }

    public final int o() {
        return this.f47262b;
    }

    @m80.l
    public final c1 q() {
        return this.f47264d;
    }

    public final long s() {
        return this.f47266f;
    }

    @m80.k
    public String toString() {
        return "RspMsg(mid=" + this.f47261a + ", msgType=" + this.f47262b + ", command=" + this.f47263c + ", payload=" + this.f47264d + ", code=" + this.f47265e + ", timeStamp=" + this.f47266f + ')';
    }

    public m(@m80.k String mid, int i11, @m80.k String command, @m80.l c1 c1Var, int i12, long j11) {
        g0.p(mid, "mid");
        g0.p(command, "command");
        this.f47261a = mid;
        this.f47262b = i11;
        this.f47263c = command;
        this.f47264d = c1Var;
        this.f47265e = i12;
        this.f47266f = j11;
    }

    @z("code")
    public static /* synthetic */ void j() {
    }

    @z(IntentConstant.COMMAND)
    public static /* synthetic */ void l() {
    }

    @z("mid")
    public static /* synthetic */ void n() {
    }

    @z("type")
    public static /* synthetic */ void p() {
    }

    @a0(with = c5.b.class)
    @z(AssistPushConsts.MSG_TYPE_PAYLOAD)
    public static /* synthetic */ void r() {
    }

    @z(com.alipay.sdk.m.t.a.f11034k)
    public static /* synthetic */ void t() {
    }
}
