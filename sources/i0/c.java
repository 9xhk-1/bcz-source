package i0;

import coil.decode.DataSource;
import f0.l0;
import i0.i;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteBufferFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteBufferFetcher.kt\ncoil/fetch/ByteBufferFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ByteBuffer f60017a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f60018b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements i.a<ByteBuffer> {
        @Override // i0.i.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k ByteBuffer byteBuffer, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            return new c(byteBuffer, jVar);
        }
    }

    public c(@m80.k ByteBuffer byteBuffer, @m80.k o0.j jVar) {
        this.f60017a = byteBuffer;
        this.f60018b = jVar;
    }

    @Override // i0.i
    @m80.l
    public Object b(@m80.k j00.c<? super h> cVar) {
        try {
            l60.k kVar = new l60.k();
            kVar.write(this.f60017a);
            this.f60017a.position(0);
            return new m(l0.a(kVar, this.f60018b.g()), null, DataSource.MEMORY);
        } catch (Throwable th2) {
            this.f60017a.position(0);
            throw th2;
        }
    }
}
