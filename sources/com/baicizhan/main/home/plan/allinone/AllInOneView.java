package com.baicizhan.main.home.plan.allinone;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.Constraints;
import androidx.fragment.app.FragmentActivity;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.compose.DialogNavigator;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.util.HiltContextUtilsKt;
import com.baicizhan.client.business.webview.BczWebDirector;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.ShowOffActivity;
import com.baicizhan.main.home.plan.allinone.b;
import com.baicizhan.main.web.BczWebWorker;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tj.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAllInOneView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllInOneView.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneView\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n46#2,7:344\n86#3,6:351\n557#4:357\n554#4,6:358\n1247#5,3:364\n1250#5,3:368\n1247#5,6:371\n1247#5,6:377\n1247#5,6:383\n1247#5,6:389\n1247#5,6:395\n1247#5,6:401\n1247#5,6:407\n1247#5,6:413\n1247#5,6:419\n1247#5,6:425\n1247#5,6:431\n1247#5,6:438\n555#6:367\n85#7:437\n85#7:444\n113#7,2:445\n1563#8:447\n1634#8,3:448\n1869#8,2:452\n1#9:451\n*S KotlinDebug\n*F\n+ 1 AllInOneView.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneView\n*L\n68#1:344,7\n68#1:351,6\n70#1:357\n70#1:358,6\n70#1:364,3\n70#1:368,3\n72#1:371,6\n73#1:377,6\n74#1:383,6\n85#1:389,6\n92#1:395,6\n114#1:401,6\n115#1:407,6\n122#1:413,6\n165#1:419,6\n166#1:425,6\n178#1:431,6\n148#1:438,6\n70#1:367\n69#1:437\n165#1:444\n165#1:445,2\n167#1:447\n167#1:448,3\n173#1:452,2\n*E\n"})
/* loaded from: classes4.dex */
public final class AllInOneView extends AbstractComposeView {

    /* renamed from: c, reason: collision with root package name */
    public static final int f22032c = 8;

