package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;
import com.bumptech.glide.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import fl.h;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import pk.a;
import pk.b;
import pk.d;
import pk.e;
import pk.g;
import pk.l;
import pk.p;
import pk.t;
import pk.v;
import pk.w;
import pk.x;
import pk.y;
import pk.z;
import qk.b;
import qk.d;
import qk.e;
import qk.f;
import qk.i;
import sk.a1;
import sk.d1;
import sk.s0;
import sk.u;
import sk.u0;
import sk.w0;
import tk.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements h.b<Registry> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f28702a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f28703b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f28704c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ zk.a f28705d;

        public a(c cVar, List list, zk.a aVar) {
            this.f28703b = cVar;
            this.f28704c = list;
            this.f28705d = aVar;
        }

        @Override // fl.h.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f28702a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            Trace.beginSection("Glide registry");
            this.f28702a = true;
            try {
                return i.a(this.f28703b, this.f28704c, this.f28705d);
            } finally {
                this.f28702a = false;
                Trace.endSection();
            }
        }
    }

    public static Registry a(c cVar, List<zk.c> list, @Nullable zk.a aVar) {
        lk.e h11 = cVar.h();
        lk.b g11 = cVar.g();
        Context applicationContext = cVar.k().getApplicationContext();
        f g12 = cVar.k().g();
        Registry registry = new Registry();
        b(applicationContext, registry, h11, g11, g12);
        c(applicationContext, cVar, registry, list, aVar);
        return registry;
    }

    public static void b(Context context, Registry registry, lk.e eVar, lk.b bVar, f fVar) {
        ik.f kVar;
        ik.f cVar;
        String str;
        Registry registry2;
        registry.t(new DefaultImageHeaderParser());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            registry.t(new u());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> g11 = registry.g();
        wk.a aVar = new wk.a(context, g11, eVar, bVar);
        ik.f<ParcelFileDescriptor, Bitmap> m11 = d1.m(eVar);
        com.bumptech.glide.load.resource.bitmap.a aVar2 = new com.bumptech.glide.load.resource.bitmap.a(registry.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (i11 < 28 || !fVar.b(d.c.class)) {
            kVar = new sk.k(aVar2);
            cVar = new com.bumptech.glide.load.resource.bitmap.c(aVar2, bVar);
        } else {
            cVar = new s0();
            kVar = new sk.l();
        }
        if (i11 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, uk.e.f(g11, bVar));
            registry.e("Animation", ByteBuffer.class, Drawable.class, uk.e.a(g11, bVar));
        }
        uk.k kVar2 = new uk.k(context);
        sk.e eVar2 = new sk.e(bVar);
        xk.a aVar3 = new xk.a();
        xk.d dVar = new xk.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new pk.c()).a(InputStream.class, new v(bVar)).e(Registry.f28624m, ByteBuffer.class, Bitmap.class, kVar).e(Registry.f28624m, InputStream.class, Bitmap.class, cVar);
        if (ParcelFileDescriptorRewinder.b()) {
            str = "Animation";
            registry.e(Registry.f28624m, ParcelFileDescriptor.class, Bitmap.class, new u0(aVar2));
        } else {
            str = "Animation";
        }
        registry.e(Registry.f28624m, AssetFileDescriptor.class, Bitmap.class, d1.c(eVar));
        String str2 = str;
        registry.e(Registry.f28624m, ParcelFileDescriptor.class, Bitmap.class, m11).d(Bitmap.class, Bitmap.class, x.a.a()).e(Registry.f28624m, Bitmap.class, Bitmap.class, new a1()).b(Bitmap.class, eVar2).e(Registry.f28625n, ByteBuffer.class, BitmapDrawable.class, new sk.a(resources, kVar)).e(Registry.f28625n, InputStream.class, BitmapDrawable.class, new sk.a(resources, cVar)).e(Registry.f28625n, ParcelFileDescriptor.class, BitmapDrawable.class, new sk.a(resources, m11)).b(BitmapDrawable.class, new sk.b(eVar, eVar2)).e(str2, InputStream.class, wk.c.class, new wk.j(g11, aVar, bVar)).e(str2, ByteBuffer.class, wk.c.class, aVar).b(wk.c.class, new wk.d()).d(hk.a.class, hk.a.class, x.a.a()).e(Registry.f28624m, hk.a.class, Bitmap.class, new wk.h(eVar)).c(Uri.class, Drawable.class, kVar2).c(Uri.class, Bitmap.class, new w0(kVar2, eVar)).u(new a.C1206a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new vk.a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, x.a.a()).u(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.b()) {
            registry2 = registry;
            registry2.u(new ParcelFileDescriptorRewinder.a());
        } else {
            registry2 = registry;
        }
        p<Integer, InputStream> e11 = pk.f.e(context);
        p<Integer, AssetFileDescriptor> a11 = pk.f.a(context);
        p<Integer, Drawable> c11 = pk.f.c(context);
        Class cls = Integer.TYPE;
        registry2.d(cls, InputStream.class, e11).d(Integer.class, InputStream.class, e11).d(cls, AssetFileDescriptor.class, a11).d(Integer.class, AssetFileDescriptor.class, a11).d(cls, Drawable.class, c11).d(Integer.class, Drawable.class, c11).d(Uri.class, InputStream.class, pk.u.d(context)).d(Uri.class, AssetFileDescriptor.class, pk.u.c(context));
        t.d dVar2 = new t.d(resources);
        t.a aVar4 = new t.a(resources);
        t.c cVar2 = new t.c(resources);
        registry2.d(Integer.class, Uri.class, dVar2).d(cls, Uri.class, dVar2).d(Integer.class, AssetFileDescriptor.class, aVar4).d(cls, AssetFileDescriptor.class, aVar4).d(Integer.class, InputStream.class, cVar2).d(cls, InputStream.class, cVar2);
        registry2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new w.c()).d(String.class, ParcelFileDescriptor.class, new w.b()).d(String.class, AssetFileDescriptor.class, new w.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new d.a(context)).d(Uri.class, InputStream.class, new e.a(context));
        if (i11 >= 29) {
            registry2.d(Uri.class, InputStream.class, new f.c(context));
            registry2.d(Uri.class, ParcelFileDescriptor.class, new f.b(context));
        }
        boolean b11 = fVar.b(d.g.class);
        registry2.d(Uri.class, InputStream.class, new y.d(contentResolver, b11)).d(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver, b11)).d(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver, b11)).d(Uri.class, InputStream.class, new z.a()).d(URL.class, InputStream.class, new i.a()).d(Uri.class, File.class, new l.a(context)).d(pk.h.class, InputStream.class, new b.a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, x.a.a()).d(Drawable.class, Drawable.class, x.a.a()).c(Drawable.class, Drawable.class, new uk.l()).x(Bitmap.class, BitmapDrawable.class, new xk.b(resources)).x(Bitmap.class, byte[].class, aVar3).x(Drawable.class, byte[].class, new xk.c(eVar, aVar3, dVar)).x(wk.c.class, byte[].class, dVar);
        ik.f<ByteBuffer, Bitmap> d11 = d1.d(eVar);
        registry2.c(ByteBuffer.class, Bitmap.class, d11);
        registry2.c(ByteBuffer.class, BitmapDrawable.class, new sk.a(resources, d11));
    }

    public static void c(Context context, c cVar, Registry registry, List<zk.c> list, @Nullable zk.a aVar) {
        for (zk.c cVar2 : list) {
            try {
                cVar2.registerComponents(context, cVar, registry);
            } catch (AbstractMethodError e11) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + cVar2.getClass().getName(), e11);
            }
        }
        if (aVar != null) {
            aVar.registerComponents(context, cVar, registry);
        }
    }

    public static h.b<Registry> d(c cVar, List<zk.c> list, @Nullable zk.a aVar) {
        return new a(cVar, list, aVar);
    }
}
