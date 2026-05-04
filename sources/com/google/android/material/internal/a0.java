package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class a0 {

    /* renamed from: c, reason: collision with root package name */
    public float f31506c;

    /* renamed from: d, reason: collision with root package name */
    public float f31507d;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public sn.d f31510g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f31504a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final sn.f f31505b = new a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f31508e = true;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public WeakReference<b> f31509f = new WeakReference<>(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends sn.f {
        public a() {
        }

        @Override // sn.f
        public void a(int i11) {
            a0.this.f31508e = true;
            b bVar = (b) a0.this.f31509f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // sn.f
        public void b(@NonNull Typeface typeface, boolean z11) {
            if (z11) {
                return;
            }
            a0.this.f31508e = true;
            b bVar = (b) a0.this.f31509f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public a0(@Nullable b bVar) {
        k(bVar);
    }

    public final float c(@Nullable String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f31504a.getFontMetrics().ascent);
    }

    public final float d(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f31504a.measureText(charSequence, 0, charSequence.length());
    }

    @Nullable
    public sn.d e() {
        return this.f31510g;
    }

    public float f(@Nullable String str) {
        if (!this.f31508e) {
            return this.f31507d;
        }
        j(str);
        return this.f31507d;
    }

    @NonNull
    public TextPaint g() {
        return this.f31504a;
    }

    public float h(String str) {
        if (!this.f31508e) {
            return this.f31506c;
        }
        j(str);
        return this.f31506c;
    }

    public boolean i() {
        return this.f31508e;
    }

    public final void j(String str) {
        this.f31506c = d(str);
        this.f31507d = c(str);
        this.f31508e = false;
    }

    public void k(@Nullable b bVar) {
        this.f31509f = new WeakReference<>(bVar);
    }

    public void l(@Nullable sn.d dVar, Context context) {
        if (this.f31510g != dVar) {
            this.f31510g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f31504a, this.f31505b);
                b bVar = this.f31509f.get();
                if (bVar != null) {
                    this.f31504a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f31504a, this.f31505b);
                this.f31508e = true;
            }
            b bVar2 = this.f31509f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void m(boolean z11) {
        this.f31508e = z11;
    }

    public void n(boolean z11) {
        this.f31508e = z11;
    }

    public void o(Context context) {
        this.f31510g.n(context, this.f31504a, this.f31505b);
    }
}
