package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j11, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j11, obj2, obj3)) {
            if (unsafe.getObject(obj, j11) != obj2) {
                return false;
            }
        }
        return true;
    }
}
