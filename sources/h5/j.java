package h5;

import j50.d3;
import j50.h2;
import j50.l2;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class j {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f58351g = {null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: h5.i
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = j.b();
            return b11;
        }
    }), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final int f58352a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f58353b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f58354c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Integer> f58355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58356e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58357f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58358a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58358a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.GameBook", aVar, 6);
            l2Var.q("bookId", false);
            l2Var.q("bookName", false);
            l2Var.q("bookImg", false);
            l2Var.q("modeList", false);
            l2Var.q("wordsCountPerGame", false);
            l2Var.q("premium", true);
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
            yz.c0[] c0VarArr = j.f58351g;
            j50.z0 z0Var = j50.z0.f63517a;
            d3 d3Var = d3.f63348a;
            return new f50.i[]{z0Var, d3Var, d3Var, c0VarArr[3].getValue(), z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final j e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            String str;
            String str2;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = j.f58351g;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 2);
                List list2 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 4);
                list = list2;
                i12 = beginStructure.decodeIntElement(fVar, 5);
                i13 = decodeIntElement;
                str2 = decodeStringElement2;
                i14 = 63;
                str = decodeStringElement;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i15 = 0;
                int i16 = 0;
                String str3 = null;
                String str4 = null;
                List list3 = null;
                int i17 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            i11 = beginStructure.decodeIntElement(fVar, 0);
                            i16 |= 1;
                            continue;
                        case 1:
                            str3 = beginStructure.decodeStringElement(fVar, 1);
                            i16 |= 2;
                            break;
                        case 2:
                            str4 = beginStructure.decodeStringElement(fVar, 2);
                            i16 |= 4;
                            break;
                        case 3:
                            list3 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), list3);
                            i16 |= 8;
                            break;
                        case 4:
                            i15 = beginStructure.decodeIntElement(fVar, 4);
                            i16 |= 16;
                            break;
                        case 5:
                            i17 = beginStructure.decodeIntElement(fVar, 5);
                            i16 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i12 = i17;
                i13 = i15;
                i14 = i16;
                str = str3;
                str2 = str4;
                list = list3;
            }
            int i18 = i11;
            beginStructure.endStructure(fVar);
            return new j(i14, i18, str, str2, list, i13, i12, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k j value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            j.x(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<j> serializer() {
            return a.f58358a;
        }

        public b() {
        }
    }

    public /* synthetic */ j(int i11, int i12, String str, String str2, List list, int i13, int i14, x2 x2Var) {
        if (31 != (i11 & 31)) {
            h2.b(i11, 31, a.f58358a.a());
        }
        this.f58352a = i12;
        this.f58353b = str;
        this.f58354c = str2;
        this.f58355d = list;
        this.f58356e = i13;
        if ((i11 & 32) == 0) {
            this.f58357f = 0;
        } else {
            this.f58357f = i14;
        }
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(j50.z0.f63517a);
    }

    public static /* synthetic */ j k(j jVar, int i11, String str, String str2, List list, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = jVar.f58352a;
        }
        if ((i14 & 2) != 0) {
            str = jVar.f58353b;
        }
        if ((i14 & 4) != 0) {
            str2 = jVar.f58354c;
        }
        if ((i14 & 8) != 0) {
            list = jVar.f58355d;
        }
        if ((i14 & 16) != 0) {
            i12 = jVar.f58356e;
        }
        if ((i14 & 32) != 0) {
            i13 = jVar.f58357f;
        }
        int i15 = i12;
        int i16 = i13;
        return jVar.j(i11, str, str2, list, i15, i16);
    }

    @w00.o
    public static final /* synthetic */ void x(j jVar, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f58351g;
        eVar.encodeIntElement(fVar, 0, jVar.f58352a);
        eVar.encodeStringElement(fVar, 1, jVar.f58353b);
        eVar.encodeStringElement(fVar, 2, jVar.f58354c);
        eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), jVar.f58355d);
        eVar.encodeIntElement(fVar, 4, jVar.f58356e);
        if (!eVar.shouldEncodeElementDefault(fVar, 5) && jVar.f58357f == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 5, jVar.f58357f);
    }

    public final int d() {
        return this.f58352a;
    }

    @m80.k
    public final String e() {
        return this.f58353b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f58352a == jVar.f58352a && kotlin.jvm.internal.g0.g(this.f58353b, jVar.f58353b) && kotlin.jvm.internal.g0.g(this.f58354c, jVar.f58354c) && kotlin.jvm.internal.g0.g(this.f58355d, jVar.f58355d) && this.f58356e == jVar.f58356e && this.f58357f == jVar.f58357f;
    }

    @m80.k
    public final String f() {
        return this.f58354c;
    }

    @m80.k
    public final List<Integer> g() {
        return this.f58355d;
    }

    public final int h() {
        return this.f58356e;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f58352a) * 31) + this.f58353b.hashCode()) * 31) + this.f58354c.hashCode()) * 31) + this.f58355d.hashCode()) * 31) + Integer.hashCode(this.f58356e)) * 31) + Integer.hashCode(this.f58357f);
    }

    public final int i() {
        return this.f58357f;
    }

    @m80.k
    public final j j(int i11, @m80.k String bookName, @m80.k String bookImg, @m80.k List<Integer> modeList, int i12, int i13) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        kotlin.jvm.internal.g0.p(modeList, "modeList");
        return new j(i11, bookName, bookImg, modeList, i12, i13);
    }

    public final int l() {
        return this.f58352a;
    }

    @m80.k
    public final String n() {
        return this.f58354c;
    }

    @m80.k
    public final String p() {
        return this.f58353b;
    }

    @m80.k
    public final List<Integer> r() {
        return this.f58355d;
    }

    public final int t() {
        return this.f58357f;
    }

    @m80.k
    public String toString() {
        return "GameBook(bookId=" + this.f58352a + ", bookName=" + this.f58353b + ", bookImg=" + this.f58354c + ", modeList=" + this.f58355d + ", wordsCountPerGame=" + this.f58356e + ", premium=" + this.f58357f + ')';
    }

    public final int v() {
        return this.f58356e;
    }

    public j(int i11, @m80.k String bookName, @m80.k String bookImg, @m80.k List<Integer> modeList, int i12, int i13) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        kotlin.jvm.internal.g0.p(modeList, "modeList");
        this.f58352a = i11;
        this.f58353b = bookName;
        this.f58354c = bookImg;
        this.f58355d = modeList;
        this.f58356e = i12;
        this.f58357f = i13;
    }

    public /* synthetic */ j(int i11, String str, String str2, List list, int i12, int i13, int i14, kotlin.jvm.internal.v vVar) {
        this(i11, str, str2, list, i12, (i14 & 32) != 0 ? 0 : i13);
    }

    @f50.z("bookId")
    public static /* synthetic */ void m() {
    }

    @f50.z("bookImg")
    public static /* synthetic */ void o() {
    }

    @f50.z("bookName")
    public static /* synthetic */ void q() {
    }

    @f50.z("modeList")
    public static /* synthetic */ void s() {
    }

    @f50.z("premium")
    public static /* synthetic */ void u() {
    }

    @f50.z("wordsCountPerGame")
    public static /* synthetic */ void w() {
    }
}
