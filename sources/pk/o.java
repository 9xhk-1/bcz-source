package pk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface o<Model, Data> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final ik.b f80728a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ik.b> f80729b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f80730c;

        public a(@NonNull ik.b bVar, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this(bVar, Collections.EMPTY_LIST, dVar);
        }

        public a(@NonNull ik.b bVar, @NonNull List<ik.b> list, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this.f80728a = (ik.b) fl.m.e(bVar);
            this.f80729b = (List) fl.m.e(list);
            this.f80730c = (com.bumptech.glide.load.data.d) fl.m.e(dVar);
        }
    }

    @Nullable
    a<Data> buildLoadData(@NonNull Model model, int i11, int i12, @NonNull ik.e eVar);

    boolean handles(@NonNull Model model);
}
