package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/baicizhan/platform/base/widget/ComposableSingletons$ButtonKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,346:1\n99#2:347\n95#2,10:348\n106#2:597\n79#3,6:358\n86#3,3:373\n89#3,2:382\n79#3,6:396\n86#3,3:411\n89#3,2:420\n93#3:487\n79#3,6:501\n86#3,3:516\n89#3,2:525\n93#3:592\n93#3:596\n347#4,9:364\n356#4:384\n347#4,9:402\n356#4:422\n357#4,2:485\n347#4,9:507\n356#4:527\n357#4,2:590\n357#4,2:594\n4206#5,6:376\n4206#5,6:414\n4206#5,6:519\n87#6:385\n83#6,10:386\n94#6:488\n87#6:490\n83#6,10:491\n94#6:593\n1247#7,6:423\n1247#7,6:430\n1247#7,6:437\n1247#7,6:444\n1247#7,6:451\n1247#7,6:458\n1247#7,6:465\n1247#7,6:472\n1247#7,6:479\n1247#7,6:528\n1247#7,6:535\n1247#7,6:542\n1247#7,6:549\n1247#7,6:556\n1247#7,6:563\n1247#7,6:570\n1247#7,6:577\n1247#7,6:584\n113#8:429\n113#8:436\n113#8:443\n113#8:450\n113#8:457\n113#8:464\n113#8:471\n113#8:478\n113#8:489\n113#8:534\n113#8:541\n113#8:548\n113#8:555\n113#8:562\n113#8:569\n113#8:576\n113#8:583\n113#8:598\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/baicizhan/platform/base/widget/ComposableSingletons$ButtonKt\n*L\n255#1:347\n255#1:348,10\n255#1:597\n255#1:358,6\n255#1:373,3\n255#1:382,2\n256#1:396,6\n256#1:411,3\n256#1:420,2\n256#1:487\n290#1:501,6\n290#1:516,3\n290#1:525,2\n290#1:592\n255#1:596\n255#1:364,9\n255#1:384\n256#1:402,9\n256#1:422\n256#1:485,2\n290#1:507,9\n290#1:527\n290#1:590,2\n255#1:594,2\n255#1:376,6\n256#1:414,6\n290#1:519,6\n256#1:385\n256#1:386,10\n256#1:488\n290#1:490\n290#1:491,10\n290#1:593\n257#1:423,6\n259#1:430,6\n261#1:437,6\n269#1:444,6\n271#1:451,6\n273#1:458,6\n281#1:465,6\n283#1:472,6\n285#1:479,6\n298#1:528,6\n300#1:535,6\n302#1:542,6\n312#1:549,6\n314#1:556,6\n316#1:563,6\n326#1:570,6\n328#1:577,6\n330#1:584,6\n258#1:429\n260#1:436\n268#1:443\n270#1:450\n272#1:457\n280#1:464\n282#1:471\n284#1:478\n288#1:489\n299#1:534\n301#1:541\n311#1:548\n313#1:555\n315#1:562\n325#1:569\n327#1:576\n329#1:583\n252#1:598\n*E\n"})
/* loaded from: classes6.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final s0 f28504a = new s0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f28505b = ComposableLambdaKt.composableLambdaInstance(-187243780, false, new x00.p() { // from class: com.baicizhan.platform.base.widget.y
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 x11;
            x11 = s0.x((Composer) obj, ((Integer) obj2).intValue());
            return x11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f28506c = ComposableLambdaKt.composableLambdaInstance(-1119733064, false, new x00.p() { // from class: com.baicizhan.platform.base.widget.j0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 w11;
            w11 = s0.w((Composer) obj, ((Integer) obj2).intValue());
            return w11;
        }
    });

    public static final yz.g2 A() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 B() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 C() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 D() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 E() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 F() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 G() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 H() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 I() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 J() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 K() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 L() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 M() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 N() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 O() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 P() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 w(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119733064, i11, -1, "com.baicizhan.platform.base.widget.ComposableSingletons$ButtonKt.lambda$-1119733064.<anonymous> (Button.kt:248)");
            }
            SurfaceKt.m1784SurfaceFjzlyU(SizeKt.fillMaxWidth$default(PaddingKt.m726padding3ABfNKs(BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, Color.Companion.m2546getWhite0d7_KjU(), null, 2, null), Dp.m5115constructorimpl(16)), 0.0f, 1, null), null, 0L, 0L, null, 0.0f, f28505b, composer, 1572870, 62);
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
    public static final yz.g2 x(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-187243780, i11, -1, "com.baicizhan.platform.base.widget.ComposableSingletons$ButtonKt.lambda$-187243780.<anonymous> (Button.kt:254)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (rememberedValue == companion4.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.platform.base.widget.k0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 y11;
                        y11 = s0.y();
                        return y11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            r.C(null, (x00.a) rememberedValue, "动作", 0L, null, 0, false, false, null, null, null, composer, 432, 0, 2041);
            float f11 = 16;
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion4.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.platform.base.widget.a0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 z11;
                        z11 = s0.z();
                        return z11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            r.C(null, (x00.a) rememberedValue2, "动作", 0L, null, 0, false, false, null, null, null, composer, 12583344, 0, 1913);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion4.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.platform.base.widget.b0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A;
                        A = s0.A();
                        return A;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            r.C(null, (x00.a) rememberedValue3, "动作", 0L, null, 0, false, false, null, null, null, composer, 1573296, 0, 1977);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            bk.e a11 = bk.f.a(materialTheme.getColors(composer, i12).m1602getSecondary0d7_KjU(), materialTheme.getColors(composer, i12).m1603getSecondaryVariant0d7_KjU(), bk.b.D0(materialTheme.getColors(composer, i12)), 0L, composer, 0, 8);
            float f12 = 32;
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f12)), composer, 6);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion4.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.platform.base.widget.c0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 B;
                        B = s0.B();
                        return B;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            r.C(null, (x00.a) rememberedValue4, "动作", 0L, null, 0, false, false, null, a11, null, composer, 432, 0, 1529);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion4.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.platform.base.widget.d0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 C;
                        C = s0.C();
                        return C;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            r.C(null, (x00.a) rememberedValue5, "动作", 0L, null, 0, false, false, null, a11, null, composer, 12583344, 0, 1401);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion4.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: com.baicizhan.platform.base.widget.e0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 D;
                        D = s0.D();
                        return D;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            r.C(null, (x00.a) rememberedValue6, "动作", 0L, null, 0, false, false, null, a11, null, composer, 1573296, 0, 1465);
            bk.e a12 = bk.f.a(bk.b.A(materialTheme.getColors(composer, i12)), bk.b.y(materialTheme.getColors(composer, i12)), bk.b.G(materialTheme.getColors(composer, i12)), 0L, composer, 0, 8);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f12)), composer, 6);
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == companion4.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: com.baicizhan.platform.base.widget.f0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 E;
                        E = s0.E();
                        return E;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            r.C(null, (x00.a) rememberedValue7, "动作", 0L, null, 0, false, false, null, a12, null, composer, 432, 0, 1529);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == companion4.getEmpty()) {
                rememberedValue8 = new x00.a() { // from class: com.baicizhan.platform.base.widget.g0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 F;
                        F = s0.F();
                        return F;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            r.C(null, (x00.a) rememberedValue8, "动作", 0L, null, 0, false, false, null, a12, null, composer, 12583344, 0, 1401);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == companion4.getEmpty()) {
                rememberedValue9 = new x00.a() { // from class: com.baicizhan.platform.base.widget.h0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 G;
                        G = s0.G();
                        return G;
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            r.C(null, (x00.a) rememberedValue9, "动作", 0L, null, 0, false, false, null, a12, null, composer, 1573296, 0, 1465);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f12)), composer, 6);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            bk.e a13 = bk.f.a(bk.b.f0(), bk.b.g0(), bk.b.a0(materialTheme.getColors(composer, i12)), Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(composer, i12)), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 54, 0);
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == companion4.getEmpty()) {
                rememberedValue10 = new x00.a() { // from class: com.baicizhan.platform.base.widget.i0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 H;
                        H = s0.H();
                        return H;
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            r.C(null, (x00.a) rememberedValue10, "动作", 0L, null, 0, false, false, null, a13, null, composer, 432, 0, 1529);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == companion4.getEmpty()) {
                rememberedValue11 = new x00.a() { // from class: com.baicizhan.platform.base.widget.l0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 I;
                        I = s0.I();
                        return I;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            r.C(null, (x00.a) rememberedValue11, "动作", 0L, null, 0, false, false, null, a13, null, composer, 12583344, 0, 1401);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue12 = composer.rememberedValue();
            if (rememberedValue12 == companion4.getEmpty()) {
                rememberedValue12 = new x00.a() { // from class: com.baicizhan.platform.base.widget.m0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 J;
                        J = s0.J();
                        return J;
                    }
                };
                composer.updateRememberedValue(rememberedValue12);
            }
            r.C(null, (x00.a) rememberedValue12, "动作", 0L, null, 0, false, false, null, a13, null, composer, 1573296, 0, 1465);
            bk.e a14 = bk.f.a(bk.b.q0(), bk.b.r0(), bk.b.C0(materialTheme.getColors(composer, i12)), Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(composer, i12)), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 54, 0);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f12)), composer, 6);
            Object rememberedValue13 = composer.rememberedValue();
            if (rememberedValue13 == companion4.getEmpty()) {
                rememberedValue13 = new x00.a() { // from class: com.baicizhan.platform.base.widget.n0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 K;
                        K = s0.K();
                        return K;
                    }
                };
                composer.updateRememberedValue(rememberedValue13);
            }
            r.C(null, (x00.a) rememberedValue13, "动作", 0L, null, 0, false, false, null, a14, null, composer, 432, 0, 1529);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            long m11 = bk.d.m();
            Object rememberedValue14 = composer.rememberedValue();
            if (rememberedValue14 == companion4.getEmpty()) {
                rememberedValue14 = new x00.a() { // from class: com.baicizhan.platform.base.widget.o0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 L;
                        L = s0.L();
                        return L;
                    }
                };
                composer.updateRememberedValue(rememberedValue14);
            }
            r.C(null, (x00.a) rememberedValue14, "动作", m11, null, 0, false, false, null, a14, null, composer, 12586416, 0, 1393);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue15 = composer.rememberedValue();
            if (rememberedValue15 == companion4.getEmpty()) {
                rememberedValue15 = new x00.a() { // from class: com.baicizhan.platform.base.widget.p0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 M;
                        M = s0.M();
                        return M;
                    }
                };
                composer.updateRememberedValue(rememberedValue15);
            }
            r.C(null, (x00.a) rememberedValue15, "动作", 0L, null, 0, false, false, null, a14, null, composer, 1573296, 0, 1465);
            bk.e a15 = bk.f.a(Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(composer, i12)), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(composer, i12)), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(composer, i12)), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2508copywmQWz5c$default(bk.b.I(materialTheme.getColors(composer, i12)), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer, 0, 0);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f12)), composer, 6);
            Object rememberedValue16 = composer.rememberedValue();
            if (rememberedValue16 == companion4.getEmpty()) {
                rememberedValue16 = new x00.a() { // from class: com.baicizhan.platform.base.widget.q0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 N;
                        N = s0.N();
                        return N;
                    }
                };
                composer.updateRememberedValue(rememberedValue16);
            }
            r.C(null, (x00.a) rememberedValue16, "动作", 0L, null, 0, false, false, null, a15, null, composer, 432, 0, 1529);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            long m12 = bk.d.m();
            Object rememberedValue17 = composer.rememberedValue();
            if (rememberedValue17 == companion4.getEmpty()) {
                rememberedValue17 = new x00.a() { // from class: com.baicizhan.platform.base.widget.r0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 O;
                        O = s0.O();
                        return O;
                    }
                };
                composer.updateRememberedValue(rememberedValue17);
            }
            r.C(null, (x00.a) rememberedValue17, "动作", m12, null, 0, false, false, null, a15, null, composer, 12586416, 0, 1393);
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue18 = composer.rememberedValue();
            if (rememberedValue18 == companion4.getEmpty()) {
                rememberedValue18 = new x00.a() { // from class: com.baicizhan.platform.base.widget.z
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 P;
                        P = s0.P();
                        return P;
                    }
                };
                composer.updateRememberedValue(rememberedValue18);
            }
            r.C(null, (x00.a) rememberedValue18, "动作", 0L, null, 0, false, false, null, a15, null, composer, 1573296, 0, 1465);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 y() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 z() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> u() {
        return f28506c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> v() {
        return f28505b;
    }
}
