package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class j<T extends i> extends k<T> {

    /* renamed from: b, reason: collision with root package name */
    public final int f78164b;

    /* renamed from: c, reason: collision with root package name */
    public final long f78165c;

    public j(T t11) {
        super(t11);
        this.f78164b = t11.m();
        this.f78165c = t11.p();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public int m() {
        return this.f78164b;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.k, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i
    public long p() {
        return this.f78165c;
    }
}
