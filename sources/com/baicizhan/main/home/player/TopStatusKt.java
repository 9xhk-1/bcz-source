package com.baicizhan.main.home.player;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.baicizhan.main.home.player.model.HomeMode;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,543:1\n1247#2,6:544\n1247#2,6:594\n1247#2,6:600\n1247#2,6:606\n1225#2,6:620\n1247#2,6:672\n1247#2,6:678\n1247#2,6:684\n1247#2,6:690\n1247#2,6:696\n1247#2,6:702\n1247#2,6:708\n1247#2,6:714\n1247#2,6:758\n1247#2,6:764\n1247#2,6:770\n1247#2,6:776\n1247#2,6:782\n1247#2,6:789\n1247#2,6:795\n1247#2,6:802\n1247#2,6:808\n75#3:550\n75#3:589\n77#3:651\n113#4:551\n113#4:588\n113#4:612\n113#4:757\n113#4:788\n113#4:801\n113#4:854\n70#5:552\n68#5,8:553\n77#5:593\n70#5:814\n68#5,8:815\n77#5:853\n79#6,6:561\n86#6,3:576\n89#6,2:585\n93#6:592\n79#6,6:730\n86#6,3:745\n89#6,2:754\n79#6,6:823\n86#6,3:838\n89#6,2:847\n93#6:852\n93#6:857\n347#7,9:567\n356#7:587\n357#7,2:590\n347#7,9:736\n356#7:756\n347#7,9:829\n356#7,3:849\n357#7,2:855\n4206#8,6:579\n4206#8,6:748\n4206#8,6:841\n354#9,7:613\n361#9,2:626\n363#9,7:629\n401#9,10:636\n400#9:646\n412#9,4:647\n416#9,7:652\n446#9,12:659\n472#9:671\n1#10:628\n99#11:720\n96#11,9:721\n106#11:858\n78#12:859\n78#12:861\n85#13:860\n85#13:862\n85#13:863\n113#13,2:864\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt\n*L\n75#1:544,6\n168#1:594,6\n169#1:600,6\n177#1:606,6\n175#1:620,6\n376#1:672,6\n377#1:678,6\n378#1:684,6\n379#1:690,6\n389#1:696,6\n390#1:702,6\n395#1:708,6\n396#1:714,6\n423#1:758,6\n433#1:764,6\n428#1:770,6\n483#1:776,6\n486#1:782,6\n500#1:789,6\n503#1:795,6\n510#1:802,6\n512#1:808,6\n78#1:550\n90#1:589\n175#1:651\n79#1:551\n85#1:588\n178#1:612\n404#1:757\n491#1:788\n510#1:801\n518#1:854\n79#1:552\n79#1:553,8\n79#1:593\n510#1:814\n510#1:815,8\n510#1:853\n79#1:561,6\n79#1:576,3\n79#1:585,2\n79#1:592\n403#1:730,6\n403#1:745,3\n403#1:754,2\n510#1:823,6\n510#1:838,3\n510#1:847,2\n510#1:852\n403#1:857\n79#1:567,9\n79#1:587\n79#1:590,2\n403#1:736,9\n403#1:756\n510#1:829,9\n510#1:849,3\n403#1:855,2\n79#1:579,6\n403#1:748,6\n510#1:841,6\n175#1:613,7\n175#1:626,2\n175#1:629,7\n175#1:636,10\n175#1:646\n175#1:647,4\n175#1:652,7\n175#1:659,12\n175#1:671\n175#1:628\n403#1:720\n403#1:721,9\n403#1:858\n389#1:859\n395#1:861\n390#1:860\n396#1:862\n423#1:863\n423#1:864,2\n*E\n"})
/* loaded from: classes4.dex */
public final class TopStatusKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,543:1\n1247#2,6:544\n113#3:550\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$1\n*L\n183#1:544,6\n191#1:550\n*E\n"})
    public static final class a implements x00.p<Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f23383a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23384b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f23385c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f23386d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a8 f23387e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,543:1\n113#2:544\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$1$1$1\n*L\n184#1:544\n*E\n"})
        /* renamed from: com.baicizhan.main.home.player.TopStatusKt$a$a, reason: collision with other inner class name */
        public static final class C0319a implements x00.l<ConstrainScope, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0319a f23388a = new C0319a();

            public final void a(ConstrainScope constrainAs) {
                kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
                ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(12), 0.0f, 0.0f, 0.0f, 0.0f, 120, (Object) null);
                ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
                Dimension.Companion companion = Dimension.Companion;
                constrainAs.setWidth(companion.getFillToConstraints());
                constrainAs.setHeight(companion.getFillToConstraints());
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
                a(constrainScope);
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$1$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,543:1\n70#2:544\n68#2,8:545\n77#2:585\n79#3,6:553\n86#3,3:568\n89#3,2:577\n93#3:584\n347#4,9:559\n356#4:579\n357#4,2:582\n4206#5,6:571\n113#6:580\n113#6:581\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$1$2\n*L\n193#1:544\n193#1:545,8\n193#1:585\n193#1:553,6\n193#1:568,3\n193#1:577,2\n193#1:584\n193#1:559,9\n193#1:579\n193#1:582,2\n193#1:571,6\n203#1:580\n214#1:581\n*E\n"})
        public static final class b implements x00.p<Composer, Integer, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f23389a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a8 f23390b;

            public b(boolean z11, a8 a8Var) {
                this.f23389a = z11;
                this.f23390b = a8Var;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void a(Composer composer, int i11) {
                if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1638559698, i11, -1, "com.baicizhan.main.home.player.Status.<anonymous>.<anonymous>.<anonymous> (TopStatus.kt:192)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment centerEnd = Alignment.Companion.getCenterEnd();
                boolean z11 = this.f23389a;
                a8 a8Var = this.f23390b;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
                Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (z11) {
                    composer.startReplaceGroup(-1509664107);
                    bu.d.c(a8Var.g(), SizeKt.m778width3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5115constructorimpl(10), 0.0f, 11, null), Dp.m5115constructorimpl(42)), null, 0L, 0L, 0L, TextUnitKt.getSp(14), null, FontWeight.Companion.getMedium(), null, TextUnitKt.getSp(0), null, TextAlign.Companion.m4977getCentere0LSkKk(), TextUnitKt.getSp(14), 0, false, 1, 0, null, false, 0.0f, composer, 102236208, 1575942, 0, 2017980);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1509090080);
                    TextKt.m1845Text4IGK_g(a8Var.g(), SizeKt.m778width3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5115constructorimpl(10), 0.0f, 11, null), Dp.m5115constructorimpl(42)), 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, TextUnitKt.getSp(0), (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), TextUnitKt.getSp(14), 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 12782640, 3078, 121172);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return yz.g2.f100423a;
            }
        }

        public a(ConstraintLayoutScope constraintLayoutScope, ConstrainedLayoutReference constrainedLayoutReference, long j11, boolean z11, a8 a8Var) {
            this.f23383a = constraintLayoutScope;
            this.f23384b = constrainedLayoutReference;
            this.f23385c = j11;
            this.f23386d = z11;
            this.f23387e = a8Var;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(403437810, i11, -1, "com.baicizhan.main.home.player.Status.<anonymous>.<anonymous> (TopStatus.kt:181)");
            }
            ConstraintLayoutScope constraintLayoutScope = this.f23383a;
            Modifier.Companion companion = Modifier.Companion;
            ConstrainedLayoutReference constrainedLayoutReference = this.f23384b;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = C0319a.f23388a;
                composer.updateRememberedValue(rememberedValue);
            }
            SurfaceKt.m1784SurfaceFjzlyU(constraintLayoutScope.constrainAs(companion, constrainedLayoutReference, (x00.l) rememberedValue), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100)), this.f23385c, bk.b.N(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)), null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1638559698, true, new b(this.f23386d, this.f23387e), composer, 54), composer, 1572864, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23391a = new b();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            Dimension.Companion companion = Dimension.Companion;
            constrainAs.setWidth(companion.getFillToConstraints());
            constrainAs.setHeight(companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23392a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23392a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            ConstrainScope.centerVerticallyTo$default(constrainAs, this.f23392a, 0.0f, 2, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,543:1\n113#2:544\n113#2:545\n113#2:546\n113#2:547\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$4$1\n*L\n236#1:544\n237#1:545\n238#1:546\n239#1:547\n*E\n"})
    public static final class d implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23393a;

        public d(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23393a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), this.f23393a.getEnd(), Dp.m5115constructorimpl(-6), 0.0f, 4, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23393a.getBottom(), Dp.m5115constructorimpl(-10), 0.0f, 4, (Object) null);
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
    @kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,543:1\n113#2:544\n113#2:545\n113#2:546\n113#2:547\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$5$1\n*L\n249#1:544\n250#1:545\n251#1:546\n252#1:547\n*E\n"})
    public static final class e implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f23394a = new e();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            float f11 = -9;
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), Dp.m5115constructorimpl(f11), 0.0f, 4, (Object) null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(f11), 0.0f, 4, null);
            Dimension.Companion companion = Dimension.Companion;
            float f12 = 24;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(f12)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(f12)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$6$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,543:1\n113#2:544\n113#2:545\n113#2:546\n113#2:547\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt$Status$4$6$1\n*L\n261#1:544\n262#1:545\n263#1:546\n264#1:547\n*E\n"})
    public static final class f implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f23395a = new f();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            float f11 = -9;
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), Dp.m5115constructorimpl(f11), 0.0f, 4, (Object) null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(f11), 0.0f, 4, null);
            Dimension.Companion companion = Dimension.Companion;
            float f12 = 24;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(f12)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(f12)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    public static final yz.g2 A(Modifier modifier, Object obj, Object obj2, String str, x00.a aVar, x00.a aVar2, int i11, int i12, Composer composer, int i13) {
        y(modifier, obj, obj2, str, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 B(int i11, Composer composer, int i12) {
        x(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void C(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1546841432);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1546841432, i11, -1, "com.baicizhan.main.home.player.Status (TopStatus.kt:273)");
            }
            bk.k.h(null, null, null, y0.f24331a.g(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.o8
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 D;
                    D = TopStatusKt.D(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return D;
                }
            });
        }
    }

    public static final yz.g2 D(int i11, Composer composer, int i12) {
        C(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(androidx.compose.ui.Modifier r52, final com.baicizhan.main.home.player.a8 r53, x00.a<yz.g2> r54, x00.a<yz.g2> r55, androidx.compose.runtime.MutableState<com.baicizhan.platform.base.widget.n2> r56, boolean r57, long r58, x00.q<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.TopStatusKt.E(androidx.compose.ui.Modifier, com.baicizhan.main.home.player.a8, x00.a, x00.a, androidx.compose.runtime.MutableState, boolean, long, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x041d, code lost:
    
        if (r8 == r37.getEmpty()) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(@m80.l androidx.compose.ui.Modifier r56, @m80.k final java.lang.String r57, @m80.k final ug.g r58, @m80.k final kotlin.Pair<java.lang.Long, java.lang.Integer> r59, @m80.k final kotlin.Pair<java.lang.Long, java.lang.Integer> r60, @m80.l com.baicizhan.main.home.player.model.HomeMode r61, @m80.l androidx.compose.runtime.MutableState<com.baicizhan.platform.base.widget.n2> r62, @m80.l androidx.compose.runtime.MutableState<com.baicizhan.platform.base.widget.n2> r63, @m80.l androidx.compose.runtime.MutableState<com.baicizhan.platform.base.widget.n2> r64, @m80.l x00.a<yz.g2> r65, @m80.l x00.a<yz.g2> r66, @m80.l x00.a<yz.g2> r67, @m80.l x00.l<? super com.baicizhan.main.home.player.StatusType, yz.g2> r68, @m80.k final x00.l<? super com.baicizhan.main.home.player.StatusType, yz.g2> r69, @m80.l androidx.compose.runtime.Composer r70, final int r71, final int r72, final int r73) {
        /*
            Method dump skipped, instructions count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.TopStatusKt.F(androidx.compose.ui.Modifier, java.lang.String, ug.g, kotlin.Pair, kotlin.Pair, com.baicizhan.main.home.player.model.HomeMode, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, x00.a, x00.a, x00.a, x00.l, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final yz.g2 G() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 H() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(x00.a aVar, int i11) {
        if (i11 > 0) {
            aVar.invoke();
        }
        return yz.g2.f100423a;
    }

    public static final int J(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final boolean K(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final yz.g2 L(x00.l lVar) {
        lVar.invoke(StatusType.SETTING);
        return yz.g2.f100423a;
    }

    public static final void M(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 N(x00.l lVar) {
        lVar.invoke(StatusType.ME);
        return yz.g2.f100423a;
    }

    public static final yz.g2 O(x00.l lVar) {
        lVar.invoke(StatusType.ME);
        return yz.g2.f100423a;
    }

    public static final yz.g2 P(x00.l lVar) {
        lVar.invoke(StatusType.COINS);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q(x00.l lVar) {
        lVar.invoke(StatusType.COINS);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R(x00.l lVar) {
        lVar.invoke(StatusType.FORWARDING);
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(x00.l lVar) {
        lVar.invoke(StatusType.FORWARDING);
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(x00.l lVar) {
        lVar.invoke(StatusType.SETTING);
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(Modifier modifier, String str, ug.g gVar, Pair pair, Pair pair2, HomeMode homeMode, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.l lVar, x00.l lVar2, int i11, int i12, int i13, Composer composer, int i14) {
        F(modifier, str, gVar, pair, pair2, homeMode, mutableState, mutableState2, mutableState3, aVar, aVar2, aVar3, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12), i13);
        return yz.g2.f100423a;
    }

    public static final yz.g2 V() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 W(StatusType it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final long X(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    public static final yz.g2 Y(x00.a aVar, int i11) {
        if (i11 > 0) {
            aVar.invoke();
        }
        return yz.g2.f100423a;
    }

    public static final int Z(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final long a0(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    public static final yz.g2 b0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 c0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 d0(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0(Modifier modifier, a8 a8Var, x00.a aVar, x00.a aVar2, MutableState mutableState, boolean z11, long j11, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        E(modifier, a8Var, aVar, aVar2, mutableState, z11, j11, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void x(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-175837630);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175837630, i11, -1, "com.baicizhan.main.home.player.Me (TopStatus.kt:135)");
            }
            bk.k.h(null, null, null, y0.f24331a.f(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.p8
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B;
                    B = TopStatusKt.B(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006c  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(@m80.l androidx.compose.ui.Modifier r28, @m80.k final java.lang.Object r29, @m80.l java.lang.Object r30, @m80.l java.lang.String r31, @m80.l x00.a<yz.g2> r32, @m80.k final x00.a<yz.g2> r33, @m80.l androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.TopStatusKt.y(androidx.compose.ui.Modifier, java.lang.Object, java.lang.Object, java.lang.String, x00.a, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 z() {
        return yz.g2.f100423a;
    }
}
