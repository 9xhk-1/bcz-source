package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CollectionInfo {
    public static final int $stable = 0;
    private final int columnCount;
    private final int rowCount;

    public CollectionInfo(int i11, int i12) {
        this.rowCount = i11;
        this.columnCount = i12;
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    public final int getRowCount() {
        return this.rowCount;
    }
}
