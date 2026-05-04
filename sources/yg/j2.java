package yg;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j2 extends BaseObservable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f100033b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f100034c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f100035d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f100036e = -2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f100037f = -3;

    /* renamed from: a, reason: collision with root package name */
    public int f100038a = 0;

    @Bindable
    public int b() {
        return this.f100038a;
    }

    public void c(int state) {
        this.f100038a = state;
        notifyPropertyChanged(78);
    }
}
