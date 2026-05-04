package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.v;
import m00.a;
import m00.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AnnotationArgumentsRenderingPolicy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final AnnotationArgumentsRenderingPolicy NO_ARGUMENTS = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final AnnotationArgumentsRenderingPolicy UNLESS_EMPTY = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final AnnotationArgumentsRenderingPolicy ALWAYS_PARENTHESIZED = new AnnotationArgumentsRenderingPolicy("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] $values() {
        return new AnnotationArgumentsRenderingPolicy[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        AnnotationArgumentsRenderingPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AnnotationArgumentsRenderingPolicy(String str, int i11, boolean z11, boolean z12) {
        this.includeAnnotationArguments = z11;
        this.includeEmptyAnnotationArguments = z12;
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i11, boolean z11, boolean z12, int i12, v vVar) {
        this(str, i11, (i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12);
    }
}
