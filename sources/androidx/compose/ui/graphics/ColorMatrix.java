package androidx.compose.ui.graphics;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrixKt\n*L\n1#1,375:1\n102#1,2:376\n102#1,2:378\n102#1,2:380\n102#1,2:382\n102#1,2:384\n102#1,2:386\n102#1,2:388\n102#1,2:390\n102#1,2:392\n102#1,2:394\n102#1,2:396\n102#1,2:398\n102#1,2:400\n102#1,2:402\n102#1,2:404\n102#1,2:406\n102#1,2:408\n102#1,2:410\n102#1,2:412\n102#1,2:414\n115#1:416\n102#1,2:417\n116#1:419\n102#1,2:420\n117#1:422\n102#1,2:423\n118#1:425\n102#1,2:426\n119#1:428\n102#1,2:429\n121#1:431\n102#1,2:432\n122#1:434\n102#1,2:435\n123#1:437\n102#1,2:438\n124#1:440\n102#1,2:441\n125#1:443\n102#1,2:444\n127#1:446\n102#1,2:447\n128#1:449\n102#1,2:450\n129#1:452\n102#1,2:453\n130#1:455\n102#1,2:456\n131#1:458\n102#1,2:459\n133#1:461\n102#1,2:462\n134#1:464\n102#1,2:465\n135#1:467\n102#1,2:468\n136#1:470\n102#1,2:471\n137#1:473\n102#1,2:474\n138#1:476\n88#1:487\n88#1:492\n88#1:497\n88#1:502\n88#1:506\n88#1:507\n88#1:508\n88#1:509\n88#1:510\n88#1:512\n88#1:517\n88#1:522\n88#1:527\n88#1:531\n88#1:532\n88#1:533\n88#1:534\n88#1:535\n88#1:537\n88#1:542\n88#1:547\n88#1:552\n88#1:556\n88#1:557\n88#1:558\n88#1:559\n88#1:560\n88#1:562\n88#1:567\n88#1:572\n88#1:577\n88#1:581\n88#1:582\n88#1:583\n88#1:584\n88#1:585\n102#1,2:586\n102#1,2:588\n102#1,2:590\n102#1,2:592\n102#1,2:594\n102#1,2:596\n102#1,2:598\n102#1,2:600\n102#1,2:602\n102#1,2:604\n102#1,2:606\n102#1,2:608\n102#1,2:610\n102#1,2:612\n102#1,2:614\n102#1,2:616\n102#1,2:618\n102#1,2:620\n102#1,2:622\n102#1,2:624\n115#1:626\n102#1,2:627\n116#1:629\n102#1,2:630\n117#1:632\n102#1,2:633\n118#1:635\n102#1,2:636\n119#1:638\n102#1,2:639\n121#1:641\n102#1,2:642\n122#1:644\n102#1,2:645\n123#1:647\n102#1,2:648\n124#1:650\n102#1,2:651\n125#1:653\n102#1,2:654\n127#1:656\n102#1,2:657\n128#1:659\n102#1,2:660\n129#1:662\n102#1,2:663\n130#1:665\n102#1,2:666\n131#1:668\n102#1,2:669\n133#1:671\n102#1,2:672\n134#1:674\n102#1,2:675\n135#1:677\n102#1,2:678\n136#1:680\n102#1,2:681\n137#1:683\n102#1,2:684\n138#1:686\n102#1,2:687\n102#1,2:689\n102#1,2:691\n102#1,2:693\n102#1,2:695\n102#1,2:697\n102#1,2:699\n102#1,2:701\n102#1,2:703\n115#1:705\n102#1,2:706\n116#1:708\n102#1,2:709\n117#1:711\n102#1,2:712\n118#1:714\n102#1,2:715\n119#1:717\n102#1,2:718\n121#1:720\n102#1,2:721\n122#1:723\n102#1,2:724\n123#1:726\n102#1,2:727\n124#1:729\n102#1,2:730\n125#1:732\n102#1,2:733\n127#1:735\n102#1,2:736\n128#1:738\n102#1,2:739\n129#1:741\n102#1,2:742\n130#1:744\n102#1,2:745\n131#1:747\n102#1,2:748\n133#1:750\n102#1,2:751\n134#1:753\n102#1,2:754\n135#1:756\n102#1,2:757\n136#1:759\n102#1,2:760\n137#1:762\n102#1,2:763\n138#1:765\n102#1,2:766\n102#1,2:768\n102#1,2:770\n102#1,2:772\n175#1:774\n115#1:775\n102#1,2:776\n116#1:778\n102#1,2:779\n117#1:781\n102#1,2:782\n118#1:784\n102#1,2:785\n119#1:787\n102#1,2:788\n121#1:790\n102#1,2:791\n122#1:793\n102#1,2:794\n123#1:796\n102#1,2:797\n124#1:799\n102#1,2:800\n125#1:802\n102#1,2:803\n127#1:805\n102#1,2:806\n128#1:808\n102#1,2:809\n129#1:811\n102#1,2:812\n130#1:814\n102#1,2:815\n131#1:817\n102#1,2:818\n133#1:820\n102#1,2:821\n134#1:823\n102#1,2:824\n135#1:826\n102#1,2:827\n136#1:829\n102#1,2:830\n137#1:832\n102#1,2:833\n138#1:835\n176#1,2:836\n178#1,2:843\n102#1,2:845\n102#1,2:847\n102#1,2:849\n102#1,2:851\n180#1:853\n175#1:854\n115#1:855\n102#1,2:856\n116#1:858\n102#1,2:859\n117#1:861\n102#1,2:862\n118#1:864\n102#1,2:865\n119#1:867\n102#1,2:868\n121#1:870\n102#1,2:871\n122#1:873\n102#1,2:874\n123#1:876\n102#1,2:877\n124#1:879\n102#1,2:880\n125#1:882\n102#1,2:883\n127#1:885\n102#1,2:886\n128#1:888\n102#1,2:889\n129#1:891\n102#1,2:892\n130#1:894\n102#1,2:895\n131#1:897\n102#1,2:898\n133#1:900\n102#1,2:901\n134#1:903\n102#1,2:904\n135#1:906\n102#1,2:907\n136#1:909\n102#1,2:910\n137#1:912\n102#1,2:913\n138#1:915\n176#1,2:916\n178#1,2:923\n102#1,2:925\n102#1,2:927\n102#1,2:929\n102#1,2:931\n180#1:933\n175#1:934\n115#1:935\n102#1,2:936\n116#1:938\n102#1,2:939\n117#1:941\n102#1,2:942\n118#1:944\n102#1,2:945\n119#1:947\n102#1,2:948\n121#1:950\n102#1,2:951\n122#1:953\n102#1,2:954\n123#1:956\n102#1,2:957\n124#1:959\n102#1,2:960\n125#1:962\n102#1,2:963\n127#1:965\n102#1,2:966\n128#1:968\n102#1,2:969\n129#1:971\n102#1,2:972\n130#1:974\n102#1,2:975\n131#1:977\n102#1,2:978\n133#1:980\n102#1,2:981\n134#1:983\n102#1,2:984\n135#1:986\n102#1,2:987\n136#1:989\n102#1,2:990\n137#1:992\n102#1,2:993\n138#1:995\n176#1,2:996\n178#1,2:1003\n102#1,2:1005\n102#1,2:1007\n102#1,2:1009\n102#1,2:1011\n180#1:1013\n115#1:1014\n102#1,2:1015\n116#1:1017\n102#1,2:1018\n117#1:1020\n102#1,2:1021\n118#1:1023\n102#1,2:1024\n119#1:1026\n102#1,2:1027\n121#1:1029\n102#1,2:1030\n122#1:1032\n102#1,2:1033\n123#1:1035\n102#1,2:1036\n124#1:1038\n102#1,2:1039\n125#1:1041\n102#1,2:1042\n127#1:1044\n102#1,2:1045\n128#1:1047\n102#1,2:1048\n129#1:1050\n102#1,2:1051\n130#1:1053\n102#1,2:1054\n131#1:1056\n102#1,2:1057\n133#1:1059\n102#1,2:1060\n134#1:1062\n102#1,2:1063\n135#1:1065\n102#1,2:1066\n136#1:1068\n102#1,2:1069\n137#1:1071\n102#1,2:1072\n138#1:1074\n102#1,2:1075\n102#1,2:1077\n102#1,2:1079\n102#1,2:1081\n102#1,2:1083\n102#1,2:1085\n102#1,2:1087\n102#1,2:1089\n102#1,2:1091\n115#1:1093\n102#1,2:1094\n116#1:1096\n102#1,2:1097\n117#1:1099\n102#1,2:1100\n118#1:1102\n102#1,2:1103\n119#1:1105\n102#1,2:1106\n121#1:1108\n102#1,2:1109\n122#1:1111\n102#1,2:1112\n123#1:1114\n102#1,2:1115\n124#1:1117\n102#1,2:1118\n125#1:1120\n102#1,2:1121\n127#1:1123\n102#1,2:1124\n128#1:1126\n102#1,2:1127\n129#1:1129\n102#1,2:1130\n130#1:1132\n102#1,2:1133\n131#1:1135\n102#1,2:1136\n133#1:1138\n102#1,2:1139\n134#1:1141\n102#1,2:1142\n135#1:1144\n102#1,2:1145\n136#1:1147\n102#1,2:1148\n137#1:1150\n102#1,2:1151\n138#1:1153\n102#1,2:1154\n102#1,2:1156\n102#1,2:1158\n102#1,2:1160\n102#1,2:1162\n102#1,2:1164\n102#1,2:1166\n338#2:477\n306#2,4:478\n306#2,4:482\n338#2:838\n306#2,4:839\n338#2:918\n306#2,4:919\n338#2:998\n306#2,4:999\n370#3:486\n371#3,3:488\n370#3:491\n371#3,3:493\n370#3:496\n371#3,3:498\n370#3:501\n371#3,3:503\n370#3:511\n371#3,3:513\n370#3:516\n371#3,3:518\n370#3:521\n371#3,3:523\n370#3:526\n371#3,3:528\n370#3:536\n371#3,3:538\n370#3:541\n371#3,3:543\n370#3:546\n371#3,3:548\n370#3:551\n371#3,3:553\n370#3:561\n371#3,3:563\n370#3:566\n371#3,3:568\n370#3:571\n371#3,3:573\n370#3:576\n371#3,3:578\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n115#1:376,2\n116#1:378,2\n117#1:380,2\n118#1:382,2\n119#1:384,2\n121#1:386,2\n122#1:388,2\n123#1:390,2\n124#1:392,2\n125#1:394,2\n127#1:396,2\n128#1:398,2\n129#1:400,2\n130#1:402,2\n131#1:404,2\n133#1:406,2\n134#1:408,2\n135#1:410,2\n136#1:412,2\n137#1:414,2\n175#1:416\n175#1:417,2\n175#1:419\n175#1:420,2\n175#1:422\n175#1:423,2\n175#1:425\n175#1:426,2\n175#1:428\n175#1:429,2\n175#1:431\n175#1:432,2\n175#1:434\n175#1:435,2\n175#1:437\n175#1:438,2\n175#1:440\n175#1:441,2\n175#1:443\n175#1:444,2\n175#1:446\n175#1:447,2\n175#1:449\n175#1:450,2\n175#1:452\n175#1:453,2\n175#1:455\n175#1:456,2\n175#1:458\n175#1:459,2\n175#1:461\n175#1:462,2\n175#1:464\n175#1:465,2\n175#1:467\n175#1:468,2\n175#1:470\n175#1:471,2\n175#1:473\n175#1:474,2\n175#1:476\n186#1:487\n187#1:492\n188#1:497\n189#1:502\n191#1:506\n192#1:507\n193#1:508\n194#1:509\n195#1:510\n197#1:512\n198#1:517\n199#1:522\n200#1:527\n202#1:531\n203#1:532\n204#1:533\n205#1:534\n206#1:535\n208#1:537\n209#1:542\n210#1:547\n211#1:552\n213#1:556\n214#1:557\n215#1:558\n216#1:559\n217#1:560\n219#1:562\n220#1:567\n221#1:572\n222#1:577\n224#1:581\n225#1:582\n226#1:583\n227#1:584\n228#1:585\n230#1:586,2\n231#1:588,2\n232#1:590,2\n233#1:592,2\n234#1:594,2\n235#1:596,2\n236#1:598,2\n237#1:600,2\n238#1:602,2\n239#1:604,2\n240#1:606,2\n241#1:608,2\n242#1:610,2\n243#1:612,2\n244#1:614,2\n245#1:616,2\n246#1:618,2\n247#1:620,2\n248#1:622,2\n249#1:624,2\n259#1:626\n259#1:627,2\n259#1:629\n259#1:630,2\n259#1:632\n259#1:633,2\n259#1:635\n259#1:636,2\n259#1:638\n259#1:639,2\n259#1:641\n259#1:642,2\n259#1:644\n259#1:645,2\n259#1:647\n259#1:648,2\n259#1:650\n259#1:651,2\n259#1:653\n259#1:654,2\n259#1:656\n259#1:657,2\n259#1:659\n259#1:660,2\n259#1:662\n259#1:663,2\n259#1:665\n259#1:666,2\n259#1:668\n259#1:669,2\n259#1:671\n259#1:672,2\n259#1:674\n259#1:675,2\n259#1:677\n259#1:678,2\n259#1:680\n259#1:681,2\n259#1:683\n259#1:684,2\n259#1:686\n266#1:687,2\n267#1:689,2\n268#1:691,2\n269#1:693,2\n270#1:695,2\n271#1:697,2\n272#1:699,2\n273#1:701,2\n274#1:703,2\n288#1:705\n288#1:706,2\n288#1:708\n288#1:709,2\n288#1:711\n288#1:712,2\n288#1:714\n288#1:715,2\n288#1:717\n288#1:718,2\n288#1:720\n288#1:721,2\n288#1:723\n288#1:724,2\n288#1:726\n288#1:727,2\n288#1:729\n288#1:730,2\n288#1:732\n288#1:733,2\n288#1:735\n288#1:736,2\n288#1:738\n288#1:739,2\n288#1:741\n288#1:742,2\n288#1:744\n288#1:745,2\n288#1:747\n288#1:748,2\n288#1:750\n288#1:751,2\n288#1:753\n288#1:754,2\n288#1:756\n288#1:757,2\n288#1:759\n288#1:760,2\n288#1:762\n288#1:763,2\n288#1:765\n290#1:766,2\n291#1:768,2\n292#1:770,2\n293#1:772,2\n300#1:774\n300#1:775\n300#1:776,2\n300#1:778\n300#1:779,2\n300#1:781\n300#1:782,2\n300#1:784\n300#1:785,2\n300#1:787\n300#1:788,2\n300#1:790\n300#1:791,2\n300#1:793\n300#1:794,2\n300#1:796\n300#1:797,2\n300#1:799\n300#1:800,2\n300#1:802\n300#1:803,2\n300#1:805\n300#1:806,2\n300#1:808\n300#1:809,2\n300#1:811\n300#1:812,2\n300#1:814\n300#1:815,2\n300#1:817\n300#1:818,2\n300#1:820\n300#1:821,2\n300#1:823\n300#1:824,2\n300#1:826\n300#1:827,2\n300#1:829\n300#1:830,2\n300#1:832\n300#1:833,2\n300#1:835\n300#1:836,2\n300#1:843,2\n301#1:845,2\n302#1:847,2\n303#1:849,2\n304#1:851,2\n300#1:853\n312#1:854\n312#1:855\n312#1:856,2\n312#1:858\n312#1:859,2\n312#1:861\n312#1:862,2\n312#1:864\n312#1:865,2\n312#1:867\n312#1:868,2\n312#1:870\n312#1:871,2\n312#1:873\n312#1:874,2\n312#1:876\n312#1:877,2\n312#1:879\n312#1:880,2\n312#1:882\n312#1:883,2\n312#1:885\n312#1:886,2\n312#1:888\n312#1:889,2\n312#1:891\n312#1:892,2\n312#1:894\n312#1:895,2\n312#1:897\n312#1:898,2\n312#1:900\n312#1:901,2\n312#1:903\n312#1:904,2\n312#1:906\n312#1:907,2\n312#1:909\n312#1:910,2\n312#1:912\n312#1:913,2\n312#1:915\n312#1:916,2\n312#1:923,2\n313#1:925,2\n314#1:927,2\n315#1:929,2\n316#1:931,2\n312#1:933\n324#1:934\n324#1:935\n324#1:936,2\n324#1:938\n324#1:939,2\n324#1:941\n324#1:942,2\n324#1:944\n324#1:945,2\n324#1:947\n324#1:948,2\n324#1:950\n324#1:951,2\n324#1:953\n324#1:954,2\n324#1:956\n324#1:957,2\n324#1:959\n324#1:960,2\n324#1:962\n324#1:963,2\n324#1:965\n324#1:966,2\n324#1:968\n324#1:969,2\n324#1:971\n324#1:972,2\n324#1:974\n324#1:975,2\n324#1:977\n324#1:978,2\n324#1:980\n324#1:981,2\n324#1:983\n324#1:984,2\n324#1:986\n324#1:987,2\n324#1:989\n324#1:990,2\n324#1:992\n324#1:993,2\n324#1:995\n324#1:996,2\n324#1:1003,2\n325#1:1005,2\n326#1:1007,2\n327#1:1009,2\n328#1:1011,2\n324#1:1013\n335#1:1014\n335#1:1015,2\n335#1:1017\n335#1:1018,2\n335#1:1020\n335#1:1021,2\n335#1:1023\n335#1:1024,2\n335#1:1026\n335#1:1027,2\n335#1:1029\n335#1:1030,2\n335#1:1032\n335#1:1033,2\n335#1:1035\n335#1:1036,2\n335#1:1038\n335#1:1039,2\n335#1:1041\n335#1:1042,2\n335#1:1044\n335#1:1045,2\n335#1:1047\n335#1:1048,2\n335#1:1050\n335#1:1051,2\n335#1:1053\n335#1:1054,2\n335#1:1056\n335#1:1057,2\n335#1:1059\n335#1:1060,2\n335#1:1062\n335#1:1063,2\n335#1:1065\n335#1:1066,2\n335#1:1068\n335#1:1069,2\n335#1:1071\n335#1:1072,2\n335#1:1074\n338#1:1075,2\n339#1:1077,2\n340#1:1079,2\n341#1:1081,2\n342#1:1083,2\n343#1:1085,2\n344#1:1087,2\n345#1:1089,2\n346#1:1091,2\n352#1:1093\n352#1:1094,2\n352#1:1096\n352#1:1097,2\n352#1:1099\n352#1:1100,2\n352#1:1102\n352#1:1103,2\n352#1:1105\n352#1:1106,2\n352#1:1108\n352#1:1109,2\n352#1:1111\n352#1:1112,2\n352#1:1114\n352#1:1115,2\n352#1:1117\n352#1:1118,2\n352#1:1120\n352#1:1121,2\n352#1:1123\n352#1:1124,2\n352#1:1126\n352#1:1127,2\n352#1:1129\n352#1:1130,2\n352#1:1132\n352#1:1133,2\n352#1:1135\n352#1:1136,2\n352#1:1138\n352#1:1139,2\n352#1:1141\n352#1:1142,2\n352#1:1144\n352#1:1145,2\n352#1:1147\n352#1:1148,2\n352#1:1150\n352#1:1151,2\n352#1:1153\n355#1:1154,2\n356#1:1156,2\n357#1:1158,2\n358#1:1160,2\n359#1:1162,2\n360#1:1164,2\n361#1:1166,2\n177#1:477\n177#1:478,4\n178#1:482,4\n300#1:838\n300#1:839,4\n312#1:918\n312#1:919,4\n324#1:998\n324#1:999,4\n186#1:486\n186#1:488,3\n187#1:491\n187#1:493,3\n188#1:496\n188#1:498,3\n189#1:501\n189#1:503,3\n197#1:511\n197#1:513,3\n198#1:516\n198#1:518,3\n199#1:521\n199#1:523,3\n200#1:526\n200#1:528,3\n208#1:536\n208#1:538,3\n209#1:541\n209#1:543,3\n210#1:546\n210#1:548,3\n211#1:551\n211#1:553,3\n219#1:561\n219#1:563,3\n220#1:566\n220#1:568,3\n221#1:571\n221#1:573,3\n222#1:576\n222#1:578,3\n*E\n"})
/* loaded from: classes.dex */
public final class ColorMatrix {

