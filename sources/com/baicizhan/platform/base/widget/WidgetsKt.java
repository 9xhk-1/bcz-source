package com.baicizhan.platform.base.widget;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.foundation.ImageKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,299:1\n354#2,7:300\n361#2,2:313\n363#2,7:316\n401#2,10:323\n400#2:333\n412#2,4:334\n416#2,7:339\n446#2,12:346\n472#2:358\n1225#3,6:307\n1247#3,6:480\n1247#3,6:490\n1247#3,6:504\n1#4:315\n77#5:338\n75#5:503\n87#6:359\n84#6,9:360\n94#6:400\n87#6:401\n84#6,9:402\n94#6:489\n79#7,6:369\n86#7,3:384\n89#7,2:393\n93#7:399\n79#7,6:411\n86#7,3:426\n89#7,2:435\n79#7,6:448\n86#7,3:463\n89#7,2:472\n93#7:477\n93#7:488\n347#8,9:375\n356#8:395\n357#8,2:397\n347#8,9:417\n356#8:437\n347#8,9:454\n356#8,3:474\n357#8,2:486\n4206#9,6:387\n4206#9,6:429\n4206#9,6:466\n113#10:396\n113#10:479\n70#11:438\n67#11,9:439\n77#11:478\n57#12:496\n61#12:510\n60#13:497\n53#13,3:500\n70#13:511\n22#14:498\n22#14:512\n33#15:499\n85#16:513\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt\n*L\n71#1:300,7\n71#1:313,2\n71#1:316,7\n71#1:323,10\n71#1:333\n71#1:334,4\n71#1:339,7\n71#1:346,12\n71#1:358\n71#1:307,6\n177#1:480,6\n225#1:490,6\n296#1:504,6\n71#1:315\n71#1:338\n277#1:503\n137#1:359\n137#1:360,9\n137#1:400\n168#1:401\n168#1:402,9\n168#1:489\n137#1:369,6\n137#1:384,3\n137#1:393,2\n137#1:399\n168#1:411,6\n168#1:426,3\n168#1:435,2\n169#1:448,6\n169#1:463,3\n169#1:472,2\n169#1:477\n168#1:488\n137#1:375,9\n137#1:395\n137#1:397,2\n168#1:417,9\n168#1:437\n169#1:454,9\n169#1:474,3\n168#1:486,2\n137#1:387,6\n168#1:429,6\n169#1:466,6\n146#1:396\n182#1:479\n169#1:438\n169#1:439,9\n169#1:478\n246#1:496\n226#1:510\n246#1:497\n250#1:500,3\n226#1:511\n246#1:498\n226#1:512\n250#1:499\n295#1:513\n*E\n"})
/* loaded from: classes6.dex */
public final class WidgetsKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28183a = new a();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.37f, 60, (Object) null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt$Empty$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,299:1\n113#2:300\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt$Empty$1$2$1\n*L\n95#1:300\n*E\n"})
    public static final class b implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f28184a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f28184a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f28184a.getBottom(), Dp.m5115constructorimpl(8), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt$Empty$1$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,299:1\n113#2:300\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt$Empty$1$3$1\n*L\n108#1:300\n*E\n"})
    public static final class c implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f28185a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f28185a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f28185a.getBottom(), Dp.m5115constructorimpl(16), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f28186a;

        public d(x00.a<yz.g2> aVar) {
            this.f28186a = aVar;
        }

        public final void a() {
            x00.a<yz.g2> aVar = this.f28186a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    public static final yz.g2 A(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        x(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0053  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(@androidx.annotation.DrawableRes final int r20, @m80.l final java.lang.String r21, @m80.l androidx.compose.ui.Modifier r22, @m80.l androidx.compose.ui.Alignment r23, @m80.l androidx.compose.ui.layout.ContentScale r24, float r25, @m80.l androidx.compose.ui.graphics.ColorFilter r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.WidgetsKt.B(int, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 C(int i11, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i12, int i13, Composer composer, int i14) {
        B(i11, str, modifier, alignment, contentScale, f11, colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) final float r26, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r27, @m80.l androidx.compose.ui.Modifier r28, float r29, long r30, long r32, long r34, @m80.l androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.WidgetsKt.D(float, float, androidx.compose.ui.Modifier, float, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 E(long j11, float f11, long j12, float f12, long j13, DrawScope Canvas) {
        DrawScope drawScope;
        kotlin.jvm.internal.g0.p(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() & 4294967295L));
        P(Canvas, j11, intBitsToFloat);
        if (f11 <= 0.0f || Color.m2510equalsimpl0(j12, Color.Companion.m2545getUnspecified0d7_KjU())) {
            drawScope = Canvas;
        } else {
            O(Canvas, 0.0f, f11, j12, intBitsToFloat);
            drawScope = Canvas;
        }
        O(drawScope, 0.0f, f12, j13, intBitsToFloat);
        return yz.g2.f100423a;
    }

    public static final yz.g2 F(float f11, float f12, Modifier modifier, float f13, long j11, long j12, long j13, int i11, int i12, Composer composer, int i13) {
        D(f11, f12, modifier, f13, j11, j12, j13, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void G(@m80.l Modifier modifier, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-2013748484);
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
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2013748484, i13, -1, "com.baicizhan.platform.base.widget.LowerLoadingIndicator (Widgets.kt:190)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.loading_dots_normal_default, startRestartGroup, 6), "lower-loading", modifier3.then(RotateKt.rotate(Modifier.Companion, InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8).getValue().floatValue())), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, bk.b.E(MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable)), 0, 2, null), startRestartGroup, 48, 56);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.d5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 H;
                    H = WidgetsKt.H(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return H;
                }
            });
        }
    }

    public static final yz.g2 H(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        G(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void I(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1770387269);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770387269, i11, -1, "com.baicizhan.platform.base.widget.ProgressBarPreview (Widgets.kt:254)");
            }
            bk.k.e(null, null, null, h2.f28318a.g(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.a5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 J;
                    J = WidgetsKt.J(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return J;
                }
            });
        }
    }

    public static final yz.g2 J(int i11, Composer composer, int i12) {
        I(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(@m80.l androidx.compose.ui.Modifier r60, @m80.k final java.lang.String r61, @m80.l java.lang.String r62, @m80.l androidx.compose.runtime.Composer r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.WidgetsKt.K(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 L(Modifier modifier, String str, String str2, int i11, int i12, Composer composer, int i13) {
        K(modifier, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void M(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-111492819);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111492819, i11, -1, "com.baicizhan.platform.base.widget.TitleLabelPreview (Widgets.kt:152)");
            }
            bk.k.e(null, null, null, h2.f28318a.h(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.z4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 N;
                    N = WidgetsKt.N(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            });
        }
    }

    public static final yz.g2 N(int i11, Composer composer, int i12) {
        M(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final void O(DrawScope drawScope, float f11, float f12, long j11, float f13) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32));
        boolean z11 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f14 = (z11 ? f11 : 1.0f - f12) * intBitsToFloat;
        float f15 = (z11 ? f12 : 1.0f - f11) * intBitsToFloat;
        float f16 = f13 / 2;
        DrawScope.m3056drawRoundRectuAw5IA$default(drawScope, j11, Offset.m2262copydBAh8RU$default(Offset.Companion.m2284getZeroF1C5BW0(), f14, 0.0f, 2, null), Size.m2330copyxjbvk4A$default(drawScope.mo3060getSizeNHjbRc(), f15, 0.0f, 2, null), CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(f16) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32)), null, 0.0f, null, 0, 240, null);
    }

    public static final void P(DrawScope drawScope, long j11, float f11) {
        O(drawScope, 0.0f, 1.0f, j11, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0093  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(@m80.l androidx.compose.ui.Modifier r24, @androidx.annotation.DrawableRes int r25, @m80.k final java.lang.String r26, @m80.k final x00.a<yz.g2> r27, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r28, @m80.l androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.WidgetsKt.o(androidx.compose.ui.Modifier, int, java.lang.String, x00.a, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 p(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 q(Modifier modifier, int i11, String str, x00.a aVar, x00.p pVar, int i12, int i13, Composer composer, int i14) {
        o(modifier, i11, str, aVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0042  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final int r24, @m80.l java.lang.String r25, @m80.l java.lang.String r26, @m80.l x00.a<yz.g2> r27, @m80.l androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.WidgetsKt.r(int, java.lang.String, java.lang.String, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 s(int i11, String str, String str2, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        r(i11, str, str2, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void t(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(2100185442);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100185442, i11, -1, "com.baicizhan.platform.base.widget.EmptyPreview (Widgets.kt:119)");
            }
            bk.k.e(null, null, null, h2.f28318a.e(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.e5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 u11;
                    u11 = WidgetsKt.u(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            });
        }
    }

    public static final yz.g2 u(int i11, Composer composer, int i12) {
        t(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void v(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1707230494);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1707230494, i11, -1, "com.baicizhan.platform.base.widget.EmptyPreview2 (Widgets.kt:127)");
            }
            bk.k.e(null, null, null, h2.f28318a.f(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.j5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 w11;
                    w11 = WidgetsKt.w(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return w11;
                }
            });
        }
    }

    public static final yz.g2 w(int i11, Composer composer, int i12) {
        v(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void x(@m80.l Modifier modifier, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(792280457);
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
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(792280457, i13, -1, "com.baicizhan.platform.base.widget.Flowering (Widgets.kt:292)");
            }
            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("flower-transition", startRestartGroup, 6, 0), 0.0f, 360.0f, new InfiniteRepeatableSpec(AnimationSpecKt.tween$default(1500, 0, null, 6, null), null, StartOffset.m168constructorimpl$default(200, 0, 2, null), 2, null), "flower-anim", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_common_loading_flower, startRestartGroup, 6);
            Modifier.Companion companion = Modifier.Companion;
            boolean changed = startRestartGroup.changed(animateFloat);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.platform.base.widget.w4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 z11;
                        z11 = WidgetsKt.z(State.this, (GraphicsLayerScope) obj);
                        return z11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(painterResource, "loading", modifier3.then(GraphicsLayerModifierKt.graphicsLayer(companion, (x00.l) rememberedValue)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.b5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 A;
                    A = WidgetsKt.A(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return A;
                }
            });
        }
    }

    public static final float y(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final yz.g2 z(State state, GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ(y(state));
        return yz.g2.f100423a;
    }
}
