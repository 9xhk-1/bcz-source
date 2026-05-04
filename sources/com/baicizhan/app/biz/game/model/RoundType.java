package com.baicizhan.app.biz.game.model;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RoundType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ RoundType[] $VALUES;

    @k
    public static final a Companion;
    private final long value;
    public static final RoundType LEARNING = new RoundType("LEARNING", 0, 1);
    public static final RoundType SPELLING = new RoundType("SPELLING", 1, 2);
    public static final RoundType REVIEW = new RoundType("REVIEW", 2, 3);
    public static final RoundType AI_LEADS_U = new RoundType("AI_LEADS_U", 3, 4);
    public static final RoundType AI_LEADS_U_R = new RoundType("AI_LEADS_U_R", 4, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final RoundType a(long j11) {
            if (j11 == 1) {
                return RoundType.LEARNING;
            }
            if (j11 == 2) {
                return RoundType.SPELLING;
            }
            if (j11 == 3) {
                return RoundType.REVIEW;
            }
            if (j11 == 4) {
                return RoundType.AI_LEADS_U;
            }
            if (j11 == 5) {
                return RoundType.AI_LEADS_U_R;
            }
            throw new IllegalArgumentException("Invalid value: " + j11);
        }

        public a() {
        }
    }

    private static final /* synthetic */ RoundType[] $values() {
        return new RoundType[]{LEARNING, SPELLING, REVIEW, AI_LEADS_U, AI_LEADS_U_R};
    }

    static {
        RoundType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private RoundType(String str, int i11, long j11) {
        this.value = j11;
    }

    @k
    public static m00.a<RoundType> getEntries() {
        return $ENTRIES;
    }

    public static RoundType valueOf(String str) {
        return (RoundType) Enum.valueOf(RoundType.class, str);
    }

    public static RoundType[] values() {
        return (RoundType[]) $VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}
