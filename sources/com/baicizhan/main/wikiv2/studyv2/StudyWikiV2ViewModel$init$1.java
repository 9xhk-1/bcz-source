package com.baicizhan.main.wikiv2.studyv2;

import android.content.Context;
import c40.r0;
import com.baicizhan.main.wikiv2.studyv2.data.h0;
import com.baicizhan.main.wikiv2.studyv2.data.k0;
import com.baicizhan.main.wikiv2.studyv2.data.p0;
import com.baicizhan.main.wikiv2.studyv2.data.s0;
import com.baicizhan.main.wikiv2.studyv2.data.w0;
import com.baicizhan.main.wikiv2.studyv2.data.y;
import com.baicizhan.main.wikiv2.studyv2.data.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1", f = "StudyWikiV2ViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
public final class StudyWikiV2ViewModel$init$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StudyWikiV2ViewModel f25945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25947d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$1", f = "StudyWikiV2ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements q<kotlinx.coroutines.flow.j<? super List<?>>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25951a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25952b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ StudyWikiV2ViewModel f25953c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StudyWikiV2ViewModel studyWikiV2ViewModel, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f25953c = studyWikiV2ViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f25952b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25951a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.d(StudyWikiV2ViewModel.f25926p, "load wiki data error:" + th2.getMessage(), new Object[0]);
            this.f25953c.i().postValue(l00.a.a(false));
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super List<?>> jVar, Throwable th2, j00.c<? super g2> cVar) {
            a aVar = new a(this.f25953c, cVar);
            aVar.f25952b = th2;
            return aVar.invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyWikiV2ViewModel$init$1(StudyWikiV2ViewModel studyWikiV2ViewModel, Context context, boolean z11, j00.c<? super StudyWikiV2ViewModel$init$1> cVar) {
        super(2, cVar);
        this.f25945b = studyWikiV2ViewModel;
        this.f25946c = context;
        this.f25947d = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new StudyWikiV2ViewModel$init$1(this.f25945b, this.f25946c, this.f25947d, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((StudyWikiV2ViewModel$init$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f25944a;
        if (i11 == 0) {
            kotlin.e.n(obj);
            this.f25945b.i().postValue(l00.a.a(true));
            kotlinx.coroutines.flow.i v11 = kotlinx.coroutines.flow.k.v(new com.baicizhan.main.wikiv2.studyv2.data.r0().a(this.f25946c, this.f25945b.f(), this.f25945b.m(), this.f25947d), new a(this.f25945b, null));
            final StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25945b;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1.2

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @u0({"SMAP\nStudyWikiV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyWikiV2ViewModel.kt\ncom/baicizhan/main/wikiv2/studyv2/StudyWikiV2ViewModel$init$1$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1869#2,2:192\n*S KotlinDebug\n*F\n+ 1 StudyWikiV2ViewModel.kt\ncom/baicizhan/main/wikiv2/studyv2/StudyWikiV2ViewModel$init$1$2$2\n*L\n98#1:192,2\n*E\n"})
                /* renamed from: com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$a */
                public static final class a<T> implements kotlinx.coroutines.flow.j {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ StudyWikiV2ViewModel f25949a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ List<?> f25950b;

                    public a(StudyWikiV2ViewModel studyWikiV2ViewModel, List<?> list) {
                        this.f25949a = studyWikiV2ViewModel;
                        this.f25950b = list;
                    }

                    public final Object a(boolean z11, j00.c<? super g2> cVar) {
                        y yVar;
                        Object obj;
                        T t11;
                        Map map;
                        qb.c.i(StudyWikiV2ViewModel.f25926p, "wiki load state " + z11 + ", wiki start render", new Object[0]);
                        this.f25949a.w(true);
                        List<Object> d62 = a00.r0.d6(this.f25950b);
                        List<Object> list = d62;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            yVar = null;
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (obj instanceof h0) {
                                break;
                            }
                        }
                        if (obj != null) {
                            StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25949a;
                            int indexOf = d62.indexOf(obj);
                            d62.add(indexOf, new w0(a00.h0.Q("全部释义", "考义")));
                            map = studyWikiV2ViewModel.f25937k;
                            map.put(l00.a.f(indexOf + 1), l00.a.f(((h0) obj).h()));
                        }
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t11 = null;
                                break;
                            }
                            t11 = it2.next();
                            if (t11 instanceof z) {
                                break;
                            }
                        }
                        if (t11 != null) {
                            StudyWikiV2ViewModel studyWikiV2ViewModel2 = this.f25949a;
                            List<y> d11 = ((z) t11).d();
                            int indexOf2 = d62.indexOf(t11);
                            ArrayList arrayList = new ArrayList();
                            List<y> list2 = d11;
                            Iterator<T> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((y) it3.next()).d());
                            }
                            g2 g2Var = g2.f100423a;
                            d62.add(indexOf2, new s0(arrayList));
                            Iterator<T> it4 = list2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                T next = it4.next();
                                if (((y) next) instanceof k0) {
                                    yVar = next;
                                    break;
                                }
                            }
                            y yVar2 = yVar;
                            if (yVar2 != null) {
                                studyWikiV2ViewModel2.j().n((k0) yVar2);
                            }
                        }
                        this.f25949a.h().postValue(d62);
                        this.f25949a.i().postValue(l00.a.a(false));
                        qb.c.b(StudyWikiV2ViewModel.f25926p, "wiki update finish", new Object[0]);
                        return g2.f100423a;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj, j00.c cVar) {
                        return a(((Boolean) obj).booleanValue(), cVar);
                    }
                }

                @Override // kotlinx.coroutines.flow.j
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<?> list, j00.c<? super g2> cVar) {
                    qb.c.b(StudyWikiV2ViewModel.f25926p, "load wiki data success:" + list, new Object[0]);
                    final kotlinx.coroutines.flow.y<Boolean> a11 = p0.f26080a.a();
                    final StudyWikiV2ViewModel studyWikiV2ViewModel2 = StudyWikiV2ViewModel.this;
                    Object collect = new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1

                        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                        @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StudyWikiV2ViewModel.kt\ncom/baicizhan/main/wikiv2/studyv2/StudyWikiV2ViewModel$init$1$2\n*L\n1#1,49:1\n18#2:50\n19#2:52\n71#3:51\n*E\n"})
                        /* renamed from: com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                            /* renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ kotlinx.coroutines.flow.j f25942a;

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ StudyWikiV2ViewModel f25943b;

                            @l00.d(c = "com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1$2", f = "StudyWikiV2ViewModel.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                            /* renamed from: com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(kotlinx.coroutines.flow.j jVar, StudyWikiV2ViewModel studyWikiV2ViewModel) {
                                this.f25942a = jVar;
                                this.f25943b = studyWikiV2ViewModel;
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
                                    boolean r0 = r6 instanceof com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r6
                                    com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1$2$1 r0 = (com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1$2$1 r0 = new com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1$2$1
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
                                    com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1$2$1 r5 = (com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                                    kotlin.e.n(r6)
                                    goto L73
                                L31:
                                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                    r5.<init>(r6)
                                    throw r5
                                L39:
                                    kotlin.e.n(r6)
                                    kotlinx.coroutines.flow.j r6 = r4.f25942a
                                    r2 = r5
                                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                                    boolean r2 = r2.booleanValue()
                                    if (r2 == 0) goto L73
                                    com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel r2 = r4.f25943b
                                    boolean r2 = r2.p()
                                    if (r2 != 0) goto L73
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
                                    if (r5 != r1) goto L73
                                    return r1
                                L73:
                                    yz.g2 r5 = yz.g2.f100423a
                                    return r5
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel$init$1$2$emit$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                            }
                        }

                        @Override // kotlinx.coroutines.flow.i
                        public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar2, j00.c cVar2) {
                            Object collect2 = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar2, studyWikiV2ViewModel2), cVar2);
                            return collect2 == kotlin.coroutines.intrinsics.b.l() ? collect2 : g2.f100423a;
                        }
                    }.collect(new a(StudyWikiV2ViewModel.this, list), cVar);
                    return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
                }
            };
            this.f25944a = 1;
            if (v11.collect(jVar, this) == l11) {
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
