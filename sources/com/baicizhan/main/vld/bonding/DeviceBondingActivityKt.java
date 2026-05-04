package com.baicizhan.main.vld.bonding;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import android.view.View;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.DividerKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.vld.bonding.DeviceBondingActivityKt;
import com.baicizhan.main.vld.model.WifiFreqType;
import com.baicizhan.platform.base.widget.q3;
import com.baicizhan.platform.base.widget.s4;
import com.jiongji.andriod.card.R;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collection;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeviceBondingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingActivityKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 16 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 17 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,1103:1\n1#2:1104\n75#3:1105\n75#3:1118\n75#3:1395\n1247#4,6:1106\n1247#4,6:1112\n1247#4,6:1119\n1247#4,3:1132\n1250#4,3:1136\n1247#4,6:1139\n1247#4,6:1267\n1247#4,6:1320\n1247#4,6:1326\n1247#4,6:1335\n1247#4,6:1346\n1247#4,6:1397\n1247#4,6:1403\n1247#4,6:1409\n1247#4,6:1415\n1247#4,6:1421\n1247#4,6:1427\n1247#4,6:1433\n1247#4,6:1448\n1247#4,6:1456\n1247#4,6:1562\n1247#4,6:1570\n557#5:1125\n554#5,6:1126\n555#6:1135\n87#7:1145\n83#7,10:1146\n87#7:1273\n84#7,9:1274\n94#7:1315\n94#7:1345\n87#7:1476\n84#7,9:1477\n94#7:1580\n79#8,6:1156\n86#8,3:1171\n89#8,2:1180\n79#8,6:1194\n86#8,3:1209\n89#8,2:1218\n93#8:1225\n79#8,6:1239\n86#8,3:1254\n89#8,2:1263\n79#8,6:1283\n86#8,3:1298\n89#8,2:1307\n93#8:1314\n93#8:1318\n93#8:1344\n79#8,6:1363\n86#8,3:1378\n89#8,2:1387\n93#8:1393\n79#8,6:1486\n86#8,3:1501\n89#8,2:1510\n79#8,6:1523\n86#8,3:1538\n89#8,2:1547\n93#8:1553\n93#8:1579\n347#9,9:1162\n356#9:1182\n347#9,9:1200\n356#9:1220\n357#9,2:1223\n347#9,9:1245\n356#9:1265\n347#9,9:1289\n356#9:1309\n357#9,2:1312\n357#9,2:1316\n357#9,2:1342\n347#9,9:1369\n356#9:1389\n357#9,2:1391\n347#9,9:1492\n356#9:1512\n347#9,9:1529\n356#9:1549\n357#9,2:1551\n357#9,2:1577\n4206#10,6:1174\n4206#10,6:1212\n4206#10,6:1257\n4206#10,6:1301\n4206#10,6:1381\n4206#10,6:1504\n4206#10,6:1541\n70#11:1183\n66#11,10:1184\n77#11:1226\n70#11:1229\n67#11,9:1230\n77#11:1319\n113#12:1221\n113#12:1222\n113#12:1227\n113#12:1228\n113#12:1266\n113#12:1310\n113#12:1311\n113#12:1332\n113#12:1333\n113#12:1334\n113#12:1341\n113#12:1352\n113#12:1390\n113#12:1396\n113#12:1446\n113#12:1447\n113#12:1454\n113#12:1455\n113#12:1475\n113#12:1550\n113#12:1555\n113#12:1556\n113#12:1557\n113#12:1558\n113#12:1559\n113#12:1560\n113#12:1568\n113#12:1576\n99#13:1353\n96#13,9:1354\n106#13:1394\n99#13:1513\n96#13,9:1514\n106#13:1554\n85#14:1439\n1761#15,3:1440\n1761#15,3:1443\n168#16,13:1462\n1565#17:1561\n1565#17:1569\n*S KotlinDebug\n*F\n+ 1 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingActivityKt\n*L\n637#1:1105\n641#1:1118\n930#1:1395\n638#1:1106,6\n639#1:1112,6\n642#1:1119,6\n676#1:1132,3\n676#1:1136,3\n711#1:1139,6\n775#1:1267,6\n817#1:1320,6\n818#1:1326,6\n844#1:1335,6\n906#1:1346,6\n568#1:1397,6\n570#1:1403,6\n571#1:1409,6\n611#1:1415,6\n579#1:1421,6\n589#1:1427,6\n602#1:1433,6\n750#1:1448,6\n834#1:1456,6\n1003#1:1562,6\n1016#1:1570,6\n676#1:1125\n676#1:1126,6\n676#1:1135\n739#1:1145\n739#1:1146,10\n793#1:1273\n793#1:1274,9\n793#1:1315\n739#1:1345\n939#1:1476\n939#1:1477,9\n939#1:1580\n739#1:1156,6\n739#1:1171,3\n739#1:1180,2\n741#1:1194,6\n741#1:1209,3\n741#1:1218,2\n741#1:1225\n767#1:1239,6\n767#1:1254,3\n767#1:1263,2\n793#1:1283,6\n793#1:1298,3\n793#1:1307,2\n793#1:1314\n767#1:1318\n739#1:1344\n920#1:1363,6\n920#1:1378,3\n920#1:1387,2\n920#1:1393\n939#1:1486,6\n939#1:1501,3\n939#1:1510,2\n945#1:1523,6\n945#1:1538,3\n945#1:1547,2\n945#1:1553\n939#1:1579\n739#1:1162,9\n739#1:1182\n741#1:1200,9\n741#1:1220\n741#1:1223,2\n767#1:1245,9\n767#1:1265\n793#1:1289,9\n793#1:1309\n793#1:1312,2\n767#1:1316,2\n739#1:1342,2\n920#1:1369,9\n920#1:1389\n920#1:1391,2\n939#1:1492,9\n939#1:1512\n945#1:1529,9\n945#1:1549\n945#1:1551,2\n939#1:1577,2\n739#1:1174,6\n741#1:1212,6\n767#1:1257,6\n793#1:1301,6\n920#1:1381,6\n939#1:1504,6\n945#1:1541,6\n741#1:1183\n741#1:1184,10\n741#1:1226\n767#1:1229\n767#1:1230,9\n767#1:1319\n746#1:1221\n760#1:1222\n770#1:1227\n772#1:1228\n775#1:1266\n807#1:1310\n810#1:1311\n823#1:1332\n842#1:1333\n849#1:1334\n855#1:1341\n920#1:1352\n922#1:1390\n933#1:1396\n751#1:1446\n752#1:1447\n832#1:1454\n833#1:1455\n943#1:1475\n958#1:1550\n965#1:1555\n972#1:1556\n975#1:1557\n982#1:1558\n986#1:1559\n995#1:1560\n1009#1:1568\n1021#1:1576\n920#1:1353\n920#1:1354,9\n920#1:1394\n945#1:1513\n945#1:1514,9\n945#1:1554\n640#1:1439\n649#1:1440,3\n656#1:1443,3\n907#1:1462,13\n997#1:1561\n1011#1:1569\n*E\n"})
/* loaded from: classes4.dex */
public final class DeviceBondingActivityKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f25226a = "vld_info";

    /* renamed from: b, reason: collision with root package name */
    public static final long f25227b = 8000;

    /* renamed from: c, reason: collision with root package name */
    public static final long f25228c = 3000;

    /* renamed from: d, reason: collision with root package name */
    public static final long f25229d = 3000;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f25230e = "DeviceBondingActivity";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$BondingContent$1$2$2$1$1", f = "DeviceBondingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25231a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Boolean f25232b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool, int i11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f25232b = bool;
            this.f25233c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f25232b, this.f25233c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25231a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            ma.l.b(ma.t.f73012k, ma.a.N4, ma.u.d(new String[]{ma.b.f72962y1, ma.b.f72959x1}, new Object[]{l00.a.f(this.f25232b.booleanValue() ? 1 : 2), l00.a.f(this.f25233c == 0 ? 1 : 2)}, false, 4, null));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$BondingContent$1$2$3$1", f = "DeviceBondingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25234a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f25235b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BTStatus f25236c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f25237d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25238a;

            static {
                int[] iArr = new int[BTStatus.values().length];
                try {
                    iArr[BTStatus.DONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BTStatus.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BTStatus.CONFIGURE_FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BTStatus.CONFIGURE_TIMEOUT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BTStatus.CONFIGURE_SUCCEEDED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f25238a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableState<Boolean> mutableState, BTStatus bTStatus, int i11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f25235b = mutableState;
            this.f25236c = bTStatus;
            this.f25237d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f25235b, this.f25236c, this.f25237d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25234a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f25235b.getValue() == null) {
                MutableState<Boolean> mutableState = this.f25235b;
                int i11 = a.f25238a[this.f25236c.ordinal()];
                boolean z11 = true;
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3 || i11 == 4) {
                        z11 = false;
                    } else {
                        if (i11 != 5) {
                            return yz.g2.f100423a;
                        }
                        if (this.f25237d != 1) {
                            return yz.g2.f100423a;
                        }
                    }
                }
                mutableState.setValue(l00.a.a(z11));
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25239a;

        static {
            int[] iArr = new int[WifiFreqType.values().length];
            try {
                iArr[WifiFreqType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WifiFreqType.TYPE_5G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WifiFreqType.TYPE_24G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WifiFreqType.TYPE_24G_5G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25239a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$WifiConfiguration$3$1", f = "DeviceBondingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25240a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f25241b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f25242c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z11, x00.a<yz.g2> aVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f25241b = z11;
            this.f25242c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f25241b, this.f25242c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25240a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f25241b) {
                this.f25242c.invoke();
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$WifiConfiguration$4$1", f = "DeviceBondingActivity.kt", i = {}, l = {712}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25243a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ um.b f25244b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f25245c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f25246d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q3 f25247e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(um.b bVar, Context context, c40.r0 r0Var, q3 q3Var, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f25244b = bVar;
            this.f25245c = context;
            this.f25246d = r0Var;
            this.f25247e = q3Var;
        }

        public static final yz.g2 k(Context context, View view) {
            ((FragmentActivity) context).finish();
            return yz.g2.f100423a;
        }

        public static final yz.g2 m(um.b bVar, c40.r0 r0Var, q3 q3Var, View view) {
            DeviceBondingActivityKt.p0(bVar, r0Var, q3Var);
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f25244b, this.f25245c, this.f25246d, this.f25247e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Type inference failed for: r11v18, types: [kc.d, kc.h] */
        /* JADX WARN: Type inference failed for: r4v1, types: [kc.d$a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25243a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f25243a = 1;
                if (c40.a1.b(350L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            if (this.f25244b.a()) {
                Pair g02 = DeviceBondingActivityKt.g0(this.f25244b);
                boolean booleanValue = ((Boolean) g02.component1()).booleanValue();
                boolean booleanValue2 = ((Boolean) g02.component2()).booleanValue();
                Context context = this.f25245c;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null) {
                    u.a V = new u.a(context).V("请打开" + DeviceBondingActivityKt.f0(booleanValue, booleanValue2) + "以保证\n该功能正常使用");
                    final Context context2 = this.f25245c;
                    ?? o11 = V.o(R.string.dialog_permission_cancel, new x00.l() { // from class: com.baicizhan.main.vld.bonding.y1
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            yz.g2 k11;
                            k11 = DeviceBondingActivityKt.e.k(context2, (View) obj2);
                            return k11;
                        }
                    });
                    final um.b bVar = this.f25244b;
                    final c40.r0 r0Var = this.f25246d;
                    final q3 q3Var = this.f25247e;
                    mc.a.p(fragmentActivity, ((u.a) d.a.I(o11, R.string.dialog_permission_confirm, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.z1
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            yz.g2 m11;
                            m11 = DeviceBondingActivityKt.e.m(um.b.this, r0Var, q3Var, (View) obj2);
                            return m11;
                        }
                    }, 2, null)).d(), null, 2, null);
                }
            } else {
                DeviceBondingActivityKt.p0(this.f25244b, this.f25246d, this.f25247e);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$WifiConfiguration$dismissPermissionTip$1", f = "DeviceBondingActivity.kt", i = {}, l = {679}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25248a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q3 f25249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q3 q3Var, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f25249b = q3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f25249b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25248a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                q3 q3Var = this.f25249b;
                this.f25248a = 1;
                if (q3Var.a(this) == l11) {
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
    @l00.d(c = "com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$WifiConfiguration$requestPermissions$1", f = "DeviceBondingActivity.kt", i = {1, 1, 1}, l = {700, TypedValues.TransitionType.TYPE_AUTO_TRANSITION}, m = "invokeSuspend", n = {SocialConstants.PARAM_APP_DESC, "bt", "loc"}, s = {"L$0", "Z$0", "Z$1"}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f25250a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f25251b;

        /* renamed from: c, reason: collision with root package name */
        public Object f25252c;

        /* renamed from: d, reason: collision with root package name */
        public int f25253d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ um.b f25254e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q3 f25255f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(um.b bVar, q3 q3Var, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f25254e = bVar;
            this.f25255f = q3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f25254e, this.f25255f, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
        
            if (r4.e(r5, r6, r8) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        
            if (c40.a1.b(200, r8) == r0) goto L17;
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
                int r1 = r8.f25253d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f25252c
                java.lang.String r0 = (java.lang.String) r0
                kotlin.e.n(r9)
                goto L8e
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                kotlin.e.n(r9)
                goto L31
            L23:
                kotlin.e.n(r9)
                r8.f25253d = r3
                r3 = 200(0xc8, double:9.9E-322)
                java.lang.Object r9 = c40.a1.b(r3, r8)
                if (r9 != r0) goto L31
                goto L8d
            L31:
                um.b r9 = r8.f25254e
                boolean r9 = r9.b()
                if (r9 != 0) goto L8e
                um.b r9 = r8.f25254e
                kotlin.Pair r9 = com.baicizhan.main.vld.bonding.DeviceBondingActivityKt.C0(r9)
                java.lang.Object r1 = r9.component1()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                java.lang.Object r9 = r9.component2()
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                java.lang.String r3 = com.baicizhan.main.vld.bonding.DeviceBondingActivityKt.B0(r1, r9)
                com.baicizhan.platform.base.widget.q3 r4 = r8.f25255f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "百词斩请求"
                r5.append(r6)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "为实现绑定智能设备及数据传输功能，我们将申请您的"
                r6.append(r7)
                r6.append(r3)
                java.lang.String r6 = r6.toString()
                java.lang.Object r3 = l00.k.a(r3)
                r8.f25252c = r3
                r8.f25250a = r1
                r8.f25251b = r9
                r8.f25253d = r2
                java.lang.Object r9 = r4.e(r5, r6, r8)
                if (r9 != r0) goto L8e
            L8d:
                return r0
            L8e:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<ki.l, yz.g2> f25256a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ki.l f25257b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(x00.l<? super ki.l, yz.g2> lVar, ki.l lVar2) {
            this.f25256a = lVar;
            this.f25257b = lVar2;
        }

        public final void a() {
            this.f25256a.invoke(this.f25257b);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void D(final um.b bVar, final q3 q3Var, final int i11, final BTStatus bTStatus, final boolean z11, final List<ki.l> list, final List<ki.a> list2, final x00.a<yz.g2> aVar, final x00.p<? super String, ? super String, yz.g2> pVar, final x00.a<yz.g2> aVar2, final x00.a<yz.g2> aVar3, Composer composer, final int i12, final int i13) {
        int i14;
        int i15;
        boolean z12;
        List<ki.l> list3;
        List<ki.a> list4;
        x00.a<yz.g2> aVar4;
        x00.p<? super String, ? super String, yz.g2> pVar2;
        final x00.a<yz.g2> aVar5;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-1662791963);
        if ((i12 & 6) == 0) {
            i14 = (startRestartGroup.changed(bVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= startRestartGroup.changedInstance(q3Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 = i11;
            i14 |= startRestartGroup.changed(i15) ? 256 : 128;
        } else {
            i15 = i11;
        }
        if ((i12 & 3072) == 0) {
            i14 |= startRestartGroup.changed(bTStatus.ordinal()) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            z12 = z11;
            i14 |= startRestartGroup.changed(z12) ? 16384 : 8192;
        } else {
            z12 = z11;
        }
        if ((196608 & i12) == 0) {
            list3 = list;
            i14 |= startRestartGroup.changedInstance(list3) ? 131072 : 65536;
        } else {
            list3 = list;
        }
        if ((1572864 & i12) == 0) {
            list4 = list2;
            i14 |= startRestartGroup.changedInstance(list4) ? 1048576 : 524288;
        } else {
            list4 = list2;
        }
        if ((12582912 & i12) == 0) {
            aVar4 = aVar;
            i14 |= startRestartGroup.changedInstance(aVar4) ? 8388608 : 4194304;
        } else {
            aVar4 = aVar;
        }
        if ((100663296 & i12) == 0) {
            pVar2 = pVar;
            i14 |= startRestartGroup.changedInstance(pVar2) ? 67108864 : 33554432;
        } else {
            pVar2 = pVar;
        }
        if ((805306368 & i12) == 0) {
            i14 |= startRestartGroup.changedInstance(aVar2) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            aVar5 = aVar3;
            i16 = i13 | (startRestartGroup.changedInstance(aVar5) ? 4 : 2);
        } else {
            aVar5 = aVar3;
            i16 = i13;
        }
        if (startRestartGroup.shouldExecute(((i14 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1662791963, i14, i16, "com.baicizhan.main.vld.bonding.BondingContent (DeviceBondingActivity.kt:563)");
            }
            final int i17 = i15;
            final boolean z13 = z12;
            final List<ki.l> list5 = list3;
            final List<ki.a> list6 = list4;
            final x00.a<yz.g2> aVar6 = aVar4;
            final x00.p<? super String, ? super String, yz.g2> pVar3 = pVar2;
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-863073391, true, new x00.p() { // from class: com.baicizhan.main.vld.bonding.y0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E;
                    E = DeviceBondingActivityKt.E(q3.this, aVar5, bTStatus, i17, bVar, z13, list5, aVar6, pVar3, list6, aVar2, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.z0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 M;
                    M = DeviceBondingActivityKt.M(um.b.this, q3Var, i11, bTStatus, z11, list, list2, aVar, pVar, aVar2, aVar3, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return M;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 E(final q3 q3Var, final x00.a aVar, final BTStatus bTStatus, final int i11, final um.b bVar, final boolean z11, final List list, final x00.a aVar2, final x00.p pVar, final List list2, final x00.a aVar3, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-863073391, i12, -1, "com.baicizhan.main.vld.bonding.BondingContent.<anonymous> (DeviceBondingActivity.kt:565)");
            }
            s4.B(null, null, q3Var, ComposableLambdaKt.rememberComposableLambda(-1097755910, true, new x00.p() { // from class: com.baicizhan.main.vld.bonding.i1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 F;
                    F = DeviceBondingActivityKt.F(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return F;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1280739838, true, new x00.q() { // from class: com.baicizhan.main.vld.bonding.j1
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 H;
                    H = DeviceBondingActivityKt.H(BTStatus.this, i11, bVar, q3Var, z11, list, aVar2, pVar, list2, aVar3, aVar, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return H;
                }
            }, composer, 54), composer, 3072, 12582912, 131059);
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
    public static final yz.g2 F(final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1097755910, i11, -1, "com.baicizhan.main.vld.bonding.BondingContent.<anonymous>.<anonymous> (DeviceBondingActivity.kt:567)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.devices_management_add_title, composer, 6);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.u1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 G;
                        G = DeviceBondingActivityKt.G(x00.a.this);
                        return G;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, stringResource, null, null, composer, 0, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 G(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 H(final BTStatus bTStatus, final int i11, final um.b bVar, final q3 q3Var, final boolean z11, final List list, final x00.a aVar, final x00.p pVar, final List list2, final x00.a aVar2, final x00.a aVar3, PaddingValues it, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i12 & 17) != 16, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1280739838, i12, -1, "com.baicizhan.main.vld.bonding.BondingContent.<anonymous>.<anonymous> (DeviceBondingActivity.kt:569)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object value = mutableState.getValue();
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.vld.bonding.f1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        ContentTransform I;
                        I = DeviceBondingActivityKt.I((AnimatedContentTransitionScope) obj);
                        return I;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            AnimatedContentKt.AnimatedContent(value, null, (x00.l) rememberedValue2, null, null, null, ComposableLambdaKt.rememberComposableLambda(-912916961, true, new x00.r() { // from class: com.baicizhan.main.vld.bonding.q1
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yz.g2 J;
                    J = DeviceBondingActivityKt.J(um.b.this, q3Var, bTStatus, z11, list, aVar, pVar, i11, list2, aVar2, aVar3, (AnimatedContentScope) obj, (Boolean) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return J;
                }
            }, composer, 54), composer, 1573248, 58);
            boolean changed = composer.changed(bTStatus.ordinal()) | composer.changed(i11);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new b(mutableState, bTStatus, i11, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.LaunchedEffect(bTStatus, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final ContentTransform I(AnimatedContentTransitionScope AnimatedContent) {
        kotlin.jvm.internal.g0.p(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(150, 50, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m77scaleInL8ZKhE$default(AnimationSpecKt.tween$default(150, 90, null, 4, null), 0.95f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(50, 0, null, 6, null), 0.0f, 2, null));
    }

    public static final String I0(ki.l lVar) {
        String str;
        int i11 = c.f25239a[lVar.h().ordinal()];
        if (i11 == 1) {
            str = null;
        } else if (i11 == 2) {
            str = "(5G)";
        } else if (i11 == 3) {
            str = "(2.4G)";
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "(2.4G/5G)";
        }
        if (str == null) {
            return "";
        }
        String str2 = lVar.g() + str;
        return str2 != null ? str2 : "";
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 J(um.b bVar, q3 q3Var, BTStatus bTStatus, boolean z11, List list, x00.a aVar, x00.p pVar, int i11, List list2, final x00.a aVar2, final x00.a aVar3, AnimatedContentScope AnimatedContent, Boolean bool, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-912916961, i12, -1, "com.baicizhan.main.vld.bonding.BondingContent.<anonymous>.<anonymous>.<anonymous> (DeviceBondingActivity.kt:575)");
        }
        if (bool == null) {
            composer.startReplaceGroup(-976228716);
            a0(bVar, q3Var, bTStatus, z11, list, aVar, pVar, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-976040019);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.w1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 K;
                        K = DeviceBondingActivityKt.K(x00.a.this);
                        return K;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar4 = (x00.a) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.vld.bonding.x1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 L;
                        L = DeviceBondingActivityKt.L(x00.a.this);
                        return L;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            P(i11, list2, bool.booleanValue(), bool.booleanValue() ? aVar4 : (x00.a) rememberedValue2, composer, (i12 << 3) & 896, 0);
            boolean changed = ((((i12 & 112) ^ 48) > 32 && composer.changed(bool)) || (i12 & 48) == 32) | composer.changed(i11);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new a(bool, i11, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.LaunchedEffect("", (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue3, composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final WifiFreqType J0(WifiFreqType wifiFreqType, int i11) {
        int i12 = wifiFreqType == null ? -1 : c.f25239a[wifiFreqType.ordinal()];
        if (i12 == -1 || i12 == 1) {
            return L0(i11) ? WifiFreqType.TYPE_5G : K0(i11) ? WifiFreqType.TYPE_24G : WifiFreqType.UNKNOWN;
        }
        if (i12 == 2) {
            return K0(i11) ? WifiFreqType.TYPE_24G_5G : wifiFreqType;
        }
        if (i12 == 3) {
            return L0(i11) ? WifiFreqType.TYPE_24G_5G : wifiFreqType;
        }
        if (i12 == 4) {
            return wifiFreqType;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final yz.g2 K(x00.a aVar) {
        aVar.invoke();
        ma.l.b(ma.t.f73012k, ma.a.O4, ma.u.a(ma.b.f72965z1, 1));
        return yz.g2.f100423a;
    }

    public static final boolean K0(int i11) {
        return 2400 <= i11 && i11 < 2701;
    }

    public static final yz.g2 L(x00.a aVar) {
        aVar.invoke();
        ma.l.b(ma.t.f73012k, ma.a.O4, ma.u.a(ma.b.f72965z1, 2));
        return yz.g2.f100423a;
    }

    public static final boolean L0(int i11) {
        return 5000 <= i11 && i11 < 6001;
    }

    public static final yz.g2 M(um.b bVar, q3 q3Var, int i11, BTStatus bTStatus, boolean z11, List list, List list2, x00.a aVar, x00.p pVar, x00.a aVar2, x00.a aVar3, int i12, int i13, Composer composer, int i14) {
        D(bVar, q3Var, i11, bTStatus, z11, list, list2, aVar, pVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean M0(android.content.Context r5, android.location.LocationManager r6, android.content.Intent r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 1
            java.lang.String r3 = "DeviceBondingActivity"
            r4 = 0
            if (r0 < r1) goto L5b
            r5 = 0
            if (r7 == 0) goto L18
            java.lang.String r0 = "android.location.extra.LOCATION_ENABLED"
            boolean r7 = r7.getBooleanExtra(r0, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L19
        L18:
            r7 = r5
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enabled R: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            qb.c.b(r3, r0, r1)
            if (r7 == 0) goto L32
            r5 = r7
        L32:
            if (r5 == 0) goto L39
            boolean r5 = r5.booleanValue()
            goto L3a
        L39:
            r5 = r4
        L3a:
            if (r5 != 0) goto L5a
            boolean r5 = com.baicizhan.main.vld.bonding.u0.a(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "enabled R 2: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            qb.c.b(r3, r6, r7)
            if (r5 == 0) goto L59
            goto L5a
        L59:
            return r4
        L5a:
            return r2
        L5b:
            r7 = 28
            if (r0 < r7) goto L7a
            boolean r5 = com.baicizhan.main.vld.bonding.u0.a(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "enabled: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            qb.c.b(r3, r6, r7)
            return r5
        L7a:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "location_mode"
            int r5 = android.provider.Settings.Secure.getInt(r5, r6)     // Catch: java.lang.Exception -> L9b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99
            r6.<init>()     // Catch: java.lang.Exception -> L99
            java.lang.String r7 = "location setting: "
            r6.append(r7)     // Catch: java.lang.Exception -> L99
            r6.append(r5)     // Catch: java.lang.Exception -> L99
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L99
            android.util.Log.d(r3, r6)     // Catch: java.lang.Exception -> L99
            goto La8
        L99:
            r6 = move-exception
            goto L9d
        L9b:
            r6 = move-exception
            r5 = r4
        L9d:
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto La5
            java.lang.String r6 = ""
        La5:
            android.util.Log.e(r3, r6)
        La8:
            if (r5 == 0) goto Lab
            goto Lac
        Lab:
            r2 = r4
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt.M0(android.content.Context, android.location.LocationManager, android.content.Intent):boolean");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void N(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1638116600);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1638116600, i11, -1, "com.baicizhan.main.vld.bonding.BoundFailurePreview (DeviceBondingActivity.kt:1064)");
            }
            bk.k.e(null, null, null, t.f25476a.m(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.m1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = DeviceBondingActivityKt.O(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    public static /* synthetic */ boolean N0(Context context, LocationManager locationManager, Intent intent, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            intent = null;
        }
        return M0(context, locationManager, intent);
    }

    public static final yz.g2 O(int i11, Composer composer, int i12) {
        N(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(int r16, java.util.List<ki.a> r17, final boolean r18, final x00.a<yz.g2> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt.P(int, java.util.List, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0570  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 Q(int r70, boolean r71, java.lang.String r72, java.lang.String r73, final android.content.Context r74, androidx.compose.runtime.Composer r75, int r76) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt.Q(int, boolean, java.lang.String, java.lang.String, android.content.Context, androidx.compose.runtime.Composer, int):yz.g2");
    }

    public static final yz.g2 R(AnnotatedString annotatedString, Context context, int i11) {
        AnnotatedString.Range range = (AnnotatedString.Range) a00.r0.L2(annotatedString.getStringAnnotations(y9.b.f99687c, i11, i11));
        if (range != null) {
            BczWebExecutorKt.startNormalWeb$default(context, (String) range.getItem(), null, false, 0, null, 60, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(AnnotatedString annotatedString, Context context, int i11) {
        AnnotatedString.Range range = (AnnotatedString.Range) a00.r0.L2(annotatedString.getStringAnnotations(y9.b.f99687c, i11, i11));
        if (range != null) {
            BczWebExecutorKt.startNormalWeb$default(context, (String) range.getItem(), null, false, 0, null, 60, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(int i11, List list, boolean z11, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        P(i11, list, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void U(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-899394411);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-899394411, i11, -1, "com.baicizhan.main.vld.bonding.BoundSuccessPicPreview (DeviceBondingActivity.kt:1046)");
            }
            bk.k.e(null, null, null, t.f25476a.l(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.o1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 V;
                    V = DeviceBondingActivityKt.V(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return V;
                }
            });
        }
    }

    public static final yz.g2 V(int i11, Composer composer, int i12) {
        U(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void W(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(34548657);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(34548657, i11, -1, "com.baicizhan.main.vld.bonding.BoundSuccessPreview (DeviceBondingActivity.kt:1029)");
            }
            bk.k.e(null, null, null, t.f25476a.j(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.v1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 X;
                    X = DeviceBondingActivityKt.X(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return X;
                }
            });
        }
    }

    public static final yz.g2 X(int i11, Composer composer, int i12) {
        W(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Y(String str, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        final String str2 = str;
        Composer startRestartGroup = composer.startRestartGroup(1192396721);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192396721, i12, -1, "com.baicizhan.main.vld.bonding.SuccessTip (DeviceBondingActivity.kt:918)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(8), 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m728paddingVpY3zN4$default);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_checked_stroke, startRestartGroup, 6), "checked_step", rowScopeInstance.align(companion, companion2.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(4)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            str2 = str;
            TextKt.m1845Text4IGK_g(str2, rowScopeInstance.align(companion, companion2.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBody1(), composer2, i12 & 14, 0, 65532);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.n1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Z;
                    Z = DeviceBondingActivityKt.Z(str2, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Z;
                }
            });
        }
    }

    public static final yz.g2 Z(String str, int i11, Composer composer, int i12) {
        Y(str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    public static final void a0(um.b r49, com.baicizhan.platform.base.widget.q3 r50, com.baicizhan.main.vld.bonding.BTStatus r51, boolean r52, java.util.List<ki.l> r53, x00.a<yz.g2> r54, x00.p<? super java.lang.String, ? super java.lang.String, yz.g2> r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 2149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt.a0(um.b, com.baicizhan.platform.base.widget.q3, com.baicizhan.main.vld.bonding.BTStatus, boolean, java.util.List, x00.a, x00.p, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [kc.d, kc.h] */
    public static final void b0(final Context context, boolean z11, boolean z12) {
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            mc.a.n(fragmentActivity, ((u.a) d.a.J(new u.a(context).V("请打开" + f0(z11, z12) + "后重试").b0(ButtonType.SINGLE_POSITIVE), null, null, new x00.l() { // from class: com.baicizhan.main.vld.bonding.v0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 c02;
                    c02 = DeviceBondingActivityKt.c0(context, (View) obj);
                    return c02;
                }
            }, 3, null)).d(), z11 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + z12);
        }
    }

    public static final yz.g2 c0(Context context, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        ((FragmentActivity) context).finish();
        return yz.g2.f100423a;
    }

    public static final void d0(Context context, c40.r0 r0Var, q3 q3Var) {
        boolean z11 = context instanceof FragmentActivity;
        FragmentActivity fragmentActivity = z11 ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            mc.a.b(fragmentActivity, "true-false");
        }
        FragmentActivity fragmentActivity2 = z11 ? (FragmentActivity) context : null;
        if (fragmentActivity2 != null) {
            mc.a.b(fragmentActivity2, "false-false");
        }
        FragmentActivity fragmentActivity3 = z11 ? (FragmentActivity) context : null;
        if (fragmentActivity3 != null) {
            mc.a.b(fragmentActivity3, "false-true");
        }
        e0(r0Var, q3Var);
    }

    public static final void e0(c40.r0 r0Var, q3 q3Var) {
        c40.k.f(r0Var, null, null, new f(q3Var, null), 3, null);
    }

    public static final String f0(boolean z11, boolean z12) {
        return (z11 ? "蓝牙" : "") + ((z11 && z12) ? "和" : "") + (z12 ? Build.VERSION.SDK_INT >= 31 ? "精确定位" : "定位" : "") + "权限";
    }

    public static final Pair<Boolean, Boolean> g0(um.b bVar) {
        boolean z11;
        List<um.h> c11 = bVar.c();
        boolean z12 = true;
        if (!(c11 instanceof Collection) || !c11.isEmpty()) {
            for (um.h hVar : c11) {
                if (Build.VERSION.SDK_INT >= 31 && (kotlin.jvm.internal.g0.g(hVar.e(), "android.permission.BLUETOOTH_CONNECT") || kotlin.jvm.internal.g0.g(hVar.e(), "android.permission.BLUETOOTH_SCAN"))) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        Boolean valueOf = Boolean.valueOf(z11);
        List<um.h> c12 = bVar.c();
        if (!(c12 instanceof Collection) || !c12.isEmpty()) {
            for (um.h hVar2 : c12) {
                if (kotlin.jvm.internal.g0.g(hVar2.e(), "android.permission.ACCESS_FINE_LOCATION") || kotlin.jvm.internal.g0.g(hVar2.e(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    break;
                }
            }
        }
        z12 = false;
        return new Pair<>(valueOf, Boolean.valueOf(z12));
    }

    public static final float h0(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i0(final boolean z11, final FocusManager focusManager, final x00.l lVar, State state, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-374875254, i11, -1, "com.baicizhan.main.vld.bonding.WifiConfiguration.<anonymous>.<anonymous>.<anonymous> (DeviceBondingActivity.kt:748)");
            }
            Modifier rotate = RotateKt.rotate(SizeKt.m773size3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(Modifier.Companion, Dp.m5115constructorimpl(4), 0.0f, 2, null), Dp.m5115constructorimpl(48)), h0(state));
            boolean changed = composer.changed(z11) | composer.changedInstance(focusManager) | composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.r1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 j02;
                        j02 = DeviceBondingActivityKt.j0(z11, focusManager, lVar);
                        return j02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.baicizhan.platform.base.widget.r.w(rotate, (x00.a) rememberedValue, R.drawable.ic_common_expanded_arrow, null, false, null, null, composer, 384, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 j0(boolean z11, FocusManager focusManager, x00.l lVar) {
        q0(z11, focusManager, lVar);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [kc.d, kc.h] */
    public static final yz.g2 k0(Context context, x00.l lVar, x00.l lVar2, ki.l it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it.h() == WifiFreqType.TYPE_5G) {
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity != null) {
                mc.a.p(fragmentActivity, ((u.a) ((u.a) d.a.I(new u.a(context).L(R.string.devices_bonding_wifi_5G_title).S(R.layout.dialog_wifi_tips_prompt).U(R.string.devices_bonding_wifi_5G_content).b0(ButtonType.SINGLE_POSITIVE), R.string.devices_bonding_wifi_5G_confirm, null, null, 6, null)).f(true)).d(), null, 2, null);
            }
        } else {
            lVar.invoke(it.g());
            lVar2.invoke(Boolean.FALSE);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 l0(final boolean z11, final x00.l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1477432360, i11, -1, "com.baicizhan.main.vld.bonding.WifiConfiguration.<anonymous>.<anonymous> (DeviceBondingActivity.kt:826)");
            }
            Painter painterResource = PainterResources_androidKt.painterResource(z11 ? R.drawable.ic_input_password_visible : R.drawable.ic_input_password_invisible, composer, 0);
            ContentScale inside = ContentScale.Companion.getInside();
            Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(4)), Dp.m5115constructorimpl(48));
            MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
            boolean changed = composer.changed(lVar) | composer.changed(z11);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.g1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 m02;
                        m02 = DeviceBondingActivityKt.m0(x00.l.this, z11);
                        return m02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(painterResource, "password-handle", ClickableKt.m267clickableO2vRcR0$default(m773size3ABfNKs, MutableInteractionSource, null, false, null, null, (x00.a) rememberedValue, 28, null), (Alignment) null, inside, 0.0f, (ColorFilter) null, composer, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 m0(x00.l lVar, boolean z11) {
        lVar.invoke(Boolean.valueOf(!z11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 n0(x00.p pVar, String str, String str2) {
        pVar.invoke(str, str2);
        return yz.g2.f100423a;
    }

    public static final yz.g2 o0(um.b bVar, q3 q3Var, BTStatus bTStatus, boolean z11, List list, x00.a aVar, x00.p pVar, int i11, Composer composer, int i12) {
        a0(bVar, q3Var, bTStatus, z11, list, aVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final void p0(um.b bVar, c40.r0 r0Var, q3 q3Var) {
        bVar.d();
        c40.k.f(r0Var, null, null, new g(bVar, q3Var, null), 3, null);
    }

    public static final void q0(boolean z11, FocusManager focusManager, x00.l<? super Boolean, yz.g2> lVar) {
        if (!z11) {
            FocusManager.clearFocus$default(focusManager, false, 1, null);
        }
        lVar.invoke(Boolean.valueOf(!z11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void r0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(237082705);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(237082705, i11, -1, "com.baicizhan.main.vld.bonding.WifiConfigurationPreview (DeviceBondingActivity.kt:863)");
            }
            bk.k.e(null, null, null, t.f25476a.k(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.h1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 s02;
                    s02 = DeviceBondingActivityKt.s0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return s02;
                }
            });
        }
    }

    public static final yz.g2 s0(int i11, Composer composer, int i12) {
        r0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void t0(Modifier modifier, final ki.l lVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        long m4589getColor0d7_KjU;
        Composer startRestartGroup = composer.startRestartGroup(241611012);
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
            i13 |= startRestartGroup.changed(lVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(241611012, i13, -1, "com.baicizhan.main.vld.bonding.WifiItem (DeviceBondingActivity.kt:886)");
            }
            String I0 = I0(lVar);
            int m5029getEllipsisgIe3tQ8 = TextOverflow.Companion.m5029getEllipsisgIe3tQ8();
            Modifier then = modifier4.then(SizeKt.fillMaxWidth$default(PaddingKt.m727paddingVpY3zN4(Modifier.Companion, bk.d.c(), bk.d.b()), 0.0f, 1, null));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            TextStyle h62 = materialTheme.getTypography(startRestartGroup, i15).getH6();
            FontWeight normal = FontWeight.Companion.getNormal();
            if (lVar.h() == WifiFreqType.TYPE_5G) {
                startRestartGroup.startReplaceGroup(259966422);
                m4589getColor0d7_KjU = Color.m2508copywmQWz5c$default(materialTheme.getColors(startRestartGroup, i15).m1595getOnBackground0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                startRestartGroup.startReplaceGroup(259968073);
                m4589getColor0d7_KjU = materialTheme.getTypography(startRestartGroup, i15).getH6().m4589getColor0d7_KjU();
            }
            startRestartGroup.endReplaceGroup();
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(h62, m4589getColor0d7_KjU, 0L, normal, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
            modifier3 = modifier4;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(I0, then, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m5029getEllipsisgIe3tQ8, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, composer2, 0, 3120, 55292);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.p1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 u02;
                    u02 = DeviceBondingActivityKt.u0(Modifier.this, lVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return u02;
                }
            });
        }
    }

    public static final yz.g2 u0(Modifier modifier, ki.l lVar, int i11, int i12, Composer composer, int i13) {
        t0(modifier, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void v0(Modifier modifier, final List<ki.l> list, final x00.l<? super ki.l, yz.g2> lVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-340280489);
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
            i13 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier2 = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-340280489, i13, -1, "com.baicizhan.main.vld.bonding.WifiList (DeviceBondingActivity.kt:904)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(list) | ((i13 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.vld.bonding.s1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 w02;
                        w02 = DeviceBondingActivityKt.w0(list, lVar, (LazyListScope) obj);
                        return w02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(modifier2, null, null, false, null, null, null, false, null, (x00.l) rememberedValue, startRestartGroup, i13 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.t1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 x02;
                    x02 = DeviceBondingActivityKt.x0(Modifier.this, list, lVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return x02;
                }
            });
        }
    }

    public static final yz.g2 w0(final List list, final x00.l lVar, LazyListScope LazyColumn) {
        kotlin.jvm.internal.g0.p(LazyColumn, "$this$LazyColumn");
        final DeviceBondingActivityKt$WifiList$lambda$0$0$$inlined$items$default$1 deviceBondingActivityKt$WifiList$lambda$0$0$$inlined$items$default$1 = new x00.l() { // from class: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$WifiList$lambda$0$0$$inlined$items$default$1
            @Override // x00.l
            public final Void invoke(ki.l lVar2) {
                return null;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ki.l) obj);
            }
        };
        LazyColumn.items(list.size(), null, new x00.l<Integer, Object>() { // from class: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$WifiList$lambda$0$0$$inlined$items$default$3
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
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new x00.r<LazyItemScope, Integer, Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.vld.bonding.DeviceBondingActivityKt$WifiList$lambda$0$0$$inlined$items$default$4
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
                Composer composer2;
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
                ki.l lVar2 = (ki.l) list.get(i11);
                composer.startReplaceGroup(-704831961);
                Modifier.Companion companion = Modifier.Companion;
                boolean changed = composer.changed(lVar) | composer.changed(lVar2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DeviceBondingActivityKt.h(lVar, lVar2);
                    composer.updateRememberedValue(rememberedValue);
                }
                DeviceBondingActivityKt.t0(ClickableKt.m269clickableXHw0xAI$default(companion, false, null, null, (x00.a) rememberedValue, 7, null), lVar2, composer, 0, 0);
                if (kotlin.jvm.internal.g0.g(lVar2, a00.r0.u3(list))) {
                    composer2 = composer;
                    composer2.startReplaceGroup(-744604683);
                } else {
                    composer.startReplaceGroup(-704706071);
                    composer2 = composer;
                    DividerKt.m1643DivideroMI9zvI(null, bk.b.I(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)), 0.0f, 0.0f, composer2, 0, 13);
                }
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return yz.g2.f100423a;
    }

    public static final yz.g2 x0(Modifier modifier, List list, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        v0(modifier, list, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
