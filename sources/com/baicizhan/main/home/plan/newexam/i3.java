package com.baicizhan.main.home.plan.newexam;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import coil.request.ImageRequest;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.platform.base.widget.ButtonType;
import com.jiongji.andriod.card.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLearnCardComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardComponents.kt\ncom/baicizhan/main/home/plan/newexam/LearnCardComponentsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 14 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,527:1\n113#2:528\n113#2:529\n113#2:530\n113#2:557\n113#2:558\n113#2:559\n113#2:560\n113#2:561\n113#2:638\n113#2:685\n113#2:728\n113#2:729\n113#2:771\n113#2:772\n113#2:849\n113#2:852\n113#2:857\n113#2:858\n113#2:897\n113#2:952\n113#2:953\n113#2:954\n113#2:955\n113#2:956\n113#2:995\n113#2:996\n113#2:1039\n113#2:1040\n113#2:1041\n113#2:1042\n113#2:1087\n113#2:1089\n113#2:1090\n113#2:1134\n1247#3,6:531\n1247#3,3:544\n1250#3,3:548\n1247#3,6:551\n557#4:537\n554#4,6:538\n555#5:547\n87#6:562\n83#6,10:563\n94#6:646\n87#6:647\n83#6,10:648\n94#6:689\n87#6:773\n83#6,10:774\n94#6:905\n87#6:957\n83#6,10:958\n94#6:1000\n87#6:1001\n83#6,10:1002\n94#6:1046\n79#7,6:573\n86#7,3:588\n89#7,2:597\n79#7,6:611\n86#7,3:626\n89#7,2:635\n93#7:641\n93#7:645\n79#7,6:658\n86#7,3:673\n89#7,2:682\n93#7:688\n79#7,6:701\n86#7,3:716\n89#7,2:725\n93#7:732\n79#7,6:744\n86#7,3:759\n89#7,2:768\n79#7,6:784\n86#7,3:799\n89#7,2:808\n79#7,6:822\n86#7,3:837\n89#7,2:846\n93#7:855\n79#7,6:870\n86#7,3:885\n89#7,2:894\n93#7:900\n93#7:904\n93#7:908\n79#7,6:921\n86#7,3:936\n89#7,2:945\n93#7:950\n79#7,6:968\n86#7,3:983\n89#7,2:992\n93#7:999\n79#7,6:1012\n86#7,3:1027\n89#7,2:1036\n93#7:1045\n79#7,6:1056\n86#7,3:1071\n89#7,2:1080\n93#7:1085\n79#7,6:1100\n86#7,3:1115\n89#7,2:1124\n93#7:1129\n347#8,9:579\n356#8:599\n347#8,9:617\n356#8:637\n357#8,2:639\n357#8,2:643\n347#8,9:664\n356#8:684\n357#8,2:686\n347#8,9:707\n356#8:727\n357#8,2:730\n347#8,9:750\n356#8:770\n347#8,9:790\n356#8:810\n347#8,9:828\n356#8:848\n357#8,2:853\n347#8,9:876\n356#8:896\n357#8,2:898\n357#8,2:902\n357#8,2:906\n347#8,9:927\n356#8,3:947\n347#8,9:974\n356#8:994\n357#8,2:997\n347#8,9:1018\n356#8:1038\n357#8,2:1043\n347#8,9:1062\n356#8,3:1082\n347#8,9:1106\n356#8,3:1126\n4206#9,6:591\n4206#9,6:629\n4206#9,6:676\n4206#9,6:719\n4206#9,6:762\n4206#9,6:802\n4206#9,6:840\n4206#9,6:888\n4206#9,6:939\n4206#9,6:986\n4206#9,6:1030\n4206#9,6:1074\n4206#9,6:1118\n99#10:600\n95#10,10:601\n106#10:642\n99#10:690\n95#10,10:691\n106#10:733\n99#10:734\n96#10,9:735\n99#10:811\n95#10,10:812\n106#10:856\n99#10:859\n95#10,10:860\n106#10:901\n106#10:909\n99#10:911\n96#10,9:912\n106#10:951\n52#11:850\n1#12:851\n75#13:910\n75#13:1088\n70#14:1047\n68#14,8:1048\n77#14:1086\n70#14:1091\n68#14,8:1092\n77#14:1130\n85#15:1131\n113#15,2:1132\n*S KotlinDebug\n*F\n+ 1 LearnCardComponents.kt\ncom/baicizhan/main/home/plan/newexam/LearnCardComponentsKt\n*L\n61#1:528\n71#1:529\n73#1:530\n95#1:557\n96#1:558\n98#1:559\n117#1:560\n131#1:561\n152#1:638\n184#1:685\n198#1:728\n200#1:729\n216#1:771\n217#1:772\n231#1:849\n234#1:852\n244#1:857\n246#1:858\n250#1:897\n311#1:952\n312#1:953\n325#1:954\n326#1:955\n337#1:956\n369#1:995\n370#1:996\n382#1:1039\n385#1:1040\n390#1:1041\n392#1:1042\n414#1:1087\n418#1:1089\n421#1:1090\n340#1:1134\n80#1:531,6\n81#1:544,3\n81#1:548,3\n83#1:551,6\n81#1:537\n81#1:538,6\n81#1:547\n143#1:562\n143#1:563,10\n143#1:646\n178#1:647\n178#1:648,10\n178#1:689\n218#1:773\n218#1:774,10\n218#1:905\n368#1:957\n368#1:958,10\n368#1:1000\n379#1:1001\n379#1:1002,10\n379#1:1046\n143#1:573,6\n143#1:588,3\n143#1:597,2\n144#1:611,6\n144#1:626,3\n144#1:635,2\n144#1:641\n143#1:645\n178#1:658,6\n178#1:673,3\n178#1:682,2\n178#1:688\n191#1:701,6\n191#1:716,3\n191#1:725,2\n191#1:732\n210#1:744,6\n210#1:759,3\n210#1:768,2\n218#1:784,6\n218#1:799,3\n218#1:808,2\n219#1:822,6\n219#1:837,3\n219#1:846,2\n219#1:855\n247#1:870,6\n247#1:885,3\n247#1:894,2\n247#1:900\n218#1:904\n210#1:908\n291#1:921,6\n291#1:936,3\n291#1:945,2\n291#1:950\n368#1:968,6\n368#1:983,3\n368#1:992,2\n368#1:999\n379#1:1012,6\n379#1:1027,3\n379#1:1036,2\n379#1:1045\n400#1:1056,6\n400#1:1071,3\n400#1:1080,2\n400#1:1085\n416#1:1100,6\n416#1:1115,3\n416#1:1124,2\n416#1:1129\n143#1:579,9\n143#1:599\n144#1:617,9\n144#1:637\n144#1:639,2\n143#1:643,2\n178#1:664,9\n178#1:684\n178#1:686,2\n191#1:707,9\n191#1:727\n191#1:730,2\n210#1:750,9\n210#1:770\n218#1:790,9\n218#1:810\n219#1:828,9\n219#1:848\n219#1:853,2\n247#1:876,9\n247#1:896\n247#1:898,2\n218#1:902,2\n210#1:906,2\n291#1:927,9\n291#1:947,3\n368#1:974,9\n368#1:994\n368#1:997,2\n379#1:1018,9\n379#1:1038\n379#1:1043,2\n400#1:1062,9\n400#1:1082,3\n416#1:1106,9\n416#1:1126,3\n143#1:591,6\n144#1:629,6\n178#1:676,6\n191#1:719,6\n210#1:762,6\n218#1:802,6\n219#1:840,6\n247#1:888,6\n291#1:939,6\n368#1:986,6\n379#1:1030,6\n400#1:1074,6\n416#1:1118,6\n144#1:600\n144#1:601,10\n144#1:642\n191#1:690\n191#1:691,10\n191#1:733\n210#1:734\n210#1:735,9\n219#1:811\n219#1:812,10\n219#1:856\n247#1:859\n247#1:860,10\n247#1:901\n210#1:909\n291#1:911\n291#1:912,9\n291#1:951\n231#1:850\n263#1:910\n415#1:1088\n400#1:1047\n400#1:1048,8\n400#1:1086\n416#1:1091\n416#1:1092,8\n416#1:1130\n80#1:1131\n80#1:1132,2\n*E\n"})
/* loaded from: classes4.dex */
public final class i3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.newexam.LearnCardComponentsKt$DakaButton$1$1$1", f = "LearnCardComponents.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22705a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f22706b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f22706b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f22706b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22705a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f22705a = 1;
                if (c40.a1.b(500L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            i3.b0(this.f22706b, false);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22707a;

        static {
            int[] iArr = new int[LearnButtonType.values().length];
            try {
                iArr[LearnButtonType.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LearnButtonType.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22707a = iArr;
        }
    }

    @Composable
    public static final void A(final float f11, final float f12, final String str, final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1229326747);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(f11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(f12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229326747, i12, -1, "com.baicizhan.main.home.plan.newexam.BookCover (LearnCardComponents.kt:260)");
            }
            composer2 = startRestartGroup;
            coil.compose.l.b(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(str).f(), "cover", ClickableKt.m269clickableXHw0xAI$default(SizeKt.m778width3ABfNKs(SizeKt.m759height3ABfNKs(Modifier.Companion, f12), f11), false, null, null, aVar, 7, null), PainterResources_androidKt.painterResource(R.drawable.ic_book_cover_default, startRestartGroup, 6), null, null, null, null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer2, 48, 6, 64496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.w2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B;
                    B = i3.B(f11, f12, str, aVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            });
        }
    }

    public static final yz.g2 B(float f11, float f12, String str, x00.a aVar, int i11, Composer composer, int i12) {
        A(f11, f12, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void C(final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2039080617);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2039080617, i12, -1, "com.baicizhan.main.home.plan.newexam.BookModify (LearnCardComponents.kt:289)");
            }
            Modifier m269clickableXHw0xAI$default = ClickableKt.m269clickableXHw0xAI$default(Modifier.Companion, false, null, null, aVar, 7, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m269clickableXHw0xAI$default);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_plan_card_plan_modify, startRestartGroup, 6), (Modifier) null, bk.b.B(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 131058);
            IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_word_plan_arrow_right, composer2, 6), "", (Modifier) null, bk.b.B(), composer2, 3120, 4);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.l2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 D;
                    D = i3.D(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return D;
                }
            });
        }
    }

    public static final yz.g2 D(x00.a aVar, int i11, Composer composer, int i12) {
        C(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void E(Modifier modifier, final String str, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(988624566);
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
            i13 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(988624566, i13, -1, "com.baicizhan.main.home.plan.newexam.BookName (LearnCardComponents.kt:276)");
            }
            int i15 = i13;
            composer2 = startRestartGroup;
            modifier3 = modifier4;
            TextKt.m1845Text4IGK_g(str, modifier3, bk.b.x(), bk.d.m(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, ((i15 >> 3) & 14) | 3456 | ((i15 << 3) & 112), 3120, 120816);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.n2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 F;
                    F = i3.F(Modifier.this, str, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return F;
                }
            });
        }
    }

    public static final yz.g2 F(Modifier modifier, String str, int i11, int i12, Composer composer, int i13) {
        E(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void G(final int i11, final int i12, Composer composer, final int i13) {
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1724086596);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= startRestartGroup.changed(i12) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i14 & 19) != 18, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1724086596, i14, -1, "com.baicizhan.main.home.plan.newexam.BookProgress (LearnCardComponents.kt:319)");
            }
            float f11 = 4;
            ProgressIndicatorKt.m1729LinearProgressIndicator_5eSRE(i11 / i12, SizeKt.m759height3ABfNKs(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11))), Dp.m5115constructorimpl(f11)), bk.b.e0(), bk.b.J(), 0, startRestartGroup, 3456, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.g3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 H;
                    H = i3.H(i11, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return H;
                }
            });
        }
    }

    public static final yz.g2 H(int i11, int i12, int i13, Composer composer, int i14) {
        G(i11, i12, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void I(final int i11, final int i12, Composer composer, final int i13) {
        int i14;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1308647249);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= startRestartGroup.changed(i12) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i14 & 19) != 18, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1308647249, i14, -1, "com.baicizhan.main.home.plan.newexam.BookProgressText (LearnCardComponents.kt:348)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(i11 + " / " + i12, (Modifier) null, bk.b.D(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.z2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 J;
                    J = i3.J(i11, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return J;
                }
            });
        }
    }

    public static final yz.g2 J(int i11, int i12, int i13, Composer composer, int i14) {
        I(i11, i12, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void K(final int i11, Composer composer, final int i12) {
        int i13;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1669823370);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1669823370, i13, -1, "com.baicizhan.main.home.plan.newexam.BookRemainDay (LearnCardComponents.kt:357)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_plan_card_progress_desc, new Object[]{Integer.valueOf(i11)}, startRestartGroup, 6), (Modifier) null, bk.b.D(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.u2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 L;
                    L = i3.L(i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return L;
                }
            });
        }
    }

    public static final yz.g2 L(int i11, int i12, Composer composer, int i13) {
        K(i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void M(final int i11, Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1597860980);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1597860980, i13, -1, "com.baicizhan.main.home.plan.newexam.BookRound (LearnCardComponents.kt:333)");
            }
            SurfaceKt.m1784SurfaceFjzlyU(null, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(2)), bk.b.F(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1176149424, true, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.c3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 N;
                    N = i3.N(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            }, startRestartGroup, 54), startRestartGroup, 1573248, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.d3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = i3.O(i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 N(int i11, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1176149424, i12, -1, "com.baicizhan.main.home.plan.newexam.BookRound.<anonymous> (LearnCardComponents.kt:338)");
            }
            TextKt.m1845Text4IGK_g("Round " + i11, PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(4), Dp.m5115constructorimpl(2)), bk.b.A0(), bk.d.j(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 O(int i11, int i12, Composer composer, int i13) {
        M(i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void P(final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1350132907);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1350132907, i12, -1, "com.baicizhan.main.home.plan.newexam.BookUpgrade (LearnCardComponents.kt:307)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_book_update, startRestartGroup, 6), "", ClickableKt.m269clickableXHw0xAI$default(SizeKt.m773size3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), Dp.m5115constructorimpl(20)), false, null, null, aVar, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.r2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = i3.Q(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            });
        }
    }

    public static final yz.g2 Q(x00.a aVar, int i11, Composer composer, int i12) {
        P(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(@m80.k final x00.a<yz.g2> r32, @m80.k final java.lang.String r33, @m80.l java.lang.String r34, @m80.l androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.newexam.i3.R(x00.a, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 S(x00.a aVar, String str, String str2, int i11, int i12, Composer composer, int i13) {
        R(aVar, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void T(@m80.l Modifier modifier, @m80.k final x00.p<? super Composer, ? super Integer, yz.g2> content, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(933397704);
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
            i13 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((i15 & 19) != 18, i15 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(933397704, i15, -1, "com.baicizhan.main.home.plan.newexam.CompleteBG (LearnCardComponents.kt:398)");
            }
            Modifier aspectRatio$default = AspectRatioKt.aspectRatio$default(modifier3, 1.0f, false, 2, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, aspectRatio$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_book_plan_done, startRestartGroup, 6), SingleFragmentActivity.f18194n, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            content.invoke(startRestartGroup, Integer.valueOf((i15 >> 3) & 14));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.p2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 U;
                    U = i3.U(Modifier.this, content, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return U;
                }
            });
        }
    }

    public static final yz.g2 U(Modifier modifier, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        T(modifier, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void V(@m80.k final String bookName, @m80.k final String bookImg, @m80.k final String des, @m80.k final x00.a<yz.g2> bookClick, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        kotlin.jvm.internal.g0.p(des, "des");
        kotlin.jvm.internal.g0.p(bookClick, "bookClick");
        Composer startRestartGroup = composer.startRestartGroup(-579569803);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(bookName) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(bookImg) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(des) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(bookClick) ? 2048 : 1024;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-579569803, i13, -1, "com.baicizhan.main.home.plan.newexam.CompletedBook (LearnCardComponents.kt:366)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            A(Dp.m5115constructorimpl(74), Dp.m5115constructorimpl(96), bookImg, bookClick, startRestartGroup, ((i13 << 3) & 896) | 54 | (i13 & 7168));
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), startRestartGroup, 6);
            long x11 = bk.b.x();
            composer2 = startRestartGroup;
            long p11 = bk.d.p();
            FontWeight.Companion companion3 = FontWeight.Companion;
            TextKt.m1845Text4IGK_g(bookName, (Modifier) null, x11, p11, (FontStyle) null, companion3.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, (i13 & 14) | 200064, 0, 131026);
            TextKt.m1845Text4IGK_g(des, (Modifier) null, bk.b.x(), bk.d.m(), (FontStyle) null, companion3.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, ((i13 >> 6) & 14) | 200064, 0, 131026);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.b3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 W;
                    W = i3.W(bookName, bookImg, des, bookClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return W;
                }
            });
        }
    }

    public static final yz.g2 W(String str, String str2, String str3, x00.a aVar, int i11, Composer composer, int i12) {
        V(str, str2, str3, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 2000)
    public static final void X(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1900082598);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1900082598, i11, -1, "com.baicizhan.main.home.plan.newexam.ComponentsPreview (LearnCardComponents.kt:435)");
            }
            bk.k.e(null, null, null, k0.f22723a.A(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.x2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Y;
                    Y = i3.Y(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Y;
                }
            });
        }
    }

    public static final yz.g2 Y(int i11, Composer composer, int i12) {
        X(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Z(@m80.k final x00.a<yz.g2> onClick, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1546313465);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1546313465, i12, -1, "com.baicizhan.main.home.plan.newexam.DakaButton (LearnCardComponents.kt:78)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue2;
            boolean changedInstance = startRestartGroup.changedInstance(r0Var) | ((i12 & 14) == 4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.s2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 c02;
                        c02 = i3.c0(x00.a.this, r0Var, mutableState);
                        return c02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            SurfaceKt.m1785SurfaceLPr_se0((x00.a) rememberedValue3, SizeKt.m775sizeVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(56), Dp.m5115constructorimpl(20)), false, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(2)), bk.b.p0(), 0L, null, Dp.m5115constructorimpl(0), null, k0.f22723a.z(), startRestartGroup, 817913904, 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.t2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 d02;
                    d02 = i3.d0(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return d02;
                }
            });
        }
    }

    public static final boolean a0(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void b0(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 c0(x00.a aVar, c40.r0 r0Var, MutableState mutableState) {
        if (a0(mutableState)) {
            return yz.g2.f100423a;
        }
        b0(mutableState, true);
        aVar.invoke();
        c40.k.f(r0Var, null, null, new a(mutableState, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 d0(x00.a aVar, int i11, Composer composer, int i12) {
        Z(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e0(@m80.k final Modifier modifier, @m80.k final x00.a<yz.g2> onClick, @m80.k final String text, @m80.k final LearnButtonType buttonType, @m80.l Composer composer, final int i11) {
        int i12;
        ButtonType buttonType2;
        kotlin.jvm.internal.g0.p(modifier, "modifier");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(buttonType, "buttonType");
        Composer startRestartGroup = composer.startRestartGroup(-853401996);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(buttonType.ordinal()) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-853401996, i12, -1, "com.baicizhan.main.home.plan.newexam.LearnButton (LearnCardComponents.kt:58)");
            }
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(modifier, Dp.m5115constructorimpl(56));
            int i13 = b.f22707a[buttonType.ordinal()];
            if (i13 == 1) {
                buttonType2 = ButtonType.PRIMARY;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonType2 = ButtonType.PRIMARY_VARIANT;
            }
            com.baicizhan.platform.base.widget.r.I(m759height3ABfNKs, onClick, text, bk.d.n(), FontWeight.Companion.getBold(), 0, false, false, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(7)), buttonType2, PaddingKt.m720PaddingValuesYgX7TsA(Dp.m5115constructorimpl(12), Dp.m5115constructorimpl(6)), startRestartGroup, (i12 & 112) | 27648 | (i12 & 896), 0, 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.q2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 f02;
                    f02 = i3.f0(Modifier.this, onClick, text, buttonType, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return f02;
                }
            });
        }
    }

    public static final yz.g2 f0(Modifier modifier, x00.a aVar, String str, LearnButtonType learnButtonType, int i11, Composer composer, int i12) {
        e0(modifier, aVar, str, learnButtonType, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void g0(@m80.l PaddingValues paddingValues, @m80.k final x00.p<? super Composer, ? super Integer, yz.g2> content, @m80.l Composer composer, final int i11, final int i12) {
        PaddingValues paddingValues2;
        int i13;
        final PaddingValues paddingValues3;
        kotlin.jvm.internal.g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(698205030);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            paddingValues2 = paddingValues;
        } else if ((i11 & 6) == 0) {
            paddingValues2 = paddingValues;
            i13 = (startRestartGroup.changed(paddingValues2) ? 4 : 2) | i11;
        } else {
            paddingValues2 = paddingValues;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            paddingValues3 = i14 != 0 ? PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)) : paddingValues2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(698205030, i13, -1, "com.baicizhan.main.home.plan.newexam.LearnCard (LearnCardComponents.kt:413)");
            }
            Configuration configuration = (Configuration) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
            Modifier padding = PaddingKt.padding(BackgroundKt.m235backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(Modifier.Companion, Dp.m5115constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null), 0.0f, 1, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), bk.b.A0(), null, 2, null), paddingValues3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(852377388);
            qb.c.b("LearnCard", "width = " + configuration.screenWidthDp + ", height = " + configuration.screenHeightDp, new Object[0]);
            content.invoke(startRestartGroup, Integer.valueOf((i13 >> 3) & 14));
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            paddingValues3 = paddingValues2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.f3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 h02;
                    h02 = i3.h0(PaddingValues.this, content, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return h02;
                }
            });
        }
    }

    public static final yz.g2 h0(PaddingValues paddingValues, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        g0(paddingValues, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i0(@m80.k final String text, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(222333997);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(text) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(222333997, i12, -1, "com.baicizhan.main.home.plan.newexam.ReviewPool (LearnCardComponents.kt:167)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(text, (Modifier) null, bk.b.D(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, (i12 & 14) | 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.v2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 j02;
                    j02 = i3.j0(text, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return j02;
                }
            });
        }
    }

    public static final yz.g2 j0(String str, int i11, Composer composer, int i12) {
        i0(str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k0(@m80.k final String title, int i11, int i12, @m80.l Composer composer, final int i13) {
        int i14;
        final int i15;
        final int i16;
        Composer composer2;
        kotlin.jvm.internal.g0.p(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(517562083);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= startRestartGroup.changed(i12) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i14 & 147) != 146, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(517562083, i14, -1, "com.baicizhan.main.home.plan.newexam.StudyDataArea (LearnCardComponents.kt:176)");
            }
            Alignment.Horizontal start = Alignment.Companion.getStart();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(title, (Modifier) null, bk.b.B(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, (i14 & 14) | 3456, 0, 131058);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(16)), composer2, 6);
            i15 = i11;
            i16 = i12;
            m0(i15, i16, composer2, (i14 >> 3) & 126);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i15 = i11;
            i16 = i12;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.o2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 l02;
                    l02 = i3.l0(title, i15, i16, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return l02;
                }
            });
        }
    }

    public static final yz.g2 l0(String str, int i11, int i12, int i13, Composer composer, int i14) {
        k0(str, i11, i12, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m0(final int i11, final int i12, @m80.l Composer composer, final int i13) {
        int i14;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(734499428);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= startRestartGroup.changed(i12) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i14 & 19) != 18, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(734499428, i14, -1, "com.baicizhan.main.home.plan.newexam.StudyNumber (LearnCardComponents.kt:189)");
            }
            Alignment.Vertical bottom = Alignment.Companion.getBottom();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), bottom, startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(String.valueOf(i11), (Modifier) null, bk.b.x(), TextUnitKt.getSp(40), (FontStyle) null, (FontWeight) null, yj.a.a(R.font.din_black_italic), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 130994);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(8)), composer2, 6);
            TextKt.m1845Text4IGK_g("/ " + i12, OffsetKt.m686offsetVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(-4), 1, null), bk.b.B(), bk.d.m(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3504, 0, 131056);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.e3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 n02;
                    n02 = i3.n0(i11, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return n02;
                }
            });
        }
    }

    public static final yz.g2 n0(int i11, int i12, int i13, Composer composer, int i14) {
        m0(i11, i12, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void o0(@m80.k final String text, @m80.k final x00.a<yz.g2> onClick, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(206687709);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(text) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206687709, i13, -1, "com.baicizhan.main.home.plan.newexam.TextAd (LearnCardComponents.kt:113)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(text, ClickableKt.m269clickableXHw0xAI$default(PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(24), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, onClick, 7, null), bk.b.e0(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, (i13 & 14) | 3456, 3120, 120816);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.m2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 p02;
                    p02 = i3.p0(text, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return p02;
                }
            });
        }
    }

    public static final yz.g2 p0(String str, x00.a aVar, int i11, Composer composer, int i12) {
        o0(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q0(@m80.l Composer composer, final int i11) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(915254084);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915254084, i11, -1, "com.baicizhan.main.home.plan.newexam.TodayPlanDoneTitle (LearnCardComponents.kt:141)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(R.string.word_plan_card_plan_title_well_done, startRestartGroup, 6);
            long m11 = bk.d.m();
            long x11 = bk.b.x();
            FontWeight.Companion companion4 = FontWeight.Companion;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(stringResource, (Modifier) null, x11, m11, (FontStyle) null, companion4.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200064, 0, 131026);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_learncard_well_done, composer2, 6), "", SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
            composer2.endNode();
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_plan_card_plan_title_done_v2, composer2, 6), (Modifier) null, bk.b.x(), bk.d.m(), (FontStyle) null, companion4.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200064, 0, 131026);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.a3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 r02;
                    r02 = i3.r0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return r02;
                }
            });
        }
    }

    public static final yz.g2 r0(int i11, Composer composer, int i12) {
        q0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void s0(@m80.l Composer composer, final int i11) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-476736094);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476736094, i11, -1, "com.baicizhan.main.home.plan.newexam.TodayPlanTitle (LearnCardComponents.kt:128)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_plan_card_plan_title, startRestartGroup, 6), SizeKt.m778width3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(112)), bk.b.x(), bk.d.m(), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4982getStarte0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200112, 0, 130512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.y2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t02;
                    t02 = i3.t0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return t02;
                }
            });
        }
    }

    public static final yz.g2 t0(int i11, Composer composer, int i12) {
        s0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void y(@m80.l Modifier modifier, @m80.k final j2 model, @m80.k final x00.a<yz.g2> bookClick, @m80.k final x00.a<yz.g2> modify, @m80.k final x00.a<yz.g2> upgrade, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        Modifier.Companion companion;
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(bookClick, "bookClick");
        kotlin.jvm.internal.g0.p(modify, "modify");
        kotlin.jvm.internal.g0.p(upgrade, "upgrade");
        Composer startRestartGroup = composer.startRestartGroup(325440826);
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
            i13 |= startRestartGroup.changed(model) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(bookClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(modify) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(upgrade) ? 16384 : 8192;
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((i15 & 9363) != 9362, i15 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(325440826, i15, -1, "com.baicizhan.main.home.plan.newexam.BookArea (LearnCardComponents.kt:208)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            A(Dp.m5115constructorimpl(54), Dp.m5115constructorimpl(72), model.j(), bookClick, startRestartGroup, ((i15 << 3) & 7168) | 54);
            Modifier.Companion companion4 = Modifier.Companion;
            float f11 = 16;
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion4, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            float m5115constructorimpl = Dp.m5115constructorimpl(Dp.m5115constructorimpl(R.styleable.Theme_drawable_share) - Dp.m5115constructorimpl(52));
            boolean m11 = model.m();
            Boolean valueOf = Boolean.valueOf(m11);
            if (!m11) {
                valueOf = null;
            }
            E(SizeKt.m780widthInVpY3zN4$default(companion4, 0.0f, Dp.m5115constructorimpl(m5115constructorimpl - Dp.m5115constructorimpl(valueOf != null ? 32 : 0)), 1, null), model.k(), startRestartGroup, 0, 0);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion4, Dp.m5115constructorimpl(12)), startRestartGroup, 6);
            C(modify, startRestartGroup, (i15 >> 9) & 14);
            if (model.m()) {
                startRestartGroup.startReplaceGroup(-1004450050);
                companion = companion4;
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), startRestartGroup, 0);
                P(upgrade, startRestartGroup, (i15 >> 12) & 14);
            } else {
                companion = companion4;
                startRestartGroup.startReplaceGroup(-1012180086);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            G(model.l(), model.p(), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(6)), startRestartGroup, 6);
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
            if (model.o() > 0) {
                startRestartGroup.startReplaceGroup(1575338769);
                M(model.o(), startRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(8)), startRestartGroup, 6);
            } else {
                startRestartGroup.startReplaceGroup(1567115027);
            }
            startRestartGroup.endReplaceGroup();
            I(model.l(), model.p(), startRestartGroup, 0);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            K(model.n(), startRestartGroup, 0);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.k2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 z11;
                    z11 = i3.z(Modifier.this, model, bookClick, modify, upgrade, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return z11;
                }
            });
        }
    }

    public static final yz.g2 z(Modifier modifier, j2 j2Var, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, int i12, Composer composer, int i13) {
        y(modifier, j2Var, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
