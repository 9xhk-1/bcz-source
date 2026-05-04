package fd;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
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
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.WavUtil;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.TrainingActivity;
import com.google.accompanist.pager.Pager;
import com.jiongji.andriod.card.R;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTrainingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingActivity.kt\ncom/baicizhan/main/activity/TrainingActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 15 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,612:1\n1247#2,6:613\n1247#2,6:619\n1247#2,6:755\n1247#2,6:763\n1247#2,6:852\n1247#2,6:858\n1247#2,6:1263\n1247#2,6:1270\n1247#2,6:1276\n1247#2,6:1283\n1247#2,6:1290\n1247#2,6:1296\n1247#2,6:1302\n1247#2,6:1351\n1247#2,6:1443\n1247#2,6:1524\n113#3:625\n113#3:626\n113#3:664\n113#3:702\n113#3:703\n113#3:704\n113#3:750\n113#3:761\n113#3:807\n113#3:808\n113#3:846\n113#3:847\n113#3:848\n113#3:849\n113#3:851\n113#3:872\n113#3:950\n113#3:951\n113#3:952\n113#3:957\n113#3:1042\n113#3:1048\n113#3:1096\n113#3:1108\n113#3:1109\n113#3:1194\n113#3:1200\n113#3:1248\n113#3:1269\n113#3:1282\n113#3:1289\n113#3:1358\n113#3:1440\n113#3:1441\n113#3:1442\n113#3:1523\n113#3:1580\n70#4:627\n67#4,9:628\n77#4:712\n70#4:713\n67#4,9:714\n77#4:754\n70#4:1359\n67#4,9:1360\n70#4:1449\n67#4,9:1450\n77#4:1537\n77#4:1541\n70#4:1543\n67#4,9:1544\n77#4:1584\n79#5,6:637\n86#5,3:652\n89#5,2:661\n79#5,6:675\n86#5,3:690\n89#5,2:699\n93#5:707\n93#5:711\n79#5,6:723\n86#5,3:738\n89#5,2:747\n93#5:753\n79#5,6:780\n86#5,3:795\n89#5,2:804\n79#5,6:819\n86#5,3:834\n89#5,2:843\n93#5:866\n93#5:870\n79#5,6:883\n86#5,3:898\n89#5,2:907\n79#5,6:923\n86#5,3:938\n89#5,2:947\n93#5:955\n79#5,6:968\n86#5,3:983\n89#5,2:992\n79#5,6:1005\n86#5,3:1020\n89#5,2:1029\n93#5:1046\n79#5,6:1059\n86#5,3:1074\n89#5,2:1083\n93#5:1100\n93#5:1104\n79#5,6:1120\n86#5,3:1135\n89#5,2:1144\n79#5,6:1157\n86#5,3:1172\n89#5,2:1181\n93#5:1198\n79#5,6:1211\n86#5,3:1226\n89#5,2:1235\n93#5:1252\n93#5:1256\n93#5:1261\n79#5,6:1319\n86#5,3:1334\n89#5,2:1343\n93#5:1349\n79#5,6:1369\n86#5,3:1384\n89#5,2:1393\n79#5,6:1406\n86#5,3:1421\n89#5,2:1430\n93#5:1438\n79#5,6:1459\n86#5,3:1474\n89#5,2:1483\n79#5,6:1496\n86#5,3:1511\n89#5,2:1520\n93#5:1532\n93#5:1536\n93#5:1540\n79#5,6:1553\n86#5,3:1568\n89#5,2:1577\n93#5:1583\n347#6,9:643\n356#6:663\n347#6,9:681\n356#6:701\n357#6,2:705\n357#6,2:709\n347#6,9:729\n356#6:749\n357#6,2:751\n347#6,9:786\n356#6:806\n347#6,9:825\n356#6:845\n357#6,2:864\n357#6,2:868\n347#6,9:889\n356#6:909\n347#6,9:929\n356#6:949\n357#6,2:953\n347#6,9:974\n356#6:994\n347#6,9:1011\n356#6:1031\n357#6,2:1044\n347#6,9:1065\n356#6:1085\n357#6,2:1098\n357#6,2:1102\n347#6,9:1126\n356#6:1146\n347#6,9:1163\n356#6:1183\n357#6,2:1196\n347#6,9:1217\n356#6:1237\n357#6,2:1250\n357#6,2:1254\n357#6,2:1259\n347#6,9:1325\n356#6:1345\n357#6,2:1347\n347#6,9:1375\n356#6:1395\n347#6,9:1412\n356#6:1432\n357#6,2:1436\n347#6,9:1465\n356#6:1485\n347#6,9:1502\n356#6:1522\n357#6,2:1530\n357#6,2:1534\n357#6,2:1538\n347#6,9:1559\n356#6:1579\n357#6,2:1581\n4206#7,6:655\n4206#7,6:693\n4206#7,6:741\n4206#7,6:798\n4206#7,6:837\n4206#7,6:901\n4206#7,6:941\n4206#7,6:986\n4206#7,6:1023\n4206#7,6:1077\n4206#7,6:1138\n4206#7,6:1175\n4206#7,6:1229\n4206#7,6:1337\n4206#7,6:1387\n4206#7,6:1424\n4206#7,6:1477\n4206#7,6:1514\n4206#7,6:1571\n99#8:665\n96#8,9:666\n106#8:708\n99#8:809\n96#8,9:810\n106#8:867\n99#8:912\n95#8,10:913\n106#8:956\n99#8:958\n96#8,9:959\n106#8:1105\n99#8:1110\n96#8,9:1111\n106#8:1257\n99#8:1486\n96#8,9:1487\n106#8:1533\n75#9:762\n87#10:769\n83#10,10:770\n94#10:871\n87#10:873\n84#10,9:874\n87#10:995\n84#10,9:996\n94#10:1047\n87#10:1049\n84#10,9:1050\n94#10:1101\n87#10:1147\n84#10,9:1148\n94#10:1199\n87#10:1201\n84#10,9:1202\n94#10:1253\n94#10:1262\n87#10:1308\n83#10,10:1309\n94#10:1350\n87#10:1396\n84#10,9:1397\n94#10:1439\n52#11:850\n1878#12,2:910\n785#12:1032\n796#12:1033\n1878#12,2:1034\n797#12,2:1036\n1880#12:1038\n799#12:1039\n1878#12,2:1040\n1880#12:1043\n785#12:1086\n796#12:1087\n1878#12,2:1088\n797#12,2:1090\n1880#12:1092\n799#12:1093\n1878#12,2:1094\n1880#12:1097\n1880#12:1106\n1869#12:1107\n785#12:1184\n796#12:1185\n1878#12,2:1186\n797#12,2:1188\n1880#12:1190\n799#12:1191\n1878#12,2:1192\n1880#12:1195\n785#12:1238\n796#12:1239\n1878#12,2:1240\n797#12,2:1242\n1880#12:1244\n799#12:1245\n1878#12,2:1246\n1880#12:1249\n1870#12:1258\n43#13:1346\n85#14:1357\n85#14:1542\n18#15,3:1433\n*S KotlinDebug\n*F\n+ 1 TrainingActivity.kt\ncom/baicizhan/main/activity/TrainingActivityKt\n*L\n140#1:613,6\n157#1:619,6\n250#1:755,6\n259#1:763,6\n304#1:852,6\n307#1:858,6\n489#1:1263,6\n497#1:1270,6\n500#1:1276,6\n568#1:1283,6\n576#1:1290,6\n579#1:1296,6\n162#1:1302,6\n201#1:1351,6\n526#1:1443,6\n542#1:1524,6\n189#1:625\n191#1:626\n211#1:664\n216#1:702\n217#1:703\n218#1:704\n239#1:750\n257#1:761\n273#1:807\n275#1:808\n280#1:846\n286#1:847\n292#1:848\n302#1:849\n303#1:851\n397#1:872\n406#1:950\n411#1:951\n412#1:952\n417#1:957\n423#1:1042\n432#1:1048\n439#1:1096\n450#1:1108\n454#1:1109\n460#1:1194\n466#1:1200\n473#1:1248\n493#1:1269\n557#1:1282\n572#1:1289\n509#1:1358\n522#1:1440\n523#1:1441\n524#1:1442\n539#1:1523\n596#1:1580\n186#1:627\n186#1:628,9\n186#1:712\n231#1:713\n231#1:714,9\n231#1:754\n506#1:1359\n506#1:1360,9\n520#1:1449\n520#1:1450,9\n520#1:1537\n506#1:1541\n585#1:1543\n585#1:1544,9\n585#1:1584\n186#1:637,6\n186#1:652,3\n186#1:661,2\n207#1:675,6\n207#1:690,3\n207#1:699,2\n207#1:707\n186#1:711\n231#1:723,6\n231#1:738,3\n231#1:747,2\n231#1:753\n270#1:780,6\n270#1:795,3\n270#1:804,2\n271#1:819,6\n271#1:834,3\n271#1:843,2\n271#1:866\n270#1:870\n394#1:883,6\n394#1:898,3\n394#1:907,2\n401#1:923,6\n401#1:938,3\n401#1:947,2\n401#1:955\n417#1:968,6\n417#1:983,3\n417#1:992,2\n418#1:1005,6\n418#1:1020,3\n418#1:1029,2\n418#1:1046\n434#1:1059,6\n434#1:1074,3\n434#1:1083,2\n434#1:1100\n417#1:1104\n454#1:1120,6\n454#1:1135,3\n454#1:1144,2\n455#1:1157,6\n455#1:1172,3\n455#1:1181,2\n455#1:1198\n468#1:1211,6\n468#1:1226,3\n468#1:1235,2\n468#1:1252\n454#1:1256\n394#1:1261\n164#1:1319,6\n164#1:1334,3\n164#1:1343,2\n164#1:1349\n506#1:1369,6\n506#1:1384,3\n506#1:1393,2\n512#1:1406,6\n512#1:1421,3\n512#1:1430,2\n512#1:1438\n520#1:1459,6\n520#1:1474,3\n520#1:1483,2\n537#1:1496,6\n537#1:1511,3\n537#1:1520,2\n537#1:1532\n520#1:1536\n506#1:1540\n585#1:1553,6\n585#1:1568,3\n585#1:1577,2\n585#1:1583\n186#1:643,9\n186#1:663\n207#1:681,9\n207#1:701\n207#1:705,2\n186#1:709,2\n231#1:729,9\n231#1:749\n231#1:751,2\n270#1:786,9\n270#1:806\n271#1:825,9\n271#1:845\n271#1:864,2\n270#1:868,2\n394#1:889,9\n394#1:909\n401#1:929,9\n401#1:949\n401#1:953,2\n417#1:974,9\n417#1:994\n418#1:1011,9\n418#1:1031\n418#1:1044,2\n434#1:1065,9\n434#1:1085\n434#1:1098,2\n417#1:1102,2\n454#1:1126,9\n454#1:1146\n455#1:1163,9\n455#1:1183\n455#1:1196,2\n468#1:1217,9\n468#1:1237\n468#1:1250,2\n454#1:1254,2\n394#1:1259,2\n164#1:1325,9\n164#1:1345\n164#1:1347,2\n506#1:1375,9\n506#1:1395\n512#1:1412,9\n512#1:1432\n512#1:1436,2\n520#1:1465,9\n520#1:1485\n537#1:1502,9\n537#1:1522\n537#1:1530,2\n520#1:1534,2\n506#1:1538,2\n585#1:1559,9\n585#1:1579\n585#1:1581,2\n186#1:655,6\n207#1:693,6\n231#1:741,6\n270#1:798,6\n271#1:837,6\n394#1:901,6\n401#1:941,6\n417#1:986,6\n418#1:1023,6\n434#1:1077,6\n454#1:1138,6\n455#1:1175,6\n468#1:1229,6\n164#1:1337,6\n506#1:1387,6\n512#1:1424,6\n520#1:1477,6\n537#1:1514,6\n585#1:1571,6\n207#1:665\n207#1:666,9\n207#1:708\n271#1:809\n271#1:810,9\n271#1:867\n401#1:912\n401#1:913,10\n401#1:956\n417#1:958\n417#1:959,9\n417#1:1105\n454#1:1110\n454#1:1111,9\n454#1:1257\n537#1:1486\n537#1:1487,9\n537#1:1533\n258#1:762\n270#1:769\n270#1:770,10\n270#1:871\n394#1:873\n394#1:874,9\n418#1:995\n418#1:996,9\n418#1:1047\n434#1:1049\n434#1:1050,9\n434#1:1101\n455#1:1147\n455#1:1148,9\n455#1:1199\n468#1:1201\n468#1:1202,9\n468#1:1253\n394#1:1262\n164#1:1308\n164#1:1309,10\n164#1:1350\n512#1:1396\n512#1:1397,9\n512#1:1439\n302#1:850\n399#1:910,2\n419#1:1032\n419#1:1033\n419#1:1034,2\n419#1:1036,2\n419#1:1038\n419#1:1039\n420#1:1040,2\n420#1:1043\n435#1:1086\n435#1:1087\n435#1:1088,2\n435#1:1090,2\n435#1:1092\n435#1:1093\n436#1:1094,2\n436#1:1097\n399#1:1106\n447#1:1107\n456#1:1184\n456#1:1185\n456#1:1186,2\n456#1:1188,2\n456#1:1190\n456#1:1191\n457#1:1192,2\n457#1:1195\n469#1:1238\n469#1:1239\n469#1:1240,2\n469#1:1242,2\n469#1:1244\n469#1:1245\n470#1:1246,2\n470#1:1249\n447#1:1258\n169#1:1346\n490#1:1357\n569#1:1542\n514#1:1433,3\n*E\n"})
/* loaded from: classes4.dex */
public final class v4 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(java.lang.String r96, int r97, androidx.compose.foundation.layout.PaddingValues r98, androidx.compose.runtime.Composer r99, final int r100, final int r101) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.v4.G(java.lang.String, int, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [kc.d, kc.h] */
    public static final yz.g2 H(Context context) {
        TrainingActivity trainingActivity = context instanceof TrainingActivity ? (TrainingActivity) context : null;
        if (trainingActivity == null) {
            return null;
        }
        mc.a.p(trainingActivity, ((u.a) d.a.J(new u.a(context).V("你可采用多种方式，对已学单词强化训练，巩固记忆效果。最近学过的单词会被优先复习。").b0(ButtonType.SINGLE_POSITIVE), "知道了", null, null, 6, null)).d(), null, 2, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 I(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 J(SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.g0.p(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "tip");
        return yz.g2.f100423a;
    }

    public static final yz.g2 K(String str, int i11, PaddingValues paddingValues, int i12, int i13, Composer composer, int i14) {
        G(str, i11, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void L(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1407374864);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1407374864, i11, -1, "com.baicizhan.main.activity.CurrentInfoLongPreview (TrainingActivity.kt:318)");
            }
            G("新高中人教版选择性必修二我再加长一点点", 20000, null, startRestartGroup, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.s3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 M;
                    M = v4.M(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return M;
                }
            });
        }
    }

    public static final yz.g2 M(int i11, Composer composer, int i12) {
        L(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void N(Modifier modifier, final q qVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-1347324086);
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
            i13 |= startRestartGroup.changed(qVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1347324086, i13, -1, "com.baicizhan.main.activity.ExtensionItem (TrainingActivity.kt:566)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, startRestartGroup, 6);
            Modifier m764requiredHeightInVpY3zN4$default = SizeKt.m764requiredHeightInVpY3zN4$default(modifier4, Dp.m5115constructorimpl(88), 0.0f, 2, null);
            boolean z11 = (i13 & 112) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: fd.r4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 P;
                        P = v4.P(q.this);
                        return P;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m764requiredHeightInVpY3zN4$default, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: fd.s4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 Q;
                        Q = v4.Q((SemanticsPropertyReceiver) obj);
                        return Q;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(m267clickableO2vRcR0$default, false, (x00.l) rememberedValue3, 1, null);
            CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getSmall();
            long k11 = O(collectIsPressedAsState) ? qVar.k() : qVar.j();
            modifier3 = modifier4;
            SurfaceKt.m1784SurfaceFjzlyU(semantics$default, small, k11, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1557931662, true, new x00.p() { // from class: fd.t4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 R;
                    R = v4.R(q.this, (Composer) obj, ((Integer) obj2).intValue());
                    return R;
                }
            }, startRestartGroup, 54), startRestartGroup, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.u4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 S;
                    S = v4.S(Modifier.this, qVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return S;
                }
            });
        }
    }

    public static final boolean O(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final yz.g2 P(q qVar) {
        qVar.l().invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q(SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.g0.p(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "extension_item");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 R(q qVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1557931662, i11, -1, "com.baicizhan.main.activity.ExtensionItem.<anonymous> (TrainingActivity.kt:584)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxHeight$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (qVar.m() != 0) {
                composer.startReplaceGroup(-1752924871);
                ImageKt.Image(PainterResources_androidKt.painterResource(qVar.m(), composer, 0), "ext_bg", boxScopeInstance.align(companion, companion2.getCenterEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            } else {
                composer.startReplaceGroup(-1773099826);
            }
            composer.endReplaceGroup();
            TextKt.m1845Text4IGK_g(qVar.n(), PaddingKt.m728paddingVpY3zN4$default(boxScopeInstance.align(companion, companion2.getCenterStart()), Dp.m5115constructorimpl(16), 0.0f, 2, null), bk.b.A0(), bk.d.l(), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 200064, 0, 131024);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(Modifier modifier, q qVar, int i11, int i12, Composer composer, int i13) {
        N(modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void T(@m80.k final List<zg.h> trainingBanners, @m80.k final x00.l<? super zg.h, yz.g2> bannerClick, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(trainingBanners, "trainingBanners");
        kotlin.jvm.internal.g0.p(bannerClick, "bannerClick");
        Composer startRestartGroup = composer.startRestartGroup(523888301);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(trainingBanners) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(bannerClick) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523888301, i12, -1, "com.baicizhan.main.activity.PagerBanner (TrainingActivity.kt:184)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier clip = ClipKt.clip(AspectRatioKt.aspectRatio(PaddingKt.m728paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(16), 0.0f, 2, null), 3.1946902f, false), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4)));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clip);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            com.google.accompanist.pager.f a11 = com.google.accompanist.pager.g.a(0, startRestartGroup, 6, 0);
            Pager.a(trainingBanners.size(), null, a11, false, 0.0f, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1288239356, true, new x00.r() { // from class: fd.l4
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yz.g2 U;
                    U = v4.U(trainingBanners, bannerClick, (com.google.accompanist.pager.d) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                    return U;
                }
            }, startRestartGroup, 54), startRestartGroup, 805306368, TypedValues.PositionType.TYPE_PERCENT_X);
            if (trainingBanners.size() > 1) {
                startRestartGroup.startReplaceGroup(-1891675990);
                Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(SizeKt.wrapContentSize$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), null, false, 3, null), 0.0f, 0.0f, 0.0f, Dp.m5115constructorimpl(8), 7, null);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), startRestartGroup, 0);
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
                startRestartGroup.startReplaceGroup(-622631442);
                int size = trainingBanners.size();
                int i13 = 0;
                while (i13 < size) {
                    BoxKt.Box(BackgroundKt.m235backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m728paddingVpY3zN4$default(SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(a11.k() == i13 ? 14 : 9)), Dp.m5115constructorimpl(5)), Dp.m5115constructorimpl(2), 0.0f, 2, null), a11.k() == i13 ? RoundedCornerShapeKt.RoundedCornerShape(50) : RoundedCornerShapeKt.getCircleShape()), a11.k() == i13 ? Color.Companion.m2546getWhite0d7_KjU() : bk.b.I0(), null, 2, null), startRestartGroup, 0);
                    i13++;
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
            } else {
                startRestartGroup.startReplaceGroup(-1898912165);
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
            endRestartGroup.updateScope(new x00.p() { // from class: fd.o4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 W;
                    W = v4.W(trainingBanners, bannerClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return W;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 U(List list, final x00.l lVar, com.google.accompanist.pager.d HorizontalPager, int i11, Composer composer, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(HorizontalPager, "$this$HorizontalPager");
        if ((i12 & 48) == 0) {
            i13 = i12 | (composer.changed(i11) ? 32 : 16);
        } else {
            i13 = i12;
        }
        if (composer.shouldExecute((i13 & 145) != 144, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1288239356, i13, -1, "com.baicizhan.main.activity.PagerBanner.<anonymous>.<anonymous> (TrainingActivity.kt:194)");
            }
            final zg.h hVar = (zg.h) list.get(i11);
            String i14 = hVar.i();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            boolean changed = composer.changed(lVar) | composer.changed(hVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: fd.w3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 V;
                        V = v4.V(x00.l.this, hVar);
                        return V;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            coil.compose.l.b(i14, "", ClickableKt.m269clickableXHw0xAI$default(fillMaxSize$default, false, null, null, (x00.a) rememberedValue, 7, null), PainterResources_androidKt.painterResource(R.drawable.img_training_banner_default, composer, 6), PainterResources_androidKt.painterResource(R.drawable.img_training_banner_default, composer, 6), null, null, null, null, null, null, 0.0f, null, 0, false, null, composer, 48, 0, 65504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(x00.l lVar, zg.h hVar) {
        lVar.invoke(hVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 W(List list, x00.l lVar, int i11, Composer composer, int i12) {
        T(list, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void X(final x00.a<yz.g2> aVar, Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1090996855);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (i14 != 0) {
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: fd.z3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 Y;
                            Y = v4.Y();
                            return Y;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                aVar = (x00.a) rememberedValue;
            }
            x00.a<yz.g2> aVar2 = aVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1090996855, i13, -1, "com.baicizhan.main.activity.TopBar (TrainingActivity.kt:249)");
            }
            com.baicizhan.platform.base.widget.s4.F(0, null, aVar2, StringResources_androidKt.stringResource(R.string.word_extra_title_training, startRestartGroup, 6), null, null, startRestartGroup, (i13 << 6) & 896, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            aVar = aVar2;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.b4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Z;
                    Z = v4.Z(x00.a.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return Z;
                }
            });
        }
    }

    public static final yz.g2 Y() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(x00.a aVar, int i11, int i12, Composer composer, int i13) {
        X(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void a0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-470595865);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-470595865, i11, -1, "com.baicizhan.main.activity.TopBarPreview (TrainingActivity.kt:606)");
            }
            bk.k.e(null, null, null, m.f51646a.c(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.i4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 b02;
                    b02 = v4.b0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return b02;
                }
            });
        }
    }

    public static final yz.g2 b0(int i11, Composer composer, int i12) {
        a0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c0(final Modifier modifier, final zg.h hVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(560765762);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(hVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(560765762, i12, -1, "com.baicizhan.main.activity.TrainingBanner (TrainingActivity.kt:229)");
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            composer2 = startRestartGroup;
            coil.compose.l.b(hVar.i(), kc.o.L, ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), PainterResources_androidKt.painterResource(R.drawable.device_bind_loading, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.device_bind_load_failed, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.device_bind_load_failed, startRestartGroup, 6), null, null, null, null, null, 0.0f, null, 0, false, null, composer2, 48, 0, 65472);
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
            endRestartGroup.updateScope(new x00.p() { // from class: fd.q4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 d02;
                    d02 = v4.d0(Modifier.this, hVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return d02;
                }
            });
        }
    }

    public static final yz.g2 d0(Modifier modifier, zg.h hVar, int i11, Composer composer, int i12) {
        c0(modifier, hVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e0(@m80.l final kotlin.Pair<java.lang.String, java.lang.Integer> r15, @m80.l final java.util.List<fd.x4> r16, @m80.l final java.util.List<fd.o> r17, @m80.l final java.util.List<zg.h> r18, @m80.l x00.a<yz.g2> r19, @m80.k final x00.l<? super zg.h, yz.g2> r20, @m80.l androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.v4.e0(kotlin.Pair, java.util.List, java.util.List, java.util.List, x00.a, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 f0() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 g0(final x00.a aVar, final Pair pair, final List list, final List list2, final List list3, final x00.l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-693455847, i11, -1, "com.baicizhan.main.activity.TrainingContent.<anonymous> (TrainingActivity.kt:160)");
            }
            com.baicizhan.platform.base.widget.s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(1878440898, true, new x00.p() { // from class: fd.q3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 h02;
                    h02 = v4.h0(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return h02;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(1289949386, true, new x00.q() { // from class: fd.r3
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 j02;
                    j02 = v4.j0(Pair.this, list, list2, list3, lVar, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return j02;
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
    public static final yz.g2 h0(final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1878440898, i11, -1, "com.baicizhan.main.activity.TrainingContent.<anonymous>.<anonymous> (TrainingActivity.kt:161)");
            }
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: fd.h4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 i02;
                        i02 = v4.i0(x00.a.this);
                        return i02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            X((x00.a) rememberedValue, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 i0(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 j0(Pair pair, List list, List list2, List list3, x00.l lVar, PaddingValues it, Composer composer, int i11) {
        int i12;
        List J;
        List J2;
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(it) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1289949386, i12, -1, "com.baicizhan.main.activity.TrainingContent.<anonymous>.<anonymous> (TrainingActivity.kt:163)");
            }
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
            if (pair == null) {
                composer.startReplaceGroup(-1790281238);
            } else {
                composer.startReplaceGroup(-1790281237);
                G((String) pair.getFirst(), ((Number) pair.getSecond()).intValue(), it, composer, (i12 << 6) & 896, 0);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1443220348);
            List list4 = list;
            if (list4 != null && !list4.isEmpty()) {
                kotlin.jvm.internal.g0.n(list4, "null cannot be cast to non-null type kotlin.collections.List<com.baicizhan.main.model.data.TrainingBanner>");
                T(list4, lVar, composer, 0);
            }
            composer.endReplaceGroup();
            Modifier padding = PaddingKt.padding(companion, it);
            if (list2 == null || (J = a00.r0.a6(list2)) == null) {
                J = a00.h0.J();
            }
            if (list3 == null || (J2 = a00.r0.a6(list3)) == null) {
                J2 = a00.h0.J();
            }
            v0(padding, J, J2, composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 k0(Pair pair, List list, List list2, List list3, x00.a aVar, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        e0(pair, list, list2, list3, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l0(Modifier modifier, final z4 z4Var, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        long a02;
        Composer startRestartGroup = composer.startRestartGroup(-1170313762);
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
            i13 |= startRestartGroup.changed(z4Var) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170313762, i13, -1, "com.baicizhan.main.activity.TrainingItem (TrainingActivity.kt:487)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, startRestartGroup, 6);
            Modifier m764requiredHeightInVpY3zN4$default = SizeKt.m764requiredHeightInVpY3zN4$default(modifier4, Dp.m5115constructorimpl(72), 0.0f, 2, null);
            boolean z11 = (i13 & 112) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: fd.c4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 n02;
                        n02 = v4.n0(z4.this);
                        return n02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m764requiredHeightInVpY3zN4$default, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: fd.d4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 o02;
                        o02 = v4.o0((SemanticsPropertyReceiver) obj);
                        return o02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(m267clickableO2vRcR0$default, false, (x00.l) rememberedValue3, 1, null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            CornerBasedShape small = materialTheme.getShapes(startRestartGroup, i15).getSmall();
            if (m0(collectIsPressedAsState)) {
                startRestartGroup.startReplaceGroup(609927431);
                a02 = bk.b.b0(materialTheme.getColors(startRestartGroup, i15));
            } else {
                startRestartGroup.startReplaceGroup(609928583);
                a02 = bk.b.a0(materialTheme.getColors(startRestartGroup, i15));
            }
            startRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            SurfaceKt.m1784SurfaceFjzlyU(semantics$default, small, a02, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(101981730, true, new x00.p() { // from class: fd.e4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 p02;
                    p02 = v4.p0(z4.this, (Composer) obj, ((Integer) obj2).intValue());
                    return p02;
                }
            }, startRestartGroup, 54), startRestartGroup, 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.f4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 s02;
                    s02 = v4.s0(Modifier.this, z4Var, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return s02;
                }
            });
        }
    }

    public static final boolean m0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final yz.g2 n0(z4 z4Var) {
        z4Var.j().invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 o0(SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.g0.p(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "training_item");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 p0(z4 z4Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(101981730, i11, -1, "com.baicizhan.main.activity.TrainingItem.<anonymous> (TrainingActivity.kt:505)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 16;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.m727paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(12), Dp.m5115constructorimpl(f11)), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxHeight$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(companion, companion2.getCenterStart());
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, align);
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
            String l11 = z4Var.l();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            TextKt.m1845Text4IGK_g(l11, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i12).getH4(), 0L, bk.d.l(), FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            Composer composer2 = composer;
            composer2.startReplaceGroup(-531765446);
            String i13 = z4Var.i();
            if (i13 != null && i13.length() != 0) {
                TextKt.m1845Text4IGK_g(i13, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer2, i12).getSubtitle2(), 0L, bk.d.k(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                composer2 = composer;
                yz.g2 g2Var = yz.g2.f100423a;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (z4Var.k() != null) {
                composer2.startReplaceGroup(-127168971);
                float f12 = 2;
                Modifier align2 = boxScopeInstance.align(PaddingKt.m727paddingVpY3zN4(SizeKt.m769requiredSizeInqDBjuR0$default(BackgroundKt.m234backgroundbw27NRU(companion, bk.b.h0(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f12))), Dp.m5115constructorimpl(36), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 12, null), Dp.m5115constructorimpl(6), Dp.m5115constructorimpl(1)), companion2.getCenterEnd());
                Object rememberedValue = composer2.rememberedValue();
                Composer.Companion companion4 = Composer.Companion;
                if (rememberedValue == companion4.getEmpty()) {
                    rememberedValue = new x00.l() { // from class: fd.x3
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 q02;
                            q02 = v4.q0((SemanticsPropertyReceiver) obj);
                            return q02;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                Modifier semantics$default = SemanticsModifierKt.semantics$default(align2, false, (x00.l) rememberedValue, 1, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, semantics$default);
                x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
                if (z4Var.k().getFirst().intValue() < z4Var.k().getSecond().intValue() || z4Var.k().getSecond().intValue() == 0) {
                    composer2.startReplaceGroup(-845856785);
                    TextKt.m1845Text4IGK_g(Math.min(z4Var.k().getFirst().intValue(), z4Var.k().getSecond().intValue()) + "/" + z4Var.k().getSecond(), boxScopeInstance.align(companion, companion2.getCenter()), bk.b.A0(), bk.d.j(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131056);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-845551528);
                    Modifier align3 = boxScopeInstance.align(companion, companion2.getCenter());
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, 0);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, align3);
                    x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer2);
                    Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m1845Text4IGK_g(String.valueOf(Math.min(z4Var.k().getFirst().intValue(), z4Var.k().getSecond().intValue())), rowScopeInstance.align(companion, companion2.getCenterVertically()), bk.b.A0(), bk.d.j(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131056);
                    composer2 = composer;
                    SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(f12)), composer2, 6);
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_training_done, composer2, 6);
                    Modifier align4 = rowScopeInstance.align(companion, companion2.getCenterVertically());
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == companion4.getEmpty()) {
                        rememberedValue2 = new x00.l() { // from class: fd.y3
                            @Override // x00.l
                            public final Object invoke(Object obj) {
                                yz.g2 r02;
                                r02 = v4.r0((SemanticsPropertyReceiver) obj);
                                return r02;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    ImageKt.Image(painterResource, "succeed", SemanticsModifierKt.semantics$default(align4, false, (x00.l) rememberedValue2, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
            } else {
                composer2.startReplaceGroup(-144696774);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 q0(SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.g0.p(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "training_item_data");
        return yz.g2.f100423a;
    }

    public static final yz.g2 r0(SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.g0.p(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, "checked");
        return yz.g2.f100423a;
    }

    public static final yz.g2 s0(Modifier modifier, z4 z4Var, int i11, int i12, Composer composer, int i13) {
        l0(modifier, z4Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void t0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1779540406);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1779540406, i11, -1, "com.baicizhan.main.activity.TrainingItemPreview (TrainingActivity.kt:554)");
            }
            l0(SizeKt.m778width3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(160)), new z4("英文选义", "阅读", new Pair(50, 50), null, 8, null), startRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: fd.g4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 u02;
                    u02 = v4.u0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return u02;
                }
            });
        }
    }

    public static final yz.g2 u0(int i11, Composer composer, int i12) {
        t0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0712 A[EDGE_INSN: B:167:0x0712->B:168:0x0712 BREAK  A[LOOP:0: B:51:0x024b->B:156:0x06fc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0253  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v0(androidx.compose.ui.Modifier r103, java.util.List<fd.x4> r104, java.util.List<fd.o> r105, androidx.compose.runtime.Composer r106, final int r107, final int r108) {
        /*
            Method dump skipped, instructions count: 2802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.v4.v0(androidx.compose.ui.Modifier, java.util.List, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 w0(Modifier modifier, List list, List list2, int i11, int i12, Composer composer, int i13) {
        v0(modifier, list, list2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0097  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x0(androidx.compose.runtime.State<kotlin.Pair<java.lang.String, java.lang.Integer>> r17, androidx.compose.runtime.State<? extends java.util.List<fd.x4>> r18, androidx.compose.runtime.State<? extends java.util.List<fd.o>> r19, androidx.compose.runtime.State<? extends java.util.List<zg.h>> r20, x00.a<yz.g2> r21, final x00.l<? super zg.h, yz.g2> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.v4.x0(androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, x00.a, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 y0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 z0(State state, State state2, State state3, State state4, x00.a aVar, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        x0(state, state2, state3, state4, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
