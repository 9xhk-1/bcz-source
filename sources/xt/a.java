package xt;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import yt.b;
import yt.c;
import yt.d;
import yt.e;
import yt.f;
import yt.g;
import yt.h;
import yt.i;
import yt.j;
import yt.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public b f98321a;

    /* renamed from: b, reason: collision with root package name */
    public c f98322b;

    /* renamed from: c, reason: collision with root package name */
    public g f98323c;

    /* renamed from: d, reason: collision with root package name */
    public k f98324d;

    /* renamed from: e, reason: collision with root package name */
    public h f98325e;

    /* renamed from: f, reason: collision with root package name */
    public e f98326f;

    /* renamed from: g, reason: collision with root package name */
    public j f98327g;

    /* renamed from: h, reason: collision with root package name */
    public d f98328h;

    /* renamed from: i, reason: collision with root package name */
    public i f98329i;

    /* renamed from: j, reason: collision with root package name */
    public f f98330j;

    /* renamed from: k, reason: collision with root package name */
    public int f98331k;

    /* renamed from: l, reason: collision with root package name */
    public int f98332l;

    /* renamed from: m, reason: collision with root package name */
    public int f98333m;

    public a(@NonNull wt.a aVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f98321a = new b(paint, aVar);
        this.f98322b = new c(paint, aVar);
        this.f98323c = new g(paint, aVar);
        this.f98324d = new k(paint, aVar);
        this.f98325e = new h(paint, aVar);
        this.f98326f = new e(paint, aVar);
        this.f98327g = new j(paint, aVar);
        this.f98328h = new d(paint, aVar);
        this.f98329i = new i(paint, aVar);
        this.f98330j = new f(paint, aVar);
    }

    public void a(@NonNull Canvas canvas, boolean z11) {
        if (this.f98322b != null) {
            this.f98321a.a(canvas, this.f98331k, z11, this.f98332l, this.f98333m);
        }
    }

    public void b(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        c cVar = this.f98322b;
        if (cVar != null) {
            cVar.a(canvas, bVar, this.f98331k, this.f98332l, this.f98333m);
        }
    }

    public void c(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        d dVar = this.f98328h;
        if (dVar != null) {
            dVar.a(canvas, bVar, this.f98332l, this.f98333m);
        }
    }

    public void d(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        e eVar = this.f98326f;
        if (eVar != null) {
            eVar.a(canvas, bVar, this.f98331k, this.f98332l, this.f98333m);
        }
    }

    public void e(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        g gVar = this.f98323c;
        if (gVar != null) {
            gVar.a(canvas, bVar, this.f98331k, this.f98332l, this.f98333m);
        }
    }

    public void f(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        f fVar = this.f98330j;
        if (fVar != null) {
            fVar.a(canvas, bVar, this.f98331k, this.f98332l, this.f98333m);
        }
    }

    public void g(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        h hVar = this.f98325e;
        if (hVar != null) {
            hVar.a(canvas, bVar, this.f98332l, this.f98333m);
        }
    }

    public void h(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        i iVar = this.f98329i;
        if (iVar != null) {
            iVar.a(canvas, bVar, this.f98331k, this.f98332l, this.f98333m);
        }
    }

    public void i(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        j jVar = this.f98327g;
        if (jVar != null) {
            jVar.a(canvas, bVar, this.f98332l, this.f98333m);
        }
    }

    public void j(@NonNull Canvas canvas, @NonNull rt.b bVar) {
        k kVar = this.f98324d;
        if (kVar != null) {
            kVar.a(canvas, bVar, this.f98332l, this.f98333m);
        }
    }

    public void k(int i11, int i12, int i13) {
        this.f98331k = i11;
        this.f98332l = i12;
        this.f98333m = i13;
    }
}
