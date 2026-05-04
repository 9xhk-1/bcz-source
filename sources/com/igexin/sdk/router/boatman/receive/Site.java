package com.igexin.sdk.router.boatman.receive;

/* loaded from: classes7.dex */
public abstract class Site<Bag, V> {
    public abstract String getTag();

    public abstract V onArrived(Bag bag);

    public abstract void onArrived(Bag bag, IBoatResult<V> iBoatResult);
}
