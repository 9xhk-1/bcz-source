package ut;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import vt.b;
import vt.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public wt.a f92421a;

    /* renamed from: b, reason: collision with root package name */
    public b f92422b;

    /* renamed from: c, reason: collision with root package name */
    public c f92423c;

    /* renamed from: d, reason: collision with root package name */
    public vt.a f92424d;

    public a() {
        wt.a aVar = new wt.a();
        this.f92421a = aVar;
        this.f92422b = new b(aVar);
        this.f92423c = new c();
        this.f92424d = new vt.a(this.f92421a);
    }

    public void a(@NonNull Canvas canvas) {
        this.f92422b.a(canvas);
    }

    @NonNull
    public wt.a b() {
        if (this.f92421a == null) {
            this.f92421a = new wt.a();
        }
        return this.f92421a;
    }

    public void c(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this.f92424d.c(context, attributeSet);
    }

    public Pair<Integer, Integer> d(int i11, int i12) {
        return this.f92423c.a(this.f92421a, i11, i12);
    }

    public void e(@Nullable b.InterfaceC1271b interfaceC1271b) {
        this.f92422b.e(interfaceC1271b);
    }

    public void f(@Nullable MotionEvent motionEvent) {
        this.f92422b.f(motionEvent);
    }

    public void g(@Nullable rt.b bVar) {
        this.f92422b.g(bVar);
    }
}
