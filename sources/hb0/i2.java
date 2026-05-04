package hb0;

import ab0.e;
import com.baicizhan.app.biz.game.repo.book.GameBookScheduleRepoImpl;
import com.baicizhan.app.biz.game.repo.experiment.ExperimentRepoImpl;
import com.baicizhan.app.biz.game.repo.gameround.GameRoundRepoImpl;
import com.baicizhan.app.biz.game.repo.roadmap.RoadMapRepoImpl;
import org.koin.core.definition.Kind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGameRepoModuleGencom$baicizhan$app$biz$game$repo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameRepoModuleGencom$baicizhan$app$biz$game$repo.kt\norg/koin/ksp/generated/GameRepoModuleGencom_baicizhan_app_biz_game_repoKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,49:1\n105#2,6:50\n111#2,5:78\n105#2,6:83\n111#2,5:111\n105#2,6:116\n111#2,5:144\n105#2,6:149\n111#2,5:177\n105#2,6:182\n111#2,5:210\n105#2,6:215\n111#2,5:243\n105#2,6:248\n111#2,5:276\n105#2,6:281\n111#2,5:309\n105#2,6:314\n111#2,5:342\n105#2,6:347\n111#2,5:375\n105#2,6:380\n111#2,5:408\n105#2,6:413\n111#2,5:441\n105#2,6:446\n111#2,5:474\n105#2,6:479\n111#2,5:507\n105#2,6:512\n111#2,5:540\n105#2,6:545\n111#2,5:573\n105#2,6:578\n111#2,5:606\n105#2,6:611\n111#2,5:639\n105#2,6:644\n111#2,5:672\n105#2,6:677\n111#2,5:705\n105#2,6:710\n111#2,5:738\n105#2,6:743\n111#2,5:771\n105#2,6:776\n111#2,5:804\n105#2,6:809\n111#2,5:837\n105#2,6:842\n111#2,5:870\n105#2,6:875\n111#2,5:903\n105#2,6:908\n111#2,5:936\n105#2,6:941\n111#2,5:969\n105#2,6:974\n111#2,5:1002\n105#2,6:1007\n111#2,5:1035\n105#2,6:1040\n111#2,5:1068\n105#2,6:1073\n111#2,5:1101\n105#2,6:1106\n111#2,5:1134\n105#2,6:1139\n111#2,5:1167\n105#2,6:1172\n111#2,5:1200\n105#2,6:1205\n111#2,5:1233\n105#2,6:1238\n111#2,5:1266\n105#2,6:1271\n111#2,5:1299\n105#2,6:1304\n111#2,5:1332\n196#3,7:56\n203#3:77\n196#3,7:89\n203#3:110\n196#3,7:122\n203#3:143\n196#3,7:155\n203#3:176\n196#3,7:188\n203#3:209\n196#3,7:221\n203#3:242\n196#3,7:254\n203#3:275\n196#3,7:287\n203#3:308\n196#3,7:320\n203#3:341\n196#3,7:353\n203#3:374\n196#3,7:386\n203#3:407\n196#3,7:419\n203#3:440\n196#3,7:452\n203#3:473\n196#3,7:485\n203#3:506\n196#3,7:518\n203#3:539\n196#3,7:551\n203#3:572\n196#3,7:584\n203#3:605\n196#3,7:617\n203#3:638\n196#3,7:650\n203#3:671\n196#3,7:683\n203#3:704\n196#3,7:716\n203#3:737\n196#3,7:749\n203#3:770\n196#3,7:782\n203#3:803\n196#3,7:815\n203#3:836\n196#3,7:848\n203#3:869\n196#3,7:881\n203#3:902\n196#3,7:914\n203#3:935\n196#3,7:947\n203#3:968\n196#3,7:980\n203#3:1001\n196#3,7:1013\n203#3:1034\n196#3,7:1046\n203#3:1067\n196#3,7:1079\n203#3:1100\n196#3,7:1112\n203#3:1133\n196#3,7:1145\n203#3:1166\n196#3,7:1178\n203#3:1199\n196#3,7:1211\n203#3:1232\n196#3,7:1244\n203#3:1265\n196#3,7:1277\n203#3:1298\n196#3,7:1310\n203#3:1331\n115#4,14:63\n115#4,14:96\n115#4,14:129\n115#4,14:162\n115#4,14:195\n115#4,14:228\n115#4,14:261\n115#4,14:294\n115#4,14:327\n115#4,14:360\n115#4,14:393\n115#4,14:426\n115#4,14:459\n115#4,14:492\n115#4,14:525\n115#4,14:558\n115#4,14:591\n115#4,14:624\n115#4,14:657\n115#4,14:690\n115#4,14:723\n115#4,14:756\n115#4,14:789\n115#4,14:822\n115#4,14:855\n115#4,14:888\n115#4,14:921\n115#4,14:954\n115#4,14:987\n115#4,14:1020\n115#4,14:1053\n115#4,14:1086\n115#4,14:1119\n115#4,14:1152\n115#4,14:1185\n115#4,14:1218\n115#4,14:1251\n115#4,14:1284\n115#4,14:1317\n138#5,5:1337\n138#5,5:1342\n138#5,5:1347\n138#5,5:1352\n138#5,5:1357\n138#5,5:1362\n138#5,5:1367\n138#5,5:1372\n138#5,5:1377\n138#5,5:1382\n138#5,5:1387\n138#5,5:1392\n138#5,5:1397\n138#5,5:1402\n138#5,5:1407\n138#5,5:1412\n138#5,5:1417\n138#5,5:1422\n138#5,5:1427\n138#5,5:1432\n138#5,5:1437\n138#5,5:1442\n138#5,5:1447\n138#5,5:1452\n138#5,5:1457\n138#5,5:1462\n138#5,5:1467\n138#5,5:1472\n138#5,5:1477\n138#5,5:1482\n138#5,5:1487\n138#5,5:1492\n138#5,5:1497\n138#5,5:1502\n138#5,5:1507\n138#5,5:1512\n*S KotlinDebug\n*F\n+ 1 GameRepoModuleGencom$baicizhan$app$biz$game$repo.kt\norg/koin/ksp/generated/GameRepoModuleGencom_baicizhan_app_biz_game_repoKt\n*L\n8#1:50,6\n8#1:78,5\n9#1:83,6\n9#1:111,5\n10#1:116,6\n10#1:144,5\n11#1:149,6\n11#1:177,5\n12#1:182,6\n12#1:210,5\n13#1:215,6\n13#1:243,5\n14#1:248,6\n14#1:276,5\n15#1:281,6\n15#1:309,5\n16#1:314,6\n16#1:342,5\n17#1:347,6\n17#1:375,5\n18#1:380,6\n18#1:408,5\n19#1:413,6\n19#1:441,5\n20#1:446,6\n20#1:474,5\n21#1:479,6\n21#1:507,5\n22#1:512,6\n22#1:540,5\n23#1:545,6\n23#1:573,5\n24#1:578,6\n24#1:606,5\n25#1:611,6\n25#1:639,5\n26#1:644,6\n26#1:672,5\n27#1:677,6\n27#1:705,5\n28#1:710,6\n28#1:738,5\n29#1:743,6\n29#1:771,5\n30#1:776,6\n30#1:804,5\n31#1:809,6\n31#1:837,5\n32#1:842,6\n32#1:870,5\n33#1:875,6\n33#1:903,5\n34#1:908,6\n34#1:936,5\n35#1:941,6\n35#1:969,5\n36#1:974,6\n36#1:1002,5\n37#1:1007,6\n37#1:1035,5\n38#1:1040,6\n38#1:1068,5\n39#1:1073,6\n39#1:1101,5\n40#1:1106,6\n40#1:1134,5\n41#1:1139,6\n41#1:1167,5\n42#1:1172,6\n42#1:1200,5\n43#1:1205,6\n43#1:1233,5\n44#1:1238,6\n44#1:1266,5\n45#1:1271,6\n45#1:1299,5\n46#1:1304,6\n46#1:1332,5\n8#1:56,7\n8#1:77\n9#1:89,7\n9#1:110\n10#1:122,7\n10#1:143\n11#1:155,7\n11#1:176\n12#1:188,7\n12#1:209\n13#1:221,7\n13#1:242\n14#1:254,7\n14#1:275\n15#1:287,7\n15#1:308\n16#1:320,7\n16#1:341\n17#1:353,7\n17#1:374\n18#1:386,7\n18#1:407\n19#1:419,7\n19#1:440\n20#1:452,7\n20#1:473\n21#1:485,7\n21#1:506\n22#1:518,7\n22#1:539\n23#1:551,7\n23#1:572\n24#1:584,7\n24#1:605\n25#1:617,7\n25#1:638\n26#1:650,7\n26#1:671\n27#1:683,7\n27#1:704\n28#1:716,7\n28#1:737\n29#1:749,7\n29#1:770\n30#1:782,7\n30#1:803\n31#1:815,7\n31#1:836\n32#1:848,7\n32#1:869\n33#1:881,7\n33#1:902\n34#1:914,7\n34#1:935\n35#1:947,7\n35#1:968\n36#1:980,7\n36#1:1001\n37#1:1013,7\n37#1:1034\n38#1:1046,7\n38#1:1067\n39#1:1079,7\n39#1:1100\n40#1:1112,7\n40#1:1133\n41#1:1145,7\n41#1:1166\n42#1:1178,7\n42#1:1199\n43#1:1211,7\n43#1:1232\n44#1:1244,7\n44#1:1265\n45#1:1277,7\n45#1:1298\n46#1:1310,7\n46#1:1331\n8#1:63,14\n9#1:96,14\n10#1:129,14\n11#1:162,14\n12#1:195,14\n13#1:228,14\n14#1:261,14\n15#1:294,14\n16#1:327,14\n17#1:360,14\n18#1:393,14\n19#1:426,14\n20#1:459,14\n21#1:492,14\n22#1:525,14\n23#1:558,14\n24#1:591,14\n25#1:624,14\n26#1:657,14\n27#1:690,14\n28#1:723,14\n29#1:756,14\n30#1:789,14\n31#1:822,14\n32#1:855,14\n33#1:888,14\n34#1:921,14\n35#1:954,14\n36#1:987,14\n37#1:1020,14\n38#1:1053,14\n39#1:1086,14\n40#1:1119,14\n41#1:1152,14\n42#1:1185,14\n43#1:1218,14\n44#1:1251,14\n45#1:1284,14\n46#1:1317,14\n8#1:1337,5\n9#1:1342,5\n10#1:1347,5\n11#1:1352,5\n12#1:1357,5\n13#1:1362,5\n14#1:1367,5\n15#1:1372,5\n16#1:1377,5\n17#1:1382,5\n18#1:1387,5\n19#1:1392,5\n20#1:1397,5\n22#1:1402,5\n23#1:1407,5\n24#1:1412,5\n26#1:1417,5\n27#1:1422,5\n28#1:1427,5\n29#1:1432,5\n30#1:1437,5\n31#1:1442,5\n32#1:1447,5\n33#1:1452,5\n34#1:1457,5\n35#1:1462,5\n36#1:1467,5\n37#1:1472,5\n38#1:1477,5\n39#1:1482,5\n40#1:1487,5\n41#1:1492,5\n43#1:1497,5\n44#1:1502,5\n45#1:1507,5\n46#1:1512,5\n*E\n"})
/* loaded from: classes9.dex */
public final class i2 {
    public static final o5.b A0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new o5.b((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null));
    }

    public static final p5.g B0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p5.g((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    @m80.k
    public static final va0.c C0() {
        return eb0.e.b(false, new x00.l() { // from class: hb0.a2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 O;
                O = i2.O((va0.c) obj);
                return O;
            }
        }, 1, null);
    }

    @m80.k
    public static final va0.c D0(@m80.k i5.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return C0();
    }

    public static final yz.g2 O(va0.c module) {
        kotlin.jvm.internal.g0.p(module, "$this$module");
        x00.p pVar = new x00.p() { // from class: hb0.u0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                j5.b P;
                P = i2.P((cb0.b) obj, (ya0.a) obj2);
                return P;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a11, kotlin.jvm.internal.o0.d(j5.b.class), null, pVar, kind, a00.h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        eb0.a.b(new ra0.f(module, hVar), kotlin.jvm.internal.o0.d(j5.e.class));
        x00.p pVar2 = new x00.p() { // from class: hb0.w0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                k5.b Q;
                Q = i2.Q((cb0.b) obj, (ya0.a) obj2);
                return Q;
            }
        };
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(k5.b.class), null, pVar2, kind, a00.h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        eb0.a.b(new ra0.f(module, hVar2), kotlin.jvm.internal.o0.d(k5.a.class));
        x00.p pVar3 = new x00.p() { // from class: hb0.i1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                GameBookScheduleRepoImpl b02;
                b02 = i2.b0((cb0.b) obj, (ya0.a) obj2);
                return b02;
            }
        };
        ta0.h<?> hVar3 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(GameBookScheduleRepoImpl.class), null, pVar3, kind, a00.h0.J()));
        module.q(hVar3);
        if (module.m()) {
            module.v(hVar3);
        }
        eb0.a.b(new ra0.f(module, hVar3), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.book.b.class));
        x00.p pVar4 = new x00.p() { // from class: hb0.t1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                l5.a m02;
                m02 = i2.m0((cb0.b) obj, (ya0.a) obj2);
                return m02;
            }
        };
        ta0.h<?> hVar4 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(l5.a.class), null, pVar4, kind, a00.h0.J()));
        module.q(hVar4);
        if (module.m()) {
            module.v(hVar4);
        }
        eb0.a.b(new ra0.f(module, hVar4), kotlin.jvm.internal.o0.d(l5.c.class));
        x00.p pVar5 = new x00.p() { // from class: hb0.u1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                m5.a w02;
                w02 = i2.w0((cb0.b) obj, (ya0.a) obj2);
                return w02;
            }
        };
        ta0.h<?> hVar5 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(m5.a.class), null, pVar5, kind, a00.h0.J()));
        module.q(hVar5);
        if (module.m()) {
            module.v(hVar5);
        }
        eb0.a.b(new ra0.f(module, hVar5), kotlin.jvm.internal.o0.d(m5.c.class));
        x00.p pVar6 = new x00.p() { // from class: hb0.v1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                ExperimentRepoImpl x02;
                x02 = i2.x0((cb0.b) obj, (ya0.a) obj2);
                return x02;
            }
        };
        ta0.h<?> hVar6 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(ExperimentRepoImpl.class), null, pVar6, kind, a00.h0.J()));
        module.q(hVar6);
        if (module.m()) {
            module.v(hVar6);
        }
        eb0.a.b(new ra0.f(module, hVar6), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.experiment.b.class));
        x00.p pVar7 = new x00.p() { // from class: hb0.w1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                n5.a y02;
                y02 = i2.y0((cb0.b) obj, (ya0.a) obj2);
                return y02;
            }
        };
        ta0.h<?> hVar7 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(n5.a.class), null, pVar7, kind, a00.h0.J()));
        module.q(hVar7);
        if (module.m()) {
            module.v(hVar7);
        }
        eb0.a.b(new ra0.f(module, hVar7), kotlin.jvm.internal.o0.d(n5.c.class));
        x00.p pVar8 = new x00.p() { // from class: hb0.x1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                GameRoundRepoImpl z02;
                z02 = i2.z0((cb0.b) obj, (ya0.a) obj2);
                return z02;
            }
        };
        ta0.h<?> hVar8 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(GameRoundRepoImpl.class), null, pVar8, kind, a00.h0.J()));
        module.q(hVar8);
        if (module.m()) {
            module.v(hVar8);
        }
        eb0.a.b(new ra0.f(module, hVar8), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.gameround.e.class));
        x00.p pVar9 = new x00.p() { // from class: hb0.y1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                o5.b A0;
                A0 = i2.A0((cb0.b) obj, (ya0.a) obj2);
                return A0;
            }
        };
        ta0.h<?> hVar9 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(o5.b.class), null, pVar9, kind, a00.h0.J()));
        module.q(hVar9);
        if (module.m()) {
            module.v(hVar9);
        }
        eb0.a.b(new ra0.f(module, hVar9), kotlin.jvm.internal.o0.d(o5.a.class));
        x00.p pVar10 = new x00.p() { // from class: hb0.z1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p5.g B0;
                B0 = i2.B0((cb0.b) obj, (ya0.a) obj2);
                return B0;
            }
        };
        ta0.h<?> hVar10 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p5.g.class), null, pVar10, kind, a00.h0.J()));
        module.q(hVar10);
        if (module.m()) {
            module.v(hVar10);
        }
        eb0.a.b(new ra0.f(module, hVar10), kotlin.jvm.internal.o0.d(p5.a.class));
        x00.p pVar11 = new x00.p() { // from class: hb0.f1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p5.i R;
                R = i2.R((cb0.b) obj, (ya0.a) obj2);
                return R;
            }
        };
        ta0.h<?> hVar11 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p5.i.class), null, pVar11, kind, a00.h0.J()));
        module.q(hVar11);
        if (module.m()) {
            module.v(hVar11);
        }
        eb0.a.b(new ra0.f(module, hVar11), kotlin.jvm.internal.o0.d(p5.b.class));
        x00.p pVar12 = new x00.p() { // from class: hb0.q1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p5.k S;
                S = i2.S((cb0.b) obj, (ya0.a) obj2);
                return S;
            }
        };
        ta0.h<?> hVar12 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p5.k.class), null, pVar12, kind, a00.h0.J()));
        module.q(hVar12);
        if (module.m()) {
            module.v(hVar12);
        }
        eb0.a.b(new ra0.f(module, hVar12), kotlin.jvm.internal.o0.d(p5.c.class));
        x00.p pVar13 = new x00.p() { // from class: hb0.b2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p5.m T;
                T = i2.T((cb0.b) obj, (ya0.a) obj2);
                return T;
            }
        };
        ta0.h<?> hVar13 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p5.m.class), null, pVar13, kind, a00.h0.J()));
        module.q(hVar13);
        if (module.m()) {
            module.v(hVar13);
        }
        eb0.a.b(new ra0.f(module, hVar13), kotlin.jvm.internal.o0.d(p5.d.class));
        x00.p pVar14 = new x00.p() { // from class: hb0.c2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p5.o U;
                U = i2.U((cb0.b) obj, (ya0.a) obj2);
                return U;
            }
        };
        ta0.h<?> hVar14 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p5.o.class), null, pVar14, kind, a00.h0.J()));
        module.q(hVar14);
        if (module.m()) {
            module.v(hVar14);
        }
        eb0.a.b(new ra0.f(module, hVar14), kotlin.jvm.internal.o0.d(p5.e.class));
        x00.p pVar15 = new x00.p() { // from class: hb0.d2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p5.q V;
                V = i2.V((cb0.b) obj, (ya0.a) obj2);
                return V;
            }
        };
        ta0.h<?> hVar15 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p5.q.class), null, pVar15, kind, a00.h0.J()));
        module.q(hVar15);
        if (module.m()) {
            module.v(hVar15);
        }
        eb0.a.b(new ra0.f(module, hVar15), kotlin.jvm.internal.o0.d(p5.f.class));
        x00.p pVar16 = new x00.p() { // from class: hb0.e2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                q5.b W;
                W = i2.W((cb0.b) obj, (ya0.a) obj2);
                return W;
            }
        };
        ta0.h<?> hVar16 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(q5.b.class), null, pVar16, kind, a00.h0.J()));
        module.q(hVar16);
        if (module.m()) {
            module.v(hVar16);
        }
        eb0.a.b(new ra0.f(module, hVar16), kotlin.jvm.internal.o0.d(q5.a.class));
        x00.p pVar17 = new x00.p() { // from class: hb0.f2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                q5.e X;
                X = i2.X((cb0.b) obj, (ya0.a) obj2);
                return X;
            }
        };
        ta0.h<?> hVar17 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(q5.e.class), null, pVar17, kind, a00.h0.J()));
        module.q(hVar17);
        if (module.m()) {
            module.v(hVar17);
        }
        eb0.a.b(new ra0.f(module, hVar17), kotlin.jvm.internal.o0.d(q5.d.class));
        x00.p pVar18 = new x00.p() { // from class: hb0.g2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                q5.h Y;
                Y = i2.Y((cb0.b) obj, (ya0.a) obj2);
                return Y;
            }
        };
        ta0.h<?> hVar18 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(q5.h.class), null, pVar18, kind, a00.h0.J()));
        module.q(hVar18);
        if (module.m()) {
            module.v(hVar18);
        }
        eb0.a.b(new ra0.f(module, hVar18), kotlin.jvm.internal.o0.d(q5.f.class));
        x00.p pVar19 = new x00.p() { // from class: hb0.h2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                r5.b Z;
                Z = i2.Z((cb0.b) obj, (ya0.a) obj2);
                return Z;
            }
        };
        ta0.h<?> hVar19 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(r5.b.class), null, pVar19, kind, a00.h0.J()));
        module.q(hVar19);
        if (module.m()) {
            module.v(hVar19);
        }
        eb0.a.b(new ra0.f(module, hVar19), kotlin.jvm.internal.o0.d(r5.a.class));
        x00.p pVar20 = new x00.p() { // from class: hb0.v0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                s5.c a02;
                a02 = i2.a0((cb0.b) obj, (ya0.a) obj2);
                return a02;
            }
        };
        ta0.h<?> hVar20 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(s5.c.class), null, pVar20, kind, a00.h0.J()));
        module.q(hVar20);
        if (module.m()) {
            module.v(hVar20);
        }
        eb0.a.b(new ra0.f(module, hVar20), kotlin.jvm.internal.o0.d(s5.a.class));
        x00.p pVar21 = new x00.p() { // from class: hb0.x0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                s5.e c02;
                c02 = i2.c0((cb0.b) obj, (ya0.a) obj2);
                return c02;
            }
        };
        ta0.h<?> hVar21 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(s5.e.class), null, pVar21, kind, a00.h0.J()));
        module.q(hVar21);
        if (module.m()) {
            module.v(hVar21);
        }
        eb0.a.b(new ra0.f(module, hVar21), kotlin.jvm.internal.o0.d(s5.b.class));
        x00.p pVar22 = new x00.p() { // from class: hb0.y0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                t5.d d02;
                d02 = i2.d0((cb0.b) obj, (ya0.a) obj2);
                return d02;
            }
        };
        ta0.h<?> hVar22 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(t5.d.class), null, pVar22, kind, a00.h0.J()));
        module.q(hVar22);
        if (module.m()) {
            module.v(hVar22);
        }
        eb0.a.b(new ra0.f(module, hVar22), kotlin.jvm.internal.o0.d(t5.a.class));
        x00.p pVar23 = new x00.p() { // from class: hb0.z0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                u5.d e02;
                e02 = i2.e0((cb0.b) obj, (ya0.a) obj2);
                return e02;
            }
        };
        ta0.h<?> hVar23 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(u5.d.class), null, pVar23, kind, a00.h0.J()));
        module.q(hVar23);
        if (module.m()) {
            module.v(hVar23);
        }
        eb0.a.b(new ra0.f(module, hVar23), kotlin.jvm.internal.o0.d(u5.b.class));
        x00.p pVar24 = new x00.p() { // from class: hb0.a1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                v5.c f02;
                f02 = i2.f0((cb0.b) obj, (ya0.a) obj2);
                return f02;
            }
        };
        ta0.h<?> hVar24 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(v5.c.class), null, pVar24, kind, a00.h0.J()));
        module.q(hVar24);
        if (module.m()) {
            module.v(hVar24);
        }
        eb0.a.b(new ra0.f(module, hVar24), kotlin.jvm.internal.o0.d(v5.d.class));
        x00.p pVar25 = new x00.p() { // from class: hb0.b1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                v5.j g02;
                g02 = i2.g0((cb0.b) obj, (ya0.a) obj2);
                return g02;
            }
        };
        ta0.h<?> hVar25 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(v5.j.class), null, pVar25, kind, a00.h0.J()));
        module.q(hVar25);
        if (module.m()) {
            module.v(hVar25);
        }
        eb0.a.b(new ra0.f(module, hVar25), kotlin.jvm.internal.o0.d(v5.e.class));
        x00.p pVar26 = new x00.p() { // from class: hb0.c1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                v5.k h02;
                h02 = i2.h0((cb0.b) obj, (ya0.a) obj2);
                return h02;
            }
        };
        ta0.h<?> hVar26 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(v5.k.class), null, pVar26, kind, a00.h0.J()));
        module.q(hVar26);
        if (module.m()) {
            module.v(hVar26);
        }
        eb0.a.b(new ra0.f(module, hVar26), kotlin.jvm.internal.o0.d(v5.f.class));
        x00.p pVar27 = new x00.p() { // from class: hb0.d1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                v5.m i02;
                i02 = i2.i0((cb0.b) obj, (ya0.a) obj2);
                return i02;
            }
        };
        ta0.h<?> hVar27 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(v5.m.class), null, pVar27, kind, a00.h0.J()));
        module.q(hVar27);
        if (module.m()) {
            module.v(hVar27);
        }
        eb0.a.b(new ra0.f(module, hVar27), kotlin.jvm.internal.o0.d(v5.g.class));
        x00.p pVar28 = new x00.p() { // from class: hb0.e1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                w5.b j02;
                j02 = i2.j0((cb0.b) obj, (ya0.a) obj2);
                return j02;
            }
        };
        ta0.h<?> hVar28 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(w5.b.class), null, pVar28, kind, a00.h0.J()));
        module.q(hVar28);
        if (module.m()) {
            module.v(hVar28);
        }
        eb0.a.b(new ra0.f(module, hVar28), kotlin.jvm.internal.o0.d(w5.a.class));
        x00.p pVar29 = new x00.p() { // from class: hb0.g1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                RoadMapRepoImpl k02;
                k02 = i2.k0((cb0.b) obj, (ya0.a) obj2);
                return k02;
            }
        };
        ta0.h<?> hVar29 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(RoadMapRepoImpl.class), null, pVar29, kind, a00.h0.J()));
        module.q(hVar29);
        if (module.m()) {
            module.v(hVar29);
        }
        eb0.a.b(new ra0.f(module, hVar29), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.game.repo.roadmap.a.class));
        x00.p pVar30 = new x00.p() { // from class: hb0.h1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                x5.e l02;
                l02 = i2.l0((cb0.b) obj, (ya0.a) obj2);
                return l02;
            }
        };
        ta0.h<?> hVar30 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(x5.e.class), null, pVar30, kind, a00.h0.J()));
        module.q(hVar30);
        if (module.m()) {
            module.v(hVar30);
        }
        eb0.a.b(new ra0.f(module, hVar30), kotlin.jvm.internal.o0.d(x5.b.class));
        x00.p pVar31 = new x00.p() { // from class: hb0.j1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                x5.g n02;
                n02 = i2.n0((cb0.b) obj, (ya0.a) obj2);
                return n02;
            }
        };
        ta0.h<?> hVar31 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(x5.g.class), null, pVar31, kind, a00.h0.J()));
        module.q(hVar31);
        if (module.m()) {
            module.v(hVar31);
        }
        eb0.a.b(new ra0.f(module, hVar31), kotlin.jvm.internal.o0.d(x5.c.class));
        x00.p pVar32 = new x00.p() { // from class: hb0.k1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                x5.i o02;
                o02 = i2.o0((cb0.b) obj, (ya0.a) obj2);
                return o02;
            }
        };
        ta0.h<?> hVar32 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(x5.i.class), null, pVar32, kind, a00.h0.J()));
        module.q(hVar32);
        if (module.m()) {
            module.v(hVar32);
        }
        eb0.a.b(new ra0.f(module, hVar32), kotlin.jvm.internal.o0.d(x5.d.class));
        x00.p pVar33 = new x00.p() { // from class: hb0.l1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                y5.c p02;
                p02 = i2.p0((cb0.b) obj, (ya0.a) obj2);
                return p02;
            }
        };
        ta0.h<?> hVar33 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(y5.c.class), null, pVar33, kind, a00.h0.J()));
        module.q(hVar33);
        if (module.m()) {
            module.v(hVar33);
        }
        eb0.a.b(new ra0.f(module, hVar33), kotlin.jvm.internal.o0.d(y5.a.class));
        x00.p pVar34 = new x00.p() { // from class: hb0.m1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                z5.c q02;
                q02 = i2.q0((cb0.b) obj, (ya0.a) obj2);
                return q02;
            }
        };
        ta0.h<?> hVar34 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(z5.c.class), null, pVar34, kind, a00.h0.J()));
        module.q(hVar34);
        if (module.m()) {
            module.v(hVar34);
        }
        eb0.a.b(new ra0.f(module, hVar34), kotlin.jvm.internal.o0.d(z5.e.class));
        x00.p pVar35 = new x00.p() { // from class: hb0.n1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                z5.h r02;
                r02 = i2.r0((cb0.b) obj, (ya0.a) obj2);
                return r02;
            }
        };
        ta0.h<?> hVar35 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(z5.h.class), null, pVar35, kind, a00.h0.J()));
        module.q(hVar35);
        if (module.m()) {
            module.v(hVar35);
        }
        eb0.a.b(new ra0.f(module, hVar35), kotlin.jvm.internal.o0.d(z5.f.class));
        x00.p pVar36 = new x00.p() { // from class: hb0.o1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                z5.j s02;
                s02 = i2.s0((cb0.b) obj, (ya0.a) obj2);
                return s02;
            }
        };
        ta0.h<?> hVar36 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(z5.j.class), null, pVar36, kind, a00.h0.J()));
        module.q(hVar36);
        if (module.m()) {
            module.v(hVar36);
        }
        eb0.a.b(new ra0.f(module, hVar36), kotlin.jvm.internal.o0.d(z5.g.class));
        x00.p pVar37 = new x00.p() { // from class: hb0.p1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                a6.c t02;
                t02 = i2.t0((cb0.b) obj, (ya0.a) obj2);
                return t02;
            }
        };
        ta0.h<?> hVar37 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(a6.c.class), null, pVar37, kind, a00.h0.J()));
        module.q(hVar37);
        if (module.m()) {
            module.v(hVar37);
        }
        eb0.a.b(new ra0.f(module, hVar37), kotlin.jvm.internal.o0.d(a6.a.class));
        x00.p pVar38 = new x00.p() { // from class: hb0.r1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                b6.b u02;
                u02 = i2.u0((cb0.b) obj, (ya0.a) obj2);
                return u02;
            }
        };
        ta0.h<?> hVar38 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(b6.b.class), null, pVar38, kind, a00.h0.J()));
        module.q(hVar38);
        if (module.m()) {
            module.v(hVar38);
        }
        eb0.a.b(new ra0.f(module, hVar38), kotlin.jvm.internal.o0.d(b6.a.class));
        x00.p pVar39 = new x00.p() { // from class: hb0.s1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                c6.c v02;
                v02 = i2.v0((cb0.b) obj, (ya0.a) obj2);
                return v02;
            }
        };
        ta0.h<?> hVar39 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(c6.c.class), null, pVar39, kind, a00.h0.J()));
        module.q(hVar39);
        if (module.m()) {
            module.v(hVar39);
        }
        eb0.a.b(new ra0.f(module, hVar39), kotlin.jvm.internal.o0.d(c6.b.class));
        return yz.g2.f100423a;
    }

    public static final j5.b P(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new j5.b((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null), (l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null));
    }

    public static final k5.b Q(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new k5.b((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null));
    }

    public static final p5.i R(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p5.i((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final p5.k S(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p5.k((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final p5.m T(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p5.m((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final p5.o U(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p5.o();
    }

    public static final p5.q V(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p5.q((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final q5.b W(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new q5.b((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final q5.e X(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new q5.e((com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final q5.h Y(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new q5.h();
    }

    public static final r5.b Z(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new r5.b((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final s5.c a0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new s5.c((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final GameBookScheduleRepoImpl b0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new GameBookScheduleRepoImpl((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final s5.e c0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new s5.e((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final t5.d d0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new t5.d((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null));
    }

    public static final u5.d e0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new u5.d((c7.e) single.i(kotlin.jvm.internal.o0.d(c7.e.class), null, null));
    }

    public static final v5.c f0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new v5.c((okio.b) single.i(kotlin.jvm.internal.o0.d(okio.b.class), null, null));
    }

    public static final v5.j g0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new v5.j((c4.k) single.i(kotlin.jvm.internal.o0.d(c4.k.class), null, null), (okio.b) single.i(kotlin.jvm.internal.o0.d(okio.b.class), null, null));
    }

    public static final v5.k h0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new v5.k((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (h4.a) single.i(kotlin.jvm.internal.o0.d(h4.a.class), null, null));
    }

    public static final v5.m i0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new v5.m((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (h4.a) single.i(kotlin.jvm.internal.o0.d(h4.a.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final w5.b j0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new w5.b((com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final RoadMapRepoImpl k0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new RoadMapRepoImpl((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null));
    }

    public static final x5.e l0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new x5.e((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final l5.a m0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new l5.a((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final x5.g n0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new x5.g((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null));
    }

    public static final x5.i o0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new x5.i((com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final y5.c p0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new y5.c((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null));
    }

    public static final z5.c q0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new z5.c((com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final z5.h r0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new z5.h();
    }

    public static final z5.j s0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new z5.j((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null), (o5.a) single.i(kotlin.jvm.internal.o0.d(o5.a.class), null, null), (l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null));
    }

    public static final a6.c t0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new a6.c((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final b6.b u0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new b6.b((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final c6.c v0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new c6.c((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final m5.a w0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new m5.a((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final ExperimentRepoImpl x0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new ExperimentRepoImpl((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null), (l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null));
    }

    public static final n5.a y0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new n5.a((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (com.baicizhan.app.biz.auth.r) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final GameRoundRepoImpl z0(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new GameRoundRepoImpl((h4.c) single.i(kotlin.jvm.internal.o0.d(h4.c.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }
}
