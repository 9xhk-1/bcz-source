package org.junit.jupiter.api;

import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.11", status = API.Status.EXPERIMENTAL)
@FunctionalInterface
/* loaded from: classes9.dex */
public interface u2 extends t2<r80.a>, r80.a {
    @Override // org.junit.jupiter.api.t2
    default String getName() {
        return toString();
    }

    @Override // org.junit.jupiter.api.t2
    default r80.a a() {
        return this;
    }
}
