package x3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.r0;
import com.microsoft.thrifty.service.a;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;
import z8.b2;
import z8.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {k3.s.class})
@u0({"SMAP\nBooksServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BooksServiceImpl.kt\ncom/baicizhan/app/biz/books/BooksServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,142:1\n6#2:143\n64#3,2:144\n66#3:147\n67#3,2:153\n6#4:146\n124#5,4:148\n142#6:152\n12#7,3:155\n15#7,10:170\n12#8,12:158\n1#9:180\n37#10,2:181\n*S KotlinDebug\n*F\n+ 1 BooksServiceImpl.kt\ncom/baicizhan/app/biz/books/BooksServiceImpl\n*L\n34#1:143\n34#1:144,2\n34#1:147\n34#1:153,2\n34#1:146\n34#1:148,4\n34#1:152\n-1#1:155,3\n-1#1:170,10\n-1#1:158,12\n69#1:181,2\n*E\n"})
/* loaded from: classes3.dex */
public final class m implements k3.s, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f0 f97228b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final g0 f97229c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final l7.p f97230d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.leaning.a f97231e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final r3.d f97232f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.schedule.g f97233g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {82, 83}, m = "addSchedule", n = {"tag$iv", "bookId", "count", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$addSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$addSchedule$2$1", "tag$iv", "bookId", "count", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$addSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$addSchedule$2$1", "mergeCount"}, s = {"L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "I$6"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97234a;

        /* renamed from: b, reason: collision with root package name */
        public int f97235b;

        /* renamed from: c, reason: collision with root package name */
        public int f97236c;

        /* renamed from: d, reason: collision with root package name */
        public int f97237d;

        /* renamed from: e, reason: collision with root package name */
        public int f97238e;

        /* renamed from: f, reason: collision with root package name */
        public int f97239f;

        /* renamed from: g, reason: collision with root package name */
        public int f97240g;

        /* renamed from: h, reason: collision with root package name */
        public Object f97241h;

        /* renamed from: i, reason: collision with root package name */
        public long f97242i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f97243j;

