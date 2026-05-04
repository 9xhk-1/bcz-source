package y40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c0 extends p {
    static /* synthetic */ int u4(c0 c0Var, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAtMostTo");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return c0Var.c7(bArr, i11, i12);
    }

    void F(long j11);

    boolean J();

    void R2(@m80.k o oVar, long j11);

    long S1(@m80.k o oVar);

    int c7(@m80.k byte[] bArr, int i11, int i12);

    @m80.k
    b getBuffer();

    @m80.k
    c0 peek();

    byte readByte();

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j11);

    void skip(long j11);

    @k
    static /* synthetic */ void N() {
    }
}
