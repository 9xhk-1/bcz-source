package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,268:1\n253#1:272\n254#1,2:274\n256#1,2:277\n258#1:285\n259#1,5:321\n264#1:367\n265#1:371\n1101#2:269\n1083#2,2:270\n1101#2:299\n1083#2,2:300\n1101#2:433\n1083#2,2:434\n1#3:273\n1#3:373\n519#4:276\n423#4,6:279\n44#4:306\n429#4,3:368\n519#4:372\n423#4,9:374\n519#4:383\n423#4,9:384\n519#4:393\n423#4,9:394\n519#4:403\n423#4,9:404\n519#4:413\n423#4,6:414\n519#4:439\n44#4:441\n429#4,3:497\n119#5:286\n119#5:420\n283#6,5:287\n148#6:292\n149#6:298\n150#6,4:302\n154#6,9:307\n437#6,5:316\n442#6:326\n447#6,2:328\n449#6,17:333\n466#6,8:353\n163#6,6:361\n283#6,5:421\n148#6:426\n149#6:432\n150#6,3:436\n153#6:440\n154#6,9:442\n437#6,6:451\n447#6,2:458\n449#6,17:463\n466#6,8:483\n163#6,6:491\n56#7,5:293\n56#7,5:427\n246#8:327\n246#8:457\n240#9,3:330\n243#9,3:350\n240#9,3:460\n243#9,3:480\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n87#1:272\n87#1:274,2\n87#1:277,2\n87#1:285\n87#1:321,5\n87#1:367\n87#1:371\n53#1:269\n53#1:270,2\n87#1:299\n87#1:300,2\n258#1:433\n258#1:434,2\n87#1:273\n87#1:276\n87#1:279,6\n87#1:306\n87#1:368,3\n111#1:372\n112#1:374,9\n134#1:383\n135#1:384,9\n153#1:393\n154#1:394,9\n168#1:403\n170#1:404,9\n255#1:413\n257#1:414,6\n258#1:439\n258#1:441\n257#1:497,3\n87#1:286\n258#1:420\n87#1:287,5\n87#1:292\n87#1:298\n87#1:302,4\n87#1:307,9\n87#1:316,5\n87#1:326\n87#1:328,2\n87#1:333,17\n87#1:353,8\n87#1:361,6\n258#1:421,5\n258#1:426\n258#1:432\n258#1:436,3\n258#1:440\n258#1:442,9\n258#1:451,6\n258#1:458,2\n258#1:463,17\n258#1:483,8\n258#1:491,6\n87#1:293,5\n258#1:427,5\n87#1:327\n258#1:457\n87#1:330,3\n87#1:350,3\n258#1:460,3\n258#1:480,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusRequester {
    public static final int $stable = 0;

    @k
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final FocusRequester Default = new FocusRequester();

    @k
    private static final FocusRequester Cancel = new FocusRequester();

    @k
    private static final FocusRequester Redirect = new FocusRequester();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 1)
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;

            @k
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            @k
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @k
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @k
        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        @k
        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        @k
        public final FocusRequester getRedirect$ui_release() {
            return FocusRequester.Redirect;
        }

        private Companion() {
        }
    }

    private final boolean findFocusTarget(l<? super FocusTargetNode, Boolean> lVar) {
        Companion companion = Companion;
        if (this == companion.getDefault()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == companion.getCancel()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            FocusRequesterModifierNode focusRequesterModifierNode = focusRequesterModifierNodeArr[i11];
            int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode(), false);
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (true) {
                if (mutableVector2.getSize() != 0) {
                    Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                    if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            }
                            if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                MutableVector mutableVector3 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        if (lVar.invoke((FocusTargetNode) node).booleanValue()) {
                                            z11 = true;
                                            break;
                                        }
                                    } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                        int i12 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector3.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector3);
                                }
                            } else {
                                node = node.getChild$ui_release();
                            }
                        }
                    }
                }
            }
        }
        return z11;
    }

    /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    public static /* synthetic */ boolean m2179requestFocus3ESFkO8$default(FocusRequester focusRequester, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = FocusDirection.Companion.m2157getEnterdhqQ8s();
        }
        return focusRequester.m2180requestFocus3ESFkO8(i11);
    }

    public final boolean captureFocus() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            if (FocusRequesterModifierNodeKt.captureFocus(focusRequesterModifierNodeArr[i11])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0060, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean findFocusTargetNode$ui_release(@m80.k x00.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequester.findFocusTargetNode$ui_release(x00.l):boolean");
    }

    public final boolean freeFocus() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            if (FocusRequesterModifierNodeKt.freeFocus(focusRequesterModifierNodeArr[i11])) {
                return true;
            }
        }
        return false;
    }

    @k
    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    @n(level = DeprecationLevel.HIDDEN, message = "use the version the has a FocusDirection", replaceWith = @w0(expression = "this.requestFocus()", imports = {}))
    public final /* synthetic */ void requestFocus() {
        m2180requestFocus3ESFkO8(FocusDirection.Companion.m2157getEnterdhqQ8s());
    }

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    public final boolean m2180requestFocus3ESFkO8(final int i11) {
        return findFocusTargetNode$ui_release(new l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$requestFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo2183requestFocus3ESFkO8(i11));
            }
        });
    }

    public final boolean restoreFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            z11 = FocusRequesterModifierNodeKt.restoreFocusedChild(focusRequesterModifierNodeArr[i11]) || z11;
        }
        return z11;
    }

    public final boolean saveFocusedChild() {
        if (this.focusRequesterNodes.getSize() == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        FocusRequesterModifierNode[] focusRequesterModifierNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            if (FocusRequesterModifierNodeKt.saveFocusedChild(focusRequesterModifierNodeArr[i11])) {
                return true;
            }
        }
        return false;
    }
}
