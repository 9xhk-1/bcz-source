package d5;

import b5.x0;
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
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;
import w00.o;
import yz.c0;
import yz.e0;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class j {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c0<f50.i<Object>>[] f47252f = {null, null, null, e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: d5.i
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = j.b();
            return b11;
        }
    }), null};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f47253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47254b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f47255c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x0 f47256d;

    /* renamed from: e, reason: collision with root package name */
    public final long f47257e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f47258a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f47258a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.unity.proto.ReqMsg", aVar, 5);
            l2Var.q("mid", false);
            l2Var.q("type", false);
            l2Var.q(IntentConstant.COMMAND, false);
            l2Var.q(AssistPushConsts.MSG_TYPE_PAYLOAD, false);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            c0[] c0VarArr = j.f47252f;
            d3 d3Var = d3.f63348a;
            return new f50.i[]{d3Var, z0.f63517a, d3Var, c0VarArr[3].getValue(), l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final j e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            long j11;
            String str;
            String str2;
            x0 x0Var;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            c0[] c0VarArr = j.f47252f;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                x0Var = (x0) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                str = decodeStringElement;
                i11 = 31;
                str2 = decodeStringElement2;
                i12 = decodeIntElement;
                j11 = beginStructure.decodeLongElement(fVar, 4);
            } else {
                long j12 = 0;
                boolean z11 = true;
                int i13 = 0;
                String str3 = null;
                String str4 = null;
                x0 x0Var2 = null;
                int i14 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str3 = beginStructure.decodeStringElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i14 = beginStructure.decodeIntElement(fVar, 1);
                        i13 |= 2;
                    } else if (decodeElementIndex == 2) {
                        str4 = beginStructure.decodeStringElement(fVar, 2);
                        i13 |= 4;
                    } else if (decodeElementIndex == 3) {
                        x0Var2 = (x0) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), x0Var2);
                        i13 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j12 = beginStructure.decodeLongElement(fVar, 4);
                        i13 |= 16;
                    }
                }
                i11 = i13;
                i12 = i14;
                j11 = j12;
                str = str3;
                str2 = str4;
                x0Var = x0Var2;
            }
            beginStructure.endStructure(fVar);
            return new j(i11, str, i12, str2, x0Var, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k j value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            j.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final f50.i<j> serializer() {
            return a.f47258a;
        }

        public b() {
        }
    }

    public /* synthetic */ j(int i11, String str, int i12, String str2, x0 x0Var, long j11, x2 x2Var) {
        if (31 != (i11 & 31)) {
            h2.b(i11, 31, a.f47258a.a());
        }
        this.f47253a = str;
        this.f47254b = i12;
        this.f47255c = str2;
        this.f47256d = x0Var;
        this.f47257e = j11;
    }

    public static final /* synthetic */ f50.i b() {
        return x0.Companion.serializer();
    }

    public static /* synthetic */ j j(j jVar, String str, int i11, String str2, x0 x0Var, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = jVar.f47253a;
        }
        if ((i12 & 2) != 0) {
            i11 = jVar.f47254b;
        }
        if ((i12 & 4) != 0) {
            str2 = jVar.f47255c;
        }
        if ((i12 & 8) != 0) {
            x0Var = jVar.f47256d;
        }
        if ((i12 & 16) != 0) {
            j11 = jVar.f47257e;
        }
        long j12 = j11;
        return jVar.i(str, i11, str2, x0Var, j12);
    }

    @o
    public static final /* synthetic */ void u(j jVar, i50.e eVar, h50.f fVar) {
        c0<f50.i<Object>>[] c0VarArr = f47252f;
        eVar.encodeStringElement(fVar, 0, jVar.f47253a);
        eVar.encodeIntElement(fVar, 1, jVar.f47254b);
        eVar.encodeStringElement(fVar, 2, jVar.f47255c);
        eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), jVar.f47256d);
        eVar.encodeLongElement(fVar, 4, jVar.f47257e);
    }

    @m80.k
    public final String d() {
        return this.f47253a;
    }

    public final int e() {
        return this.f47254b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f47253a, jVar.f47253a) && this.f47254b == jVar.f47254b && g0.g(this.f47255c, jVar.f47255c) && g0.g(this.f47256d, jVar.f47256d) && this.f47257e == jVar.f47257e;
    }

    @m80.k
    public final String f() {
        return this.f47255c;
    }

    @m80.k
    public final x0 g() {
        return this.f47256d;
    }

    public final long h() {
        return this.f47257e;
    }

    public int hashCode() {
        return (((((((this.f47253a.hashCode() * 31) + Integer.hashCode(this.f47254b)) * 31) + this.f47255c.hashCode()) * 31) + this.f47256d.hashCode()) * 31) + Long.hashCode(this.f47257e);
    }

    @m80.k
    public final j i(@m80.k String mid, int i11, @m80.k String command, @m80.k x0 payload, long j11) {
        g0.p(mid, "mid");
        g0.p(command, "command");
        g0.p(payload, "payload");
        return new j(mid, i11, command, payload, j11);
    }

    @m80.k
    public final String k() {
        return this.f47255c;
    }

    @m80.k
    public final String m() {
        return this.f47253a;
    }

    public final int o() {
        return this.f47254b;
    }

    @m80.k
    public final x0 q() {
        return this.f47256d;
    }

    public final long s() {
        return this.f47257e;
    }

    @m80.k
    public String toString() {
        return "ReqMsg(mid=" + this.f47253a + ", msgType=" + this.f47254b + ", command=" + this.f47255c + ", payload=" + this.f47256d + ", timeStamp=" + this.f47257e + ')';
    }

    public j(@m80.k String mid, int i11, @m80.k String command, @m80.k x0 payload, long j11) {
        g0.p(mid, "mid");
        g0.p(command, "command");
        g0.p(payload, "payload");
        this.f47253a = mid;
        this.f47254b = i11;
        this.f47255c = command;
        this.f47256d = payload;
        this.f47257e = j11;
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

    @z(AssistPushConsts.MSG_TYPE_PAYLOAD)
    public static /* synthetic */ void r() {
    }

    @z(com.alipay.sdk.m.t.a.f11034k)
    public static /* synthetic */ void t() {
    }
}
