package com.baicizhan.main.word_book.list;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.painter.Painter;
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
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.jiongji.andriod.card.R;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFavoritesIntentWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoritesIntentWidgets.kt\ncom/baicizhan/main/word_book/list/FavoritesIntentWidgetsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 11 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,403:1\n1247#2,6:404\n1247#2,6:410\n1247#2,6:605\n1247#2,6:617\n1247#2,6:633\n1247#2,6:715\n1247#2,6:772\n1247#2,6:778\n1247#2,6:784\n1247#2,6:868\n1247#2,6:881\n1247#2,6:891\n1247#2,6:921\n1247#2,6:1007\n99#3,6:416\n106#3:452\n99#3,6:454\n106#3:491\n99#3:829\n96#3,9:830\n106#3:878\n79#4,6:422\n86#4,3:437\n89#4,2:446\n93#4:451\n79#4,6:460\n86#4,3:475\n89#4,2:484\n93#4:490\n79#4,6:503\n86#4,3:518\n89#4,2:527\n79#4,6:541\n86#4,3:556\n89#4,2:565\n79#4,6:578\n86#4,3:593\n89#4,2:602\n93#4:614\n93#4:625\n93#4:630\n79#4,6:649\n86#4,3:664\n89#4,2:673\n79#4,6:687\n86#4,3:702\n89#4,2:711\n93#4:723\n79#4,6:737\n86#4,3:752\n89#4,2:761\n93#4:766\n93#4:770\n79#4,6:800\n86#4,3:815\n89#4,2:824\n79#4,6:839\n86#4,3:854\n89#4,2:863\n93#4:877\n93#4:889\n79#4,6:937\n86#4,3:952\n89#4,2:961\n79#4,6:978\n86#4,3:993\n89#4,2:1002\n79#4,6:1023\n86#4,3:1038\n89#4,2:1047\n93#4:1053\n93#4:1058\n93#4:1062\n347#5,9:428\n356#5,3:448\n347#5,9:466\n356#5:486\n357#5,2:488\n347#5,9:509\n356#5:529\n347#5,9:547\n356#5:567\n347#5,9:584\n356#5:604\n357#5,2:612\n357#5,2:623\n357#5,2:628\n347#5,9:655\n356#5:675\n347#5,9:693\n356#5:713\n357#5,2:721\n347#5,9:743\n356#5,3:763\n357#5,2:768\n347#5,9:806\n356#5:826\n347#5,9:845\n356#5:865\n357#5,2:875\n357#5,2:887\n347#5,9:943\n356#5:963\n347#5,9:984\n356#5:1004\n347#5,9:1029\n356#5:1049\n357#5,2:1051\n357#5,2:1056\n357#5,2:1060\n4206#6,6:440\n4206#6,6:478\n4206#6,6:521\n4206#6,6:559\n4206#6,6:596\n4206#6,6:667\n4206#6,6:705\n4206#6,6:755\n4206#6,6:818\n4206#6,6:857\n4206#6,6:955\n4206#6,6:996\n4206#6,6:1041\n113#7:453\n113#7:487\n113#7:616\n113#7:627\n113#7:632\n113#7:676\n113#7:714\n113#7:725\n113#7:726\n113#7:827\n113#7:828\n113#7:866\n113#7:867\n113#7:874\n113#7:879\n113#7:880\n113#7:964\n113#7:965\n113#7:966\n113#7:967\n113#7:1006\n113#7:1013\n113#7:1050\n113#7:1069\n70#8:492\n66#8,10:493\n70#8:568\n67#8,9:569\n77#8:615\n77#8:631\n70#8:677\n67#8,9:678\n77#8:724\n70#8:727\n67#8,9:728\n77#8:767\n70#8:927\n67#8,9:928\n70#8:1014\n68#8,8:1015\n77#8:1054\n77#8:1063\n87#9:530\n83#9,10:531\n94#9:626\n87#9:639\n84#9,9:640\n94#9:771\n87#9:790\n84#9,9:791\n94#9:890\n87#9:968\n84#9,9:969\n94#9:1059\n35#10:611\n204#11,13:897\n57#12:910\n57#12:913\n61#12:916\n61#12:918\n57#12:1064\n61#12:1067\n57#12:1070\n60#13:911\n60#13:914\n70#13:917\n70#13:919\n60#13:1065\n70#13:1068\n60#13:1071\n22#14:912\n22#14:915\n22#14:920\n22#14:1066\n22#14:1072\n13805#15:1005\n13806#15:1055\n*S KotlinDebug\n*F\n+ 1 FavoritesIntentWidgets.kt\ncom/baicizhan/main/word_book/list/FavoritesIntentWidgetsKt\n*L\n143#1:404,6\n144#1:410,6\n219#1:605,6\n241#1:617,6\n273#1:633,6\n277#1:715,6\n305#1:772,6\n366#1:778,6\n372#1:784,6\n386#1:868,6\n394#1:881,6\n104#1:891,6\n310#1:921,6\n331#1:1007,6\n135#1:416,6\n135#1:452\n170#1:454,6\n170#1:491\n375#1:829\n375#1:830,9\n375#1:878\n135#1:422,6\n135#1:437,3\n135#1:446,2\n135#1:451\n170#1:460,6\n170#1:475,3\n170#1:484,2\n170#1:490\n209#1:503,6\n209#1:518,3\n209#1:527,2\n210#1:541,6\n210#1:556,3\n210#1:565,2\n212#1:578,6\n212#1:593,3\n212#1:602,2\n212#1:614\n210#1:625\n209#1:630\n270#1:649,6\n270#1:664,3\n270#1:673,2\n276#1:687,6\n276#1:702,3\n276#1:711,2\n276#1:723\n286#1:737,6\n286#1:752,3\n286#1:761,2\n286#1:766\n270#1:770\n368#1:800,6\n368#1:815,3\n368#1:824,2\n375#1:839,6\n375#1:854,3\n375#1:863,2\n375#1:877\n368#1:889\n306#1:937,6\n306#1:952,3\n306#1:961,2\n314#1:978,6\n314#1:993,3\n314#1:1002,2\n324#1:1023,6\n324#1:1038,3\n324#1:1047,2\n324#1:1053\n314#1:1058\n306#1:1062\n135#1:428,9\n135#1:448,3\n170#1:466,9\n170#1:486\n170#1:488,2\n209#1:509,9\n209#1:529\n210#1:547,9\n210#1:567\n212#1:584,9\n212#1:604\n212#1:612,2\n210#1:623,2\n209#1:628,2\n270#1:655,9\n270#1:675\n276#1:693,9\n276#1:713\n276#1:721,2\n286#1:743,9\n286#1:763,3\n270#1:768,2\n368#1:806,9\n368#1:826\n375#1:845,9\n375#1:865\n375#1:875,2\n368#1:887,2\n306#1:943,9\n306#1:963\n314#1:984,9\n314#1:1004\n324#1:1029,9\n324#1:1049\n324#1:1051,2\n314#1:1056,2\n306#1:1060,2\n135#1:440,6\n170#1:478,6\n209#1:521,6\n210#1:559,6\n212#1:596,6\n270#1:667,6\n276#1:705,6\n286#1:755,6\n368#1:818,6\n375#1:857,6\n306#1:955,6\n314#1:996,6\n324#1:1041,6\n173#1:453\n184#1:487\n246#1:616\n255#1:627\n272#1:632\n276#1:676\n277#1:714\n289#1:725\n290#1:726\n377#1:827\n378#1:828\n382#1:866\n384#1:867\n390#1:874\n393#1:879\n394#1:880\n317#1:964\n318#1:965\n319#1:966\n320#1:967\n327#1:1006\n334#1:1013\n349#1:1050\n397#1:1069\n209#1:492\n209#1:493,10\n212#1:568\n212#1:569,9\n212#1:615\n209#1:631\n276#1:677\n276#1:678,9\n276#1:724\n286#1:727\n286#1:728,9\n286#1:767\n306#1:927\n306#1:928,9\n324#1:1014\n324#1:1015,8\n324#1:1054\n306#1:1063\n210#1:530\n210#1:531,10\n210#1:626\n270#1:639\n270#1:640,9\n270#1:771\n368#1:790\n368#1:791,9\n368#1:890\n314#1:968\n314#1:969,9\n314#1:1059\n235#1:611\n220#1:897,13\n279#1:910\n280#1:913\n280#1:916\n281#1:918\n397#1:1064\n397#1:1067\n398#1:1070\n279#1:911\n280#1:914\n280#1:917\n281#1:919\n397#1:1065\n397#1:1068\n398#1:1071\n279#1:912\n280#1:915\n281#1:920\n397#1:1066\n398#1:1072\n322#1:1005\n322#1:1055\n*E\n"})
/* loaded from: classes5.dex */
public final class FavoritesIntentWidgetsKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 A(final x00.a aVar, final String str, final boolean z11, final List list, final String str2, final String str3, final String str4, final boolean z12, final boolean z13, final Pair pair, final x00.a aVar2, final d2 d2Var, final x00.a aVar3, final x00.q qVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(598806416, i11, -1, "com.baicizhan.main.word_book.list.FavoritesContent.<anonymous> (FavoritesIntentWidgets.kt:102)");
            }
            com.baicizhan.platform.base.widget.s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-112898489, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.k1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B;
                    B = FavoritesIntentWidgetsKt.B(x00.a.this, str, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1884793793, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.l1
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 D;
                    D = FavoritesIntentWidgetsKt.D(z11, list, str2, str3, str4, z12, z13, pair, aVar2, d2Var, aVar3, qVar, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return D;
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
    public static final yz.g2 B(final x00.a aVar, String str, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-112898489, i11, -1, "com.baicizhan.main.word_book.list.FavoritesContent.<anonymous>.<anonymous> (FavoritesIntentWidgets.kt:103)");
            }
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.y1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 C;
                        C = FavoritesIntentWidgetsKt.C(x00.a.this);
                        return C;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.baicizhan.platform.base.widget.s4.F(0, null, (x00.a) rememberedValue, str, null, null, composer, 0, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 C(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 D(boolean z11, List list, String str, String str2, String str3, boolean z12, boolean z13, Pair pair, x00.a aVar, d2 d2Var, x00.a aVar2, final x00.q qVar, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884793793, i11, -1, "com.baicizhan.main.word_book.list.FavoritesContent.<anonymous>.<anonymous> (FavoritesIntentWidgets.kt:104)");
            }
            if (z11) {
                composer.startReplaceGroup(-1784372837);
                if (list.isEmpty()) {
                    composer.startReplaceGroup(-1784354206);
                    WidgetsKt.r(R.drawable.ic_word_favorites_match_empty, str, null, null, composer, 6, 12);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1784236809);
                    G(list, str2, str3, z12, z13, pair, aVar, d2Var, aVar2, ComposableLambdaKt.rememberComposableLambda(-1128521309, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.z1
                        @Override // x00.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            yz.g2 E;
                            E = FavoritesIntentWidgetsKt.E(x00.q.this, obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return E;
                        }
                    }, composer, 54), composer, 805306368, 0);
                    composer.endReplaceGroup();
                }
            } else {
                composer.startReplaceGroup(-1788137725);
            }
            composer.endReplaceGroup();
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
    public static final yz.g2 E(x00.q qVar, Object obj, Composer composer, int i11) {
        if ((i11 & 6) == 0) {
            i11 |= (i11 & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1128521309, i11, -1, "com.baicizhan.main.word_book.list.FavoritesContent.<anonymous>.<anonymous>.<anonymous> (FavoritesIntentWidgets.kt:119)");
            }
            qVar.invoke(obj, composer, Integer.valueOf(i11 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F(boolean z11, String str, String str2, String str3, String str4, boolean z12, List list, boolean z13, Pair pair, Pair pair2, d2 d2Var, x00.a aVar, x00.q qVar, int i11, int i12, int i13, Composer composer, int i14) {
        z(z11, str, str2, str3, str4, z12, list, z13, pair, pair2, d2Var, aVar, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void G(@m80.k final java.util.List<? extends T> r35, @m80.k final java.lang.String r36, @m80.k final java.lang.String r37, boolean r38, boolean r39, @m80.l kotlin.Pair<java.lang.String, ? extends x00.a<yz.g2>> r40, @m80.k final x00.a<yz.g2> r41, @m80.l com.baicizhan.main.word_book.list.d2 r42, @m80.l x00.a<yz.g2> r43, @m80.k final x00.q<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r44, @m80.l androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.FavoritesIntentWidgetsKt.G(java.util.List, java.lang.String, java.lang.String, boolean, boolean, kotlin.Pair, x00.a, com.baicizhan.main.word_book.list.d2, x00.a, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 H(final List list, final x00.q qVar, LazyListScope LazyColumn) {
        kotlin.jvm.internal.g0.p(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(list.size(), null, new x00.l<Integer, Object>() { // from class: com.baicizhan.main.word_book.list.FavoritesIntentWidgetsKt$ListContent$lambda$0$0$0$0$0$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                list.get(i11);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new x00.r<LazyItemScope, Integer, Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.word_book.list.FavoritesIntentWidgetsKt$ListContent$lambda$0$0$0$0$0$$inlined$itemsIndexed$default$3
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
                if ((i12 & 6) == 0) {
                    i13 = i12 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-1091073711, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = list.get(i11);
                composer.startReplaceGroup(1782537578);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
                qVar.invoke(obj, composer, 0);
                if (i11 < list.size() - 1) {
                    composer.startReplaceGroup(509518132);
                    DividerKt.m1643DivideroMI9zvI(BackgroundKt.m235backgroundbw27NRU$default(companion, bk.b.A0(), null, 2, null), Color.m2508copywmQWz5c$default(bk.b.I(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m5115constructorimpl(1), bk.d.c(), composer, 3462, 0);
                } else {
                    composer.startReplaceGroup(502011854);
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 J(List list, String str, String str2, boolean z11, boolean z12, Pair pair, x00.a aVar, d2 d2Var, x00.a aVar2, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        G(list, str, str2, z11, z12, pair, aVar, d2Var, aVar2, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void K(Modifier modifier, final x00.a<yz.g2> aVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(811438910);
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
            i13 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(811438910, i13, -1, "com.baicizhan.main.word_book.list.MeaningGuideTooltip (FavoritesIntentWidgets.kt:268)");
            }
            Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(modifier4, Dp.m5115constructorimpl(206));
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            boolean z11 = (i13 & 112) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.e1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 L;
                        L = FavoritesIntentWidgetsKt.L(x00.a.this);
                        return L;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m778width3ABfNKs, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getEnd(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m267clickableO2vRcR0$default);
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
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion4, 0.0f, 0.0f, Dp.m5115constructorimpl(18), 0.0f, 11, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f11 = 12;
            Modifier m775sizeVpY3zN4 = SizeKt.m775sizeVpY3zN4(companion4, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(6));
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.word_book.list.p1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 M;
                        M = FavoritesIntentWidgetsKt.M((DrawScope) obj);
                        return M;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CanvasKt.Canvas(m775sizeVpY3zN4, (x00.l) rememberedValue3, startRestartGroup, 54);
            startRestartGroup.endNode();
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(BackgroundKt.m234backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), bk.b.z(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), Dp.m5115constructorimpl(f11));
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
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
            Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            composer2 = startRestartGroup;
            modifier3 = modifier4;
            TextKt.m1845Text4IGK_g("点这里，选择你的目标考试，以匹配更精准的释义", (Modifier) null, bk.b.A0(), bk.d.l(), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200070, 6, 130002);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.v1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 N;
                    N = FavoritesIntentWidgetsKt.N(Modifier.this, aVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            });
        }
    }

    public static final yz.g2 L(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 M(DrawScope Canvas) {
        kotlin.jvm.internal.g0.p(Canvas, "$this$Canvas");
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() >> 32)) / 2, 0.0f);
        Path.lineTo(Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() & 4294967295L)));
        Path.lineTo(0.0f, Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() & 4294967295L)));
        Path.close();
        DrawScope.m3050drawPathLG529CI$default(Canvas, Path, bk.b.z(), 0.0f, Fill.INSTANCE, null, 0, 52, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 N(Modifier modifier, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        K(modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void O(final String str, final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2127720192);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2127720192, i13, -1, "com.baicizhan.main.word_book.list.MeaningSelector (FavoritesIntentWidgets.kt:168)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier k11 = ComposeUtilsKt.k(companion, 0L, false, aVar, 3, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(4)), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, k11);
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
            TextKt.m1845Text4IGK_g(str, (Modifier) null, bk.b.e0(), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, (i13 & 14) | 3456, 0, 131058);
            IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_meaning_switch, composer2, 6), (String) null, SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(16)), Color.Companion.m2545getUnspecified0d7_KjU(), composer2, 3504, 0);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.w1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 P;
                    P = FavoritesIntentWidgetsKt.P(str, aVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return P;
                }
            });
        }
    }

    public static final yz.g2 P(String str, x00.a aVar, int i11, Composer composer, int i12) {
        O(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Q(final d2 d2Var, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-143274853);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(d2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-143274853, i12, -1, "com.baicizhan.main.word_book.list.MeaningTypePopupDialog (FavoritesIntentWidgets.kt:303)");
            }
            boolean z11 = (i12 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.q1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 R;
                        R = FavoritesIntentWidgetsKt.R(d2.this);
                        return R;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            zj.e0.e(false, (x00.a) rememberedValue, ComposableLambdaKt.rememberComposableLambda(330565526, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.r1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 S;
                    S = FavoritesIntentWidgetsKt.S(d2.this, (Composer) obj, ((Integer) obj2).intValue());
                    return S;
                }
            }, startRestartGroup, 54), startRestartGroup, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.s1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 V;
                    V = FavoritesIntentWidgetsKt.V(d2.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return V;
                }
            });
        }
    }

    public static final yz.g2 R(d2 d2Var) {
        d2Var.b().invoke();
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 S(d2 d2Var, Composer composer, int i11) {
        Modifier modifier;
        Modifier modifier2;
        final d2 d2Var2 = d2Var;
        Composer composer2 = composer;
        int i12 = 1;
        ?? r42 = 0;
        int i13 = 2;
        if (composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(330565526, i11, -1, "com.baicizhan.main.word_book.list.MeaningTypePopupDialog.<anonymous> (FavoritesIntentWidgets.kt:305)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 0.0f;
            Object obj = null;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), bk.b.k(), null, 2, null);
            Object rememberedValue = composer2.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            boolean changed = composer2.changed(d2Var2);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changed || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.i1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 T;
                        T = FavoritesIntentWidgetsKt.T(d2.this);
                        return T;
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m235backgroundbw27NRU$default, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m267clickableO2vRcR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, companion3.getTopEnd());
            float f12 = 16;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(BackgroundKt.m234backgroundbw27NRU(SizeKt.m778width3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(align, 0.0f, Dp.m5115constructorimpl(140), Dp.m5115constructorimpl(f12), 0.0f, 9, null), Dp.m5115constructorimpl(144)), bk.b.A0(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), 0.0f, Dp.m5115constructorimpl(8), 1, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m728paddingVpY3zN4$default);
            x00.a<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceGroup(1647533966);
            MeaningType[] values = MeaningType.values();
            int length = values.length;
            int i14 = 0;
            while (i14 < length) {
                final MeaningType meaningType = values[i14];
                int i15 = meaningType == d2Var2.e() ? i12 : r42;
                Modifier.Companion companion5 = Modifier.Companion;
                Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, f11, i12, obj), Dp.m5115constructorimpl(44));
                if (i15 != 0) {
                    modifier = m759height3ABfNKs;
                    modifier2 = BackgroundKt.m235backgroundbw27NRU$default(companion5, ColorKt.Color(1036044500), null, 2, null);
                } else {
                    modifier = m759height3ABfNKs;
                    modifier2 = companion5;
                }
                Modifier then = modifier.then(modifier2);
                boolean changed2 = composer2.changed(d2Var2) | composer2.changed(meaningType.ordinal());
                Object rememberedValue3 = composer2.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.j1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 U;
                            U = FavoritesIntentWidgetsKt.U(d2.this, meaningType);
                            return U;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                Modifier m728paddingVpY3zN4$default2 = PaddingKt.m728paddingVpY3zN4$default(ClickableKt.m269clickableXHw0xAI$default(then, false, null, null, (x00.a) rememberedValue3, 7, null), Dp.m5115constructorimpl(12), f11, i13, obj);
                Alignment.Companion companion6 = Alignment.Companion;
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), r42);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r42);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m728paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor3 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer2);
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String label = meaningType.getLabel();
                int i16 = i13;
                long l11 = bk.d.l();
                FontWeight.Companion companion8 = FontWeight.Companion;
                float f13 = f12;
                Object obj2 = obj;
                int i17 = length;
                MeaningType[] meaningTypeArr = values;
                int i18 = i14;
                TextKt.m1845Text4IGK_g(label, (Modifier) null, bk.b.x(), l11, (FontStyle) null, i15 != 0 ? companion8.getMedium() : companion8.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 130514);
                composer2 = composer;
                if (i15 != 0) {
                    composer2.startReplaceGroup(-104899612);
                    IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_menu_check, composer2, 6), (String) null, boxScopeInstance.align(SizeKt.m773size3ABfNKs(companion5, Dp.m5115constructorimpl(f13)), companion6.getCenterEnd()), Color.Companion.m2545getUnspecified0d7_KjU(), composer2, 3120, 0);
                } else {
                    composer2.startReplaceGroup(-117091602);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                i14 = i18 + 1;
                d2Var2 = d2Var;
                f12 = f13;
                values = meaningTypeArr;
                f11 = 0.0f;
                r42 = 0;
                obj = obj2;
                i12 = 1;
                length = i17;
                i13 = i16;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(d2 d2Var) {
        d2Var.b().invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(d2 d2Var, MeaningType meaningType) {
        d2Var.c().invoke(meaningType);
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(d2 d2Var, int i11, Composer composer, int i12) {
        Q(d2Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void W(@m80.k final Pair<String, ? extends x00.a<yz.g2>> tip, @m80.k final Modifier modifier, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(tip, "tip");
        kotlin.jvm.internal.g0.p(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(1116182750);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(tip) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1116182750, i12, -1, "com.baicizhan.main.word_book.list.TipPopWindow (FavoritesIntentWidgets.kt:363)");
            }
            String component1 = tip.component1();
            final x00.a<yz.g2> component2 = tip.component2();
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(563713613);
                Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), bk.b.z0(), null, 2, null);
                MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.c2
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 X;
                            X = FavoritesIntentWidgetsKt.X();
                            return X;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m235backgroundbw27NRU$default, MutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, startRestartGroup, 48);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m267clickableO2vRcR0$default);
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
                Modifier.Companion companion4 = Modifier.Companion;
                float f11 = 6;
                float f12 = 12;
                float f13 = 8;
                Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(BackgroundKt.m234backgroundbw27NRU(companion4, bk.b.z(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11))), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f13), 0.0f, Dp.m5115constructorimpl(f13), 4, null);
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
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_new_tip, startRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion4, Dp.m5115constructorimpl(f12)), startRestartGroup, 6);
                TextKt.m1845Text4IGK_g(component1, (Modifier) null, bk.b.A0(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 3456, 0, 131058);
                startRestartGroup = startRestartGroup;
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion4, Dp.m5115constructorimpl(f12)), startRestartGroup, 6);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_close_white, startRestartGroup, 6);
                boolean changed = startRestartGroup.changed(component2);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.word_book.list.f1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 Y;
                            Y = FavoritesIntentWidgetsKt.Y(MutableState.this, component2);
                            return Y;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ImageKt.Image(painterResource, (String) null, PaddingKt.m730paddingqDBjuR0$default(ClickableKt.m269clickableXHw0xAI$default(companion4, false, null, null, (x00.a) rememberedValue3, 7, null), 0.0f, 0.0f, Dp.m5115constructorimpl(f13), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                startRestartGroup.endNode();
                Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(SizeKt.m759height3ABfNKs(companion4, Dp.m5115constructorimpl(f11)), Dp.m5115constructorimpl(f12));
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.word_book.list.g1
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 Z;
                            Z = FavoritesIntentWidgetsKt.Z((DrawScope) obj);
                            return Z;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                CanvasKt.Canvas(m778width3ABfNKs, (x00.l) rememberedValue4, startRestartGroup, 54);
                startRestartGroup.endNode();
            } else {
                startRestartGroup.startReplaceGroup(550732580);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.h1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 a02;
                    a02 = FavoritesIntentWidgetsKt.a0(Pair.this, modifier, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return a02;
                }
            });
        }
    }

    public static final yz.g2 X() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y(MutableState mutableState, x00.a aVar) {
        mutableState.setValue(Boolean.FALSE);
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(DrawScope Canvas) {
        kotlin.jvm.internal.g0.p(Canvas, "$this$Canvas");
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, 0.0f);
        Path.lineTo(Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() >> 32)) / 2, Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() & 4294967295L)) - Dp.m5115constructorimpl(1));
        Path.lineTo(Float.intBitsToFloat((int) (Canvas.mo3060getSizeNHjbRc() >> 32)), 0.0f);
        DrawScope.m3050drawPathLG529CI$default(Canvas, Path, bk.b.z(), 0.0f, Fill.INSTANCE, null, 0, 52, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 a0(Pair pair, Modifier modifier, int i11, Composer composer, int i12) {
        W(pair, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0046  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b0(@m80.k final java.lang.String r39, @m80.l com.baicizhan.main.word_book.list.d2 r40, @m80.l x00.a<yz.g2> r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.FavoritesIntentWidgetsKt.b0(java.lang.String, com.baicizhan.main.word_book.list.d2, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 c0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 d0(String str, d2 d2Var, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        b0(str, d2Var, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void e0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1146110346);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1146110346, i11, -1, "com.baicizhan.main.word_book.list.TopLabelPreview (FavoritesIntentWidgets.kt:190)");
            }
            b0(StringResources_androidKt.stringResource(R.string.word_favorites_match_label, new Object[]{32}, startRestartGroup, 6), null, null, startRestartGroup, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.x1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 f02;
                    f02 = FavoritesIntentWidgetsKt.f0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return f02;
                }
            });
        }
    }

    public static final yz.g2 f0(int i11, Composer composer, int i12) {
        e0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void z(final boolean r28, @m80.k final java.lang.String r29, @m80.k final java.lang.String r30, @m80.k final java.lang.String r31, @m80.k final java.lang.String r32, boolean r33, @m80.k final java.util.List<? extends T> r34, boolean r35, @m80.l kotlin.Pair<java.lang.String, ? extends x00.a<yz.g2>> r36, @m80.k final kotlin.Pair<? extends x00.a<yz.g2>, ? extends x00.a<yz.g2>> r37, @m80.l com.baicizhan.main.word_book.list.d2 r38, @m80.l x00.a<yz.g2> r39, @m80.k final x00.q<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r40, @m80.l androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.FavoritesIntentWidgetsKt.z(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, boolean, kotlin.Pair, kotlin.Pair, com.baicizhan.main.word_book.list.d2, x00.a, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
