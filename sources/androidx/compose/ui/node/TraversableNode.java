package androidx.compose.ui.node;

import m00.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface TraversableNode extends DelegatableNode {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class TraverseDescendantsAction {
            private static final /* synthetic */ m00.a $ENTRIES;
            private static final /* synthetic */ TraverseDescendantsAction[] $VALUES;
            public static final TraverseDescendantsAction ContinueTraversal = new TraverseDescendantsAction("ContinueTraversal", 0);
            public static final TraverseDescendantsAction SkipSubtreeAndContinueTraversal = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
            public static final TraverseDescendantsAction CancelTraversal = new TraverseDescendantsAction("CancelTraversal", 2);

            private static final /* synthetic */ TraverseDescendantsAction[] $values() {
                return new TraverseDescendantsAction[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
            }

            static {
                TraverseDescendantsAction[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c.c($values);
            }

            private TraverseDescendantsAction(String str, int i11) {
            }

            @k
            public static m00.a<TraverseDescendantsAction> getEntries() {
                return $ENTRIES;
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) $VALUES.clone();
            }
        }

        private Companion() {
        }
    }

    @k
    Object getTraverseKey();
}
