package kl;

import a3.d0;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.e;
import com.badlogic.gdx.utils.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<kl.c> f66858a = new com.badlogic.gdx.utils.a<>();

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<e.a> f66859b = new com.badlogic.gdx.utils.a<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends v1.a {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AssetManager f66860c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f66861d;

        public a(AssetManager assetManager, String str) {
            this.f66860c = assetManager;
            this.f66861d = str;
        }

        @Override // v1.a
        public InputStream F() {
            try {
                return this.f66860c.open(this.f66861d);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends v1.a {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f66862c;

        public b(File file) {
            this.f66862c = file;
        }

        @Override // v1.a
        public InputStream F() {
            try {
                return new FileInputStream(this.f66862c);
            } catch (FileNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        Bitmap load(String str);
    }

    public i(e.c cVar, c cVar2) {
        a.b<e.c.p> it = cVar.a().iterator();
        while (it.hasNext()) {
            e.c.p next = it.next();
            kl.c cVar3 = new kl.c(cVar2.load(next.f12117b.C()));
            next.f12118c = cVar3;
            this.f66858a.a(cVar3);
        }
        a.b<e.c.q> it2 = cVar.b().iterator();
        while (it2.hasNext()) {
            e.c.q next2 = it2.next();
            Texture texture = next2.f12128a.f12118c;
            int i11 = next2.f12130c;
            int i12 = next2.f12131d;
            boolean z11 = next2.f12139l;
            e.a aVar = new e.a(texture, i11, i12, z11 ? next2.f12133f : next2.f12132e, z11 ? next2.f12132e : next2.f12133f);
            aVar.f12071h = next2.f12140m;
            aVar.f12072i = next2.f12129b;
            aVar.f12073j = next2.f12134g;
            aVar.f12074k = next2.f12135h;
            aVar.f12078o = next2.f12137j;
            aVar.f12077n = next2.f12136i;
            aVar.f12079p = next2.f12139l;
            aVar.f12080q = next2.f12138k;
            aVar.f12081r = next2.f12141n;
            aVar.f12082s = next2.f12142o;
            if (next2.f12143p) {
                aVar.a(false, true);
            }
            this.f66859b.a(aVar);
        }
    }

    public static /* synthetic */ Bitmap a(AssetManager assetManager, String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(assetManager.open(str));
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                bufferedInputStream.close();
                return decodeStream;
            } finally {
            }
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public static /* synthetic */ Bitmap b(String str) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(j(new File(str)));
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                bufferedInputStream.close();
                return decodeStream;
            } finally {
            }
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public static /* synthetic */ Bitmap c(URL url, File file, String str) {
        String substring = str.substring(str.lastIndexOf(47) + 1);
        String path = url.getPath();
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(j(nl.b.a(new URL(url.getProtocol(), url.getHost(), url.getPort(), path.substring(0, path.lastIndexOf(47) + 1) + substring), file)));
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                    bufferedInputStream.close();
                    return decodeStream;
                } finally {
                }
            } finally {
                RuntimeException runtimeException = new RuntimeException(th);
            }
        } catch (MalformedURLException th2) {
            throw new RuntimeException(th2);
        }
    }

    public static i e(String str, Context context) {
        e.c cVar = new e.c();
        final AssetManager assets = context.getAssets();
        try {
            cVar.c(new a(assets, str), new v1.a(str).B(), false);
            return new i(cVar, new c() { // from class: kl.f
                @Override // kl.i.c
                public final Bitmap load(String str2) {
                    return i.a(assets, str2);
                }
            });
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public static i f(File file) {
        try {
            return new i(k(file), new c() { // from class: kl.g
                @Override // kl.i.c
                public final Bitmap load(String str) {
                    return i.b(str);
                }
            });
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    public static i g(final URL url, final File file) {
        try {
            return new i(k(nl.b.a(url, file)), new c() { // from class: kl.h
                @Override // kl.i.c
                public final Bitmap load(String str) {
                    return i.c(url, file, str);
                }
            });
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    public static InputStream j(File file) throws Exception {
        Path path;
        InputStream newInputStream;
        if (Build.VERSION.SDK_INT < 26) {
            return new FileInputStream(file);
        }
        path = file.toPath();
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        return newInputStream;
    }

    public static e.c k(File file) {
        e.c cVar = new e.c();
        cVar.c(new b(file), new v1.a(file).B(), false);
        return cVar;
    }

    @d0
    public e.a d(String str) {
        int i11 = this.f66859b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f66859b.get(i12).f12072i.equals(str)) {
                return this.f66859b.get(i12);
            }
        }
        return null;
    }

    public com.badlogic.gdx.utils.a<e.a> h() {
        return this.f66859b;
    }

    public com.badlogic.gdx.utils.a<kl.c> i() {
        return this.f66858a;
    }
}
