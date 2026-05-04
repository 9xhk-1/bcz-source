package u9;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import com.baicizhan.client.business.managers.experience.StudyBehaviourType;
import com.baicizhan.client.business.managers.experience.data.db.AssembleBehaviourRecord;
import com.baicizhan.client.business.managers.experience.data.db.AssembleBehaviourType;
import com.baicizhan.client.business.managers.experience.data.db.StudyBehaviour;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import m80.k;
import org.junit.jupiter.api.j2;
import q9.x;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIExperienceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IExperienceRepo.kt\ncom/baicizhan/client/business/managers/experience/ExpRepoImpl\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,111:1\n47#2,4:112\n47#2,4:116\n*S KotlinDebug\n*F\n+ 1 IExperienceRepo.kt\ncom/baicizhan/client/business/managers/experience/ExpRepoImpl\n*L\n46#1:112,4\n74#1:116,4\n*E\n"})
/* loaded from: classes4.dex */
public final class b implements u9.d {

    /* renamed from: g, reason: collision with root package name */
    public static final int f92017g = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f92018a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w9.a f92019b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final w9.k f92020c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.baicizhan.client.business.managers.experience.data.remote.b f92021d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final aa.a f92022e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final r0 f92023f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 IExperienceRepo.kt\ncom/baicizhan/client/business/managers/experience/ExpRepoImpl\n*L\n1#1,49:1\n75#2,2:50\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements n0 {
        public a(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            qb.c.c(u9.e.f92051a, "", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.ExpRepoImpl$clean$2", f = "IExperienceRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: u9.b$b, reason: collision with other inner class name */
    public static final class C1232b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92024a;

        public C1232b(j00.c<? super C1232b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new C1232b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C1232b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f92024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            b.this.f92020c.a();
            b.this.f92019b.a();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.ExpRepoImpl$spanDay$1", f = "IExperienceRepo.kt", i = {0, 0}, l = {107}, m = "invokeSuspend", n = {"$this$flow", "today"}, s = {"L$0", "I$0"}, v = 1)
    public static final class c extends SuspendLambda implements p<j<? super Boolean>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92026a;

        /* renamed from: b, reason: collision with root package name */
        public int f92027b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f92028c;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = b.this.new c(cVar);
            cVar2.f92028c = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f92028c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92027b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                int c11 = com.baicizhan.client.business.managers.winningstreak.b.c(b.this.f92022e.currentTimeMillis());
                qb.c.i(u9.e.f92051a, "check span day clean count " + b.this.f92020c.c(c11), new Object[0]);
                Boolean a11 = l00.a.a(true);
                this.f92028c = l00.k.a(jVar);
                this.f92026a = c11;
                this.f92027b = 1;
                if (jVar.emit(a11, this) == l11) {
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

        @Override // x00.p
        public final Object invoke(j<? super Boolean> jVar, j00.c<? super g2> cVar) {
            return ((c) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 IExperienceRepo.kt\ncom/baicizhan/client/business/managers/experience/ExpRepoImpl\n*L\n1#1,49:1\n47#2,2:50\n*E\n"})
    public static final class d extends kotlin.coroutines.a implements n0 {
        public d(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            qb.c.c(u9.e.f92051a, "", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.ExpRepoImpl$studyBehaviour$2", f = "IExperienceRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92030a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f92032c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f92033d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f92034e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ StudyBehaviourType f92035f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, int i12, String str, StudyBehaviourType studyBehaviourType, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f92032c = i11;
            this.f92033d = i12;
            this.f92034e = str;
            this.f92035f = studyBehaviourType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new e(this.f92032c, this.f92033d, this.f92034e, this.f92035f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f92030a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            int c11 = com.baicizhan.client.business.managers.winningstreak.b.c(b.this.f92018a.H());
            int b11 = b.this.f92020c.b(this.f92032c, this.f92033d, this.f92034e, c11);
            b bVar = b.this;
            int i11 = this.f92032c;
            int i12 = this.f92033d;
            String str = this.f92034e;
            if (b11 <= 0) {
                bVar.f92020c.d(new StudyBehaviour(0L, i11, i12, str, c11, 0L, 33, null));
            }
            boolean z11 = b11 <= 0;
            long b12 = b.this.f92019b.b(new AssembleBehaviourRecord(0L, this.f92034e, (z11 && this.f92035f == StudyBehaviourType.Right) ? AssembleBehaviourType.FirstRight : (z11 || this.f92035f != StudyBehaviourType.Right) ? (z11 && this.f92035f == StudyBehaviourType.Wrong) ? AssembleBehaviourType.FirstWrong : (z11 || this.f92035f != StudyBehaviourType.Wrong) ? AssembleBehaviourType.Nothing : AssembleBehaviourType.Wrong : AssembleBehaviourType.Right, 0L, 9, null));
            qb.c.i(u9.e.f92051a, "[" + this.f92032c + j2.O + this.f92033d + j2.O + this.f92034e + j2.O + this.f92035f + "] result behaviour " + b12, new Object[0]);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.ExpRepoImpl$sync$1", f = "IExperienceRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements p<Boolean, j00.c<? super kotlinx.coroutines.flow.i<? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92036a;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new f(cVar);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super kotlinx.coroutines.flow.i<? extends Boolean>> cVar) {
            return invoke(bool.booleanValue(), (j00.c<? super kotlinx.coroutines.flow.i<Boolean>>) cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f92036a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return b.this.k();
        }

        public final Object invoke(boolean z11, j00.c<? super kotlinx.coroutines.flow.i<Boolean>> cVar) {
            return ((f) create(Boolean.valueOf(z11), cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.experience.ExpRepoImpl$upload$1", f = "IExperienceRepo.kt", i = {0, 0, 0, 0, 1}, l = {94, 99}, m = "invokeSuspend", n = {"$this$flow", "records", "toSubmit", "$i$a$-also-ExpRepoImpl$upload$1$3", "$this$flow"}, s = {"L$0", "L$3", "L$4", "I$0", "L$0"}, v = 1)
    @u0({"SMAP\nIExperienceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IExperienceRepo.kt\ncom/baicizhan/client/business/managers/experience/ExpRepoImpl$upload$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n774#2:112\n865#2,2:113\n1803#2,3:116\n1#3:115\n*S KotlinDebug\n*F\n+ 1 IExperienceRepo.kt\ncom/baicizhan/client/business/managers/experience/ExpRepoImpl$upload$1\n*L\n84#1:112\n84#1:113,2\n85#1:116,3\n*E\n"})
    public static final class g extends SuspendLambda implements p<j<? super Boolean>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f92038a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92039b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92040c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92041d;

        /* renamed from: e, reason: collision with root package name */
        public int f92042e;

        /* renamed from: f, reason: collision with root package name */
        public int f92043f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f92044g;

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = b.this.new g(cVar);
            gVar.f92044g = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0131, code lost:
        
            if (r9 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0154, code lost:
        
            if (r0.emit(r15, r14) == r1) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u9.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(j<? super Boolean> jVar, j00.c<? super g2> cVar) {
            return ((g) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @Inject
    public b(@k x studyMgr, @k w9.a assembleDao, @k w9.k studyBehaviourDao, @k com.baicizhan.client.business.managers.experience.data.remote.b expRemote, @k aa.a time) {
        g0.p(studyMgr, "studyMgr");
        g0.p(assembleDao, "assembleDao");
        g0.p(studyBehaviourDao, "studyBehaviourDao");
        g0.p(expRemote, "expRemote");
        g0.p(time, "time");
        this.f92018a = studyMgr;
        this.f92019b = assembleDao;
        this.f92020c = studyBehaviourDao;
        this.f92021d = expRemote;
        this.f92022e = time;
        this.f92023f = s0.a(h1.c().plus(l3.c(null, 1, null)));
    }

    @Override // u9.d
    @k
    public kotlinx.coroutines.flow.i<Boolean> a() {
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.C0(j(), new f(null)), h1.c());
    }

    @Override // u9.d
    public void b() {
        c40.k.f(this.f92023f, new a(n0.f7891d0), null, new C1232b(null), 2, null);
    }

    @Override // u9.d
    public void c(int i11, int i12, @k String questionType, @k StudyBehaviourType behaviourType) {
        g0.p(questionType, "questionType");
        g0.p(behaviourType, "behaviourType");
        c40.k.f(this.f92023f, new d(n0.f7891d0), null, new e(i11, i12, questionType, behaviourType, null), 2, null);
    }

    public final kotlinx.coroutines.flow.i<Boolean> j() {
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.K0(new c(null)), h1.c());
    }

    public final kotlinx.coroutines.flow.i<Boolean> k() {
        return kotlinx.coroutines.flow.k.K0(new g(null));
    }
}
