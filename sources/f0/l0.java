package f0;

import android.content.Context;
import f0.k0;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ImageSources")
/* loaded from: classes3.dex */
public final class l0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f50299a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f50299a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final File invoke() {
            return u0.l.u(this.f50299a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f50300a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f50300a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final File invoke() {
            return u0.l.u(this.f50300a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f50301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.f50301a = file;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final File invoke() {
            return this.f50301a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f50302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file) {
            super(0);
            this.f50302a = file;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final File invoke() {
            return this.f50302a;
        }
    }

    @w00.j(name = "create")
    @m80.k
    public static final k0 a(@m80.k l60.m mVar, @m80.k Context context) {
        return new n0(mVar, new a(context), null);
    }

    @w00.j(name = "create")
    @c0.a
    @m80.k
    public static final k0 b(@m80.k l60.m mVar, @m80.k Context context, @m80.l k0.a aVar) {
        return new n0(mVar, new b(context), aVar);
    }

    @w00.j(name = "create")
    @m80.k
    public static final k0 c(@m80.k l60.m mVar, @m80.k File file) {
        return new n0(mVar, new c(file), null);
    }

    @w00.j(name = "create")
    @c0.a
    @m80.k
    public static final k0 d(@m80.k l60.m mVar, @m80.k File file, @m80.l k0.a aVar) {
        return new n0(mVar, new d(file), aVar);
    }

    @w00.j(name = "create")
    @m80.k
    public static final k0 e(@m80.k okio.f fVar, @m80.k okio.b bVar, @m80.l String str, @m80.l Closeable closeable) {
        return new m(fVar, bVar, str, closeable, null);
    }

    @w00.j(name = "create")
    @c0.a
    @m80.k
    public static final k0 f(@m80.k okio.f fVar, @m80.k okio.b bVar, @m80.l String str, @m80.l Closeable closeable, @m80.l k0.a aVar) {
        return new m(fVar, bVar, str, closeable, aVar);
    }

    public static /* synthetic */ k0 g(l60.m mVar, Context context, k0.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        return b(mVar, context, aVar);
    }

    public static /* synthetic */ k0 h(l60.m mVar, File file, k0.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        return d(mVar, file, aVar);
    }

    public static /* synthetic */ k0 i(okio.f fVar, okio.b bVar, String str, Closeable closeable, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = okio.b.f77535b;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            closeable = null;
        }
        return e(fVar, bVar, str, closeable);
    }

    public static /* synthetic */ k0 j(okio.f fVar, okio.b bVar, String str, Closeable closeable, k0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = okio.b.f77535b;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            closeable = null;
        }
        if ((i11 & 16) != 0) {
            aVar = null;
        }
        return f(fVar, bVar, str, closeable, aVar);
    }
}
