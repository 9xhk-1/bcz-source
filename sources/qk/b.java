package qk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import pk.n;
import pk.o;
import pk.p;
import pk.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements o<pk.h, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final ik.d<Integer> f82344b = ik.d.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final n<pk.h, pk.h> f82345a;

    public b() {
        this(null);
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> buildLoadData(@NonNull pk.h hVar, int i11, int i12, @NonNull ik.e eVar) {
        n<pk.h, pk.h> nVar = this.f82345a;
        if (nVar != null) {
            pk.h b11 = nVar.b(hVar, 0, 0);
            if (b11 == null) {
                this.f82345a.c(hVar, 0, 0, hVar);
            } else {
                hVar = b11;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) eVar.c(f82344b)).intValue()));
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull pk.h hVar) {
        return true;
    }

    public b(@Nullable n<pk.h, pk.h> nVar) {
        this.f82345a = nVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements p<pk.h, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final n<pk.h, pk.h> f82346a = new n<>(500);

        @Override // pk.p
        @NonNull
        public o<pk.h, InputStream> build(s sVar) {
            return new b(this.f82346a);
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
