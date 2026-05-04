package org.junit.jupiter.params.shadow.com.univocity.parsers.common.input;

import java.io.IOException;
import java.io.Reader;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.BomInput;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b extends a {

    /* renamed from: u, reason: collision with root package name */
    public Reader f78162u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f78163v;

    public b(char c11, int i11, int i12, boolean z11) {
        super(c11, i12, z11);
        this.f78163v = false;
        this.f78157q = new char[i11];
    }

    @Override // k90.c
    public void stop() {
        Reader reader;
        try {
            if (this.f78163v || !this.f78154n || (reader = this.f78162u) == null) {
                return;
            }
            reader.close();
        } catch (IOException e11) {
            throw new IllegalStateException("Error closing input", e11);
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a
    public void x() {
        try {
            Reader reader = this.f78162u;
            char[] cArr = this.f78157q;
            this.f78158r = reader.read(cArr, 0, cArr.length);
        } catch (IOException e11) {
            throw new IllegalStateException("Error reading from input", e11);
        } catch (BomInput.BytesProcessedNotification e12) {
            this.f78163v = true;
            D(e12);
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a
    public void z(Reader reader) {
        this.f78162u = reader;
        this.f78163v = false;
    }

    public b(char[] cArr, char c11, int i11, int i12, boolean z11) {
        super(cArr, c11, i12, z11);
        this.f78163v = false;
        this.f78157q = new char[i11];
    }
}
