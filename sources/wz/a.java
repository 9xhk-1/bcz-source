package wz;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import xz.c;
import xz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f96969a = "a";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: wz.a$a, reason: collision with other inner class name */
    public static class C1302a {

        /* renamed from: a, reason: collision with root package name */
        public Context f96970a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f96971b;

        /* renamed from: c, reason: collision with root package name */
        public xz.b f96972c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f96973d;

        /* renamed from: e, reason: collision with root package name */
        public c.b f96974e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: wz.a$a$a, reason: collision with other inner class name */
        public class C1303a implements c.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ImageView f96975a;

            public C1303a(ImageView imageView) {
                this.f96975a = imageView;
            }

            @Override // xz.c.b
            public void a(BitmapDrawable bitmapDrawable) {
                if (C1302a.this.f96974e == null) {
                    this.f96975a.setImageDrawable(bitmapDrawable);
                } else {
                    C1302a.this.f96974e.a(bitmapDrawable);
                }
            }
        }

        public C1302a(Context context, Bitmap bitmap, xz.b bVar, boolean z11, c.b bVar2) {
            this.f96970a = context;
            this.f96971b = bitmap;
            this.f96972c = bVar;
            this.f96973d = z11;
            this.f96974e = bVar2;
        }

        public void b(ImageView imageView) {
            this.f96972c.f98675a = this.f96971b.getWidth();
            this.f96972c.f98676b = this.f96971b.getHeight();
            if (this.f96973d) {
                new xz.c(imageView.getContext(), this.f96971b, this.f96972c, new C1303a(imageView)).f();
            } else {
                imageView.setImageDrawable(new BitmapDrawable(this.f96970a.getResources(), xz.a.a(imageView.getContext(), this.f96971b, this.f96972c)));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public View f96977a;

        /* renamed from: b, reason: collision with root package name */
        public Context f96978b;

        /* renamed from: c, reason: collision with root package name */
        public xz.b f96979c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f96980d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f96981e;

        /* renamed from: f, reason: collision with root package name */
        public int f96982f = 300;

        /* renamed from: g, reason: collision with root package name */
        public c.b f96983g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: wz.a$b$a, reason: collision with other inner class name */
        public class C1304a implements c.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f96984a;

            public C1304a(ViewGroup viewGroup) {
                this.f96984a = viewGroup;
            }

            @Override // xz.c.b
            public void a(BitmapDrawable bitmapDrawable) {
                b.this.c(this.f96984a, bitmapDrawable);
                if (b.this.f96983g != null) {
                    b.this.f96983g.a(bitmapDrawable);
                }
            }
        }

        public b(Context context) {
            this.f96978b = context;
            View view = new View(context);
            this.f96977a = view;
            view.setTag(a.f96969a);
            this.f96979c = new xz.b();
        }

        public final void c(ViewGroup viewGroup, Drawable drawable) {
            d.c(this.f96977a, drawable);
            viewGroup.addView(this.f96977a);
            if (this.f96981e) {
                d.a(this.f96977a, this.f96982f);
            }
        }

        public b d() {
            this.f96981e = true;
            return this;
        }

        public b e(int i11) {
            this.f96981e = true;
            this.f96982f = i11;
            return this;
        }

        public b f() {
            this.f96980d = true;
            return this;
        }

        public b g(c.b bVar) {
            this.f96980d = true;
            this.f96983g = bVar;
            return this;
        }

        public c h(View view) {
            return new c(this.f96978b, view, this.f96979c, this.f96980d, this.f96983g);
        }

        public b i(int i11) {
            this.f96979c.f98679e = i11;
            return this;
        }

        public C1302a j(Bitmap bitmap) {
            return new C1302a(this.f96978b, bitmap, this.f96979c, this.f96980d, this.f96983g);
        }

        public void k(ViewGroup viewGroup) {
            this.f96979c.f98675a = viewGroup.getMeasuredWidth();
            this.f96979c.f98676b = viewGroup.getMeasuredHeight();
            if (this.f96980d) {
                new xz.c(viewGroup, this.f96979c, new C1304a(viewGroup)).f();
            } else {
                c(viewGroup, new BitmapDrawable(this.f96978b.getResources(), xz.a.b(viewGroup, this.f96979c)));
            }
        }

        public b l(int i11) {
            this.f96979c.f98677c = i11;
            return this;
        }

        public b m(int i11) {
            this.f96979c.f98678d = i11;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Context f96986a;

        /* renamed from: b, reason: collision with root package name */
        public View f96987b;

        /* renamed from: c, reason: collision with root package name */
        public xz.b f96988c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f96989d;

        /* renamed from: e, reason: collision with root package name */
        public b f96990e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: wz.a$c$a, reason: collision with other inner class name */
        public class C1305a implements c.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ImageView f96991a;

            public C1305a(ImageView imageView) {
                this.f96991a = imageView;
            }

            @Override // xz.c.b
            public void a(BitmapDrawable bitmapDrawable) {
                if (c.this.f96990e == null) {
                    this.f96991a.setImageDrawable(bitmapDrawable);
                } else {
                    c.this.f96990e.a(bitmapDrawable);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface b {
            void a(BitmapDrawable bitmapDrawable);
        }

        public c(Context context, View view, xz.b bVar, boolean z11, b bVar2) {
            this.f96986a = context;
            this.f96987b = view;
            this.f96988c = bVar;
            this.f96989d = z11;
            this.f96990e = bVar2;
        }

        public void b(ImageView imageView) {
            this.f96988c.f98675a = this.f96987b.getMeasuredWidth();
            this.f96988c.f98676b = this.f96987b.getMeasuredHeight();
            if (this.f96989d) {
                new xz.c(this.f96987b, this.f96988c, new C1305a(imageView)).f();
            } else {
                imageView.setImageDrawable(new BitmapDrawable(this.f96986a.getResources(), xz.a.b(this.f96987b, this.f96988c)));
            }
        }
    }

    public static void b(ViewGroup viewGroup) {
        View findViewWithTag = viewGroup.findViewWithTag(f96969a);
        if (findViewWithTag != null) {
            viewGroup.removeView(findViewWithTag);
        }
    }

    public static b c(Context context) {
        return new b(context);
    }
}
