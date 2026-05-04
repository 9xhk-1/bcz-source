package com.baicizhan.main.activity.setting.privatessetting.debug;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt;
import com.jiongji.andriod.card.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAdCacheDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdCacheDetailActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/AdCacheDetailActivityKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,298:1\n55#2,11:299\n1247#3,6:310\n1247#3,3:323\n1250#3,3:327\n1247#3,6:330\n1247#3,6:338\n1247#3,6:344\n1247#3,6:469\n557#4:316\n554#4,6:317\n555#5:326\n113#6:336\n113#6:337\n113#6:387\n113#6:388\n113#6:479\n113#6:517\n113#6:518\n113#6:536\n113#6:574\n113#6:612\n113#6:613\n87#7:350\n84#7,9:351\n94#7:478\n87#7:480\n84#7,9:481\n94#7:522\n87#7:575\n84#7,9:576\n94#7:617\n79#8,6:360\n86#8,3:375\n89#8,2:384\n79#8,6:398\n86#8,3:413\n89#8,2:422\n93#8:427\n79#8,6:438\n86#8,3:453\n89#8,2:462\n93#8:467\n93#8:477\n79#8,6:490\n86#8,3:505\n89#8,2:514\n93#8:521\n79#8,6:547\n86#8,3:562\n89#8,2:571\n79#8,6:585\n86#8,3:600\n89#8,2:609\n93#8:616\n93#8:620\n347#9,9:366\n356#9:386\n347#9,9:404\n356#9,3:424\n347#9,9:444\n356#9,3:464\n357#9,2:475\n347#9,9:496\n356#9:516\n357#9,2:519\n347#9,9:553\n356#9:573\n347#9,9:591\n356#9:611\n357#9,2:614\n357#9,2:618\n4206#10,6:378\n4206#10,6:416\n4206#10,6:456\n4206#10,6:508\n4206#10,6:565\n4206#10,6:603\n70#11:389\n68#11,8:390\n77#11:428\n70#11:429\n68#11,8:430\n77#11:468\n168#12,13:523\n99#13:537\n96#13,9:538\n106#13:621\n*S KotlinDebug\n*F\n+ 1 AdCacheDetailActivity.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/AdCacheDetailActivityKt\n*L\n123#1:299,11\n124#1:310,6\n129#1:323,3\n129#1:327,3\n131#1:330,6\n144#1:338,6\n150#1:344,6\n214#1:469,6\n129#1:316\n129#1:317,6\n129#1:326\n241#1:336\n242#1:337\n173#1:387\n174#1:388\n177#1:479\n184#1:517\n189#1:518\n247#1:536\n253#1:574\n261#1:612\n267#1:613\n164#1:350\n164#1:351,9\n164#1:478\n176#1:480\n176#1:481,9\n176#1:522\n250#1:575\n250#1:576,9\n250#1:617\n164#1:360,6\n164#1:375,3\n164#1:384,2\n198#1:398,6\n198#1:413,3\n198#1:422,2\n198#1:427\n205#1:438,6\n205#1:453,3\n205#1:462,2\n205#1:467\n164#1:477\n176#1:490,6\n176#1:505,3\n176#1:514,2\n176#1:521\n244#1:547,6\n244#1:562,3\n244#1:571,2\n250#1:585,6\n250#1:600,3\n250#1:609,2\n250#1:616\n244#1:620\n164#1:366,9\n164#1:386\n198#1:404,9\n198#1:424,3\n205#1:444,9\n205#1:464,3\n164#1:475,2\n176#1:496,9\n176#1:516\n176#1:519,2\n244#1:553,9\n244#1:573\n250#1:591,9\n250#1:611\n250#1:614,2\n244#1:618,2\n164#1:378,6\n198#1:416,6\n205#1:456,6\n176#1:508,6\n244#1:565,6\n250#1:603,6\n198#1:389\n198#1:390,8\n198#1:428\n205#1:429\n205#1:430,8\n205#1:468\n215#1:523,13\n244#1:537\n244#1:538,9\n244#1:621\n*E\n"})
/* loaded from: classes4.dex */
public final class AdCacheDetailActivityKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$2$1", f = "AdCacheDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19596a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f19597b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f19598c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$2$1$1", f = "AdCacheDetailActivity.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$a$a, reason: collision with other inner class name */
        public static final class C0298a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19599a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f19600b;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$2$1$1$1", f = "AdCacheDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$a$a$a, reason: collision with other inner class name */
            public static final class C0299a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f19601a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f19602b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0299a(q qVar, j00.c<? super C0299a> cVar) {
                    super(2, cVar);
                    this.f19602b = qVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                    return new C0299a(this.f19602b, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                    return ((C0299a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f19601a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    this.f19602b.g();
                    return yz.g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0298a(q qVar, j00.c<? super C0298a> cVar) {
                super(2, cVar);
                this.f19600b = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new C0298a(this.f19600b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((C0298a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f19599a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c40.m0 c11 = c40.h1.c();
                    C0299a c0299a = new C0299a(this.f19600b, null);
                    this.f19599a = 1;
                    if (c40.i.h(c11, c0299a, this) == l11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c40.r0 r0Var, q qVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f19597b = r0Var;
            this.f19598c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f19597b, this.f19598c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19596a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            c40.k.f(this.f19597b, null, null, new C0298a(this.f19598c, null), 3, null);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$3$2$1$1$1", f = "AdCacheDetailActivity.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19603a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f19604b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$3$2$1$1$1$1", f = "AdCacheDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19605a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f19606b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f19606b = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f19606b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f19605a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                this.f19606b.a();
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f19604b = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f19604b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19603a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = c40.h1.c();
                a aVar = new a(this.f19604b, null);
                this.f19603a = 1;
                if (c40.i.h(c11, aVar, this) == l11) {
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
    public static final class c implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f19607a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f19608b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f19609c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$4$1$4$1$1$1$1$1", f = "AdCacheDetailActivity.kt", i = {}, l = {R.styleable.Theme_drawable_share}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19610a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f19611b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f19612c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$4$1$4$1$1$1$1$1$1", f = "AdCacheDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$c$a$a, reason: collision with other inner class name */
            public static final class C0300a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f19613a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q f19614b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p f19615c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0300a(q qVar, p pVar, j00.c<? super C0300a> cVar) {
                    super(2, cVar);
                    this.f19614b = qVar;
                    this.f19615c = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                    return new C0300a(this.f19614b, this.f19615c, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                    return ((C0300a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f19613a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    this.f19614b.b(this.f19615c.i());
                    return yz.g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar, p pVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f19611b = qVar;
                this.f19612c = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f19611b, this.f19612c, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f19610a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c40.m0 c11 = c40.h1.c();
                    C0300a c0300a = new C0300a(this.f19611b, this.f19612c, null);
                    this.f19610a = 1;
                    if (c40.i.h(c11, c0300a, this) == l11) {
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

        public c(c40.r0 r0Var, q qVar, p pVar) {
            this.f19607a = r0Var;
            this.f19608b = qVar;
            this.f19609c = pVar;
        }

        public final void a() {
            c40.k.f(this.f19607a, null, null, new a(this.f19608b, this.f19609c, null), 3, null);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    @m80.k
    public static final String A(long j11) {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j11));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        return format;
    }

    @m80.k
    public static final String B(long j11) {
        if (j11 <= 0) {
            return "0 B";
        }
        double d11 = j11;
        int log10 = (int) (Math.log10(d11) / Math.log10(1024.0d));
        kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
        String format = String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d11 / Math.pow(1024.0d, log10)), new String[]{"B", "KB", "MB", "GB", "TB"}[log10]}, 2));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(@m80.l com.baicizhan.main.activity.setting.privatessetting.debug.q r31, @m80.l x00.a<yz.g2> r32, @m80.l androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt.m(com.baicizhan.main.activity.setting.privatessetting.debug.q, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 n() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 o(final x00.a aVar, final c40.r0 r0Var, final q qVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1150359870, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailScreen.<anonymous> (AdCacheDetailActivity.kt:140)");
            }
            AppBarKt.m1532TopAppBarxWeB9s(v.f19833a.h(), null, ComposableLambdaKt.rememberComposableLambda(379458360, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.j
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 p11;
                    p11 = AdCacheDetailActivityKt.p(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return p11;
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(-586798545, true, new x00.q() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.k
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 r11;
                    r11 = AdCacheDetailActivityKt.r(c40.r0.this, qVar, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return r11;
                }
            }, composer, 54), 0L, 0L, 0.0f, composer, 3462, 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 p(final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(379458360, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailScreen.<anonymous>.<anonymous> (AdCacheDetailActivity.kt:143)");
            }
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.d
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 q11;
                        q11 = AdCacheDetailActivityKt.q(x00.a.this);
                        return q11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            IconButtonKt.IconButton((x00.a) rememberedValue, null, false, null, v.f19833a.e(), composer, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 q(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 r(final c40.r0 r0Var, final q qVar, RowScope TopAppBar, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(TopAppBar, "$this$TopAppBar");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586798545, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailScreen.<anonymous>.<anonymous> (AdCacheDetailActivity.kt:148)");
            }
            boolean changedInstance = composer.changedInstance(r0Var) | composer.changedInstance(qVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.g
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 s11;
                        s11 = AdCacheDetailActivityKt.s(c40.r0.this, qVar);
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ButtonKt.TextButton((x00.a) rememberedValue, null, false, null, null, null, null, null, null, v.f19833a.g(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(c40.r0 r0Var, q qVar) {
        c40.k.f(r0Var, null, null, new b(qVar, null), 3, null);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t(boolean z11, final List list, final c40.r0 r0Var, final q qVar, final long j11, PaddingValues paddingValues, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(paddingValues, "paddingValues");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1728863991, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailScreen.<anonymous> (AdCacheDetailActivity.kt:163)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, padding);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CardKt.m1576CardFjzlyU(PaddingKt.m726padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(16)), null, 0L, 0L, null, Dp.m5115constructorimpl(4), ComposableLambdaKt.rememberComposableLambda(683942928, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.h
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 u11;
                    u11 = AdCacheDetailActivityKt.u(j11, list, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            }, composer, 54), composer, 1769478, 30);
            if (z11) {
                composer.startReplaceGroup(1997076972);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
                x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
                Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ProgressIndicatorKt.m1724CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
                composer.endNode();
                composer.endReplaceGroup();
            } else if (list.isEmpty()) {
                composer.startReplaceGroup(1997341433);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default2);
                x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer);
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                TextKt.m1845Text4IGK_g("没有缓存文件", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 6, 0, 131070);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1997579172);
                Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                boolean changedInstance = composer.changedInstance(list) | composer.changedInstance(r0Var) | composer.changedInstance(qVar);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.i
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 v11;
                            v11 = AdCacheDetailActivityKt.v(list, r0Var, qVar, (LazyListScope) obj);
                            return v11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.LazyColumn(fillMaxSize$default3, null, null, false, null, null, null, false, null, (x00.l) rememberedValue, composer, 6, TypedValues.PositionType.TYPE_POSITION_TYPE);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 u(long j11, List list, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(683942928, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailScreen.<anonymous>.<anonymous>.<anonymous> (AdCacheDetailActivity.kt:175)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(16));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g("缓存总大小", (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 199686, 0, 131030);
            float f11 = 8;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            TextKt.m1845Text4IGK_g(B(j11), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3072, 0, 131062);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            TextKt.m1845Text4IGK_g("文件总数: " + list.size(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3072, 0, 131062);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(final List list, final c40.r0 r0Var, final q qVar, LazyListScope LazyColumn) {
        kotlin.jvm.internal.g0.p(LazyColumn, "$this$LazyColumn");
        final AdCacheDetailActivityKt$AdCacheDetailScreen$lambda$3$0$3$0$$inlined$items$default$1 adCacheDetailActivityKt$AdCacheDetailScreen$lambda$3$0$3$0$$inlined$items$default$1 = new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$lambda$3$0$3$0$$inlined$items$default$1
            @Override // x00.l
            public final Void invoke(p pVar) {
                return null;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((p) obj);
            }
        };
        LazyColumn.items(list.size(), null, new x00.l<Integer, Object>() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$lambda$3$0$3$0$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                return x00.l.this.invoke(list.get(i11));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new x00.r<LazyItemScope, Integer, Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheDetailActivityKt$AdCacheDetailScreen$lambda$3$0$3$0$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ yz.g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return yz.g2.f100423a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i11, Composer composer, int i12) {
                int i13;
                if ((i12 & 6) == 0) {
                    i13 = (composer.changed(lazyItemScope) ? 4 : 2) | i12;
                } else {
                    i13 = i12;
                }
                if ((i12 & 48) == 0) {
                    i13 |= composer.changed(i11) ? 32 : 16;
                }
                if (!composer.shouldExecute((i13 & 147) != 146, i13 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                p pVar = (p) list.get(i11);
                composer.startReplaceGroup(200607455);
                boolean changedInstance = composer.changedInstance(r0Var) | composer.changedInstance(qVar) | composer.changed(pVar);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new AdCacheDetailActivityKt.c(r0Var, qVar, pVar);
                    composer.updateRememberedValue(rememberedValue);
                }
                AdCacheDetailActivityKt.x(pVar, (x00.a) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(q qVar, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        m(qVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void x(@m80.k final p file, @m80.k final x00.a<yz.g2> onDeleteClick, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(file, "file");
        kotlin.jvm.internal.g0.p(onDeleteClick, "onDeleteClick");
        Composer startRestartGroup = composer.startRestartGroup(-855401339);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(file) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onDeleteClick) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-855401339, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheFileItem (AdCacheDetailActivity.kt:236)");
            }
            CardKt.m1576CardFjzlyU(PaddingKt.m727paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5115constructorimpl(16), Dp.m5115constructorimpl(8)), null, 0L, 0L, null, Dp.m5115constructorimpl(2), ComposableLambdaKt.rememberComposableLambda(-394955902, true, new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 y11;
                    y11 = AdCacheDetailActivityKt.y(x00.a.this, file, (Composer) obj, ((Integer) obj2).intValue());
                    return y11;
                }
            }, startRestartGroup, 54), startRestartGroup, 1769478, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.m
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 z11;
                    z11 = AdCacheDetailActivityKt.z(p.this, onDeleteClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return z11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 y(x00.a aVar, p pVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-394955902, i11, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.AdCacheFileItem.<anonymous> (AdCacheDetailActivity.kt:243)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(16));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m5115constructorimpl(8), 0.0f, 11, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m730paddingqDBjuR0$default);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(pVar.h(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 196608, 3120, 120798);
            float f11 = 4;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            String B = B(pVar.j());
            long sp2 = TextUnitKt.getSp(12);
            Color.Companion companion4 = Color.Companion;
            TextKt.m1845Text4IGK_g(B, (Modifier) null, companion4.m2539getGray0d7_KjU(), sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131058);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            TextKt.m1845Text4IGK_g(A(pVar.g()), (Modifier) null, companion4.m2539getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131058);
            composer.endNode();
            ButtonKt.TextButton(aVar, null, false, null, null, null, null, null, null, v.f19833a.f(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 z(p pVar, x00.a aVar, int i11, Composer composer, int i12) {
        x(pVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }
}
