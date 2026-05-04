package tk;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f90765a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: tk.a$a, reason: collision with other inner class name */
    public static class C1206a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> a(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f90765a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f90765a.position(0);
        return this.f90765a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
