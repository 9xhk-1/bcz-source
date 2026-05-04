package no;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public abstract class c implements n {
    @Override // no.n
    public o a(int expectedInputSize) {
        Preconditions.checkArgument(expectedInputSize >= 0, "expectedInputSize must be >= 0 but was %s", expectedInputSize);
        return i();
    }

    @Override // no.n
    public m b(byte[] input) {
        return k(input, 0, input.length);
    }

    @Override // no.n
    public m c(int input) {
        return a(4).putInt(input).h();
    }

    @Override // no.n
    public <T> m d(@e0 T instance, Funnel<? super T> funnel) {
        return i().i(instance, funnel).h();
    }

    @Override // no.n
    public m e(long input) {
        return a(8).putLong(input).h();
    }

    @Override // no.n
    public m f(CharSequence input, Charset charset) {
        return i().g(input, charset).h();
    }

    @Override // no.n
    public m g(CharSequence input) {
        return a(input.length() * 2).d(input).h();
    }

    @Override // no.n
    public m j(ByteBuffer input) {
        return a(input.remaining()).f(input).h();
    }

    @Override // no.n
    public m k(byte[] input, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, input.length);
        return a(len).e(input, off, len).h();
    }
}
