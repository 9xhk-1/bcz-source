package com.baicizhan.main.unity.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class GameParameter {
    public static final int $stable = 0;
    private final int gameType;

    public GameParameter(int i11) {
        this.gameType = i11;
    }

    public static /* synthetic */ GameParameter copy$default(GameParameter gameParameter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = gameParameter.gameType;
        }
        return gameParameter.copy(i11);
    }

    public final int component1() {
        return this.gameType;
    }

    @k
    public final GameParameter copy(int i11) {
        return new GameParameter(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GameParameter) && this.gameType == ((GameParameter) obj).gameType;
    }

    public final int getGameType() {
        return this.gameType;
    }

    public int hashCode() {
        return Integer.hashCode(this.gameType);
    }

    @k
    public String toString() {
        return "GameParameter(gameType=" + this.gameType + j.f81007d;
    }
}
