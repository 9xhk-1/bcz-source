package androidx.compose.ui.tooling.data;

import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class SourceLocationInfo {

    @l
    private final Integer length;

    @l
    private final Integer lineNumber;

    @l
    private final Integer offset;

    public SourceLocationInfo(@l Integer num, @l Integer num2, @l Integer num3) {
        this.lineNumber = num;
        this.offset = num2;
        this.length = num3;
    }

    @l
    public final Integer getLength() {
        return this.length;
    }

    @l
    public final Integer getLineNumber() {
        return this.lineNumber;
    }

    @l
    public final Integer getOffset() {
        return this.offset;
    }
}
