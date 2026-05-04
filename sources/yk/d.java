package yk;

import android.content.Context;
import androidx.annotation.NonNull;
import yk.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f100165a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f100166b;

    public d(@NonNull Context context, @NonNull b.a aVar) {
        this.f100165a = context.getApplicationContext();
        this.f100166b = aVar;
    }

    public final void a() {
        s.a(this.f100165a).d(this.f100166b);
    }

    public final void b() {
        s.a(this.f100165a).f(this.f100166b);
    }

    @Override // yk.l
    public void onStart() {
        a();
    }

    @Override // yk.l
    public void onStop() {
        b();
    }

    @Override // yk.l
    public void onDestroy() {
    }
}
