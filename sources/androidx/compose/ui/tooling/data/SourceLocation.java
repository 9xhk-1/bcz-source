package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@UiToolingDataApi
/* loaded from: classes2.dex */
public final class SourceLocation {
    public static final int $stable = 0;
    private final int length;
    private final int lineNumber;
    private final int offset;
    private final int packageHash;

    @l
    private final String sourceFile;

    public SourceLocation(int i11, int i12, int i13, @l String str, int i14) {
        this.lineNumber = i11;
        this.offset = i12;
        this.length = i13;
        this.sourceFile = str;
        this.packageHash = i14;
    }

    public static /* synthetic */ SourceLocation copy$default(SourceLocation sourceLocation, int i11, int i12, int i13, String str, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = sourceLocation.lineNumber;
        }
        if ((i15 & 2) != 0) {
            i12 = sourceLocation.offset;
        }
        if ((i15 & 4) != 0) {
            i13 = sourceLocation.length;
        }
        if ((i15 & 8) != 0) {
            str = sourceLocation.sourceFile;
        }
        if ((i15 & 16) != 0) {
            i14 = sourceLocation.packageHash;
        }
        int i16 = i14;
        int i17 = i13;
        return sourceLocation.copy(i11, i12, i17, str, i16);
    }

    public final int component1() {
        return this.lineNumber;
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.length;
    }

    @l
    public final String component4() {
        return this.sourceFile;
    }

    public final int component5() {
        return this.packageHash;
    }

    @k
    public final SourceLocation copy(int i11, int i12, int i13, @l String str, int i14) {
        return new SourceLocation(i11, i12, i13, str, i14);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceLocation)) {
            return false;
        }
        SourceLocation sourceLocation = (SourceLocation) obj;
        return this.lineNumber == sourceLocation.lineNumber && this.offset == sourceLocation.offset && this.length == sourceLocation.length && g0.g(this.sourceFile, sourceLocation.sourceFile) && this.packageHash == sourceLocation.packageHash;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getPackageHash() {
        return this.packageHash;
    }

    @l
    public final String getSourceFile() {
        return this.sourceFile;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.lineNumber) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.length)) * 31;
        String str = this.sourceFile;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.packageHash);
    }

    @k
    public String toString() {
        return "SourceLocation(lineNumber=" + this.lineNumber + ", offset=" + this.offset + ", length=" + this.length + ", sourceFile=" + this.sourceFile + ", packageHash=" + this.packageHash + ')';
    }
}
