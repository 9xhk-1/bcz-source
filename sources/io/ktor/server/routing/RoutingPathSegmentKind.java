package io.ktor.server.routing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class RoutingPathSegmentKind {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RoutingPathSegmentKind[] $VALUES;
    public static final RoutingPathSegmentKind Constant = new RoutingPathSegmentKind("Constant", 0);
    public static final RoutingPathSegmentKind Parameter = new RoutingPathSegmentKind("Parameter", 1);

    private static final /* synthetic */ RoutingPathSegmentKind[] $values() {
        return new RoutingPathSegmentKind[]{Constant, Parameter};
    }

    static {
        RoutingPathSegmentKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private RoutingPathSegmentKind(String str, int i11) {
    }

    @m80.k
    public static m00.a<RoutingPathSegmentKind> getEntries() {
        return $ENTRIES;
    }

    public static RoutingPathSegmentKind valueOf(String str) {
        return (RoutingPathSegmentKind) Enum.valueOf(RoutingPathSegmentKind.class, str);
    }

    public static RoutingPathSegmentKind[] values() {
        return (RoutingPathSegmentKind[]) $VALUES.clone();
    }
}
