package com.baicizhan.main.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c40.a1;
import c40.r0;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.managers.experience.TaskAction;
import com.baicizhan.client.business.util.RxFlowUtilsKt;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.FastTestActivity;
import com.baicizhan.main.selftest.FastTestStrategy;
import com.baicizhan.main.selftest.b;
import com.jiongji.andriod.card.R;
import fd.x0;
import java.util.List;
import javax.inject.Inject;
import kc.d;
import kc.u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import w00.o;
import x00.p;
import yh.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFastTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestActivity.kt\ncom/baicizhan/main/activity/FastTestActivity\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,509:1\n55#2,11:510\n557#3:521\n554#3,6:522\n1247#4,3:528\n1250#4,3:532\n1247#4,6:535\n1247#4,6:541\n1247#4,6:547\n1247#4,6:553\n1247#4,6:559\n1247#4,6:565\n1247#4,6:571\n1247#4,6:577\n1247#4,6:583\n1247#4,6:589\n1247#4,6:595\n555#5:531\n78#6:601\n107#6,2:602\n1#7:604\n64#8,5:605\n*S KotlinDebug\n*F\n+ 1 FastTestActivity.kt\ncom/baicizhan/main/activity/FastTestActivity\n*L\n113#1:510,11\n115#1:521\n115#1:522,6\n115#1:528,3\n115#1:532,3\n116#1:535,6\n129#1:541,6\n155#1:547,6\n198#1:553,6\n212#1:559,6\n213#1:565,6\n216#1:571,6\n217#1:577,6\n221#1:583,6\n229#1:589,6\n244#1:595,6\n115#1:531\n116#1:601\n116#1:602,2\n239#1:605,5\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class FastTestActivity extends Hilt_FastTestActivity {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f17888h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f17889i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f17890j = FastTestActivity.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    public boolean f17891f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public u9.f f17892g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        public final void a(@m80.k Context context) {
            g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) FastTestActivity.class));
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$1$1", f = "FastTestActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17893a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17894b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FastTestActivity f17895c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$1$1$1$3$1", f = "FastTestActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements p<a.e, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f17896a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FastTestActivity f17897b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FastTestActivity fastTestActivity, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f17897b = fastTestActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f17897b, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a.e eVar, j00.c<? super g2> cVar) {
                return ((a) create(eVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f17896a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                this.f17897b.finish();
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$1$1$2$1$1", f = "FastTestActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.main.activity.FastTestActivity$b$b, reason: collision with other inner class name */
        public static final class C0281b extends SuspendLambda implements p<a.e, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f17898a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FastTestActivity f17899b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0281b(FastTestActivity fastTestActivity, j00.c<? super C0281b> cVar) {
                super(2, cVar);
                this.f17899b = fastTestActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0281b(this.f17899b, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a.e eVar, j00.c<? super g2> cVar) {
                return ((C0281b) create(eVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f17898a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                this.f17899b.finish();
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.baicizhan.main.selftest.a aVar, FastTestActivity fastTestActivity, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f17894b = aVar;
            this.f17895c = fastTestActivity;
        }

        public static final g2 C(com.baicizhan.main.selftest.a aVar, FastTestActivity fastTestActivity, View view) {
            com.baicizhan.main.selftest.a.M(aVar, null, new a(fastTestActivity, null), 1, null);
            return g2.f100423a;
        }

        public static final g2 D(final com.baicizhan.main.selftest.a aVar, final FastTestActivity fastTestActivity, u.a aVar2) {
            aVar2.U(R.string.selftest_all_tested);
            d.a.I(aVar2, R.string.selftest_all_tested_positive, null, new x00.l() { // from class: fd.f0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 F;
                    F = FastTestActivity.b.F(com.baicizhan.main.selftest.a.this, fastTestActivity, (View) obj);
                    return F;
                }
            }, 2, null);
            aVar2.o(R.string.selftest_all_tested_negative, new x00.l() { // from class: fd.g0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 G;
                    G = FastTestActivity.b.G(com.baicizhan.main.selftest.a.this, (View) obj);
                    return G;
                }
            });
            return g2.f100423a;
        }

        public static final g2 F(com.baicizhan.main.selftest.a aVar, FastTestActivity fastTestActivity, View view) {
            com.baicizhan.main.selftest.a.M(aVar, null, new C0281b(fastTestActivity, null), 1, null);
            return g2.f100423a;
        }

        public static final g2 G(com.baicizhan.main.selftest.a aVar, View view) {
            aVar.J();
            return g2.f100423a;
        }

        public static final g2 u(final com.baicizhan.main.selftest.a aVar, final com.baicizhan.main.selftest.b bVar, final FastTestActivity fastTestActivity, u.a aVar2) {
            aVar2.U(R.string.selftest_today_tested);
            aVar2.b0(ButtonType.TRIPLE);
            aVar2.e(R.layout.layout_dialog_prompt_buttons_triple);
            d.a.I(aVar2, R.string.selftest_continue_history, null, new x00.l() { // from class: fd.a0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 w11;
                    w11 = FastTestActivity.b.w(com.baicizhan.main.selftest.a.this, bVar, (View) obj);
                    return w11;
                }
            }, 2, null);
            aVar2.o(R.string.selftest_reset_today, new x00.l() { // from class: fd.b0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 z11;
                    z11 = FastTestActivity.b.z(com.baicizhan.main.selftest.a.this, bVar, (View) obj);
                    return z11;
                }
            });
            aVar2.u(R.string.selftest_exit, new x00.l() { // from class: fd.c0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 C;
                    C = FastTestActivity.b.C(com.baicizhan.main.selftest.a.this, fastTestActivity, (View) obj);
                    return C;
                }
            });
            return g2.f100423a;
        }

        public static final g2 w(com.baicizhan.main.selftest.a aVar, com.baicizhan.main.selftest.b bVar, View view) {
            aVar.p(bVar.a());
            return g2.f100423a;
        }

        public static final g2 z(com.baicizhan.main.selftest.a aVar, com.baicizhan.main.selftest.b bVar, View view) {
            aVar.K(bVar.a());
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f17894b, this.f17895c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f17893a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            final com.baicizhan.main.selftest.b value = this.f17894b.v().getValue();
            qb.c.b(FastTestActivity.f17890j, "state to " + o0.d(value.getClass()).C(), new Object[0]);
            LoadingDialogActivity.setLoading$default(this.f17895c, value instanceof b.e, 350L, null, 4, null);
            if (value instanceof b.C0323b) {
                va.g.g(R.string.selftest_no_word, 0);
                this.f17895c.finish();
            } else if (value instanceof b.d) {
                final FastTestActivity fastTestActivity = this.f17895c;
                final com.baicizhan.main.selftest.a aVar = this.f17894b;
                mc.a.j(fastTestActivity, "today", null, new x00.l() { // from class: fd.d0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 u11;
                        u11 = FastTestActivity.b.u(com.baicizhan.main.selftest.a.this, value, fastTestActivity, (u.a) obj2);
                        return u11;
                    }
                }, 2, null);
            } else if (value instanceof b.a) {
                final FastTestActivity fastTestActivity2 = this.f17895c;
                final com.baicizhan.main.selftest.a aVar2 = this.f17894b;
                mc.a.j(fastTestActivity2, TtmlNode.COMBINE_ALL, null, new x00.l() { // from class: fd.e0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 D;
                        D = FastTestActivity.b.D(com.baicizhan.main.selftest.a.this, fastTestActivity2, (u.a) obj2);
                        return D;
                    }
                }, 2, null);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$2$1", f = "FastTestActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17900a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17901b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f17902c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0 f17903d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$2$1$1", f = "FastTestActivity.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f17904a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.baicizhan.main.selftest.a f17905b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.google.accompanist.pager.f f17906c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.baicizhan.main.selftest.a aVar, com.google.accompanist.pager.f fVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f17905b = aVar;
                this.f17906c = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f17905b, this.f17906c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f17904a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    this.f17904a = 1;
                    if (a1.b(150L, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                this.f17905b.F(this.f17906c.k());
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.baicizhan.main.selftest.a aVar, com.google.accompanist.pager.f fVar, r0 r0Var, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f17901b = aVar;
            this.f17902c = fVar;
            this.f17903d = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f17901b, this.f17902c, this.f17903d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f17900a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f17901b.t().getValue().intValue() == this.f17902c.k()) {
                qb.c.i(FastTestActivity.f17890j, "fetched to play", new Object[0]);
                c40.k.f(this.f17903d, null, null, new a(this.f17901b, this.f17902c, null), 3, null);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.l<uh.f, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> f17907a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FastTestActivity f17908b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, FastTestActivity fastTestActivity, com.baicizhan.main.selftest.a aVar) {
            super(1, g0.a.class, "showWiki", "onCreate$lambda$0$showWiki(Landroidx/activity/compose/ManagedActivityResultLauncher;Lcom/baicizhan/main/activity/FastTestActivity;Lcom/baicizhan/main/selftest/FastTestModel;Lcom/baicizhan/main/selftest/Topic;)V", 0);
            this.f17907a = managedActivityResultLauncher;
            this.f17908b = fastTestActivity;
            this.f17909c = aVar;
        }

        public final void a(uh.f p02) {
            g0.p(p02, "p0");
            FastTestActivity.g1(this.f17907a, this.f17908b, this.f17909c, p02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(uh.f fVar) {
            a(fVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements x00.l<uh.f, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> f17910a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FastTestActivity f17911b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17912c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, FastTestActivity fastTestActivity, com.baicizhan.main.selftest.a aVar) {
            super(1, g0.a.class, "showWiki", "onCreate$lambda$0$showWiki(Landroidx/activity/compose/ManagedActivityResultLauncher;Lcom/baicizhan/main/activity/FastTestActivity;Lcom/baicizhan/main/selftest/FastTestModel;Lcom/baicizhan/main/selftest/Topic;)V", 0);
            this.f17910a = managedActivityResultLauncher;
            this.f17911b = fastTestActivity;
            this.f17912c = aVar;
        }

        public final void a(uh.f p02) {
            g0.p(p02, "p0");
            FastTestActivity.g1(this.f17910a, this.f17911b, this.f17912c, p02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(uh.f fVar) {
            a(fVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.l<Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f17913a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f17914b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17915c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f17916d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r0 r0Var, com.google.accompanist.pager.f fVar, com.baicizhan.main.selftest.a aVar, MutableIntState mutableIntState) {
            super(1, g0.a.class, "scrollTo", "onCreate$lambda$0$scrollTo(Lkotlinx/coroutines/CoroutineScope;Lcom/google/accompanist/pager/PagerState;Lcom/baicizhan/main/selftest/FastTestModel;Landroidx/compose/runtime/MutableIntState;I)V", 0);
            this.f17913a = r0Var;
            this.f17914b = fVar;
            this.f17915c = aVar;
            this.f17916d = mutableIntState;
        }

        public final void a(int i11) {
            FastTestActivity.f1(this.f17913a, this.f17914b, this.f17915c, this.f17916d, i11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Integer num) {
            a(num.intValue());
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements DefaultLifecycleObserver {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17918b;

        public g(com.baicizhan.main.selftest.a aVar) {
            this.f17918b = aVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onDestroy(LifecycleOwner lifecycleOwner) {
            super.onDestroy(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner owner) {
            g0.p(owner, "owner");
            super.onPause(owner);
            if (FastTestActivity.this.f17891f) {
                return;
            }
            com.baicizhan.main.selftest.a.M(this.f17918b, null, null, 3, null);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(LifecycleOwner lifecycleOwner) {
            super.onResume(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
            super.onStart(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
            super.onStop(lifecycleOwner);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$9$1", f = "FastTestActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17919a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f17920b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f17921c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0 f17922d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17923e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.google.accompanist.pager.f fVar, MutableIntState mutableIntState, r0 r0Var, com.baicizhan.main.selftest.a aVar, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f17920b = fVar;
            this.f17921c = mutableIntState;
            this.f17922d = r0Var;
            this.f17923e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new h(this.f17920b, this.f17921c, this.f17922d, this.f17923e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f17919a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.b(FastTestActivity.f17890j, "page count to " + this.f17920b.p(), new Object[0]);
            if (FastTestActivity.Y0(this.f17921c) != -1) {
                r0 r0Var = this.f17922d;
                com.google.accompanist.pager.f fVar = this.f17920b;
                com.baicizhan.main.selftest.a aVar = this.f17923e;
                MutableIntState mutableIntState = this.f17921c;
                FastTestActivity.f1(r0Var, fVar, aVar, mutableIntState, FastTestActivity.Y0(mutableIntState));
                FastTestActivity.c1(this.f17921c, -1);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$scrollTo$1", f = "FastTestActivity.kt", i = {0}, l = {123}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nFastTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestActivity.kt\ncom/baicizhan/main/activity/FastTestActivity$onCreate$1$scrollTo$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    public static final class i extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17924a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17925b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f17926c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f17927d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17928e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f17929f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.google.accompanist.pager.f fVar, int i11, com.baicizhan.main.selftest.a aVar, MutableIntState mutableIntState, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f17926c = fVar;
            this.f17927d = i11;
            this.f17928e = aVar;
            this.f17929f = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            i iVar = new i(this.f17926c, this.f17927d, this.f17928e, this.f17929f, cVar);
            iVar.f17925b = obj;
            return iVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i iVar;
            r0 r0Var = (r0) this.f17925b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f17924a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.google.accompanist.pager.f fVar = this.f17926c;
                Integer f11 = l00.a.f(this.f17927d);
                com.google.accompanist.pager.f fVar2 = this.f17926c;
                int intValue = f11.intValue();
                if (intValue < 0 || intValue >= fVar2.p()) {
                    f11 = null;
                }
                if (f11 == null) {
                    int i12 = this.f17927d;
                    MutableIntState mutableIntState = this.f17929f;
                    qb.c.d(FastTestActivity.f17890j, "scrollTo " + i12 + " out of range", new Object[0]);
                    FastTestActivity.c1(mutableIntState, i12);
                    return g2.f100423a;
                }
                int intValue2 = f11.intValue();
                this.f17925b = l00.k.a(r0Var);
                this.f17924a = 1;
                iVar = this;
                if (com.google.accompanist.pager.f.g(fVar, intValue2, 0.0f, iVar, 2, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                iVar = this;
            }
            iVar.f17928e.F(iVar.f17927d);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.FastTestActivity$onCreate$1$showWiki$2", f = "FastTestActivity.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17930a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17931b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uh.f f17932c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.baicizhan.main.selftest.a aVar, uh.f fVar, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f17931b = aVar;
            this.f17932c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new j(this.f17931b, this.f17932c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f17930a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f17930a = 1;
                if (a1.b(150L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f17931b.G(this.f17932c);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements x00.l<Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f17933a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.accompanist.pager.f f17934b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.selftest.a f17935c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f17936d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(r0 r0Var, com.google.accompanist.pager.f fVar, com.baicizhan.main.selftest.a aVar, MutableIntState mutableIntState) {
            super(1, g0.a.class, "scrollTo", "onCreate$lambda$0$scrollTo(Lkotlinx/coroutines/CoroutineScope;Lcom/google/accompanist/pager/PagerState;Lcom/baicizhan/main/selftest/FastTestModel;Landroidx/compose/runtime/MutableIntState;I)V", 0);
            this.f17933a = r0Var;
            this.f17934b = fVar;
            this.f17935c = aVar;
            this.f17936d = mutableIntState;
        }

        public final void a(int i11) {
            FastTestActivity.f1(this.f17933a, this.f17934b, this.f17935c, this.f17936d, i11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Integer num) {
            a(num.intValue());
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 FastTestActivity.kt\ncom/baicizhan/main/activity/FastTestActivity\n*L\n1#1,67:1\n240#2,2:68\n*E\n"})
    public static final class l implements DisposableEffectResult {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f17938b;

        public l(g gVar) {
            this.f17938b = gVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            FastTestActivity.this.getLifecycle().removeObserver(this.f17938b);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 X0(final FastTestActivity fastTestActivity, Composer composer, int i11) {
        final com.baicizhan.main.selftest.a aVar;
        final r0 r0Var;
        final FastTestActivity fastTestActivity2;
        final com.google.accompanist.pager.f fVar;
        final MutableIntState mutableIntState;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1944400166, i11, -1, "com.baicizhan.main.activity.FastTestActivity.onCreate.<anonymous> (FastTestActivity.kt:112)");
            }
            uh.d dVar = new uh.d(new FastTestStrategy(fastTestActivity));
            composer.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModel = ViewModelKt.viewModel((h10.d<ViewModel>) o0.d(com.baicizhan.main.selftest.a.class), current, (String) null, dVar, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final com.baicizhan.main.selftest.a aVar2 = (com.baicizhan.main.selftest.a) viewModel;
            final com.google.accompanist.pager.f a11 = com.google.accompanist.pager.g.a(0, composer, 0, 1);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue);
            }
            final r0 r0Var2 = (r0) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(-1);
                composer.updateRememberedValue(rememberedValue2);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue2;
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            boolean changedInstance = composer.changedInstance(fastTestActivity) | composer.changedInstance(aVar2) | composer.changed(a11) | composer.changedInstance(r0Var2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                Object obj = new x00.l() { // from class: fd.u
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 d12;
                        d12 = FastTestActivity.d1(FastTestActivity.this, aVar2, a11, r0Var2, mutableIntState2, (ActivityResult) obj2);
                        return d12;
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue3 = obj;
            }
            ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (x00.l) rememberedValue3, composer, 0);
            com.baicizhan.main.selftest.b value = aVar2.v().getValue();
            boolean changedInstance2 = composer.changedInstance(aVar2) | composer.changedInstance(fastTestActivity);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new b(aVar2, fastTestActivity, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.LaunchedEffect(value, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue4, composer, 0);
            Integer value2 = aVar2.t().getValue();
            boolean changedInstance3 = composer.changedInstance(aVar2) | composer.changed(a11) | composer.changedInstance(r0Var2);
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new c(aVar2, a11, r0Var2, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.LaunchedEffect(value2, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue5, composer, 0);
            List<uh.f> s11 = aVar2.s();
            int u11 = aVar2.u();
            boolean changedInstance4 = composer.changedInstance(rememberLauncherForActivityResult) | composer.changedInstance(fastTestActivity) | composer.changedInstance(aVar2);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new d(rememberLauncherForActivityResult, fastTestActivity, aVar2);
                composer.updateRememberedValue(rememberedValue6);
            }
            x00.l lVar = (x00.l) ((h10.i) rememberedValue6);
            boolean changedInstance5 = composer.changedInstance(aVar2);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.l() { // from class: fd.v
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 e12;
                        e12 = FastTestActivity.e1(com.baicizhan.main.selftest.a.this, (uh.f) obj2);
                        return e12;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            x00.l lVar2 = (x00.l) rememberedValue7;
            boolean changedInstance6 = composer.changedInstance(rememberLauncherForActivityResult) | composer.changedInstance(fastTestActivity) | composer.changedInstance(aVar2);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new e(rememberLauncherForActivityResult, fastTestActivity, aVar2);
                composer.updateRememberedValue(rememberedValue8);
            }
            x00.l lVar3 = (x00.l) ((h10.i) rememberedValue8);
            boolean changedInstance7 = composer.changedInstance(aVar2) | composer.changedInstance(r0Var2) | composer.changed(a11) | composer.changedInstance(fastTestActivity);
            Object rememberedValue9 = composer.rememberedValue();
            if (changedInstance7 || rememberedValue9 == companion.getEmpty()) {
                aVar = aVar2;
                r0Var = r0Var2;
                Object obj2 = new p() { // from class: fd.w
                    @Override // x00.p
                    public final Object invoke(Object obj3, Object obj4) {
                        yz.g2 Z0;
                        Z0 = FastTestActivity.Z0(com.baicizhan.main.selftest.a.this, fastTestActivity, r0Var, a11, mutableIntState2, ((Integer) obj3).intValue(), (uh.f) obj4);
                        return Z0;
                    }
                };
                fastTestActivity2 = fastTestActivity;
                fVar = a11;
                mutableIntState = mutableIntState2;
                composer.updateRememberedValue(obj2);
                rememberedValue9 = obj2;
            } else {
                fastTestActivity2 = fastTestActivity;
                aVar = aVar2;
                fVar = a11;
                r0Var = r0Var2;
                mutableIntState = mutableIntState2;
            }
            p pVar = (p) rememberedValue9;
            boolean changedInstance8 = composer.changedInstance(aVar) | composer.changedInstance(r0Var) | composer.changed(fVar);
            Object rememberedValue10 = composer.rememberedValue();
            if (changedInstance8 || rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = new x00.l() { // from class: fd.x
                    @Override // x00.l
                    public final Object invoke(Object obj3) {
                        yz.g2 a12;
                        a12 = FastTestActivity.a1(com.baicizhan.main.selftest.a.this, r0Var, fVar, mutableIntState, ((Integer) obj3).intValue());
                        return a12;
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            final com.baicizhan.main.selftest.a aVar3 = aVar;
            MutableIntState mutableIntState3 = mutableIntState;
            r0 r0Var3 = r0Var;
            x0.s(s11, u11, fVar, lVar, lVar2, lVar3, pVar, (x00.l) rememberedValue10, composer, 0);
            boolean changedInstance9 = composer.changedInstance(fastTestActivity2) | composer.changedInstance(aVar3);
            Object rememberedValue11 = composer.rememberedValue();
            if (changedInstance9 || rememberedValue11 == companion.getEmpty()) {
                rememberedValue11 = new x00.l() { // from class: fd.y
                    @Override // x00.l
                    public final Object invoke(Object obj3) {
                        DisposableEffectResult b12;
                        b12 = FastTestActivity.b1(FastTestActivity.this, aVar3, (DisposableEffectScope) obj3);
                        return b12;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            EffectsKt.DisposableEffect(fVar, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue11, composer, 0);
            Integer valueOf = Integer.valueOf(fVar.p());
            boolean changed = composer.changed(fVar) | composer.changedInstance(r0Var3) | composer.changedInstance(aVar3);
            Object rememberedValue12 = composer.rememberedValue();
            if (changed || rememberedValue12 == companion.getEmpty()) {
                Object hVar = new h(fVar, mutableIntState3, r0Var3, aVar3, null);
                composer.updateRememberedValue(hVar);
                rememberedValue12 = hVar;
            }
            EffectsKt.LaunchedEffect(valueOf, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue12, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final int Y0(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final g2 Z0(com.baicizhan.main.selftest.a aVar, FastTestActivity fastTestActivity, r0 r0Var, com.google.accompanist.pager.f fVar, MutableIntState mutableIntState, int i11, uh.f topic) {
        g0.p(topic, "topic");
        aVar.I(i11, topic, new f(r0Var, fVar, aVar, mutableIntState));
        u9.f.d(fastTestActivity.W0(), TaskAction.SelfTest, false, 0, 6, null);
        return g2.f100423a;
    }

    public static final g2 a1(com.baicizhan.main.selftest.a aVar, r0 r0Var, com.google.accompanist.pager.f fVar, MutableIntState mutableIntState, int i11) {
        if (aVar.o(i11)) {
            f1(r0Var, fVar, aVar, mutableIntState, i11);
        } else {
            qb.c.i(f17890j, "not next " + i11, new Object[0]);
        }
        return g2.f100423a;
    }

    public static final DisposableEffectResult b1(FastTestActivity fastTestActivity, com.baicizhan.main.selftest.a aVar, DisposableEffectScope DisposableEffect) {
        g0.p(DisposableEffect, "$this$DisposableEffect");
        g gVar = fastTestActivity.new g(aVar);
        fastTestActivity.getLifecycle().addObserver(gVar);
        return fastTestActivity.new l(gVar);
    }

    public static final void c1(MutableIntState mutableIntState, int i11) {
        mutableIntState.setIntValue(i11);
    }

    public static final g2 d1(FastTestActivity fastTestActivity, com.baicizhan.main.selftest.a aVar, com.google.accompanist.pager.f fVar, r0 r0Var, MutableIntState mutableIntState, ActivityResult it) {
        Intent data;
        g0.p(it, "it");
        fastTestActivity.f17891f = false;
        if (it.getResultCode() == -1 && (data = it.getData()) != null) {
            Integer valueOf = Integer.valueOf(data.getIntExtra(SingleWikiActivity.f18208k, 0));
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                uh.f fVar2 = (uh.f) a00.r0.b3(aVar.s(), fVar.k());
                if (fVar2 != null && fVar2.a() == intValue) {
                    aVar.D(fVar.k(), new k(r0Var, fVar, aVar, mutableIntState));
                }
                aVar.y(intValue);
            }
        }
        return g2.f100423a;
    }

    public static final g2 e1(com.baicizhan.main.selftest.a aVar, uh.f it) {
        g0.p(it, "it");
        aVar.G(it);
        return g2.f100423a;
    }

    public static final void f1(r0 r0Var, com.google.accompanist.pager.f fVar, com.baicizhan.main.selftest.a aVar, MutableIntState mutableIntState, int i11) {
        c40.k.f(r0Var, null, null, new i(fVar, i11, aVar, mutableIntState, null), 3, null);
    }

    public static final void g1(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, FastTestActivity fastTestActivity, com.baicizhan.main.selftest.a aVar, uh.f fVar) {
        TopicRecord c11 = fVar.c();
        if (c11 == null) {
            return;
        }
        Intent intent = new Intent(fastTestActivity, (Class<?>) SingleWikiActivity.class);
        intent.putExtra(SingleWikiActivity.f18206i, c11);
        intent.putExtra(SingleWikiActivity.f18207j, 5);
        managedActivityResultLauncher.launch(intent);
        fastTestActivity.f17891f = true;
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(fastTestActivity), null, null, new j(aVar, fVar, null), 3, null);
        x0.O();
    }

    public static final g2 h1(Boolean bool) {
        return g2.f100423a;
    }

    public static final void i1(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void j1(Throwable th2) {
        qb.c.c(f17890j, "", th2);
    }

    @o
    public static final void l1(@m80.k Context context) {
        f17888h.a(context);
    }

    @m80.k
    public final u9.f W0() {
        u9.f fVar = this.f17892g;
        if (fVar != null) {
            return fVar;
        }
        g0.S("taskRepo");
        return null;
    }

    public final void k1(@m80.k u9.f fVar) {
        g0.p(fVar, "<set-?>");
        this.f17892g = fVar;
    }

    @Override // com.baicizhan.main.activity.Hilt_FastTestActivity, com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1944400166, true, new p() { // from class: fd.z
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 X0;
                X0 = FastTestActivity.X0(FastTestActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return X0;
            }
        }), 1, null);
    }

    @Override // com.baicizhan.main.activity.Hilt_FastTestActivity, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rx.c w52 = RxFlowUtilsKt.asRxJava(W0().a()).w5(bc0.c.e());
        final x00.l lVar = new x00.l() { // from class: fd.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h12;
                h12 = FastTestActivity.h1((Boolean) obj);
                return h12;
            }
        };
        w52.u5(new wb0.b() { // from class: fd.s
            @Override // wb0.b
            public final void call(Object obj) {
                FastTestActivity.i1(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: fd.t
            @Override // wb0.b
            public final void call(Object obj) {
                FastTestActivity.j1((Throwable) obj);
            }
        });
    }
}