    /* renamed from: a, reason: collision with root package name */
    public og.t f22033a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public va.b f22034b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneView$Container$2$1", f = "AllInOneView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22035a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f22037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Integer> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f22037c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return AllInOneView.this.new a(this.f22037c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22035a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (AllInOneView.v(this.f22037c) > 0) {
                AllInOneView.this.getLayoutParams().height = AllInOneView.v(this.f22037c);
                AllInOneView.this.requestLayout();
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneView$Content$retry$1$1$1", f = "AllInOneView.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22038a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AllInOneVM f22039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AllInOneVM allInOneVM, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f22039b = allInOneVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f22039b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22038a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                AllInOneVM allInOneVM = this.f22039b;
                this.f22038a = 1;
                if (allInOneVM.m(this) == l11) {
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
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneView$Content$upgradeRecord$1$1$1", f = "AllInOneView.kt", i = {0, 0, 0, 0}, l = {97}, m = "invokeSuspend", n = {"$this$launch", DialogNavigator.NAME, "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AllInOneView$Content$upgradeRecord$1$1$1$result$1"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22040a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22041b;

        /* renamed from: c, reason: collision with root package name */
        public int f22042c;

        /* renamed from: d, reason: collision with root package name */
        public int f22043d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f22044e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AllInOneVM f22046g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AllInOneVM allInOneVM, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f22046g = allInOneVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = AllInOneView.this.new c(this.f22046g, cVar);
            cVar2.f22044e = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f22044e
                c40.r0 r0 = (c40.r0) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r7.f22043d
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 != r4) goto L1e
                java.lang.Object r0 = r7.f22041b
                c40.r0 r0 = (c40.r0) r0
                java.lang.Object r0 = r7.f22040a
                va.f r0 = (va.f) r0
                kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L1c
                goto L54
            L1c:
                r8 = move-exception
                goto L5f
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                kotlin.e.n(r8)
                com.baicizhan.main.home.plan.allinone.AllInOneView r8 = com.baicizhan.main.home.plan.allinone.AllInOneView.this
                android.content.Context r8 = r8.getContext()
                va.f r8 = gi.e.c(r8)
                r8.show()
                com.baicizhan.main.home.plan.allinone.AllInOneVM r2 = r7.f22046g
                kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r5 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L5b
                r7.f22044e = r5     // Catch: java.lang.Throwable -> L5b
                r7.f22040a = r8     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r0 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L5b
                r7.f22041b = r0     // Catch: java.lang.Throwable -> L5b
                r7.f22042c = r3     // Catch: java.lang.Throwable -> L5b
                r7.f22043d = r4     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r0 = r2.p(r7)     // Catch: java.lang.Throwable -> L5b
                if (r0 != r1) goto L53
                return r1
            L53:
                r0 = r8
            L54:
                yz.g2 r8 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r8 = kotlin.Result.m6308constructorimpl(r8)     // Catch: java.lang.Throwable -> L1c
                goto L69
            L5b:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L5f:
                kotlin.Result$a r1 = kotlin.Result.Companion
                java.lang.Object r8 = kotlin.e.a(r8)
                java.lang.Object r8 = kotlin.Result.m6308constructorimpl(r8)
            L69:
                boolean r1 = kotlin.Result.m6315isSuccessimpl(r8)
                if (r1 == 0) goto L76
                r8 = 2131820764(0x7f1100dc, float:1.9274252E38)
                va.g.g(r8, r3)
                goto L84
            L76:
                java.lang.Throwable r8 = kotlin.Result.m6311exceptionOrNullimpl(r8)
                r1 = 2131820763(0x7f1100db, float:1.927425E38)
                java.lang.String r8 = va.g.e(r8, r1)
                va.g.i(r8, r4)
            L84:
                r0.dismiss()
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneView.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneView$handleButtonAction$4$1$1", f = "AllInOneView.kt", i = {0, 0, 0, 0}, l = {R.styleable.Theme_drawable_share_close}, m = "invokeSuspend", n = {"$this$launch", "loading", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AllInOneView$handleButtonAction$4$1$1$result$1"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nAllInOneView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllInOneView.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneView$handleButtonAction$4$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22047a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22048b;

        /* renamed from: c, reason: collision with root package name */
        public int f22049c;

        /* renamed from: d, reason: collision with root package name */
        public int f22050d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f22051e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f22052f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AllInOneView f22053g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.home.plan.allinone.a f22054h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AllInOneVM f22055i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f22056j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ AddType f22057k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, AllInOneView allInOneView, com.baicizhan.main.home.plan.allinone.a aVar, AllInOneVM allInOneVM, int i11, AddType addType, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f22052f = context;
            this.f22053g = allInOneView;
            this.f22054h = aVar;
            this.f22055i = allInOneVM;
            this.f22056j = i11;
            this.f22057k = addType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f22052f, this.f22053g, this.f22054h, this.f22055i, this.f22056j, this.f22057k, cVar);
            dVar.f22051e = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f22051e
                c40.r0 r0 = (c40.r0) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r8.f22050d
                r3 = 1
                if (r2 == 0) goto L25
                if (r2 != r3) goto L1d
                java.lang.Object r0 = r8.f22048b
                c40.r0 r0 = (c40.r0) r0
                java.lang.Object r0 = r8.f22047a
                va.f r0 = (va.f) r0
                kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L1b
                goto L59
            L1b:
                r9 = move-exception
                goto L64
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                kotlin.e.n(r9)
                va.f r9 = new va.f
                android.content.Context r2 = r8.f22052f
                android.content.Context r2 = com.baicizhan.client.business.util.HiltContextUtilsKt.unWrapHiltContext(r2)
                r9.<init>(r2)
                r9.show()
                com.baicizhan.main.home.plan.allinone.AllInOneVM r2 = r8.f22055i
                int r4 = r8.f22056j
                com.baicizhan.main.home.plan.allinone.AddType r5 = r8.f22057k
                kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L60
                java.lang.Object r6 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L60
                r8.f22051e = r6     // Catch: java.lang.Throwable -> L60
                r8.f22047a = r9     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L60
                r8.f22048b = r0     // Catch: java.lang.Throwable -> L60
                r0 = 0
                r8.f22049c = r0     // Catch: java.lang.Throwable -> L60
                r8.f22050d = r3     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r2.i(r4, r5, r8)     // Catch: java.lang.Throwable -> L60
                if (r0 != r1) goto L58
                return r1
            L58:
                r0 = r9
            L59:
                yz.g2 r9 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = kotlin.Result.m6308constructorimpl(r9)     // Catch: java.lang.Throwable -> L1b
                goto L6e
            L60:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L64:
                kotlin.Result$a r1 = kotlin.Result.Companion
                java.lang.Object r9 = kotlin.e.a(r9)
                java.lang.Object r9 = kotlin.Result.m6308constructorimpl(r9)
            L6e:
                r0.dismiss()
                boolean r0 = kotlin.Result.m6315isSuccessimpl(r9)
                if (r0 == 0) goto L8e
                com.baicizhan.main.home.plan.allinone.AllInOneView r9 = r8.f22053g
                android.content.Context r0 = r8.f22052f
                android.content.Context r0 = com.baicizhan.client.business.util.HiltContextUtilsKt.unWrapHiltContext(r0)
                java.lang.String r1 = "unWrapHiltContext(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                com.baicizhan.main.home.plan.allinone.a r1 = r8.f22054h
                java.lang.String r1 = r1.g()
                com.baicizhan.main.home.plan.allinone.AllInOneView.O(r9, r0, r1)
                goto L95
            L8e:
                java.lang.Throwable r9 = kotlin.Result.m6311exceptionOrNullimpl(r9)
                va.g.j(r9, r3)
            L95:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneView.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public AllInOneView(@m80.k Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public static final yz.g2 A(AllInOneView allInOneView, int i11, Composer composer, int i12) {
        allInOneView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final com.baicizhan.main.home.plan.allinone.b B(State<? extends com.baicizhan.main.home.plan.allinone.b> state) {
        return state.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 C(x00.a aVar, x00.a aVar2, final x00.p pVar, x00.l lVar, x00.a aVar3, x00.a aVar4, final AllInOneVM allInOneVM, x00.a aVar5, x00.a aVar6, State state, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432657598, i11, -1, "com.baicizhan.main.home.plan.allinone.AllInOneView.Content.<anonymous> (AllInOneView.kt:126)");
            }
            com.baicizhan.main.home.plan.allinone.b B = B(state);
            if (B instanceof b.d) {
                composer.startReplaceGroup(827878612);
                c3.c0(composer, 0);
                composer.endReplaceGroup();
            } else if (B instanceof b.C0310b) {
                composer.startReplaceGroup(827880459);
                c3.P((b.C0310b) B, aVar, composer, 0);
                composer.endReplaceGroup();
            } else if (B instanceof b.g) {
                composer.startReplaceGroup(827884208);
                c3.e0((b.g) B, aVar2, composer, 0);
                composer.endReplaceGroup();
            } else if (B instanceof b.e) {
                composer.startReplaceGroup(827888305);
                c3.W((b.e) B, pVar, lVar, aVar2, aVar3, aVar4, composer, 0);
                composer.endReplaceGroup();
            } else if (B instanceof b.h) {
                composer.startReplaceGroup(827895343);
                c3.h0((b.h) B, pVar, lVar, aVar2, aVar3, aVar4, composer, 0);
                composer.endReplaceGroup();
            } else if (B instanceof b.c) {
                composer.startReplaceGroup(827902656);
                b.c cVar = (b.c) B;
                boolean changed = composer.changed(pVar) | composer.changedInstance(allInOneVM);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.o
                        @Override // x00.p
                        public final Object invoke(Object obj, Object obj2) {
                            yz.g2 D;
                            D = AllInOneView.D(x00.p.this, allInOneVM, (m1) obj, (AddType) obj2);
                            return D;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                c3.S(cVar, (x00.p) rememberedValue, aVar4, aVar5, composer, 0);
                composer.endReplaceGroup();
            } else if (B instanceof b.a) {
                composer.startReplaceGroup(827911958);
                c3.M((b.a) B, aVar2, aVar4, aVar5, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(B instanceof b.f)) {
                    composer.startReplaceGroup(827877807);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(827917039);
                c3.m0(aVar6, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 D(x00.p pVar, AllInOneVM allInOneVM, m1 model, AddType addType) {
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(addType, "addType");
        pVar.invoke(model, addType);
        allInOneVM.o();
        return yz.g2.f100423a;
    }

    public static final yz.g2 E(AllInOneView allInOneView, int i11, Composer composer, int i12) {
        allInOneView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 F(AllInOneView allInOneView) {
        allInOneView.getOldVM().g0();
        return yz.g2.f100423a;
    }

    public static final yz.g2 G(AllInOneView allInOneView) {
        allInOneView.getOldVM().C();
        return yz.g2.f100423a;
    }

    public static final yz.g2 H(AllInOneView allInOneView) {
        Pair<BookRecord, Integer> a02 = allInOneView.getOldVM().a0();
        if (a02 != null) {
            Context context = allInOneView.getContext();
            kotlin.jvm.internal.g0.o(context, "getContext(...)");
            Context unWrapHiltContext = HiltContextUtilsKt.unWrapHiltContext(context);
            kotlin.jvm.internal.g0.n(unWrapHiltContext, "null cannot be cast to non-null type android.app.Activity");
            ShowOffActivity.Q0((Activity) unWrapHiltContext, a02.getFirst().bookName, a02.getFirst().wordCount, a02.getSecond().intValue(), a02.getFirst().bookId);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(c40.r0 r0Var, AllInOneVM allInOneVM) {
        c40.k.f(r0Var, null, null, new b(allInOneVM, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 J(c40.r0 r0Var, AllInOneView allInOneView, AllInOneVM allInOneVM) {
        c40.k.f(r0Var, null, null, allInOneView.new c(allInOneVM, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 K(AllInOneView allInOneView) {
        allInOneView.getOldVM().G0();
        return yz.g2.f100423a;
    }

    public static final yz.g2 L(AllInOneView allInOneView, th.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        i.a aVar = tj.i.f90704f;
        Context context = allInOneView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        Context unWrapHiltContext = HiltContextUtilsKt.unWrapHiltContext(context);
        kotlin.jvm.internal.g0.o(unWrapHiltContext, "unWrapHiltContext(...)");
        aVar.e(unWrapHiltContext, com.baicizhan.main.rx.a.a(it), 0);
        return yz.g2.f100423a;
    }

    public static final yz.g2 M(AllInOneView allInOneView, c40.r0 r0Var, AllInOneVM allInOneVM, m1 mode, AddType addTyoe) {
        kotlin.jvm.internal.g0.p(mode, "mode");
        kotlin.jvm.internal.g0.p(addTyoe, "addTyoe");
        Context context = allInOneView.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        allInOneView.Q(context, mode, addTyoe, r0Var, allInOneVM);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R(com.baicizhan.main.home.plan.allinone.a aVar, u.a prompt) {
        kotlin.jvm.internal.g0.p(prompt, "$this$prompt");
        prompt.V(aVar.f());
        prompt.b0(ButtonType.SINGLE_POSITIVE);
        d.a.I(prompt, R.string.force_dialog_i_know, null, new x00.l() { // from class: com.baicizhan.main.home.plan.allinone.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 S;
                S = AllInOneView.S((View) obj);
                return S;
            }
        }, 2, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        qb.c.i(c3.f22150a, "CLIKC I KNOWN", new Object[0]);
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(c40.r0 r0Var, Context context, AllInOneView allInOneView, com.baicizhan.main.home.plan.allinone.a aVar, AllInOneVM allInOneVM, AddType addType, int i11) {
        c40.k.f(r0Var, null, null, new d(context, allInOneView, aVar, allInOneVM, i11, addType, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final void W(RadioGroup radioGroup, AllInOneView allInOneView, Activity activity, RadioGroup radioGroup2, int i11) {
        View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        kotlin.jvm.internal.g0.n(findViewById, "null cannot be cast to non-null type android.widget.RadioButton");
        CharSequence text = ((RadioButton) findViewById).getText();
        kotlin.jvm.internal.g0.n(text, "null cannot be cast to non-null type kotlin.String");
        String str = (String) text;
        va.b bVar = allInOneView.f22034b;
        if (bVar != null) {
            bVar.k(activity.getString(R.string.dialog_plan_more_title, Integer.valueOf(Integer.parseInt(str))));
            bVar.m(true);
        }
    }

    public static final void X(RadioGroup radioGroup, x00.l lVar, int i11, Activity activity, DialogInterface dialogInterface, int i12) {
        View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        kotlin.jvm.internal.g0.n(findViewById, "null cannot be cast to non-null type android.widget.RadioButton");
        CharSequence text = ((RadioButton) findViewById).getText();
        kotlin.jvm.internal.g0.n(text, "null cannot be cast to non-null type kotlin.String");
        int parseInt = Integer.parseInt((String) text);
        lVar.invoke(Integer.valueOf(parseInt));
        if (i11 != parseInt) {
            i9.f.k(activity, i9.f.f60390p, parseInt);
        }
    }

    public static final int v(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void w(MutableState<Integer> mutableState, int i11) {
        mutableState.setValue(Integer.valueOf(i11));
    }

    public static final MeasureResult x(x00.p pVar, MutableState mutableState, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Integer num;
        kotlin.jvm.internal.g0.p(SubcomposeLayout, "$this$SubcomposeLayout");
        List<Measurable> subcompose = SubcomposeLayout.subcompose("content", pVar);
        final ArrayList arrayList = new ArrayList(a00.i0.d0(subcompose, 10));
        Iterator<T> it = subcompose.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(constraints.m5074unboximpl(), 0, 0, 0, Integer.MAX_VALUE, 3, null)));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Integer valueOf = Integer.valueOf(((Placeable) it2.next()).getHeight());
            while (it2.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((Placeable) it2.next()).getHeight());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        int intValue = num != null ? num.intValue() : 0;
        w(mutableState, intValue);
        return MeasureScope.layout$default(SubcomposeLayout, Constraints.m5068getMaxWidthimpl(constraints.m5074unboximpl()), intValue, null, new x00.l() { // from class: com.baicizhan.main.home.plan.allinone.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 y11;
                y11 = AllInOneView.y(arrayList, (Placeable.PlacementScope) obj);
                return y11;
            }
        }, 4, null);
    }

    public static final yz.g2 y(List list, Placeable.PlacementScope layout) {
        kotlin.jvm.internal.g0.p(layout, "$this$layout");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Placeable.PlacementScope.place$default(layout, (Placeable) it.next(), 0, 0, 0.0f, 4, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 z(AllInOneView allInOneView, x00.p pVar, int i11, Composer composer, int i12) {
        allInOneView.u(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@m80.l Composer composer, final int i11) {
        int i12;
        x00.p<? super Composer, ? super Integer, yz.g2> pVar;
        ScopeUpdateScope scopeUpdateScope;
        Composer startRestartGroup = composer.startRestartGroup(-650883604);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-650883604, i12, -1, "com.baicizhan.main.home.plan.allinone.AllInOneView.Content (AllInOneView.kt:61)");
            }
            ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(this);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            int i13 = LocalViewModelStoreOwner.$stable;
            if (localViewModelStoreOwner.getCurrent(startRestartGroup, i13) == null || viewModelStoreOwner == null) {
                qb.c.b(c3.f22150a, "viewModelStoreOwner unavailable...", new Object[0]);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScope = startRestartGroup.endRestartGroup();
                if (scopeUpdateScope != null) {
                    pVar = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.u
                        @Override // x00.p
                        public final Object invoke(Object obj, Object obj2) {
                            yz.g2 A;
                            A = AllInOneView.A(AllInOneView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                            return A;
                        }
                    };
                    scopeUpdateScope.updateScope(pVar);
                }
                return;
            }
            startRestartGroup.startReplaceableGroup(1890788296);
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(startRestartGroup, i13);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory createHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) AllInOneVM.class, current, (String) null, createHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, startRestartGroup, 36936, 0);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            final AllInOneVM allInOneVM = (AllInOneVM) viewModel;
            final State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(allInOneVM.k(), (LifecycleOwner) null, (Lifecycle.State) null, (kotlin.coroutines.d) null, startRestartGroup, 0, 7);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(this);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.w
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 F;
                        F = AllInOneView.F(AllInOneView.this);
                        return F;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final x00.a aVar = (x00.a) rememberedValue2;
            boolean changedInstance2 = startRestartGroup.changedInstance(this);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.x
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 G;
                        G = AllInOneView.G(AllInOneView.this);
                        return G;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final x00.a aVar2 = (x00.a) rememberedValue3;
            boolean changedInstance3 = startRestartGroup.changedInstance(this);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.y
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 H;
                        H = AllInOneView.H(AllInOneView.this);
                        return H;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final x00.a aVar3 = (x00.a) rememberedValue4;
            boolean changedInstance4 = startRestartGroup.changedInstance(r0Var) | startRestartGroup.changedInstance(allInOneVM);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.z
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 I;
                        I = AllInOneView.I(c40.r0.this, allInOneVM);
                        return I;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final x00.a aVar4 = (x00.a) rememberedValue5;
            boolean changedInstance5 = startRestartGroup.changedInstance(r0Var) | startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(allInOneVM);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.a0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 J;
                        J = AllInOneView.J(c40.r0.this, this, allInOneVM);
                        return J;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            final x00.a aVar5 = (x00.a) rememberedValue6;
            boolean changedInstance6 = startRestartGroup.changedInstance(this);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.i
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 K;
                        K = AllInOneView.K(AllInOneView.this);
                        return K;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final x00.a aVar6 = (x00.a) rememberedValue7;
            boolean changedInstance7 = startRestartGroup.changedInstance(this);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance7 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.l() { // from class: com.baicizhan.main.home.plan.allinone.j
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 L;
                        L = AllInOneView.L(AllInOneView.this, (th.a) obj);
                        return L;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final x00.l lVar = (x00.l) rememberedValue8;
            boolean changedInstance8 = startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(r0Var) | startRestartGroup.changedInstance(allInOneVM);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance8 || rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.k
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 M;
                        M = AllInOneView.M(AllInOneView.this, r0Var, allInOneVM, (m1) obj, (AddType) obj2);
                        return M;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            final x00.p pVar2 = (x00.p) rememberedValue9;
            qb.c.i(c3.f22150a, "h " + getLayoutParams().height + GlideException.a.f28776d + B(collectAsStateWithLifecycle), new Object[0]);
            u(ComposableLambdaKt.rememberComposableLambda(-432657598, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 C;
                    C = AllInOneView.C(x00.a.this, aVar, pVar2, lVar, aVar6, aVar2, allInOneVM, aVar3, aVar5, collectAsStateWithLifecycle, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i12 << 3) & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScope = startRestartGroup.endRestartGroup();
        if (scopeUpdateScope != null) {
            pVar = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.v
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E;
                    E = AllInOneView.E(AllInOneView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            };
            scopeUpdateScope.updateScope(pVar);
        }
    }

    public final void P(Context context, String str) {
        new BczWebDirector.Builder().setDefaultUrl(str).setWebWorker(new BczWebWorker()).build().goToWeb(context);
        U();
    }

    public final void Q(final Context context, m1 m1Var, final AddType addType, final c40.r0 r0Var, final AllInOneVM allInOneVM) {
        final com.baicizhan.main.home.plan.allinone.a f11 = m1Var.f();
        if (f11.j()) {
            Context unWrapHiltContext = HiltContextUtilsKt.unWrapHiltContext(context);
            FragmentActivity fragmentActivity = unWrapHiltContext instanceof FragmentActivity ? (FragmentActivity) unWrapHiltContext : null;
            if (fragmentActivity != null) {
                mc.a.j(fragmentActivity, "study_hint_dialog", null, new x00.l() { // from class: com.baicizhan.main.home.plan.allinone.q
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 R;
                        R = AllInOneView.R(a.this, (u.a) obj);
                        return R;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (f11.i()) {
            Context unWrapHiltContext2 = HiltContextUtilsKt.unWrapHiltContext(context);
            kotlin.jvm.internal.g0.o(unWrapHiltContext2, "unWrapHiltContext(...)");
            P(unWrapHiltContext2, f11.g());
        } else {
            if (!f11.h()) {
                qb.c.i(c3.f22150a, "ERROR!!!", new Object[0]);
                return;
            }
            Context unWrapHiltContext3 = HiltContextUtilsKt.unWrapHiltContext(context);
            FragmentActivity fragmentActivity2 = unWrapHiltContext3 instanceof FragmentActivity ? (FragmentActivity) unWrapHiltContext3 : null;
            if (fragmentActivity2 != null) {
                V(fragmentActivity2, new x00.l() { // from class: com.baicizhan.main.home.plan.allinone.r
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 T;
                        T = AllInOneView.T(c40.r0.this, context, this, f11, allInOneVM, addType, ((Integer) obj).intValue());
                        return T;
                    }
                });
            }
        }
    }

    public final q9.x U() {
        q9.x r11 = q9.x.r();
        if (r11 == null) {
            return null;
        }
        r11.e0();
        r11.a(4);
        r11.w0(true);
        qb.c.i(c3.f22150a, "", new Object[0]);
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(final android.app.Activity r18, final x00.l<? super java.lang.Integer, yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneView.V(android.app.Activity, x00.l):void");
    }

    @m80.k
    public final og.t getOldVM() {
        og.t tVar = this.f22033a;
        if (tVar != null) {
            return tVar;
        }
        kotlin.jvm.internal.g0.S("oldVM");
        return null;
    }

    public final void setOldVM(@m80.k og.t tVar) {
        kotlin.jvm.internal.g0.p(tVar, "<set-?>");
        this.f22033a = tVar;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public final void u(final x00.p<? super Composer, ? super Integer, yz.g2> pVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(319530931);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(319530931, i12, -1, "com.baicizhan.main.home.plan.allinone.AllInOneView.Container (AllInOneView.kt:163)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            boolean z11 = (i12 & 14) == 4;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.m
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        MeasureResult x11;
                        x11 = AllInOneView.x(x00.p.this, mutableState, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                        return x11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (x00.p) rememberedValue2, startRestartGroup, 0, 1);
            Integer valueOf = Integer.valueOf(v(mutableState));
            boolean changedInstance = startRestartGroup.changedInstance(this);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new a(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.LaunchedEffect(valueOf, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.n
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 z12;
                    z12 = AllInOneView.z(AllInOneView.this, pVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return z12;
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public AllInOneView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public AllInOneView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public /* synthetic */ AllInOneView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
