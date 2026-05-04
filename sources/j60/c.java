package j60;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.g0;
import l60.c0;
import l60.g1;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f63566a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l60.k f63567b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Inflater f63568c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c0 f63569d;

    public c(boolean z11) {
        this.f63566a = z11;
        l60.k kVar = new l60.k();
        this.f63567b = kVar;
        Inflater inflater = new Inflater(true);
        this.f63568c = inflater;
        this.f63569d = new c0((g1) kVar, inflater);
    }

    public final void a(@k l60.k buffer) throws IOException {
        g0.p(buffer, "buffer");
        if (this.f63567b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f63566a) {
            this.f63568c.reset();
        }
        this.f63567b.V2(buffer);
        this.f63567b.writeInt(65535);
        long bytesRead = this.f63568c.getBytesRead() + this.f63567b.size();
        do {
            this.f63569d.a(buffer, Long.MAX_VALUE);
        } while (this.f63568c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63569d.close();
    }
}
