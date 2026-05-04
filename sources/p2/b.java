package p2;

import com.badlogic.gdx.Input;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public e f78663c;

    /* renamed from: e, reason: collision with root package name */
    public Integer f78665e;

    /* renamed from: f, reason: collision with root package name */
    public Input.b f78666f;

    /* renamed from: a, reason: collision with root package name */
    public Input.OnscreenKeyboardType f78661a = Input.OnscreenKeyboardType.Default;

    /* renamed from: b, reason: collision with root package name */
    public boolean f78662b = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f78664d = false;

    /* renamed from: g, reason: collision with root package name */
    public String f78667g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f78668h = false;

    /* renamed from: i, reason: collision with root package name */
    public String[] f78669i = null;

    public String[] a() {
        return this.f78669i;
    }

    public Integer b() {
        return this.f78665e;
    }

    public String c() {
        return this.f78667g;
    }

    public e d() {
        return this.f78663c;
    }

    public Input.OnscreenKeyboardType e() {
        return this.f78661a;
    }

    public Input.b f() {
        return this.f78666f;
    }

    public boolean g() {
        return this.f78664d;
    }

    public boolean h() {
        return this.f78662b;
    }

    public boolean i() {
        return this.f78668h;
    }

    public b j(String[] strArr) {
        this.f78669i = strArr;
        return this;
    }

    public b k(Integer num) {
        this.f78665e = num;
        return this;
    }

    public b l(boolean z11) {
        this.f78664d = z11;
        return this;
    }

    public b m(String str) {
        this.f78667g = str;
        return this;
    }

    public b n(boolean z11) {
        this.f78662b = z11;
        return this;
    }

    public b o(boolean z11) {
        this.f78668h = z11;
        return this;
    }

    public b p(e eVar) {
        this.f78663c = eVar;
        return this;
    }

    public b q(Input.OnscreenKeyboardType onscreenKeyboardType) {
        this.f78661a = onscreenKeyboardType;
        return this;
    }

    public b r(Input.b bVar) {
        this.f78666f = bVar;
        return this;
    }

    public void s() {
        Input.OnscreenKeyboardType onscreenKeyboardType = this.f78661a;
        String str = onscreenKeyboardType == null ? "OnscreenKeyboardType needs to be non null" : null;
        if (this.f78663c == null) {
            str = "TextInputWrapper needs to be non null";
        }
        if (this.f78668h && onscreenKeyboardType != Input.OnscreenKeyboardType.Password) {
            str = "ShowPasswordButton only works with OnscreenKeyboardType.Password";
        }
        if (this.f78667g == null) {
            str = "Placeholder needs to be non null";
        }
        String[] strArr = this.f78669i;
        if (strArr != null && onscreenKeyboardType != Input.OnscreenKeyboardType.Default) {
            str = "AutoComplete should only be used with OnscreenKeyboardType.Default";
        }
        if (strArr != null && this.f78664d) {
            str = "AutoComplete shouldn't be used with multiline";
        }
        if (str == null) {
            return;
        }
        throw new IllegalArgumentException("NativeInputConfiguration validation failed: " + str);
    }
}
