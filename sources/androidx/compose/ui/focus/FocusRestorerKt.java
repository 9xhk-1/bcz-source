package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFocusRestorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,150:1\n119#2:151\n119#2:228\n283#3,5:152\n148#3:157\n149#3:163\n150#3,3:167\n153#3:171\n154#3,9:173\n437#3,6:182\n447#3,2:189\n449#3,17:194\n466#3,8:214\n163#3,6:222\n283#3,5:229\n148#3:234\n149#3:240\n150#3,3:244\n153#3:248\n154#3,9:250\n437#3,6:259\n447#3,2:266\n449#3,17:271\n466#3,8:291\n163#3,6:299\n56#4,5:158\n56#4,5:235\n1101#5:164\n1083#5,2:165\n1101#5:241\n1083#5,2:242\n519#6:170\n44#6:172\n519#6:247\n44#6:249\n246#7:188\n246#7:265\n240#8,3:191\n243#8,3:211\n240#8,3:268\n243#8,3:288\n*S KotlinDebug\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n*L\n38#1:151\n58#1:228\n38#1:152,5\n38#1:157\n38#1:163\n38#1:167,3\n38#1:171\n38#1:173,9\n38#1:182,6\n38#1:189,2\n38#1:194,17\n38#1:214,8\n38#1:222,6\n58#1:229,5\n58#1:234\n58#1:240\n58#1:244,3\n58#1:248\n58#1:250,9\n58#1:259,6\n58#1:266,2\n58#1:271,17\n58#1:291,8\n58#1:299,6\n38#1:158,5\n58#1:235,5\n38#1:164\n38#1:165,2\n58#1:241\n58#1:242,2\n38#1:170\n38#1:172\n58#1:247\n58#1:249\n38#1:188\n58#1:265\n38#1:191,3\n38#1:211,3\n58#1:268,3\n58#1:288,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRestorerKt {

    @k
    private static final String PrevFocusedChild = "previouslyFocusedChildHash";

    @k
    public static final Modifier focusRestorer(@k Modifier modifier, @k FocusRequester focusRequester) {
        return modifier.then(new FocusRestorerElement(focusRequester));
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier modifier, FocusRequester focusRequester, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    @l
    public static final PinnableContainer.PinnedHandle pinFocusedChild(@k FocusTargetNode focusTargetNode) {
        PinnableContainer pinnableContainer;
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode == null || (pinnableContainer = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.currentValueOf(findActiveFocusNode, PinnableContainerKt.getLocalPinnableContainer())) == null) {
            return null;
        }
        return pinnableContainer.pin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x005e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean restoreFocusedChild(@m80.k androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.restoreFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x003f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean saveFocusedChild(@m80.k final androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r11.getFocusState()
            boolean r0 = r0.getHasFocus()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m4118constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r11.getNode()
            boolean r2 = r2.isAttached()
            if (r2 != 0) goto L21
            java.lang.String r2 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L21:
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r2.<init>(r4, r1)
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L3c
            androidx.compose.ui.Modifier$Node r4 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4, r1)
            goto L3f
        L3c:
            r2.add(r4)
        L3f:
            int r4 = r2.getSize()
            if (r4 == 0) goto Le2
            int r4 = r2.getSize()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r4 = r2.removeAt(r4)
            androidx.compose.ui.Modifier$Node r4 = (androidx.compose.ui.Modifier.Node) r4
            int r6 = r4.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L5c
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4, r1)
            goto L3f
        L5c:
            if (r4 == 0) goto L3f
            int r6 = r4.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Ldc
            r6 = 0
            r7 = r6
        L67:
            if (r4 == 0) goto L3f
            boolean r8 = r4 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r8 == 0) goto L9b
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            androidx.compose.ui.focus.FocusStateImpl r8 = r4.getFocusState()
            boolean r8 = r8.getHasFocus()
            if (r8 == 0) goto Ld7
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r4)
            int r0 = r0.getCompositeKeyHash()
            r11.setPreviouslyFocusedChildHash(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry()
            java.lang.Object r0 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L9a
            androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1 r1 = new androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
            r1.<init>()
            java.lang.String r11 = "previouslyFocusedChildHash"
            r0.registerProvider(r11, r1)
        L9a:
            return r5
        L9b:
            int r8 = r4.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto Ld7
            boolean r8 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Ld7
            r8 = r4
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = r1
        Lae:
            if (r8 == 0) goto Ld4
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto Lcf
            int r9 = r9 + 1
            if (r9 != r5) goto Lbd
            r4 = r8
            goto Lcf
        Lbd:
            if (r7 != 0) goto Lc6
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r3]
            r7.<init>(r10, r1)
        Lc6:
            if (r4 == 0) goto Lcc
            r7.add(r4)
            r4 = r6
        Lcc:
            r7.add(r8)
        Lcf:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto Lae
        Ld4:
            if (r9 != r5) goto Ld7
            goto L67
        Ld7:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L67
        Ldc:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            goto L5c
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.saveFocusedChild(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    @ExperimentalComposeUiApi
    @n(level = DeprecationLevel.WARNING, message = "Use focusRestorer(FocusRequester) instead", replaceWith = @w0(expression = "this.focusRestorer(onRestoreFailed())", imports = {}))
    @k
    public static final Modifier focusRestorer(@k Modifier modifier, @l a<FocusRequester> aVar) {
        FocusRequester focusRequester;
        if (aVar == null || (focusRequester = aVar.invoke()) == null) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }
}
