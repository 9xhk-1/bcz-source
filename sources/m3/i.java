package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class i {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71937d = {null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.h
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = i.b();
            return b11;
        }
    }), null};

    /* renamed from: a, reason: collision with root package name */
    public final int f71938a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<Long> f71939b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71940c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71941a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71941a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.CollectWord2BooksVo", aVar, 3);
            l2Var.q("topicId", false);
            l2Var.q("bookIds", false);
            l2Var.q("studyBookId", true);
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
            yz.c0[] c0VarArr = i.f71937d;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, c0VarArr[1].getValue(), z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final i e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = i.f71937d;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                list = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                i12 = beginStructure.decodeIntElement(fVar, 2);
                i13 = 7;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i14 = 0;
                List list2 = null;
                int i15 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i14 |= 1;
                    } else if (decodeElementIndex == 1) {
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), list2);
                        i14 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i15 = beginStructure.decodeIntElement(fVar, 2);
                        i14 |= 4;
                    }
                }
                i12 = i15;
                i13 = i14;
                list = list2;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new i(i13, i16, list, i12, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k i value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            i.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<i> serializer() {
            return a.f71941a;
        }

        public b() {
        }
    }

    public /* synthetic */ i(int i11, int i12, List list, int i13, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71941a.a());
        }
        this.f71938a = i12;
        this.f71939b = list;
        if ((i11 & 4) == 0) {
            this.f71940c = 0;
        } else {
            this.f71940c = i13;
        }
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(j50.l1.f63406a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i h(i iVar, int i11, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = iVar.f71938a;
        }
        if ((i13 & 2) != 0) {
            list = iVar.f71939b;
        }
        if ((i13 & 4) != 0) {
            i12 = iVar.f71940c;
        }
        return iVar.g(i11, list, i12);
    }

    @w00.o
    public static final /* synthetic */ void o(i iVar, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71937d;
        eVar.encodeIntElement(fVar, 0, iVar.f71938a);
        eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), iVar.f71939b);
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && iVar.f71940c == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 2, iVar.f71940c);
    }

    public final int d() {
        return this.f71938a;
    }

    @m80.k
    public final List<Long> e() {
        return this.f71939b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f71938a == iVar.f71938a && kotlin.jvm.internal.g0.g(this.f71939b, iVar.f71939b) && this.f71940c == iVar.f71940c;
    }

    public final int f() {
        return this.f71940c;
    }

    @m80.k
    public final i g(int i11, @m80.k List<Long> bookIds, int i12) {
        kotlin.jvm.internal.g0.p(bookIds, "bookIds");
        return new i(i11, bookIds, i12);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f71938a) * 31) + this.f71939b.hashCode()) * 31) + Integer.hashCode(this.f71940c);
    }

    @m80.k
    public final List<Long> i() {
        return this.f71939b;
    }

    public final int k() {
        return this.f71940c;
    }

    public final int m() {
        return this.f71938a;
    }

    @m80.k
    public String toString() {
        return "CollectWord2BooksVo(topicId=" + this.f71938a + ", bookIds=" + this.f71939b + ", studyBookId=" + this.f71940c + ')';
    }

    public i(int i11, @m80.k List<Long> bookIds, int i12) {
        kotlin.jvm.internal.g0.p(bookIds, "bookIds");
        this.f71938a = i11;
        this.f71939b = bookIds;
        this.f71940c = i12;
    }

    public /* synthetic */ i(int i11, List list, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, list, (i13 & 4) != 0 ? 0 : i12);
    }

    @f50.z("bookIds")
    public static /* synthetic */ void j() {
    }

    @f50.z("studyBookId")
    public static /* synthetic */ void l() {
    }

    @f50.z("topicId")
    public static /* synthetic */ void n() {
    }
}
