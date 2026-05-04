package hc;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import com.baicizhan.common.picparser.ParserType;
import com.bumptech.glide.j;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static Application f59158b;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f59160d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f59157a = new c();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static ParserType f59159c = ParserType.GLIDE;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c0 f59161e = e0.c(new x00.a() { // from class: hc.a
        @Override // x00.a
        public final Object invoke() {
            Picasso r11;
            r11 = c.r();
            return r11;
        }
    });

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c0 f59162f = e0.c(new x00.a() { // from class: hc.b
        @Override // x00.a
        public final Object invoke() {
            com.bumptech.glide.k f11;
            f11 = c.f();
            return f11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59163a;

        static {
            int[] iArr = new int[ParserType.values().length];
            try {
                iArr[ParserType.GLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParserType.PICASSO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59163a = iArr;
        }
    }

    public static final com.bumptech.glide.k f() {
        f59157a.c();
        Application application = f59158b;
        g0.m(application);
        return com.bumptech.glide.c.F(application.getApplicationContext());
    }

    @o
    public static final void g(@k Application context, @k x00.l<? super Picasso.b, g2> handler) {
        g0.p(context, "context");
        g0.p(handler, "handler");
        h(context, handler, f59159c);
    }

    @o
    public static final void h(@k Application context, @k x00.l<? super Picasso.b, g2> handler, @k ParserType type) {
        g0.p(context, "context");
        g0.p(handler, "handler");
        g0.p(type, "type");
        if (f59160d) {
            return;
        }
        f59158b = context;
        f59159c = type;
        int i11 = a.f59163a[type.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Picasso.b bVar = new Picasso.b(context);
            handler.invoke(bVar);
            Picasso.B(bVar.b());
        }
        f59160d = true;
    }

    @o
    @k
    public static final ic.c i(@DrawableRes int i11) {
        int i12 = a.f59163a[f59159c.ordinal()];
        if (i12 == 1) {
            j<Drawable> load = f59157a.d().load(Integer.valueOf(i11));
            g0.o(load, "load(...)");
            return new ic.b(load);
        }
        int i13 = 2;
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z r11 = f59157a.e().r(i11);
        g0.o(r11, "load(...)");
        return new ic.d(r11, false, i13, null);
    }

    @o
    @k
    public static final ic.c j(@k Uri uri) {
        g0.p(uri, "uri");
        int i11 = a.f59163a[f59159c.ordinal()];
        if (i11 == 1) {
            j<Drawable> load = f59157a.d().load(uri);
            g0.o(load, "load(...)");
            return new ic.b(load);
        }
        int i12 = 2;
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z s11 = f59157a.e().s(uri);
        g0.o(s11, "load(...)");
        return new ic.d(s11, false, i12, null);
    }

    @o
    @k
    public static final ic.c k(@k File file) {
        g0.p(file, "file");
        int i11 = a.f59163a[f59159c.ordinal()];
        if (i11 == 1) {
            j<Drawable> load = f59157a.d().load(file);
            g0.o(load, "load(...)");
            return new ic.b(load);
        }
        int i12 = 2;
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z t11 = f59157a.e().t(file);
        g0.o(t11, "load(...)");
        return new ic.d(t11, false, i12, null);
    }

    @o
    @k
    public static final ic.c l(@k String url) {
        g0.p(url, "url");
        Uri parse = Uri.parse(url);
        g0.o(parse, "parse(...)");
        return j(parse);
    }

    @o
    @k
    public static final ic.c m(@DrawableRes int i11) {
        int i12 = a.f59163a[f59159c.ordinal()];
        if (i12 == 1) {
            j<Bitmap> load = f59157a.d().asBitmap().load(Integer.valueOf(i11));
            g0.o(load, "load(...)");
            return new ic.b(load);
        }
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z r11 = f59157a.e().r(i11);
        g0.o(r11, "load(...)");
        return new ic.d(r11, true);
    }

    @o
    @k
    public static final ic.c n(@k File file) {
        g0.p(file, "file");
        return o(file, f59159c);
    }

    @o
    @k
    public static final ic.c o(@k File file, @k ParserType parserType) {
        g0.p(file, "file");
        g0.p(parserType, "parserType");
        int i11 = a.f59163a[parserType.ordinal()];
        if (i11 == 1) {
            j<Bitmap> load = f59157a.d().asBitmap().load(file);
            g0.o(load, "load(...)");
            return new ic.b(load);
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z t11 = f59157a.e().t(file);
        g0.o(t11, "load(...)");
        return new ic.d(t11, true);
    }

    @o
    @k
    public static final ic.c p(@k String url) {
        g0.p(url, "url");
        return q(url, f59159c);
    }

    @o
    @k
    public static final ic.c q(@k String url, @k ParserType parserType) {
        g0.p(url, "url");
        g0.p(parserType, "parserType");
        int i11 = a.f59163a[parserType.ordinal()];
        if (i11 == 1) {
            j<Bitmap> load = f59157a.d().asBitmap().load(url);
            g0.o(load, "load(...)");
            return new ic.b(load);
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        z u11 = f59157a.e().u(url);
        g0.o(u11, "load(...)");
        return new ic.d(u11, true);
    }

    public static final Picasso r() {
        f59157a.c();
        return Picasso.k();
    }

    public final void c() {
        if (!f59160d) {
            throw new RuntimeException("PicParser.init() must be called before any use!");
        }
    }

    public final com.bumptech.glide.k d() {
        return (com.bumptech.glide.k) f59162f.getValue();
    }

    public final Picasso e() {
        return (Picasso) f59161e.getValue();
    }
}
