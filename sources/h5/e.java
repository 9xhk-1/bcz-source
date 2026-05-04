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
public final class e {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f58332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58334c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58335a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58335a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.Compass", aVar, 3);
            l2Var.q("bookId", false);
            l2Var.q("balance", false);
            l2Var.q("consumed", false);
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
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{l1.f63406a, z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final e e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            long j11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                i11 = beginStructure.decodeIntElement(fVar, 1);
                i12 = beginStructure.decodeIntElement(fVar, 2);
                i13 = 7;
                j11 = decodeLongElement;
            } else {
                boolean z11 = true;
                i11 = 0;
                long j12 = 0;
                int i14 = 0;
                int i15 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        j12 = beginStructure.decodeLongElement(fVar, 0);
                        i15 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i11 = beginStructure.decodeIntElement(fVar, 1);
                        i15 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i14 = beginStructure.decodeIntElement(fVar, 2);
                        i15 |= 4;
                    }
                }
                i12 = i14;
                i13 = i15;
                j11 = j12;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new e(i13, j11, i16, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k e value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            e.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<e> serializer() {
            return a.f58335a;
        }

        public b() {
        }
    }

    public /* synthetic */ e(int i11, long j11, int i12, int i13, x2 x2Var) {
        if (7 != (i11 & 7)) {
            h2.b(i11, 7, a.f58335a.a());
        }
        this.f58332a = j11;
        this.f58333b = i12;
        this.f58334c = i13;
    }

    public static /* synthetic */ e e(e eVar, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = eVar.f58332a;
        }
        if ((i13 & 2) != 0) {
            i11 = eVar.f58333b;
        }
        if ((i13 & 4) != 0) {
            i12 = eVar.f58334c;
        }
        return eVar.d(j11, i11, i12);
    }

    @w00.o
    public static final /* synthetic */ void l(e eVar, i50.e eVar2, h50.f fVar) {
        eVar2.encodeLongElement(fVar, 0, eVar.f58332a);
        eVar2.encodeIntElement(fVar, 1, eVar.f58333b);
        eVar2.encodeIntElement(fVar, 2, eVar.f58334c);
    }

    public final long a() {
        return this.f58332a;
    }

    public final int b() {
        return this.f58333b;
    }

    public final int c() {
        return this.f58334c;
    }

    @m80.k
    public final e d(long j11, int i11, int i12) {
        return new e(j11, i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f58332a == eVar.f58332a && this.f58333b == eVar.f58333b && this.f58334c == eVar.f58334c;
    }

    public final int f() {
        return this.f58333b;
    }

    public final long h() {
        return this.f58332a;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f58332a) * 31) + Integer.hashCode(this.f58333b)) * 31) + Integer.hashCode(this.f58334c);
    }

    public final int j() {
        return this.f58334c;
    }

    @m80.k
    public String toString() {
        return "Compass(bookId=" + this.f58332a + ", balance=" + this.f58333b + ", consumed=" + this.f58334c + ')';
    }

    public e(long j11, int i11, int i12) {
        this.f58332a = j11;
        this.f58333b = i11;
        this.f58334c = i12;
    }

    @f50.z("balance")
    public static /* synthetic */ void g() {
    }

    @f50.z("bookId")
    public static /* synthetic */ void i() {
    }

    @f50.z("consumed")
    public static /* synthetic */ void k() {
    }
}
