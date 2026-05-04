package androidx.compose.ui.focus;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n119#2:127\n119#2:244\n119#2:361\n119#2:478\n119#2:595\n119#2:712\n289#3,6:128\n437#3,6:134\n447#3,2:141\n449#3,8:146\n457#3,9:157\n466#3,8:169\n295#3:177\n148#3:178\n149#3,4:184\n153#3:189\n154#3,9:191\n437#3,37:200\n163#3,6:237\n296#3:243\n289#3,6:245\n437#3,6:251\n447#3,2:258\n449#3,8:263\n457#3,9:274\n466#3,8:286\n295#3:294\n148#3:295\n149#3,4:301\n153#3:306\n154#3,9:308\n437#3,37:317\n163#3,6:354\n296#3:360\n289#3,6:362\n437#3,6:368\n447#3,2:375\n449#3,8:380\n457#3,9:391\n466#3,8:403\n295#3:411\n148#3:412\n149#3,4:418\n153#3:423\n154#3,9:425\n437#3,37:434\n163#3,6:471\n296#3:477\n289#3,6:479\n437#3,6:485\n447#3,2:492\n449#3,8:497\n457#3,9:508\n466#3,8:520\n295#3:528\n148#3:529\n149#3,4:535\n153#3:540\n154#3,9:542\n437#3,37:551\n163#3,6:588\n296#3:594\n289#3,6:596\n437#3,6:602\n447#3,2:609\n449#3,8:614\n457#3,9:625\n466#3,8:637\n295#3:645\n148#3:646\n149#3,4:652\n153#3:657\n154#3,9:659\n437#3,37:668\n163#3,6:705\n296#3:711\n289#3,6:713\n437#3,6:719\n447#3,2:726\n449#3,8:731\n457#3,9:742\n466#3,8:754\n295#3:762\n148#3:763\n149#3,4:769\n153#3:774\n154#3,9:776\n437#3,37:785\n163#3,6:822\n296#3:828\n246#4:140\n246#4:257\n246#4:374\n246#4:491\n246#4:608\n246#4:725\n240#5,3:143\n243#5,3:166\n240#5,3:260\n243#5,3:283\n240#5,3:377\n243#5,3:400\n240#5,3:494\n243#5,3:517\n240#5,3:611\n243#5,3:634\n240#5,3:728\n243#5,3:751\n1101#6:154\n1083#6,2:155\n1101#6:271\n1083#6,2:272\n1101#6:388\n1083#6,2:389\n1101#6:505\n1083#6,2:506\n1101#6:622\n1083#6,2:623\n1101#6:739\n1083#6,2:740\n56#7,5:179\n56#7,5:296\n56#7,5:413\n56#7,5:530\n56#7,5:647\n56#7,5:764\n519#8:188\n44#8:190\n519#8:305\n44#8:307\n519#8:422\n44#8:424\n519#8:539\n44#8:541\n519#8:656\n44#8:658\n519#8:773\n44#8:775\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n39#1:127\n63#1:244\n83#1:361\n96#1:478\n113#1:595\n119#1:712\n39#1:128,6\n39#1:134,6\n39#1:141,2\n39#1:146,8\n39#1:157,9\n39#1:169,8\n39#1:177\n39#1:178\n39#1:184,4\n39#1:189\n39#1:191,9\n39#1:200,37\n39#1:237,6\n39#1:243\n63#1:245,6\n63#1:251,6\n63#1:258,2\n63#1:263,8\n63#1:274,9\n63#1:286,8\n63#1:294\n63#1:295\n63#1:301,4\n63#1:306\n63#1:308,9\n63#1:317,37\n63#1:354,6\n63#1:360\n83#1:362,6\n83#1:368,6\n83#1:375,2\n83#1:380,8\n83#1:391,9\n83#1:403,8\n83#1:411\n83#1:412\n83#1:418,4\n83#1:423\n83#1:425,9\n83#1:434,37\n83#1:471,6\n83#1:477\n96#1:479,6\n96#1:485,6\n96#1:492,2\n96#1:497,8\n96#1:508,9\n96#1:520,8\n96#1:528\n96#1:529\n96#1:535,4\n96#1:540\n96#1:542,9\n96#1:551,37\n96#1:588,6\n96#1:594\n113#1:596,6\n113#1:602,6\n113#1:609,2\n113#1:614,8\n113#1:625,9\n113#1:637,8\n113#1:645\n113#1:646\n113#1:652,4\n113#1:657\n113#1:659,9\n113#1:668,37\n113#1:705,6\n113#1:711\n119#1:713,6\n119#1:719,6\n119#1:726,2\n119#1:731,8\n119#1:742,9\n119#1:754,8\n119#1:762\n119#1:763\n119#1:769,4\n119#1:774\n119#1:776,9\n119#1:785,37\n119#1:822,6\n119#1:828\n39#1:140\n63#1:257\n83#1:374\n96#1:491\n113#1:608\n119#1:725\n39#1:143,3\n39#1:166,3\n63#1:260,3\n63#1:283,3\n83#1:377,3\n83#1:400,3\n96#1:494,3\n96#1:517,3\n113#1:611,3\n113#1:634,3\n119#1:728,3\n119#1:751,3\n39#1:154\n39#1:155,2\n63#1:271\n63#1:272,2\n83#1:388\n83#1:389,2\n96#1:505\n96#1:506,2\n113#1:622\n113#1:623,2\n119#1:739\n119#1:740,2\n39#1:179,5\n63#1:296,5\n83#1:413,5\n96#1:530,5\n113#1:647,5\n119#1:764,5\n39#1:188\n39#1:190\n63#1:305\n63#1:307\n83#1:422\n83#1:424\n96#1:539\n96#1:541\n113#1:656\n113#1:658\n119#1:773\n119#1:775\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRequesterModifierNodeKt {
    /* JADX WARN: Code restructure failed: missing block: B:99:0x008b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean captureFocus(@m80.k androidx.compose.ui.focus.FocusRequesterModifierNode r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequesterModifierNodeKt.captureFocus(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean freeFocus(@m80.k androidx.compose.ui.focus.FocusRequesterModifierNode r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequesterModifierNodeKt.freeFocus(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008b, code lost:
    
        continue;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinFocusedChild(@m80.k androidx.compose.ui.focus.FocusRequesterModifierNode r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequesterModifierNodeKt.pinFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode):androidx.compose.ui.layout.PinnableContainer$PinnedHandle");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00a0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean requestFocus(@m80.k androidx.compose.ui.focus.FocusRequesterModifierNode r10) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequesterModifierNodeKt.requestFocus(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean restoreFocusedChild(@m80.k androidx.compose.ui.focus.FocusRequesterModifierNode r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequesterModifierNodeKt.restoreFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x008b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean saveFocusedChild(@m80.k androidx.compose.ui.focus.FocusRequesterModifierNode r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequesterModifierNodeKt.saveFocusedChild(androidx.compose.ui.focus.FocusRequesterModifierNode):boolean");
    }
}
