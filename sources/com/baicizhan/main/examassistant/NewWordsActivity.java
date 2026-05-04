package com.baicizhan.main.examassistant;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material.IconKt;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import com.baicizhan.main.examassistant.NewWordsActivity;
import com.baicizhan.main.examassistant.NewWordsActivity.d;
import com.baicizhan.main.examassistant.NewWordsActivity.e;
import com.baicizhan.main.examassistant.NewWordsActivity.f;
import com.baicizhan.main.examassistant.NewWordsActivity.g;
import com.baicizhan.main.examassistant.NewWordsActivity.h;
import com.baicizhan.main.examassistant.NewWordsActivity.i;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.baicizhan.platform.base.widget.s4;
import com.baicizhan.platform.base.widget.v4;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nNewWordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewWordsActivity.kt\ncom/baicizhan/main/examassistant/NewWordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 14 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 15 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 16 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,679:1\n1#2:680\n625#3,8:681\n1563#4:689\n1634#4,3:690\n1011#4,2:693\n1021#4,2:695\n1869#4,2:697\n1869#4,2:699\n1247#5,6:701\n1247#5,6:782\n1247#5,6:830\n1247#5,6:874\n1247#5,6:880\n1247#5,6:938\n1247#5,6:986\n1247#5,6:995\n1247#5,6:1003\n1247#5,6:1013\n1247#5,6:1060\n1247#5,6:1068\n1247#5,6:1074\n1247#5,6:1124\n1247#5,6:1130\n1247#5,6:1136\n1247#5,6:1142\n1247#5,6:1148\n1247#5,6:1154\n1247#5,6:1160\n1247#5,6:1166\n1247#5,6:1211\n1247#5,6:1217\n1247#5,6:1223\n87#6:707\n84#6,9:708\n87#6:836\n83#6,10:837\n94#6:889\n94#6:897\n87#6:1174\n84#6,9:1175\n94#6:1232\n79#7,6:717\n86#7,3:732\n89#7,2:741\n79#7,6:755\n86#7,3:770\n89#7,2:779\n93#7:790\n79#7,6:803\n86#7,3:818\n89#7,2:827\n79#7,6:847\n86#7,3:862\n89#7,2:871\n93#7:888\n93#7:892\n93#7:896\n79#7,6:909\n86#7,3:924\n89#7,2:933\n93#7:946\n79#7,6:959\n86#7,3:974\n89#7,2:983\n93#7:1011\n79#7,6:1029\n86#7,3:1044\n89#7,2:1053\n93#7:1058\n79#7,6:1091\n86#7,3:1106\n89#7,2:1115\n93#7:1122\n79#7,6:1184\n86#7,3:1199\n89#7,2:1208\n93#7:1231\n347#8,9:723\n356#8:743\n347#8,9:761\n356#8:781\n357#8,2:788\n347#8,9:809\n356#8:829\n347#8,9:853\n356#8:873\n357#8,2:886\n357#8,2:890\n357#8,2:894\n347#8,9:915\n356#8:935\n357#8,2:944\n347#8,9:965\n356#8:985\n357#8,2:1009\n347#8,9:1035\n356#8,3:1055\n347#8,9:1097\n356#8:1117\n357#8,2:1120\n347#8,9:1190\n356#8:1210\n357#8,2:1229\n4206#9,6:735\n4206#9,6:773\n4206#9,6:821\n4206#9,6:865\n4206#9,6:927\n4206#9,6:977\n4206#9,6:1047\n4206#9,6:1109\n4206#9,6:1202\n113#10:744\n113#10:898\n113#10:937\n113#10:948\n113#10:992\n113#10:993\n113#10:994\n113#10:1001\n113#10:1002\n113#10:1019\n113#10:1080\n113#10:1118\n113#10:1119\n113#10:1172\n113#10:1173\n70#11:745\n67#11,9:746\n77#11:791\n70#11:792\n66#11,10:793\n77#11:893\n70#11:1020\n68#11,8:1021\n77#11:1059\n99#12:899\n96#12,9:900\n106#12:947\n99#12:949\n96#12,9:950\n106#12:1012\n99#12:1081\n96#12,9:1082\n106#12:1123\n1565#13:936\n32#14:1066\n80#15:1067\n204#16,13:1233\n*S KotlinDebug\n*F\n+ 1 NewWordsActivity.kt\ncom/baicizhan/main/examassistant/NewWordsActivity\n*L\n249#1:681,8\n251#1:689\n251#1:690,3\n278#1:693,2\n282#1:695,2\n286#1:697,2\n312#1:699,2\n328#1:701,6\n349#1:782,6\n358#1:830,6\n368#1:874,6\n369#1:880,6\n400#1:938,6\n419#1:986,6\n425#1:995,6\n434#1:1003,6\n465#1:1013,6\n493#1:1060,6\n506#1:1068,6\n543#1:1074,6\n559#1:1124,6\n560#1:1130,6\n572#1:1136,6\n171#1:1142,6\n173#1:1148,6\n182#1:1154,6\n188#1:1160,6\n197#1:1166,6\n518#1:1211,6\n527#1:1217,6\n532#1:1223,6\n334#1:707\n334#1:708,9\n365#1:836\n365#1:837,10\n365#1:889\n334#1:897\n512#1:1174\n512#1:1175,9\n512#1:1232\n334#1:717,6\n334#1:732,3\n334#1:741,2\n348#1:755,6\n348#1:770,3\n348#1:779,2\n348#1:790\n356#1:803,6\n356#1:818,3\n356#1:827,2\n365#1:847,6\n365#1:862,3\n365#1:871,2\n365#1:888\n356#1:892\n334#1:896\n382#1:909,6\n382#1:924,3\n382#1:933,2\n382#1:946\n411#1:959,6\n411#1:974,3\n411#1:983,2\n411#1:1011\n465#1:1029,6\n465#1:1044,3\n465#1:1053,2\n465#1:1058\n543#1:1091,6\n543#1:1106,3\n543#1:1115,2\n543#1:1122\n512#1:1184,6\n512#1:1199,3\n512#1:1208,2\n512#1:1231\n334#1:723,9\n334#1:743\n348#1:761,9\n348#1:781\n348#1:788,2\n356#1:809,9\n356#1:829\n365#1:853,9\n365#1:873\n365#1:886,2\n356#1:890,2\n334#1:894,2\n382#1:915,9\n382#1:935\n382#1:944,2\n411#1:965,9\n411#1:985\n411#1:1009,2\n465#1:1035,9\n465#1:1055,3\n543#1:1097,9\n543#1:1117\n543#1:1120,2\n512#1:1190,9\n512#1:1210\n512#1:1229,2\n334#1:735,6\n348#1:773,6\n356#1:821,6\n365#1:865,6\n382#1:927,6\n411#1:977,6\n465#1:1047,6\n543#1:1109,6\n512#1:1202,6\n344#1:744\n383#1:898\n395#1:937\n412#1:948\n422#1:992\n424#1:993\n425#1:994\n428#1:1001\n430#1:1002\n467#1:1019\n545#1:1080\n547#1:1118\n548#1:1119\n513#1:1172\n514#1:1173\n348#1:745\n348#1:746,9\n348#1:791\n356#1:792\n356#1:793,10\n356#1:893\n465#1:1020\n465#1:1021,8\n465#1:1059\n382#1:899\n382#1:900,9\n382#1:947\n411#1:949\n411#1:950,9\n411#1:1012\n543#1:1081\n543#1:1082,9\n543#1:1123\n386#1:936\n505#1:1066\n505#1:1067\n573#1:1233,13\n*E\n"})
@ExperimentalFoundationApi
@ExperimentalAnimationApi
@ExperimentalMaterialApi
/* loaded from: classes4.dex */
public final class NewWordsActivity extends ComposeBaseActivity {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final a f20378n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f20379o = 8;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final String f20380p = "NewWordsActivity";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f20381b = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.examassistant.n2
        @Override // x00.a
        public final Object invoke() {
            gg.a K2;
            K2 = NewWordsActivity.K2();
            return K2;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f20382c = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.examassistant.o2
        @Override // x00.a
        public final Object invoke() {
            q9.l J2;
            J2 = NewWordsActivity.J2(NewWordsActivity.this);
            return J2;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final SnapshotStateList<MarkedWord> f20383d = SnapshotStateKt.mutableStateListOf();

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final SnapshotStateList<Object> f20384e = SnapshotStateKt.mutableStateListOf();

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final SnapshotStateMap<Integer, Boolean> f20385f = SnapshotStateKt.mutableStateMapOf();

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final SnapshotStateMap<Integer, Boolean> f20386g = SnapshotStateKt.mutableStateMapOf();

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableState<Boolean> f20387h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableState<Integer> f20388i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public MutableState<Boolean> f20389j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20390k;

    /* renamed from: l, reason: collision with root package name */
    public int f20391l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20392m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$MenuPop$1$1", f = "NewWordsActivity.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20393a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f20394b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NewWordsActivity f20395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableState<Boolean> mutableState, NewWordsActivity newWordsActivity, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f20394b = mutableState;
            this.f20395c = newWordsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f20394b, this.f20395c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20393a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (!this.f20394b.getValue().booleanValue()) {
                    this.f20393a = 1;
                    if (c40.a1.b(100L, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f20395c.f20392m = !this.f20394b.getValue().booleanValue();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$WordList$1$1", f = "NewWordsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20396a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f20398c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20399a;

            static {
                int[] iArr = new int[IAudioPlayer.State.values().length];
                try {
                    iArr[IAudioPlayer.State.Completed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IAudioPlayer.State.Stopped.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20399a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableState<Integer> mutableState, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f20398c = mutableState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(MutableState mutableState, IAudioPlayer.State state) {
            int i11 = state == null ? -1 : a.f20399a[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                mutableState.setValue(0);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return NewWordsActivity.this.new c(this.f20398c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f20396a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            IAudioPlayer t22 = NewWordsActivity.this.t2();
            final MutableState<Integer> mutableState = this.f20398c;
            t22.f(new IAudioPlayer.b() { // from class: com.baicizhan.main.examassistant.i3
                @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
                public final void onPlayStateChanged(IAudioPlayer.State state) {
                    NewWordsActivity.c.j(MutableState.this, state);
                }
            });
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$WordList$2$1$1$1$1", f = "NewWordsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20400a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20402c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f20403d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<Integer> f20404e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$WordList$2$1$1$1$1$1", f = "NewWordsActivity.kt", i = {}, l = {TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f20405a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwipeableState<Integer> f20406b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SwipeableState<Integer> swipeableState, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f20406b = swipeableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f20406b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f20405a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    SwipeableState<Integer> swipeableState = this.f20406b;
                    Integer f11 = l00.a.f(0);
                    this.f20405a = 1;
                    if (SwipeableState.animateTo$default(swipeableState, f11, null, this, 2, null) == l11) {
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
        public d(int i11, c40.r0 r0Var, SwipeableState<Integer> swipeableState, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f20402c = i11;
            this.f20403d = r0Var;
            this.f20404e = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return NewWordsActivity.this.new d(this.f20402c, this.f20403d, this.f20404e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f20400a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (((Number) NewWordsActivity.this.f20388i.getValue()).intValue() != this.f20402c) {
                c40.k.f(this.f20403d, null, null, new a(this.f20404e, null), 3, null);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements x00.l<Boolean, yz.g2> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20408b;

        public e(Object obj) {
            this.f20408b = obj;
        }

        public final void a(boolean z11) {
            if (z11) {
                NewWordsActivity.this.f20386g.put(Integer.valueOf(((MarkedWord) this.f20408b).n()), Boolean.valueOf(z11));
            } else {
                NewWordsActivity.this.f20386g.remove(Integer.valueOf(((MarkedWord) this.f20408b).n()));
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Boolean bool) {
            a(bool.booleanValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements x00.l<Boolean, yz.g2> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20410b;

        public f(Object obj) {
            this.f20410b = obj;
        }

        public final void a(boolean z11) {
            if (((Boolean) NewWordsActivity.this.f20387h.getValue()).booleanValue() || !NewWordsActivity.this.f20392m) {
                return;
            }
            NewWordsActivity.this.N2();
            NewWordsActivity.this.f20385f.put(Integer.valueOf(((MarkedWord) this.f20410b).n()), Boolean.valueOf(!z11));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(Boolean bool) {
            a(bool.booleanValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements x00.a<yz.g2> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20412b;

        public g(Object obj) {
            this.f20412b = obj;
        }

        public final void a() {
            if (((Boolean) NewWordsActivity.this.f20387h.getValue()).booleanValue() || !NewWordsActivity.this.f20392m) {
                return;
            }
            NewWordsActivity.this.N2();
            WordWikiActivity.a.d(WordWikiActivity.f25556b, NewWordsActivity.this, ((MarkedWord) this.f20412b).n(), 0, null, 12, null);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements x00.a<yz.g2> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20414b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f20415c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.l<File, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NewWordsActivity f20416a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableState<Integer> f20417b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f20418c;

            public a(NewWordsActivity newWordsActivity, MutableState<Integer> mutableState, Object obj) {
                this.f20416a = newWordsActivity;
                this.f20417b = mutableState;
                this.f20418c = obj;
            }

            public final void a(File file) {
                this.f20416a.t2().e(file);
                this.f20417b.setValue(Integer.valueOf(((MarkedWord) this.f20418c).n()));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(File file) {
                a(file);
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<T> implements wb0.b {

            /* renamed from: a, reason: collision with root package name */
            public static final b<T> f20419a = new b<>();

            @Override // wb0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void call(Throwable th2) {
                qb.c.c(NewWordsActivity.f20380p, "play error", th2);
                va.g.j(th2, 0);
            }
        }

        public h(Object obj, MutableState<Integer> mutableState) {
            this.f20414b = obj;
            this.f20415c = mutableState;
        }

        public final void a() {
            if (((Boolean) NewWordsActivity.this.f20387h.getValue()).booleanValue() || !NewWordsActivity.this.f20392m) {
                return;
            }
            NewWordsActivity.this.N2();
            if (((MarkedWord) this.f20414b).n() == this.f20415c.getValue().intValue()) {
                NewWordsActivity.this.t2().stop();
                this.f20415c.setValue(0);
            } else {
                if (this.f20415c.getValue().intValue() != 0) {
                    NewWordsActivity.this.t2().stop();
                }
                m9.d.d().e(((MarkedWord) this.f20414b).j()).u5(new n(new a(NewWordsActivity.this, this.f20415c, this.f20414b)), b.f20419a);
            }
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i implements x00.l<Integer, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f20421b;

        public i(int i11) {
            this.f20421b = i11;
        }

        public final Boolean a(int i11) {
            if (((Boolean) NewWordsActivity.this.f20387h.getValue()).booleanValue()) {
                return Boolean.FALSE;
            }
            if (i11 == 1) {
                NewWordsActivity.this.f20388i.setValue(Integer.valueOf(this.f20421b));
            }
            return Boolean.TRUE;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$deleteWord$3", f = "NewWordsActivity.kt", i = {}, l = {R.styleable.Theme_drawable_tab_mall_new}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.l<j00.c<? super Result<? extends yz.g2>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20422a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MarkedWord f20424c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$deleteWord$3$1", f = "NewWordsActivity.kt", i = {}, l = {R.styleable.Theme_drawable_tab_review}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f20425a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewWordsActivity f20426b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MarkedWord f20427c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NewWordsActivity newWordsActivity, MarkedWord markedWord, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f20426b = newWordsActivity;
                this.f20427c = markedWord;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new a(this.f20426b, this.f20427c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super yz.g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f20425a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    fg.a u22 = this.f20426b.u2();
                    int n11 = this.f20427c.n();
                    int i12 = this.f20426b.f20391l;
                    this.f20425a = 1;
                    if (u22.a(n11, i12, this) == l11) {
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
        public j(MarkedWord markedWord, j00.c<? super j> cVar) {
            super(1, cVar);
            this.f20424c = markedWord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return NewWordsActivity.this.new j(this.f20424c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<yz.g2>> cVar) {
            return ((j) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20422a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = c40.h1.c();
                a aVar = new a(NewWordsActivity.this, this.f20424c, null);
                this.f20422a = 1;
                d11 = com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, this, 2, null);
                if (d11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                d11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(d11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends yz.g2>> cVar) {
            return invoke2((j00.c<? super Result<yz.g2>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$onCreate$1$4", f = "NewWordsActivity.kt", i = {}, l = {R.styleable.Theme_drawable_sound}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.l<j00.c<? super Result<? extends List<? extends MarkedWord>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20428a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20430c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.examassistant.NewWordsActivity$onCreate$1$4$1", f = "NewWordsActivity.kt", i = {}, l = {R.styleable.Theme_drawable_sound1}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super List<? extends MarkedWord>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f20431a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewWordsActivity f20432b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f20433c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NewWordsActivity newWordsActivity, int i11, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f20432b = newWordsActivity;
                this.f20433c = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new a(this.f20432b, this.f20433c, cVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(j00.c<? super List<MarkedWord>> cVar) {
                return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f20431a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                fg.a u22 = this.f20432b.u2();
                int i12 = this.f20433c;
                this.f20431a = 1;
                Object b11 = u22.b(i12, this);
                return b11 == l11 ? l11 : b11;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends MarkedWord>> cVar) {
                return invoke2((j00.c<? super List<MarkedWord>>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i11, j00.c<? super k> cVar) {
            super(1, cVar);
            this.f20430c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return NewWordsActivity.this.new k(this.f20430c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Result<? extends List<MarkedWord>>> cVar) {
            return ((k) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20428a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = c40.h1.c();
                a aVar = new a(NewWordsActivity.this, this.f20430c, null);
                this.f20428a = 1;
                d11 = com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, this, 2, null);
                if (d11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                d11 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(d11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Result<? extends List<? extends MarkedWord>>> cVar) {
            return invoke2((j00.c<? super Result<? extends List<MarkedWord>>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 NewWordsActivity.kt\ncom/baicizhan/main/examassistant/NewWordsActivity\n*L\n1#1,328:1\n279#2:329\n*E\n"})
    public static final class l<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((MarkedWord) t11).k()), Long.valueOf(((MarkedWord) t12).k()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 NewWordsActivity.kt\ncom/baicizhan/main/examassistant/NewWordsActivity\n*L\n1#1,328:1\n283#2:329\n*E\n"})
    public static final class m<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((MarkedWord) t12).k()), Long.valueOf(((MarkedWord) t11).k()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n implements wb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f20434a;

        public n(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f20434a = function;
        }

        @Override // wb0.b
        public final /* synthetic */ void call(Object obj) {
            this.f20434a.invoke(obj);
        }
    }

    public NewWordsActivity() {
        Boolean bool = Boolean.FALSE;
        this.f20387h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f20388i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        MutableState<Boolean> mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        mutableStateOf$default.setValue(Boolean.valueOf(KotlinExtKt.isKvFlagTrue(i9.f.H)));
        this.f20389j = mutableStateOf$default;
        this.f20390k = KotlinExtKt.isKvFlagTrue(i9.f.G);
        this.f20392m = true;
    }

    public static final yz.g2 A1(NewWordsActivity newWordsActivity) {
        newWordsActivity.r2();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 A2(boolean z11, final NewWordsActivity newWordsActivity, final MutableState mutableState, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-81320782, i11, -1, "com.baicizhan.main.examassistant.NewWordsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewWordsActivity.kt:176)");
            }
            String stringResource = StringResources_androidKt.stringResource(z11 ? R.string.exam_assistant_all_word_book_title : R.string.exam_assistant_current_new_word_title, composer, 0);
            v4.a aVar = (!z11 || newWordsActivity.f20383d.isEmpty()) ? null : new v4.a(R.drawable.ic_action_bar_menu);
            boolean changedInstance = composer.changedInstance(newWordsActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.g2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 B2;
                        B2 = NewWordsActivity.B2(NewWordsActivity.this);
                        return B2;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar2 = (x00.a) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.r2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 C2;
                        C2 = NewWordsActivity.C2(MutableState.this);
                        return C2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            s4.F(0, null, aVar2, stringResource, aVar, (x00.a) rememberedValue2, composer, 196608, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 B1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 B2(NewWordsActivity newWordsActivity) {
        if (newWordsActivity.f20392m) {
            newWordsActivity.finish();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 C1(NewWordsActivity newWordsActivity, x00.a aVar, int i11, Composer composer, int i12) {
        newWordsActivity.y1(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 C2(MutableState mutableState) {
        mutableState.setValue(Boolean.TRUE);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 D2(MutableState mutableState, final NewWordsActivity newWordsActivity, boolean z11, MutableState mutableState2, MutableState mutableState3, final hj.m mVar, PaddingValues it, Composer composer, int i11) {
        Composer composer2;
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1290209622, i11, -1, "com.baicizhan.main.examassistant.NewWordsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewWordsActivity.kt:192)");
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer.startReplaceGroup(-972459312);
                if (newWordsActivity.f20383d.isEmpty()) {
                    composer.startReplaceGroup(-972408751);
                    composer2 = composer;
                    WidgetsKt.r(R.drawable.ic_word_favorites_match_empty, z11 ? "还没有任何生词，去真题中添加" : "还没有从文章中添加生词", null, null, composer2, 6, 12);
                    composer2.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-972236205);
                    boolean changedInstance = composer.changedInstance(newWordsActivity) | composer.changedInstance(mVar);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.m2
                            @Override // x00.a
                            public final Object invoke() {
                                yz.g2 E2;
                                E2 = NewWordsActivity.E2(NewWordsActivity.this, mVar);
                                return E2;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    newWordsActivity.D1(mutableState2, mutableState3, z11, (x00.a) rememberedValue, composer, 54);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                }
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(-980429288);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 E1(NewWordsActivity newWordsActivity) {
        newWordsActivity.f20387h.setValue(Boolean.TRUE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 E2(NewWordsActivity newWordsActivity, hj.m mVar) {
        newWordsActivity.o2(mVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 F1(NewWordsActivity newWordsActivity) {
        if (newWordsActivity.f20392m) {
            newWordsActivity.v2(newWordsActivity.f20383d);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F2(NewWordsActivity newWordsActivity, MutableState mutableState, List it) {
        kotlin.jvm.internal.g0.p(it, "it");
        newWordsActivity.f20383d.clear();
        newWordsActivity.f20383d.addAll(it);
        newWordsActivity.H2(it, true);
        mutableState.setValue(Boolean.TRUE);
        ma.l.e(ma.t.f73011j, ma.a.V4, a00.k1.k(yz.h1.a("word_num", Integer.valueOf(newWordsActivity.f20383d.size()))));
        return yz.g2.f100423a;
    }

    public static final yz.g2 G2(MutableState mutableState, Throwable it) {
        kotlin.jvm.internal.g0.p(it, "it");
        mutableState.setValue(Boolean.TRUE);
        qb.c.c(f20380p, "getMarkedWords error", it);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 I1(NewWordsActivity newWordsActivity, x00.a aVar, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(791260117, i11, -1, "com.baicizhan.main.examassistant.NewWordsActivity.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewWordsActivity.kt:370)");
        }
        newWordsActivity.y1(aVar, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static /* synthetic */ void I2(NewWordsActivity newWordsActivity, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        newWordsActivity.H2(list, z11);
    }

    public static final yz.g2 J1(NewWordsActivity newWordsActivity, MutableState mutableState, MutableState mutableState2, boolean z11, x00.a aVar, int i11, Composer composer, int i12) {
        newWordsActivity.D1(mutableState, mutableState2, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final q9.l J2(NewWordsActivity newWordsActivity) {
        return new q9.l(newWordsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.a K2() {
        return new gg.a();
    }

    public static final yz.g2 L1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 M1(NewWordsActivity newWordsActivity, int i11, String str, x00.a aVar, int i12, Composer composer, int i13) {
        newWordsActivity.K1(i11, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 O1(MutableState mutableState, WindowManager.LayoutParams layoutParams, NewWordsActivity newWordsActivity) {
        mutableState.setValue(Boolean.FALSE);
        layoutParams.alpha = 1.0f;
        newWordsActivity.getWindow().clearFlags(2);
        newWordsActivity.getWindow().setAttributes(layoutParams);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 P1(final NewWordsActivity newWordsActivity, final MutableState mutableState, final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(264235725, i11, -1, "com.baicizhan.main.examassistant.NewWordsActivity.MenuPop.<anonymous> (NewWordsActivity.kt:511)");
            }
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(BackgroundKt.m234backgroundbw27NRU(Modifier.Companion, Color.Companion.m2546getWhite0d7_KjU(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), Dp.m5115constructorimpl(12), Dp.m5115constructorimpl(8));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m727paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str = newWordsActivity.f20390k ? "时间逆序" : "时间顺序";
            boolean changedInstance = composer.changedInstance(newWordsActivity) | composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.h2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Q1;
                        Q1 = NewWordsActivity.Q1(NewWordsActivity.this, mutableState);
                        return Q1;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            newWordsActivity.K1(R.drawable.ic_menu_time, str, (x00.a) rememberedValue, composer, 6);
            int i12 = newWordsActivity.f20389j.getValue().booleanValue() ? R.drawable.ic_word_book_menu_hide : R.drawable.ic_word_book_menu_show;
            String str2 = newWordsActivity.f20389j.getValue().booleanValue() ? "隐藏释义" : "显示释义";
            boolean changedInstance2 = composer.changedInstance(newWordsActivity) | composer.changed(mutableState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.i2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 R1;
                        R1 = NewWordsActivity.R1(NewWordsActivity.this, mutableState);
                        return R1;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            newWordsActivity.K1(i12, str2, (x00.a) rememberedValue2, composer, 0);
            boolean changed = composer.changed(aVar) | composer.changed(mutableState);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.examassistant.j2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 S1;
                        S1 = NewWordsActivity.S1(x00.a.this, mutableState);
                        return S1;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            newWordsActivity.K1(R.drawable.ic_word_book_menu_edit, "批量收藏", (x00.a) rememberedValue3, composer, 54);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q1(NewWordsActivity newWordsActivity, MutableState mutableState) {
        newWordsActivity.f20390k = !newWordsActivity.f20390k;
        I2(newWordsActivity, newWordsActivity.f20383d, false, 2, null);
        mutableState.setValue(Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R1(NewWordsActivity newWordsActivity, MutableState mutableState) {
        newWordsActivity.q2();
        mutableState.setValue(Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 S1(x00.a aVar, MutableState mutableState) {
        aVar.invoke();
        mutableState.setValue(Boolean.FALSE);
        return yz.g2.f100423a;
    }

    public static final yz.g2 T1(NewWordsActivity newWordsActivity, MutableState mutableState, x00.a aVar, int i11, Composer composer, int i12) {
        newWordsActivity.N1(mutableState, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 V1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 W1(NewWordsActivity newWordsActivity, String str, x00.a aVar, int i11, Composer composer, int i12) {
        newWordsActivity.U1(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y1(final SnapshotStateList snapshotStateList, final boolean z11, final NewWordsActivity newWordsActivity, final MutableState mutableState, LazyListScope LazyColumn) {
        kotlin.jvm.internal.g0.p(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(snapshotStateList.size(), null, new x00.l<Integer, Object>() { // from class: com.baicizhan.main.examassistant.NewWordsActivity$WordList$lambda$2$0$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                snapshotStateList.get(i11);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new x00.r<LazyItemScope, Integer, Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.examassistant.NewWordsActivity$WordList$lambda$2$0$$inlined$itemsIndexed$default$3
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
                MarkedWord markedWord;
                boolean z12;
                boolean z13;
                Composer composer2 = composer;
                if ((i12 & 6) == 0) {
                    i13 = i12 | (composer2.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i12 & 48) == 0) {
                    i13 |= composer2.changed(i11) ? 32 : 16;
                }
                boolean z14 = true;
                if (!composer2.shouldExecute((i13 & 147) != 146, i13 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = snapshotStateList.get(i11);
                composer2.startReplaceGroup(-1466133815);
                if (obj instanceof String) {
                    composer2.startReplaceGroup(-1466201148);
                    if (z11) {
                        composer2.startReplaceGroup(-1466130561);
                        TextKt.m1845Text4IGK_g((String) obj, PaddingKt.m727paddingVpY3zN4(BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), bk.b.K(), null, 2, null), Dp.m5115constructorimpl(16), Dp.m5115constructorimpl(6)), bk.b.D(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3504, 0, 131056);
                        composer2 = composer;
                    } else {
                        composer2.startReplaceGroup(-1486601752);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else {
                    if (obj instanceof MarkedWord) {
                        composer2.startReplaceGroup(-1465464588);
                        Object rememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2);
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        c40.r0 r0Var = (c40.r0) rememberedValue;
                        int i14 = (i13 & 112) ^ 48;
                        boolean changedInstance = composer2.changedInstance(newWordsActivity) | ((i14 > 32 && composer2.changed(i11)) || (i13 & 48) == 32);
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = newWordsActivity.new i(i11);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        SwipeableState rememberSwipeableState = SwipeableKt.rememberSwipeableState(0, null, (x00.l) rememberedValue2, composer2, 6, 2);
                        Object value = newWordsActivity.f20388i.getValue();
                        boolean changedInstance2 = ((i14 > 32 && composer2.changed(i11)) || (i13 & 48) == 32) | composer2.changedInstance(newWordsActivity) | composer2.changedInstance(r0Var) | composer2.changed(rememberSwipeableState);
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == companion.getEmpty()) {
                            NewWordsActivity.d dVar = newWordsActivity.new d(i11, r0Var, rememberSwipeableState, null);
                            composer2.updateRememberedValue(dVar);
                            rememberedValue3 = dVar;
                        }
                        EffectsKt.LaunchedEffect(value, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue3, composer2, 0);
                        MarkedWord markedWord2 = (MarkedWord) obj;
                        String o11 = markedWord2.o();
                        String l11 = markedWord2.l();
                        String j11 = markedWord2.j();
                        int n11 = markedWord2.n();
                        boolean booleanValue = ((Boolean) newWordsActivity.f20387h.getValue()).booleanValue();
                        if (markedWord2.n() == ((Number) mutableState.getValue()).intValue()) {
                            markedWord = markedWord2;
                            z12 = booleanValue;
                            z13 = true;
                        } else {
                            markedWord = markedWord2;
                            z12 = booleanValue;
                            z13 = false;
                        }
                        Boolean bool = (Boolean) newWordsActivity.f20386g.get(Integer.valueOf(markedWord.n()));
                        boolean booleanValue2 = bool != null ? bool.booleanValue() : false;
                        if (z11) {
                            Boolean bool2 = (Boolean) newWordsActivity.f20385f.get(Integer.valueOf(markedWord.n()));
                            if (bool2 == null) {
                                bool2 = newWordsActivity.w2().getValue();
                            }
                            z14 = bool2.booleanValue();
                        }
                        boolean z15 = z14;
                        boolean changedInstance3 = composer2.changedInstance(newWordsActivity) | composer2.changedInstance(obj);
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == companion.getEmpty()) {
                            rememberedValue4 = newWordsActivity.new e(obj);
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        x00.l lVar = (x00.l) rememberedValue4;
                        boolean changedInstance4 = composer2.changedInstance(newWordsActivity) | composer2.changedInstance(obj);
                        Object rememberedValue5 = composer2.rememberedValue();
                        if (changedInstance4 || rememberedValue5 == companion.getEmpty()) {
                            rememberedValue5 = newWordsActivity.new f(obj);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        x00.l lVar2 = (x00.l) rememberedValue5;
                        boolean changedInstance5 = composer2.changedInstance(newWordsActivity) | composer2.changedInstance(obj);
                        Object rememberedValue6 = composer2.rememberedValue();
                        if (changedInstance5 || rememberedValue6 == companion.getEmpty()) {
                            rememberedValue6 = newWordsActivity.new g(obj);
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        x00.a aVar = (x00.a) rememberedValue6;
                        boolean changedInstance6 = composer2.changedInstance(newWordsActivity) | composer2.changedInstance(obj);
                        Object rememberedValue7 = composer2.rememberedValue();
                        if (changedInstance6 || rememberedValue7 == companion.getEmpty()) {
                            rememberedValue7 = newWordsActivity.new h(obj, mutableState);
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        composer2 = composer2;
                        com.baicizhan.main.customview.compose.o.n(o11, l11, n11, j11, z12, z13, booleanValue2, z15, lVar, lVar2, aVar, (x00.a) rememberedValue7, null, composer2, 0, 0, 4096);
                    } else {
                        composer2.startReplaceGroup(-1486601752);
                    }
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z1(NewWordsActivity newWordsActivity, SnapshotStateList snapshotStateList, boolean z11, int i11, Composer composer, int i12) {
        newWordsActivity.X1(snapshotStateList, z11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 l2(NewWordsActivity newWordsActivity, MarkedWord markedWord, yz.g2 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        newWordsActivity.f20388i.setValue(-1);
        newWordsActivity.f20383d.remove(markedWord);
        I2(newWordsActivity, newWordsActivity.f20383d, false, 2, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 m2(Throwable it) {
        kotlin.jvm.internal.g0.p(it, "it");
        qb.c.d(f20380p, "delete word error", new Object[0]);
        return yz.g2.f100423a;
    }

    public static final void p2(NewWordsActivity newWordsActivity, Boolean bool, long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<unused var>");
        if (kotlin.jvm.internal.g0.g(bool, Boolean.TRUE)) {
            KotlinExtKt.showToast("已成功收藏到单词本");
            newWordsActivity.r2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IAudioPlayer t2() {
        return (IAudioPlayer) this.f20382c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fg.a u2() {
        return (fg.a) this.f20381b.getValue();
    }

    public static final yz.g2 w1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 x1(NewWordsActivity newWordsActivity, Modifier modifier, String str, long j11, long j12, long j13, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        newWordsActivity.v1(modifier, str, j11, j12, j13, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final void x2(final NewWordsActivity newWordsActivity, final boolean z11, int i11, ij.e controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        final MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        final hj.m mVar = new hj.m(newWordsActivity, null, controller);
        ComponentActivityKt.setContent$default(newWordsActivity, null, ComposableLambdaKt.composableLambdaInstance(-220587609, true, new x00.p() { // from class: com.baicizhan.main.examassistant.s2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 y22;
                y22 = NewWordsActivity.y2(z11, newWordsActivity, mutableStateOf$default, mVar, (Composer) obj, ((Integer) obj2).intValue());
                return y22;
            }
        }), 1, null);
        yg.i2.G(newWordsActivity, false, false, 300L, new x00.l() { // from class: com.baicizhan.main.examassistant.t2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 F2;
                F2 = NewWordsActivity.F2(NewWordsActivity.this, mutableStateOf$default, (List) obj);
                return F2;
            }
        }, new x00.l() { // from class: com.baicizhan.main.examassistant.u2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 G2;
                G2 = NewWordsActivity.G2(MutableState.this, (Throwable) obj);
                return G2;
            }
        }, newWordsActivity.new k(i11, null), 3, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 y2(final boolean z11, final NewWordsActivity newWordsActivity, final MutableState mutableState, final hj.m mVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-220587609, i11, -1, "com.baicizhan.main.examassistant.NewWordsActivity.onCreate.<anonymous>.<anonymous> (NewWordsActivity.kt:170)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue2;
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1470742405, true, new x00.p() { // from class: com.baicizhan.main.examassistant.b3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 z22;
                    z22 = NewWordsActivity.z2(z11, newWordsActivity, mutableState3, mutableState, mutableState2, mVar, (Composer) obj, ((Integer) obj2).intValue());
                    return z22;
                }
            }, composer, 54), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 z1(NewWordsActivity newWordsActivity, boolean z11) {
        newWordsActivity.n2(z11);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 z2(final boolean z11, final NewWordsActivity newWordsActivity, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final hj.m mVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1470742405, i11, -1, "com.baicizhan.main.examassistant.NewWordsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (NewWordsActivity.kt:175)");
            }
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-81320782, true, new x00.p() { // from class: com.baicizhan.main.examassistant.y1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 A2;
                    A2 = NewWordsActivity.A2(z11, newWordsActivity, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                    return A2;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1290209622, true, new x00.q() { // from class: com.baicizhan.main.examassistant.z1
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 D2;
                    D2 = NewWordsActivity.D2(MutableState.this, newWordsActivity, z11, mutableState, mutableState3, mVar, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return D2;
                }
            }, composer, 54), composer, 3072, 12582912, 131063);
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
    public final void D1(@m80.k final MutableState<Boolean> showMenu, @m80.k final MutableState<Boolean> showStudy, final boolean z11, @m80.k final x00.a<yz.g2> tryCollect, @m80.l Composer composer, final int i11) {
        int i12;
        MutableTransitionState mutableTransitionState;
        int i13;
        Modifier.Companion companion;
        kotlin.jvm.internal.g0.p(showMenu, "showMenu");
        kotlin.jvm.internal.g0.p(showStudy, "showStudy");
        kotlin.jvm.internal.g0.p(tryCollect, "tryCollect");
        Composer startRestartGroup = composer.startRestartGroup(-883560519);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(showMenu) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(showStudy) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(tryCollect) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-883560519, i12, -1, "com.baicizhan.main.examassistant.NewWordsActivity.Content (NewWordsActivity.kt:325)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new MutableTransitionState(Boolean.FALSE);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableTransitionState mutableTransitionState2 = (MutableTransitionState) rememberedValue;
            mutableTransitionState2.setTargetState$animation_core_release(this.f20387h.getValue());
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(companion3, bk.b.K(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m235backgroundbw27NRU$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (z11) {
                mutableTransitionState = mutableTransitionState2;
                i13 = i12;
                companion = companion3;
                startRestartGroup.startReplaceGroup(1934805747);
            } else {
                startRestartGroup.startReplaceGroup(1947031310);
                i13 = i12;
                companion = companion3;
                mutableTransitionState = mutableTransitionState2;
                TextKt.m1845Text4IGK_g("已标记" + this.f20383d.size() + "个生词", PaddingKt.m727paddingVpY3zN4(BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bk.b.K(), null, 2, null), Dp.m5115constructorimpl(16), Dp.m5115constructorimpl(6)), bk.b.D(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 3504, 0, 131056);
                startRestartGroup = startRestartGroup;
            }
            startRestartGroup.endReplaceGroup();
            Modifier.Companion companion6 = companion;
            Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, companion6, 1.0f, false, 2, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
            x00.a<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(this);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.a2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 E1;
                        E1 = NewWordsActivity.E1(NewWordsActivity.this);
                        return E1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            int i14 = (i13 >> 6) & 896;
            N1(showMenu, (x00.a) rememberedValue2, startRestartGroup, (i13 & 14) | i14);
            X1(this.f20384e, z11, startRestartGroup, ((i13 >> 3) & 112) | i14);
            startRestartGroup.endNode();
            if (z11) {
                startRestartGroup.startReplaceGroup(1947666128);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion6);
                x00.a<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion5.getSetModifier());
                if (showStudy.getValue().booleanValue() && !this.f20387h.getValue().booleanValue() && mutableTransitionState.isIdle()) {
                    startRestartGroup.startReplaceGroup(-1976398365);
                    String valueOf = String.valueOf(this.f20383d.size());
                    boolean changedInstance2 = startRestartGroup.changedInstance(this);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == companion2.getEmpty()) {
                        rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.examassistant.b2
                            @Override // x00.a
                            public final Object invoke() {
                                yz.g2 F1;
                                F1 = NewWordsActivity.F1(NewWordsActivity.this);
                                return F1;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    U1(valueOf, (x00.a) rememberedValue3, startRestartGroup, i14);
                } else {
                    startRestartGroup.startReplaceGroup(-1989348677);
                }
                startRestartGroup.endReplaceGroup();
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), startRestartGroup, 0);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion6);
                x00.a<ComposeUiNode> constructor4 = companion5.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion5.getSetModifier());
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion2.getEmpty()) {
                    rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.examassistant.c2
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            int G1;
                            G1 = NewWordsActivity.G1(((Integer) obj).intValue());
                            return Integer.valueOf(G1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                EnterTransition slideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (x00.l) rememberedValue4, 1, null);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == companion2.getEmpty()) {
                    rememberedValue5 = new x00.l() { // from class: com.baicizhan.main.examassistant.d2
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            int H1;
                            H1 = NewWordsActivity.H1(((Integer) obj).intValue());
                            return Integer.valueOf(H1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, (MutableTransitionState<Boolean>) mutableTransitionState, (Modifier) null, slideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(null, (x00.l) rememberedValue5, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(791260117, true, new x00.q() { // from class: com.baicizhan.main.examassistant.e2
                    @Override // x00.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        yz.g2 I1;
                        I1 = NewWordsActivity.I1(NewWordsActivity.this, tryCollect, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return I1;
                    }
                }, startRestartGroup, 54), startRestartGroup, (MutableTransitionState.$stable << 3) | 1600518, 18);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
            } else {
                startRestartGroup.startReplaceGroup(1934805747);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.f2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 J1;
                    J1 = NewWordsActivity.J1(NewWordsActivity.this, showMenu, showStudy, z11, tryCollect, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return J1;
                }
            });
        }
    }

    public final void H2(@m80.k List<MarkedWord> words, boolean z11) {
        kotlin.jvm.internal.g0.p(words, "words");
        KotlinExtKt.setKvFlagTrue(i9.f.G, this.f20390k);
        ArrayList<MarkedWord> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(words);
        if (this.f20390k && this.f20391l == -1) {
            if (arrayList.size() > 1) {
                a00.l0.r0(arrayList, new l());
            }
        } else if (arrayList.size() > 1) {
            a00.l0.r0(arrayList, new m());
        }
        String str = " ";
        for (MarkedWord markedWord : arrayList) {
            String dateString = TimeUtil.getDateString(new Date(markedWord.k()));
            if (!kotlin.jvm.internal.g0.g(str, dateString)) {
                kotlin.jvm.internal.g0.m(dateString);
                arrayList2.add(dateString);
                str = dateString;
            }
            Boolean bool = this.f20386g.get(Integer.valueOf(markedWord.n()));
            Boolean bool2 = Boolean.TRUE;
            if (kotlin.jvm.internal.g0.g(bool, bool2)) {
                this.f20386g.put(Integer.valueOf(markedWord.n()), bool2);
            }
            arrayList2.add(markedWord);
        }
        this.f20384e.clear();
        this.f20384e.addAll(arrayList2);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void K1(final int i11, @m80.k final String title, @m80.k final x00.a<yz.g2> onItemClick, @m80.l Composer composer, final int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(onItemClick, "onItemClick");
        Composer startRestartGroup = composer.startRestartGroup(-1698563900);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(onItemClick) ? 256 : 128;
        }
        int i14 = i13;
        if (startRestartGroup.shouldExecute((i14 & 147) != 146, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1698563900, i14, -1, "com.baicizhan.main.examassistant.NewWordsActivity.MenuItem (NewWordsActivity.kt:541)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean z11 = (i14 & 896) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.p2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 L1;
                        L1 = NewWordsActivity.L1(x00.a.this);
                        return L1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(SizeKt.wrapContentSize$default(ClickableKt.m269clickableXHw0xAI$default(companion, false, null, null, (x00.a) rememberedValue, 7, null), null, false, 3, null), 0.0f, Dp.m5115constructorimpl(12), 1, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m728paddingVpY3zN4$default);
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
            IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(i11, startRestartGroup, i14 & 14), (String) null, (Modifier) null, 0L, startRestartGroup, 48, 12);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(4)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g(title, SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(100)), bk.b.x(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, ((i14 >> 3) & 14) | 3504, 3072, 122864);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.q2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 M1;
                    M1 = NewWordsActivity.M1(NewWordsActivity.this, i11, title, onItemClick, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return M1;
                }
            });
        }
    }

    public final void L2(boolean z11) {
        this.f20390k = z11;
    }

    public final void M2(@m80.k MutableState<Boolean> mutableState) {
        kotlin.jvm.internal.g0.p(mutableState, "<set-?>");
        this.f20389j = mutableState;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void N1(@m80.k final MutableState<Boolean> show, @m80.k final x00.a<yz.g2> onCollectClick, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(show, "show");
        kotlin.jvm.internal.g0.p(onCollectClick, "onCollectClick");
        Composer startRestartGroup = composer.startRestartGroup(-1597695747);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(show) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onCollectClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1597695747, i12, -1, "com.baicizhan.main.examassistant.NewWordsActivity.MenuPop (NewWordsActivity.kt:481)");
            }
            final WindowManager.LayoutParams attributes = getWindow().getAttributes();
            if (show.getValue().booleanValue()) {
                attributes.alpha = 0.75f;
                getWindow().addFlags(2);
            } else {
                attributes.alpha = 1.0f;
                getWindow().clearFlags(2);
            }
            getWindow().setAttributes(attributes);
            Boolean value = show.getValue();
            int i13 = i12 & 14;
            boolean changedInstance = (i13 == 4) | startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new b(show, this, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(value, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            if (show.getValue().booleanValue()) {
                startRestartGroup.startReplaceGroup(-125724933);
                r2();
                N2();
                Alignment topEnd = Alignment.Companion.getTopEnd();
                long m5237constructorimpl = IntOffset.m5237constructorimpl((KotlinExtKt.getDpValue(-16) << 32) | (0 & 4294967295L));
                boolean changedInstance2 = startRestartGroup.changedInstance(attributes) | (i13 == 4) | startRestartGroup.changedInstance(this);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.e3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 O1;
                            O1 = NewWordsActivity.O1(MutableState.this, attributes, this);
                            return O1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.baicizhan.main.customview.compose.a0.o(topEnd, m5237constructorimpl, (x00.a) rememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(264235725, true, new x00.p() { // from class: com.baicizhan.main.examassistant.f3
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 P1;
                        P1 = NewWordsActivity.P1(NewWordsActivity.this, show, onCollectClick, (Composer) obj, ((Integer) obj2).intValue());
                        return P1;
                    }
                }, startRestartGroup, 54), startRestartGroup, 24582, 8);
            } else {
                startRestartGroup.startReplaceGroup(-143437403);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.g3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 T1;
                    T1 = NewWordsActivity.T1(NewWordsActivity.this, show, onCollectClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return T1;
                }
            });
        }
    }

    public final void N2() {
        if (this.f20388i.getValue().intValue() >= 0) {
            this.f20388i.setValue(-1);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void U1(@m80.k final String wordCount, @m80.k final x00.a<yz.g2> onClick, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(wordCount, "wordCount");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1649570306);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(wordCount) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1649570306, i12, -1, "com.baicizhan.main.examassistant.NewWordsActivity.StudyPanel (NewWordsActivity.kt:380)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.Companion;
            float f11 = 16;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(BackgroundKt.m235backgroundbw27NRU$default(fillMaxWidth$default, companion2.m2546getWhite0d7_KjU(), null, 2, null), Dp.m5115constructorimpl(28), Dp.m5115constructorimpl(12), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m729paddingqDBjuR0);
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
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("已添加 ");
            builder.pushStyle(new SpanStyle(bk.b.e0(), bk.d.m(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (kotlin.jvm.internal.v) null));
            builder.append(wordCount);
            builder.pop();
            builder.append(WordPlanInfoView.f22926m);
            TextKt.m1846TextIbK3jfQ(builder.toAnnotatedString(), RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), bk.b.B(), bk.d.l(), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, startRestartGroup, 3456, 0, 262128);
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(122)), Dp.m5115constructorimpl(48));
            long m2546getWhite0d7_KjU = companion2.m2546getWhite0d7_KjU();
            long e02 = bk.b.e0();
            boolean z11 = true;
            long m11 = bk.d.m();
            if ((i12 & 112) != 32) {
                z11 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.w1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 V1;
                        V1 = NewWordsActivity.V1(x00.a.this);
                        return V1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            v1(m759height3ABfNKs, "开始复习", m2546getWhite0d7_KjU, e02, m11, (x00.a) rememberedValue, startRestartGroup, ((i12 << 12) & 3670016) | 28086, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.x1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 W1;
                    W1 = NewWordsActivity.W1(NewWordsActivity.this, wordCount, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return W1;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void X1(@m80.k final SnapshotStateList<Object> orderedList, final boolean z11, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(orderedList, "orderedList");
        Composer startRestartGroup = composer.startRestartGroup(-1021331369);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(orderedList) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1021331369, i12, -1, "com.baicizhan.main.examassistant.NewWordsActivity.WordList (NewWordsActivity.kt:556)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(this);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new c(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.LaunchedEffect(mutableState, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
            boolean changedInstance2 = ((i12 & 14) == 4) | ((i12 & 112) == 32) | startRestartGroup.changedInstance(this);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.examassistant.c3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 Y1;
                        Y1 = NewWordsActivity.Y1(SnapshotStateList.this, z11, this, mutableState, (LazyListScope) obj);
                        return Y1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (x00.l) rememberedValue3, startRestartGroup, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.d3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Z1;
                    Z1 = NewWordsActivity.Z1(NewWordsActivity.this, orderedList, z11, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Z1;
                }
            });
        }
    }

    public final void k2(final MarkedWord markedWord) {
        yg.i2.C(this, false, false, 0L, new x00.l() { // from class: com.baicizhan.main.examassistant.v2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 l22;
                l22 = NewWordsActivity.l2(NewWordsActivity.this, markedWord, (yz.g2) obj);
                return l22;
            }
        }, new x00.l() { // from class: com.baicizhan.main.examassistant.w2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 m22;
                m22 = NewWordsActivity.m2((Throwable) obj);
                return m22;
            }
        }, new j(markedWord, null), 7, null);
    }

    public final void n2(boolean z11) {
        if (!z11) {
            this.f20386g.clear();
            return;
        }
        Iterator<MarkedWord> it = this.f20383d.iterator();
        while (it.hasNext()) {
            this.f20386g.put(Integer.valueOf(it.next().n()), Boolean.valueOf(z11));
        }
    }

    public final void o2(hj.m mVar) {
        if (this.f20386g.isEmpty()) {
            return;
        }
        SnapshotStateList<MarkedWord> snapshotStateList = this.f20383d;
        List J = a00.h0.J();
        for (MarkedWord markedWord : snapshotStateList) {
            if (kotlin.jvm.internal.g0.g(this.f20386g.get(Integer.valueOf(markedWord.n())), Boolean.TRUE)) {
                if (J.isEmpty()) {
                    J = new ArrayList();
                }
                kotlin.jvm.internal.g0.n(J, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                kotlin.jvm.internal.x0.g(J).add(markedWord);
            }
        }
        List<MarkedWord> list = J;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        for (MarkedWord markedWord2 : list) {
            arrayList.add(new ij.e0(markedWord2.n(), 0, markedWord2.o(), markedWord2.l(), markedWord2.m()));
        }
        mVar.m(arrayList, new hj.o() { // from class: com.baicizhan.main.examassistant.v1
            @Override // hj.o
            public final void a(Boolean bool, long[] jArr) {
                NewWordsActivity.p2(NewWordsActivity.this, bool, jArr);
            }
        });
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            if (kotlin.jvm.internal.g0.g("com.baicizhan.favoritebooks", data.getHost()) && kotlin.jvm.internal.g0.g("/markedlist", data.getPath())) {
                String queryParameter = data.getQueryParameter("paperId");
                num = queryParameter != null ? u30.e0.p1(queryParameter) : null;
            } else {
                num = 0;
            }
            if (num != null) {
                Integer num2 = num.intValue() != 0 ? num : null;
                if (num2 != null) {
                    this.f20391l = num2.intValue();
                    final int intValue = num2.intValue();
                    final boolean z11 = intValue == -1;
                    hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.examassistant.h3
                        @Override // rj.e
                        public final void a(ij.e eVar) {
                            NewWordsActivity.x2(NewWordsActivity.this, z11, intValue, eVar);
                        }
                    });
                    return;
                }
            }
        }
        va.g.i("出错啦", 0);
        finish();
    }

    public final void q2() {
        this.f20385f.clear();
        this.f20389j.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
        KotlinExtKt.setKvFlagTrue(i9.f.H, this.f20389j.getValue().booleanValue());
    }

    public final void r2() {
        this.f20387h.setValue(Boolean.FALSE);
        this.f20386g.clear();
    }

    public final boolean s2() {
        return this.f20390k;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1(@m80.k final androidx.compose.ui.Modifier r26, @m80.k final java.lang.String r27, final long r28, final long r30, long r32, @m80.k final x00.a<yz.g2> r34, @m80.l androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.examassistant.NewWordsActivity.v1(androidx.compose.ui.Modifier, java.lang.String, long, long, long, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public final void v2(List<MarkedWord> list) {
        N2();
        CollectReviewActivity.v1(this, list);
        ma.l.a(ma.t.f73011j, ma.a.W4);
    }

    @m80.k
    public final MutableState<Boolean> w2() {
        return this.f20389j;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void y1(@m80.k final x00.a<yz.g2> tryCollect, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(tryCollect, "tryCollect");
        Composer startRestartGroup = composer.startRestartGroup(602813914);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changedInstance(tryCollect) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 32 : 16;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602813914, i13, -1, "com.baicizhan.main.examassistant.NewWordsActivity.CollectPanel (NewWordsActivity.kt:409)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(56)), 0.0f, 1, null);
            Color.Companion companion2 = Color.Companion;
            float f11 = 8;
            float f12 = 16;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(BackgroundKt.m235backgroundbw27NRU$default(fillMaxWidth$default, companion2.m2546getWhite0d7_KjU(), null, 2, null), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f11));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
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
            boolean z11 = this.f20386g.size() == this.f20383d.size();
            boolean changedInstance = startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.examassistant.x2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 z12;
                        z12 = NewWordsActivity.z1(NewWordsActivity.this, ((Boolean) obj).booleanValue());
                        return z12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.baicizhan.main.customview.compose.a0.l(null, R.drawable.ic_word_book_checked, R.drawable.ic_word_book_unchecked, z11, (x00.l) rememberedValue, startRestartGroup, 432, 1);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(4)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g("全选", RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), bk.b.B(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 3462, 0, 131056);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(f12)), startRestartGroup, 6);
            float f13 = 88;
            float f14 = 40;
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(f13)), Dp.m5115constructorimpl(f14));
            long x11 = bk.b.x();
            long H = bk.b.H();
            boolean changedInstance2 = startRestartGroup.changedInstance(this);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.y2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A1;
                        A1 = NewWordsActivity.A1(NewWordsActivity.this);
                        return A1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            int i14 = (i13 << 15) & 3670016;
            v1(m759height3ABfNKs, "取消", x11, H, 0L, (x00.a) rememberedValue2, startRestartGroup, i14 | 3510, 16);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            Modifier m759height3ABfNKs2 = SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(f13)), Dp.m5115constructorimpl(f14));
            long m2546getWhite0d7_KjU = companion2.m2546getWhite0d7_KjU();
            long e02 = this.f20386g.size() > 0 ? bk.b.e0() : bk.b.n0();
            boolean z12 = (i13 & 14) == 4;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.examassistant.z2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 B1;
                        B1 = NewWordsActivity.B1(x00.a.this);
                        return B1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            v1(m759height3ABfNKs2, "收藏", m2546getWhite0d7_KjU, e02, 0L, (x00.a) rememberedValue3, startRestartGroup, i14 | 438, 16);
            composer2 = startRestartGroup;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.a3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 C1;
                    C1 = NewWordsActivity.C1(NewWordsActivity.this, tryCollect, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C1;
                }
            });
        }
    }

    public static final int G1(int i11) {
        return i11;
    }

    public static final int H1(int i11) {
        return i11;
    }
}
