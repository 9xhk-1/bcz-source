package i0;

import a00.r0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import f0.l0;
import f0.m0;
import i0.i;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import u0.p;
import u30.e0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResourceUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 4 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,100:1\n1#2:101\n50#3:102\n28#4:103\n*S KotlinDebug\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n*L\n58#1:102\n58#1:103\n*E\n"})
/* loaded from: classes3.dex */
public final class l implements i {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f60048c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f60049d = "text/xml";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Uri f60050a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f60051b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements i.a<Uri> {
        private final boolean c(Uri uri) {
            return g0.g(uri.getScheme(), "android.resource");
        }

        @Override // i0.i.a
        @m80.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k Uri uri, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            if (c(uri)) {
                return new l(uri, jVar);
            }
            return null;
        }
    }

    public l(@m80.k Uri uri, @m80.k o0.j jVar) {
        this.f60050a = uri;
        this.f60051b = jVar;
    }

    public final Void a(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // i0.i
    @m80.l
    public Object b(@m80.k j00.c<? super h> cVar) {
        Integer p12;
        String authority = this.f60050a.getAuthority();
        if (authority != null) {
            if (k0.O3(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) r0.A3(this.f60050a.getPathSegments());
                if (str == null || (p12 = e0.p1(str)) == null) {
                    a(this.f60050a);
                    throw new KotlinNothingValueException();
                }
                int intValue = p12.intValue();
                Context g11 = this.f60051b.g();
                Resources resources = g0.g(authority, g11.getPackageName()) ? g11.getResources() : g11.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String q11 = u0.l.q(MimeTypeMap.getSingleton(), charSequence.subSequence(k0.X3(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!g0.g(q11, f60049d)) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(l0.b(l60.r0.e(l60.r0.v(resources.openRawResource(intValue, typedValue2))), g11, new m0(authority, intValue, typedValue2.density)), q11, DataSource.DISK);
                }
                Drawable a11 = g0.g(authority, g11.getPackageName()) ? u0.d.a(g11, intValue) : u0.d.d(g11, resources, intValue);
                boolean D = u0.l.D(a11);
                if (D) {
                    a11 = new BitmapDrawable(g11.getResources(), p.f91463a.a(a11, this.f60051b.f(), this.f60051b.p(), this.f60051b.o(), this.f60051b.c()));
                }
                return new g(a11, D, DataSource.DISK);
            }
        }
        a(this.f60050a);
        throw new KotlinNothingValueException();
    }
}
