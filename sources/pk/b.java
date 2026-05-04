package pk;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b<Data> implements o<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0990b<Data> f80665a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: pk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0990b<Data> {
        Data a(byte[] bArr);

        Class<Data> getDataClass();
    }

    public b(InterfaceC0990b<Data> interfaceC0990b) {
        this.f80665a = interfaceC0990b;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<Data> buildLoadData(@NonNull byte[] bArr, int i11, int i12, @NonNull ik.e eVar) {
        return new o.a<>(new el.e(bArr), new c(bArr, this.f80665a));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull byte[] bArr) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements p<byte[], ByteBuffer> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: pk.b$a$a, reason: collision with other inner class name */
        public class C0989a implements InterfaceC0990b<ByteBuffer> {
            public C0989a() {
            }

            @Override // pk.b.InterfaceC0990b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteBuffer a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            @Override // pk.b.InterfaceC0990b
            public Class<ByteBuffer> getDataClass() {
                return ByteBuffer.class;
            }
        }

        @Override // pk.p
        @NonNull
        public o<byte[], ByteBuffer> build(@NonNull s sVar) {
            return new b(new C0989a());
        }

        @Override // pk.p
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f80667a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC0990b<Data> f80668b;

        public c(byte[] bArr, InterfaceC0990b<Data> interfaceC0990b) {
            this.f80667a = bArr;
            this.f80668b = interfaceC0990b;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> getDataClass() {
            return this.f80668b.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            aVar.b(this.f80668b.a(this.f80667a));
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements p<byte[], InputStream> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements InterfaceC0990b<InputStream> {
            public a() {
            }

            @Override // pk.b.InterfaceC0990b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public InputStream a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // pk.b.InterfaceC0990b
            public Class<InputStream> getDataClass() {
                return InputStream.class;
            }
        }

        @Override // pk.p
        @NonNull
        public o<byte[], InputStream> build(@NonNull s sVar) {
            return new b(new a());
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
