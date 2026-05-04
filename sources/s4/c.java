package s4;

import f50.a0;
import f50.i;
import f50.z;
import j50.d3;
import j50.h2;
import j50.l2;
import j50.p0;
import j50.x2;
import j50.z0;
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
public final class c<T> {

    @k
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public static final h50.f f87548d;

    /* renamed from: a, reason: collision with root package name */
    public final int f87549a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f87550b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final T f87551c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a<T> implements p0<c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<?> f87552a;

        @k
        private final h50.f descriptor;

        public a() {
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.h5enhance.vo.H5ApiRsp", this, 3);
            l2Var.q("code", false);
            l2Var.q("message", true);
            l2Var.q("data", true);
            this.descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final h50.f a() {
            return this.descriptor;
        }

        @Override // j50.p0
        @k
        public final i<?>[] c() {
            return new i[]{this.f87552a};
        }

        @Override // j50.p0
        @k
        public final i<?>[] f() {
            return new i[]{z0.f63517a, g50.a.v(d3.f63348a), g50.a.v(this.f87552a)};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final c<T> e(@k i50.f decoder) {
            int i11;
            int i12;
            String str;
            Object obj;
            g0.p(decoder, "decoder");
            h50.f fVar = this.descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String str2 = (String) beginStructure.decodeNullableSerializableElement(fVar, 1, d3.f63348a, null);
                obj = beginStructure.decodeNullableSerializableElement(fVar, 2, this.f87552a, null);
                str = str2;
                i12 = 7;
            } else {
                boolean z11 = true;
                i11 = 0;
                String str3 = null;
                Object obj2 = null;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str3 = (String) beginStructure.decodeNullableSerializableElement(fVar, 1, d3.f63348a, str3);
                        i13 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        obj2 = beginStructure.decodeNullableSerializableElement(fVar, 2, this.f87552a, obj2);
                        i13 |= 4;
                    }
                }
                i12 = i13;
                str = str3;
                obj = obj2;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new c<>(i12, i14, str, obj, (x2) null);
        }

        public final /* synthetic */ i h() {
            return this.f87552a;
        }

        @Override // f50.b0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final void b(@k i50.h encoder, @k c<T> value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = this.descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            c.l(value, beginStructure, fVar, this.f87552a);
            beginStructure.endStructure(fVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@k i<T> typeSerial0) {
            this();
            g0.p(typeSerial0, "typeSerial0");
            this.f87552a = typeSerial0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final <T> i<c<T>> serializer(@k i<T> typeSerial0) {
            g0.p(typeSerial0, "typeSerial0");
            return new a(typeSerial0);
        }

        public b() {
        }
    }

    static {
        l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.h5enhance.vo.H5ApiRsp", null, 3);
        l2Var.q("code", false);
        l2Var.q("message", true);
        l2Var.q("data", true);
        f87548d = l2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(int i11, int i12, String str, Object obj, x2 x2Var) {
        if (1 != (i11 & 1)) {
            h2.b(i11, 1, f87548d);
        }
        this.f87549a = i12;
        if ((i11 & 2) == 0) {
            this.f87550b = null;
        } else {
            this.f87550b = str;
        }
        if ((i11 & 4) == 0) {
            this.f87551c = null;
        } else {
            this.f87551c = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c e(c cVar, int i11, String str, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f87549a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f87550b;
        }
        if ((i12 & 4) != 0) {
            obj = cVar.f87551c;
        }
        return cVar.d(i11, str, obj);
    }

    @o
    public static final /* synthetic */ void l(c cVar, i50.e eVar, h50.f fVar, i iVar) {
        eVar.encodeIntElement(fVar, 0, cVar.f87549a);
        if (eVar.shouldEncodeElementDefault(fVar, 1) || cVar.f87550b != null) {
            eVar.encodeNullableSerializableElement(fVar, 1, d3.f63348a, cVar.f87550b);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && cVar.f87551c == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 2, iVar, cVar.f87551c);
    }

    public final int a() {
        return this.f87549a;
    }

    @l
    public final String b() {
        return this.f87550b;
    }

    @l
    public final T c() {
        return this.f87551c;
    }

    @k
    public final c<T> d(int i11, @l String str, @l T t11) {
        return new c<>(i11, str, t11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f87549a == cVar.f87549a && g0.g(this.f87550b, cVar.f87550b) && g0.g(this.f87551c, cVar.f87551c);
    }

    public final int f() {
        return this.f87549a;
    }

    @l
    public final T h() {
        return this.f87551c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f87549a) * 31;
        String str = this.f87550b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t11 = this.f87551c;
        return hashCode2 + (t11 != null ? t11.hashCode() : 0);
    }

    @l
    public final String j() {
        return this.f87550b;
    }

    @k
    public String toString() {
        return "H5ApiRsp(code=" + this.f87549a + ", message=" + this.f87550b + ", data=" + this.f87551c + ')';
    }

    public c(int i11, @l String str, @l T t11) {
        this.f87549a = i11;
        this.f87550b = str;
        this.f87551c = t11;
    }

    public /* synthetic */ c(int i11, String str, Object obj, int i12, v vVar) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : obj);
    }

    @z("code")
    public static /* synthetic */ void g() {
    }

    @z("data")
    public static /* synthetic */ void i() {
    }

    @z("message")
    public static /* synthetic */ void k() {
    }
}
