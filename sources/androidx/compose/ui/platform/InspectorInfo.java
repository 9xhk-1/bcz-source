package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class InspectorInfo {
    public static final int $stable = 8;

    @m80.l
    private String name;

    @m80.k
    private final ValueElementSequence properties = new ValueElementSequence();

    @m80.l
    private Object value;

    @m80.l
    public final String getName() {
        return this.name;
    }

    @m80.k
    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    @m80.l
    public final Object getValue() {
        return this.value;
    }

    public final void setName(@m80.l String str) {
        this.name = str;
    }

    public final void setValue(@m80.l Object obj) {
        this.value = obj;
    }
}
