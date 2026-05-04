package g0;

import java.io.IOException;
import l60.e1;
import l60.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c extends v {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<IOException, g2> f52483b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52484c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k e1 e1Var, @k l<? super IOException, g2> lVar) {
        super(e1Var);
        this.f52483b = lVar;
    }

    @Override // l60.v, l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e11) {
            this.f52484c = true;
            this.f52483b.invoke(e11);
        }
    }

    @Override // l60.v, l60.e1, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e11) {
            this.f52484c = true;
            this.f52483b.invoke(e11);
        }
    }

    @Override // l60.v, l60.e1
    public void y8(@k l60.k kVar, long j11) {
        if (this.f52484c) {
            kVar.skip(j11);
            return;
        }
        try {
            super.y8(kVar, j11);
        } catch (IOException e11) {
            this.f52484c = true;
            this.f52483b.invoke(e11);
        }
    }
}
