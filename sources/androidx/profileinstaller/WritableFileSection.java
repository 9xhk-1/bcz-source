package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    public WritableFileSection(@NonNull FileSectionType fileSectionType, int i11, @NonNull byte[] bArr, boolean z11) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i11;
        this.mContents = bArr;
        this.mNeedsCompression = z11;
    }
}
