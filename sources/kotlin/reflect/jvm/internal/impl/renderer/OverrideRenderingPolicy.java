package kotlin.reflect.jvm.internal.impl.renderer;

import m00.a;
import m00.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class OverrideRenderingPolicy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OverrideRenderingPolicy[] $VALUES;
    public static final OverrideRenderingPolicy RENDER_OVERRIDE = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
    public static final OverrideRenderingPolicy RENDER_OPEN = new OverrideRenderingPolicy("RENDER_OPEN", 1);
    public static final OverrideRenderingPolicy RENDER_OPEN_OVERRIDE = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ OverrideRenderingPolicy[] $values() {
        return new OverrideRenderingPolicy[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        OverrideRenderingPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private OverrideRenderingPolicy(String str, int i11) {
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) $VALUES.clone();
    }
}
