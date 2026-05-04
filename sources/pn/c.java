package pn;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final d f80978a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final pn.b f80979b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f80980c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(33)
    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public OnBackInvokedCallback f80981a;

        public b() {
        }

        @Override // pn.c.d
        @DoNotInline
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f80981a);
            this.f80981a = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r3 = r3.findOnBackInvokedDispatcher();
         */
        @Override // pn.c.d
        @androidx.annotation.DoNotInline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(@androidx.annotation.NonNull pn.b r2, @androidx.annotation.NonNull android.view.View r3, boolean r4) {
            /*
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.f80981a
                if (r0 == 0) goto L5
                goto Lb
            L5:
                android.window.OnBackInvokedDispatcher r3 = pn.d.a(r3)
                if (r3 != 0) goto Lc
            Lb:
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.c(r2)
                r1.f80981a = r2
                if (r4 == 0) goto L18
                r4 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r4 = 0
            L19:
                androidx.appcompat.app.i.a(r3, r4, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pn.c.b.b(pn.b, android.view.View, boolean):void");
        }

        public OnBackInvokedCallback c(@NonNull final pn.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: pn.e
                public final void onBackInvoked() {
                    b.this.d();
                }
            };
        }

        public boolean d() {
            return this.f80981a != null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    /* renamed from: pn.c$c, reason: collision with other inner class name */
    public static class C0993c extends b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: pn.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ pn.b f80982a;

            public a(pn.b bVar) {
                this.f80982a = bVar;
            }

            public void onBackCancelled() {
                if (C0993c.this.d()) {
                    this.f80982a.f();
                }
            }

            public void onBackInvoked() {
                this.f80982a.d();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (C0993c.this.d()) {
                    this.f80982a.c(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (C0993c.this.d()) {
                    this.f80982a.b(new BackEventCompat(backEvent));
                }
            }
        }

        public C0993c() {
            super();
        }

        @Override // pn.c.b
        public OnBackInvokedCallback c(@NonNull pn.b bVar) {
            return new a(bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(@NonNull View view);

        void b(@NonNull pn.b bVar, @NonNull View view, boolean z11);
    }

    public <T extends View & pn.b> c(@NonNull T t11) {
        this(t11, t11);
    }

    @Nullable
    public static d a() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            return new C0993c();
        }
        if (i11 >= 33) {
            return new b();
        }
        return null;
    }

    public boolean b() {
        return this.f80978a != null;
    }

    public void c() {
        d(false);
    }

    public final void d(boolean z11) {
        d dVar = this.f80978a;
        if (dVar != null) {
            dVar.b(this.f80979b, this.f80980c, z11);
        }
    }

    public void e() {
        d(true);
    }

    public void f() {
        d dVar = this.f80978a;
        if (dVar != null) {
            dVar.a(this.f80980c);
        }
    }

    public c(@NonNull pn.b bVar, @NonNull View view) {
        this.f80978a = a();
        this.f80979b = bVar;
        this.f80980c = view;
    }
}
