package i0;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import f0.l0;
import i0.i;
import java.io.File;
import okio.f;
import r00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final File f60026a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements i.a<File> {
        @Override // i0.i.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k File file, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            return new j(file);
        }
    }

    public j(@m80.k File file) {
        this.f60026a = file;
    }

    @Override // i0.i
    @m80.l
    public Object b(@m80.k j00.c<? super h> cVar) {
        return new m(l0.i(f.a.g(okio.f.f77539b, this.f60026a, false, 1, null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(o.f0(this.f60026a)), DataSource.DISK);
    }
}
