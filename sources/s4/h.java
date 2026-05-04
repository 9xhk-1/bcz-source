package s4;

import f50.a0;
import f50.i;
import f50.z;
import j50.h2;
import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;
import m80.k;
import m80.l;
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class h {

    @k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87567a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<h> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f87568a;

        @k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f87568a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.h5enhance.vo.WinningStreakRspH5Vo", aVar, 1);
            l2Var.q("streak", false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @k
        public /* bridge */ i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // j50.p0
        @k
        public final i<?>[] f() {
            return new i[]{j50.i.f63378a};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final h e(@k i50.f decoder) {
            boolean z11;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i11 = 1;
            if (beginStructure.decodeSequentially()) {
                z11 = beginStructure.decodeBooleanElement(fVar, 0);
            } else {
                boolean z12 = true;
                z11 = false;
                int i12 = 0;
                while (z12) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z12 = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        z11 = beginStructure.decodeBooleanElement(fVar, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new h(i11, z11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k i50.h encoder, @k h value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            h.f(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final i<h> serializer() {
            return a.f87568a;
        }

        public b() {
        }
    }

    public /* synthetic */ h(int i11, boolean z11, x2 x2Var) {
        if (1 != (i11 & 1)) {
            h2.b(i11, 1, a.f87568a.a());
        }
        this.f87567a = z11;
    }

    public static /* synthetic */ h c(h hVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = hVar.f87567a;
        }
        return hVar.b(z11);
    }

    @o
    public static final /* synthetic */ void f(h hVar, i50.e eVar, h50.f fVar) {
        eVar.encodeBooleanElement(fVar, 0, hVar.f87567a);
    }

    public final boolean a() {
        return this.f87567a;
    }

    @k
    public final h b(boolean z11) {
        return new h(z11);
    }

    public final boolean d() {
        return this.f87567a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f87567a == ((h) obj).f87567a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f87567a);
    }

    @k
    public String toString() {
        return "WinningStreakRspH5Vo(streak=" + this.f87567a + ')';
    }

    public h(boolean z11) {
        this.f87567a = z11;
    }

    @z("streak")
    public static /* synthetic */ void e() {
    }
}
