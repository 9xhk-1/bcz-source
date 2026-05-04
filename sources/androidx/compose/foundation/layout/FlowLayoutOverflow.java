package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
@u0({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
@n(message = "FlowLayout overflow is no longer maintained")
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;

    @l
    private final x00.l<FlowLayoutOverflowState, p<Composer, Integer, g2>> collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;

    @l
    private final x00.l<FlowLayoutOverflowState, p<Composer, Integer, g2>> seeMoreGetter;

    @m80.k
    private final OverflowType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OverflowType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ OverflowType[] $VALUES;
        public static final OverflowType Visible = new OverflowType("Visible", 0);
        public static final OverflowType Clip = new OverflowType("Clip", 1);
        public static final OverflowType ExpandIndicator = new OverflowType("ExpandIndicator", 2);
        public static final OverflowType ExpandOrCollapseIndicator = new OverflowType("ExpandOrCollapseIndicator", 3);

        private static final /* synthetic */ OverflowType[] $values() {
            return new OverflowType[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
        }

        static {
            OverflowType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private OverflowType(String str, int i11) {
        }

        @m80.k
        public static m00.a<OverflowType> getEntries() {
            return $ENTRIES;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i11, int i12, x00.l lVar, x00.l lVar2, v vVar) {
        this(overflowType, i11, i12, lVar, lVar2);
    }

    public final void addOverflowComposables$foundation_layout_release(@m80.k FlowLayoutOverflowState flowLayoutOverflowState, @m80.k List<p<Composer, Integer, g2>> list) {
        x00.l<FlowLayoutOverflowState, p<Composer, Integer, g2>> lVar = this.seeMoreGetter;
        p<Composer, Integer, g2> invoke = lVar != null ? lVar.invoke(flowLayoutOverflowState) : null;
        x00.l<FlowLayoutOverflowState, p<Composer, Integer, g2>> lVar2 = this.collapseGetter;
        p<Composer, Integer, g2> invoke2 = lVar2 != null ? lVar2.invoke(flowLayoutOverflowState) : null;
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i11 == 1) {
            if (invoke != null) {
                list.add(invoke);
            }
        } else {
            if (i11 != 2) {
                return;
            }
            if (invoke != null) {
                list.add(invoke);
            }
            if (invoke2 != null) {
                list.add(invoke2);
            }
        }
    }

    @m80.k
    public final FlowLayoutOverflowState createOverflowState$foundation_layout_release() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    @m80.k
    public final OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowLayoutOverflow(OverflowType overflowType, int i11, int i12, x00.l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, g2>> lVar, x00.l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, g2>> lVar2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i11;
        this.minCrossAxisSizeToShowCollapse = i12;
        this.seeMoreGetter = lVar;
        this.collapseGetter = lVar2;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i11, int i12, x00.l lVar, x00.l lVar2, int i13, v vVar) {
        this(overflowType, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? null : lVar, (i13 & 16) != 0 ? null : lVar2, null);
    }
}
