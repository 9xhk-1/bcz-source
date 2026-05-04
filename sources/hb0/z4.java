package hb0;

import ab0.e;
import com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl;
import com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType;
import com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl;
import com.baicizhan.app.biz.game.impl.mytab.MyTabVMImpl;
import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC;
import com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC;
import com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC;
import com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC;
import com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC;
import com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC;
import com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceJourneyUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentSkuIdUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC;
import org.koin.core.definition.Kind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGameServiceModuleGencom$baicizhan$app$biz$game$impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServiceModuleGencom$baicizhan$app$biz$game$impl.kt\norg/koin/ksp/generated/GameServiceModuleGencom_baicizhan_app_biz_game_implKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,77:1\n105#2,6:78\n111#2,5:106\n105#2,6:111\n111#2,5:139\n105#2,6:144\n111#2,5:172\n105#2,6:177\n111#2,5:205\n105#2,6:210\n111#2,5:238\n105#2,6:243\n111#2,5:271\n105#2,6:276\n111#2,5:304\n105#2,6:309\n111#2,5:337\n149#2,14:342\n163#2,2:372\n149#2,14:374\n163#2,2:404\n149#2,14:406\n163#2,2:436\n105#2,6:438\n111#2,5:466\n105#2,6:471\n111#2,5:499\n105#2,6:504\n111#2,5:532\n105#2,6:537\n111#2,5:565\n149#2,14:570\n163#2,2:600\n105#2,6:602\n111#2,5:630\n105#2,6:635\n111#2,5:663\n105#2,6:668\n111#2,5:696\n105#2,6:701\n111#2,5:729\n149#2,14:734\n163#2,2:764\n149#2,14:766\n163#2,2:796\n149#2,14:798\n163#2,2:828\n149#2,14:830\n163#2,2:860\n149#2,14:862\n163#2,2:892\n105#2,6:894\n111#2,5:922\n105#2,6:927\n111#2,5:955\n105#2,6:960\n111#2,5:988\n105#2,6:993\n111#2,5:1021\n105#2,6:1026\n111#2,5:1054\n105#2,6:1059\n111#2,5:1087\n105#2,6:1092\n111#2,5:1120\n105#2,6:1125\n111#2,5:1153\n105#2,6:1158\n111#2,5:1186\n105#2,6:1191\n111#2,5:1219\n105#2,6:1224\n111#2,5:1252\n105#2,6:1257\n111#2,5:1285\n105#2,6:1290\n111#2,5:1318\n105#2,6:1323\n111#2,5:1351\n105#2,6:1356\n111#2,5:1384\n105#2,6:1389\n111#2,5:1417\n105#2,6:1422\n111#2,5:1450\n105#2,6:1455\n111#2,5:1483\n105#2,6:1488\n111#2,5:1516\n105#2,6:1521\n111#2,5:1549\n105#2,6:1554\n111#2,5:1582\n105#2,6:1587\n111#2,5:1615\n105#2,6:1620\n111#2,5:1648\n105#2,6:1653\n111#2,5:1681\n105#2,6:1686\n111#2,5:1714\n105#2,6:1719\n111#2,5:1747\n105#2,6:1752\n111#2,5:1780\n105#2,6:1785\n111#2,5:1813\n105#2,6:1818\n111#2,5:1846\n105#2,6:1851\n111#2,5:1879\n105#2,6:1884\n111#2,5:1912\n105#2,6:1917\n111#2,5:1945\n105#2,6:1950\n111#2,5:1978\n105#2,6:1983\n111#2,5:2011\n105#2,6:2016\n111#2,5:2044\n105#2,6:2049\n111#2,5:2077\n105#2,6:2082\n111#2,5:2110\n105#2,6:2115\n111#2,5:2143\n105#2,6:2148\n111#2,5:2176\n105#2,6:2181\n111#2,5:2209\n105#2,6:2214\n111#2,5:2242\n105#2,6:2247\n111#2,5:2275\n196#3,7:84\n203#3:105\n196#3,7:117\n203#3:138\n196#3,7:150\n203#3:171\n196#3,7:183\n203#3:204\n196#3,7:216\n203#3:237\n196#3,7:249\n203#3:270\n196#3,7:282\n203#3:303\n196#3,7:315\n203#3:336\n212#3:356\n213#3:371\n212#3:388\n213#3:403\n212#3:420\n213#3:435\n196#3,7:444\n203#3:465\n196#3,7:477\n203#3:498\n196#3,7:510\n203#3:531\n196#3,7:543\n203#3:564\n212#3:584\n213#3:599\n196#3,7:608\n203#3:629\n196#3,7:641\n203#3:662\n196#3,7:674\n203#3:695\n196#3,7:707\n203#3:728\n212#3:748\n213#3:763\n212#3:780\n213#3:795\n212#3:812\n213#3:827\n212#3:844\n213#3:859\n212#3:876\n213#3:891\n196#3,7:900\n203#3:921\n196#3,7:933\n203#3:954\n196#3,7:966\n203#3:987\n196#3,7:999\n203#3:1020\n196#3,7:1032\n203#3:1053\n196#3,7:1065\n203#3:1086\n196#3,7:1098\n203#3:1119\n196#3,7:1131\n203#3:1152\n196#3,7:1164\n203#3:1185\n196#3,7:1197\n203#3:1218\n196#3,7:1230\n203#3:1251\n196#3,7:1263\n203#3:1284\n196#3,7:1296\n203#3:1317\n196#3,7:1329\n203#3:1350\n196#3,7:1362\n203#3:1383\n196#3,7:1395\n203#3:1416\n196#3,7:1428\n203#3:1449\n196#3,7:1461\n203#3:1482\n196#3,7:1494\n203#3:1515\n196#3,7:1527\n203#3:1548\n196#3,7:1560\n203#3:1581\n196#3,7:1593\n203#3:1614\n196#3,7:1626\n203#3:1647\n196#3,7:1659\n203#3:1680\n196#3,7:1692\n203#3:1713\n196#3,7:1725\n203#3:1746\n196#3,7:1758\n203#3:1779\n196#3,7:1791\n203#3:1812\n196#3,7:1824\n203#3:1845\n196#3,7:1857\n203#3:1878\n196#3,7:1890\n203#3:1911\n196#3,7:1923\n203#3:1944\n196#3,7:1956\n203#3:1977\n196#3,7:1989\n203#3:2010\n196#3,7:2022\n203#3:2043\n196#3,7:2055\n203#3:2076\n196#3,7:2088\n203#3:2109\n196#3,7:2121\n203#3:2142\n196#3,7:2154\n203#3:2175\n196#3,7:2187\n203#3:2208\n196#3,7:2220\n203#3:2241\n196#3,7:2253\n203#3:2274\n115#4,14:91\n115#4,14:124\n115#4,14:157\n115#4,14:190\n115#4,14:223\n115#4,14:256\n115#4,14:289\n115#4,14:322\n115#4,14:357\n115#4,14:389\n115#4,14:421\n115#4,14:451\n115#4,14:484\n115#4,14:517\n115#4,14:550\n115#4,14:585\n115#4,14:615\n115#4,14:648\n115#4,14:681\n115#4,14:714\n115#4,14:749\n115#4,14:781\n115#4,14:813\n115#4,14:845\n115#4,14:877\n115#4,14:907\n115#4,14:940\n115#4,14:973\n115#4,14:1006\n115#4,14:1039\n115#4,14:1072\n115#4,14:1105\n115#4,14:1138\n115#4,14:1171\n115#4,14:1204\n115#4,14:1237\n115#4,14:1270\n115#4,14:1303\n115#4,14:1336\n115#4,14:1369\n115#4,14:1402\n115#4,14:1435\n115#4,14:1468\n115#4,14:1501\n115#4,14:1534\n115#4,14:1567\n115#4,14:1600\n115#4,14:1633\n115#4,14:1666\n115#4,14:1699\n115#4,14:1732\n115#4,14:1765\n115#4,14:1798\n115#4,14:1831\n115#4,14:1864\n115#4,14:1897\n115#4,14:1930\n115#4,14:1963\n115#4,14:1996\n115#4,14:2029\n115#4,14:2062\n115#4,14:2095\n115#4,14:2128\n115#4,14:2161\n115#4,14:2194\n115#4,14:2227\n115#4,14:2260\n138#5,5:2280\n138#5,5:2285\n138#5,5:2290\n138#5,5:2295\n138#5,5:2300\n138#5,5:2305\n138#5,5:2310\n138#5,5:2315\n138#5,5:2320\n138#5,5:2325\n138#5,5:2330\n138#5,5:2335\n138#5,5:2340\n138#5,5:2345\n138#5,5:2350\n138#5,5:2355\n138#5,5:2360\n138#5,5:2365\n138#5,5:2370\n138#5,5:2375\n138#5,5:2380\n138#5,5:2385\n138#5,5:2390\n138#5,5:2395\n138#5,5:2400\n138#5,5:2405\n138#5,5:2410\n138#5,5:2415\n138#5,5:2420\n138#5,5:2425\n138#5,5:2430\n138#5,5:2435\n138#5,5:2440\n138#5,5:2445\n138#5,5:2450\n138#5,5:2455\n138#5,5:2460\n138#5,5:2465\n138#5,5:2470\n138#5,5:2475\n138#5,5:2480\n138#5,5:2485\n138#5,5:2490\n138#5,5:2495\n138#5,5:2500\n138#5,5:2505\n138#5,5:2510\n138#5,5:2515\n138#5,5:2520\n138#5,5:2525\n138#5,5:2530\n138#5,5:2535\n138#5,5:2540\n138#5,5:2545\n138#5,5:2550\n138#5,5:2555\n138#5,5:2560\n138#5,5:2565\n*S KotlinDebug\n*F\n+ 1 GameServiceModuleGencom$baicizhan$app$biz$game$impl.kt\norg/koin/ksp/generated/GameServiceModuleGencom_baicizhan_app_biz_game_implKt\n*L\n8#1:78,6\n8#1:106,5\n9#1:111,6\n9#1:139,5\n10#1:144,6\n10#1:172,5\n11#1:177,6\n11#1:205,5\n12#1:210,6\n12#1:238,5\n13#1:243,6\n13#1:271,5\n14#1:276,6\n14#1:304,5\n15#1:309,6\n15#1:337,5\n16#1:342,14\n16#1:372,2\n17#1:374,14\n17#1:404,2\n18#1:406,14\n18#1:436,2\n19#1:438,6\n19#1:466,5\n20#1:471,6\n20#1:499,5\n21#1:504,6\n21#1:532,5\n22#1:537,6\n22#1:565,5\n23#1:570,14\n23#1:600,2\n24#1:602,6\n24#1:630,5\n25#1:635,6\n25#1:663,5\n26#1:668,6\n26#1:696,5\n27#1:701,6\n27#1:729,5\n28#1:734,14\n28#1:764,2\n29#1:766,14\n29#1:796,2\n30#1:798,14\n30#1:828,2\n31#1:830,14\n31#1:860,2\n32#1:862,14\n32#1:892,2\n33#1:894,6\n33#1:922,5\n34#1:927,6\n34#1:955,5\n35#1:960,6\n35#1:988,5\n36#1:993,6\n36#1:1021,5\n37#1:1026,6\n37#1:1054,5\n38#1:1059,6\n38#1:1087,5\n39#1:1092,6\n39#1:1120,5\n40#1:1125,6\n40#1:1153,5\n41#1:1158,6\n41#1:1186,5\n42#1:1191,6\n42#1:1219,5\n43#1:1224,6\n43#1:1252,5\n44#1:1257,6\n44#1:1285,5\n45#1:1290,6\n45#1:1318,5\n46#1:1323,6\n46#1:1351,5\n47#1:1356,6\n47#1:1384,5\n48#1:1389,6\n48#1:1417,5\n49#1:1422,6\n49#1:1450,5\n50#1:1455,6\n50#1:1483,5\n51#1:1488,6\n51#1:1516,5\n52#1:1521,6\n52#1:1549,5\n53#1:1554,6\n53#1:1582,5\n54#1:1587,6\n54#1:1615,5\n55#1:1620,6\n55#1:1648,5\n56#1:1653,6\n56#1:1681,5\n57#1:1686,6\n57#1:1714,5\n58#1:1719,6\n58#1:1747,5\n59#1:1752,6\n59#1:1780,5\n60#1:1785,6\n60#1:1813,5\n61#1:1818,6\n61#1:1846,5\n62#1:1851,6\n62#1:1879,5\n63#1:1884,6\n63#1:1912,5\n64#1:1917,6\n64#1:1945,5\n65#1:1950,6\n65#1:1978,5\n66#1:1983,6\n66#1:2011,5\n67#1:2016,6\n67#1:2044,5\n68#1:2049,6\n68#1:2077,5\n69#1:2082,6\n69#1:2110,5\n70#1:2115,6\n70#1:2143,5\n71#1:2148,6\n71#1:2176,5\n72#1:2181,6\n72#1:2209,5\n73#1:2214,6\n73#1:2242,5\n74#1:2247,6\n74#1:2275,5\n8#1:84,7\n8#1:105\n9#1:117,7\n9#1:138\n10#1:150,7\n10#1:171\n11#1:183,7\n11#1:204\n12#1:216,7\n12#1:237\n13#1:249,7\n13#1:270\n14#1:282,7\n14#1:303\n15#1:315,7\n15#1:336\n16#1:356\n16#1:371\n17#1:388\n17#1:403\n18#1:420\n18#1:435\n19#1:444,7\n19#1:465\n20#1:477,7\n20#1:498\n21#1:510,7\n21#1:531\n22#1:543,7\n22#1:564\n23#1:584\n23#1:599\n24#1:608,7\n24#1:629\n25#1:641,7\n25#1:662\n26#1:674,7\n26#1:695\n27#1:707,7\n27#1:728\n28#1:748\n28#1:763\n29#1:780\n29#1:795\n30#1:812\n30#1:827\n31#1:844\n31#1:859\n32#1:876\n32#1:891\n33#1:900,7\n33#1:921\n34#1:933,7\n34#1:954\n35#1:966,7\n35#1:987\n36#1:999,7\n36#1:1020\n37#1:1032,7\n37#1:1053\n38#1:1065,7\n38#1:1086\n39#1:1098,7\n39#1:1119\n40#1:1131,7\n40#1:1152\n41#1:1164,7\n41#1:1185\n42#1:1197,7\n42#1:1218\n43#1:1230,7\n43#1:1251\n44#1:1263,7\n44#1:1284\n45#1:1296,7\n45#1:1317\n46#1:1329,7\n46#1:1350\n47#1:1362,7\n47#1:1383\n48#1:1395,7\n48#1:1416\n49#1:1428,7\n49#1:1449\n50#1:1461,7\n50#1:1482\n51#1:1494,7\n51#1:1515\n52#1:1527,7\n52#1:1548\n53#1:1560,7\n53#1:1581\n54#1:1593,7\n54#1:1614\n55#1:1626,7\n55#1:1647\n56#1:1659,7\n56#1:1680\n57#1:1692,7\n57#1:1713\n58#1:1725,7\n58#1:1746\n59#1:1758,7\n59#1:1779\n60#1:1791,7\n60#1:1812\n61#1:1824,7\n61#1:1845\n62#1:1857,7\n62#1:1878\n63#1:1890,7\n63#1:1911\n64#1:1923,7\n64#1:1944\n65#1:1956,7\n65#1:1977\n66#1:1989,7\n66#1:2010\n67#1:2022,7\n67#1:2043\n68#1:2055,7\n68#1:2076\n69#1:2088,7\n69#1:2109\n70#1:2121,7\n70#1:2142\n71#1:2154,7\n71#1:2175\n72#1:2187,7\n72#1:2208\n73#1:2220,7\n73#1:2241\n74#1:2253,7\n74#1:2274\n8#1:91,14\n9#1:124,14\n10#1:157,14\n11#1:190,14\n12#1:223,14\n13#1:256,14\n14#1:289,14\n15#1:322,14\n16#1:357,14\n17#1:389,14\n18#1:421,14\n19#1:451,14\n20#1:484,14\n21#1:517,14\n22#1:550,14\n23#1:585,14\n24#1:615,14\n25#1:648,14\n26#1:681,14\n27#1:714,14\n28#1:749,14\n29#1:781,14\n30#1:813,14\n31#1:845,14\n32#1:877,14\n33#1:907,14\n34#1:940,14\n35#1:973,14\n36#1:1006,14\n37#1:1039,14\n38#1:1072,14\n39#1:1105,14\n40#1:1138,14\n41#1:1171,14\n42#1:1204,14\n43#1:1237,14\n44#1:1270,14\n45#1:1303,14\n46#1:1336,14\n47#1:1369,14\n48#1:1402,14\n49#1:1435,14\n50#1:1468,14\n51#1:1501,14\n52#1:1534,14\n53#1:1567,14\n54#1:1600,14\n55#1:1633,14\n56#1:1666,14\n57#1:1699,14\n58#1:1732,14\n59#1:1765,14\n60#1:1798,14\n61#1:1831,14\n62#1:1864,14\n63#1:1897,14\n64#1:1930,14\n65#1:1963,14\n66#1:1996,14\n67#1:2029,14\n68#1:2062,14\n69#1:2095,14\n70#1:2128,14\n71#1:2161,14\n72#1:2194,14\n73#1:2227,14\n74#1:2260,14\n8#1:2280,5\n10#1:2285,5\n11#1:2290,5\n12#1:2295,5\n13#1:2300,5\n15#1:2305,5\n17#1:2310,5\n18#1:2315,5\n19#1:2320,5\n20#1:2325,5\n21#1:2330,5\n22#1:2335,5\n23#1:2340,5\n24#1:2345,5\n25#1:2350,5\n26#1:2355,5\n30#1:2360,5\n31#1:2365,5\n32#1:2370,5\n33#1:2375,5\n34#1:2380,5\n35#1:2385,5\n36#1:2390,5\n37#1:2395,5\n38#1:2400,5\n39#1:2405,5\n40#1:2410,5\n41#1:2415,5\n42#1:2420,5\n43#1:2425,5\n45#1:2430,5\n46#1:2435,5\n47#1:2440,5\n48#1:2445,5\n49#1:2450,5\n50#1:2455,5\n51#1:2460,5\n52#1:2465,5\n54#1:2470,5\n55#1:2475,5\n56#1:2480,5\n57#1:2485,5\n58#1:2490,5\n59#1:2495,5\n60#1:2500,5\n61#1:2505,5\n62#1:2510,5\n63#1:2515,5\n64#1:2520,5\n65#1:2525,5\n66#1:2530,5\n67#1:2535,5\n68#1:2540,5\n70#1:2545,5\n71#1:2550,5\n72#1:2555,5\n73#1:2560,5\n74#1:2565,5\n*E\n"})
/* loaded from: classes9.dex */
public final class z4 {
    public static final w4.o A0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.o((ObserverSentenceJourneyUC) single.i(kotlin.jvm.internal.o0.d(ObserverSentenceJourneyUC.class), null, null), (x5.d) single.i(kotlin.jvm.internal.o0.d(x5.d.class), null, null), (c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null), (com.baicizhan.app.biz.game.uc.sentence.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.a.class), null, null), (com.baicizhan.app.biz.game.uc.sentence.f) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.f.class), null, null), (com.baicizhan.app.biz.game.uc.sentence.d) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.d.class), null, null));
    }

    public static final f5.b A1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new f5.b((z5.g) single.i(kotlin.jvm.internal.o0.d(z5.g.class), null, null), (com.baicizhan.app.biz.game.repo.roadmap.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.roadmap.a.class), null, null), (e6.g) single.i(kotlin.jvm.internal.o0.d(e6.g.class), null, null), (v6.a) single.i(kotlin.jvm.internal.o0.d(v6.a.class), null, null));
    }

    public static final w4.q B0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.q((com.baicizhan.app.biz.game.uc.monetization.i) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.i.class), null, null), (com.baicizhan.app.biz.game.uc.monetization.f) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.f.class), null, null));
    }

    public static final g5.a B1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new g5.a((o6.f0) single.i(kotlin.jvm.internal.o0.d(o6.f0.class), null, null), (c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null), (o6.p) single.i(kotlin.jvm.internal.o0.d(o6.p.class), null, null), (com.baicizhan.app.biz.game.repo.gameround.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.gameround.e.class), null, null), (o6.x) single.i(kotlin.jvm.internal.o0.d(o6.x.class), null, null), (o6.n) single.i(kotlin.jvm.internal.o0.d(o6.n.class), null, null), (com.baicizhan.app.biz.game.uc.monetization.n) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.n.class), null, null), (com.baicizhan.app.biz.game.uc.monetization.k) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.k.class), null, null), (o6.a) single.i(kotlin.jvm.internal.o0.d(o6.a.class), null, null), (o6.t) single.i(kotlin.jvm.internal.o0.d(o6.t.class), null, null), (i6.a) single.i(kotlin.jvm.internal.o0.d(i6.a.class), null, null), (l6.x) single.i(kotlin.jvm.internal.o0.d(l6.x.class), null, null), (g6.i) single.i(kotlin.jvm.internal.o0.d(g6.i.class), null, null), (o6.d) single.i(kotlin.jvm.internal.o0.d(o6.d.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.t) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.t.class), null, null), (l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.biz.game.uc.monetization.d) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.d.class), null, null), (g6.a) single.i(kotlin.jvm.internal.o0.d(g6.a.class), null, null), (g6.g) single.i(kotlin.jvm.internal.o0.d(g6.g.class), null, null), (q5.a) single.i(kotlin.jvm.internal.o0.d(q5.a.class), null, null));
    }

    public static final w4.r C0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.r();
    }

    public static final j4.b C1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new j4.b((u5.b) single.i(kotlin.jvm.internal.o0.d(u5.b.class), null, null));
    }

    public static final l4.a D0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new l4.a((com.baicizhan.app.biz.game.uc.schedule.g) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.schedule.g.class), null, null), (com.baicizhan.app.biz.game.uc.schedule.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.schedule.a.class), null, null), (com.baicizhan.app.biz.game.uc.schedule.c) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.schedule.c.class), null, null), (com.baicizhan.app.biz.game.uc.schedule.h) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.schedule.h.class), null, null), (com.baicizhan.app.biz.game.uc.schedule.j) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.schedule.j.class), null, null));
    }

    public static final n4.h D1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new n4.h((r4.c) single.i(kotlin.jvm.internal.o0.d(r4.c.class), null, null), (p4.a) single.i(kotlin.jvm.internal.o0.d(p4.a.class), null, null), (t4.b) single.i(kotlin.jvm.internal.o0.d(t4.b.class), null, null));
    }

    public static final w4.v E0(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.v();
    }

    public static final v4.c E1(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new v4.c();
    }

    public static final y4.c F0(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new y4.c();
    }

    public static final v4.l F1(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new v4.l((v4.c) factory.i(kotlin.jvm.internal.o0.d(v4.c.class), null, null));
    }

    public static final y4.o G0(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new y4.o((y4.c) factory.i(kotlin.jvm.internal.o0.d(y4.c.class), null, null));
    }

    @m80.k
    public static final va0.c G1() {
        return eb0.e.b(false, new x00.l() { // from class: hb0.j2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 q02;
                q02 = z4.q0((va0.c) obj);
                return q02;
            }
        }, 1, null);
    }

    public static final WordsHomeViewModelImpl H0(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new WordsHomeViewModelImpl((y4.o) factory.i(kotlin.jvm.internal.o0.d(y4.o.class), null, null), (o6.d0) factory.i(kotlin.jvm.internal.o0.d(o6.d0.class), null, null), (t6.c) factory.i(kotlin.jvm.internal.o0.d(t6.c.class), null, null), (t6.e) factory.i(kotlin.jvm.internal.o0.d(t6.e.class), null, null), (o6.q) factory.i(kotlin.jvm.internal.o0.d(o6.q.class), null, null), (ObserveIpAvatarUC) factory.i(kotlin.jvm.internal.o0.d(ObserveIpAvatarUC.class), null, null), (o6.v) factory.i(kotlin.jvm.internal.o0.d(o6.v.class), null, null), (ObserveUserGameInfoWithoutRewardUC) factory.i(kotlin.jvm.internal.o0.d(ObserveUserGameInfoWithoutRewardUC.class), null, null), (ObserveUserCurrentBookIdUC) factory.i(kotlin.jvm.internal.o0.d(ObserveUserCurrentBookIdUC.class), null, null), (ObserveBookAndAdjustedDailyProgressUC) factory.i(kotlin.jvm.internal.o0.d(ObserveBookAndAdjustedDailyProgressUC.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.o) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.o.class), null, null), (ObserveStreakTasksUC) factory.i(kotlin.jvm.internal.o0.d(ObserveStreakTasksUC.class), null, null), (t5.a) factory.i(kotlin.jvm.internal.o0.d(t5.a.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.r) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.r.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.m) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.m.class), null, null), (ObserveLavaQuestUC) factory.i(kotlin.jvm.internal.o0.d(ObserveLavaQuestUC.class), null, null), (ObserverSentenceEntranceUC) factory.i(kotlin.jvm.internal.o0.d(ObserverSentenceEntranceUC.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.j) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.j.class), null, null), (com.baicizhan.app.biz.game.uc.ipavatar.a) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.ipavatar.a.class), null, null), (com.baicizhan.app.biz.game.uc.ipavatar.i) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.ipavatar.i.class), null, null), (ObserveTopAdUC) factory.i(kotlin.jvm.internal.o0.d(ObserveTopAdUC.class), null, null));
    }

    @m80.k
    public static final va0.c H1(@m80.k j4.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return G1();
    }

    public static final MyTabVMImpl I0(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new MyTabVMImpl((t5.a) factory.i(kotlin.jvm.internal.o0.d(t5.a.class), null, null));
    }

    public static final z4.a J0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new z4.a((l6.p) single.i(kotlin.jvm.internal.o0.d(l6.p.class), null, null), (l6.r) single.i(kotlin.jvm.internal.o0.d(l6.r.class), null, null));
    }

    public static final b5.a K0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.a((g6.a) single.i(kotlin.jvm.internal.o0.d(g6.a.class), null, null));
    }

    public static final b5.f L0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.f((o6.d) single.i(kotlin.jvm.internal.o0.d(o6.d.class), null, null));
    }

    public static final b5.i M0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.i((l6.d) single.i(kotlin.jvm.internal.o0.d(l6.d.class), null, null));
    }

    public static final b5.k N0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.k((com.baicizhan.app.biz.game.uc.monetization.d) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.d.class), null, null));
    }

    public static final m4.b O0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new m4.b((o6.b0) single.i(kotlin.jvm.internal.o0.d(o6.b0.class), null, null), (n6.g) single.i(kotlin.jvm.internal.o0.d(n6.g.class), null, null), (n6.i) single.i(kotlin.jvm.internal.o0.d(n6.i.class), null, null), (n6.a) single.i(kotlin.jvm.internal.o0.d(n6.a.class), null, null), (n6.f) single.i(kotlin.jvm.internal.o0.d(n6.f.class), null, null), (com.baicizhan.app.biz.game.uc.monetization.d) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.d.class), null, null), (c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null), (com.baicizhan.app.biz.game.uc.monetization.g) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.g.class), null, null), (s6.k) single.i(kotlin.jvm.internal.o0.d(s6.k.class), null, null), (s5.b) single.i(kotlin.jvm.internal.o0.d(s5.b.class), null, null), (com.baicizhan.app.biz.game.uc.monetization.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.a.class), null, null), (ObserveUserGameInfoWithoutRewardUC) single.i(kotlin.jvm.internal.o0.d(ObserveUserGameInfoWithoutRewardUC.class), null, null), (GetABTestUC) single.i(kotlin.jvm.internal.o0.d(GetABTestUC.class), null, null), (l6.h) single.i(kotlin.jvm.internal.o0.d(l6.h.class), null, null), (j6.b) single.i(kotlin.jvm.internal.o0.d(j6.b.class), null, null), (com.baicizhan.app.biz.game.uc.schedule.f) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.schedule.f.class), null, null));
    }

    public static final b5.m P0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.m((u6.a) single.i(kotlin.jvm.internal.o0.d(u6.a.class), null, null));
    }

    public static final b5.q Q0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.q((n6.a) single.i(kotlin.jvm.internal.o0.d(n6.a.class), null, null));
    }

    public static final b5.r R0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.r((o6.n) single.i(kotlin.jvm.internal.o0.d(o6.n.class), null, null));
    }

    public static final b5.t S0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.t((GetABTestUC) single.i(kotlin.jvm.internal.o0.d(GetABTestUC.class), null, null));
    }

    public static final b5.w T0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.w((c7.h) single.i(kotlin.jvm.internal.o0.d(c7.h.class), null, null));
    }

    public static final b5.x U0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.x((o6.p) single.i(kotlin.jvm.internal.o0.d(o6.p.class), null, null));
    }

    public static final b5.a0 V0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.a0();
    }

    public static final b5.b0 W0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.b0((c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null), (l6.o) single.i(kotlin.jvm.internal.o0.d(l6.o.class), null, null));
    }

    public static final b5.d0 X0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.d0((com.baicizhan.app.biz.game.uc.monetization.k) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.k.class), null, null));
    }

    public static final b5.e0 Y0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.e0((n6.g) single.i(kotlin.jvm.internal.o0.d(n6.g.class), null, null));
    }

    public static final p4.a Z0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p4.a((okio.b) single.i(kotlin.jvm.internal.o0.d(okio.b.class), null, null));
    }

    public static final b5.f0 a1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.f0((q5.a) single.i(kotlin.jvm.internal.o0.d(q5.a.class), null, null));
    }

    public static final b5.i0 b1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.i0((l6.p) single.i(kotlin.jvm.internal.o0.d(l6.p.class), null, null));
    }

    public static final b5.l0 c1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.l0((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null));
    }

    public static final b5.m0 d1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.m0((u6.c) single.i(kotlin.jvm.internal.o0.d(u6.c.class), null, null));
    }

    public static final b5.p0 e1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.p0((l6.u) single.i(kotlin.jvm.internal.o0.d(l6.u.class), null, null));
    }

    public static final b5.s0 f1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.s0();
    }

    public static final b5.u0 g1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.u0((i6.a) single.i(kotlin.jvm.internal.o0.d(i6.a.class), null, null));
    }

    public static final b5.g1 h1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.g1((l6.x) single.i(kotlin.jvm.internal.o0.d(l6.x.class), null, null), (g6.i) single.i(kotlin.jvm.internal.o0.d(g6.i.class), null, null));
    }

    public static final b5.i1 i1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.i1((com.baicizhan.app.biz.game.uc.monetization.n) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.monetization.n.class), null, null));
    }

    public static final b5.l1 j1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.l1((u5.b) single.i(kotlin.jvm.internal.o0.d(u5.b.class), null, null));
    }

    public static final r4.c k1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new r4.c((l6.x) single.i(kotlin.jvm.internal.o0.d(l6.x.class), null, null), (l6.d) single.i(kotlin.jvm.internal.o0.d(l6.d.class), null, null), (com.baicizhan.app.biz.game.repo.gameround.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.gameround.e.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.t) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.t.class), null, null), (o6.f0) single.i(kotlin.jvm.internal.o0.d(o6.f0.class), null, null), (o6.a) single.i(kotlin.jvm.internal.o0.d(o6.a.class), null, null), (o6.t) single.i(kotlin.jvm.internal.o0.d(o6.t.class), null, null), (o6.p) single.i(kotlin.jvm.internal.o0.d(o6.p.class), null, null), (l6.p) single.i(kotlin.jvm.internal.o0.d(l6.p.class), null, null), (n6.g) single.i(kotlin.jvm.internal.o0.d(n6.g.class), null, null), (n6.a) single.i(kotlin.jvm.internal.o0.d(n6.a.class), null, null), (c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null));
    }

    public static final b5.m1 l1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.m1((g6.g) single.i(kotlin.jvm.internal.o0.d(g6.g.class), null, null));
    }

    public static final b5.o1 m1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.o1((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null));
    }

    public static final b5.p1 n1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.p1((com.baicizhan.app.biz.game.uc.sentence.l) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.l.class), null, null));
    }

    public static final b5.q1 o1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.q1((com.baicizhan.app.biz.game.uc.sentence.n) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.n.class), null, null));
    }

    public static final b5.s1 p1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.s1((o6.f0) single.i(kotlin.jvm.internal.o0.d(o6.f0.class), null, null), (c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null));
    }

    public static final yz.g2 q0(va0.c module) {
        kotlin.jvm.internal.g0.p(module, "$this$module");
        x00.p pVar = new x00.p() { // from class: hb0.u2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                k4.a r02;
                r02 = z4.r0((cb0.b) obj, (ya0.a) obj2);
                return r02;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a11, kotlin.jvm.internal.o0.d(k4.a.class), null, pVar, kind, a00.h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        eb0.a.b(new ra0.f(module, hVar), kotlin.jvm.internal.o0.d(k3.p0.class));
        x00.p pVar2 = new x00.p() { // from class: hb0.m2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                k4.b s02;
                s02 = z4.s0((cb0.b) obj, (ya0.a) obj2);
                return s02;
            }
        };
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(k4.b.class), null, pVar2, kind, a00.h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        new ra0.f(module, hVar2);
        x00.p pVar3 = new x00.p() { // from class: hb0.y2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                l4.a D0;
                D0 = z4.D0((cb0.b) obj, (ya0.a) obj2);
                return D0;
            }
        };
        ta0.h<?> hVar3 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(l4.a.class), null, pVar3, kind, a00.h0.J()));
        module.q(hVar3);
        if (module.m()) {
            module.v(hVar3);
        }
        eb0.a.b(new ra0.f(module, hVar3), kotlin.jvm.internal.o0.d(k3.r0.class));
        x00.p pVar4 = new x00.p() { // from class: hb0.k3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                m4.b O0;
                O0 = z4.O0((cb0.b) obj, (ya0.a) obj2);
                return O0;
            }
        };
        ta0.h<?> hVar4 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(m4.b.class), null, pVar4, kind, a00.h0.J()));
        module.q(hVar4);
        if (module.m()) {
            module.v(hVar4);
        }
        eb0.a.b(new ra0.f(module, hVar4), kotlin.jvm.internal.o0.d(k3.s0.class));
        x00.p pVar5 = new x00.p() { // from class: hb0.w3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p4.a Z0;
                Z0 = z4.Z0((cb0.b) obj, (ya0.a) obj2);
                return Z0;
            }
        };
        ta0.h<?> hVar5 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p4.a.class), null, pVar5, kind, a00.h0.J()));
        module.q(hVar5);
        if (module.m()) {
            module.v(hVar5);
        }
        eb0.a.b(new ra0.f(module, hVar5), kotlin.jvm.internal.o0.d(q4.h.class));
        x00.p pVar6 = new x00.p() { // from class: hb0.i4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                r4.c k12;
                k12 = z4.k1((cb0.b) obj, (ya0.a) obj2);
                return k12;
            }
        };
        ta0.h<?> hVar6 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(r4.c.class), null, pVar6, kind, a00.h0.J()));
        module.q(hVar6);
        if (module.m()) {
            module.v(hVar6);
        }
        eb0.a.b(new ra0.f(module, hVar6), kotlin.jvm.internal.o0.d(q4.h.class));
        x00.p pVar7 = new x00.p() { // from class: hb0.r4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                t4.b v12;
                v12 = z4.v1((cb0.b) obj, (ya0.a) obj2);
                return v12;
            }
        };
        ta0.h<?> hVar7 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(t4.b.class), null, pVar7, kind, a00.h0.J()));
        module.q(hVar7);
        if (module.m()) {
            module.v(hVar7);
        }
        eb0.a.b(new ra0.f(module, hVar7), kotlin.jvm.internal.o0.d(q4.h.class));
        x00.p pVar8 = new x00.p() { // from class: hb0.s4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                n4.h D1;
                D1 = z4.D1((cb0.b) obj, (ya0.a) obj2);
                return D1;
            }
        };
        ta0.h<?> hVar8 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(n4.h.class), null, pVar8, kind, a00.h0.J()));
        module.q(hVar8);
        if (module.m()) {
            module.v(hVar8);
        }
        eb0.a.b(new ra0.f(module, hVar8), kotlin.jvm.internal.o0.d(k3.c1.class));
        x00.p pVar9 = new x00.p() { // from class: hb0.t4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                v4.c E1;
                E1 = z4.E1((cb0.b) obj, (ya0.a) obj2);
                return E1;
            }
        };
        za0.c a12 = aVar.a();
        Kind kind2 = Kind.Factory;
        ta0.b<?> aVar2 = new ta0.a<>(new ra0.b(a12, kotlin.jvm.internal.o0.d(v4.c.class), null, pVar9, kind2, a00.h0.J()));
        module.q(aVar2);
        new ra0.f(module, aVar2);
        x00.p pVar10 = new x00.p() { // from class: hb0.u4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                v4.l F1;
                F1 = z4.F1((cb0.b) obj, (ya0.a) obj2);
                return F1;
            }
        };
        ta0.b<?> aVar3 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(v4.l.class), null, pVar10, kind2, a00.h0.J()));
        module.q(aVar3);
        new ra0.f(module, aVar3);
        x00.p pVar11 = new x00.p() { // from class: hb0.f3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                SentenceHomeVMImpl t02;
                t02 = z4.t0((cb0.b) obj, (ya0.a) obj2);
                return t02;
            }
        };
        ta0.b<?> aVar4 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(SentenceHomeVMImpl.class), null, pVar11, kind2, a00.h0.J()));
        module.q(aVar4);
        eb0.a.b(new ra0.f(module, aVar4), kotlin.jvm.internal.o0.d(k3.v2.class));
        x00.p pVar12 = new x00.p() { // from class: hb0.q3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.a u02;
                u02 = z4.u0((cb0.b) obj, (ya0.a) obj2);
                return u02;
            }
        };
        ta0.h<?> hVar9 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.a.class), null, pVar12, kind, a00.h0.J()));
        module.q(hVar9);
        if (module.m()) {
            module.v(hVar9);
        }
        eb0.a.b(new ra0.f(module, hVar9), kotlin.jvm.internal.o0.d(c4.j.class));
        x00.p pVar13 = new x00.p() { // from class: hb0.b4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.c v02;
                v02 = z4.v0((cb0.b) obj, (ya0.a) obj2);
                return v02;
            }
        };
        ta0.h<?> hVar10 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.c.class), null, pVar13, kind, a00.h0.J()));
        module.q(hVar10);
        if (module.m()) {
            module.v(hVar10);
        }
        new ra0.f(module, hVar10);
        x00.p pVar14 = new x00.p() { // from class: hb0.m4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.e w02;
                w02 = z4.w0((cb0.b) obj, (ya0.a) obj2);
                return w02;
            }
        };
        ta0.h<?> hVar11 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.e.class), null, pVar14, kind, a00.h0.J()));
        module.q(hVar11);
        if (module.m()) {
            module.v(hVar11);
        }
        eb0.a.b(new ra0.f(module, hVar11), kotlin.jvm.internal.o0.d(c4.j.class));
        x00.p pVar15 = new x00.p() { // from class: hb0.v4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.g x02;
                x02 = z4.x0((cb0.b) obj, (ya0.a) obj2);
                return x02;
            }
        };
        ta0.h<?> hVar12 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.g.class), null, pVar15, kind, a00.h0.J()));
        module.q(hVar12);
        if (module.m()) {
            module.v(hVar12);
        }
        eb0.a.b(new ra0.f(module, hVar12), kotlin.jvm.internal.o0.d(c4.j.class));
        x00.p pVar16 = new x00.p() { // from class: hb0.w4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.j y02;
                y02 = z4.y0((cb0.b) obj, (ya0.a) obj2);
                return y02;
            }
        };
        ta0.b<?> aVar5 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.j.class), null, pVar16, kind2, a00.h0.J()));
        module.q(aVar5);
        eb0.a.b(new ra0.f(module, aVar5), kotlin.jvm.internal.o0.d(c4.j.class));
        x00.p pVar17 = new x00.p() { // from class: hb0.x4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.m z02;
                z02 = z4.z0((cb0.b) obj, (ya0.a) obj2);
                return z02;
            }
        };
        ta0.h<?> hVar13 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.m.class), null, pVar17, kind, a00.h0.J()));
        module.q(hVar13);
        if (module.m()) {
            module.v(hVar13);
        }
        eb0.a.b(new ra0.f(module, hVar13), kotlin.jvm.internal.o0.d(c4.j.class));
        x00.p pVar18 = new x00.p() { // from class: hb0.y4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.o A0;
                A0 = z4.A0((cb0.b) obj, (ya0.a) obj2);
                return A0;
            }
        };
        ta0.h<?> hVar14 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.o.class), null, pVar18, kind, a00.h0.J()));
        module.q(hVar14);
        if (module.m()) {
            module.v(hVar14);
        }
        new ra0.f(module, hVar14);
        x00.p pVar19 = new x00.p() { // from class: hb0.k2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.q B0;
                B0 = z4.B0((cb0.b) obj, (ya0.a) obj2);
                return B0;
            }
        };
        ta0.h<?> hVar15 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.q.class), null, pVar19, kind, a00.h0.J()));
        module.q(hVar15);
        if (module.m()) {
            module.v(hVar15);
        }
        eb0.a.b(new ra0.f(module, hVar15), kotlin.jvm.internal.o0.d(c4.j.class));
        x00.p pVar20 = new x00.p() { // from class: hb0.l2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.r C0;
                C0 = z4.C0((cb0.b) obj, (ya0.a) obj2);
                return C0;
            }
        };
        ta0.h<?> hVar16 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.r.class), null, pVar20, kind, a00.h0.J()));
        module.q(hVar16);
        if (module.m()) {
            module.v(hVar16);
        }
        eb0.a.b(new ra0.f(module, hVar16), kotlin.jvm.internal.o0.d(c4.j.class));
        x00.p pVar21 = new x00.p() { // from class: hb0.n2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w4.v E0;
                E0 = z4.E0((cb0.b) obj, (ya0.a) obj2);
                return E0;
            }
        };
        ta0.b<?> aVar6 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w4.v.class), null, pVar21, kind2, a00.h0.J()));
        module.q(aVar6);
        new ra0.f(module, aVar6);
        x00.p pVar22 = new x00.p() { // from class: hb0.o2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                y4.c F0;
                F0 = z4.F0((cb0.b) obj, (ya0.a) obj2);
                return F0;
            }
        };
        ta0.b<?> aVar7 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(y4.c.class), null, pVar22, kind2, a00.h0.J()));
        module.q(aVar7);
        new ra0.f(module, aVar7);
        x00.p pVar23 = new x00.p() { // from class: hb0.p2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                y4.o G0;
                G0 = z4.G0((cb0.b) obj, (ya0.a) obj2);
                return G0;
            }
        };
        ta0.b<?> aVar8 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(y4.o.class), null, pVar23, kind2, a00.h0.J()));
        module.q(aVar8);
        new ra0.f(module, aVar8);
        x00.p pVar24 = new x00.p() { // from class: hb0.q2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                WordsHomeViewModelImpl H0;
                H0 = z4.H0((cb0.b) obj, (ya0.a) obj2);
                return H0;
            }
        };
        ta0.b<?> aVar9 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(WordsHomeViewModelImpl.class), null, pVar24, kind2, a00.h0.J()));
        module.q(aVar9);
        eb0.a.b(new ra0.f(module, aVar9), kotlin.jvm.internal.o0.d(k3.p4.class));
        x00.p pVar25 = new x00.p() { // from class: hb0.r2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                MyTabVMImpl I0;
                I0 = z4.I0((cb0.b) obj, (ya0.a) obj2);
                return I0;
            }
        };
        ta0.b<?> aVar10 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(MyTabVMImpl.class), null, pVar25, kind2, a00.h0.J()));
        module.q(aVar10);
        eb0.a.b(new ra0.f(module, aVar10), kotlin.jvm.internal.o0.d(k3.x1.class));
        x00.p pVar26 = new x00.p() { // from class: hb0.s2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                z4.a J0;
                J0 = z4.J0((cb0.b) obj, (ya0.a) obj2);
                return J0;
            }
        };
        ta0.h<?> hVar17 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(z4.a.class), null, pVar26, kind, a00.h0.J()));
        module.q(hVar17);
        if (module.m()) {
            module.v(hVar17);
        }
        eb0.a.b(new ra0.f(module, hVar17), kotlin.jvm.internal.o0.d(k3.j3.class));
        x00.p pVar27 = new x00.p() { // from class: hb0.t2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.a K0;
                K0 = z4.K0((cb0.b) obj, (ya0.a) obj2);
                return K0;
            }
        };
        ta0.h<?> hVar18 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.a.class), null, pVar27, kind, a00.h0.J()));
        module.q(hVar18);
        if (module.m()) {
            module.v(hVar18);
        }
        eb0.a.b(new ra0.f(module, hVar18), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar28 = new x00.p() { // from class: hb0.v2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.f L0;
                L0 = z4.L0((cb0.b) obj, (ya0.a) obj2);
                return L0;
            }
        };
        ta0.h<?> hVar19 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.f.class), null, pVar28, kind, a00.h0.J()));
        module.q(hVar19);
        if (module.m()) {
            module.v(hVar19);
        }
        eb0.a.b(new ra0.f(module, hVar19), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar29 = new x00.p() { // from class: hb0.w2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.i M0;
                M0 = z4.M0((cb0.b) obj, (ya0.a) obj2);
                return M0;
            }
        };
        ta0.h<?> hVar20 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.i.class), null, pVar29, kind, a00.h0.J()));
        module.q(hVar20);
        if (module.m()) {
            module.v(hVar20);
        }
        eb0.a.b(new ra0.f(module, hVar20), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar30 = new x00.p() { // from class: hb0.x2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.k N0;
                N0 = z4.N0((cb0.b) obj, (ya0.a) obj2);
                return N0;
            }
        };
        ta0.h<?> hVar21 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.k.class), null, pVar30, kind, a00.h0.J()));
        module.q(hVar21);
        if (module.m()) {
            module.v(hVar21);
        }
        eb0.a.b(new ra0.f(module, hVar21), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar31 = new x00.p() { // from class: hb0.z2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.m P0;
                P0 = z4.P0((cb0.b) obj, (ya0.a) obj2);
                return P0;
            }
        };
        ta0.h<?> hVar22 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.m.class), null, pVar31, kind, a00.h0.J()));
        module.q(hVar22);
        if (module.m()) {
            module.v(hVar22);
        }
        eb0.a.b(new ra0.f(module, hVar22), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar32 = new x00.p() { // from class: hb0.a3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.q Q0;
                Q0 = z4.Q0((cb0.b) obj, (ya0.a) obj2);
                return Q0;
            }
        };
        ta0.h<?> hVar23 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.q.class), null, pVar32, kind, a00.h0.J()));
        module.q(hVar23);
        if (module.m()) {
            module.v(hVar23);
        }
        eb0.a.b(new ra0.f(module, hVar23), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar33 = new x00.p() { // from class: hb0.b3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.r R0;
                R0 = z4.R0((cb0.b) obj, (ya0.a) obj2);
                return R0;
            }
        };
        ta0.h<?> hVar24 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.r.class), null, pVar33, kind, a00.h0.J()));
        module.q(hVar24);
        if (module.m()) {
            module.v(hVar24);
        }
        eb0.a.b(new ra0.f(module, hVar24), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar34 = new x00.p() { // from class: hb0.c3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.t S0;
                S0 = z4.S0((cb0.b) obj, (ya0.a) obj2);
                return S0;
            }
        };
        ta0.h<?> hVar25 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.t.class), null, pVar34, kind, a00.h0.J()));
        module.q(hVar25);
        if (module.m()) {
            module.v(hVar25);
        }
        eb0.a.b(new ra0.f(module, hVar25), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar35 = new x00.p() { // from class: hb0.d3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.w T0;
                T0 = z4.T0((cb0.b) obj, (ya0.a) obj2);
                return T0;
            }
        };
        ta0.h<?> hVar26 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.w.class), null, pVar35, kind, a00.h0.J()));
        module.q(hVar26);
        if (module.m()) {
            module.v(hVar26);
        }
        eb0.a.b(new ra0.f(module, hVar26), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar36 = new x00.p() { // from class: hb0.e3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.x U0;
                U0 = z4.U0((cb0.b) obj, (ya0.a) obj2);
                return U0;
            }
        };
        ta0.h<?> hVar27 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.x.class), null, pVar36, kind, a00.h0.J()));
        module.q(hVar27);
        if (module.m()) {
            module.v(hVar27);
        }
        eb0.a.b(new ra0.f(module, hVar27), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar37 = new x00.p() { // from class: hb0.g3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.a0 V0;
                V0 = z4.V0((cb0.b) obj, (ya0.a) obj2);
                return V0;
            }
        };
        ta0.h<?> hVar28 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.a0.class), null, pVar37, kind, a00.h0.J()));
        module.q(hVar28);
        if (module.m()) {
            module.v(hVar28);
        }
        eb0.a.b(new ra0.f(module, hVar28), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar38 = new x00.p() { // from class: hb0.h3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.b0 W0;
                W0 = z4.W0((cb0.b) obj, (ya0.a) obj2);
                return W0;
            }
        };
        ta0.h<?> hVar29 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.b0.class), null, pVar38, kind, a00.h0.J()));
        module.q(hVar29);
        if (module.m()) {
            module.v(hVar29);
        }
        eb0.a.b(new ra0.f(module, hVar29), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar39 = new x00.p() { // from class: hb0.i3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.d0 X0;
                X0 = z4.X0((cb0.b) obj, (ya0.a) obj2);
                return X0;
            }
        };
        ta0.h<?> hVar30 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.d0.class), null, pVar39, kind, a00.h0.J()));
        module.q(hVar30);
        if (module.m()) {
            module.v(hVar30);
        }
        eb0.a.b(new ra0.f(module, hVar30), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar40 = new x00.p() { // from class: hb0.j3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.e0 Y0;
                Y0 = z4.Y0((cb0.b) obj, (ya0.a) obj2);
                return Y0;
            }
        };
        ta0.h<?> hVar31 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.e0.class), null, pVar40, kind, a00.h0.J()));
        module.q(hVar31);
        if (module.m()) {
            module.v(hVar31);
        }
        eb0.a.b(new ra0.f(module, hVar31), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar41 = new x00.p() { // from class: hb0.l3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.f0 a13;
                a13 = z4.a1((cb0.b) obj, (ya0.a) obj2);
                return a13;
            }
        };
        ta0.h<?> hVar32 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.f0.class), null, pVar41, kind, a00.h0.J()));
        module.q(hVar32);
        if (module.m()) {
            module.v(hVar32);
        }
        eb0.a.b(new ra0.f(module, hVar32), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar42 = new x00.p() { // from class: hb0.m3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.i0 b12;
                b12 = z4.b1((cb0.b) obj, (ya0.a) obj2);
                return b12;
            }
        };
        ta0.h<?> hVar33 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.i0.class), null, pVar42, kind, a00.h0.J()));
        module.q(hVar33);
        if (module.m()) {
            module.v(hVar33);
        }
        eb0.a.b(new ra0.f(module, hVar33), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar43 = new x00.p() { // from class: hb0.n3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.l0 c12;
                c12 = z4.c1((cb0.b) obj, (ya0.a) obj2);
                return c12;
            }
        };
        ta0.h<?> hVar34 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.l0.class), null, pVar43, kind, a00.h0.J()));
        module.q(hVar34);
        if (module.m()) {
            module.v(hVar34);
        }
        eb0.a.b(new ra0.f(module, hVar34), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar44 = new x00.p() { // from class: hb0.o3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.m0 d12;
                d12 = z4.d1((cb0.b) obj, (ya0.a) obj2);
                return d12;
            }
        };
        ta0.h<?> hVar35 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.m0.class), null, pVar44, kind, a00.h0.J()));
        module.q(hVar35);
        if (module.m()) {
            module.v(hVar35);
        }
        eb0.a.b(new ra0.f(module, hVar35), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar45 = new x00.p() { // from class: hb0.p3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.p0 e12;
                e12 = z4.e1((cb0.b) obj, (ya0.a) obj2);
                return e12;
            }
        };
        ta0.h<?> hVar36 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.p0.class), null, pVar45, kind, a00.h0.J()));
        module.q(hVar36);
        if (module.m()) {
            module.v(hVar36);
        }
        eb0.a.b(new ra0.f(module, hVar36), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar46 = new x00.p() { // from class: hb0.r3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.s0 f12;
                f12 = z4.f1((cb0.b) obj, (ya0.a) obj2);
                return f12;
            }
        };
        ta0.h<?> hVar37 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.s0.class), null, pVar46, kind, a00.h0.J()));
        module.q(hVar37);
        if (module.m()) {
            module.v(hVar37);
        }
        eb0.a.b(new ra0.f(module, hVar37), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar47 = new x00.p() { // from class: hb0.s3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.u0 g12;
                g12 = z4.g1((cb0.b) obj, (ya0.a) obj2);
                return g12;
            }
        };
        ta0.h<?> hVar38 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.u0.class), null, pVar47, kind, a00.h0.J()));
        module.q(hVar38);
        if (module.m()) {
            module.v(hVar38);
        }
        eb0.a.b(new ra0.f(module, hVar38), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar48 = new x00.p() { // from class: hb0.t3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.g1 h12;
                h12 = z4.h1((cb0.b) obj, (ya0.a) obj2);
                return h12;
            }
        };
        ta0.h<?> hVar39 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.g1.class), null, pVar48, kind, a00.h0.J()));
        module.q(hVar39);
        if (module.m()) {
            module.v(hVar39);
        }
        eb0.a.b(new ra0.f(module, hVar39), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar49 = new x00.p() { // from class: hb0.u3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.i1 i12;
                i12 = z4.i1((cb0.b) obj, (ya0.a) obj2);
                return i12;
            }
        };
        ta0.h<?> hVar40 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.i1.class), null, pVar49, kind, a00.h0.J()));
        module.q(hVar40);
        if (module.m()) {
            module.v(hVar40);
        }
        eb0.a.b(new ra0.f(module, hVar40), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar50 = new x00.p() { // from class: hb0.v3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.l1 j12;
                j12 = z4.j1((cb0.b) obj, (ya0.a) obj2);
                return j12;
            }
        };
        ta0.h<?> hVar41 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.l1.class), null, pVar50, kind, a00.h0.J()));
        module.q(hVar41);
        if (module.m()) {
            module.v(hVar41);
        }
        eb0.a.b(new ra0.f(module, hVar41), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar51 = new x00.p() { // from class: hb0.x3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.m1 l12;
                l12 = z4.l1((cb0.b) obj, (ya0.a) obj2);
                return l12;
            }
        };
        ta0.h<?> hVar42 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.m1.class), null, pVar51, kind, a00.h0.J()));
        module.q(hVar42);
        if (module.m()) {
            module.v(hVar42);
        }
        eb0.a.b(new ra0.f(module, hVar42), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar52 = new x00.p() { // from class: hb0.y3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.o1 m12;
                m12 = z4.m1((cb0.b) obj, (ya0.a) obj2);
                return m12;
            }
        };
        ta0.h<?> hVar43 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.o1.class), null, pVar52, kind, a00.h0.J()));
        module.q(hVar43);
        if (module.m()) {
            module.v(hVar43);
        }
        eb0.a.b(new ra0.f(module, hVar43), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar53 = new x00.p() { // from class: hb0.z3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.p1 n12;
                n12 = z4.n1((cb0.b) obj, (ya0.a) obj2);
                return n12;
            }
        };
        ta0.h<?> hVar44 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.p1.class), null, pVar53, kind, a00.h0.J()));
        module.q(hVar44);
        if (module.m()) {
            module.v(hVar44);
        }
        eb0.a.b(new ra0.f(module, hVar44), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar54 = new x00.p() { // from class: hb0.a4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.q1 o12;
                o12 = z4.o1((cb0.b) obj, (ya0.a) obj2);
                return o12;
            }
        };
        ta0.h<?> hVar45 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.q1.class), null, pVar54, kind, a00.h0.J()));
        module.q(hVar45);
        if (module.m()) {
            module.v(hVar45);
        }
        eb0.a.b(new ra0.f(module, hVar45), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar55 = new x00.p() { // from class: hb0.c4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.s1 p12;
                p12 = z4.p1((cb0.b) obj, (ya0.a) obj2);
                return p12;
            }
        };
        ta0.h<?> hVar46 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.s1.class), null, pVar55, kind, a00.h0.J()));
        module.q(hVar46);
        if (module.m()) {
            module.v(hVar46);
        }
        eb0.a.b(new ra0.f(module, hVar46), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar56 = new x00.p() { // from class: hb0.d4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.v1 q12;
                q12 = z4.q1((cb0.b) obj, (ya0.a) obj2);
                return q12;
            }
        };
        ta0.h<?> hVar47 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.v1.class), null, pVar56, kind, a00.h0.J()));
        module.q(hVar47);
        if (module.m()) {
            module.v(hVar47);
        }
        eb0.a.b(new ra0.f(module, hVar47), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar57 = new x00.p() { // from class: hb0.e4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.z1 r12;
                r12 = z4.r1((cb0.b) obj, (ya0.a) obj2);
                return r12;
            }
        };
        ta0.h<?> hVar48 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.z1.class), null, pVar57, kind, a00.h0.J()));
        module.q(hVar48);
        if (module.m()) {
            module.v(hVar48);
        }
        eb0.a.b(new ra0.f(module, hVar48), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar58 = new x00.p() { // from class: hb0.f4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.c2 s12;
                s12 = z4.s1((cb0.b) obj, (ya0.a) obj2);
                return s12;
            }
        };
        ta0.h<?> hVar49 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.c2.class), null, pVar58, kind, a00.h0.J()));
        module.q(hVar49);
        if (module.m()) {
            module.v(hVar49);
        }
        eb0.a.b(new ra0.f(module, hVar49), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar59 = new x00.p() { // from class: hb0.g4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.d2 t12;
                t12 = z4.t1((cb0.b) obj, (ya0.a) obj2);
                return t12;
            }
        };
        ta0.h<?> hVar50 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.d2.class), null, pVar59, kind, a00.h0.J()));
        module.q(hVar50);
        if (module.m()) {
            module.v(hVar50);
        }
        eb0.a.b(new ra0.f(module, hVar50), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar60 = new x00.p() { // from class: hb0.h4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b5.g2 u12;
                u12 = z4.u1((cb0.b) obj, (ya0.a) obj2);
                return u12;
            }
        };
        ta0.h<?> hVar51 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b5.g2.class), null, pVar60, kind, a00.h0.J()));
        module.q(hVar51);
        if (module.m()) {
            module.v(hVar51);
        }
        eb0.a.b(new ra0.f(module, hVar51), kotlin.jvm.internal.o0.d(d5.f.class));
        x00.p pVar61 = new x00.p() { // from class: hb0.j4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                d5.a w12;
                w12 = z4.w1((cb0.b) obj, (ya0.a) obj2);
                return w12;
            }
        };
        ta0.h<?> hVar52 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(d5.a.class), null, pVar61, kind, a00.h0.J()));
        module.q(hVar52);
        if (module.m()) {
            module.v(hVar52);
        }
        new ra0.f(module, hVar52);
        x00.p pVar62 = new x00.p() { // from class: hb0.k4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                d5.c x12;
                x12 = z4.x1((cb0.b) obj, (ya0.a) obj2);
                return x12;
            }
        };
        ta0.h<?> hVar53 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(d5.c.class), null, pVar62, kind, a00.h0.J()));
        module.q(hVar53);
        if (module.m()) {
            module.v(hVar53);
        }
        eb0.a.b(new ra0.f(module, hVar53), kotlin.jvm.internal.o0.d(d5.g.class));
        x00.p pVar63 = new x00.p() { // from class: hb0.l4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                d5.e y12;
                y12 = z4.y1((cb0.b) obj, (ya0.a) obj2);
                return y12;
            }
        };
        ta0.h<?> hVar54 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(d5.e.class), null, pVar63, kind, a00.h0.J()));
        module.q(hVar54);
        if (module.m()) {
            module.v(hVar54);
        }
        new ra0.f(module, hVar54);
        x00.p pVar64 = new x00.p() { // from class: hb0.n4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                a5.a z12;
                z12 = z4.z1((cb0.b) obj, (ya0.a) obj2);
                return z12;
            }
        };
        ta0.h<?> hVar55 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(a5.a.class), null, pVar64, kind, a00.h0.J()));
        module.q(hVar55);
        if (module.m()) {
            module.v(hVar55);
        }
        eb0.a.b(new ra0.f(module, hVar55), kotlin.jvm.internal.o0.d(k3.f1.class));
        x00.p pVar65 = new x00.p() { // from class: hb0.o4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                f5.b A1;
                A1 = z4.A1((cb0.b) obj, (ya0.a) obj2);
                return A1;
            }
        };
        ta0.h<?> hVar56 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(f5.b.class), null, pVar65, kind, a00.h0.J()));
        module.q(hVar56);
        if (module.m()) {
            module.v(hVar56);
        }
        eb0.a.b(new ra0.f(module, hVar56), kotlin.jvm.internal.o0.d(k3.w0.class));
        x00.p pVar66 = new x00.p() { // from class: hb0.p4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g5.a B1;
                B1 = z4.B1((cb0.b) obj, (ya0.a) obj2);
                return B1;
            }
        };
        ta0.h<?> hVar57 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(g5.a.class), null, pVar66, kind, a00.h0.J()));
        module.q(hVar57);
        if (module.m()) {
            module.v(hVar57);
        }
        eb0.a.b(new ra0.f(module, hVar57), kotlin.jvm.internal.o0.d(k3.n4.class));
        x00.p pVar67 = new x00.p() { // from class: hb0.q4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                j4.b C1;
                C1 = z4.C1((cb0.b) obj, (ya0.a) obj2);
                return C1;
            }
        };
        ta0.h<?> hVar58 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(j4.b.class), null, pVar67, kind, a00.h0.J()));
        module.q(hVar58);
        if (module.m()) {
            module.v(hVar58);
        }
        eb0.a.b(new ra0.f(module, hVar58), kotlin.jvm.internal.o0.d(k3.e1.class));
        return yz.g2.f100423a;
    }

    public static final b5.v1 q1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.v1((o6.a) single.i(kotlin.jvm.internal.o0.d(o6.a.class), null, null), (o6.t) single.i(kotlin.jvm.internal.o0.d(o6.t.class), null, null));
    }

    public static final k4.a r0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new k4.a((com.baicizhan.app.biz.game.repo.gameround.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.gameround.e.class), null, null), (c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null), (b6.a) single.i(kotlin.jvm.internal.o0.d(b6.a.class), null, null), (w5.a) single.i(kotlin.jvm.internal.o0.d(w5.a.class), null, null), (k4.b) single.i(kotlin.jvm.internal.o0.d(k4.b.class), null, null), (s5.a) single.i(kotlin.jvm.internal.o0.d(s5.a.class), null, null), (p5.b) single.i(kotlin.jvm.internal.o0.d(p5.b.class), null, null), (p5.d) single.i(kotlin.jvm.internal.o0.d(p5.d.class), null, null), (p5.c) single.i(kotlin.jvm.internal.o0.d(p5.c.class), null, null), (com.baicizhan.app.biz.game.uc.user.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.user.e.class), null, null), (com.baicizhan.app.biz.game.uc.sentence.l) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.l.class), null, null), (com.baicizhan.app.biz.game.uc.sentence.n) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.n.class), null, null), (v5.g) single.i(kotlin.jvm.internal.o0.d(v5.g.class), null, null));
    }

    public static final b5.z1 r1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.z1((com.baicizhan.app.biz.game.uc.sentence.j) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.j.class), null, null));
    }

    public static final k4.b s0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new k4.b();
    }

    public static final b5.c2 s1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.c2((o6.x) single.i(kotlin.jvm.internal.o0.d(o6.x.class), null, null));
    }

    public static final SentenceHomeVMImpl t0(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new SentenceHomeVMImpl((v4.l) factory.i(kotlin.jvm.internal.o0.d(v4.l.class), null, null), (t6.a) factory.i(kotlin.jvm.internal.o0.d(t6.a.class), null, null), (com.baicizhan.app.biz.game.uc.sentence.i) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.i.class), null, null), (ObserveUserGameInfoWithoutRewardUC) factory.i(kotlin.jvm.internal.o0.d(ObserveUserGameInfoWithoutRewardUC.class), null, null), (com.baicizhan.app.biz.game.uc.sentence.b) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.sentence.b.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.o) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.o.class), null, null), (ObserveStreakTasksUC) factory.i(kotlin.jvm.internal.o0.d(ObserveStreakTasksUC.class), null, null), (t5.a) factory.i(kotlin.jvm.internal.o0.d(t5.a.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.r) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.r.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.m) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.m.class), null, null), (com.baicizhan.app.biz.game.uc.user.e) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.user.e.class), null, null), (ObserveUserCurrentSkuIdUC) factory.i(kotlin.jvm.internal.o0.d(ObserveUserCurrentSkuIdUC.class), null, null), (ObserveIpAvatarUC) factory.i(kotlin.jvm.internal.o0.d(ObserveIpAvatarUC.class), null, null), (com.baicizhan.app.biz.game.uc.ipavatar.i) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.ipavatar.i.class), null, null), (com.baicizhan.app.biz.game.uc.ipavatar.a) factory.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.ipavatar.a.class), null, null));
    }

    public static final b5.d2 t1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.d2((com.baicizhan.app.biz.game.repo.gameround.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.gameround.e.class), null, null));
    }

    public static final w4.a u0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.a((w4.o) single.i(kotlin.jvm.internal.o0.d(w4.o.class), null, null), (c6.b) single.i(kotlin.jvm.internal.o0.d(c6.b.class), null, null));
    }

    public static final b5.g2 u1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b5.g2((com.baicizhan.app.biz.game.uc.incentive.t) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.t.class), null, null));
    }

    public static final w4.c v0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.c((w5.a) single.i(kotlin.jvm.internal.o0.d(w5.a.class), null, null), (b6.a) single.i(kotlin.jvm.internal.o0.d(b6.a.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.i) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.i.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.c) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.c.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.l) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.l.class), null, null), (p6.d) single.i(kotlin.jvm.internal.o0.d(p6.d.class), null, null), (v5.e) single.i(kotlin.jvm.internal.o0.d(v5.e.class), null, null));
    }

    public static final t4.b v1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new t4.b();
    }

    public static final w4.e w0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.e((b6.a) single.i(kotlin.jvm.internal.o0.d(b6.a.class), null, null), (q5.a) single.i(kotlin.jvm.internal.o0.d(q5.a.class), null, null), (ObserveIpAvatarUC) single.i(kotlin.jvm.internal.o0.d(ObserveIpAvatarUC.class), null, null), (com.baicizhan.app.biz.game.uc.ipavatar.j) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.ipavatar.j.class), null, null), (com.baicizhan.app.biz.game.uc.ipavatar.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.ipavatar.e.class), null, null));
    }

    public static final d5.a w1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new d5.a((d5.g) single.i(kotlin.jvm.internal.o0.d(d5.g.class), null, null));
    }

    public static final w4.g x0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.g((b6.a) single.i(kotlin.jvm.internal.o0.d(b6.a.class), null, null), (w5.a) single.i(kotlin.jvm.internal.o0.d(w5.a.class), null, null), (p6.c0) single.i(kotlin.jvm.internal.o0.d(p6.c0.class), null, null), (o6.q) single.i(kotlin.jvm.internal.o0.d(o6.q.class), null, null), (com.baicizhan.app.biz.game.repo.book.b) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.book.b.class), null, null), (z5.g) single.i(kotlin.jvm.internal.o0.d(z5.g.class), null, null), (p5.f) single.i(kotlin.jvm.internal.o0.d(p5.f.class), null, null), (x5.b) single.i(kotlin.jvm.internal.o0.d(x5.b.class), null, null), (com.baicizhan.app.biz.game.uc.schedule.d) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.schedule.d.class), null, null), (com.baicizhan.app.biz.game.uc.user.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.user.e.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.m) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.m.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.r.class), null, null));
    }

    public static final d5.c x1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new d5.c();
    }

    public static final w4.j y0(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.j((UIEffectStrategyType) factory.i(kotlin.jvm.internal.o0.d(UIEffectStrategyType.class), null, null));
    }

    public static final d5.e y1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new d5.e((d5.g) single.i(kotlin.jvm.internal.o0.d(d5.g.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final w4.m z0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w4.m((com.baicizhan.app.biz.game.uc.incentive.e) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.e.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.k) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.k.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.f) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.f.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.m) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.m.class), null, null), (b6.a) single.i(kotlin.jvm.internal.o0.d(b6.a.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.b) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.b.class), null, null), (com.baicizhan.app.biz.game.uc.incentive.j) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.incentive.j.class), null, null), (t5.a) single.i(kotlin.jvm.internal.o0.d(t5.a.class), null, null), (com.baicizhan.app.biz.game.uc.advertisement.b) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.uc.advertisement.b.class), null, null), (k5.a) single.i(kotlin.jvm.internal.o0.d(k5.a.class), null, null));
    }

    public static final a5.a z1(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new a5.a((d5.e) single.i(kotlin.jvm.internal.o0.d(d5.e.class), null, null), (d5.a) single.i(kotlin.jvm.internal.o0.d(d5.a.class), null, null));
    }
}
