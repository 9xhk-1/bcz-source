package y40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface x extends o {
    static /* synthetic */ void p8(x xVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        xVar.write(bArr, i11, i12);
    }

    void A();

    void I0(@m80.k p pVar, long j11);

    long T(@m80.k p pVar);

    @k
    void U0();

    @Override // y40.o, java.io.Flushable
    void flush();

    @m80.k
    b getBuffer();

    void u(byte b11);

    void write(@m80.k byte[] bArr, int i11, int i12);

    void writeInt(int i11);

    void writeLong(long j11);

    void writeShort(short s11);

    @k
    static /* synthetic */ void N() {
    }
}
