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
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class b {

    @k
    public static final C1128b Companion = new C1128b(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87546a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f87547a;

        @k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f87547a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.h5enhance.vo.CheckResourceRspH5Vo", aVar, 1);
            l2Var.q("result", false);
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
        public final b e(@k i50.f decoder) {
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
            return new b(i11, z11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k i50.h encoder, @k b value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            b.c(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: s4.b$b, reason: collision with other inner class name */
    public static final class C1128b {
        public /* synthetic */ C1128b(v vVar) {
            this();
        }

        @k
        public final i<b> serializer() {
            return a.f87547a;
        }

        public C1128b() {
        }
    }

    public /* synthetic */ b(int i11, boolean z11, x2 x2Var) {
        if (1 != (i11 & 1)) {
            h2.b(i11, 1, a.f87547a.a());
        }
        this.f87546a = z11;
    }

    @o
    public static final /* synthetic */ void c(b bVar, i50.e eVar, h50.f fVar) {
        eVar.encodeBooleanElement(fVar, 0, bVar.f87546a);
    }

    public final boolean a() {
        return this.f87546a;
    }

    public b(boolean z11) {
        this.f87546a = z11;
    }

    @z("result")
    public static /* synthetic */ void b() {
    }
}
