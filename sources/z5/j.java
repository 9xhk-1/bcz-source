package z5;

import c4.o;
import c40.h1;
import c40.r0;
import c40.s0;
import com.microsoft.thrifty.service.a;
import f4.f3;
import f4.v;
import f4.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.CoroutineStart;
import l7.i0;
import l7.p;
import m80.l;
import oa0.r;
import p8.s;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {z5.g.class})
@u0({"SMAP\nStudyRecordRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,163:1\n6#2:164\n64#3,2:165\n66#3:168\n67#3,2:174\n6#4:167\n124#5,4:169\n142#6:173\n*S KotlinDebug\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl\n*L\n42#1:164\n42#1:165,2\n42#1:168\n42#1:174,2\n42#1:167\n42#1:169,4\n42#1:173\n*E\n"})
/* loaded from: classes3.dex */
public final class j implements z5.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h4.c f100849a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o5.a f100850b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p f100851c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$deleteRecordsByBookId$2", f = "StudyRecordRepo.kt", i = {1, 1}, l = {121, 122}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-StudyRecordRepoImpl$deleteRecordsByBookId$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100852a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100853b;

        /* renamed from: c, reason: collision with root package name */
        public int f100854c;

        /* renamed from: d, reason: collision with root package name */
        public int f100855d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f100857f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$deleteRecordsByBookId$2$1$1", f = "StudyRecordRepo.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: z5.j$a$a, reason: collision with other inner class name */
        public static final class C1381a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f100858a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f100859b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f100860c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1381a(v vVar, long j11, j00.c<? super C1381a> cVar) {
                super(2, cVar);
                this.f100859b = vVar;
                this.f100860c = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C1381a(this.f100859b, this.f100860c, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((C1381a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f100858a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    f3 l12 = this.f100859b.l();
                    long j11 = this.f100860c;
                    this.f100858a = 1;
                    if (l12.U(j11, this) == l11) {
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
        public a(long j11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f100857f = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j.this.new a(this.f100857f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
            if (r12 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f100855d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r11.f100853b
                f4.v r0 = (f4.v) r0
                java.lang.Object r0 = r11.f100852a
                kotlin.e.n(r12)
                return r0
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                kotlin.e.n(r12)
                goto L36
            L24:
                kotlin.e.n(r12)
                z5.j r12 = z5.j.this
                h4.c r12 = z5.j.h(r12)
                r11.f100855d = r3
                java.lang.Object r12 = r12.a(r11)
                if (r12 != r0) goto L36
                goto L58
            L36:
                long r3 = r11.f100857f
                r5 = r12
                f4.v r5 = (f4.v) r5
                z5.j$a$a r7 = new z5.j$a$a
                r1 = 0
                r7.<init>(r5, r3, r1)
                r11.f100852a = r12
                java.lang.Object r1 = l00.k.a(r5)
                r11.f100853b = r1
                r1 = 0
                r11.f100854c = r1
                r11.f100855d = r2
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r1 = j.o.a.a(r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L59
            L58:
                return r0
            L59:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$flushRecords$2", f = "StudyRecordRepo.kt", i = {1, 1}, l = {104, 105}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-StudyRecordRepoImpl$flushRecords$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100861a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100862b;

        /* renamed from: c, reason: collision with root package name */
        public int f100863c;

        /* renamed from: d, reason: collision with root package name */
        public int f100864d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<w2> f100866f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$flushRecords$2$1$1", f = "StudyRecordRepo.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f100867a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List<w2> f100868b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f100869c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$flushRecords$2$1$1$1", f = "StudyRecordRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            @u0({"SMAP\nStudyRecordRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl$flushRecords$2$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n774#2:164\n865#2,2:165\n1869#2,2:167\n*S KotlinDebug\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl$flushRecords$2$1$1$1\n*L\n108#1:164\n108#1:165,2\n109#1:167,2\n*E\n"})
            /* renamed from: z5.j$b$a$a, reason: collision with other inner class name */
            public static final class C1382a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f100870a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f100871b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List<w2> f100872c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ v f100873d;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$flushRecords$2$1$1$1$2$1", f = "StudyRecordRepo.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                /* renamed from: z5.j$b$a$a$a, reason: collision with other inner class name */
                public static final class C1383a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f100874a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ v f100875b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ w2 f100876c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1383a(v vVar, w2 w2Var, j00.c<? super C1383a> cVar) {
                        super(2, cVar);
                        this.f100875b = vVar;
                        this.f100876c = w2Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        return new C1383a(this.f100875b, this.f100876c, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                        return ((C1383a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object l11 = kotlin.coroutines.intrinsics.b.l();
                        int i11 = this.f100874a;
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            f3 l12 = this.f100875b.l();
                            w2 w2Var = this.f100876c;
                            this.f100874a = 1;
                            if (l12.X(w2Var, this) == l11) {
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
                public C1382a(List<w2> list, v vVar, j00.c<? super C1382a> cVar) {
                    super(2, cVar);
                    this.f100872c = list;
                    this.f100873d = vVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    C1382a c1382a = new C1382a(this.f100872c, this.f100873d, cVar);
                    c1382a.f100871b = obj;
                    return c1382a;
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                    return ((C1382a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    r0 r0Var = (r0) this.f100871b;
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f100870a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    List<w2> list = this.f100872c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((w2) obj2).q() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    v vVar = this.f100873d;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c40.i.d(r0Var, h1.g(), CoroutineStart.UNDISPATCHED, new C1383a(vVar, (w2) it.next(), null));
                    }
                    return g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<w2> list, v vVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f100868b = list;
                this.f100869c = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f100868b, this.f100869c, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f100867a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    C1382a c1382a = new C1382a(this.f100868b, this.f100869c, null);
                    this.f100867a = 1;
                    if (s0.g(c1382a, this) == l11) {
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
        public b(List<w2> list, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f100866f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j.this.new b(this.f100866f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
            if (r10 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f100864d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r9.f100862b
                f4.v r0 = (f4.v) r0
                java.lang.Object r0 = r9.f100861a
                kotlin.e.n(r10)
                return r0
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                kotlin.e.n(r10)
                goto L36
            L24:
                kotlin.e.n(r10)
                z5.j r10 = z5.j.this
                h4.c r10 = z5.j.h(r10)
                r9.f100864d = r3
                java.lang.Object r10 = r10.a(r9)
                if (r10 != r0) goto L36
                goto L58
            L36:
                java.util.List<f4.w2> r1 = r9.f100866f
                r3 = r10
                f4.v r3 = (f4.v) r3
                z5.j$b$a r5 = new z5.j$b$a
                r4 = 0
                r5.<init>(r1, r3, r4)
                r9.f100861a = r10
                java.lang.Object r1 = l00.k.a(r3)
                r9.f100862b = r1
                r1 = 0
                r9.f100863c = r1
                r9.f100864d = r2
                r4 = 0
                r7 = 1
                r8 = 0
                r6 = r9
                java.lang.Object r1 = j.o.a.a(r3, r4, r5, r6, r7, r8)
                if (r1 != r0) goto L59
            L58:
                return r0
            L59:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$getStudyRecords$2", f = "StudyRecordRepo.kt", i = {}, l = {55, 57}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends w2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100877a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f100879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f100879c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j.this.new c(this.f100879c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<w2>> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r6 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f100877a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                return r6
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L30
            L1e:
                kotlin.e.n(r6)
                z5.j r6 = z5.j.this
                h4.c r6 = z5.j.h(r6)
                r5.f100877a = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L30
                goto L44
            L30:
                f4.v r6 = (f4.v) r6
                f4.f3 r6 = r6.l()
                long r3 = r5.f100879c
                j.j r6 = r6.a0(r3)
                r5.f100877a = r2
                java.lang.Object r6 = k.e.c(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends w2>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<w2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$getStudyRecords$4", f = "StudyRecordRepo.kt", i = {}, l = {67, 69}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends w2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100880a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f100882c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Long> f100883d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j11, List<Long> list, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f100882c = j11;
            this.f100883d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j.this.new d(this.f100882c, this.f100883d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<w2>> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r6 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f100880a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                return r6
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L30
            L1e:
                kotlin.e.n(r6)
                z5.j r6 = z5.j.this
                h4.c r6 = z5.j.h(r6)
                r5.f100880a = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L30
                goto L48
            L30:
                f4.v r6 = (f4.v) r6
                f4.f3 r6 = r6.l()
                long r3 = r5.f100882c
                java.util.List<java.lang.Long> r1 = r5.f100883d
                java.util.Collection r1 = (java.util.Collection) r1
                j.j r6 = r6.d0(r3, r1)
                r5.f100880a = r2
                java.lang.Object r6 = k.e.c(r6, r5)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends w2>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<w2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl", f = "StudyRecordRepo.kt", i = {0}, l = {45}, m = "observeStudyRecords", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f100884a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100885b;

        /* renamed from: d, reason: collision with root package name */
        public int f100887d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f100885b = obj;
            this.f100887d |= Integer.MIN_VALUE;
            return j.this.c(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class f implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f100888a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f100889b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f100890c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f100891a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f100892b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f100893c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f100891a = eVar;
                this.f100892b = cVar;
                this.f100893c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f100891a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f100891a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f100892b.b(this.f100893c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public f(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f100888a = dVar;
            this.f100889b = eVar;
            this.f100890c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f100889b, this.f100890c, this.f100888a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f100888a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$syncRecords$2", f = "StudyRecordRepo.kt", i = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6}, l = {132, 134, 140, 146, 142, 156, 157}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-StudyRecordRepoImpl$syncRecords$2$1", "$this$invokeSuspend_u24lambda_u240", "synRecords", "$i$a$-apply-StudyRecordRepoImpl$syncRecords$2$1", "$this$invokeSuspend_u24lambda_u240", "records", "synRecords", "$i$a$-apply-StudyRecordRepoImpl$syncRecords$2$1", "$this$invokeSuspend_u24lambda_u240", "records", "synRecords", "$i$a$-apply-StudyRecordRepoImpl$syncRecords$2$1", "$this$invokeSuspend_u24lambda_u240", "records", "synRecords", "$i$a$-apply-StudyRecordRepoImpl$syncRecords$2$1", "version", "$this$invokeSuspend_u24lambda_u240", "records", "synRecords", "$i$a$-apply-StudyRecordRepoImpl$syncRecords$2$1", "version"}, s = {"L$2", "I$0", "L$2", "L$3", "I$0", "L$2", "L$3", "L$4", "I$0", "L$2", "L$3", "L$4", "I$0", "L$2", "L$3", "L$4", "I$0", "J$1", "L$1", "L$2", "L$3", "I$0", "J$0"}, v = 1)
    @u0({"SMAP\nStudyRecordRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl$syncRecords$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1563#2:164\n1634#2,3:165\n1563#2:168\n1634#2,3:169\n1563#2:172\n1634#2,3:173\n*S KotlinDebug\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl$syncRecords$2\n*L\n139#1:164\n139#1:165,3\n151#1:168\n151#1:169,3\n156#1:172\n156#1:173,3\n*E\n"})
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100894a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100895b;

        /* renamed from: c, reason: collision with root package name */
        public Object f100896c;

        /* renamed from: d, reason: collision with root package name */
        public Object f100897d;

        /* renamed from: e, reason: collision with root package name */
        public Object f100898e;

        /* renamed from: f, reason: collision with root package name */
        public Object f100899f;

        /* renamed from: g, reason: collision with root package name */
        public Object f100900g;

        /* renamed from: h, reason: collision with root package name */
        public long f100901h;

        /* renamed from: i, reason: collision with root package name */
        public long f100902i;

        /* renamed from: j, reason: collision with root package name */
        public int f100903j;

        /* renamed from: k, reason: collision with root package name */
        public int f100904k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f100905l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f100906m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j11, j jVar, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f100905l = j11;
            this.f100906m = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f100905l, this.f100906m, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x02d1, code lost:
        
            if (r0.b(r1, r11, r4, r25) != r7) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
        
            if (r0 == r7) goto L60;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x026e A[LOOP:0: B:16:0x0268->B:18:0x026e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0203 A[LOOP:1: B:25:0x01fd->B:27:0x0203, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 748
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$updateRecords$2", f = "StudyRecordRepo.kt", i = {1, 1, 1}, l = {78, 80}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-StudyRecordRepoImpl$updateRecords$2$1", "currentTime"}, s = {"L$1", "I$0", "J$0"}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100907a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100908b;

        /* renamed from: c, reason: collision with root package name */
        public int f100909c;

        /* renamed from: d, reason: collision with root package name */
        public long f100910d;

        /* renamed from: e, reason: collision with root package name */
        public int f100911e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<w2> f100913g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f100914h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.StudyRecordRepoImpl$updateRecords$2$1$1", f = "StudyRecordRepo.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {84, 85}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-StudyRecordRepoImpl$updateRecords$2$1$1$2", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-StudyRecordRepoImpl$updateRecords$2$1$1$2"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1", "L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nStudyRecordRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl$updateRecords$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n774#2:164\n865#2,2:165\n1869#2,2:167\n*S KotlinDebug\n*F\n+ 1 StudyRecordRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/StudyRecordRepoImpl$updateRecords$2$1$1\n*L\n82#1:164\n82#1:165,2\n83#1:167,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f100915a;

            /* renamed from: b, reason: collision with root package name */
            public Object f100916b;

            /* renamed from: c, reason: collision with root package name */
            public Object f100917c;

            /* renamed from: d, reason: collision with root package name */
            public Object f100918d;

            /* renamed from: e, reason: collision with root package name */
            public Object f100919e;

            /* renamed from: f, reason: collision with root package name */
            public long f100920f;

            /* renamed from: g, reason: collision with root package name */
            public long f100921g;

            /* renamed from: h, reason: collision with root package name */
            public int f100922h;

            /* renamed from: i, reason: collision with root package name */
            public int f100923i;

            /* renamed from: j, reason: collision with root package name */
            public int f100924j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ List<w2> f100925k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ v f100926l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f100927m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ long f100928n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<w2> list, v vVar, long j11, long j12, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f100925k = list;
                this.f100926l = vVar;
                this.f100927m = j11;
                this.f100928n = j12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f100925k, this.f100926l, this.f100927m, this.f100928n, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0122  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
            /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Iterable] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0122 -> B:6:0x0128). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    Method dump skipped, instructions count: 303
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: z5.j.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<w2> list, long j11, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f100913g = list;
            this.f100914h = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j.this.new h(this.f100913g, this.f100914h, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
        
            if (j.o.a.a(r5, false, r3, r14, 1, null) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r15 == r0) goto L15;
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
                int r1 = r14.f100911e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r14.f100908b
                f4.v r0 = (f4.v) r0
                kotlin.e.n(r15)
                goto L61
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                kotlin.e.n(r15)
                goto L34
            L22:
                kotlin.e.n(r15)
                z5.j r15 = z5.j.this
                h4.c r15 = z5.j.h(r15)
                r14.f100911e = r3
                java.lang.Object r15 = r15.a(r14)
                if (r15 != r0) goto L34
                goto L60
            L34:
                java.util.List<f4.w2> r4 = r14.f100913g
                long r6 = r14.f100914h
                r5 = r15
                f4.v r5 = (f4.v) r5
                long r8 = w3.g.n()
                z5.j$h$a r3 = new z5.j$h$a
                r10 = 0
                r3.<init>(r4, r5, r6, r8, r10)
                r14.f100907a = r15
                java.lang.Object r15 = l00.k.a(r5)
                r14.f100908b = r15
                r15 = 0
                r14.f100909c = r15
                r14.f100910d = r8
                r14.f100911e = r2
                r9 = 0
                r12 = 1
                r13 = 0
                r11 = r14
                r10 = r3
                r8 = r5
                java.lang.Object r15 = j.o.a.a(r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L61
            L60:
                return r0
            L61:
                yz.g2 r15 = yz.g2.f100423a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.j.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(@m80.k h4.c bczDb, @m80.k o5.a versionProvider, @m80.k p thrift) {
        g0.p(bczDb, "bczDb");
        g0.p(versionProvider, "versionProvider");
        g0.p(thrift, "thrift");
        this.f100849a = bczDb;
        this.f100850b = versionProvider;
        this.f100851c = thrift;
    }

    @Override // z5.g
    @l
    public Object a(long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new g(j11, this, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // z5.g
    @l
    public Object b(long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new a(j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // z5.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r5, @m80.k j00.c<? super kotlinx.coroutines.flow.i<? extends java.util.List<f4.w2>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof z5.j.e
            if (r0 == 0) goto L13
            r0 = r7
            z5.j$e r0 = (z5.j.e) r0
            int r1 = r0.f100887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100887d = r1
            goto L18
        L13:
            z5.j$e r0 = new z5.j$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f100885b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f100887d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r5 = r0.f100884a
            kotlin.e.n(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e.n(r7)
            h4.c r7 = r4.f100849a
            r0.f100884a = r5
            r0.f100887d = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            f4.v r7 = (f4.v) r7
            f4.f3 r7 = r7.l()
            j.j r5 = r7.a0(r5)
            kotlinx.coroutines.flow.i r5 = app.cash.sqldelight.coroutines.FlowQuery.f(r5)
            c40.m0 r6 = c4.o.b()
            kotlinx.coroutines.flow.i r5 = app.cash.sqldelight.coroutines.FlowQuery.a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.j.c(long, j00.c):java.lang.Object");
    }

    @Override // z5.g
    @l
    public Object d(long j11, @m80.k List<w2> list, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new h(list, j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // z5.g
    @l
    public Object e(long j11, @m80.k List<w2> list, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new b(list, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // z5.g
    @l
    public Object f(long j11, @m80.k List<Long> list, @m80.k j00.c<? super List<w2>> cVar) {
        return c40.i.h(o.b(), new d(j11, list, null), cVar);
    }

    @Override // z5.g
    @l
    public Object g(long j11, @m80.k j00.c<? super List<w2>> cVar) {
        return c40.i.h(o.b(), new c(j11, null), cVar);
    }

    public final s k() {
        return (s) w7.f.b(new f(o0.d(s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
