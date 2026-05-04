package r7;

import f50.a0;
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
public final class a {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f83333a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83334b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83335c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: r7.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1036a implements p0<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C1036a f83336a;

        @m80.k
        private static final h50.f descriptor;

        static {
            C1036a c1036a = new C1036a();
            f83336a = c1036a;
            l2 l2Var = new l2("com.baicizhan.app.biz.userbook.repo.BookListRecord", c1036a, 3);
            l2Var.q("maxLimit", false);
            l2Var.q("copperLimit", false);
            l2Var.q("localVersion", false);
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
            z0 z0Var = z0.f63517a;
            return new f50.i[]{z0Var, z0Var, l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final a e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            long j11;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                i12 = 7;
                i13 = beginStructure.decodeIntElement(fVar, 1);
                j11 = beginStructure.decodeLongElement(fVar, 2);
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
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i14 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i15 = beginStructure.decodeIntElement(fVar, 1);
                        i14 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j12 = beginStructure.decodeLongElement(fVar, 2);
                        i14 |= 4;
                    }
                }
                i12 = i14;
                i13 = i15;
                j11 = j12;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new a(i12, i16, i13, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k a value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            a.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final f50.i<a> serializer() {
            return C1036a.f83336a;
        }

        public b() {
        }
    }

    public /* synthetic */ a(int i11, int i12, int i13, long j11, x2 x2Var) {
        if (7 != (i11 & 7)) {
            h2.b(i11, 7, C1036a.f83336a.a());
        }
        this.f83333a = i12;
        this.f83334b = i13;
        this.f83335c = j11;
    }

    public static /* synthetic */ a e(a aVar, int i11, int i12, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aVar.f83333a;
        }
        if ((i13 & 2) != 0) {
            i12 = aVar.f83334b;
        }
        if ((i13 & 4) != 0) {
            j11 = aVar.f83335c;
        }
        return aVar.d(i11, i12, j11);
    }

    @o
    public static final /* synthetic */ void i(a aVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, aVar.f83333a);
        eVar.encodeIntElement(fVar, 1, aVar.f83334b);
        eVar.encodeLongElement(fVar, 2, aVar.f83335c);
    }

    public final int a() {
        return this.f83333a;
    }

    public final int b() {
        return this.f83334b;
    }

    public final long c() {
        return this.f83335c;
    }

    @m80.k
    public final a d(int i11, int i12, long j11) {
        return new a(i11, i12, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f83333a == aVar.f83333a && this.f83334b == aVar.f83334b && this.f83335c == aVar.f83335c;
    }

    public final int f() {
        return this.f83334b;
    }

    public final long g() {
        return this.f83335c;
    }

    public final int h() {
        return this.f83333a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f83333a) * 31) + Integer.hashCode(this.f83334b)) * 31) + Long.hashCode(this.f83335c);
    }

    @m80.k
    public String toString() {
        return "BookListRecord(maxLimit=" + this.f83333a + ", copperLimit=" + this.f83334b + ", localVersion=" + this.f83335c + ')';
    }

    public a(int i11, int i12, long j11) {
        this.f83333a = i11;
        this.f83334b = i12;
        this.f83335c = j11;
    }
}
