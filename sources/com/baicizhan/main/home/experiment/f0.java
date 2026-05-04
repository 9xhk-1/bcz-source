package com.baicizhan.main.home.experiment;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.client.business.util.Standard_extKt;
import com.google.accompanist.flowlayout.MainAxisAlignment;
import com.jiongji.andriod.card.R;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/ComposableSingletons$HomeActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1233:1\n1247#2,6:1234\n1247#2,6:1240\n1247#2,6:1246\n1247#2,6:1252\n1247#2,6:1258\n1247#2,6:1264\n1247#2,6:1270\n1247#2,6:1276\n1247#2,6:1282\n1247#2,6:1288\n1247#2,6:1296\n1247#2,6:1303\n1247#2,6:1311\n1247#2,6:1318\n1247#2,6:1325\n1247#2,6:1411\n113#3:1294\n113#3:1295\n113#3:1302\n113#3:1309\n113#3:1310\n113#3:1317\n113#3:1324\n113#3:1331\n113#3:1374\n87#4:1332\n83#4,10:1333\n94#4:1373\n87#4:1375\n85#4,8:1376\n94#4:1420\n79#5,6:1343\n86#5,3:1358\n89#5,2:1367\n93#5:1372\n79#5,6:1384\n86#5,3:1399\n89#5,2:1408\n93#5:1419\n347#6,9:1349\n356#6,3:1369\n347#6,9:1390\n356#6:1410\n357#6,2:1417\n4206#7,6:1361\n4206#7,6:1402\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/ComposableSingletons$HomeActivityKt\n*L\n896#1:1234,6\n897#1:1240,6\n898#1:1246,6\n1073#1:1252,6\n1074#1:1258,6\n1075#1:1264,6\n1076#1:1270,6\n1077#1:1276,6\n1078#1:1282,6\n1079#1:1288,6\n1105#1:1296,6\n1106#1:1303,6\n1149#1:1311,6\n1159#1:1318,6\n1169#1:1325,6\n1227#1:1411,6\n1072#1:1294\n1105#1:1295\n1106#1:1302\n1104#1:1309\n1145#1:1310\n1155#1:1317\n1165#1:1324\n1142#1:1331\n1226#1:1374\n1142#1:1332\n1142#1:1333,10\n1142#1:1373\n1226#1:1375\n1226#1:1376,8\n1226#1:1420\n1142#1:1343,6\n1142#1:1358,3\n1142#1:1367,2\n1142#1:1372\n1226#1:1384,6\n1226#1:1399,3\n1226#1:1408,2\n1226#1:1419\n1142#1:1349,9\n1142#1:1369,3\n1226#1:1390,9\n1226#1:1410\n1226#1:1417,2\n1142#1:1361,6\n1226#1:1402,6\n*E\n"})
/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f0 f21173a = new f0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21174b = ComposableLambdaKt.composableLambdaInstance(-715890713, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.h
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 b02;
            b02 = f0.b0((Composer) obj, ((Integer) obj2).intValue());
            return b02;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21175c = ComposableLambdaKt.composableLambdaInstance(-221383595, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.i
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 S;
            S = f0.S((Composer) obj, ((Integer) obj2).intValue());
            return S;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21176d = ComposableLambdaKt.composableLambdaInstance(-509116657, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.j
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 a02;
            a02 = f0.a0((Composer) obj, ((Integer) obj2).intValue());
            return a02;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21177e = ComposableLambdaKt.composableLambdaInstance(-92597025, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.k
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 h02;
            h02 = f0.h0((Composer) obj, ((Integer) obj2).intValue());
            return h02;
        }
    });

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21178f = ComposableLambdaKt.composableLambdaInstance(1699236581, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.l
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 M;
            M = f0.M((Composer) obj, ((Integer) obj2).intValue());
            return M;
        }
    });

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21179g = ComposableLambdaKt.composableLambdaInstance(-144875099, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.m
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 P;
            P = f0.P((Composer) obj, ((Integer) obj2).intValue());
            return P;
        }
    });

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21180h = ComposableLambdaKt.composableLambdaInstance(1331888412, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.n
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 K;
            K = f0.K((Composer) obj, ((Integer) obj2).intValue());
            return K;
        }
    });

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21181i = ComposableLambdaKt.composableLambdaInstance(-819594723, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.o
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 f02;
            f02 = f0.f0((Composer) obj, ((Integer) obj2).intValue());
            return f02;
        }
    });

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21182j = ComposableLambdaKt.composableLambdaInstance(-1777947533, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.p
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 R;
            R = f0.R((Composer) obj, ((Integer) obj2).intValue());
            return R;
        }
    });

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21183k = ComposableLambdaKt.composableLambdaInstance(822867688, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.r
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 N;
            N = f0.N((Composer) obj, ((Integer) obj2).intValue());
            return N;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 K(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1331888412, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$1331888412.<anonymous> (HomeActivity.kt:1153)");
            }
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(14), Dp.m5115constructorimpl(6));
            b4 b4Var = new b4(WinningState.ALERT, 20);
            Boolean bool = Boolean.FALSE;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.experiment.w
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 L;
                        L = f0.L((Actions) obj);
                        return L;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            n3.J1(m727paddingVpY3zN4, b4Var, bool, null, (x00.l) rememberedValue, composer, 28038, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 L(Actions it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 M(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1699236581, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$1699236581.<anonymous> (HomeActivity.kt:1103)");
            }
            float f11 = 4;
            tm.a.c(PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(8)), null, MainAxisAlignment.Center, Dp.m5115constructorimpl(f11), null, Dp.m5115constructorimpl(f11), null, f21177e, composer, 12782982, 82);
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
    public static final yz.g2 N(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(822867688, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$822867688.<anonymous> (HomeActivity.kt:1225)");
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(8));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(6)), Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
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
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.s
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 O;
                        O = f0.O();
                        return O;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            n3.o0(null, "标题！", "查看", (x00.a) rememberedValue, composer, 3504, 1);
            n3.o0(null, "Words=Power", null, null, composer, 48, 13);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 O() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 P(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-144875099, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$-144875099.<anonymous> (HomeActivity.kt:1143)");
            }
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(14), Dp.m5115constructorimpl(6));
            b4 a11 = b4.f21098c.a();
            Boolean bool = Boolean.TRUE;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.experiment.g
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 Q;
                        Q = f0.Q((Actions) obj);
                        return Q;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            n3.J1(m727paddingVpY3zN4, a11, null, bool, (x00.l) rememberedValue, composer, 28086, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q(Actions it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 R(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1777947533, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$-1777947533.<anonymous> (HomeActivity.kt:1141)");
            }
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(6));
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            SurfaceKt.m1784SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, f21179g, composer, 1572864, 63);
            SurfaceKt.m1784SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, f21180h, composer, 1572864, 63);
            SurfaceKt.m1784SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, f21181i, composer, 1572864, 63);
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
    public static final yz.g2 S(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-221383595, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$-221383595.<anonymous> (HomeActivity.kt:1072)");
            }
            WinningState winningState = WinningState.NORMAL;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.f
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 T;
                        T = f0.T();
                        return T;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            n3.R1(winningState, 20, null, (x00.a) rememberedValue, composer, 3126, 4);
            WinningState winningState2 = WinningState.ALERT;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.q
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 U;
                        U = f0.U();
                        return U;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            n3.R1(winningState2, 0, null, (x00.a) rememberedValue2, composer, 3126, 4);
            WinningState winningState3 = WinningState.COMPLETED;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.experiment.x
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 V;
                        V = f0.V();
                        return V;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            n3.R1(winningState3, 2000, null, (x00.a) rememberedValue3, composer, 3126, 4);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.experiment.y
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 W;
                        W = f0.W();
                        return W;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            n3.R1(winningState, 2000, null, (x00.a) rememberedValue4, composer, 3126, 4);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.experiment.z
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 X;
                        X = f0.X();
                        return X;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            n3.R1(winningState2, 20, null, (x00.a) rememberedValue5, composer, 3126, 4);
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: com.baicizhan.main.home.experiment.a0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Y;
                        Y = f0.Y();
                        return Y;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            n3.R1(winningState3, 20000, null, (x00.a) rememberedValue6, composer, 3126, 4);
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: com.baicizhan.main.home.experiment.b0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Z;
                        Z = f0.Z();
                        return Z;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            n3.R1(winningState2, 20000, null, (x00.a) rememberedValue7, composer, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 T() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 U() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 V() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 W() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 X() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 a0(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-509116657, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$-509116657.<anonymous> (HomeActivity.kt:1071)");
            }
            float f11 = 4;
            tm.a.c(PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(8)), null, MainAxisAlignment.Center, Dp.m5115constructorimpl(f11), null, Dp.m5115constructorimpl(f11), null, f21175c, composer, 12782982, 82);
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
    public static final yz.g2 b0(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-715890713, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$-715890713.<anonymous> (HomeActivity.kt:893)");
            }
            Pair a11 = yz.h1.a(Integer.valueOf(R.drawable.ic_home_sheet_winning), "不断电");
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.t
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 c02;
                        c02 = f0.c0();
                        return c02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Triple triplet = Standard_extKt.triplet(a11, (x00.a) rememberedValue);
            Pair a12 = yz.h1.a(Integer.valueOf(R.drawable.ic_home_sheet_ranking), "排行榜");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.u
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 d02;
                        d02 = f0.d0();
                        return d02;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Triple triplet2 = Standard_extKt.triplet(a12, (x00.a) rememberedValue2);
            Pair a13 = yz.h1.a(Integer.valueOf(R.drawable.ic_home_sheet_tasks), "任务");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.experiment.v
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 e02;
                        e02 = f0.e0();
                        return e02;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            n3.D1(null, a00.h0.Q(triplet, triplet2, Standard_extKt.triplet(a13, (x00.a) rememberedValue3)), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 c0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 d0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 f0(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819594723, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$-819594723.<anonymous> (HomeActivity.kt:1163)");
            }
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(14), Dp.m5115constructorimpl(6));
            b4 b4Var = new b4(WinningState.COMPLETED, 20);
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.experiment.c0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 g02;
                        g02 = f0.g0((Actions) obj);
                        return g02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            n3.J1(m727paddingVpY3zN4, b4Var, bool, bool2, (x00.l) rememberedValue, composer, 28038, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 g0(Actions it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 h0(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92597025, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$HomeActivityKt.lambda$-92597025.<anonymous> (HomeActivity.kt:1104)");
            }
            ImageVector.Companion companion = ImageVector.Companion;
            ImageVector vectorResource = VectorResources_androidKt.vectorResource(companion, R.drawable.ic_home_words_action_messages, composer, 54);
            Modifier.Companion companion2 = Modifier.Companion;
            float f11 = 42;
            Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(f11));
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.d0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 i02;
                        i02 = f0.i0();
                        return i02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            n3.l0(vectorResource, m773size3ABfNKs, false, (x00.a) rememberedValue, composer, 3504, 0);
            ImageVector vectorResource2 = VectorResources_androidKt.vectorResource(companion, R.drawable.ic_home_words_action_messages, composer, 54);
            Modifier m773size3ABfNKs2 = SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(f11));
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.e0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 j02;
                        j02 = f0.j0();
                        return j02;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            n3.l0(vectorResource2, m773size3ABfNKs2, true, (x00.a) rememberedValue2, composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 i0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 j0() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> A() {
        return f21179g;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> B() {
        return f21182j;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> C() {
        return f21175c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> D() {
        return f21176d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> E() {
        return f21174b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> F() {
        return f21181i;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> G() {
        return f21177e;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> H() {
        return f21180h;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> I() {
        return f21178f;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> J() {
        return f21183k;
    }
}
