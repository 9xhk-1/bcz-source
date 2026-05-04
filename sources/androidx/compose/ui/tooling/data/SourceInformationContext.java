package androidx.compose.ui.tooling.data;

import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UiToolingDataApi
/* loaded from: classes2.dex */
final class SourceInformationContext {
    private final boolean isCall;
    private final boolean isInline;

    @k
    private final List<SourceLocationInfo> locations;

    @l
    private final String name;
    private int nextLocation;
    private final int packageHash;

    @l
    private final List<Parameter> parameters;
    private final int repeatOffset;

    @l
    private final String sourceFile;

    public SourceInformationContext(@l String str, @l String str2, int i11, @k List<SourceLocationInfo> list, int i12, @l List<Parameter> list2, boolean z11, boolean z12) {
        this.name = str;
        this.sourceFile = str2;
        this.packageHash = i11;
        this.locations = list;
        this.repeatOffset = i12;
        this.parameters = list2;
        this.isCall = z11;
        this.isInline = z12;
    }

    @k
    public final List<SourceLocationInfo> getLocations() {
        return this.locations;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    @l
    public final List<Parameter> getParameters() {
        return this.parameters;
    }

    public final int getRepeatOffset() {
        return this.repeatOffset;
    }

    @l
    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final boolean isCall() {
        return this.isCall;
    }

    public final boolean isInline() {
        return this.isInline;
    }

    @l
    public final SourceLocation nextSourceLocation() {
        int i11;
        if (this.nextLocation >= this.locations.size() && (i11 = this.repeatOffset) >= 0) {
            this.nextLocation = i11;
        }
        if (this.nextLocation >= this.locations.size()) {
            return null;
        }
        List<SourceLocationInfo> list = this.locations;
        int i12 = this.nextLocation;
        this.nextLocation = i12 + 1;
        SourceLocationInfo sourceLocationInfo = list.get(i12);
        Integer lineNumber = sourceLocationInfo.getLineNumber();
        int intValue = lineNumber != null ? lineNumber.intValue() : -1;
        Integer offset = sourceLocationInfo.getOffset();
        int intValue2 = offset != null ? offset.intValue() : -1;
        Integer length = sourceLocationInfo.getLength();
        return new SourceLocation(intValue, intValue2, length != null ? length.intValue() : -1, this.sourceFile, this.packageHash);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.tooling.data.SourceLocation sourceLocation(int r9, @m80.l androidx.compose.ui.tooling.data.SourceInformationContext r10) {
        /*
            r8 = this;
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            int r0 = r0.size()
            if (r9 < r0) goto L22
            int r0 = r8.repeatOffset
            if (r0 < 0) goto L22
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r1 = r8.locations
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            int r0 = r8.repeatOffset
            int r9 = r9 - r0
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            int r0 = r0.size()
            int r1 = r8.repeatOffset
            int r0 = r0 - r1
            int r9 = r9 % r0
            int r9 = r9 + r1
        L22:
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            int r0 = r0.size()
            r1 = 0
            if (r9 >= r0) goto L81
            java.util.List<androidx.compose.ui.tooling.data.SourceLocationInfo> r0 = r8.locations
            java.lang.Object r9 = r0.get(r9)
            androidx.compose.ui.tooling.data.SourceLocationInfo r9 = (androidx.compose.ui.tooling.data.SourceLocationInfo) r9
            androidx.compose.ui.tooling.data.SourceLocation r2 = new androidx.compose.ui.tooling.data.SourceLocation
            java.lang.Integer r0 = r9.getLineNumber()
            r3 = -1
            if (r0 == 0) goto L41
            int r0 = r0.intValue()
            goto L42
        L41:
            r0 = r3
        L42:
            java.lang.Integer r4 = r9.getOffset()
            if (r4 == 0) goto L4d
            int r4 = r4.intValue()
            goto L4e
        L4d:
            r4 = r3
        L4e:
            java.lang.Integer r9 = r9.getLength()
            if (r9 == 0) goto L5a
            int r9 = r9.intValue()
            r5 = r9
            goto L5b
        L5a:
            r5 = r3
        L5b:
            java.lang.String r9 = r8.sourceFile
            if (r9 != 0) goto L66
            if (r10 == 0) goto L64
            java.lang.String r6 = r10.sourceFile
            goto L67
        L64:
            r6 = r1
            goto L67
        L66:
            r6 = r9
        L67:
            if (r9 != 0) goto L72
            if (r10 == 0) goto L75
            int r9 = r10.packageHash
        L6d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L75
        L72:
            int r9 = r8.packageHash
            goto L6d
        L75:
            if (r1 == 0) goto L7b
            int r3 = r1.intValue()
        L7b:
            r7 = r3
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.SourceInformationContext.sourceLocation(int, androidx.compose.ui.tooling.data.SourceInformationContext):androidx.compose.ui.tooling.data.SourceLocation");
    }
}
