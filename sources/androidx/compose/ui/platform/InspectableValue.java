package androidx.compose.ui.platform;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface InspectableValue {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        @m80.k
        public static q30.m<ValueElement> getInspectableElements(@m80.k InspectableValue inspectableValue) {
            return InspectableValue.super.getInspectableElements();
        }

        @m80.l
        @Deprecated
        public static String getNameFallback(@m80.k InspectableValue inspectableValue) {
            return InspectableValue.super.getNameFallback();
        }

        @m80.l
        @Deprecated
        public static Object getValueOverride(@m80.k InspectableValue inspectableValue) {
            return InspectableValue.super.getValueOverride();
        }
    }

    @m80.k
    default q30.m<ValueElement> getInspectableElements() {
        return q30.x.l();
    }

    @m80.l
    default String getNameFallback() {
        return null;
    }

    @m80.l
    default Object getValueOverride() {
        return null;
    }
}
