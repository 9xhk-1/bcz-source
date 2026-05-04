package h5;

import j50.h2;
import j50.l1;
import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class v0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f58463a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<v0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58464a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58464a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.UnlimitedEnergy", aVar, 1);
            l2Var.q("unlimitedEnergyEndTime", false);
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
            return new f50.i[]{l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final v0 e(@m80.k i50.f decoder) {
            long j11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i11 = 1;
            if (beginStructure.decodeSequentially()) {
                j11 = beginStructure.decodeLongElement(fVar, 0);
            } else {
                long j12 = 0;
                boolean z11 = true;
                int i12 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j12 = beginStructure.decodeLongElement(fVar, 0);
                        i12 = 1;
                    }
                }
                j11 = j12;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new v0(i11, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k v0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            v0.e(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<v0> serializer() {
            return a.f58464a;
        }

        public b() {
        }
    }

    public /* synthetic */ v0(int i11, long j11, x2 x2Var) {
        if (1 != (i11 & 1)) {
            h2.b(i11, 1, a.f58464a.a());
        }
        this.f58463a = j11;
    }

    public static /* synthetic */ v0 c(v0 v0Var, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = v0Var.f58463a;
        }
        return v0Var.b(j11);
    }

    @w00.o
    public static final /* synthetic */ void e(v0 v0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeLongElement(fVar, 0, v0Var.f58463a);
    }

    public final long a() {
        return this.f58463a;
    }

    @m80.k
    public final v0 b(long j11) {
        return new v0(j11);
    }

    public final long d() {
        return this.f58463a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && this.f58463a == ((v0) obj).f58463a;
    }

    public int hashCode() {
        return Long.hashCode(this.f58463a);
    }

    @m80.k
    public String toString() {
        return "UnlimitedEnergy(unlimitedEnergyEndTime=" + this.f58463a + ')';
    }

    public v0(long j11) {
        this.f58463a = j11;
    }
}
