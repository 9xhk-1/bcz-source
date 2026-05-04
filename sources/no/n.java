package no;

import com.google.common.hash.Funnel;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public interface n {
    o a(int expectedInputSize);

    m b(byte[] input);

    m c(int input);

    <T> m d(@e0 T instance, Funnel<? super T> funnel);

    m e(long input);

    m f(CharSequence input, Charset charset);

    m g(CharSequence input);

    int h();

    o i();

    m j(ByteBuffer input);

    m k(byte[] input, int off, int len);
}
