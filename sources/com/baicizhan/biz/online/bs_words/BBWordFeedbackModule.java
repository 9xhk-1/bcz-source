package com.baicizhan.biz.online.bs_words;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BBWordFeedbackModule {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BBWordFeedbackModule[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final BBWordFeedbackModule FEEDBACK_MODULE_OTHER = new BBWordFeedbackModule("FEEDBACK_MODULE_OTHER", 0, 0);
    public static final BBWordFeedbackModule FEEDBACK_MODULE_WIKI = new BBWordFeedbackModule("FEEDBACK_MODULE_WIKI", 1, 1);
    public static final BBWordFeedbackModule FEEDBACK_MODULE_STUDY = new BBWordFeedbackModule("FEEDBACK_MODULE_STUDY", 2, 2);
    public static final BBWordFeedbackModule FEEDBACK_MODULE_FM = new BBWordFeedbackModule("FEEDBACK_MODULE_FM", 3, 3);
    public static final BBWordFeedbackModule FEEDBACK_MODULE_POSTER = new BBWordFeedbackModule("FEEDBACK_MODULE_POSTER", 4, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final BBWordFeedbackModule a(int i11) {
            if (i11 == 0) {
                return BBWordFeedbackModule.FEEDBACK_MODULE_OTHER;
            }
            if (i11 == 1) {
                return BBWordFeedbackModule.FEEDBACK_MODULE_WIKI;
            }
            if (i11 == 2) {
                return BBWordFeedbackModule.FEEDBACK_MODULE_STUDY;
            }
            if (i11 == 3) {
                return BBWordFeedbackModule.FEEDBACK_MODULE_FM;
            }
            if (i11 != 4) {
                return null;
            }
            return BBWordFeedbackModule.FEEDBACK_MODULE_POSTER;
        }

        public a() {
        }
    }

    private static final /* synthetic */ BBWordFeedbackModule[] $values() {
        return new BBWordFeedbackModule[]{FEEDBACK_MODULE_OTHER, FEEDBACK_MODULE_WIKI, FEEDBACK_MODULE_STUDY, FEEDBACK_MODULE_FM, FEEDBACK_MODULE_POSTER};
    }

    static {
        BBWordFeedbackModule[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private BBWordFeedbackModule(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<BBWordFeedbackModule> getEntries() {
        return $ENTRIES;
    }

    public static BBWordFeedbackModule valueOf(String str) {
        return (BBWordFeedbackModule) Enum.valueOf(BBWordFeedbackModule.class, str);
    }

    public static BBWordFeedbackModule[] values() {
        return (BBWordFeedbackModule[]) $VALUES.clone();
    }
}
