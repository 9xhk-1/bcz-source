package hy;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f59830a = a.f59831a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f59831a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: hy.f$a$a, reason: collision with other inner class name */
        public static final class C0685a implements f {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FileSystem f59832b;

            public C0685a(FileSystem fileSystem) {
                this.f59832b = fileSystem;
            }

            @Override // hy.f
            public Path a(String first, String... more) {
                Path path;
                kotlin.jvm.internal.g0.p(first, "first");
                kotlin.jvm.internal.g0.p(more, "more");
                path = this.f59832b.getPath(first, (String[]) Arrays.copyOf(more, more.length));
                kotlin.jvm.internal.g0.o(path, "getPath(...)");
                return path;
            }
        }

        @m80.k
        public final f a(@m80.k FileSystem fileSystem) {
            kotlin.jvm.internal.g0.p(fileSystem, "<this>");
            return new C0685a(fileSystem);
        }
    }

    @m80.k
    Path a(@m80.k String str, @m80.k String... strArr);
}
