package androidx.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final String ID = "CHAP";
    public final String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final Id3Frame[] subFrames;

    public ChapterFrame(String str, int i11, int i12, long j11, long j12, Id3Frame[] id3FrameArr) {
        super(ID);
        this.chapterId = str;
        this.startTimeMs = i11;
        this.endTimeMs = i12;
        this.startOffset = j11;
        this.endOffset = j12;
        this.subFrames = id3FrameArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && Objects.equals(this.chapterId, chapterFrame.chapterId) && Arrays.equals(this.subFrames, chapterFrame.subFrames)) {
                return true;
            }
        }
        return false;
    }

    public Id3Frame getSubFrame(int i11) {
        return this.subFrames[i11];
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    public int hashCode() {
        int i11 = (((((((527 + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31;
        String str = this.chapterId;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}
