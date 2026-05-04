package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ParagraphIntrinsicInfo {
    public static final int $stable = 8;
    private final int endIndex;

    @k
    private final ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public ParagraphIntrinsicInfo(@k ParagraphIntrinsics paragraphIntrinsics, int i11, int i12) {
        this.intrinsics = paragraphIntrinsics;
        this.startIndex = i11;
        this.endIndex = i12;
    }

    public static /* synthetic */ ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo, ParagraphIntrinsics paragraphIntrinsics, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            paragraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
        }
        if ((i13 & 2) != 0) {
            i11 = paragraphIntrinsicInfo.startIndex;
        }
        if ((i13 & 4) != 0) {
            i12 = paragraphIntrinsicInfo.endIndex;
        }
        return paragraphIntrinsicInfo.copy(paragraphIntrinsics, i11, i12);
    }

    @k
    public final ParagraphIntrinsics component1() {
        return this.intrinsics;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    @k
    public final ParagraphIntrinsicInfo copy(@k ParagraphIntrinsics paragraphIntrinsics, int i11, int i12) {
        return new ParagraphIntrinsicInfo(paragraphIntrinsics, i11, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return g0.g(this.intrinsics, paragraphIntrinsicInfo.intrinsics) && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    @k
    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return (((this.intrinsics.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex);
    }

    @k
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }
}
