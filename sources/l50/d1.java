package l50;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n517#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l50.a f69957a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69958b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69959c;

    /* renamed from: d, reason: collision with root package name */
    public int f69960d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {0}, l = {115}, m = "invokeSuspend", n = {"$this$DeepRecursiveFunction"}, s = {"L$0"})
    public static final class a extends RestrictedSuspendLambda implements x00.q<yz.l<g2, k50.k>, g2, j00.c<? super k50.k>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f69961a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f69962b;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz.l<g2, k50.k> lVar, g2 g2Var, j00.c<? super k50.k> cVar) {
            a aVar = d1.this.new a(cVar);
            aVar.f69962b = lVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yz.l lVar = (yz.l) this.f69962b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f69961a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                byte O = d1.this.f69957a.O();
                if (O == 1) {
                    return d1.this.k(true);
                }
                if (O == 0) {
                    return d1.this.k(false);
                }
                if (O != 6) {
                    if (O == 8) {
                        return d1.this.f();
                    }
                    l50.a.B(d1.this.f69957a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                d1 d1Var = d1.this;
                this.f69962b = l00.k.a(lVar);
                this.f69961a = 1;
                obj = d1Var.h(lVar, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return (k50.k) obj;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {24}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv", "$i$f$readObjectImpl", "lastToken$iv", "$i$a$-readObjectImpl-JsonTreeReader$readObject$3"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "B$0", "I$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69964a;

        /* renamed from: b, reason: collision with root package name */
        public Object f69965b;

        /* renamed from: c, reason: collision with root package name */
        public Object f69966c;

        /* renamed from: d, reason: collision with root package name */
        public Object f69967d;

        /* renamed from: e, reason: collision with root package name */
        public int f69968e;

        /* renamed from: f, reason: collision with root package name */
        public int f69969f;

        /* renamed from: g, reason: collision with root package name */
        public byte f69970g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f69971h;

        /* renamed from: j, reason: collision with root package name */
        public int f69973j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69971h = obj;
            this.f69973j |= Integer.MIN_VALUE;
            return d1.this.h(null, this);
        }
    }

    public d1(@m80.k k50.g configuration, @m80.k l50.a lexer) {
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        kotlin.jvm.internal.g0.p(lexer, "lexer");
        this.f69957a = lexer;
        this.f69958b = configuration.w();
        this.f69959c = configuration.e();
    }

    @m80.k
    public final k50.k e() {
        byte O = this.f69957a.O();
        if (O == 1) {
            return k(true);
        }
        if (O == 0) {
            return k(false);
        }
        if (O == 6) {
            int i11 = this.f69960d + 1;
            this.f69960d = i11;
            this.f69960d--;
            return i11 == 200 ? g() : i();
        }
        if (O == 8) {
            return f();
        }
        l50.a.B(this.f69957a, "Cannot read Json element because of unexpected " + l50.b.c(O), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final k50.k f() {
        byte l11 = this.f69957a.l();
        if (this.f69957a.O() == 4) {
            l50.a.B(this.f69957a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f69957a.f()) {
            arrayList.add(e());
            l11 = this.f69957a.l();
            if (l11 != 4) {
                l50.a aVar = this.f69957a;
                boolean z11 = l11 == 9;
                int i11 = aVar.f69912a;
                if (!z11) {
                    l50.a.B(aVar, "Expected end of the array or comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (l11 == 8) {
            this.f69957a.m((byte) 9);
        } else if (l11 == 4) {
            if (!this.f69959c) {
                i0.g(this.f69957a, "array");
                throw new KotlinNothingValueException();
            }
            this.f69957a.m((byte) 9);
        }
        return new k50.b(arrayList);
    }

    public final k50.k g() {
        return (k50.k) kotlin.a.b(new yz.k(new a(null)), g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a6 -> B:10:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(yz.l<yz.g2, k50.k> r22, j00.c<? super k50.k> r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.d1.h(yz.l, j00.c):java.lang.Object");
    }

    public final k50.k i() {
        byte m11 = this.f69957a.m((byte) 6);
        if (this.f69957a.O() == 4) {
            l50.a.B(this.f69957a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f69957a.f()) {
                break;
            }
            String u11 = this.f69958b ? this.f69957a.u() : this.f69957a.r();
            this.f69957a.m((byte) 5);
            linkedHashMap.put(u11, e());
            m11 = this.f69957a.l();
            if (m11 != 4) {
                if (m11 != 7) {
                    l50.a.B(this.f69957a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (m11 == 6) {
            this.f69957a.m((byte) 7);
        } else if (m11 == 4) {
            if (!this.f69959c) {
                i0.h(this.f69957a, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f69957a.m((byte) 7);
        }
        return new k50.i0(linkedHashMap);
    }

    public final k50.i0 j(x00.a<? extends k50.k> aVar) {
        byte m11 = this.f69957a.m((byte) 6);
        if (this.f69957a.O() == 4) {
            l50.a.B(this.f69957a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f69957a.f()) {
                break;
            }
            String u11 = this.f69958b ? this.f69957a.u() : this.f69957a.r();
            this.f69957a.m((byte) 5);
            linkedHashMap.put(u11, aVar.invoke());
            m11 = this.f69957a.l();
            if (m11 != 4) {
                if (m11 != 7) {
                    l50.a.B(this.f69957a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (m11 == 6) {
            this.f69957a.m((byte) 7);
        } else if (m11 == 4) {
            if (!this.f69959c) {
                i0.h(this.f69957a, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f69957a.m((byte) 7);
        }
        return new k50.i0(linkedHashMap);
    }

    public final k50.l0 k(boolean z11) {
        String u11 = (this.f69958b || !z11) ? this.f69957a.u() : this.f69957a.r();
        return (z11 || !kotlin.jvm.internal.g0.g(u11, "null")) ? new k50.b0(u11, z11, null, 4, null) : k50.f0.INSTANCE;
    }
}
