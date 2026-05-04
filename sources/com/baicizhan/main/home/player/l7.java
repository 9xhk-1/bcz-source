package com.baicizhan.main.home.player;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.extractor.WavUtil;
import com.baicizhan.main.home.player.t6;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLearning.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Learning.kt\ncom/baicizhan/main/home/player/LearningKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 13 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 16 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 17 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 18 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 19 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 20 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,512:1\n75#2:513\n75#2:895\n1#3:514\n113#4:515\n113#4:520\n113#4:557\n113#4:595\n113#4:634\n113#4:639\n113#4:644\n113#4:690\n113#4:724\n113#4:762\n113#4:799\n113#4:833\n113#4:850\n113#4:851\n113#4:896\n113#4:934\n113#4:972\n113#4:977\n113#4:1015\n113#4:1049\n113#4:1092\n113#4:1168\n113#4:1173\n113#4:1178\n118#4:1233\n113#4:1251\n113#4:1256\n113#4:1264\n113#4:1271\n113#4:1276\n113#4:1284\n113#4:1291\n113#4:1296\n113#4:1305\n113#4:1310\n113#4:1316\n30#5:516\n30#5:1257\n30#5:1277\n30#5:1306\n53#6,3:517\n70#6:1249\n53#6,3:1253\n53#6,3:1258\n60#6:1262\n70#6:1266\n53#6,3:1268\n53#6,3:1273\n53#6,3:1278\n60#6:1282\n70#6:1286\n53#6,3:1288\n53#6,3:1293\n70#6:1299\n60#6:1302\n53#6,3:1307\n53#6,3:1312\n80#6:1318\n70#7:521\n68#7,8:522\n70#7:645\n67#7,9:646\n77#7:685\n77#7:689\n70#7:725\n67#7,9:726\n70#7:763\n68#7,8:764\n77#7:841\n77#7:845\n70#7:935\n67#7,9:936\n77#7:976\n70#7:978\n67#7,9:979\n70#7:1056\n68#7,8:1057\n70#7:1130\n66#7,10:1131\n77#7:1172\n77#7:1182\n70#7:1189\n68#7,8:1190\n77#7:1228\n77#7:1243\n79#8,6:530\n86#8,3:545\n89#8,2:554\n79#8,6:568\n86#8,3:583\n89#8,2:592\n79#8,6:607\n86#8,3:622\n89#8,2:631\n93#8:637\n93#8:642\n79#8,6:655\n86#8,3:670\n89#8,2:679\n93#8:684\n93#8:688\n79#8,6:697\n86#8,3:712\n89#8,2:721\n79#8,6:735\n86#8,3:750\n89#8,2:759\n79#8,6:772\n86#8,3:787\n89#8,2:796\n79#8,6:806\n86#8,3:821\n89#8,2:830\n93#8:836\n93#8:840\n93#8:844\n93#8:848\n79#8,6:858\n86#8,3:873\n89#8,2:882\n93#8:887\n79#8,6:907\n86#8,3:922\n89#8,2:931\n79#8,6:945\n86#8,3:960\n89#8,2:969\n93#8:975\n79#8,6:988\n86#8,3:1003\n89#8,2:1012\n79#8,6:1022\n86#8,3:1037\n89#8,2:1046\n79#8,6:1065\n86#8,3:1080\n89#8,2:1089\n79#8,6:1103\n86#8,3:1118\n89#8,2:1127\n79#8,6:1141\n86#8,3:1156\n89#8,2:1165\n93#8:1171\n93#8:1176\n93#8:1181\n79#8,6:1198\n86#8,3:1213\n89#8,2:1222\n93#8:1227\n93#8:1231\n93#8:1242\n93#8:1246\n79#8,6:1330\n86#8,3:1345\n89#8,2:1354\n93#8:1359\n347#9,9:536\n356#9:556\n347#9,9:574\n356#9:594\n347#9,9:613\n356#9:633\n357#9,2:635\n357#9,2:640\n347#9,9:661\n356#9,3:681\n357#9,2:686\n347#9,9:703\n356#9:723\n347#9,9:741\n356#9:761\n347#9,9:778\n356#9:798\n347#9,9:812\n356#9:832\n357#9,2:834\n357#9,2:838\n357#9,2:842\n357#9,2:846\n347#9,9:864\n356#9,3:884\n347#9,9:913\n356#9:933\n347#9,9:951\n356#9:971\n357#9,2:973\n347#9,9:994\n356#9:1014\n347#9,9:1028\n356#9:1048\n347#9,9:1071\n356#9:1091\n347#9,9:1109\n356#9:1129\n347#9,9:1147\n356#9:1167\n357#9,2:1169\n357#9,2:1174\n357#9,2:1179\n347#9,9:1204\n356#9,3:1224\n357#9,2:1229\n357#9,2:1240\n357#9,2:1244\n347#9,9:1336\n356#9,3:1356\n4206#10,6:548\n4206#10,6:586\n4206#10,6:625\n4206#10,6:673\n4206#10,6:715\n4206#10,6:753\n4206#10,6:790\n4206#10,6:824\n4206#10,6:876\n4206#10,6:925\n4206#10,6:963\n4206#10,6:1006\n4206#10,6:1040\n4206#10,6:1083\n4206#10,6:1121\n4206#10,6:1159\n4206#10,6:1216\n4206#10,6:1348\n99#11:558\n96#11,9:559\n106#11:643\n99#11,6:800\n106#11:837\n99#11,6:852\n106#11:888\n99#11:1093\n96#11,9:1094\n106#11:1177\n99#11:1319\n95#11,10:1320\n106#11:1360\n87#12:596\n83#12,10:597\n94#12:638\n87#12,6:691\n94#12:849\n87#12:897\n84#12,9:898\n87#12,6:1016\n94#12:1232\n94#12:1247\n1247#13,6:889\n1247#13,6:1050\n1247#13,6:1183\n1247#13,6:1234\n61#14:1248\n57#14:1261\n61#14:1265\n57#14:1281\n61#14:1285\n61#14:1298\n57#14:1301\n22#15:1250\n22#15:1263\n22#15:1283\n22#15:1300\n22#15:1303\n33#16:1252\n33#16:1272\n33#16:1292\n33#16:1311\n33#17:1267\n33#17:1287\n233#18:1297\n1869#19:1304\n1870#19:1315\n32#20:1317\n*S KotlinDebug\n*F\n+ 1 Learning.kt\ncom/baicizhan/main/home/player/LearningKt\n*L\n78#1:513\n332#1:895\n79#1:515\n139#1:520\n141#1:557\n145#1:595\n152#1:634\n159#1:639\n164#1:644\n213#1:690\n214#1:724\n223#1:762\n225#1:799\n236#1:833\n299#1:850\n303#1:851\n333#1:896\n334#1:934\n340#1:972\n361#1:977\n362#1:1015\n363#1:1049\n416#1:1092\n424#1:1168\n442#1:1173\n446#1:1178\n467#1:1233\n365#1:1251\n369#1:1256\n370#1:1264\n371#1:1271\n373#1:1276\n374#1:1284\n379#1:1291\n384#1:1296\n401#1:1305\n402#1:1310\n411#1:1316\n79#1:516\n369#1:1257\n373#1:1277\n401#1:1306\n79#1:517,3\n365#1:1249\n365#1:1253,3\n369#1:1258,3\n370#1:1262\n370#1:1266\n370#1:1268,3\n371#1:1273,3\n373#1:1278,3\n374#1:1282\n374#1:1286\n374#1:1288,3\n379#1:1293,3\n394#1:1299\n396#1:1302\n401#1:1307,3\n402#1:1312,3\n449#1:1318\n139#1:521\n139#1:522,8\n164#1:645\n164#1:646,9\n164#1:685\n139#1:689\n214#1:725\n214#1:726,9\n223#1:763\n223#1:764,8\n223#1:841\n214#1:845\n334#1:935\n334#1:936,9\n334#1:976\n361#1:978\n361#1:979,9\n363#1:1056\n363#1:1057,8\n417#1:1130\n417#1:1131,10\n417#1:1172\n363#1:1182\n449#1:1189\n449#1:1190,8\n449#1:1228\n361#1:1243\n139#1:530,6\n139#1:545,3\n139#1:554,2\n141#1:568,6\n141#1:583,3\n141#1:592,2\n147#1:607,6\n147#1:622,3\n147#1:631,2\n147#1:637\n141#1:642\n164#1:655,6\n164#1:670,3\n164#1:679,2\n164#1:684\n139#1:688\n213#1:697,6\n213#1:712,3\n213#1:721,2\n214#1:735,6\n214#1:750,3\n214#1:759,2\n223#1:772,6\n223#1:787,3\n223#1:796,2\n227#1:806,6\n227#1:821,3\n227#1:830,2\n227#1:836\n223#1:840\n214#1:844\n213#1:848\n297#1:858,6\n297#1:873,3\n297#1:882,2\n297#1:887\n333#1:907,6\n333#1:922,3\n333#1:931,2\n334#1:945,6\n334#1:960,3\n334#1:969,2\n334#1:975\n361#1:988,6\n361#1:1003,3\n361#1:1012,2\n362#1:1022,6\n362#1:1037,3\n362#1:1046,2\n363#1:1065,6\n363#1:1080,3\n363#1:1089,2\n416#1:1103,6\n416#1:1118,3\n416#1:1127,2\n417#1:1141,6\n417#1:1156,3\n417#1:1165,2\n417#1:1171\n416#1:1176\n363#1:1181\n449#1:1198,6\n449#1:1213,3\n449#1:1222,2\n449#1:1227\n362#1:1231\n361#1:1242\n333#1:1246\n455#1:1330,6\n455#1:1345,3\n455#1:1354,2\n455#1:1359\n139#1:536,9\n139#1:556\n141#1:574,9\n141#1:594\n147#1:613,9\n147#1:633\n147#1:635,2\n141#1:640,2\n164#1:661,9\n164#1:681,3\n139#1:686,2\n213#1:703,9\n213#1:723\n214#1:741,9\n214#1:761\n223#1:778,9\n223#1:798\n227#1:812,9\n227#1:832\n227#1:834,2\n223#1:838,2\n214#1:842,2\n213#1:846,2\n297#1:864,9\n297#1:884,3\n333#1:913,9\n333#1:933\n334#1:951,9\n334#1:971\n334#1:973,2\n361#1:994,9\n361#1:1014\n362#1:1028,9\n362#1:1048\n363#1:1071,9\n363#1:1091\n416#1:1109,9\n416#1:1129\n417#1:1147,9\n417#1:1167\n417#1:1169,2\n416#1:1174,2\n363#1:1179,2\n449#1:1204,9\n449#1:1224,3\n362#1:1229,2\n361#1:1240,2\n333#1:1244,2\n455#1:1336,9\n455#1:1356,3\n139#1:548,6\n141#1:586,6\n147#1:625,6\n164#1:673,6\n213#1:715,6\n214#1:753,6\n223#1:790,6\n227#1:824,6\n297#1:876,6\n333#1:925,6\n334#1:963,6\n361#1:1006,6\n362#1:1040,6\n363#1:1083,6\n416#1:1121,6\n417#1:1159,6\n449#1:1216,6\n455#1:1348,6\n141#1:558\n141#1:559,9\n141#1:643\n227#1:800,6\n227#1:837\n297#1:852,6\n297#1:888\n416#1:1093\n416#1:1094,9\n416#1:1177\n455#1:1319\n455#1:1320,10\n455#1:1360\n147#1:596\n147#1:597,10\n147#1:638\n213#1:691,6\n213#1:849\n333#1:897\n333#1:898,9\n362#1:1016,6\n362#1:1232\n333#1:1247\n330#1:889,6\n363#1:1050,6\n449#1:1183,6\n467#1:1234,6\n365#1:1248\n370#1:1261\n370#1:1265\n374#1:1281\n374#1:1285\n394#1:1298\n396#1:1301\n365#1:1250\n370#1:1263\n374#1:1283\n394#1:1300\n396#1:1303\n365#1:1252\n371#1:1272\n379#1:1292\n402#1:1311\n370#1:1267\n374#1:1287\n385#1:1297\n397#1:1304\n397#1:1315\n449#1:1317\n*E\n"})
/* loaded from: classes4.dex */
public final class l7 {
    /* JADX WARN: Removed duplicated region for block: B:143:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(@m80.l androidx.compose.ui.Modifier r88, @m80.k final java.lang.String r89, @androidx.annotation.DrawableRes int r90, @m80.l java.lang.String r91, @androidx.annotation.DrawableRes int r92, @androidx.annotation.DrawableRes int r93, @m80.l androidx.compose.runtime.MutableState<com.baicizhan.platform.base.widget.n2> r94, @m80.l java.lang.String r95, @m80.k final x00.a<yz.g2> r96, @m80.l androidx.compose.runtime.Composer r97, final int r98, final int r99) {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.l7.A(androidx.compose.ui.Modifier, java.lang.String, int, java.lang.String, int, int, androidx.compose.runtime.MutableState, java.lang.String, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 B(Modifier modifier, MutableState mutableState, u6 u6Var, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        z(modifier, mutableState, u6Var, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 C(Modifier modifier, String str, int i11, String str2, int i12, int i13, MutableState mutableState, String str3, x00.a aVar, int i14, int i15, Composer composer, int i16) {
        A(modifier, str, i11, str2, i12, i13, mutableState, str3, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i14 | 1), i15);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void D(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1668063947);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1668063947, i11, -1, "com.baicizhan.main.home.player.LearningButtonPreview (Learning.kt:179)");
            }
            bk.k.h(null, null, null, o0.f23821a.m(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.y6
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E;
                    E = l7.E(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            });
        }
    }

    public static final yz.g2 E(int i11, Composer composer, int i12) {
        D(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4286368497L, showBackground = true)
    public static final void F(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(664060774);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(664060774, i11, -1, "com.baicizhan.main.home.player.PlanInfo (Learning.kt:474)");
            }
            bk.k.h(null, null, null, o0.f23821a.o(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.k7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = l7.O(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void G(@m80.l Modifier modifier, @m80.k final String name, final int i11, final int i12, @m80.k final String tag, boolean z11, @m80.l zj.d dVar, @m80.l x00.q<? super Modifier, ? super Composer, ? super Integer, yz.g2> qVar, @m80.l x00.a<yz.g2> aVar, @m80.l x00.a<yz.g2> aVar2, @m80.l Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        boolean z12;
        zj.d dVar2;
        x00.q<? super Modifier, ? super Composer, ? super Integer, yz.g2> qVar2;
        final x00.a<yz.g2> aVar3;
        final boolean z13;
        final zj.d dVar3;
        final Modifier modifier3;
        final x00.q<? super Modifier, ? super Composer, ? super Integer, yz.g2> qVar3;
        final x00.a<yz.g2> aVar4;
        x00.a<yz.g2> aVar5;
        TextStyle m4604mergedA7vx0o;
        x00.q<? super Modifier, ? super Composer, ? super Integer, yz.g2> qVar4;
        final x00.a<yz.g2> aVar6;
        final x00.a<yz.g2> aVar7;
        final int i16;
        int i17;
        final int i18;
        int i19;
        int i21;
        MaterialTheme materialTheme;
        int i22;
        int i23;
        BoxScopeInstance boxScopeInstance;
        TextStyle m4604mergedA7vx0o2;
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(tag, "tag");
        Composer startRestartGroup = composer.startRestartGroup(-960048683);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
            i15 |= startRestartGroup.changed(name) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= startRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= startRestartGroup.changed(i12) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= startRestartGroup.changed(tag) ? 16384 : 8192;
        }
        int i25 = i14 & 32;
        if (i25 != 0) {
            i15 |= 196608;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i13 & 196608) == 0) {
                i15 |= startRestartGroup.changed(z12) ? 131072 : 65536;
            }
        }
        int i26 = i14 & 64;
        if (i26 != 0) {
            i15 |= 1572864;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i13 & 1572864) == 0) {
                i15 |= startRestartGroup.changed(dVar2) ? 1048576 : 524288;
            }
        }
        int i27 = i14 & 128;
        if (i27 != 0) {
            i15 |= 12582912;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((i13 & 12582912) == 0) {
                i15 |= startRestartGroup.changedInstance(qVar2) ? 8388608 : 4194304;
            }
        }
        int i28 = i14 & 256;
        if (i28 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            i15 |= startRestartGroup.changedInstance(aVar) ? 67108864 : 33554432;
        }
        int i29 = i14 & 512;
        if (i29 != 0) {
            i15 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            i15 |= startRestartGroup.changedInstance(aVar2) ? 536870912 : 268435456;
        }
        if (startRestartGroup.shouldExecute((i15 & 306783379) != 306783378, i15 & 1)) {
            Modifier modifier4 = i24 != 0 ? Modifier.Companion : modifier2;
            boolean z14 = i25 != 0 ? true : z12;
            if (i26 != 0) {
                dVar2 = null;
            }
            if (i27 != 0) {
                qVar2 = null;
            }
            x00.a<yz.g2> aVar8 = i28 != 0 ? null : aVar;
            if (i29 != 0) {
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.v6
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 H;
                            H = l7.H();
                            return H;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                aVar5 = (x00.a) rememberedValue;
            } else {
                aVar5 = aVar2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-960048683, i15, -1, "com.baicizhan.main.home.player.PlanInfo (Learning.kt:330)");
            }
            final Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier.Companion companion = Modifier.Companion;
            Modifier then = modifier4.then(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(192)));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            x00.a<yz.g2> aVar9 = aVar5;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, startRestartGroup, 48);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m5115constructorimpl(3), 7, null);
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
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            long Color = ColorKt.Color(4281620907L);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i31 = MaterialTheme.$stable;
            TextStyle h32 = materialTheme2.getTypography(startRestartGroup, i31).getH3();
            float f11 = 2;
            float mo377toPx0680j_4 = density.mo377toPx0680j_4(Dp.m5115constructorimpl(f11));
            StrokeJoin.Companion companion4 = StrokeJoin.Companion;
            m4604mergedA7vx0o = h32.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : new Stroke(mo377toPx0680j_4, 0.0f, 0, companion4.m2874getRoundLxFBmk8(), null, 22, null), (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
            TextOverflow.Companion companion5 = TextOverflow.Companion;
            x00.q<? super Modifier, ? super Composer, ? super Integer, yz.g2> qVar5 = qVar2;
            int m5029getEllipsisgIe3tQ8 = companion5.m5029getEllipsisgIe3tQ8();
            TextAlign.Companion companion6 = TextAlign.Companion;
            Modifier modifier5 = modifier4;
            int i32 = ((i15 >> 3) & 14) | 432;
            x00.a<yz.g2> aVar10 = aVar8;
            int i33 = i15;
            zj.d dVar4 = dVar2;
            TextKt.m1845Text4IGK_g(name, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(companion6.m4977getCentere0LSkKk()), 0L, m5029getEllipsisgIe3tQ8, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4604mergedA7vx0o, startRestartGroup, i32, 3120, 54776);
            Color.Companion companion7 = Color.Companion;
            TextKt.m1845Text4IGK_g(name, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion7.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(companion6.m4977getCentere0LSkKk()), 0L, companion5.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, materialTheme2.getTypography(startRestartGroup, i31).getH3(), startRestartGroup, i32, 3120, 54776);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            if (z14) {
                startRestartGroup.startReplaceGroup(-1703651581);
                Modifier m2669graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(zj.z.o(companion, dVar4, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(16))), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m2669graphicsLayerAp8cVGQ$default);
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
                float f12 = 9;
                Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion, Dp.m5115constructorimpl(7), Dp.m5115constructorimpl(f12));
                float f13 = -1;
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f13)), companion2.getCenterHorizontally(), startRestartGroup, 54);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
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
                Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
                Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(22));
                boolean changed = ((i33 & 896) == 256) | ((i33 & 7168) == 2048) | startRestartGroup.changed(density);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    i16 = i11;
                    i17 = 16;
                    i18 = i12;
                    rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.player.c7
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 I;
                            I = l7.I(i16, i18, density, (DrawScope) obj);
                            return I;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    i16 = i11;
                    i17 = 16;
                    i18 = i12;
                }
                Modifier m2669graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(DrawModifierKt.drawBehind(m759height3ABfNKs, (x00.l) rememberedValue2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m2669graphicsLayerAp8cVGQ$default2);
                x00.a<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1951constructorimpl5 = Updater.m1951constructorimpl(startRestartGroup);
                Updater.m1958setimpl(m1951constructorimpl5, maybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl5.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m1951constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m1951constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m1958setimpl(m1951constructorimpl5, materializeModifier5, companion3.getSetModifier());
                qVar4 = qVar5;
                if (i16 < i18 || qVar4 == null) {
                    f12 = 0;
                }
                Modifier m685offsetVpY3zN4 = OffsetKt.m685offsetVpY3zN4(companion, Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f13));
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 48);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m685offsetVpY3zN4);
                x00.a<ComposeUiNode> constructor6 = companion3.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor6);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1951constructorimpl6 = Updater.m1951constructorimpl(startRestartGroup);
                Updater.m1958setimpl(m1951constructorimpl6, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl6.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    m1951constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m1951constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m1958setimpl(m1951constructorimpl6, materializeModifier6, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                x00.a<ComposeUiNode> constructor7 = companion3.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor7);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1951constructorimpl7 = Updater.m1951constructorimpl(startRestartGroup);
                Updater.m1958setimpl(m1951constructorimpl7, maybeCachedBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl7.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    m1951constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m1951constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m1958setimpl(m1951constructorimpl7, materializeModifier7, companion3.getSetModifier());
                if (i16 / i18 >= 0.5f) {
                    startRestartGroup.startReplaceGroup(1220850156);
                    long Color2 = ColorKt.Color(4278758260L);
                    materialTheme = materialTheme2;
                    i22 = i31;
                    m4604mergedA7vx0o2 = materialTheme.getTypography(startRestartGroup, i22).getH5().m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : new Stroke(density.mo377toPx0680j_4(Dp.m5115constructorimpl(f11)), 0.0f, 0, companion4.m2874getRoundLxFBmk8(), null, 22, null), (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
                    i21 = i11;
                    dVar4 = dVar4;
                    i19 = i33;
                    i23 = 54;
                    TextKt.m1845Text4IGK_g(i16 + "/" + i18, (Modifier) null, Color2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i17), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4604mergedA7vx0o2, startRestartGroup, 384, 6, 64506);
                    startRestartGroup = startRestartGroup;
                } else {
                    dVar4 = dVar4;
                    i19 = i33;
                    i21 = i16;
                    materialTheme = materialTheme2;
                    i22 = i31;
                    i23 = 54;
                    startRestartGroup.startReplaceGroup(1202773808);
                }
                startRestartGroup.endReplaceGroup();
                Composer composer2 = startRestartGroup;
                TextKt.m1845Text4IGK_g(i21 + "/" + i18, (Modifier) null, Color.m2508copywmQWz5c$default(companion7.m2546getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i17), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, materialTheme.getTypography(startRestartGroup, i22).getH5(), composer2, 384, 6, 64506);
                startRestartGroup = composer2;
                startRestartGroup.endNode();
                if (i21 < i18 || qVar4 == null) {
                    startRestartGroup.startReplaceGroup(452472758);
                } else {
                    startRestartGroup.startReplaceGroup(471771033);
                    ImageKt.Image(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_home_progress_check_simple, startRestartGroup, i23), "checked-simple", PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (i21 < i18 || qVar4 != null) {
                    boxScopeInstance = boxScopeInstance2;
                    startRestartGroup.startReplaceGroup(-1849657702);
                } else {
                    startRestartGroup.startReplaceGroup(-1830078939);
                    boxScopeInstance = boxScopeInstance2;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_learning_progress_checked, startRestartGroup, 6), "checked", boxScopeInstance2.align(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(21)), companion2.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                Modifier m2669graphicsLayerAp8cVGQ$default3 = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                Composer.Companion companion8 = Composer.Companion;
                if (rememberedValue3 == companion8.getEmpty()) {
                    rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.player.d7
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            IntOffset J;
                            J = l7.J((Density) obj);
                            return J;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Modifier offset = OffsetKt.offset(m2669graphicsLayerAp8cVGQ$default3, (x00.l) rememberedValue3);
                boolean z15 = (i19 & 1879048192) == 536870912;
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z15 || rememberedValue4 == companion8.getEmpty()) {
                    aVar7 = aVar9;
                    rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.player.e7
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 K;
                            K = l7.K(x00.a.this);
                            return K;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    aVar7 = aVar9;
                }
                Modifier k11 = ComposeUtilsKt.k(offset, 0L, false, (x00.a) rememberedValue4, 3, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopCenter(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, k11);
                x00.a<ComposeUiNode> constructor8 = companion3.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1951constructorimpl8 = Updater.m1951constructorimpl(startRestartGroup);
                Updater.m1958setimpl(m1951constructorimpl8, maybeCachedBoxMeasurePolicy5, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl8, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl8.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m1951constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m1951constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m1958setimpl(m1951constructorimpl8, materializeModifier8, companion3.getSetModifier());
                boolean z16 = false;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_home_plan_info_bottom, startRestartGroup, 6), "bottom", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(ColorKt.Color(4281620907L))), ComposableLambdaKt.rememberComposableLambda(-683976801, true, new x00.p() { // from class: com.baicizhan.main.home.player.f7
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 L;
                        L = l7.L(tag, (Composer) obj, ((Integer) obj2).intValue());
                        return L;
                    }
                }, startRestartGroup, i23), startRestartGroup, ProvidedValue.$stable | 48);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (i21 < i18 || qVar4 == null) {
                    aVar6 = aVar10;
                    startRestartGroup.startReplaceGroup(-334952810);
                } else {
                    startRestartGroup.startReplaceGroup(-314166783);
                    Modifier align = boxScopeInstance.align(OffsetKt.m686offsetVpY3zN4$default(companion, Dp.m5115constructorimpl((float) 6.5d), 0.0f, 2, null), companion2.getTopEnd());
                    if ((i19 & 234881024) == 67108864) {
                        z16 = true;
                    }
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (z16 || rememberedValue5 == companion8.getEmpty()) {
                        aVar6 = aVar10;
                        rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.player.g7
                            @Override // x00.a
                            public final Object invoke() {
                                yz.g2 M;
                                M = l7.M(x00.a.this);
                                return M;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    } else {
                        aVar6 = aVar10;
                    }
                    qVar4.invoke(ComposeUtilsKt.k(align, 0L, false, (x00.a) rememberedValue5, 3, null), startRestartGroup, Integer.valueOf((i19 >> 18) & 112));
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
            } else {
                qVar4 = qVar5;
                aVar6 = aVar10;
                aVar7 = aVar9;
                startRestartGroup.startReplaceGroup(-1287653801);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            qVar3 = qVar4;
            aVar3 = aVar6;
            aVar4 = aVar7;
            z13 = z14;
            modifier3 = modifier5;
            dVar3 = dVar4;
        } else {
            startRestartGroup.skipToGroupEnd();
            aVar3 = aVar;
            z13 = z12;
            dVar3 = dVar2;
            modifier3 = modifier2;
            qVar3 = qVar2;
            aVar4 = aVar2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.h7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 N;
                    N = l7.N(Modifier.this, name, i11, i12, tag, z13, dVar3, qVar3, aVar3, aVar4, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            });
        }
    }

    public static final yz.g2 H() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(int i11, int i12, Density density, DrawScope drawBehind) {
        int i13;
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        long Color = ColorKt.Color(4294900986L);
        float f11 = 1;
        long m2330copyxjbvk4A$default = Size.m2330copyxjbvk4A$default(drawBehind.mo3060getSizeNHjbRc(), 0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f11)), 1, null);
        float f12 = 100;
        float mo377toPx0680j_4 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
        float mo377toPx0680j_42 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
        DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, Color, 0L, m2330copyxjbvk4A$default, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_4) << 32)), null, 0.0f, null, 0, R.styleable.Theme_drawable_time, null);
        if (i11 < i12) {
            long Color2 = ColorKt.Color(4281620907L);
            float f13 = 2;
            float mo377toPx0680j_43 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13));
            float mo377toPx0680j_44 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13));
            long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_43) << 32) | (Float.floatToRawIntBits(mo377toPx0680j_44) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(4));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(5));
            long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            float mo377toPx0680j_45 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
            float mo377toPx0680j_46 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
            i13 = 2;
            DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, Color2, m2260constructorimpl, m2328constructorimpl, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_46) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_45) << 32)), null, 0.0f, null, 0, 240, null);
        } else {
            i13 = 2;
        }
        float f14 = i13;
        float mo377toPx0680j_47 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f14)) - 0.5f;
        float mo377toPx0680j_48 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f14)) - 0.5f;
        long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_47) << 32) | (Float.floatToRawIntBits(mo377toPx0680j_48) & 4294967295L));
        float f15 = 4;
        float max = Math.max((Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f15))) * Math.min(i11 / i12, 1.0f), drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(17))) + f11;
        float f16 = 5;
        float intBitsToFloat3 = (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f16))) + f11;
        long m2328constructorimpl2 = Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
        long Color3 = ColorKt.Color(4281265578L);
        float mo377toPx0680j_49 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
        float mo377toPx0680j_410 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
        long j11 = m2328constructorimpl2;
        DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, Color3, m2260constructorimpl2, j11, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_410) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_49) << 32)), null, 0.0f, null, 0, 240, null);
        DrawScope drawScope = drawBehind;
        Color.Companion companion = Color.Companion;
        long m2535getBlack0d7_KjU = companion.m2535getBlack0d7_KjU();
        float mo377toPx0680j_411 = drawScope.mo377toPx0680j_4(Dp.m5115constructorimpl(f15));
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        canvas.saveLayer(RectKt.m2308Recttz77jQw(m2260constructorimpl2, j11), AndroidPaint_androidKt.Paint());
        List Q = a00.h0.Q(Color.m2499boximpl(Color.m2508copywmQWz5c$default(m2535getBlack0d7_KjU, 0.17f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2499boximpl(Color.m2508copywmQWz5c$default(m2535getBlack0d7_KjU, 0.085f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m2499boximpl(companion.m2544getTransparent0d7_KjU()));
        Brush.Companion companion2 = Brush.Companion;
        Brush m2466verticalGradient8A3gB4$default = Brush.Companion.m2466verticalGradient8A3gB4$default(companion2, Q, 0.0f, mo377toPx0680j_411 * 1.5f, 0, 8, (Object) null);
        List list = Q;
        int i14 = (int) (j11 & 4294967295L);
        Brush m2466verticalGradient8A3gB4$default2 = Brush.Companion.m2466verticalGradient8A3gB4$default(companion2, a00.r0.c5(list), Float.intBitsToFloat(i14) - mo377toPx0680j_411, Float.intBitsToFloat(i14) + mo377toPx0680j_411, 0, 8, (Object) null);
        Brush m2458horizontalGradient8A3gB4$default = Brush.Companion.m2458horizontalGradient8A3gB4$default(companion2, Q, 0.0f, mo377toPx0680j_411 * 2.0f, 0, 8, (Object) null);
        List c52 = a00.r0.c5(list);
        int i15 = (int) (j11 >> 32);
        for (Brush brush : a00.h0.Q(m2466verticalGradient8A3gB4$default, m2466verticalGradient8A3gB4$default2, m2458horizontalGradient8A3gB4$default, Brush.Companion.m2458horizontalGradient8A3gB4$default(companion2, c52, Float.intBitsToFloat(i15) - mo377toPx0680j_411, Float.intBitsToFloat(i15) + mo377toPx0680j_411, 0, 8, (Object) null))) {
            float mo377toPx0680j_412 = drawScope.mo377toPx0680j_4(Dp.m5115constructorimpl(f14)) - 0.5f;
            float mo377toPx0680j_413 = drawScope.mo377toPx0680j_4(Dp.m5115constructorimpl(f14)) - 0.5f;
            long m2260constructorimpl3 = Offset.m2260constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_413) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_412) << 32));
            float mo377toPx0680j_414 = drawScope.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
            float mo377toPx0680j_415 = drawScope.mo377toPx0680j_4(Dp.m5115constructorimpl(f12));
            long j12 = j11;
            DrawScope.m3055drawRoundRectZuiqVtQ$default(drawBehind, brush, m2260constructorimpl3, j12, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_414) << 32) | (Float.floatToRawIntBits(mo377toPx0680j_415) & 4294967295L)), 0.0f, null, null, BlendMode.Companion.m2451getSrcOver0nO6VwU(), 112, null);
            j11 = j12;
            drawScope = drawBehind;
        }
        canvas.restore();
        Path path$default = PathParser.toPath$default(new PathParser().parsePathString("M0.9325,3.3658a1.5459,2.3876 71.2434,1 0,4.2373 -2.0818a1.5459,2.3876 71.2434,1 0,-4.2373 2.0818z"), null, 1, null);
        float[] m2739constructorimpl$default = Matrix.m2739constructorimpl$default(null, 1, null);
        Matrix.m2761translateimpl$default(m2739constructorimpl$default, drawScope.mo377toPx0680j_4(Dp.m5115constructorimpl(6)), drawScope.mo377toPx0680j_4(Dp.m5115constructorimpl(f16)), 0.0f, 4, null);
        Matrix.m2755scaleimpl$default(m2739constructorimpl$default, density.getDensity(), density.getDensity(), 0.0f, 4, null);
        path$default.mo2403transform58bKbWc(m2739constructorimpl$default);
        DrawScope.m3050drawPathLG529CI$default(drawBehind, path$default, Color.Companion.m2546getWhite0d7_KjU(), 0.0f, null, null, 0, 60, null);
        return yz.g2.f100423a;
    }

    public static final IntOffset J(Density offset) {
        kotlin.jvm.internal.g0.p(offset, "$this$offset");
        return IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((0 << 32) | ((-1) & 4294967295L)));
    }

    public static final yz.g2 K(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 L(String str, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-683976801, i11, -1, "com.baicizhan.main.home.player.PlanInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Learning.kt:454)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getCaption(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_home_arrow_right_sharp, composer, 6), "arrow", (Modifier) null, 0L, composer, 48, 12);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 M(x00.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 N(Modifier modifier, String str, int i11, int i12, String str2, boolean z11, zj.d dVar, x00.q qVar, x00.a aVar, x00.a aVar2, int i13, int i14, Composer composer, int i15) {
        G(modifier, str, i11, i12, str2, z11, dVar, qVar, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return yz.g2.f100423a;
    }

    public static final yz.g2 O(int i11, Composer composer, int i12) {
        F(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @Composable
    @m80.k
    public static final TextStyle P(@m80.k TextStyle shadowed, long j11, int i11, @m80.l Composer composer, int i12, int i13) {
        kotlin.jvm.internal.g0.p(shadowed, "$this$shadowed");
        long m2508copywmQWz5c$default = (i13 & 1) != 0 ? Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        int i14 = (i13 & 2) != 0 ? 0 : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1116497676, i12, -1, "com.baicizhan.main.home.player.shadowed (Learning.kt:76)");
        }
        TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(shadowed, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, new Shadow(m2508copywmQWz5c$default, Offset.m2260constructorimpl((Float.floatToRawIntBits(r2.mo377toPx0680j_4(Dp.m5115constructorimpl(1))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo377toPx0680j_4(Dp.m5115constructorimpl(i14)), null), null, 0, 0, 0L, null, null, null, 0, 0, null, 16769023, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m4572copyp1EtxEg$default;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q(@m80.l Modifier modifier, @m80.k final s6 item, @m80.l Composer composer, final int i11, final int i12) {
        final Modifier modifier2;
        int i13;
        kotlin.jvm.internal.g0.p(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(2068415809);
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
            i13 |= startRestartGroup.changed(item) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2068415809, i13, -1, "com.baicizhan.main.home.player.LayerEntry (Learning.kt:211)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            float f11 = 2;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), centerHorizontally, startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
            Modifier.Companion companion3 = Modifier.Companion;
            float f12 = 48;
            Modifier m2669graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(SizeKt.m773size3ABfNKs(companion3, Dp.m5115constructorimpl(f12)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m2669graphicsLayerAp8cVGQ$default);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifier4 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(item.f(), startRestartGroup, 0), "entry-icon", SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
            if (item.g() != null) {
                startRestartGroup.startReplaceGroup(-1391742648);
                Modifier m686offsetVpY3zN4$default = OffsetKt.m686offsetVpY3zN4$default(boxScopeInstance.align(SizeKt.m775sizeVpY3zN4(companion3, Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(18)), companion.getBottomCenter()), 0.0f, Dp.m5115constructorimpl(f11), 1, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m686offsetVpY3zN4$default);
                x00.a<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion2.getSetModifier());
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                Color.Companion companion4 = Color.Companion;
                BoxKt.Box(BackgroundKt.m234backgroundbw27NRU(fillMaxSize$default, Color.m2508copywmQWz5c$default(companion4.m2535getBlack0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100))), startRestartGroup, 0);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion.getCenterVertically(), startRestartGroup, 54);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                x00.a<ComposeUiNode> constructor4 = companion2.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion2.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (item.g() instanceof t6.a) {
                    startRestartGroup.startReplaceGroup(127096929);
                    ImageKt.Image(PainterResources_androidKt.painterResource(((t6.a) item.g()).f(), startRestartGroup, 0), "label-icon", SizeKt.m773size3ABfNKs(companion3, Dp.m5115constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                } else {
                    startRestartGroup.startReplaceGroup(117244354);
                }
                startRestartGroup.endReplaceGroup();
                TextKt.m1845Text4IGK_g(item.g().a(), (Modifier) null, companion4.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getOverline(), startRestartGroup, 196992, 3072, 57306);
                startRestartGroup = startRestartGroup;
                startRestartGroup.endNode();
                startRestartGroup.endNode();
            } else {
                startRestartGroup.startReplaceGroup(-203584739);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            Composer composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(item.h(), (Modifier) null, Color.Companion.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getH5(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 384, 3072, 57338);
            startRestartGroup = composer2;
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.j7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 r11;
                    r11 = l7.r(Modifier.this, item, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return r11;
                }
            });
        }
    }

    public static final yz.g2 r(Modifier modifier, s6 s6Var, int i11, int i12, Composer composer, int i13) {
        q(modifier, s6Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4287137928L, device = "spec:width=68dp,height=76dp,dpi=480,isRound=false,chinSize=0dp", showBackground = true)
    public static final void s(@PreviewParameter(provider = r6.class) @m80.k final s6 item, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-620154668);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-620154668, i12, -1, "com.baicizhan.main.home.player.LayerEntryPreview (Learning.kt:281)");
            }
            bk.k.h(null, null, null, ComposableLambdaKt.rememberComposableLambda(1004765562, true, new x00.p() { // from class: com.baicizhan.main.home.player.a7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t11;
                    t11 = l7.t(s6.this, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.b7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 u11;
                    u11 = l7.u(s6.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t(s6 s6Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1004765562, i11, -1, "com.baicizhan.main.home.player.LayerEntryPreview.<anonymous> (Learning.kt:283)");
            }
            q(null, s6Var, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 u(s6 s6Var, int i11, Composer composer, int i12) {
        s(s6Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void v(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(784364075);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(784364075, i11, -1, "com.baicizhan.main.home.player.LearnSwitch (Learning.kt:311)");
            }
            bk.k.e(null, null, null, o0.f23821a.n(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.x6
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 y11;
                    y11 = l7.y(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return y11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void w(@m80.l Modifier modifier, @m80.k final String title, @m80.k final x00.a<yz.g2> onSwitch, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(onSwitch, "onSwitch");
        Composer startRestartGroup = composer.startRestartGroup(-965326827);
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
            i13 |= startRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(onSwitch) ? 256 : 128;
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((i15 & 147) != 146, i15 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-965326827, i15, -1, "com.baicizhan.main.home.player.LearnSwitch (Learning.kt:295)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Color.Companion companion2 = Color.Companion;
            float f11 = 100;
            Modifier then = modifier4.then(ComposeUtilsKt.k(PaddingKt.m727paddingVpY3zN4(BackgroundKt.m234backgroundbw27NRU(companion, Color.m2508copywmQWz5c$default(companion2.m2546getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f11), 0.0f, 0.0f, Dp.m5115constructorimpl(f11), 6, null)), Dp.m5115constructorimpl(12), Dp.m5115constructorimpl(10)), 0L, false, onSwitch, 3, null));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(4)), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifier5 = modifier4;
            ImageKt.Image(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_home_learn_switch, startRestartGroup, 54), "switch", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            TextKt.m1845Text4IGK_g(title, (Modifier) null, companion2.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getSubtitle2(), startRestartGroup, ((i15 >> 3) & 14) | 384, 0, 65530);
            composer2 = startRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.i7
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 x11;
                    x11 = l7.x(Modifier.this, title, onSwitch, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    public static final yz.g2 x(Modifier modifier, String str, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        w(modifier, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 y(int i11, Composer composer, int i12) {
        v(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(@m80.l androidx.compose.ui.Modifier r16, @m80.l androidx.compose.runtime.MutableState<com.baicizhan.platform.base.widget.n2> r17, @m80.k final com.baicizhan.main.home.player.u6 r18, @m80.k final x00.a<yz.g2> r19, @m80.l androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.l7.z(androidx.compose.ui.Modifier, androidx.compose.runtime.MutableState, com.baicizhan.main.home.player.u6, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }
}
