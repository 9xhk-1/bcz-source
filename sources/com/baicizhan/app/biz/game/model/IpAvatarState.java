package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class IpAvatarState {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ IpAvatarState[] $VALUES;
    public static final IpAvatarState UnOwned = new IpAvatarState("UnOwned", 0);
    public static final IpAvatarState InHome = new IpAvatarState("InHome", 1);
    public static final IpAvatarState InHomeNoStreak = new IpAvatarState("InHomeNoStreak", 2);
    public static final IpAvatarState InHomeReady = new IpAvatarState("InHomeReady", 3);
    public static final IpAvatarState Traveling = new IpAvatarState("Traveling", 4);
    public static final IpAvatarState RewardPending = new IpAvatarState("RewardPending", 5);

    private static final /* synthetic */ IpAvatarState[] $values() {
        return new IpAvatarState[]{UnOwned, InHome, InHomeNoStreak, InHomeReady, Traveling, RewardPending};
    }

    static {
        IpAvatarState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private IpAvatarState(String str, int i11) {
    }

    @k
    public static m00.a<IpAvatarState> getEntries() {
        return $ENTRIES;
    }

    public static IpAvatarState valueOf(String str) {
        return (IpAvatarState) Enum.valueOf(IpAvatarState.class, str);
    }

    public static IpAvatarState[] values() {
        return (IpAvatarState[]) $VALUES.clone();
    }
}
