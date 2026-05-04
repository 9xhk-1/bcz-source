package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,807:1\n1084#2:808\n1#3:809\n519#4:810\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n782#1:808\n784#1:810\n*E\n"})
/* loaded from: classes2.dex */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;

    @k
    private static final NodeChainKt$SentinelHead$1 SentinelHead;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r02 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChainKt$SentinelHead$1
            public String toString() {
                return "<Head>";
            }
        };
        r02.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = r02;
    }

    public static final int actionForModifiers(@k Modifier.Element element, @k Modifier.Element element2) {
        if (g0.g(element, element2)) {
            return 2;
        }
        return Actual_jvmKt.areObjectsOfSameType(element, element2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, final MutableVector<Modifier.Element> mutableVector) {
        MutableVector mutableVector2 = new MutableVector(new Modifier[u.u(mutableVector.getSize(), 16)], 0);
        mutableVector2.add(modifier);
        l<Modifier.Element, Boolean> lVar = null;
        while (mutableVector2.getSize() != 0) {
            Modifier modifier2 = (Modifier) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner$ui_release());
                mutableVector2.add(combinedModifier.getOuter$ui_release());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                if (lVar == null) {
                    lVar = new l<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public final Boolean invoke(Modifier.Element element) {
                            mutableVector.add(element);
                            return Boolean.TRUE;
                        }
                    };
                }
                modifier2.all(lVar);
                lVar = lVar;
            }
        }
        return mutableVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        g0.n(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.update(node);
    }
}
