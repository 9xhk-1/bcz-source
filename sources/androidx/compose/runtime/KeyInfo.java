package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class KeyInfo {
    public static final int $stable = 8;
    private final int index;
    private final int key;
    private final int location;
    private final int nodes;

    @l
    private final Object objectKey;

    public KeyInfo(int i11, @l Object obj, int i12, int i13, int i14) {
        this.key = i11;
        this.objectKey = obj;
        this.location = i12;
        this.nodes = i13;
        this.index = i14;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getKey() {
        return this.key;
    }

    public final int getLocation() {
        return this.location;
    }

    public final int getNodes() {
        return this.nodes;
    }

    @l
    public final Object getObjectKey() {
        return this.objectKey;
    }
}
