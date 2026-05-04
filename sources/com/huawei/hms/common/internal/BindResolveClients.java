package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BindResolveClients {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f35555b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<ResolveClientBean> f35556a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final BindResolveClients f35557a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return b.f35557a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean contains;
        synchronized (f35555b) {
            contains = this.f35556a.contains(resolveClientBean);
        }
        return contains;
    }

    public void notifyClientReconnect() {
        synchronized (f35555b) {
            try {
                ListIterator<ResolveClientBean> listIterator = this.f35556a.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next().clientReconnect();
                }
                this.f35556a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f35555b) {
            try {
                if (!this.f35556a.contains(resolveClientBean)) {
                    this.f35556a.add(resolveClientBean);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f35555b) {
            try {
                if (this.f35556a.contains(resolveClientBean)) {
                    ListIterator<ResolveClientBean> listIterator = this.f35556a.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        } else if (resolveClientBean.equals(listIterator.next())) {
                            listIterator.remove();
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unRegisterAll() {
        synchronized (f35555b) {
            this.f35556a.clear();
        }
    }

    private BindResolveClients() {
        this.f35556a = new ArrayList<>();
    }
}
