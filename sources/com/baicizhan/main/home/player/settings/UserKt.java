package com.baicizhan.main.home.player.settings;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.baicizhan.main.home.dialog.o1;
import com.baicizhan.main.home.player.l7;
import com.baicizhan.main.home.player.settings.UserKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 14 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 15 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 16 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 17 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 18 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,319:1\n557#2:320\n554#2,6:321\n1247#3,3:327\n1250#3,3:331\n1247#3,6:335\n1247#3,6:590\n1225#3,6:603\n1247#3,6:809\n1247#3,6:815\n555#4:330\n113#5:334\n113#5:341\n113#5:375\n113#5:376\n113#5:377\n113#5:423\n113#5:461\n113#5:462\n113#5:542\n113#5:551\n113#5:552\n113#5:655\n113#5:657\n113#5:658\n113#5:696\n113#5:734\n113#5:772\n113#5:837\n113#5:843\n87#6,6:342\n94#6:422\n87#6:463\n84#6,9:464\n94#6:546\n87#6:553\n84#6,9:554\n87#6:697\n84#6,9:698\n94#6:828\n94#6:836\n79#7,6:348\n86#7,3:363\n89#7,2:372\n79#7,6:388\n86#7,3:403\n89#7,2:412\n93#7:417\n93#7:421\n79#7,6:434\n86#7,3:449\n89#7,2:458\n79#7,6:473\n86#7,3:488\n89#7,2:497\n79#7,6:511\n86#7,3:526\n89#7,2:535\n93#7:540\n93#7:545\n93#7:549\n79#7,6:563\n86#7,3:578\n89#7,2:587\n79#7,6:669\n86#7,3:684\n89#7,2:693\n79#7,6:707\n86#7,3:722\n89#7,2:731\n79#7,6:741\n86#7,3:756\n89#7,2:765\n93#7:770\n79#7,6:782\n86#7,3:797\n89#7,2:806\n93#7:823\n93#7:827\n93#7:831\n93#7:835\n347#8,9:354\n356#8:374\n347#8,9:394\n356#8,3:414\n357#8,2:419\n347#8,9:440\n356#8:460\n347#8,9:479\n356#8:499\n347#8,9:517\n356#8,3:537\n357#8,2:543\n357#8,2:547\n347#8,9:569\n356#8:589\n347#8,9:675\n356#8:695\n347#8,9:713\n356#8:733\n347#8,9:747\n356#8,3:767\n347#8,9:788\n356#8:808\n357#8,2:821\n357#8,2:825\n357#8,2:829\n357#8,2:833\n4206#9,6:366\n4206#9,6:406\n4206#9,6:452\n4206#9,6:491\n4206#9,6:529\n4206#9,6:581\n4206#9,6:687\n4206#9,6:725\n4206#9,6:759\n4206#9,6:800\n99#10:378\n96#10,9:379\n106#10:418\n99#10:424\n96#10,9:425\n99#10:500\n95#10,10:501\n106#10:541\n106#10:550\n99#10,6:735\n106#10:771\n99#10:773\n97#10,8:774\n106#10:824\n354#11,7:596\n361#11,2:609\n363#11,7:612\n401#11,10:619\n400#11:629\n412#11,4:630\n416#11,7:635\n446#11,12:642\n472#11:654\n1#12:611\n77#13:634\n49#14:656\n70#15:659\n67#15,9:660\n77#15:832\n30#16:838\n53#17,3:839\n33#18:842\n*S KotlinDebug\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt\n*L\n84#1:320\n84#1:321,6\n84#1:327,3\n84#1:331,3\n251#1:335,6\n88#1:590,6\n88#1:603,6\n180#1:809,6\n188#1:815,6\n84#1:330\n216#1:334\n253#1:341\n254#1:375\n259#1:376\n264#1:377\n293#1:423\n294#1:461\n295#1:462\n314#1:542\n86#1:551\n87#1:552\n165#1:655\n166#1:657\n167#1:658\n171#1:696\n172#1:734\n178#1:772\n252#1:837\n276#1:843\n251#1:342,6\n251#1:422\n295#1:463\n295#1:464,9\n295#1:546\n87#1:553\n87#1:554,9\n171#1:697\n171#1:698,9\n171#1:828\n87#1:836\n251#1:348,6\n251#1:363,3\n251#1:372,2\n264#1:388,6\n264#1:403,3\n264#1:412,2\n264#1:417\n251#1:421\n293#1:434,6\n293#1:449,3\n293#1:458,2\n295#1:473,6\n295#1:488,3\n295#1:497,2\n296#1:511,6\n296#1:526,3\n296#1:535,2\n296#1:540\n295#1:545\n293#1:549\n87#1:563,6\n87#1:578,3\n87#1:587,2\n164#1:669,6\n164#1:684,3\n164#1:693,2\n171#1:707,6\n171#1:722,3\n171#1:731,2\n172#1:741,6\n172#1:756,3\n172#1:765,2\n172#1:770\n178#1:782,6\n178#1:797,3\n178#1:806,2\n178#1:823\n171#1:827\n164#1:831\n87#1:835\n251#1:354,9\n251#1:374\n264#1:394,9\n264#1:414,3\n251#1:419,2\n293#1:440,9\n293#1:460\n295#1:479,9\n295#1:499\n296#1:517,9\n296#1:537,3\n295#1:543,2\n293#1:547,2\n87#1:569,9\n87#1:589\n164#1:675,9\n164#1:695\n171#1:713,9\n171#1:733\n172#1:747,9\n172#1:767,3\n178#1:788,9\n178#1:808\n178#1:821,2\n171#1:825,2\n164#1:829,2\n87#1:833,2\n251#1:366,6\n264#1:406,6\n293#1:452,6\n295#1:491,6\n296#1:529,6\n87#1:581,6\n164#1:687,6\n171#1:725,6\n172#1:759,6\n178#1:800,6\n264#1:378\n264#1:379,9\n264#1:418\n293#1:424\n293#1:425,9\n296#1:500\n296#1:501,10\n296#1:541\n293#1:550\n172#1:735,6\n172#1:771\n178#1:773\n178#1:774,8\n178#1:824\n88#1:596,7\n88#1:609,2\n88#1:612,7\n88#1:619,10\n88#1:629\n88#1:630,4\n88#1:635,7\n88#1:642,12\n88#1:654\n88#1:611\n88#1:634\n165#1:656\n164#1:659\n164#1:660,9\n164#1:832\n252#1:838\n252#1:839,3\n252#1:842\n*E\n"})
/* loaded from: classes4.dex */
public final class UserKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,319:1\n113#2:320\n*S KotlinDebug\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$1$1\n*L\n95#1:320\n*E\n"})
    public static final class a implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f24008a;

        public a(float f11) {
            this.f24008a = f11;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstraintLayoutBaseScope.VerticalAnchor start = constrainAs.getParent().getStart();
            ConstraintLayoutBaseScope.VerticalAnchor end = constrainAs.getParent().getEnd();
            ConstraintLayoutBaseScope.HorizontalAnchor top = constrainAs.getParent().getTop();
            ConstraintLayoutBaseScope.HorizontalAnchor bottom = constrainAs.getParent().getBottom();
            float m5115constructorimpl = Dp.m5115constructorimpl(4);
            float f11 = this.f24008a;
            ConstrainScope.m5392linkToR7zmacU$default(constrainAs, start, top, end, bottom, f11, m5115constructorimpl, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16256, null);
            Dimension.Companion companion = Dimension.Companion;
            constrainAs.setWidth(companion.getFillToConstraints());
            constrainAs.setHeight(companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f24009a;

        public b(x00.a<g2> aVar) {
            this.f24009a = aVar;
        }

        public final void a() {
            this.f24009a.invoke();
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            a();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f24010a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f24010a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerVerticallyTo$default(constrainAs, this.f24010a, 0.0f, 2, null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f24010a.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,319:1\n113#2:320\n49#3:321\n*S KotlinDebug\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$2$1\n*L\n101#1:320\n101#1:321\n*E\n"})
    public static final class d implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f24011a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f24012b;

        public d(ConstrainedLayoutReference constrainedLayoutReference, float f11) {
            this.f24011a = constrainedLayoutReference;
            this.f24012b = f11;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f24011a.getStart(), Dp.m5115constructorimpl(Dp.m5115constructorimpl(14) + this.f24012b), 0.0f, 4, null);
            ConstrainScope.centerVerticallyTo$default(constrainAs, this.f24011a, 0.0f, 2, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,319:1\n113#2:320\n49#3:321\n*S KotlinDebug\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$5$1\n*L\n114#1:320\n114#1:321\n*E\n"})
    public static final class e implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f24013a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f24014b;

        public e(ConstrainedLayoutReference constrainedLayoutReference, float f11) {
            this.f24013a = constrainedLayoutReference;
            this.f24014b = f11;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerVerticallyTo$default(constrainAs, this.f24013a, 0.0f, 2, null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(Dp.m5115constructorimpl(12) + this.f24014b), 0.0f, 4, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,319:1\n113#2:320\n118#2:321\n*S KotlinDebug\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt$UserPage$1$1$2$7$1\n*L\n130#1:320\n131#1:321\n*E\n"})
    public static final class f implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f24015a;

        public f(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f24015a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f24015a.getEnd(), Dp.m5115constructorimpl(12), 0.0f, 4, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f24015a.getTop(), Dp.m5115constructorimpl((float) 5.5d), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<Integer, g2> f24016a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f24017b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(x00.l<? super Integer, g2> lVar, int i11) {
            this.f24016a = lVar;
            this.f24017b = i11;
        }

        public final void a() {
            this.f24016a.invoke(Integer.valueOf(this.f24017b));
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            a();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements x00.l<ConstrainScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f24018a;

        public h(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f24018a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f24018a.getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f24018a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return g2.f100423a;
        }
    }

    public static final String A(int i11) {
        return i11 < 0 ? HttpRequest.f17578o : String.valueOf(i11);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(Modifier modifier, final String str, final int i11, final int i12, final String str2, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(692834289);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= startRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= startRestartGroup.changed(i12) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= startRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i15 & 9363) != 9362, i15 & 1)) {
            Modifier modifier4 = i16 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(692834289, i15, -1, "com.baicizhan.main.home.player.settings.CountInfo (User.kt:249)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.player.settings.s0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 l11;
                        l11 = UserKt.l((DrawScope) obj);
                        return l11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier then = modifier4.then(DrawModifierKt.drawBehind(companion, (x00.l) rememberedValue));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(4)), centerHorizontally, startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i17 = i15;
            Modifier modifier5 = modifier4;
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, startRestartGroup, (i15 >> 6) & 14), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            float f11 = 8;
            TextKt.m1845Text4IGK_g(str, PaddingKt.m730paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 10, null), ColorKt.Color(4284376202L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getSubtitle2(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), startRestartGroup, ((i17 >> 3) & 14) | 432, 3120, 54776);
            startRestartGroup = startRestartGroup;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(2), 0.0f, Dp.m5115constructorimpl(f11), 5, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(ColorKt.Color(4281151299L))), ComposableLambdaKt.rememberComposableLambda(-1793480041, true, new x00.p() { // from class: com.baicizhan.main.home.player.settings.t0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 m11;
                    m11 = UserKt.m(i12, str2, (Composer) obj, ((Integer) obj2).intValue());
                    return m11;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.u0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 n11;
                    n11 = UserKt.n(Modifier.this, str, i11, i12, str2, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    return n11;
                }
            });
        }
    }

    public static final g2 l(DrawScope drawBehind) {
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        long Color = ColorKt.Color(4292141307L);
        float mo377toPx0680j_4 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(20));
        DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, Color, Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo377toPx0680j_4) & 4294967295L)), 0L, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(r6) & 4294967295L) | (Float.floatToRawIntBits(drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(12))) << 32)), null, 0.0f, null, 0, 244, null);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 m(int i11, String str, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1793480041, i12, -1, "com.baicizhan.main.home.player.settings.CountInfo.<anonymous>.<anonymous>.<anonymous> (User.kt:265)");
            }
            TextKt.m1845Text4IGK_g(String.valueOf(i11), (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, bk.k.n(), TextUnitKt.getSp(0), (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer, 14158848, 6, 129846);
            TextKt.m1845Text4IGK_g(str, PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH5(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 n(Modifier modifier, String str, int i11, int i12, String str2, int i13, int i14, Composer composer, int i15) {
        k(modifier, str, i11, i12, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return g2.f100423a;
    }

    @Composable
    public static final void o(Modifier modifier, final Object obj, Object obj2, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Object obj3;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-81428832);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = i11 | (startRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            Object obj4 = (i12 & 4) != 0 ? null : obj2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-81428832, i13, -1, "com.baicizhan.main.home.player.settings.Me (User.kt:207)");
            }
            Modifier modifier5 = modifier4;
            composer2 = startRestartGroup;
            coil.compose.l.b(obj, q9.h.f81940d, modifier4.then(BorderKt.m246borderxT4_qwU(ClipKt.clip(SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), Dp.m5115constructorimpl(3), Color.Companion.m2546getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape())), PainterResources_androidKt.painterResource(R.drawable.ic_user_default_avatar, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.ic_user_default_avatar, startRestartGroup, 6), null, null, null, null, null, ContentScale.Companion.getFillBounds(), 0.0f, null, 0, false, null, composer2, ((i13 >> 3) & 14) | 48, 6, 64480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            obj3 = obj4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            obj3 = obj2;
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.l0
                @Override // x00.p
                public final Object invoke(Object obj5, Object obj6) {
                    g2 p11;
                    p11 = UserKt.p(Modifier.this, obj, obj3, i11, i12, (Composer) obj5, ((Integer) obj6).intValue());
                    return p11;
                }
            });
        }
    }

    public static final g2 p(Modifier modifier, Object obj, Object obj2, int i11, int i12, Composer composer, int i13) {
        o(modifier, obj, obj2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q(@m80.k final MutableState<Boolean> visibility, @m80.k final String avatarUrl, @m80.k final String name, final int i11, @m80.k final String levelDescription, final int i12, final int i13, final int i14, final int i15, final int i16, @m80.k final x00.a<g2> onScan, @m80.k final x00.l<? super Integer, g2> onIdClick, @m80.k final x00.a<g2> onLevelClick, @m80.k final x00.a<g2> onListenTestClick, @m80.k final x00.a<g2> onReadTestClick, @m80.k final x00.a<g2> onMore, @m80.l Composer composer, final int i17, final int i18) {
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        Composer composer2;
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        kotlin.jvm.internal.g0.p(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(levelDescription, "levelDescription");
        kotlin.jvm.internal.g0.p(onScan, "onScan");
        kotlin.jvm.internal.g0.p(onIdClick, "onIdClick");
        kotlin.jvm.internal.g0.p(onLevelClick, "onLevelClick");
        kotlin.jvm.internal.g0.p(onListenTestClick, "onListenTestClick");
        kotlin.jvm.internal.g0.p(onReadTestClick, "onReadTestClick");
        kotlin.jvm.internal.g0.p(onMore, "onMore");
        Composer startRestartGroup = composer.startRestartGroup(1570610286);
        if ((i17 & 6) == 0) {
            i19 = (startRestartGroup.changed(visibility) ? 4 : 2) | i17;
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= startRestartGroup.changed(avatarUrl) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i19 |= startRestartGroup.changed(name) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i21 = i11;
            i19 |= startRestartGroup.changed(i21) ? 2048 : 1024;
        } else {
            i21 = i11;
        }
        if ((i17 & 24576) == 0) {
            i19 |= startRestartGroup.changed(levelDescription) ? 16384 : 8192;
        }
        if ((i17 & 196608) == 0) {
            i22 = 196608;
            i23 = i12;
            i19 |= startRestartGroup.changed(i23) ? 131072 : 65536;
        } else {
            i22 = 196608;
            i23 = i12;
        }
        if ((i17 & 1572864) == 0) {
            i19 |= startRestartGroup.changed(i13) ? 1048576 : 524288;
        }
        if ((i17 & 12582912) == 0) {
            i19 |= startRestartGroup.changed(i14) ? 8388608 : 4194304;
        }
        if ((i17 & 100663296) == 0) {
            i19 |= startRestartGroup.changed(i15) ? 67108864 : 33554432;
        }
        if ((i17 & 805306368) == 0) {
            i19 |= startRestartGroup.changed(i16) ? 536870912 : 268435456;
        }
        if ((i18 & 6) == 0) {
            i24 = i18 | (startRestartGroup.changedInstance(onScan) ? 4 : 2);
        } else {
            i24 = i18;
        }
        if ((i18 & 48) == 0) {
            i24 |= startRestartGroup.changedInstance(onIdClick) ? 32 : 16;
        }
        if ((i18 & 384) == 0) {
            i24 |= startRestartGroup.changedInstance(onLevelClick) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            i24 |= startRestartGroup.changedInstance(onListenTestClick) ? 2048 : 1024;
        }
        if ((i18 & 24576) == 0) {
            i24 |= startRestartGroup.changedInstance(onReadTestClick) ? 16384 : 8192;
        }
        if ((i18 & i22) == 0) {
            i24 |= startRestartGroup.changedInstance(onMore) ? 131072 : 65536;
        }
        int i25 = i24;
        if (startRestartGroup.shouldExecute(((i19 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true, i19 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1570610286, i19, i25, "com.baicizhan.main.home.player.settings.UserPage (User.kt:82)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue;
            final int i26 = i21;
            final int i27 = i23;
            o1.I(visibility, "个人中心", R.drawable.ic_home_qr_scan, onScan, null, ComposableLambdaKt.rememberComposableLambda(-706522721, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.q0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 r11;
                    r11 = UserKt.r(x00.a.this, r0Var, avatarUrl, name, i26, onIdClick, onLevelClick, levelDescription, i27, i13, i14, onListenTestClick, i15, onReadTestClick, i16, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return r11;
                }
            }, startRestartGroup, 54), startRestartGroup, (i19 & 14) | 197040 | ((i25 << 9) & 7168), 16);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.r0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 v11;
                    v11 = UserKt.v(MutableState.this, avatarUrl, name, i11, levelDescription, i12, i13, i14, i15, i16, onScan, onIdClick, onLevelClick, onListenTestClick, onReadTestClick, onMore, i17, i18, (Composer) obj, ((Integer) obj2).intValue());
                    return v11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 r(final x00.a aVar, final c40.r0 r0Var, final String str, final String str2, final int i11, final x00.l lVar, final x00.a aVar2, final String str3, int i12, int i13, int i14, final x00.a aVar3, int i15, final x00.a aVar4, int i16, ColumnScope TipContentPage, Composer composer, int i17) {
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState;
        kotlin.jvm.internal.g0.p(TipContentPage, "$this$TipContentPage");
        if (composer.shouldExecute((i17 & 17) != 16, i17 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-706522721, i17, -1, "com.baicizhan.main.home.player.settings.UserPage.<anonymous> (User.kt:85)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 20;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(10), 0.0f, 2, null), 0.0f, 1, null), ColorKt.Color(4282742512L), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(24)));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m234backgroundbw27NRU);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier aspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 3.8854167f, false, 2, null);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.settings.n0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 s11;
                        s11 = UserKt.s(x00.a.this);
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier k11 = ComposeUtilsKt.k(aspectRatio$default, 0L, false, (x00.a) rememberedValue, 3, null);
            composer.startReplaceGroup(-1003410150);
            composer.startReplaceGroup(212064437);
            composer.endReplaceGroup();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue2 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (rememberedValue2 == companion4.getEmpty()) {
                rememberedValue2 = new Measurer2(density);
                composer.updateRememberedValue(rememberedValue2);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion4.getEmpty()) {
                rememberedValue3 = new ConstraintLayoutScope();
                composer.updateRememberedValue(rememberedValue3);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion4.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion4.getEmpty()) {
                rememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composer.updateRememberedValue(rememberedValue5);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue5;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion4.getEmpty()) {
                rememberedValue6 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue6;
            final int i18 = 257;
            boolean changedInstance = composer.changedInstance(measurer2) | composer.changed(257);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance || rememberedValue7 == companion4.getEmpty()) {
                rememberedValue7 = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.settings.UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i18);
                        mutableState2.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: com.baicizhan.main.home.player.settings.UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
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
                composer.updateRememberedValue(rememberedValue7);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue7;
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == companion4.getEmpty()) {
                rememberedValue8 = new x00.a<g2>() { // from class: com.baicizhan.main.home.player.settings.UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ g2 invoke() {
                        invoke2();
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MutableState.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            final x00.a aVar5 = (x00.a) rememberedValue8;
            boolean changedInstance2 = composer.changedInstance(measurer2);
            Object rememberedValue9 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue9 == companion4.getEmpty()) {
                rememberedValue9 = new x00.l<SemanticsPropertyReceiver, g2>() { // from class: com.baicizhan.main.home.player.settings.UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, Measurer2.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(k11, false, (x00.l) rememberedValue9, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, g2>() { // from class: com.baicizhan.main.home.player.settings.UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i19) {
                    String A;
                    if ((i19 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i19, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(990669020);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    ConstrainedLayoutReference component4 = createRefs.component4();
                    ConstrainedLayoutReference component5 = createRefs.component5();
                    ConstrainedLayoutReference component6 = createRefs.component6();
                    float m5115constructorimpl = Dp.m5115constructorimpl(3);
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.bg_home_user_info, composer2, 6);
                    Modifier.Companion companion5 = Modifier.Companion;
                    Object rememberedValue10 = composer2.rememberedValue();
                    Composer.Companion companion6 = Composer.Companion;
                    if (rememberedValue10 == companion6.getEmpty()) {
                        rememberedValue10 = new UserKt.a(m5115constructorimpl);
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    ImageKt.Image(painterResource, (String) null, constraintLayoutScope2.constrainAs(companion5, component1, (x00.l) rememberedValue10), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                    boolean changed2 = composer2.changed(component1);
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (changed2 || rememberedValue11 == companion6.getEmpty()) {
                        rememberedValue11 = new UserKt.d(component1, m5115constructorimpl);
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    Modifier constrainAs = constraintLayoutScope2.constrainAs(companion5, component2, (x00.l) rememberedValue11);
                    composer2.startReplaceGroup(2110198106);
                    composer2.endReplaceGroup();
                    UserKt.o(constrainAs.then(companion5), str, null, composer2, 0, 4);
                    boolean changed3 = composer2.changed(component2);
                    Object rememberedValue12 = composer2.rememberedValue();
                    if (changed3 || rememberedValue12 == companion6.getEmpty()) {
                        rememberedValue12 = new UserKt.e(component2, m5115constructorimpl);
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    Modifier constrainAs2 = constraintLayoutScope2.constrainAs(companion5, component6, (x00.l) rememberedValue12);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, constrainAs2);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    x00.a<ComposeUiNode> constructor2 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer2);
                    Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion7.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                    if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion7.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(ColorKt.Color(4292141307L))), f.f24033a.b(), composer2, ProvidedValue.$stable | 48);
                    composer2.endNode();
                    long Color = ColorKt.Color(4294244350L);
                    boolean changed4 = composer2.changed(component2);
                    Object rememberedValue13 = composer2.rememberedValue();
                    if (changed4 || rememberedValue13 == companion6.getEmpty()) {
                        rememberedValue13 = new UserKt.f(component2);
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    Modifier m780widthInVpY3zN4$default = SizeKt.m780widthInVpY3zN4$default(constraintLayoutScope2.constrainAs(companion5, component3, (x00.l) rememberedValue13), 0.0f, Dp.m5115constructorimpl(200), 1, null);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i21 = MaterialTheme.$stable;
                    TextKt.m1845Text4IGK_g(str2, m780widthInVpY3zN4$default, Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, l7.P(materialTheme.getTypography(composer2, i21).getH4(), 0L, 0, composer2, 0, 3), composer2, 384, 3120, 55288);
                    A = UserKt.A(i11);
                    String str4 = "百词斩id：" + A;
                    long Color2 = ColorKt.Color(4292141307L);
                    float f12 = -4;
                    Modifier m686offsetVpY3zN4$default = OffsetKt.m686offsetVpY3zN4$default(companion5, 0.0f, Dp.m5115constructorimpl(f12), 1, null);
                    boolean changed5 = composer2.changed(lVar) | composer2.changed(i11);
                    Object rememberedValue14 = composer2.rememberedValue();
                    if (changed5 || rememberedValue14 == companion6.getEmpty()) {
                        rememberedValue14 = new UserKt.g(lVar, i11);
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(ComposeUtilsKt.k(m686offsetVpY3zN4$default, 0L, false, (x00.a) rememberedValue14, 3, null), 0.0f, Dp.m5115constructorimpl(8), 1, null);
                    boolean changed6 = composer2.changed(component3);
                    Object rememberedValue15 = composer2.rememberedValue();
                    if (changed6 || rememberedValue15 == companion6.getEmpty()) {
                        rememberedValue15 = new UserKt.h(component3);
                        composer2.updateRememberedValue(rememberedValue15);
                    }
                    Modifier constrainAs3 = constraintLayoutScope2.constrainAs(m728paddingVpY3zN4$default, component4, (x00.l) rememberedValue15);
                    TextStyle subtitle2 = materialTheme.getTypography(composer2, i21).getSubtitle2();
                    FontWeight.Companion companion8 = FontWeight.Companion;
                    TextKt.m1845Text4IGK_g(str4, constrainAs3, Color2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(subtitle2, 0L, 0L, companion8.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 384, 0, 65528);
                    long Color3 = ColorKt.Color(4289643768L);
                    Modifier m686offsetVpY3zN4$default2 = OffsetKt.m686offsetVpY3zN4$default(companion5, 0.0f, Dp.m5115constructorimpl(f12), 1, null);
                    boolean changed7 = composer2.changed(aVar2);
                    Object rememberedValue16 = composer2.rememberedValue();
                    if (changed7 || rememberedValue16 == companion6.getEmpty()) {
                        rememberedValue16 = new UserKt.b(aVar2);
                        composer2.updateRememberedValue(rememberedValue16);
                    }
                    Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(ComposeUtilsKt.k(m686offsetVpY3zN4$default2, 0L, false, (x00.a) rememberedValue16, 3, null), Dp.m5115constructorimpl(12));
                    boolean changed8 = composer2.changed(component4);
                    Object rememberedValue17 = composer2.rememberedValue();
                    if (changed8 || rememberedValue17 == companion6.getEmpty()) {
                        rememberedValue17 = new UserKt.c(component4);
                        composer2.updateRememberedValue(rememberedValue17);
                    }
                    TextKt.m1845Text4IGK_g(str3, constraintLayoutScope2.constrainAs(m726padding3ABfNKs, component5, (x00.l) rememberedValue17), Color3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer2, i21).getH5(), 0L, 0L, companion8.getMedium(), null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773115, null), composer2, 384, 0, 65528);
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar5, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
            float f12 = 6;
            float f13 = 1;
            float f14 = 12;
            float f15 = 8;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m234backgroundbw27NRU(ShadowKt.m2144shadows4CzXII$default(PaddingKt.m729paddingqDBjuR0(companion, Dp.m5115constructorimpl(Dp.m5115constructorimpl(f12) + Dp.m5115constructorimpl(f13)), Dp.m5115constructorimpl(f14), Dp.m5115constructorimpl(Dp.m5115constructorimpl(f12) + Dp.m5115constructorimpl(f13)), Dp.m5115constructorimpl(f15)), Dp.m5115constructorimpl(f13), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11)), false, ColorKt.Color(1073741824), ColorKt.Color(1073741824), 4, null), ColorKt.Color(4293718525L), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11))), 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion, Dp.m5115constructorimpl(f14), Dp.m5115constructorimpl(f11));
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m727paddingVpY3zN4);
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
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f15)), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
            x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            k(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), "不断电学习", R.drawable.ic_home_user_info_winning, i12, "天", composer, 25008, 0);
            k(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), "累计学习", R.drawable.ic_home_user_info_days_learnt, i13, "天", composer, 25008, 0);
            k(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), "已学单词", R.drawable.ic_home_user_info_words_learnt, i14, "个", composer, 25008, 0);
            composer.endNode();
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(16), 0.0f, 0.0f, 13, null);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f15)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, m730paddingqDBjuR0$default);
            x00.a<ComposeUiNode> constructor5 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl5 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl5, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl5.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m1951constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m1951constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m1958setimpl(m1951constructorimpl5, materializeModifier5, companion3.getSetModifier());
            boolean changed2 = composer.changed(aVar3);
            Object rememberedValue10 = composer.rememberedValue();
            if (changed2 || rememberedValue10 == companion4.getEmpty()) {
                rememberedValue10 = new x00.a() { // from class: com.baicizhan.main.home.player.settings.o0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 t11;
                        t11 = UserKt.t(x00.a.this);
                        return t11;
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            w(RowScope.weight$default(rowScopeInstance, ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue10, 3, null), 1.0f, false, 2, null), "听力词汇量", R.drawable.ic_home_user_info_voc_listen, i15, ColorKt.Color(4289851352L), composer, 25008, 0);
            boolean changed3 = composer.changed(aVar4);
            Object rememberedValue11 = composer.rememberedValue();
            if (changed3 || rememberedValue11 == companion4.getEmpty()) {
                rememberedValue11 = new x00.a() { // from class: com.baicizhan.main.home.player.settings.p0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 u11;
                        u11 = UserKt.u(x00.a.this);
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            w(RowScope.weight$default(rowScopeInstance, ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue11, 3, null), 1.0f, false, 2, null), "阅读词汇量", R.drawable.ic_home_user_info_voc_read, i16, ColorKt.Color(4294173136L), composer, 25008, 0);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 s(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 t(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 u(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 v(MutableState mutableState, String str, String str2, int i11, String str3, int i12, int i13, int i14, int i15, int i16, x00.a aVar, x00.l lVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, x00.a aVar5, int i17, int i18, Composer composer, int i19) {
        q(mutableState, str, str2, i11, str3, i12, i13, i14, i15, i16, aVar, lVar, aVar2, aVar3, aVar4, aVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i17 | 1), RecomposeScopeImplKt.updateChangedFlags(i18));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void w(Modifier modifier, final String str, final int i11, final int i12, final long j11, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1867662022);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= startRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= startRestartGroup.changed(i12) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= startRestartGroup.changed(j11) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i15 & 9363) != 9362, i15 & 1)) {
            modifier3 = i16 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867662022, i15, -1, "com.baicizhan.main.home.player.settings.VocabularyAbilityInfo (User.kt:290)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 12;
            Modifier then = modifier3.then(PaddingKt.m726padding3ABfNKs(BackgroundKt.m234backgroundbw27NRU(companion, j11, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11))), Dp.m5115constructorimpl(f11)));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, startRestartGroup, (i15 >> 6) & 14), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), ColorKt.Color(4284376202L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getSubtitle2(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, ((i15 >> 3) & 14) | 384, 3120, 55288);
            IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_home_arrow_right_sharp, composer2, 6), (String) null, (Modifier) null, ColorKt.Color(4286553257L), composer2, 3120, 4);
            composer2.endNode();
            TextKt.m1845Text4IGK_g(String.valueOf(i12), PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(6), 0.0f, 0.0f, 13, null), 0L, TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, bk.k.n(), TextUnitKt.getSp(0), (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer2, 14158896, 6, 129844);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.m0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 x11;
                    x11 = UserKt.x(Modifier.this, str, i11, i12, j11, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    public static final g2 x(Modifier modifier, String str, int i11, int i12, long j11, int i13, int i14, Composer composer, int i15) {
        w(modifier, str, i11, i12, j11, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return g2.f100423a;
    }
}
