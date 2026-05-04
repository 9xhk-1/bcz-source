package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final /* synthetic */ class s2 {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i11, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }
}
