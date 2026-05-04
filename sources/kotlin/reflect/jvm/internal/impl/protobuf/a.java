package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a implements n {
    protected int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream J = CodedOutputStream.J(outputStream, CodedOutputStream.u(CodedOutputStream.v(serializedSize) + serializedSize));
        J.o0(serializedSize);
        writeTo(J);
        J.I();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0798a<BuilderType extends AbstractC0798a> implements n.a {
        public static UninitializedMessageException c(n nVar) {
            return new UninitializedMessageException(nVar);
        }

        @Override // 
        /* renamed from: a */
        public abstract BuilderType l();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: b */
        public abstract BuilderType r(e eVar, f fVar) throws IOException;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C0799a extends FilterInputStream {

            /* renamed from: a, reason: collision with root package name */
            public int f67535a;

            public C0799a(InputStream inputStream, int i11) {
                super(inputStream);
                this.f67535a = i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f67535a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f67535a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f67535a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j11) throws IOException {
                long skip = super.skip(Math.min(j11, this.f67535a));
                if (skip >= 0) {
                    this.f67535a = (int) (this.f67535a - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i11, int i12) throws IOException {
                int i13 = this.f67535a;
                if (i13 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i11, Math.min(i12, i13));
                if (read >= 0) {
                    this.f67535a -= read;
                }
                return read;
            }
        }
    }
}
