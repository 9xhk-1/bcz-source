package r7;

import c40.r0;
import c40.s0;
import c40.x0;
import com.baicizhan.app.biz.synservice.version.IVersionRepo;
import com.jiongji.andriod.card.R;
import com.microsoft.thrifty.service.a;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l7.i0;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {r7.f.class})
@u0({"SMAP\nIUserBookRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 9 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,274:1\n6#2:275\n6#2:287\n64#3,2:276\n66#3:279\n67#3,2:285\n64#3,2:288\n66#3:291\n67#3,2:297\n6#4:278\n6#4:290\n124#5,4:280\n124#5,4:292\n127#5:312\n142#6:284\n142#6:296\n142#6:310\n1#7:299\n113#8:300\n113#8:301\n113#8:302\n113#8:303\n41#9,6:304\n48#9:311\n*S KotlinDebug\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl\n*L\n51#1:275\n52#1:287\n51#1:276,2\n51#1:279\n51#1:285,2\n52#1:288,2\n52#1:291\n52#1:297,2\n51#1:278\n52#1:290\n51#1:280,4\n52#1:292,4\n56#1:312\n51#1:284\n52#1:296\n56#1:310\n149#1:300\n162#1:301\n188#1:302\n212#1:303\n56#1:304,6\n56#1:311\n*E\n"})
/* loaded from: classes3.dex */
public final class l implements r7.f, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v3.b f83355b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f83356c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final l7.p f83357d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final IVersionRepo f83358e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final k50.a f83359f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c0 f83360g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public x0<r7.a> f83361h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {1}, l = {110, 113}, m = "checkUpdate", n = {"bookListRecord"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83362a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83363b;

