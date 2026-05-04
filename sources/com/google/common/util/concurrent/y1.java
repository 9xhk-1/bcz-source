package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@l0
/* loaded from: classes7.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f34912a = 2147483647999999999L;

    public static void a(@CheckForNull Object blocker, long nanos) {
        LockSupport.parkNanos(blocker, Math.min(nanos, f34912a));
    }
}
