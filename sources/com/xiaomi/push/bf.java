package com.xiaomi.push;

/* loaded from: classes8.dex */
public class bf implements bh {

    /* renamed from: a, reason: collision with root package name */
    private final String f45302a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45303b;

    public bf(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f45302a = str;
        this.f45303b = str2;
    }

    @Override // com.xiaomi.push.bh
    public String a() {
        return this.f45302a;
    }

    @Override // com.xiaomi.push.bh
    public String b() {
        return this.f45303b;
    }
}
