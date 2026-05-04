package com.baicizhan.app.api.service;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class BuddyInHomeState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BuddyInHomeState[] $VALUES;
    public static final BuddyInHomeState Idle = new BuddyInHomeState("Idle", 0);
    public static final BuddyInHomeState Ready = new BuddyInHomeState("Ready", 1);
    public static final BuddyInHomeState Tired = new BuddyInHomeState("Tired", 2);

    private static final /* synthetic */ BuddyInHomeState[] $values() {
        return new BuddyInHomeState[]{Idle, Ready, Tired};
    }

    static {
        BuddyInHomeState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private BuddyInHomeState(String str, int i11) {
    }

    @k
    public static a<BuddyInHomeState> getEntries() {
        return $ENTRIES;
    }

    public static BuddyInHomeState valueOf(String str) {
        return (BuddyInHomeState) Enum.valueOf(BuddyInHomeState.class, str);
    }

    public static BuddyInHomeState[] values() {
        return (BuddyInHomeState[]) $VALUES.clone();
    }
}
