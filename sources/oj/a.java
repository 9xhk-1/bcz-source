package oj;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.l3;
import c40.m0;
import c40.r0;
import com.baicizhan.client.business.dataset.provider.a;
import ij.q;
import ij.z;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import m80.k;
import x00.l;
import x00.p;
import yg.a0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class a implements wf.b {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f77044f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f77045g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f77046h = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final q f77047a;

    /* renamed from: b, reason: collision with root package name */
    public final long f77048b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r0 f77049c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m0 f77050d;

    /* renamed from: e, reason: collision with root package name */
    public List<z> f77051e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.learning.FavoritesLearningImpl$1", f = "FavoritesLearningImpl.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: oj.a$a, reason: collision with other inner class name */
    public static final class C0941a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f77052a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: oj.a$a$a, reason: collision with other inner class name */
        public static final class C0942a<T> implements j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f77054a;

            public C0942a(a aVar) {
                this.f77054a = aVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<z> list, j00.c<? super g2> cVar) {
                qb.c.b(a.f77046h, "words init", new Object[0]);
                if (this.f77054a.f77051e != null) {
                    List list2 = this.f77054a.f77051e;
                    List list3 = null;
                    if (list2 == null) {
                        g0.S("currentWords");
                        list2 = null;
                    }
                    list2.clear();
                    List list4 = this.f77054a.f77051e;
                    if (list4 == null) {
                        g0.S("currentWords");
                    } else {
                        list3 = list4;
                    }
                    l00.a.a(list3.addAll(list));
                } else {
                    this.f77054a.f77051e = a00.r0.d6(list);
                }
                return g2.f100423a;
            }
        }

        public C0941a(j00.c<? super C0941a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new C0941a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C0941a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f77052a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i<List<z>> b11 = a.this.f77047a.b(a.this.f77048b);
                C0942a c0942a = new C0942a(a.this);
                this.f77052a = 1;
                if (b11.collect(c0942a, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.learning.FavoritesLearningImpl$answer$1", f = "FavoritesLearningImpl.kt", i = {0, 0}, l = {63}, m = "invokeSuspend", n = {"it", "$i$a$-let-FavoritesLearningImpl$answer$1$2"}, s = {"L$0", "I$0"}, v = 1)
    @u0({"SMAP\nFavoritesLearningImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoritesLearningImpl.kt\ncom/baicizhan/main/word_book/learning/FavoritesLearningImpl$answer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
    public static final class c extends SuspendLambda implements l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f77055a;

        /* renamed from: b, reason: collision with root package name */
        public int f77056b;

        /* renamed from: c, reason: collision with root package name */
        public int f77057c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f77059e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f77060f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f77061g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, long j11, int i12, j00.c<? super c> cVar) {
            super(1, cVar);
            this.f77059e = i11;
            this.f77060f = j11;
            this.f77061g = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return a.this.new c(this.f77059e, this.f77060f, this.f77061g, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f77057c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                List list = a.this.f77051e;
                Object obj2 = null;
                if (list == null) {
                    g0.S("currentWords");
                    list = null;
                }
                int i12 = this.f77059e;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((z) next).x() == i12) {
                        obj2 = next;
                        break;
                    }
                }
                z zVar = (z) obj2;
                if (zVar == null) {
                    throw new IllegalStateException("No word found!");
                }
                a aVar = a.this;
                long j11 = this.f77060f;
                int i13 = this.f77061g;
                long y11 = zVar.y();
                this.f77055a = l00.k.a(zVar);
                this.f77056b = 0;
                this.f77057c = 1;
                if (aVar.i(y11, j11, i13, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.learning.FavoritesLearningImpl", f = "FavoritesLearningImpl.kt", i = {0, 0, 0}, l = {54}, m = "answerUpdate", n = {"universalId", "bookId", a.b.C0242a.f16107c}, s = {"J$0", "J$1", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f77062a;

        /* renamed from: b, reason: collision with root package name */
        public long f77063b;

        /* renamed from: c, reason: collision with root package name */
        public int f77064c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f77065d;

        /* renamed from: f, reason: collision with root package name */
        public int f77067f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f77065d = obj;
            this.f77067f |= Integer.MIN_VALUE;
            return a.this.i(0L, 0L, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.learning.FavoritesLearningImpl$task$1", f = "FavoritesLearningImpl.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f77068a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<j00.c<? super g2>, Object> f77070c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.learning.FavoritesLearningImpl$task$1$1", f = "FavoritesLearningImpl.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: oj.a$e$a, reason: collision with other inner class name */
        public static final class C0943a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f77071a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l<j00.c<? super g2>, Object> f77072b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0943a(l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super C0943a> cVar) {
                super(2, cVar);
                this.f77072b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0943a(this.f77072b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0943a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f77071a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    l<j00.c<? super g2>, Object> lVar = this.f77072b;
                    this.f77071a = 1;
                    if (lVar.invoke(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f77070c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new e(this.f77070c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f77068a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    m0 m0Var = a.this.f77050d;
                    C0943a c0943a = new C0943a(this.f77070c, null);
                    this.f77068a = 1;
                    if (c40.i.h(m0Var, c0943a, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
            } catch (Exception e11) {
                qb.c.c(a.f77046h, "", e11);
            }
            return g2.f100423a;
        }
    }

    public a(@k q wordBookManager, long j11, @k r0 scope, @k m0 coroutineDispatcher) {
        g0.p(wordBookManager, "wordBookManager");
        g0.p(scope, "scope");
        g0.p(coroutineDispatcher, "coroutineDispatcher");
        this.f77047a = wordBookManager;
        this.f77048b = j11;
        this.f77049c = scope;
        this.f77050d = coroutineDispatcher;
        c40.k.f(scope, null, null, new C0941a(null), 3, null);
    }

    @Override // wf.b
    public void a(int i11, int i12) {
        h(this.f77048b, i11, i12);
    }

    public final void h(long j11, int i11, int i12) {
        j(new c(i11, j11, i12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r9, long r11, int r13, @m80.k j00.c<? super yz.g2> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof oj.a.d
            if (r0 == 0) goto L14
            r0 = r14
            oj.a$d r0 = (oj.a.d) r0
            int r1 = r0.f77067f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f77067f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            oj.a$d r0 = new oj.a$d
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f77065d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.f77067f
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            kotlin.e.n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            r14.m6317unboximpl()
            goto L4f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r14)
            ij.q r1 = r8.f77047a
            r7.f77062a = r9
            r7.f77063b = r11
            r7.f77064c = r13
            r7.f77067f = r2
            r2 = r9
            r4 = r11
            r6 = r13
            java.lang.Object r9 = r1.D(r2, r4, r6, r7)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oj.a.i(long, long, int, j00.c):java.lang.Object");
    }

    public final void j(l<? super j00.c<? super g2>, ? extends Object> lVar) {
        c40.k.f(this.f77049c, null, null, new e(lVar, null), 3, null);
    }

    @Override // wf.b
    public void release() {
        r0 r0Var = this.f77049c;
        a0 a0Var = r0Var instanceof a0 ? (a0) r0Var : null;
        if (a0Var != null) {
            a0Var.close();
        }
    }

    public /* synthetic */ a(q qVar, long j11, r0 r0Var, m0 m0Var, int i11, v vVar) {
        this(qVar, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? new a0(l3.c(null, 1, null).plus(h1.e().q())) : r0Var, (i11 & 8) != 0 ? h1.c() : m0Var);
    }
}
