package n2;

import java.nio.ShortBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface p extends a3.q {
    int D0();

    void P(int i11, short[] sArr, int i12, int i13);

    void S();

    void W0(ShortBuffer shortBuffer);

    ShortBuffer d(boolean z11);

    @Override // a3.q
    void dispose();

    @Deprecated
    ShortBuffer getBuffer();

    void invalidate();

    void l0(short[] sArr, int i11, int i12);

    int o0();

    void p();
}
