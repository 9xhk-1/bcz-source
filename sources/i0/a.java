package i0;

import a00.r0;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import f0.l0;
import i0.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Uri f60013a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f60014b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: i0.a$a, reason: collision with other inner class name */
    public static final class C0686a implements i.a<Uri> {
        @Override // i0.i.a
        @m80.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k Uri uri, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            if (u0.l.z(uri)) {
                return new a(uri, jVar);
            }
            return null;
        }
    }

    public a(@m80.k Uri uri, @m80.k o0.j jVar) {
        this.f60013a = uri;
        this.f60014b = jVar;
    }

    @Override // i0.i
    @m80.l
    public Object b(@m80.k j00.c<? super h> cVar) {
        String r32 = r0.r3(r0.g2(this.f60013a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new m(l0.b(l60.r0.e(l60.r0.v(this.f60014b.g().getAssets().open(r32))), this.f60014b.g(), new f0.a(r32)), u0.l.q(MimeTypeMap.getSingleton(), r32), DataSource.DISK);
    }
}
