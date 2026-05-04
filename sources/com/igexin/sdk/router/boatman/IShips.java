package com.igexin.sdk.router.boatman;

import com.igexin.sdk.router.boatman.receive.Site;

/* loaded from: classes7.dex */
public interface IShips {
    boolean isRegistered(Site site);

    void register(Site site);

    void unRegister(Site site);
}
