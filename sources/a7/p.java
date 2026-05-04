package a7;

import a7.e;
import f50.a0;
import j50.h2;
import j50.l2;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class p {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final c0<f50.i<Object>>[] f2178b = {e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: a7.o
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = p.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<e> f2179a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f2180a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f2180a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.lookup.LookUpStore", aVar, 1);
            l2Var.q("history", false);
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
            return new f50.i[]{p.f2178b[0].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final p e(@m80.k i50.f decoder) {
            List list;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            c0[] c0VarArr = p.f2178b;
            int i11 = 1;
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                list = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), list2);
                        i12 = 1;
                    }
                }
                list = list2;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new p(i11, list, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k p value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            p.h(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final f50.i<p> serializer() {
            return a.f2180a;
        }

        public b() {
        }
    }

    public /* synthetic */ p(int i11, List list, x2 x2Var) {
        if (1 != (i11 & 1)) {
            h2.b(i11, 1, a.f2180a.a());
        }
        this.f2179a = list;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(e.a.f2041a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p f(p pVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pVar.f2179a;
        }
        return pVar.e(list);
    }

    @w00.o
    public static final /* synthetic */ void h(p pVar, i50.e eVar, h50.f fVar) {
        eVar.encodeSerializableElement(fVar, 0, f2178b[0].getValue(), pVar.f2179a);
    }

    @m80.k
    public final List<e> d() {
        return this.f2179a;
    }

    @m80.k
    public final p e(@m80.k List<e> history) {
        g0.p(history, "history");
        return new p(history);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && g0.g(this.f2179a, ((p) obj).f2179a);
    }

    @m80.k
    public final List<e> g() {
        return this.f2179a;
    }

    public int hashCode() {
        return this.f2179a.hashCode();
    }

    @m80.k
    public String toString() {
        return "LookUpStore(history=" + this.f2179a + ')';
    }

    public p(@m80.k List<e> history) {
        g0.p(history, "history");
        this.f2179a = history;
    }
}
