package com.baicizhan.main.home.plan.newexam;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLearnCardComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardComponents.kt\ncom/baicizhan/main/home/plan/newexam/ComposableSingletons$LearnCardComponentsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,527:1\n113#2:528\n113#2:663\n113#2:664\n113#2:665\n113#2:672\n113#2:673\n113#2:674\n113#2:681\n113#2:688\n113#2:689\n113#2:690\n113#2:691\n113#2:692\n113#2:699\n113#2:706\n113#2:713\n113#2:720\n113#2:727\n99#3,6:529\n106#3:565\n79#4,6:535\n86#4,3:550\n89#4,2:559\n93#4:564\n79#4,6:577\n86#4,3:592\n89#4,2:601\n93#4:618\n79#4,6:630\n86#4,3:645\n89#4,2:654\n93#4:742\n347#5,9:541\n356#5,3:561\n347#5,9:583\n356#5:603\n357#5,2:616\n347#5,9:636\n356#5:656\n357#5,2:740\n4206#6,6:553\n4206#6,6:595\n4206#6,6:648\n87#7:566\n83#7,10:567\n94#7:619\n87#7:620\n84#7,9:621\n94#7:743\n1247#8,6:604\n1247#8,6:610\n1247#8,6:657\n1247#8,6:666\n1247#8,6:675\n1247#8,6:682\n1247#8,6:693\n1247#8,6:700\n1247#8,6:707\n1247#8,6:714\n1247#8,6:721\n1247#8,6:728\n1247#8,6:734\n*S KotlinDebug\n*F\n+ 1 LearnCardComponents.kt\ncom/baicizhan/main/home/plan/newexam/ComposableSingletons$LearnCardComponentsKt\n*L\n103#1:528\n444#1:663\n447#1:664\n448#1:665\n453#1:672\n456#1:673\n457#1:674\n463#1:681\n465#1:688\n467#1:689\n469#1:690\n471#1:691\n473#1:692\n483#1:699\n495#1:706\n506#1:713\n509#1:720\n512#1:727\n100#1:529,6\n100#1:565\n100#1:535,6\n100#1:550,3\n100#1:559,2\n100#1:564\n517#1:577,6\n517#1:592,3\n517#1:601,2\n517#1:618\n438#1:630,6\n438#1:645,3\n438#1:654,2\n438#1:742\n100#1:541,9\n100#1:561,3\n517#1:583,9\n517#1:603\n517#1:616,2\n438#1:636,9\n438#1:656\n438#1:740,2\n100#1:553,6\n517#1:595,6\n438#1:648,6\n517#1:566\n517#1:567,10\n517#1:619\n438#1:620\n438#1:621,9\n438#1:743\n518#1:604,6\n519#1:610,6\n442#1:657,6\n451#1:666,6\n460#1:675,6\n464#1:682,6\n482#1:693,6\n493#1:700,6\n504#1:707,6\n507#1:714,6\n510#1:721,6\n513#1:728,6\n524#1:734,6\n*E\n"})
/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k0 f22723a = new k0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f22724b = ComposableLambdaKt.composableLambdaInstance(-9025472, false, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.c0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 X;
            X = k0.X((Composer) obj, ((Integer) obj2).intValue());
            return X;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f22725c = ComposableLambdaKt.composableLambdaInstance(-1222748260, false, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.d0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 T;
            T = k0.T((Composer) obj, ((Integer) obj2).intValue());
            return T;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f22726d = ComposableLambdaKt.composableLambdaInstance(-1884993584, false, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.e0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 W;
            W = k0.W((Composer) obj, ((Integer) obj2).intValue());
            return W;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f22727e = ComposableLambdaKt.composableLambdaInstance(1719431470, false, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.f0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 B;
            B = k0.B((Composer) obj, ((Integer) obj2).intValue());
            return B;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 B(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1719431470, i11, -1, "com.baicizhan.main.home.plan.newexam.ComposableSingletons$LearnCardComponentsKt.lambda$1719431470.<anonymous> (LearnCardComponents.kt:437)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(companion, bk.b.o(), null, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m235backgroundbw27NRU$default);
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
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.g0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 C;
                        C = k0.C();
                        return C;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            i3.Z((x00.a) rememberedValue, composer, 6);
            float f11 = 12;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            float f12 = 56;
            float f13 = 150;
            Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f12)), Dp.m5115constructorimpl(f13));
            LearnButtonType learnButtonType = LearnButtonType.Primary;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.s
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 D;
                        D = k0.D();
                        return D;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            i3.e0(m778width3ABfNKs, (x00.a) rememberedValue2, "文案", learnButtonType, composer, 3510);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Modifier m778width3ABfNKs2 = SizeKt.m778width3ABfNKs(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f12)), Dp.m5115constructorimpl(f13));
            LearnButtonType learnButtonType2 = LearnButtonType.Secondary;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.t
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 L;
                        L = k0.L();
                        return L;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            i3.e0(m778width3ABfNKs2, (x00.a) rememberedValue3, "文案", learnButtonType2, composer, 3510);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.u
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 M;
                        M = k0.M();
                        return M;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            i3.o0("沉浸式背单词，用斩家单词机", (x00.a) rememberedValue4, composer, 54);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            i3.s0(composer, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            i3.q0(composer, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            i3.i0("完成本轮复习还有 2900 词", composer, 6);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            i3.k0("已复习", 0, 100, composer, 438);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            j2 j2Var = new j2("GRE 3000 都说了副科级sdfsdf阿萨德风口浪尖sdfsdf", "", 300, 3000, 20, 0, false);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion3.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.v
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 N;
                        N = k0.N();
                        return N;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            x00.a aVar = (x00.a) rememberedValue5;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion3.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.w
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 O;
                        O = k0.O();
                        return O;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            x00.a aVar2 = (x00.a) rememberedValue6;
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == companion3.getEmpty()) {
                rememberedValue7 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.x
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 P;
                        P = k0.P();
                        return P;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            i3.y(companion, j2Var, aVar, aVar2, (x00.a) rememberedValue7, composer, 28038, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            j2 j2Var2 = new j2("GRE 3000 都说了副科级sdfsdf阿萨德风口浪尖sdfsdf", "", 300, 3000, 20, 0, true);
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == companion3.getEmpty()) {
                rememberedValue8 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.z
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Q;
                        Q = k0.Q();
                        return Q;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            x00.a aVar3 = (x00.a) rememberedValue8;
            Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == companion3.getEmpty()) {
                rememberedValue9 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.a0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 R;
                        R = k0.R();
                        return R;
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            x00.a aVar4 = (x00.a) rememberedValue9;
            Object rememberedValue10 = composer.rememberedValue();
            if (rememberedValue10 == companion3.getEmpty()) {
                rememberedValue10 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.b0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 S;
                        S = k0.S();
                        return S;
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            i3.y(companion, j2Var2, aVar3, aVar4, (x00.a) rememberedValue10, composer, 28038, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            j2 j2Var3 = new j2("GRE 3000", "", 300, 3000, 20, 22, true);
            Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == companion3.getEmpty()) {
                rememberedValue11 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.h0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 E;
                        E = k0.E();
                        return E;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            x00.a aVar5 = (x00.a) rememberedValue11;
            Object rememberedValue12 = composer.rememberedValue();
            if (rememberedValue12 == companion3.getEmpty()) {
                rememberedValue12 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.i0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 F;
                        F = k0.F();
                        return F;
                    }
                };
                composer.updateRememberedValue(rememberedValue12);
            }
            x00.a aVar6 = (x00.a) rememberedValue12;
            Object rememberedValue13 = composer.rememberedValue();
            if (rememberedValue13 == companion3.getEmpty()) {
                rememberedValue13 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.j0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 G;
                        G = k0.G();
                        return G;
                    }
                };
                composer.updateRememberedValue(rememberedValue13);
            }
            i3.y(companion, j2Var3, aVar5, aVar6, (x00.a) rememberedValue13, composer, 28038, 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue14 = composer.rememberedValue();
            if (rememberedValue14 == companion3.getEmpty()) {
                rememberedValue14 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.o
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 H;
                        H = k0.H();
                        return H;
                    }
                };
                composer.updateRememberedValue(rememberedValue14);
            }
            i3.V("GRE 3000", "", "全部 3000 词已学完", (x00.a) rememberedValue14, composer, 3510);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue15 = composer.rememberedValue();
            if (rememberedValue15 == companion3.getEmpty()) {
                rememberedValue15 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.p
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 I;
                        I = k0.I();
                        return I;
                    }
                };
                composer.updateRememberedValue(rememberedValue15);
            }
            i3.R((x00.a) rememberedValue15, "学习其他计划", null, composer, 54, 4);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), composer, 6);
            Object rememberedValue16 = composer.rememberedValue();
            if (rememberedValue16 == companion3.getEmpty()) {
                rememberedValue16 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.q
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 J;
                        J = k0.J();
                        return J;
                    }
                };
                composer.updateRememberedValue(rememberedValue16);
            }
            i3.R((x00.a) rememberedValue16, "学习其他计划", "明天将进入总复习", composer, 438, 0);
            i3.g0(null, f22726d, composer, 48, 1);
            Object rememberedValue17 = composer.rememberedValue();
            if (rememberedValue17 == companion3.getEmpty()) {
                rememberedValue17 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.r
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 K;
                        K = k0.K();
                        return K;
                    }
                };
                composer.updateRememberedValue(rememberedValue17);
            }
            j.q(companion, (x00.a) rememberedValue17, composer, 54);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
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

    public static final yz.g2 Q() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 R() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 S() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 T(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1222748260, i11, -1, "com.baicizhan.main.home.plan.newexam.ComposableSingletons$LearnCardComponentsKt.lambda$-1222748260.<anonymous> (LearnCardComponents.kt:516)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.n
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 U;
                        U = k0.U();
                        return U;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            i3.V("GRE 3000", "", "全部 3000 词已学完", (x00.a) rememberedValue, composer, 3510);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.y
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 V;
                        V = k0.V();
                        return V;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            i3.R((x00.a) rememberedValue2, "学习其他计划", "明天将进入总复习", composer, 438, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 U() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 V() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 W(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884993584, i11, -1, "com.baicizhan.main.home.plan.newexam.ComposableSingletons$LearnCardComponentsKt.lambda$-1884993584.<anonymous> (LearnCardComponents.kt:515)");
            }
            i3.T(null, f22725c, composer, 48, 1);
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
    public static final yz.g2 X(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-9025472, i11, -1, "com.baicizhan.main.home.plan.newexam.ComposableSingletons$LearnCardComponentsKt.lambda$-9025472.<anonymous> (LearnCardComponents.kt:99)");
            }
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m5115constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m730paddingqDBjuR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_plan_buttons_go_punch_card, composer, 6), (Modifier) null, bk.b.A0(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131058);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_common_arrow_right, composer, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> A() {
        return f22727e;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> x() {
        return f22725c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> y() {
        return f22726d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> z() {
        return f22724b;
    }
}