    @m80.k
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m2564boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m2566constructorimpl$default(float[] fArr, int i11, kotlin.jvm.internal.v vVar) {
        if ((i11 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m2565constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m2567convertRgbToYuvimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m2568convertYuvToRgbimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2569equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && kotlin.jvm.internal.g0.g(fArr, ((ColorMatrix) obj).m2584unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2570equalsimpl0(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.g0.g(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m2571getimpl(float[] fArr, int i11, int i12) {
        return fArr[(i11 * 5) + i12];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2572hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m2573resetimpl(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    /* renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m2574rotateInternalimpl(float[] fArr, float f11, x00.p<? super Float, ? super Float, yz.g2> pVar) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f12 = f11 * 0.0027777778f;
        float floor = (0.25f + f12) - ((float) Math.floor(r8 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f13 = 1.0f - abs;
        float floor2 = f12 - ((float) Math.floor(0.5f + f12));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f14 = 1.0f - abs2;
        pVar.invoke(Float.valueOf(((floor * 8.0f) * f13) / (1.25f - (abs * f13))), Float.valueOf(((floor2 * 8.0f) * f14) / (1.25f - (abs2 * f14))));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m2575setimpl(float[] fArr, int i11, int i12, float f11) {
        fArr[(i11 * 5) + i12] = f11;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m2576setjHGOpc(float[] fArr, @m80.k float[] fArr2) {
        if (fArr.length >= 20 && fArr2.length >= 20) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
            fArr[16] = fArr2[16];
            fArr[17] = fArr2[17];
            fArr[18] = fArr2[18];
            fArr[19] = fArr2[19];
        }
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m2577setToRotateBlueimpl(float[] fArr, float f11) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f12 = f11 * 0.0027777778f;
        float floor = (0.25f + f12) - ((float) Math.floor(r3 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f13 = 1.0f - abs;
        float f14 = ((floor * 8.0f) * f13) / (1.25f - (abs * f13));
        float floor2 = f12 - ((float) Math.floor(0.5f + f12));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f15 = 1.0f - abs2;
        float f16 = ((floor2 * 8.0f) * f15) / (1.25f - (abs2 * f15));
        fArr[0] = f14;
        fArr[1] = f16;
        fArr[5] = -f16;
        fArr[6] = f14;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m2578setToRotateGreenimpl(float[] fArr, float f11) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f12 = f11 * 0.0027777778f;
        float floor = (0.25f + f12) - ((float) Math.floor(r3 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f13 = 1.0f - abs;
        float f14 = ((floor * 8.0f) * f13) / (1.25f - (abs * f13));
        float floor2 = f12 - ((float) Math.floor(0.5f + f12));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f15 = 1.0f - abs2;
        float f16 = ((floor2 * 8.0f) * f15) / (1.25f - (abs2 * f15));
        fArr[0] = f14;
        fArr[2] = -f16;
        fArr[10] = f16;
        fArr[12] = f14;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m2579setToRotateRedimpl(float[] fArr, float f11) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f12 = f11 * 0.0027777778f;
        float floor = (0.25f + f12) - ((float) Math.floor(r2 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f13 = 1.0f - abs;
        float f14 = ((floor * 8.0f) * f13) / (1.25f - (abs * f13));
        float floor2 = f12 - ((float) Math.floor(0.5f + f12));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f15 = 1.0f - abs2;
        float f16 = ((floor2 * 8.0f) * f15) / (1.25f - (abs2 * f15));
        fArr[6] = f14;
        fArr[7] = f16;
        fArr[11] = -f16;
        fArr[12] = f14;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m2580setToSaturationimpl(float[] fArr, float f11) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f12 = 1 - f11;
        float f13 = 0.213f * f12;
        float f14 = 0.715f * f12;
        float f15 = f12 * 0.072f;
        fArr[0] = f13 + f11;
        fArr[1] = f14;
        fArr[2] = f15;
        fArr[5] = f13;
        fArr[6] = f14 + f11;
        fArr[7] = f15;
        fArr[10] = f13;
        fArr[11] = f14;
        fArr[12] = f15 + f11;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m2581setToScaleimpl(float[] fArr, float f11, float f12, float f13, float f14) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f11;
        fArr[6] = f12;
        fArr[12] = f13;
        fArr[18] = f14;
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m2582timesAssignjHGOpc(float[] fArr, @m80.k float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f11 = fArr[0];
        float f12 = fArr2[0];
        float f13 = fArr[1];
        float f14 = fArr2[5];
        float f15 = fArr[2];
        float f16 = fArr2[10];
        float f17 = fArr[3];
        float f18 = fArr2[15];
        float f19 = (f11 * f12) + (f13 * f14) + (f15 * f16) + (f17 * f18);
        float f21 = fArr2[1];
        float f22 = fArr2[6];
        float f23 = fArr2[11];
        float f24 = fArr2[16];
        float f25 = (f11 * f21) + (f13 * f22) + (f15 * f23) + (f17 * f24);
        float f26 = fArr2[2];
        float f27 = fArr2[7];
        float f28 = fArr2[12];
        float f29 = fArr2[17];
        float f31 = (f11 * f26) + (f13 * f27) + (f15 * f28) + (f17 * f29);
        float f32 = fArr2[3];
        float f33 = fArr2[8];
        float f34 = fArr2[13];
        float f35 = fArr2[18];
        float f36 = (f11 * f32) + (f13 * f33) + (f15 * f34) + (f17 * f35);
        float f37 = fArr2[4];
        float f38 = fArr2[9];
        float f39 = fArr2[14];
        float f41 = fArr2[19];
        float f42 = (f11 * f37) + (f13 * f38) + (f15 * f39) + (f17 * f41) + fArr[4];
        float f43 = fArr[5];
        float f44 = fArr[6];
        float f45 = fArr[7];
        float f46 = fArr[8];
        float f47 = (f43 * f12) + (f44 * f14) + (f45 * f16) + (f46 * f18);
        float f48 = (f43 * f21) + (f44 * f22) + (f45 * f23) + (f46 * f24);
        float f49 = (f43 * f26) + (f44 * f27) + (f45 * f28) + (f46 * f29);
        float f51 = (f43 * f32) + (f44 * f33) + (f45 * f34) + (f46 * f35);
        float f52 = (f43 * f37) + (f44 * f38) + (f45 * f39) + (f46 * f41) + fArr[9];
        float f53 = fArr[10];
        float f54 = fArr[11];
        float f55 = fArr[12];
        float f56 = fArr[13];
        float f57 = (f53 * f12) + (f54 * f14) + (f55 * f16) + (f56 * f18);
        float f58 = (f53 * f21) + (f54 * f22) + (f55 * f23) + (f56 * f24);
        float f59 = (f53 * f26) + (f54 * f27) + (f55 * f28) + (f56 * f29);
        float f61 = (f53 * f32) + (f54 * f33) + (f55 * f34) + (f56 * f35);
        float f62 = (f53 * f37) + (f54 * f38) + (f55 * f39) + (f56 * f41) + fArr[14];
        float f63 = fArr[15];
        float f64 = fArr[16];
        float f65 = (f12 * f63) + (f14 * f64);
        float f66 = fArr[17];
        float f67 = f65 + (f16 * f66);
        float f68 = fArr[18];
        float f69 = (f21 * f63) + (f22 * f64) + (f23 * f66) + (f24 * f68);
        float f71 = (f26 * f63) + (f27 * f64) + (f28 * f66) + (f29 * f68);
        float f72 = (f32 * f63) + (f33 * f64) + (f34 * f66) + (f35 * f68);
        float f73 = (f63 * f37) + (f64 * f38) + (f66 * f39) + (f68 * f41) + fArr[19];
        fArr[0] = f19;
        fArr[1] = f25;
        fArr[2] = f31;
        fArr[3] = f36;
        fArr[4] = f42;
        fArr[5] = f47;
        fArr[6] = f48;
        fArr[7] = f49;
        fArr[8] = f51;
        fArr[9] = f52;
        fArr[10] = f57;
        fArr[11] = f58;
        fArr[12] = f59;
        fArr[13] = f61;
        fArr[14] = f62;
        fArr[15] = f67 + (f18 * f68);
        fArr[16] = f69;
        fArr[17] = f71;
        fArr[18] = f72;
        fArr[19] = f73;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2583toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m2569equalsimpl(this.values, obj);
    }

    @m80.k
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m2572hashCodeimpl(this.values);
    }

    public String toString() {
        return m2583toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m2584unboximpl() {
        return this.values;
    }

    @m80.k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m2565constructorimpl(@m80.k float[] fArr) {
        return fArr;
    }
}
