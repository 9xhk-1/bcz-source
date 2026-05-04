package i0;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import coil.decode.DataSource;
import en.r;
import f0.l0;
import i0.i;
import ix.l1;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.r0;
import q0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContentUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentUriFetcher.kt\ncoil/fetch/ContentUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Uri f60019a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f60020b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements i.a<Uri> {
        @Override // i0.i.a
        @m80.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k Uri uri, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            if (c(uri)) {
                return new e(uri, jVar);
            }
            return null;
        }

        public final boolean c(Uri uri) {
            return g0.g(uri.getScheme(), "content");
        }
    }

    public e(@m80.k Uri uri, @m80.k o0.j jVar) {
        this.f60019a = uri;
        this.f60020b = jVar;
    }

    @VisibleForTesting
    public final boolean a(@m80.k Uri uri) {
        return g0.g(uri.getAuthority(), "com.android.contacts") && g0.g(uri.getLastPathSegment(), "display_photo");
    }

    @Override // i0.i
    @m80.l
    public Object b(@m80.k j00.c<? super h> cVar) {
        InputStream openInputStream;
        AssetFileDescriptor openTypedAssetFile;
        ContentResolver contentResolver = this.f60020b.g().getContentResolver();
        if (a(this.f60019a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f60019a, r.f50027a);
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f60019a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.f60019a)) {
            openInputStream = contentResolver.openInputStream(this.f60019a);
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f60019a + "'.").toString());
            }
        } else {
            openTypedAssetFile = contentResolver.openTypedAssetFile(this.f60019a, "image/*", d(), null);
            openInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f60019a + "'.").toString());
            }
        }
        return new m(l0.b(r0.e(r0.v(openInputStream)), this.f60020b.g(), new f0.e(this.f60019a)), contentResolver.getType(this.f60019a), DataSource.DISK);
    }

    @VisibleForTesting
    public final boolean c(@m80.k Uri uri) {
        List<String> pathSegments;
        int size;
        return g0.g(uri.getAuthority(), l1.a.f62928f) && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && g0.g(pathSegments.get(size + (-3)), "audio") && g0.g(pathSegments.get(size + (-2)), "albums");
    }

    public final Bundle d() {
        q0.c f11 = this.f60020b.p().f();
        c.a aVar = f11 instanceof c.a ? (c.a) f11 : null;
        if (aVar == null) {
            return null;
        }
        int i11 = aVar.f81358a;
        q0.c e11 = this.f60020b.p().e();
        c.a aVar2 = e11 instanceof c.a ? (c.a) e11 : null;
        if (aVar2 == null) {
            return null;
        }
        int i12 = aVar2.f81358a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i11, i12));
        return bundle;
    }
}
