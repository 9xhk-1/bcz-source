package com.igexin.sdk.router.boatman;

import com.igexin.sdk.router.boatman.receive.IBoatResult;

/* loaded from: classes7.dex */
public class BoatBean {
    private Object bag;
    private IBoatResult listener;

    public BoatBean() {
    }

    public Object getBag() {
        return this.bag;
    }

    public IBoatResult getListener() {
        return this.listener;
    }

    public void setBag(Object obj) {
        this.bag = obj;
    }

    public void setListener(IBoatResult iBoatResult) {
        this.listener = iBoatResult;
    }

    public BoatBean(Object obj, IBoatResult iBoatResult) {
        this.bag = obj;
        this.listener = iBoatResult;
    }
}
