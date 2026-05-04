package androidx.compose.runtime.tooling;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CompositionGroup extends CompositionData {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @l
        @Deprecated
        public static CompositionGroup find(@k CompositionGroup compositionGroup, @k Object obj) {
            return CompositionGroup.super.find(obj);
        }

        @Deprecated
        public static int getGroupSize(@k CompositionGroup compositionGroup) {
            return CompositionGroup.super.getGroupSize();
        }

        @l
        @Deprecated
        public static Object getIdentity(@k CompositionGroup compositionGroup) {
            return CompositionGroup.super.getIdentity();
        }

        @Deprecated
        public static int getSlotsSize(@k CompositionGroup compositionGroup) {
            return CompositionGroup.super.getSlotsSize();
        }
    }

    @k
    Iterable<Object> getData();

    default int getGroupSize() {
        return 0;
    }

    @l
    default Object getIdentity() {
        return null;
    }

    @k
    Object getKey();

    @l
    Object getNode();

    default int getSlotsSize() {
        return 0;
    }

    @l
    String getSourceInfo();
}
