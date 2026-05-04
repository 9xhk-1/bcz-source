package mk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: mk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0886a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f73425a = 262144000;

        /* renamed from: b, reason: collision with root package name */
        public static final String f73426b = "image_manager_disk_cache";

        @Nullable
        a build();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        boolean a(@NonNull File file);
    }

    void a(ik.b bVar, b bVar2);

    @Nullable
    File b(ik.b bVar);

    void c(ik.b bVar);

    void clear();
}
