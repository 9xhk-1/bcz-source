package com.baicizhan.biz.online.user_study_api;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ModuleResourceType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ModuleResourceType[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final ModuleResourceType WORD_LISTENING = new ModuleResourceType("WORD_LISTENING", 0, 1);
    public static final ModuleResourceType WORD_CHECK = new ModuleResourceType("WORD_CHECK", 1, 2);
    public static final ModuleResourceType ENGLISH_RECOGNIZED = new ModuleResourceType("ENGLISH_RECOGNIZED", 2, 3);
    public static final ModuleResourceType CHINESE_RECOGNIZED = new ModuleResourceType("CHINESE_RECOGNIZED", 3, 4);
    public static final ModuleResourceType LISTENING_RECOGNIZED = new ModuleResourceType("LISTENING_RECOGNIZED", 4, 5);
    public static final ModuleResourceType FILL_BLANK_SPELLING = new ModuleResourceType("FILL_BLANK_SPELLING", 5, 6);
    public static final ModuleResourceType COMBINE_SPELLING = new ModuleResourceType("COMBINE_SPELLING", 6, 7);
    public static final ModuleResourceType ALL_SPELLING = new ModuleResourceType("ALL_SPELLING", 7, 8);
    public static final ModuleResourceType WORD_READING = new ModuleResourceType("WORD_READING", 8, 9);
    public static final ModuleResourceType WORD_VIDEO = new ModuleResourceType("WORD_VIDEO", 9, 10);
    public static final ModuleResourceType WORD_RADIO = new ModuleResourceType("WORD_RADIO", 10, 11);
    public static final ModuleResourceType WORD_TRAINING = new ModuleResourceType("WORD_TRAINING", 11, 12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final ModuleResourceType a(int i11) {
            switch (i11) {
                case 1:
                    return ModuleResourceType.WORD_LISTENING;
                case 2:
                    return ModuleResourceType.WORD_CHECK;
                case 3:
                    return ModuleResourceType.ENGLISH_RECOGNIZED;
                case 4:
                    return ModuleResourceType.CHINESE_RECOGNIZED;
                case 5:
                    return ModuleResourceType.LISTENING_RECOGNIZED;
                case 6:
                    return ModuleResourceType.FILL_BLANK_SPELLING;
                case 7:
                    return ModuleResourceType.COMBINE_SPELLING;
                case 8:
                    return ModuleResourceType.ALL_SPELLING;
                case 9:
                    return ModuleResourceType.WORD_READING;
                case 10:
                    return ModuleResourceType.WORD_VIDEO;
                case 11:
                    return ModuleResourceType.WORD_RADIO;
                case 12:
                    return ModuleResourceType.WORD_TRAINING;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ ModuleResourceType[] $values() {
        return new ModuleResourceType[]{WORD_LISTENING, WORD_CHECK, ENGLISH_RECOGNIZED, CHINESE_RECOGNIZED, LISTENING_RECOGNIZED, FILL_BLANK_SPELLING, COMBINE_SPELLING, ALL_SPELLING, WORD_READING, WORD_VIDEO, WORD_RADIO, WORD_TRAINING};
    }

    static {
        ModuleResourceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private ModuleResourceType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<ModuleResourceType> getEntries() {
        return $ENTRIES;
    }

    public static ModuleResourceType valueOf(String str) {
        return (ModuleResourceType) Enum.valueOf(ModuleResourceType.class, str);
    }

    public static ModuleResourceType[] values() {
        return (ModuleResourceType[]) $VALUES.clone();
    }
}
