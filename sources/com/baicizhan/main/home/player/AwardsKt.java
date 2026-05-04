package com.baicizhan.main.home.player;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
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
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.extractor.WavUtil;
import com.baicizhan.main.home.player.AwardsKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.a;
import com.esotericsoftware.spine.android.SpineView;
import com.handmark.pulltorefresh.library.internal.RotateLoadingLayout;
import com.jiongji.andriod.card.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAwards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,292:1\n75#2:293\n77#2:352\n557#3:294\n554#3,6:295\n1247#4,3:301\n1250#4,3:305\n1247#4,6:308\n1225#4,6:321\n555#5:304\n354#6,7:314\n361#6,2:327\n363#6,7:330\n401#6,10:337\n400#6:347\n412#6,4:348\n416#6,7:353\n446#6,12:360\n472#6:372\n1#7:329\n85#8:373\n113#8,2:374\n85#8:376\n113#8,2:377\n85#8:379\n85#8:380\n85#8:381\n85#8:382\n85#8:383\n85#8:384\n85#8:385\n85#8:386\n85#8:387\n113#8,2:388\n85#8:390\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt\n*L\n83#1:293\n85#1:352\n84#1:294\n84#1:295,6\n84#1:301,3\n84#1:305,3\n85#1:308,6\n85#1:321,6\n84#1:304\n85#1:314,7\n85#1:327,2\n85#1:330,7\n85#1:337,10\n85#1:347\n85#1:348,4\n85#1:353,7\n85#1:360,12\n85#1:372\n85#1:329\n87#1:373\n87#1:374,2\n100#1:376\n100#1:377,2\n101#1:379\n106#1:380\n109#1:381\n112#1:382\n115#1:383\n118#1:384\n121#1:385\n125#1:386\n131#1:387\n131#1:388,2\n132#1:390\n*E\n"})
/* loaded from: classes4.dex */
public final class AwardsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int f23047a = 500;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,292:1\n113#2:293\n113#2:294\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$1$1\n*L\n147#1:293\n148#1:294\n*E\n"})
    public static final class a implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23053a = new a();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setVerticalBias(0.58f);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 172;
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
    public static final class b implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23054a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23054a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), this.f23054a.getTop(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setVerticalBias(0.475f);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$11\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,292:1\n113#2:293\n113#2:332\n87#3:294\n84#3,9:295\n94#3:336\n79#4,6:304\n86#4,3:319\n89#4,2:328\n93#4:335\n347#5,9:310\n356#5:330\n357#5,2:333\n4206#6,6:322\n1565#7:331\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$11\n*L\n257#1:293\n283#1:332\n257#1:294\n257#1:295,9\n257#1:336\n257#1:304,6\n257#1:319,3\n257#1:328,2\n257#1:335\n257#1:310,9\n257#1:330\n257#1:333,2\n257#1:322,6\n259#1:331\n*E\n"})
    public static final class c implements x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23055a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23056b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<Integer> f23057c;

        public c(String str, int i11, State<Integer> state) {
            this.f23055a = str;
            this.f23056b = i11;
            this.f23057c = state;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
            kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1500768404, i11, -1, "com.baicizhan.main.home.player.BookPlanMilestone.<anonymous>.<anonymous> (Awards.kt:256)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(32), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            String str = this.f23055a;
            int i12 = this.f23056b;
            State<Integer> state = this.f23057c;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m728paddingVpY3zN4$default);
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
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("你在《" + str + "》已背");
            builder.pushStyle(new SpanStyle(ColorKt.Color(4294894986L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (kotlin.jvm.internal.v) null));
            builder.append(" " + i12 + " ");
            builder.pop();
            builder.append("个词\n词书进度达到了");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH4(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            long m2546getWhite0d7_KjU = Color.Companion.m2546getWhite0d7_KjU();
            TextAlign.Companion companion3 = TextAlign.Companion;
            TextKt.m1846TextIbK3jfQ(annotatedString, null, m2546getWhite0d7_KjU, 0L, null, null, null, 0L, null, TextAlign.m4970boximpl(companion3.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, m4572copyp1EtxEg$default, composer, 384, 0, 130554);
            TextKt.m1845Text4IGK_g(AwardsKt.j(state) + "%", PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(16), 0.0f, 0.0f, 13, null), ColorKt.Color(4294956877L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(companion3.m4977getCentere0LSkKk()), 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(0L, TextUnitKt.getSp(48), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.n(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(56), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null), composer, 432, 3120, 54776);
            composer.endNode();
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
    @l00.d(c = "com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$2$12$1", f = "Awards.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23058a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MutableState<Boolean> mutableState, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f23059b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f23059b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23058a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            AwardsKt.o(this.f23059b, true);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements x00.l<Context, SpineView> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f23060a;

        public e(com.esotericsoftware.spine.android.c cVar) {
            this.f23060a = cVar;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpineView invoke(Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            return new SpineView.b(context, this.f23060a).e("spine/ui_baoxiang.atlas.txt", "spine/ui_baoxiang.skel.bytes").c(new ll.e("ani_jingzhi")).a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23061a;

        public f(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23061a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f23061a.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setVerticalBias(0.427f);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,292:1\n1247#2,6:293\n113#3:299\n113#3:300\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$4\n*L\n170#1:293,6\n173#1:299\n174#1:300\n*E\n"})
    public static final class g implements x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<Boolean, yz.g2> f23062a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.a<yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<Boolean, yz.g2> f23063a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(x00.l<? super Boolean, yz.g2> lVar) {
                this.f23063a = lVar;
            }

            public final void a() {
                this.f23063a.invoke(Boolean.TRUE);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ yz.g2 invoke() {
                a();
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(x00.l<? super Boolean, yz.g2> lVar) {
            this.f23062a = lVar;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
            kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-827587979, i11, -1, "com.baicizhan.main.home.player.BookPlanMilestone.<anonymous>.<anonymous> (Awards.kt:168)");
            }
            boolean changed = composer.changed(this.f23062a);
            x00.l<Boolean, yz.g2> lVar = this.f23062a;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(lVar);
                composer.updateRememberedValue(rememberedValue);
            }
            ButtonKt.Button((x00.a) rememberedValue, null, false, null, null, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100)), null, null, PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), com.baicizhan.main.home.player.j.f23707a.b(), composer, 905969664, R.styleable.Theme_drawable_sound);
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
    @kotlin.jvm.internal.u0({"SMAP\nAwards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,292:1\n113#2:293\n113#2:294\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$5$1\n*L\n188#1:293\n189#1:294\n*E\n"})
    public static final class h implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23064a;

        public h(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23064a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23064a.getStart(), Dp.m5115constructorimpl(47), 0.0f, 4, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23064a.getTop(), Dp.m5115constructorimpl(40), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i implements x00.l<GraphicsLayerScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State<Float> f23065a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<Dp> f23066b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<Dp> f23067c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ State<Float> f23068d;

        public i(State<Float> state, State<Dp> state2, State<Dp> state3, State<Float> state4) {
            this.f23065a = state;
            this.f23066b = state2;
            this.f23067c = state3;
            this.f23068d = state4;
        }

        public final void a(GraphicsLayerScope graphicsLayer) {
            kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.mo2701setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(1.0f, 1.0f));
            graphicsLayer.setScaleX(AwardsKt.s(this.f23065a));
            graphicsLayer.setScaleY(AwardsKt.s(this.f23065a));
            graphicsLayer.setTranslationX(graphicsLayer.mo377toPx0680j_4(AwardsKt.f(this.f23066b)));
            graphicsLayer.setTranslationY(graphicsLayer.mo377toPx0680j_4(AwardsKt.g(this.f23067c)) + AwardsKt.m(this.f23068d));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(GraphicsLayerScope graphicsLayerScope) {
            a(graphicsLayerScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,292:1\n113#2:293\n113#2:294\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt$BookPlanMilestone$2$7$1\n*L\n202#1:293\n204#1:294\n*E\n"})
    public static final class j implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23069a;

        public j(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23069a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), this.f23069a.getEnd(), Dp.m5115constructorimpl(27), 0.0f, 4, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23069a.getTop(), Dp.m5115constructorimpl(53), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements x00.l<GraphicsLayerScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State<Float> f23070a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<Dp> f23071b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<Dp> f23072c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ State<Float> f23073d;

        public k(State<Float> state, State<Dp> state2, State<Dp> state3, State<Float> state4) {
            this.f23070a = state;
            this.f23071b = state2;
            this.f23072c = state3;
            this.f23073d = state4;
        }

        public final void a(GraphicsLayerScope graphicsLayer) {
            kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.mo2701setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 1.0f));
            graphicsLayer.setScaleX(AwardsKt.s(this.f23070a));
            graphicsLayer.setScaleY(AwardsKt.s(this.f23070a));
            graphicsLayer.setTranslationX(graphicsLayer.mo377toPx0680j_4(AwardsKt.h(this.f23071b)));
            graphicsLayer.setTranslationY(graphicsLayer.mo377toPx0680j_4(AwardsKt.i(this.f23072c)) + AwardsKt.m(this.f23073d));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(GraphicsLayerScope graphicsLayerScope) {
            a(graphicsLayerScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m implements ml.d {

        /* renamed from: a, reason: collision with root package name */
        public static final m f23075a = new m();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends a.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.esotericsoftware.spine.android.c f23076a;

            public a(com.esotericsoftware.spine.android.c cVar) {
                this.f23076a = cVar;
            }

            @Override // com.esotericsoftware.spine.a.c, com.esotericsoftware.spine.a.d
            public void c(a.g gVar) {
                Animation c11;
                if (kotlin.jvm.internal.g0.g((gVar == null || (c11 = gVar.c()) == null) ? null : c11.c(), "ani_open")) {
                    this.f23076a.i().x(0, "ani_idle", true);
                }
            }
        }

        @Override // ml.d
        public final void a(com.esotericsoftware.spine.android.c cVar) {
            cVar.i().x(0, "ani_jingzhi", false);
            cVar.i().d(new a(cVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s implements x00.l<Float, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f23082a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23083b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f23084c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23085d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$2$scale$2$1$1", f = "Awards.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f23086a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableState<Boolean> f23087b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f23087b = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f23087b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f23086a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    this.f23086a = 1;
                    if (c40.a1.b(200L, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                AwardsKt.r(this.f23087b, true);
                return yz.g2.f100423a;
            }
        }

        public s(com.esotericsoftware.spine.android.c cVar, c40.r0 r0Var, x00.a<yz.g2> aVar, MutableState<Boolean> mutableState) {
            this.f23082a = cVar;
            this.f23083b = r0Var;
            this.f23084c = aVar;
            this.f23085d = mutableState;
        }

        public final void a(float f11) {
            if (f11 == 1.0f) {
                this.f23082a.i().x(0, "ani_open", false);
                c40.k.f(this.f23083b, null, null, new a(this.f23085d, null), 3, null);
                this.f23084c.invoke();
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Float f11) {
            a(f11.floatValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t implements x00.l<Float, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23088a;

        public t(MutableState<Boolean> mutableState) {
            this.f23088a = mutableState;
        }

        public final void a(float f11) {
            if (f11 == 1.0f) {
                AwardsKt.k(this.f23088a, true);
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Float f11) {
            a(f11.floatValue());
            return yz.g2.f100423a;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@m80.k final String bookName, final int i11, final int i12, final int i13, @m80.k final x00.a<yz.g2> onOpen, @m80.k final x00.l<? super Boolean, yz.g2> onDismiss, @m80.l Composer composer, final int i14) {
        int i15;
        Composer composer2;
        Density density;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState;
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(onOpen, "onOpen");
        kotlin.jvm.internal.g0.p(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(989381574);
        if ((i14 & 6) == 0) {
            i15 = (startRestartGroup.changed(bookName) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= startRestartGroup.changed(i12) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= startRestartGroup.changed(i13) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= startRestartGroup.changedInstance(onOpen) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= startRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i15) != 74898, i15 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(989381574, i15, -1, "com.baicizhan.main.home.player.BookPlanMilestone (Awards.kt:81)");
            }
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 0.0f, 1, null);
            boolean z11 = (i15 & 458752) == 131072;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.b
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 d11;
                        d11 = AwardsKt.d(x00.l.this);
                        return d11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier k11 = ComposeUtilsKt.k(fillMaxSize$default, 0L, false, (x00.a) rememberedValue2, 3, null);
            startRestartGroup.startReplaceGroup(-1003410150);
            startRestartGroup.startReplaceGroup(212064437);
            startRestartGroup.endReplaceGroup();
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new Measurer2(density3);
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
                density = density2;
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                density = density2;
            }
            final MutableState mutableState2 = (MutableState) rememberedValue5;
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
            final MutableState mutableState3 = (MutableState) rememberedValue7;
            final int i16 = 257;
            boolean changedInstance = startRestartGroup.changedInstance(measurer2) | startRestartGroup.changed(257);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i16);
                        mutableState2.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$2.1
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
                mutableState = mutableState2;
                startRestartGroup.updateRememberedValue(rememberedValue8);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue8;
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$3
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
                rememberedValue10 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$4
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
            final Density density4 = density;
            composer2 = startRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(k11, false, (x00.l) rememberedValue10, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$5
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
                    boolean q11;
                    ConstrainedLayoutReference constrainedLayoutReference;
                    float f11;
                    boolean q12;
                    boolean q13;
                    boolean q14;
                    boolean q15;
                    boolean q16;
                    boolean q17;
                    boolean e11;
                    boolean n11;
                    MutableState mutableState4;
                    float p11;
                    boolean e12;
                    int l11;
                    TextStyle m4604mergedA7vx0o;
                    int l12;
                    boolean q18;
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
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer3.startReplaceGroup(-1846378759);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    ConstrainedLayoutReference component4 = createRefs.component4();
                    ConstrainedLayoutReference component5 = createRefs.component5();
                    Object rememberedValue11 = composer3.rememberedValue();
                    Composer.Companion companion2 = Composer.Companion;
                    if (rememberedValue11 == companion2.getEmpty()) {
                        rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(rememberedValue11);
                    }
                    MutableState mutableState5 = (MutableState) rememberedValue11;
                    Object rememberedValue12 = composer3.rememberedValue();
                    if (rememberedValue12 == companion2.getEmpty()) {
                        rememberedValue12 = new com.esotericsoftware.spine.android.c(AwardsKt.m.f23075a);
                        composer3.updateRememberedValue(rememberedValue12);
                    }
                    com.esotericsoftware.spine.android.c cVar = (com.esotericsoftware.spine.android.c) rememberedValue12;
                    Object rememberedValue13 = composer3.rememberedValue();
                    if (rememberedValue13 == companion2.getEmpty()) {
                        rememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(rememberedValue13);
                    }
                    MutableState mutableState6 = (MutableState) rememberedValue13;
                    q11 = AwardsKt.q(mutableState6);
                    if (q11) {
                        constrainedLayoutReference = component5;
                        f11 = 1.0f;
                    } else {
                        constrainedLayoutReference = component5;
                        f11 = 0.0f;
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    Object rememberedValue14 = composer3.rememberedValue();
                    if (rememberedValue14 == companion2.getEmpty()) {
                        rememberedValue14 = new AwardsKt.t(mutableState5);
                        composer3.updateRememberedValue(rememberedValue14);
                    }
                    ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReference;
                    State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f11, tween$default, 0.0f, null, (x00.l) rememberedValue14, composer3, 24624, 12);
                    q12 = AwardsKt.q(mutableState6);
                    float m5115constructorimpl = Dp.m5115constructorimpl(q12 ? 0 : 4);
                    TweenSpec tween$default2 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    Object rememberedValue15 = composer3.rememberedValue();
                    if (rememberedValue15 == companion2.getEmpty()) {
                        rememberedValue15 = AwardsKt.n.f23077a;
                        composer3.updateRememberedValue(rememberedValue15);
                    }
                    State<Dp> m125animateDpAsStateAjpBEmI = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl, tween$default2, null, (x00.l) rememberedValue15, composer3, 3120, 4);
                    q13 = AwardsKt.q(mutableState6);
                    float m5115constructorimpl2 = Dp.m5115constructorimpl(q13 ? 0 : 66);
                    TweenSpec tween$default3 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    Object rememberedValue16 = composer3.rememberedValue();
                    if (rememberedValue16 == companion2.getEmpty()) {
                        rememberedValue16 = AwardsKt.p.f23079a;
                        composer3.updateRememberedValue(rememberedValue16);
                    }
                    State<Dp> m125animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl2, tween$default3, null, (x00.l) rememberedValue16, composer3, 3120, 4);
                    q14 = AwardsKt.q(mutableState6);
                    float m5115constructorimpl3 = Dp.m5115constructorimpl(q14 ? 0 : -4);
                    TweenSpec tween$default4 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    Object rememberedValue17 = composer3.rememberedValue();
                    if (rememberedValue17 == companion2.getEmpty()) {
                        rememberedValue17 = AwardsKt.o.f23078a;
                        composer3.updateRememberedValue(rememberedValue17);
                    }
                    State<Dp> m125animateDpAsStateAjpBEmI3 = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl3, tween$default4, null, (x00.l) rememberedValue17, composer3, 3120, 4);
                    q15 = AwardsKt.q(mutableState6);
                    float m5115constructorimpl4 = Dp.m5115constructorimpl(q15 ? 0 : 80);
                    TweenSpec tween$default5 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    Object rememberedValue18 = composer3.rememberedValue();
                    if (rememberedValue18 == companion2.getEmpty()) {
                        rememberedValue18 = AwardsKt.q.f23080a;
                        composer3.updateRememberedValue(rememberedValue18);
                    }
                    State<Dp> m125animateDpAsStateAjpBEmI4 = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl4, tween$default5, null, (x00.l) rememberedValue18, composer3, 3120, 4);
                    q16 = AwardsKt.q(mutableState6);
                    int i18 = q16 ? i11 : 0;
                    TweenSpec tween$default6 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    Object rememberedValue19 = composer3.rememberedValue();
                    if (rememberedValue19 == companion2.getEmpty()) {
                        rememberedValue19 = AwardsKt.r.f23081a;
                        composer3.updateRememberedValue(rememberedValue19);
                    }
                    State<Integer> animateIntAsState = AnimateAsStateKt.animateIntAsState(i18, tween$default6, null, (x00.l) rememberedValue19, composer3, 3120, 4);
                    q17 = AwardsKt.q(mutableState6);
                    int i19 = q17 ? i13 : 0;
                    TweenSpec tween$default7 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                    Object rememberedValue20 = composer3.rememberedValue();
                    if (rememberedValue20 == companion2.getEmpty()) {
                        rememberedValue20 = AwardsKt.l.f23074a;
                        composer3.updateRememberedValue(rememberedValue20);
                    }
                    State<Integer> animateIntAsState2 = AnimateAsStateKt.animateIntAsState(i19, tween$default7, null, (x00.l) rememberedValue20, composer3, 3120, 4);
                    InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composer3, 0, 1);
                    e11 = AwardsKt.e(mutableState5);
                    State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, e11 ? density4.mo377toPx0680j_4(Dp.m5115constructorimpl(8)) : 0.0f, new InfiniteRepeatableSpec(AnimationSpecKt.tween$default(RotateLoadingLayout.f35182s, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Reverse, StartOffset.m168constructorimpl$default(200, 0, 2, null), (kotlin.jvm.internal.v) null), "offset-anim", composer3, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
                    Object rememberedValue21 = composer3.rememberedValue();
                    if (rememberedValue21 == companion2.getEmpty()) {
                        rememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(rememberedValue21);
                    }
                    MutableState mutableState7 = (MutableState) rememberedValue21;
                    n11 = AwardsKt.n(mutableState7);
                    float f12 = n11 ? 1.0f : 0.1f;
                    TweenSpec tween$default8 = AnimationSpecKt.tween$default(400, 0, null, 6, null);
                    boolean changedInstance3 = composer3.changedInstance(cVar) | composer3.changedInstance(r0Var) | composer3.changed(onOpen);
                    Object rememberedValue22 = composer3.rememberedValue();
                    if (changedInstance3 || rememberedValue22 == companion2.getEmpty()) {
                        mutableState4 = mutableState6;
                        rememberedValue22 = new AwardsKt.s(cVar, r0Var, onOpen, mutableState4);
                        composer3.updateRememberedValue(rememberedValue22);
                    } else {
                        mutableState4 = mutableState6;
                    }
                    MutableState mutableState8 = mutableState4;
                    State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f12, tween$default8, 0.0f, null, (x00.l) rememberedValue22, composer3, 48, 12);
                    Modifier.Companion companion3 = Modifier.Companion;
                    Object rememberedValue23 = composer3.rememberedValue();
                    if (rememberedValue23 == companion2.getEmpty()) {
                        rememberedValue23 = AwardsKt.a.f23053a;
                        composer3.updateRememberedValue(rememberedValue23);
                    }
                    Modifier constrainAs = constraintLayoutScope2.constrainAs(companion3, component1, (x00.l) rememberedValue23);
                    p11 = AwardsKt.p(animateFloatAsState2);
                    Modifier scale = ScaleKt.scale(constrainAs, p11);
                    boolean changedInstance4 = composer3.changedInstance(cVar);
                    Object rememberedValue24 = composer3.rememberedValue();
                    if (changedInstance4 || rememberedValue24 == companion2.getEmpty()) {
                        rememberedValue24 = new AwardsKt.e(cVar);
                        composer3.updateRememberedValue(rememberedValue24);
                    }
                    AndroidView_androidKt.AndroidView((x00.l) rememberedValue24, scale, null, composer3, 0, 4);
                    e12 = AwardsKt.e(mutableState5);
                    boolean changed = composer3.changed(component1);
                    Object rememberedValue25 = composer3.rememberedValue();
                    if (changed || rememberedValue25 == companion2.getEmpty()) {
                        rememberedValue25 = new AwardsKt.f(component1);
                        composer3.updateRememberedValue(rememberedValue25);
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(e12, constraintLayoutScope2.constrainAs(companion3, component2, (x00.l) rememberedValue25), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-827587979, true, new AwardsKt.g(onDismiss), composer3, 54), composer3, 200064, 16);
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_coin_bonus, composer3, 6);
                    boolean changed2 = composer3.changed(component1);
                    Object rememberedValue26 = composer3.rememberedValue();
                    if (changed2 || rememberedValue26 == companion2.getEmpty()) {
                        rememberedValue26 = new AwardsKt.h(component1);
                        composer3.updateRememberedValue(rememberedValue26);
                    }
                    Modifier constrainAs2 = constraintLayoutScope2.constrainAs(companion3, component3, (x00.l) rememberedValue26);
                    boolean changed3 = composer3.changed(animateFloatAsState) | composer3.changed(m125animateDpAsStateAjpBEmI) | composer3.changed(m125animateDpAsStateAjpBEmI2) | composer3.changed(animateFloat);
                    Object rememberedValue27 = composer3.rememberedValue();
                    if (changed3 || rememberedValue27 == companion2.getEmpty()) {
                        rememberedValue27 = new AwardsKt.i(animateFloatAsState, m125animateDpAsStateAjpBEmI, m125animateDpAsStateAjpBEmI2, animateFloat);
                        composer3.updateRememberedValue(rememberedValue27);
                    }
                    ImageKt.Image(painterResource, "", GraphicsLayerModifierKt.graphicsLayer(constrainAs2, (x00.l) rememberedValue27), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                    boolean changed4 = composer3.changed(component1);
                    Object rememberedValue28 = composer3.rememberedValue();
                    if (changed4 || rememberedValue28 == companion2.getEmpty()) {
                        rememberedValue28 = new AwardsKt.j(component1);
                        composer3.updateRememberedValue(rememberedValue28);
                    }
                    Modifier constrainAs3 = constraintLayoutScope2.constrainAs(companion3, component4, (x00.l) rememberedValue28);
                    boolean changed5 = composer3.changed(animateFloatAsState) | composer3.changed(m125animateDpAsStateAjpBEmI3) | composer3.changed(m125animateDpAsStateAjpBEmI4) | composer3.changed(animateFloat);
                    Object rememberedValue29 = composer3.rememberedValue();
                    if (changed5 || rememberedValue29 == companion2.getEmpty()) {
                        rememberedValue29 = new AwardsKt.k(animateFloatAsState, m125animateDpAsStateAjpBEmI3, m125animateDpAsStateAjpBEmI4, animateFloat);
                        composer3.updateRememberedValue(rememberedValue29);
                    }
                    Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(constrainAs3, (x00.l) rememberedValue29);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, graphicsLayer);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Object rememberedValue30 = composer3.rememberedValue();
                    if (rememberedValue30 == companion2.getEmpty()) {
                        rememberedValue30 = new TextStyle(0L, TextUnitKt.getSp(24), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.n(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null);
                        composer3.updateRememberedValue(rememberedValue30);
                    }
                    TextStyle textStyle = (TextStyle) rememberedValue30;
                    l11 = AwardsKt.l(animateIntAsState2);
                    long Color = ColorKt.Color(4292510720L);
                    m4604mergedA7vx0o = textStyle.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : new Stroke(density4.mo377toPx0680j_4(Dp.m5115constructorimpl(2)), 0.0f, 0, StrokeJoin.Companion.m2874getRoundLxFBmk8(), null, 22, null), (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
                    TextOverflow.Companion companion5 = TextOverflow.Companion;
                    int m5029getEllipsisgIe3tQ8 = companion5.m5029getEllipsisgIe3tQ8();
                    TextAlign.Companion companion6 = TextAlign.Companion;
                    TextKt.m1845Text4IGK_g("+" + l11, (Modifier) null, Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(companion6.m4977getCentere0LSkKk()), 0L, m5029getEllipsisgIe3tQ8, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4604mergedA7vx0o, composer3, 384, 3120, 54778);
                    l12 = AwardsKt.l(animateIntAsState2);
                    TextKt.m1845Text4IGK_g("+" + l12, (Modifier) null, Color.Companion.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(companion6.m4977getCentere0LSkKk()), 0L, companion5.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, textStyle, composer3, 384, 1575984, 54778);
                    composer3.endNode();
                    q18 = AwardsKt.q(mutableState8);
                    boolean changed6 = composer3.changed(component1);
                    Object rememberedValue31 = composer3.rememberedValue();
                    if (changed6 || rememberedValue31 == companion2.getEmpty()) {
                        rememberedValue31 = new AwardsKt.b(component1);
                        composer3.updateRememberedValue(rememberedValue31);
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(q18, constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReference2, (x00.l) rememberedValue31), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1500768404, true, new AwardsKt.c(bookName, i12, animateIntAsState), composer3, 54), composer3, 200064, 16);
                    Object rememberedValue32 = composer3.rememberedValue();
                    if (rememberedValue32 == companion2.getEmpty()) {
                        rememberedValue32 = new AwardsKt.d(mutableState7, null);
                        composer3.updateRememberedValue(rememberedValue32);
                    }
                    EffectsKt.LaunchedEffect(cVar, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue32, composer3, 0);
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.c
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t11;
                    t11 = AwardsKt.t(bookName, i11, i12, i13, onOpen, onDismiss, i14, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            });
        }
    }

    public static final yz.g2 d(x00.l lVar) {
        lVar.invoke(Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final boolean e(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float f(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    public static final float g(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    public static final float h(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    public static final float i(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    public static final int j(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final void k(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final int l(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final float m(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final boolean n(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void o(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final float p(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final boolean q(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void r(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final float s(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final yz.g2 t(String str, int i11, int i12, int i13, x00.a aVar, x00.l lVar, int i14, Composer composer, int i15) {
        c(str, i11, i12, i13, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i14 | 1));
        return yz.g2.f100423a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l implements x00.l<Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f23074a = new l();

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Integer num) {
            a(num.intValue());
            return yz.g2.f100423a;
        }

        public final void a(int i11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n implements x00.l<Dp, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f23077a = new n();

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Dp dp2) {
            a(dp2.m5129unboximpl());
            return yz.g2.f100423a;
        }

        public final void a(float f11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o implements x00.l<Dp, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f23078a = new o();

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Dp dp2) {
            a(dp2.m5129unboximpl());
            return yz.g2.f100423a;
        }

        public final void a(float f11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p implements x00.l<Dp, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f23079a = new p();

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Dp dp2) {
            a(dp2.m5129unboximpl());
            return yz.g2.f100423a;
        }

        public final void a(float f11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q implements x00.l<Dp, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f23080a = new q();

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Dp dp2) {
            a(dp2.m5129unboximpl());
            return yz.g2.f100423a;
        }

        public final void a(float f11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r implements x00.l<Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f23081a = new r();

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Integer num) {
            a(num.intValue());
            return yz.g2.f100423a;
        }

        public final void a(int i11) {
        }
    }
}
