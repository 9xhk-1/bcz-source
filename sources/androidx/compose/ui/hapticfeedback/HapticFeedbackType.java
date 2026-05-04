package androidx.compose.ui.hapticfeedback;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class HapticFeedbackType {

    @k
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m3239getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3251getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m3240getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3252getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m3241getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3253getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m3242getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3254getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m3243getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3255getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m3244getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3256getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m3245getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3257getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m3246getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3258getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m3247getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3259getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m3248getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3260getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m3249getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3261getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m3250getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3262getVirtualKey5zf0vsI();
        }

        @k
        public final List<HapticFeedbackType> values() {
            return h0.Q(HapticFeedbackType.m3232boximpl(m3239getConfirm5zf0vsI()), HapticFeedbackType.m3232boximpl(m3240getContextClick5zf0vsI()), HapticFeedbackType.m3232boximpl(m3241getGestureEnd5zf0vsI()), HapticFeedbackType.m3232boximpl(m3242getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m3232boximpl(m3243getLongPress5zf0vsI()), HapticFeedbackType.m3232boximpl(m3244getReject5zf0vsI()), HapticFeedbackType.m3232boximpl(m3245getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m3232boximpl(m3246getSegmentTick5zf0vsI()), HapticFeedbackType.m3232boximpl(m3247getTextHandleMove5zf0vsI()), HapticFeedbackType.m3232boximpl(m3248getToggleOff5zf0vsI()), HapticFeedbackType.m3232boximpl(m3249getToggleOn5zf0vsI()), HapticFeedbackType.m3232boximpl(m3250getVirtualKey5zf0vsI()));
        }

        private Companion() {
        }
    }

    private /* synthetic */ HapticFeedbackType(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m3232boximpl(int i11) {
        return new HapticFeedbackType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3234equalsimpl(int i11, Object obj) {
        return (obj instanceof HapticFeedbackType) && i11 == ((HapticFeedbackType) obj).m3238unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3235equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3236hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3237toStringimpl(int i11) {
        Companion companion = Companion;
        return m3235equalsimpl0(i11, companion.m3239getConfirm5zf0vsI()) ? "Confirm" : m3235equalsimpl0(i11, companion.m3240getContextClick5zf0vsI()) ? "ContextClick" : m3235equalsimpl0(i11, companion.m3241getGestureEnd5zf0vsI()) ? "GestureEnd" : m3235equalsimpl0(i11, companion.m3242getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m3235equalsimpl0(i11, companion.m3243getLongPress5zf0vsI()) ? "LongPress" : m3235equalsimpl0(i11, companion.m3244getReject5zf0vsI()) ? "Reject" : m3235equalsimpl0(i11, companion.m3245getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m3235equalsimpl0(i11, companion.m3246getSegmentTick5zf0vsI()) ? "SegmentTick" : m3235equalsimpl0(i11, companion.m3247getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m3235equalsimpl0(i11, companion.m3248getToggleOff5zf0vsI()) ? "ToggleOff" : m3235equalsimpl0(i11, companion.m3249getToggleOn5zf0vsI()) ? "ToggleOn" : m3235equalsimpl0(i11, companion.m3250getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3234equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3236hashCodeimpl(this.value);
    }

    @k
    public String toString() {
        return m3237toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3238unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3233constructorimpl(int i11) {
        return i11;
    }
}
