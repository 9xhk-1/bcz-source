package com.baicizhan.main.home.player;

import android.util.Log;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.main.home.player.DynamicsKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDynamics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 12 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,306:1\n1247#2,6:307\n1247#2,3:364\n1250#2,3:368\n1247#2,3:371\n1250#2,3:377\n1225#2,6:387\n1247#2,6:439\n113#3:313\n87#4:314\n85#4,8:315\n94#4:356\n79#5,6:323\n86#5,3:338\n89#5,2:347\n93#5:355\n347#6,9:329\n356#6:349\n357#6,2:353\n4206#7,6:341\n1878#8,3:350\n557#9:357\n554#9,6:358\n555#10:367\n18#11,3:374\n354#12,7:380\n361#12,2:393\n363#12,7:396\n401#12,10:403\n400#12:413\n412#12,4:414\n416#12,7:419\n446#12,12:426\n472#12:438\n1#13:395\n77#14:418\n85#15:445\n113#15,2:446\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt\n*L\n78#1:307,6\n113#1:364,3\n113#1:368,3\n114#1:371,3\n114#1:377,3\n115#1:387,6\n244#1:439,6\n79#1:313\n79#1:314\n79#1:315,8\n79#1:356\n79#1:323,6\n79#1:338,3\n79#1:347,2\n79#1:355\n79#1:329,9\n79#1:349\n79#1:353,2\n79#1:341,6\n80#1:350,3\n113#1:357\n113#1:358,6\n113#1:367\n114#1:374,3\n115#1:380,7\n115#1:393,2\n115#1:396,7\n115#1:403,10\n115#1:413\n115#1:414,4\n115#1:419,7\n115#1:426,12\n115#1:438\n115#1:395\n115#1:418\n114#1:445\n114#1:446,2\n*E\n"})
/* loaded from: classes4.dex */
public final class DynamicsKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f23089a = "DynamicList";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDynamics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,306:1\n113#2:307\n113#2:308\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$1$1\n*L\n129#1:307\n130#1:308\n*E\n"})
    public static final class a implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23095a = new a();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 40;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDynamics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,306:1\n113#2:307\n113#2:308\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$5$1\n*L\n172#1:307\n173#1:308\n*E\n"})
    public static final class b implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23096a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23096a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            constrainAs.centerTo(this.f23096a);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 32;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDynamics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$6$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,306:1\n113#2:307\n113#2:308\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$6$1\n*L\n183#1:307\n184#1:308\n*E\n"})
    public static final class c implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23097a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23097a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23097a.getTop(), 0.0f, 0.0f, 6, (Object) null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), this.f23097a.getEnd(), 0.0f, 0.0f, 6, null);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 24;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23098a;

        public d(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23098a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f23098a.getStart(), this.f23098a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23098a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23099a;

        public e(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23099a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, this.f23099a, 0.0f, 2, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23099a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDynamics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$9$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,306:1\n113#2:307\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$9$1$1\n*L\n226#1:307\n*E\n"})
    public static final class f implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23100a;

        public f(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23100a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerVerticallyTo$default(constrainAs, this.f23100a, 0.0f, 2, null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23100a.getEnd(), Dp.m5115constructorimpl(6), 0.0f, 4, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements x00.l<Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23101a;

        public g(int i11) {
            this.f23101a = i11;
        }

        public final Integer a(int i11) {
            return Integer.valueOf(this.f23101a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements x00.l<Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23102a;

        public h(int i11) {
            this.f23102a = i11;
        }

        public final Integer a(int i11) {
            return Integer.valueOf(this.f23102a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDynamics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$9$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,306:1\n113#2:307\n113#2:308\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt$DynamicEntryContent$1$9$4\n*L\n236#1:307\n237#1:308\n*E\n"})
    public static final class i implements x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23103a;

        public i(String str) {
            this.f23103a = str;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
            kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1269710046, i11, -1, "com.baicizhan.main.home.player.DynamicEntryContent.<anonymous>.<anonymous>.<anonymous> (Dynamics.kt:229)");
            }
            String available = Standard_extKt.getAvailable(this.f23103a);
            if (available == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            Color.Companion companion = Color.Companion;
            TextKt.m1845Text4IGK_g(available, PaddingKt.m727paddingVpY3zN4(BackgroundKt.m234backgroundbw27NRU(Modifier.Companion, Color.m2508copywmQWz5c$default(companion.m2535getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100))), Dp.m5115constructorimpl(7), Dp.m5115constructorimpl(4)), companion.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH5(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 384, 3072, 57336);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ yz.g2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            a(animatedVisibilityScope, composer, num.intValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$2$1", f = "Dynamics.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23104a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23105b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<Integer, String>> f23106c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<q1, yz.g2> f23107d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q1 f23108e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$2$1$1", f = "Dynamics.kt", i = {}, l = {250, 253, 256}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f23109a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f23110b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.l<q1, yz.g2> f23111c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q1 f23112d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MutableState<Pair<Integer, String>> f23113e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, x00.l<? super q1, yz.g2> lVar, q1 q1Var, MutableState<Pair<Integer, String>> mutableState, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f23110b = str;
                this.f23111c = lVar;
                this.f23112d = q1Var;
                this.f23113e = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f23110b, this.f23111c, this.f23112d, this.f23113e, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x009b, code lost:
            
                if (c40.a1.b(400, r8) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
            
                if (c40.a1.b(1300, r8) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
            
                if (c40.a1.b(50, r8) == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r8.f23109a
                    r2 = 3
                    java.lang.String r3 = "DynamicList"
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L28
                    if (r1 == r5) goto L24
                    if (r1 == r4) goto L20
                    if (r1 != r2) goto L18
                    kotlin.e.n(r9)
                    goto L9e
                L18:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L20:
                    kotlin.e.n(r9)
                    goto L6a
                L24:
                    kotlin.e.n(r9)
                    goto L36
                L28:
                    kotlin.e.n(r9)
                    r8.f23109a = r5
                    r6 = 50
                    java.lang.Object r9 = c40.a1.b(r6, r8)
                    if (r9 != r0) goto L36
                    goto L9d
                L36:
                    androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.Integer, java.lang.String>> r9 = r8.f23113e
                    java.lang.Integer r1 = l00.a.f(r5)
                    java.lang.String r5 = r8.f23110b
                    kotlin.Pair r1 = yz.h1.a(r1, r5)
                    com.baicizhan.main.home.player.DynamicsKt.t(r9, r1)
                    androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.Integer, java.lang.String>> r9 = r8.f23113e
                    kotlin.Pair r9 = com.baicizhan.main.home.player.DynamicsKt.s(r9)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r5 = "slot updated 1: "
                    r1.append(r5)
                    r1.append(r9)
                    java.lang.String r9 = r1.toString()
                    android.util.Log.d(r3, r9)
                    r8.f23109a = r4
                    r5 = 1300(0x514, double:6.423E-321)
                    java.lang.Object r9 = c40.a1.b(r5, r8)
                    if (r9 != r0) goto L6a
                    goto L9d
                L6a:
                    androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.Integer, java.lang.String>> r9 = r8.f23113e
                    java.lang.Integer r1 = l00.a.f(r4)
                    java.lang.String r4 = r8.f23110b
                    kotlin.Pair r1 = yz.h1.a(r1, r4)
                    com.baicizhan.main.home.player.DynamicsKt.t(r9, r1)
                    androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.Integer, java.lang.String>> r9 = r8.f23113e
                    kotlin.Pair r9 = com.baicizhan.main.home.player.DynamicsKt.s(r9)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r4 = "slot updated 2: "
                    r1.append(r4)
                    r1.append(r9)
                    java.lang.String r9 = r1.toString()
                    android.util.Log.d(r3, r9)
                    r8.f23109a = r2
                    r1 = 400(0x190, double:1.976E-321)
                    java.lang.Object r9 = c40.a1.b(r1, r8)
                    if (r9 != r0) goto L9e
                L9d:
                    return r0
                L9e:
                    androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.Integer, java.lang.String>> r9 = r8.f23113e
                    r0 = -1
                    java.lang.Integer r0 = l00.a.f(r0)
                    java.lang.String r1 = r8.f23110b
                    kotlin.Pair r0 = yz.h1.a(r0, r1)
                    com.baicizhan.main.home.player.DynamicsKt.t(r9, r0)
                    androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.Integer, java.lang.String>> r9 = r8.f23113e
                    kotlin.Pair r9 = com.baicizhan.main.home.player.DynamicsKt.s(r9)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "slot updated 3: "
                    r0.append(r1)
                    r0.append(r9)
                    java.lang.String r9 = r0.toString()
                    android.util.Log.d(r3, r9)
                    androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.Integer, java.lang.String>> r9 = r8.f23113e
                    r0 = 0
                    com.baicizhan.main.home.player.DynamicsKt.t(r9, r0)
                    x00.l<com.baicizhan.main.home.player.q1, yz.g2> r9 = r8.f23111c
                    com.baicizhan.main.home.player.q1 r0 = r8.f23112d
                    r9.invoke(r0)
                    yz.g2 r9 = yz.g2.f100423a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.DynamicsKt.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(c40.r0 r0Var, MutableState<Pair<Integer, String>> mutableState, x00.l<? super q1, yz.g2> lVar, q1 q1Var, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f23105b = r0Var;
            this.f23106c = mutableState;
            this.f23107d = lVar;
            this.f23108e = q1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new j(this.f23105b, this.f23106c, this.f23107d, this.f23108e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23104a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            Log.d(DynamicsKt.f23089a, "slot changed to " + DynamicsKt.k(this.f23106c));
            Pair k11 = DynamicsKt.k(this.f23106c);
            if (k11 == null) {
                return yz.g2.f100423a;
            }
            int intValue = ((Number) k11.component1()).intValue();
            String str = (String) k11.component2();
            if (intValue == 0) {
                c40.k.f(this.f23105b, null, null, new a(str, this.f23107d, this.f23108e, this.f23106c, null), 3, null);
            }
            return yz.g2.f100423a;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@m80.l Modifier modifier, @m80.k final q1 item, @m80.k final x00.l<? super q1, yz.g2> onSlotAnimated, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(item, "item");
        kotlin.jvm.internal.g0.p(onSlotAnimated, "onSlotAnimated");
        Composer startRestartGroup = composer.startRestartGroup(1380389186);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(item) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(onSlotAnimated) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1380389186, i13, -1, "com.baicizhan.main.home.player.DynamicEntry (Dynamics.kt:90)");
            }
            j(modifier4.then(ComposeUtilsKt.k(Modifier.Companion, 0L, false, item.o(), 3, null)), item, onSlotAnimated, ComposableLambdaKt.rememberComposableLambda(-800433639, true, new x00.r() { // from class: com.baicizhan.main.home.player.t1
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yz.g2 h11;
                    h11 = DynamicsKt.h(q1.this, (q1) obj, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return h11;
                }
            }, startRestartGroup, 54), startRestartGroup, (i13 & 112) | 3072 | (i13 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.u1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 i15;
                    i15 = DynamicsKt.i(Modifier.this, item, onSlotAnimated, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return i15;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 h(q1 q1Var, q1 i11, Modifier it, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(i11, "i");
        kotlin.jvm.internal.g0.p(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800433639, i12, -1, "com.baicizhan.main.home.player.DynamicEntry.<anonymous> (Dynamics.kt:96)");
        }
        coil.compose.l.c(q1Var.q(), "de-status", it, null, null, null, null, 0.0f, null, 0, false, null, composer, ((i12 << 3) & 896) | 48, 0, 4088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 i(Modifier modifier, q1 q1Var, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        g(modifier, q1Var, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void j(Modifier modifier, final q1 q1Var, final x00.l<? super q1, yz.g2> lVar, final x00.r<? super q1, ? super Modifier, ? super Composer, ? super Integer, yz.g2> rVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final x00.r<? super q1, ? super Modifier, ? super Composer, ? super Integer, yz.g2> rVar2;
        Composer composer2;
        final Modifier modifier3;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState;
        Composer startRestartGroup = composer.startRestartGroup(-1523117480);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(q1Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            rVar2 = rVar;
            i13 |= startRestartGroup.changedInstance(rVar2) ? 2048 : 1024;
        } else {
            rVar2 = rVar;
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((i15 & 1171) != 1170, i15 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523117480, i15, -1, "com.baicizhan.main.home.player.DynamicEntryContent (Dynamics.kt:111)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            c40.r0 r0Var = (c40.r0) rememberedValue;
            boolean changed = startRestartGroup.changed(q1Var);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                wg.w<String> p11 = q1Var.p();
                String value = p11 != null ? p11.getValue() : null;
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((value == null || value.length() == 0) ? null : yz.h1.a(0, value), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Modifier then = modifier4.then(GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null));
            startRestartGroup.startReplaceGroup(-1003410150);
            startRestartGroup.startReplaceGroup(212064437);
            startRestartGroup.endReplaceGroup();
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new Measurer2(density);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue5;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue6;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = SnapshotStateKt.mutableStateOf(yz.g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue7;
            boolean changedInstance = startRestartGroup.changedInstance(measurer2) | startRestartGroup.changed(257);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue8 == companion.getEmpty()) {
                final int i16 = 257;
                rememberedValue8 = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i16);
                        mutableState3.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ yz.g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return yz.g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Measurer2.this.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState3;
                startRestartGroup.updateRememberedValue(rememberedValue8);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue8;
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ yz.g2 invoke() {
                        invoke2();
                        return yz.g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MutableState.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            final x00.a aVar = (x00.a) rememberedValue9;
            boolean changedInstance2 = startRestartGroup.changedInstance(measurer2);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ yz.g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return yz.g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, Measurer2.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(then, false, (x00.l) rememberedValue10, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return yz.g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i17) {
                    ConstraintLayoutScope constraintLayoutScope2;
                    ConstrainedLayoutReference constrainedLayoutReference;
                    Modifier.Companion companion2;
                    int i18;
                    ConstrainedLayoutReference constrainedLayoutReference2;
                    if ((i17 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i17, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(yz.g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                    composer3.startReplaceGroup(1736545425);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope3.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    ConstrainedLayoutReference component4 = createRefs.component4();
                    ConstrainedLayoutReference component5 = createRefs.component5();
                    ConstrainedLayoutReference component6 = createRefs.component6();
                    Modifier.Companion companion3 = Modifier.Companion;
                    Object rememberedValue11 = composer3.rememberedValue();
                    Composer.Companion companion4 = Composer.Companion;
                    if (rememberedValue11 == companion4.getEmpty()) {
                        rememberedValue11 = DynamicsKt.a.f23095a;
                        composer3.updateRememberedValue(rememberedValue11);
                    }
                    Modifier m2669graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(constraintLayoutScope3.constrainAs(companion3, component1, (x00.l) rememberedValue11), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
                    composer3.startReplaceGroup(-221059305);
                    composer3.endReplaceGroup();
                    Modifier then2 = m2669graphicsLayerAp8cVGQ$default.then(companion3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, then2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    x00.a<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m1951constructorimpl = Updater.m1951constructorimpl(composer3);
                    Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Color.Companion companion6 = Color.Companion;
                    BoxKt.Box(SizeKt.fillMaxSize$default(BackgroundKt.m234backgroundbw27NRU(companion3, Color.m2508copywmQWz5c$default(companion6.m2535getBlack0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(12))), 0.0f, 1, null), composer3, 0);
                    composer3.endNode();
                    Painter painterResource = PainterResources_androidKt.painterResource(q1Var.m(), composer3, 0);
                    boolean changed2 = composer3.changed(component1);
                    Object rememberedValue12 = composer3.rememberedValue();
                    if (changed2 || rememberedValue12 == companion4.getEmpty()) {
                        rememberedValue12 = new DynamicsKt.b(component1);
                        composer3.updateRememberedValue(rememberedValue12);
                    }
                    ImageKt.Image(painterResource, "de-image", constraintLayoutScope3.constrainAs(companion3, component2, (x00.l) rememberedValue12), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                    Composer composer4 = composer3;
                    if (q1Var.q() != null) {
                        composer4.startReplaceGroup(1738821630);
                        x00.r rVar3 = rVar2;
                        q1 q1Var2 = q1Var;
                        boolean changed3 = composer4.changed(component1);
                        Object rememberedValue13 = composer4.rememberedValue();
                        if (changed3 || rememberedValue13 == companion4.getEmpty()) {
                            rememberedValue13 = new DynamicsKt.c(component1);
                            composer4.updateRememberedValue(rememberedValue13);
                        }
                        rVar3.invoke(q1Var2, OffsetKt.m685offsetVpY3zN4(constraintLayoutScope3.constrainAs(companion3, component6, (x00.l) rememberedValue13), Dp.m5115constructorimpl(10), Dp.m5115constructorimpl(-10)), composer4, 0);
                    } else {
                        composer4.startReplaceGroup(1732279731);
                    }
                    composer4.endReplaceGroup();
                    if (q1Var.n().length() > 0) {
                        composer4.startReplaceGroup(1739163002);
                        String n11 = q1Var.n();
                        long m2546getWhite0d7_KjU = companion6.m2546getWhite0d7_KjU();
                        TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getCaption(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                        int m4977getCentere0LSkKk = TextAlign.Companion.m4977getCentere0LSkKk();
                        int m5029getEllipsisgIe3tQ8 = TextOverflow.Companion.m5029getEllipsisgIe3tQ8();
                        boolean changed4 = composer4.changed(component1);
                        Object rememberedValue14 = composer4.rememberedValue();
                        if (changed4 || rememberedValue14 == companion4.getEmpty()) {
                            rememberedValue14 = new DynamicsKt.d(component1);
                            composer4.updateRememberedValue(rememberedValue14);
                        }
                        Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(OffsetKt.m686offsetVpY3zN4$default(constraintLayoutScope3.constrainAs(companion3, component4, (x00.l) rememberedValue14), 0.0f, Dp.m5115constructorimpl(9), 1, null), ColorKt.Color(4285235629L), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100)));
                        float f11 = 1;
                        constrainedLayoutReference = component1;
                        i18 = helpersHashCode;
                        constrainedLayoutReference2 = component3;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        companion2 = companion3;
                        TextKt.m1845Text4IGK_g(n11, PaddingKt.m727paddingVpY3zN4(m234backgroundbw27NRU, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11)), m2546getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(m4977getCentere0LSkKk), 0L, m5029getEllipsisgIe3tQ8, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, composer3, 384, 3120, 54776);
                        composer4 = composer3;
                    } else {
                        constraintLayoutScope2 = constraintLayoutScope3;
                        constrainedLayoutReference = component1;
                        companion2 = companion3;
                        i18 = helpersHashCode;
                        constrainedLayoutReference2 = component3;
                        composer4.startReplaceGroup(1732279731);
                    }
                    composer4.endReplaceGroup();
                    String r11 = q1Var.r();
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i19 = MaterialTheme.$stable;
                    long Q = bk.b.Q(materialTheme.getColors(composer4, i19));
                    TextStyle caption = materialTheme.getTypography(composer4, i19).getCaption();
                    ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReference;
                    boolean changed5 = composer4.changed(constrainedLayoutReference3);
                    Object rememberedValue15 = composer4.rememberedValue();
                    if (changed5 || rememberedValue15 == companion4.getEmpty()) {
                        rememberedValue15 = new DynamicsKt.e(constrainedLayoutReference3);
                        composer4.updateRememberedValue(rememberedValue15);
                    }
                    ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                    Modifier.Companion companion7 = companion2;
                    TextKt.m1845Text4IGK_g(r11, PaddingKt.m730paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion7, constrainedLayoutReference2, (x00.l) rememberedValue15), 0.0f, Dp.m5115constructorimpl(q1Var.n().length() > 0 ? 11 : 2), 0.0f, 0.0f, 13, null), Q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, caption, composer3, 0, 0, 65528);
                    int mo371roundToPx0680j_4 = ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).mo371roundToPx0680j_4(Dp.m5115constructorimpl(-6));
                    Pair k11 = DynamicsKt.k(mutableState2);
                    if (k11 == null) {
                        composer3.startReplaceGroup(1740396150);
                    } else {
                        composer3.startReplaceGroup(1740396151);
                        int intValue = ((Number) k11.component1()).intValue();
                        String str = (String) k11.component2();
                        boolean z11 = intValue == 1;
                        Modifier m2669graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(companion7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
                        boolean changed6 = composer3.changed(constrainedLayoutReference3);
                        Object rememberedValue16 = composer3.rememberedValue();
                        if (changed6 || rememberedValue16 == companion4.getEmpty()) {
                            rememberedValue16 = new DynamicsKt.f(constrainedLayoutReference3);
                            composer3.updateRememberedValue(rememberedValue16);
                        }
                        Modifier constrainAs = constraintLayoutScope4.constrainAs(m2669graphicsLayerAp8cVGQ$default2, component5, (x00.l) rememberedValue16);
                        EnterTransition plus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m77scaleInL8ZKhE$default(null, 0.5f, TransformOriginKt.TransformOrigin(0.0f, 0.5f), 1, null));
                        boolean changed7 = composer3.changed(mo371roundToPx0680j_4);
                        Object rememberedValue17 = composer3.rememberedValue();
                        if (changed7 || rememberedValue17 == companion4.getEmpty()) {
                            rememberedValue17 = new DynamicsKt.g(mo371roundToPx0680j_4);
                            composer3.updateRememberedValue(rememberedValue17);
                        }
                        EnterTransition plus2 = plus.plus(EnterExitTransitionKt.slideInHorizontally$default(null, (x00.l) rememberedValue17, 1, null));
                        ExitTransition plus3 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m79scaleOutL8ZKhE$default(null, 0.5f, TransformOriginKt.TransformOrigin(0.0f, 0.5f), 1, null));
                        boolean changed8 = composer3.changed(mo371roundToPx0680j_4);
                        Object rememberedValue18 = composer3.rememberedValue();
                        if (changed8 || rememberedValue18 == companion4.getEmpty()) {
                            rememberedValue18 = new DynamicsKt.h(mo371roundToPx0680j_4);
                            composer3.updateRememberedValue(rememberedValue18);
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(z11, constrainAs, plus2, plus3.plus(EnterExitTransitionKt.slideOutHorizontally$default(null, (x00.l) rememberedValue18, 1, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1269710046, true, new DynamicsKt.i(str), composer3, 54), composer3, 196608, 16);
                    }
                    composer3.endReplaceGroup();
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != i18) {
                        EffectsKt.SideEffect(aVar, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), measurePolicy, startRestartGroup, 48, 0);
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
            Pair<Integer, String> k11 = k(mutableState2);
            boolean changed2 = composer2.changed(mutableState2) | composer2.changedInstance(r0Var) | ((i15 & 896) == 256) | composer2.changedInstance(q1Var);
            Object rememberedValue11 = composer2.rememberedValue();
            if (changed2 || rememberedValue11 == companion.getEmpty()) {
                j jVar = new j(r0Var, mutableState2, lVar, q1Var, null);
                composer2.updateRememberedValue(jVar);
                rememberedValue11 = jVar;
            }
            EffectsKt.LaunchedEffect(k11, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue11, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.w1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 m11;
                    m11 = DynamicsKt.m(Modifier.this, q1Var, lVar, rVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return m11;
                }
            });
        }
    }

    public static final Pair<Integer, String> k(MutableState<Pair<Integer, String>> mutableState) {
        return mutableState.getValue();
    }

    public static final void l(MutableState<Pair<Integer, String>> mutableState, Pair<Integer, String> pair) {
        mutableState.setValue(pair);
    }

    public static final yz.g2 m(Modifier modifier, q1 q1Var, x00.l lVar, x00.r rVar, int i11, int i12, Composer composer, int i13) {
        j(modifier, q1Var, lVar, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4285638143L, showBackground = true)
    public static final void n(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1252210546);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252210546, i11, -1, "com.baicizhan.main.home.player.DynamicEntryPreview (Dynamics.kt:271)");
            }
            bk.k.h(null, null, null, l.f23752a.b(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.v1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 o11;
                    o11 = DynamicsKt.o(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
                }
            });
        }
    }

    public static final yz.g2 o(int i11, Composer composer, int i12) {
        n(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void p(@m80.l Modifier modifier, @m80.k final List<q1> dynamics, @m80.l x00.l<? super q1, yz.g2> lVar, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        final x00.l<? super q1, yz.g2> lVar2;
        x00.l<? super q1, yz.g2> lVar3;
        kotlin.jvm.internal.g0.p(dynamics, "dynamics");
        Composer startRestartGroup = composer.startRestartGroup(-421448500);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(dynamics) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        int i16 = 0;
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (i15 != 0) {
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.player.r1
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 q11;
                            q11 = DynamicsKt.q((q1) obj);
                            return q11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                lVar3 = (x00.l) rememberedValue;
            } else {
                lVar3 = lVar;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-421448500, i13, -1, "com.baicizhan.main.home.player.DynamicList (Dynamics.kt:77)");
            }
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(12)), Alignment.Companion.getStart(), startRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-830607386);
            for (Object obj : dynamics) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    a00.h0.b0();
                }
                g(null, (q1) obj, lVar3, startRestartGroup, i13 & 896, 1);
                i16 = i17;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            lVar2 = lVar3;
        } else {
            startRestartGroup.skipToGroupEnd();
            lVar2 = lVar;
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.s1
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 r11;
                    r11 = DynamicsKt.r(Modifier.this, dynamics, lVar2, i11, i12, (Composer) obj2, ((Integer) obj3).intValue());
                    return r11;
                }
            });
        }
    }

    public static final yz.g2 q(q1 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(Modifier modifier, List list, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        p(modifier, list, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