        /* renamed from: d, reason: collision with root package name */
        public int f83365d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83363b = obj;
            this.f83365d |= Integer.MIN_VALUE;
            return l.this.x(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {196, 197, 206, 207, 211}, m = "createUserBook", n = {"name", "name", "record", "name", "record", "serverBook", "bookRecord", "name", "record", "serverBook", "bookRecord", "$this$createUserBook_u24lambda_u240", "$i$a$-apply-UserBookRepoImpl$createUserBook$2", "name", "record", "serverBook", "bookRecord"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83366a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83367b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83368c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83369d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83370e;

        /* renamed from: f, reason: collision with root package name */
        public Object f83371f;

        /* renamed from: g, reason: collision with root package name */
        public int f83372g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f83373h;

        /* renamed from: j, reason: collision with root package name */
        public int f83375j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83373h = obj;
            this.f83375j |= Integer.MIN_VALUE;
            return l.this.p(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {158, 159, 160, 160, 161}, m = "deleteBooks", n = {"userBookId", "record", "userBookId", "record", "userBookId", "updateAt", "record", "userBookId", "updateAt", "record", "userBookId", "updateAt"}, s = {"J$0", "L$0", "J$0", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83376a;

        /* renamed from: b, reason: collision with root package name */
        public long f83377b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83378c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f83379d;

        /* renamed from: f, reason: collision with root package name */
        public int f83381f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83379d = obj;
            this.f83381f |= Integer.MIN_VALUE;
            return l.this.c(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {1}, l = {69, 71}, m = "doSyn", n = {"task"}, s = {"L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83382a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83383b;

        /* renamed from: d, reason: collision with root package name */
        public int f83385d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83383b = obj;
            this.f83385d |= Integer.MIN_VALUE;
            return l.this.y(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {170, 171, 172, 173, 187}, m = "editBookName", n = {"bookName", "userBookId", "bookName", "record", "userBookId", "bookName", "record", "bookInfo", "userBookId", "bookName", "record", "bookInfo", "$this$editBookName_u24lambda_u240", "userBookId", "$i$a$-apply-UserBookRepoImpl$editBookName$2", "bookName", "record", "bookInfo", "userBookId"}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$4", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83386a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83387b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83388c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83389d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83390e;

        /* renamed from: f, reason: collision with root package name */
        public Object f83391f;

        /* renamed from: g, reason: collision with root package name */
        public int f83392g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f83393h;

        /* renamed from: j, reason: collision with root package name */
        public int f83395j;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83393h = obj;
            this.f83395j |= Integer.MIN_VALUE;
            return l.this.b(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl$editBookName$2$1", f = "IUserBookRepo.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f83396a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p7.n f83397b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f83398c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f83399d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y8.g f83400e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p7.n nVar, long j11, String str, y8.g gVar, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f83397b = nVar;
            this.f83398c = j11;
            this.f83399d = str;
            this.f83400e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f83397b, this.f83398c, this.f83399d, this.f83400e, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((f) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r15.Z(r3, r14) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (r15.W(r4, r14) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r14.f83396a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r15)
                goto L4c
            L12:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1a:
                kotlin.e.n(r15)
                goto L2e
            L1e:
                kotlin.e.n(r15)
                p7.n r15 = r14.f83397b
                long r4 = r14.f83398c
                r14.f83396a = r3
                java.lang.Object r15 = r15.W(r4, r14)
                if (r15 != r0) goto L2e
                goto L4b
            L2e:
                p7.n r15 = r14.f83397b
                p7.p r3 = new p7.p
                long r4 = r14.f83398c
                java.lang.String r6 = r14.f83399d
                y8.g r1 = r14.f83400e
                int r7 = r1.f99561c
                long r7 = (long) r7
                java.lang.String r9 = r1.f99562d
                long r10 = r1.f99563e
                r12 = r10
                r3.<init>(r4, r6, r7, r9, r10, r12)
                r14.f83396a = r2
                java.lang.Object r15 = r15.Z(r3, r14)
                if (r15 != r0) goto L4c
            L4b:
                return r0
            L4c:
                yz.g2 r15 = yz.g2.f100423a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.l.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {}, l = {125}, m = "getBooksLimitedCount", n = {}, s = {}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f83401a;

        /* renamed from: c, reason: collision with root package name */
        public int f83403c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83401a = obj;
            this.f83403c |= Integer.MIN_VALUE;
            return l.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl$getOrCreateDb$2", f = "IUserBookRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<l.e, j00.c<? super p7.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f83404a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83405b;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            h hVar = new h(cVar);
            hVar.f83405b = obj;
            return hVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l.e eVar, j00.c<? super p7.c> cVar) {
            return ((h) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l.e eVar = (l.e) this.f83405b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f83404a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return p7.c.f79351d.b(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {0, 1}, l = {129, 129}, m = "getUserBook", n = {"userBookId", "userBookId"}, s = {"J$0", "J$0"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83406a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83407b;

        /* renamed from: d, reason: collision with root package name */
        public int f83409d;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83407b = obj;
            this.f83409d |= Integer.MIN_VALUE;
            return l.this.g(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {}, l = {118, 119, 121, 121}, m = "getUserBooks", n = {}, s = {}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f83410a;

        /* renamed from: c, reason: collision with root package name */
        public int f83412c;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83410a = obj;
            this.f83412c |= Integer.MIN_VALUE;
            return l.this.B(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {1}, l = {R.styleable.Theme_drawable_tab_mall_1111, 240}, m = "loadBookListRecord", n = {"recordLoad"}, s = {"L$0"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83413a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83414b;

        /* renamed from: d, reason: collision with root package name */
        public int f83416d;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83414b = obj;
            this.f83416d |= Integer.MIN_VALUE;
            return l.this.G(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {0, 1}, l = {R.styleable.Theme_drawable_sound1, R.styleable.Theme_drawable_sound1}, m = "queryBooksByTopic", n = {"topicId", "topicId"}, s = {"I$0", "I$0"}, v = 1)
    /* renamed from: r7.l$l, reason: collision with other inner class name */
    public static final class C1039l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f83417a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83418b;

        /* renamed from: d, reason: collision with root package name */
        public int f83420d;

        public C1039l(j00.c<? super C1039l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83418b = obj;
            this.f83420d |= Integer.MIN_VALUE;
            return l.this.f(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class m implements x00.l<w7.d<y8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83421a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83422b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83423c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83424a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83425b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83426c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83424a = eVar;
                this.f83425b = cVar;
                this.f83426c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83424a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83424a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83425b.b(this.f83426c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public m(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83421a = dVar;
            this.f83422b = eVar;
            this.f83423c = cVar;
        }

        public final void a(w7.d<y8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83422b, this.f83423c, this.f83421a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83421a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) kotlin.jvm.internal.x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<y8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class n implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83427a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83428b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83429c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83430a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83431b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83432c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83430a = eVar;
                this.f83431b = cVar;
                this.f83432c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83430a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83430a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83431b.b(this.f83432c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public n(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83427a = dVar;
            this.f83428b = eVar;
            this.f83429c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83428b, this.f83429c, this.f83427a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83427a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) kotlin.jvm.internal.x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl$synTask$2", f = "IUserBookRepo.kt", i = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {79, 80, 81, 82, 83, 99}, m = "invokeSuspend", n = {"remote", "bookList", "remote", "bookList", "db", "remote", "bookList", "db", "oldList", "remote", "bookList", "db", "oldList", "record", "remote"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0"}, v = 1)
    @u0({"SMAP\nIUserBookRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl$synTask$2\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,274:1\n113#2:275\n*S KotlinDebug\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl$synTask$2\n*L\n100#1:275\n*E\n"})
    public static final class o extends SuspendLambda implements x00.p<r0, j00.c<? super r7.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f83433a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83434b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83435c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83436d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83437e;

        /* renamed from: f, reason: collision with root package name */
        public int f83438f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl$synTask$2$1", f = "IUserBookRepo.kt", i = {1, 1, 1, 1, 1, 1, 1}, l = {84, 90}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "book", "record", "$i$f$forEach", "$i$a$-forEach-UserBookRepoImpl$synTask$2$1$1", "$i$a$-let-UserBookRepoImpl$synTask$2$1$1$2"}, s = {"L$0", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2"}, v = 1)
        @u0({"SMAP\nIUserBookRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl$synTask$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n1869#2,2:275\n*S KotlinDebug\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl$synTask$2$1\n*L\n85#1:275,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f83440a;

            /* renamed from: b, reason: collision with root package name */
            public Object f83441b;

            /* renamed from: c, reason: collision with root package name */
            public Object f83442c;

            /* renamed from: d, reason: collision with root package name */
            public Object f83443d;

            /* renamed from: e, reason: collision with root package name */
            public Object f83444e;

            /* renamed from: f, reason: collision with root package name */
            public Object f83445f;

            /* renamed from: g, reason: collision with root package name */
            public Object f83446g;

            /* renamed from: h, reason: collision with root package name */
            public int f83447h;

            /* renamed from: i, reason: collision with root package name */
            public int f83448i;

            /* renamed from: j, reason: collision with root package name */
            public int f83449j;

            /* renamed from: k, reason: collision with root package name */
            public int f83450k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ p7.c f83451l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ y8.f f83452m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ List<p7.p> f83453n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p7.c cVar, y8.f fVar, List<p7.p> list, j00.c<? super a> cVar2) {
                super(2, cVar2);
                this.f83451l = cVar;
                this.f83452m = fVar;
                this.f83453n = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f83451l, this.f83452m, this.f83453n, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
            
                if (r2.U(r22) == r1) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f9 -> B:6:0x00fa). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instructions count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: r7.l.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public o(j00.c<? super o> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return l.this.new o(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super r7.a> cVar) {
            return ((o) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00f6, code lost:
        
            if (j.o.a.a(r6, false, r8, r9, 1, null) != r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
        
            if (r13 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        
            if (r13 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        
            if (r13 == r0) goto L14;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.l.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {1}, l = {R.styleable.Theme_drawable_syncview, R.styleable.Theme_drawable_syncview_update}, m = "sync", n = {"need"}, s = {"Z$0"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f83454a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83455b;

        /* renamed from: d, reason: collision with root package name */
        public int f83457d;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83455b = obj;
            this.f83457d |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl", f = "IUserBookRepo.kt", i = {0, 1, 1, 1, 2, 3, 3, 3}, l = {133, 134, 140, 148}, m = "updateBookRecords", n = {"userBookRecord", "userBookRecord", "$this$updateBookRecords_u24lambda_u240", "$i$a$-apply-UserBookRepoImpl$updateBookRecords$2", "userBookRecord", "userBookRecord", "it", "$i$a$-also-UserBookRepoImpl$updateBookRecords$5"}, s = {"L$0", "L$0", "L$2", "I$0", "L$0", "L$0", "L$2", "I$0"}, v = 1)
    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83458a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83459b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83460c;

        /* renamed from: d, reason: collision with root package name */
        public int f83461d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f83462e;

        /* renamed from: g, reason: collision with root package name */
        public int f83464g;

        public q(j00.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83462e = obj;
            this.f83464g |= Integer.MIN_VALUE;
            return l.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookRepoImpl$updateBookRecords$2$1", f = "IUserBookRepo.kt", i = {0, 0, 0, 0, 0}, l = {136}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "record", "$i$f$forEach", "$i$a$-forEach-UserBookRepoImpl$updateBookRecords$2$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nIUserBookRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl$updateBookRecords$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n1869#2,2:275\n*S KotlinDebug\n*F\n+ 1 IUserBookRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookRepoImpl$updateBookRecords$2$1\n*L\n135#1:275,2\n*E\n"})
    public static final class r extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83465a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83466b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83467c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83468d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83469e;

        /* renamed from: f, reason: collision with root package name */
        public int f83470f;

        /* renamed from: g, reason: collision with root package name */
        public int f83471g;

        /* renamed from: h, reason: collision with root package name */
        public int f83472h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List<p7.p> f83473i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p7.n f83474j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<p7.p> list, p7.n nVar, j00.c<? super r> cVar) {
            super(2, cVar);
            this.f83473i = list;
            this.f83474j = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new r(this.f83473i, this.f83474j, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((r) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            p7.n nVar;
            int i11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f83472h;
            if (i12 == 0) {
                kotlin.e.n(obj);
                List<p7.p> list = this.f83473i;
                p7.n nVar2 = this.f83474j;
                it = list.iterator();
                iterable = list;
                nVar = nVar2;
                i11 = 0;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f83470f;
                it = (Iterator) this.f83467c;
                nVar = (p7.n) this.f83466b;
                iterable = (Iterable) this.f83465a;
                kotlin.e.n(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                p7.p pVar = (p7.p) next;
                this.f83465a = l00.k.a(iterable);
                this.f83466b = nVar;
                this.f83467c = it;
                this.f83468d = l00.k.a(next);
                this.f83469e = l00.k.a(pVar);
                this.f83470f = i11;
                this.f83471g = 0;
                this.f83472h = 1;
                if (nVar.Z(pVar, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }
    }

    public l(@m80.k v3.b dbPoll, @m80.k com.baicizhan.app.biz.auth.r tokenProvider, @m80.k l7.p thrift, @m80.k IVersionRepo iVersion, @m80.k k50.a json) {
        g0.p(dbPoll, "dbPoll");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(thrift, "thrift");
        g0.p(iVersion, "iVersion");
        g0.p(json, "json");
        this.f83355b = dbPoll;
        this.f83356c = tokenProvider;
        this.f83357d = thrift;
        this.f83358e = iVersion;
        this.f83359f = json;
        this.f83360g = e0.c(new x00.a() { // from class: r7.j
            @Override // x00.a
            public final Object invoke() {
                com.baicizhan.app.preferences.g H;
                H = l.H(l.this);
                return H;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(j00.c<? super p7.c> cVar) {
        return this.f83355b.a(p7.c.f79351d.a(), "user_book", true, new h(null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.baicizhan.app.preferences.g C() {
        return (com.baicizhan.app.preferences.g) this.f83360g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.baicizhan.app.preferences.g H(l lVar) {
        return (com.baicizhan.app.preferences.g) (lVar instanceof pa0.c ? ((pa0.c) lVar).getScope() : lVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), null, new x00.a() { // from class: r7.k
            @Override // x00.a
            public final Object invoke() {
                ya0.a I;
                I = l.I();
                return I;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya0.a I() {
        return ya0.b.d("user_book");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (y(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(@m80.k j00.c<? super java.util.List<p7.p>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof r7.l.j
            if (r0 == 0) goto L13
            r0 = r8
            r7.l$j r0 = (r7.l.j) r0
            int r1 = r0.f83412c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83412c = r1
            goto L18
        L13:
            r7.l$j r0 = new r7.l$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f83410a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83412c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.e.n(r8)
            return r8
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            kotlin.e.n(r8)
            goto L6c
        L3e:
            kotlin.e.n(r8)
            goto L63
        L42:
            kotlin.e.n(r8)
            goto L52
        L46:
            kotlin.e.n(r8)
            r0.f83412c = r6
            java.lang.Object r8 = r7.x(r0)
            if (r8 != r1) goto L52
            goto L7e
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L63
            r0.f83412c = r5
            java.lang.Object r8 = r7.y(r0)
            if (r8 != r1) goto L63
            goto L7e
        L63:
            r0.f83412c = r4
            java.lang.Object r8 = r7.A(r0)
            if (r8 != r1) goto L6c
            goto L7e
        L6c:
            p7.c r8 = (p7.c) r8
            p7.n r8 = r8.w()
            j.j r8 = r8.f0()
            r0.f83412c = r3
            java.lang.Object r8 = k.e.c(r8, r0)
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.B(j00.c):java.lang.Object");
    }

    public final b2 D() {
        return (b2) w7.f.b(new n(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public final y8.h F() {
        return (y8.h) w7.f.b(new m(o0.d(y8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(j00.c<? super r7.a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof r7.l.k
            if (r0 == 0) goto L13
            r0 = r12
            r7.l$k r0 = (r7.l.k) r0
            int r1 = r0.f83416d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83416d = r1
            goto L18
        L13:
            r7.l$k r0 = new r7.l$k
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f83414b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83416d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f83413a
            r7.a r0 = (r7.a) r0
            kotlin.e.n(r12)
            goto Lac
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L39:
            kotlin.e.n(r12)
            goto L5f
        L3d:
            kotlin.e.n(r12)
            z6.b r5 = z6.b.f101032b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserBookService"
            java.lang.String r7 = "loadBookListRecord"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            com.baicizhan.app.preferences.g r12 = r11.C()
            java.lang.String r2 = r11.z()
            r0.f83416d = r4
            java.lang.String r4 = ""
            java.lang.Object r12 = r12.j(r2, r4, r0)
            if (r12 != r1) goto L5f
            goto Lab
        L5f:
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            r4 = 0
            if (r2 <= 0) goto L6a
            goto L6b
        L6a:
            r12 = r4
        L6b:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L80
            k50.a r2 = r11.f83359f
            r7.a$b r4 = r7.a.Companion
            f50.i r4 = r4.serializer()
            f50.e r4 = (f50.e) r4
            java.lang.Object r12 = r2.c(r4, r12)
            r4 = r12
            r7.a r4 = (r7.a) r4
        L80:
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "LOCAL "
            r12.append(r2)
            r12.append(r4)
            java.lang.String r7 = r12.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserBookService"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            if (r4 != 0) goto Lca
            java.lang.Object r12 = l00.k.a(r4)
            r0.f83413a = r12
            r0.f83416d = r3
            java.lang.Object r12 = r11.y(r0)
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r7.a r12 = (r7.a) r12
            z6.b r0 = z6.b.f101032b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "from server "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = r1.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "UserBookService"
            r3 = 0
            z6.b.j(r0, r1, r2, r3, r4, r5)
            return r12
        Lca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.G(j00.c):java.lang.Object");
    }

    public final Object K(j00.c<? super x0<r7.a>> cVar) {
        x0 b11;
        b11 = c40.k.b(s0.a(c4.o.b()), null, null, new o(null), 3, null);
        return b11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r7.l.p
            if (r0 == 0) goto L13
            r0 = r6
            r7.l$p r0 = (r7.l.p) r0
            int r1 = r0.f83457d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83457d = r1
            goto L18
        L13:
            r7.l$p r0 = new r7.l$p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f83455b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83457d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            boolean r0 = r0.f83454a
            kotlin.e.n(r6)
            goto L5a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e.n(r6)
            goto L46
        L3a:
            kotlin.e.n(r6)
            r0.f83457d = r4
            java.lang.Object r6 = r5.x(r0)
            if (r6 != r1) goto L46
            goto L58
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5b
            r0.f83454a = r6
            r0.f83457d = r3
            java.lang.Object r0 = r5.y(r0)
            if (r0 != r1) goto L59
        L58:
            return r1
        L59:
            r0 = r6
        L5a:
            r6 = r0
        L5b:
            java.lang.Boolean r6 = l00.a.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x018e, code lost:
    
        if (r4.k(r6, r8, r9) != r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        if (r4 == r5) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r22, @m80.k java.lang.String r24, @m80.k j00.c<? super yz.g2> r25) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.b(long, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0118, code lost:
    
        if (r1.k(r2, r3, r4) != r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        if (r3 != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r3 == r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r21, @m80.k j00.c<? super yz.g2> r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.c(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof r7.l.g
            if (r0 == 0) goto L13
            r0 = r5
            r7.l$g r0 = (r7.l.g) r0
            int r1 = r0.f83403c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83403c = r1
            goto L18
        L13:
            r7.l$g r0 = new r7.l$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f83401a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83403c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            r0.f83403c = r3
            java.lang.Object r5 = r4.G(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r7.a r5 = (r7.a) r5
            int r5 = r5.h()
            java.lang.Integer r5 = l00.a.f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x015c, code lost:
    
        if (r1.k(r4, r5, r6) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r1 != r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (r3 == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k java.util.List<p7.p> r22, @m80.k j00.c<? super yz.g2> r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.e(java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r13 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(int r12, @m80.k j00.c<? super java.util.List<p7.p>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof r7.l.C1039l
            if (r0 == 0) goto L13
            r0 = r13
            r7.l$l r0 = (r7.l.C1039l) r0
            int r1 = r0.f83420d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83420d = r1
            goto L18
        L13:
            r7.l$l r0 = new r7.l$l
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f83418b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83420d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r13)
            return r13
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            int r12 = r0.f83417a
            kotlin.e.n(r13)
            goto L63
        L3a:
            kotlin.e.n(r13)
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "createUserBook "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r7 = r13.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserBookService"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            r0.f83417a = r12
            r0.f83420d = r4
            java.lang.Object r13 = r11.A(r0)
            if (r13 != r1) goto L63
            goto L78
        L63:
            p7.c r13 = (p7.c) r13
            p7.n r13 = r13.w()
            long r4 = (long) r12
            j.i r13 = r13.i0(r4)
            r0.f83417a = r12
            r0.f83420d = r3
            java.lang.Object r12 = k.e.c(r13, r0)
            if (r12 != r1) goto L79
        L78:
            return r1
        L79:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.f(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r6, @m80.k j00.c<? super p7.p> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r7.l.i
            if (r0 == 0) goto L13
            r0 = r8
            r7.l$i r0 = (r7.l.i) r0
            int r1 = r0.f83409d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83409d = r1
            goto L18
        L13:
            r7.l$i r0 = new r7.l$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f83407b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83409d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r6 = r0.f83406a
            kotlin.e.n(r8)
            goto L48
        L3a:
            kotlin.e.n(r8)
            r0.f83406a = r6
            r0.f83409d = r4
            java.lang.Object r8 = r5.A(r0)
            if (r8 != r1) goto L48
            goto L5c
        L48:
            p7.c r8 = (p7.c) r8
            p7.n r8 = r8.w()
            j.j r8 = r8.c0(r6)
            r0.f83406a = r6
            r0.f83409d = r3
            java.lang.Object r6 = k.e.e(r8, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.g(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x018d, code lost:
    
        if (r14.k(r15, r8, r3) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0140, code lost:
    
        if (r2.Z(r1, r3) != r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r2 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // r7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(@m80.k java.lang.String r23, @m80.k j00.c<? super p7.p> r24) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.p(java.lang.String, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(j00.c<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof r7.l.a
            if (r0 == 0) goto L13
            r0 = r9
            r7.l$a r0 = (r7.l.a) r0
            int r1 = r0.f83365d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83365d = r1
            goto L18
        L13:
            r7.l$a r0 = new r7.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f83363b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83365d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f83362a
            r7.a r0 = (r7.a) r0
            kotlin.e.n(r9)
            goto L86
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            kotlin.e.n(r9)
            goto L52
        L3c:
            kotlin.e.n(r9)
            com.baicizhan.app.preferences.g r9 = r8.C()
            java.lang.String r2 = r8.z()
            r0.f83365d = r4
            java.lang.String r5 = ""
            java.lang.Object r9 = r9.j(r2, r5, r0)
            if (r9 != r1) goto L52
            goto L82
        L52:
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L5c
            goto L5d
        L5c:
            r9 = 0
        L5d:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L9b
            k50.a r2 = r8.f83359f
            r7.a$b r5 = r7.a.Companion
            f50.i r5 = r5.serializer()
            f50.e r5 = (f50.e) r5
            java.lang.Object r9 = r2.c(r5, r9)
            r7.a r9 = (r7.a) r9
            if (r9 != 0) goto L74
            goto L9b
        L74:
            com.baicizhan.app.biz.synservice.version.IVersionRepo r2 = r8.f83358e
            com.baicizhan.app.biz.synservice.version.IVersionRepo$VersionType r5 = com.baicizhan.app.biz.synservice.version.IVersionRepo.VersionType.UserBooks
            r0.f83362a = r9
            r0.f83365d = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L83
        L82:
            return r1
        L83:
            r7 = r0
            r0 = r9
            r9 = r7
        L86:
            java.lang.Number r9 = (java.lang.Number) r9
            long r1 = r9.longValue()
            long r5 = r0.g()
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 <= 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            java.lang.Boolean r9 = l00.a.a(r4)
            return r9
        L9b:
            java.lang.Boolean r9 = l00.a.a(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.x(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(j00.c<? super r7.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r7.l.d
            if (r0 == 0) goto L13
            r0 = r6
            r7.l$d r0 = (r7.l.d) r0
            int r1 = r0.f83385d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83385d = r1
            goto L18
        L13:
            r7.l$d r0 = new r7.l$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f83383b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83385d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f83382a
            c40.x0 r0 = (c40.x0) r0
            kotlin.e.n(r6)
            goto L5f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.e.n(r6)
            goto L4c
        L3c:
            kotlin.e.n(r6)
            c40.x0<r7.a> r6 = r5.f83361h
            if (r6 != 0) goto L4e
            r0.f83385d = r4
            java.lang.Object r6 = r5.K(r0)
            if (r6 != r1) goto L4c
            goto L5e
        L4c:
            c40.x0 r6 = (c40.x0) r6
        L4e:
            r5.f83361h = r6
            java.lang.Object r2 = l00.k.a(r6)
            r0.f83382a = r2
            r0.f83385d = r3
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            r7.a r6 = (r7.a) r6
            r0 = 0
            r5.f83361h = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.l.y(j00.c):java.lang.Object");
    }

    public final String z() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("user_book_list_");
        String a11 = this.f83356c.a();
        sb2.append(a11 != null ? a11.hashCode() : 0);
        return sb2.toString();
    }
}
