package hs;

import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0684a f59776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59777b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: hs.a$a, reason: collision with other inner class name */
    public interface InterfaceC0684a {
        void a(int sourceId, View callbackArg_0);
    }

    public a(InterfaceC0684a listener, int sourceId) {
        this.f59776a = listener;
        this.f59777b = sourceId;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View callbackArg_0) {
        this.f59776a.a(this.f59777b, callbackArg_0);
    }
}
