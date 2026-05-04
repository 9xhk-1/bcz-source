package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class v1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f72096a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f72097b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72098c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f72099d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<v1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72100a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72100a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.UserBookInfoModel", aVar, 4);
            l2Var.q("userBookId", false);
            l2Var.q("name", false);
            l2Var.q("wordCount", false);
            l2Var.q("cover", false);
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
            d3 d3Var = d3.f63348a;
            return new f50.i[]{j50.l1.f63406a, d3Var, j50.z0.f63517a, d3Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final v1 e(@m80.k i50.f decoder) {
            String str;
            String str2;
            int i11;
            int i12;
            long j11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 0);
                str = beginStructure.decodeStringElement(fVar, 1);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 2);
                str2 = beginStructure.decodeStringElement(fVar, 3);
                i11 = decodeIntElement;
                i12 = 15;
                j11 = decodeLongElement;
            } else {
                str = null;
                boolean z11 = true;
                int i13 = 0;
                long j12 = 0;
                String str3 = null;
                int i14 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        j12 = beginStructure.decodeLongElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str = beginStructure.decodeStringElement(fVar, 1);
                        i13 |= 2;
                    } else if (decodeElementIndex == 2) {
                        i14 = beginStructure.decodeIntElement(fVar, 2);
                        i13 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str3 = beginStructure.decodeStringElement(fVar, 3);
                        i13 |= 8;
                    }
                }
                str2 = str3;
                i11 = i14;
                i12 = i13;
                j11 = j12;
            }
            String str4 = str;
            beginStructure.endStructure(fVar);
            return new v1(i12, j11, str4, i11, str2, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k v1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            v1.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<v1> serializer() {
            return a.f72100a;
        }

        public b() {
        }
    }

    public /* synthetic */ v1(int i11, long j11, String str, int i12, String str2, x2 x2Var) {
        if (15 != (i11 & 15)) {
            j50.h2.b(i11, 15, a.f72100a.a());
        }
        this.f72096a = j11;
        this.f72097b = str;
        this.f72098c = i12;
        this.f72099d = str2;
    }

    public static /* synthetic */ v1 f(v1 v1Var, long j11, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = v1Var.f72096a;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = v1Var.f72097b;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            i11 = v1Var.f72098c;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str2 = v1Var.f72099d;
        }
        return v1Var.e(j12, str3, i13, str2);
    }

    @w00.o
    public static final /* synthetic */ void o(v1 v1Var, i50.e eVar, h50.f fVar) {
        eVar.encodeLongElement(fVar, 0, v1Var.f72096a);
        eVar.encodeStringElement(fVar, 1, v1Var.f72097b);
        eVar.encodeIntElement(fVar, 2, v1Var.f72098c);
        eVar.encodeStringElement(fVar, 3, v1Var.f72099d);
    }

    public final long a() {
        return this.f72096a;
    }

    @m80.k
    public final String b() {
        return this.f72097b;
    }

    public final int c() {
        return this.f72098c;
    }

    @m80.k
    public final String d() {
        return this.f72099d;
    }

    @m80.k
    public final v1 e(long j11, @m80.k String name, int i11, @m80.k String cover) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        return new v1(j11, name, i11, cover);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f72096a == v1Var.f72096a && kotlin.jvm.internal.g0.g(this.f72097b, v1Var.f72097b) && this.f72098c == v1Var.f72098c && kotlin.jvm.internal.g0.g(this.f72099d, v1Var.f72099d);
    }

    @m80.k
    public final String g() {
        return this.f72099d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f72096a) * 31) + this.f72097b.hashCode()) * 31) + Integer.hashCode(this.f72098c)) * 31) + this.f72099d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f72097b;
    }

    public final long k() {
        return this.f72096a;
    }

    public final int m() {
        return this.f72098c;
    }

    @m80.k
    public String toString() {
        return "UserBookInfoModel(userBookId=" + this.f72096a + ", name=" + this.f72097b + ", wordCount=" + this.f72098c + ", cover=" + this.f72099d + ')';
    }

    public v1(long j11, @m80.k String name, int i11, @m80.k String cover) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        this.f72096a = j11;
        this.f72097b = name;
        this.f72098c = i11;
        this.f72099d = cover;
    }

    @f50.z("cover")
    public static /* synthetic */ void h() {
    }

    @f50.z("name")
    public static /* synthetic */ void j() {
    }

    @f50.z("userBookId")
    public static /* synthetic */ void l() {
    }

    @f50.z("wordCount")
    public static /* synthetic */ void n() {
    }
}
