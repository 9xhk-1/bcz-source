package androidx.compose.ui.layout;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AlignmentLineKt {

    @k
    private static final HorizontalAlignmentLine FirstBaseline = new HorizontalAlignmentLine(AlignmentLineKt$FirstBaseline$1.INSTANCE);

    @k
    private static final HorizontalAlignmentLine LastBaseline = new HorizontalAlignmentLine(AlignmentLineKt$LastBaseline$1.INSTANCE);

    @k
    public static final HorizontalAlignmentLine getFirstBaseline() {
        return FirstBaseline;
    }

    @k
    public static final HorizontalAlignmentLine getLastBaseline() {
        return LastBaseline;
    }

    public static final int merge(@k AlignmentLine alignmentLine, int i11, int i12) {
        return alignmentLine.getMerger$ui_release().invoke(Integer.valueOf(i11), Integer.valueOf(i12)).intValue();
    }
}