        /* renamed from: l, reason: collision with root package name */
        public int f97245l;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97243j = obj;
            this.f97245l |= Integer.MIN_VALUE;
            return m.this.U(0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {90, 91, 93}, m = "applyDefaultSchedule", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$applyDefaultSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$applyDefaultSchedule$2$1", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$applyDefaultSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$applyDefaultSchedule$2$1", "tag$iv", "it", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$applyDefaultSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$applyDefaultSchedule$2$1", "$i$a$-also-BooksServiceImpl$applyDefaultSchedule$2$1$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "I$5"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97246a;

        /* renamed from: b, reason: collision with root package name */
        public int f97247b;

        /* renamed from: c, reason: collision with root package name */
        public int f97248c;

        /* renamed from: d, reason: collision with root package name */
        public int f97249d;

        /* renamed from: e, reason: collision with root package name */
        public int f97250e;

        /* renamed from: f, reason: collision with root package name */
        public int f97251f;

        /* renamed from: g, reason: collision with root package name */
        public Object f97252g;

        /* renamed from: h, reason: collision with root package name */
        public Object f97253h;

        /* renamed from: i, reason: collision with root package name */
        public Object f97254i;

        /* renamed from: j, reason: collision with root package name */
        public long f97255j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f97256k;

        /* renamed from: m, reason: collision with root package name */
        public int f97258m;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97256k = obj;
            this.f97258m |= Integer.MIN_VALUE;
            return m.this.m1(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {100, 101}, m = "changeSchedule", n = {"tag$iv", "bookId", "count", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$changeSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$changeSchedule$2$1", "tag$iv", "bookId", "count", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$changeSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$changeSchedule$2$1"}, s = {"L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97259a;

        /* renamed from: b, reason: collision with root package name */
        public int f97260b;

        /* renamed from: c, reason: collision with root package name */
        public int f97261c;

        /* renamed from: d, reason: collision with root package name */
        public int f97262d;

        /* renamed from: e, reason: collision with root package name */
        public int f97263e;

        /* renamed from: f, reason: collision with root package name */
        public int f97264f;

        /* renamed from: g, reason: collision with root package name */
        public Object f97265g;

        /* renamed from: h, reason: collision with root package name */
        public long f97266h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f97267i;

        /* renamed from: k, reason: collision with root package name */
        public int f97269k;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97267i = obj;
            this.f97269k |= Integer.MIN_VALUE;
            return m.this.C(0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {74}, m = "currentSchedule", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$currentSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$currentSchedule$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97270a;

        /* renamed from: b, reason: collision with root package name */
        public int f97271b;

        /* renamed from: c, reason: collision with root package name */
        public int f97272c;

        /* renamed from: d, reason: collision with root package name */
        public int f97273d;

        /* renamed from: e, reason: collision with root package name */
        public int f97274e;

        /* renamed from: f, reason: collision with root package name */
        public long f97275f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f97276g;

        /* renamed from: i, reason: collision with root package name */
        public int f97278i;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97276g = obj;
            this.f97278i |= Integer.MIN_VALUE;
            return m.this.h1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {114}, m = "deleteSchedule", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$deleteSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$deleteSchedule$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97279a;

        /* renamed from: b, reason: collision with root package name */
        public int f97280b;

        /* renamed from: c, reason: collision with root package name */
        public int f97281c;

        /* renamed from: d, reason: collision with root package name */
        public int f97282d;

        /* renamed from: e, reason: collision with root package name */
        public int f97283e;

        /* renamed from: f, reason: collision with root package name */
        public Object f97284f;

        /* renamed from: g, reason: collision with root package name */
        public long f97285g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97286h;

        /* renamed from: j, reason: collision with root package name */
        public int f97288j;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97286h = obj;
            this.f97288j |= Integer.MIN_VALUE;
            return m.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {53, 53}, m = "getAllBooks", n = {"tag$iv", "scope", "books", "selected", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$getAllBooks$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$getAllBooks$2$1", "tag$iv", "scope", "books", "selected", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$getAllBooks$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$getAllBooks$2$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97289a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97290b;

        /* renamed from: c, reason: collision with root package name */
        public Object f97291c;

        /* renamed from: d, reason: collision with root package name */
        public Object f97292d;

        /* renamed from: e, reason: collision with root package name */
        public Object f97293e;

        /* renamed from: f, reason: collision with root package name */
        public int f97294f;

        /* renamed from: g, reason: collision with root package name */
        public int f97295g;

        /* renamed from: h, reason: collision with root package name */
        public int f97296h;

        /* renamed from: i, reason: collision with root package name */
        public int f97297i;

        /* renamed from: j, reason: collision with root package name */
        public long f97298j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f97299k;

        /* renamed from: m, reason: collision with root package name */
        public int f97301m;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97299k = obj;
            this.f97301m |= Integer.MIN_VALUE;
            return m.this.g1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl$getAllBooks$2$1$books$1", f = "BooksServiceImpl.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super h1>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f97302a;

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new g(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super h1> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f97302a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            f0 f0Var = m.this.f97228b;
            this.f97302a = 1;
            Object a11 = f0Var.a(this);
            return a11 == l11 ? l11 : a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl$getAllBooks$2$1$selected$1", f = "BooksServiceImpl.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends x3.b>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f97304a;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new h(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<x3.b>> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f97304a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            g0 g0Var = m.this.f97229c;
            this.f97304a = 1;
            Object a11 = g0Var.a(false, this);
            return a11 == l11 ? l11 : a11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends x3.b>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<x3.b>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {65, 66, 68, 68}, m = "getBookSchedules", n = {"tag$iv", "scope", "books", "selected", "$this$getBookSchedules_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$getBookSchedules$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$getBookSchedules$2$1", "$i$a$-runCatching-BooksServiceImpl$getBookSchedules$2$1$currentSchedule$1", "tag$iv", "scope", "books", "selected", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$getBookSchedules$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$getBookSchedules$2$1", "tag$iv", "scope", "books", "selected", "currentSchedule", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$getBookSchedules$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$getBookSchedules$2$1", "tag$iv", "scope", "books", "selected", "currentSchedule", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$getBookSchedules$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$getBookSchedules$2$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97306a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97307b;

        /* renamed from: c, reason: collision with root package name */
        public Object f97308c;

        /* renamed from: d, reason: collision with root package name */
        public Object f97309d;

        /* renamed from: e, reason: collision with root package name */
        public Object f97310e;

        /* renamed from: f, reason: collision with root package name */
        public Object f97311f;

        /* renamed from: g, reason: collision with root package name */
        public int f97312g;

        /* renamed from: h, reason: collision with root package name */
        public int f97313h;

        /* renamed from: i, reason: collision with root package name */
        public int f97314i;

        /* renamed from: j, reason: collision with root package name */
        public int f97315j;

        /* renamed from: k, reason: collision with root package name */
        public int f97316k;

        /* renamed from: l, reason: collision with root package name */
        public long f97317l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f97318m;

        /* renamed from: o, reason: collision with root package name */
        public int f97320o;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97318m = obj;
            this.f97320o |= Integer.MIN_VALUE;
            return m.this.x0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl$getBookSchedules$2$1$books$1", f = "BooksServiceImpl.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<r0, j00.c<? super h1>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f97321a;

        public j(j00.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new j(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super h1> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f97321a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            f0 f0Var = m.this.f97228b;
            this.f97321a = 1;
            Object a11 = f0Var.a(this);
            return a11 == l11 ? l11 : a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl$getBookSchedules$2$1$selected$1", f = "BooksServiceImpl.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends x3.b>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f97323a;

        public k(j00.c<? super k> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new k(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<x3.b>> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f97323a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            g0 g0Var = m.this.f97229c;
            this.f97323a = 1;
            Object a11 = g0Var.a(true, this);
            return a11 == l11 ? l11 : a11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends x3.b>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<x3.b>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {39}, m = "getRecommendBooks", n = {"tag$iv", "gradeId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$getRecommendBooks$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$getRecommendBooks$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97325a;

        /* renamed from: b, reason: collision with root package name */
        public int f97326b;

        /* renamed from: c, reason: collision with root package name */
        public int f97327c;

        /* renamed from: d, reason: collision with root package name */
        public int f97328d;

        /* renamed from: e, reason: collision with root package name */
        public int f97329e;

        /* renamed from: f, reason: collision with root package name */
        public Object f97330f;

        /* renamed from: g, reason: collision with root package name */
        public long f97331g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97332h;

        /* renamed from: j, reason: collision with root package name */
        public int f97334j;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97332h = obj;
            this.f97334j |= Integer.MIN_VALUE;
            return m.this.D(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {126}, m = "mergeBook", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$mergeBook$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$mergeBook$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    /* renamed from: x3.m$m, reason: collision with other inner class name */
    public static final class C1308m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97335a;

        /* renamed from: b, reason: collision with root package name */
        public int f97336b;

        /* renamed from: c, reason: collision with root package name */
        public int f97337c;

        /* renamed from: d, reason: collision with root package name */
        public int f97338d;

        /* renamed from: e, reason: collision with root package name */
        public int f97339e;

        /* renamed from: f, reason: collision with root package name */
        public Object f97340f;

        /* renamed from: g, reason: collision with root package name */
        public long f97341g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97342h;

        /* renamed from: j, reason: collision with root package name */
        public int f97344j;

        public C1308m(j00.c<? super C1308m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97342h = obj;
            this.f97344j |= Integer.MIN_VALUE;
            return m.this.v2(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl$mergeBook$2$1$1", f = "BooksServiceImpl.kt", i = {1, 2, 2, 3, 3}, l = {127, 128, 130, 131}, m = "invokeSuspend", n = {"id", "id", "state", "id", "state"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class n extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f97345a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97346b;

        /* renamed from: c, reason: collision with root package name */
        public int f97347c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f97349e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i11, j00.c<? super n> cVar) {
            super(2, cVar);
            this.f97349e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new n(this.f97349e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((n) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
        
            if (r10 != r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        
            if (r10 == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        
            if (r10 == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a2 -> B:8:0x00a5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f97347c
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 2
                if (r1 == 0) goto L43
                if (r1 == r4) goto L3f
                if (r1 == r5) goto L37
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                java.lang.Object r1 = r9.f97346b
                z8.b0 r1 = (z8.b0) r1
                java.lang.Object r1 = r9.f97345a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.e.n(r10)
                goto La5
            L21:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L29:
                java.lang.Object r1 = r9.f97346b
                z8.b0 r1 = (z8.b0) r1
                java.lang.Object r4 = r9.f97345a
                java.lang.String r4 = (java.lang.String) r4
                kotlin.e.n(r10)
                r10 = r1
                r1 = r4
                goto L8e
            L37:
                java.lang.Object r1 = r9.f97345a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.e.n(r10)
                goto L6f
            L3f:
                kotlin.e.n(r10)
                goto L5b
            L43:
                kotlin.e.n(r10)
                x3.m r10 = x3.m.this
                z8.b2 r10 = x3.m.L2(r10)
                int r1 = r9.f97349e
                java.util.List r6 = a00.h0.J()
                r9.f97347c = r4
                java.lang.Object r10 = r10.E4(r1, r6, r9)
                if (r10 != r0) goto L5b
                goto La4
            L5b:
                r1 = r10
                java.lang.String r1 = (java.lang.String) r1
                x3.m r10 = x3.m.this
                z8.b2 r10 = x3.m.L2(r10)
                r9.f97345a = r1
                r9.f97347c = r5
                java.lang.Object r10 = r10.N7(r1, r9)
                if (r10 != r0) goto L6f
                goto La4
            L6f:
                z8.b0 r10 = (z8.b0) r10
            L71:
                r8 = r1
                r1 = r10
                r10 = r8
                int r4 = r1.f101183b
                if (r4 == r5) goto La8
                r9.f97345a = r10
                java.lang.Object r4 = l00.k.a(r1)
                r9.f97346b = r4
                r9.f97347c = r3
                r6 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r4 = c40.a1.b(r6, r9)
                if (r4 != r0) goto L8b
                goto La4
            L8b:
                r8 = r1
                r1 = r10
                r10 = r8
            L8e:
                x3.m r4 = x3.m.this
                z8.b2 r4 = x3.m.L2(r4)
                r9.f97345a = r1
                java.lang.Object r10 = l00.k.a(r10)
                r9.f97346b = r10
                r9.f97347c = r2
                java.lang.Object r10 = r4.N7(r1, r9)
                if (r10 != r0) goto La5
            La4:
                return r0
            La5:
                z8.b0 r10 = (z8.b0) r10
                goto L71
            La8:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: x3.m.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {120, 121}, m = "resetBookSchedule", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$resetBookSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$resetBookSchedule$2$1", "tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$resetBookSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$resetBookSchedule$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97350a;

        /* renamed from: b, reason: collision with root package name */
        public int f97351b;

        /* renamed from: c, reason: collision with root package name */
        public int f97352c;

        /* renamed from: d, reason: collision with root package name */
        public int f97353d;

        /* renamed from: e, reason: collision with root package name */
        public int f97354e;

        /* renamed from: f, reason: collision with root package name */
        public Object f97355f;

        /* renamed from: g, reason: collision with root package name */
        public long f97356g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97357h;

        /* renamed from: j, reason: collision with root package name */
        public int f97359j;

        public o(j00.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97357h = obj;
            this.f97359j |= Integer.MIN_VALUE;
            return m.this.N(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BooksServiceImpl", f = "BooksServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {107, 108}, m = "selectSchedule", n = {TypedValues.AttributesType.S_TARGET, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$selectSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$selectSchedule$2$1", TypedValues.AttributesType.S_TARGET, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-BooksServiceImpl$selectSchedule$2", "$i$f$bizCatch", "$i$a$-bizCatch-BooksServiceImpl$selectSchedule$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97360a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97361b;

        /* renamed from: c, reason: collision with root package name */
        public int f97362c;

        /* renamed from: d, reason: collision with root package name */
        public int f97363d;

        /* renamed from: e, reason: collision with root package name */
        public int f97364e;

        /* renamed from: f, reason: collision with root package name */
        public int f97365f;

        /* renamed from: g, reason: collision with root package name */
        public long f97366g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97367h;

        /* renamed from: j, reason: collision with root package name */
        public int f97369j;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97367h = obj;
            this.f97369j |= Integer.MIN_VALUE;
            return m.this.j1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class q implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f97370a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f97371b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f97372c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f97373a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f97374b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f97375c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f97373a = eVar;
                this.f97374b = cVar;
                this.f97375c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f97373a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f97373a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f97374b.b(this.f97375c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public q(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f97370a = dVar;
            this.f97371b = eVar;
            this.f97372c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f97371b, this.f97372c, this.f97370a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = l7.i0.o().get(this.f97370a);
            kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public m(@m80.k f0 bookRepo, @m80.k g0 scheduleRepo, @m80.k l7.p thriftService, @m80.k com.baicizhan.app.biz.leaning.a learnRepo, @m80.k r3.d user, @m80.k com.baicizhan.app.biz.game.uc.schedule.g getCurrentScheduleUC) {
        kotlin.jvm.internal.g0.p(bookRepo, "bookRepo");
        kotlin.jvm.internal.g0.p(scheduleRepo, "scheduleRepo");
        kotlin.jvm.internal.g0.p(thriftService, "thriftService");
        kotlin.jvm.internal.g0.p(learnRepo, "learnRepo");
        kotlin.jvm.internal.g0.p(user, "user");
        kotlin.jvm.internal.g0.p(getCurrentScheduleUC, "getCurrentScheduleUC");
        this.f97228b = bookRepo;
        this.f97229c = scheduleRepo;
        this.f97230d = thriftService;
        this.f97231e = learnRepo;
        this.f97232f = user;
        this.f97233g = getCurrentScheduleUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0120 A[Catch: all -> 0x0138, TryCatch #3 {all -> 0x0138, blocks: (B:22:0x0119, B:24:0x0120, B:26:0x0124, B:28:0x0128, B:30:0x012c, B:32:0x0130, B:43:0x0196, B:34:0x013a, B:36:0x0145, B:38:0x0159, B:40:0x016d, B:42:0x0182), top: B:21:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182 A[Catch: all -> 0x0138, TryCatch #3 {all -> 0x0138, blocks: (B:22:0x0119, B:24:0x0120, B:26:0x0124, B:28:0x0128, B:30:0x012c, B:32:0x0130, B:43:0x0196, B:34:0x013a, B:36:0x0145, B:38:0x0159, B:40:0x016d, B:42:0x0182), top: B:21:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(int r19, int r20, @m80.k j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.C(int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:11:0x0030, B:12:0x0087, B:14:0x0099, B:15:0x009f), top: B:10:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:26:0x00de, B:28:0x00e5, B:30:0x00e9, B:32:0x00ed, B:34:0x00f1, B:36:0x00f5, B:47:0x015c, B:38:0x0100, B:40:0x010b, B:42:0x011f, B:44:0x0133, B:46:0x0148), top: B:25:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:26:0x00de, B:28:0x00e5, B:30:0x00e9, B:32:0x00ed, B:34:0x00f1, B:36:0x00f5, B:47:0x015c, B:38:0x0100, B:40:0x010b, B:42:0x011f, B:44:0x0133, B:46:0x0148), top: B:25:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(int r14, @m80.k j00.c<? super k3.i3> r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.D(int, j00.c):java.lang.Object");
    }

    public final b2 M2() {
        return (b2) w7.f.b(new q(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:22:0x0103, B:24:0x010a, B:26:0x010e, B:28:0x0112, B:30:0x0116, B:32:0x011a, B:43:0x0180, B:34:0x0124, B:36:0x012f, B:38:0x0143, B:40:0x0157, B:42:0x016c), top: B:21:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:22:0x0103, B:24:0x010a, B:26:0x010e, B:28:0x0112, B:30:0x0116, B:32:0x011a, B:43:0x0180, B:34:0x0124, B:36:0x012f, B:38:0x0143, B:40:0x0157, B:42:0x016c), top: B:21:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(int r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.N(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(3:(1:(7:11|12|13|14|15|(1:17)|18)(2:44|45))(4:46|47|48|49)|22|(2:24|(2:26|(2:28|(2:30|(2:32|33)(2:34|35))(2:36|37))(2:38|39))(2:40|41))(2:42|43))(5:61|62|63|(1:65)|53)|50|51|(5:54|14|15|(0)|18)|53))|74|6|7|(0)(0)|50|51|(0)|53|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, long] */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U(int r20, int r21, @m80.k j00.c<? super java.lang.Integer> r22) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.U(int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:22:0x00c2, B:24:0x00c9, B:26:0x00cd, B:28:0x00d1, B:30:0x00d5, B:32:0x00d9, B:43:0x0140, B:34:0x00e4, B:36:0x00ef, B:38:0x0103, B:40:0x0117, B:42:0x012c), top: B:21:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:22:0x00c2, B:24:0x00c9, B:26:0x00cd, B:28:0x00d1, B:30:0x00d5, B:32:0x00d9, B:43:0x0140, B:34:0x00e4, B:36:0x00ef, B:38:0x0103, B:40:0x0117, B:42:0x012c), top: B:21:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.b(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0166 A[Catch: all -> 0x017e, TryCatch #4 {all -> 0x017e, blocks: (B:22:0x015f, B:24:0x0166, B:26:0x016a, B:28:0x016e, B:30:0x0172, B:32:0x0176, B:43:0x01dc, B:34:0x0180, B:36:0x018b, B:38:0x019f, B:40:0x01b3, B:42:0x01c8), top: B:21:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c8 A[Catch: all -> 0x017e, TryCatch #4 {all -> 0x017e, blocks: (B:22:0x015f, B:24:0x0166, B:26:0x016a, B:28:0x016e, B:30:0x0172, B:32:0x0176, B:43:0x01dc, B:34:0x0180, B:36:0x018b, B:38:0x019f, B:40:0x01b3, B:42:0x01c8), top: B:21:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g1(@m80.k j00.c<? super k3.i3[]> r21) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.g1(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:22:0x00c2, B:24:0x00c9, B:26:0x00cd, B:28:0x00d1, B:30:0x00d5, B:32:0x00d9, B:43:0x0140, B:34:0x00e4, B:36:0x00ef, B:38:0x0103, B:40:0x0117, B:42:0x012c), top: B:21:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:22:0x00c2, B:24:0x00c9, B:26:0x00cd, B:28:0x00d1, B:30:0x00d5, B:32:0x00d9, B:43:0x0140, B:34:0x00e4, B:36:0x00ef, B:38:0x0103, B:40:0x0117, B:42:0x012c), top: B:21:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h1(@m80.k j00.c<? super k3.p> r12) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.h1(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b A[Catch: all -> 0x0143, TryCatch #3 {all -> 0x0143, blocks: (B:22:0x0124, B:24:0x012b, B:26:0x012f, B:28:0x0133, B:30:0x0137, B:32:0x013b, B:43:0x01a1, B:34:0x0145, B:36:0x0150, B:38:0x0164, B:40:0x0178, B:42:0x018d), top: B:21:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d A[Catch: all -> 0x0143, TryCatch #3 {all -> 0x0143, blocks: (B:22:0x0124, B:24:0x012b, B:26:0x012f, B:28:0x0133, B:30:0x0137, B:32:0x013b, B:43:0x01a1, B:34:0x0145, B:36:0x0150, B:38:0x0164, B:40:0x0178, B:42:0x018d), top: B:21:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j1(@m80.k k3.p r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.j1(k3.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        if (r2.g(r6, r3) == r4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0187 A[Catch: all -> 0x019f, TryCatch #4 {all -> 0x019f, blocks: (B:23:0x0180, B:25:0x0187, B:27:0x018b, B:29:0x018f, B:31:0x0193, B:33:0x0197, B:44:0x01fd, B:35:0x01a1, B:37:0x01ac, B:39:0x01c0, B:41:0x01d4, B:43:0x01e9), top: B:22:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e9 A[Catch: all -> 0x019f, TryCatch #4 {all -> 0x019f, blocks: (B:23:0x0180, B:25:0x0187, B:27:0x018b, B:29:0x018f, B:31:0x0193, B:33:0x0197, B:44:0x01fd, B:35:0x01a1, B:37:0x01ac, B:39:0x01c0, B:41:0x01d4, B:43:0x01e9), top: B:22:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:56:0x0061, B:57:0x00f0, B:59:0x00ff), top: B:55:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m1(int r31, @m80.k j00.c<? super yz.g2> r32) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.m1(int, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v2(int r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.v2(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02aa A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:24:0x02a3, B:26:0x02aa, B:28:0x02ae, B:30:0x02b2, B:32:0x02b6, B:34:0x02ba, B:45:0x0320, B:36:0x02c4, B:38:0x02cf, B:40:0x02e3, B:42:0x02f7, B:44:0x030c), top: B:23:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x030c A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:24:0x02a3, B:26:0x02aa, B:28:0x02ae, B:30:0x02b2, B:32:0x02b6, B:34:0x02ba, B:45:0x0320, B:36:0x02c4, B:38:0x02cf, B:40:0x02e3, B:42:0x02f7, B:44:0x030c), top: B:23:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018e A[Catch: all -> 0x019d, TryCatch #5 {all -> 0x019d, blocks: (B:89:0x0183, B:92:0x018a, B:94:0x018e, B:98:0x01a2, B:107:0x0178, B:110:0x00fe), top: B:109:0x00fe }] */
    @Override // k3.s
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x0(@m80.k j00.c<? super k3.p[]> r26) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.m.x0(j00.c):java.lang.Object");
    }
}
