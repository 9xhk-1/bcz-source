package com.baicizhan.main.home.plan.newexam;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.managers.experience.TaskAction;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import com.baicizhan.main.home.plan.newexam.c;
import com.baicizhan.main.rx.BookAdObservables;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@kotlin.jvm.internal.u0({"SMAP\nExamVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamVM.kt\ncom/baicizhan/main/home/plan/newexam/ExamVM\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n17#2:214\n19#2:218\n46#3:215\n51#3:217\n105#4:216\n1#5:219\n1563#6:220\n1634#6,3:221\n1563#6:224\n1634#6,3:225\n*S KotlinDebug\n*F\n+ 1 ExamVM.kt\ncom/baicizhan/main/home/plan/newexam/ExamVM\n*L\n66#1:214\n66#1:218\n66#1:215\n66#1:217\n66#1:216\n158#1:220\n158#1:221,3\n185#1:224\n185#1:225,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ExamVM extends ViewModel {

    /* renamed from: j, reason: collision with root package name */
    public static final int f22510j = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final qg.a f22511a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final qg.s0 f22512b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final qg.l0 f22513c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final u9.f f22514d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<Boolean> f22515e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.x<th.a> f22516f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.x<Boolean> f22517g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.x<com.baicizhan.main.home.plan.newexam.c> f22518h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.m0<com.baicizhan.main.home.plan.newexam.c> f22519i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements x00.q<Pair<? extends JsModel, ? extends String>, th.a, j00.c<? super com.baicizhan.main.home.plan.newexam.c>, Object>, l00.l {
        public a(Object obj) {
            super(3, obj, ExamVM.class, "mapToUi", "mapToUi(Lkotlin/Pair;Lcom/baicizhan/main/rx/BookAdKt;)Lcom/baicizhan/main/home/plan/newexam/CardState;", 4);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair<? extends JsModel, String> pair, th.a aVar, j00.c<? super com.baicizhan.main.home.plan.newexam.c> cVar) {
            return ExamVM.a((ExamVM) this.receiver, pair, aVar, cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$2", f = "ExamVM.kt", i = {0}, l = {57}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<com.baicizhan.main.home.plan.newexam.c, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22522a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22523b;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            b bVar = ExamVM.this.new b(cVar);
            bVar.f22523b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.baicizhan.main.home.plan.newexam.c cVar, j00.c<? super yz.g2> cVar2) {
            return ((b) create(cVar, cVar2)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.baicizhan.main.home.plan.newexam.c cVar = (com.baicizhan.main.home.plan.newexam.c) this.f22523b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22522a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.x xVar = ExamVM.this.f22518h;
                this.f22523b = l00.k.a(cVar);
                this.f22522a = 1;
                if (xVar.emit(cVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$3", f = "ExamVM.kt", i = {0, 0, 0, 0}, l = {62}, m = "invokeSuspend", n = {"it", "up", "main", "$i$a$-also-ExamVM$3$2"}, s = {"L$1", "Z$0", "Z$1", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nExamVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamVM.kt\ncom/baicizhan/main/home/plan/newexam/ExamVM$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
    public static final class c extends SuspendLambda implements x00.q<Boolean, Boolean, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22525a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22526b;

        /* renamed from: c, reason: collision with root package name */
        public int f22527c;

        /* renamed from: d, reason: collision with root package name */
        public int f22528d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ boolean f22529e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ boolean f22530f;

        public c(j00.c<? super c> cVar) {
            super(3, cVar);
        }

        public final Object i(boolean z11, boolean z12, j00.c<? super Boolean> cVar) {
            c cVar2 = ExamVM.this.new c(cVar);
            cVar2.f22529e = z11;
            cVar2.f22530f = z12;
            return cVar2.invokeSuspend(yz.g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, j00.c<? super Boolean> cVar) {
            return i(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f22529e;
            boolean z12 = this.f22530f;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22528d;
            boolean z13 = false;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ExamVM examVM = ExamVM.this;
                ExamVM examVM2 = !z12 ? examVM : null;
                if (examVM2 != null) {
                    kotlinx.coroutines.flow.x xVar = examVM.f22517g;
                    Boolean a11 = l00.a.a(true);
                    this.f22525a = examVM2;
                    this.f22526b = l00.k.a(examVM2);
                    this.f22529e = z11;
                    this.f22530f = z12;
                    this.f22527c = 0;
                    this.f22528d = 1;
                    if (xVar.emit(a11, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            qb.c.i(d2.f22630a, "refresh " + z11 + " ,main " + z12, new Object[0]);
            if (z12 && z11) {
                z13 = true;
            }
            return l00.a.a(z13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$5", f = "ExamVM.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<Boolean, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22532a;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return ExamVM.this.new d(cVar);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super yz.g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22532a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ExamVM examVM = ExamVM.this;
                this.f22532a = 1;
                if (examVM.j(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }

        public final Object invoke(boolean z11, j00.c<? super yz.g2> cVar) {
            return ((d) create(Boolean.valueOf(z11), cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$6", f = "ExamVM.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<Boolean, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22534a;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return ExamVM.this.new e(cVar);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super yz.g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22534a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.x xVar = ExamVM.this.f22517g;
                Boolean a11 = l00.a.a(false);
                this.f22534a = 1;
                if (xVar.emit(a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }

        public final Object invoke(boolean z11, j00.c<? super yz.g2> cVar) {
            return ((e) create(Boolean.valueOf(z11), cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$7", f = "ExamVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super Boolean>, Throwable, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22536a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22537b;

        public f(j00.c<? super f> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f22537b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22536a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(d2.f22630a, "", th2);
            return yz.g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super Boolean> jVar, Throwable th2, j00.c<? super yz.g2> cVar) {
            f fVar = new f(cVar);
            fVar.f22537b = th2;
            return fVar.invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$cardState$1", f = "ExamVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.q<com.baicizhan.main.home.plan.newexam.c, Boolean, j00.c<? super com.baicizhan.main.home.plan.newexam.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22538a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22539b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f22540c;

        public g(j00.c<? super g> cVar) {
            super(3, cVar);
        }

        public final Object i(com.baicizhan.main.home.plan.newexam.c cVar, boolean z11, j00.c<? super com.baicizhan.main.home.plan.newexam.c> cVar2) {
            g gVar = new g(cVar2);
            gVar.f22539b = cVar;
            gVar.f22540c = z11;
            return gVar.invokeSuspend(yz.g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(com.baicizhan.main.home.plan.newexam.c cVar, Boolean bool, j00.c<? super com.baicizhan.main.home.plan.newexam.c> cVar2) {
            return i(cVar, bool.booleanValue(), cVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.baicizhan.main.home.plan.newexam.c cVar = (com.baicizhan.main.home.plan.newexam.c) this.f22539b;
            boolean z11 = this.f22540c;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22538a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (!z11) {
                return cVar;
            }
            return new c.e(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$refresh$2", f = "ExamVM.kt", i = {0, 0, 0}, l = {83}, m = "invokeSuspend", n = {"it", "needLoading", "$i$a$-also-ExamVM$refresh$2$2"}, s = {"L$1", "Z$0", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nExamVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamVM.kt\ncom/baicizhan/main/home/plan/newexam/ExamVM$refresh$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
    public static final class h extends SuspendLambda implements x00.p<Boolean, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22541a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22542b;

        /* renamed from: c, reason: collision with root package name */
        public int f22543c;

        /* renamed from: d, reason: collision with root package name */
        public int f22544d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ boolean f22545e;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            h hVar = ExamVM.this.new h(cVar);
            hVar.f22545e = ((Boolean) obj).booleanValue();
            return hVar;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super yz.g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f22545e;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22544d;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ExamVM examVM = ExamVM.this;
                ExamVM examVM2 = z11 ? examVM : null;
                if (examVM2 != null) {
                    kotlinx.coroutines.flow.x xVar = examVM.f22517g;
                    Boolean a11 = l00.a.a(true);
                    this.f22541a = examVM2;
                    this.f22542b = l00.k.a(examVM2);
                    this.f22545e = z11;
                    this.f22543c = 0;
                    this.f22544d = 1;
                    if (xVar.emit(a11, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }

        public final Object invoke(boolean z11, j00.c<? super yz.g2> cVar) {
            return ((h) create(Boolean.valueOf(z11), cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$refresh$3", f = "ExamVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super Boolean>, Throwable, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22547a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22548b;

        public i(j00.c<? super i> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f22548b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22547a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            q9.x.r().a(4);
            pg.u0.f80487a.o().postValue(th2);
            qb.c.c(d2.f22630a, "", th2);
            return yz.g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super Boolean> jVar, Throwable th2, j00.c<? super yz.g2> cVar) {
            i iVar = new i(cVar);
            iVar.f22548b = th2;
            return iVar.invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$refreshAd$1", f = "ExamVM.kt", i = {0, 0, 1, 1}, l = {110, 111}, m = "invokeSuspend", n = {"$this$flow", "book", "$this$flow", "book"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super Boolean>, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22549a;

        /* renamed from: b, reason: collision with root package name */
        public int f22550b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22551c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$refreshAd$1$1", f = "ExamVM.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f22553a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExamVM f22554b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ExamVM examVM, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f22554b = examVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f22554b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f22553a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    kotlinx.coroutines.flow.x xVar = this.f22554b.f22516f;
                    this.f22553a = 1;
                    if (xVar.emit(null, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$refreshAd$1$2", f = "ExamVM.kt", i = {0}, l = {103}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
        public static final class b extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super BookAdObservables.BookAdInfo>, Throwable, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f22555a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f22556b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExamVM f22557c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ExamVM examVM, j00.c<? super b> cVar) {
                super(3, cVar);
                this.f22557c = examVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Throwable th2 = (Throwable) this.f22556b;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f22555a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    kotlinx.coroutines.flow.x xVar = this.f22557c.f22516f;
                    this.f22556b = th2;
                    this.f22555a = 1;
                    if (xVar.emit(null, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                qb.c.c(d2.f22630a, "book ad info: ", th2);
                return yz.g2.f100423a;
            }

            @Override // x00.q
            public final Object invoke(kotlinx.coroutines.flow.j<? super BookAdObservables.BookAdInfo> jVar, Throwable th2, j00.c<? super yz.g2> cVar) {
                b bVar = new b(this.f22557c, cVar);
                bVar.f22556b = th2;
                return bVar.invokeSuspend(yz.g2.f100423a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$refreshAd$1$3", f = "ExamVM.kt", i = {0}, l = {107}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
        public static final class c extends SuspendLambda implements x00.p<BookAdObservables.BookAdInfo, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f22558a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f22559b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExamVM f22560c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ExamVM examVM, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f22560c = examVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                c cVar2 = new c(this.f22560c, cVar);
                cVar2.f22559b = obj;
                return cVar2;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(BookAdObservables.BookAdInfo bookAdInfo, j00.c<? super yz.g2> cVar) {
                return ((c) create(bookAdInfo, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                BookAdObservables.BookAdInfo bookAdInfo = (BookAdObservables.BookAdInfo) this.f22559b;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f22558a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    kotlinx.coroutines.flow.x xVar = this.f22560c.f22516f;
                    th.a b11 = bookAdInfo != null ? com.baicizhan.main.rx.a.b(bookAdInfo) : null;
                    this.f22559b = bookAdInfo;
                    this.f22558a = 1;
                    if (xVar.emit(b11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                qb.c.i(d2.f22630a, "refreshAd " + (bookAdInfo != null ? bookAdInfo.toString() : null), new Object[0]);
                return yz.g2.f100423a;
            }
        }

        public j(j00.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            j jVar = ExamVM.this.new j(cVar);
            jVar.f22551c = obj;
            return jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x009c, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            if (kotlinx.coroutines.flow.k.z(r9, r8) == r1) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f22551c
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r8.f22550b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r8.f22549a
                com.baicizhan.client.business.dataset.models.BookRecord r0 = (com.baicizhan.client.business.dataset.models.BookRecord) r0
                kotlin.e.n(r9)
                goto L9f
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r2 = r8.f22549a
                com.baicizhan.client.business.dataset.models.BookRecord r2 = (com.baicizhan.client.business.dataset.models.BookRecord) r2
                kotlin.e.n(r9)
                goto L86
            L2b:
                kotlin.e.n(r9)
                q9.x r9 = q9.x.r()
                com.baicizhan.client.business.dataset.models.BookRecord r2 = r9.k()
                r9 = 0
                if (r2 != 0) goto L50
                com.baicizhan.main.home.plan.newexam.ExamVM r0 = com.baicizhan.main.home.plan.newexam.ExamVM.this
                c40.r0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
                com.baicizhan.main.home.plan.newexam.ExamVM$j$a r4 = new com.baicizhan.main.home.plan.newexam.ExamVM$j$a
                com.baicizhan.main.home.plan.newexam.ExamVM r0 = com.baicizhan.main.home.plan.newexam.ExamVM.this
                r4.<init>(r0, r9)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                c40.i.e(r1, r2, r3, r4, r5, r6)
                yz.g2 r9 = yz.g2.f100423a
                return r9
            L50:
                int r5 = r2.bookId
                rx.c r5 = com.baicizhan.main.rx.BookAdObservables.h(r5)
                java.lang.String r6 = "queryBookAd(...)"
                kotlin.jvm.internal.g0.o(r5, r6)
                kotlinx.coroutines.flow.i r5 = com.baicizhan.client.business.util.RxFlowUtilsKt.asFlow(r5)
                com.baicizhan.main.home.plan.newexam.ExamVM$j$b r6 = new com.baicizhan.main.home.plan.newexam.ExamVM$j$b
                com.baicizhan.main.home.plan.newexam.ExamVM r7 = com.baicizhan.main.home.plan.newexam.ExamVM.this
                r6.<init>(r7, r9)
                kotlinx.coroutines.flow.i r5 = kotlinx.coroutines.flow.k.v(r5, r6)
                com.baicizhan.main.home.plan.newexam.ExamVM$j$c r6 = new com.baicizhan.main.home.plan.newexam.ExamVM$j$c
                com.baicizhan.main.home.plan.newexam.ExamVM r7 = com.baicizhan.main.home.plan.newexam.ExamVM.this
                r6.<init>(r7, r9)
                kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.k.h1(r5, r6)
                r8.f22551c = r0
                java.lang.Object r5 = l00.k.a(r2)
                r8.f22549a = r5
                r8.f22550b = r4
                java.lang.Object r9 = kotlinx.coroutines.flow.k.z(r9, r8)
                if (r9 != r1) goto L86
                goto L9e
            L86:
                java.lang.Boolean r9 = l00.a.a(r4)
                java.lang.Object r4 = l00.k.a(r0)
                r8.f22551c = r4
                java.lang.Object r2 = l00.k.a(r2)
                r8.f22549a = r2
                r8.f22550b = r3
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L9f
            L9e:
                return r1
            L9f:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.newexam.ExamVM.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c<? super yz.g2> cVar) {
            return ((j) create(jVar, cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public ExamVM(@m80.k qg.a doExamStateRefreshUC, @m80.k qg.s0 getExamStateUC, @m80.k qg.l0 jsMgr, @m80.k u9.f taksRepo) {
        kotlin.jvm.internal.g0.p(doExamStateRefreshUC, "doExamStateRefreshUC");
        kotlin.jvm.internal.g0.p(getExamStateUC, "getExamStateUC");
        kotlin.jvm.internal.g0.p(jsMgr, "jsMgr");
        kotlin.jvm.internal.g0.p(taksRepo, "taksRepo");
        this.f22511a = doExamStateRefreshUC;
        this.f22512b = getExamStateUC;
        this.f22513c = jsMgr;
        this.f22514d = taksRepo;
        pg.u0 u0Var = pg.u0.f80487a;
        kotlinx.coroutines.flow.i<Boolean> v02 = kotlinx.coroutines.flow.k.v0(FlowLiveDataConversions.asFlow(u0Var.q()));
        this.f22515e = v02;
        kotlinx.coroutines.flow.x<th.a> b11 = kotlinx.coroutines.flow.e0.b(0, 0, null, 7, null);
        this.f22516f = b11;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        kotlinx.coroutines.flow.x<Boolean> a11 = kotlinx.coroutines.flow.e0.a(1, 1, bufferOverflow);
        this.f22517g = a11;
        kotlinx.coroutines.flow.x<com.baicizhan.main.home.plan.newexam.c> a12 = kotlinx.coroutines.flow.e0.a(1, 1, bufferOverflow);
        this.f22518h = a12;
        this.f22519i = kotlinx.coroutines.flow.k.Q1(kotlinx.coroutines.flow.k.I(a12, a11, new g(null)), ViewModelKt.getViewModelScope(this), h0.a.b(kotlinx.coroutines.flow.h0.f68148a, 0L, 0L, 3, null), new c.e(null, 1, 0 == true ? 1 : 0));
        qb.c.i(d2.f22630a, "", new Object[0]);
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.j2(getExamStateUC.a(), b11, new a(this)), c40.h1.c()), new b(null)), ViewModelKt.getViewModelScope(this));
        final kotlinx.coroutines.flow.i I = kotlinx.coroutines.flow.k.I(kotlinx.coroutines.flow.k.c1(jsMgr.W(), u0Var.p()), v02, new c(null));
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.h1(new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ExamVM.kt\ncom/baicizhan/main/home/plan/newexam/ExamVM\n*L\n1#1,49:1\n18#2:50\n19#2:52\n66#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f22521a;

                @l00.d(c = "com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1$2", f = "ExamVM.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f22521a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, j00.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1$2$1 r0 = (com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1$2$1 r0 = new com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.L$3
                        kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                        java.lang.Object r5 = r0.L$1
                        com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1$2$1 r5 = (com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                        kotlin.e.n(r6)
                        goto L6b
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f22521a
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L6b
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$2 = r2
                        java.lang.Object r2 = l00.k.a(r6)
                        r0.L$3 = r2
                        r2 = 0
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L6b
                        return r1
                    L6b:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.newexam.ExamVM$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : yz.g2.f100423a;
            }
        }, new d(null)), new e(null)), c40.h1.c()), new f(null)), ViewModelKt.getViewModelScope(this));
    }

    public static final /* synthetic */ Object a(ExamVM examVM, Pair pair, th.a aVar, j00.c cVar) {
        return examVM.i(pair, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(j00.c<? super yz.g2> cVar) {
        Object z11 = kotlinx.coroutines.flow.k.z(kotlinx.coroutines.flow.k.c1(k(), kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.h1(this.f22511a.d(), new h(null)), new i(null))), cVar);
        return z11 == kotlin.coroutines.intrinsics.b.l() ? z11 : yz.g2.f100423a;
    }

    private final kotlinx.coroutines.flow.i<Boolean> k() {
        return kotlinx.coroutines.flow.k.K0(new j(null));
    }

    @m80.k
    public final kotlinx.coroutines.flow.m0<com.baicizhan.main.home.plan.newexam.c> h() {
        return this.f22519i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.baicizhan.main.home.plan.newexam.c i(kotlin.Pair<? extends com.baicizhan.main.home.plan.module.exam.JsModel, java.lang.String> r35, th.a r36) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.newexam.ExamVM.i(kotlin.Pair, th.a):com.baicizhan.main.home.plan.newexam.c");
    }

    public final void l(int i11) {
        pg.u0.f80487a.E(i11);
        u9.f.d(this.f22514d, TaskAction.WantMoreClick, false, i11, 2, null);
    }
}
