package x2;

import a3.d0;
import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements j0.a {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f97055a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f97056b;

    /* renamed from: c, reason: collision with root package name */
    @d0
    public j0 f97057c;

    public abstract boolean a(float f11);

    public com.badlogic.gdx.scenes.scene2d.a b() {
        return this.f97055a;
    }

    @d0
    public j0 c() {
        return this.f97057c;
    }

    public com.badlogic.gdx.scenes.scene2d.a d() {
        return this.f97056b;
    }

    public void f(com.badlogic.gdx.scenes.scene2d.a aVar) {
        j0 j0Var;
        this.f97055a = aVar;
        if (this.f97056b == null) {
            h(aVar);
        }
        if (aVar != null || (j0Var = this.f97057c) == null) {
            return;
        }
        j0Var.d(this);
        this.f97057c = null;
    }

    public void g(@d0 j0 j0Var) {
        this.f97057c = j0Var;
    }

    public void h(com.badlogic.gdx.scenes.scene2d.a aVar) {
        this.f97056b = aVar;
    }

    @Override // a3.j0.a
    public void reset() {
        this.f97055a = null;
        this.f97056b = null;
        this.f97057c = null;
        e();
    }

    public String toString() {
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(lastIndexOf + 1);
        }
        return name.endsWith("Action") ? name.substring(0, name.length() - 6) : name;
    }

    public void e() {
    }
}
