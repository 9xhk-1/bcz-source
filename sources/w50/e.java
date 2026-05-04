package w50;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import l60.e1;
import l60.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e extends v {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<IOException, g2> f95398b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@k e1 delegate, @k l<? super IOException, g2> onException) {
        super(delegate);
        g0.p(delegate, "delegate");
        g0.p(onException, "onException");
        this.f95398b = onException;
    }

    @Override // l60.v, l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f95399c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e11) {
            this.f95399c = true;
            this.f95398b.invoke(e11);
        }
    }

    @k
    public final l<IOException, g2> e() {
        return this.f95398b;
    }

    @Override // l60.v, l60.e1, java.io.Flushable
    public void flush() {
        if (this.f95399c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e11) {
            this.f95399c = true;
            this.f95398b.invoke(e11);
        }
    }

    @Override // l60.v, l60.e1
    public void y8(@k l60.k source, long j11) {
        g0.p(source, "source");
        if (this.f95399c) {
            source.skip(j11);
            return;
        }
        try {
            super.y8(source, j11);
        } catch (IOException e11) {
            this.f95399c = true;
            this.f95398b.invoke(e11);
        }
    }
}
