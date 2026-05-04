package com.baicizhan.main.home.player.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class SettingBehavior {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SettingBehavior[] $VALUES;
    public static final SettingBehavior NOTIFICATION = new SettingBehavior("NOTIFICATION", 0);
    public static final SettingBehavior LEARNING_CONFIGURATION = new SettingBehavior("LEARNING_CONFIGURATION", 1);
    public static final SettingBehavior JAPANESE_SPELLING_CONFIGURATION = new SettingBehavior("JAPANESE_SPELLING_CONFIGURATION", 2);
    public static final SettingBehavior FEEDBACK = new SettingBehavior("FEEDBACK", 3);
    public static final SettingBehavior RATE_US = new SettingBehavior("RATE_US", 4);
    public static final SettingBehavior ABOUT = new SettingBehavior("ABOUT", 5);
    public static final SettingBehavior MORE = new SettingBehavior("MORE", 6);

    private static final /* synthetic */ SettingBehavior[] $values() {
        return new SettingBehavior[]{NOTIFICATION, LEARNING_CONFIGURATION, JAPANESE_SPELLING_CONFIGURATION, FEEDBACK, RATE_US, ABOUT, MORE};
    }

    static {
        SettingBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private SettingBehavior(String str, int i11) {
    }

    @m80.k
    public static m00.a<SettingBehavior> getEntries() {
        return $ENTRIES;
    }

    public static SettingBehavior valueOf(String str) {
        return (SettingBehavior) Enum.valueOf(SettingBehavior.class, str);
    }

    public static SettingBehavior[] values() {
        return (SettingBehavior[]) $VALUES.clone();
    }
}
