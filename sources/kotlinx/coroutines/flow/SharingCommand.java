package kotlinx.coroutines.flow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class SharingCommand {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SharingCommand[] $VALUES;
    public static final SharingCommand START = new SharingCommand("START", 0);
    public static final SharingCommand STOP = new SharingCommand("STOP", 1);
    public static final SharingCommand STOP_AND_RESET_REPLAY_CACHE = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ SharingCommand[] $values() {
        return new SharingCommand[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        SharingCommand[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private SharingCommand(String str, int i11) {
    }

    @m80.k
    public static m00.a<SharingCommand> getEntries() {
        return $ENTRIES;
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) $VALUES.clone();
    }
}
