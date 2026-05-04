package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Direction {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction Vertical = new Direction("Vertical", 0);
    public static final Direction Horizontal = new Direction("Horizontal", 1);
    public static final Direction Both = new Direction("Both", 2);

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{Vertical, Horizontal, Both};
    }

    static {
        Direction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private Direction(String str, int i11) {
    }

    @m80.k
    public static m00.a<Direction> getEntries() {
        return $ENTRIES;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
