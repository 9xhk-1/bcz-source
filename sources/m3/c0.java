package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class c0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71875a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f71876b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<c0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71877a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71877a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.LogReqVo", aVar, 2);
            l2Var.q("logType", false);
            l2Var.q("msg", false);
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
            return new f50.i[]{j50.z0.f63517a, d3.f63348a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final c0 e(@m80.k i50.f decoder) {
            int i11;
            String str;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                str = beginStructure.decodeStringElement(fVar, 1);
                i12 = 3;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i13 = 0;
                String str2 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str2 = beginStructure.decodeStringElement(fVar, 1);
                        i13 |= 2;
                    }
                }
                str = str2;
                i12 = i13;
            }
            beginStructure.endStructure(fVar);
            return new c0(i12, i11, str, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k c0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            c0.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<c0> serializer() {
            return a.f71877a;
        }

        public b() {
        }
    }

    public /* synthetic */ c0(int i11, int i12, String str, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71877a.a());
        }
        this.f71875a = i12;
        this.f71876b = str;
    }

    public static /* synthetic */ c0 d(c0 c0Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = c0Var.f71875a;
        }
        if ((i12 & 2) != 0) {
            str = c0Var.f71876b;
        }
        return c0Var.c(i11, str);
    }

    @w00.o
    public static final /* synthetic */ void i(c0 c0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, c0Var.f71875a);
        eVar.encodeStringElement(fVar, 1, c0Var.f71876b);
    }

    public final int a() {
        return this.f71875a;
    }

    @m80.k
    public final String b() {
        return this.f71876b;
    }

    @m80.k
    public final c0 c(int i11, @m80.k String msg) {
        kotlin.jvm.internal.g0.p(msg, "msg");
        return new c0(i11, msg);
    }

    public final int e() {
        return this.f71875a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f71875a == c0Var.f71875a && kotlin.jvm.internal.g0.g(this.f71876b, c0Var.f71876b);
    }

    @m80.k
    public final String g() {
        return this.f71876b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71875a) * 31) + this.f71876b.hashCode();
    }

    @m80.k
    public String toString() {
        return "LogReqVo(logType=" + this.f71875a + ", msg=" + this.f71876b + ')';
    }

    public c0(int i11, @m80.k String msg) {
        kotlin.jvm.internal.g0.p(msg, "msg");
        this.f71875a = i11;
        this.f71876b = msg;
    }

    @f50.z("logType")
    public static /* synthetic */ void f() {
    }

    @f50.z("msg")
    public static /* synthetic */ void h() {
    }
}
