package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;

    @k
    private final ClipData clipData;
    private final int flags;

    @l
    private final Object localState;

    public DragAndDropTransferData(@k ClipData clipData, @l Object obj, int i11) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i11;
    }

    @k
    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    @l
    public final Object getLocalState() {
        return this.localState;
    }

    public /* synthetic */ DragAndDropTransferData(ClipData clipData, Object obj, int i11, int i12, v vVar) {
        this(clipData, (i12 & 2) != 0 ? null : obj, (i12 & 4) != 0 ? 0 : i11);
    }
}
