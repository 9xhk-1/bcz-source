package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.io.Reader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class t extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public String f78190a;

    /* renamed from: b, reason: collision with root package name */
    public int f78191b;

    /* renamed from: c, reason: collision with root package name */
    public int f78192c = 0;

    public void a(String str) {
        this.f78190a = str;
        this.f78191b = str.length();
        this.f78192c = 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f78190a = null;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f78192c;
        int i14 = this.f78191b;
        if (i13 >= i14) {
            return -1;
        }
        int min = Math.min(i14 - i13, i12);
        String str = this.f78190a;
        int i15 = this.f78192c;
        str.getChars(i15, i15 + min, cArr, i11);
        this.f78192c += min;
        return min;
    }

    @Override // java.io.Reader
    public boolean ready() {
        return this.f78190a != null;
    }

    @Override // java.io.Reader
    public long skip(long j11) {
        return 0L;
    }
}
