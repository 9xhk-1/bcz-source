package com.mob.tools.network;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class StringPart extends HTTPPart {

    /* renamed from: a, reason: collision with root package name */
    private StringBuilder f41356a = new StringBuilder();

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() throws Throwable {
        return new ByteArrayInputStream(this.f41356a.toString().getBytes("utf-8"));
    }

    public StringPart append(String str) {
        this.f41356a.append(str);
        return this;
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() throws Throwable {
        return this.f41356a.toString().getBytes("utf-8").length;
    }

    public String toString() {
        return this.f41356a.toString();
    }
}
