package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,59:1\n119#2:60\n289#3,6:61\n437#3,6:67\n447#3,2:74\n449#3,8:79\n457#3,9:90\n466#3,8:102\n295#3:110\n148#3:111\n149#3,4:117\n153#3:122\n154#3,9:124\n437#3,37:133\n163#3,6:170\n296#3:176\n246#4:73\n240#5,3:76\n243#5,3:99\n1101#6:87\n1083#6,2:88\n56#7,5:112\n519#8:121\n44#8:123\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n46#1:60\n46#1:61,6\n46#1:67,6\n46#1:74,2\n46#1:79,8\n46#1:90,9\n46#1:102,8\n46#1:110\n46#1:111\n46#1:117,4\n46#1:122\n46#1:124,9\n46#1:133,37\n46#1:170,6\n46#1:176\n46#1:73\n46#1:76,3\n46#1:99,3\n46#1:87\n46#1:88,2\n46#1:112,5\n46#1:121\n46#1:123\n*E\n"})
/* loaded from: classes.dex */
public final class FocusEventModifierNodeKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x009a, code lost:
    
        continue;
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusState getFocusState(@m80.k androidx.compose.ui.focus.FocusEventModifierNode r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusEventModifierNodeKt.getFocusState(androidx.compose.ui.focus.FocusEventModifierNode):androidx.compose.ui.focus.FocusState");
    }

    public static final void invalidateFocusEvent(@k FocusEventModifierNode focusEventModifierNode) {
        DelegatableNodeKt.requireOwner(focusEventModifierNode).getFocusOwner().scheduleInvalidation(focusEventModifierNode);
    }
}
