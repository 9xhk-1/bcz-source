package no;

import com.google.common.hash.Funnel;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@go.a
/* loaded from: classes7.dex */
public interface o extends f0 {
    @Override // no.f0
    @uo.a
    o a(byte b11);

    @Override // no.f0
    @uo.a
    o b(byte[] bytes);

    @Override // no.f0
    @uo.a
    o c(char c11);

    @Override // no.f0
    @uo.a
    o d(CharSequence charSequence);

    @Override // no.f0
    @uo.a
    o e(byte[] bytes, int off, int len);

    @Override // no.f0
    @uo.a
    o f(ByteBuffer bytes);

    @Override // no.f0
    @uo.a
    o g(CharSequence charSequence, Charset charset);

    m h();

    @Deprecated
    int hashCode();

    @uo.a
    <T> o i(@e0 T instance, Funnel<? super T> funnel);

    @Override // no.f0
    @uo.a
    o putBoolean(boolean b11);

    @Override // no.f0
    @uo.a
    o putDouble(double d11);

    @Override // no.f0
    @uo.a
    o putFloat(float f11);

    @Override // no.f0
    @uo.a
    o putInt(int i11);

    @Override // no.f0
    @uo.a
    o putLong(long l11);

    @Override // no.f0
    @uo.a
    o putShort(short s11);
}
